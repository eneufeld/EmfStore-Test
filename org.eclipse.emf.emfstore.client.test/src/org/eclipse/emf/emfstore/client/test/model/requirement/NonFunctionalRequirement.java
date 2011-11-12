/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.rationale.Criterion;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Non Functional Requirement</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getRestrictedScenarios
 * <em>Restricted Scenarios</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getRestrictedUseCases <em>
 * Restricted Use Cases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getSystemFunctions <em>
 * System Functions</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getUserTasks <em>User
 * Tasks</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getNonFunctionalRequirement()
 * @model
 * @generated
 */
public interface NonFunctionalRequirement extends Criterion {
	/**
	 * Returns the value of the '<em><b>Restricted Scenarios</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario}. It is bidirectional and its opposite is
	 * '{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getNonFunctionalRequirements
	 * <em>Non Functional Requirements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted Scenarios</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Restricted Scenarios</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getNonFunctionalRequirement_RestrictedScenarios()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getNonFunctionalRequirements
	 * @model opposite="nonFunctionalRequirements" annotation="org.unicase.ui.meeditor priority='9.1' position='right'"
	 * @generated
	 */
	EList<Scenario> getRestrictedScenarios();

	/**
	 * Returns the value of the '<em><b>Restricted Use Cases</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getNonFunctionalRequirements
	 * <em>Non Functional Requirements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted Use Cases</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Restricted Use Cases</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getNonFunctionalRequirement_RestrictedUseCases()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getNonFunctionalRequirements
	 * @model opposite="nonFunctionalRequirements" annotation="org.unicase.ui.meeditor priority='9.2' position='right'"
	 * @generated
	 */
	EList<UseCase> getRestrictedUseCases();

	/**
	 * Returns the value of the '<em><b>System Functions</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction}. It is bidirectional and its
	 * opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getNonFunctionalRequirement
	 * <em>Non Functional Requirement</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Functions</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>System Functions</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getNonFunctionalRequirement_SystemFunctions()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getNonFunctionalRequirement
	 * @model opposite="nonFunctionalRequirement" annotation="org.unicase.ui.meeditor priority='13.0' position='right'"
	 * @generated
	 */
	EList<SystemFunction> getSystemFunctions();

	/**
	 * Returns the value of the '<em><b>User Tasks</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask}. It is bidirectional and its opposite is
	 * '{@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getNonFunctionalRequirements
	 * <em>Non Functional Requirements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Tasks</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>User Tasks</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getNonFunctionalRequirement_UserTasks()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getNonFunctionalRequirements
	 * @model opposite="nonFunctionalRequirements" annotation="org.unicase.ui.meeditor priority='14.0' position='right'"
	 * @generated
	 */
	EList<UserTask> getUserTasks();

} // NonFunctionalRequirement
