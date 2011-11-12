/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Method Argument</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodArgumentImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodArgumentImpl#getDirection <em>Direction
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodArgumentImpl#getDefaultValue <em>Default
 * Value</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodArgumentImpl#getSignature <em>Signature
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodArgumentImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MethodArgumentImpl extends UnicaseModelElementImpl implements MethodArgument {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ArgumentDirectionType DIRECTION_EDEFAULT = ArgumentDirectionType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ArgumentDirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MethodArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.METHOD_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD_ARGUMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ArgumentDirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDirection(ArgumentDirectionType newDirection) {
		ArgumentDirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD_ARGUMENT__DIRECTION,
				oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD_ARGUMENT__DEFAULT_VALUE,
				oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSignature() {
		// TODO: implement this method to return the 'Signature' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD_ARGUMENT__LABEL, oldLabel,
				label));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ClassesPackage.METHOD_ARGUMENT__TYPE:
			return getType();
		case ClassesPackage.METHOD_ARGUMENT__DIRECTION:
			return getDirection();
		case ClassesPackage.METHOD_ARGUMENT__DEFAULT_VALUE:
			return getDefaultValue();
		case ClassesPackage.METHOD_ARGUMENT__SIGNATURE:
			return getSignature();
		case ClassesPackage.METHOD_ARGUMENT__LABEL:
			return getLabel();
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
		case ClassesPackage.METHOD_ARGUMENT__TYPE:
			setType((String) newValue);
			return;
		case ClassesPackage.METHOD_ARGUMENT__DIRECTION:
			setDirection((ArgumentDirectionType) newValue);
			return;
		case ClassesPackage.METHOD_ARGUMENT__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case ClassesPackage.METHOD_ARGUMENT__LABEL:
			setLabel((String) newValue);
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
		case ClassesPackage.METHOD_ARGUMENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ClassesPackage.METHOD_ARGUMENT__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case ClassesPackage.METHOD_ARGUMENT__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case ClassesPackage.METHOD_ARGUMENT__LABEL:
			setLabel(LABEL_EDEFAULT);
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
		case ClassesPackage.METHOD_ARGUMENT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ClassesPackage.METHOD_ARGUMENT__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case ClassesPackage.METHOD_ARGUMENT__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		case ClassesPackage.METHOD_ARGUMENT__SIGNATURE:
			return SIGNATURE_EDEFAULT == null ? getSignature() != null : !SIGNATURE_EDEFAULT.equals(getSignature());
		case ClassesPackage.METHOD_ARGUMENT__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", direction: ");
		result.append(direction);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} // MethodArgumentImpl
