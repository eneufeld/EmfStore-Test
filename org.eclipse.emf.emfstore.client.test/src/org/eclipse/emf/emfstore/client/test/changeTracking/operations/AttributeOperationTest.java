/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.emfstore.client.model.exceptions.UnsupportedNotificationException;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.WorkspaceTest;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.common.model.ModelElementId;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AttributeOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.util.OperationsCanonizer;
import org.junit.Test;

/**
 * Tests the Attribute Operation.
 * 
 * @author koegel
 */
public class AttributeOperationTest extends WorkspaceTest {

	/**
	 * Change an attribute and check the generated operation.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void changeAttribute() throws UnsupportedOperationException, UnsupportedNotificationException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);

				clearOperations();

				useCase.setName("newName");
				assertEquals("newName", useCase.getName());
			}
		}.run(false);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof AttributeOperation);
		AttributeOperation attributeOperation = (AttributeOperation) operation;

		assertEquals("new UseCase", attributeOperation.getOldValue());
		assertEquals("newName", attributeOperation.getNewValue());
		assertEquals("name", attributeOperation.getFeatureName());

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(useCaseId, attributeOperation.getModelElementId());

	}

	/**
	 * Change an attribute twice and check the generated operations after cannonization.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void changeAttributeTwice() throws UnsupportedOperationException, UnsupportedNotificationException {
		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);

				clearOperations();

				useCase.setName("newName");
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				useCase.setName("otherName");
				assertEquals("otherName", useCase.getName());
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof AttributeOperation);
		AttributeOperation attributeOperation = (AttributeOperation) operation;

		assertEquals("new UseCase", attributeOperation.getOldValue());
		assertEquals("otherName", attributeOperation.getNewValue());
		assertEquals("name", attributeOperation.getFeatureName());

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(useCaseId, attributeOperation.getModelElementId());
	}

	/**
	 * Change an attribute and reverse the operation and check the result.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 */
	@Test
	public void changeAttributeAndReverse() throws UnsupportedOperationException, UnsupportedNotificationException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");

				clearOperations();

				useCase.setName("newName");
				assertEquals("newName", useCase.getName());
			}
		}.run(false);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		final AbstractOperation operation = operations.get(0);
		assertEquals(true, operation instanceof AttributeOperation);
		AttributeOperation attributeOperation = (AttributeOperation) operation;

		assertEquals("oldName", attributeOperation.getOldValue());
		assertEquals("newName", attributeOperation.getNewValue());
		assertEquals("name", attributeOperation.getFeatureName());

		ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);

		assertEquals(useCaseId, attributeOperation.getModelElementId());

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				AbstractOperation reverse = operation.reverse();
				reverse.apply(getProject());
				assertEquals(true, reverse instanceof AttributeOperation);
				AttributeOperation reversedAttributeOperation = (AttributeOperation) reverse;
				assertEquals("newName", reversedAttributeOperation.getOldValue());
				assertEquals("oldName", reversedAttributeOperation.getNewValue());
				assertEquals("name", reversedAttributeOperation.getFeatureName());
				ModelElementId useCaseId = ModelUtil.getProject(useCase).getModelElementId(useCase);
				assertEquals(useCaseId, reversedAttributeOperation.getModelElementId());
			}
		}.run(false);

		assertEquals("oldName", useCase.getName());
	}

	/**
	 * Test if attributeOperation.reverse().reverse() is a noop.
	 * 
	 * @throws UnsupportedOperationException on test fail
	 * @throws UnsupportedNotificationException on test fail
	 * @throws IOException
	 */
	@Test
	public void changeAttributeDoubleReversal() throws UnsupportedOperationException, UnsupportedNotificationException,
		IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");

				clearOperations();

				useCase.setName("newName");
				assertEquals("newName", useCase.getName());
			}
		}.run(false);

		List<AbstractOperation> operations = getProjectSpace().getOperations();

		assertEquals(1, operations.size());
		AbstractOperation operation = operations.get(0);

		assertEquals(true, operation instanceof AttributeOperation);
		final AttributeOperation attributeOperation = (AttributeOperation) operation;

		AttributeOperation cmpOperation = (AttributeOperation) attributeOperation.reverse().reverse();

		assertEquals(attributeOperation.getFeatureName(), cmpOperation.getFeatureName());
		assertEquals(attributeOperation.getDescription(), cmpOperation.getDescription());
		assertEquals(attributeOperation.getModelElementId(), cmpOperation.getModelElementId());
		assertEquals(attributeOperation.getName(), cmpOperation.getName());
		assertEquals(attributeOperation.getNewValue(), cmpOperation.getNewValue());
		assertEquals(attributeOperation.getOldValue(), cmpOperation.getOldValue());

		Project expectedProject = ModelUtil.clone(getProject());

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		final AbstractOperation r = attributeOperation.reverse();
		final AbstractOperation rr = r.reverse();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				r.apply(getProject());
				rr.apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				attributeOperation.reverse().apply(getProject());
				attributeOperation.reverse().reverse().apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

}
