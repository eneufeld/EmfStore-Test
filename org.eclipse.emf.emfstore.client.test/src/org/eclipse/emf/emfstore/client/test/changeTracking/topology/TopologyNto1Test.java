/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.topology;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.eclipse.emf.emfstore.client.model.exceptions.UnsupportedNotificationException;
import org.eclipse.emf.emfstore.client.test.model.bug.BugFactory;
import org.eclipse.emf.emfstore.client.test.model.bug.BugReport;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentFactory;
import org.eclipse.emf.emfstore.client.test.model.document.LeafSection;
import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationaleFactory;
import org.eclipse.emf.emfstore.client.test.model.rationale.Solution;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.task.TaskFactory;
import org.eclipse.emf.emfstore.client.test.model.task.WorkPackage;
import org.eclipse.emf.emfstore.common.model.ModelElementId;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.CompositeOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiReferenceOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.SingleReferenceOperation;
import org.junit.Test;

/**
 * Tests operations in n:1 topologies.
 * 
 * @author chodnick
 */
public class TopologyNto1Test extends TopologyTest {

	/**
	 * Set a container from null to some value.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void setContainerFromNullToValue() throws UnsupportedOperationException, UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		getProject().addModelElement(section);
		getProject().addModelElement(useCase);

		clearOperations();

		useCase.setLeafSection(section);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertTrue(operation instanceof CompositeOperation);
		CompositeOperation compositeOperation = (CompositeOperation) operation;

		List<AbstractOperation> subOperations = compositeOperation.getSubOperations();

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op = (MultiReferenceOperation) subOperations.get(0);
		assertTrue(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertEquals("modelElements", op.getFeatureName());
		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals(op.getModelElementId(), sectionId);
		assertEquals(op.getIndex(), 0);

		assertTrue(subOperations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation sop = (SingleReferenceOperation) subOperations.get(1);
		assertEquals(useCaseId, sop.getModelElementId());
		assertEquals("leafSection", sop.getFeatureName());
		assertNull(sop.getOldValue());
		assertEquals(sop.getNewValue(), sectionId);

	}

	/**
	 * Set a container from some value to null.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void setContainerFromValueToNull() throws UnsupportedOperationException, UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		getProject().addModelElement(section);
		getProject().addModelElement(useCase);
		useCase.setLeafSection(section);
		assertTrue(section.getModelElements().contains(useCase));

		clearOperations();
		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		useCase.setLeafSection(null);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(2, operations.size());

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(sectionId, op0.getModelElementId());
		assertEquals("modelElements", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), useCaseId);

		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		assertEquals(useCaseId, op1.getModelElementId());
		assertEquals("leafSection", op1.getFeatureName());
		assertNull(op1.getNewValue());
		assertEquals(op1.getOldValue(), sectionId);

	}

	/**
	 * Set a non-containing parent from null to some value.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void setNoncontainingParentFromNullToValue() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		Actor actor = RequirementFactory.eINSTANCE.createActor();
		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		getProject().addModelElement(actor);
		getProject().addModelElement(useCase);
		assertNull(useCase.getInitiatingActor());

		clearOperations();
		useCase.setInitiatingActor(actor);
		assertSame(useCase.getInitiatingActor(), actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertTrue(operation instanceof CompositeOperation);
		CompositeOperation compositeOperation = (CompositeOperation) operation;

		List<AbstractOperation> subOperations = compositeOperation.getSubOperations();

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op = (MultiReferenceOperation) subOperations.get(0);
		assertTrue(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());
		assertEquals("initiatedUseCases", op.getFeatureName());

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);

		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals(op.getModelElementId(), actorId);
		assertEquals(op.getIndex(), 0);

		assertTrue(subOperations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation sop = (SingleReferenceOperation) subOperations.get(1);
		assertEquals(useCaseId, sop.getModelElementId());
		assertEquals("initiatingActor", sop.getFeatureName());
		assertNull(sop.getOldValue());
		assertEquals(sop.getNewValue(), actorId);

	}

	/**
	 * Set a non-containing parent from some value to null.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void setNoncontainingParentFromValueToNull() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		Actor actor = RequirementFactory.eINSTANCE.createActor();
		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		getProject().addModelElement(actor);
		getProject().addModelElement(useCase);
		useCase.setInitiatingActor(actor);
		assertSame(useCase.getInitiatingActor(), actor);

		clearOperations();
		useCase.setInitiatingActor(null);
		assertNull(useCase.getInitiatingActor());

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(2, operations.size());

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);

		assertEquals(actorId, op0.getModelElementId());
		assertEquals("initiatedUseCases", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), useCaseId);

		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op = (SingleReferenceOperation) operations.get(1);
		assertEquals(useCaseId, op.getModelElementId());
		assertEquals("initiatingActor", op.getFeatureName());
		assertNull(op.getNewValue());
		assertEquals(op.getOldValue(), actorId);

	}

	/**
	 * Set a non-containing parent from some value to some.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void setNoncontainingParentFromValueToOtherValue() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		Actor actor = RequirementFactory.eINSTANCE.createActor();
		Actor otherActor = RequirementFactory.eINSTANCE.createActor();
		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		getProject().addModelElement(actor);
		getProject().addModelElement(otherActor);
		getProject().addModelElement(useCase);
		useCase.setInitiatingActor(actor);
		assertSame(useCase.getInitiatingActor(), actor);

		clearOperations();
		useCase.setInitiatingActor(otherActor);
		assertSame(otherActor, useCase.getInitiatingActor());

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());

		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(3, operations.size());

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId otherActorId = ModelUtil.getProject(otherActor).getModelElementId(otherActor);

		assertEquals(actorId, op0.getModelElementId());
		assertEquals("initiatedUseCases", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), useCaseId);
		assertFalse(op0.isAdd());

		assertTrue(operations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) operations.get(1);
		assertEquals(otherActorId, op1.getModelElementId());
		assertEquals("initiatedUseCases", op1.getFeatureName());
		assertEquals(op1.getReferencedModelElements().get(0), useCaseId);
		assertTrue(op1.isAdd());

		assertTrue(operations.get(2) instanceof SingleReferenceOperation);
		SingleReferenceOperation op = (SingleReferenceOperation) operations.get(2);
		assertEquals(useCaseId, op.getModelElementId());
		assertEquals("initiatingActor", op.getFeatureName());
		assertEquals(op.getNewValue(), otherActorId);
		assertEquals(op.getOldValue(), actorId);
	}

	/**
	 * Set a container from some value to some other value on same feature though.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */

