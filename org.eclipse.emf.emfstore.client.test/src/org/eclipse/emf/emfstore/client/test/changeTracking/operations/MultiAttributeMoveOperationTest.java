/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.model.exceptions.UnsupportedNotificationException;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.WorkspaceTest;
import org.eclipse.emf.emfstore.client.test.testmodel.TestElement;
import org.eclipse.emf.emfstore.client.test.testmodel.TestmodelFactory;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.CreateDeleteOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiAttributeMoveOperation;
import org.junit.Test;

/**
 * Tests for multiattributemove operations.
 * 
 * @author wesendon
 */
public class MultiAttributeMoveOperationTest extends WorkspaceTest {

	protected TestElement testElement;

	/**
	 * Simple move element.
	 */
	@Test
	public void moveTest() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getTestElement();
				testElement.getStrings().add("first");
				testElement.getStrings().add("second");
				testElement.getStrings().add("third");

				clearOperations();

				testElement.getStrings().move(0, 2);

				assertTrue(testElement.getStrings().get(0).equals("third"));
				assertTrue(testElement.getStrings().get(1).equals("first"));
				assertTrue(testElement.getStrings().get(2).equals("second"));
			}
		}.run(false);
	}

	/**
	 * Test creation of element with cross references.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void createMultipleChildrenTestAtOnce() throws UnsupportedOperationException,
		UnsupportedNotificationException {

		final TestElement testElement1 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElement11 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElement12 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElement13 = TestmodelFactory.eINSTANCE.createTestElement();

		final TestElement testElementc11 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElementc12 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElementc13 = TestmodelFactory.eINSTANCE.createTestElement();

		final List<TestElement> list = new ArrayList<TestElement>();
		list.add(testElement11);
		list.add(testElement12);
		list.add(testElement13);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(testElement1);
				getProject().addModelElement(testElementc11);
				getProject().addModelElement(testElementc12);
				getProject().addModelElement(testElementc13);
				clearOperations();
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				testElement11.getReferences().add(testElementc11);
				testElement12.getReferences().add(testElementc11);
				testElement13.getReferences().add(testElementc11);
				testElement1.getContainedElements().addAll(list);
			}
		}.run(false);

		assertEquals(true, getProject().containsInstance(testElement1));
		assertEquals(true, getProject().containsInstance(testElement11));
		assertEquals(true, getProject().containsInstance(testElement12));
		assertEquals(true, getProject().containsInstance(testElement13));

		Assert.assertNotNull(getProject().getModelElementId(testElement1));
		Assert.assertNotNull(getProject().getModelElementId(testElement11));
		Assert.assertNotNull(getProject().getModelElementId(testElement12));
		Assert.assertNotNull(getProject().getModelElementId(testElement13));

		assertEquals(4, getProjectSpace().getOperations().size());
	}

	/**
	 * Test creation of element with cross references.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void createWithChildrenTest() throws UnsupportedOperationException, UnsupportedNotificationException {

		final TestElement testElement1 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElement11 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElement12 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElement111 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElement121 = TestmodelFactory.eINSTANCE.createTestElement();
		final TestElement testElement122 = TestmodelFactory.eINSTANCE.createTestElement();
		testElement1.getContainedElements().add(testElement11);
		testElement1.getContainedElements().add(testElement12);
		testElement11.getContainedElements().add(testElement111);
		testElement12.getContainedElements().add(testElement121);
		testElement12.getContainedElements().add(testElement122);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(testElement1);
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				assertEquals(true, getProject().containsInstance(testElement1));
				assertEquals(true, getProject().containsInstance(testElement11));
				assertEquals(true, getProject().containsInstance(testElement12));
				assertEquals(true, getProject().containsInstance(testElement111));
				assertEquals(true, getProject().containsInstance(testElement121));
				assertEquals(true, getProject().containsInstance(testElement122));

				Assert.assertNotNull(getProject().getModelElementId(testElement1));
				Assert.assertNotNull(getProject().getModelElementId(testElement11));
				Assert.assertNotNull(getProject().getModelElementId(testElement12));
				Assert.assertNotNull(getProject().getModelElementId(testElement111));
				Assert.assertNotNull(getProject().getModelElementId(testElement121));
				Assert.assertNotNull(getProject().getModelElementId(testElement122));

				assertEquals(1, getProjectSpace().getOperations().size());
				assertEquals(true, getProjectSpace().getOperations().get(0) instanceof CreateDeleteOperation);
				CreateDeleteOperation operation = (CreateDeleteOperation) getProjectSpace().getOperations().get(0);
				assertEquals(getProject().getModelElementId(testElement1), operation.getModelElementId());
				assertEquals(0, operation.getSubOperations().size());

				assertEquals(getProject().getModelElementId(testElement1),
					operation.getEObjectToIdMap().get(operation.getModelElement()));
				assertEquals(getProject().getModelElementId(testElement11),
					operation.getEObjectToIdMap().get(operation.getModelElement().eContents().get(0)));
				assertEquals(getProject().getModelElementId(testElement12),
					operation.getEObjectToIdMap().get(operation.getModelElement().eContents().get(1)));
				assertEquals(getProject().getModelElementId(testElement111),
					operation.getEObjectToIdMap()
						.get(operation.getModelElement().eContents().get(0).eContents().get(0)));
				assertEquals(getProject().getModelElementId(testElement121),
					operation.getEObjectToIdMap()
						.get(operation.getModelElement().eContents().get(1).eContents().get(0)));
				assertEquals(getProject().getModelElementId(testElement122),
					operation.getEObjectToIdMap()
						.get(operation.getModelElement().eContents().get(1).eContents().get(1)));

				CreateDeleteOperation copy = EcoreUtil.copy(operation);

				operation = (CreateDeleteOperation) operation.reverse().reverse();

				assertEquals(getProject().getModelElementId(testElement1), operation.getModelElementId());
				assertEquals(0, operation.getSubOperations().size());

				assertEquals(getProject().getModelElementId(testElement1),
					operation.getEObjectToIdMap().get(operation.getModelElement()));
				assertEquals(getProject().getModelElementId(testElement11),
					operation.getEObjectToIdMap().get(operation.getModelElement().eContents().get(0)));
				assertEquals(getProject().getModelElementId(testElement12),
					operation.getEObjectToIdMap().get(operation.getModelElement().eContents().get(1)));
				assertEquals(getProject().getModelElementId(testElement111),
					operation.getEObjectToIdMap()
						.get(operation.getModelElement().eContents().get(0).eContents().get(0)));
				assertEquals(getProject().getModelElementId(testElement121),
					operation.getEObjectToIdMap()
						.get(operation.getModelElement().eContents().get(1).eContents().get(0)));
				assertEquals(getProject().getModelElementId(testElement122),
					operation.getEObjectToIdMap()
						.get(operation.getModelElement().eContents().get(1).eContents().get(1)));

				operation = copy;
				assertEquals(getProject().getModelElementId(testElement1), operation.getModelElementId());
				assertEquals(0, operation.getSubOperations().size());

				assertEquals(getProject().getModelElementId(testElement1),
					operation.getEObjectToIdMap().get(operation.getModelElement()));
				assertEquals(getProject().getModelElementId(testElement11),
					operation.getEObjectToIdMap().get(operation.getModelElement().eContents().get(0)));
				assertEquals(getProject().getModelElementId(testElement12),
					operation.getEObjectToIdMap().get(operation.getModelElement().eContents().get(1)));
				assertEquals(getProject().getModelElementId(testElement111),
					operation.getEObjectToIdMap()
						.get(operation.getModelElement().eContents().get(0).eContents().get(0)));
				assertEquals(getProject().getModelElementId(testElement121),
					operation.getEObjectToIdMap()
						.get(operation.getModelElement().eContents().get(1).eContents().get(0)));
				assertEquals(getProject().getModelElementId(testElement122),
					operation.getEObjectToIdMap()
						.get(operation.getModelElement().eContents().get(1).eContents().get(1)));

			}
		}.run(false);

	}

	/**
	 * Move and validate operation.
	 */
	@Test
	public void moveAndOperationTest() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getTestElement();
				testElement.getStrings().add("first");
				testElement.getStrings().add("second");

				clearOperations();

				testElement.getStrings().move(0, 1);

				assertTrue(testElement.getStrings().get(0).equals("second"));
				assertTrue(testElement.getStrings().get(1).equals("first"));

			}
		}.run(false);

		assertTrue(getProjectSpace().getOperations().size() == 1);
		AbstractOperation tmp = getProjectSpace().getOperations().get(0);
		assertTrue(tmp instanceof MultiAttributeMoveOperation);
		MultiAttributeMoveOperation operation = (MultiAttributeMoveOperation) tmp;
		assertTrue(operation.getNewIndex() == 0);
		assertTrue(operation.getOldIndex() == 1);
		assertTrue(operation.getReferencedValue().equals("second"));

	}

	/**
	 * Move and reverse.
	 */
	@Test
	public void moveAndReverseTest() {
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				testElement = getTestElement();
				testElement.getStrings().add("first");
				testElement.getStrings().add("second");
				clearOperations();

				assertTrue(testElement.getStrings().size() == 2);
				assertTrue(testElement.getStrings().get(0).equals("first"));
				assertTrue(testElement.getStrings().get(1).equals("second"));

				testElement.getStrings().move(0, 1);
				assertTrue(testElement.getStrings().size() == 2);
				assertTrue(testElement.getStrings().get(0).equals("second"));
				assertTrue(testElement.getStrings().get(1).equals("first"));
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				AbstractOperation operation = getProjectSpace().getOperations().get(0).reverse();
				operation.apply(getProject());
				assertTrue(testElement.getStrings().size() == 2);
				assertTrue(testElement.getStrings().get(0).equals("first"));
				assertTrue(testElement.getStrings().get(1).equals("second"));
			}
		}.run(false);
	}
}
