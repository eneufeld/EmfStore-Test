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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Argument Direction Type</b></em>
 * ', and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getArgumentDirectionType()
 * @model
 * @generated
 */
public enum ArgumentDirectionType implements Enumerator {
	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "UNDEFINED", "Undefined"),

	/**
	 * The '<em><b>IN</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(1, "IN", "in"),

	/**
	 * The '<em><b>OUT</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #OUT_VALUE
	 * @generated
	 * @ordered
	 */
	OUT(2, "OUT", "out"),

	/**
	 * The '<em><b>INOUT</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #INOUT_VALUE
	 * @generated
	 * @ordered
	 */
	INOUT(3, "INOUT", "inout");

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #UNDEFINED
	 * @model literal="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>IN</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #IN
	 * @model literal="in"
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 1;

	/**
	 * The '<em><b>OUT</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OUT</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #OUT
	 * @model literal="out"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_VALUE = 2;

	/**
	 * The '<em><b>INOUT</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INOUT</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #INOUT
	 * @model literal="inout"
	 * @generated
	 * @ordered
	 */
	public static final int INOUT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Argument Direction Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ArgumentDirectionType[] VALUES_ARRAY = new ArgumentDirectionType[] { UNDEFINED, IN, OUT,
		INOUT, };

	/**
	 * A public read-only list of all the '<em><b>Argument Direction Type</b></em>' enumerators. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ArgumentDirectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Argument Direction Type</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ArgumentDirectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArgumentDirectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Argument Direction Type</b></em>' literal with the specified name. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ArgumentDirectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArgumentDirectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Argument Direction Type</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ArgumentDirectionType get(int value) {
		switch (value) {
		case UNDEFINED_VALUE:
			return UNDEFINED;
		case IN_VALUE:
			return IN;
		case OUT_VALUE:
			return OUT;
		case INOUT_VALUE:
			return INOUT;
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
	private ArgumentDirectionType(int value, String name, String literal) {
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

} // ArgumentDirectionType
