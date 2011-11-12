/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes;

import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Method Argument</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getDirection <em>Direction</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getDefaultValue <em>Default Value</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getSignature <em>Signature</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getMethodArgument()
 * @model
 * @generated
 */
public interface MethodArgument extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getMethodArgument_Type()
	 * @model annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute. The literals are from the enumeration
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType
	 * @see #setDirection(ArgumentDirectionType)
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getMethodArgument_Direction()
	 * @model annotation="org.unicase.ui.meeditor priority='11.0' position='left'"
	 * @generated
	 */
	ArgumentDirectionType getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getDirection
	 * <em>Direction</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ArgumentDirectionType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getMethodArgument_DefaultValue()
	 * @model annotation="org.unicase.ui.meeditor priority='12.0' position='left'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getDefaultValue
	 * <em>Default Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getMethodArgument_Signature()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getMethodArgument_Label()
	 * @model annotation="org.unicase.ui.meeditor priority='13.0' position='left'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getLabel
	 * <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // MethodArgument
