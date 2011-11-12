/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.topology;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.emfstore.client.model.exceptions.UnsupportedNotificationException;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
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
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.CompositeOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiReferenceOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.SingleReferenceOperation;
import org.junit.Test;

/**
 * Tests operations in 1:n topologies.
 * 
 * @author chodnick
 */
public class Topology1toNTest extends TopologyTest {

	/**
	 * add an uncontained child to an empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddUncontainedChildToEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(section);

		clearOperations();

		section.getModelElements().add(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(2, subOperations.size());

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertTrue(subOperations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) subOperations.get(0);
		assertEquals(actorId, op0.getModelElementId());
		assertEquals(null, op0.getOldValue());
		assertEquals(sectionId, op0.getNewValue());
		assertEquals("leafSection", op0.getFeatureName());

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertTrue(op1.isAdd());
		assertEquals(1, op1.getReferencedModelElements().size());
		assertEquals(actorId, op1.getReferencedModelElements().get(0));
		assertEquals("modelElements", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), sectionId);
		assertEquals(op1.getIndex(), 0);
	}

	/**
	 * create orphan.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void createContainmentOrphan() throws UnsupportedOperationException, UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(section);
		section.getModelElements().add(actor);

		clearOperations();

		getProject().addModelElement(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());

		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(2, operations.size());

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(sectionId, op0.getModelElementId());
		assertEquals("modelElements", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), actorId);

		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		assertEquals("leafSection", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), actorId);

	}

	/**
	 * reverse orphan creation.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void reverseContainmentOrphan() throws UnsupportedOperationException, UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(section);
		section.getModelElements().add(actor);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		clearOperations();
		// create orphan
		getProject().addModelElement(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());

		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(2, operations.size());

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(sectionId, op0.getModelElementId());
		assertEquals("modelElements", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), actorId);

		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		assertEquals("leafSection", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), actorId);

		// test the reversibility of what has happened
		op1.reverse().apply(getProject());
		op0.reverse().apply(getProject());

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

	}

	/**
	 * reverse orphan creation.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void reverseContainmentOrphanIndexed() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();
		actor.setName("actor");
		actor2.setName("actor2");

		getProject().addModelElement(section);
		section.getModelElements().add(actor);
		section.getModelElements().add(actor2);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		clearOperations();
		// create orphan
		getProject().addModelElement(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());

		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(2, operations.size());

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(sectionId, op0.getModelElementId());
		assertEquals("modelElements", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), actorId);

		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		assertEquals("leafSection", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), actorId);

		// test the reversibility of what has happened
		op1.reverse().apply(getProject());
		op0.reverse().apply(getProject());

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

	}

	/**
	 * add an uncontained child to a non-empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddUncontainedChildToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor = RequirementFactory.eINSTANCE.createActor();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(oldActor);
		getProject().addModelElement(section);

		section.getModelElements().add(oldActor);

		clearOperations();

		section.getModelElements().add(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(2, subOperations.size());

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertEquals(true, subOperations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) subOperations.get(0);
		assertEquals(actorId, op0.getModelElementId());
		assertEquals(null, op0.getOldValue());
		assertEquals(sectionId, op0.getNewValue());
		assertEquals("leafSection", op0.getFeatureName());

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertTrue(op1.isAdd());
		assertEquals(1, op1.getReferencedModelElements().size());
		assertEquals(actorId, op1.getReferencedModelElements().get(0));
		assertEquals("modelElements", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), sectionId);
		assertEquals(op1.getIndex(), 1);

	}

	/**
	 * add several uncontained children to an empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddUncontainedChildrenToEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(section);

		Actor[] actors = { actor1, actor2 };

		clearOperations();

		section.getModelElements().addAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(3, subOperations.size());

		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertEquals(true, subOperations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) subOperations.get(0);
		assertEquals(actor1Id, op0.getModelElementId());
		assertEquals(null, op0.getOldValue());
		assertEquals(sectionId, op0.getNewValue());
		assertEquals("leafSection", op0.getFeatureName());

		assertEquals(true, subOperations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op1 = (SingleReferenceOperation) subOperations.get(1);
		assertEquals(actor2Id, op1.getModelElementId());
		assertEquals(null, op1.getOldValue());
		assertEquals(sectionId, op1.getNewValue());
		assertEquals("leafSection", op1.getFeatureName());

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op2 = (MultiReferenceOperation) subOperations.get(2);
		assertTrue(op2.isAdd());
		assertEquals(2, op2.getReferencedModelElements().size());
		assertEquals(actor1Id, op2.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op2.getReferencedModelElements().get(1));
		assertEquals("modelElements", op2.getFeatureName());
		assertEquals(op2.getModelElementId(), sectionId);
		assertEquals(op2.getIndex(), 0);

	}

	/**
	 * add several uncontained children to a non-empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddUncontainedChildrenToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(oldActor);
		getProject().addModelElement(section);

		Actor[] actors = { actor1, actor2 };
		section.getModelElements().add(oldActor);
		clearOperations();

		section.getModelElements().addAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(3, subOperations.size());

		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertEquals(true, subOperations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) subOperations.get(0);
		assertEquals(actor1Id, op0.getModelElementId());
		assertEquals(null, op0.getOldValue());
		assertEquals(sectionId, op0.getNewValue());
		assertEquals("leafSection", op0.getFeatureName());

		assertEquals(true, subOperations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op1 = (SingleReferenceOperation) subOperations.get(1);
		assertEquals(actor2Id, op1.getModelElementId());
		assertEquals(null, op1.getOldValue());
		assertEquals(sectionId, op1.getNewValue());
		assertEquals("leafSection", op1.getFeatureName());

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op2 = (MultiReferenceOperation) subOperations.get(2);
		assertTrue(op2.isAdd());
		assertEquals(2, op2.getReferencedModelElements().size());
		assertEquals(actor1Id, op2.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op2.getReferencedModelElements().get(1));
		assertEquals("modelElements", op2.getFeatureName());
		assertEquals(op2.getModelElementId(), sectionId);
		assertEquals(op2.getIndex(), 1);

	}

	/**
	 * add several uncontained children to a non-empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddUncontainedChildrenFakeManyToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor1);
		getProject().addModelElement(oldActor);
		getProject().addModelElement(section);

		Actor[] actors = { actor1 };
		section.getModelElements().add(oldActor);
		clearOperations();

		section.getModelElements().addAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(2, subOperations.size());

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);

		assertEquals(true, subOperations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) subOperations.get(0);
		assertEquals(actor1Id, op0.getModelElementId());
		assertEquals(null, op0.getOldValue());
		assertEquals(sectionId, op0.getNewValue());
		assertEquals("leafSection", op0.getFeatureName());

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertTrue(op1.isAdd());
		assertEquals(1, op1.getReferencedModelElements().size());
		assertEquals(actor1Id, op1.getReferencedModelElements().get(0));
		assertEquals("modelElements", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), sectionId);
		assertEquals(op1.getIndex(), 1);

	}

	/**
	 * add an contained child to a non-empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddSameFeatureContainedChildToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section1 = DocumentFactory.eINSTANCE.createLeafSection();
		LeafSection section2 = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(section1);
		getProject().addModelElement(section2);

		section1.getModelElements().add(actor1);
		section2.getModelElements().add(actor2);

		clearOperations();

		section1.getModelElements().add(actor2);
		assertFalse(section2.getModelElements().contains(actor2));
		assertTrue(section1.getModelElements().contains(actor2));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(3, operations.size());

		ModelElementId section1Id = ModelUtil.getProject(section1).getModelElementId(section1);
		ModelElementId section2Id = ModelUtil.getProject(section2).getModelElementId(section2);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);

		// op is: maintain change in section2, preserving index of actor 2
		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(section2Id, op0.getModelElementId());
		assertEquals("modelElements", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), actor2Id);

		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		// op is: LeafSection change on actor2 (preserving old parent)
		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		assertEquals(op1.getOldValue(), section2Id);
		assertEquals(op1.getNewValue(), section1Id);
		assertEquals("leafSection", op1.getFeatureName());

		// op is: Section2 welcomes its new child
		assertTrue(operations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op2 = (MultiReferenceOperation) operations.get(2);
		assertTrue(op2.isAdd());
		assertEquals(1, op2.getReferencedModelElements().size());
		assertEquals(actor2Id, op2.getReferencedModelElements().get(0));
		assertEquals("modelElements", op2.getFeatureName());
		assertEquals(op2.getModelElementId(), section1Id);
		assertEquals(op2.getIndex(), 1);

	}

	/**
	 * add several already contained children to an empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddSameFeatureContainedChildrenToEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		LeafSection oldSection = DocumentFactory.eINSTANCE.createLeafSection();
		LeafSection oldSection2 = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();
		Actor actor3 = RequirementFactory.eINSTANCE.createActor();
		Actor actor4 = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(actor3);
		getProject().addModelElement(actor4);
		getProject().addModelElement(section);
		getProject().addModelElement(oldSection);
		getProject().addModelElement(oldSection2);

		Actor[] actors = { actor1, actor2, actor3, actor4 };
		oldSection.getModelElements().addAll(Arrays.asList(actors));
		oldSection2.getModelElements().add(actor4); // relocate to other section
		assertTrue(oldSection.getModelElements().contains(actor1));
		assertTrue(oldSection.getModelElements().contains(actor2));
		assertTrue(oldSection.getModelElements().contains(actor3));
		assertTrue(oldSection2.getModelElements().contains(actor4));
		assertTrue(section.getModelElements().isEmpty());

		clearOperations();

		section.getModelElements().addAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		// now expectation is: we get 4 messages preserving the info on former parents for the actors
		// and one additional one, indicating the new parent for all of them
		assertEquals(7, operations.size());

		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		assertTrue(operations.get(2) instanceof SingleReferenceOperation);
		assertTrue(operations.get(3) instanceof SingleReferenceOperation);
		assertTrue(operations.get(5) instanceof SingleReferenceOperation);

		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		SingleReferenceOperation op5 = (SingleReferenceOperation) operations.get(5);

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId oldSectionId = ModelUtil.getProject(oldSection).getModelElementId(oldSection);
		ModelElementId oldSection2Id = ModelUtil.getProject(oldSection2).getModelElementId(oldSection2);
		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		ModelElementId actor3Id = ModelUtil.getProject(actor3).getModelElementId(actor3);
		ModelElementId actor4Id = ModelUtil.getProject(actor4).getModelElementId(actor4);

		assertEquals(op1.getModelElementId(), actor1Id);
		assertEquals(op2.getModelElementId(), actor2Id);
		assertEquals(op3.getModelElementId(), actor3Id);
		assertEquals(op5.getModelElementId(), actor4Id);

		assertEquals(op1.getFeatureName(), "leafSection");
		assertEquals(op2.getFeatureName(), "leafSection");
		assertEquals(op3.getFeatureName(), "leafSection");
		assertEquals(op5.getFeatureName(), "leafSection");

		assertEquals(op1.getOldValue(), oldSectionId);
		assertEquals(op2.getOldValue(), oldSectionId);
		assertEquals(op3.getOldValue(), oldSectionId);
		assertEquals(op5.getOldValue(), oldSection2Id);

		assertEquals(op1.getNewValue(), sectionId);
		assertEquals(op2.getNewValue(), sectionId);
		assertEquals(op3.getNewValue(), sectionId);
		assertEquals(op5.getNewValue(), sectionId);

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(op0.getModelElementId(), oldSectionId);
		assertEquals("modelElements", op0.getFeatureName());
		assertFalse(op0.isAdd());
		assertEquals(3, op0.getReferencedModelElements().size());
		assertEquals(actor1Id, op0.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op0.getReferencedModelElements().get(1));
		assertEquals(actor3Id, op0.getReferencedModelElements().get(2));
		assertEquals(op0.getIndex(), 0);

		assertTrue(operations.get(4) instanceof MultiReferenceOperation);
		MultiReferenceOperation op4 = (MultiReferenceOperation) operations.get(4);
		assertEquals(op4.getModelElementId(), oldSection2Id);
		assertEquals("modelElements", op4.getFeatureName());
		assertFalse(op4.isAdd());
		assertEquals(1, op4.getReferencedModelElements().size());
		assertEquals(actor4Id, op4.getReferencedModelElements().get(0));
		assertEquals(op4.getIndex(), 0);

		assertTrue(operations.get(6) instanceof MultiReferenceOperation);
		MultiReferenceOperation op6 = (MultiReferenceOperation) operations.get(6);
		assertEquals(op6.getModelElementId(), sectionId);
		assertEquals("modelElements", op6.getFeatureName());
		assertTrue(op6.isAdd());
		assertEquals(4, op6.getReferencedModelElements().size());
		assertEquals(actor1Id, op6.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op6.getReferencedModelElements().get(1));
		assertEquals(actor3Id, op6.getReferencedModelElements().get(2));
		assertEquals(actor4Id, op6.getReferencedModelElements().get(3));
		assertEquals(op6.getIndex(), 0);
	}

	/**
	 * add several already contained children to an empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddSameFeatureContainedChildrenToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		LeafSection oldSection = DocumentFactory.eINSTANCE.createLeafSection();
		LeafSection oldSection2 = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();
		Actor actor3 = RequirementFactory.eINSTANCE.createActor();
		Actor actor4 = RequirementFactory.eINSTANCE.createActor();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(actor3);
		getProject().addModelElement(actor4);
		getProject().addModelElement(oldActor);
		getProject().addModelElement(section);
		getProject().addModelElement(oldSection);
		getProject().addModelElement(oldSection2);

		Actor[] actors = { actor1, actor2, actor3, actor4 };
		section.getModelElements().add(oldActor);
		oldSection.getModelElements().addAll(Arrays.asList(actors));
		oldSection2.getModelElements().add(actor4); // relocate to other section
		assertTrue(oldSection.getModelElements().contains(actor1));
		assertTrue(oldSection.getModelElements().contains(actor2));
		assertTrue(oldSection.getModelElements().contains(actor3));
		assertTrue(section.getModelElements().contains(oldActor));
		assertTrue(oldSection2.getModelElements().contains(actor4));

		clearOperations();

		section.getModelElements().addAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		// now expectation is: we get 4 messages preserving the info on former parents for the actors
		// and one additional one, indicating the new parent for all of them
		// refactoring: addional operations expected

		assertEquals(7, operations.size());

		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		assertTrue(operations.get(2) instanceof SingleReferenceOperation);
		assertTrue(operations.get(3) instanceof SingleReferenceOperation);
		assertTrue(operations.get(5) instanceof SingleReferenceOperation);

		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		SingleReferenceOperation op5 = (SingleReferenceOperation) operations.get(5);

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId oldSectionId = ModelUtil.getProject(oldSection).getModelElementId(oldSection);
		ModelElementId oldSection2Id = ModelUtil.getProject(oldSection2).getModelElementId(oldSection2);
		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		ModelElementId actor3Id = ModelUtil.getProject(actor3).getModelElementId(actor3);
		ModelElementId actor4Id = ModelUtil.getProject(actor4).getModelElementId(actor4);

		assertEquals(op1.getModelElementId(), actor1Id);
		assertEquals(op2.getModelElementId(), actor2Id);
		assertEquals(op3.getModelElementId(), actor3Id);
		assertEquals(op5.getModelElementId(), actor4Id);

		assertEquals(op1.getFeatureName(), "leafSection");
		assertEquals(op2.getFeatureName(), "leafSection");
		assertEquals(op3.getFeatureName(), "leafSection");
		assertEquals(op5.getFeatureName(), "leafSection");

		assertEquals(op1.getOldValue(), oldSectionId);
		assertEquals(op2.getOldValue(), oldSectionId);
		assertEquals(op3.getOldValue(), oldSectionId);
		assertEquals(op5.getOldValue(), oldSection2Id);

		assertEquals(op1.getNewValue(), sectionId);
		assertEquals(op2.getNewValue(), sectionId);
		assertEquals(op3.getNewValue(), sectionId);
		assertEquals(op5.getNewValue(), sectionId);

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(op0.getModelElementId(), oldSectionId);
		assertEquals("modelElements", op0.getFeatureName());
		assertFalse(op0.isAdd());
		assertEquals(3, op0.getReferencedModelElements().size());
		assertEquals(actor1Id, op0.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op0.getReferencedModelElements().get(1));
		assertEquals(actor3Id, op0.getReferencedModelElements().get(2));
		assertEquals(op0.getIndex(), 0);

		assertTrue(operations.get(4) instanceof MultiReferenceOperation);
		MultiReferenceOperation op4 = (MultiReferenceOperation) operations.get(4);
		assertEquals(op4.getModelElementId(), oldSection2Id);
		assertEquals("modelElements", op4.getFeatureName());
		assertFalse(op4.isAdd());
		assertEquals(1, op4.getReferencedModelElements().size());
		assertEquals(actor4Id, op4.getReferencedModelElements().get(0));
		assertEquals(op4.getIndex(), 0);

		assertTrue(operations.get(6) instanceof MultiReferenceOperation);
		MultiReferenceOperation op6 = (MultiReferenceOperation) operations.get(6);
		assertEquals(op6.getModelElementId(), sectionId);
		assertEquals("modelElements", op6.getFeatureName());
		assertTrue(op6.isAdd());
		assertEquals(4, op6.getReferencedModelElements().size());
		assertEquals(actor1Id, op6.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op6.getReferencedModelElements().get(1));
		assertEquals(actor3Id, op6.getReferencedModelElements().get(2));
		assertEquals(actor4Id, op6.getReferencedModelElements().get(3));
		assertEquals(op6.getIndex(), 1);

	}

	/**
	 * add an contained child to a non-empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddDifferentFeatureContainedNChildToNonEmpty() throws UnsupportedOperationException,
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

		pack.getContainedWorkItems().add(br);
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
		ModelElementId brId = ModelUtil.getProject(br).getModelElementId(br);
		ModelElementId packId = ModelUtil.getProject(pack).getModelElementId(pack);

		// op is: maintain change in section, preserving index of actor 2
		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(sectionId, op0.getModelElementId());
		assertEquals("modelElements", op0.getFeatureName());
		assertEquals(op0.getReferencedModelElements().get(0), brId);

		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		// op is: LeafSection change on bug report (preserving old parent)
		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		assertEquals(op1.getOldValue(), sectionId);
		assertNull(op1.getNewValue());
		assertEquals("leafSection", op1.getFeatureName());

		assertTrue(operations.get(2) instanceof SingleReferenceOperation);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		assertEquals(op2.getOldValue(), null);
		assertEquals(packId, op2.getNewValue());
		assertEquals("containingWorkpackage", op2.getFeatureName());

		// op is: Workpackage welcomes its new child
		assertTrue(operations.get(3) instanceof MultiReferenceOperation);
		MultiReferenceOperation op3 = (MultiReferenceOperation) operations.get(3);
		assertTrue(op3.isAdd());
		assertEquals(1, op3.getReferencedModelElements().size());
		assertEquals(brId, op3.getReferencedModelElements().get(0));
		assertEquals("containedWorkItems", op3.getFeatureName());
		assertEquals(op3.getModelElementId(), packId);
		assertEquals(op3.getIndex(), 0);

	}

	/**
	 * add an contained child to a non-empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddDifferentFeatureContained1ChildToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		Issue issue = RationaleFactory.eINSTANCE.createIssue();
		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Solution solution = RationaleFactory.eINSTANCE.createSolution();

		getProject().addModelElement(issue);
		getProject().addModelElement(section);
		getProject().addModelElement(solution);
		issue.setSolution(solution);

		clearOperations();

		section.getModelElements().add(solution);
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

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId issueId = ModelUtil.getProject(issue).getModelElementId(issue);
		ModelElementId solutionId = ModelUtil.getProject(solution).getModelElementId(solution);

		assertTrue(operations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) operations.get(0);
		assertEquals(issueId, op0.getModelElementId());
		assertEquals("solution", op0.getFeatureName());
		assertEquals(op0.getOldValue(), solutionId);
		assertNull(op0.getNewValue());

		// first op is: solution loses its old parent
		assertTrue(operations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		assertEquals(solutionId, op1.getModelElementId());
		assertEquals("issue", op1.getFeatureName());
		assertEquals(op1.getOldValue(), issueId);
		assertNull(op1.getNewValue());

		assertTrue(operations.get(2) instanceof SingleReferenceOperation);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		assertEquals(solutionId, op2.getModelElementId());
		assertEquals("leafSection", op2.getFeatureName());
		assertEquals(op2.getNewValue(), sectionId);
		assertNull(op2.getOldValue());

		// second op is: section welcomes its new child
		assertTrue(operations.get(3) instanceof MultiReferenceOperation);
		MultiReferenceOperation op3 = (MultiReferenceOperation) operations.get(3);
		assertTrue(op3.isAdd());
		assertEquals(op3.getModelElementId(), sectionId);
		assertEquals(1, op3.getReferencedModelElements().size());
		assertEquals(solutionId, op3.getReferencedModelElements().get(0));
		assertEquals("modelElements", op3.getFeatureName());
		assertEquals(op3.getIndex(), 0);

	}

	/**
	 * add several already contained children to an empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddDifferentFeatureContainedNChildrenToEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		WorkPackage oldPack = TaskFactory.eINSTANCE.createWorkPackage();
		WorkPackage oldPack2 = TaskFactory.eINSTANCE.createWorkPackage();

		BugReport br1 = BugFactory.eINSTANCE.createBugReport();
		BugReport br2 = BugFactory.eINSTANCE.createBugReport();
		BugReport br3 = BugFactory.eINSTANCE.createBugReport();
		BugReport br4 = BugFactory.eINSTANCE.createBugReport();

		getProject().addModelElement(br1);
		getProject().addModelElement(br2);
		getProject().addModelElement(br3);
		getProject().addModelElement(br4);
		getProject().addModelElement(section);
		getProject().addModelElement(oldPack);
		getProject().addModelElement(oldPack2);

		BugReport[] actors = { br1, br2, br3, br4 };
		oldPack.getContainedWorkItems().addAll(Arrays.asList(actors));
		oldPack2.getContainedWorkItems().add(br4); // relocate to other section
		assertTrue(oldPack.getContainedWorkItems().contains(br1));
		assertTrue(oldPack.getContainedWorkItems().contains(br2));
		assertTrue(oldPack.getContainedWorkItems().contains(br3));
		assertTrue(oldPack2.getContainedWorkItems().contains(br4));
		assertTrue(section.getModelElements().isEmpty());

		clearOperations();

		section.getModelElements().addAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		// now expectation is: we get 4 messages preserving the info on former parents for the actors
		// and one additional one, indicating the new parent for all of them

		// changed due to refactoring

		assertEquals(11, operations.size());

		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		SingleReferenceOperation op4 = (SingleReferenceOperation) operations.get(4);
		SingleReferenceOperation op5 = (SingleReferenceOperation) operations.get(5);
		SingleReferenceOperation op6 = (SingleReferenceOperation) operations.get(6);
		SingleReferenceOperation op8 = (SingleReferenceOperation) operations.get(8);
		SingleReferenceOperation op9 = (SingleReferenceOperation) operations.get(9);

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId oldPackId = ModelUtil.getProject(oldPack).getModelElementId(oldPack);
		ModelElementId oldPack2Id = ModelUtil.getProject(oldPack2).getModelElementId(oldPack2);
		ModelElementId br1Id = ModelUtil.getProject(br1).getModelElementId(br1);
		ModelElementId br2Id = ModelUtil.getProject(br2).getModelElementId(br2);
		ModelElementId br3Id = ModelUtil.getProject(br3).getModelElementId(br3);
		ModelElementId br4Id = ModelUtil.getProject(br4).getModelElementId(br4);

		assertEquals(op1.getModelElementId(), br1Id);
		assertEquals(op3.getModelElementId(), br2Id);
		assertEquals(op5.getModelElementId(), br3Id);
		assertEquals(op8.getModelElementId(), br4Id);

		assertEquals(op1.getFeatureName(), "containingWorkpackage");
		assertEquals(op3.getFeatureName(), "containingWorkpackage");
		assertEquals(op5.getFeatureName(), "containingWorkpackage");
		assertEquals(op8.getFeatureName(), "containingWorkpackage");

		assertEquals(op1.getOldValue(), oldPackId);
		assertEquals(op3.getOldValue(), oldPackId);
		assertEquals(op5.getOldValue(), oldPackId);
		assertEquals(op8.getOldValue(), oldPack2Id);

		assertEquals(op1.getNewValue(), null);
		assertEquals(op3.getNewValue(), null);
		assertEquals(op5.getNewValue(), null);
		assertEquals(op8.getNewValue(), null);

		assertEquals(op2.getModelElementId(), br1Id);
		assertEquals(op4.getModelElementId(), br2Id);
		assertEquals(op6.getModelElementId(), br3Id);
		assertEquals(op9.getModelElementId(), br4Id);

		assertEquals(op2.getFeatureName(), "leafSection");
		assertEquals(op4.getFeatureName(), "leafSection");
		assertEquals(op6.getFeatureName(), "leafSection");
		assertEquals(op9.getFeatureName(), "leafSection");

		assertEquals(op2.getOldValue(), null);
		assertEquals(op4.getOldValue(), null);
		assertEquals(op6.getOldValue(), null);
		assertEquals(op9.getOldValue(), null);

		assertEquals(op2.getNewValue(), sectionId);
		assertEquals(op4.getNewValue(), sectionId);
		assertEquals(op6.getNewValue(), sectionId);
		assertEquals(op9.getNewValue(), sectionId);

		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(op0.getModelElementId(), oldPackId);
		assertEquals("containedWorkItems", op0.getFeatureName());
		assertFalse(op0.isAdd());
		assertEquals(3, op0.getReferencedModelElements().size());
		assertEquals(br1Id, op0.getReferencedModelElements().get(0));
		assertEquals(br2Id, op0.getReferencedModelElements().get(1));
		assertEquals(br3Id, op0.getReferencedModelElements().get(2));

		MultiReferenceOperation op7 = (MultiReferenceOperation) operations.get(7);
		assertEquals(op7.getModelElementId(), oldPack2Id);
		assertEquals("containedWorkItems", op7.getFeatureName());
		assertFalse(op7.isAdd());
		assertEquals(1, op7.getReferencedModelElements().size());
		assertEquals(br4Id, op7.getReferencedModelElements().get(0));

		MultiReferenceOperation op10 = (MultiReferenceOperation) operations.get(10);
		assertEquals(op10.getModelElementId(), sectionId);
		assertEquals("modelElements", op10.getFeatureName());
		assertTrue(op10.isAdd());
		assertEquals(4, op10.getReferencedModelElements().size());
		assertEquals(br1Id, op10.getReferencedModelElements().get(0));
		assertEquals(br2Id, op10.getReferencedModelElements().get(1));
		assertEquals(br3Id, op10.getReferencedModelElements().get(2));
		assertEquals(br4Id, op10.getReferencedModelElements().get(3));
		assertEquals(op10.getIndex(), 0);

	}

	/**
	 * add several already contained children to a non-empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddDifferentFeatureContainedNChildrenToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		section.getModelElements().add(BugFactory.eINSTANCE.createBugReport());

		WorkPackage oldPack = TaskFactory.eINSTANCE.createWorkPackage();
		WorkPackage oldPack2 = TaskFactory.eINSTANCE.createWorkPackage();

		BugReport br1 = BugFactory.eINSTANCE.createBugReport();
		BugReport br2 = BugFactory.eINSTANCE.createBugReport();
		BugReport br3 = BugFactory.eINSTANCE.createBugReport();
		BugReport br4 = BugFactory.eINSTANCE.createBugReport();

		getProject().addModelElement(br1);
		getProject().addModelElement(br2);
		getProject().addModelElement(br3);
		getProject().addModelElement(br4);
		getProject().addModelElement(section);
		getProject().addModelElement(oldPack);
		getProject().addModelElement(oldPack2);

		BugReport[] bugreports = { br1, br2, br3, br4 };
		oldPack.getContainedWorkItems().addAll(Arrays.asList(bugreports));
		oldPack2.getContainedWorkItems().add(br4); // relocate to other section
		assertTrue(oldPack.getContainedWorkItems().contains(br1));
		assertTrue(oldPack.getContainedWorkItems().contains(br2));
		assertTrue(oldPack.getContainedWorkItems().contains(br3));
		assertTrue(oldPack2.getContainedWorkItems().contains(br4));
		assertFalse(section.getModelElements().isEmpty()); // one item is there initially

		clearOperations();

		section.getModelElements().addAll(Arrays.asList(bugreports));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}
		// now expectation is: we get 4 messages preserving the info on former parents for the actors
		// and one additional one, indicating the new parent for all of them

		// changed due to refactoring

		assertEquals(11, operations.size());

		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		SingleReferenceOperation op4 = (SingleReferenceOperation) operations.get(4);
		SingleReferenceOperation op5 = (SingleReferenceOperation) operations.get(5);
		SingleReferenceOperation op6 = (SingleReferenceOperation) operations.get(6);
		SingleReferenceOperation op8 = (SingleReferenceOperation) operations.get(8);
		SingleReferenceOperation op9 = (SingleReferenceOperation) operations.get(9);

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId oldPackId = ModelUtil.getProject(oldPack).getModelElementId(oldPack);
		ModelElementId oldPack2Id = ModelUtil.getProject(oldPack2).getModelElementId(oldPack2);
		ModelElementId br1Id = ModelUtil.getProject(br1).getModelElementId(br1);
		ModelElementId br2Id = ModelUtil.getProject(br2).getModelElementId(br2);
		ModelElementId br3Id = ModelUtil.getProject(br3).getModelElementId(br3);
		ModelElementId br4Id = ModelUtil.getProject(br4).getModelElementId(br4);

		assertEquals(op1.getModelElementId(), br1Id);
		assertEquals(op3.getModelElementId(), br2Id);
		assertEquals(op5.getModelElementId(), br3Id);
		assertEquals(op8.getModelElementId(), br4Id);

		assertEquals(op1.getFeatureName(), "containingWorkpackage");
		assertEquals(op3.getFeatureName(), "containingWorkpackage");
		assertEquals(op5.getFeatureName(), "containingWorkpackage");
		assertEquals(op8.getFeatureName(), "containingWorkpackage");

		assertEquals(op1.getOldValue(), oldPackId);
		assertEquals(op3.getOldValue(), oldPackId);
		assertEquals(op5.getOldValue(), oldPackId);
		assertEquals(op8.getOldValue(), oldPack2Id);

		assertEquals(op1.getNewValue(), null);
		assertEquals(op3.getNewValue(), null);
		assertEquals(op5.getNewValue(), null);
		assertEquals(op8.getNewValue(), null);

		assertEquals(op2.getModelElementId(), br1Id);
		assertEquals(op4.getModelElementId(), br2Id);
		assertEquals(op6.getModelElementId(), br3Id);
		assertEquals(op9.getModelElementId(), br4Id);

		assertEquals(op2.getFeatureName(), "leafSection");
		assertEquals(op4.getFeatureName(), "leafSection");
		assertEquals(op6.getFeatureName(), "leafSection");
		assertEquals(op9.getFeatureName(), "leafSection");

		assertEquals(op2.getOldValue(), null);
		assertEquals(op4.getOldValue(), null);
		assertEquals(op6.getOldValue(), null);
		assertEquals(op9.getOldValue(), null);

		assertEquals(op2.getNewValue(), sectionId);
		assertEquals(op4.getNewValue(), sectionId);
		assertEquals(op6.getNewValue(), sectionId);
		assertEquals(op9.getNewValue(), sectionId);

		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertEquals(op0.getModelElementId(), oldPackId);
		assertEquals("containedWorkItems", op0.getFeatureName());
		assertFalse(op0.isAdd());
		assertEquals(3, op0.getReferencedModelElements().size());
		assertEquals(br1Id, op0.getReferencedModelElements().get(0));
		assertEquals(br2Id, op0.getReferencedModelElements().get(1));
		assertEquals(br3Id, op0.getReferencedModelElements().get(2));

		MultiReferenceOperation op7 = (MultiReferenceOperation) operations.get(7);
		assertEquals(op7.getModelElementId(), oldPack2Id);
		assertEquals("containedWorkItems", op7.getFeatureName());
		assertFalse(op7.isAdd());
		assertEquals(1, op7.getReferencedModelElements().size());
		assertEquals(br4Id, op7.getReferencedModelElements().get(0));

		MultiReferenceOperation op10 = (MultiReferenceOperation) operations.get(10);
		assertEquals(op10.getModelElementId(), sectionId);
		assertEquals("modelElements", op10.getFeatureName());
		assertTrue(op10.isAdd());
		assertEquals(4, op10.getReferencedModelElements().size());
		assertEquals(br1Id, op10.getReferencedModelElements().get(0));
		assertEquals(br2Id, op10.getReferencedModelElements().get(1));
		assertEquals(br3Id, op10.getReferencedModelElements().get(2));
		assertEquals(br4Id, op10.getReferencedModelElements().get(3));
		assertEquals(op10.getIndex(), 1);

	}

	/**
	 * add several already contained children to an empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddDifferentFeatureContained1ChildrenToEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Issue issue1 = RationaleFactory.eINSTANCE.createIssue();
		Solution solution1 = RationaleFactory.eINSTANCE.createSolution();
		Issue issue2 = RationaleFactory.eINSTANCE.createIssue();
		Solution solution2 = RationaleFactory.eINSTANCE.createSolution();

		getProject().addModelElement(issue1);
		getProject().addModelElement(issue2);
		getProject().addModelElement(section);
		getProject().addModelElement(solution1);
		getProject().addModelElement(solution2);

		Solution[] solutions = { solution1, solution2 };
		issue1.setSolution(solution1);
		issue2.setSolution(solution2);

		clearOperations();

		section.getModelElements().addAll(Arrays.asList(solutions));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}
		// now expectation is: we get 2 messages preserving the info on former parents for the solutions
		// and one additional one, indicating the new parent for both of them

		// changed due to refactoring

		assertEquals(7, operations.size());

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId solution1Id = ModelUtil.getProject(solution1).getModelElementId(solution1);
		ModelElementId solution2Id = ModelUtil.getProject(solution2).getModelElementId(solution2);
		ModelElementId issue1Id = ModelUtil.getProject(issue1).getModelElementId(issue1);
		ModelElementId issue2Id = ModelUtil.getProject(issue2).getModelElementId(issue2);

		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		SingleReferenceOperation op4 = (SingleReferenceOperation) operations.get(4);
		assertEquals(op1.getModelElementId(), solution1Id);
		assertEquals(op4.getModelElementId(), solution2Id);
		assertEquals(op1.getFeatureName(), "issue");
		assertEquals(op4.getFeatureName(), "issue");
		assertEquals(op1.getOldValue(), issue1Id);
		assertEquals(op4.getOldValue(), issue2Id);
		assertEquals(op1.getNewValue(), null);
		assertEquals(op4.getNewValue(), null);

		SingleReferenceOperation op0 = (SingleReferenceOperation) operations.get(0);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		assertEquals(op0.getModelElementId(), issue1Id);
		assertEquals(op3.getModelElementId(), issue2Id);
		assertEquals(op0.getFeatureName(), "solution");
		assertEquals(op3.getFeatureName(), "solution");
		assertEquals(op0.getOldValue(), solution1Id);
		assertEquals(op3.getOldValue(), solution2Id);
		assertEquals(op0.getNewValue(), null);
		assertEquals(op3.getNewValue(), null);

		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		SingleReferenceOperation op5 = (SingleReferenceOperation) operations.get(5);
		assertEquals(op2.getModelElementId(), solution1Id);
		assertEquals(op5.getModelElementId(), solution2Id);
		assertEquals(op2.getFeatureName(), "leafSection");
		assertEquals(op5.getFeatureName(), "leafSection");
		assertEquals(op2.getOldValue(), null);
		assertEquals(op5.getOldValue(), null);
		assertEquals(op2.getNewValue(), sectionId);
		assertEquals(op5.getNewValue(), sectionId);

		MultiReferenceOperation op6 = (MultiReferenceOperation) operations.get(6);
		assertEquals(op6.getModelElementId(), sectionId);
		assertEquals("modelElements", op6.getFeatureName());
		assertTrue(op6.isAdd());
		assertEquals(2, op6.getReferencedModelElements().size());
		assertEquals(solution1Id, op6.getReferencedModelElements().get(0));
		assertEquals(solution2Id, op6.getReferencedModelElements().get(1));
		assertEquals(op6.getIndex(), 0);

	}

	/**
	 * add several already contained children to a non-empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddDifferentFeatureContained1ChildrenToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		section.getModelElements().add(RationaleFactory.eINSTANCE.createSolution()); // prefill section
		Issue issue1 = RationaleFactory.eINSTANCE.createIssue();
		Solution solution1 = RationaleFactory.eINSTANCE.createSolution();
		Issue issue2 = RationaleFactory.eINSTANCE.createIssue();
		Solution solution2 = RationaleFactory.eINSTANCE.createSolution();

		getProject().addModelElement(issue1);
		getProject().addModelElement(issue2);
		getProject().addModelElement(section);
		getProject().addModelElement(solution1);
		getProject().addModelElement(solution2);

		Solution[] solutions = { solution1, solution2 };
		issue1.setSolution(solution1);
		issue2.setSolution(solution2);

		clearOperations();

		section.getModelElements().addAll(Arrays.asList(solutions));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}
		// now expectation is: we get 2 messages preserving the info on former parents for the solutions
		// and one additional one, indicating the new parent for both of them

		// changed due to refactoring

		assertEquals(7, operations.size());

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId solution1Id = ModelUtil.getProject(solution1).getModelElementId(solution1);
		ModelElementId solution2Id = ModelUtil.getProject(solution2).getModelElementId(solution2);
		ModelElementId issue1Id = ModelUtil.getProject(issue1).getModelElementId(issue1);
		ModelElementId issue2Id = ModelUtil.getProject(issue2).getModelElementId(issue2);

		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		SingleReferenceOperation op4 = (SingleReferenceOperation) operations.get(4);
		assertEquals(op1.getModelElementId(), solution1Id);
		assertEquals(op4.getModelElementId(), solution2Id);
		assertEquals(op1.getFeatureName(), "issue");
		assertEquals(op4.getFeatureName(), "issue");
		assertEquals(op1.getOldValue(), issue1Id);
		assertEquals(op4.getOldValue(), issue2Id);
		assertEquals(op1.getNewValue(), null);
		assertEquals(op4.getNewValue(), null);

		SingleReferenceOperation op0 = (SingleReferenceOperation) operations.get(0);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		assertEquals(op0.getModelElementId(), issue1Id);
		assertEquals(op3.getModelElementId(), issue2Id);
		assertEquals(op0.getFeatureName(), "solution");
		assertEquals(op3.getFeatureName(), "solution");
		assertEquals(op0.getOldValue(), solution1Id);
		assertEquals(op3.getOldValue(), solution2Id);
		assertEquals(op0.getNewValue(), null);
		assertEquals(op3.getNewValue(), null);

		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		SingleReferenceOperation op5 = (SingleReferenceOperation) operations.get(5);
		assertEquals(op2.getModelElementId(), solution1Id);
		assertEquals(op5.getModelElementId(), solution2Id);
		assertEquals(op2.getFeatureName(), "leafSection");
		assertEquals(op5.getFeatureName(), "leafSection");
		assertEquals(op2.getOldValue(), null);
		assertEquals(op5.getOldValue(), null);
		assertEquals(op2.getNewValue(), sectionId);
		assertEquals(op5.getNewValue(), sectionId);

		MultiReferenceOperation op6 = (MultiReferenceOperation) operations.get(6);
		assertEquals(op6.getModelElementId(), sectionId);
		assertEquals("modelElements", op6.getFeatureName());
		assertTrue(op6.isAdd());
		assertEquals(2, op6.getReferencedModelElements().size());
		assertEquals(solution1Id, op6.getReferencedModelElements().get(0));
		assertEquals(solution2Id, op6.getReferencedModelElements().get(1));
		assertEquals(op6.getIndex(), 1);
	}

	// BEGIN COMPLEX CODE
	/**
	 * add several already contained children to an empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddMixedChildrenToEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		LeafSection oldSection1 = DocumentFactory.eINSTANCE.createLeafSection();
		LeafSection oldSection2 = DocumentFactory.eINSTANCE.createLeafSection();
		Issue issue1 = RationaleFactory.eINSTANCE.createIssue();
		Solution solution1 = RationaleFactory.eINSTANCE.createSolution();
		Issue issue2 = RationaleFactory.eINSTANCE.createIssue();
		Solution solution2 = RationaleFactory.eINSTANCE.createSolution();
		Solution newSolution = RationaleFactory.eINSTANCE.createSolution();
		Solution sectionSolution1 = RationaleFactory.eINSTANCE.createSolution();
		Solution sectionSolution2 = RationaleFactory.eINSTANCE.createSolution();
		Solution sectionSolution3 = RationaleFactory.eINSTANCE.createSolution();
		WorkPackage pack = TaskFactory.eINSTANCE.createWorkPackage();
		BugReport br = BugFactory.eINSTANCE.createBugReport();

		getProject().addModelElement(issue1);
		getProject().addModelElement(issue2);
		getProject().addModelElement(section);
		getProject().addModelElement(oldSection1);
		getProject().addModelElement(oldSection2);
		getProject().addModelElement(newSolution);
		getProject().addModelElement(sectionSolution1);
		getProject().addModelElement(sectionSolution2);
		getProject().addModelElement(sectionSolution3);
		getProject().addModelElement(solution1);
		getProject().addModelElement(solution2);
		getProject().addModelElement(pack);
		getProject().addModelElement(br);

		UnicaseModelElement[] addedElements = { solution1, solution2, newSolution, sectionSolution1, sectionSolution2,
			sectionSolution3, br };
		issue1.setSolution(solution1);
		issue2.setSolution(solution2);
		pack.getContainedWorkItems().add(br);
		oldSection1.getModelElements().add(sectionSolution1);
		oldSection1.getModelElements().add(sectionSolution2);
		oldSection2.getModelElements().add(sectionSolution3);

		assertTrue(oldSection1.getModelElements().contains(sectionSolution1));
		assertTrue(oldSection1.getModelElements().contains(sectionSolution2));
		assertTrue(oldSection2.getModelElements().contains(sectionSolution3));
		assertTrue(pack.getContainedWorkItems().contains(br));

		clearOperations();

		section.getModelElements().addAll(Arrays.asList(addedElements));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		// now expectation is: we get 6 messages preserving the info on former parents for the solutions
		// and one additional one, indicating the new parent for both of them

		// changed due to refactoring

		assertEquals(16, operations.size());

		SingleReferenceOperation op0 = (SingleReferenceOperation) operations.get(0);
		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		SingleReferenceOperation op4 = (SingleReferenceOperation) operations.get(4);
		SingleReferenceOperation op5 = (SingleReferenceOperation) operations.get(5);
		SingleReferenceOperation op6 = (SingleReferenceOperation) operations.get(6);
		MultiReferenceOperation op7 = (MultiReferenceOperation) operations.get(7);
		SingleReferenceOperation op8 = (SingleReferenceOperation) operations.get(8);
		SingleReferenceOperation op9 = (SingleReferenceOperation) operations.get(9);
		MultiReferenceOperation op10 = (MultiReferenceOperation) operations.get(10);
		SingleReferenceOperation op11 = (SingleReferenceOperation) operations.get(11);
		MultiReferenceOperation op12 = (MultiReferenceOperation) operations.get(12);
		SingleReferenceOperation op13 = (SingleReferenceOperation) operations.get(13);
		SingleReferenceOperation op14 = (SingleReferenceOperation) operations.get(14);
		MultiReferenceOperation op15 = (MultiReferenceOperation) operations.get(15);

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId solution1Id = ModelUtil.getProject(solution1).getModelElementId(solution1);
		ModelElementId solution2Id = ModelUtil.getProject(solution2).getModelElementId(solution2);
		ModelElementId issue1Id = ModelUtil.getProject(issue1).getModelElementId(issue1);
		ModelElementId issue2Id = ModelUtil.getProject(issue2).getModelElementId(issue2);

		assertEquals(op0.getModelElementId(), issue1Id);
		assertEquals(op0.getFeatureName(), "solution");
		assertEquals(op0.getNewValue(), null);
		assertEquals(op0.getOldValue(), solution1Id);
		assertEquals(op1.getModelElementId(), solution1Id);
		assertEquals(op1.getFeatureName(), "issue");
		assertEquals(op1.getNewValue(), null);
		assertEquals(op1.getOldValue(), issue1Id);
		assertEquals(op2.getModelElementId(), solution1Id);
		assertEquals(op2.getFeatureName(), "leafSection");
		assertEquals(op2.getNewValue(), sectionId);
		assertEquals(op2.getOldValue(), null);

		assertEquals(op3.getModelElementId(), issue2Id);
		assertEquals(op3.getFeatureName(), "solution");
		assertEquals(op3.getNewValue(), null);
		assertEquals(op3.getOldValue(), solution2Id);
		assertEquals(op4.getModelElementId(), solution2Id);
		assertEquals(op4.getFeatureName(), "issue");
		assertEquals(op4.getNewValue(), null);
		assertEquals(op4.getOldValue(), issue2Id);
		assertEquals(op5.getModelElementId(), solution2Id);
		assertEquals(op5.getFeatureName(), "leafSection");
		assertEquals(op5.getNewValue(), sectionId);
		assertEquals(op5.getOldValue(), null);

		ModelElementId newSolutionId = ModelUtil.getProject(newSolution).getModelElementId(newSolution);
		ModelElementId oldSection1Id = ModelUtil.getProject(oldSection1).getModelElementId(oldSection1);
		ModelElementId oldSection2Id = ModelUtil.getProject(oldSection2).getModelElementId(oldSection2);
		ModelElementId sectionSolution1Id = ModelUtil.getProject(sectionSolution1).getModelElementId(sectionSolution1);
		ModelElementId sectionSolution2Id = ModelUtil.getProject(sectionSolution2).getModelElementId(sectionSolution2);
		ModelElementId sectionSolution3Id = ModelUtil.getProject(sectionSolution3).getModelElementId(sectionSolution3);

		assertEquals(op6.getModelElementId(), newSolutionId);
		assertEquals(op6.getFeatureName(), "leafSection");
		assertEquals(op6.getNewValue(), sectionId);
		assertEquals(op6.getOldValue(), null);

		assertEquals(op7.getModelElementId(), oldSection1Id);
		assertEquals(op7.getFeatureName(), "modelElements");
		assertEquals(op7.isAdd(), false);
		assertEquals(op7.getReferencedModelElements().size(), 2);
		assertEquals(op7.getReferencedModelElements().get(0), sectionSolution1Id);
		assertEquals(op7.getReferencedModelElements().get(1), sectionSolution2Id);
		assertEquals(op8.getModelElementId(), sectionSolution1Id);
		assertEquals(op8.getFeatureName(), "leafSection");
		assertEquals(op8.getNewValue(), sectionId);
		assertEquals(op8.getOldValue(), oldSection1Id);
		assertEquals(op9.getModelElementId(), sectionSolution2Id);
		assertEquals(op9.getFeatureName(), "leafSection");
		assertEquals(op9.getNewValue(), sectionId);
		assertEquals(op9.getOldValue(), oldSection1Id);

		assertEquals(op10.getModelElementId(), oldSection2Id);
		assertEquals(op10.getFeatureName(), "modelElements");
		assertEquals(op10.isAdd(), false);
		assertEquals(op10.getReferencedModelElements().size(), 1);
		assertEquals(op10.getReferencedModelElements().get(0), sectionSolution3Id);
		assertEquals(op11.getModelElementId(), sectionSolution3Id);
		assertEquals(op11.getFeatureName(), "leafSection");
		assertEquals(op11.getNewValue(), sectionId);
		assertEquals(op11.getOldValue(), oldSection2Id);

		ModelElementId packId = ModelUtil.getProject(pack).getModelElementId(pack);
		ModelElementId brId = ModelUtil.getProject(br).getModelElementId(br);

		assertEquals(op12.getModelElementId(), packId);
		assertEquals(op12.getFeatureName(), "containedWorkItems");
		assertEquals(op12.isAdd(), false);
		assertEquals(op12.getReferencedModelElements().size(), 1);
		assertEquals(op12.getReferencedModelElements().get(0), brId);
		assertEquals(op13.getModelElementId(), brId);
		assertEquals(op13.getFeatureName(), "containingWorkpackage");
		assertEquals(op13.getNewValue(), null);
		assertEquals(op13.getOldValue(), packId);
		assertEquals(op14.getModelElementId(), brId);
		assertEquals(op14.getFeatureName(), "leafSection");
		assertEquals(op14.getNewValue(), sectionId);
		assertEquals(op14.getOldValue(), null);

		assertEquals(op15.getModelElementId(), sectionId);
		assertEquals("modelElements", op15.getFeatureName());
		assertTrue(op15.isAdd());
		assertEquals(7, op15.getReferencedModelElements().size());
		assertEquals(solution1Id, op15.getReferencedModelElements().get(0));
		assertEquals(solution2Id, op15.getReferencedModelElements().get(1));
		assertEquals(newSolutionId, op15.getReferencedModelElements().get(2));
		assertEquals(sectionSolution1Id, op15.getReferencedModelElements().get(3));
		assertEquals(sectionSolution2Id, op15.getReferencedModelElements().get(4));
		assertEquals(sectionSolution3Id, op15.getReferencedModelElements().get(5));
		assertEquals(brId, op15.getReferencedModelElements().get(6));
		assertEquals(op15.getIndex(), 0);

	}

	/**
	 * add several already contained children to an empty containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentAddMixedChildrenToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		section.getModelElements().add(RationaleFactory.eINSTANCE.createIssue()); // prefill section
		LeafSection oldSection1 = DocumentFactory.eINSTANCE.createLeafSection();
		LeafSection oldSection2 = DocumentFactory.eINSTANCE.createLeafSection();
		Issue issue1 = RationaleFactory.eINSTANCE.createIssue();
		Solution solution1 = RationaleFactory.eINSTANCE.createSolution();
		Issue issue2 = RationaleFactory.eINSTANCE.createIssue();
		Solution solution2 = RationaleFactory.eINSTANCE.createSolution();
		Solution newSolution = RationaleFactory.eINSTANCE.createSolution();
		Solution sectionSolution1 = RationaleFactory.eINSTANCE.createSolution();
		Solution sectionSolution2 = RationaleFactory.eINSTANCE.createSolution();
		Solution sectionSolution3 = RationaleFactory.eINSTANCE.createSolution();
		WorkPackage pack = TaskFactory.eINSTANCE.createWorkPackage();
		BugReport br = BugFactory.eINSTANCE.createBugReport();

		getProject().addModelElement(issue1);
		getProject().addModelElement(issue2);
		getProject().addModelElement(section);
		getProject().addModelElement(oldSection1);
		getProject().addModelElement(oldSection2);
		getProject().addModelElement(newSolution);
		getProject().addModelElement(sectionSolution1);
		getProject().addModelElement(sectionSolution2);
		getProject().addModelElement(sectionSolution3);
		getProject().addModelElement(solution1);
		getProject().addModelElement(solution2);
		getProject().addModelElement(pack);
		getProject().addModelElement(br);

		UnicaseModelElement[] addedElements = { solution1, solution2, newSolution, sectionSolution1, sectionSolution2,
			sectionSolution3, br };
		issue1.setSolution(solution1);
		issue2.setSolution(solution2);
		pack.getContainedWorkItems().add(br);
		oldSection1.getModelElements().add(sectionSolution1);
		oldSection1.getModelElements().add(sectionSolution2);
		oldSection2.getModelElements().add(sectionSolution3);

		assertTrue(oldSection1.getModelElements().contains(sectionSolution1));
		assertTrue(oldSection1.getModelElements().contains(sectionSolution2));
		assertTrue(oldSection2.getModelElements().contains(sectionSolution3));
		assertTrue(pack.getContainedWorkItems().contains(br));

		clearOperations();

		section.getModelElements().addAll(Arrays.asList(addedElements));

		List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		// now expectation is: we get 6 messages preserving the info on former parents for the solutions
		// and one additional one, indicating the new parent for both of them

		// changed due to refactoring

		assertEquals(16, operations.size());

		SingleReferenceOperation op0 = (SingleReferenceOperation) operations.get(0);
		SingleReferenceOperation op1 = (SingleReferenceOperation) operations.get(1);
		SingleReferenceOperation op2 = (SingleReferenceOperation) operations.get(2);
		SingleReferenceOperation op3 = (SingleReferenceOperation) operations.get(3);
		SingleReferenceOperation op4 = (SingleReferenceOperation) operations.get(4);
		SingleReferenceOperation op5 = (SingleReferenceOperation) operations.get(5);
		SingleReferenceOperation op6 = (SingleReferenceOperation) operations.get(6);
		MultiReferenceOperation op7 = (MultiReferenceOperation) operations.get(7);
		SingleReferenceOperation op8 = (SingleReferenceOperation) operations.get(8);
		SingleReferenceOperation op9 = (SingleReferenceOperation) operations.get(9);
		MultiReferenceOperation op10 = (MultiReferenceOperation) operations.get(10);
		SingleReferenceOperation op11 = (SingleReferenceOperation) operations.get(11);
		MultiReferenceOperation op12 = (MultiReferenceOperation) operations.get(12);
		SingleReferenceOperation op13 = (SingleReferenceOperation) operations.get(13);
		SingleReferenceOperation op14 = (SingleReferenceOperation) operations.get(14);
		MultiReferenceOperation op15 = (MultiReferenceOperation) operations.get(15);

		ModelElementId issue1Id = ModelUtil.getProject(issue1).getModelElementId(issue1);
		ModelElementId issue2Id = ModelUtil.getProject(issue2).getModelElementId(issue2);
		ModelElementId oldSection1Id = ModelUtil.getProject(oldSection1).getModelElementId(oldSection1);
		ModelElementId oldSection2Id = ModelUtil.getProject(oldSection2).getModelElementId(oldSection2);
		ModelElementId sectionSolution1Id = ModelUtil.getProject(sectionSolution1).getModelElementId(sectionSolution1);
		ModelElementId sectionSolution2Id = ModelUtil.getProject(sectionSolution2).getModelElementId(sectionSolution2);
		ModelElementId sectionSolution3Id = ModelUtil.getProject(sectionSolution3).getModelElementId(sectionSolution3);
		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);
		ModelElementId newSolutionId = ModelUtil.getProject(newSolution).getModelElementId(newSolution);
		ModelElementId solution1Id = ModelUtil.getProject(solution1).getModelElementId(solution1);
		ModelElementId solution2Id = ModelUtil.getProject(solution2).getModelElementId(solution2);
		ModelElementId brId = ModelUtil.getProject(br).getModelElementId(br);
		ModelElementId packId = ModelUtil.getProject(pack).getModelElementId(pack);

		assertEquals(op0.getModelElementId(), issue1Id);
		assertEquals(op0.getFeatureName(), "solution");
		assertEquals(op0.getNewValue(), null);
		assertEquals(op0.getOldValue(), solution1Id);
		assertEquals(op1.getModelElementId(), solution1Id);
		assertEquals(op1.getFeatureName(), "issue");
		assertEquals(op1.getNewValue(), null);
		assertEquals(op1.getOldValue(), issue1Id);
		assertEquals(op2.getModelElementId(), solution1Id);
		assertEquals(op2.getFeatureName(), "leafSection");
		assertEquals(op2.getNewValue(), sectionId);
		assertEquals(op2.getOldValue(), null);

		assertEquals(op3.getModelElementId(), issue2Id);
		assertEquals(op3.getFeatureName(), "solution");
		assertEquals(op3.getNewValue(), null);
		assertEquals(op3.getOldValue(), solution2Id);
		assertEquals(op4.getModelElementId(), solution2Id);
		assertEquals(op4.getFeatureName(), "issue");
		assertEquals(op4.getNewValue(), null);
		assertEquals(op4.getOldValue(), issue2Id);
		assertEquals(op5.getModelElementId(), solution2Id);
		assertEquals(op5.getFeatureName(), "leafSection");
		assertEquals(op5.getNewValue(), sectionId);
		assertEquals(op5.getOldValue(), null);

		assertEquals(op6.getModelElementId(), newSolutionId);
		assertEquals(op6.getFeatureName(), "leafSection");
		assertEquals(op6.getNewValue(), sectionId);
		assertEquals(op6.getOldValue(), null);

		assertEquals(op7.getModelElementId(), oldSection1Id);
		assertEquals(op7.getFeatureName(), "modelElements");
		assertEquals(op7.isAdd(), false);
		assertEquals(op7.getReferencedModelElements().size(), 2);
		assertEquals(op7.getReferencedModelElements().get(0), sectionSolution1Id);
		assertEquals(op7.getReferencedModelElements().get(1), sectionSolution2Id);
		assertEquals(op8.getModelElementId(), sectionSolution1Id);
		assertEquals(op8.getFeatureName(), "leafSection");
		assertEquals(op8.getNewValue(), sectionId);
		assertEquals(op8.getOldValue(), oldSection1Id);
		assertEquals(op9.getModelElementId(), sectionSolution2Id);
		assertEquals(op9.getFeatureName(), "leafSection");
		assertEquals(op9.getNewValue(), sectionId);
		assertEquals(op9.getOldValue(), oldSection1Id);

		assertEquals(op10.getModelElementId(), oldSection2Id);
		assertEquals(op10.getFeatureName(), "modelElements");
		assertEquals(op10.isAdd(), false);
		assertEquals(op10.getReferencedModelElements().size(), 1);
		assertEquals(op10.getReferencedModelElements().get(0), sectionSolution3Id);
		assertEquals(op11.getModelElementId(), sectionSolution3Id);
		assertEquals(op11.getFeatureName(), "leafSection");
		assertEquals(op11.getNewValue(), sectionId);
		assertEquals(op11.getOldValue(), oldSection2Id);

		assertEquals(op12.getModelElementId(), packId);
		assertEquals(op12.getFeatureName(), "containedWorkItems");
		assertEquals(op12.isAdd(), false);
		assertEquals(op12.getReferencedModelElements().size(), 1);
		assertEquals(op12.getReferencedModelElements().get(0), brId);
		assertEquals(op13.getModelElementId(), brId);
		assertEquals(op13.getFeatureName(), "containingWorkpackage");
		assertEquals(op13.getNewValue(), null);
		assertEquals(op13.getOldValue(), packId);
		assertEquals(op14.getModelElementId(), brId);
		assertEquals(op14.getFeatureName(), "leafSection");
		assertEquals(op14.getNewValue(), sectionId);
		assertEquals(op14.getOldValue(), null);

		assertEquals(op15.getModelElementId(), sectionId);
		assertEquals("modelElements", op15.getFeatureName());
		assertTrue(op15.isAdd());
		assertEquals(7, op15.getReferencedModelElements().size());
		assertEquals(solution1Id, op15.getReferencedModelElements().get(0));
		assertEquals(solution2Id, op15.getReferencedModelElements().get(1));
		assertEquals(newSolutionId, op15.getReferencedModelElements().get(2));
		assertEquals(sectionSolution1Id, op15.getReferencedModelElements().get(3));
		assertEquals(sectionSolution2Id, op15.getReferencedModelElements().get(4));
		assertEquals(sectionSolution3Id, op15.getReferencedModelElements().get(5));
		assertEquals(brId, op15.getReferencedModelElements().get(6));
		assertEquals(op15.getIndex(), 1);

	}

	/**
	 * remove last child from a containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentRemoveChildAndEmpty() throws UnsupportedOperationException, UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(section);

		section.getModelElements().add(actor);

		clearOperations();
		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		section.getModelElements().remove(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(2, subOperations.size());

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertTrue(subOperations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) subOperations.get(0);
		assertEquals(actorId, op0.getModelElementId());
		assertEquals(sectionId, op0.getOldValue());
		assertEquals(null, op0.getNewValue());
		assertEquals("leafSection", op0.getFeatureName());

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertFalse(op1.isAdd());
		assertEquals(1, op1.getReferencedModelElements().size());
		assertEquals(actorId, op1.getReferencedModelElements().get(0));
		assertEquals("modelElements", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), sectionId);
		assertEquals(op1.getIndex(), 0);

	}

	/**
	 * remove all children from a containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentRemoveChildrenAndEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(section);

		Actor[] actors = { actor1, actor2 };
		section.getModelElements().addAll(Arrays.asList(actors));

		clearOperations();
		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		section.getModelElements().removeAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(3, subOperations.size());

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertTrue(subOperations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) subOperations.get(0);
		assertEquals(actor1Id, op0.getModelElementId());
		assertEquals(sectionId, op0.getOldValue());
		assertEquals(null, op0.getNewValue());
		assertEquals("leafSection", op0.getFeatureName());

		assertTrue(subOperations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op1 = (SingleReferenceOperation) subOperations.get(1);
		assertEquals(actor2Id, op1.getModelElementId());
		assertEquals(sectionId, op1.getOldValue());
		assertEquals(null, op1.getNewValue());
		assertEquals("leafSection", op1.getFeatureName());

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op2 = (MultiReferenceOperation) subOperations.get(2);
		assertFalse(op2.isAdd());
		assertEquals(2, op2.getReferencedModelElements().size());
		assertEquals(actor1Id, op2.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op2.getReferencedModelElements().get(1));
		assertEquals("modelElements", op2.getFeatureName());
		assertEquals(op2.getModelElementId(), sectionId);
		assertEquals(op2.getIndex(), 0);

	}

	/**
	 * remove non-last child from a containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentRemoveChildPart() throws UnsupportedOperationException, UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor actor = RequirementFactory.eINSTANCE.createActor();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(oldActor);
		getProject().addModelElement(section);

		section.getModelElements().add(oldActor);
		section.getModelElements().add(actor);

		clearOperations();
		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);

		section.getModelElements().remove(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(2, subOperations.size());

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertTrue(subOperations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) subOperations.get(0);
		assertEquals(actorId, op0.getModelElementId());
		assertEquals(sectionId, op0.getOldValue());
		assertEquals(null, op0.getNewValue());
		assertEquals("leafSection", op0.getFeatureName());

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertFalse(op1.isAdd());
		assertEquals(1, op1.getReferencedModelElements().size());
		assertEquals(actorId, op1.getReferencedModelElements().get(0));
		assertEquals("modelElements", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), sectionId);
		assertEquals(op1.getIndex(), 1);

	}

	/**
	 * add a child to an empty non-containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void nonContainmentAddChildToEmpty() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Actor actor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(useCase);

		clearOperations();

		useCase.getParticipatingActors().add(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(2, subOperations.size());

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) subOperations.get(0);
		assertTrue(op0.isAdd());
		assertEquals("participatedUseCases", op0.getFeatureName());

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(actorId, op0.getModelElementId());
		assertEquals(useCaseId, op0.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertTrue(op1.isAdd());
		assertEquals(1, op1.getReferencedModelElements().size());
		assertEquals(actorId, op1.getReferencedModelElements().get(0));
		assertEquals("participatingActors", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), useCaseId);
		assertEquals(op1.getIndex(), 0);

	}

	/**
	 * add some children to an empty non-containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void nonContainmentAddChildrenToEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(useCase);

		Actor[] actors = { actor1, actor2 };

		clearOperations();

		useCase.getParticipatingActors().addAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(3, subOperations.size());

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) subOperations.get(0);
		assertTrue(op0.isAdd());
		assertEquals("participatedUseCases", op0.getFeatureName());

		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(actor1Id, op0.getModelElementId());
		assertEquals(useCaseId, op0.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertTrue(op1.isAdd());
		assertEquals("participatedUseCases", op1.getFeatureName());
		assertEquals(actor2Id, op1.getModelElementId());
		assertEquals(useCaseId, op1.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op2 = (MultiReferenceOperation) subOperations.get(2);
		assertTrue(op2.isAdd());
		assertEquals(2, op2.getReferencedModelElements().size());
		assertEquals(actor1Id, op2.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op2.getReferencedModelElements().get(1));
		assertEquals("participatingActors", op2.getFeatureName());
		assertEquals(op2.getModelElementId(), useCaseId);
		assertEquals(op2.getIndex(), 0);

	}

	/**
	 * add a child to a non-empty non-containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void nonContainmentAddChildToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();
		Actor actor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(oldActor);
		getProject().addModelElement(useCase);

		useCase.getParticipatingActors().add(oldActor);

		clearOperations();

		useCase.getParticipatingActors().add(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(2, subOperations.size());

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) subOperations.get(0);
		assertTrue(op0.isAdd());
		assertEquals("participatedUseCases", op0.getFeatureName());

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(actorId, op0.getModelElementId());
		assertEquals(useCaseId, op0.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertTrue(op1.isAdd());
		assertEquals(1, op1.getReferencedModelElements().size());
		assertEquals(actorId, op1.getReferencedModelElements().get(0));
		assertEquals("participatingActors", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), useCaseId);
		assertEquals(op1.getIndex(), 1);

	}

	/**
	 * add some children to a non-empty non-containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void nonContainmentAddChildrenToNonEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(oldActor);
		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(useCase);

		Actor[] actors = { actor1, actor2 };
		useCase.getParticipatingActors().add(oldActor);
		clearOperations();

		useCase.getParticipatingActors().addAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(3, subOperations.size());

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) subOperations.get(0);
		assertTrue(op0.isAdd());
		assertEquals("participatedUseCases", op0.getFeatureName());

		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(actor1Id, op0.getModelElementId());
		assertEquals(useCaseId, op0.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertTrue(op1.isAdd());
		assertEquals("participatedUseCases", op1.getFeatureName());
		assertEquals(actor2Id, op1.getModelElementId());
		assertEquals(useCaseId, op1.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op2 = (MultiReferenceOperation) subOperations.get(2);
		assertTrue(op2.isAdd());
		assertEquals(2, op2.getReferencedModelElements().size());
		assertEquals(actor1Id, op2.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op2.getReferencedModelElements().get(1));
		assertEquals("participatingActors", op2.getFeatureName());
		assertEquals(op2.getModelElementId(), useCaseId);
		assertEquals(op2.getIndex(), 1);

	}

	/**
	 * remove last child from non-containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void nonContainmentRemoveChildAndEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Actor actor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(useCase);
		useCase.getParticipatingActors().add(actor);

		clearOperations();

		useCase.getParticipatingActors().remove(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(2, operations.size());

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertFalse(op0.isAdd());
		assertEquals(1, op0.getReferencedModelElements().size());

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(useCaseId, op0.getReferencedModelElements().get(0));
		assertEquals("participatedUseCases", op0.getFeatureName());
		assertEquals(op0.getModelElementId(), actorId);
		assertEquals(op0.getIndex(), 0);

		assertTrue(operations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) operations.get(1);
		assertFalse(op1.isAdd());
		assertEquals(1, op1.getReferencedModelElements().size());
		assertEquals(actorId, op1.getReferencedModelElements().get(0));
		assertEquals("participatingActors", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), useCaseId);
		assertEquals(op1.getIndex(), 0);

	}

	/**
	 * remove non-last child from non-containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void nonContainmentRemoveChildPart() throws UnsupportedOperationException, UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Actor actor = RequirementFactory.eINSTANCE.createActor();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor);
		getProject().addModelElement(oldActor);
		getProject().addModelElement(useCase);

		useCase.getParticipatingActors().add(oldActor);
		useCase.getParticipatingActors().add(actor);

		clearOperations();

		useCase.getParticipatingActors().remove(actor);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		// expecting a composite operation here
		assertEquals(1, operations.size());
		if (operations.get(0) instanceof CompositeOperation) {
			operations = ((CompositeOperation) operations.get(0)).getSubOperations();
		} else {
			fail("composite operation expected");
		}

		assertEquals(2, operations.size());

		assertTrue(operations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) operations.get(0);
		assertFalse(op0.isAdd());
		assertEquals(1, op0.getReferencedModelElements().size());

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(useCaseId, op0.getReferencedModelElements().get(0));
		assertEquals("participatedUseCases", op0.getFeatureName());
		assertEquals(op0.getModelElementId(), actorId);
		assertEquals(op0.getIndex(), 0);

		assertTrue(operations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) operations.get(1);
		assertFalse(op1.isAdd());
		assertEquals(1, op1.getReferencedModelElements().size());
		assertEquals(actorId, op1.getReferencedModelElements().get(0));
		assertEquals("participatingActors", op1.getFeatureName());
		assertEquals(op1.getModelElementId(), useCaseId);
		assertEquals(op1.getIndex(), 1);

	}

	/**
	 * remove all children from non-containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */

