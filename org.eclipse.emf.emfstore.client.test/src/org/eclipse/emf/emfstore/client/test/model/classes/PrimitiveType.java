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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Primitive Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getPrimitiveType()
 * @model
 * @generated
 */
public enum PrimitiveType implements Enumerator {
	/**
	 * The '<em><b>String</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(0, "String", "String"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(1, "Boolean", "Boolean"),

	/**
	 * The '<em><b>Integer</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(2, "Integer", "Integer"),

	/**
	 * The '<em><b>Date</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(3, "Date", "Date"),

	/**
	 * The '<em><b>Double</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(4, "Double", "Double"),

	/**
	 * The '<em><b>Enumeration</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #ENUMERATION_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMERATION(5, "Enumeration", "Enumeration");

	/**
	 * The '<em><b>String</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #STRING
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 0;

	/**
	 * The '<em><b>Boolean</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BOOLEAN
	 * @model name="Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 1;

	/**
	 * The '<em><b>Integer</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #INTEGER
	 * @model name="Integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 2;

	/**
	 * The '<em><b>Date</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DATE
	 * @model name="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 3;

	/**
	 * The '<em><b>Double</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DOUBLE
	 * @model name="Double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 4;

	/**
	 * The '<em><b>Enumeration</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enumeration</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ENUMERATION
	 * @model name="Enumeration"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMERATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Primitive Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final PrimitiveType[] VALUES_ARRAY = new PrimitiveType[] { STRING, BOOLEAN, INTEGER, DATE, DOUBLE,
		ENUMERATION, };

	/**
	 * A public read-only list of all the '<em><b>Primitive Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<PrimitiveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static PrimitiveType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static PrimitiveType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified integer value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static PrimitiveType get(int value) {
		switch (value) {
		case STRING_VALUE:
			return STRING;
		case BOOLEAN_VALUE:
			return BOOLEAN;
		case INTEGER_VALUE:
			return INTEGER;
		case DATE_VALUE:
			return DATE;
		case DOUBLE_VALUE:
			return DOUBLE;
		case ENUMERATION_VALUE:
			return ENUMERATION;
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
	private PrimitiveType(int value, String name, String literal) {
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

} // PrimitiveType
