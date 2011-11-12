/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.change.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.change.ChangePackage;
import org.eclipse.emf.emfstore.client.test.model.change.MergingSolution;
import org.eclipse.emf.emfstore.client.test.model.rationale.impl.SolutionImpl;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Merging Solution</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.change.impl.MergingSolutionImpl#getAppliedOperations <em>
 * Applied Operations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MergingSolutionImpl extends SolutionImpl implements MergingSolution {
	/**
	 * The cached value of the '{@link #getAppliedOperations() <em>Applied Operations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAppliedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractOperation> appliedOperations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MergingSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangePackage.Literals.MERGING_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<AbstractOperation> getAppliedOperations() {
		if (appliedOperations == null) {
			appliedOperations = new EObjectContainmentEList.Resolving<AbstractOperation>(AbstractOperation.class, this,
				ChangePackage.MERGING_SOLUTION__APPLIED_OPERATIONS);
		}
		return appliedOperations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChangePackage.MERGING_SOLUTION__APPLIED_OPERATIONS:
			return ((InternalEList<?>) getAppliedOperations()).basicRemove(otherEnd, msgs);
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
		case ChangePackage.MERGING_SOLUTION__APPLIED_OPERATIONS:
			return getAppliedOperations();
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
		case ChangePackage.MERGING_SOLUTION__APPLIED_OPERATIONS:
			getAppliedOperations().clear();
			getAppliedOperations().addAll((Collection<? extends AbstractOperation>) newValue);
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
		case ChangePackage.MERGING_SOLUTION__APPLIED_OPERATIONS:
			getAppliedOperations().clear();
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
		case ChangePackage.MERGING_SOLUTION__APPLIED_OPERATIONS:
			return appliedOperations != null && !appliedOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // MergingSolutionImpl
