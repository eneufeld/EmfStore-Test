/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.attachment;

import org.eclipse.emf.emfstore.client.test.model.Attachment;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Url Attachment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.attachment.UrlAttachment#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.attachment.AttachmentPackage#getUrlAttachment()
 * @model
 * @generated
 */
public interface UrlAttachment extends Attachment {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.AttachmentPackage#getUrlAttachment_Url()
	 * @model annotation="org.unicase.ui.meeditor position='left' priority='2.5'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.attachment.UrlAttachment#getUrl
	 * <em>Url</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // UrlAttachment
