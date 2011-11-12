/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.bug;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Resolution Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugPackage#getResolutionType()
 * @model
 * @generated
 */
public enum ResolutionType implements Enumerator {
	/**
	 * The '<em><b>FIXED</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(0, "FIXED", "FIXED"),

	/**
	 * The '<em><b>CANNOT REPRODUCE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #CANNOT_REPRODUCE_VALUE
	 * @generated
	 * @ordered
	 */
	CANNOT_REPRODUCE(1, "CANNOT_REPRODUCE", "CANNOT_REPRODUCE"),

	/**
	 * The '<em><b>WONT FIX</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #WONT_FIX_VALUE
	 * @generated
	 * @ordered
	 */
	WONT_FIX(2, "WONT_FIX", "WONT_FIX");

	/**
	 * The '<em><b>FIXED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIXED</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FIXED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_VALUE = 0;

	/**
	 * The '<em><b>CANNOT REPRODUCE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANNOT REPRODUCE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CANNOT_REPRODUCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANNOT_REPRODUCE_VALUE = 1;

	/**
	 * The '<em><b>WONT FIX</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WONT FIX</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #WONT_FIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WONT_FIX_VALUE = 2;

	/**
	 * An array of all the '<em><b>Resolution Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ResolutionType[] VALUES_ARRAY = new ResolutionType[] { FIXED, CANNOT_REPRODUCE, WONT_FIX, };

	/**
	 * A public read-only list of all the '<em><b>Resolution Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ResolutionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resolution Type</b></em>' literal with the specified literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ResolutionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolutionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolution Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ResolutionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolutionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolution Type</b></em>' literal with the specified integer value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ResolutionType get(int value) {
		switch (value) {
		case FIXED_VALUE:
			return FIXED;
		case CANNOT_REPRODUCE_VALUE:
			return CANNOT_REPRODUCE;
		case WONT_FIX_VALUE:
			return WONT_FIX;
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
	private ResolutionType(int value, String name, String literal) {
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

} // ResolutionType