	@Test
	public void nonContainmentRemoveChildrenAndEmpty() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(useCase);

		Actor[] actors = { actor1, actor2 };

		useCase.getParticipatingActors().addAll(Arrays.asList(actors));

		clearOperations();

		useCase.getParticipatingActors().removeAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(3, subOperations.size());

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) subOperations.get(0);
		assertFalse(op0.isAdd());
		assertEquals("participatedUseCases", op0.getFeatureName());

		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(actor1Id, op0.getModelElementId());
		assertEquals(useCaseId, op0.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertFalse(op1.isAdd());
		assertEquals("participatedUseCases", op1.getFeatureName());
		assertEquals(actor2Id, op1.getModelElementId());
		assertEquals(useCaseId, op1.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op2 = (MultiReferenceOperation) subOperations.get(2);
		assertFalse(op2.isAdd());
		assertEquals(2, op2.getReferencedModelElements().size());
		assertEquals(actor1Id, op2.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op2.getReferencedModelElements().get(1));
		assertEquals("participatingActors", op2.getFeatureName());
		assertEquals(op2.getModelElementId(), useCaseId);
		assertEquals(op2.getIndex(), 0);

	}

	/**
	 * remove some children from non-containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */

	@Test
	public void nonContainmentRemoveChildrenPart() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(oldActor);
		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(useCase);

		Actor[] actors = { actor1, actor2 };

		useCase.getParticipatingActors().add(oldActor);
		useCase.getParticipatingActors().addAll(Arrays.asList(actors));

		clearOperations();

		useCase.getParticipatingActors().removeAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(3, subOperations.size());

		assertTrue(subOperations.get(0) instanceof MultiReferenceOperation);
		MultiReferenceOperation op0 = (MultiReferenceOperation) subOperations.get(0);
		assertFalse(op0.isAdd());

		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals("participatedUseCases", op0.getFeatureName());
		assertEquals(actor1Id, op0.getModelElementId());
		assertEquals(useCaseId, op0.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(1) instanceof MultiReferenceOperation);
		MultiReferenceOperation op1 = (MultiReferenceOperation) subOperations.get(1);
		assertFalse(op1.isAdd());
		assertEquals("participatedUseCases", op1.getFeatureName());
		assertEquals(actor2Id, op1.getModelElementId());
		assertEquals(useCaseId, op1.getReferencedModelElements().get(0));

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op2 = (MultiReferenceOperation) subOperations.get(2);
		assertFalse(op2.isAdd());
		assertEquals(2, op2.getReferencedModelElements().size());
		assertEquals(actor1Id, op2.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op2.getReferencedModelElements().get(1));
		assertEquals("participatingActors", op2.getFeatureName());
		assertEquals(op2.getModelElementId(), useCaseId);
		assertEquals(op2.getIndex(), 1);

	}

	/**
	 * remove some children from a containment feature.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void containmentRemoveChildrenPart() throws UnsupportedOperationException, UnsupportedNotificationException {

		LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		Actor oldActor = RequirementFactory.eINSTANCE.createActor();
		Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		getProject().addModelElement(oldActor);
		getProject().addModelElement(actor1);
		getProject().addModelElement(actor2);
		getProject().addModelElement(section);

		Actor[] actors = { actor1, actor2 };
		section.getModelElements().add(oldActor);
		section.getModelElements().addAll(Arrays.asList(actors));

		clearOperations();
		ModelElementId actor1Id = ModelUtil.getProject(actor1).getModelElementId(actor1);
		ModelElementId actor2Id = ModelUtil.getProject(actor2).getModelElementId(actor2);
		section.getModelElements().removeAll(Arrays.asList(actors));

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CompositeOperation);

		List<AbstractOperation> subOperations = ((CompositeOperation) operation).getSubOperations();

		assertEquals(3, subOperations.size());

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertTrue(subOperations.get(0) instanceof SingleReferenceOperation);
		SingleReferenceOperation op0 = (SingleReferenceOperation) subOperations.get(0);
		assertEquals(actor1Id, op0.getModelElementId());
		assertEquals(sectionId, op0.getOldValue());
		assertEquals(null, op0.getNewValue());
		assertEquals("leafSection", op0.getFeatureName());

		assertTrue(subOperations.get(1) instanceof SingleReferenceOperation);
		SingleReferenceOperation op1 = (SingleReferenceOperation) subOperations.get(1);
		assertEquals(actor2Id, op1.getModelElementId());
		assertEquals(sectionId, op1.getOldValue());
		assertEquals(null, op1.getNewValue());
		assertEquals("leafSection", op1.getFeatureName());

		assertTrue(subOperations.get(2) instanceof MultiReferenceOperation);
		MultiReferenceOperation op2 = (MultiReferenceOperation) subOperations.get(2);
		assertFalse(op2.isAdd());
		assertEquals(2, op2.getReferencedModelElements().size());
		assertEquals(actor1Id, op2.getReferencedModelElements().get(0));
		assertEquals(actor2Id, op2.getReferencedModelElements().get(1));
		assertEquals("modelElements", op2.getFeatureName());
		assertEquals(op2.getModelElementId(), sectionId);
		assertEquals(op2.getIndex(), 1);

	}

}
