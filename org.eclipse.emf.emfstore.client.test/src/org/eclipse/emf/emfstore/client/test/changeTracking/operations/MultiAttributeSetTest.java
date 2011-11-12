/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.WorkspaceTest;
import org.eclipse.emf.emfstore.client.test.testmodel.TestElement;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiAttributeSetOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.OperationsFactory;
import org.junit.Test;

/**
 * Tests for multiattributeset operations.
 * 
 * @author wesendon
 */
public class MultiAttributeSetTest extends WorkspaceTest {

	protected TestElement element;

	/**
	 * Set value test.
	 */
	@Test
	public void setValueToFilledTest() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				element = getTestElement();
				element.getStrings().add("oldValue");
				clearOperations();
			}
		}.run(false);

		assertTrue(element.getStrings().size() == 1);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				element.getStrings().set(0, "settedValue");
			}
		}.run(false);

		assertTrue(element.getStrings().size() == 1);
		assertTrue(element.getStrings().get(0).equals("settedValue"));

		assertTrue(getProjectSpace().getOperations().size() == 1);
		assertTrue(getProjectSpace().getOperations().get(0) instanceof MultiAttributeSetOperation);
	}

	/**
	 * Apply setoperation to element.
	 */
	@Test
	public void applyValueToFilledTest() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getTestElement();
				testElement.getStrings().add("oldValue");
				assertTrue(testElement.getStrings().size() == 1);

				MultiAttributeSetOperation operation = OperationsFactory.eINSTANCE.createMultiAttributeSetOperation();
				operation.setFeatureName("strings");
				operation.setIndex(0);
				operation.setNewValue("inserted");
				operation.setOldValue("oldValue");
				operation.setModelElementId(ModelUtil.getProject(testElement).getModelElementId(testElement));

				operation.apply(getProject());

				assertTrue(testElement.getStrings().size() == 1);
				assertTrue(testElement.getStrings().get(0).equals("inserted"));
			}
		}.run(false);
	}

	/**
	 * apply setoperation with wrong index.
	 */
	@Test
	public void applyValueToFilledWrongIndexTest() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getTestElement();
				testElement.getStrings().add("oldValue");
				assertTrue(testElement.getStrings().size() == 1);

				MultiAttributeSetOperation operation = OperationsFactory.eINSTANCE.createMultiAttributeSetOperation();
				operation.setFeatureName("strings");
				operation.setIndex(42);
				operation.setNewValue("inserted");
				operation.setOldValue("oldValue");
				operation.setModelElementId(ModelUtil.getProject(testElement).getModelElementId(testElement));

				operation.apply(getProject());

				assertTrue(testElement.getStrings().size() == 1);
				assertTrue(testElement.getStrings().get(0).equals("oldValue"));
			}
		}.run(false);
	}

	/**
	 * Apply to filled list.
	 */
	@Test
	public void applyValueToMultiFilledTest() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getTestElement();
				testElement.getStrings().addAll(Arrays.asList("first", "second", "third"));
				assertTrue(testElement.getStrings().size() == 3);

				MultiAttributeSetOperation operation = OperationsFactory.eINSTANCE.createMultiAttributeSetOperation();
				operation.setFeatureName("strings");
				operation.setIndex(1);
				operation.setNewValue("inserted");
				operation.setOldValue("second");
				operation.setModelElementId(ModelUtil.getProject(testElement).getModelElementId(testElement));

				operation.apply(getProject());

				assertTrue(testElement.getStrings().size() == 3);
				assertTrue(testElement.getStrings().get(0).equals("first"));
				assertTrue(testElement.getStrings().get(1).equals("inserted"));
				assertTrue(testElement.getStrings().get(2).equals("third"));
			}
		}.run(false);
	}

	/**
	 * Set and reverse.
	 */
	@Test
	public void setAndReverseTest() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				element = getTestElement();
				element.getStrings().add("oldValue");

				clearOperations();
			}
		}.run(false);

		assertTrue(element.getStrings().size() == 1);
		assertTrue(element.getStrings().get(0).equals("oldValue"));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				element.getStrings().set(0, "newValue");

				assertTrue(element.getStrings().size() == 1);
				assertTrue(element.getStrings().get(0).equals("newValue"));
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				AbstractOperation operation = getProjectSpace().getOperations().get(0).reverse();
				operation.apply(getProject());
			}
		}.run(false);

		assertTrue(element.getStrings().size() == 1);
		assertTrue(element.getStrings().get(0).equals("oldValue"));
	}
}
