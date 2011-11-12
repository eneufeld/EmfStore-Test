/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.operations;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.model.exceptions.UnsupportedNotificationException;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.WorkspaceTest;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.common.model.ModelElementId;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiReferenceMoveOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.OperationsFactory;
import org.junit.Test;

/**
 * Tests the MultiReferenceMoveOperation.
 * 
 * @author koegel
 */
public class MultiReferenceMoveOperationTest extends WorkspaceTest {

	/**
	 * Change a multi reference and check the generated operation.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void makeMultiReferenceMove() throws UnsupportedOperationException, UnsupportedNotificationException {
		final UseCase useCase1 = RequirementFactory.eINSTANCE.createUseCase();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase3 = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				// useCase1.setIdentifier("usecase1");
				getProject().addModelElement(useCase1);
				getProject().addModelElement(actor);
				// useCase2.setIdentifier("usecase2");
				getProject().addModelElement(useCase2);
				// useCase3.setIdentifier("usecase3");
				getProject().addModelElement(useCase3);

				actor.getInitiatedUseCases().add(useCase1);
				actor.getInitiatedUseCases().add(useCase2);
				actor.getInitiatedUseCases().add(useCase3);
			}
		}.run(false);

		assertEquals(actor, useCase1.getInitiatingActor());
		assertEquals(actor, useCase2.getInitiatingActor());
		assertEquals(actor, useCase3.getInitiatingActor());
		EList<UseCase> initiatedUseCases = actor.getInitiatedUseCases();
		assertEquals(3, initiatedUseCases.size());
		assertEquals(useCase1, initiatedUseCases.get(0));
		assertEquals(useCase2, initiatedUseCases.get(1));
		assertEquals(useCase3, initiatedUseCases.get(2));

		new EMFStoreCommand() {

			@Override
			protected void doRun() {

				clearOperations();

				actor.getInitiatedUseCases().move(2, 1);
			}
		}.run(false);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof MultiReferenceMoveOperation);
		MultiReferenceMoveOperation multiReferenceMoveOperation = (MultiReferenceMoveOperation) operation;

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId useCase2Id = ModelUtil.getProject(useCase2).getModelElementId(useCase2);

		assertEquals("initiatedUseCases", multiReferenceMoveOperation.getFeatureName());
		assertEquals(actorId, multiReferenceMoveOperation.getModelElementId());
		assertEquals(2, multiReferenceMoveOperation.getNewIndex());
		assertEquals(1, multiReferenceMoveOperation.getOldIndex());
		assertEquals(useCase2Id, multiReferenceMoveOperation.getReferencedModelElementId());

		assertEquals(actor, useCase1.getInitiatingActor());
		assertEquals(actor, useCase2.getInitiatingActor());
		assertEquals(actor, useCase3.getInitiatingActor());
		assertEquals(3, initiatedUseCases.size());
		assertEquals(useCase1, initiatedUseCases.get(0));
		assertEquals(useCase2, initiatedUseCases.get(2));
		assertEquals(useCase3, initiatedUseCases.get(1));

	}

	/**
	 * Change a multi reference and check the generated operation.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void reverseMultiReferenceMove() throws UnsupportedOperationException, UnsupportedNotificationException {
		final UseCase useCase1 = RequirementFactory.eINSTANCE.createUseCase();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase3 = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				// useCase1.setIdentifier("usecase1");
				getProject().addModelElement(useCase1);
				getProject().addModelElement(actor);
				// useCase2.setIdentifier("usecase2");
				getProject().addModelElement(useCase2);
				// useCase3.setIdentifier("usecase3");
				getProject().addModelElement(useCase3);

				actor.getInitiatedUseCases().add(useCase1);
				actor.getInitiatedUseCases().add(useCase2);
				actor.getInitiatedUseCases().add(useCase3);

			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				assertEquals(actor, useCase1.getInitiatingActor());
				assertEquals(actor, useCase2.getInitiatingActor());
				assertEquals(actor, useCase3.getInitiatingActor());
				EList<UseCase> initiatedUseCases = actor.getInitiatedUseCases();
				assertEquals(3, initiatedUseCases.size());
				assertEquals(useCase1, initiatedUseCases.get(0));
				assertEquals(useCase2, initiatedUseCases.get(1));
				assertEquals(useCase3, initiatedUseCases.get(2));
				clearOperations();

				actor.getInitiatedUseCases().move(2, 1);
			}
		}.run(false);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		final AbstractOperation reverse = operation.reverse();

		assertEquals(true, reverse instanceof MultiReferenceMoveOperation);
		MultiReferenceMoveOperation multiReferenceMoveOperation = (MultiReferenceMoveOperation) reverse;

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId useCase2Id = ModelUtil.getProject(useCase2).getModelElementId(useCase2);

		assertEquals("initiatedUseCases", multiReferenceMoveOperation.getFeatureName());
		assertEquals(actorId, multiReferenceMoveOperation.getModelElementId());
		assertEquals(1, multiReferenceMoveOperation.getNewIndex());
		assertEquals(2, multiReferenceMoveOperation.getOldIndex());
		assertEquals(useCase2Id, multiReferenceMoveOperation.getReferencedModelElementId());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				reverse.apply(getProject());
			}
		}.run(false);

		EList<UseCase> initiatedUseCases = actor.getInitiatedUseCases();
		assertEquals(actor, useCase1.getInitiatingActor());
		assertEquals(actor, useCase2.getInitiatingActor());
		assertEquals(actor, useCase3.getInitiatingActor());
		assertEquals(3, initiatedUseCases.size());
		assertEquals(useCase1, initiatedUseCases.get(0));
		assertEquals(useCase2, initiatedUseCases.get(1));
		assertEquals(useCase3, initiatedUseCases.get(2));

	}

	/**
	 * Tests a false index while moving.
	 */
	@Test
	public void makeOutOfBoundMove() {
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase1 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase3 = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(actor);
				// useCase1.setIdentifier("usecase1");
				getProject().addModelElement(useCase1);
				// useCase2.setIdentifier("usecase2");
				getProject().addModelElement(useCase2);
				// useCase3.setIdentifier("usecase3");
				getProject().addModelElement(useCase3);

				actor.getInitiatedUseCases().add(useCase1);
				actor.getInitiatedUseCases().add(useCase2);
				actor.getInitiatedUseCases().add(useCase3);
			}
		}.run(false);

		assertEquals(actor, useCase1.getInitiatingActor());
		assertEquals(actor, useCase2.getInitiatingActor());
		assertEquals(actor, useCase3.getInitiatingActor());
		EList<UseCase> initiatedUseCases = actor.getInitiatedUseCases();
		assertEquals(3, initiatedUseCases.size());
		assertEquals(useCase1, initiatedUseCases.get(0));
		assertEquals(useCase2, initiatedUseCases.get(1));
		assertEquals(useCase3, initiatedUseCases.get(2));

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				clearOperations();
			}
		}.run(false);

		final MultiReferenceMoveOperation multiReferenceMoveOperation = OperationsFactory.eINSTANCE
			.createMultiReferenceMoveOperation();

		ModelElementId actorId = ModelUtil.getProject(actor).getModelElementId(actor);
		ModelElementId useCase1Id = ModelUtil.getProject(useCase1).getModelElementId(useCase1);

		multiReferenceMoveOperation.setModelElementId(actorId);
		multiReferenceMoveOperation.setFeatureName(RequirementPackage.eINSTANCE.getActor_InitiatedUseCases().getName());
		multiReferenceMoveOperation.setReferencedModelElementId(useCase1Id);
		multiReferenceMoveOperation.setOldIndex(0);
		multiReferenceMoveOperation.setNewIndex(3);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				multiReferenceMoveOperation.apply(getProject());

				assertEquals(actor, useCase1.getInitiatingActor());
				assertEquals(actor, useCase2.getInitiatingActor());
				assertEquals(actor, useCase3.getInitiatingActor());
				List<UseCase> initiatedUseCases2 = actor.getInitiatedUseCases();
				assertEquals(3, initiatedUseCases2.size());
				assertEquals(useCase1, initiatedUseCases2.get(0));
				assertEquals(useCase2, initiatedUseCases2.get(1));
				assertEquals(useCase3, initiatedUseCases2.get(2));

				clearOperations();
			}
		}.run(false);

		final MultiReferenceMoveOperation multiReferenceMoveOperation2 = OperationsFactory.eINSTANCE
			.createMultiReferenceMoveOperation();
		multiReferenceMoveOperation2.setModelElementId(actorId);
		multiReferenceMoveOperation2
			.setFeatureName(RequirementPackage.eINSTANCE.getActor_InitiatedUseCases().getName());
		multiReferenceMoveOperation2.setReferencedModelElementId(useCase1Id);
		multiReferenceMoveOperation2.setOldIndex(0);
		multiReferenceMoveOperation2.setNewIndex(-1);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				multiReferenceMoveOperation2.apply(getProject());
			}
		};

		assertEquals(actor, useCase1.getInitiatingActor());
		assertEquals(actor, useCase2.getInitiatingActor());
		assertEquals(actor, useCase3.getInitiatingActor());
		List<UseCase> initiatedUseCases3 = actor.getInitiatedUseCases();
		assertEquals(3, initiatedUseCases3.size());
		assertEquals(useCase1, initiatedUseCases3.get(0));
		assertEquals(useCase2, initiatedUseCases3.get(1));
		assertEquals(useCase3, initiatedUseCases3.get(2));

		final UseCase useCase4 = RequirementFactory.eINSTANCE.createUseCase();
		// useCase4.setIdentifier("usecase4");
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase4);
				clearOperations();
			}
		}.run();

		final MultiReferenceMoveOperation multiReferenceMoveOperation3 = OperationsFactory.eINSTANCE
			.createMultiReferenceMoveOperation();
		multiReferenceMoveOperation3.setModelElementId(actorId);
		multiReferenceMoveOperation3
			.setFeatureName(RequirementPackage.eINSTANCE.getActor_InitiatedUseCases().getName());

		ModelElementId useCase4Id = ModelUtil.getProject(useCase4).getModelElementId(useCase4);

		multiReferenceMoveOperation3.setReferencedModelElementId(useCase4Id);
		multiReferenceMoveOperation3.setOldIndex(0);
		multiReferenceMoveOperation3.setNewIndex(2);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				multiReferenceMoveOperation3.apply(getProject());
			}
		};

		assertEquals(actor, useCase1.getInitiatingActor());
		assertEquals(actor, useCase2.getInitiatingActor());
		assertEquals(actor, useCase3.getInitiatingActor());
		assertEquals(null, useCase4.getInitiatingActor());
		List<UseCase> initiatedUseCases4 = actor.getInitiatedUseCases();
		assertEquals(3, initiatedUseCases4.size());
		assertEquals(useCase1, initiatedUseCases4.get(0));
		assertEquals(useCase2, initiatedUseCases4.get(1));
		assertEquals(useCase3, initiatedUseCases4.get(2));
	}
}
