/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.component.Component;
import org.eclipse.emf.emfstore.client.test.model.component.ComponentPackage;
import org.eclipse.emf.emfstore.client.test.model.component.ComponentService;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.component.impl.ComponentImpl#getPackages <em>Packages</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.component.impl.ComponentImpl#getOfferedServices <em>Offered
 * Services</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.component.impl.ComponentImpl#getConsumedServices <em>Consumed
 * Services</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.component.impl.ComponentImpl#getSubsystems <em>Subsystems</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ComponentImpl extends UnicaseModelElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.emf.emfstore.client.test.model.classes.Package> packages;

	/**
	 * The cached value of the '{@link #getOfferedServices() <em>Offered Services</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOfferedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentService> offeredServices;

	/**
	 * The cached value of the '{@link #getConsumedServices() <em>Consumed Services</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConsumedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentService> consumedServices;

	/**
	 * The cached value of the '{@link #getSubsystems() <em>Subsystems</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSubsystems()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.emf.emfstore.client.test.model.classes.Package> subsystems;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<org.eclipse.emf.emfstore.client.test.model.classes.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectResolvingEList<org.eclipse.emf.emfstore.client.test.model.classes.Package>(
				org.eclipse.emf.emfstore.client.test.model.classes.Package.class, this,
				ComponentPackage.COMPONENT__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ComponentService> getOfferedServices() {
		if (offeredServices == null) {
			offeredServices = new EObjectContainmentWithInverseEList.Resolving<ComponentService>(
				ComponentService.class, this, ComponentPackage.COMPONENT__OFFERED_SERVICES,
				ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT);
		}
		return offeredServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ComponentService> getConsumedServices() {
		if (consumedServices == null) {
			consumedServices = new EObjectWithInverseResolvingEList.ManyInverse<ComponentService>(
				ComponentService.class, this, ComponentPackage.COMPONENT__CONSUMED_SERVICES,
				ComponentPackage.COMPONENT_SERVICE__CONSUMING_COMPONENTS);
		}
		return consumedServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<org.eclipse.emf.emfstore.client.test.model.classes.Package> getSubsystems() {
		if (subsystems == null) {
			subsystems = new EObjectResolvingEList<org.eclipse.emf.emfstore.client.test.model.classes.Package>(
				org.eclipse.emf.emfstore.client.test.model.classes.Package.class, this,
				ComponentPackage.COMPONENT__SUBSYSTEMS);
		}
		return subsystems;
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
		case ComponentPackage.COMPONENT__OFFERED_SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOfferedServices()).basicAdd(otherEnd, msgs);
		case ComponentPackage.COMPONENT__CONSUMED_SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConsumedServices()).basicAdd(otherEnd, msgs);
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
		case ComponentPackage.COMPONENT__OFFERED_SERVICES:
			return ((InternalEList<?>) getOfferedServices()).basicRemove(otherEnd, msgs);
		case ComponentPackage.COMPONENT__CONSUMED_SERVICES:
			return ((InternalEList<?>) getConsumedServices()).basicRemove(otherEnd, msgs);
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
		case ComponentPackage.COMPONENT__PACKAGES:
			return getPackages();
		case ComponentPackage.COMPONENT__OFFERED_SERVICES:
			return getOfferedServices();
		case ComponentPackage.COMPONENT__CONSUMED_SERVICES:
			return getConsumedServices();
		case ComponentPackage.COMPONENT__SUBSYSTEMS:
			return getSubsystems();
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
		case ComponentPackage.COMPONENT__PACKAGES:
			getPackages().clear();
			getPackages().addAll(
				(Collection<? extends org.eclipse.emf.emfstore.client.test.model.classes.Package>) newValue);
			return;
		case ComponentPackage.COMPONENT__OFFERED_SERVICES:
			getOfferedServices().clear();
			getOfferedServices().addAll((Collection<? extends ComponentService>) newValue);
			return;
		case ComponentPackage.COMPONENT__CONSUMED_SERVICES:
			getConsumedServices().clear();
			getConsumedServices().addAll((Collection<? extends ComponentService>) newValue);
			return;
		case ComponentPackage.COMPONENT__SUBSYSTEMS:
			getSubsystems().clear();
			getSubsystems().addAll(
				(Collection<? extends org.eclipse.emf.emfstore.client.test.model.classes.Package>) newValue);
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
		case ComponentPackage.COMPONENT__PACKAGES:
			getPackages().clear();
			return;
		case ComponentPackage.COMPONENT__OFFERED_SERVICES:
			getOfferedServices().clear();
			return;
		case ComponentPackage.COMPONENT__CONSUMED_SERVICES:
			getConsumedServices().clear();
			return;
		case ComponentPackage.COMPONENT__SUBSYSTEMS:
			getSubsystems().clear();
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
		case ComponentPackage.COMPONENT__PACKAGES:
			return packages != null && !packages.isEmpty();
		case ComponentPackage.COMPONENT__OFFERED_SERVICES:
			return offeredServices != null && !offeredServices.isEmpty();
		case ComponentPackage.COMPONENT__CONSUMED_SERVICES:
			return consumedServices != null && !consumedServices.isEmpty();
		case ComponentPackage.COMPONENT__SUBSYSTEMS:
			return subsystems != null && !subsystems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ComponentImpl
