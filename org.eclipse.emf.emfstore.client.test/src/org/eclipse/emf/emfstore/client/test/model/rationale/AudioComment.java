/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Audio Comment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.AudioComment#getAudioFile <em>Audio File</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getAudioComment()
 * @model
 * @generated
 */
public interface AudioComment extends EObject {
	/**
	 * Returns the value of the '<em><b>Audio File</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio File</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Audio File</em>' containment reference.
	 * @see #setAudioFile(FileAttachment)
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getAudioComment_AudioFile()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	FileAttachment getAudioFile();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.AudioComment#getAudioFile
	 * <em>Audio File</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Audio File</em>' containment reference.
	 * @see #getAudioFile()
	 * @generated
	 */
	void setAudioFile(FileAttachment value);

} // AudioComment
