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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Association Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getAssociationType()
 * @model
 * @generated
 */
public enum AssociationType implements Enumerator {
	/**
	 * The '<em><b>UNDIRECTED ASSOCIATION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #UNDIRECTED_ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	UNDIRECTED_ASSOCIATION(0, "UNDIRECTED_ASSOCIATION", "Undirected Association"),

	/**
	 * The '<em><b>DIRECTED ASSOCIATION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #DIRECTED_ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTED_ASSOCIATION(1, "DIRECTED_ASSOCIATION", "Directed Association"),

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATION(2, "AGGREGATION", "Aggregation"),

	/**
	 * The '<em><b>COMPOSITION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(3, "COMPOSITION", "Composition");

	/**
	 * The '<em><b>UNDIRECTED ASSOCIATION</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDIRECTED ASSOCIATION</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #UNDIRECTED_ASSOCIATION
	 * @model literal="Undirected Association"
	 * @generated
	 * @ordered
	 */
	public static final int UNDIRECTED_ASSOCIATION_VALUE = 0;

	/**
	 * The '<em><b>DIRECTED ASSOCIATION</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIRECTED ASSOCIATION</b></em>' literal object isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DIRECTED_ASSOCIATION
	 * @model literal="Directed Association"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTED_ASSOCIATION_VALUE = 1;

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGGREGATION</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #AGGREGATION
	 * @model literal="Aggregation"
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION_VALUE = 2;

	/**
	 * The '<em><b>COMPOSITION</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPOSITION</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #COMPOSITION
	 * @model literal="Composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Association Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final AssociationType[] VALUES_ARRAY = new AssociationType[] { UNDIRECTED_ASSOCIATION,
		DIRECTED_ASSOCIATION, AGGREGATION, COMPOSITION, };

	/**
	 * A public read-only list of all the '<em><b>Association Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<AssociationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Association Type</b></em>' literal with the specified literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Association Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Association Type</b></em>' literal with the specified integer value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationType get(int value) {
		switch (value) {
		case UNDIRECTED_ASSOCIATION_VALUE:
			return UNDIRECTED_ASSOCIATION;
		case DIRECTED_ASSOCIATION_VALUE:
			return DIRECTED_ASSOCIATION;
		case AGGREGATION_VALUE:
			return AGGREGATION;
		case COMPOSITION_VALUE:
			return COMPOSITION;
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
	private AssociationType(int value, String name, String literal) {
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

} // AssociationType
