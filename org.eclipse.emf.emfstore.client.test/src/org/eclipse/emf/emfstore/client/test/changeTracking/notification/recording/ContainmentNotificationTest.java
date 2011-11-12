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
import org.eclipse.emf.emfstore.client.test.model.document.DocumentFactory;
import org.eclipse.emf.emfstore.client.test.model.document.LeafSection;
import org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.junit.Test;

/**
 * Tests the notification recording for attribute features.
 * 
 * @author chodnick
 */
public class ContainmentNotificationTest extends NotificationTest {

	/**
	 * Change order within a list and check the generated notification.
	 */
	@Test
	public void moveOnSameFeature() {

		final LeafSection section1 = DocumentFactory.eINSTANCE.createLeafSection();
		final LeafSection section2 = DocumentFactory.eINSTANCE.createLeafSection();
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section1);
				getProject().addModelElement(section2);
				getProject().addModelElement(useCase);

				useCase.setName("testUseCase");
				section1.getModelElements().add(useCase);

				// reattach usecase to another leaf section
				// section2.getModelElements().add(useCase);
				useCase.setLeafSection(section2);
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// exactly one SET notification is expected, resetting the leaf section
		// and one ADD
		assertEquals(3, rec.size());

		NotificationInfo n = rec.get(0);
		assertSame(section1, n.getNotifier());
		assertTrue(n.isRemoveEvent());
		assertSame(n.getOldValue(), useCase);
		assertEquals(n.getReference().getName(), "modelElements");

		n = rec.get(1);
		assertSame(section2, n.getNotifier());
		assertTrue(n.isReferenceNotification());
		assertTrue(n.isAddEvent());
		assertSame(n.getNewValue(), useCase);
		assertEquals(n.getReference().getName(), "modelElements");

		n = rec.get(2);
		assertSame(useCase, n.getNotifier());
		assertTrue(n.isSetEvent());
		assertEquals(n.getOldValue(), section1);
		assertEquals(n.getNewValue(), section2);
		assertEquals(n.getReference().getName(), "leafSection");

	}

	/**
	 * Change order within a list and check the generated notification.
	 */
	@Test
	public void moveOnDifferentFeatures() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final FunctionalRequirement req = RequirementFactory.eINSTANCE.createFunctionalRequirement();
		final FunctionalRequirement child = RequirementFactory.eINSTANCE.createFunctionalRequirement();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				getProject().addModelElement(req);
				getProject().addModelElement(child);

				section.getModelElements().add(child);

				// reattach child to a functional requirement
				// req.getRefiningRequirements().add(child);
				child.setRefinedRequirement(req);
			}
		}.run(false);

		NotificationRecording recording = getProjectSpaceImpl().getNotificationRecorder().getRecording();
		List<NotificationInfo> rec = recording.asMutableList();

		// one REMOVE and two SET notification are expected, resetting the leaf section to "null" and the refined req to
		// "req"
		assertEquals(4, rec.size());

		// check index maintaining remove
		NotificationInfo n0 = rec.get(0);
		assertSame(section, n0.getNotifier());
		assertTrue(n0.isRemoveEvent());
		assertEquals(n0.getReference().getName(), "modelElements");
		assertSame(child, n0.getOldValue());
		assertEquals(0, n0.getPosition());

		NotificationInfo n1 = rec.get(1);
		assertSame(req, n1.getNotifier());
		assertTrue(n1.isReferenceNotification());
		assertTrue(n1.isAddEvent());
		assertSame(n1.getNewValue(), child);
		assertEquals(n1.getReference().getName(), "refiningRequirements");

		// check first set
		NotificationInfo n2 = rec.get(2);
		assertSame(child, n2.getNotifier());
		assertTrue(n2.isSetEvent());
		assertEquals(n2.getReference().getName(), "leafSection");
		assertEquals(n2.getOldValue(), section);
		assertEquals(n2.getNewValue(), null);

		// check second set
		NotificationInfo n3 = rec.get(3);
		assertSame(child, n3.getNotifier());
		assertTrue(n3.isSetEvent());
		assertEquals(n3.getReference().getName(), "refinedRequirement");
		assertEquals(n3.getOldValue(), null);
		assertEquals(n3.getNewValue(), req);

	}

}
