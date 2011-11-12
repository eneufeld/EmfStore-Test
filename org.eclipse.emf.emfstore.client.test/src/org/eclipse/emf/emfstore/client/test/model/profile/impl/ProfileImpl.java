/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.profile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.profile.Profile;
import org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage;
import org.eclipse.emf.emfstore.client.test.model.profile.Stereotype;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Profile</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfileImpl#getAffectedContainers <em>Affected
 * Containers</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfileImpl#getStereotypes <em>Stereotypes</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProfileImpl extends UnicaseModelElementImpl implements Profile {
	/**
	 * The cached value of the '{@link #getAffectedContainers() <em>Affected Containers</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAffectedContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<UnicaseModelElement> affectedContainers;

	/**
	 * The cached value of the '{@link #getStereotypes() <em>Stereotypes</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStereotypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Stereotype> stereotypes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UnicaseModelElement> getAffectedContainers() {
		if (affectedContainers == null) {
			affectedContainers = new EObjectResolvingEList<UnicaseModelElement>(UnicaseModelElement.class, this,
				ProfilePackage.PROFILE__AFFECTED_CONTAINERS);
		}
		return affectedContainers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Stereotype> getStereotypes() {
		if (stereotypes == null) {
			stereotypes = new EObjectContainmentWithInverseEList.Resolving<Stereotype>(Stereotype.class, this,
				ProfilePackage.PROFILE__STEREOTYPES, ProfilePackage.STEREOTYPE__PROFILE);
		}
		return stereotypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProfilePackage.PROFILE__STEREOTYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStereotypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProfilePackage.PROFILE__STEREOTYPES:
			return ((InternalEList<?>) getStereotypes()).basicRemove(otherEnd, msgs);
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
		case ProfilePackage.PROFILE__AFFECTED_CONTAINERS:
			return getAffectedContainers();
		case ProfilePackage.PROFILE__STEREOTYPES:
			return getStereotypes();
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
		case ProfilePackage.PROFILE__AFFECTED_CONTAINERS:
			getAffectedContainers().clear();
			getAffectedContainers().addAll((Collection<? extends UnicaseModelElement>) newValue);
			return;
		case ProfilePackage.PROFILE__STEREOTYPES:
			getStereotypes().clear();
			getStereotypes().addAll((Collection<? extends Stereotype>) newValue);
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
		case ProfilePackage.PROFILE__AFFECTED_CONTAINERS:
			getAffectedContainers().clear();
			return;
		case ProfilePackage.PROFILE__STEREOTYPES:
			getStereotypes().clear();
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
		case ProfilePackage.PROFILE__AFFECTED_CONTAINERS:
			return affectedContainers != null && !affectedContainers.isEmpty();
		case ProfilePackage.PROFILE__STEREOTYPES:
			return stereotypes != null && !stereotypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ProfileImpl
