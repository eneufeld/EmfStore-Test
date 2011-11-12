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
import org.eclipse.emf.emfstore.client.model.exceptions.UnsupportedNotificationException;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.junit.Test;

/**
 * Tests the notification recording for attribute features.
 * 
 * @author chodnick
 */
public class AttributeNotificationTest extends NotificationTest {

	/**
	 * Change an attribute and check the generated notification.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void changeAttribute() throws UnsupportedOperationException, UnsupportedNotificationException {

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
				getProject().addModelElement(useCase);

				useCase.setName("newName");
				assertEquals("newName", useCase.getName());

				NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
				List<NotificationInfo> rec = recording.asMutableList();

				// exactly one SET notification is expected with attribute feature "name" on our useCase and newValue
				// newName
				assertEquals(1, rec.size());

				NotificationInfo n = rec.get(0);
				assertSame(useCase, n.getNotifier());
				assertTrue(n.isAttributeNotification());
				assertTrue(n.isSetEvent());
				assertEquals(n.getNewValue(), "newName");
				assertEquals(n.getAttribute().getName(), "name");
				assertEquals(n.getOldValue(), "new UseCase");
			}
		}.run(false);

	}
}
