/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.emfstore.client.test.model.ModelPackage;
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
 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "requirement";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/requirement";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.requirement";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	RequirementPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl
		.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.NonFunctionalRequirementImpl
	 * <em>Non Functional Requirement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.NonFunctionalRequirementImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getNonFunctionalRequirement()
	 * @generated
	 */
	int NON_FUNCTIONAL_REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__NAME = RationalePackage.CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__DESCRIPTION = RationalePackage.CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__ANNOTATIONS = RationalePackage.CRITERION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__ATTACHMENTS = RationalePackage.CRITERION__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__INCOMING_DOCUMENT_REFERENCES = RationalePackage.CRITERION__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__LEAF_SECTION = RationalePackage.CRITERION__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__STATE = RationalePackage.CRITERION__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__APPLIED_STEREOTYPE_INSTANCES = RationalePackage.CRITERION__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__COMMENTS = RationalePackage.CRITERION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__CREATION_DATE = RationalePackage.CRITERION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__CREATOR = RationalePackage.CRITERION__CREATOR;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__ASSESSMENTS = RationalePackage.CRITERION__ASSESSMENTS;

	/**
	 * The feature id for the '<em><b>Restricted Scenarios</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS = RationalePackage.CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restricted Use Cases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES = RationalePackage.CRITERION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Functions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS = RationalePackage.CRITERION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Tasks</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__USER_TASKS = RationalePackage.CRITERION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Non Functional Requirement</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = RationalePackage.CRITERION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.FunctionalRequirementImpl
	 * <em>Functional Requirement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.FunctionalRequirementImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getFunctionalRequirement()
	 * @generated
	 */
	int FUNCTIONAL_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Refined Requirement</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__REFINED_REQUIREMENT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Story Points</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__STORY_POINTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PRIORITY = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refining Requirements</b></em>' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__REFINING_REQUIREMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use Cases</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__USE_CASES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SCENARIOS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reviewed</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__REVIEWED = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stakeholder</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__STAKEHOLDER = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__COST = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Functional Requirement</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl
	 * <em>Use Case</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Initiating Actor</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__INITIATING_ACTOR = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participating Actors</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__PARTICIPATING_ACTORS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realized User Task</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__REALIZED_USER_TASK = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__PRECONDITION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use Case Steps</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__USE_CASE_STEPS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__POSTCONDITION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__RULES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__EXCEPTION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__SCENARIOS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Functional Requirements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__FUNCTIONAL_REQUIREMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Non Functional Requirements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__NON_FUNCTIONAL_REQUIREMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Identified Classes</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__IDENTIFIED_CLASSES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Included Use Cases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__INCLUDED_USE_CASES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Extended Use Cases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__EXTENDED_USE_CASES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>System Functions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE__SYSTEM_FUNCTIONS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ScenarioImpl
	 * <em>Scenario</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.ScenarioImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STEPS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initiating Actor Instance</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__INITIATING_ACTOR_INSTANCE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Participating Actor Instances</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PARTICIPATING_ACTOR_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instantiated Use Cases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__INSTANTIATED_USE_CASES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Functional Requirements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__FUNCTIONAL_REQUIREMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Non Functional Requirements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NON_FUNCTIONAL_REQUIREMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Participating Methods</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PARTICIPATING_METHODS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Participating Classes</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PARTICIPATING_CLASSES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorImpl
	 * <em>Actor</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Initiated User Task</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__INITIATED_USER_TASK = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participated User Tasks</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__PARTICIPATED_USER_TASKS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initiated Use Cases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__INITIATED_USE_CASES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Participated Use Cases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__PARTICIPATED_USE_CASES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR__INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actor</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorInstanceImpl
	 * <em>Actor Instance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorInstanceImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getActorInstance()
	 * @generated
	 */
	int ACTOR_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Initiated Scenarios</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__INITIATED_SCENARIOS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participated Scenarios</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__PARTICIPATED_SCENARIOS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instantiated Actor</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__INSTANTIATED_ACTOR = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor Instance</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.StepImpl
	 * <em>Step</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.StepImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>User Step</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__USER_STEP = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Included Use Case</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__INCLUDED_USE_CASE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Included System Function</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__INCLUDED_SYSTEM_FUNCTION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__USE_CASE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl <em>System Function</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getSystemFunction()
	 * @generated
	 */
	int SYSTEM_FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__INPUT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OUTPUT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__EXCEPTION = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Non Functional Requirement</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usecases</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__USECASES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__WORKSPACE = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>System Function</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UserTaskImpl
	 * <em>User Task</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.UserTaskImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Initiating Actor</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__INITIATING_ACTOR = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participating Actors</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__PARTICIPATING_ACTORS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realizing Use Cases</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__REALIZING_USE_CASES = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Non Functional Requirements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NON_FUNCTIONAL_REQUIREMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User Task</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.WorkspaceImpl
	 * <em>Workspace</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.WorkspaceImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>System Functions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__SYSTEM_FUNCTIONS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement
	 * <em>Non Functional Requirement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Non Functional Requirement</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement
	 * @generated
	 */
	EClass getNonFunctionalRequirement();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getRestrictedScenarios
	 * <em>Restricted Scenarios</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Restricted Scenarios</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getRestrictedScenarios()
	 * @see #getNonFunctionalRequirement()
	 * @generated
	 */
	EReference getNonFunctionalRequirement_RestrictedScenarios();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getRestrictedUseCases
	 * <em>Restricted Use Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Restricted Use Cases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getRestrictedUseCases()
	 * @see #getNonFunctionalRequirement()
	 * @generated
	 */
	EReference getNonFunctionalRequirement_RestrictedUseCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getSystemFunctions
	 * <em>System Functions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>System Functions</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getSystemFunctions()
	 * @see #getNonFunctionalRequirement()
	 * @generated
	 */
	EReference getNonFunctionalRequirement_SystemFunctions();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getUserTasks
	 * <em>User Tasks</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>User Tasks</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getUserTasks()
	 * @see #getNonFunctionalRequirement()
	 * @generated
	 */
	EReference getNonFunctionalRequirement_UserTasks();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement
	 * <em>Functional Requirement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefinedRequirement
	 * <em>Refined Requirement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Refined Requirement</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefinedRequirement()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_RefinedRequirement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getStoryPoints
	 * <em>Story Points</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Story Points</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getStoryPoints()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_StoryPoints();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getPriority
	 * <em>Priority</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getPriority()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Priority();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefiningRequirements
	 * <em>Refining Requirements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Refining Requirements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefiningRequirements()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_RefiningRequirements();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getUseCases
	 * <em>Use Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Use Cases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getUseCases()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_UseCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getScenarios
	 * <em>Scenarios</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Scenarios</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getScenarios()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_Scenarios();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#isReviewed <em>Reviewed</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Reviewed</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#isReviewed()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Reviewed();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getStakeholder
	 * <em>Stakeholder</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Stakeholder</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getStakeholder()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_Stakeholder();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getCost <em>Cost</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getCost()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Cost();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase
	 * <em>Use Case</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getInitiatingActor
	 * <em>Initiating Actor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Initiating Actor</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getInitiatingActor()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_InitiatingActor();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getParticipatingActors
	 * <em>Participating Actors</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participating Actors</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getParticipatingActors()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_ParticipatingActors();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getRealizedUserTask
	 * <em>Realized User Task</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Realized User Task</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getRealizedUserTask()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_RealizedUserTask();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getPrecondition()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Precondition();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getUseCaseSteps <em>Use Case Steps</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Use Case Steps</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getUseCaseSteps()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_UseCaseSteps();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Postcondition</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getPostcondition()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Postcondition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getRules <em>Rules</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Rules</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getRules()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Rules();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getException <em>Exception</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getException()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Exception();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getScenarios <em>Scenarios</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Scenarios</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getScenarios()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Scenarios();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getFunctionalRequirements
	 * <em>Functional Requirements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Functional Requirements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getFunctionalRequirements()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_FunctionalRequirements();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getNonFunctionalRequirements
	 * <em>Non Functional Requirements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Non Functional Requirements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getNonFunctionalRequirements()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_NonFunctionalRequirements();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getIdentifiedClasses
	 * <em>Identified Classes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Identified Classes</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getIdentifiedClasses()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_IdentifiedClasses();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getIncludedUseCases
	 * <em>Included Use Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Included Use Cases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getIncludedUseCases()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_IncludedUseCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getExtendedUseCases
	 * <em>Extended Use Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Extended Use Cases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getExtendedUseCases()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_ExtendedUseCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getSystemFunctions
	 * <em>System Functions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>System Functions</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getSystemFunctions()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_SystemFunctions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario
	 * <em>Scenario</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getSteps <em>Steps</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getSteps()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Steps();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getInitiatingActorInstance
	 * <em>Initiating Actor Instance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Initiating Actor Instance</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getInitiatingActorInstance()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_InitiatingActorInstance();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingActorInstances
	 * <em>Participating Actor Instances</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participating Actor Instances</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingActorInstances()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ParticipatingActorInstances();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getInstantiatedUseCases
	 * <em>Instantiated Use Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Instantiated Use Cases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getInstantiatedUseCases()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_InstantiatedUseCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getFunctionalRequirements
	 * <em>Functional Requirements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Functional Requirements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getFunctionalRequirements()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_FunctionalRequirements();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getNonFunctionalRequirements
	 * <em>Non Functional Requirements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Non Functional Requirements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getNonFunctionalRequirements()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_NonFunctionalRequirements();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingMethods
	 * <em>Participating Methods</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participating Methods</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingMethods()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ParticipatingMethods();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingClasses
	 * <em>Participating Classes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participating Classes</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingClasses()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ParticipatingClasses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor
	 * <em>Actor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInitiatedUserTask
	 * <em>Initiated User Task</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Initiated User Task</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInitiatedUserTask()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_InitiatedUserTask();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getParticipatedUserTasks
	 * <em>Participated User Tasks</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participated User Tasks</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getParticipatedUserTasks()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ParticipatedUserTasks();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInitiatedUseCases
	 * <em>Initiated Use Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Initiated Use Cases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInitiatedUseCases()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_InitiatedUseCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getParticipatedUseCases
	 * <em>Participated Use Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participated Use Cases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getParticipatedUseCases()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ParticipatedUseCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInstances <em>Instances</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInstances()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Instances();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance
	 * <em>Actor Instance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Actor Instance</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance
	 * @generated
	 */
	EClass getActorInstance();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getInitiatedScenarios
	 * <em>Initiated Scenarios</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Initiated Scenarios</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getInitiatedScenarios()
	 * @see #getActorInstance()
	 * @generated
	 */
	EReference getActorInstance_InitiatedScenarios();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getParticipatedScenarios
	 * <em>Participated Scenarios</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participated Scenarios</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getParticipatedScenarios()
	 * @see #getActorInstance()
	 * @generated
	 */
	EReference getActorInstance_ParticipatedScenarios();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getInstantiatedActor
	 * <em>Instantiated Actor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Instantiated Actor</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getInstantiatedActor()
	 * @see #getActorInstance()
	 * @generated
	 */
	EReference getActorInstance_InstantiatedActor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.requirement.Step
	 * <em>Step</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Step#isUserStep <em>User Step</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>User Step</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Step#isUserStep()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_UserStep();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Step#getIncludedUseCase <em>Included Use Case</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Included Use Case</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Step#getIncludedUseCase()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_IncludedUseCase();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Step#getIncludedSystemFunction
	 * <em>Included System Function</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Included System Function</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Step#getIncludedSystemFunction()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_IncludedSystemFunction();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Step#getUseCase <em>Use Case</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Use Case</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Step#getUseCase()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_UseCase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction
	 * <em>System Function</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>System Function</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction
	 * @generated
	 */
	EClass getSystemFunction();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getInput <em>Input</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getInput()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EAttribute getSystemFunction_Input();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getOutput <em>Output</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getOutput()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EAttribute getSystemFunction_Output();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getException()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EAttribute getSystemFunction_Exception();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getNonFunctionalRequirement
	 * <em>Non Functional Requirement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Non Functional Requirement</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getNonFunctionalRequirement()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EReference getSystemFunction_NonFunctionalRequirement();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getUsecases <em>Usecases</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Usecases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getUsecases()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EReference getSystemFunction_Usecases();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Workspace</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getWorkspace()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EReference getSystemFunction_Workspace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask
	 * <em>User Task</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getInitiatingActor
	 * <em>Initiating Actor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Initiating Actor</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getInitiatingActor()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_InitiatingActor();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getParticipatingActors
	 * <em>Participating Actors</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participating Actors</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getParticipatingActors()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_ParticipatingActors();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getRealizingUseCases
	 * <em>Realizing Use Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Realizing Use Cases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getRealizingUseCases()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_RealizingUseCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getNonFunctionalRequirements
	 * <em>Non Functional Requirements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Non Functional Requirements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getNonFunctionalRequirements()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_NonFunctionalRequirements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.requirement.Workspace
	 * <em>Workspace</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Workspace#getSystemFunctions
	 * <em>System Functions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>System Functions</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Workspace#getSystemFunctions()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_SystemFunctions();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementFactory getRequirementFactory();

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
		 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.NonFunctionalRequirementImpl
		 * <em>Non Functional Requirement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.NonFunctionalRequirementImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getNonFunctionalRequirement()
		 * @generated
		 */
		EClass NON_FUNCTIONAL_REQUIREMENT = eINSTANCE.getNonFunctionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Restricted Scenarios</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS = eINSTANCE
			.getNonFunctionalRequirement_RestrictedScenarios();

		/**
		 * The meta object literal for the '<em><b>Restricted Use Cases</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES = eINSTANCE
			.getNonFunctionalRequirement_RestrictedUseCases();

		/**
		 * The meta object literal for the '<em><b>System Functions</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS = eINSTANCE
			.getNonFunctionalRequirement_SystemFunctions();

		/**
		 * The meta object literal for the '<em><b>User Tasks</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NON_FUNCTIONAL_REQUIREMENT__USER_TASKS = eINSTANCE.getNonFunctionalRequirement_UserTasks();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.FunctionalRequirementImpl
		 * <em>Functional Requirement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.FunctionalRequirementImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Refined Requirement</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__REFINED_REQUIREMENT = eINSTANCE
			.getFunctionalRequirement_RefinedRequirement();

		/**
		 * The meta object literal for the '<em><b>Story Points</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__STORY_POINTS = eINSTANCE.getFunctionalRequirement_StoryPoints();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__PRIORITY = eINSTANCE.getFunctionalRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Refining Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__REFINING_REQUIREMENTS = eINSTANCE
			.getFunctionalRequirement_RefiningRequirements();

		/**
		 * The meta object literal for the '<em><b>Use Cases</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__USE_CASES = eINSTANCE.getFunctionalRequirement_UseCases();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__SCENARIOS = eINSTANCE.getFunctionalRequirement_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Reviewed</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__REVIEWED = eINSTANCE.getFunctionalRequirement_Reviewed();

		/**
		 * The meta object literal for the '<em><b>Stakeholder</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__STAKEHOLDER = eINSTANCE.getFunctionalRequirement_Stakeholder();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__COST = eINSTANCE.getFunctionalRequirement_Cost();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Initiating Actor</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__INITIATING_ACTOR = eINSTANCE.getUseCase_InitiatingActor();

		/**
		 * The meta object literal for the '<em><b>Participating Actors</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__PARTICIPATING_ACTORS = eINSTANCE.getUseCase_ParticipatingActors();

		/**
		 * The meta object literal for the '<em><b>Realized User Task</b></em>' reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__REALIZED_USER_TASK = eINSTANCE.getUseCase_RealizedUserTask();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute USE_CASE__PRECONDITION = eINSTANCE.getUseCase_Precondition();

		/**
		 * The meta object literal for the '<em><b>Use Case Steps</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__USE_CASE_STEPS = eINSTANCE.getUseCase_UseCaseSteps();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute USE_CASE__POSTCONDITION = eINSTANCE.getUseCase_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute USE_CASE__RULES = eINSTANCE.getUseCase_Rules();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute USE_CASE__EXCEPTION = eINSTANCE.getUseCase_Exception();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__SCENARIOS = eINSTANCE.getUseCase_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Functional Requirements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__FUNCTIONAL_REQUIREMENTS = eINSTANCE.getUseCase_FunctionalRequirements();

		/**
		 * The meta object literal for the '<em><b>Non Functional Requirements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__NON_FUNCTIONAL_REQUIREMENTS = eINSTANCE.getUseCase_NonFunctionalRequirements();

		/**
		 * The meta object literal for the '<em><b>Identified Classes</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__IDENTIFIED_CLASSES = eINSTANCE.getUseCase_IdentifiedClasses();

		/**
		 * The meta object literal for the '<em><b>Included Use Cases</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__INCLUDED_USE_CASES = eINSTANCE.getUseCase_IncludedUseCases();

		/**
		 * The meta object literal for the '<em><b>Extended Use Cases</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__EXTENDED_USE_CASES = eINSTANCE.getUseCase_ExtendedUseCases();

		/**
		 * The meta object literal for the '<em><b>System Functions</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE_CASE__SYSTEM_FUNCTIONS = eINSTANCE.getUseCase_SystemFunctions();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.ScenarioImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__STEPS = eINSTANCE.getScenario_Steps();

		/**
		 * The meta object literal for the '<em><b>Initiating Actor Instance</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__INITIATING_ACTOR_INSTANCE = eINSTANCE.getScenario_InitiatingActorInstance();

		/**
		 * The meta object literal for the '<em><b>Participating Actor Instances</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__PARTICIPATING_ACTOR_INSTANCES = eINSTANCE.getScenario_ParticipatingActorInstances();

		/**
		 * The meta object literal for the '<em><b>Instantiated Use Cases</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__INSTANTIATED_USE_CASES = eINSTANCE.getScenario_InstantiatedUseCases();

		/**
		 * The meta object literal for the '<em><b>Functional Requirements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__FUNCTIONAL_REQUIREMENTS = eINSTANCE.getScenario_FunctionalRequirements();

		/**
		 * The meta object literal for the '<em><b>Non Functional Requirements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__NON_FUNCTIONAL_REQUIREMENTS = eINSTANCE.getScenario_NonFunctionalRequirements();

		/**
		 * The meta object literal for the '<em><b>Participating Methods</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__PARTICIPATING_METHODS = eINSTANCE.getScenario_ParticipatingMethods();

		/**
		 * The meta object literal for the '<em><b>Participating Classes</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__PARTICIPATING_CLASSES = eINSTANCE.getScenario_ParticipatingClasses();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorImpl <em>Actor</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Initiated User Task</b></em>' reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTOR__INITIATED_USER_TASK = eINSTANCE.getActor_InitiatedUserTask();

		/**
		 * The meta object literal for the '<em><b>Participated User Tasks</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTOR__PARTICIPATED_USER_TASKS = eINSTANCE.getActor_ParticipatedUserTasks();

		/**
		 * The meta object literal for the '<em><b>Initiated Use Cases</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTOR__INITIATED_USE_CASES = eINSTANCE.getActor_InitiatedUseCases();

		/**
		 * The meta object literal for the '<em><b>Participated Use Cases</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTOR__PARTICIPATED_USE_CASES = eINSTANCE.getActor_ParticipatedUseCases();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTOR__INSTANCES = eINSTANCE.getActor_Instances();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorInstanceImpl <em>Actor Instance</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorInstanceImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getActorInstance()
		 * @generated
		 */
		EClass ACTOR_INSTANCE = eINSTANCE.getActorInstance();

		/**
		 * The meta object literal for the '<em><b>Initiated Scenarios</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTOR_INSTANCE__INITIATED_SCENARIOS = eINSTANCE.getActorInstance_InitiatedScenarios();

		/**
		 * The meta object literal for the '<em><b>Participated Scenarios</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTOR_INSTANCE__PARTICIPATED_SCENARIOS = eINSTANCE.getActorInstance_ParticipatedScenarios();

		/**
		 * The meta object literal for the '<em><b>Instantiated Actor</b></em>' reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTOR_INSTANCE__INSTANTIATED_ACTOR = eINSTANCE.getActorInstance_InstantiatedActor();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.StepImpl
		 * <em>Step</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.StepImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>User Step</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STEP__USER_STEP = eINSTANCE.getStep_UserStep();

		/**
		 * The meta object literal for the '<em><b>Included Use Case</b></em>' reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEP__INCLUDED_USE_CASE = eINSTANCE.getStep_IncludedUseCase();

		/**
		 * The meta object literal for the '<em><b>Included System Function</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEP__INCLUDED_SYSTEM_FUNCTION = eINSTANCE.getStep_IncludedSystemFunction();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' container reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STEP__USE_CASE = eINSTANCE.getStep_UseCase();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl
		 * <em>System Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getSystemFunction()
		 * @generated
		 */
		EClass SYSTEM_FUNCTION = eINSTANCE.getSystemFunction();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SYSTEM_FUNCTION__INPUT = eINSTANCE.getSystemFunction_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SYSTEM_FUNCTION__OUTPUT = eINSTANCE.getSystemFunction_Output();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SYSTEM_FUNCTION__EXCEPTION = eINSTANCE.getSystemFunction_Exception();

		/**
		 * The meta object literal for the '<em><b>Non Functional Requirement</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT = eINSTANCE.getSystemFunction_NonFunctionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Usecases</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SYSTEM_FUNCTION__USECASES = eINSTANCE.getSystemFunction_Usecases();

		/**
		 * The meta object literal for the '<em><b>Workspace</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SYSTEM_FUNCTION__WORKSPACE = eINSTANCE.getSystemFunction_Workspace();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UserTaskImpl <em>User Task</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.UserTaskImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getUserTask()
		 * @generated
		 */
		EClass USER_TASK = eINSTANCE.getUserTask();

		/**
		 * The meta object literal for the '<em><b>Initiating Actor</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USER_TASK__INITIATING_ACTOR = eINSTANCE.getUserTask_InitiatingActor();

		/**
		 * The meta object literal for the '<em><b>Participating Actors</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USER_TASK__PARTICIPATING_ACTORS = eINSTANCE.getUserTask_ParticipatingActors();

		/**
		 * The meta object literal for the '<em><b>Realizing Use Cases</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USER_TASK__REALIZING_USE_CASES = eINSTANCE.getUserTask_RealizingUseCases();

		/**
		 * The meta object literal for the '<em><b>Non Functional Requirements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USER_TASK__NON_FUNCTIONAL_REQUIREMENTS = eINSTANCE.getUserTask_NonFunctionalRequirements();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.WorkspaceImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>System Functions</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORKSPACE__SYSTEM_FUNCTIONS = eINSTANCE.getWorkspace_SystemFunctions();

	}

} // RequirementPackage
