/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes.impl;

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
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.Dependency;
import org.eclipse.emf.emfstore.client.test.model.classes.PackageElement;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Package Element</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageElementImpl#getParentPackage <em>Parent
 * Package</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageElementImpl#getOutgoingDependencies <em>
 * Outgoing Dependencies</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageElementImpl#getIncomingDependencies <em>
 * Incoming Dependencies</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class PackageElementImpl extends UnicaseModelElementImpl implements PackageElement {
	/**
	 * The cached value of the '{@link #getOutgoingDependencies() <em>Outgoing Dependencies</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutgoingDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> outgoingDependencies;

	/**
	 * The cached value of the '{@link #getIncomingDependencies() <em>Incoming Dependencies</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncomingDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> incomingDependencies;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PackageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.PACKAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Package getParentPackage() {
		if (eContainerFeatureID() != ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE)
			return null;
		return (org.eclipse.emf.emfstore.client.test.model.classes.Package) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Package basicGetParentPackage() {
		if (eContainerFeatureID() != ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE)
			return null;
		return (org.eclipse.emf.emfstore.client.test.model.classes.Package) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParentPackage(
		org.eclipse.emf.emfstore.client.test.model.classes.Package newParentPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentPackage, ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE,
			msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentPackage(org.eclipse.emf.emfstore.client.test.model.classes.Package newParentPackage) {
		if (newParentPackage != eInternalContainer()
			|| (eContainerFeatureID() != ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE && newParentPackage != null)) {
			if (EcoreUtil.isAncestor(this, newParentPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentPackage != null)
				msgs = ((InternalEObject) newParentPackage).eInverseAdd(this,
					ClassesPackage.PACKAGE__CONTAINED_PACKAGE_ELEMENTS,
					org.eclipse.emf.emfstore.client.test.model.classes.Package.class, msgs);
			msgs = basicSetParentPackage(newParentPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE,
				newParentPackage, newParentPackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Dependency> getOutgoingDependencies() {
		if (outgoingDependencies == null) {
			outgoingDependencies = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this,
				ClassesPackage.PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES, ClassesPackage.DEPENDENCY__SOURCE);
		}
		return outgoingDependencies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Dependency> getIncomingDependencies() {
		if (incomingDependencies == null) {
			incomingDependencies = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this,
				ClassesPackage.PACKAGE_ELEMENT__INCOMING_DEPENDENCIES, ClassesPackage.DEPENDENCY__TARGET);
		}
		return incomingDependencies;
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
		case ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParentPackage((org.eclipse.emf.emfstore.client.test.model.classes.Package) otherEnd, msgs);
		case ClassesPackage.PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingDependencies()).basicAdd(otherEnd,
				msgs);
		case ClassesPackage.PACKAGE_ELEMENT__INCOMING_DEPENDENCIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingDependencies()).basicAdd(otherEnd,
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
		case ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE:
			return basicSetParentPackage(null, msgs);
		case ClassesPackage.PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES:
			return ((InternalEList<?>) getOutgoingDependencies()).basicRemove(otherEnd, msgs);
		case ClassesPackage.PACKAGE_ELEMENT__INCOMING_DEPENDENCIES:
			return ((InternalEList<?>) getIncomingDependencies()).basicRemove(otherEnd, msgs);
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
		case ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE:
			return eInternalContainer().eInverseRemove(this, ClassesPackage.PACKAGE__CONTAINED_PACKAGE_ELEMENTS,
				org.eclipse.emf.emfstore.client.test.model.classes.Package.class, msgs);
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
		case ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE:
			if (resolve)
				return getParentPackage();
			return basicGetParentPackage();
		case ClassesPackage.PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES:
			return getOutgoingDependencies();
		case ClassesPackage.PACKAGE_ELEMENT__INCOMING_DEPENDENCIES:
			return getIncomingDependencies();
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
		case ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE:
			setParentPackage((org.eclipse.emf.emfstore.client.test.model.classes.Package) newValue);
			return;
		case ClassesPackage.PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES:
			getOutgoingDependencies().clear();
			getOutgoingDependencies().addAll((Collection<? extends Dependency>) newValue);
			return;
		case ClassesPackage.PACKAGE_ELEMENT__INCOMING_DEPENDENCIES:
			getIncomingDependencies().clear();
			getIncomingDependencies().addAll((Collection<? extends Dependency>) newValue);
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
		case ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE:
			setParentPackage((org.eclipse.emf.emfstore.client.test.model.classes.Package) null);
			return;
		case ClassesPackage.PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES:
			getOutgoingDependencies().clear();
			return;
		case ClassesPackage.PACKAGE_ELEMENT__INCOMING_DEPENDENCIES:
			getIncomingDependencies().clear();
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
		case ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE:
			return basicGetParentPackage() != null;
		case ClassesPackage.PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES:
			return outgoingDependencies != null && !outgoingDependencies.isEmpty();
		case ClassesPackage.PACKAGE_ELEMENT__INCOMING_DEPENDENCIES:
			return incomingDependencies != null && !incomingDependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PackageElementImpl
