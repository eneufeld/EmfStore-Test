/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.attachment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.emfstore.client.test.model.ModelPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.attachment.AttachmentFactory
 * @model kind="package"
 * @generated
 */
public interface AttachmentPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "attachment";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/attachment";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.attachment";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	AttachmentPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl
		.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.attachment.impl.UrlAttachmentImpl
	 * <em>Url Attachment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.UrlAttachmentImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl#getUrlAttachment()
	 * @generated
	 */
	int URL_ATTACHMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__NAME = ModelPackage.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__DESCRIPTION = ModelPackage.ATTACHMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__ANNOTATIONS = ModelPackage.ATTACHMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__ATTACHMENTS = ModelPackage.ATTACHMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__INCOMING_DOCUMENT_REFERENCES = ModelPackage.ATTACHMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__LEAF_SECTION = ModelPackage.ATTACHMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__STATE = ModelPackage.ATTACHMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.ATTACHMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__COMMENTS = ModelPackage.ATTACHMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__CREATION_DATE = ModelPackage.ATTACHMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__CREATOR = ModelPackage.ATTACHMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Referring Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__REFERRING_MODEL_ELEMENTS = ModelPackage.ATTACHMENT__REFERRING_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT__URL = ModelPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Url Attachment</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_ATTACHMENT_FEATURE_COUNT = ModelPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.attachment.impl.FileAttachmentImpl
	 * <em>File Attachment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.FileAttachmentImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl#getFileAttachment()
	 * @generated
	 */
	int FILE_ATTACHMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__NAME = ModelPackage.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__DESCRIPTION = ModelPackage.ATTACHMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__ANNOTATIONS = ModelPackage.ATTACHMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__ATTACHMENTS = ModelPackage.ATTACHMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__INCOMING_DOCUMENT_REFERENCES = ModelPackage.ATTACHMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__LEAF_SECTION = ModelPackage.ATTACHMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__STATE = ModelPackage.ATTACHMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.ATTACHMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__COMMENTS = ModelPackage.ATTACHMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__CREATION_DATE = ModelPackage.ATTACHMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__CREATOR = ModelPackage.ATTACHMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Referring Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__REFERRING_MODEL_ELEMENTS = ModelPackage.ATTACHMENT__REFERRING_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__FILE_NAME = ModelPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Hash</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__FILE_HASH = ModelPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__FILE_ID = ModelPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__FILE_SIZE = ModelPackage.ATTACHMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT__FILE_TYPE = ModelPackage.ATTACHMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>File Attachment</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_ATTACHMENT_FEATURE_COUNT = ModelPackage.ATTACHMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.impl.PatchAttachmentImpl <em>Patch Attachment</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.PatchAttachmentImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl#getPatchAttachment()
	 * @generated
	 */
	int PATCH_ATTACHMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__NAME = FILE_ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__DESCRIPTION = FILE_ATTACHMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__ANNOTATIONS = FILE_ATTACHMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__ATTACHMENTS = FILE_ATTACHMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__INCOMING_DOCUMENT_REFERENCES = FILE_ATTACHMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__LEAF_SECTION = FILE_ATTACHMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__STATE = FILE_ATTACHMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__APPLIED_STEREOTYPE_INSTANCES = FILE_ATTACHMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__COMMENTS = FILE_ATTACHMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__CREATION_DATE = FILE_ATTACHMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__CREATOR = FILE_ATTACHMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Referring Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__REFERRING_MODEL_ELEMENTS = FILE_ATTACHMENT__REFERRING_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__FILE_NAME = FILE_ATTACHMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>File Hash</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__FILE_HASH = FILE_ATTACHMENT__FILE_HASH;

	/**
	 * The feature id for the '<em><b>File ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__FILE_ID = FILE_ATTACHMENT__FILE_ID;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__FILE_SIZE = FILE_ATTACHMENT__FILE_SIZE;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__FILE_TYPE = FILE_ATTACHMENT__FILE_TYPE;

	/**
	 * The feature id for the '<em><b>Applied To</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT__APPLIED_TO = FILE_ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Patch Attachment</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATCH_ATTACHMENT_FEATURE_COUNT = FILE_ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachmentType
	 * <em>File Attachment Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachmentType
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl#getFileAttachmentType()
	 * @generated
	 */
	int FILE_ATTACHMENT_TYPE = 3;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.attachment.UrlAttachment
	 * <em>Url Attachment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Url Attachment</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.UrlAttachment
	 * @generated
	 */
	EClass getUrlAttachment();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.UrlAttachment#getUrl <em>Url</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.UrlAttachment#getUrl()
	 * @see #getUrlAttachment()
	 * @generated
	 */
	EAttribute getUrlAttachment_Url();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment
	 * <em>File Attachment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>File Attachment</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment
	 * @generated
	 */
	EClass getFileAttachment();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileName()
	 * @see #getFileAttachment()
	 * @generated
	 */
	EAttribute getFileAttachment_FileName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileHash <em>File Hash</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>File Hash</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileHash()
	 * @see #getFileAttachment()
	 * @generated
	 */
	EAttribute getFileAttachment_FileHash();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileID <em>File ID</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>File ID</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileID()
	 * @see #getFileAttachment()
	 * @generated
	 */
	EAttribute getFileAttachment_FileID();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileSize()
	 * @see #getFileAttachment()
	 * @generated
	 */
	EAttribute getFileAttachment_FileSize();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>File Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment#getFileType()
	 * @see #getFileAttachment()
	 * @generated
	 */
	EAttribute getFileAttachment_FileType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment
	 * <em>Patch Attachment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Patch Attachment</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment
	 * @generated
	 */
	EClass getPatchAttachment();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment#getAppliedTo <em>Applied To</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Applied To</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment#getAppliedTo()
	 * @see #getPatchAttachment()
	 * @generated
	 */
	EReference getPatchAttachment_AppliedTo();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachmentType <em>File Attachment Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>File Attachment Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachmentType
	 * @generated
	 */
	EEnum getFileAttachmentType();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AttachmentFactory getAttachmentFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.impl.UrlAttachmentImpl <em>Url Attachment</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.UrlAttachmentImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl#getUrlAttachment()
		 * @generated
		 */
		EClass URL_ATTACHMENT = eINSTANCE.getUrlAttachment();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute URL_ATTACHMENT__URL = eINSTANCE.getUrlAttachment_Url();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.impl.FileAttachmentImpl
		 * <em>File Attachment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.FileAttachmentImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl#getFileAttachment()
		 * @generated
		 */
		EClass FILE_ATTACHMENT = eINSTANCE.getFileAttachment();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FILE_ATTACHMENT__FILE_NAME = eINSTANCE.getFileAttachment_FileName();

		/**
		 * The meta object literal for the '<em><b>File Hash</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FILE_ATTACHMENT__FILE_HASH = eINSTANCE.getFileAttachment_FileHash();

		/**
		 * The meta object literal for the '<em><b>File ID</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FILE_ATTACHMENT__FILE_ID = eINSTANCE.getFileAttachment_FileID();

		/**
		 * The meta object literal for the '<em><b>File Size</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FILE_ATTACHMENT__FILE_SIZE = eINSTANCE.getFileAttachment_FileSize();

		/**
		 * The meta object literal for the '<em><b>File Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FILE_ATTACHMENT__FILE_TYPE = eINSTANCE.getFileAttachment_FileType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.impl.PatchAttachmentImpl
		 * <em>Patch Attachment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.PatchAttachmentImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl#getPatchAttachment()
		 * @generated
		 */
		EClass PATCH_ATTACHMENT = eINSTANCE.getPatchAttachment();

		/**
		 * The meta object literal for the '<em><b>Applied To</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PATCH_ATTACHMENT__APPLIED_TO = eINSTANCE.getPatchAttachment_AppliedTo();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachmentType
		 * <em>File Attachment Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachmentType
		 * @see org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl#getFileAttachmentType()
		 * @generated
		 */
		EEnum FILE_ATTACHMENT_TYPE = eINSTANCE.getFileAttachmentType();

	}

} // AttachmentPackage
