/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.attachment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.attachment.AttachmentPackage
 * @generated
 */
public interface AttachmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	AttachmentFactory eINSTANCE = org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentFactoryImpl
		.init();

	/**
	 * Returns a new object of class '<em>Url Attachment</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Url Attachment</em>'.
	 * @generated
	 */
	UrlAttachment createUrlAttachment();

	/**
	 * Returns a new object of class '<em>File Attachment</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>File Attachment</em>'.
	 * @generated
	 */
	FileAttachment createFileAttachment();

	/**
	 * Returns a new object of class '<em>Patch Attachment</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Patch Attachment</em>'.
	 * @generated
	 */
	PatchAttachment createPatchAttachment();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	AttachmentPackage getAttachmentPackage();

} // AttachmentFactory
