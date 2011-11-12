/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Attachment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.Attachment#getReferringModelElements <em>Referring Model
 * Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getAttachment()
 * @model abstract="true"
 * @generated
 */
public interface Attachment extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Referring Model Elements</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAttachments <em>Attachments</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referring Model Elements</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Referring Model Elements</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getAttachment_ReferringModelElements()
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAttachments
	 * @model opposite="attachments"
	 * @generated
	 */
	EList<UnicaseModelElement> getReferringModelElements();

} // Attachment
