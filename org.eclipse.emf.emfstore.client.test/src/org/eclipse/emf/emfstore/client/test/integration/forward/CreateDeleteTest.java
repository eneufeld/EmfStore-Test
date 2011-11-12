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

public class CreateDeleteTest extends IntegrationTest {

	private long randomSeed = 1;

	/**
	 * create a random ME and change one of its attributes.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void createAndChangeAttributeTest() throws SerializationException, EmfStoreException {
		System.out.println("CreateAndChangeAttributeTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {

				testHelper.doCreateAndChangeAttribute();

			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper
			.areEqual(getTestProject(), getCompareProject(), "CreateAndChangeAttributeTest"));

	}

	/**
	 * Create a random ME and change one of its attributes, then changes one of its references, then changes one of its
	 * attributes, and again changes one of its references.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	// @Test
	public void createAndMultipleChangeTest() throws SerializationException, EmfStoreException {
		System.out.println("CreateAndMultipleChangeTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {

				testHelper.doCreateAndMultipleChange();

			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(), "CreateAndMultipleChangeTest"));

	}

	/**
	 * Create a random ME and change one of its references.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void createAndChangeRefTest() throws SerializationException, EmfStoreException {
		System.out.println("CreateAndChangeRefTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {

				testHelper.doCreateAndChangeRef();

			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(), "CreateAndChangeRefTest"));

	}

	/**
	 * Create a random ME. Change one of its non-containment references. Delete ME.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void createChangeRefDeleteTest() throws SerializationException, EmfStoreException {
		System.out.println("CreateChangeRefDeleteTest");
		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doCreateChangeRefDelete();
			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(), "CreateChangeRefDeleteTest"));

	}

	/**
	 * Create a random ME. Delete ME.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void createDeleteTest() throws SerializationException, EmfStoreException {
		System.out.println("CreateDeleteTest");
		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doCreateDelete();
			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(), "CreateDeleteTest"));

	}

	/**
	 * Delete a random ME. Revert delete.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void deleteAndRevertDeleteTest() throws SerializationException, EmfStoreException {
		System.out.println("DeleteAndRevertDeleteTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				testHelper.doDeleteAndRevert();
			}
		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(), "DeleteAndRevertDeleteTest"));
	}

	/**
	 * Delete a random ME.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void deleteTest() throws SerializationException, EmfStoreException {

		System.out.println("DeleteTest");
		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doDelete();

			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(), "DeleteTest"));

	}

}
