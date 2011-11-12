/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.state.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.state.StateNode;
import org.eclipse.emf.emfstore.client.test.model.state.StatePackage;
import org.eclipse.emf.emfstore.client.test.model.state.Transition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.impl.StateNodeImpl#getOutgoingTransitions <em>Outgoing
 * Transitions</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.impl.StateNodeImpl#getIncomingTransitions <em>Incoming
 * Transitions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class StateNodeImpl extends UnicaseModelElementImpl implements StateNode {
	/**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransitions;

	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransitions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StateNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatePackage.Literals.STATE_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Transition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
				StatePackage.STATE_NODE__OUTGOING_TRANSITIONS, StatePackage.TRANSITION__SOURCE);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Transition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
				StatePackage.STATE_NODE__INCOMING_TRANSITIONS, StatePackage.TRANSITION__TARGET);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatePackage.STATE_NODE__OUTGOING_TRANSITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingTransitions()).basicAdd(otherEnd,
				msgs);
		case StatePackage.STATE_NODE__INCOMING_TRANSITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingTransitions()).basicAdd(otherEnd,
				msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatePackage.STATE_NODE__OUTGOING_TRANSITIONS:
			return ((InternalEList<?>) getOutgoingTransitions()).basicRemove(otherEnd, msgs);
		case StatePackage.STATE_NODE__INCOMING_TRANSITIONS:
			return ((InternalEList<?>) getIncomingTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatePackage.STATE_NODE__OUTGOING_TRANSITIONS:
			return getOutgoingTransitions();
		case StatePackage.STATE_NODE__INCOMING_TRANSITIONS:
			return getIncomingTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatePackage.STATE_NODE__OUTGOING_TRANSITIONS:
			getOutgoingTransitions().clear();
			getOutgoingTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case StatePackage.STATE_NODE__INCOMING_TRANSITIONS:
			getIncomingTransitions().clear();
			getIncomingTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StatePackage.STATE_NODE__OUTGOING_TRANSITIONS:
			getOutgoingTransitions().clear();
			return;
		case StatePackage.STATE_NODE__INCOMING_TRANSITIONS:
			getIncomingTransitions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StatePackage.STATE_NODE__OUTGOING_TRANSITIONS:
			return outgoingTransitions != null && !outgoingTransitions.isEmpty();
		case StatePackage.STATE_NODE__INCOMING_TRANSITIONS:
			return incomingTransitions != null && !incomingTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateNodeImpl
