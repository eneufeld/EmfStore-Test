/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Package Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getParentPackage <em>Parent Package
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getOutgoingDependencies <em>Outgoing
 * Dependencies</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getIncomingDependencies <em>Incoming
 * Dependencies</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getPackageElement()
 * @model abstract="true"
 * @generated
 */
public interface PackageElement extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Parent Package</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.emfstore.client.test.model.classes.Package#getContainedPackageElements
	 * <em>Contained Package Elements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Package</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parent Package</em>' container reference.
	 * @see #setParentPackage(org.eclipse.emf.emfstore.client.test.model.classes.Package)
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getPackageElement_ParentPackage()
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Package#getContainedPackageElements
	 * @model opposite="containedPackageElements" transient="false"
	 *        annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	org.eclipse.emf.emfstore.client.test.model.classes.Package getParentPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getParentPackage
	 * <em>Parent Package</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Parent Package</em>' container reference.
	 * @see #getParentPackage()
	 * @generated
	 */
	void setParentPackage(org.eclipse.emf.emfstore.client.test.model.classes.Package value);

	/**
	 * Returns the value of the '<em><b>Outgoing Dependencies</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Dependency}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Dependency#getSource <em>Source</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Dependencies</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Outgoing Dependencies</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getPackageElement_OutgoingDependencies()
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Dependency#getSource
	 * @model opposite="source" annotation="org.unicase.ui.meeditor priority='10.0' position='right'"
	 * @generated
	 */
	EList<Dependency> getOutgoingDependencies();

	/**
	 * Returns the value of the '<em><b>Incoming Dependencies</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Dependency}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Dependency#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Dependencies</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Incoming Dependencies</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#getPackageElement_IncomingDependencies()
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Dependency#getTarget
	 * @model opposite="target" annotation="org.unicase.ui.meeditor priority='11.0' position='right'"
	 * @generated
	 */
	EList<Dependency> getIncomingDependencies();

} // PackageElement
