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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.ModelPackage;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage;
import org.eclipse.emf.emfstore.client.test.model.profile.Stereotype;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stereotype Instance</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeInstanceImpl#getStereotype <em>
 * Stereotype</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeInstanceImpl#getModelElement <em>Model
 * Element</em>}</li>
 * <li>
 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeInstanceImpl#getStereotypeAttributeInstances
 * <em>Stereotype Attribute Instances</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StereotypeInstanceImpl extends UnicaseModelElementImpl implements StereotypeInstance {
	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected Stereotype stereotype;

	/**
	 * The cached value of the '{@link #getStereotypeAttributeInstances() <em>Stereotype Attribute Instances</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
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
	protected StereotypeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.STEREOTYPE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Stereotype getStereotype() {
		if (stereotype != null && stereotype.eIsProxy()) {
			InternalEObject oldStereotype = (InternalEObject) stereotype;
			stereotype = (Stereotype) eResolveProxy(oldStereotype);
			if (stereotype != oldStereotype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE, oldStereotype, stereotype));
			}
		}
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Stereotype basicGetStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStereotype(Stereotype newStereotype, NotificationChain msgs) {
		Stereotype oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE, oldStereotype, newStereotype);
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
	public void setStereotype(Stereotype newStereotype) {
		if (newStereotype != stereotype) {
			NotificationChain msgs = null;
			if (stereotype != null)
				msgs = ((InternalEObject) stereotype).eInverseRemove(this,
					ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES, Stereotype.class, msgs);
			if (newStereotype != null)
				msgs = ((InternalEObject) newStereotype).eInverseAdd(this,
					ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES, Stereotype.class, msgs);
			msgs = basicSetStereotype(newStereotype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE,
				newStereotype, newStereotype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnicaseModelElement getModelElement() {
		if (eContainerFeatureID() != ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT)
			return null;
		return (UnicaseModelElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnicaseModelElement basicGetModelElement() {
		if (eContainerFeatureID() != ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT)
			return null;
		return (UnicaseModelElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetModelElement(UnicaseModelElement newModelElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModelElement, ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT,
			msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setModelElement(UnicaseModelElement newModelElement) {
		if (newModelElement != eInternalContainer()
			|| (eContainerFeatureID() != ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT && newModelElement != null)) {
			if (EcoreUtil.isAncestor(this, newModelElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelElement != null)
				msgs = ((InternalEObject) newModelElement).eInverseAdd(this,
					ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES, UnicaseModelElement.class, msgs);
			msgs = basicSetModelElement(newModelElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT,
				newModelElement, newModelElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StereotypeAttributeInstance> getStereotypeAttributeInstances() {
		if (stereotypeAttributeInstances == null) {
			stereotypeAttributeInstances = new EObjectContainmentWithInverseEList.Resolving<StereotypeAttributeInstance>(
				StereotypeAttributeInstance.class, this,
				ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES,
				ProfilePackage.STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE);
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
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE:
			if (stereotype != null)
				msgs = ((InternalEObject) stereotype).eInverseRemove(this,
					ProfilePackage.STEREOTYPE__STEREOTYPE_INSTANCES, Stereotype.class, msgs);
			return basicSetStereotype((Stereotype) otherEnd, msgs);
		case ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModelElement((UnicaseModelElement) otherEnd, msgs);
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES:
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
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE:
			return basicSetStereotype(null, msgs);
		case ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT:
			return basicSetModelElement(null, msgs);
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES:
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
		case ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT:
			return eInternalContainer().eInverseRemove(this,
				ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES, UnicaseModelElement.class, msgs);
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
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE:
			if (resolve)
				return getStereotype();
			return basicGetStereotype();
		case ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT:
			if (resolve)
				return getModelElement();
			return basicGetModelElement();
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES:
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
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE:
			setStereotype((Stereotype) newValue);
			return;
		case ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT:
			setModelElement((UnicaseModelElement) newValue);
			return;
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES:
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
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE:
			setStereotype((Stereotype) null);
			return;
		case ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT:
			setModelElement((UnicaseModelElement) null);
			return;
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES:
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
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE:
			return stereotype != null;
		case ProfilePackage.STEREOTYPE_INSTANCE__MODEL_ELEMENT:
			return basicGetModelElement() != null;
		case ProfilePackage.STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES:
			return stereotypeAttributeInstances != null && !stereotypeAttributeInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StereotypeInstanceImpl
