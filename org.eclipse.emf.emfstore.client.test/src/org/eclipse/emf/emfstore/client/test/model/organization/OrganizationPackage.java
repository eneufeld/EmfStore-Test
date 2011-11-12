/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.organization;

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
 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrganizationFactory
 * @model kind="package"
 * @generated
 */
public interface OrganizationPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "organization";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/organization";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.organization";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	OrganizationPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.organization.impl.OrganizationPackageImpl
		.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.organization.impl.OrgUnitImpl
	 * <em>Org Unit</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.OrgUnitImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.OrganizationPackageImpl#getOrgUnit()
	 * @generated
	 */
	int ORG_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Ac Org Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__AC_ORG_ID = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group Memberships</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__GROUP_MEMBERSHIPS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__ASSIGNMENTS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Participations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__PARTICIPATIONS = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Org Unit</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.organization.impl.UserImpl
	 * <em>User</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.UserImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.OrganizationPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__NAME = ORG_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__DESCRIPTION = ORG_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__ANNOTATIONS = ORG_UNIT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__ATTACHMENTS = ORG_UNIT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__INCOMING_DOCUMENT_REFERENCES = ORG_UNIT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__LEAF_SECTION = ORG_UNIT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__STATE = ORG_UNIT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__APPLIED_STEREOTYPE_INSTANCES = ORG_UNIT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__COMMENTS = ORG_UNIT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__CREATION_DATE = ORG_UNIT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__CREATOR = ORG_UNIT__CREATOR;

	/**
	 * The feature id for the '<em><b>Ac Org Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__AC_ORG_ID = ORG_UNIT__AC_ORG_ID;

	/**
	 * The feature id for the '<em><b>Group Memberships</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__GROUP_MEMBERSHIPS = ORG_UNIT__GROUP_MEMBERSHIPS;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__ASSIGNMENTS = ORG_UNIT__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Participations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__PARTICIPATIONS = ORG_UNIT__PARTICIPATIONS;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = ORG_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = ORG_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = ORG_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work Items To Review</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER__WORK_ITEMS_TO_REVIEW = ORG_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ORG_UNIT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.organization.impl.GroupImpl
	 * <em>Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.GroupImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.OrganizationPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ORG_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = ORG_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__ANNOTATIONS = ORG_UNIT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__ATTACHMENTS = ORG_UNIT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__INCOMING_DOCUMENT_REFERENCES = ORG_UNIT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__LEAF_SECTION = ORG_UNIT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__STATE = ORG_UNIT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__APPLIED_STEREOTYPE_INSTANCES = ORG_UNIT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__COMMENTS = ORG_UNIT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__CREATION_DATE = ORG_UNIT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__CREATOR = ORG_UNIT__CREATOR;

	/**
	 * The feature id for the '<em><b>Ac Org Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__AC_ORG_ID = ORG_UNIT__AC_ORG_ID;

	/**
	 * The feature id for the '<em><b>Group Memberships</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP_MEMBERSHIPS = ORG_UNIT__GROUP_MEMBERSHIPS;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__ASSIGNMENTS = ORG_UNIT__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Participations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__PARTICIPATIONS = ORG_UNIT__PARTICIPATIONS;

	/**
	 * The feature id for the '<em><b>Org Units</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__ORG_UNITS = ORG_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ORG_UNIT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.organization.User
	 * <em>User</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.User#getEmail <em>Email</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.User#getFirstName <em>First Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.User#getLastName <em>Last Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.User#getWorkItemsToReview
	 * <em>Work Items To Review</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Work Items To Review</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.User#getWorkItemsToReview()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_WorkItemsToReview();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit
	 * <em>Org Unit</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Org Unit</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit
	 * @generated
	 */
	EClass getOrgUnit();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getAcOrgId <em>Ac Org Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ac Org Id</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getAcOrgId()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EAttribute getOrgUnit_AcOrgId();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getGroupMemberships
	 * <em>Group Memberships</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Group Memberships</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getGroupMemberships()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EReference getOrgUnit_GroupMemberships();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Assignments</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getAssignments()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EReference getOrgUnit_Assignments();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getParticipations <em>Participations</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Participations</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getParticipations()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EReference getOrgUnit_Participations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.organization.Group
	 * <em>Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.Group#getOrgUnits <em>Org Units</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Org Units</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.Group#getOrgUnits()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_OrgUnits();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrganizationFactory getOrganizationFactory();

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
		 * {@link org.eclipse.emf.emfstore.client.test.model.organization.impl.UserImpl <em>User</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.UserImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.OrganizationPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Work Items To Review</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USER__WORK_ITEMS_TO_REVIEW = eINSTANCE.getUser_WorkItemsToReview();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.organization.impl.OrgUnitImpl <em>Org Unit</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.OrgUnitImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.OrganizationPackageImpl#getOrgUnit()
		 * @generated
		 */
		EClass ORG_UNIT = eINSTANCE.getOrgUnit();

		/**
		 * The meta object literal for the '<em><b>Ac Org Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ORG_UNIT__AC_ORG_ID = eINSTANCE.getOrgUnit_AcOrgId();

		/**
		 * The meta object literal for the '<em><b>Group Memberships</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ORG_UNIT__GROUP_MEMBERSHIPS = eINSTANCE.getOrgUnit_GroupMemberships();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ORG_UNIT__ASSIGNMENTS = eINSTANCE.getOrgUnit_Assignments();

		/**
		 * The meta object literal for the '<em><b>Participations</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ORG_UNIT__PARTICIPATIONS = eINSTANCE.getOrgUnit_Participations();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.organization.impl.GroupImpl <em>Group</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.GroupImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.organization.impl.OrganizationPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Org Units</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GROUP__ORG_UNITS = eINSTANCE.getGroup_OrgUnits();

	}

} // OrganizationPackage
