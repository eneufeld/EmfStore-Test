/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.profile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.profile.Profile;
import org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage;
import org.eclipse.emf.emfstore.client.test.model.profile.Stereotype;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stereotype</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeImpl#isRequired <em>Required</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeImpl#getProfile <em>Profile</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeImpl#getStereotypeInstances <em>
 * Stereotype Instances</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeImpl#getStereotypeAttributes <em>
 * Stereotype Attributes</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StereotypeImpl extends UnicaseModelElementImpl implements Stereotype {
	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStereotypeInstances() <em>Stereotype Instances</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStereotypeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<StereotypeInstance> stereotypeInstances;

	/**
	 * The cached value of the '{@link #getStereotypeAttributes() <em>Stereotype Attributes</em>}' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStereotypeAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<StereotypeAttribute> stereotypeAttributes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StereotypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.STEREOTYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.STEREOTYPE__REQUIRED, oldRequired,
				required));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Profile getProfile() {
		if (eContainerFeatureID() != ProfilePackage.STEREOTYPE__PROFILE)
			return null;
		return (Profile) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Profile basicGetProfile() {
		if (eContainerFeatureID() != ProfilePackage.STEREOTYPE__PROFILE)
			return null;
		return (Profile) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetProfile(Profile newProfile, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProfile, ProfilePackage.STEREOTYPE__PROFILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProfile(Profile newProfile) {
		if (newProfile != eInternalContainer()
			|| (eContainerFeatureID() != ProfilePackage.STEREOTYPE__PROFILE && newProfile != null)) {
			if (EcoreUtil.isAncestor(this, newProfile))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProfile != null)
				msgs = ((InternalEObject) newProfile).eInverseAdd(this, ProfilePackage.PROFILE__STEREOTYPES,
					Profile.class, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.STEREOTYPE__PROFILE, newProfile,
				newProfile));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StereotypeInstance> getStereotypeInstances() {
		if (stereotypeInstances == null) {
			stereotypeInstances = new EObjectWithInverseResolvingEList<StereotypeInstance>(StereotypeInstance.class,
				this, ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES, ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE);
		}
		return stereotypeInstances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StereotypeAttribute> getStereotypeAttributes() {
		if (stereotypeAttributes == null) {
			stereotypeAttributes = new EObjectContainmentWithInverseEList.Resolving<StereotypeAttribute>(
				StereotypeAttribute.class, this, ProfilePackage.STEREOTYPE__STEREOTYPE_ATTRIBUTES,
				ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE);
		}
		return stereotypeAttributes;
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
		case ProfilePackage.STEREOTYPE__PROFILE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProfile((Profile) otherEnd, msgs);
		case ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStereotypeInstances()).basicAdd(otherEnd,
				msgs);
		case ProfilePackage.STEREOTYPE__STEREOTYPE_ATTRIBUTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStereotypeAttributes()).basicAdd(otherEnd,
				msgs);
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
		case ProfilePackage.STEREOTYPE__PROFILE:
			return basicSetProfile(null, msgs);
		case ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES:
			return ((InternalEList<?>) getStereotypeInstances()).basicRemove(otherEnd, msgs);
		case ProfilePackage.STEREOTYPE__STEREOTYPE_ATTRIBUTES:
			return ((InternalEList<?>) getStereotypeAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ProfilePackage.STEREOTYPE__PROFILE:
			return eInternalContainer().eInverseRemove(this, ProfilePackage.PROFILE__STEREOTYPES, Profile.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProfilePackage.STEREOTYPE__REQUIRED:
			return isRequired();
		case ProfilePackage.STEREOTYPE__PROFILE:
			if (resolve)
				return getProfile();
			return basicGetProfile();
		case ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES:
			return getStereotypeInstances();
		case ProfilePackage.STEREOTYPE__STEREOTYPE_ATTRIBUTES:
			return getStereotypeAttributes();
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
		case ProfilePackage.STEREOTYPE__REQUIRED:
			setRequired((Boolean) newValue);
			return;
		case ProfilePackage.STEREOTYPE__PROFILE:
			setProfile((Profile) newValue);
			return;
		case ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES:
			getStereotypeInstances().clear();
			getStereotypeInstances().addAll((Collection<? extends StereotypeInstance>) newValue);
			return;
		case ProfilePackage.STEREOTYPE__STEREOTYPE_ATTRIBUTES:
			getStereotypeAttributes().clear();
			getStereotypeAttributes().addAll((Collection<? extends StereotypeAttribute>) newValue);
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
		case ProfilePackage.STEREOTYPE__REQUIRED:
			setRequired(REQUIRED_EDEFAULT);
			return;
		case ProfilePackage.STEREOTYPE__PROFILE:
			setProfile((Profile) null);
			return;
		case ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES:
			getStereotypeInstances().clear();
			return;
		case ProfilePackage.STEREOTYPE__STEREOTYPE_ATTRIBUTES:
			getStereotypeAttributes().clear();
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
		case ProfilePackage.STEREOTYPE__REQUIRED:
			return required != REQUIRED_EDEFAULT;
		case ProfilePackage.STEREOTYPE__PROFILE:
			return basicGetProfile() != null;
		case ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES:
			return stereotypeInstances != null && !stereotypeInstances.isEmpty();
		case ProfilePackage.STEREOTYPE__STEREOTYPE_ATTRIBUTES:
			return stereotypeAttributes != null && !stereotypeAttributes.isEmpty();
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
		result.append(" (required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} // StereotypeImpl
