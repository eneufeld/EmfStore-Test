/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.notification.recording;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.model.changeTracking.notification.NotificationInfo;
import org.eclipse.emf.emfstore.client.model.changeTracking.notification.recording.NotificationRecording;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.junit.Test;

/**
 * Tests the notification recording for attribute features.
 * 
 * @author chodnick
 */
public class MultiReferenceNotificationTest extends NotificationTest {

	/**
	 * Add multiple references.
	 */

	@SuppressWarnings("unchecked")
	@Test
	public void addReferences1toN() {

		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase1 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase3 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase[] useCases = { useCase1, useCase2, useCase3 };

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase1);
				getProject().addModelElement(useCase2);
				getProject().addModelElement(useCase3);
				getProject().addModelElement(actor);

				actor.setName("testActor");
				useCase1.setName("testUseCase1");
				useCase2.setName("testUseCase2");
				useCase3.setName("testUseCase3");

				// notifications from this operations are tested
				actor.getInitiatedUseCases().addAll(Arrays.asList(useCases));
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly one ADD_MANY notification is expected
		// and 3 SET
		assertEquals(4, rec.size());

		for (int i = 0; i < 3; i++) {
			NotificationInfo set = rec.get(i);

			assertSame(useCases[i], set.getNotifier());
			assertTrue(set.isReferenceNotification());
			assertTrue(set.isSetEvent());
			assertEquals(set.getNewValue(), actor);
			assertEquals(set.getReference().getName(), "initiatingActor");
		}

		NotificationInfo addMany = rec.get(3);

		assertSame(actor, addMany.getNotifier());
		assertTrue(addMany.isReferenceNotification());
		assertTrue(addMany.isAddManyEvent());
		assertEquals(((EList<UseCase>) addMany.getNewValue()).size(), 3);
		assertEquals(addMany.getReference().getName(), "initiatedUseCases");

	}

	/**
	 * Add references on a n:n relationship and check results.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void addReferencesNtoN() {

		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase1 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase3 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase[] useCases = { useCase1, useCase2, useCase3 };

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase1);
				getProject().addModelElement(useCase2);
				getProject().addModelElement(useCase3);
				getProject().addModelElement(actor);

				actor.setName("testActor");
				useCase1.setName("testUseCase1");
				useCase2.setName("testUseCase2");
				useCase3.setName("testUseCase3");

				// notifications from this operations are tested
				actor.getParticipatedUseCases().addAll(Arrays.asList(useCases));
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly one ADD_MANY notification is expected
		// and three ADD
		assertEquals(4, rec.size());

		for (int i = 0; i < 3; i++) {
			NotificationInfo set = rec.get(i);

			assertSame(useCases[i], set.getNotifier());
			assertTrue(set.isReferenceNotification());
			assertTrue(set.isAddEvent());
			assertEquals(set.getNewValue(), actor);
			assertEquals(set.getReference().getName(), "participatingActors");
		}

		NotificationInfo addMany = rec.get(3);

		assertSame(actor, addMany.getNotifier());
		assertTrue(addMany.isReferenceNotification());
		assertTrue(addMany.isAddManyEvent());
		assertEquals(((EList<UseCase>) addMany.getNewValue()).size(), 3);
		assertEquals(addMany.getReference().getName(), "participatedUseCases");

	}

	/**
	 * Remove multiple references and check the generated notification.
	 */

	@Test
	public void removeReferences1ToN() {

		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase1 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase3 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase[] useCasesIn = { useCase1, useCase2, useCase3 };
		final UseCase[] useCasesOut = { useCase1, useCase3 };

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase1);
				getProject().addModelElement(useCase2);
				getProject().addModelElement(useCase3);
				getProject().addModelElement(actor);

				actor.setName("testActor");
				useCase1.setName("testUseCase1");
				useCase2.setName("testUseCase2");
				useCase3.setName("testUseCase3");

				// notifications from this operations are tested
				actor.getInitiatedUseCases().addAll(Arrays.asList(useCasesIn));
				actor.getInitiatedUseCases().removeAll(Arrays.asList(useCasesOut));
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly one REMOVE_MANY notification is expected
		// and two SET
		assertEquals(3, rec.size());

		for (int i = 0; i < 2; i++) {
			NotificationInfo set = rec.get(i);

			assertSame(useCasesOut[i], set.getNotifier());
			assertTrue(set.isReferenceNotification());
			assertTrue(set.isSetEvent());
			assertEquals(set.getNewValue(), null);
			assertEquals(set.getOldValue(), actor);
			assertEquals(set.getReference().getName(), "initiatingActor");
		}

		NotificationInfo removeMany = rec.get(2);

		assertSame(actor, removeMany.getNotifier());
		assertTrue(removeMany.isReferenceNotification());
		assertTrue(removeMany.isRemoveManyEvent());
		assertEquals(((int[]) removeMany.getNewValue()).length, 2);
		assertEquals(removeMany.getReference().getName(), "initiatedUseCases");

	}

	/**
	 * Remove references on a n:n relationship and check results.
	 */

	@Test
	public void removeReferencesNtoN() {

		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase1 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase3 = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase[] useCasesIn = { useCase1, useCase2, useCase3 };
		final UseCase[] useCasesOut = { useCase1, useCase3 };

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase1);
				getProject().addModelElement(useCase2);
				getProject().addModelElement(useCase3);
				getProject().addModelElement(actor);

				actor.setName("testActor");
				useCase1.setName("testUseCase1");
				useCase2.setName("testUseCase2");
				useCase3.setName("testUseCase3");

				// notifications from this operations are tested
				actor.getParticipatedUseCases().addAll(Arrays.asList(useCasesIn));
				actor.getParticipatedUseCases().removeAll(Arrays.asList(useCasesOut));

			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly one REMOVE_MANY notification is expected
		// and 2 REMOVE
		assertEquals(3, rec.size());

		for (int i = 0; i < 2; i++) {
			NotificationInfo set = rec.get(i);

			assertSame(useCasesOut[i], set.getNotifier());
			assertTrue(set.isReferenceNotification());
			assertTrue(set.isRemoveEvent());
			assertEquals(set.getOldValue(), actor);
			assertEquals(set.getNewValue(), null);
			assertEquals(set.getReference().getName(), "participatingActors");
		}

		NotificationInfo removeMany = rec.get(2);

		assertSame(actor, removeMany.getNotifier());
		assertTrue(removeMany.isReferenceNotification());
		assertTrue(removeMany.isRemoveManyEvent());
		assertEquals(((int[]) removeMany.getNewValue()).length, 2);
		assertEquals(removeMany.getReference().getName(), "participatedUseCases");

	}
}
