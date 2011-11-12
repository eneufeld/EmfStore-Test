/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes;

import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Literal</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.Literal#getEnumeration <em>Enumeration</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.Literal#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' container reference. It is bidirectional and its opposite
	 * is '{@link org.eclipse.emf.emfstore.client.test.model.classes.Enumeration#getLiterals <em>Literals</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enumeration</em>' container reference.
	 * @see #setEnumeration(Enumeration)
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getLiteral_Enumeration()
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Enumeration#getLiterals
	 * @model opposite="literals" transient="false"
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.classes.Literal#getEnumeration
	 * <em>Enumeration</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Enumeration</em>' container reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getLiteral_Literal()
	 * @model
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.classes.Literal#getLiteral
	 * <em>Literal</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

} // Literal
