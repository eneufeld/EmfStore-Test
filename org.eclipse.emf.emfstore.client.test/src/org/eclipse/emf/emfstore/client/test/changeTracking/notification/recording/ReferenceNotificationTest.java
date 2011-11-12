/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.notification.recording;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.eclipse.emf.emfstore.client.model.changeTracking.notification.NotificationInfo;
import org.eclipse.emf.emfstore.client.model.changeTracking.notification.recording.NotificationRecording;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests the notification recording for attribute features.
 * 
 * @author chodnick
 */
public class ReferenceNotificationTest extends NotificationTest {

	/**
	 * Change an reference and check the generated notification.
	 */
	@Test
	public void changeReference1toN() {
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {

			@Override
			protected void doRun() {

				getProject().addModelElement(useCase);
				getProject().addModelElement(actor);

				actor.setName("testActor");
				useCase.setName("testUseCase");

				// notifications from this operations are tested
				useCase.setInitiatingActor(actor);
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly one SET notification is expected with attribute feature "initiatingActor" on our useCase and
		// newValue
		// actor

		// due to refactoring and removing the bidirectional filter two notifications are expected.
		assertEquals(2, rec.size());

		NotificationInfo addNotification = rec.get(0);
		NotificationInfo setNotification = rec.get(1);

		assertSame(actor, addNotification.getNotifier());
		assertTrue(addNotification.isReferenceNotification());
		assertTrue(addNotification.isAddEvent());
		assertSame(addNotification.getNewValue(), useCase);
		assertEquals(addNotification.getReference().getName(), "initiatedUseCases");
		assertNull(addNotification.getOldValue());

		assertSame(useCase, setNotification.getNotifier());
		assertTrue(setNotification.isReferenceNotification());
		assertTrue(setNotification.isSetEvent());
		assertSame(setNotification.getNewValue(), actor);
		assertEquals(setNotification.getReference().getName(), "initiatingActor");
		assertNull(setNotification.getOldValue());

	}

	/**
	 * Change an reference and check the generated notification.
	 */
	@Ignore
	public void changeReference1to1() {
		fail("FIXME: MK where do we have 1:1 non-containment references?");
	}

	/**
	 * Add an reference and check the generated notification.
	 */

	@Test
	public void addReferenceNto1() {

		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				getProject().addModelElement(actor);

				actor.setName("testActor");
				useCase.setName("testUseCase");

				// notifications from this operations are tested
				actor.getInitiatedUseCases().add(useCase);

			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly one ADD notification is expected
		// after refactoring: additional SET is expected
		assertEquals(2, rec.size());

		NotificationInfo setNotification = rec.get(0);
		NotificationInfo addNotification = rec.get(1);

		assertSame(useCase, setNotification.getNotifier());
		assertTrue(setNotification.isReferenceNotification());
		assertTrue(setNotification.isSetEvent());
		assertSame(setNotification.getNewValue(), actor);
		assertEquals(setNotification.getReference().getName(), "initiatingActor");
		assertNull(setNotification.getOldValue());

		assertSame(actor, addNotification.getNotifier());
		assertTrue(addNotification.isReferenceNotification());
		assertTrue(addNotification.isAddEvent());
		assertSame(addNotification.getNewValue(), useCase);
		assertEquals(addNotification.getReference().getName(), "initiatedUseCases");

	}

	/**
	 * Add a reference and check the generated notification.
	 */

	@Test
	public void addReferenceNtoN() {

		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				getProject().addModelElement(actor);

				actor.setName("testActor");
				useCase.setName("testUseCase");

				// notifications from this operations are tested
				useCase.getParticipatingActors().add(actor);
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly two ADD notification is expected
		assertEquals(2, rec.size());

		NotificationInfo actorAdd = rec.get(0);
		NotificationInfo useCaseAdd = rec.get(1);

		assertSame(actor, actorAdd.getNotifier());
		assertTrue(actorAdd.isReferenceNotification());
		assertTrue(actorAdd.isAddEvent());
		assertSame(actorAdd.getNewValue(), useCase);
		assertEquals(actorAdd.getReference().getName(), "participatedUseCases");

		assertSame(useCase, useCaseAdd.getNotifier());
		assertTrue(useCaseAdd.isReferenceNotification());
		assertTrue(useCaseAdd.isAddEvent());
		assertSame(useCaseAdd.getNewValue(), actor);
		assertEquals(useCaseAdd.getReference().getName(), "participatingActors");

	}

	/**
	 * Remove a reference and check the generated notification.
	 */

	@Test
	public void removeReferenceNto1() {

		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				getProject().addModelElement(actor);

				actor.setName("testActor");
				useCase.setName("testUseCase");

				// notifications from this operations are tested
				actor.getInitiatedUseCases().add(useCase);
				actor.getInitiatedUseCases().remove(useCase);
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly one REMOVE notification is expected from the actor

		assertEquals(2, rec.size());

		NotificationInfo n = rec.get(0);
		assertSame(useCase, n.getNotifier());
		assertTrue(n.isReferenceNotification());
		assertTrue(n.isSetEvent());
		assertSame(n.getOldValue(), actor);
		assertSame(null, n.getNewValue());
		assertEquals(n.getReference().getName(), "initiatingActor");

		n = rec.get(1);
		assertSame(actor, n.getNotifier());
		assertTrue(n.isReferenceNotification());
		assertTrue(n.isRemoveEvent());
		assertSame(n.getOldValue(), useCase);
		assertEquals(n.getReference().getName(), "initiatedUseCases");

	}

	/**
	 * Remove a reference and check the generated notification.
	 */

	@Test
	public void removeReferenceNtoN() {

		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				getProject().addModelElement(actor);

				actor.setName("testActor");
				useCase.setName("testUseCase");

				// notifications from this operations are tested
				useCase.getParticipatingActors().add(actor);
				useCase.getParticipatingActors().remove(actor);
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly two REMOVE notifications are expected
		// actor loses its useCase (message needed to retain index of useCase)
		// useCase loses its actor (message needed to retain index of actor)
		assertEquals(2, rec.size());

		NotificationInfo n = rec.get(0);
		assertSame(actor, n.getNotifier());
		assertTrue(n.isReferenceNotification());
		assertTrue(n.isRemoveEvent());
		assertSame(n.getOldValue(), useCase);
		assertEquals(n.getReference().getName(), "participatedUseCases");
		assertEquals(n.getPosition(), 0);

		n = rec.get(1);
		assertSame(useCase, n.getNotifier());
		assertTrue(n.isReferenceNotification());
		assertTrue(n.isRemoveEvent());
		assertSame(n.getOldValue(), actor);
		assertEquals(n.getReference().getName(), "participatingActors");
		assertEquals(n.getPosition(), 0);

	}

}
