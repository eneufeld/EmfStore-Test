/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.emfstore.client.test.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ModelPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl
	 * <em>Unicase Model Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.impl.ModelPackageImpl#getUnicaseModelElement()
	 * @generated
	 */
	int UNICASE_MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__ANNOTATIONS = 2;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__ATTACHMENTS = 3;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__LEAF_SECTION = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__STATE = 6;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES = 7;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__COMMENTS = 8;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__CREATION_DATE = 9;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT__CREATOR = 10;

	/**
	 * The number of structural features of the '<em>Unicase Model Element</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNICASE_MODEL_ELEMENT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.impl.AnnotationImpl
	 * <em>Annotation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.impl.AnnotationImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.impl.ModelPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATIONS = UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ATTACHMENTS = UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__INCOMING_DOCUMENT_REFERENCES = UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__LEAF_SECTION = UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__STATE = UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__APPLIED_STEREOTYPE_INSTANCES = UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__COMMENTS = UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CREATION_DATE = UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CREATOR = UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Annotated Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATED_MODEL_ELEMENTS = UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.impl.AttachmentImpl
	 * <em>Attachment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.impl.AttachmentImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.impl.ModelPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__NAME = UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DESCRIPTION = UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ANNOTATIONS = UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ATTACHMENTS = UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__INCOMING_DOCUMENT_REFERENCES = UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__LEAF_SECTION = UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__STATE = UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__APPLIED_STEREOTYPE_INSTANCES = UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__COMMENTS = UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CREATION_DATE = UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CREATOR = UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Referring Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__REFERRING_MODEL_ELEMENTS = UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement
	 * <em>Unicase Model Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unicase Model Element</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement
	 * @generated
	 */
	EClass getUnicaseModelElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getName()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EAttribute getUnicaseModelElement_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getDescription <em>Description</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getDescription()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EAttribute getUnicaseModelElement_Description();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAnnotations <em>Annotations</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAnnotations()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EReference getUnicaseModelElement_Annotations();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAttachments <em>Attachments</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Attachments</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAttachments()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EReference getUnicaseModelElement_Attachments();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getIncomingDocumentReferences
	 * <em>Incoming Document References</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Incoming Document References</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getIncomingDocumentReferences()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EReference getUnicaseModelElement_IncomingDocumentReferences();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getLeafSection <em>Leaf Section</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Leaf Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getLeafSection()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EReference getUnicaseModelElement_LeafSection();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getState <em>State</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getState()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EAttribute getUnicaseModelElement_State();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAppliedStereotypeInstances
	 * <em>Applied Stereotype Instances</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Applied Stereotype Instances</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAppliedStereotypeInstances()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EReference getUnicaseModelElement_AppliedStereotypeInstances();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getComments <em>Comments</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getComments()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EReference getUnicaseModelElement_Comments();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getCreationDate()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EAttribute getUnicaseModelElement_CreationDate();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getCreator <em>Creator</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getCreator()
	 * @see #getUnicaseModelElement()
	 * @generated
	 */
	EAttribute getUnicaseModelElement_Creator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.Annotation
	 * <em>Annotation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.Annotation#getAnnotatedModelElements
	 * <em>Annotated Model Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Annotated Model Elements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.Annotation#getAnnotatedModelElements()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotatedModelElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.Attachment
	 * <em>Attachment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.Attachment#getReferringModelElements
	 * <em>Referring Model Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Referring Model Elements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.Attachment#getReferringModelElements()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_ReferringModelElements();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * {@link org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl
		 * <em>Unicase Model Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.impl.ModelPackageImpl#getUnicaseModelElement()
		 * @generated
		 */
		EClass UNICASE_MODEL_ELEMENT = eINSTANCE.getUnicaseModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNICASE_MODEL_ELEMENT__NAME = eINSTANCE.getUnicaseModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNICASE_MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getUnicaseModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNICASE_MODEL_ELEMENT__ANNOTATIONS = eINSTANCE.getUnicaseModelElement_Annotations();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNICASE_MODEL_ELEMENT__ATTACHMENTS = eINSTANCE.getUnicaseModelElement_Attachments();

		/**
		 * The meta object literal for the '<em><b>Incoming Document References</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES = eINSTANCE
			.getUnicaseModelElement_IncomingDocumentReferences();

		/**
		 * The meta object literal for the '<em><b>Leaf Section</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNICASE_MODEL_ELEMENT__LEAF_SECTION = eINSTANCE.getUnicaseModelElement_LeafSection();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNICASE_MODEL_ELEMENT__STATE = eINSTANCE.getUnicaseModelElement_State();

		/**
		 * The meta object literal for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES = eINSTANCE
			.getUnicaseModelElement_AppliedStereotypeInstances();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNICASE_MODEL_ELEMENT__COMMENTS = eINSTANCE.getUnicaseModelElement_Comments();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNICASE_MODEL_ELEMENT__CREATION_DATE = eINSTANCE.getUnicaseModelElement_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNICASE_MODEL_ELEMENT__CREATOR = eINSTANCE.getUnicaseModelElement_Creator();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.impl.AnnotationImpl
		 * <em>Annotation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.impl.AnnotationImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.impl.ModelPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotated Model Elements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATED_MODEL_ELEMENTS = eINSTANCE.getAnnotation_AnnotatedModelElements();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.impl.AttachmentImpl
		 * <em>Attachment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.impl.AttachmentImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.impl.ModelPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Referring Model Elements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ATTACHMENT__REFERRING_MODEL_ELEMENTS = eINSTANCE.getAttachment_ReferringModelElements();

	}

} // ModelPackage
