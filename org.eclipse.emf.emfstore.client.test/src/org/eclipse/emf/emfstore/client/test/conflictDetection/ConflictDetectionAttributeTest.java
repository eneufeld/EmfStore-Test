/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.conflictDetection;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentFactory;
import org.eclipse.emf.emfstore.client.test.model.document.LeafSection;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.common.model.ModelElementId;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.server.conflictDetection.ConflictDetector;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.junit.Test;

/**
 * Tests conflict detection behaviour on attributes.
 * 
 * @author chodnick
 */
public class ConflictDetectionAttributeTest extends ConflictDetectionTest {

	/**
	 * Tests if overwriting of attributes is detected as conflict.
	 */
	@Test
	public void conflictAttribute() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		actor.setName("old name");

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.getModelElements().add(actor);

				getProjectSpace().getOperations().clear();
			}
		}.run(false);

		ProjectSpace ps2 = cloneProjectSpace(getProjectSpace());
		Project project2 = ps2.getProject();

		ModelElementId actor1Id = getProject().getModelElementId(actor);
		ModelElementId actor2Id = actor1Id;

		final Actor actor1 = (Actor) getProject().getModelElement(actor1Id);
		final Actor actor2 = (Actor) project2.getModelElement(actor2Id);

		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				actor1.setName("change 1");
				actor2.setName("change 2");
			}
		}.run(false);

		List<AbstractOperation> ops1 = getProjectSpace().getLocalOperations().getOperations();
		List<AbstractOperation> ops2 = ps2.getLocalOperations().getOperations();

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());
		Set<AbstractOperation> conflicts = cd.getConflicting(ops1, ops2);
		assertEquals(cd.getConflicting(ops1, ops2).size(), cd.getConflicting(ops2, ops1).size());

		assertEquals(conflicts.size(), 1);

	}

	/**
	 * Tests if overwriting of attributes is detected as conflict.
	 */
	@Test
	public void noConflictAttributeSameValue() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		actor.setName("old name");
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.getModelElements().add(actor);
				getProjectSpace().getOperations().clear();
			}
		}.run(false);

		ProjectSpace ps2 = cloneProjectSpace(getProjectSpace());
		Project project2 = ps2.getProject();

		ModelElementId actor1Id = getProject().getModelElementId(actor);
		ModelElementId actor2Id = actor1Id;

		final Actor actor1 = (Actor) getProject().getModelElement(actor1Id);
		final Actor actor2 = (Actor) project2.getModelElement(actor2Id);
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				actor1.setName("change 1");
				actor2.setName("change 1");
			}
		}.run(false);

		List<AbstractOperation> ops1 = getProjectSpace().getLocalOperations().getOperations();
		List<AbstractOperation> ops2 = ps2.getLocalOperations().getOperations();

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());
		Set<AbstractOperation> conflicts = cd.getConflicting(ops1, ops2);
		assertEquals(cd.getConflicting(ops1, ops2).size(), cd.getConflicting(ops2, ops1).size());
		// should not conflict, the same change happens on both sides
		assertEquals(conflicts.size(), 0);

	}

	/**
	 * Tests if overwriting of attributes is detected as conflict.
	 */
	@Test
	public void noConflictAttribute() {

		final LeafSection section = DocumentFactory.eINSTANCE.createLeafSection();
		final Actor actor = RequirementFactory.eINSTANCE.createActor();
		actor.setName("old name");

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				getProject().addModelElement(section);
				section.getModelElements().add(actor);
				getProjectSpace().getOperations().clear();

			}
		}.run(false);

		ProjectSpace ps2 = cloneProjectSpace(getProjectSpace());
		Project project2 = ps2.getProject();

		ModelElementId actor1Id = getProject().getModelElementId(actor);
		ModelElementId actor2Id = actor1Id;

		final Actor actor1 = (Actor) getProject().getModelElement(actor1Id);
		final Actor actor2 = (Actor) project2.getModelElement(actor2Id);

		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				actor1.setName("change 1");
				actor2.setDescription("unrelated change");

			}
		}.run(false);

		List<AbstractOperation> ops1 = getProjectSpace().getLocalOperations().getOperations();
		List<AbstractOperation> ops2 = ps2.getLocalOperations().getOperations();

		ConflictDetector cd = new ConflictDetector(getConflictDetectionStrategy());
		Set<AbstractOperation> conflicts = cd.getConflicting(ops1, ops2);
		assertEquals(cd.getConflicting(ops1, ops2).size(), cd.getConflicting(ops2, ops1).size());

		assertEquals(conflicts.size(), 0);

	}

}
