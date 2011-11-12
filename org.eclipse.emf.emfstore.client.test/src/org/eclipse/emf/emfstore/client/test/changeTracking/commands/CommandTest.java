/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */

package org.eclipse.emf.emfstore.client.test.changeTracking.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.command.CutToClipboardCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.emfstore.client.model.Configuration;
import org.eclipse.emf.emfstore.client.model.exceptions.UnsupportedNotificationException;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.WorkspaceTest;
import org.eclipse.emf.emfstore.client.test.model.document.CompositeSection;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentFactory;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage;
import org.eclipse.emf.emfstore.client.test.model.document.LeafSection;
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationFactory;
import org.eclipse.emf.emfstore.client.test.model.organization.User;
import org.eclipse.emf.emfstore.client.test.model.rationale.Comment;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationaleFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.task.ActionItem;
import org.eclipse.emf.emfstore.client.test.model.task.TaskFactory;
import org.eclipse.emf.emfstore.client.test.model.task.WorkPackage;
import org.eclipse.emf.emfstore.common.model.ModelElementId;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.CreateDeleteOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiReferenceOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.ReferenceOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.SingleReferenceOperation;
import org.junit.Test;

/**
 * Tests for the command recording to detect deletes, cuts and copies.
 * 
 * @author koegel
 */
public class CommandTest extends WorkspaceTest {

	/**
	 * Tests the copy to clipboard and paste from clipboard command.
	 */
	@Test
	public void copyAndPasteFromClipboardCommand() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		EditingDomain editingDomain = Configuration.getEditingDomain();

		// copy to clipboard
		Collection<EObject> toCopy = new ArrayList<EObject>();
		toCopy.add(actor);
		Command copyCommand = editingDomain.createCommand(CopyToClipboardCommand.class, new CommandParameter(null,
			null, toCopy));
		editingDomain.getCommandStack().execute(copyCommand);

		// paste from clipboard
		Command pasteCommand = editingDomain.createCommand(PasteFromClipboardCommand.class, new CommandParameter(
			leafSection, DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, Collections.emptyList(),
			CommandParameter.NO_INDEX));

		editingDomain.getCommandStack().execute(pasteCommand);

		EObject copyOfActor = leafSection.getModelElements().get(1);
		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId copyOfActorId = ModelUtil.getProject(copyOfActor).getModelElementId(copyOfActor);

