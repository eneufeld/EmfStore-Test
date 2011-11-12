/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.integration.forward;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.common.model.util.SerializationException;
import org.eclipse.emf.emfstore.server.exceptions.EmfStoreException;
import org.junit.Test;

/**
 * @author Hodaie
 */
public class AttributeTest extends IntegrationTest {

	private long randomSeed = 1;

	/**
	 * Finds an attribute with isMany = true and moves elements inside this attribute.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void multiAttributeMoveTest() throws SerializationException, EmfStoreException {
		System.out.println("MultiAttributeMoveTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				testHelper.doMultiAttributeMove();
			}
		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(), "MultiAttributeMoveTest"));

	}

	/**
	 * 1. Get a random model element form test project; 2. get randomly one of its attributes. 3. change the attribute
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void attributeChangeTest() throws SerializationException, EmfStoreException {
		System.out.println("AttributeChangeTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doChangeAttribute();
			}

		}.run(false);

		commitChanges();

		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(), "AttributeChangeTest"));

	}

	/**
	 * Change the same attribute on a randomly selected ME twice.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void attributeTransitiveChangeTest() throws SerializationException, EmfStoreException {
		System.out.println("AttributeTransitiveChangeTest");
		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doAttributeTransitiveChange();

			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(),
			"AttributeTransitiveChangeTest"));

	}

}