	@Test
	public void setContainerFromValueToOtherValueSameFeature() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section1 = DocumentFactory.eINSTANCE.createLeafSection();
		LeafSection section2 = DocumentFactory.eINSTANCE.createLeafSection();
		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		getProject().addModelElement(section1);
		getProject().addModelElement(section2);
		getProject().addModelElement(useCase);
		useCase.setLeafSection(section1);

		assertTrue(section1.getModelElements().contains(useCase));

		clearOperations();

		useCase.setLeafSection(section2);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());

		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(3, operations.size());

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId section1Id = ModelUtil.getProject(section1).getModelElementId(section1);
		ModelElementId section2Id = ModelUtil.getProject(section2).getModelElementId(section2);

		assertEquals(section1Id, op0.getModelElementId());
		assertEquals("modelElements", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), useCaseId);
		assertFalse(op0.isAdd());

		assertTrue(operations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) operations.get(1);
		assertEquals(section2Id, op1.getModelElementId());
		assertEquals("modelElements", op1.getFeatureName());
		assertEquals(op1.getReferencedModelElements().get(0), useCaseId);
		assertTrue(op1.isAdd());

		assertTrue(operations.get(2) instanceof SingleReferenceOperation);
		SingleReferenceOperation op = (SingleReferenceOperation) operations.get(2);
		assertEquals(useCaseId, op.getModelElementId());
		assertEquals("leafSection", op.getFeatureName());
		assertEquals(op.getNewValue(), section2Id);
		assertEquals(op.getOldValue(), section1Id);

	}

	/**
	 * Set a container from some value to some other value on different features though.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */

	@Test
	public void setContainerFromValueToOtherValueDifferentFeatureN() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		WorkPackage pack = TaskFactory.eINSTANCE.createWorkPackage();
		BugReport br = BugFactory.eINSTANCE.createBugReport();

		getProject().addModelElement(section);
		getProject().addModelElement(pack);
		getProject().addModelElement(br);
		br.setLeafSection(section);

		assertTrue(section.getModelElements().contains(br));

		clearOperations();

		br.setContainingWorkpackage(pack);
		assertFalse(section.getModelElements().contains(br));
		assertTrue(pack.getContainedWorkItems().contains(br));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(4, operations.size());

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId packId = ModelUtil.getProject(pack).getModelElementId(pack);
		ModelElementId brId = ModelUtil.getProject(br).getModelElementId(br);

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(sectionId, op0.getModelElementId());
		assertEquals("modelElements", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), brId);

		assertTrue(operations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) operations.get(1);
		assertEquals(packId, op1.getModelElementId());
		assertEquals("containedWorkItems", op1.getFeatureName());
		assertEquals(op1.getReferencedModelElements().get(0), brId);

		assertTrue(operations.get(2) instanceof SingleReferenceOperation);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		assertEquals(brId, op2.getModelElementId());
		assertEquals("leafSection", op2.getFeatureName());
		assertEquals(op2.getNewValue(), null);
		assertEquals(op2.getOldValue(), sectionId);

		assertTrue(operations.get(3) instanceof SingleReferenceOperation);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		assertEquals(brId, op3.getModelElementId());
		assertEquals("containingWorkpackage", op3.getFeatureName());
		assertEquals(op3.getOldValue(), null);
		assertEquals(op3.getNewValue(), packId);

	}

	/**
	 * Set a container from some value to some other value on different features though.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */

	@Test
	public void setContainerFromValueToOtherValueDifferentFeature1() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		Issue issue = RationaleFactory.eINSTANCE.createIssue();
		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Solution solution = RationaleFactory.eINSTANCE.createSolution();

		getProject().addModelElement(issue);
		getProject().addModelElement(section);
		getProject().addModelElement(solution);
		issue.setSolution(solution);

		clearOperations();

		solution.setLeafSection(section);

		assertTrue(section.getModelElements().contains(solution));
		assertNull(issue.getSolution());

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(4, operations.size());

		assertTrue(operations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) operations.get(0);

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId issueId = ModelUtil.getProject(issue).getModelElementId(issue);
		ModelElementId solutionId = ModelUtil.getProject(solution).getModelElementId(solution);

		assertEquals(issueId, op0.getModelElementId());
		assertEquals("solution", op0.getFeatureName());
		assertEquals(op0.getOldValue(), solutionId);
		assertNull(op0.getNewValue());

		assertTrue(operations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) operations.get(1);
		assertEquals(sectionId, op1.getModelElementId());
		assertEquals("modelElements", op1.getFeatureName());
		assertEquals(op1.getReferencedModelElements().get(0), solutionId);

		assertTrue(operations.get(2) instanceof SingleReferenceOperation);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		assertEquals(solutionId, op2.getModelElementId());
		assertEquals("issue", op2.getFeatureName());
		assertEquals(op2.getOldValue(), issueId);
		assertNull(op2.getNewValue());

		assertTrue(operations.get(3) instanceof SingleReferenceOperation);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		assertEquals(solutionId, op3.getModelElementId());
		assertEquals("leafSection", op3.getFeatureName());
		assertEquals(op3.getNewValue(), sectionId);
		assertNull(op3.getOldValue());

	}

}
