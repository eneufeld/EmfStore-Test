/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kategorie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link testModel.Kategorie#getName <em>Name</em>}</li>
 *   <li>{@link testModel.Kategorie#getBigdeci <em>Bigdeci</em>}</li>
 *   <li>{@link testModel.Kategorie#getBigint <em>Bigint</em>}</li>
 *   <li>{@link testModel.Kategorie#isBool <em>Bool</em>}</li>
 *   <li>{@link testModel.Kategorie#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link testModel.Kategorie#getByte <em>Byte</em>}</li>
 *   <li>{@link testModel.Kategorie#getSubKategorie <em>Sub Kategorie</em>}</li>
 *   <li>{@link testModel.Kategorie#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see testModel.TestModelPackage#getKategorie()
 * @model
 * @generated
 */
public interface Kategorie extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testModel.TestModelPackage#getKategorie_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testModel.Kategorie#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bigdeci</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bigdeci</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bigdeci</em>' attribute.
	 * @see #setBigdeci(BigDecimal)
	 * @see testModel.TestModelPackage#getKategorie_Bigdeci()
	 * @model
	 * @generated
	 */
	BigDecimal getBigdeci();

	/**
	 * Sets the value of the '{@link testModel.Kategorie#getBigdeci <em>Bigdeci</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bigdeci</em>' attribute.
	 * @see #getBigdeci()
	 * @generated
	 */
	void setBigdeci(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Bigint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bigint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bigint</em>' attribute.
	 * @see #setBigint(BigInteger)
	 * @see testModel.TestModelPackage#getKategorie_Bigint()
	 * @model
	 * @generated
	 */
	BigInteger getBigint();

	/**
	 * Sets the value of the '{@link testModel.Kategorie#getBigint <em>Bigint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bigint</em>' attribute.
	 * @see #getBigint()
	 * @generated
	 */
	void setBigint(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' attribute.
	 * @see #setBool(boolean)
	 * @see testModel.TestModelPackage#getKategorie_Bool()
	 * @model
	 * @generated
	 */
	boolean isBool();

	/**
	 * Sets the value of the '{@link testModel.Kategorie#isBool <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' attribute.
	 * @see #isBool()
	 * @generated
	 */
	void setBool(boolean value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute.
	 * @see #setBoolean(Boolean)
	 * @see testModel.TestModelPackage#getKategorie_Boolean()
	 * @model
	 * @generated
	 */
	Boolean getBoolean();

	/**
	 * Sets the value of the '{@link testModel.Kategorie#getBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' attribute.
	 * @see #getBoolean()
	 * @generated
	 */
	void setBoolean(Boolean value);

	/**
	 * Returns the value of the '<em><b>Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte</em>' attribute.
	 * @see #setByte(byte)
	 * @see testModel.TestModelPackage#getKategorie_Byte()
	 * @model
	 * @generated
	 */
	byte getByte();

	/**
	 * Sets the value of the '{@link testModel.Kategorie#getByte <em>Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte</em>' attribute.
	 * @see #getByte()
	 * @generated
	 */
	void setByte(byte value);

	/**
	 * Returns the value of the '<em><b>Sub Kategorie</b></em>' reference list.
	 * The list contents are of type {@link testModel.Kategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Kategorie</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Kategorie</em>' reference list.
	 * @see testModel.TestModelPackage#getKategorie_SubKategorie()
	 * @model
	 * @generated
	 */
	EList<Kategorie> getSubKategorie();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link testModel.ContainedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see testModel.TestModelPackage#getKategorie_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainedElement> getContains();

} // Kategorie
