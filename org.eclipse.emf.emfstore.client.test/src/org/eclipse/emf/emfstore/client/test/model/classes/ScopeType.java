/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Scope Type</b></em>', and utility
 * methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getScopeType()
 * @model
 * @generated
 */
public enum ScopeType implements Enumerator {
	/**
	 * The '<em><b>INSTANCE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE(1, "INSTANCE", "Instance"),

	/**
	 * The '<em><b>CLASS</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(2, "CLASS", "Class");

	/**
	 * The '<em><b>INSTANCE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSTANCE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #INSTANCE
	 * @model literal="Instance"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_VALUE = 1;

	/**
	 * The '<em><b>CLASS</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CLASS
	 * @model literal="Class"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Scope Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ScopeType[] VALUES_ARRAY = new ScopeType[] { INSTANCE, CLASS, };

	/**
	 * A public read-only list of all the '<em><b>Scope Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ScopeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scope Type</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ScopeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScopeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ScopeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScopeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope Type</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ScopeType get(int value) {
		switch (value) {
		case INSTANCE_VALUE:
			return INSTANCE;
		case CLASS_VALUE:
			return CLASS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private ScopeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
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
	 * Returns the literal value of the enumerator, which is its string representation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // ScopeType
