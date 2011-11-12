/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.activity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.emfstore.client.test.model.activity.Activity;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityEnd;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityFactory;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityInitial;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityPackage;
import org.eclipse.emf.emfstore.client.test.model.activity.Branch;
import org.eclipse.emf.emfstore.client.test.model.activity.Fork;
import org.eclipse.emf.emfstore.client.test.model.activity.Transition;
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
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage;
import org.eclipse.emf.emfstore.client.test.model.organization.impl.OrganizationPackageImpl;
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
public class ActivityPackageImpl extends EPackageImpl implements ActivityPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass activityObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass forkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass activityInitialEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass activityEndEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivityPackageImpl() {
		super(eNS_URI, ActivityFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ActivityPackage#eINSTANCE} when that field is accessed. Clients should
	 * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivityPackage init() {
		if (isInited)
			return (ActivityPackage) EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI);

		// Obtain or create and register package
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE
			.get(eNS_URI) : new ActivityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage_1 = (ModelPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.emfstore.client.test.model.ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.emfstore.client.test.model.ModelPackage.eNS_URI)
			: org.eclipse.emf.emfstore.client.test.model.ModelPackage.eINSTANCE);
		OrganizationPackageImpl theOrganizationPackage = (OrganizationPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(OrganizationPackage.eNS_URI) instanceof OrganizationPackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(OrganizationPackage.eNS_URI) : OrganizationPackage.eINSTANCE);
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
		ReleasePackageImpl theReleasePackage = (ReleasePackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(ReleasePackage.eNS_URI) instanceof ReleasePackageImpl ? EPackage.Registry.INSTANCE
			.getEPackage(ReleasePackage.eNS_URI) : ReleasePackage.eINSTANCE);

		// Create package meta-data objects
		theActivityPackage.createPackageContents();
		theModelPackage_1.createPackageContents();
		theOrganizationPackage.createPackageContents();
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
		theReleasePackage.createPackageContents();

		// Initialize created meta-data
		theActivityPackage.initializePackageContents();
		theModelPackage_1.initializePackageContents();
		theOrganizationPackage.initializePackageContents();
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
		theReleasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivityPackage.eNS_URI, theActivityPackage);
		return theActivityPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getActivityObject() {
		return activityObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActivityObject_IncomingTransitions() {
		return (EReference) activityObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActivityObject_OutgoingTransitions() {
		return (EReference) activityObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransition_Condition() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFork() {
		return forkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getActivityInitial() {
		return activityInitialEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getActivityEnd() {
		return activityEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityFactory getActivityFactory() {
		return (ActivityFactory) getEFactoryInstance();
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
		activityObjectEClass = createEClass(ACTIVITY_OBJECT);
		createEReference(activityObjectEClass, ACTIVITY_OBJECT__INCOMING_TRANSITIONS);
		createEReference(activityObjectEClass, ACTIVITY_OBJECT__OUTGOING_TRANSITIONS);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__CONDITION);

		activityEClass = createEClass(ACTIVITY);

		forkEClass = createEClass(FORK);

		branchEClass = createEClass(BRANCH);

		activityInitialEClass = createEClass(ACTIVITY_INITIAL);

		activityEndEClass = createEClass(ACTIVITY_END);
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
		org.eclipse.emf.emfstore.client.test.model.ModelPackage theModelPackage_1 = (org.eclipse.emf.emfstore.client.test.model.ModelPackage) EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.emfstore.client.test.model.ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityObjectEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		transitionEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		activityEClass.getESuperTypes().add(this.getActivityObject());
		forkEClass.getESuperTypes().add(this.getActivityObject());
		branchEClass.getESuperTypes().add(this.getActivityObject());
		activityInitialEClass.getESuperTypes().add(this.getActivityObject());
		activityEndEClass.getESuperTypes().add(this.getActivityObject());

		// Initialize classes and features; add operations and parameters
		initEClass(activityObjectEClass, ActivityObject.class, "ActivityObject", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityObject_IncomingTransitions(), this.getTransition(), this.getTransition_Target(),
			"incomingTransitions", null, 0, -1, ActivityObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityObject_OutgoingTransitions(), this.getTransition(), this.getTransition_Source(),
			"outgoingTransitions", null, 0, -1, ActivityObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getActivityObject(), this.getActivityObject_OutgoingTransitions(),
			"source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getActivityObject(), this.getActivityObject_IncomingTransitions(),
			"target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Transition.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityInitialEClass, ActivityInitial.class, "ActivityInitial", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEndEClass, ActivityEnd.class, "ActivityEnd", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
	}

} // ActivityPackageImpl
