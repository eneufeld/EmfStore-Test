/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.organization.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityPackage;
import org.eclipse.emf.emfstore.client.test.model.activity.impl.ActivityPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.attachment.AttachmentPackage;
import org.eclipse.emf.emfstore.client.test.model.attachment.impl.AttachmentPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.bug.BugPackage;
import org.eclipse.emf.emfstore.client.test.model.bug.impl.BugPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.change.ChangePackage;
import org.eclipse.emf.emfstore.client.test.model.change.impl.ChangePackageImpl;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.impl.ClassesPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.component.ComponentPackage;
import org.eclipse.emf.emfstore.client.test.model.component.impl.ComponentPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage;
import org.eclipse.emf.emfstore.client.test.model.document.impl.DocumentPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.impl.ModelPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage;
import org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.organization.Group;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationFactory;
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage;
import org.eclipse.emf.emfstore.client.test.model.organization.User;
import org.eclipse.emf.emfstore.client.test.model.profile.ProfilePackage;
import org.eclipse.emf.emfstore.client.test.model.profile.impl.ProfilePackageImpl;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;
import org.eclipse.emf.emfstore.client.test.model.rationale.impl.RationalePackageImpl;
import org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage;
import org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.impl.RequirementPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.state.StatePackage;
import org.eclipse.emf.emfstore.client.test.model.state.impl.StatePackageImpl;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;
import org.eclipse.emf.emfstore.client.test.model.task.impl.TaskPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.util.UtilPackage;
import org.eclipse.emf.emfstore.client.test.model.util.impl.UtilPackageImpl;
import org.eclipse.emf.emfstore.server.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class OrganizationPackageImpl extends EPackageImpl implements OrganizationPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass orgUnitEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrganizationPackageImpl() {
		super(eNS_URI, OrganizationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * <p>
	 * This method is used to initialize {@link OrganizationPackage#eINSTANCE} when that field is accessed. Clients
	 * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrganizationPackage init() {
		if (isInited)
			return (OrganizationPackage) EPackage.Registry.INSTANCE.getEPackage(OrganizationPackage.eNS_URI);

		// Obtain or create and register package
		OrganizationPackageImpl theOrganizationPackage = (OrganizationPackageImpl) (EPackage.Registry.INSTANCE
			.get(eNS_URI) instanceof OrganizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
			: new OrganizationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage_1 = (ModelPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.emfstore.client.test.model.ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.emfstore.client.test.model.ModelPackage.eNS_URI)
			: org.eclipse.emf.emfstore.client.test.model.ModelPackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(ClassesPackage.eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(ClassesPackage.eNS_URI) : ClassesPackage.eINSTANCE);
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(DocumentPackage.eNS_URI) instanceof DocumentPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(DocumentPackage.eNS_URI) : DocumentPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		RationalePackageImpl theRationalePackage = (RationalePackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(RationalePackage.eNS_URI) instanceof RationalePackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(RationalePackage.eNS_URI) : RationalePackage.eINSTANCE);
		ChangePackageImpl theChangePackage = (ChangePackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(ChangePackage.eNS_URI) instanceof ChangePackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(ChangePackage.eNS_URI) : ChangePackage.eINSTANCE);
		BugPackageImpl theBugPackage = (BugPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(BugPackage.eNS_URI) instanceof BugPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(BugPackage.eNS_URI) : BugPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		MeetingPackageImpl theMeetingPackage = (MeetingPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(MeetingPackage.eNS_URI) instanceof MeetingPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(MeetingPackage.eNS_URI) : MeetingPackage.eINSTANCE);
		StatePackageImpl theStatePackage = (StatePackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
		AttachmentPackageImpl theAttachmentPackage = (AttachmentPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(AttachmentPackage.eNS_URI) instanceof AttachmentPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(AttachmentPackage.eNS_URI) : AttachmentPackage.eINSTANCE);
		ProfilePackageImpl theProfilePackage = (ProfilePackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(ProfilePackage.eNS_URI) instanceof ProfilePackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(ProfilePackage.eNS_URI) : ProfilePackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		ReleasePackageImpl theReleasePackage = (ReleasePackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(ReleasePackage.eNS_URI) instanceof ReleasePackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(ReleasePackage.eNS_URI) : ReleasePackage.eINSTANCE);

		// Create package meta-data objects
		theOrganizationPackage.createPackageContents();
		theModelPackage_1.createPackageContents();
		theTaskPackage.createPackageContents();
		theClassesPackage.createPackageContents();
		theDocumentPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theRationalePackage.createPackageContents();
		theChangePackage.createPackageContents();
		theBugPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theMeetingPackage.createPackageContents();
		theStatePackage.createPackageContents();
		theAttachmentPackage.createPackageContents();
		theProfilePackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theReleasePackage.createPackageContents();

		// Initialize created meta-data
		theOrganizationPackage.initializePackageContents();
		theModelPackage_1.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theClassesPackage.initializePackageContents();
		theDocumentPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theRationalePackage.initializePackageContents();
		theChangePackage.initializePackageContents();
		theBugPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theMeetingPackage.initializePackageContents();
		theStatePackage.initializePackageContents();
		theAttachmentPackage.initializePackageContents();
		theProfilePackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theReleasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrganizationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrganizationPackage.eNS_URI, theOrganizationPackage);
		return theOrganizationPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUser_FirstName() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUser_LastName() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUser_WorkItemsToReview() {
		return (EReference) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOrgUnit() {
		return orgUnitEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getOrgUnit_AcOrgId() {
		return (EAttribute) orgUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOrgUnit_GroupMemberships() {
		return (EReference) orgUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOrgUnit_Assignments() {
		return (EReference) orgUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOrgUnit_Participations() {
		return (EReference) orgUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGroup_OrgUnits() {
		return (EReference) groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrganizationFactory getOrganizationFactory() {
		return (OrganizationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
	 * its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__FIRST_NAME);
		createEAttribute(userEClass, USER__LAST_NAME);
		createEReference(userEClass, USER__WORK_ITEMS_TO_REVIEW);

		orgUnitEClass = createEClass(ORG_UNIT);
		createEAttribute(orgUnitEClass, ORG_UNIT__AC_ORG_ID);
		createEReference(orgUnitEClass, ORG_UNIT__GROUP_MEMBERSHIPS);
		createEReference(orgUnitEClass, ORG_UNIT__ASSIGNMENTS);
		createEReference(orgUnitEClass, ORG_UNIT__PARTICIPATIONS);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__ORG_UNITS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TaskPackage theTaskPackage = (TaskPackage) EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);
		org.eclipse.emf.emfstore.client.test.model.ModelPackage theModelPackage_1 = (org.eclipse.emf.emfstore.client.test.model.ModelPackage) EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.emfstore.client.test.model.ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userEClass.getESuperTypes().add(this.getOrgUnit());
		orgUnitEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		groupEClass.getESuperTypes().add(this.getOrgUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 0, 1, User.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, User.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, User.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_WorkItemsToReview(), theTaskPackage.getWorkItem(),
			theTaskPackage.getWorkItem_Reviewer(), "workItemsToReview", null, 0, -1, User.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);

		initEClass(orgUnitEClass, OrgUnit.class, "OrgUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrgUnit_AcOrgId(), ecorePackage.getEString(), "acOrgId", null, 0, 1, OrgUnit.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrgUnit_GroupMemberships(), this.getGroup(), this.getGroup_OrgUnits(), "groupMemberships",
			null, 0, -1, OrgUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrgUnit_Assignments(), theTaskPackage.getWorkItem(), theTaskPackage.getWorkItem_Assignee(),
			"assignments", null, 0, -1, OrgUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrgUnit_Participations(), theTaskPackage.getWorkItem(),
			theTaskPackage.getWorkItem_Participants(), "participations", null, 0, -1, OrgUnit.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_OrgUnits(), this.getOrgUnit(), this.getOrgUnit_GroupMemberships(), "orgUnits", null, 0,
			-1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// org.unicase.ui.meeditor
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>org.unicase.ui.meeditor</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.unicase.ui.meeditor";
		addAnnotation(getUser_Email(), source, new String[] { "priority", "10.0", "position", "left" });
		addAnnotation(getUser_FirstName(), source, new String[] { "priority", "11.0", "position", "left" });
		addAnnotation(getUser_LastName(), source, new String[] { "priority", "12.0", "position", "left" });
		addAnnotation(getOrgUnit_GroupMemberships(), source, new String[] { "priority", "10.0", "position", "right" });
		addAnnotation(getOrgUnit_Assignments(), source, new String[] { "priority", "11.0", "position", "right" });
		addAnnotation(getGroup_OrgUnits(), source, new String[] { "priority", "10.5", "position", "right" });
	}

} // OrganizationPackageImpl
