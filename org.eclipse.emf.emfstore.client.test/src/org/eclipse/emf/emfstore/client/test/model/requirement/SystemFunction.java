/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>System Function</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getInput <em>Input</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getOutput <em>Output</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getException <em>Exception</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getNonFunctionalRequirement <em>Non
 * Functional Requirement</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getUsecases <em>Usecases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getWorkspace <em>Workspace</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getSystemFunction()
 * @model
 * @generated
 */
public interface SystemFunction extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getSystemFunction_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getInput
	 * <em>Input</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getSystemFunction_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getOutput
	 * <em>Output</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exception</em>' attribute.
	 * @see #setException(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getSystemFunction_Exception()
	 * @model
	 * @generated
	 */
	String getException();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getException
	 * <em>Exception</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Exception</em>' attribute.
	 * @see #getException()
	 * @generated
	 */
	void setException(String value);

	/**
	 * Returns the value of the '<em><b>Non Functional Requirement</b></em>' reference. It is bidirectional and its
	 * opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getSystemFunctions
	 * <em>System Functions</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Functional Requirement</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Non Functional Requirement</em>' reference.
	 * @see #setNonFunctionalRequirement(NonFunctionalRequirement)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getSystemFunction_NonFunctionalRequirement()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getSystemFunctions
	 * @model opposite="systemFunctions"
	 * @generated
	 */
	NonFunctionalRequirement getNonFunctionalRequirement();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getNonFunctionalRequirement
	 * <em>Non Functional Requirement</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Non Functional Requirement</em>' reference.
	 * @see #getNonFunctionalRequirement()
	 * @generated
	 */
	void setNonFunctionalRequirement(NonFunctionalRequirement value);

	/**
	 * Returns the value of the '<em><b>Usecases</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getSystemFunctions
	 * <em>System Functions</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usecases</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Usecases</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getSystemFunction_Usecases()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getSystemFunctions
	 * @model opposite="systemFunctions" annotation="org.unicase.ui.meeditor priority='12.0' position='right'"
	 * @generated
	 */
	EList<UseCase> getUsecases();

	/**
	 * Returns the value of the '<em><b>Workspace</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Workspace#getSystemFunctions
	 * <em>System Functions</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workspace</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Workspace</em>' reference.
	 * @see #setWorkspace(Workspace)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getSystemFunction_Workspace()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Workspace#getSystemFunctions
	 * @model opposite="systemFunctions"
	 * @generated
	 */
	Workspace getWorkspace();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getWorkspace
	 * <em>Workspace</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Workspace</em>' reference.
	 * @see #getWorkspace()
	 * @generated
	 */
	void setWorkspace(Workspace value);

} // SystemFunction
