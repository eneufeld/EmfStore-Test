/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes;

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
 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesFactory
 * @model kind="package"
 * @generated
 */
public interface ClassesPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "classes";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/classes";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.classes";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ClassesPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageElementImpl
	 * <em>Package Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageElementImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getPackageElement()
	 * @generated
	 */
	int PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Parent Package</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__PARENT_PACKAGE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__INCOMING_DEPENDENCIES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package Element</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassImpl
	 * <em>Class</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__DESCRIPTION = PACKAGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATIONS = PACKAGE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTACHMENTS = PACKAGE_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__INCOMING_DOCUMENT_REFERENCES = PACKAGE_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__LEAF_SECTION = PACKAGE_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__STATE = PACKAGE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__APPLIED_STEREOTYPE_INSTANCES = PACKAGE_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENTS = PACKAGE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__CREATION_DATE = PACKAGE_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__CREATOR = PACKAGE_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Parent Package</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__PARENT_PACKAGE = PACKAGE_ELEMENT__PARENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OUTGOING_DEPENDENCIES = PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__INCOMING_DEPENDENCIES = PACKAGE_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Instantiation Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__INSTANTIATION_TYPE = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participated Use Cases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__PARTICIPATED_USE_CASES = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASSES = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Classes</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__SUB_CLASSES = PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__INCOMING_ASSOCIATIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OUTGOING_ASSOCIATIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = PACKAGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Demo Participations</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__DEMO_PARTICIPATIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Class</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageImpl
	 * <em>Package</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = PACKAGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ANNOTATIONS = PACKAGE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ATTACHMENTS = PACKAGE_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__INCOMING_DOCUMENT_REFERENCES = PACKAGE_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LEAF_SECTION = PACKAGE_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__STATE = PACKAGE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__APPLIED_STEREOTYPE_INSTANCES = PACKAGE_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMMENTS = PACKAGE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CREATION_DATE = PACKAGE_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CREATOR = PACKAGE_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Parent Package</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARENT_PACKAGE = PACKAGE_ELEMENT__PARENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OUTGOING_DEPENDENCIES = PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__INCOMING_DEPENDENCIES = PACKAGE_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Contained Package Elements</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTAINED_PACKAGE_ELEMENTS = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facade Class</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FACADE_CLASS = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AssociationImpl
	 * <em>Association</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.AssociationImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_MULTIPLICITY = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_MULTIPLICITY = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_ROLE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Role</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_ROLE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TRANSIENT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Association</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl
	 * <em>Attribute</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Defining Class</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFINING_CLASS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SCOPE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SIGNATURE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PROPERTIES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LABEL = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IMPLEMENTATION_TYPE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Implementation Enumeration</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IMPLEMENTATION_ENUMERATION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TRANSIENT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl
	 * <em>Method</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__SCOPE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__SIGNATURE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__ARGUMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__PROPERTIES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Defining Class</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__DEFINING_CLASS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__LABEL = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stubbed</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__STUBBED = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Called Methods</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__CALLED_METHODS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Calling Methods</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__CALLING_METHODS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Demo Participations</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__DEMO_PARTICIPATIONS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Method</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodArgumentImpl
	 * <em>Method Argument</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodArgumentImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getMethodArgument()
	 * @generated
	 */
	int METHOD_ARGUMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__TYPE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__DIRECTION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__DEFAULT_VALUE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__SIGNATURE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT__LABEL = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Method Argument</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_ARGUMENT_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.DependencyImpl
	 * <em>Dependency</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.DependencyImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.EnumerationImpl
	 * <em>Enumeration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.EnumerationImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = PACKAGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ANNOTATIONS = PACKAGE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ATTACHMENTS = PACKAGE_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__INCOMING_DOCUMENT_REFERENCES = PACKAGE_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LEAF_SECTION = PACKAGE_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__STATE = PACKAGE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__APPLIED_STEREOTYPE_INSTANCES = PACKAGE_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__COMMENTS = PACKAGE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CREATION_DATE = PACKAGE_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CREATOR = PACKAGE_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Parent Package</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PARENT_PACKAGE = PACKAGE_ELEMENT__PARENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OUTGOING_DEPENDENCIES = PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__INCOMING_DEPENDENCIES = PACKAGE_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ATTRIBUTES = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.LiteralImpl
	 * <em>Literal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.LiteralImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__ENUMERATION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__LITERAL = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.AssociationType
	 * <em>Association Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.AssociationType
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getAssociationType()
	 * @generated
	 */
	int ASSOCIATION_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType
	 * <em>Visibility Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getVisibilityType()
	 * @generated
	 */
	int VISIBILITY_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.ScopeType
	 * <em>Scope Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ScopeType
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getScopeType()
	 * @generated
	 */
	int SCOPE_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType
	 * <em>Argument Direction Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getArgumentDirectionType()
	 * @generated
	 */
	int ARGUMENT_DIRECTION_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.InstantiationType
	 * <em>Instantiation Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.InstantiationType
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getInstantiationType()
	 * @generated
	 */
	int INSTANTIATION_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.PrimitiveType
	 * <em>Primitive Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.PrimitiveType
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 15;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.Class
	 * <em>Class</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getInstantiationType <em>Instantiation Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Instantiation Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getInstantiationType()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_InstantiationType();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getParticipatedUseCases
	 * <em>Participated Use Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participated Use Cases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getParticipatedUseCases()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ParticipatedUseCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getSuperClasses <em>Super Classes</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Super Classes</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getSuperClasses()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SuperClasses();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getSubClasses <em>Sub Classes</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Sub Classes</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getSubClasses()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SubClasses();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getIncomingAssociations
	 * <em>Incoming Associations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Incoming Associations</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getIncomingAssociations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_IncomingAssociations();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getOutgoingAssociations
	 * <em>Outgoing Associations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Outgoing Associations</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getOutgoingAssociations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OutgoingAssociations();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getAttributes <em>Attributes</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getMethods <em>Methods</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getMethods()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Methods();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getDemoParticipations
	 * <em>Demo Participations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Demo Participations</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getDemoParticipations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_DemoParticipations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.Package
	 * <em>Package</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Package#getContainedPackageElements
	 * <em>Contained Package Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Contained Package Elements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Package#getContainedPackageElements()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ContainedPackageElements();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Package#getFacadeClass <em>Facade Class</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Facade Class</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Package#getFacadeClass()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_FacadeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement
	 * <em>Package Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Package Element</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.PackageElement
	 * @generated
	 */
	EClass getPackageElement();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getParentPackage
	 * <em>Parent Package</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Parent Package</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getParentPackage()
	 * @see #getPackageElement()
	 * @generated
	 */
	EReference getPackageElement_ParentPackage();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getOutgoingDependencies
	 * <em>Outgoing Dependencies</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Outgoing Dependencies</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getOutgoingDependencies()
	 * @see #getPackageElement()
	 * @generated
	 */
	EReference getPackageElement_OutgoingDependencies();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getIncomingDependencies
	 * <em>Incoming Dependencies</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Incoming Dependencies</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.PackageElement#getIncomingDependencies()
	 * @see #getPackageElement()
	 * @generated
	 */
	EReference getPackageElement_IncomingDependencies();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.Association
	 * <em>Association</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Association#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Association#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Association#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Association#getType()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Association#getSourceMultiplicity
	 * <em>Source Multiplicity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Multiplicity</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Association#getSourceMultiplicity()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SourceMultiplicity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Association#getTargetMultiplicity
	 * <em>Target Multiplicity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Target Multiplicity</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Association#getTargetMultiplicity()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetMultiplicity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Association#getSourceRole <em>Source Role</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Association#getSourceRole()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SourceRole();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Association#getTargetRole <em>Target Role</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Target Role</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Association#getTargetRole()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetRole();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Association#isTransient <em>Transient</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Association#isTransient()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Transient();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute
	 * <em>Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getDefiningClass <em>Defining Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Defining Class</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getDefiningClass()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_DefiningClass();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getVisibility <em>Visibility</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getVisibility()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Visibility();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getScope <em>Scope</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getScope()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Scope();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getSignature <em>Signature</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getSignature()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Signature();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getType <em>Type</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getProperties <em>Properties</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getProperties()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Properties();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getLabel <em>Label</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getLabel()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Label();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#isId <em>Id</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#isId()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getImplementationType
	 * <em>Implementation Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Implementation Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getImplementationType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_ImplementationType();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getImplementationEnumeration
	 * <em>Implementation Enumeration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Implementation Enumeration</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#getImplementationEnumeration()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ImplementationEnumeration();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute#isTransient <em>Transient</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Attribute#isTransient()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Transient();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.Method
	 * <em>Method</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getVisibility <em>Visibility</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getScope <em>Scope</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getScope()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Scope();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getReturnType <em>Return Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getSignature <em>Signature</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getSignature()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Signature();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getArguments <em>Arguments</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getArguments()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Arguments();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getProperties <em>Properties</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getProperties()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Properties();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getDefiningClass <em>Defining Class</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Defining Class</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getDefiningClass()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_DefiningClass();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getLabel <em>Label</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getLabel()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Label();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#isStubbed <em>Stubbed</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Stubbed</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#isStubbed()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Stubbed();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getCalledMethods <em>Called Methods</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Called Methods</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getCalledMethods()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_CalledMethods();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getCallingMethods <em>Calling Methods</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Calling Methods</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getCallingMethods()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_CallingMethods();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getDemoParticipations
	 * <em>Demo Participations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Demo Participations</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getDemoParticipations()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_DemoParticipations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument
	 * <em>Method Argument</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Method Argument</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument
	 * @generated
	 */
	EClass getMethodArgument();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getType()
	 * @see #getMethodArgument()
	 * @generated
	 */
	EAttribute getMethodArgument_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getDirection <em>Direction</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getDirection()
	 * @see #getMethodArgument()
	 * @generated
	 */
	EAttribute getMethodArgument_Direction();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getDefaultValue <em>Default Value</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getDefaultValue()
	 * @see #getMethodArgument()
	 * @generated
	 */
	EAttribute getMethodArgument_DefaultValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getSignature <em>Signature</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getSignature()
	 * @see #getMethodArgument()
	 * @generated
	 */
	EAttribute getMethodArgument_Signature();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getLabel <em>Label</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument#getLabel()
	 * @see #getMethodArgument()
	 * @generated
	 */
	EAttribute getMethodArgument_Label();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.Dependency
	 * <em>Dependency</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Dependency#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Dependency#getSource()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Source();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Dependency#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Dependency#getTarget()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.Enumeration
	 * <em>Enumeration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Enumeration#getLiterals <em>Literals</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Enumeration#getAttributes <em>Attributes</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Enumeration#getAttributes()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Attributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.classes.Literal
	 * <em>Literal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Literal#getEnumeration <em>Enumeration</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Enumeration</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Literal#getEnumeration()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Enumeration();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Literal#getLiteral <em>Literal</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Literal#getLiteral()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Literal();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.emfstore.client.test.model.classes.AssociationType
	 * <em>Association Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Association Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.AssociationType
	 * @generated
	 */
	EEnum getAssociationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType
	 * <em>Visibility Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Visibility Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType
	 * @generated
	 */
	EEnum getVisibilityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.emfstore.client.test.model.classes.ScopeType
	 * <em>Scope Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Scope Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ScopeType
	 * @generated
	 */
	EEnum getScopeType();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType <em>Argument Direction Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Argument Direction Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType
	 * @generated
	 */
	EEnum getArgumentDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.emfstore.client.test.model.classes.InstantiationType
	 * <em>Instantiation Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Instantiation Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.InstantiationType
	 * @generated
	 */
	EEnum getInstantiationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.emfstore.client.test.model.classes.PrimitiveType
	 * <em>Primitive Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassesFactory getClassesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassImpl
		 * <em>Class</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Instantiation Type</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CLASS__INSTANTIATION_TYPE = eINSTANCE.getClass_InstantiationType();

		/**
		 * The meta object literal for the '<em><b>Participated Use Cases</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__PARTICIPATED_USE_CASES = eINSTANCE.getClass_ParticipatedUseCases();

		/**
		 * The meta object literal for the '<em><b>Super Classes</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__SUPER_CLASSES = eINSTANCE.getClass_SuperClasses();

		/**
		 * The meta object literal for the '<em><b>Sub Classes</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__SUB_CLASSES = eINSTANCE.getClass_SubClasses();

		/**
		 * The meta object literal for the '<em><b>Incoming Associations</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__INCOMING_ASSOCIATIONS = eINSTANCE.getClass_IncomingAssociations();

		/**
		 * The meta object literal for the '<em><b>Outgoing Associations</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__OUTGOING_ASSOCIATIONS = eINSTANCE.getClass_OutgoingAssociations();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Demo Participations</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__DEMO_PARTICIPATIONS = eINSTANCE.getClass_DemoParticipations();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageImpl
		 * <em>Package</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Contained Package Elements</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__CONTAINED_PACKAGE_ELEMENTS = eINSTANCE.getPackage_ContainedPackageElements();

		/**
		 * The meta object literal for the '<em><b>Facade Class</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__FACADE_CLASS = eINSTANCE.getPackage_FacadeClass();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageElementImpl <em>Package Element</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.PackageElementImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getPackageElement()
		 * @generated
		 */
		EClass PACKAGE_ELEMENT = eINSTANCE.getPackageElement();

		/**
		 * The meta object literal for the '<em><b>Parent Package</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE_ELEMENT__PARENT_PACKAGE = eINSTANCE.getPackageElement_ParentPackage();

		/**
		 * The meta object literal for the '<em><b>Outgoing Dependencies</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES = eINSTANCE.getPackageElement_OutgoingDependencies();

		/**
		 * The meta object literal for the '<em><b>Incoming Dependencies</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE_ELEMENT__INCOMING_DEPENDENCIES = eINSTANCE.getPackageElement_IncomingDependencies();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.AssociationImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__TYPE = eINSTANCE.getAssociation_Type();

		/**
		 * The meta object literal for the '<em><b>Source Multiplicity</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_MULTIPLICITY = eINSTANCE.getAssociation_SourceMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Target Multiplicity</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_MULTIPLICITY = eINSTANCE.getAssociation_TargetMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Source Role</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_ROLE = eINSTANCE.getAssociation_SourceRole();

		/**
		 * The meta object literal for the '<em><b>Target Role</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_ROLE = eINSTANCE.getAssociation_TargetRole();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__TRANSIENT = eINSTANCE.getAssociation_Transient();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl <em>Attribute</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Defining Class</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ATTRIBUTE__DEFINING_CLASS = eINSTANCE.getAttribute_DefiningClass();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__VISIBILITY = eINSTANCE.getAttribute_Visibility();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__SCOPE = eINSTANCE.getAttribute_Scope();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__SIGNATURE = eINSTANCE.getAttribute_Signature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__PROPERTIES = eINSTANCE.getAttribute_Properties();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__LABEL = eINSTANCE.getAttribute_Label();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__ID = eINSTANCE.getAttribute_Id();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__IMPLEMENTATION_TYPE = eINSTANCE.getAttribute_ImplementationType();

		/**
		 * The meta object literal for the '<em><b>Implementation Enumeration</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ATTRIBUTE__IMPLEMENTATION_ENUMERATION = eINSTANCE.getAttribute_ImplementationEnumeration();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__TRANSIENT = eINSTANCE.getAttribute_Transient();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl
		 * <em>Method</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__SCOPE = eINSTANCE.getMethod_Scope();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__SIGNATURE = eINSTANCE.getMethod_Signature();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD__ARGUMENTS = eINSTANCE.getMethod_Arguments();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__PROPERTIES = eINSTANCE.getMethod_Properties();

		/**
		 * The meta object literal for the '<em><b>Defining Class</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD__DEFINING_CLASS = eINSTANCE.getMethod_DefiningClass();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__LABEL = eINSTANCE.getMethod_Label();

		/**
		 * The meta object literal for the '<em><b>Stubbed</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__STUBBED = eINSTANCE.getMethod_Stubbed();

		/**
		 * The meta object literal for the '<em><b>Called Methods</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD__CALLED_METHODS = eINSTANCE.getMethod_CalledMethods();

		/**
		 * The meta object literal for the '<em><b>Calling Methods</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD__CALLING_METHODS = eINSTANCE.getMethod_CallingMethods();

		/**
		 * The meta object literal for the '<em><b>Demo Participations</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD__DEMO_PARTICIPATIONS = eINSTANCE.getMethod_DemoParticipations();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodArgumentImpl <em>Method Argument</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodArgumentImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getMethodArgument()
		 * @generated
		 */
		EClass METHOD_ARGUMENT = eINSTANCE.getMethodArgument();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD_ARGUMENT__TYPE = eINSTANCE.getMethodArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD_ARGUMENT__DIRECTION = eINSTANCE.getMethodArgument_Direction();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD_ARGUMENT__DEFAULT_VALUE = eINSTANCE.getMethodArgument_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD_ARGUMENT__SIGNATURE = eINSTANCE.getMethodArgument_Signature();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD_ARGUMENT__LABEL = eINSTANCE.getMethodArgument_Label();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.classes.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.DependencyImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DEPENDENCY__SOURCE = eINSTANCE.getDependency_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DEPENDENCY__TARGET = eINSTANCE.getDependency_Target();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.classes.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.EnumerationImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENUMERATION__ATTRIBUTES = eINSTANCE.getEnumeration_Attributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.LiteralImpl
		 * <em>Literal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.LiteralImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LITERAL__ENUMERATION = eINSTANCE.getLiteral_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LITERAL__LITERAL = eINSTANCE.getLiteral_Literal();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.AssociationType
		 * <em>Association Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.AssociationType
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getAssociationType()
		 * @generated
		 */
		EEnum ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType
		 * <em>Visibility Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getVisibilityType()
		 * @generated
		 */
		EEnum VISIBILITY_TYPE = eINSTANCE.getVisibilityType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.ScopeType
		 * <em>Scope Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.ScopeType
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getScopeType()
		 * @generated
		 */
		EEnum SCOPE_TYPE = eINSTANCE.getScopeType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType
		 * <em>Argument Direction Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getArgumentDirectionType()
		 * @generated
		 */
		EEnum ARGUMENT_DIRECTION_TYPE = eINSTANCE.getArgumentDirectionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.InstantiationType
		 * <em>Instantiation Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.InstantiationType
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getInstantiationType()
		 * @generated
		 */
		EEnum INSTANTIATION_TYPE = eINSTANCE.getInstantiationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.classes.PrimitiveType
		 * <em>Primitive Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.PrimitiveType
		 * @see org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

	}

} // ClassesPackage
