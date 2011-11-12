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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Instantiation Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getInstantiationType()
 * @model
 * @generated
 */
public enum InstantiationType implements Enumerator {
	/**
	 * The '<em><b>Concrete</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #CONCRETE_VALUE
	 * @generated
	 * @ordered
	 */
	CONCRETE(0, "Concrete", "Concrete"),

	/**
	 * The '<em><b>Abstract</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #ABSTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT(1, "Abstract", "Abstract"),

	/**
	 * The '<em><b>Interface</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(2, "Interface", "Interface");

	/**
	 * The '<em><b>Concrete</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concrete</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CONCRETE
	 * @model name="Concrete"
	 * @generated
	 * @ordered
	 */
	public static final int CONCRETE_VALUE = 0;

	/**
	 * The '<em><b>Abstract</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abstract</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ABSTRACT
	 * @model name="Abstract"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_VALUE = 1;

	/**
	 * The '<em><b>Interface</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interface</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #INTERFACE
	 * @model name="Interface"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Instantiation Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final InstantiationType[] VALUES_ARRAY = new InstantiationType[] { CONCRETE, ABSTRACT, INTERFACE, };

	/**
	 * A public read-only list of all the '<em><b>Instantiation Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<InstantiationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instantiation Type</b></em>' literal with the specified literal value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static InstantiationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstantiationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instantiation Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static InstantiationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstantiationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instantiation Type</b></em>' literal with the specified integer value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static InstantiationType get(int value) {
		switch (value) {
		case CONCRETE_VALUE:
			return CONCRETE;
		case ABSTRACT_VALUE:
			return ABSTRACT;
		case INTERFACE_VALUE:
			return INTERFACE;
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
	private InstantiationType(int value, String name, String literal) {
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

} // InstantiationType
