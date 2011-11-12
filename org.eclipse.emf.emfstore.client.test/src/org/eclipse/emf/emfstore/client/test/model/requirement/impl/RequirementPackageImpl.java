/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement.impl;

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
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance;
import org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement;
import org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.Scenario;
import org.eclipse.emf.emfstore.client.test.model.requirement.Step;
import org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.requirement.UserTask;
import org.eclipse.emf.emfstore.client.test.model.requirement.Workspace;
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
public class RequirementPackageImpl extends EPackageImpl implements RequirementPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nonFunctionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass functionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass actorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass systemFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workspaceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementPackageImpl() {
		super(eNS_URI, RequirementFactory.eINSTANCE);
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
	 * This method is used to initialize {@link RequirementPackage#eINSTANCE} when that field is accessed. Clients
	 * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementPackage init() {
		if (isInited)
			return (RequirementPackage) EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);

		// Obtain or create and register package
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl) (EPackage.Registry.INSTANCE
			.get(eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
			: new RequirementPackageImpl());

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
		theRequirementPackage.createPackageContents();
		theModelPackage_1.createPackageContents();
		theOrganizationPackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theClassesPackage.createPackageContents();
		theDocumentPackage.createPackageContents();
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
		theRequirementPackage.initializePackageContents();
		theModelPackage_1.initializePackageContents();
		theOrganizationPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theClassesPackage.initializePackageContents();
		theDocumentPackage.initializePackageContents();
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
		theRequirementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementPackage.eNS_URI, theRequirementPackage);
		return theRequirementPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNonFunctionalRequirement() {
		return nonFunctionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNonFunctionalRequirement_RestrictedScenarios() {
		return (EReference) nonFunctionalRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNonFunctionalRequirement_RestrictedUseCases() {
		return (EReference) nonFunctionalRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNonFunctionalRequirement_SystemFunctions() {
		return (EReference) nonFunctionalRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNonFunctionalRequirement_UserTasks() {
		return (EReference) nonFunctionalRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFunctionalRequirement() {
		return functionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFunctionalRequirement_RefinedRequirement() {
		return (EReference) functionalRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_StoryPoints() {
		return (EAttribute) functionalRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Priority() {
		return (EAttribute) functionalRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFunctionalRequirement_RefiningRequirements() {
		return (EReference) functionalRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFunctionalRequirement_UseCases() {
		return (EReference) functionalRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFunctionalRequirement_Scenarios() {
		return (EReference) functionalRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Reviewed() {
		return (EAttribute) functionalRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFunctionalRequirement_Stakeholder() {
		return (EReference) functionalRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Cost() {
		return (EAttribute) functionalRequirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_InitiatingActor() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_ParticipatingActors() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_RealizedUserTask() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUseCase_Precondition() {
		return (EAttribute) useCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_UseCaseSteps() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUseCase_Postcondition() {
		return (EAttribute) useCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUseCase_Rules() {
		return (EAttribute) useCaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUseCase_Exception() {
		return (EAttribute) useCaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_Scenarios() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_FunctionalRequirements() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_NonFunctionalRequirements() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_IdentifiedClasses() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_IncludedUseCases() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_ExtendedUseCases() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUseCase_SystemFunctions() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getScenario_Steps() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getScenario_InitiatingActorInstance() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getScenario_ParticipatingActorInstances() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getScenario_InstantiatedUseCases() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getScenario_FunctionalRequirements() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getScenario_NonFunctionalRequirements() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getScenario_ParticipatingMethods() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getScenario_ParticipatingClasses() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActor_InitiatedUserTask() {
		return (EReference) actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActor_ParticipatedUserTasks() {
		return (EReference) actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActor_InitiatedUseCases() {
		return (EReference) actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActor_ParticipatedUseCases() {
		return (EReference) actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActor_Instances() {
		return (EReference) actorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getActorInstance() {
		return actorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActorInstance_InitiatedScenarios() {
		return (EReference) actorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActorInstance_ParticipatedScenarios() {
		return (EReference) actorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActorInstance_InstantiatedActor() {
		return (EReference) actorInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStep_UserStep() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStep_IncludedUseCase() {
		return (EReference) stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStep_IncludedSystemFunction() {
		return (EReference) stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStep_UseCase() {
		return (EReference) stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSystemFunction() {
		return systemFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSystemFunction_Input() {
		return (EAttribute) systemFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSystemFunction_Output() {
		return (EAttribute) systemFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSystemFunction_Exception() {
		return (EAttribute) systemFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSystemFunction_NonFunctionalRequirement() {
		return (EReference) systemFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSystemFunction_Usecases() {
		return (EReference) systemFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSystemFunction_Workspace() {
		return (EReference) systemFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUserTask() {
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUserTask_InitiatingActor() {
		return (EReference) userTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUserTask_ParticipatingActors() {
		return (EReference) userTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUserTask_RealizingUseCases() {
		return (EReference) userTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUserTask_NonFunctionalRequirements() {
		return (EReference) userTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkspace() {
		return workspaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getWorkspace_SystemFunctions() {
		return (EReference) workspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RequirementFactory getRequirementFactory() {
		return (RequirementFactory) getEFactoryInstance();
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
		nonFunctionalRequirementEClass = createEClass(NON_FUNCTIONAL_REQUIREMENT);
		createEReference(nonFunctionalRequirementEClass, NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS);
		createEReference(nonFunctionalRequirementEClass, NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES);
		createEReference(nonFunctionalRequirementEClass, NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS);
		createEReference(nonFunctionalRequirementEClass, NON_FUNCTIONAL_REQUIREMENT__USER_TASKS);

		functionalRequirementEClass = createEClass(FUNCTIONAL_REQUIREMENT);
		createEReference(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__REFINED_REQUIREMENT);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__STORY_POINTS);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__PRIORITY);
		createEReference(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__REFINING_REQUIREMENTS);
		createEReference(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__USE_CASES);
		createEReference(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__SCENARIOS);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__REVIEWED);
		createEReference(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__STAKEHOLDER);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__COST);

		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__INITIATING_ACTOR);
		createEReference(useCaseEClass, USE_CASE__PARTICIPATING_ACTORS);
		createEReference(useCaseEClass, USE_CASE__REALIZED_USER_TASK);
		createEAttribute(useCaseEClass, USE_CASE__PRECONDITION);
		createEReference(useCaseEClass, USE_CASE__USE_CASE_STEPS);
		createEAttribute(useCaseEClass, USE_CASE__POSTCONDITION);
		createEAttribute(useCaseEClass, USE_CASE__RULES);
		createEAttribute(useCaseEClass, USE_CASE__EXCEPTION);
		createEReference(useCaseEClass, USE_CASE__SCENARIOS);
		createEReference(useCaseEClass, USE_CASE__FUNCTIONAL_REQUIREMENTS);
		createEReference(useCaseEClass, USE_CASE__NON_FUNCTIONAL_REQUIREMENTS);
		createEReference(useCaseEClass, USE_CASE__IDENTIFIED_CLASSES);
		createEReference(useCaseEClass, USE_CASE__INCLUDED_USE_CASES);
		createEReference(useCaseEClass, USE_CASE__EXTENDED_USE_CASES);
		createEReference(useCaseEClass, USE_CASE__SYSTEM_FUNCTIONS);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__STEPS);
		createEReference(scenarioEClass, SCENARIO__INITIATING_ACTOR_INSTANCE);
		createEReference(scenarioEClass, SCENARIO__PARTICIPATING_ACTOR_INSTANCES);
		createEReference(scenarioEClass, SCENARIO__INSTANTIATED_USE_CASES);
		createEReference(scenarioEClass, SCENARIO__FUNCTIONAL_REQUIREMENTS);
		createEReference(scenarioEClass, SCENARIO__NON_FUNCTIONAL_REQUIREMENTS);
		createEReference(scenarioEClass, SCENARIO__PARTICIPATING_METHODS);
		createEReference(scenarioEClass, SCENARIO__PARTICIPATING_CLASSES);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__INITIATED_USER_TASK);
		createEReference(actorEClass, ACTOR__PARTICIPATED_USER_TASKS);
		createEReference(actorEClass, ACTOR__INITIATED_USE_CASES);
		createEReference(actorEClass, ACTOR__PARTICIPATED_USE_CASES);
		createEReference(actorEClass, ACTOR__INSTANCES);

		actorInstanceEClass = createEClass(ACTOR_INSTANCE);
		createEReference(actorInstanceEClass, ACTOR_INSTANCE__INITIATED_SCENARIOS);
		createEReference(actorInstanceEClass, ACTOR_INSTANCE__PARTICIPATED_SCENARIOS);
		createEReference(actorInstanceEClass, ACTOR_INSTANCE__INSTANTIATED_ACTOR);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__USER_STEP);
		createEReference(stepEClass, STEP__INCLUDED_USE_CASE);
		createEReference(stepEClass, STEP__INCLUDED_SYSTEM_FUNCTION);
		createEReference(stepEClass, STEP__USE_CASE);

		systemFunctionEClass = createEClass(SYSTEM_FUNCTION);
		createEAttribute(systemFunctionEClass, SYSTEM_FUNCTION__INPUT);
		createEAttribute(systemFunctionEClass, SYSTEM_FUNCTION__OUTPUT);
		createEAttribute(systemFunctionEClass, SYSTEM_FUNCTION__EXCEPTION);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__USECASES);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__WORKSPACE);

		userTaskEClass = createEClass(USER_TASK);
		createEReference(userTaskEClass, USER_TASK__INITIATING_ACTOR);
		createEReference(userTaskEClass, USER_TASK__PARTICIPATING_ACTORS);
		createEReference(userTaskEClass, USER_TASK__REALIZING_USE_CASES);
		createEReference(userTaskEClass, USER_TASK__NON_FUNCTIONAL_REQUIREMENTS);

		workspaceEClass = createEClass(WORKSPACE);
		createEReference(workspaceEClass, WORKSPACE__SYSTEM_FUNCTIONS);
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
		RationalePackage theRationalePackage = (RationalePackage) EPackage.Registry.INSTANCE
			.getEPackage(RationalePackage.eNS_URI);
		org.eclipse.emf.emfstore.client.test.model.ModelPackage theModelPackage_1 = (org.eclipse.emf.emfstore.client.test.model.ModelPackage) EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.emfstore.client.test.model.ModelPackage.eNS_URI);
		OrganizationPackage theOrganizationPackage = (OrganizationPackage) EPackage.Registry.INSTANCE
			.getEPackage(OrganizationPackage.eNS_URI);
		ClassesPackage theClassesPackage = (ClassesPackage) EPackage.Registry.INSTANCE
			.getEPackage(ClassesPackage.eNS_URI);
		org.eclipse.emf.emfstore.common.model.ModelPackage theModelPackage_2 = (org.eclipse.emf.emfstore.common.model.ModelPackage) EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.emfstore.common.model.ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nonFunctionalRequirementEClass.getESuperTypes().add(theRationalePackage.getCriterion());
		functionalRequirementEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		useCaseEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		scenarioEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		actorEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		actorInstanceEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		stepEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		stepEClass.getESuperTypes().add(theModelPackage_2.getNonDomainElement());
		systemFunctionEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		userTaskEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		workspaceEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(nonFunctionalRequirementEClass, NonFunctionalRequirement.class, "NonFunctionalRequirement",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonFunctionalRequirement_RestrictedScenarios(), this.getScenario(),
			this.getScenario_NonFunctionalRequirements(), "restrictedScenarios", null, 0, -1,
			NonFunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNonFunctionalRequirement_RestrictedUseCases(), this.getUseCase(),
			this.getUseCase_NonFunctionalRequirements(), "restrictedUseCases", null, 0, -1,
			NonFunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNonFunctionalRequirement_SystemFunctions(), this.getSystemFunction(),
			this.getSystemFunction_NonFunctionalRequirement(), "systemFunctions", null, 0, -1,
			NonFunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNonFunctionalRequirement_UserTasks(), this.getUserTask(),
			this.getUserTask_NonFunctionalRequirements(), "userTasks", null, 0, -1, NonFunctionalRequirement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(functionalRequirementEClass, FunctionalRequirement.class, "FunctionalRequirement", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalRequirement_RefinedRequirement(), this.getFunctionalRequirement(),
			this.getFunctionalRequirement_RefiningRequirements(), "refinedRequirement", null, 0, 1,
			FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_StoryPoints(), ecorePackage.getEInt(), "storyPoints", null, 0, 1,
			FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1,
			FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalRequirement_RefiningRequirements(), this.getFunctionalRequirement(),
			this.getFunctionalRequirement_RefinedRequirement(), "refiningRequirements", null, 0, -1,
			FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalRequirement_UseCases(), this.getUseCase(),
			this.getUseCase_FunctionalRequirements(), "useCases", null, 0, -1, FunctionalRequirement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalRequirement_Scenarios(), this.getScenario(),
			this.getScenario_FunctionalRequirements(), "scenarios", null, 0, -1, FunctionalRequirement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Reviewed(), ecorePackage.getEBoolean(), "reviewed", null, 0, 1,
			FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalRequirement_Stakeholder(), theOrganizationPackage.getOrgUnit(), null,
			"stakeholder", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Cost(), ecorePackage.getEInt(), "cost", null, 0, 1,
			FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCase_InitiatingActor(), this.getActor(), this.getActor_InitiatedUseCases(),
			"initiatingActor", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_ParticipatingActors(), this.getActor(), this.getActor_ParticipatedUseCases(),
			"participatingActors", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_RealizedUserTask(), this.getUserTask(), this.getUserTask_RealizingUseCases(),
			"realizedUserTask", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, UseCase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_UseCaseSteps(), this.getStep(), this.getStep_UseCase(), "useCaseSteps", null, 0, -1,
			UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_Postcondition(), ecorePackage.getEString(), "postcondition", null, 0, 1,
			UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEAttribute(getUseCase_Rules(), ecorePackage.getEString(), "rules", "", 0, 1, UseCase.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_Exception(), ecorePackage.getEString(), "exception", null, 0, 1, UseCase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Scenarios(), this.getScenario(), this.getScenario_InstantiatedUseCases(),
			"scenarios", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_FunctionalRequirements(), this.getFunctionalRequirement(),
			this.getFunctionalRequirement_UseCases(), "functionalRequirements", null, 0, -1, UseCase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_NonFunctionalRequirements(), this.getNonFunctionalRequirement(),
			this.getNonFunctionalRequirement_RestrictedUseCases(), "nonFunctionalRequirements", null, 0, -1,
			UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_IdentifiedClasses(), theClassesPackage.getClass_(),
			theClassesPackage.getClass_ParticipatedUseCases(), "identifiedClasses", null, 0, -1, UseCase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_IncludedUseCases(), this.getUseCase(), null, "includedUseCases", null, 0, -1,
			UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_ExtendedUseCases(), this.getUseCase(), null, "extendedUseCases", null, 0, -1,
			UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_SystemFunctions(), this.getSystemFunction(), this.getSystemFunction_Usecases(),
			"systemFunctions", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Steps(), this.getStep(), null, "steps", null, 0, -1, Scenario.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEReference(getScenario_InitiatingActorInstance(), this.getActorInstance(),
			this.getActorInstance_InitiatedScenarios(), "initiatingActorInstance", null, 0, 1, Scenario.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_ParticipatingActorInstances(), this.getActorInstance(),
			this.getActorInstance_ParticipatedScenarios(), "participatingActorInstances", null, 0, -1, Scenario.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_InstantiatedUseCases(), this.getUseCase(), this.getUseCase_Scenarios(),
			"instantiatedUseCases", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_FunctionalRequirements(), this.getFunctionalRequirement(),
			this.getFunctionalRequirement_Scenarios(), "functionalRequirements", null, 0, -1, Scenario.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_NonFunctionalRequirements(), this.getNonFunctionalRequirement(),
			this.getNonFunctionalRequirement_RestrictedScenarios(), "nonFunctionalRequirements", null, 0, -1,
			Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_ParticipatingMethods(), theClassesPackage.getMethod(),
			theClassesPackage.getMethod_DemoParticipations(), "participatingMethods", null, 0, -1, Scenario.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_ParticipatingClasses(), theClassesPackage.getClass_(),
			theClassesPackage.getClass_DemoParticipations(), "participatingClasses", null, 0, -1, Scenario.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_InitiatedUserTask(), this.getUserTask(), this.getUserTask_InitiatingActor(),
			"initiatedUserTask", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ParticipatedUserTasks(), this.getUserTask(), this.getUserTask_ParticipatingActors(),
			"participatedUserTasks", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_InitiatedUseCases(), this.getUseCase(), this.getUseCase_InitiatingActor(),
			"initiatedUseCases", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ParticipatedUseCases(), this.getUseCase(), this.getUseCase_ParticipatingActors(),
			"participatedUseCases", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Instances(), this.getActorInstance(), this.getActorInstance_InstantiatedActor(),
			"instances", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorInstanceEClass, ActorInstance.class, "ActorInstance", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorInstance_InitiatedScenarios(), this.getScenario(),
			this.getScenario_InitiatingActorInstance(), "initiatedScenarios", null, 0, -1, ActorInstance.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getActorInstance_ParticipatedScenarios(), this.getScenario(),
			this.getScenario_ParticipatingActorInstances(), "participatedScenarios", null, 0, -1, ActorInstance.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getActorInstance_InstantiatedActor(), this.getActor(), this.getActor_Instances(),
			"instantiatedActor", null, 0, 1, ActorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_UserStep(), ecorePackage.getEBoolean(), "userStep", null, 0, 1, Step.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_IncludedUseCase(), this.getUseCase(), null, "includedUseCase", null, 0, 1, Step.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getStep_IncludedSystemFunction(), this.getSystemFunction(), null, "includedSystemFunction",
			null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_UseCase(), this.getUseCase(), this.getUseCase_UseCaseSteps(), "useCase", null, 0, 1,
			Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemFunctionEClass, SystemFunction.class, "SystemFunction", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemFunction_Input(), ecorePackage.getEString(), "input", null, 0, 1, SystemFunction.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemFunction_Output(), ecorePackage.getEString(), "output", null, 0, 1,
			SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemFunction_Exception(), ecorePackage.getEString(), "exception", null, 0, 1,
			SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_NonFunctionalRequirement(), this.getNonFunctionalRequirement(),
			this.getNonFunctionalRequirement_SystemFunctions(), "nonFunctionalRequirement", null, 0, 1,
			SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_Usecases(), this.getUseCase(), this.getUseCase_SystemFunctions(), "usecases",
			null, 0, -1, SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_Workspace(), this.getWorkspace(), this.getWorkspace_SystemFunctions(),
			"workspace", null, 0, 1, SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTaskEClass, UserTask.class, "UserTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserTask_InitiatingActor(), this.getActor(), this.getActor_InitiatedUserTask(),
			"initiatingActor", null, 0, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTask_ParticipatingActors(), this.getActor(), this.getActor_ParticipatedUserTasks(),
			"participatingActors", null, 0, -1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTask_RealizingUseCases(), this.getUseCase(), this.getUseCase_RealizedUserTask(),
			"realizingUseCases", null, 0, -1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTask_NonFunctionalRequirements(), this.getNonFunctionalRequirement(),
			this.getNonFunctionalRequirement_UserTasks(), "nonFunctionalRequirements", null, 0, -1, UserTask.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(workspaceEClass, Workspace.class, "Workspace", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkspace_SystemFunctions(), this.getSystemFunction(), this.getSystemFunction_Workspace(),
			"systemFunctions", null, 0, -1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// org.unicase.ui.meeditor
		createOrgAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>org.unicase.ui.meeditor</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.unicase.ui.meeditor";
		addAnnotation(getNonFunctionalRequirement_RestrictedScenarios(), source, new String[] { "priority", "9.1",
			"position", "right" });
		addAnnotation(getNonFunctionalRequirement_RestrictedUseCases(), source, new String[] { "priority", "9.2",
			"position", "right" });
		addAnnotation(getNonFunctionalRequirement_SystemFunctions(), source, new String[] { "priority", "13.0",
			"position", "right" });
		addAnnotation(getNonFunctionalRequirement_UserTasks(), source, new String[] { "priority", "14.0", "position",
			"right" });
		addAnnotation(getFunctionalRequirement_RefinedRequirement(), source, new String[] { "priority", "10.0",
			"position", "left" });
		addAnnotation(getFunctionalRequirement_Priority(), source, new String[] { "priority", "12.0", "position",
			"left" });
		addAnnotation(getFunctionalRequirement_RefiningRequirements(), source, new String[] { "priority", "12.0",
			"position", "right" });
		addAnnotation(getFunctionalRequirement_UseCases(), source, new String[] { "priority", "10.0", "position",
			"right" });
		addAnnotation(getFunctionalRequirement_Scenarios(), source, new String[] { "priority", "11.0", "position",
			"right" });
		addAnnotation(getFunctionalRequirement_Reviewed(), source, new String[] { "priority", "13.0", "position",
			"left" });
		addAnnotation(getFunctionalRequirement_Stakeholder(), source, new String[] { "priority", "11.0", "position",
			"left" });
		addAnnotation(getUseCase_InitiatingActor(), source, new String[] { "priority", "10.0", "position", "left" });
		addAnnotation(getUseCase_ParticipatingActors(), source, new String[] { "priority", "11.0", "position", "left" });
		addAnnotation(getUseCase_RealizedUserTask(), source, new String[] { "priority", "10.1", "position", "left" });
		addAnnotation(getUseCase_UseCaseSteps(), source, new String[] { "priority", "10.1", "position", "bottom" });
		addAnnotation(getUseCase_Scenarios(), source, new String[] { "priority", "10.0", "position", "right" });
		addAnnotation(getUseCase_FunctionalRequirements(), source, new String[] { "priority", "11.0", "position",
			"right" });
		addAnnotation(getUseCase_NonFunctionalRequirements(), source, new String[] { "priority", "12.0", "position",
			"right" });
		addAnnotation(getUseCase_IdentifiedClasses(), source, new String[] { "priority", "13.0", "position", "right" });
		addAnnotation(getUseCase_IncludedUseCases(), source, new String[] { "priority", "12.0", "position", "left" });
		addAnnotation(getUseCase_ExtendedUseCases(), source, new String[] { "priority", "13.0", "position", "left" });
		addAnnotation(getUseCase_SystemFunctions(), source, new String[] { "priority", "15.0", "position", "right" });
		addAnnotation(getScenario_InitiatingActorInstance(), source, new String[] { "priority", "10.0", "position",
			"left" });
		addAnnotation(getScenario_ParticipatingActorInstances(), source, new String[] { "priority", "11.0", "position",
			"left" });
		addAnnotation(getScenario_InstantiatedUseCases(), source, new String[] { "priority", "10.0", "position",
			"right" });
		addAnnotation(getScenario_FunctionalRequirements(), source, new String[] { "priority", "11.0", "position",
			"right" });
		addAnnotation(getScenario_NonFunctionalRequirements(), source, new String[] { "priority", "12.0", "position",
			"right" });
		addAnnotation(getActor_InitiatedUserTask(), source, new String[] { "priority", "15.0", "position", "left" });
		addAnnotation(getActor_ParticipatedUserTasks(), source,
			new String[] { "priority", "15.0", "position", "right" });
		addAnnotation(getActor_InitiatedUseCases(), source, new String[] { "priority", "10.0", "position", "right" });
		addAnnotation(getActor_ParticipatedUseCases(), source, new String[] { "priority", "11.0", "position", "right" });
		addAnnotation(getActor_Instances(), source, new String[] { "priority", "12.0", "position", "right" });
		addAnnotation(getActorInstance_InitiatedScenarios(), source, new String[] { "priority", "10.0", "position",
			"right" });
		addAnnotation(getActorInstance_ParticipatedScenarios(), source, new String[] { "priority", "11.0", "position",
			"right" });
		addAnnotation(getActorInstance_InstantiatedActor(), source, new String[] { "priority", "10.0", "position",
			"left" });
		addAnnotation(getSystemFunction_Usecases(), source, new String[] { "priority", "12.0", "position", "right" });
		addAnnotation(getUserTask_ParticipatingActors(), source,
			new String[] { "priority", "12.0", "position", "right" });
		addAnnotation(getUserTask_RealizingUseCases(), source, new String[] { "priority", "12.0", "position", "right" });
		addAnnotation(getUserTask_NonFunctionalRequirements(), source, new String[] { "priority", "12.0", "position",
			"right" });
		addAnnotation(getWorkspace_SystemFunctions(), source, new String[] { "priority", "12.0", "position", "right" });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(getActorInstance_ParticipatedScenarios(), source, new String[] {});
	}

} // RequirementPackageImpl
