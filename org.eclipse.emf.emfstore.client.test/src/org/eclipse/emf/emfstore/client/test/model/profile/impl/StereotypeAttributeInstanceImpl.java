/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.profile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stereotype Attribute Instance</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceImpl#getStereotypeInstance
 * <em>Stereotype Instance</em>}</li>
 * <li>
 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceImpl#getStereotypeAttribute
 * <em>Stereotype Attribute</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class StereotypeAttributeInstanceImpl extends UnicaseModelElementImpl implements
	StereotypeAttributeInstance {
	/**
	 * The cached value of the '{@link #getStereotypeAttribute() <em>Stereotype Attribute</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStereotypeAttribute()
	 * @generated
	 * @ordered
	 */
	protected StereotypeAttribute stereotypeAttribute;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StereotypeAttributeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.STEREOTYPE_ATTRIBUTE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StereotypeInstance getStereotypeInstance() {
		if (eContainerFeatureID() != ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE)
			return null;
		return (StereotypeInstance) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StereotypeInstance basicGetStereotypeInstance() {
		if (eContainerFeatureID() != ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE)
			return null;
		return (StereotypeInstance) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStereotypeInstance(StereotypeInstance newStereotypeInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStereotypeInstance,
			ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStereotypeInstance(StereotypeInstance newStereotypeInstance) {
		if (newStereotypeInstance != eInternalContainer()
			|| (eContainerFeatureID() != ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE && newStereotypeInstance != null)) {
			if (EcoreUtil.isAncestor(this, newStereotypeInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStereotypeInstance != null)
				msgs = ((InternalEObject) newStereotypeInstance).eInverseAdd(this,
					ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES, StereotypeInstance.class, msgs);
			msgs = basicSetStereotypeInstance(newStereotypeInstance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE, newStereotypeInstance,
				newStereotypeInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StereotypeAttribute getStereotypeAttribute() {
		if (stereotypeAttribute != null && stereotypeAttribute.eIsProxy()) {
			InternalEObject oldStereotypeAttribute = (InternalEObject) stereotypeAttribute;
			stereotypeAttribute = (StereotypeAttribute) eResolveProxy(oldStereotypeAttribute);
			if (stereotypeAttribute != oldStereotypeAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE, oldStereotypeAttribute,
						stereotypeAttribute));
			}
		}
		return stereotypeAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StereotypeAttribute basicGetStereotypeAttribute() {
		return stereotypeAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStereotypeAttribute(StereotypeAttribute newStereotypeAttribute,
		NotificationChain msgs) {
		StereotypeAttribute oldStereotypeAttribute = stereotypeAttribute;
		stereotypeAttribute = newStereotypeAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE, oldStereotypeAttribute,
				newStereotypeAttribute);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStereotypeAttribute(StereotypeAttribute newStereotypeAttribute) {
		if (newStereotypeAttribute != stereotypeAttribute) {
			NotificationChain msgs = null;
			if (stereotypeAttribute != null)
				msgs = ((InternalEObject) stereotypeAttribute).eInverseRemove(this,
					ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES, StereotypeAttribute.class,
					msgs);
			if (newStereotypeAttribute != null)
				msgs = ((InternalEObject) newStereotypeAttribute).eInverseAdd(this,
					ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES, StereotypeAttribute.class,
					msgs);
			msgs = basicSetStereotypeAttribute(newStereotypeAttribute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE, newStereotypeAttribute,
				newStereotypeAttribute));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStereotypeInstance((StereotypeInstance) otherEnd, msgs);
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE:
			if (stereotypeAttribute != null)
				msgs = ((InternalEObject) stereotypeAttribute).eInverseRemove(this,
					ProfilePackage.STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES, StereotypeAttribute.class,
					msgs);
			return basicSetStereotypeAttribute((StereotypeAttribute) otherEnd, msgs);
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE:
			return basicSetStereotypeInstance(null, msgs);
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE:
			return basicSetStereotypeAttribute(null, msgs);
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE:
			return eInternalContainer().eInverseRemove(this,
				ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES, StereotypeInstance.class, msgs);
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE:
			if (resolve)
				return getStereotypeInstance();
			return basicGetStereotypeInstance();
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE:
			if (resolve)
				return getStereotypeAttribute();
			return basicGetStereotypeAttribute();
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE:
			setStereotypeInstance((StereotypeInstance) newValue);
			return;
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE:
			setStereotypeAttribute((StereotypeAttribute) newValue);
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE:
			setStereotypeInstance((StereotypeInstance) null);
			return;
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE:
			setStereotypeAttribute((StereotypeAttribute) null);
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
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE:
			return basicGetStereotypeInstance() != null;
		case ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE:
			return stereotypeAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} // StereotypeAttributeInstanceImpl
