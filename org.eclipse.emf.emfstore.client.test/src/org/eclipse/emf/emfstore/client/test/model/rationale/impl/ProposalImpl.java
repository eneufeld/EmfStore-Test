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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.rationale.Assessment;
import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;
import org.eclipse.emf.emfstore.client.test.model.rationale.Proposal;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Proposal</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.ProposalImpl#getAssessments <em>Assessments
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.ProposalImpl#getIssue <em>Issue</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProposalImpl extends UnicaseModelElementImpl implements Proposal {
	/**
	 * The cached value of the '{@link #getAssessments() <em>Assessments</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAssessments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assessment> assessments;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Assessment> getAssessments() {
		if (assessments == null) {
			assessments = new EObjectContainmentWithInverseEList.Resolving<Assessment>(Assessment.class, this,
				RationalePackage.PROPOSAL__ASSESSMENTS, RationalePackage.ASSESSMENT__PROPOSAL);
		}
		return assessments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Issue getIssue() {
		if (eContainerFeatureID() != RationalePackage.PROPOSAL__ISSUE)
			return null;
		return (Issue) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Issue basicGetIssue() {
		if (eContainerFeatureID() != RationalePackage.PROPOSAL__ISSUE)
			return null;
		return (Issue) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIssue(Issue newIssue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newIssue, RationalePackage.PROPOSAL__ISSUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIssue(Issue newIssue) {
		if (newIssue != eInternalContainer()
			|| (eContainerFeatureID() != RationalePackage.PROPOSAL__ISSUE && newIssue != null)) {
			if (EcoreUtil.isAncestor(this, newIssue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIssue != null)
				msgs = ((InternalEObject) newIssue).eInverseAdd(this, RationalePackage.ISSUE__PROPOSALS, Issue.class,
					msgs);
			msgs = basicSetIssue(newIssue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.PROPOSAL__ISSUE, newIssue, newIssue));
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
		case RationalePackage.PROPOSAL__ASSESSMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssessments()).basicAdd(otherEnd, msgs);
		case RationalePackage.PROPOSAL__ISSUE:
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
		case RationalePackage.PROPOSAL__ASSESSMENTS:
			return ((InternalEList<?>) getAssessments()).basicRemove(otherEnd, msgs);
		case RationalePackage.PROPOSAL__ISSUE:
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
		case RationalePackage.PROPOSAL__ISSUE:
			return eInternalContainer().eInverseRemove(this, RationalePackage.ISSUE__PROPOSALS, Issue.class, msgs);
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
		case RationalePackage.PROPOSAL__ASSESSMENTS:
			return getAssessments();
		case RationalePackage.PROPOSAL__ISSUE:
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
		case RationalePackage.PROPOSAL__ASSESSMENTS:
			getAssessments().clear();
			getAssessments().addAll((Collection<? extends Assessment>) newValue);
			return;
		case RationalePackage.PROPOSAL__ISSUE:
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
		case RationalePackage.PROPOSAL__ASSESSMENTS:
			getAssessments().clear();
			return;
		case RationalePackage.PROPOSAL__ISSUE:
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
		case RationalePackage.PROPOSAL__ASSESSMENTS:
			return assessments != null && !assessments.isEmpty();
		case RationalePackage.PROPOSAL__ISSUE:
			return basicGetIssue() != null;
		}
		return super.eIsSet(featureID);
	}

} // ProposalImpl
