/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.document;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Leaf Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getModelElements <em>Model Elements</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getReferencedModelElements <em>Referenced
 * Model Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage#getLeafSection()
 * @model
 * @generated
 */
public interface LeafSection extends Section {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list. The list contents are of
	 * type {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement}. It is bidirectional and its opposite
	 * is '{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getLeafSection <em>Leaf Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model Elements</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage#getLeafSection_ModelElements()
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getLeafSection
	 * @model opposite="leafSection" containment="true" resolveProxies="true"
	 *        annotation="org.unicase.ui.meeditor priority='20.0' position='right'"
	 * @generated
	 */
	EList<UnicaseModelElement> getModelElements();

	/**
	 * Returns the value of the '<em><b>Referenced Model Elements</b></em>' reference list. The list contents are of
	 * type {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement}. It is bidirectional and its opposite
	 * is '{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getIncomingDocumentReferences
	 * <em>Incoming Document References</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Model Elements</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Referenced Model Elements</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage#getLeafSection_ReferencedModelElements()
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getIncomingDocumentReferences
	 * @model opposite="incomingDocumentReferences"
	 *        annotation="org.unicase.ui.meeditor priority='21.0' position='right'"
	 * @generated
	 */
	EList<UnicaseModelElement> getReferencedModelElements();

} // LeafSection
