/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes.impl;

import static org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage.CLASS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
import org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType;
import org.eclipse.emf.emfstore.client.test.model.classes.Association;
import org.eclipse.emf.emfstore.client.test.model.classes.AssociationType;
import org.eclipse.emf.emfstore.client.test.model.classes.Attribute;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesFactory;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.Dependency;
import org.eclipse.emf.emfstore.client.test.model.classes.Enumeration;
import org.eclipse.emf.emfstore.client.test.model.classes.InstantiationType;
import org.eclipse.emf.emfstore.client.test.model.classes.Literal;
import org.eclipse.emf.emfstore.client.test.model.classes.Method;
import org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument;
import org.eclipse.emf.emfstore.client.test.model.classes.PackageElement;
import org.eclipse.emf.emfstore.client.test.model.classes.PrimitiveType;
import org.eclipse.emf.emfstore.client.test.model.classes.ScopeType;
import org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType;
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
public class ClassesPackageImpl extends EPackageImpl implements ClassesPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass packageElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass methodArgumentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum associationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum visibilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum scopeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum argumentDirectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum instantiationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassesPackageImpl() {
		super(eNS_URI, ClassesFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ClassesPackage#eINSTANCE} when that field is accessed. Clients should
	 * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassesPackage init() {
		if (isInited)
			return (ClassesPackage) EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI);

		// Obtain or create and register package
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE
			.get(eNS_URI) : new ClassesPackageImpl());

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
		theClassesPackage.createPackageContents();
		theModelPackage_1.createPackageContents();
		theOrganizationPackage.createPackageContents();
		theTaskPackage.createPackageContents();
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
		theClassesPackage.initializePackageContents();
		theModelPackage_1.initializePackageContents();
		theOrganizationPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
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
		theClassesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassesPackage.eNS_URI, theClassesPackage);
		return theClassesPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getClass_InstantiationType() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClass_ParticipatedUseCases() {
		return (EReference) classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClass_SuperClasses() {
		return (EReference) classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClass_SubClasses() {
		return (EReference) classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClass_IncomingAssociations() {
		return (EReference) classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClass_OutgoingAssociations() {
		return (EReference) classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClass_Attributes() {
		return (EReference) classEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClass_Methods() {
		return (EReference) classEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClass_DemoParticipations() {
		return (EReference) classEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackage_ContainedPackageElements() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackage_FacadeClass() {
		return (EReference) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPackageElement() {
		return packageElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackageElement_ParentPackage() {
		return (EReference) packageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackageElement_OutgoingDependencies() {
		return (EReference) packageElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackageElement_IncomingDependencies() {
		return (EReference) packageElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_Source() {
		return (EReference) associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_Target() {
		return (EReference) associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_Type() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_SourceMultiplicity() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_TargetMultiplicity() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_SourceRole() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_TargetRole() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_Transient() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttribute_DefiningClass() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_Visibility() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_Scope() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_Signature() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_DefaultValue() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_Properties() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_Label() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_Id() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_ImplementationType() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttribute_ImplementationEnumeration() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttribute_Transient() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethod_Visibility() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethod_Scope() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethod_ReturnType() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethod_Signature() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMethod_Arguments() {
		return (EReference) methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethod_Properties() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMethod_DefiningClass() {
		return (EReference) methodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethod_Label() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethod_Stubbed() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMethod_CalledMethods() {
		return (EReference) methodEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMethod_CallingMethods() {
		return (EReference) methodEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMethod_DemoParticipations() {
		return (EReference) methodEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMethodArgument() {
		return methodArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethodArgument_Type() {
		return (EAttribute) methodArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethodArgument_Direction() {
		return (EAttribute) methodArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethodArgument_DefaultValue() {
		return (EAttribute) methodArgumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethodArgument_Signature() {
		return (EAttribute) methodArgumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMethodArgument_Label() {
		return (EAttribute) methodArgumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDependency_Source() {
		return (EReference) dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDependency_Target() {
		return (EReference) dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnumeration_Literals() {
		return (EReference) enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnumeration_Attributes() {
		return (EReference) enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLiteral_Enumeration() {
		return (EReference) literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLiteral_Literal() {
		return (EAttribute) literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getAssociationType() {
		return associationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getVisibilityType() {
		return visibilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getScopeType() {
		return scopeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getArgumentDirectionType() {
		return argumentDirectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getInstantiationType() {
		return instantiationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassesFactory getClassesFactory() {
		return (ClassesFactory) getEFactoryInstance();
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
		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__INSTANTIATION_TYPE);
		createEReference(classEClass, CLASS__PARTICIPATED_USE_CASES);
		createEReference(classEClass, CLASS__SUPER_CLASSES);
		createEReference(classEClass, CLASS__SUB_CLASSES);
		createEReference(classEClass, CLASS__INCOMING_ASSOCIATIONS);
		createEReference(classEClass, CLASS__OUTGOING_ASSOCIATIONS);
		createEReference(classEClass, CLASS__ATTRIBUTES);
		createEReference(classEClass, CLASS__METHODS);
		createEReference(classEClass, CLASS__DEMO_PARTICIPATIONS);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__CONTAINED_PACKAGE_ELEMENTS);
		createEReference(packageEClass, PACKAGE__FACADE_CLASS);

		packageElementEClass = createEClass(PACKAGE_ELEMENT);
		createEReference(packageElementEClass, PACKAGE_ELEMENT__PARENT_PACKAGE);
		createEReference(packageElementEClass, PACKAGE_ELEMENT__OUTGOING_DEPENDENCIES);
		createEReference(packageElementEClass, PACKAGE_ELEMENT__INCOMING_DEPENDENCIES);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__SOURCE);
		createEReference(associationEClass, ASSOCIATION__TARGET);
		createEAttribute(associationEClass, ASSOCIATION__TYPE);
		createEAttribute(associationEClass, ASSOCIATION__SOURCE_MULTIPLICITY);
		createEAttribute(associationEClass, ASSOCIATION__TARGET_MULTIPLICITY);
		createEAttribute(associationEClass, ASSOCIATION__SOURCE_ROLE);
		createEAttribute(associationEClass, ASSOCIATION__TARGET_ROLE);
		createEAttribute(associationEClass, ASSOCIATION__TRANSIENT);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__DEFINING_CLASS);
		createEAttribute(attributeEClass, ATTRIBUTE__VISIBILITY);
		createEAttribute(attributeEClass, ATTRIBUTE__SCOPE);
		createEAttribute(attributeEClass, ATTRIBUTE__SIGNATURE);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__PROPERTIES);
		createEAttribute(attributeEClass, ATTRIBUTE__LABEL);
		createEAttribute(attributeEClass, ATTRIBUTE__ID);
		createEAttribute(attributeEClass, ATTRIBUTE__IMPLEMENTATION_TYPE);
		createEReference(attributeEClass, ATTRIBUTE__IMPLEMENTATION_ENUMERATION);
		createEAttribute(attributeEClass, ATTRIBUTE__TRANSIENT);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__VISIBILITY);
		createEAttribute(methodEClass, METHOD__SCOPE);
		createEAttribute(methodEClass, METHOD__RETURN_TYPE);
		createEAttribute(methodEClass, METHOD__SIGNATURE);
		createEReference(methodEClass, METHOD__ARGUMENTS);
		createEAttribute(methodEClass, METHOD__PROPERTIES);
		createEReference(methodEClass, METHOD__DEFINING_CLASS);
		createEAttribute(methodEClass, METHOD__LABEL);
		createEAttribute(methodEClass, METHOD__STUBBED);
		createEReference(methodEClass, METHOD__CALLED_METHODS);
		createEReference(methodEClass, METHOD__CALLING_METHODS);
		createEReference(methodEClass, METHOD__DEMO_PARTICIPATIONS);

		methodArgumentEClass = createEClass(METHOD_ARGUMENT);
		createEAttribute(methodArgumentEClass, METHOD_ARGUMENT__TYPE);
		createEAttribute(methodArgumentEClass, METHOD_ARGUMENT__DIRECTION);
		createEAttribute(methodArgumentEClass, METHOD_ARGUMENT__DEFAULT_VALUE);
		createEAttribute(methodArgumentEClass, METHOD_ARGUMENT__SIGNATURE);
		createEAttribute(methodArgumentEClass, METHOD_ARGUMENT__LABEL);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__SOURCE);
		createEReference(dependencyEClass, DEPENDENCY__TARGET);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);
		createEReference(enumerationEClass, ENUMERATION__ATTRIBUTES);

		literalEClass = createEClass(LITERAL);
		createEReference(literalEClass, LITERAL__ENUMERATION);
		createEAttribute(literalEClass, LITERAL__LITERAL);

		// Create enums
		associationTypeEEnum = createEEnum(ASSOCIATION_TYPE);
		visibilityTypeEEnum = createEEnum(VISIBILITY_TYPE);
		scopeTypeEEnum = createEEnum(SCOPE_TYPE);
		argumentDirectionTypeEEnum = createEEnum(ARGUMENT_DIRECTION_TYPE);
		instantiationTypeEEnum = createEEnum(INSTANTIATION_TYPE);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
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
		RequirementPackage theRequirementPackage = (RequirementPackage) EPackage.Registry.INSTANCE
			.getEPackage(RequirementPackage.eNS_URI);
		org.eclipse.emf.emfstore.client.test.model.ModelPackage theModelPackage_1 = (org.eclipse.emf.emfstore.client.test.model.ModelPackage) EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.emfstore.client.test.model.ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classEClass.getESuperTypes().add(this.getPackageElement());
		packageEClass.getESuperTypes().add(this.getPackageElement());
		packageElementEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		associationEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		attributeEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		methodEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		methodArgumentEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		dependencyEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());
		enumerationEClass.getESuperTypes().add(this.getPackageElement());
		literalEClass.getESuperTypes().add(theModelPackage_1.getUnicaseModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(classEClass, org.eclipse.emf.emfstore.client.test.model.classes.Class.class, "Class", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_InstantiationType(), this.getInstantiationType(), "instantiationType", null, 0, 1,
			org.eclipse.emf.emfstore.client.test.model.classes.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_ParticipatedUseCases(), theRequirementPackage.getUseCase(),
			theRequirementPackage.getUseCase_IdentifiedClasses(), "participatedUseCases", null, 0, -1,
			org.eclipse.emf.emfstore.client.test.model.classes.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SuperClasses(), this.getClass_(), this.getClass_SubClasses(), "superClasses", null, 0,
			-1, org.eclipse.emf.emfstore.client.test.model.classes.Class.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SubClasses(), this.getClass_(), this.getClass_SuperClasses(), "subClasses", null, 0,
			-1, org.eclipse.emf.emfstore.client.test.model.classes.Class.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_IncomingAssociations(), this.getAssociation(), this.getAssociation_Target(),
			"incomingAssociations", null, 0, -1, org.eclipse.emf.emfstore.client.test.model.classes.Class.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getClass_OutgoingAssociations(), this.getAssociation(), this.getAssociation_Source(),
			"outgoingAssociations", null, 0, -1, org.eclipse.emf.emfstore.client.test.model.classes.Class.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Attributes(), this.getAttribute(), this.getAttribute_DefiningClass(), "attributes",
			null, 0, -1, org.eclipse.emf.emfstore.client.test.model.classes.Class.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Methods(), this.getMethod(), this.getMethod_DefiningClass(), "methods", null, 0, -1,
			org.eclipse.emf.emfstore.client.test.model.classes.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_DemoParticipations(), theRequirementPackage.getScenario(),
			theRequirementPackage.getScenario_ParticipatingClasses(), "demoParticipations", null, 0, -1,
			org.eclipse.emf.emfstore.client.test.model.classes.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.eclipse.emf.emfstore.client.test.model.classes.Package.class, "Package",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_ContainedPackageElements(), this.getPackageElement(),
			this.getPackageElement_ParentPackage(), "containedPackageElements", null, 0, -1,
			org.eclipse.emf.emfstore.client.test.model.classes.Package.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_FacadeClass(), this.getClass_(), null, "facadeClass", null, 0, 1,
			org.eclipse.emf.emfstore.client.test.model.classes.Package.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageElementEClass, PackageElement.class, "PackageElement", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageElement_ParentPackage(), this.getPackage(),
			this.getPackage_ContainedPackageElements(), "parentPackage", null, 0, 1, PackageElement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getPackageElement_OutgoingDependencies(), this.getDependency(), this.getDependency_Source(),
			"outgoingDependencies", null, 0, -1, PackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageElement_IncomingDependencies(), this.getDependency(), this.getDependency_Target(),
			"incomingDependencies", null, 0, -1, PackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Source(), this.getClass_(), this.getClass_OutgoingAssociations(), "source", null,
			0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Target(), this.getClass_(), this.getClass_IncomingAssociations(), "target", null,
			0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Type(), this.getAssociationType(), "type", "", 0, 1, Association.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_SourceMultiplicity(), ecorePackage.getEString(), "sourceMultiplicity", "1", 0, 1,
			Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TargetMultiplicity(), ecorePackage.getEString(), "targetMultiplicity", "1", 0, 1,
			Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_SourceRole(), ecorePackage.getEString(), "sourceRole", null, 0, 1,
			Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TargetRole(), ecorePackage.getEString(), "targetRole", null, 0, 1,
			Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1,
			Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_DefiningClass(), this.getClass_(), this.getClass_Attributes(), "definingClass",
			null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Visibility(), this.getVisibilityType(), "visibility", null, 0, 1, Attribute.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Scope(), this.getScopeType(), "scope", null, 0, 1, Attribute.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, Attribute.class,
			IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", "", 0, 1, Attribute.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1,
			Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Properties(), ecorePackage.getEString(), "properties", null, 0, 1, Attribute.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Label(), ecorePackage.getEString(), "label", null, 0, 1, Attribute.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Id(), ecorePackage.getEBoolean(), "id", null, 0, 1, Attribute.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_ImplementationType(), this.getPrimitiveType(), "implementationType", null, 0, 1,
			Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_ImplementationEnumeration(), this.getEnumeration(),
			this.getEnumeration_Attributes(), "implementationEnumeration", null, 0, 1, Attribute.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEAttribute(getAttribute_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, Attribute.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Visibility(), this.getVisibilityType(), "visibility", null, 0, 1, Method.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Scope(), this.getScopeType(), "scope", null, 0, 1, Method.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Signature(), ecorePackage.getEString(), "signature", "", 0, 1, Method.class,
			IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Arguments(), this.getMethodArgument(), null, "arguments", null, 0, -1, Method.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Properties(), ecorePackage.getEString(), "properties", null, 0, 1, Method.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_DefiningClass(), this.getClass_(), this.getClass_Methods(), "definingClass", null, 0,
			1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Label(), ecorePackage.getEString(), "label", null, 0, 1, Method.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Stubbed(), ecorePackage.getEBoolean(), "stubbed", null, 0, 1, Method.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_CalledMethods(), this.getMethod(), this.getMethod_CallingMethods(), "calledMethods",
			null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_CallingMethods(), this.getMethod(), this.getMethod_CalledMethods(), "callingMethods",
			null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_DemoParticipations(), theRequirementPackage.getScenario(),
			theRequirementPackage.getScenario_ParticipatingMethods(), "demoParticipations", null, 0, -1, Method.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(methodArgumentEClass, MethodArgument.class, "MethodArgument", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodArgument_Type(), ecorePackage.getEString(), "type", null, 0, 1, MethodArgument.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodArgument_Direction(), this.getArgumentDirectionType(), "direction", null, 0, 1,
			MethodArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodArgument_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1,
			MethodArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodArgument_Signature(), ecorePackage.getEString(), "signature", null, 0, 1,
			MethodArgument.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodArgument_Label(), ecorePackage.getEString(), "label", null, 0, 1, MethodArgument.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Source(), this.getPackageElement(), this.getPackageElement_OutgoingDependencies(),
			"source", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Target(), this.getPackageElement(), this.getPackageElement_IncomingDependencies(),
			"target", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literals(), this.getLiteral(), this.getLiteral_Enumeration(), "literals", null,
			0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_Attributes(), this.getAttribute(), this.getAttribute_ImplementationEnumeration(),
			"attributes", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_Literals(), "enumeration",
			null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, Literal.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(associationTypeEEnum, AssociationType.class, "AssociationType");
		addEEnumLiteral(associationTypeEEnum, AssociationType.UNDIRECTED_ASSOCIATION);
		addEEnumLiteral(associationTypeEEnum, AssociationType.DIRECTED_ASSOCIATION);
		addEEnumLiteral(associationTypeEEnum, AssociationType.AGGREGATION);
		addEEnumLiteral(associationTypeEEnum, AssociationType.COMPOSITION);

		initEEnum(visibilityTypeEEnum, VisibilityType.class, "VisibilityType");
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.UNDEFINED);
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.PACKAGE);
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.PRIVATE);
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.GLOBAL);
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.PROTECTED);

		initEEnum(scopeTypeEEnum, ScopeType.class, "ScopeType");
		addEEnumLiteral(scopeTypeEEnum, ScopeType.INSTANCE);
		addEEnumLiteral(scopeTypeEEnum, ScopeType.CLASS);

		initEEnum(argumentDirectionTypeEEnum, ArgumentDirectionType.class, "ArgumentDirectionType");
		addEEnumLiteral(argumentDirectionTypeEEnum, ArgumentDirectionType.UNDEFINED);
		addEEnumLiteral(argumentDirectionTypeEEnum, ArgumentDirectionType.IN);
		addEEnumLiteral(argumentDirectionTypeEEnum, ArgumentDirectionType.OUT);
		addEEnumLiteral(argumentDirectionTypeEEnum, ArgumentDirectionType.INOUT);

		initEEnum(instantiationTypeEEnum, InstantiationType.class, "InstantiationType");
		addEEnumLiteral(instantiationTypeEEnum, InstantiationType.CONCRETE);
		addEEnumLiteral(instantiationTypeEEnum, InstantiationType.ABSTRACT);
		addEEnumLiteral(instantiationTypeEEnum, InstantiationType.INTERFACE);

		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.INTEGER);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DATE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DOUBLE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.ENUMERATION);

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
		addAnnotation(getClass_ParticipatedUseCases(), source, new String[] { "priority", "20.0", "position", "left" });
		addAnnotation(getClass_SuperClasses(), source, new String[] { "priority", "21.0", "position", "left" });
		addAnnotation(getClass_SubClasses(), source, new String[] { "priority", "22.0", "position", "left" });
		addAnnotation(getClass_IncomingAssociations(), source, new String[] { "priority", "20.0", "position", "right" });
		addAnnotation(getClass_OutgoingAssociations(), source, new String[] { "priority", "21.0", "position", "right" });
		addAnnotation(getClass_Attributes(), source, new String[] { "priority", "23.0", "position", "left" });
		addAnnotation(getClass_Methods(), source, new String[] { "priority", "24.0", "position", "left" });
		addAnnotation(getClass_DemoParticipations(), source, new String[] { "priority", "9.0", "position", "right" });
		addAnnotation(getPackage_ContainedPackageElements(), source, new String[] { "priority", "9.5", "position",
			"right" });
		addAnnotation(getPackage_FacadeClass(), source, new String[] { "priority", "20.0", "position", "left" });
		addAnnotation(getPackageElement_ParentPackage(), source,
			new String[] { "priority", "10.0", "position", "left" });
		addAnnotation(getPackageElement_OutgoingDependencies(), source, new String[] { "priority", "10.0", "position",
			"right" });
		addAnnotation(getPackageElement_IncomingDependencies(), source, new String[] { "priority", "11.0", "position",
			"right" });
		addAnnotation(getAssociation_Source(), source, new String[] { "priority", "10.0", "position", "left" });
		addAnnotation(getAssociation_Target(), source, new String[] { "priority", "11.0", "position", "left" });
		addAnnotation(getAssociation_Type(), source, new String[] { "priority", "12.0", "position", "left" });
		addAnnotation(getAssociation_SourceMultiplicity(), source, new String[] { "priority", "13.0", "position",
			"left" });
		addAnnotation(getAssociation_TargetMultiplicity(), source, new String[] { "priority", "14.0", "position",
			"left" });
		addAnnotation(getAttribute_DefiningClass(), source, new String[] { "priority", "10.0", "position", "left" });
		addAnnotation(getAttribute_Visibility(), source, new String[] { "priority", "11.0", "position", "left" });
		addAnnotation(getAttribute_Scope(), source, new String[] { "priority", "12.0", "position", "left" });
		addAnnotation(getAttribute_Type(), source, new String[] { "priority", "13.0", "position", "left" });
		addAnnotation(getAttribute_DefaultValue(), source, new String[] { "priority", "14.0", "position", "left" });
		addAnnotation(getAttribute_Properties(), source, new String[] { "priority", "15.0", "position", "left" });
		addAnnotation(getAttribute_Label(), source, new String[] { "priority", "16.0", "position", "left" });
		addAnnotation(getMethod_Visibility(), source, new String[] { "priority", "11.0", "position", "left" });
		addAnnotation(getMethod_Scope(), source, new String[] { "priority", "12.0", "position", "left" });
		addAnnotation(getMethod_ReturnType(), source, new String[] { "priority", "13.0", "position", "left" });
		addAnnotation(getMethod_Arguments(), source, new String[] { "priority", "10.0", "position", "right" });
		addAnnotation(getMethod_Properties(), source, new String[] { "priority", "14.0", "position", "left" });
		addAnnotation(getMethod_DefiningClass(), source, new String[] { "priority", "10.0", "position", "left" });
		addAnnotation(getMethod_Label(), source, new String[] { "priority", "15.0", "position", "left" });
		addAnnotation(getMethod_CalledMethods(), source, new String[] { "priority", "10.1", "position", "right" });
		addAnnotation(getMethod_CallingMethods(), source, new String[] { "priority", "10.2", "position", "right" });
		addAnnotation(getMethod_DemoParticipations(), source, new String[] { "priority", "9.0", "position", "right" });
		addAnnotation(getMethodArgument_Type(), source, new String[] { "priority", "10.0", "position", "left" });
		addAnnotation(getMethodArgument_Direction(), source, new String[] { "priority", "11.0", "position", "left" });
		addAnnotation(getMethodArgument_DefaultValue(), source, new String[] { "priority", "12.0", "position", "left" });
		addAnnotation(getMethodArgument_Label(), source, new String[] { "priority", "13.0", "position", "left" });
		addAnnotation(getDependency_Source(), source, new String[] { "priority", "10.0", "position", "left" });
		addAnnotation(getDependency_Target(), source, new String[] { "priority", "11.0", "position", "left" });
	}

} // ClassesPackageImpl
