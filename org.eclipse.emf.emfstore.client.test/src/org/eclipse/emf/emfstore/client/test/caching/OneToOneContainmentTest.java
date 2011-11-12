/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.caching;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationaleFactory;
import org.eclipse.emf.emfstore.client.test.model.rationale.Solution;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.junit.Test;

/**
 * Tests the Attribute Operation.
 * 
 * @author koegel
 */
public class OneToOneContainmentTest extends CachingTest {

	/**
	 * Add a one to one containment child and check for project cache update.
	 */
	@Test
	public void addIssueSolution() {

		Issue issue = RationaleFactory.eINSTANCE.createIssue();
		getProject().addModelElement(issue);

		assertTrue(getProject().containsInstance(issue));
		assertEquals(getProject(), ModelUtil.getProject(issue));

		Solution solution = RationaleFactory.eINSTANCE.createSolution();
		issue.setSolution(solution);

		assertTrue(getProject().containsInstance(solution));
		assertEquals(getProject(), ModelUtil.getProject(solution));
		assertEquals(issue, solution.getIssue());
		assertEquals(solution, issue.getSolution());
	}
}