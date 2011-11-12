/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.integration.reversibility;

import java.net.URISyntaxException;

import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.client.test.SetupHelper;
import org.eclipse.emf.emfstore.client.test.TestProjectEnum;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.server.exceptions.EmfStoreException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * @author Hodaie
 */
public abstract class OperationsReversibilityTest {

	private static boolean serverRunning;
	private SetupHelper setupHelper;

	/**
	 * set up test project.
	 * 
	 * @throws URISyntaxException URISyntaxException
	 */
	@BeforeClass
	public static void init() throws URISyntaxException {
		if (serverRunning) {
			return;
		}

		SetupHelper.startSever();
		serverRunning = true;

	}

	/**
	 * Before every test import test project and share it on the server.
	 */
	@Before
	public void setup() {

		setupHelper = new SetupHelper(TestProjectEnum.RANDOM_3K);

		setupHelper.setupWorkSpace();

		setupHelper.setupTestProjectSpace();

		setupHelper.shareProject();

	}

	/**
	 * cleans server and workspace after tests are run.
	 */
	@After
	public void cleanUp() {
		SetupHelper.cleanupWorkspace();

		SetupHelper.cleanupServer();
	}

	/**
	 * @return the testProject
	 */
	public Project getTestProject() {
		return setupHelper.getTestProject();
	}

	/**
	 * Returns project to be compared with test project. This is project that lies on server after committing the
	 * changes.
	 * 
	 * @return project lying on the server
	 * @throws EmfStoreException EmfStoreException
	 */
	public Project getCompareProject() throws EmfStoreException {
		return setupHelper.getCompareProject();

	}

	/**
	 * Returns the test project space.
	 * 
	 * @return test project space
	 */
	public ProjectSpace getTestProjectSpace() {
		return setupHelper.getTestProjectSpace();
	}

	// /**
	// * Commits changes.
	// */
	// public void commitChanges(){
	// setupHelper.commitChanges();
	// }

}
