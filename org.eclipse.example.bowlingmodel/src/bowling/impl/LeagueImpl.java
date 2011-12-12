/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bowling.impl;

import bowling.BowlingPackage;
import bowling.League;
import bowling.Player;

import bowling.Tournament;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bowling.impl.LeagueImpl#getName <em>Name</em>}</li>
 *   <li>{@link bowling.impl.LeagueImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link bowling.impl.LeagueImpl#getSubleagues <em>Subleagues</em>}</li>
 *   <li>{@link bowling.impl.LeagueImpl#getTournaments <em>Tournaments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeagueImpl extends EObjectImpl implements League {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getSubleagues() <em>Subleagues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubleagues()
	 * @generated
	 * @ordered
	 */
	protected EList<League> subleagues;

	/**
	 * The cached value of the '{@link #getTournaments() <em>Tournaments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournaments()
	 * @generated
	 * @ordered
	 */
	protected Tournament tournaments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BowlingPackage.Literals.LEAGUE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.LEAGUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentEList<Player>(Player.class, this, BowlingPackage.LEAGUE__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<League> getSubleagues() {
		if (subleagues == null) {
			subleagues = new EObjectContainmentEList<League>(League.class, this, BowlingPackage.LEAGUE__SUBLEAGUES);
		}
		return subleagues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament getTournaments() {
		return tournaments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTournaments(Tournament newTournaments, NotificationChain msgs) {
		Tournament oldTournaments = tournaments;
		tournaments = newTournaments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BowlingPackage.LEAGUE__TOURNAMENTS, oldTournaments, newTournaments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTournaments(Tournament newTournaments) {
		if (newTournaments != tournaments) {
			NotificationChain msgs = null;
			if (tournaments != null)
				msgs = ((InternalEObject)tournaments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BowlingPackage.LEAGUE__TOURNAMENTS, null, msgs);
			if (newTournaments != null)
				msgs = ((InternalEObject)newTournaments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BowlingPackage.LEAGUE__TOURNAMENTS, null, msgs);
			msgs = basicSetTournaments(newTournaments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.LEAGUE__TOURNAMENTS, newTournaments, newTournaments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BowlingPackage.LEAGUE__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case BowlingPackage.LEAGUE__SUBLEAGUES:
				return ((InternalEList<?>)getSubleagues()).basicRemove(otherEnd, msgs);
			case BowlingPackage.LEAGUE__TOURNAMENTS:
				return basicSetTournaments(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BowlingPackage.LEAGUE__NAME:
				return getName();
			case BowlingPackage.LEAGUE__PLAYERS:
				return getPlayers();
			case BowlingPackage.LEAGUE__SUBLEAGUES:
				return getSubleagues();
			case BowlingPackage.LEAGUE__TOURNAMENTS:
				return getTournaments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BowlingPackage.LEAGUE__NAME:
				setName((String)newValue);
				return;
			case BowlingPackage.LEAGUE__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case BowlingPackage.LEAGUE__SUBLEAGUES:
				getSubleagues().clear();
				getSubleagues().addAll((Collection<? extends League>)newValue);
				return;
			case BowlingPackage.LEAGUE__TOURNAMENTS:
				setTournaments((Tournament)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BowlingPackage.LEAGUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BowlingPackage.LEAGUE__PLAYERS:
				getPlayers().clear();
				return;
			case BowlingPackage.LEAGUE__SUBLEAGUES:
				getSubleagues().clear();
				return;
			case BowlingPackage.LEAGUE__TOURNAMENTS:
				setTournaments((Tournament)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BowlingPackage.LEAGUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BowlingPackage.LEAGUE__PLAYERS:
				return players != null && !players.isEmpty();
			case BowlingPackage.LEAGUE__SUBLEAGUES:
				return subleagues != null && !subleagues.isEmpty();
			case BowlingPackage.LEAGUE__TOURNAMENTS:
				return tournaments != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LeagueImpl
