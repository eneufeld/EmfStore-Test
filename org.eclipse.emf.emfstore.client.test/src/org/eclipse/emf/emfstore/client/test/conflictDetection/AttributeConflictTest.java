/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */

package org.eclipse.emf.emfstore.client.test.conflictDetection;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.server.conflictDetection.ConflictDetectionStrategy;
import org.eclipse.emf.emfstore.server.conflictDetection.FineGrainedConflictDetectionStrategy;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AttributeOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.OperationsFactory;
import org.junit.Test;

/**
 * Test conflict detection for attributes.
 * 
 * @author koegel
 */
public class AttributeConflictTest extends ConflictDetectionTest {

	/**
	 * Test for conflicts on two attribute Operations.
	 */
	@Test
	public void testAttributeWithAttributeConflict() {
		final EObject modelElement = RequirementFactory.eINSTANCE.createActor();
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(modelElement);
			}
		}.run(false);

		String featureName = "same Feature";
		ConflictDetectionStrategy conflictDetectionStrategy = new FineGrainedConflictDetectionStrategy();

		AttributeOperation attributeOperation1 = OperationsFactory.eINSTANCE.createAttributeOperation();
		attributeOperation1.setClientDate(new Date());
		attributeOperation1.setFeatureName(featureName);
		attributeOperation1.setIdentifier("id1");
		attributeOperation1.setModelElementId(getProject().getModelElementId(modelElement));
		attributeOperation1.setOldValue("oldValue");
		attributeOperation1.setNewValue("oldeValue");

		AttributeOperation attributeOperation2 = OperationsFactory.eINSTANCE.createAttributeOperation();
		attributeOperation2.setClientDate(new Date());
		attributeOperation2.setFeatureName(featureName);
		attributeOperation2.setIdentifier("id1");
		attributeOperation2.setModelElementId(org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE
			.createModelElementId());
		attributeOperation2.setOldValue("oldValue");
		attributeOperation2.setNewValue("oldeValue");

		assertEquals(false, conflictDetectionStrategy.doConflict(attributeOperation1, attributeOperation2));

		attributeOperation2.setModelElementId(getProject().getModelElementId(modelElement));
		attributeOperation2.setFeatureName(featureName + "2");

		assertEquals(false, conflictDetectionStrategy.doConflict(attributeOperation1, attributeOperation2));

		attributeOperation2.setFeatureName(featureName);

		assertEquals(true, conflictDetectionStrategy.doConflict(attributeOperation1, attributeOperation2));
	}
}
