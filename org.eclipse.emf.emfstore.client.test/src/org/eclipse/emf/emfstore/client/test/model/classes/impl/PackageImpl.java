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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.PackageElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageImpl#getContainedPackageElements <em>
 * Contained Package Elements</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageImpl#getFacadeClass <em>Facade Class</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PackageImpl extends PackageElementImpl implements
	org.eclipse.emf.emfstore.client.test.model.classes.Package {
	/**
	 * The cached value of the '{@link #getContainedPackageElements() <em>Contained Package Elements</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContainedPackageElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageElement> containedPackageElements;

	/**
	 * The cached value of the '{@link #getFacadeClass() <em>Facade Class</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getFacadeClass()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.emf.emfstore.client.test.model.classes.Class facadeClass;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PackageElement> getContainedPackageElements() {
		if (containedPackageElements == null) {
			containedPackageElements = new EObjectContainmentWithInverseEList.Resolving<PackageElement>(
				PackageElement.class, this, ClassesPackage.PACKAGE__CONTAINED_PACKAGE_ELEMENTS,
				ClassesPackage.PACKAGE_ELEMENT__PARENT_PACKAGE);
		}
		return containedPackageElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Class getFacadeClass() {
		if (facadeClass != null && facadeClass.eIsProxy()) {
			InternalEObject oldFacadeClass = (InternalEObject) facadeClass;
			facadeClass = (org.eclipse.emf.emfstore.client.test.model.classes.Class) eResolveProxy(oldFacadeClass);
			if (facadeClass != oldFacadeClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.PACKAGE__FACADE_CLASS,
						oldFacadeClass, facadeClass));
			}
		}
		return facadeClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Class basicGetFacadeClass() {
		return facadeClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFacadeClass(org.eclipse.emf.emfstore.client.test.model.classes.Class newFacadeClass) {
		org.eclipse.emf.emfstore.client.test.model.classes.Class oldFacadeClass = facadeClass;
		facadeClass = newFacadeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.PACKAGE__FACADE_CLASS, oldFacadeClass,
				facadeClass));
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
		case ClassesPackage.PACKAGE__CONTAINED_PACKAGE_ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedPackageElements()).basicAdd(
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
		case ClassesPackage.PACKAGE__CONTAINED_PACKAGE_ELEMENTS:
			return ((InternalEList<?>) getContainedPackageElements()).basicRemove(otherEnd, msgs);
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
		case ClassesPackage.PACKAGE__CONTAINED_PACKAGE_ELEMENTS:
			return getContainedPackageElements();
		case ClassesPackage.PACKAGE__FACADE_CLASS:
			if (resolve)
				return getFacadeClass();
			return basicGetFacadeClass();
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
		case ClassesPackage.PACKAGE__CONTAINED_PACKAGE_ELEMENTS:
			getContainedPackageElements().clear();
			getContainedPackageElements().addAll((Collection<? extends PackageElement>) newValue);
			return;
		case ClassesPackage.PACKAGE__FACADE_CLASS:
			setFacadeClass((org.eclipse.emf.emfstore.client.test.model.classes.Class) newValue);
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
		case ClassesPackage.PACKAGE__CONTAINED_PACKAGE_ELEMENTS:
			getContainedPackageElements().clear();
			return;
		case ClassesPackage.PACKAGE__FACADE_CLASS:
			setFacadeClass((org.eclipse.emf.emfstore.client.test.model.classes.Class) null);
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
		case ClassesPackage.PACKAGE__CONTAINED_PACKAGE_ELEMENTS:
			return containedPackageElements != null && !containedPackageElements.isEmpty();
		case ClassesPackage.PACKAGE__FACADE_CLASS:
			return facadeClass != null;
		}
		return super.eIsSet(featureID);
	}

} // PackageImpl
