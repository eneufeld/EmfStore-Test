/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.rationale.Assessment;
import org.eclipse.emf.emfstore.client.test.model.rationale.Criterion;
import org.eclipse.emf.emfstore.client.test.model.rationale.Proposal;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Assessment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.AssessmentImpl#getProposal <em>Proposal</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.AssessmentImpl#getCriterion <em>Criterion</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.AssessmentImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssessmentImpl extends UnicaseModelElementImpl implements Assessment {
	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected Criterion criterion;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Proposal getProposal() {
		if (eContainerFeatureID() != RationalePackage.ASSESSMENT__PROPOSAL)
			return null;
		return (Proposal) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Proposal basicGetProposal() {
		if (eContainerFeatureID() != RationalePackage.ASSESSMENT__PROPOSAL)
			return null;
		return (Proposal) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetProposal(Proposal newProposal, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProposal, RationalePackage.ASSESSMENT__PROPOSAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProposal(Proposal newProposal) {
		if (newProposal != eInternalContainer()
			|| (eContainerFeatureID() != RationalePackage.ASSESSMENT__PROPOSAL && newProposal != null)) {
			if (EcoreUtil.isAncestor(this, newProposal))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProposal != null)
				msgs = ((InternalEObject) newProposal).eInverseAdd(this, RationalePackage.PROPOSAL__ASSESSMENTS,
					Proposal.class, msgs);
			msgs = basicSetProposal(newProposal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ASSESSMENT__PROPOSAL, newProposal,
				newProposal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Criterion getCriterion() {
		if (criterion != null && criterion.eIsProxy()) {
			InternalEObject oldCriterion = (InternalEObject) criterion;
			criterion = (Criterion) eResolveProxy(oldCriterion);
			if (criterion != oldCriterion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RationalePackage.ASSESSMENT__CRITERION,
						oldCriterion, criterion));
			}
		}
		return criterion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Criterion basicGetCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCriterion(Criterion newCriterion, NotificationChain msgs) {
		Criterion oldCriterion = criterion;
		criterion = newCriterion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				RationalePackage.ASSESSMENT__CRITERION, oldCriterion, newCriterion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCriterion(Criterion newCriterion) {
		if (newCriterion != criterion) {
			NotificationChain msgs = null;
			if (criterion != null)
				msgs = ((InternalEObject) criterion).eInverseRemove(this, RationalePackage.CRITERION__ASSESSMENTS,
					Criterion.class, msgs);
			if (newCriterion != null)
				msgs = ((InternalEObject) newCriterion).eInverseAdd(this, RationalePackage.CRITERION__ASSESSMENTS,
					Criterion.class, msgs);
			msgs = basicSetCriterion(newCriterion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ASSESSMENT__CRITERION, newCriterion,
				newCriterion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ASSESSMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RationalePackage.ASSESSMENT__PROPOSAL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProposal((Proposal) otherEnd, msgs);
		case RationalePackage.ASSESSMENT__CRITERION:
			if (criterion != null)
				msgs = ((InternalEObject) criterion).eInverseRemove(this, RationalePackage.CRITERION__ASSESSMENTS,
					Criterion.class, msgs);
			return basicSetCriterion((Criterion) otherEnd, msgs);
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
		case RationalePackage.ASSESSMENT__PROPOSAL:
			return basicSetProposal(null, msgs);
		case RationalePackage.ASSESSMENT__CRITERION:
			return basicSetCriterion(null, msgs);
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
		case RationalePackage.ASSESSMENT__PROPOSAL:
			return eInternalContainer().eInverseRemove(this, RationalePackage.PROPOSAL__ASSESSMENTS, Proposal.class,
				msgs);
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
		case RationalePackage.ASSESSMENT__PROPOSAL:
			if (resolve)
				return getProposal();
			return basicGetProposal();
		case RationalePackage.ASSESSMENT__CRITERION:
			if (resolve)
				return getCriterion();
			return basicGetCriterion();
		case RationalePackage.ASSESSMENT__VALUE:
			return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RationalePackage.ASSESSMENT__PROPOSAL:
			setProposal((Proposal) newValue);
			return;
		case RationalePackage.ASSESSMENT__CRITERION:
			setCriterion((Criterion) newValue);
			return;
		case RationalePackage.ASSESSMENT__VALUE:
			setValue((Integer) newValue);
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
		case RationalePackage.ASSESSMENT__PROPOSAL:
			setProposal((Proposal) null);
			return;
		case RationalePackage.ASSESSMENT__CRITERION:
			setCriterion((Criterion) null);
			return;
		case RationalePackage.ASSESSMENT__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case RationalePackage.ASSESSMENT__PROPOSAL:
			return basicGetProposal() != null;
		case RationalePackage.ASSESSMENT__CRITERION:
			return criterion != null;
		case RationalePackage.ASSESSMENT__VALUE:
			return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // AssessmentImpl
