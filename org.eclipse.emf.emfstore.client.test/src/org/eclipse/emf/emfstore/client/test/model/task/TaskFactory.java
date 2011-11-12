/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage
 * @generated
 */
public interface TaskFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TaskFactory eINSTANCE = org.eclipse.emf.emfstore.client.test.model.task.impl.TaskFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Action Item</em>'.
	 * @generated
	 */
	ActionItem createActionItem();

	/**
	 * Returns a new object of class '<em>Work Package</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Package</em>'.
	 * @generated
	 */
	WorkPackage createWorkPackage();

	/**
	 * Returns a new object of class '<em>Milestone</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Milestone</em>'.
	 * @generated
	 */
	Milestone createMilestone();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskPackage getTaskPackage();

} // TaskFactory
