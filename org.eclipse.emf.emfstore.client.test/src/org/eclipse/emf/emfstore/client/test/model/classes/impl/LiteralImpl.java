/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.Enumeration;
import org.eclipse.emf.emfstore.client.test.model.classes.Literal;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Literal</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.LiteralImpl#getEnumeration <em>Enumeration</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.LiteralImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LiteralImpl extends UnicaseModelElementImpl implements Literal {
	/**
	 * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected String literal = LITERAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.LITERAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Enumeration getEnumeration() {
		if (eContainerFeatureID() != ClassesPackage.LITERAL__ENUMERATION)
			return null;
		return (Enumeration) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Enumeration basicGetEnumeration() {
		if (eContainerFeatureID() != ClassesPackage.LITERAL__ENUMERATION)
			return null;
		return (Enumeration) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(Enumeration newEnumeration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEnumeration, ClassesPackage.LITERAL__ENUMERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnumeration(Enumeration newEnumeration) {
		if (newEnumeration != eInternalContainer()
			|| (eContainerFeatureID() != ClassesPackage.LITERAL__ENUMERATION && newEnumeration != null)) {
			if (EcoreUtil.isAncestor(this, newEnumeration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject) newEnumeration).eInverseAdd(this, ClassesPackage.ENUMERATION__LITERALS,
					Enumeration.class, msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.LITERAL__ENUMERATION, newEnumeration,
				newEnumeration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLiteral(String newLiteral) {
		String oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.LITERAL__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ClassesPackage.LITERAL__ENUMERATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEnumeration((Enumeration) otherEnd, msgs);
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
		case ClassesPackage.LITERAL__ENUMERATION:
			return basicSetEnumeration(null, msgs);
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
		case ClassesPackage.LITERAL__ENUMERATION:
			return eInternalContainer().eInverseRemove(this, ClassesPackage.ENUMERATION__LITERALS, Enumeration.class,
				msgs);
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
		case ClassesPackage.LITERAL__ENUMERATION:
			if (resolve)
				return getEnumeration();
			return basicGetEnumeration();
		case ClassesPackage.LITERAL__LITERAL:
			return getLiteral();
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
		case ClassesPackage.LITERAL__ENUMERATION:
			setEnumeration((Enumeration) newValue);
			return;
		case ClassesPackage.LITERAL__LITERAL:
			setLiteral((String) newValue);
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
		case ClassesPackage.LITERAL__ENUMERATION:
			setEnumeration((Enumeration) null);
			return;
		case ClassesPackage.LITERAL__LITERAL:
			setLiteral(LITERAL_EDEFAULT);
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
		case ClassesPackage.LITERAL__ENUMERATION:
			return basicGetEnumeration() != null;
		case ClassesPackage.LITERAL__LITERAL:
			return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
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
		result.append(" (literal: ");
		result.append(literal);
		result.append(')');
		return result.toString();
	}

} // LiteralImpl
