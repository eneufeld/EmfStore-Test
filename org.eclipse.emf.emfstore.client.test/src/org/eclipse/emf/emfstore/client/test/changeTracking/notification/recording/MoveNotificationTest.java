/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.notification.recording;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

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
public class MoveNotificationTest extends NotificationTest {

	/**
	 * Change order within a list and check the generated notification.
	 */
	@Test
	public void changeList() {

		final Actor actor1 = RequirementFactory.eINSTANCE.createActor();
		final Actor actor2 = RequirementFactory.eINSTANCE.createActor();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				getProject().addModelElement(actor1);
				getProject().addModelElement(actor2);

				actor1.setName("testActor1");
				actor2.setName("testActor2");
				useCase.setName("testUseCase");

				// notifications from this operations are tested
				useCase.getParticipatingActors().add(actor1);
				useCase.getParticipatingActors().add(actor2);

				// now move actor 2 to top of the list
				useCase.getParticipatingActors().move(0, actor2);
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly one MOVE notification is expected
		assertEquals(1, rec.size());

		NotificationInfo n = rec.get(0);
		assertSame(useCase, n.getNotifier());
		assertTrue(n.isMoveEvent());
		assertEquals(n.getNewValue(), actor2);
		assertEquals(n.getReference().getName(), "participatingActors");

		assertEquals(n.getPosition(), 0);
		assertEquals(n.getOldValue(), 1);

	}

}
