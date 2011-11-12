/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.conflictDetection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.List;

import org.eclipse.emf.emfstore.client.model.CompositeOperationHandle;
import org.eclipse.emf.emfstore.client.model.exceptions.InvalidHandleException;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentFactory;
import org.eclipse.emf.emfstore.client.test.model.document.LeafSection;
import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationaleFactory;
import org.eclipse.emf.emfstore.client.test.model.rationale.Solution;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.requirement.UserTask;
import org.eclipse.emf.emfstore.server.conflictDetection.ConflictDetector;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.junit.Test;

/**
 * Tests conflict detection behaviour on attributes.
 * 
 * @author chodnick
 */
public class ConflictDetectionRequiredRelationTest extends ConflictDetectionTest {

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireCreateByAdd() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProjectSpace().getOperations().clear();
				section.getModelElements().add(actor);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [Create actor], [add actor to section]
		AbstractOperation createActor = ops.get(0);
		AbstractOperation addActor = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, addActor).size());
		assertSame(cd.getRequired(ops, addActor).get(0), createActor);

		assertEquals(1, cd.getRequiring(ops, createActor).size());
		assertSame(cd.getRequiring(ops, createActor).get(0), addActor);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireCreateByRemove() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProjectSpace().getOperations().clear();
				section.getModelElements().add(actor);
				section.getModelElements().remove(actor);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [Create actor], [add actor to section], [remove actor from section]
		AbstractOperation createActor = ops.get(0);
		AbstractOperation addActor = ops.get(1);
		AbstractOperation removeActor = ops.get(2);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, removeActor).size());
		assertSame(cd.getRequired(ops, removeActor).get(0), createActor);

		assertEquals(0, cd.getRequiring(ops, removeActor).size());

		assertEquals(0, cd.getRequiring(ops, addActor).size());

		assertEquals(2, cd.getRequiring(ops, createActor).size());
		assertSame(cd.getRequiring(ops, createActor).get(0), addActor);
		assertSame(cd.getRequiring(ops, createActor).get(1), removeActor);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireCreateByMove() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor dummy = RequirementFactory.eINSTANCE.createActor();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.getModelElements().add(dummy);
				getProjectSpace().getOperations().clear();
				section.getModelElements().add(actor);
				section.getModelElements().move(0, actor);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [Create actor], [add actor to section], [move actor in section]
		AbstractOperation createActor = ops.get(0);
		AbstractOperation addActor = ops.get(1);
		AbstractOperation moveActor = ops.get(2);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(2, cd.getRequired(ops, moveActor).size());
		assertSame(cd.getRequired(ops, moveActor).get(0), createActor);
		assertSame(cd.getRequired(ops, moveActor).get(1), addActor);

		assertEquals(0, cd.getRequiring(ops, moveActor).size());

		assertEquals(1, cd.getRequiring(ops, addActor).size());
		assertSame(cd.getRequiring(ops, addActor).get(0), moveActor);

		assertEquals(2, cd.getRequiring(ops, createActor).size());
		assertSame(cd.getRequiring(ops, createActor).get(0), addActor);
		assertSame(cd.getRequiring(ops, createActor).get(1), moveActor);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireCreateByAttributeChange() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProjectSpace().getOperations().clear();
				section.getModelElements().add(actor);
				actor.setName("this is a new name");

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [Create actor], [add actor to section], [rename actor]
		AbstractOperation createActor = ops.get(0);
		AbstractOperation addActor = ops.get(1);
		AbstractOperation nameActor = ops.get(2);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, nameActor).size());
		assertSame(cd.getRequired(ops, nameActor).get(0), createActor);

		assertEquals(0, cd.getRequiring(ops, nameActor).size());

		assertEquals(0, cd.getRequiring(ops, addActor).size());

		assertEquals(2, cd.getRequiring(ops, createActor).size());
		assertSame(cd.getRequiring(ops, createActor).get(0), addActor);
		assertSame(cd.getRequiring(ops, createActor).get(1), nameActor);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireCreateByReferenceChange() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final UserTask task = RequirementFactory.eINSTANCE.createUserTask();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(task);
				getProjectSpace().getOperations().clear();
				section.getModelElements().add(actor);
				actor.setInitiatedUserTask(task);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [Create actor], [add actor to section], [task actor]
		AbstractOperation createActor = ops.get(0);
		AbstractOperation addActor = ops.get(1);
		AbstractOperation taskActor = ops.get(2);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, taskActor).size());
		assertSame(cd.getRequired(ops, taskActor).get(0), createActor);

		assertEquals(0, cd.getRequiring(ops, taskActor).size());

		assertEquals(0, cd.getRequiring(ops, addActor).size());

		assertEquals(2, cd.getRequiring(ops, createActor).size());
		assertSame(cd.getRequiring(ops, createActor).get(0), addActor);
		assertSame(cd.getRequiring(ops, createActor).get(1), taskActor);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireCreateByMultiChange() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(useCase);
				getProjectSpace().getOperations().clear();
				section.getModelElements().add(actor);
				actor.getInitiatedUseCases().add(useCase);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [Create actor], [add actor to section], [add usecase to actor]
		AbstractOperation createActor = ops.get(0);
		AbstractOperation addActor = ops.get(1);
		AbstractOperation caseActor = ops.get(2);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, caseActor).size());
		assertSame(cd.getRequired(ops, caseActor).get(0), createActor);

		assertEquals(0, cd.getRequiring(ops, caseActor).size());

		assertEquals(0, cd.getRequiring(ops, addActor).size());

		assertEquals(2, cd.getRequiring(ops, createActor).size());
		assertSame(cd.getRequiring(ops, createActor).get(0), addActor);
		assertSame(cd.getRequiring(ops, createActor).get(1), caseActor);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireCreateByIndirectChange() {

		final Issue issue = RationaleFactory.eINSTANCE.createIssue();
		final Solution solution1 = RationaleFactory.eINSTANCE.createSolution();
		final Solution solution2 = RationaleFactory.eINSTANCE.createSolution();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(issue);
				getProject().addModelElement(solution2);
				// issue.setSolution(solution2);

				getProjectSpace().getOperations().clear();
				getProject().addModelElement(solution1);
				issue.setSolution(solution1);
				issue.setSolution(solution2);

			}
		}.run(false);
		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [create solution1], [set solution 1], [set solution 2]
		AbstractOperation createSolution1 = ops.get(0);
		AbstractOperation setSolution1 = ops.get(1);
		AbstractOperation setSolution2 = ops.get(2);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, setSolution2).size());
		assertEquals(3, cd.getRequiring(ops, createSolution1).size());
		assertSame(cd.getRequiring(ops, createSolution1).get(0), setSolution1);
		assertSame(cd.getRequiring(ops, createSolution1).get(1), setSolution2);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireCreateByDelete() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProjectSpace().getOperations().clear();
				section.getModelElements().add(actor);
				actor.setName("name");
				getProject().deleteModelElement(actor);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [create actor], [addActor], [nameActor], [delete actor]
		AbstractOperation createActor = ops.get(0);
		AbstractOperation addActor = ops.get(1);
		AbstractOperation nameActor = ops.get(2);
		AbstractOperation deleteActor = ops.get(3);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, deleteActor).size());
		assertSame(cd.getRequired(ops, deleteActor).get(0), createActor);

		assertEquals(1, cd.getRequired(ops, nameActor).size());
		assertSame(cd.getRequired(ops, nameActor).get(0), createActor);

		assertEquals(1, cd.getRequired(ops, addActor).size());
		assertSame(cd.getRequired(ops, addActor).get(0), createActor);

		assertEquals(3, cd.getRequiring(ops, createActor).size());
		assertSame(cd.getRequiring(ops, createActor).get(0), addActor);
		assertSame(cd.getRequiring(ops, createActor).get(1), nameActor);
		assertSame(cd.getRequiring(ops, createActor).get(2), deleteActor);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireCreateByChangeInDeletree() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProjectSpace().getOperations().clear();
				getProject().addModelElement(section);
				section.getModelElements().add(actor);
				actor.setName("name");
				getProject().deleteModelElement(section);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [create section], [create actor], [add actor], [name actor], [delete section]
		AbstractOperation createSection = ops.get(0);
		AbstractOperation createActor = ops.get(1);
		AbstractOperation addActor = ops.get(2);
		AbstractOperation nameActor = ops.get(3);
		AbstractOperation deleteSection = ops.get(4);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(0, cd.getRequired(ops, createSection).size());
		assertEquals(0, cd.getRequired(ops, createActor).size());

		assertEquals(2, cd.getRequired(ops, addActor).size());
		assertSame(cd.getRequired(ops, addActor).get(0), createSection);
		assertSame(cd.getRequired(ops, addActor).get(1), createActor);

		assertEquals(1, cd.getRequired(ops, nameActor).size());
		assertSame(cd.getRequired(ops, nameActor).get(0), createActor);

		assertEquals(1, cd.getRequired(ops, deleteSection).size());
		assertSame(cd.getRequired(ops, deleteSection).get(0), createSection);

		assertEquals(2, cd.getRequiring(ops, createSection).size());
		assertSame(cd.getRequiring(ops, createSection).get(0), addActor);
		assertSame(cd.getRequiring(ops, createSection).get(1), deleteSection);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireSingleRefByMove() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor dummy = RequirementFactory.eINSTANCE.createActor();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(actor);
				section.getModelElements().add(dummy);

				getProjectSpace().getOperations().clear();

				actor.setLeafSection(section);
				section.getModelElements().move(0, actor);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [add actor to section], [move actor in section]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation moveActor = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, moveActor).size());
		assertSame(cd.getRequired(ops, moveActor).get(0), addActor);

		assertEquals(0, cd.getRequiring(ops, moveActor).size());

		assertEquals(1, cd.getRequiring(ops, addActor).size());
		assertSame(cd.getRequiring(ops, addActor).get(0), moveActor);

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireSingleRefByRemove() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(actor);

				getProjectSpace().getOperations().clear();

				actor.setLeafSection(section);
				section.getModelElements().remove(actor);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [add actor to section], [remove actor from section]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation removeActor = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		// the remove does not required an add, as per specification
		assertEquals(0, cd.getRequired(ops, removeActor).size());
		assertEquals(0, cd.getRequiring(ops, removeActor).size());

		assertEquals(0, cd.getRequired(ops, addActor).size());
		assertEquals(0, cd.getRequiring(ops, addActor).size());

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireSingleRefByIndirectRemove() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final LeafSection section2 = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(section2);
				getProject().addModelElement(actor);

				getProjectSpace().getOperations().clear();

				actor.setLeafSection(section);
				section2.getModelElements().add(actor);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [add actor to section], [composite remove/add actor to section2]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation relocateActor = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(0, cd.getRequired(ops, relocateActor).size());
		assertEquals(0, cd.getRequiring(ops, relocateActor).size());

		assertEquals(0, cd.getRequired(ops, addActor).size());
		assertEquals(0, cd.getRequiring(ops, addActor).size());

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireMultiRefByIndirectRemove() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final LeafSection section2 = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(section2);
				getProject().addModelElement(actor);

				getProjectSpace().getOperations().clear();

				section.getModelElements().add(actor);
				section2.getModelElements().add(actor);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [add actor to section], [composite remove/add actor to section2]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation relocateActor = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(0, cd.getRequired(ops, relocateActor).size());
		assertEquals(0, cd.getRequiring(ops, relocateActor).size());

		assertEquals(0, cd.getRequired(ops, addActor).size());
		assertEquals(0, cd.getRequiring(ops, addActor).size());

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireMultiRefByRemove() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(actor);

				getProjectSpace().getOperations().clear();

				section.getModelElements().add(actor);
				section.getModelElements().remove(actor);

			}
		}.run(false);
		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [add actor to section], [remove actor]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation removeActor = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		// the remove does not need the add as per spec
		assertEquals(0, cd.getRequired(ops, removeActor).size());
		assertEquals(0, cd.getRequiring(ops, removeActor).size());

		assertEquals(0, cd.getRequired(ops, addActor).size());
		assertEquals(0, cd.getRequiring(ops, addActor).size());
	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireMultiRefByMove() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final Actor dummy = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(actor);
				section.getModelElements().add(dummy);

				getProjectSpace().getOperations().clear();

				section.getModelElements().add(actor);
				section.getModelElements().move(0, actor);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [add actor to section], [move actor]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation moveActor = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, moveActor).size());
		assertSame(cd.getRequired(ops, moveActor).get(0), addActor);

		assertEquals(0, cd.getRequiring(ops, moveActor).size());

		assertEquals(1, cd.getRequiring(ops, addActor).size());
		assertSame(cd.getRequiring(ops, addActor).get(0), moveActor);

	}

	/**
	 * Tests requires & requiring relation.
	 * 
	 * @throws InvalidHandleException if something goes wrong
	 */
	@Test
	public void requireCompositeMultiRefByCompositeMove() throws InvalidHandleException {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final Actor dummy = RequirementFactory.eINSTANCE.createActor();
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(actor);
				section.getModelElements().add(dummy);
				getProjectSpace().getOperations().clear();

				CompositeOperationHandle handle1 = getProjectSpace().beginCompositeOperation();
				section.getModelElements().add(actor);
				try {
					handle1.end("", "", null);
				} catch (InvalidHandleException e) {
					fail();
				}
				CompositeOperationHandle handle2 = getProjectSpace().beginCompositeOperation();
				section.getModelElements().move(0, actor);
				try {
					handle2.end("", "", null);
				} catch (InvalidHandleException e) {
					fail();
				}
			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [composite add actor to section], [composite move actor in section2]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation moveActor = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(1, cd.getRequired(ops, moveActor).size());
		assertSame(cd.getRequired(ops, moveActor).get(0), addActor);

		assertEquals(0, cd.getRequiring(ops, moveActor).size());

		assertEquals(1, cd.getRequiring(ops, addActor).size());
		assertSame(cd.getRequiring(ops, addActor).get(0), moveActor);

	}

	/**
	 * Tests requires & requiring relation.
	 * 
	 * @throws InvalidHandleException if something goes wrong
	 */
	@Test
	public void requireCompositeMultiRefByCompositeIndirectRemove() throws InvalidHandleException {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final LeafSection section2 = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(section2);
				getProject().addModelElement(actor);
				getProjectSpace().getOperations().clear();

				CompositeOperationHandle handle1 = getProjectSpace().beginCompositeOperation();
				section.getModelElements().add(actor);
				try {
					handle1.end("", "", null);
				} catch (InvalidHandleException e) {
					fail();
				}
				CompositeOperationHandle handle2 = getProjectSpace().beginCompositeOperation();
				section2.getModelElements().add(actor);
				try {
					handle2.end("", "", null);
				} catch (InvalidHandleException e) {
					fail();
				}

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [composite add actor to section], [composite composite remove/add actor to section2]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation relocateActor = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(0, cd.getRequired(ops, relocateActor).size());
		assertEquals(0, cd.getRequiring(ops, relocateActor).size());

		assertEquals(0, cd.getRequired(ops, addActor).size());
		assertEquals(0, cd.getRequiring(ops, addActor).size());

	}

	/**
	 * Tests requires & requiring relation.
	 * 
	 * @throws InvalidHandleException
	 * @throws InvalidHandleException if something goes wrong
	 */
	@Test
	public void requireUnrelatedCompositeOps() throws InvalidHandleException {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final LeafSection section2 = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(section2);
				getProject().addModelElement(actor);
				getProject().addModelElement(actor2);
				getProjectSpace().getOperations().clear();

				CompositeOperationHandle handle1 = getProjectSpace().beginCompositeOperation();
				section.getModelElements().add(actor);
				try {
					handle1.end("", "", null);
				} catch (InvalidHandleException e) {
					fail();
				}
				CompositeOperationHandle handle2 = getProjectSpace().beginCompositeOperation();
				section2.getModelElements().add(actor2);
				try {
					handle2.end("", "", null);
				} catch (InvalidHandleException e) {
					fail();
				}
			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [composite add actor to section], [composite add actor2 to section2]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation addActor2 = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(0, cd.getRequired(ops, addActor).size());
		assertEquals(0, cd.getRequiring(ops, addActor).size());

		assertEquals(0, cd.getRequired(ops, addActor2).size());
		assertEquals(0, cd.getRequiring(ops, addActor2).size());

	}

	// BEGIN COMPLEX CODE
	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireUnrelatedOps() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final LeafSection section2 = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final Actor actor2 = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(section2);
				getProject().addModelElement(actor);
				getProject().addModelElement(actor2);

				getProjectSpace().getOperations().clear();

				section.getModelElements().add(actor);
				section2.getModelElements().add(actor2);

			}
		}.run(false);

		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops are [add actor to section], [add actor2 to section2]
		AbstractOperation addActor = ops.get(0);
		AbstractOperation addActor2 = ops.get(1);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(0, cd.getRequired(ops, addActor).size());
		assertEquals(0, cd.getRequiring(ops, addActor).size());

		assertEquals(0, cd.getRequired(ops, addActor2).size());
		assertEquals(0, cd.getRequiring(ops, addActor2).size());

	}

	/**
	 * Tests requires & requiring relation.
	 */
	@Test
	public void requireComplexTest() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final LeafSection section2 = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final Actor actor2 = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		final UserTask task = RequirementFactory.eINSTANCE.createUserTask();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProjectSpace().getOperations().clear();

				getProject().addModelElement(section);
				getProject().addModelElement(section2);
				getProject().addModelElement(actor);
				getProject().addModelElement(actor2);
				getProject().addModelElement(useCase);
				getProject().addModelElement(task);

				section.getModelElements().add(actor);
				actor.setName("actor");
				section.setName("section");
				section2.setLeafSection(section);
				section2.getModelElements().add(actor2);
				section2.getModelElements().add(actor);
				task.setInitiatingActor(actor);
				useCase.getParticipatingActors().add(actor);
				useCase.getParticipatingActors().add(actor2);
				useCase.getParticipatingActors().move(1, actor);
				getProject().deleteModelElement(section);
			}
		}.run(false);
		List<AbstractOperation> ops = getProjectSpace().getLocalOperations().getOperations();

		// ops lineup
		AbstractOperation createSection = ops.get(0);
		AbstractOperation createSection2 = ops.get(1);
		AbstractOperation createActor = ops.get(2);
		AbstractOperation createActor2 = ops.get(3);
		AbstractOperation createUseCase = ops.get(4);
		AbstractOperation createTask = ops.get(5);
		AbstractOperation addActor = ops.get(6);
		AbstractOperation nameActor = ops.get(7);
		AbstractOperation nameSection = ops.get(8);
		AbstractOperation addSection2 = ops.get(9);
		AbstractOperation addActor2 = ops.get(10);
		AbstractOperation relocateActor = ops.get(11);
		AbstractOperation taskActor = ops.get(12);
		AbstractOperation caseActor = ops.get(13);
		AbstractOperation caseActor2 = ops.get(14);
		AbstractOperation moveActor = ops.get(15);
		AbstractOperation deleteSection = ops.get(16);

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());

		assertEquals(0, cd.getRequired(ops, createSection).size());
		assertEquals(5, cd.getRequiring(ops, createSection).size());
		assertSame(cd.getRequiring(ops, createSection).get(0), addActor);
		assertSame(cd.getRequiring(ops, createSection).get(1), nameSection);
		assertSame(cd.getRequiring(ops, createSection).get(2), addSection2);
		assertSame(cd.getRequiring(ops, createSection).get(3), relocateActor);
		assertSame(cd.getRequiring(ops, createSection).get(4), deleteSection);

		assertEquals(0, cd.getRequired(ops, createSection2).size());
		assertEquals(3, cd.getRequiring(ops, createSection2).size());
		assertSame(cd.getRequiring(ops, createSection2).get(0), addSection2);
		assertSame(cd.getRequiring(ops, createSection2).get(1), addActor2);
		assertSame(cd.getRequiring(ops, createSection2).get(2), relocateActor);

		assertEquals(0, cd.getRequired(ops, createActor).size());
		assertEquals(6, cd.getRequiring(ops, createActor).size());
		assertSame(cd.getRequiring(ops, createActor).get(0), addActor);
		assertSame(cd.getRequiring(ops, createActor).get(1), nameActor);
		assertSame(cd.getRequiring(ops, createActor).get(2), relocateActor);
		assertSame(cd.getRequiring(ops, createActor).get(3), taskActor);
		assertSame(cd.getRequiring(ops, createActor).get(4), caseActor);
		assertSame(cd.getRequiring(ops, createActor).get(5), moveActor);

		assertEquals(0, cd.getRequired(ops, createActor2).size());
		assertEquals(2, cd.getRequiring(ops, createActor2).size());
		assertSame(cd.getRequiring(ops, createActor2).get(0), addActor2);
		assertSame(cd.getRequiring(ops, createActor2).get(1), caseActor2);

		assertEquals(0, cd.getRequired(ops, createUseCase).size());
		assertEquals(3, cd.getRequiring(ops, createUseCase).size());
		assertSame(cd.getRequiring(ops, createUseCase).get(0), caseActor);
		assertSame(cd.getRequiring(ops, createUseCase).get(1), caseActor2);
		assertSame(cd.getRequiring(ops, createUseCase).get(2), moveActor);

		assertEquals(0, cd.getRequired(ops, createTask).size());
		assertEquals(1, cd.getRequiring(ops, createTask).size());
		assertSame(cd.getRequiring(ops, createTask).get(0), taskActor);

		assertEquals(2, cd.getRequired(ops, addActor).size());
		assertSame(cd.getRequired(ops, addActor).get(0), createSection);
		assertSame(cd.getRequired(ops, addActor).get(1), createActor);
		assertEquals(0, cd.getRequiring(ops, addActor).size());

		assertEquals(1, cd.getRequired(ops, nameActor).size());
		assertSame(cd.getRequired(ops, nameActor).get(0), createActor);
		assertEquals(0, cd.getRequiring(ops, nameActor).size());

		assertEquals(1, cd.getRequired(ops, nameSection).size());
		assertSame(cd.getRequired(ops, nameSection).get(0), createSection);
		assertEquals(0, cd.getRequiring(ops, nameSection).size());

		assertEquals(2, cd.getRequired(ops, addSection2).size());
		assertSame(cd.getRequired(ops, addSection2).get(0), createSection);
		assertSame(cd.getRequired(ops, addSection2).get(1), createSection2);
		assertEquals(0, cd.getRequiring(ops, addSection2).size());

		assertEquals(2, cd.getRequired(ops, addActor2).size());
		assertSame(cd.getRequired(ops, addActor2).get(0), createSection2);
		assertSame(cd.getRequired(ops, addActor2).get(1), createActor2);
		assertEquals(0, cd.getRequiring(ops, addActor2).size());

		assertEquals(3, cd.getRequired(ops, relocateActor).size());
		// note, section create is required, because the relocation goes from
		// section to section2, and the remove from section requires the
		// create, as per specification
		assertSame(cd.getRequired(ops, relocateActor).get(0), createSection);
		assertSame(cd.getRequired(ops, relocateActor).get(1), createSection2);
		assertSame(cd.getRequired(ops, relocateActor).get(2), createActor);
		assertEquals(0, cd.getRequiring(ops, relocateActor).size());

		assertEquals(2, cd.getRequired(ops, taskActor).size());
		assertSame(cd.getRequired(ops, taskActor).get(0), createActor);
		assertSame(cd.getRequired(ops, taskActor).get(1), createTask);
		assertEquals(0, cd.getRequiring(ops, taskActor).size());

		assertEquals(2, cd.getRequired(ops, caseActor).size());
		assertSame(cd.getRequired(ops, caseActor).get(0), createActor);
		assertSame(cd.getRequired(ops, caseActor).get(1), createUseCase);
		assertEquals(1, cd.getRequiring(ops, caseActor).size());
		assertSame(cd.getRequiring(ops, caseActor).get(0), moveActor);

		assertEquals(2, cd.getRequired(ops, caseActor2).size());
		assertSame(cd.getRequired(ops, caseActor2).get(0), createActor2);
		assertSame(cd.getRequired(ops, caseActor2).get(1), createUseCase);
		assertEquals(0, cd.getRequiring(ops, caseActor2).size());

		assertEquals(3, cd.getRequired(ops, moveActor).size());
		assertSame(cd.getRequired(ops, moveActor).get(0), createActor);
		assertSame(cd.getRequired(ops, moveActor).get(1), createUseCase);
		assertSame(cd.getRequired(ops, moveActor).get(2), caseActor);
		assertEquals(0, cd.getRequiring(ops, moveActor).size());

		assertEquals(1, cd.getRequired(ops, deleteSection).size());
		assertSame(cd.getRequired(ops, deleteSection).get(0), createSection);
		assertEquals(0, cd.getRequiring(ops, deleteSection).size());
	}
	// END COMPLEX CODE

}
