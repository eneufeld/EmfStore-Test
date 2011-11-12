/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Composite Section</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.document.CompositeSection#getSubsections <em>Subsections</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage#getCompositeSection()
 * @model
 * @generated
 */
public interface CompositeSection extends Section {
	/**
	 * Returns the value of the '<em><b>Subsections</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.document.Section}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.document.Section#getParent <em>Parent</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsections</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Subsections</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage#getCompositeSection_Subsections()
	 * @see org.eclipse.emf.emfstore.client.test.model.document.Section#getParent
	 * @model opposite="parent" containment="true" resolveProxies="true"
	 *        annotation="org.unicase.ui.meeditor priority='20.0' position='right'"
	 * @generated
	 */
	EList<Section> getSubsections();

} // CompositeSection
