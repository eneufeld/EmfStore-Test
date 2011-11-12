/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.state.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.emfstore.client.test.model.state.State;
import org.eclipse.emf.emfstore.client.test.model.state.StatePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>State</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.impl.StateImpl#getExitConditions <em>Exit Conditions
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.impl.StateImpl#getActivities <em>Activities</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.impl.StateImpl#getEntryConditions <em>Entry Conditions
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StateImpl extends StateNodeImpl implements State {
	/**
	 * The default value of the '{@link #getExitConditions() <em>Exit Conditions</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getExitConditions()
	 * @generated
	 * @ordered
	 */
	protected static final String EXIT_CONDITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExitConditions() <em>Exit Conditions</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getExitConditions()
	 * @generated
	 * @ordered
	 */
	protected String exitConditions = EXIT_CONDITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivities() <em>Activities</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected String activities = ACTIVITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryConditions() <em>Entry Conditions</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getEntryConditions()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_CONDITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryConditions() <em>Entry Conditions</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getEntryConditions()
	 * @generated
	 * @ordered
	 */
	protected String entryConditions = ENTRY_CONDITIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getExitConditions() {
		return exitConditions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExitConditions(String newExitConditions) {
		String oldExitConditions = exitConditions;
		exitConditions = newExitConditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__EXIT_CONDITIONS,
				oldExitConditions, exitConditions));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getActivities() {
		return activities;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setActivities(String newActivities) {
		String oldActivities = activities;
		activities = newActivities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__ACTIVITIES, oldActivities,
				activities));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getEntryConditions() {
		return entryConditions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntryConditions(String newEntryConditions) {
		String oldEntryConditions = entryConditions;
		entryConditions = newEntryConditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__ENTRY_CONDITIONS,
				oldEntryConditions, entryConditions));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatePackage.STATE__EXIT_CONDITIONS:
			return getExitConditions();
		case StatePackage.STATE__ACTIVITIES:
			return getActivities();
		case StatePackage.STATE__ENTRY_CONDITIONS:
			return getEntryConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatePackage.STATE__EXIT_CONDITIONS:
			setExitConditions((String) newValue);
			return;
		case StatePackage.STATE__ACTIVITIES:
			setActivities((String) newValue);
			return;
		case StatePackage.STATE__ENTRY_CONDITIONS:
			setEntryConditions((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StatePackage.STATE__EXIT_CONDITIONS:
			setExitConditions(EXIT_CONDITIONS_EDEFAULT);
			return;
		case StatePackage.STATE__ACTIVITIES:
			setActivities(ACTIVITIES_EDEFAULT);
			return;
		case StatePackage.STATE__ENTRY_CONDITIONS:
			setEntryConditions(ENTRY_CONDITIONS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StatePackage.STATE__EXIT_CONDITIONS:
			return EXIT_CONDITIONS_EDEFAULT == null ? exitConditions != null : !EXIT_CONDITIONS_EDEFAULT
				.equals(exitConditions);
		case StatePackage.STATE__ACTIVITIES:
			return ACTIVITIES_EDEFAULT == null ? activities != null : !ACTIVITIES_EDEFAULT.equals(activities);
		case StatePackage.STATE__ENTRY_CONDITIONS:
			return ENTRY_CONDITIONS_EDEFAULT == null ? entryConditions != null : !ENTRY_CONDITIONS_EDEFAULT
				.equals(entryConditions);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (exitConditions: ");
		result.append(exitConditions);
		result.append(", activities: ");
		result.append(activities);
		result.append(", entryConditions: ");
		result.append(entryConditions);
		result.append(')');
		return result.toString();
	}

} // StateImpl
