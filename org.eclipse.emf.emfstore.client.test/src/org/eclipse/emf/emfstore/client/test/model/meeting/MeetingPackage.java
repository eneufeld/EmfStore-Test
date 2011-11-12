/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.meeting;

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
 * @see org.eclipse.emf.emfstore.client.test.model.meeting.MeetingFactory
 * @model kind="package"
 * @generated
 */
public interface MeetingPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "meeting";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/meeting";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.meeting";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	MeetingPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl
	 * <em>Meeting</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getMeeting()
	 * @generated
	 */
	int MEETING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__LOCATION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starttime</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__STARTTIME = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Endtime</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__ENDTIME = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facilitator</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__FACILITATOR = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minutetaker</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__MINUTETAKER = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timekeeper</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__TIMEKEEPER = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__PARTICIPANTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__SECTIONS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Identified Issues Section</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__IDENTIFIED_ISSUES_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Identified Work Items Section</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING__IDENTIFIED_WORK_ITEMS_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Meeting</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingSectionImpl
	 * <em>Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingSectionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getMeetingSection()
	 * @generated
	 */
	int MEETING_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Allocated Time</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION__ALLOCATED_TIME = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEETING_SECTION_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.CompositeMeetingSectionImpl
	 * <em>Composite Meeting Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.CompositeMeetingSectionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getCompositeMeetingSection()
	 * @generated
	 */
	int COMPOSITE_MEETING_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__NAME = MEETING_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__DESCRIPTION = MEETING_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__ANNOTATIONS = MEETING_SECTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__ATTACHMENTS = MEETING_SECTION__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__INCOMING_DOCUMENT_REFERENCES = MEETING_SECTION__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__LEAF_SECTION = MEETING_SECTION__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__STATE = MEETING_SECTION__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__APPLIED_STEREOTYPE_INSTANCES = MEETING_SECTION__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__COMMENTS = MEETING_SECTION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__CREATION_DATE = MEETING_SECTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__CREATOR = MEETING_SECTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Allocated Time</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__ALLOCATED_TIME = MEETING_SECTION__ALLOCATED_TIME;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION__SUBSECTIONS = MEETING_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Meeting Section</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEETING_SECTION_FEATURE_COUNT = MEETING_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.IssueMeetingSectionImpl
	 * <em>Issue Meeting Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.IssueMeetingSectionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getIssueMeetingSection()
	 * @generated
	 */
	int ISSUE_MEETING_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__NAME = MEETING_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__DESCRIPTION = MEETING_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__ANNOTATIONS = MEETING_SECTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__ATTACHMENTS = MEETING_SECTION__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__INCOMING_DOCUMENT_REFERENCES = MEETING_SECTION__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__LEAF_SECTION = MEETING_SECTION__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__STATE = MEETING_SECTION__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__APPLIED_STEREOTYPE_INSTANCES = MEETING_SECTION__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__COMMENTS = MEETING_SECTION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__CREATION_DATE = MEETING_SECTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__CREATOR = MEETING_SECTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Allocated Time</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__ALLOCATED_TIME = MEETING_SECTION__ALLOCATED_TIME;

	/**
	 * The feature id for the '<em><b>Included Issues</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION__INCLUDED_ISSUES = MEETING_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Issue Meeting Section</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_MEETING_SECTION_FEATURE_COUNT = MEETING_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.WorkItemMeetingSectionImpl
	 * <em>Work Item Meeting Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.WorkItemMeetingSectionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getWorkItemMeetingSection()
	 * @generated
	 */
	int WORK_ITEM_MEETING_SECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__NAME = MEETING_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__DESCRIPTION = MEETING_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__ANNOTATIONS = MEETING_SECTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__ATTACHMENTS = MEETING_SECTION__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__INCOMING_DOCUMENT_REFERENCES = MEETING_SECTION__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__LEAF_SECTION = MEETING_SECTION__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__STATE = MEETING_SECTION__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__APPLIED_STEREOTYPE_INSTANCES = MEETING_SECTION__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__COMMENTS = MEETING_SECTION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__CREATION_DATE = MEETING_SECTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__CREATOR = MEETING_SECTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Allocated Time</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__ALLOCATED_TIME = MEETING_SECTION__ALLOCATED_TIME;

	/**
	 * The feature id for the '<em><b>Included Work Items</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION__INCLUDED_WORK_ITEMS = MEETING_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Item Meeting Section</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_ITEM_MEETING_SECTION_FEATURE_COUNT = MEETING_SECTION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting
	 * <em>Meeting</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Meeting</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting
	 * @generated
	 */
	EClass getMeeting();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getLocation <em>Location</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getLocation()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Location();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getStarttime <em>Starttime</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Starttime</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getStarttime()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Starttime();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getEndtime <em>Endtime</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Endtime</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getEndtime()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Endtime();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getFacilitator <em>Facilitator</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Facilitator</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getFacilitator()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Facilitator();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getMinutetaker <em>Minutetaker</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Minutetaker</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getMinutetaker()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Minutetaker();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getTimekeeper <em>Timekeeper</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Timekeeper</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getTimekeeper()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Timekeeper();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getParticipants <em>Participants</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getParticipants()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Participants();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getSections <em>Sections</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getSections()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Sections();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getIdentifiedIssuesSection
	 * <em>Identified Issues Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Identified Issues Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getIdentifiedIssuesSection()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_IdentifiedIssuesSection();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getIdentifiedWorkItemsSection
	 * <em>Identified Work Items Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Identified Work Items Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.Meeting#getIdentifiedWorkItemsSection()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_IdentifiedWorkItemsSection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.meeting.MeetingSection
	 * <em>Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.MeetingSection
	 * @generated
	 */
	EClass getMeetingSection();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.MeetingSection#getAllocatedTime
	 * <em>Allocated Time</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Allocated Time</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.MeetingSection#getAllocatedTime()
	 * @see #getMeetingSection()
	 * @generated
	 */
	EAttribute getMeetingSection_AllocatedTime();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.CompositeMeetingSection
	 * <em>Composite Meeting Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Composite Meeting Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.CompositeMeetingSection
	 * @generated
	 */
	EClass getCompositeMeetingSection();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.CompositeMeetingSection#getSubsections
	 * <em>Subsections</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Subsections</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.CompositeMeetingSection#getSubsections()
	 * @see #getCompositeMeetingSection()
	 * @generated
	 */
	EReference getCompositeMeetingSection_Subsections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.meeting.IssueMeetingSection
	 * <em>Issue Meeting Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Issue Meeting Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.IssueMeetingSection
	 * @generated
	 */
	EClass getIssueMeetingSection();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.IssueMeetingSection#getIncludedIssues
	 * <em>Included Issues</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Included Issues</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.IssueMeetingSection#getIncludedIssues()
	 * @see #getIssueMeetingSection()
	 * @generated
	 */
	EReference getIssueMeetingSection_IncludedIssues();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.WorkItemMeetingSection
	 * <em>Work Item Meeting Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Item Meeting Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.WorkItemMeetingSection
	 * @generated
	 */
	EClass getWorkItemMeetingSection();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.WorkItemMeetingSection#getIncludedWorkItems
	 * <em>Included Work Items</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Included Work Items</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.WorkItemMeetingSection#getIncludedWorkItems()
	 * @see #getWorkItemMeetingSection()
	 * @generated
	 */
	EReference getWorkItemMeetingSection_IncludedWorkItems();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeetingFactory getMeetingFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl
		 * <em>Meeting</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getMeeting()
		 * @generated
		 */
		EClass MEETING = eINSTANCE.getMeeting();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MEETING__LOCATION = eINSTANCE.getMeeting_Location();

		/**
		 * The meta object literal for the '<em><b>Starttime</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MEETING__STARTTIME = eINSTANCE.getMeeting_Starttime();

		/**
		 * The meta object literal for the '<em><b>Endtime</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MEETING__ENDTIME = eINSTANCE.getMeeting_Endtime();

		/**
		 * The meta object literal for the '<em><b>Facilitator</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEETING__FACILITATOR = eINSTANCE.getMeeting_Facilitator();

		/**
		 * The meta object literal for the '<em><b>Minutetaker</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEETING__MINUTETAKER = eINSTANCE.getMeeting_Minutetaker();

		/**
		 * The meta object literal for the '<em><b>Timekeeper</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEETING__TIMEKEEPER = eINSTANCE.getMeeting_Timekeeper();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEETING__PARTICIPANTS = eINSTANCE.getMeeting_Participants();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEETING__SECTIONS = eINSTANCE.getMeeting_Sections();

		/**
		 * The meta object literal for the '<em><b>Identified Issues Section</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEETING__IDENTIFIED_ISSUES_SECTION = eINSTANCE.getMeeting_IdentifiedIssuesSection();

		/**
		 * The meta object literal for the '<em><b>Identified Work Items Section</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEETING__IDENTIFIED_WORK_ITEMS_SECTION = eINSTANCE.getMeeting_IdentifiedWorkItemsSection();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingSectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingSectionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getMeetingSection()
		 * @generated
		 */
		EClass MEETING_SECTION = eINSTANCE.getMeetingSection();

		/**
		 * The meta object literal for the '<em><b>Allocated Time</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MEETING_SECTION__ALLOCATED_TIME = eINSTANCE.getMeetingSection_AllocatedTime();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.CompositeMeetingSectionImpl
		 * <em>Composite Meeting Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.CompositeMeetingSectionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getCompositeMeetingSection()
		 * @generated
		 */
		EClass COMPOSITE_MEETING_SECTION = eINSTANCE.getCompositeMeetingSection();

		/**
		 * The meta object literal for the '<em><b>Subsections</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPOSITE_MEETING_SECTION__SUBSECTIONS = eINSTANCE.getCompositeMeetingSection_Subsections();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.IssueMeetingSectionImpl
		 * <em>Issue Meeting Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.IssueMeetingSectionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getIssueMeetingSection()
		 * @generated
		 */
		EClass ISSUE_MEETING_SECTION = eINSTANCE.getIssueMeetingSection();

		/**
		 * The meta object literal for the '<em><b>Included Issues</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ISSUE_MEETING_SECTION__INCLUDED_ISSUES = eINSTANCE.getIssueMeetingSection_IncludedIssues();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.WorkItemMeetingSectionImpl
		 * <em>Work Item Meeting Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.WorkItemMeetingSectionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl#getWorkItemMeetingSection()
		 * @generated
		 */
		EClass WORK_ITEM_MEETING_SECTION = eINSTANCE.getWorkItemMeetingSection();

		/**
		 * The meta object literal for the '<em><b>Included Work Items</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_ITEM_MEETING_SECTION__INCLUDED_WORK_ITEMS = eINSTANCE
			.getWorkItemMeetingSection_IncludedWorkItems();

	}

} // MeetingPackage
