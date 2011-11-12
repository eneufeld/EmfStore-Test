/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.classes.Attribute;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.Enumeration;
import org.eclipse.emf.emfstore.client.test.model.classes.Literal;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Enumeration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.EnumerationImpl#getLiterals <em>Literals</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.EnumerationImpl#getAttributes <em>Attributes</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EnumerationImpl extends PackageElementImpl implements Enumeration {
	/**
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> literals;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Literal> getLiterals() {
		if (literals == null) {
			literals = new EObjectContainmentWithInverseEList.Resolving<Literal>(Literal.class, this,
				ClassesPackage.ENUMERATION__LITERALS, ClassesPackage.LITERAL__ENUMERATION);
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectWithInverseResolvingEList<Attribute>(Attribute.class, this,
				ClassesPackage.ENUMERATION__ATTRIBUTES, ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION);
		}
		return attributes;
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
		case ClassesPackage.ENUMERATION__LITERALS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLiterals()).basicAdd(otherEnd, msgs);
		case ClassesPackage.ENUMERATION__ATTRIBUTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributes()).basicAdd(otherEnd, msgs);
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
		case ClassesPackage.ENUMERATION__LITERALS:
			return ((InternalEList<?>) getLiterals()).basicRemove(otherEnd, msgs);
		case ClassesPackage.ENUMERATION__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
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
		case ClassesPackage.ENUMERATION__LITERALS:
			return getLiterals();
		case ClassesPackage.ENUMERATION__ATTRIBUTES:
			return getAttributes();
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
		case ClassesPackage.ENUMERATION__LITERALS:
			getLiterals().clear();
			getLiterals().addAll((Collection<? extends Literal>) newValue);
			return;
		case ClassesPackage.ENUMERATION__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
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
		case ClassesPackage.ENUMERATION__LITERALS:
			getLiterals().clear();
			return;
		case ClassesPackage.ENUMERATION__ATTRIBUTES:
			getAttributes().clear();
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
		case ClassesPackage.ENUMERATION__LITERALS:
			return literals != null && !literals.isEmpty();
		case ClassesPackage.ENUMERATION__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EnumerationImpl
