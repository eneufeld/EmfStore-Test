/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.canonization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.eclipse.emf.emfstore.client.model.CompositeOperationHandle;
import org.eclipse.emf.emfstore.client.model.exceptions.InvalidHandleException;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.WorkspaceTest;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.CompositeOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.util.OperationsCanonizer;
import org.junit.Test;

/**
 * Tests canonization of composite operations.
 * 
 * @author chodnick
 */
public class CompositeTest extends WorkspaceTest {

	/**
	 * Tests canonization of empty composite operations.
	 * 
	 * @throws InvalidHandleException if an error occurrs
	 */
	@Test
	public void emptyComposite() throws InvalidHandleException {

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				// create an empty composite, should be canonized out
				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();
				try {
					handle.end("sectionCreation", "description", null);
				} catch (InvalidHandleException e) {
					fail();
				}
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(operations.size(), 1);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		assertEquals(operations.size(), 0);

	}

	/**
	 * Tests canonization for consecutive attribute changes, resulting in a noop.
	 * 
	 * @throws InvalidHandleException if error occurs
	 */
	@Test
	public void noOpComposite() throws InvalidHandleException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");
			}
		}.run(false);

		final Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();

				useCase.setName("A");
				useCase.setName("B");
				useCase.setName("C");
				useCase.setName("oldName");

				assertEquals("oldName", useCase.getName());

				assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

				try {
					handle.end("blubb", "blibb", null);
				} catch (InvalidHandleException e) {
					fail();
				}
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(operations.size(), 1);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// should not have left any operations, we were just resetting the name to its original value
		assertEquals(operations.size(), 0);

	}

	/**
	 * Tests canonization for consecutive attribute changes, resulting in a noop.
	 * 
	 * @throws InvalidHandleException if error occurs
	 */
	@Test
	public void multiFeatureNoOpComposite() throws InvalidHandleException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");
				useCase.setDescription("oldDescription");
			}
		}.run(false);

		final Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();

				useCase.setName("A");
				useCase.setDescription("X");
				useCase.setName("B");
				useCase.setDescription("Y");
				useCase.setName("C");

				useCase.setDescription("oldDescription");
				useCase.setName("oldName");

				assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

				try {
					handle.end("blubb", "blibb", null);
				} catch (InvalidHandleException e) {
					fail();
				}
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(operations.size(), 1);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// should not have left any operations, we were just resetting the name to its original value
		assertEquals(operations.size(), 0);

	}

	/**
	 * Tests canonization for composite ops, where main operation might be canonized away.
	 * 
	 * @throws InvalidHandleException if error occurs
	 */
	@Test
	public void mainDeleteCompositeImplicitRestore() throws InvalidHandleException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");
				clearOperations();

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();

				useCase.setName("A");
				useCase.setName("B");
				useCase.setName("newName");

				try {
					handle.end("blubb", "blibb", null);
				} catch (InvalidHandleException e) {
					fail();
				}
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(operations.size(), 1);
		final CompositeOperation comp = (CompositeOperation) operations.get(0);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				comp.setMainOperation(comp.getSubOperations().get(1)); // setName to from "A" to "B"
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// the main one was a candidate for removal, but since it is the main one, it may not be touched
		// in this case it will not even be modified
		assertTrue(comp.getSubOperations().contains(comp.getMainOperation()));
	}

	/**
	 * Tests canonization for composite ops, where main operation might be canonized away.
	 * 
	 * @throws InvalidHandleException if error occurs
	 */
	@Test
	public void mainDeleteCompositeImplicitMainOpModification() throws InvalidHandleException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");

				clearOperations();

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();

				useCase.setName("A");
				useCase.setName("B");
				useCase.setName("newName");

				try {
					handle.end("blubb", "blibb", null);
				} catch (InvalidHandleException e) {
					fail();
				}
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(operations.size(), 1);
		final CompositeOperation comp = (CompositeOperation) operations.get(0);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				comp.setMainOperation(comp.getSubOperations().get(0)); // setName to from "oldName" to "A"
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// the main one was a candidate for removal, but since it is the main one, it may not be removed
		// it might have been altered though (newValue, oldValue etc., might have changed in the canonization
		// process)
		assertTrue(comp.getSubOperations().contains(comp.getMainOperation()));
	}

	/**
	 * Tests canonization for composite ops, where main operation might be canonized away.
	 * 
	 * @throws InvalidHandleException if error occurs
	 */
	@Test
	public void mainDeleteNoOpComposite() throws InvalidHandleException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");

				clearOperations();

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();

				useCase.setName("A");
				useCase.setName("B");
				useCase.setName("oldName");

				try {
					handle.end("blubb", "blibb", null);
				} catch (InvalidHandleException e) {
					fail();
				}
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(operations.size(), 1);
		final CompositeOperation comp = (CompositeOperation) operations.get(0);
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				comp.setMainOperation(comp.getSubOperations().get(1)); // setName to from "A" to "B"
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);
		// since this composite is a noop, everything should have been removed
		assertEquals(comp.getSubOperations().size(), 0);
	}

}
