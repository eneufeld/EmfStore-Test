/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage
 * @generated
 */
public interface RationaleFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	RationaleFactory eINSTANCE = org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationaleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Issue</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Issue</em>'.
	 * @generated
	 */
	Issue createIssue();

	/**
	 * Returns a new object of class '<em>Proposal</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Proposal</em>'.
	 * @generated
	 */
	Proposal createProposal();

	/**
	 * Returns a new object of class '<em>Solution</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Solution</em>'.
	 * @generated
	 */
	Solution createSolution();

	/**
	 * Returns a new object of class '<em>Criterion</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Criterion</em>'.
	 * @generated
	 */
	Criterion createCriterion();

	/**
	 * Returns a new object of class '<em>Assessment</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Assessment</em>'.
	 * @generated
	 */
	Assessment createAssessment();

	/**
	 * Returns a new object of class '<em>Comment</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Audio Comment</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Audio Comment</em>'.
	 * @generated
	 */
	AudioComment createAudioComment();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	RationalePackage getRationalePackage();

} // RationaleFactory
