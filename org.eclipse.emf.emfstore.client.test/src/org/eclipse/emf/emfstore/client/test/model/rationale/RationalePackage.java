/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale;

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
 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationaleFactory
 * @model kind="package"
 * @generated
 */
public interface RationalePackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "rationale";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/rationale";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.rationale";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	RationalePackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl
	 * <em>Issue</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__NAME = ModelPackage.ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = ModelPackage.ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__ANNOTATIONS = ModelPackage.ANNOTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__ATTACHMENTS = ModelPackage.ANNOTATION__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.ANNOTATION__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__LEAF_SECTION = ModelPackage.ANNOTATION__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATE = ModelPackage.ANNOTATION__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.ANNOTATION__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__COMMENTS = ModelPackage.ANNOTATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__CREATION_DATE = ModelPackage.ANNOTATION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__CREATOR = ModelPackage.ANNOTATION__CREATOR;

	/**
	 * The feature id for the '<em><b>Annotated Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__ANNOTATED_MODEL_ELEMENTS = ModelPackage.ANNOTATION__ANNOTATED_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__CHECKED = ModelPackage.ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Workpackage</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__CONTAINING_WORKPACKAGE = ModelPackage.ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__PREDECESSORS = ModelPackage.ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUCCESSORS = ModelPackage.ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNEE = ModelPackage.ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__REVIEWER = ModelPackage.ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__PARTICIPANTS = ModelPackage.ANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__DUE_DATE = ModelPackage.ANNOTATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Estimate</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__ESTIMATE = ModelPackage.ANNOTATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__EFFORT = ModelPackage.ANNOTATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__PRIORITY = ModelPackage.ANNOTATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__RESOLVED = ModelPackage.ANNOTATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Including Releases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__INCLUDING_RELEASES = ModelPackage.ANNOTATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Proposals</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__PROPOSALS = ModelPackage.ANNOTATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__SOLUTION = ModelPackage.ANNOTATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__CRITERIA = ModelPackage.ANNOTATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__ACTIVITY = ModelPackage.ANNOTATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSESSMENTS = ModelPackage.ANNOTATION_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Issue</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = ModelPackage.ANNOTATION_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.ProposalImpl
	 * <em>Proposal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.ProposalImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getProposal()
	 * @generated
	 */
	int PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__ASSESSMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__ISSUE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proposal</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPOSAL_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.SolutionImpl
	 * <em>Solution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.SolutionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Underlying Proposals</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__UNDERLYING_PROPOSALS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ISSUE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.CriterionImpl
	 * <em>Criterion</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.CriterionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getCriterion()
	 * @generated
	 */
	int CRITERION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION__ASSESSMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Criterion</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CRITERION_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.AssessmentImpl
	 * <em>Assessment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.AssessmentImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__PROPOSAL = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__CRITERION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__VALUE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.CommentImpl
	 * <em>Comment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.CommentImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__SENDER = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__RECIPIENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Commented Element</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENTED_ELEMENT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comment</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.AudioCommentImpl
	 * <em>Audio Comment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.AudioCommentImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getAudioComment()
	 * @generated
	 */
	int AUDIO_COMMENT = 6;

	/**
	 * The feature id for the '<em><b>Audio File</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_COMMENT__AUDIO_FILE = 0;

	/**
	 * The number of structural features of the '<em>Audio Comment</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_COMMENT_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue
	 * <em>Issue</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getProposals <em>Proposals</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Proposals</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getProposals()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Proposals();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getSolution <em>Solution</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Solution</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getSolution()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Solution();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getCriteria <em>Criteria</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Criteria</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getCriteria()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Criteria();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getActivity <em>Activity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Activity</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getActivity()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Activity();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getAssessments <em>Assessments</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Assessments</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getAssessments()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Assessments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Proposal
	 * <em>Proposal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Proposal</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Proposal
	 * @generated
	 */
	EClass getProposal();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Proposal#getAssessments <em>Assessments</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Assessments</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Proposal#getAssessments()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Assessments();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Proposal#getIssue <em>Issue</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Issue</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Proposal#getIssue()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Issue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Solution
	 * <em>Solution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Solution#getUnderlyingProposals
	 * <em>Underlying Proposals</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Underlying Proposals</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Solution#getUnderlyingProposals()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_UnderlyingProposals();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Solution#getIssue <em>Issue</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Issue</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Solution#getIssue()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Issue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Criterion
	 * <em>Criterion</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Criterion</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Criterion
	 * @generated
	 */
	EClass getCriterion();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Criterion#getAssessments <em>Assessments</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Assessments</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Criterion#getAssessments()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_Assessments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Assessment
	 * <em>Assessment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Assessment#getProposal <em>Proposal</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Proposal</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Assessment#getProposal()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Proposal();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Assessment#getCriterion <em>Criterion</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Criterion</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Assessment#getCriterion()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Criterion();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Assessment#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Assessment#getValue()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Comment
	 * <em>Comment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Comment#getSender <em>Sender</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Comment#getSender()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Sender();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Comment#getRecipients <em>Recipients</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Recipients</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Comment#getRecipients()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Recipients();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Comment#getCommentedElement
	 * <em>Commented Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Commented Element</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Comment#getCommentedElement()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_CommentedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.rationale.AudioComment
	 * <em>Audio Comment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Audio Comment</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.AudioComment
	 * @generated
	 */
	EClass getAudioComment();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.AudioComment#getAudioFile <em>Audio File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Audio File</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.AudioComment#getAudioFile()
	 * @see #getAudioComment()
	 * @generated
	 */
	EReference getAudioComment_AudioFile();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RationaleFactory getRationaleFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl
		 * <em>Issue</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Proposals</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ISSUE__PROPOSALS = eINSTANCE.getIssue_Proposals();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ISSUE__SOLUTION = eINSTANCE.getIssue_Solution();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ISSUE__CRITERIA = eINSTANCE.getIssue_Criteria();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ISSUE__ACTIVITY = eINSTANCE.getIssue_Activity();

		/**
		 * The meta object literal for the '<em><b>Assessments</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ISSUE__ASSESSMENTS = eINSTANCE.getIssue_Assessments();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.ProposalImpl <em>Proposal</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.ProposalImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getProposal()
		 * @generated
		 */
		EClass PROPOSAL = eINSTANCE.getProposal();

		/**
		 * The meta object literal for the '<em><b>Assessments</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPOSAL__ASSESSMENTS = eINSTANCE.getProposal_Assessments();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPOSAL__ISSUE = eINSTANCE.getProposal_Issue();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.SolutionImpl <em>Solution</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.SolutionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Underlying Proposals</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SOLUTION__UNDERLYING_PROPOSALS = eINSTANCE.getSolution_UnderlyingProposals();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SOLUTION__ISSUE = eINSTANCE.getSolution_Issue();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.CriterionImpl <em>Criterion</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.CriterionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getCriterion()
		 * @generated
		 */
		EClass CRITERION = eINSTANCE.getCriterion();

		/**
		 * The meta object literal for the '<em><b>Assessments</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CRITERION__ASSESSMENTS = eINSTANCE.getCriterion_Assessments();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.AssessmentImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>Proposal</b></em>' container reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSESSMENT__PROPOSAL = eINSTANCE.getAssessment_Proposal();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSESSMENT__CRITERION = eINSTANCE.getAssessment_Criterion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSESSMENT__VALUE = eINSTANCE.getAssessment_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.CommentImpl <em>Comment</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.CommentImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMMENT__SENDER = eINSTANCE.getComment_Sender();

		/**
		 * The meta object literal for the '<em><b>Recipients</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMMENT__RECIPIENTS = eINSTANCE.getComment_Recipients();

		/**
		 * The meta object literal for the '<em><b>Commented Element</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMMENT__COMMENTED_ELEMENT = eINSTANCE.getComment_CommentedElement();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.AudioCommentImpl <em>Audio Comment</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.AudioCommentImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl#getAudioComment()
		 * @generated
		 */
		EClass AUDIO_COMMENT = eINSTANCE.getAudioComment();

		/**
		 * The meta object literal for the '<em><b>Audio File</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference AUDIO_COMMENT__AUDIO_FILE = eINSTANCE.getAudioComment_AudioFile();

	}

} // RationalePackage
