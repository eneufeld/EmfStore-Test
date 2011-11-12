/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.profile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Stereotype Attribute</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute#getStereotype <em>Stereotype</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute#getStereotypeAttributeInstances
 * <em>Stereotype Attribute Instances</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage#getStereotypeAttribute()
 * @model abstract="true"
 * @generated
 */
public interface StereotypeAttribute extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' container reference. It is bidirectional and its opposite
	 * is '{@link org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getStereotypeAttributes
	 * <em>Stereotype Attributes</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stereotype</em>' container reference.
	 * @see #setStereotype(Stereotype)
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage#getStereotypeAttribute_Stereotype()
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getStereotypeAttributes
	 * @model opposite="stereotypeAttributes" transient="false"
	 * @generated
	 */
	Stereotype getStereotype();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute#getStereotype <em>Stereotype</em>}'
	 * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Stereotype</em>' container reference.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(Stereotype value);

	/**
	 * Returns the value of the '<em><b>Stereotype Attribute Instances</b></em>' reference list. The list contents are
	 * of type {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance}. It is
	 * bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance#getStereotypeAttribute
	 * <em>Stereotype Attribute</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype Attribute Instances</em>' reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stereotype Attribute Instances</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage#getStereotypeAttribute_StereotypeAttributeInstances()
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance#getStereotypeAttribute
	 * @model opposite="stereotypeAttribute"
	 * @generated
	 */
	EList<StereotypeAttributeInstance> getStereotypeAttributeInstances();

} // StereotypeAttribute
