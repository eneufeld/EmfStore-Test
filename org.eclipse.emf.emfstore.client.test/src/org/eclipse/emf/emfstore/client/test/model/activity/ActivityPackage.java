/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.activity;

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
 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityFactory
 * @model kind="package"
 * @generated
 */
public interface ActivityPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "activity";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/activity";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.activity";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ActivityPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityObjectImpl
	 * <em>Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityObjectImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getActivityObject()
	 * @generated
	 */
	int ACTIVITY_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__INCOMING_TRANSITIONS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT__OUTGOING_TRANSITIONS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OBJECT_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.activity.impl.TransitionImpl
	 * <em>Transition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.TransitionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityImpl
	 * <em>Activity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = ACTIVITY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = ACTIVITY_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANNOTATIONS = ACTIVITY_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ATTACHMENTS = ACTIVITY_OBJECT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING_DOCUMENT_REFERENCES = ACTIVITY_OBJECT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LEAF_SECTION = ACTIVITY_OBJECT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STATE = ACTIVITY_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__APPLIED_STEREOTYPE_INSTANCES = ACTIVITY_OBJECT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COMMENTS = ACTIVITY_OBJECT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CREATION_DATE = ACTIVITY_OBJECT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CREATOR = ACTIVITY_OBJECT__CREATOR;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING_TRANSITIONS = ACTIVITY_OBJECT__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING_TRANSITIONS = ACTIVITY_OBJECT__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Activity</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = ACTIVITY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ForkImpl
	 * <em>Fork</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ForkImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = ACTIVITY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__DESCRIPTION = ACTIVITY_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__ANNOTATIONS = ACTIVITY_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__ATTACHMENTS = ACTIVITY_OBJECT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__INCOMING_DOCUMENT_REFERENCES = ACTIVITY_OBJECT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__LEAF_SECTION = ACTIVITY_OBJECT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__STATE = ACTIVITY_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__APPLIED_STEREOTYPE_INSTANCES = ACTIVITY_OBJECT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__COMMENTS = ACTIVITY_OBJECT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__CREATION_DATE = ACTIVITY_OBJECT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__CREATOR = ACTIVITY_OBJECT__CREATOR;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__INCOMING_TRANSITIONS = ACTIVITY_OBJECT__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK__OUTGOING_TRANSITIONS = ACTIVITY_OBJECT__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Fork</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = ACTIVITY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.activity.impl.BranchImpl
	 * <em>Branch</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.BranchImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = ACTIVITY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__DESCRIPTION = ACTIVITY_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__ANNOTATIONS = ACTIVITY_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__ATTACHMENTS = ACTIVITY_OBJECT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__INCOMING_DOCUMENT_REFERENCES = ACTIVITY_OBJECT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__LEAF_SECTION = ACTIVITY_OBJECT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__STATE = ACTIVITY_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__APPLIED_STEREOTYPE_INSTANCES = ACTIVITY_OBJECT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__COMMENTS = ACTIVITY_OBJECT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__CREATION_DATE = ACTIVITY_OBJECT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__CREATOR = ACTIVITY_OBJECT__CREATOR;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__INCOMING_TRANSITIONS = ACTIVITY_OBJECT__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__OUTGOING_TRANSITIONS = ACTIVITY_OBJECT__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Branch</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = ACTIVITY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityInitialImpl
	 * <em>Initial</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityInitialImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getActivityInitial()
	 * @generated
	 */
	int ACTIVITY_INITIAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__NAME = ACTIVITY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__DESCRIPTION = ACTIVITY_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__ANNOTATIONS = ACTIVITY_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__ATTACHMENTS = ACTIVITY_OBJECT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__INCOMING_DOCUMENT_REFERENCES = ACTIVITY_OBJECT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__LEAF_SECTION = ACTIVITY_OBJECT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__STATE = ACTIVITY_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__APPLIED_STEREOTYPE_INSTANCES = ACTIVITY_OBJECT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__COMMENTS = ACTIVITY_OBJECT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__CREATION_DATE = ACTIVITY_OBJECT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__CREATOR = ACTIVITY_OBJECT__CREATOR;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__INCOMING_TRANSITIONS = ACTIVITY_OBJECT__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL__OUTGOING_TRANSITIONS = ACTIVITY_OBJECT__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Initial</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIAL_FEATURE_COUNT = ACTIVITY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityEndImpl
	 * <em>End</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityEndImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getActivityEnd()
	 * @generated
	 */
	int ACTIVITY_END = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__NAME = ACTIVITY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__DESCRIPTION = ACTIVITY_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__ANNOTATIONS = ACTIVITY_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__ATTACHMENTS = ACTIVITY_OBJECT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__INCOMING_DOCUMENT_REFERENCES = ACTIVITY_OBJECT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__LEAF_SECTION = ACTIVITY_OBJECT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__STATE = ACTIVITY_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__APPLIED_STEREOTYPE_INSTANCES = ACTIVITY_OBJECT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__COMMENTS = ACTIVITY_OBJECT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__CREATION_DATE = ACTIVITY_OBJECT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__CREATOR = ACTIVITY_OBJECT__CREATOR;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__INCOMING_TRANSITIONS = ACTIVITY_OBJECT__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END__OUTGOING_TRANSITIONS = ACTIVITY_OBJECT__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>End</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_END_FEATURE_COUNT = ACTIVITY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject
	 * <em>Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject
	 * @generated
	 */
	EClass getActivityObject();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject#getIncomingTransitions
	 * <em>Incoming Transitions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject#getIncomingTransitions()
	 * @see #getActivityObject()
	 * @generated
	 */
	EReference getActivityObject_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject#getOutgoingTransitions
	 * <em>Outgoing Transitions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject#getOutgoingTransitions()
	 * @see #getActivityObject()
	 * @generated
	 */
	EReference getActivityObject_OutgoingTransitions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.activity.Transition
	 * <em>Transition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.Transition#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.Transition#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.Transition#getCondition <em>Condition</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Condition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.activity.Activity
	 * <em>Activity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.activity.Fork <em>Fork</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.activity.Branch
	 * <em>Branch</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.activity.ActivityInitial
	 * <em>Initial</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Initial</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityInitial
	 * @generated
	 */
	EClass getActivityInitial();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.activity.ActivityEnd
	 * <em>End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>End</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityEnd
	 * @generated
	 */
	EClass getActivityEnd();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityFactory getActivityFactory();

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
		 * {@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityObjectImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getActivityObject()
		 * @generated
		 */
		EClass ACTIVITY_OBJECT = eINSTANCE.getActivityObject();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTIVITY_OBJECT__INCOMING_TRANSITIONS = eINSTANCE.getActivityObject_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTIVITY_OBJECT__OUTGOING_TRANSITIONS = eINSTANCE.getActivityObject_OutgoingTransitions();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.activity.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.TransitionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityImpl <em>Activity</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ForkImpl
		 * <em>Fork</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ForkImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.activity.impl.BranchImpl
		 * <em>Branch</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.BranchImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityInitialImpl <em>Initial</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityInitialImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getActivityInitial()
		 * @generated
		 */
		EClass ACTIVITY_INITIAL = eINSTANCE.getActivityInitial();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityEndImpl <em>End</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityEndImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl#getActivityEnd()
		 * @generated
		 */
		EClass ACTIVITY_END = eINSTANCE.getActivityEnd();

	}

} // ActivityPackage
