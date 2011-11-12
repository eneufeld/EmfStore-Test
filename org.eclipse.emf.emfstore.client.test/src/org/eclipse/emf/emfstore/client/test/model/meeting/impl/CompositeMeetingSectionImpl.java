/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.meeting.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.meeting.CompositeMeetingSection;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingSection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Composite Meeting Section</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.CompositeMeetingSectionImpl#getSubsections <em>
 * Subsections</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CompositeMeetingSectionImpl extends MeetingSectionImpl implements CompositeMeetingSection {
	/**
	 * The cached value of the '{@link #getSubsections() <em>Subsections</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubsections()
	 * @generated
	 * @ordered
	 */
	protected EList<MeetingSection> subsections;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompositeMeetingSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeetingPackage.Literals.COMPOSITE_MEETING_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MeetingSection> getSubsections() {
		if (subsections == null) {
			subsections = new EObjectContainmentEList.Resolving<MeetingSection>(MeetingSection.class, this,
				MeetingPackage.COMPOSITE_MEETING_SECTION__SUBSECTIONS);
		}
		return subsections;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MeetingPackage.COMPOSITE_MEETING_SECTION__SUBSECTIONS:
			return ((InternalEList<?>) getSubsections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MeetingPackage.COMPOSITE_MEETING_SECTION__SUBSECTIONS:
			return getSubsections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MeetingPackage.COMPOSITE_MEETING_SECTION__SUBSECTIONS:
			getSubsections().clear();
			getSubsections().addAll((Collection<? extends MeetingSection>) newValue);
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
		case MeetingPackage.COMPOSITE_MEETING_SECTION__SUBSECTIONS:
			getSubsections().clear();
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
		case MeetingPackage.COMPOSITE_MEETING_SECTION__SUBSECTIONS:
			return subsections != null && !subsections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CompositeMeetingSectionImpl
