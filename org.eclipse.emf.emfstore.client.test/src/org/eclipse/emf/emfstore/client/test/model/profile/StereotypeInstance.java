/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.profile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Stereotype Instance</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getStereotype <em>Stereotype</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getModelElement <em>Model Element
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getStereotypeAttributeInstances <em>
 * Stereotype Attribute Instances</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage#getStereotypeInstance()
 * @model
 * @generated
 */
public interface StereotypeInstance extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getStereotypeInstances
	 * <em>Stereotype Instances</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stereotype</em>' reference.
	 * @see #setStereotype(Stereotype)
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage#getStereotypeInstance_Stereotype()
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getStereotypeInstances
	 * @model opposite="stereotypeInstances"
	 * @generated
	 */
	Stereotype getStereotype();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getStereotype <em>Stereotype</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Stereotype</em>' reference.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(Stereotype value);

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAppliedStereotypeInstances
	 * <em>Applied Stereotype Instances</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model Element</em>' container reference.
	 * @see #setModelElement(UnicaseModelElement)
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage#getStereotypeInstance_ModelElement()
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAppliedStereotypeInstances
	 * @model opposite="appliedStereotypeInstances" transient="false"
	 * @generated
	 */
	UnicaseModelElement getModelElement();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getModelElement
	 * <em>Model Element</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Model Element</em>' container reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(UnicaseModelElement value);

	/**
	 * Returns the value of the '<em><b>Stereotype Attribute Instances</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance}. It
	 * is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance#getStereotypeInstance
	 * <em>Stereotype Instance</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype Attribute Instances</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stereotype Attribute Instances</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage#getStereotypeInstance_StereotypeAttributeInstances()
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance#getStereotypeInstance
	 * @model opposite="stereotypeInstance" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<StereotypeAttributeInstance> getStereotypeAttributeInstances();

} // StereotypeInstance
