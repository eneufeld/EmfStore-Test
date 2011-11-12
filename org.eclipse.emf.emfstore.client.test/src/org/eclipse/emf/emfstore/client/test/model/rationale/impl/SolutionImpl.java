/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;
import org.eclipse.emf.emfstore.client.test.model.rationale.Proposal;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;
import org.eclipse.emf.emfstore.client.test.model.rationale.Solution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Solution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.SolutionImpl#getUnderlyingProposals <em>
 * Underlying Proposals</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.SolutionImpl#getIssue <em>Issue</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SolutionImpl extends UnicaseModelElementImpl implements Solution {
	/**
	 * The cached value of the '{@link #getUnderlyingProposals() <em>Underlying Proposals</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnderlyingProposals()
	 * @generated
	 * @ordered
	 */
	protected EList<Proposal> underlyingProposals;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Proposal> getUnderlyingProposals() {
		if (underlyingProposals == null) {
			underlyingProposals = new EObjectResolvingEList<Proposal>(Proposal.class, this,
				RationalePackage.SOLUTION__UNDERLYING_PROPOSALS);
		}
		return underlyingProposals;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Issue getIssue() {
		if (eContainerFeatureID() != RationalePackage.SOLUTION__ISSUE)
			return null;
		return (Issue) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Issue basicGetIssue() {
		if (eContainerFeatureID() != RationalePackage.SOLUTION__ISSUE)
			return null;
		return (Issue) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIssue(Issue newIssue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newIssue, RationalePackage.SOLUTION__ISSUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIssue(Issue newIssue) {
		if (newIssue != eInternalContainer()
			|| (eContainerFeatureID() != RationalePackage.SOLUTION__ISSUE && newIssue != null)) {
			if (EcoreUtil.isAncestor(this, newIssue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIssue != null)
				msgs = ((InternalEObject) newIssue).eInverseAdd(this, RationalePackage.ISSUE__SOLUTION, Issue.class,
					msgs);
			msgs = basicSetIssue(newIssue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.SOLUTION__ISSUE, newIssue, newIssue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RationalePackage.SOLUTION__ISSUE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetIssue((Issue) otherEnd, msgs);
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
		case RationalePackage.SOLUTION__ISSUE:
			return basicSetIssue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RationalePackage.SOLUTION__ISSUE:
			return eInternalContainer().eInverseRemove(this, RationalePackage.ISSUE__SOLUTION, Issue.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RationalePackage.SOLUTION__UNDERLYING_PROPOSALS:
			return getUnderlyingProposals();
		case RationalePackage.SOLUTION__ISSUE:
			if (resolve)
				return getIssue();
			return basicGetIssue();
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
		case RationalePackage.SOLUTION__UNDERLYING_PROPOSALS:
			getUnderlyingProposals().clear();
			getUnderlyingProposals().addAll((Collection<? extends Proposal>) newValue);
			return;
		case RationalePackage.SOLUTION__ISSUE:
			setIssue((Issue) newValue);
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
		case RationalePackage.SOLUTION__UNDERLYING_PROPOSALS:
			getUnderlyingProposals().clear();
			return;
		case RationalePackage.SOLUTION__ISSUE:
			setIssue((Issue) null);
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
		case RationalePackage.SOLUTION__UNDERLYING_PROPOSALS:
			return underlyingProposals != null && !underlyingProposals.isEmpty();
		case RationalePackage.SOLUTION__ISSUE:
			return basicGetIssue() != null;
		}
		return super.eIsSet(featureID);
	}

} // SolutionImpl
