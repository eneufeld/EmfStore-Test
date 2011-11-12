/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task;

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
 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskFactory
 * @model kind="package"
 * @generated
 */
public interface TaskPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "task";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/task";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.task";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TaskPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem <em>Work Item</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem
	 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getWorkItem()
	 * @generated
	 */
	int WORK_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__NAME = ModelPackage.ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__DESCRIPTION = ModelPackage.ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__ANNOTATIONS = ModelPackage.ANNOTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__ATTACHMENTS = ModelPackage.ANNOTATION__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__INCOMING_DOCUMENT_REFERENCES = ModelPackage.ANNOTATION__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__LEAF_SECTION = ModelPackage.ANNOTATION__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__STATE = ModelPackage.ANNOTATION__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.ANNOTATION__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__COMMENTS = ModelPackage.ANNOTATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__CREATION_DATE = ModelPackage.ANNOTATION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__CREATOR = ModelPackage.ANNOTATION__CREATOR;

	/**
	 * The feature id for the '<em><b>Annotated Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__ANNOTATED_MODEL_ELEMENTS = ModelPackage.ANNOTATION__ANNOTATED_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Containing Workpackage</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__CONTAINING_WORKPACKAGE = ModelPackage.ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__PREDECESSORS = ModelPackage.ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__SUCCESSORS = ModelPackage.ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__ASSIGNEE = ModelPackage.ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__REVIEWER = ModelPackage.ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__PARTICIPANTS = ModelPackage.ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__DUE_DATE = ModelPackage.ANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Estimate</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__ESTIMATE = ModelPackage.ANNOTATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__EFFORT = ModelPackage.ANNOTATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__PRIORITY = ModelPackage.ANNOTATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__RESOLVED = ModelPackage.ANNOTATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Including Releases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM__INCLUDING_RELEASES = ModelPackage.ANNOTATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Work Item</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_FEATURE_COUNT = ModelPackage.ANNOTATION_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.task.impl.ActionItemImpl
	 * <em>Action Item</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.ActionItemImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getActionItem()
	 * @generated
	 */
	int ACTION_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__NAME = WORK_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__DESCRIPTION = WORK_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__ANNOTATIONS = WORK_ITEM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__ATTACHMENTS = WORK_ITEM__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__INCOMING_DOCUMENT_REFERENCES = WORK_ITEM__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__LEAF_SECTION = WORK_ITEM__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__STATE = WORK_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__APPLIED_STEREOTYPE_INSTANCES = WORK_ITEM__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__COMMENTS = WORK_ITEM__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CREATION_DATE = WORK_ITEM__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CREATOR = WORK_ITEM__CREATOR;

	/**
	 * The feature id for the '<em><b>Annotated Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__ANNOTATED_MODEL_ELEMENTS = WORK_ITEM__ANNOTATED_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Containing Workpackage</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CONTAINING_WORKPACKAGE = WORK_ITEM__CONTAINING_WORKPACKAGE;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__PREDECESSORS = WORK_ITEM__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__SUCCESSORS = WORK_ITEM__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__ASSIGNEE = WORK_ITEM__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__REVIEWER = WORK_ITEM__REVIEWER;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__PARTICIPANTS = WORK_ITEM__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__DUE_DATE = WORK_ITEM__DUE_DATE;

	/**
	 * The feature id for the '<em><b>Estimate</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__ESTIMATE = WORK_ITEM__ESTIMATE;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__EFFORT = WORK_ITEM__EFFORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__PRIORITY = WORK_ITEM__PRIORITY;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__RESOLVED = WORK_ITEM__RESOLVED;

	/**
	 * The feature id for the '<em><b>Including Releases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__INCLUDING_RELEASES = WORK_ITEM__INCLUDING_RELEASES;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CHECKED = WORK_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__DONE = WORK_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__ACTIVITY = WORK_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Item</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM_FEATURE_COUNT = WORK_ITEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl
	 * <em>Work Package</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getWorkPackage()
	 * @generated
	 */
	int WORK_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__NAME = WORK_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__DESCRIPTION = WORK_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__ANNOTATIONS = WORK_ITEM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__ATTACHMENTS = WORK_ITEM__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__INCOMING_DOCUMENT_REFERENCES = WORK_ITEM__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__LEAF_SECTION = WORK_ITEM__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__STATE = WORK_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__APPLIED_STEREOTYPE_INSTANCES = WORK_ITEM__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__COMMENTS = WORK_ITEM__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__CREATION_DATE = WORK_ITEM__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__CREATOR = WORK_ITEM__CREATOR;

	/**
	 * The feature id for the '<em><b>Annotated Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__ANNOTATED_MODEL_ELEMENTS = WORK_ITEM__ANNOTATED_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Containing Workpackage</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__CONTAINING_WORKPACKAGE = WORK_ITEM__CONTAINING_WORKPACKAGE;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__PREDECESSORS = WORK_ITEM__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__SUCCESSORS = WORK_ITEM__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__ASSIGNEE = WORK_ITEM__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__REVIEWER = WORK_ITEM__REVIEWER;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__PARTICIPANTS = WORK_ITEM__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__DUE_DATE = WORK_ITEM__DUE_DATE;

	/**
	 * The feature id for the '<em><b>Estimate</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__ESTIMATE = WORK_ITEM__ESTIMATE;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__EFFORT = WORK_ITEM__EFFORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__PRIORITY = WORK_ITEM__PRIORITY;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__RESOLVED = WORK_ITEM__RESOLVED;

	/**
	 * The feature id for the '<em><b>Including Releases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__INCLUDING_RELEASES = WORK_ITEM__INCLUDING_RELEASES;

	/**
	 * The feature id for the '<em><b>Contained Work Items</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__CONTAINED_WORK_ITEMS = WORK_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__START_DATE = WORK_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__END_DATE = WORK_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Package</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_FEATURE_COUNT = WORK_ITEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.task.impl.MilestoneImpl
	 * <em>Milestone</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.MilestoneImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getMilestone()
	 * @generated
	 */
	int MILESTONE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__NAME = WORK_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__DESCRIPTION = WORK_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__ANNOTATIONS = WORK_ITEM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__ATTACHMENTS = WORK_ITEM__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__INCOMING_DOCUMENT_REFERENCES = WORK_ITEM__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__LEAF_SECTION = WORK_ITEM__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__STATE = WORK_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__APPLIED_STEREOTYPE_INSTANCES = WORK_ITEM__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__COMMENTS = WORK_ITEM__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__CREATION_DATE = WORK_ITEM__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__CREATOR = WORK_ITEM__CREATOR;

	/**
	 * The feature id for the '<em><b>Annotated Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__ANNOTATED_MODEL_ELEMENTS = WORK_ITEM__ANNOTATED_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Containing Workpackage</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__CONTAINING_WORKPACKAGE = WORK_ITEM__CONTAINING_WORKPACKAGE;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__PREDECESSORS = WORK_ITEM__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__SUCCESSORS = WORK_ITEM__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__ASSIGNEE = WORK_ITEM__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__REVIEWER = WORK_ITEM__REVIEWER;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__PARTICIPANTS = WORK_ITEM__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__DUE_DATE = WORK_ITEM__DUE_DATE;

	/**
	 * The feature id for the '<em><b>Estimate</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__ESTIMATE = WORK_ITEM__ESTIMATE;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__EFFORT = WORK_ITEM__EFFORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__PRIORITY = WORK_ITEM__PRIORITY;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__RESOLVED = WORK_ITEM__RESOLVED;

	/**
	 * The feature id for the '<em><b>Including Releases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__INCLUDING_RELEASES = WORK_ITEM__INCLUDING_RELEASES;

	/**
	 * The feature id for the '<em><b>Contained Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE__CONTAINED_MODEL_ELEMENTS = WORK_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Milestone</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MILESTONE_FEATURE_COUNT = WORK_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.task.Checkable <em>Checkable</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.task.Checkable
	 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getCheckable()
	 * @generated
	 */
	int CHECKABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE__CHECKED = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Checkable</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECKABLE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.task.ActivityType
	 * <em>Activity Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.task.ActivityType
	 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 5;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.task.ActionItem
	 * <em>Action Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Action Item</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.ActionItem
	 * @generated
	 */
	EClass getActionItem();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.ActionItem#isDone <em>Done</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Done</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.ActionItem#isDone()
	 * @see #getActionItem()
	 * @generated
	 */
	EAttribute getActionItem_Done();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.ActionItem#getActivity <em>Activity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Activity</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.ActionItem#getActivity()
	 * @see #getActionItem()
	 * @generated
	 */
	EAttribute getActionItem_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage
	 * <em>Work Package</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Package</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkPackage
	 * @generated
	 */
	EClass getWorkPackage();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getContainedWorkItems
	 * <em>Contained Work Items</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Contained Work Items</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getContainedWorkItems()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_ContainedWorkItems();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getStartDate <em>Start Date</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getStartDate()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_StartDate();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getEndDate <em>End Date</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getEndDate()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_EndDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem
	 * <em>Work Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Item</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem
	 * @generated
	 */
	EClass getWorkItem();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getContainingWorkpackage
	 * <em>Containing Workpackage</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Containing Workpackage</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getContainingWorkpackage()
	 * @see #getWorkItem()
	 * @generated
	 */
	EReference getWorkItem_ContainingWorkpackage();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getPredecessors <em>Predecessors</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getPredecessors()
	 * @see #getWorkItem()
	 * @generated
	 */
	EReference getWorkItem_Predecessors();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getSuccessors <em>Successors</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getSuccessors()
	 * @see #getWorkItem()
	 * @generated
	 */
	EReference getWorkItem_Successors();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getAssignee <em>Assignee</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getAssignee()
	 * @see #getWorkItem()
	 * @generated
	 */
	EReference getWorkItem_Assignee();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getReviewer <em>Reviewer</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Reviewer</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getReviewer()
	 * @see #getWorkItem()
	 * @generated
	 */
	EReference getWorkItem_Reviewer();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getParticipants <em>Participants</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getParticipants()
	 * @see #getWorkItem()
	 * @generated
	 */
	EReference getWorkItem_Participants();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getDueDate <em>Due Date</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getDueDate()
	 * @see #getWorkItem()
	 * @generated
	 */
	EAttribute getWorkItem_DueDate();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getEstimate <em>Estimate</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Estimate</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getEstimate()
	 * @see #getWorkItem()
	 * @generated
	 */
	EAttribute getWorkItem_Estimate();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getEffort <em>Effort</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Effort</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getEffort()
	 * @see #getWorkItem()
	 * @generated
	 */
	EAttribute getWorkItem_Effort();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getPriority <em>Priority</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getPriority()
	 * @see #getWorkItem()
	 * @generated
	 */
	EAttribute getWorkItem_Priority();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#isResolved <em>Resolved</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#isResolved()
	 * @see #getWorkItem()
	 * @generated
	 */
	EAttribute getWorkItem_Resolved();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getIncludingReleases <em>Including Releases</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Including Releases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getIncludingReleases()
	 * @see #getWorkItem()
	 * @generated
	 */
	EReference getWorkItem_IncludingReleases();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.task.Milestone
	 * <em>Milestone</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Milestone</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.Milestone
	 * @generated
	 */
	EClass getMilestone();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.Milestone#getContainedModelElements
	 * <em>Contained Model Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Contained Model Elements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.Milestone#getContainedModelElements()
	 * @see #getMilestone()
	 * @generated
	 */
	EReference getMilestone_ContainedModelElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.task.Checkable
	 * <em>Checkable</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Checkable</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.Checkable
	 * @generated
	 */
	EClass getCheckable();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.Checkable#isChecked <em>Checked</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.Checkable#isChecked()
	 * @see #getCheckable()
	 * @generated
	 */
	EAttribute getCheckable_Checked();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.emfstore.client.test.model.task.ActivityType
	 * <em>Activity Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Activity Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.ActivityType
	 * @generated
	 */
	EEnum getActivityType();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskFactory getTaskFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.task.impl.ActionItemImpl
		 * <em>Action Item</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.ActionItemImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getActionItem()
		 * @generated
		 */
		EClass ACTION_ITEM = eINSTANCE.getActionItem();

		/**
		 * The meta object literal for the '<em><b>Done</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ACTION_ITEM__DONE = eINSTANCE.getActionItem_Done();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ACTION_ITEM__ACTIVITY = eINSTANCE.getActionItem_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl
		 * <em>Work Package</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getWorkPackage()
		 * @generated
		 */
		EClass WORK_PACKAGE = eINSTANCE.getWorkPackage();

		/**
		 * The meta object literal for the '<em><b>Contained Work Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_PACKAGE__CONTAINED_WORK_ITEMS = eINSTANCE.getWorkPackage_ContainedWorkItems();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PACKAGE__START_DATE = eINSTANCE.getWorkPackage_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PACKAGE__END_DATE = eINSTANCE.getWorkPackage_EndDate();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem
		 * <em>Work Item</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem
		 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getWorkItem()
		 * @generated
		 */
		EClass WORK_ITEM = eINSTANCE.getWorkItem();

		/**
		 * The meta object literal for the '<em><b>Containing Workpackage</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_ITEM__CONTAINING_WORKPACKAGE = eINSTANCE.getWorkItem_ContainingWorkpackage();

		/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_ITEM__PREDECESSORS = eINSTANCE.getWorkItem_Predecessors();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_ITEM__SUCCESSORS = eINSTANCE.getWorkItem_Successors();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_ITEM__ASSIGNEE = eINSTANCE.getWorkItem_Assignee();

		/**
		 * The meta object literal for the '<em><b>Reviewer</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_ITEM__REVIEWER = eINSTANCE.getWorkItem_Reviewer();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_ITEM__PARTICIPANTS = eINSTANCE.getWorkItem_Participants();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_ITEM__DUE_DATE = eINSTANCE.getWorkItem_DueDate();

		/**
		 * The meta object literal for the '<em><b>Estimate</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_ITEM__ESTIMATE = eINSTANCE.getWorkItem_Estimate();

		/**
		 * The meta object literal for the '<em><b>Effort</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_ITEM__EFFORT = eINSTANCE.getWorkItem_Effort();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_ITEM__PRIORITY = eINSTANCE.getWorkItem_Priority();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_ITEM__RESOLVED = eINSTANCE.getWorkItem_Resolved();

		/**
		 * The meta object literal for the '<em><b>Including Releases</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_ITEM__INCLUDING_RELEASES = eINSTANCE.getWorkItem_IncludingReleases();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.task.impl.MilestoneImpl
		 * <em>Milestone</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.MilestoneImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getMilestone()
		 * @generated
		 */
		EClass MILESTONE = eINSTANCE.getMilestone();

		/**
		 * The meta object literal for the '<em><b>Contained Model Elements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MILESTONE__CONTAINED_MODEL_ELEMENTS = eINSTANCE.getMilestone_ContainedModelElements();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.task.Checkable
		 * <em>Checkable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.task.Checkable
		 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getCheckable()
		 * @generated
		 */
		EClass CHECKABLE = eINSTANCE.getCheckable();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHECKABLE__CHECKED = eINSTANCE.getCheckable_Checked();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.task.ActivityType
		 * <em>Activity Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.task.ActivityType
		 * @see org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl#getActivityType()
		 * @generated
		 */
		EEnum ACTIVITY_TYPE = eINSTANCE.getActivityType();

	}

} // TaskPackage
