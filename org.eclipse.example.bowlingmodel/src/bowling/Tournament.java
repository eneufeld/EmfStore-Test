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
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bowling.Tournament#getMatchups <em>Matchups</em>}</li>
 *   <li>{@link bowling.Tournament#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bowling.BowlingPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchups</b></em>' containment reference list.
	 * The list contents are of type {@link bowling.Matchup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchups</em>' containment reference list.
	 * @see bowling.BowlingPackage#getTournament_Matchups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Matchup> getMatchups();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bowling.TournamentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bowling.TournamentType
	 * @see #setType(TournamentType)
	 * @see bowling.BowlingPackage#getTournament_Type()
	 * @model
	 * @generated
	 */
	TournamentType getType();

	/**
	 * Sets the value of the '{@link bowling.Tournament#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bowling.TournamentType
	 * @see #getType()
	 * @generated
	 */
	void setType(TournamentType value);

} // Tournament
