/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage
 * @generated
 */
public interface RequirementFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	RequirementFactory eINSTANCE = org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementFactoryImpl
		.init();

	/**
	 * Returns a new object of class '<em>Non Functional Requirement</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Non Functional Requirement</em>'.
	 * @generated
	 */
	NonFunctionalRequirement createNonFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>Functional Requirement</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Functional Requirement</em>'.
	 * @generated
	 */
	FunctionalRequirement createFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>Use Case</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Use Case</em>'.
	 * @generated
	 */
	UseCase createUseCase();

	/**
	 * Returns a new object of class '<em>Scenario</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Actor</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Actor Instance</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Actor Instance</em>'.
	 * @generated
	 */
	ActorInstance createActorInstance();

	/**
	 * Returns a new object of class '<em>Step</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>System Function</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>System Function</em>'.
	 * @generated
	 */
	SystemFunction createSystemFunction();

	/**
	 * Returns a new object of class '<em>User Task</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>User Task</em>'.
	 * @generated
	 */
	UserTask createUserTask();

	/**
	 * Returns a new object of class '<em>Workspace</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Workspace</em>'.
	 * @generated
	 */
	Workspace createWorkspace();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementPackage getRequirementPackage();

} // RequirementFactory
