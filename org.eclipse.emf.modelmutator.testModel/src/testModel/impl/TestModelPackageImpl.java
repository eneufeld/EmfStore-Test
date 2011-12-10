/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import testModel.ContainedElement;
import testModel.Element;
import testModel.ElementType;
import testModel.Kategorie;
import testModel.TestModelFactory;
import testModel.TestModelPackage;
import testModel.multiRefElement;
import testModel.referenziertesElement;
import testModel.upperBound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestModelPackageImpl extends EPackageImpl implements TestModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kategorieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenziertesElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiRefElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upperBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see testModel.TestModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestModelPackageImpl() {
		super(eNS_URI, TestModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TestModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestModelPackage init() {
		if (isInited) return (TestModelPackage)EPackage.Registry.INSTANCE.getEPackage(TestModelPackage.eNS_URI);

		// Obtain or create and register package
		TestModelPackageImpl theTestModelPackage = (TestModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTestModelPackage.createPackageContents();

		// Initialize created meta-data
		theTestModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestModelPackage.eNS_URI, theTestModelPackage);
		return theTestModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKategorie() {
		return kategorieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKategorie_Name() {
		return (EAttribute)kategorieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKategorie_Bigdeci() {
		return (EAttribute)kategorieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKategorie_Bigint() {
		return (EAttribute)kategorieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKategorie_Bool() {
		return (EAttribute)kategorieEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKategorie_Boolean() {
		return (EAttribute)kategorieEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKategorie_Byte() {
		return (EAttribute)kategorieEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKategorie_SubKategorie() {
		return (EReference)kategorieEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKategorie_Contains() {
		return (EReference)kategorieEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedElement() {
		return containedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_Name() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_ByteArray() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_ByteObject() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_Char() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_Character() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_Date() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_DiagnosticChain() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_Double() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_DoubleObj() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_Float() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedElement_ElementType() {
		return (EAttribute)containedElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedElement_Ref() {
		return (EReference)containedElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedElement_UpperBound() {
		return (EReference)containedElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreferenziertesElement() {
		return referenziertesElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferenziertesElement_Float() {
		return (EAttribute)referenziertesElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferenziertesElement_Int() {
		return (EAttribute)referenziertesElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferenziertesElement_Integer() {
		return (EAttribute)referenziertesElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferenziertesElement_Long() {
		return (EAttribute)referenziertesElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferenziertesElement_LongObj() {
		return (EAttribute)referenziertesElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferenziertesElement_Short() {
		return (EAttribute)referenziertesElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferenziertesElement_ShortObj() {
		return (EAttribute)referenziertesElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferenziertesElement_Name() {
		return (EAttribute)referenziertesElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferenziertesElement_NotChangeable() {
		return (EAttribute)referenziertesElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreferenziertesElement_MultiRef() {
		return (EReference)referenziertesElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmultiRefElement() {
		return multiRefElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmultiRefElement_Name() {
		return (EAttribute)multiRefElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getupperBound() {
		return upperBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getupperBound_Name() {
		return (EAttribute)upperBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementType() {
		return elementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestModelFactory getTestModelFactory() {
		return (TestModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		kategorieEClass = createEClass(KATEGORIE);
		createEAttribute(kategorieEClass, KATEGORIE__NAME);
		createEAttribute(kategorieEClass, KATEGORIE__BIGDECI);
		createEAttribute(kategorieEClass, KATEGORIE__BIGINT);
		createEAttribute(kategorieEClass, KATEGORIE__BOOL);
		createEAttribute(kategorieEClass, KATEGORIE__BOOLEAN);
		createEAttribute(kategorieEClass, KATEGORIE__BYTE);
		createEReference(kategorieEClass, KATEGORIE__SUB_KATEGORIE);
		createEReference(kategorieEClass, KATEGORIE__CONTAINS);

		containedElementEClass = createEClass(CONTAINED_ELEMENT);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__NAME);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__BYTE_ARRAY);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__BYTE_OBJECT);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__CHAR);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__CHARACTER);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__DATE);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__DIAGNOSTIC_CHAIN);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__DOUBLE);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__DOUBLE_OBJ);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__FLOAT);
		createEAttribute(containedElementEClass, CONTAINED_ELEMENT__ELEMENT_TYPE);
		createEReference(containedElementEClass, CONTAINED_ELEMENT__REF);
		createEReference(containedElementEClass, CONTAINED_ELEMENT__UPPER_BOUND);

		referenziertesElementEClass = createEClass(REFERENZIERTES_ELEMENT);
		createEAttribute(referenziertesElementEClass, REFERENZIERTES_ELEMENT__FLOAT);
		createEAttribute(referenziertesElementEClass, REFERENZIERTES_ELEMENT__INT);
		createEAttribute(referenziertesElementEClass, REFERENZIERTES_ELEMENT__INTEGER);
		createEAttribute(referenziertesElementEClass, REFERENZIERTES_ELEMENT__LONG);
		createEAttribute(referenziertesElementEClass, REFERENZIERTES_ELEMENT__LONG_OBJ);
		createEAttribute(referenziertesElementEClass, REFERENZIERTES_ELEMENT__SHORT);
		createEAttribute(referenziertesElementEClass, REFERENZIERTES_ELEMENT__SHORT_OBJ);
		createEAttribute(referenziertesElementEClass, REFERENZIERTES_ELEMENT__NAME);
		createEAttribute(referenziertesElementEClass, REFERENZIERTES_ELEMENT__NOT_CHANGEABLE);
		createEReference(referenziertesElementEClass, REFERENZIERTES_ELEMENT__MULTI_REF);

		multiRefElementEClass = createEClass(MULTI_REF_ELEMENT);
		createEAttribute(multiRefElementEClass, MULTI_REF_ELEMENT__NAME);

		upperBoundEClass = createEClass(UPPER_BOUND);
		createEAttribute(upperBoundEClass, UPPER_BOUND__NAME);

		elementEClass = createEClass(ELEMENT);

		// Create enums
		elementTypeEEnum = createEEnum(ELEMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		referenziertesElementEClass.getESuperTypes().add(this.getElement());
		multiRefElementEClass.getESuperTypes().add(this.getElement());
		upperBoundEClass.getESuperTypes().add(this.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(kategorieEClass, Kategorie.class, "Kategorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKategorie_Name(), ecorePackage.getEString(), "name", "", 0, 1, Kategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKategorie_Bigdeci(), ecorePackage.getEBigDecimal(), "bigdeci", null, 0, 1, Kategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKategorie_Bigint(), ecorePackage.getEBigInteger(), "bigint", null, 0, 1, Kategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKategorie_Bool(), ecorePackage.getEBoolean(), "bool", null, 0, 1, Kategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKategorie_Boolean(), ecorePackage.getEBooleanObject(), "Boolean", null, 0, 1, Kategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKategorie_Byte(), ecorePackage.getEByte(), "byte", null, 0, 1, Kategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKategorie_SubKategorie(), this.getKategorie(), null, "subKategorie", null, 0, -1, Kategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKategorie_Contains(), this.getContainedElement(), null, "contains", null, 0, -1, Kategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containedElementEClass, ContainedElement.class, "ContainedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_ByteArray(), ecorePackage.getEByteArray(), "byteArray", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_ByteObject(), ecorePackage.getEByteObject(), "byteObject", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_Char(), ecorePackage.getEChar(), "char", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_Character(), ecorePackage.getECharacterObject(), "Character", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_Date(), ecorePackage.getEDate(), "date", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_DiagnosticChain(), ecorePackage.getEDiagnosticChain(), "DiagnosticChain", null, 0, 1, ContainedElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_Double(), ecorePackage.getEDouble(), "double", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_DoubleObj(), ecorePackage.getEDoubleObject(), "DoubleObj", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_Float(), ecorePackage.getEFloat(), "float", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedElement_ElementType(), this.getElementType(), "elementType", null, 0, 1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainedElement_Ref(), this.getreferenziertesElement(), null, "ref", null, 0, -1, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainedElement_UpperBound(), this.getupperBound(), null, "upperBound", null, 0, 2, ContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenziertesElementEClass, referenziertesElement.class, "referenziertesElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getreferenziertesElement_Float(), ecorePackage.getEFloatObject(), "Float", null, 0, 1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getreferenziertesElement_Int(), ecorePackage.getEInt(), "int", null, 0, 1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getreferenziertesElement_Integer(), ecorePackage.getEIntegerObject(), "Integer", null, 0, 1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getreferenziertesElement_Long(), ecorePackage.getELong(), "long", null, 0, 1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getreferenziertesElement_LongObj(), ecorePackage.getELongObject(), "LongObj", null, 0, 1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getreferenziertesElement_Short(), ecorePackage.getEShort(), "short", null, 0, 1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getreferenziertesElement_ShortObj(), ecorePackage.getEShortObject(), "ShortObj", null, 0, 1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getreferenziertesElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getreferenziertesElement_NotChangeable(), ecorePackage.getEString(), "notChangeable", "NOT", 0, 1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getreferenziertesElement_MultiRef(), this.getmultiRefElement(), null, "multiRef", null, 0, -1, referenziertesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiRefElementEClass, multiRefElement.class, "multiRefElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmultiRefElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, multiRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upperBoundEClass, upperBound.class, "upperBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getupperBound_Name(), ecorePackage.getEString(), "name", null, 0, 1, upperBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(elementTypeEEnum, ElementType.class, "ElementType");
		addEEnumLiteral(elementTypeEEnum, ElementType.TYPE1);
		addEEnumLiteral(elementTypeEEnum, ElementType.TYPE2);

		// Create resource
		createResource(eNS_URI);
	}

} //TestModelPackageImpl
