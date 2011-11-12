/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.state;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>State</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.State#getExitConditions <em>Exit Conditions</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.State#getActivities <em>Activities</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.State#getEntryConditions <em>Entry Conditions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.state.StatePackage#getState()
 * @model
 * @generated
 */
public interface State extends StateNode {
	/**
	 * Returns the value of the '<em><b>Exit Conditions</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Conditions</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exit Conditions</em>' attribute.
	 * @see #setExitConditions(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.state.StatePackage#getState_ExitConditions()
	 * @model
	 * @generated
	 */
	String getExitConditions();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.state.State#getExitConditions
	 * <em>Exit Conditions</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Exit Conditions</em>' attribute.
	 * @see #getExitConditions()
	 * @generated
	 */
	void setExitConditions(String value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Activities</em>' attribute.
	 * @see #setActivities(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.state.StatePackage#getState_Activities()
	 * @model
	 * @generated
	 */
	String getActivities();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.state.State#getActivities
	 * <em>Activities</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Activities</em>' attribute.
	 * @see #getActivities()
	 * @generated
	 */
	void setActivities(String value);

	/**
	 * Returns the value of the '<em><b>Entry Conditions</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Conditions</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry Conditions</em>' attribute.
	 * @see #setEntryConditions(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.state.StatePackage#getState_EntryConditions()
	 * @model
	 * @generated
	 */
	String getEntryConditions();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.state.State#getEntryConditions
	 * <em>Entry Conditions</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Entry Conditions</em>' attribute.
	 * @see #getEntryConditions()
	 * @generated
	 */
	void setEntryConditions(String value);

} // State
