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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Severity</b></em>', and utility
 * methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugPackage#getSeverity()
 * @model
 * @generated
 */
public enum Severity implements Enumerator {
	/**
	 * The '<em><b>FEATURE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE(0, "FEATURE", "FEATURE"),

	/**
	 * The '<em><b>TRIVIAL</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #TRIVIAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRIVIAL(1, "TRIVIAL", "TRIVIAL"),

	/**
	 * The '<em><b>MINOR</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #MINOR_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR(2, "MINOR", "MINOR"),

	/**
	 * The '<em><b>MAJOR</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #MAJOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR(3, "MAJOR", "MAJOR"),

	/**
	 * The '<em><b>BLOCKER</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #BLOCKER_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKER(4, "BLOCKER", "BLOCKER");

	/**
	 * The '<em><b>FEATURE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FEATURE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FEATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_VALUE = 0;

	/**
	 * The '<em><b>TRIVIAL</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIVIAL</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TRIVIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIVIAL_VALUE = 1;

	/**
	 * The '<em><b>MINOR</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINOR</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MINOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_VALUE = 2;

	/**
	 * The '<em><b>MAJOR</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAJOR</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MAJOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_VALUE = 3;

	/**
	 * The '<em><b>BLOCKER</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLOCKER</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BLOCKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Severity</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Severity[] VALUES_ARRAY = new Severity[] { FEATURE, TRIVIAL, MINOR, MAJOR, BLOCKER, };

	/**
	 * A public read-only list of all the '<em><b>Severity</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<Severity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Severity</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static Severity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static Severity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static Severity get(int value) {
		switch (value) {
		case FEATURE_VALUE:
			return FEATURE;
		case TRIVIAL_VALUE:
			return TRIVIAL;
		case MINOR_VALUE:
			return MINOR;
		case MAJOR_VALUE:
			return MAJOR;
		case BLOCKER_VALUE:
			return BLOCKER;
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
	private Severity(int value, String name, String literal) {
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

} // Severity
