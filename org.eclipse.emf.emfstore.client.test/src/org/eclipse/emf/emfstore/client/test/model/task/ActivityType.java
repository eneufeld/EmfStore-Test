/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Activity Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getActivityType()
 * @model
 * @generated
 */
public enum ActivityType implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "<please select>"),

	/**
	 * The '<em><b>ANALYSIS</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	ANALYSIS(1, "ANALYSIS", "Analysis"),

	/**
	 * The '<em><b>SYSTEM DESIGN</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #SYSTEM_DESIGN_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_DESIGN(2, "SYSTEM_DESIGN", "System Design"),

	/**
	 * The '<em><b>OBJECT DESIGN</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #OBJECT_DESIGN_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT_DESIGN(3, "OBJECT_DESIGN", "Object Design"),

	/**
	 * The '<em><b>IMPLEMENTATION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #IMPLEMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION(4, "IMPLEMENTATION", "Implementation"),

	/**
	 * The '<em><b>TESTING</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #TESTING_VALUE
	 * @generated
	 * @ordered
	 */
	TESTING(5, "TESTING", "Testing"),

	/**
	 * The '<em><b>MANAGEMENT</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGEMENT(6, "MANAGEMENT", "Management");

	/**
	 * The '<em><b>NONE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #NONE
	 * @model literal="<please select>"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>ANALYSIS</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANALYSIS</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ANALYSIS
	 * @model literal="Analysis"
	 * @generated
	 * @ordered
	 */
	public static final int ANALYSIS_VALUE = 1;

	/**
	 * The '<em><b>SYSTEM DESIGN</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEM DESIGN</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SYSTEM_DESIGN
	 * @model literal="System Design"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_DESIGN_VALUE = 2;

	/**
	 * The '<em><b>OBJECT DESIGN</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OBJECT DESIGN</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #OBJECT_DESIGN
	 * @model literal="Object Design"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_DESIGN_VALUE = 3;

	/**
	 * The '<em><b>IMPLEMENTATION</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPLEMENTATION</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #IMPLEMENTATION
	 * @model literal="Implementation"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_VALUE = 4;

	/**
	 * The '<em><b>TESTING</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TESTING</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TESTING
	 * @model literal="Testing"
	 * @generated
	 * @ordered
	 */
	public static final int TESTING_VALUE = 5;

	/**
	 * The '<em><b>MANAGEMENT</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANAGEMENT</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MANAGEMENT
	 * @model literal="Management"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGEMENT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Activity Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ActivityType[] VALUES_ARRAY = new ActivityType[] { NONE, ANALYSIS, SYSTEM_DESIGN,
		OBJECT_DESIGN, IMPLEMENTATION, TESTING, MANAGEMENT, };

	/**
	 * A public read-only list of all the '<em><b>Activity Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ActivityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ActivityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ActivityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified integer value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ActivityType get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case ANALYSIS_VALUE:
			return ANALYSIS;
		case SYSTEM_DESIGN_VALUE:
			return SYSTEM_DESIGN;
		case OBJECT_DESIGN_VALUE:
			return OBJECT_DESIGN;
		case IMPLEMENTATION_VALUE:
			return IMPLEMENTATION;
		case TESTING_VALUE:
			return TESTING;
		case MANAGEMENT_VALUE:
			return MANAGEMENT;
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
	private ActivityType(int value, String name, String literal) {
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

} // ActivityType