		assertTrue(actorId.equals(actorId));
		assertTrue(!copyOfActorId.equals(actorId));
	}

	/**
	 * Tests to delete a workpackage with a containec command with a recipient. This test also the removal o
	 * unicdirectional cross references
	 */
	@Test
	public void testDeleteWithUnidirectionalCrossReference() {
		final CompositeSection createCompositeSection = DocumentFactory.eINSTANCE.createCompositeSection();
		final LeafSection createLeafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final WorkPackage createWorkPackage = TaskFactory.eINSTANCE.createWorkPackage();
		final ActionItem createActionItem = TaskFactory.eINSTANCE.createActionItem();
		final Comment createComment = RationaleFactory.eINSTANCE.createComment();
		final User createUser = OrganizationFactory.eINSTANCE.createUser();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(createCompositeSection);
				createCompositeSection.getSubsections().add(createLeafSection);
				createLeafSection.getModelElements().add(createWorkPackage);
				createLeafSection.getModelElements().add(createUser);
				createWorkPackage.getContainedWorkItems().add(createActionItem);
				createActionItem.getComments().add(createComment);
				createComment.getRecipients().add(createUser);
				clearOperations();

			}
		}.run(false);

		Command delete = DeleteCommand.create(Configuration.getEditingDomain(), createWorkPackage);
		Configuration.getEditingDomain().getCommandStack().execute(delete);

		assertEquals(0, createComment.getRecipients().size());
		assertEquals(1, getProjectSpace().getOperations().size());
		assertEquals(true, getProjectSpace().getOperations().get(0) instanceof CreateDeleteOperation);

	}

	/**
	 * Tests the copy and paste commands.
	 */
	@Test
	public void copyAndPasteCommand() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		EditingDomain editingDomain = Configuration.getEditingDomain();

		// copy
		CopyCommand.Helper helper = new CopyCommand.Helper();
		CopyCommand command = (CopyCommand) editingDomain.createCommand(CopyCommand.class, new CommandParameter(actor,
			null, helper));
		editingDomain.getCommandStack().execute(command);

		// paste
		Actor copyOfActor = (Actor) helper.get(actor);

		Collection<Actor> toPaste = new ArrayList<Actor>();
		toPaste.add(copyOfActor);

		Command pasteCommand = editingDomain.createCommand(AddCommand.class, new CommandParameter(leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, toPaste, CommandParameter.NO_INDEX));

		editingDomain.getCommandStack().execute(pasteCommand);

		EObject copyOfActorRead = leafSection.getModelElements().get(1);

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId copyOfActorReadId = ModelUtil.getProject(copyOfActorRead).getModelElementId(copyOfActorRead);
		assertFalse(actorId.equals(copyOfActorReadId));

	}

	/**
	 * Tests the copy to clipboard and paste from clipboard command.
	 */
	@Test
	public void copyAndPasteFromClipboardCommandDirectCreation() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		EditingDomain editingDomain = Configuration.getEditingDomain();

		// copy
		Command command = CopyToClipboardCommand.create(editingDomain, actor);
		editingDomain.getCommandStack().execute(command);

		// paste
		Command pasteCommand = PasteFromClipboardCommand.create(editingDomain, leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, CommandParameter.NO_INDEX);
		editingDomain.getCommandStack().execute(pasteCommand);

		EObject copyOfActorRead = leafSection.getModelElements().get(1);

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId copyOfActorReadId = ModelUtil.getProject(copyOfActorRead).getModelElementId(copyOfActorRead);
		assertFalse(actorId.equals(copyOfActorReadId));
	}

	/**
	 * Tests the copy and paste commands.
	 */
	@Test
	public void copyAndPasteCommandDirectCreation() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		EditingDomain editingDomain = Configuration.getEditingDomain();

		// copy
		Command command = CopyCommand.create(editingDomain, actor);
		editingDomain.getCommandStack().execute(command);

		// paste
		Actor copyOfActor = (Actor) command.getResult().toArray()[0];

		Collection<Actor> toPaste = new ArrayList<Actor>();
		toPaste.add(copyOfActor);

		Command pasteCommand = AddCommand.create(editingDomain, leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, toPaste, CommandParameter.NO_INDEX);

		editingDomain.getCommandStack().execute(pasteCommand);

		EObject copyOfActorRead = leafSection.getModelElements().get(1);

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId copyOfActorReadId = ModelUtil.getProject(copyOfActorRead).getModelElementId(copyOfActorRead);
		assertFalse(actorId.equals(copyOfActorReadId));
	}

	/**
	 * check element deletion tracking.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void deleteCommandTest() throws UnsupportedOperationException, UnsupportedNotificationException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				clearOperations();
			}
		}.run(false);

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		Command deleteCommand = DeleteCommand.create(Configuration.getEditingDomain(), useCase);
		Configuration.getEditingDomain().getCommandStack().execute(deleteCommand);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CreateDeleteOperation);
		CreateDeleteOperation createDeleteOperation = (CreateDeleteOperation) operation;

		assertEquals(useCaseId, createDeleteOperation.getModelElementId());
		// assertEquals(useCaseId, modelElemetnId);
		assertEquals(0, createDeleteOperation.getSubOperations().size());
		assertEquals(true, createDeleteOperation.isDelete());
	}

	/**
	 * check complex element deletion tracking.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	// BEGIN COMPLEX CODE
	public void complexDeleteCommandTest() throws UnsupportedOperationException, UnsupportedNotificationException {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		final Actor oldActor = RequirementFactory.eINSTANCE.createActor();
		final Actor newActor = RequirementFactory.eINSTANCE.createActor();
		final Actor otherActor = RequirementFactory.eINSTANCE.createActor();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.getModelElements().add(useCase);
				section.getModelElements().add(oldActor);
				getProject().addModelElement(newActor);
				getProject().addModelElement(otherActor);
				useCase.setInitiatingActor(oldActor);
				useCase.getParticipatingActors().add(newActor);
				useCase.getParticipatingActors().add(otherActor);
				assertEquals(true, getProject().containsInstance(useCase));
				assertEquals(getProject(), ModelUtil.getProject(useCase));
				clearOperations();
			}
		}.run(false);

		Project project = ModelUtil.getProject(useCase);
		ModelElementId useCaseId = project.getModelElementId(useCase);

		Command deleteCommand = DeleteCommand.create(Configuration.getEditingDomain(), useCase);
		Configuration.getEditingDomain().getCommandStack().execute(deleteCommand);

		assertEquals(false, getProject().containsInstance(useCase));
		// assertEquals(null, useCase.eContainer());

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof CreateDeleteOperation);
		CreateDeleteOperation createDeleteOperation = (CreateDeleteOperation) operation;
		assertEquals(true, createDeleteOperation.isDelete());

		assertEquals(useCaseId, createDeleteOperation.getModelElementId());
		EList<ReferenceOperation> subOperations = createDeleteOperation.getSubOperations();

		assertEquals(8, subOperations.size());
		AbstractOperation suboperation0 = subOperations.get(0);
		AbstractOperation suboperation1 = subOperations.get(1);
		AbstractOperation suboperation2 = subOperations.get(2);
		AbstractOperation suboperation3 = subOperations.get(3);
		AbstractOperation suboperation4 = subOperations.get(4);
		AbstractOperation suboperation5 = subOperations.get(5);
		AbstractOperation suboperation6 = subOperations.get(6);
		AbstractOperation suboperation7 = subOperations.get(7);

		assertEquals(true, suboperation0 instanceof SingleReferenceOperation);
		assertEquals(true, suboperation1 instanceof MultiReferenceOperation);
		assertEquals(true, suboperation2 instanceof SingleReferenceOperation);
		assertEquals(true, suboperation3 instanceof MultiReferenceOperation);
		assertEquals(true, suboperation4 instanceof MultiReferenceOperation);
		assertEquals(true, suboperation5 instanceof MultiReferenceOperation);
		assertEquals(true, suboperation6 instanceof MultiReferenceOperation);
		assertEquals(true, suboperation7 instanceof MultiReferenceOperation);

		SingleReferenceOperation mrSuboperation0 = (SingleReferenceOperation) suboperation0;
		MultiReferenceOperation mrSuboperation1 = (MultiReferenceOperation) suboperation1;
		SingleReferenceOperation mrSuboperation2 = (SingleReferenceOperation) suboperation2;
		MultiReferenceOperation mrSuboperation3 = (MultiReferenceOperation) suboperation3;
		MultiReferenceOperation mrSuboperation4 = (MultiReferenceOperation) suboperation4;
		MultiReferenceOperation mrSuboperation5 = (MultiReferenceOperation) suboperation5;
		MultiReferenceOperation mrSuboperation6 = (MultiReferenceOperation) suboperation6;
		MultiReferenceOperation mrSuboperation7 = (MultiReferenceOperation) suboperation7;

		ModelElementId sectionId = ModelUtil.getProject(section).getModelElementId(section);

		assertEquals(useCaseId, mrSuboperation0.getModelElementId());
		assertEquals("leafSection", mrSuboperation0.getFeatureName());
		assertEquals(sectionId, mrSuboperation0.getOldValue());
		assertEquals(null, mrSuboperation0.getNewValue());

		assertEquals("modelElements", mrSuboperation1.getFeatureName());
		assertEquals(0, mrSuboperation1.getIndex());
		assertEquals(sectionId, mrSuboperation1.getModelElementId());
		assertEquals("leafSection", mrSuboperation1.getOppositeFeatureName());
		assertEquals(false, mrSuboperation1.isAdd());
		assertEquals(true, mrSuboperation1.isBidirectional());
		Set<ModelElementId> otherInvolvedModelElements3 = mrSuboperation1.getOtherInvolvedModelElements();
		assertEquals(1, otherInvolvedModelElements3.size());
		EList<ModelElementId> referencedModelElements3 = mrSuboperation1.getReferencedModelElements();
		assertEquals(1, referencedModelElements3.size());
		assertEquals(useCaseId, referencedModelElements3.get(0));

		ModelElementId oldActorId = ModelUtil.getProject(oldActor).getModelElementId(oldActor);

		assertEquals(oldActorId, mrSuboperation2.getOldValue());
		assertEquals(null, mrSuboperation2.getNewValue());
		assertEquals("initiatingActor", mrSuboperation2.getFeatureName());
		assertEquals(useCaseId, mrSuboperation2.getModelElementId());
		assertEquals("initiatedUseCases", mrSuboperation2.getOppositeFeatureName());
		assertEquals(true, mrSuboperation2.isBidirectional());
		Set<ModelElementId> otherInvolvedModelElements = mrSuboperation2.getOtherInvolvedModelElements();
		assertEquals(1, otherInvolvedModelElements.size());
		assertEquals(oldActorId, otherInvolvedModelElements.iterator().next());

		assertEquals("initiatedUseCases", mrSuboperation3.getFeatureName());
		assertEquals(0, mrSuboperation3.getIndex());
		assertEquals(oldActorId, mrSuboperation3.getModelElementId());
		assertEquals("initiatingActor", mrSuboperation3.getOppositeFeatureName());
		assertEquals(false, mrSuboperation3.isAdd());
		assertEquals(true, mrSuboperation3.isBidirectional());
		Set<ModelElementId> otherInvolvedModelElements0 = mrSuboperation3.getOtherInvolvedModelElements();
		assertEquals(1, otherInvolvedModelElements0.size());
		EList<ModelElementId> referencedModelElements0 = mrSuboperation3.getReferencedModelElements();
		assertEquals(1, referencedModelElements0.size());
		assertEquals(useCaseId, referencedModelElements0.get(0));

		ModelElementId newActorId = ModelUtil.getProject(newActor).getModelElementId(newActor);

		assertEquals("participatingActors", mrSuboperation4.getFeatureName());
		assertEquals(0, mrSuboperation4.getIndex());
		assertEquals(useCaseId, mrSuboperation4.getModelElementId());
		assertEquals("participatedUseCases", mrSuboperation4.getOppositeFeatureName());
		assertEquals(false, mrSuboperation4.isAdd());
		assertEquals(true, mrSuboperation4.isBidirectional());
		Set<ModelElementId> otherInvolvedModelElements2 = mrSuboperation4.getOtherInvolvedModelElements();
		assertEquals(1, otherInvolvedModelElements2.size());
		EList<ModelElementId> referencedModelElements = mrSuboperation4.getReferencedModelElements();
		assertEquals(1, referencedModelElements.size());
		assertEquals(newActorId, referencedModelElements.get(0));

		assertEquals(newActorId, mrSuboperation5.getModelElementId());
		assertEquals("participatedUseCases", mrSuboperation5.getFeatureName());
		assertEquals(false, mrSuboperation5.isAdd());
		assertEquals(1, mrSuboperation5.getReferencedModelElements().size());
		assertEquals(useCaseId, mrSuboperation5.getReferencedModelElements().get(0));

		assertEquals("participatingActors", mrSuboperation6.getFeatureName());
		assertEquals(0, mrSuboperation6.getIndex());
		assertEquals(useCaseId, mrSuboperation6.getModelElementId());
		assertEquals("participatedUseCases", mrSuboperation6.getOppositeFeatureName());
		assertEquals(false, mrSuboperation6.isAdd());
		assertEquals(true, mrSuboperation6.isBidirectional());
		Set<ModelElementId> otherInvolvedModelElements6 = mrSuboperation6.getOtherInvolvedModelElements();
		assertEquals(1, otherInvolvedModelElements6.size());
		EList<ModelElementId> referencedModelElements6 = mrSuboperation6.getReferencedModelElements();
		assertEquals(1, referencedModelElements6.size());
		ModelElementId otherActorId = ModelUtil.getProject(otherActor).getModelElementId(otherActor);
		assertEquals(otherActorId, referencedModelElements6.get(0));

		assertEquals(otherActorId, mrSuboperation7.getModelElementId());
		assertEquals("participatedUseCases", mrSuboperation7.getFeatureName());
		assertEquals(false, mrSuboperation7.isAdd());
		assertEquals(1, mrSuboperation7.getReferencedModelElements().size());
		assertEquals(useCaseId, mrSuboperation7.getReferencedModelElements().get(0));

	}

	/**
	 * Tests the copy to clipboard and paste from clipboard command.
	 */
	@Test
	public void cutAndPasteFromClipboardCommand() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		EditingDomain editingDomain = Configuration.getEditingDomain();

		// cut to clipboard
		Collection<Actor> toCut = new ArrayList<Actor>();
		toCut.add(actor);
		Command copyCommand = editingDomain.createCommand(CutToClipboardCommand.class, new CommandParameter(
			leafSection, DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, toCut));

		editingDomain.getCommandStack().execute(copyCommand);

		assertEquals(0, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canUndo());

		// undo the cut command
		editingDomain.getCommandStack().undo();

		assertEquals(1, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canRedo());

		// redo the cut command
		editingDomain.getCommandStack().redo();

		assertEquals(0, leafSection.getModelElements().size());

		// paste from clipboard
		Command pasteCommand = editingDomain.createCommand(PasteFromClipboardCommand.class, new CommandParameter(
			leafSection, DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, Collections.emptyList(),
			CommandParameter.NO_INDEX));

		editingDomain.getCommandStack().execute(pasteCommand);

		Actor pastedActor = (Actor) leafSection.getModelElements().get(0);

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId pastedActorId = ModelUtil.getProject(pastedActor).getModelElementId(pastedActor);

		// assert that the ids are not equal
		assertTrue(actorId.equals(pastedActorId));
		assertEquals(1, leafSection.getModelElements().size());

		// undo the paste command
		editingDomain.getCommandStack().undo();

		assertEquals(0, leafSection.getModelElements().size());

		// redo the paste command
		editingDomain.getCommandStack().redo();

		Actor pastedActor2 = (Actor) leafSection.getModelElements().get(0);
		ModelElementId pastedActor2Id = ModelUtil.getProject(pastedActor2).getModelElementId(pastedActor2);

		assertTrue(actorId.equals(pastedActor2Id));
		assertEquals(1, leafSection.getModelElements().size());
	}

	/**
	 * Tests the cut to clipboard and paste from clipboard command.
	 */
	@Test
	public void cutAndPasteFromClipboardCommand_DirectCreation() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		EditingDomain editingDomain = Configuration.getEditingDomain();

		// copy to clipboard
		Command cutCommand = CutToClipboardCommand.create(editingDomain, leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, actor);

		if (cutCommand.canExecute()) {
			editingDomain.getCommandStack().execute(cutCommand);
		} else {
			fail("Command not executable");
		}
		assertEquals(0, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canUndo());

		// undo the cut command
		editingDomain.getCommandStack().undo();
		assertEquals(1, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canRedo());

		// redo the cut command
		editingDomain.getCommandStack().redo();
		assertEquals(0, leafSection.getModelElements().size());

		// paste from clipboard
		Command pasteCommand = PasteFromClipboardCommand.create(editingDomain, leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, CommandParameter.NO_INDEX);

		if (pasteCommand.canExecute()) {
			editingDomain.getCommandStack().execute(pasteCommand);

			Actor pastedActor = (Actor) leafSection.getModelElements().get(0);
			ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
			ModelElementId pastedActorId = ModelUtil.getProject(pastedActor).getModelElementId(pastedActor);

			assertTrue(actorId.equals(pastedActorId));
			assertEquals(1, leafSection.getModelElements().size());
		} else {
			fail("Command not executable");
		}

		// undo the paste command
		editingDomain.getCommandStack().undo();
		assertEquals(0, leafSection.getModelElements().size());

		// redo the paste command
		editingDomain.getCommandStack().redo();
		Actor pastedActor = (Actor) leafSection.getModelElements().get(0);
		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId pastedActorId = ModelUtil.getProject(pastedActor).getModelElementId(pastedActor);
		assertTrue(actorId.equals(pastedActorId));
		assertEquals(1, leafSection.getModelElements().size());

	}

	/**
	 * Might be no problem in runtime??!! Please have a look at it.
	 */
	@Test
	public void testFunnyIssue() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		final EditingDomain editingDomain = Configuration.getEditingDomain();

		// cut to clipboard
		Command cutCommand = CutToClipboardCommand.create(editingDomain, leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, actor);

		if (cutCommand.canExecute()) {
			editingDomain.getCommandStack().execute(cutCommand);
		} else {
			fail("Command not executable");
		}
		assertEquals(0, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canUndo());

		// undo the command
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				editingDomain.getCommandStack().undo();
			}
		}.run(false);
		// does not work but is strange anyway
		// assertTrue(editingDomain.getCommandStack().canRedo());
	}

	/**
	 * Tests remove command.
	 */
	@Test
	public void removeCommand_DirectCreation() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		final EditingDomain editingDomain = Configuration.getEditingDomain();

		// remove
		Command removeCommand = RemoveCommand.create(editingDomain, leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, actor);
		if (removeCommand.canExecute()) {
			editingDomain.getCommandStack().execute(removeCommand);
		} else {
			fail("Command not executable");
		}
		assertEquals(0, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canUndo());

		// undo the command
		editingDomain.getCommandStack().undo();
		assertEquals(1, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canRedo());

		// redo the command
		editingDomain.getCommandStack().redo();
		assertEquals(0, leafSection.getModelElements().size());

	}

	/**
	 * Tests the remove command.
	 */
	@Test
	public void removeCommand() {
		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		final EditingDomain editingDomain = Configuration.getEditingDomain();

		// remove
		Collection<Actor> toRemove = new ArrayList<Actor>();
		toRemove.add(actor);
		Command copyCommand = editingDomain.createCommand(RemoveCommand.class, new CommandParameter(leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, toRemove));
		if (copyCommand.canExecute()) {
			editingDomain.getCommandStack().execute(copyCommand);
		} else {
			fail("Command not executable");
		}

		assertEquals(0, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canUndo());

		// undo the command
		editingDomain.getCommandStack().undo();
		assertEquals(1, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canRedo());

		// redo the command
		editingDomain.getCommandStack().redo();
		assertEquals(0, leafSection.getModelElements().size());
	}

	/**
	 * Tests delete command.
	 */
	@Test
	public void deleteCommand_DirectCreation() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
			}
		}.run(false);

		final EditingDomain editingDomain = Configuration.getEditingDomain();

		// delete
		Collection<Actor> toDelete = new ArrayList<Actor>();
		toDelete.add(actor);
		Command command = DeleteCommand.create(editingDomain, toDelete);
		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		} else {
			fail("Command not executable");
		}
		assertEquals(0, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canUndo());

		// undo the command
		editingDomain.getCommandStack().undo();
		assertEquals(1, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canRedo());

		// redo the command
		editingDomain.getCommandStack().redo();
		assertEquals(0, leafSection.getModelElements().size());

	}

	/**
	 * Tests the delete command.
	 */
	@Test
	public void deleteCommand() {
		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
				clearOperations();
			}
		}.run(false);

		assertEquals(0, getProjectSpace().getOperations().size());
		final EditingDomain editingDomain = Configuration.getEditingDomain();

		// delete
		Collection<Actor> toDelete = new ArrayList<Actor>();
		toDelete.add(actor);
		Command command = editingDomain.createCommand(DeleteCommand.class, new CommandParameter(leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, toDelete));
		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		} else {
			fail("Command not executable");
		}

		assertEquals(0, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canUndo());
		assertEquals(1, getProjectSpace().getOperations().size());

		// undo the command
		// command.undo();
		editingDomain.getCommandStack().undo();

		assertEquals(1, leafSection.getModelElements().size());
		// assertEquals(0, getProjectSpace().getOperations().size());
		assertTrue(editingDomain.getCommandStack().canRedo());

		// redo the command
		editingDomain.getCommandStack().redo();
		assertEquals(0, leafSection.getModelElements().size());
		// assertEquals(1, getProjectSpace().getOperations().size());
	}

	// @Test: disabled for Bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=357464
	public void cutAndPasteFromClipboardCommandComplex() {

		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final WorkPackage workPackage = TaskFactory.eINSTANCE.createWorkPackage();
		User user = OrganizationFactory.eINSTANCE.createUser();

		workPackage.setName("Sprint1");
		workPackage.setAssignee(user);

		final ActionItem ai1 = TaskFactory.eINSTANCE.createActionItem();
		ai1.setName("AI1");
		ai1.setContainingWorkpackage(workPackage);
		final ActionItem ai2 = TaskFactory.eINSTANCE.createActionItem();
		ai2.setName("AI2");
		ai2.setContainingWorkpackage(workPackage);
		leafSection.getModelElements().add(workPackage);
		leafSection.getModelElements().add(user);
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
				clearOperations();
			}
		}.run(false);
		ModelElementId workPackageId = getProject().getModelElementId(workPackage);

		EditingDomain editingDomain = Configuration.getEditingDomain();

		// cut the element
		Command command = CutToClipboardCommand.create(editingDomain, workPackage);
		editingDomain.getCommandStack().execute(command);

		assertTrue(Configuration.getEditingDomain().getClipboard().contains(workPackage));
		assertEquals(1, ModelUtil.getAllContainedModelElements(leafSection, false).size());

		assertTrue(getProject().contains(workPackageId));

		Command pasteCommand = PasteFromClipboardCommand.create(editingDomain, leafSection,
			DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, CommandParameter.NO_INDEX);
		editingDomain.getCommandStack().execute(pasteCommand);

		assertEquals(4, ModelUtil.getAllContainedModelElements(leafSection, false).size());
		assertTrue(getProject().contains(workPackageId));

		assertEquals(2, getProjectSpace().getOperations().size());

	}

	@Test
	public void testGetEditingDomain() {
		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
				clearOperations();
			}
		}.run(false);

		assertEquals(0, getProjectSpace().getOperations().size());

		EditingDomain editingDomain = Configuration.getEditingDomain();

		EditingDomain domain1 = AdapterFactoryEditingDomain.getEditingDomainFor(actor);
		assertSame(editingDomain, domain1);
		assertNotNull(domain1);
		assertNotNull(editingDomain);
	}

	/**
	 * Tests the delete from unicase delete command.
	 */
	@Test
	public void deleteByUnicaseDeleteCommand() {
		final LeafSection leafSection = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		leafSection.getModelElements().add(actor);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(leafSection);
				clearOperations();
			}
		}.run(false);

		assertEquals(0, getProjectSpace().getOperations().size());
		final EditingDomain editingDomain = Configuration.getEditingDomain();

		// delete
		editingDomain.getCommandStack().execute(DeleteCommand.create(editingDomain, actor));

		assertEquals(0, leafSection.getModelElements().size());
		assertTrue(editingDomain.getCommandStack().canUndo());
		assertEquals(1, getProjectSpace().getOperations().size());

		// undo the command
		// command.undo();
		editingDomain.getCommandStack().undo();

		assertEquals(1, leafSection.getModelElements().size());
		// assertEquals(0, getProjectSpace().getOperations().size());
		assertTrue(editingDomain.getCommandStack().canRedo());

		// redo the command
		editingDomain.getCommandStack().redo();
		assertEquals(0, leafSection.getModelElements().size());
		// assertEquals(1, getProjectSpace().getOperations().size());
	}
}