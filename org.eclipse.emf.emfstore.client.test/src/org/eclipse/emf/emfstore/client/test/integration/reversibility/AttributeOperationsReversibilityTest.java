/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.integration.reversibility;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.integration.forward.IntegrationTestHelper;
import org.eclipse.emf.emfstore.common.model.util.SerializationException;
import org.eclipse.emf.emfstore.server.exceptions.EmfStoreException;
import org.junit.Test;

/**
 * @author Hodaie
 */
public class AttributeOperationsReversibilityTest extends OperationsReversibilityTest {

	private long randomSeed = 1;

	/**
	 * Finds an attribute with isMany = true and moves elements inside this attribute.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void multiAttributeMoveReversibilityTest() throws SerializationException, EmfStoreException {
		System.out.println("MultiAttributeMoveReversibilityTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				testHelper.doMultiAttributeMove();
				getTestProjectSpace().revert();
			}
		}.run(false);

		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(),
			"MultiAttributeMoveReversibilityTest"));

	}

	/**
	 * 1. Get a random model element form test project; 2. get randomly one of its attributes. 3. change the attribute
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void attributeChangeReversibilityTest() throws SerializationException, EmfStoreException {
		System.out.println("AttributeChangeReversibilityTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doChangeAttribute();
				getTestProjectSpace().revert();
			}

		}.run(false);

		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(),
			"AttributeChangeReversibilityTest"));

	}

	/**
	 * Change the same attribute on a randomly selected ME twice.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void attributeTransitiveChangeReversibilityTest() throws SerializationException, EmfStoreException {
		System.out.println("AttributeTransitiveChangeReversibilityTest");
		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doAttributeTransitiveChange();
				getTestProjectSpace().revert();
			}

		}.run(false);

		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(),
			"AttributeTransitiveChangeReversibilityTest"));

	}

}
