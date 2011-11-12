/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.rationale.impl.CriterionImpl;
import org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.Scenario;
import org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.requirement.UserTask;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Non Functional Requirement</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.NonFunctionalRequirementImpl#getRestrictedScenarios
 * <em>Restricted Scenarios</em>}</li>
 * <li>
 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.NonFunctionalRequirementImpl#getRestrictedUseCases
 * <em>Restricted Use Cases</em>}</li>
 * <li>
 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.NonFunctionalRequirementImpl#getSystemFunctions
 * <em>System Functions</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.NonFunctionalRequirementImpl#getUserTasks <em>
 * User Tasks</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class NonFunctionalRequirementImpl extends CriterionImpl implements NonFunctionalRequirement {
	/**
	 * The cached value of the '{@link #getRestrictedScenarios() <em>Restricted Scenarios</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRestrictedScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> restrictedScenarios;

	/**
	 * The cached value of the '{@link #getRestrictedUseCases() <em>Restricted Use Cases</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRestrictedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> restrictedUseCases;

	/**
	 * The cached value of the '{@link #getSystemFunctions() <em>System Functions</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> systemFunctions;

	/**
	 * The cached value of the '{@link #getUserTasks() <em>User Tasks</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUserTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<UserTask> userTasks;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NonFunctionalRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.NON_FUNCTIONAL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Scenario> getRestrictedScenarios() {
		if (restrictedScenarios == null) {
			restrictedScenarios = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
				RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS,
				RequirementPackage.SCENARIO__NON_FUNCTIONAL_REQUIREMENTS);
		}
		return restrictedScenarios;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UseCase> getRestrictedUseCases() {
		if (restrictedUseCases == null) {
			restrictedUseCases = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this,
				RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES,
				RequirementPackage.USE_CASE__NON_FUNCTIONAL_REQUIREMENTS);
		}
		return restrictedUseCases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SystemFunction> getSystemFunctions() {
		if (systemFunctions == null) {
			systemFunctions = new EObjectWithInverseResolvingEList<SystemFunction>(SystemFunction.class, this,
				RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS,
				RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT);
		}
		return systemFunctions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UserTask> getUserTasks() {
		if (userTasks == null) {
			userTasks = new EObjectWithInverseResolvingEList.ManyInverse<UserTask>(UserTask.class, this,
				RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__USER_TASKS,
				RequirementPackage.USER_TASK__NON_FUNCTIONAL_REQUIREMENTS);
		}
		return userTasks;
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
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRestrictedScenarios()).basicAdd(otherEnd,
				msgs);
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRestrictedUseCases()).basicAdd(otherEnd,
				msgs);
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSystemFunctions()).basicAdd(otherEnd, msgs);
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__USER_TASKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUserTasks()).basicAdd(otherEnd, msgs);
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
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS:
			return ((InternalEList<?>) getRestrictedScenarios()).basicRemove(otherEnd, msgs);
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES:
			return ((InternalEList<?>) getRestrictedUseCases()).basicRemove(otherEnd, msgs);
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS:
			return ((InternalEList<?>) getSystemFunctions()).basicRemove(otherEnd, msgs);
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__USER_TASKS:
			return ((InternalEList<?>) getUserTasks()).basicRemove(otherEnd, msgs);
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
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS:
			return getRestrictedScenarios();
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES:
			return getRestrictedUseCases();
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS:
			return getSystemFunctions();
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__USER_TASKS:
			return getUserTasks();
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
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS:
			getRestrictedScenarios().clear();
			getRestrictedScenarios().addAll((Collection<? extends Scenario>) newValue);
			return;
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES:
			getRestrictedUseCases().clear();
			getRestrictedUseCases().addAll((Collection<? extends UseCase>) newValue);
			return;
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS:
			getSystemFunctions().clear();
			getSystemFunctions().addAll((Collection<? extends SystemFunction>) newValue);
			return;
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__USER_TASKS:
			getUserTasks().clear();
			getUserTasks().addAll((Collection<? extends UserTask>) newValue);
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
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS:
			getRestrictedScenarios().clear();
			return;
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES:
			getRestrictedUseCases().clear();
			return;
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS:
			getSystemFunctions().clear();
			return;
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__USER_TASKS:
			getUserTasks().clear();
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
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_SCENARIOS:
			return restrictedScenarios != null && !restrictedScenarios.isEmpty();
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES:
			return restrictedUseCases != null && !restrictedUseCases.isEmpty();
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS:
			return systemFunctions != null && !systemFunctions.isEmpty();
		case RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__USER_TASKS:
			return userTasks != null && !userTasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // NonFunctionalRequirementImpl
