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
public class ReferenceTest extends IntegrationTest {

	private long randomSeed = 1;

	/**
	 * Takes a random ME (meA). Takes randomly one of its containment references. Creates a new ME matching containment
	 * reference type (meB). Adds created meB to meA's containment reference.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void containmentReferenceAddNewTest() throws SerializationException, EmfStoreException {
		System.out.println("ContainmentReferenceAddNewTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				testHelper.doContainemntReferenceAddNew();

			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(),
			"ContainmentReferenceAddNewTest"));

	}

	/**
	 * This takes a random model element (meA). Takes one of its containments (meToMove). Takes containing reference of
	 * meToMove. Finds another ME of type meA (meB). Moves meToMove to meB. Finds yet another ME of type meA (meC) .
	 * Moves meToMove to meC.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	// @Test
	public void containmentRefTransitiveChangeTest() throws SerializationException, EmfStoreException {
		System.out.println("ContainmentRefTransitiveChangeTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doContainmentRefTransitiveChange();
			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(),
			"ContainmentRefTransitiveChangeTest"));

	}

	/**
	 * This move an element in a many reference list to another position.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void multiReferenceMoveTest() throws SerializationException, EmfStoreException {
		System.out.println("MultiReferenceMoveTest");
		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				testHelper.doMultiReferenceMove();
			}
		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(), "MultiReferenceMoveTest"));

	}

	/**
	 * Select a random ME (meA). Select one of its non-containment references. Find an ME matching reference type (meB).
	 * Add meB to meA.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void nonContainmentReferenceAddTest() throws SerializationException, EmfStoreException {
		System.out.println("NonContainmentReferenceAddTest");
		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doNonContainmentReferenceAdd();
			}

		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(),
			"NonContainmentReferenceAddTest"));
	}

	/**
	 * Removes a referenced model element form a non-containment reference of a randomly selected ME.
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void nonContainmentReferenceRemoveTest() throws SerializationException, EmfStoreException {
		System.out.println("NonContainmentReferenceRemoveTest");

		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doNonContainmentReferenceRemove();
			}
		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper.areEqual(getTestProject(), getCompareProject(),
			"NonContainmentReferenceRemoveTest"));

	}

	/**
	 * Takes a random ME (meA). Takes randomly one of its containment references. Finds an existing ME in project
	 * matching the reference type (meB). Adds meB to this reference of meA (moves meB from its old parent to meA).
	 * 
	 * @throws EmfStoreException EmfStoreException
	 * @throws SerializationException SerializationException
	 */
	@Test
	public void containmentReferenceMoveTest() throws SerializationException, EmfStoreException {
		System.out.println("ContainmentReferenceMoveTest");
		final IntegrationTestHelper testHelper = new IntegrationTestHelper(randomSeed, getTestProject());
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testHelper.doContainmentReferenceMove();
			}
		}.run(false);

		commitChanges();
		assertTrue(IntegrationTestHelper
			.areEqual(getTestProject(), getCompareProject(), "ContainmentReferenceMoveTest"));

	}

}
