/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.bug;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;

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
 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugFactory
 * @model kind="package"
 * @generated
 */
public interface BugPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "bug";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/bug";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.bug";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	BugPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.bug.impl.BugPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl
	 * <em>Report</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.impl.BugPackageImpl#getBugReport()
	 * @generated
	 */
	int BUG_REPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__NAME = TaskPackage.WORK_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__DESCRIPTION = TaskPackage.WORK_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__ANNOTATIONS = TaskPackage.WORK_ITEM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__ATTACHMENTS = TaskPackage.WORK_ITEM__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__INCOMING_DOCUMENT_REFERENCES = TaskPackage.WORK_ITEM__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__LEAF_SECTION = TaskPackage.WORK_ITEM__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__STATE = TaskPackage.WORK_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__APPLIED_STEREOTYPE_INSTANCES = TaskPackage.WORK_ITEM__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__COMMENTS = TaskPackage.WORK_ITEM__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__CREATION_DATE = TaskPackage.WORK_ITEM__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__CREATOR = TaskPackage.WORK_ITEM__CREATOR;

	/**
	 * The feature id for the '<em><b>Annotated Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__ANNOTATED_MODEL_ELEMENTS = TaskPackage.WORK_ITEM__ANNOTATED_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Containing Workpackage</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__CONTAINING_WORKPACKAGE = TaskPackage.WORK_ITEM__CONTAINING_WORKPACKAGE;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__PREDECESSORS = TaskPackage.WORK_ITEM__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__SUCCESSORS = TaskPackage.WORK_ITEM__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__ASSIGNEE = TaskPackage.WORK_ITEM__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__REVIEWER = TaskPackage.WORK_ITEM__REVIEWER;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__PARTICIPANTS = TaskPackage.WORK_ITEM__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__DUE_DATE = TaskPackage.WORK_ITEM__DUE_DATE;

	/**
	 * The feature id for the '<em><b>Estimate</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__ESTIMATE = TaskPackage.WORK_ITEM__ESTIMATE;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__EFFORT = TaskPackage.WORK_ITEM__EFFORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__PRIORITY = TaskPackage.WORK_ITEM__PRIORITY;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__RESOLVED = TaskPackage.WORK_ITEM__RESOLVED;

	/**
	 * The feature id for the '<em><b>Including Releases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__INCLUDING_RELEASES = TaskPackage.WORK_ITEM__INCLUDING_RELEASES;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__CHECKED = TaskPackage.WORK_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__SEVERITY = TaskPackage.WORK_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__RESOLUTION = TaskPackage.WORK_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolution Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__RESOLUTION_TYPE = TaskPackage.WORK_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT__DONE = TaskPackage.WORK_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Report</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUG_REPORT_FEATURE_COUNT = TaskPackage.WORK_ITEM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.bug.Severity <em>Severity</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.Severity
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.impl.BugPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType
	 * <em>Resolution Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.impl.BugPackageImpl#getResolutionType()
	 * @generated
	 */
	int RESOLUTION_TYPE = 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport
	 * <em>Report</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Report</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugReport
	 * @generated
	 */
	EClass getBugReport();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getSeverity <em>Severity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getSeverity()
	 * @see #getBugReport()
	 * @generated
	 */
	EAttribute getBugReport_Severity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getResolution <em>Resolution</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getResolution()
	 * @see #getBugReport()
	 * @generated
	 */
	EAttribute getBugReport_Resolution();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resolution Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getResolutionType()
	 * @see #getBugReport()
	 * @generated
	 */
	EAttribute getBugReport_ResolutionType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#isDone <em>Done</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Done</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugReport#isDone()
	 * @see #getBugReport()
	 * @generated
	 */
	EAttribute getBugReport_Done();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.emfstore.client.test.model.bug.Severity
	 * <em>Severity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType
	 * <em>Resolution Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Resolution Type</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType
	 * @generated
	 */
	EEnum getResolutionType();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BugFactory getBugFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl
		 * <em>Report</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.bug.impl.BugPackageImpl#getBugReport()
		 * @generated
		 */
		EClass BUG_REPORT = eINSTANCE.getBugReport();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUG_REPORT__SEVERITY = eINSTANCE.getBugReport_Severity();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUG_REPORT__RESOLUTION = eINSTANCE.getBugReport_Resolution();

		/**
		 * The meta object literal for the '<em><b>Resolution Type</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUG_REPORT__RESOLUTION_TYPE = eINSTANCE.getBugReport_ResolutionType();

		/**
		 * The meta object literal for the '<em><b>Done</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUG_REPORT__DONE = eINSTANCE.getBugReport_Done();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.bug.Severity
		 * <em>Severity</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.bug.Severity
		 * @see org.eclipse.emf.emfstore.client.test.model.bug.impl.BugPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType
		 * <em>Resolution Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType
		 * @see org.eclipse.emf.emfstore.client.test.model.bug.impl.BugPackageImpl#getResolutionType()
		 * @generated
		 */
		EEnum RESOLUTION_TYPE = eINSTANCE.getResolutionType();

	}

} // BugPackage
