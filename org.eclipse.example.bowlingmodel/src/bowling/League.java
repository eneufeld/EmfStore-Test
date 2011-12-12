/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bowling.League#getName <em>Name</em>}</li>
 *   <li>{@link bowling.League#getPlayers <em>Players</em>}</li>
 *   <li>{@link bowling.League#getSubleagues <em>Subleagues</em>}</li>
 *   <li>{@link bowling.League#getTournaments <em>Tournaments</em>}</li>
 * </ul>
 * </p>
 *
 * @see bowling.BowlingPackage#getLeague()
 * @model
 * @generated
 */
public interface League extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bowling.BowlingPackage#getLeague_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bowling.League#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link bowling.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see bowling.BowlingPackage#getLeague_Players()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Subleagues</b></em>' containment reference list.
	 * The list contents are of type {@link bowling.League}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subleagues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subleagues</em>' containment reference list.
	 * @see bowling.BowlingPackage#getLeague_Subleagues()
	 * @model containment="true"
	 * @generated
	 */
	EList<League> getSubleagues();

	/**
	 * Returns the value of the '<em><b>Tournaments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournaments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournaments</em>' containment reference.
	 * @see #setTournaments(Tournament)
	 * @see bowling.BowlingPackage#getLeague_Tournaments()
	 * @model containment="true"
	 * @generated
	 */
	Tournament getTournaments();

	/**
	 * Sets the value of the '{@link bowling.League#getTournaments <em>Tournaments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournaments</em>' containment reference.
	 * @see #getTournaments()
	 * @generated
	 */
	void setTournaments(Tournament value);

} // League
