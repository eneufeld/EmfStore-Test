/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */

package org.eclipse.emf.emfstore.client.test;

/**
 * This is a list of template projects used for testing. RANDOM_nnK means a random generated project with nn thousand
 * model elements. Template test projects are located at a /TestProjects folder.
 * 
 * @author hodaie
 */
public enum TestProjectEnum {

	/**
	 * a random generated project (with about 6000 elements) with these parameter(7, 1, 4, 3, 5, 20).
	 */
	RANDOM_3K("TestProjects/randomProject3.ucp"),

	/**
	 * a random generated project (with about 6000 elements) with these parameter(10, 12345, 5, 3, 15, 20).
	 */
	// RANDOM_6K("TestProjects/randomProject6.ucp"),

	/**
	 * a random generated project (with about 8000 elements) with these parameter(15, 12345, 5, 3, 15, 20).
	 */
	// RANDOM_8K("TestProjects/randomProject8.ucp"),

	/**
	 * a random generated project (with about 12000 elements) with these parameter(20, 12345, 5, 5, 10, 20).
	 */
	// RANDOM_12K("TestProjects/randomProject12.ucp"),

	/**
	 * a random generated project (with about 14000 elements) with these parameter(30, 123, 5, 5, 10, 20).
	 */
	// RANDOM_14K("TestProjects/randomProject14.ucp"),

	/**
	 * use a random generated project (with about 25000 elements) with these parameter(70, 123, 5, 5, 10, 20).
	 */
	// RANDOM_25K("TestProjects/randomProject25.ucp"),

	/**
	 * use the SuperMarketProject.
	 */
	SUPERMARKET("TestProjects/SupermarketExampleProject.ucp"),

	/**
	 * file api.
	 */
	FILEAPI("TestProjects/FileAPI.ucp");

	private String path;

	private TestProjectEnum(String path) {
		this.path = path;
	}

	/**
	 * @return test project path
	 * @return
	 */
	public String getPath() {
		return path;
	}

}
