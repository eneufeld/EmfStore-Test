/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.change;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.change.ChangePackage
 * @generated
 */
public interface ChangeFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ChangeFactory eINSTANCE = org.eclipse.emf.emfstore.client.test.model.change.impl.ChangeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Merging Issue</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Merging Issue</em>'.
	 * @generated
	 */
	MergingIssue createMergingIssue();

	/**
	 * Returns a new object of class '<em>Merging Proposal</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Merging Proposal</em>'.
	 * @generated
	 */
	MergingProposal createMergingProposal();

	/**
	 * Returns a new object of class '<em>Merging Solution</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Merging Solution</em>'.
	 * @generated
	 */
	MergingSolution createMergingSolution();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChangePackage getChangePackage();

} // ChangeFactory
