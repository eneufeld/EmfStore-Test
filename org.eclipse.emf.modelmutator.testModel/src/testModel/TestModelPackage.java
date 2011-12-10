/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see testModel.TestModelFactory
 * @model kind="package"
 * @generated
 */
public interface TestModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/emf/modelmutator/testModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.modelmutator.testModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestModelPackage eINSTANCE = testModel.impl.TestModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link testModel.impl.KategorieImpl <em>Kategorie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.impl.KategorieImpl
	 * @see testModel.impl.TestModelPackageImpl#getKategorie()
	 * @generated
	 */
	int KATEGORIE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATEGORIE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bigdeci</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATEGORIE__BIGDECI = 1;

	/**
	 * The feature id for the '<em><b>Bigint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATEGORIE__BIGINT = 2;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATEGORIE__BOOL = 3;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATEGORIE__BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATEGORIE__BYTE = 5;

	/**
	 * The feature id for the '<em><b>Sub Kategorie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATEGORIE__SUB_KATEGORIE = 6;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATEGORIE__CONTAINS = 7;

	/**
	 * The number of structural features of the '<em>Kategorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATEGORIE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link testModel.impl.ContainedElementImpl <em>Contained Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.impl.ContainedElementImpl
	 * @see testModel.impl.TestModelPackageImpl#getContainedElement()
	 * @generated
	 */
	int CONTAINED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Byte Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__BYTE_ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Byte Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__BYTE_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__CHAR = 3;

	/**
	 * The feature id for the '<em><b>Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__CHARACTER = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__DATE = 5;

	/**
	 * The feature id for the '<em><b>Diagnostic Chain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__DIAGNOSTIC_CHAIN = 6;

	/**
	 * The feature id for the '<em><b>Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__DOUBLE = 7;

	/**
	 * The feature id for the '<em><b>Double Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__DOUBLE_OBJ = 8;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__FLOAT = 9;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__ELEMENT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__REF = 11;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__UPPER_BOUND = 12;

	/**
	 * The number of structural features of the '<em>Contained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link testModel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.impl.ElementImpl
	 * @see testModel.impl.TestModelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link testModel.impl.referenziertesElementImpl <em>referenziertes Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.impl.referenziertesElementImpl
	 * @see testModel.impl.TestModelPackageImpl#getreferenziertesElement()
	 * @generated
	 */
	int REFERENZIERTES_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__FLOAT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__INT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__INTEGER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__LONG = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Long Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__LONG_OBJ = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__SHORT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Short Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__SHORT_OBJ = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__NOT_CHANGEABLE = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Multi Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT__MULTI_REF = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>referenziertes Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZIERTES_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link testModel.impl.multiRefElementImpl <em>multi Ref Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.impl.multiRefElementImpl
	 * @see testModel.impl.TestModelPackageImpl#getmultiRefElement()
	 * @generated
	 */
	int MULTI_REF_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>multi Ref Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link testModel.impl.upperBoundImpl <em>upper Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.impl.upperBoundImpl
	 * @see testModel.impl.TestModelPackageImpl#getupperBound()
	 * @generated
	 */
	int UPPER_BOUND = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>upper Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link testModel.ElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.ElementType
	 * @see testModel.impl.TestModelPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link testModel.Kategorie <em>Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kategorie</em>'.
	 * @see testModel.Kategorie
	 * @generated
	 */
	EClass getKategorie();

	/**
	 * Returns the meta object for the attribute '{@link testModel.Kategorie#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testModel.Kategorie#getName()
	 * @see #getKategorie()
	 * @generated
	 */
	EAttribute getKategorie_Name();

	/**
	 * Returns the meta object for the attribute '{@link testModel.Kategorie#getBigdeci <em>Bigdeci</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bigdeci</em>'.
	 * @see testModel.Kategorie#getBigdeci()
	 * @see #getKategorie()
	 * @generated
	 */
	EAttribute getKategorie_Bigdeci();

	/**
	 * Returns the meta object for the attribute '{@link testModel.Kategorie#getBigint <em>Bigint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bigint</em>'.
	 * @see testModel.Kategorie#getBigint()
	 * @see #getKategorie()
	 * @generated
	 */
	EAttribute getKategorie_Bigint();

	/**
	 * Returns the meta object for the attribute '{@link testModel.Kategorie#isBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool</em>'.
	 * @see testModel.Kategorie#isBool()
	 * @see #getKategorie()
	 * @generated
	 */
	EAttribute getKategorie_Bool();

	/**
	 * Returns the meta object for the attribute '{@link testModel.Kategorie#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean</em>'.
	 * @see testModel.Kategorie#getBoolean()
	 * @see #getKategorie()
	 * @generated
	 */
	EAttribute getKategorie_Boolean();

	/**
	 * Returns the meta object for the attribute '{@link testModel.Kategorie#getByte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte</em>'.
	 * @see testModel.Kategorie#getByte()
	 * @see #getKategorie()
	 * @generated
	 */
	EAttribute getKategorie_Byte();

	/**
	 * Returns the meta object for the reference list '{@link testModel.Kategorie#getSubKategorie <em>Sub Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Kategorie</em>'.
	 * @see testModel.Kategorie#getSubKategorie()
	 * @see #getKategorie()
	 * @generated
	 */
	EReference getKategorie_SubKategorie();

	/**
	 * Returns the meta object for the containment reference list '{@link testModel.Kategorie#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see testModel.Kategorie#getContains()
	 * @see #getKategorie()
	 * @generated
	 */
	EReference getKategorie_Contains();

	/**
	 * Returns the meta object for class '{@link testModel.ContainedElement <em>Contained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Element</em>'.
	 * @see testModel.ContainedElement
	 * @generated
	 */
	EClass getContainedElement();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testModel.ContainedElement#getName()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getByteArray <em>Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Array</em>'.
	 * @see testModel.ContainedElement#getByteArray()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_ByteArray();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getByteObject <em>Byte Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Object</em>'.
	 * @see testModel.ContainedElement#getByteObject()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_ByteObject();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see testModel.ContainedElement#getChar()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_Char();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getCharacter <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character</em>'.
	 * @see testModel.ContainedElement#getCharacter()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_Character();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see testModel.ContainedElement#getDate()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_Date();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getDiagnosticChain <em>Diagnostic Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnostic Chain</em>'.
	 * @see testModel.ContainedElement#getDiagnosticChain()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_DiagnosticChain();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double</em>'.
	 * @see testModel.ContainedElement#getDouble()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_Double();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getDoubleObj <em>Double Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Obj</em>'.
	 * @see testModel.ContainedElement#getDoubleObj()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_DoubleObj();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see testModel.ContainedElement#getFloat()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_Float();

	/**
	 * Returns the meta object for the attribute '{@link testModel.ContainedElement#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see testModel.ContainedElement#getElementType()
	 * @see #getContainedElement()
	 * @generated
	 */
	EAttribute getContainedElement_ElementType();

	/**
	 * Returns the meta object for the reference list '{@link testModel.ContainedElement#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref</em>'.
	 * @see testModel.ContainedElement#getRef()
	 * @see #getContainedElement()
	 * @generated
	 */
	EReference getContainedElement_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link testModel.ContainedElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Bound</em>'.
	 * @see testModel.ContainedElement#getUpperBound()
	 * @see #getContainedElement()
	 * @generated
	 */
	EReference getContainedElement_UpperBound();

	/**
	 * Returns the meta object for class '{@link testModel.referenziertesElement <em>referenziertes Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>referenziertes Element</em>'.
	 * @see testModel.referenziertesElement
	 * @generated
	 */
	EClass getreferenziertesElement();

	/**
	 * Returns the meta object for the attribute '{@link testModel.referenziertesElement#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see testModel.referenziertesElement#getFloat()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EAttribute getreferenziertesElement_Float();

	/**
	 * Returns the meta object for the attribute '{@link testModel.referenziertesElement#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int</em>'.
	 * @see testModel.referenziertesElement#getInt()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EAttribute getreferenziertesElement_Int();

	/**
	 * Returns the meta object for the attribute '{@link testModel.referenziertesElement#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see testModel.referenziertesElement#getInteger()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EAttribute getreferenziertesElement_Integer();

	/**
	 * Returns the meta object for the attribute '{@link testModel.referenziertesElement#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see testModel.referenziertesElement#getLong()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EAttribute getreferenziertesElement_Long();

	/**
	 * Returns the meta object for the attribute '{@link testModel.referenziertesElement#getLongObj <em>Long Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Obj</em>'.
	 * @see testModel.referenziertesElement#getLongObj()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EAttribute getreferenziertesElement_LongObj();

	/**
	 * Returns the meta object for the attribute '{@link testModel.referenziertesElement#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short</em>'.
	 * @see testModel.referenziertesElement#getShort()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EAttribute getreferenziertesElement_Short();

	/**
	 * Returns the meta object for the attribute '{@link testModel.referenziertesElement#getShortObj <em>Short Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Obj</em>'.
	 * @see testModel.referenziertesElement#getShortObj()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EAttribute getreferenziertesElement_ShortObj();

	/**
	 * Returns the meta object for the attribute '{@link testModel.referenziertesElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testModel.referenziertesElement#getName()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EAttribute getreferenziertesElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link testModel.referenziertesElement#getNotChangeable <em>Not Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Changeable</em>'.
	 * @see testModel.referenziertesElement#getNotChangeable()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EAttribute getreferenziertesElement_NotChangeable();

	/**
	 * Returns the meta object for the reference list '{@link testModel.referenziertesElement#getMultiRef <em>Multi Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multi Ref</em>'.
	 * @see testModel.referenziertesElement#getMultiRef()
	 * @see #getreferenziertesElement()
	 * @generated
	 */
	EReference getreferenziertesElement_MultiRef();

	/**
	 * Returns the meta object for class '{@link testModel.multiRefElement <em>multi Ref Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>multi Ref Element</em>'.
	 * @see testModel.multiRefElement
	 * @generated
	 */
	EClass getmultiRefElement();

	/**
	 * Returns the meta object for the attribute '{@link testModel.multiRefElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testModel.multiRefElement#getName()
	 * @see #getmultiRefElement()
	 * @generated
	 */
	EAttribute getmultiRefElement_Name();

	/**
	 * Returns the meta object for class '{@link testModel.upperBound <em>upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>upper Bound</em>'.
	 * @see testModel.upperBound
	 * @generated
	 */
	EClass getupperBound();

	/**
	 * Returns the meta object for the attribute '{@link testModel.upperBound#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testModel.upperBound#getName()
	 * @see #getupperBound()
	 * @generated
	 */
	EAttribute getupperBound_Name();

	/**
	 * Returns the meta object for class '{@link testModel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see testModel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for enum '{@link testModel.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see testModel.ElementType
	 * @generated
	 */
	EEnum getElementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestModelFactory getTestModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link testModel.impl.KategorieImpl <em>Kategorie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.impl.KategorieImpl
		 * @see testModel.impl.TestModelPackageImpl#getKategorie()
		 * @generated
		 */
		EClass KATEGORIE = eINSTANCE.getKategorie();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KATEGORIE__NAME = eINSTANCE.getKategorie_Name();

		/**
		 * The meta object literal for the '<em><b>Bigdeci</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KATEGORIE__BIGDECI = eINSTANCE.getKategorie_Bigdeci();

		/**
		 * The meta object literal for the '<em><b>Bigint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KATEGORIE__BIGINT = eINSTANCE.getKategorie_Bigint();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KATEGORIE__BOOL = eINSTANCE.getKategorie_Bool();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KATEGORIE__BOOLEAN = eINSTANCE.getKategorie_Boolean();

		/**
		 * The meta object literal for the '<em><b>Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KATEGORIE__BYTE = eINSTANCE.getKategorie_Byte();

		/**
		 * The meta object literal for the '<em><b>Sub Kategorie</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KATEGORIE__SUB_KATEGORIE = eINSTANCE.getKategorie_SubKategorie();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KATEGORIE__CONTAINS = eINSTANCE.getKategorie_Contains();

		/**
		 * The meta object literal for the '{@link testModel.impl.ContainedElementImpl <em>Contained Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.impl.ContainedElementImpl
		 * @see testModel.impl.TestModelPackageImpl#getContainedElement()
		 * @generated
		 */
		EClass CONTAINED_ELEMENT = eINSTANCE.getContainedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__NAME = eINSTANCE.getContainedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Byte Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__BYTE_ARRAY = eINSTANCE.getContainedElement_ByteArray();

		/**
		 * The meta object literal for the '<em><b>Byte Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__BYTE_OBJECT = eINSTANCE.getContainedElement_ByteObject();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__CHAR = eINSTANCE.getContainedElement_Char();

		/**
		 * The meta object literal for the '<em><b>Character</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__CHARACTER = eINSTANCE.getContainedElement_Character();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__DATE = eINSTANCE.getContainedElement_Date();

		/**
		 * The meta object literal for the '<em><b>Diagnostic Chain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__DIAGNOSTIC_CHAIN = eINSTANCE.getContainedElement_DiagnosticChain();

		/**
		 * The meta object literal for the '<em><b>Double</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__DOUBLE = eINSTANCE.getContainedElement_Double();

		/**
		 * The meta object literal for the '<em><b>Double Obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__DOUBLE_OBJ = eINSTANCE.getContainedElement_DoubleObj();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__FLOAT = eINSTANCE.getContainedElement_Float();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_ELEMENT__ELEMENT_TYPE = eINSTANCE.getContainedElement_ElementType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_ELEMENT__REF = eINSTANCE.getContainedElement_Ref();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_ELEMENT__UPPER_BOUND = eINSTANCE.getContainedElement_UpperBound();

		/**
		 * The meta object literal for the '{@link testModel.impl.referenziertesElementImpl <em>referenziertes Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.impl.referenziertesElementImpl
		 * @see testModel.impl.TestModelPackageImpl#getreferenziertesElement()
		 * @generated
		 */
		EClass REFERENZIERTES_ELEMENT = eINSTANCE.getreferenziertesElement();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZIERTES_ELEMENT__FLOAT = eINSTANCE.getreferenziertesElement_Float();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZIERTES_ELEMENT__INT = eINSTANCE.getreferenziertesElement_Int();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZIERTES_ELEMENT__INTEGER = eINSTANCE.getreferenziertesElement_Integer();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZIERTES_ELEMENT__LONG = eINSTANCE.getreferenziertesElement_Long();

		/**
		 * The meta object literal for the '<em><b>Long Obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZIERTES_ELEMENT__LONG_OBJ = eINSTANCE.getreferenziertesElement_LongObj();

		/**
		 * The meta object literal for the '<em><b>Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZIERTES_ELEMENT__SHORT = eINSTANCE.getreferenziertesElement_Short();

		/**
		 * The meta object literal for the '<em><b>Short Obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZIERTES_ELEMENT__SHORT_OBJ = eINSTANCE.getreferenziertesElement_ShortObj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZIERTES_ELEMENT__NAME = eINSTANCE.getreferenziertesElement_Name();

		/**
		 * The meta object literal for the '<em><b>Not Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZIERTES_ELEMENT__NOT_CHANGEABLE = eINSTANCE.getreferenziertesElement_NotChangeable();

		/**
		 * The meta object literal for the '<em><b>Multi Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENZIERTES_ELEMENT__MULTI_REF = eINSTANCE.getreferenziertesElement_MultiRef();

		/**
		 * The meta object literal for the '{@link testModel.impl.multiRefElementImpl <em>multi Ref Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.impl.multiRefElementImpl
		 * @see testModel.impl.TestModelPackageImpl#getmultiRefElement()
		 * @generated
		 */
		EClass MULTI_REF_ELEMENT = eINSTANCE.getmultiRefElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_REF_ELEMENT__NAME = eINSTANCE.getmultiRefElement_Name();

		/**
		 * The meta object literal for the '{@link testModel.impl.upperBoundImpl <em>upper Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.impl.upperBoundImpl
		 * @see testModel.impl.TestModelPackageImpl#getupperBound()
		 * @generated
		 */
		EClass UPPER_BOUND = eINSTANCE.getupperBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPPER_BOUND__NAME = eINSTANCE.getupperBound_Name();

		/**
		 * The meta object literal for the '{@link testModel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.impl.ElementImpl
		 * @see testModel.impl.TestModelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link testModel.ElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.ElementType
		 * @see testModel.impl.TestModelPackageImpl#getElementType()
		 * @generated
		 */
		EEnum ELEMENT_TYPE = eINSTANCE.getElementType();

	}

} //TestModelPackage
