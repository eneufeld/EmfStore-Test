/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.profile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.emf.emfstore.client.test.model.profile.ProfileFactory
 * @model kind="package"
 * @generated
 */
public interface ProfilePackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "profile";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/profile";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.profile";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ProfilePackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfileImpl
	 * <em>Profile</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfileImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Affected Containers</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__AFFECTED_CONTAINERS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE__STEREOTYPES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Profile</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeImpl
	 * <em>Stereotype</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotype()
	 * @generated
	 */
	int STEREOTYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__REQUIRED = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__PROFILE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stereotype Instances</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stereotype Attributes</b></em>' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__STEREOTYPE_ATTRIBUTES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Stereotype</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeInstanceImpl
	 * <em>Stereotype Instance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeInstanceImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeInstance()
	 * @generated
	 */
	int STEREOTYPE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__STEREOTYPE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__MODEL_ELEMENT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stereotype Attribute Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stereotype Instance</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_INSTANCE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeImpl
	 * <em>Stereotype Attribute</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeAttribute()
	 * @generated
	 */
	int STEREOTYPE_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__STEREOTYPE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype Attribute Instances</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stereotype Attribute</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeSimpleImpl
	 * <em>Stereotype Attribute Simple</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeSimpleImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeAttributeSimple()
	 * @generated
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__NAME = STEREOTYPE_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__DESCRIPTION = STEREOTYPE_ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__ANNOTATIONS = STEREOTYPE_ATTRIBUTE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__ATTACHMENTS = STEREOTYPE_ATTRIBUTE__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__INCOMING_DOCUMENT_REFERENCES = STEREOTYPE_ATTRIBUTE__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__LEAF_SECTION = STEREOTYPE_ATTRIBUTE__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__STATE = STEREOTYPE_ATTRIBUTE__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__APPLIED_STEREOTYPE_INSTANCES = STEREOTYPE_ATTRIBUTE__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__COMMENTS = STEREOTYPE_ATTRIBUTE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__CREATION_DATE = STEREOTYPE_ATTRIBUTE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__CREATOR = STEREOTYPE_ATTRIBUTE__CREATOR;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__STEREOTYPE = STEREOTYPE_ATTRIBUTE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Stereotype Attribute Instances</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__STEREOTYPE_ATTRIBUTE_INSTANCES = STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE__TYPE = STEREOTYPE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Attribute Simple</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_SIMPLE_FEATURE_COUNT = STEREOTYPE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceImpl
	 * <em>Stereotype Attribute Instance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeAttributeInstance()
	 * @generated
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Stereotype Instance</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype Attribute</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stereotype Attribute Instance</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceStringImpl
	 * <em>Stereotype Attribute Instance String</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceStringImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeAttributeInstanceString()
	 * @generated
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__NAME = STEREOTYPE_ATTRIBUTE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__DESCRIPTION = STEREOTYPE_ATTRIBUTE_INSTANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__ANNOTATIONS = STEREOTYPE_ATTRIBUTE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__ATTACHMENTS = STEREOTYPE_ATTRIBUTE_INSTANCE__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__INCOMING_DOCUMENT_REFERENCES = STEREOTYPE_ATTRIBUTE_INSTANCE__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__LEAF_SECTION = STEREOTYPE_ATTRIBUTE_INSTANCE__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__STATE = STEREOTYPE_ATTRIBUTE_INSTANCE__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__APPLIED_STEREOTYPE_INSTANCES = STEREOTYPE_ATTRIBUTE_INSTANCE__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__COMMENTS = STEREOTYPE_ATTRIBUTE_INSTANCE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__CREATION_DATE = STEREOTYPE_ATTRIBUTE_INSTANCE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__CREATOR = STEREOTYPE_ATTRIBUTE_INSTANCE__CREATOR;

	/**
	 * The feature id for the '<em><b>Stereotype Instance</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__STEREOTYPE_INSTANCE = STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Stereotype Attribute</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__STEREOTYPE_ATTRIBUTE = STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__VALUE = STEREOTYPE_ATTRIBUTE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Attribute Instance String</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_ATTRIBUTE_INSTANCE_STRING_FEATURE_COUNT = STEREOTYPE_ATTRIBUTE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.profile.Profile
	 * <em>Profile</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.Profile#getAffectedContainers
	 * <em>Affected Containers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Affected Containers</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Profile#getAffectedContainers()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_AffectedContainers();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.Profile#getStereotypes <em>Stereotypes</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Stereotypes</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Profile#getStereotypes()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Stereotypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.profile.Stereotype
	 * <em>Stereotype</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stereotype</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Stereotype
	 * @generated
	 */
	EClass getStereotype();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#isRequired <em>Required</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#isRequired()
	 * @see #getStereotype()
	 * @generated
	 */
	EAttribute getStereotype_Required();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getProfile <em>Profile</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Profile</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getProfile()
	 * @see #getStereotype()
	 * @generated
	 */
	EReference getStereotype_Profile();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getStereotypeInstances
	 * <em>Stereotype Instances</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Stereotype Instances</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getStereotypeInstances()
	 * @see #getStereotype()
	 * @generated
	 */
	EReference getStereotype_StereotypeInstances();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getStereotypeAttributes
	 * <em>Stereotype Attributes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Stereotype Attributes</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.Stereotype#getStereotypeAttributes()
	 * @see #getStereotype()
	 * @generated
	 */
	EReference getStereotype_StereotypeAttributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance
	 * <em>Stereotype Instance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stereotype Instance</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance
	 * @generated
	 */
	EClass getStereotypeInstance();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Stereotype</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getStereotype()
	 * @see #getStereotypeInstance()
	 * @generated
	 */
	EReference getStereotypeInstance_Stereotype();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getModelElement
	 * <em>Model Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Model Element</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getModelElement()
	 * @see #getStereotypeInstance()
	 * @generated
	 */
	EReference getStereotypeInstance_ModelElement();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getStereotypeAttributeInstances
	 * <em>Stereotype Attribute Instances</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Stereotype Attribute Instances</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getStereotypeAttributeInstances()
	 * @see #getStereotypeInstance()
	 * @generated
	 */
	EReference getStereotypeInstance_StereotypeAttributeInstances();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute
	 * <em>Stereotype Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stereotype Attribute</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute
	 * @generated
	 */
	EClass getStereotypeAttribute();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute#getStereotype <em>Stereotype</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Stereotype</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute#getStereotype()
	 * @see #getStereotypeAttribute()
	 * @generated
	 */
	EReference getStereotypeAttribute_Stereotype();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute#getStereotypeAttributeInstances
	 * <em>Stereotype Attribute Instances</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Stereotype Attribute Instances</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttribute#getStereotypeAttributeInstances()
	 * @see #getStereotypeAttribute()
	 * @generated
	 */
	EReference getStereotypeAttribute_StereotypeAttributeInstances();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeSimple
	 * <em>Stereotype Attribute Simple</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stereotype Attribute Simple</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeSimple
	 * @generated
	 */
	EClass getStereotypeAttributeSimple();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeSimple#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeSimple#getType()
	 * @see #getStereotypeAttributeSimple()
	 * @generated
	 */
	EAttribute getStereotypeAttributeSimple_Type();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance
	 * <em>Stereotype Attribute Instance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stereotype Attribute Instance</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance
	 * @generated
	 */
	EClass getStereotypeAttributeInstance();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance#getStereotypeInstance
	 * <em>Stereotype Instance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Stereotype Instance</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance#getStereotypeInstance()
	 * @see #getStereotypeAttributeInstance()
	 * @generated
	 */
	EReference getStereotypeAttributeInstance_StereotypeInstance();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance#getStereotypeAttribute
	 * <em>Stereotype Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Stereotype Attribute</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstance#getStereotypeAttribute()
	 * @see #getStereotypeAttributeInstance()
	 * @generated
	 */
	EReference getStereotypeAttributeInstance_StereotypeAttribute();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstanceString
	 * <em>Stereotype Attribute Instance String</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stereotype Attribute Instance String</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstanceString
	 * @generated
	 */
	EClass getStereotypeAttributeInstanceString();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstanceString#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeAttributeInstanceString#getValue()
	 * @see #getStereotypeAttributeInstanceString()
	 * @generated
	 */
	EAttribute getStereotypeAttributeInstanceString_Value();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfileFactory getProfileFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfileImpl
		 * <em>Profile</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfileImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Affected Containers</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROFILE__AFFECTED_CONTAINERS = eINSTANCE.getProfile_AffectedContainers();

		/**
		 * The meta object literal for the '<em><b>Stereotypes</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROFILE__STEREOTYPES = eINSTANCE.getProfile_Stereotypes();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeImpl <em>Stereotype</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotype()
		 * @generated
		 */
		EClass STEREOTYPE = eINSTANCE.getStereotype();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STEREOTYPE__REQUIRED = eINSTANCE.getStereotype_Required();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' container reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE__PROFILE = eINSTANCE.getStereotype_Profile();

		/**
		 * The meta object literal for the '<em><b>Stereotype Instances</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE__STEREOTYPE_INSTANCES = eINSTANCE.getStereotype_StereotypeInstances();

		/**
		 * The meta object literal for the '<em><b>Stereotype Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE__STEREOTYPE_ATTRIBUTES = eINSTANCE.getStereotype_StereotypeAttributes();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeInstanceImpl
		 * <em>Stereotype Instance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeInstanceImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeInstance()
		 * @generated
		 */
		EClass STEREOTYPE_INSTANCE = eINSTANCE.getStereotypeInstance();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE_INSTANCE__STEREOTYPE = eINSTANCE.getStereotypeInstance_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE_INSTANCE__MODEL_ELEMENT = eINSTANCE.getStereotypeInstance_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Stereotype Attribute Instances</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE_INSTANCE__STEREOTYPE_ATTRIBUTE_INSTANCES = eINSTANCE
			.getStereotypeInstance_StereotypeAttributeInstances();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeImpl
		 * <em>Stereotype Attribute</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeAttribute()
		 * @generated
		 */
		EClass STEREOTYPE_ATTRIBUTE = eINSTANCE.getStereotypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' container reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE_ATTRIBUTE__STEREOTYPE = eINSTANCE.getStereotypeAttribute_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Stereotype Attribute Instances</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE_ATTRIBUTE__STEREOTYPE_ATTRIBUTE_INSTANCES = eINSTANCE
			.getStereotypeAttribute_StereotypeAttributeInstances();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeSimpleImpl
		 * <em>Stereotype Attribute Simple</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeSimpleImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeAttributeSimple()
		 * @generated
		 */
		EClass STEREOTYPE_ATTRIBUTE_SIMPLE = eINSTANCE.getStereotypeAttributeSimple();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STEREOTYPE_ATTRIBUTE_SIMPLE__TYPE = eINSTANCE.getStereotypeAttributeSimple_Type();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceImpl
		 * <em>Stereotype Attribute Instance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeAttributeInstance()
		 * @generated
		 */
		EClass STEREOTYPE_ATTRIBUTE_INSTANCE = eINSTANCE.getStereotypeAttributeInstance();

		/**
		 * The meta object literal for the '<em><b>Stereotype Instance</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_INSTANCE = eINSTANCE
			.getStereotypeAttributeInstance_StereotypeInstance();

		/**
		 * The meta object literal for the '<em><b>Stereotype Attribute</b></em>' reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEREOTYPE_ATTRIBUTE_INSTANCE__STEREOTYPE_ATTRIBUTE = eINSTANCE
			.getStereotypeAttributeInstance_StereotypeAttribute();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceStringImpl
		 * <em>Stereotype Attribute Instance String</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.StereotypeAttributeInstanceStringImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl#getStereotypeAttributeInstanceString()
		 * @generated
		 */
		EClass STEREOTYPE_ATTRIBUTE_INSTANCE_STRING = eINSTANCE.getStereotypeAttributeInstanceString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STEREOTYPE_ATTRIBUTE_INSTANCE_STRING__VALUE = eINSTANCE.getStereotypeAttributeInstanceString_Value();

	}

} // ProfilePackage
