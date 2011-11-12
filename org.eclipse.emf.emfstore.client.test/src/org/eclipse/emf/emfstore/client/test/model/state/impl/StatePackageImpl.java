/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.state.impl;

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
import org.eclipse.emf.emfstore.client.test.model.state.State;
import org.eclipse.emf.emfstore.client.test.model.state.StateEnd;
import org.eclipse.emf.emfstore.client.test.model.state.StateFactory;
import org.eclipse.emf.emfstore.client.test.model.state.StateInitial;
import org.eclipse.emf.emfstore.client.test.model.state.StateNode;
import org.eclipse.emf.emfstore.client.test.model.state.StatePackage;
import org.eclipse.emf.emfstore.client.test.model.state.Transition;
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
public class StatePackageImpl extends EPackageImpl implements StatePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass stateEClass = null;

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
	private EClass stateNodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass stateInitialEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass stateEndEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.emfstore.client.test.model.state.StatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatePackageImpl() {
		super(eNS_URI, StateFactory.eINSTANCE);
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
	 * This method is used to initialize {@link StatePackage#eINSTANCE} when that field is accessed. Clients should not
	 * invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatePackage init() {
		if (isInited)
			return (StatePackage) EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);

		// Obtain or create and register package
		StatePackageImpl theStatePackage = (StatePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE
			.get(eNS_URI) : new StatePackageImpl());

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
		theStatePackage.createPackageContents();
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
		theAttachmentPackage.createPackageContents();
		theProfilePackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theReleasePackage.createPackageContents();

		// Initialize created meta-data
		theStatePackage.initializePackageContents();
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
		theAttachmentPackage.initializePackageContents();
		theProfilePackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theReleasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatePackage.eNS_URI, theStatePackage);
		return theStatePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getState_ExitConditions() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getState_Activities() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getState_EntryConditions() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTransition_Condition() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStateNode() {
		return stateNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStateNode_OutgoingTransitions() {
		return (EReference) stateNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStateNode_IncomingTransitions() {
		return (EReference) stateNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStateInitial() {
		return stateInitialEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStateEnd() {
		return stateEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StateFactory getStateFactory() {
		return (StateFactory) getEFactoryInstance();
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
		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__EXIT_CONDITIONS);
		createEAttribute(stateEClass, STATE__ACTIVITIES);
		createEAttribute(stateEClass, STATE__ENTRY_CONDITIONS);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__CONDITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);

		stateNodeEClass = createEClass(STATE_NODE);
		createEReference(stateNodeEClass, STATE_NODE__OUTGOING_TRANSITIONS);
		createEReference(stateNodeEClass, STATE_NODE__INCOMING_TRANSITIONS);

		stateInitialEClass = createEClass(STATE_INITIAL);

		stateEndEClass = createEClass(STATE_END);
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
		stateEClass.getESuperTypes().add(this.getStateNode());
		transitionEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		stateNodeEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		stateInitialEClass.getESuperTypes().add(this.getStateNode());
		stateEndEClass.getESuperTypes().add(this.getStateNode());

		// Initialize classes and features; add operations and parameters
		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_ExitConditions(), ecorePackage.getEString(), "exitConditions", null, 0, 1, State.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Activities(), ecorePackage.getEString(), "activities", null, 0, 1, State.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_EntryConditions(), ecorePackage.getEString(), "entryConditions", null, 0, 1,
			State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Condition(), ecorePackage.getEString(), "condition", "", 0, 1, Transition.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getStateNode(), this.getStateNode_OutgoingTransitions(), "source",
			null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getStateNode(), this.getStateNode_IncomingTransitions(), "target",
			null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateNodeEClass, StateNode.class, "StateNode", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateNode_OutgoingTransitions(), this.getTransition(), this.getTransition_Source(),
			"outgoingTransitions", null, 0, -1, StateNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateNode_IncomingTransitions(), this.getTransition(), this.getTransition_Target(),
			"incomingTransitions", null, 0, -1, StateNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateInitialEClass, StateInitial.class, "StateInitial", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEndEClass, StateEnd.class, "StateEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} // StatePackageImpl
