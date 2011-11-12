/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.Package#getContainedPackageElements <em>Contained
 * Package Elements</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.Package#getFacadeClass <em>Facade Class</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Contained Package Elements</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement}. It is
	 * bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getParentPackage
	 * <em>Parent Package</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Package Elements</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Contained Package Elements</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getPackage_ContainedPackageElements()
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getParentPackage
	 * @model opposite="parentPackage" containment="true" resolveProxies="true"
	 *        annotation="org.unicase.ui.meeditor priority='9.5' position='right'"
	 * @generated
	 */
	EList<PackageElement> getContainedPackageElements();

	/**
	 * Returns the value of the '<em><b>Facade Class</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facade Class</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Facade Class</em>' reference.
	 * @see #setFacadeClass(org.eclipse.emf.emfstore.client.test.model.classes.Class)
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getPackage_FacadeClass()
	 * @model annotation="org.unicase.ui.meeditor priority='20.0' position='left'"
	 * @generated
	 */
	org.eclipse.emf.emfstore.client.test.model.classes.Class getFacadeClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.classes.Package#getFacadeClass
	 * <em>Facade Class</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Facade Class</em>' reference.
	 * @see #getFacadeClass()
	 * @generated
	 */
	void setFacadeClass(org.eclipse.emf.emfstore.client.test.model.classes.Class value);

} // Package
