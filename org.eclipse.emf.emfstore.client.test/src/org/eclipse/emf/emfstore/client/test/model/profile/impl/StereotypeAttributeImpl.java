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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage;
import org.eclipse.emf.emfstore.client.test.model.profile.Stereotype;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stereotype Attribute</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeImpl#getStereotype <em>
 * Stereotype</em>}</li>
 * <li>
 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeImpl#getStereotypeAttributeInstances
 * <em>Stereotype Attribute Instances</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class StereotypeAttributeImpl extends UnicaseModelElementImpl implements StereotypeAttribute {
	/**
	 * The cached value of the '{@link #getStereotypeAttributeInstances() <em>Stereotype Attribute Instances</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStereotypeAttributeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<StereotypeAttributeInstance> stereotypeAttributeInstances;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StereotypeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.STEREOTYPE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Stereotype getStereotype() {
		if (eContainerFeatureID() != ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE)
			return null;
		return (Stereotype) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Stereotype basicGetStereotype() {
		if (eContainerFeatureID() != ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE)
			return null;
		return (Stereotype) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStereotype(Stereotype newStereotype, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStereotype, ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE,
			msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStereotype(Stereotype newStereotype) {
		if (newStereotype != eInternalContainer()
			|| (eContainerFeatureID() != ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE && newStereotype != null)) {
			if (EcoreUtil.isAncestor(this, newStereotype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStereotype != null)
				msgs = ((InternalEObject) newStereotype).eInverseAdd(this,
					ProfilePackage.STEREOTYPE__STEREOTYPE_ATTRIBUTES, Stereotype.class, msgs);
			msgs = basicSetStereotype(newStereotype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE,
				newStereotype, newStereotype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StereotypeAttributeInstance> getStereotypeAttributeInstances() {
		if (stereotypeAttributeInstances == null) {
			stereotypeAttributeInstances = new EObjectWithInverseResolvingEList<StereotypeAttributeInstance>(
				StereotypeAttributeInstance.class, this,
				ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES,
				ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE);
		}
		return stereotypeAttributeInstances;
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStereotype((Stereotype) otherEnd, msgs);
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStereotypeAttributeInstances()).basicAdd(
				otherEnd, msgs);
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE:
			return basicSetStereotype(null, msgs);
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES:
			return ((InternalEList<?>) getStereotypeAttributeInstances()).basicRemove(otherEnd, msgs);
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE:
			return eInternalContainer().eInverseRemove(this, ProfilePackage.STEREOTYPE__STEREOTYPE_ATTRIBUTES,
				Stereotype.class, msgs);
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE:
			if (resolve)
				return getStereotype();
			return basicGetStereotype();
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES:
			return getStereotypeAttributeInstances();
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE:
			setStereotype((Stereotype) newValue);
			return;
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES:
			getStereotypeAttributeInstances().clear();
			getStereotypeAttributeInstances().addAll((Collection<? extends StereotypeAttributeInstance>) newValue);
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE:
			setStereotype((Stereotype) null);
			return;
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES:
			getStereotypeAttributeInstances().clear();
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE:
			return basicGetStereotype() != null;
		case ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES:
			return stereotypeAttributeInstances != null && !stereotypeAttributeInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StereotypeAttributeImpl
