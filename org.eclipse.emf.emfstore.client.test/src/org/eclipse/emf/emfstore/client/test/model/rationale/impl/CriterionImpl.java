/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.rationale.Assessment;
import org.eclipse.emf.emfstore.client.test.model.rationale.Criterion;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Criterion</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.CriterionImpl#getAssessments <em>Assessments
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CriterionImpl extends UnicaseModelElementImpl implements Criterion {
	/**
	 * The cached value of the '{@link #getAssessments() <em>Assessments</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	protected CriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.CRITERION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Assessment> getAssessments() {
		if (assessments == null) {
			assessments = new EObjectWithInverseResolvingEList<Assessment>(Assessment.class, this,
				RationalePackage.CRITERION__ASSESSMENTS, RationalePackage.ASSESSMENT__CRITERION);
		}
		return assessments;
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
		case RationalePackage.CRITERION__ASSESSMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssessments()).basicAdd(otherEnd, msgs);
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
		case RationalePackage.CRITERION__ASSESSMENTS:
			return ((InternalEList<?>) getAssessments()).basicRemove(otherEnd, msgs);
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
		case RationalePackage.CRITERION__ASSESSMENTS:
			return getAssessments();
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
		case RationalePackage.CRITERION__ASSESSMENTS:
			getAssessments().clear();
			getAssessments().addAll((Collection<? extends Assessment>) newValue);
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
		case RationalePackage.CRITERION__ASSESSMENTS:
			getAssessments().clear();
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
		case RationalePackage.CRITERION__ASSESSMENTS:
			return assessments != null && !assessments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CriterionImpl
