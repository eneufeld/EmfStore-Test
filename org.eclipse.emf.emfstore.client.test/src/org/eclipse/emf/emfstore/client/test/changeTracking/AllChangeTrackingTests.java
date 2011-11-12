/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.changeTracking;

import org.eclipse.emf.emfstore.client.test.changeTracking.canonization.AllCanonizationTests;
import org.eclipse.emf.emfstore.client.test.changeTracking.commands.AllCommandTests;
import org.eclipse.emf.emfstore.client.test.changeTracking.notification.recording.AllNotificationTests;
import org.eclipse.emf.emfstore.client.test.changeTracking.operations.AllOperationTests;
import org.eclipse.emf.emfstore.client.test.changeTracking.topology.AllTopologyTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test Suite for running all tests of workspace.
 * 
 * @author chodnick
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ AllNotificationTests.class, AllOperationTests.class, AllTopologyTests.class,
	AllCanonizationTests.class, AllCommandTests.class })
public class AllChangeTrackingTests {

}
