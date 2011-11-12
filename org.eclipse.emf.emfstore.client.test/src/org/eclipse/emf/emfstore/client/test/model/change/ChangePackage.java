/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.change;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;

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
 * @see org.eclipse.emf.emfstore.client.test.model.change.ChangeFactory
 * @model kind="package"
 * @generated
 */
public interface ChangePackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "change";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/change";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.change";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ChangePackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.change.impl.ChangePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.change.impl.MergingIssueImpl
	 * <em>Merging Issue</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.MergingIssueImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.ChangePackageImpl#getMergingIssue()
	 * @generated
	 */
	int MERGING_ISSUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__NAME = RationalePackage.ISSUE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__DESCRIPTION = RationalePackage.ISSUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__ANNOTATIONS = RationalePackage.ISSUE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__ATTACHMENTS = RationalePackage.ISSUE__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__INCOMING_DOCUMENT_REFERENCES = RationalePackage.ISSUE__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__LEAF_SECTION = RationalePackage.ISSUE__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__STATE = RationalePackage.ISSUE__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__APPLIED_STEREOTYPE_INSTANCES = RationalePackage.ISSUE__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__COMMENTS = RationalePackage.ISSUE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__CREATION_DATE = RationalePackage.ISSUE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__CREATOR = RationalePackage.ISSUE__CREATOR;

	/**
	 * The feature id for the '<em><b>Annotated Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__ANNOTATED_MODEL_ELEMENTS = RationalePackage.ISSUE__ANNOTATED_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__CHECKED = RationalePackage.ISSUE__CHECKED;

	/**
	 * The feature id for the '<em><b>Containing Workpackage</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__CONTAINING_WORKPACKAGE = RationalePackage.ISSUE__CONTAINING_WORKPACKAGE;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__PREDECESSORS = RationalePackage.ISSUE__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__SUCCESSORS = RationalePackage.ISSUE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__ASSIGNEE = RationalePackage.ISSUE__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__REVIEWER = RationalePackage.ISSUE__REVIEWER;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__PARTICIPANTS = RationalePackage.ISSUE__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__DUE_DATE = RationalePackage.ISSUE__DUE_DATE;

	/**
	 * The feature id for the '<em><b>Estimate</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__ESTIMATE = RationalePackage.ISSUE__ESTIMATE;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__EFFORT = RationalePackage.ISSUE__EFFORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__PRIORITY = RationalePackage.ISSUE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__RESOLVED = RationalePackage.ISSUE__RESOLVED;

	/**
	 * The feature id for the '<em><b>Including Releases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__INCLUDING_RELEASES = RationalePackage.ISSUE__INCLUDING_RELEASES;

	/**
	 * The feature id for the '<em><b>Proposals</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__PROPOSALS = RationalePackage.ISSUE__PROPOSALS;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__SOLUTION = RationalePackage.ISSUE__SOLUTION;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__CRITERIA = RationalePackage.ISSUE__CRITERIA;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__ACTIVITY = RationalePackage.ISSUE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__ASSESSMENTS = RationalePackage.ISSUE__ASSESSMENTS;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__BASE_VERSION = RationalePackage.ISSUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Version</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE__TARGET_VERSION = RationalePackage.ISSUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merging Issue</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_ISSUE_FEATURE_COUNT = RationalePackage.ISSUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.change.impl.MergingProposalImpl
	 * <em>Merging Proposal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.MergingProposalImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.ChangePackageImpl#getMergingProposal()
	 * @generated
	 */
	int MERGING_PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__NAME = RationalePackage.PROPOSAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__DESCRIPTION = RationalePackage.PROPOSAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__ANNOTATIONS = RationalePackage.PROPOSAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__ATTACHMENTS = RationalePackage.PROPOSAL__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__INCOMING_DOCUMENT_REFERENCES = RationalePackage.PROPOSAL__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__LEAF_SECTION = RationalePackage.PROPOSAL__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__STATE = RationalePackage.PROPOSAL__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__APPLIED_STEREOTYPE_INSTANCES = RationalePackage.PROPOSAL__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__COMMENTS = RationalePackage.PROPOSAL__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__CREATION_DATE = RationalePackage.PROPOSAL__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__CREATOR = RationalePackage.PROPOSAL__CREATOR;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__ASSESSMENTS = RationalePackage.PROPOSAL__ASSESSMENTS;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__ISSUE = RationalePackage.PROPOSAL__ISSUE;

	/**
	 * The feature id for the '<em><b>Pending Operations</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL__PENDING_OPERATIONS = RationalePackage.PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merging Proposal</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_PROPOSAL_FEATURE_COUNT = RationalePackage.PROPOSAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.change.impl.MergingSolutionImpl
	 * <em>Merging Solution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.MergingSolutionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.ChangePackageImpl#getMergingSolution()
	 * @generated
	 */
	int MERGING_SOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__NAME = RationalePackage.SOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__DESCRIPTION = RationalePackage.SOLUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__ANNOTATIONS = RationalePackage.SOLUTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__ATTACHMENTS = RationalePackage.SOLUTION__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__INCOMING_DOCUMENT_REFERENCES = RationalePackage.SOLUTION__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__LEAF_SECTION = RationalePackage.SOLUTION__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__STATE = RationalePackage.SOLUTION__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__APPLIED_STEREOTYPE_INSTANCES = RationalePackage.SOLUTION__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__COMMENTS = RationalePackage.SOLUTION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__CREATION_DATE = RationalePackage.SOLUTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__CREATOR = RationalePackage.SOLUTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Underlying Proposals</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__UNDERLYING_PROPOSALS = RationalePackage.SOLUTION__UNDERLYING_PROPOSALS;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__ISSUE = RationalePackage.SOLUTION__ISSUE;

	/**
	 * The feature id for the '<em><b>Applied Operations</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION__APPLIED_OPERATIONS = RationalePackage.SOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merging Solution</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MERGING_SOLUTION_FEATURE_COUNT = RationalePackage.SOLUTION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.change.MergingIssue
	 * <em>Merging Issue</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Merging Issue</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.change.MergingIssue
	 * @generated
	 */
	EClass getMergingIssue();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.change.MergingIssue#getBaseVersion <em>Base Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Base Version</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.change.MergingIssue#getBaseVersion()
	 * @see #getMergingIssue()
	 * @generated
	 */
	EReference getMergingIssue_BaseVersion();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.change.MergingIssue#getTargetVersion <em>Target Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Target Version</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.change.MergingIssue#getTargetVersion()
	 * @see #getMergingIssue()
	 * @generated
	 */
	EReference getMergingIssue_TargetVersion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.change.MergingProposal
	 * <em>Merging Proposal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Merging Proposal</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.change.MergingProposal
	 * @generated
	 */
	EClass getMergingProposal();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.change.MergingProposal#getPendingOperations
	 * <em>Pending Operations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Pending Operations</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.change.MergingProposal#getPendingOperations()
	 * @see #getMergingProposal()
	 * @generated
	 */
	EReference getMergingProposal_PendingOperations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.change.MergingSolution
	 * <em>Merging Solution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Merging Solution</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.change.MergingSolution
	 * @generated
	 */
	EClass getMergingSolution();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.change.MergingSolution#getAppliedOperations
	 * <em>Applied Operations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Applied Operations</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.change.MergingSolution#getAppliedOperations()
	 * @see #getMergingSolution()
	 * @generated
	 */
	EReference getMergingSolution_AppliedOperations();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChangeFactory getChangeFactory();

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
		 * {@link org.eclipse.emf.emfstore.client.test.model.change.impl.MergingIssueImpl <em>Merging Issue</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.MergingIssueImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.ChangePackageImpl#getMergingIssue()
		 * @generated
		 */
		EClass MERGING_ISSUE = eINSTANCE.getMergingIssue();

		/**
		 * The meta object literal for the '<em><b>Base Version</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MERGING_ISSUE__BASE_VERSION = eINSTANCE.getMergingIssue_BaseVersion();

		/**
		 * The meta object literal for the '<em><b>Target Version</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MERGING_ISSUE__TARGET_VERSION = eINSTANCE.getMergingIssue_TargetVersion();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.change.impl.MergingProposalImpl <em>Merging Proposal</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.MergingProposalImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.ChangePackageImpl#getMergingProposal()
		 * @generated
		 */
		EClass MERGING_PROPOSAL = eINSTANCE.getMergingProposal();

		/**
		 * The meta object literal for the '<em><b>Pending Operations</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MERGING_PROPOSAL__PENDING_OPERATIONS = eINSTANCE.getMergingProposal_PendingOperations();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.change.impl.MergingSolutionImpl <em>Merging Solution</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.MergingSolutionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.change.impl.ChangePackageImpl#getMergingSolution()
		 * @generated
		 */
		EClass MERGING_SOLUTION = eINSTANCE.getMergingSolution();

		/**
		 * The meta object literal for the '<em><b>Applied Operations</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MERGING_SOLUTION__APPLIED_OPERATIONS = eINSTANCE.getMergingSolution_AppliedOperations();

	}

} // ChangePackage
