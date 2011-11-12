/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.topology;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.emfstore.client.model.exceptions.UnsupportedNotificationException;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.task.Milestone;
import org.eclipse.emf.emfstore.client.test.model.task.TaskFactory;
import org.eclipse.emf.emfstore.common.model.ModelElementId;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.CompositeOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiReferenceOperation;
import org.junit.Test;

/**
 * Tests operations in n:n topologies.
 * 
 * @author chodnick
 */
public class TopologyNtoNTest extends TopologyTest {

	/**
	 * Add to an empty annotation.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void addToEmpty() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Milestone mileStone = TaskFactory.eINSTANCE.createMilestone();

		getProject().addModelElement(useCase);
		getProject().addModelElement(mileStone);

		clearOperations();

		useCase.getAnnotations().add(mileStone);

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
		ModelElementId mileStoneId = ModelUtil.getProject(mileStone).getModelElementId(mileStone);

		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals("annotatedModelElements", op.getFeatureName());
		assertEquals(op.getModelElementId(), mileStoneId);
		assertEquals(op.getIndex(), 0);

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		op = (MultiReferenceOperation) subOperations.get(1);
		assertTrue(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());
		assertEquals(mileStoneId, op.getReferencedModelElements().get(0));
		assertEquals("annotations", op.getFeatureName());
		assertEquals(op.getModelElementId(), useCaseId);
		assertEquals(op.getIndex(), 0);

	}

	/**
	 * Add many to an empty annotation.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void addManyToEmpty() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Milestone mileStone1 = TaskFactory.eINSTANCE.createMilestone();
		Milestone mileStone2 = TaskFactory.eINSTANCE.createMilestone();

		getProject().addModelElement(useCase);
		getProject().addModelElement(mileStone1);
		getProject().addModelElement(mileStone2);

		Milestone[] stones = { mileStone1, mileStone2 };

		clearOperations();

		useCase.getAnnotations().addAll(Arrays.asList(stones));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertTrue(operation instanceof CompositeOperation);
		CompositeOperation compositeOperation = (CompositeOperation) operation;

		List<AbstractOperation> subOperations = compositeOperation.getSubOperations();

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId mileStone1Id = ModelUtil.getProject(mileStone1).getModelElementId(mileStone1);
		ModelElementId mileStone2Id = ModelUtil.getProject(mileStone2).getModelElementId(mileStone2);

		for (int i = 0; i < 2; i++) {
			assertTrue(subOperations.get(i) instanceof MultiReferenceOperation);
			MultiReferenceOperation op = (MultiReferenceOperation) subOperations.get(i);
			assertTrue(op.isAdd());
			assertEquals(1, op.getReferencedModelElements().size());
			assertEquals("annotatedModelElements", op.getFeatureName());
			assertEquals(op.getModelElementId(), ModelUtil.getProject(stones[i]).getModelElementId(stones[i]));
			assertEquals(op.getIndex(), 0);
		}

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op = (MultiReferenceOperation) subOperations.get(2);
		assertTrue(op.isAdd());
		assertEquals(2, op.getReferencedModelElements().size());
		assertEquals(mileStone1Id, op.getReferencedModelElements().get(0));
		assertEquals(mileStone2Id, op.getReferencedModelElements().get(1));
		assertEquals("annotations", op.getFeatureName());
		assertEquals(op.getModelElementId(), useCaseId);
		assertEquals(op.getIndex(), 0);
	}

	/**
	 * Add to a non-empty annotation.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void addToNonEmpty() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Milestone mileStone = TaskFactory.eINSTANCE.createMilestone();
		Milestone otherMileStone = TaskFactory.eINSTANCE.createMilestone();

		getProject().addModelElement(useCase);
		getProject().addModelElement(mileStone);
		getProject().addModelElement(otherMileStone);

		useCase.getAnnotations().add(otherMileStone);
		clearOperations();

		useCase.getAnnotations().add(mileStone);

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
		ModelElementId mileStoneId = ModelUtil.getProject(mileStone).getModelElementId(mileStone);

		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals("annotatedModelElements", op.getFeatureName());
		assertEquals(op.getModelElementId(), mileStoneId);
		assertEquals(op.getIndex(), 0);

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		op = (MultiReferenceOperation) subOperations.get(1);
		assertTrue(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());
		assertEquals(mileStoneId, op.getReferencedModelElements().get(0));
		assertEquals("annotations", op.getFeatureName());
		assertEquals(op.getModelElementId(), useCaseId);
		assertEquals(op.getIndex(), 1);

	}

	/**
	 * Add many to an nonempty annotation.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void addManyToNonEmpty() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Milestone mileStone1 = TaskFactory.eINSTANCE.createMilestone();
		Milestone mileStone2 = TaskFactory.eINSTANCE.createMilestone();
		Milestone otherMileStone = TaskFactory.eINSTANCE.createMilestone();

		getProject().addModelElement(useCase);
		getProject().addModelElement(mileStone1);
		getProject().addModelElement(mileStone2);
		getProject().addModelElement(otherMileStone);

		Milestone[] stones = { mileStone1, mileStone2 };

		useCase.getAnnotations().add(otherMileStone);

		clearOperations();

		useCase.getAnnotations().addAll(Arrays.asList(stones));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertTrue(operation instanceof CompositeOperation);
		CompositeOperation compositeOperation = (CompositeOperation) operation;

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId mileStone1Id = ModelUtil.getProject(mileStone1).getModelElementId(mileStone1);
		ModelElementId mileStone2Id = ModelUtil.getProject(mileStone2).getModelElementId(mileStone2);

		List<AbstractOperation> subOperations = compositeOperation.getSubOperations();

		for (int i = 0; i < 2; i++) {
			assertTrue(subOperations.get(i) instanceof MultiReferenceOperation);
			MultiReferenceOperation op = (MultiReferenceOperation) subOperations.get(i);
			assertTrue(op.isAdd());
			assertEquals(1, op.getReferencedModelElements().size());
			assertEquals("annotatedModelElements", op.getFeatureName());
			assertEquals(op.getModelElementId(), ModelUtil.getProject(stones[i]).getModelElementId(stones[i]));
			assertEquals(op.getIndex(), 0);
		}

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op = (MultiReferenceOperation) subOperations.get(2);
		assertTrue(op.isAdd());
		assertEquals(2, op.getReferencedModelElements().size());
		assertEquals(mileStone1Id, op.getReferencedModelElements().get(0));
		assertEquals(mileStone2Id, op.getReferencedModelElements().get(1));
		assertEquals("annotations", op.getFeatureName());
		assertEquals(op.getModelElementId(), useCaseId);
		assertEquals(op.getIndex(), 1);

	}

	/**
	 * Remove an element to empty annotations.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void removeAndEmpty() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Milestone mileStone = TaskFactory.eINSTANCE.createMilestone();

		getProject().addModelElement(useCase);
		getProject().addModelElement(mileStone);
		useCase.getAnnotations().add(mileStone);

		clearOperations();

		useCase.getAnnotations().remove(mileStone);

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(1, operations.size());
		assertTrue(operations.get(0) instanceof CompositeOperation);

		operations = ((CompositeOperation) operations.get(0)).getSubOperations();

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op = (MultiReferenceOperation) operations.get(0);
		assertFalse(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId mileStoneId = ModelUtil.getProject(mileStone).getModelElementId(mileStone);

		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals("annotatedModelElements", op.getFeatureName());
		assertEquals(op.getModelElementId(), mileStoneId);
		assertEquals(op.getIndex(), 0);

		assertTrue(operations.get(1) instanceof MultiReferenceOperation);
		op = (MultiReferenceOperation) operations.get(1);
		assertFalse(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());
		assertEquals(mileStoneId, op.getReferencedModelElements().get(0));
		assertEquals("annotations", op.getFeatureName());
		assertEquals(op.getModelElementId(), useCaseId);
		assertEquals(op.getIndex(), 0);

	}

	/**
	 * Remove an element and leave non-empty annotations.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void removePart() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Milestone mileStone = TaskFactory.eINSTANCE.createMilestone();
		Milestone otherMileStone = TaskFactory.eINSTANCE.createMilestone();

		getProject().addModelElement(useCase);
		getProject().addModelElement(mileStone);
		getProject().addModelElement(otherMileStone);

		useCase.getAnnotations().add(mileStone);
		useCase.getAnnotations().add(otherMileStone);

		clearOperations();

		useCase.getAnnotations().remove(mileStone);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		assertTrue(operations.get(0) instanceof CompositeOperation);

		operations = ((CompositeOperation) operations.get(0)).getSubOperations();

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op = (MultiReferenceOperation) operations.get(0);
		assertFalse(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId mileStoneId = ModelUtil.getProject(mileStone).getModelElementId(mileStone);

		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals("annotatedModelElements", op.getFeatureName());
		assertEquals(op.getModelElementId(), mileStoneId);
		assertEquals(op.getIndex(), 0);

		assertTrue(operations.get(1) instanceof MultiReferenceOperation);
		op = (MultiReferenceOperation) operations.get(1);
		assertFalse(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());
		assertEquals(mileStoneId, op.getReferencedModelElements().get(0));
		assertEquals("annotations", op.getFeatureName());
		assertEquals(op.getModelElementId(), useCaseId);
		assertEquals(op.getIndex(), 0);

	}

	/**
	 * Remove some element and leave empty annotations.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void removeManyAndEmpty() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Milestone mileStone = TaskFactory.eINSTANCE.createMilestone();
		Milestone otherMileStone = TaskFactory.eINSTANCE.createMilestone();

		getProject().addModelElement(useCase);
		getProject().addModelElement(mileStone);
		getProject().addModelElement(otherMileStone);

		useCase.getAnnotations().add(mileStone);
		useCase.getAnnotations().add(otherMileStone);

		Milestone[] stones = { mileStone, otherMileStone };
		clearOperations();

		useCase.getAnnotations().removeAll(Arrays.asList(stones));

		// if you use clear instead of explicit removal, op.getIndex() will be -1
		// useCase.getAnnotations().clear();

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertTrue(operation instanceof CompositeOperation);
		CompositeOperation compositeOperation = (CompositeOperation) operation;

		List<AbstractOperation> subOperations = compositeOperation.getSubOperations();

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op = (MultiReferenceOperation) subOperations.get(0);
		assertFalse(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId mileStoneId = ModelUtil.getProject(mileStone).getModelElementId(mileStone);
		ModelElementId otherMileStoneId = ModelUtil.getProject(otherMileStone).getModelElementId(otherMileStone);

		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals("annotatedModelElements", op.getFeatureName());
		assertEquals(op.getModelElementId(), mileStoneId);
		assertEquals(op.getIndex(), 0);

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		op = (MultiReferenceOperation) subOperations.get(1);
		assertFalse(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());
		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals("annotatedModelElements", op.getFeatureName());
		assertEquals(op.getModelElementId(), otherMileStoneId);
		assertEquals(op.getIndex(), 0);

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		op = (MultiReferenceOperation) subOperations.get(2);
		assertFalse(op.isAdd());
		assertEquals(2, op.getReferencedModelElements().size());
		assertEquals(mileStoneId, op.getReferencedModelElements().get(0));
		assertEquals(otherMileStoneId, op.getReferencedModelElements().get(1));
		assertEquals("annotations", op.getFeatureName());
		assertEquals(op.getModelElementId(), useCaseId);
		assertEquals(op.getIndex(), 0);
	}

	/**
	 * Remove some element and leave non-empty annotations.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void removeManyPart() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Milestone mileStone1 = TaskFactory.eINSTANCE.createMilestone();
		Milestone mileStone2 = TaskFactory.eINSTANCE.createMilestone();
		Milestone mileStone3 = TaskFactory.eINSTANCE.createMilestone();

		getProject().addModelElement(useCase);
		getProject().addModelElement(mileStone1);
		getProject().addModelElement(mileStone2);
		getProject().addModelElement(mileStone3);

		useCase.getAnnotations().add(mileStone1);
		useCase.getAnnotations().add(mileStone2);
		useCase.getAnnotations().add(mileStone3);

		Milestone[] stones = { mileStone1, mileStone2 };
		clearOperations();

		useCase.getAnnotations().removeAll(Arrays.asList(stones));

		// if you use clear instead of explicit removal, op.getIndex() will be -1
		// useCase.getAnnotations().clear();

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertTrue(operation instanceof CompositeOperation);
		CompositeOperation compositeOperation = (CompositeOperation) operation;

		List<AbstractOperation> subOperations = compositeOperation.getSubOperations();

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op = (MultiReferenceOperation) subOperations.get(0);
		assertFalse(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
		ModelElementId mileStone1Id = ModelUtil.getProject(mileStone1).getModelElementId(mileStone1);
		ModelElementId mileStone2Id = ModelUtil.getProject(mileStone2).getModelElementId(mileStone2);

		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals("annotatedModelElements", op.getFeatureName());
		assertEquals(op.getModelElementId(), mileStone1Id);
		assertEquals(op.getIndex(), 0);

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		op = (MultiReferenceOperation) subOperations.get(1);
		assertFalse(op.isAdd());
		assertEquals(1, op.getReferencedModelElements().size());
		assertEquals(useCaseId, op.getReferencedModelElements().get(0));
		assertEquals("annotatedModelElements", op.getFeatureName());
		assertEquals(op.getModelElementId(), mileStone2Id);
		assertEquals(op.getIndex(), 0);

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		op = (MultiReferenceOperation) subOperations.get(2);
		assertFalse(op.isAdd());
		assertEquals(2, op.getReferencedModelElements().size());
		assertEquals(mileStone1Id, op.getReferencedModelElements().get(0));
		assertEquals(mileStone2Id, op.getReferencedModelElements().get(1));
		assertEquals("annotations", op.getFeatureName());
		assertEquals(op.getModelElementId(), useCaseId);
		assertEquals(op.getIndex(), 0);

	}

}
