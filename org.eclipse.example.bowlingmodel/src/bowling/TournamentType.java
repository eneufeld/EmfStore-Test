/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bowling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tournament Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bowling.BowlingPackage#getTournamentType()
 * @model
 * @generated
 */
public enum TournamentType implements Enumerator {
	/**
	 * The '<em><b>Pro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRO_VALUE
	 * @generated
	 * @ordered
	 */
	PRO(0, "Pro", "Pro"),

	/**
	 * The '<em><b>Amateur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMATEUR_VALUE
	 * @generated
	 * @ordered
	 */
	AMATEUR(1, "Amateur", "Amateur");

	/**
	 * The '<em><b>Pro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pro</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRO
	 * @model name="Pro"
	 * @generated
	 * @ordered
	 */
	public static final int PRO_VALUE = 0;

	/**
	 * The '<em><b>Amateur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amateur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMATEUR
	 * @model name="Amateur"
	 * @generated
	 * @ordered
	 */
	public static final int AMATEUR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Tournament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TournamentType[] VALUES_ARRAY =
		new TournamentType[] {
			PRO,
			AMATEUR,
		};

	/**
	 * A public read-only list of all the '<em><b>Tournament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TournamentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tournament Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TournamentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TournamentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tournament Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TournamentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TournamentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tournament Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TournamentType get(int value) {
		switch (value) {
			case PRO_VALUE: return PRO;
			case AMATEUR_VALUE: return AMATEUR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TournamentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TournamentType
