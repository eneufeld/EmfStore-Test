/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.meeting.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingSection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingSectionImpl#getAllocatedTime <em>Allocated
 * Time</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class MeetingSectionImpl extends UnicaseModelElementImpl implements MeetingSection {
	/**
	 * The default value of the '{@link #getAllocatedTime() <em>Allocated Time</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAllocatedTime()
	 * @generated
	 * @ordered
	 */
	protected static final int ALLOCATED_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAllocatedTime() <em>Allocated Time</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAllocatedTime()
	 * @generated
	 * @ordered
	 */
	protected int allocatedTime = ALLOCATED_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MeetingSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeetingPackage.Literals.MEETING_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getAllocatedTime() {
		return allocatedTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAllocatedTime(int newAllocatedTime) {
		int oldAllocatedTime = allocatedTime;
		allocatedTime = newAllocatedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeetingPackage.MEETING_SECTION__ALLOCATED_TIME,
				oldAllocatedTime, allocatedTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MeetingPackage.MEETING_SECTION__ALLOCATED_TIME:
			return getAllocatedTime();
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
		case MeetingPackage.MEETING_SECTION__ALLOCATED_TIME:
			setAllocatedTime((Integer) newValue);
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
		case MeetingPackage.MEETING_SECTION__ALLOCATED_TIME:
			setAllocatedTime(ALLOCATED_TIME_EDEFAULT);
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
		case MeetingPackage.MEETING_SECTION__ALLOCATED_TIME:
			return allocatedTime != ALLOCATED_TIME_EDEFAULT;
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
		result.append(" (allocatedTime: ");
		result.append(allocatedTime);
		result.append(')');
		return result.toString();
	}

} // MeetingSectionImpl
