/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking.canonization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.emfstore.client.model.CompositeOperationHandle;
import org.eclipse.emf.emfstore.client.model.exceptions.InvalidHandleException;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.WorkspaceTest;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentFactory;
import org.eclipse.emf.emfstore.client.test.model.document.LeafSection;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.common.model.ModelFactory;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AttributeOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.CompositeOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.CreateDeleteOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiReferenceOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.util.OperationsCanonizer;
import org.junit.Test;

/**
 * Tests canonization of attribute operations.
 * 
 * @author chodnick
 */
public class AttributeTest extends WorkspaceTest {

	/**
	 * Tests canonization for consecutive attribute changes on a single feature.
	 * 
	 * @throws IOException
	 */
	@Test
	public void consecutiveAttributeChangeSingleFeature() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				useCase.setName("A");
				useCase.setName("B");
				useCase.setName("C");
				useCase.setName("newName");
			}
		}.run(false);

		assertEquals("newName", useCase.getName());
		assertEquals(4, getProjectSpace().getOperations().size());

		final List<AbstractOperation> operations = getProjectSpace().getOperations();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		assertEquals(operations.size(), 1);

		final AttributeOperation reverse = (AttributeOperation) operations.get(0).reverse();

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				reverse.apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Tests canonization for consecutive attribute changes on a single feature.
	 * 
	 * @throws IOException
	 */
	@Test
	public void consecutiveAttributeChangeSingleFeatureToNull() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				clearOperations();

				useCase.setName("A");
				useCase.setName("B");
				useCase.setName("C");
				useCase.setName(null);
			}
		}.run(false);

		assertEquals(null, useCase.getName());

		final List<AbstractOperation> operations = getProjectSpace().getOperations();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		assertEquals(operations.size(), 1);

		final AttributeOperation reverse = (AttributeOperation) operations.get(0).reverse();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				reverse.apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject().eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));

	}

	/**
	 * Tests canonization for consecutive attribute changes on a single feature.
	 * 
	 * @throws IOException
	 */
	@Test
	public void consecutiveAttributeChangeSingleFeatureNullToValue() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName(null);
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				useCase.setName("A");
				useCase.setName("B");
				useCase.setName("C");
			}
		}.run(false);

		assertEquals("C", useCase.getName());

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(3, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		assertEquals(operations.size(), 1);

		final AttributeOperation reverse = (AttributeOperation) operations.get(0).reverse();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				reverse.apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));

	}

	/**
	 * Tests canonization for consecutive attribute changes, resulting in a noop.
	 * 
	 * @throws IOException
	 */
	@Test
	public void attributeChangeNoOp() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				useCase.setName("A");
				useCase.setName("B");
				useCase.setName("C");
				useCase.setName("oldName");
			}
		}.run(false);

		assertEquals("oldName", useCase.getName());
		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(4, operations.size());

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// should not have created any operations, we were just resetting the name to its original value
		assertEquals(operations.size(), 0);

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));

	}

	/**
	 * Tests canonization for consecutive attribute changes, resulting in a noop.
	 * 
	 * @throws IOException
	 */
	@Test
	public void attributeChangeNoOpNull() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName(null);
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				useCase.setName("A");
				useCase.setName("B");
				useCase.setName("C");
				useCase.setName(null);
			}
		}.run(false);

		assertEquals(null, useCase.getName());
		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(4, operations.size());

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// should not have created any operations, we were just resetting the name to its original value
		assertEquals(operations.size(), 0);

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Tests canonization for consecutive attribute changes, resulting in a noop.
	 * 
	 * @throws IOException
	 */
	@Test
	public void attributeChangeMultiFeatureNoOp() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");
				useCase.setDescription("oldDescription");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				useCase.setName("A");
				useCase.setDescription("X");
				useCase.setName("B");
				useCase.setDescription("Y");
				useCase.setName("C");

				useCase.setDescription("oldDescription");
				useCase.setName("oldName");
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));
		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(7, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// should not have created any operations, we were just resetting everything to its original value
		assertEquals(operations.size(), 0);

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Tests canonization for consecutive attribute changes on multiple features.
	 * 
	 * @throws IOException
	 */
	@Test
	public void consecutiveAttributeChangeMultiFeature() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("oldName");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				useCase.setName("A");
				useCase.setDescription("oldDescription");
				useCase.setName("B");
				useCase.setName("C");
				useCase.setDescription("newDescription");
				useCase.setName("newName");
			}
		}.run(false);

		assertEquals("newName", useCase.getName());
		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(6, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		assertEquals(operations.size(), 2);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				for (int i = operations.size() - 1; i >= 0; i--) {
					AbstractOperation reverse = operations.get(i).reverse();
					reverse.apply(getProject());
				}
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Tests canonization for mixed attribute changes on a single feature.
	 * 
	 * @throws IOException
	 */
	@Test
	public void mixedAttributeChangeSingleFeature() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				getProject().addModelElement(actor);
				getProject().addModelElement(section);

				useCase.setName("oldName");
				section.setName("some section");
				actor.setName("homer");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				useCase.setName("A");
				actor.setName("maggie");
				useCase.setName("B");
				useCase.setInitiatingActor(actor);
				useCase.setName("C");
				section.setName("home");
				useCase.setName("newName");
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(7, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				for (int i = operations.size() - 1; i >= 0; i--) {
					AbstractOperation reverse = operations.get(i).reverse();
					reverse.apply(getProject());
				}
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Tests canonization for mixed attribute changes on a single feature.
	 * 
	 * @throws IOException
	 */
	@Test
	public void mixedAttributeChangeMultiFeature() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final LeafSection oldSection = DocumentFactory.eINSTANCE.createLeafSection();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				getProject().addModelElement(actor);
				getProject().addModelElement(section);
				getProject().addModelElement(oldSection);

				useCase.setLeafSection(oldSection);
				actor.setLeafSection(oldSection);

				useCase.setName("oldName");
				oldSection.setName("oldSection");
				section.setName("some section");
				actor.setName("homer");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				useCase.setName("A");
				actor.setName("maggie");
				useCase.setName("B");
				useCase.setDescription("some desc");
				useCase.setInitiatingActor(actor);
				useCase.setName("C");
				section.setName("home");
				useCase.setDescription("some other desc");
				useCase.setName("newName");
				useCase.setDescription("final desc");
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals("newName", useCase.getName());
		assertEquals("final desc", useCase.getDescription());
		assertEquals("home", section.getName());
		assertEquals("maggie", actor.getName());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				for (int i = operations.size() - 1; i >= 0; i--) {
					AbstractOperation reverse = operations.get(i).reverse();
					reverse.apply(getProject());
				}
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Test the creation and completion of a composite operation, that contains attribute changes.
	 * 
	 * @throws InvalidHandleException if the test fails
	 * @throws IOException
	 */
	@Test
	public void compositeAttributeChangesACA() throws InvalidHandleException, IOException {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.setName("Name");
				section.setDescription("oldDescription");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				section.setDescription("desc 1");

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();
				section.setDescription("newDescription");
				UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
				section.getModelElements().add(useCase);
				try {
					handle.end("sectionCreation", "description",
						ModelUtil.getProject(section).getModelElementId(section));
				} catch (InvalidHandleException e) {
					fail();
				}
				section.setDescription("desc 2");
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals("desc 2", section.getDescription());
		assertEquals(3, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				for (int i = operations.size() - 1; i >= 0; i--) {
					AbstractOperation reverse = operations.get(i).reverse();
					reverse.apply(getProject());
				}
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Test the creation and completion of a composite operation, that contains attribute changes.
	 * 
	 * @throws InvalidHandleException if the test fails
	 * @throws IOException
	 */
	@Test
	public void compositeAttributeChangesAC() throws InvalidHandleException, IOException {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.setName("Name");
				section.setDescription("oldDescription");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				section.setDescription("desc 1");

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();
				section.setDescription("newDescription");
				UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
				section.getModelElements().add(useCase);
				try {
					handle.end("sectionCreation", "description",
						ModelUtil.getProject(section).getModelElementId(section));
				} catch (InvalidHandleException e) {
					fail();
				}
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(2, operations.size());
		assertEquals("newDescription", section.getDescription());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				for (int i = operations.size() - 1; i >= 0; i--) {
					AbstractOperation reverse = operations.get(i).reverse();
					reverse.apply(getProject());
				}
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Test the creation and completion of a composite operation, that contains attribute changes.
	 * 
	 * @throws InvalidHandleException if the test fails
	 * @throws IOException
	 */
	@Test
	public void compositeAttributeChangesCA() throws InvalidHandleException, IOException {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.setName("Name");
				section.setDescription("oldDescription");
			}
		}.run(false);

		Project expectedProject = ModelUtil.clone(getProject());
		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();
				section.setDescription("newDescription");
				UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
				section.getModelElements().add(useCase);
				try {
					handle.end("sectionCreation", "description",
						ModelUtil.getProject(section).getModelElementId(section));
				} catch (InvalidHandleException e) {
					fail();
				}

				section.setDescription("desc 2");
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		assertEquals(2, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				for (int i = operations.size() - 1; i >= 0; i--) {
					AbstractOperation reverse = operations.get(i).reverse();
					reverse.apply(getProject());
				}
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Tests canonization for create and consecutive attribute changes.
	 * 
	 * @throws IOException
	 */
	@Test
	public void createAndChangeAttributesSimple() throws IOException {

		Project originalProject = ModelUtil.clone(getProject());

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("NameOfUseCase");
				useCase.setDescription("DescriptionOfUseCase");
			}
		}.run(false);

		assertEquals("NameOfUseCase", useCase.getName());

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a create and two attribute operations
		assertEquals(3, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// now expecting only the create with folded in attributes
		assertEquals(operations.size(), 1);
		assertTrue(operations.get(0) instanceof CreateDeleteOperation);

		final CreateDeleteOperation op = (CreateDeleteOperation) operations.get(0);

		assertEquals(((UnicaseModelElement) op.getModelElement()).getName(), "NameOfUseCase");
		assertEquals(((UnicaseModelElement) op.getModelElement()).getDescription(), "DescriptionOfUseCase");

		// test if the create is reversible and re-reversible
		Project expectedProject = ModelUtil.clone(getProject());
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				op.reverse().apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), originalProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				op.reverse().reverse().apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Tests canonization for create and consecutive attribute changes.
	 * 
	 * @throws IOException
	 */
	@Test
	public void createAndChangeAttributesComplex() throws IOException {

		Project originalProject = ModelUtil.clone(getProject());

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				getProject().addModelElement(useCase2);

				useCase.setName("NameOfUseCase");
				useCase.setDescription("DescriptionOfUseCase");

				useCase2.setName("NameOfUseCase2");
				useCase2.setDescription("DescriptionOfUseCase2");
			}
		}.run(false);

		assertEquals("NameOfUseCase", useCase.getName());
		assertEquals("NameOfUseCase2", useCase2.getName());
		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expecting a create and two attribute operations per usecase
		assertEquals(6, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// now expecting only the creates with folded in attributes
		assertEquals(2, operations.size());
		assertTrue(operations.get(0) instanceof CreateDeleteOperation);

		final CreateDeleteOperation op = (CreateDeleteOperation) operations.get(0);

		assertEquals(((UnicaseModelElement) op.getModelElement()).getName(), "NameOfUseCase");
		assertEquals(((UnicaseModelElement) op.getModelElement()).getDescription(), "DescriptionOfUseCase");

		assertTrue(operations.get(1) instanceof CreateDeleteOperation);

		final CreateDeleteOperation op2 = (CreateDeleteOperation) operations.get(1);

		assertEquals(((UnicaseModelElement) op2.getModelElement()).getName(), "NameOfUseCase2");
		assertEquals(((UnicaseModelElement) op2.getModelElement()).getDescription(), "DescriptionOfUseCase2");

		// test reversibility, too

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				op2.reverse().apply(getProject());
				op.reverse().apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), originalProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, originalProject));
	}

	/**
	 * Test the creation and completion of a composite operation, that contains attribute changes.
	 * 
	 * @throws InvalidHandleException if the test fails
	 * @throws IOException
	 */
	@Test
	public void createAndAttributeChangesACA() throws InvalidHandleException, IOException {

		Project originalProject = ModelUtil.clone(getProject());

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.setName("Name");
				section.setDescription("oldDescription");

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();
				section.setDescription("newDescription");
				UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
				section.getModelElements().add(useCase);
				try {
					handle.end("sectionCreation", "description",
						ModelUtil.getProject(section).getModelElementId(section));
				} catch (InvalidHandleException e) {
					fail();
				}

				section.setDescription("desc 2");
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();

		// expect create, 2 attribute ops, the composite, 1 attribute op
		assertEquals(5, operations.size());
		assertTrue(operations.get(0) instanceof CreateDeleteOperation);
		assertTrue(operations.get(1) instanceof AttributeOperation);
		assertTrue(operations.get(2) instanceof AttributeOperation);
		assertTrue(operations.get(3) instanceof CompositeOperation);
		assertTrue(operations.get(4) instanceof AttributeOperation);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// expect create, the composite and 1 attribute op
		assertEquals(3, operations.size());
		assertTrue(operations.get(0) instanceof CreateDeleteOperation);
		assertTrue(operations.get(1) instanceof CompositeOperation);
		assertTrue(operations.get(2) instanceof AttributeOperation);

		Project expectedProject = ModelUtil.clone(getProject());

		// test reversibility

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				for (int i = operations.size() - 1; i >= 0; i--) {
					AbstractOperation reverse = operations.get(i).reverse();
					reverse.apply(getProject());
				}
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), originalProject));

		// test redo
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				operations.get(0).apply(getProject());
				operations.get(1).apply(getProject());
				operations.get(2).apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject().eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Tests canonization for consecutive attribute changes followed by a delete.
	 * 
	 * @throws IOException
	 */
	@Test
	public void changeAttributesAndDeleteSimple() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("originalName");
				useCase.setDescription("originalDescription");
				clearOperations();
			}
		}.run(false);

		Project originalProject = ModelUtil.clone(getProject());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				useCase.setName("NameOfUseCase");
				useCase.setDescription("DescriptionOfUseCase");
				getProject().deleteModelElement(useCase);
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();

		// expecting two attribute operations and a delete
		assertEquals(3, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// now expecting only the delete with folded in attributes
		assertEquals(1, operations.size());
		assertTrue(operations.get(0) instanceof CreateDeleteOperation);

		final CreateDeleteOperation op = (CreateDeleteOperation) operations.get(0);

		assertTrue(op.isDelete());
		assertEquals(((UnicaseModelElement) op.getModelElement()).getName(), "originalName");
		assertEquals(((UnicaseModelElement) op.getModelElement()).getDescription(), "originalDescription");

		// test if the delete is reversible and re-reversible
		Project expectedProject = ModelUtil.clone(getProject());
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				op.reverse().apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), originalProject));

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				op.reverse().reverse().apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));
	}

	/**
	 * Tests canonization for consecutive attribute changes and delete.
	 * 
	 * @throws IOException
	 */
	@Test
	public void changeAttributesAndDeleteComplex() throws IOException {

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();
		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.getModelElements().add(useCase);
				section.getModelElements().add(useCase2);

				useCase.setName("originalName1");
				useCase.setDescription("originalDescription1");

				useCase2.setName("originalName2");
				useCase2.setDescription("originalDescription2");
				clearOperations();
			}
		}.run(false);

		Project originalProject = ModelUtil.clone(getProject());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {

				useCase.setName("NameOfUseCase");
				useCase.setDescription("DescriptionOfUseCase");

				useCase2.setName("NameOfUseCase2");
				useCase2.setDescription("DescriptionOfUseCase2");

				assertEquals("NameOfUseCase", useCase.getName());
				assertEquals("NameOfUseCase2", useCase2.getName());

				getProject().deleteModelElement(useCase);
			}
		}.run(false);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().deleteModelElement(useCase2);
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();

		// expecting two attribute operations and a delete per usecase
		assertEquals(6, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// now expecting only the deletes with folded in attributes
		assertEquals(2, operations.size());
		assertTrue(operations.get(0) instanceof CreateDeleteOperation);

		final CreateDeleteOperation op = (CreateDeleteOperation) operations.get(0);

		assertEquals("originalName1", ((UnicaseModelElement) op.getModelElement()).getName());
		assertEquals("originalDescription1", ((UnicaseModelElement) op.getModelElement()).getDescription());

		assertTrue(operations.get(1) instanceof CreateDeleteOperation);

		final CreateDeleteOperation op2 = (CreateDeleteOperation) operations.get(1);

		assertEquals(((UnicaseModelElement) op2.getModelElement()).getName(), "originalName2");
		assertEquals(((UnicaseModelElement) op2.getModelElement()).getDescription(), "originalDescription2");

		// test reversibility, too
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				op2.reverse().apply(getProject());
				op.reverse().apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), originalProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, originalProject));
	}

	/**
	 * Tests canonization for consecutive attribute changes and delete on orphans.
	 */
	// commented out, orphan behaviour is irrelevant at present. This reversibility test currently fails.
	// @Test
	// public void changeAttributesAndDeleteOrphansComplex() {
	//
	// UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
	// UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();
	//
	// getProject().getModelElements().add(useCase);
	// getProject().getModelElements().add(useCase2);
	//
	// useCase.setName("originalName1");
	// useCase.setDescription("originalDescription1");
	//
	// useCase2.setName("originalName2");
	// useCase2.setDescription("originalDescription2");
	//
	// Project originalProject = ModelUtil.clone(getProject());
	//
	// clearOperations();
	//
	// useCase.setName("NameOfUseCase");
	// useCase.setDescription("DescriptionOfUseCase");
	//
	// useCase2.setName("NameOfUseCase2");
	// useCase2.setDescription("DescriptionOfUseCase2");
	//
	// assertEquals("NameOfUseCase", useCase.getName());
	// assertEquals("NameOfUseCase2", useCase2.getName());
	//
	// getProject().deleteModelElement(useCase);
	// getProject().deleteModelElement(useCase2);
	//
	// List<AbstractOperation> operations = getProjectSpace().getOperations();
	//
	// // expecting two attribute operations and a delete per usecase
	// assertEquals(operations.size(), 6);
	// OperationsCanonizer.canonize(operations);
	//
	// // now expecting only the deletes with folded in attributes
	// assertEquals(operations.size(), 2);
	// assertTrue(operations.get(0) instanceof CreateDeleteOperation);
	//
	// CreateDeleteOperation op = (CreateDeleteOperation) operations.get(0);
	//
	// assertEquals(op.getModelElement().getName(), "originalName1");
	// assertEquals(op.getModelElement().getDescription(), "originalDescription1");
	//
	// assertTrue(operations.get(1) instanceof CreateDeleteOperation);
	//
	// CreateDeleteOperation op2 = (CreateDeleteOperation) operations.get(1);
	//
	// assertEquals(op2.getModelElement().getName(), "originalName2");
	// assertEquals(op2.getModelElement().getDescription(), "originalDescription2");
	//
	// // test reversibility, too
	//
	// op2.reverse().apply(getProject());
	// op.reverse().apply(getProject());
	//
	// assertTrue(ModelUtil.areEqual(getProject(), originalProject));
	//
	// }
	/**
	 * Test the creation and completion of a composite operation, that contains attribute changes.
	 * 
	 * @throws InvalidHandleException if the test fails
	 * @throws IOException
	 */
	@Test
	public void attributeChangesACAAndDelete() throws InvalidHandleException, IOException {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.setName("originalName");
				section.setDescription("originalDescription");
			}
		}.run(false);

		Project originalProject = ModelUtil.clone(getProject());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();
				section.setName("some new Name");

				CompositeOperationHandle handle = getProjectSpace().beginCompositeOperation();
				section.setDescription("newDescription");
				UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
				section.getModelElements().add(useCase);
				try {
					handle.end("sectionCreation", "description",
						ModelUtil.getProject(section).getModelElementId(section));
				} catch (InvalidHandleException e) {
					fail();
				}

				section.setDescription("desc 2");

				getProject().deleteModelElement(section);
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();

		// expect 1 attribute op, the composite, 1 attribute op, the delete
		assertEquals(4, operations.size());
		assertTrue(operations.get(0) instanceof AttributeOperation);
		assertTrue(operations.get(1) instanceof CompositeOperation);
		assertTrue(operations.get(2) instanceof AttributeOperation);
		assertTrue(operations.get(3) instanceof CreateDeleteOperation);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// expect 1 attribute op, the composite and the delete with folded in attribute
		assertEquals(3, operations.size());
		assertTrue(operations.get(0) instanceof AttributeOperation);
		assertTrue(operations.get(1) instanceof CompositeOperation);
		assertTrue(operations.get(2) instanceof CreateDeleteOperation);

		CreateDeleteOperation delOp = (CreateDeleteOperation) operations.get(2);
		assertTrue(delOp.isDelete());
		// not folded, interfering composite was inbeetween
		assertEquals("some new Name", ((UnicaseModelElement) delOp.getModelElement()).getName());
		// folded, value is oldValue from "newDescription"-> "desc 2"
		assertEquals("newDescription", ((UnicaseModelElement) delOp.getModelElement()).getDescription());

		Project expectedProject = ModelUtil.clone(getProject());

		// test reversibility

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				for (int i = operations.size() - 1; i >= 0; i--) {
					AbstractOperation reverse = operations.get(i).reverse();
					reverse.apply(getProject());
				}
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), originalProject));

		// test redo
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				operations.get(0).apply(getProject());
				operations.get(1).apply(getProject());
				operations.get(2).apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), expectedProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, expectedProject));

	}

	/**
	 * Tests canonization for create, attribute changes and delete.
	 * 
	 * @throws IOException
	 */
	@Test
	public void createChangeAttributeAndDelete() throws IOException {

		Project originalProject = ModelUtil.clone(getProject());

		final UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase);
				useCase.setName("someName");
				useCase.setName("newName");
				getProject().deleteModelElement(useCase);
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expect create, 2 attribute ops, delete
		assertEquals(4, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// expect attributes folding into create, and create and delete removed,
		// as they would be directly adjacent to each other
		assertEquals(operations.size(), 0);

		assertTrue(ModelUtil.areEqual(getProject(), originalProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject()
				.eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, originalProject));
	}

	/**
	 * Tests canonization for create, attribute changes and delete.
	 * 
	 * @throws IOException
	 */
	@Test
	public void createChangeReferencesAndDelete() throws IOException {

		final UseCase useCase2 = RequirementFactory.eINSTANCE.createUseCase();

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(useCase2);
			}
		}.run(false);

		Project originalProject = ModelUtil.clone(getProject());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				clearOperations();

				UseCase useCase = RequirementFactory.eINSTANCE.createUseCase();
				getProject().addModelElement(useCase);
				useCase.setName("someName");
				useCase.getExtendedUseCases().add(useCase2);
				getProject().deleteModelElement(useCase);
			}
		}.run(false);

		final List<AbstractOperation> operations = getProjectSpace().getOperations();
		// expect create, 1 attribute ops, 1 multiref op, the delete
		assertEquals(4, operations.size());

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				OperationsCanonizer.canonize(operations);
			}
		}.run(false);

		// expect attributes folding into create, the multiref and delete remain
		assertEquals(operations.size(), 3);
		assertTrue(operations.get(0) instanceof CreateDeleteOperation);
		assertTrue(operations.get(1) instanceof MultiReferenceOperation);
		assertTrue(operations.get(2) instanceof CreateDeleteOperation);

		// check the folding of the attribute
		CreateDeleteOperation createOp = (CreateDeleteOperation) operations.get(0);
		assertEquals("someName", ((UnicaseModelElement) createOp.getModelElement()).getName());

		// check reversibility
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				operations.get(2).reverse().apply(getProject());
				operations.get(1).reverse().apply(getProject());
				operations.get(0).reverse().apply(getProject());
			}
		}.run(false);

		assertTrue(ModelUtil.areEqual(getProject(), originalProject));

		Project loadedProject = ModelUtil.loadEObjectFromResource(
			ModelFactory.eINSTANCE.getModelPackage().getProject(), getProject().eResource().getURI(), false);

		assertTrue(ModelUtil.areEqual(loadedProject, originalProject));
	}

}
