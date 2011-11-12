/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.requirement.UserTask;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Actor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorImpl#getInitiatedUserTask <em>Initiated
 * User Task</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorImpl#getParticipatedUserTasks <em>
 * Participated User Tasks</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorImpl#getInitiatedUseCases <em>Initiated
 * Use Cases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorImpl#getParticipatedUseCases <em>
 * Participated Use Cases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ActorImpl extends UnicaseModelElementImpl implements Actor {
	/**
	 * The cached value of the '{@link #getInitiatedUserTask() <em>Initiated User Task</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInitiatedUserTask()
	 * @generated
	 * @ordered
	 */
	protected UserTask initiatedUserTask;

	/**
	 * The cached value of the '{@link #getParticipatedUserTasks() <em>Participated User Tasks</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParticipatedUserTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<UserTask> participatedUserTasks;

	/**
	 * The cached value of the '{@link #getInitiatedUseCases() <em>Initiated Use Cases</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInitiatedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> initiatedUseCases;

	/**
	 * The cached value of the '{@link #getParticipatedUseCases() <em>Participated Use Cases</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParticipatedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> participatedUseCases;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorInstance> instances;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UserTask getInitiatedUserTask() {
		if (initiatedUserTask != null && initiatedUserTask.eIsProxy()) {
			InternalEObject oldInitiatedUserTask = (InternalEObject) initiatedUserTask;
			initiatedUserTask = (UserTask) eResolveProxy(oldInitiatedUserTask);
			if (initiatedUserTask != oldInitiatedUserTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						RequirementPackage.ACTOR__INITIATED_USER_TASK, oldInitiatedUserTask, initiatedUserTask));
			}
		}
		return initiatedUserTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UserTask basicGetInitiatedUserTask() {
		return initiatedUserTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInitiatedUserTask(UserTask newInitiatedUserTask, NotificationChain msgs) {
		UserTask oldInitiatedUserTask = initiatedUserTask;
		initiatedUserTask = newInitiatedUserTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				RequirementPackage.ACTOR__INITIATED_USER_TASK, oldInitiatedUserTask, newInitiatedUserTask);
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
	public void setInitiatedUserTask(UserTask newInitiatedUserTask) {
		if (newInitiatedUserTask != initiatedUserTask) {
			NotificationChain msgs = null;
			if (initiatedUserTask != null)
				msgs = ((InternalEObject) initiatedUserTask).eInverseRemove(this,
					RequirementPackage.USER_TASK__INITIATING_ACTOR, UserTask.class, msgs);
			if (newInitiatedUserTask != null)
				msgs = ((InternalEObject) newInitiatedUserTask).eInverseAdd(this,
					RequirementPackage.USER_TASK__INITIATING_ACTOR, UserTask.class, msgs);
			msgs = basicSetInitiatedUserTask(newInitiatedUserTask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.ACTOR__INITIATED_USER_TASK,
				newInitiatedUserTask, newInitiatedUserTask));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UserTask> getParticipatedUserTasks() {
		if (participatedUserTasks == null) {
			participatedUserTasks = new EObjectWithInverseResolvingEList.ManyInverse<UserTask>(UserTask.class, this,
				RequirementPackage.ACTOR__PARTICIPATED_USER_TASKS, RequirementPackage.USER_TASK__PARTICIPATING_ACTORS);
		}
		return participatedUserTasks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UseCase> getInitiatedUseCases() {
		if (initiatedUseCases == null) {
			initiatedUseCases = new EObjectWithInverseResolvingEList<UseCase>(UseCase.class, this,
				RequirementPackage.ACTOR__INITIATED_USE_CASES, RequirementPackage.USE_CASE__INITIATING_ACTOR);
		}
		return initiatedUseCases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UseCase> getParticipatedUseCases() {
		if (participatedUseCases == null) {
			participatedUseCases = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this,
				RequirementPackage.ACTOR__PARTICIPATED_USE_CASES, RequirementPackage.USE_CASE__PARTICIPATING_ACTORS);
		}
		return participatedUseCases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ActorInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<ActorInstance>(ActorInstance.class, this,
				RequirementPackage.ACTOR__INSTANCES, RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR);
		}
		return instances;
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
		case RequirementPackage.ACTOR__INITIATED_USER_TASK:
			if (initiatedUserTask != null)
				msgs = ((InternalEObject) initiatedUserTask).eInverseRemove(this,
					RequirementPackage.USER_TASK__INITIATING_ACTOR, UserTask.class, msgs);
			return basicSetInitiatedUserTask((UserTask) otherEnd, msgs);
		case RequirementPackage.ACTOR__PARTICIPATED_USER_TASKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipatedUserTasks()).basicAdd(otherEnd,
				msgs);
		case RequirementPackage.ACTOR__INITIATED_USE_CASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInitiatedUseCases())
				.basicAdd(otherEnd, msgs);
		case RequirementPackage.ACTOR__PARTICIPATED_USE_CASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipatedUseCases()).basicAdd(otherEnd,
				msgs);
		case RequirementPackage.ACTOR__INSTANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInstances()).basicAdd(otherEnd, msgs);
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
		case RequirementPackage.ACTOR__INITIATED_USER_TASK:
			return basicSetInitiatedUserTask(null, msgs);
		case RequirementPackage.ACTOR__PARTICIPATED_USER_TASKS:
			return ((InternalEList<?>) getParticipatedUserTasks()).basicRemove(otherEnd, msgs);
		case RequirementPackage.ACTOR__INITIATED_USE_CASES:
			return ((InternalEList<?>) getInitiatedUseCases()).basicRemove(otherEnd, msgs);
		case RequirementPackage.ACTOR__PARTICIPATED_USE_CASES:
			return ((InternalEList<?>) getParticipatedUseCases()).basicRemove(otherEnd, msgs);
		case RequirementPackage.ACTOR__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd, msgs);
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
		case RequirementPackage.ACTOR__INITIATED_USER_TASK:
			if (resolve)
				return getInitiatedUserTask();
			return basicGetInitiatedUserTask();
		case RequirementPackage.ACTOR__PARTICIPATED_USER_TASKS:
			return getParticipatedUserTasks();
		case RequirementPackage.ACTOR__INITIATED_USE_CASES:
			return getInitiatedUseCases();
		case RequirementPackage.ACTOR__PARTICIPATED_USE_CASES:
			return getParticipatedUseCases();
		case RequirementPackage.ACTOR__INSTANCES:
			return getInstances();
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
		case RequirementPackage.ACTOR__INITIATED_USER_TASK:
			setInitiatedUserTask((UserTask) newValue);
			return;
		case RequirementPackage.ACTOR__PARTICIPATED_USER_TASKS:
			getParticipatedUserTasks().clear();
			getParticipatedUserTasks().addAll((Collection<? extends UserTask>) newValue);
			return;
		case RequirementPackage.ACTOR__INITIATED_USE_CASES:
			getInitiatedUseCases().clear();
			getInitiatedUseCases().addAll((Collection<? extends UseCase>) newValue);
			return;
		case RequirementPackage.ACTOR__PARTICIPATED_USE_CASES:
			getParticipatedUseCases().clear();
			getParticipatedUseCases().addAll((Collection<? extends UseCase>) newValue);
			return;
		case RequirementPackage.ACTOR__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends ActorInstance>) newValue);
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
		case RequirementPackage.ACTOR__INITIATED_USER_TASK:
			setInitiatedUserTask((UserTask) null);
			return;
		case RequirementPackage.ACTOR__PARTICIPATED_USER_TASKS:
			getParticipatedUserTasks().clear();
			return;
		case RequirementPackage.ACTOR__INITIATED_USE_CASES:
			getInitiatedUseCases().clear();
			return;
		case RequirementPackage.ACTOR__PARTICIPATED_USE_CASES:
			getParticipatedUseCases().clear();
			return;
		case RequirementPackage.ACTOR__INSTANCES:
			getInstances().clear();
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
		case RequirementPackage.ACTOR__INITIATED_USER_TASK:
			return initiatedUserTask != null;
		case RequirementPackage.ACTOR__PARTICIPATED_USER_TASKS:
			return participatedUserTasks != null && !participatedUserTasks.isEmpty();
		case RequirementPackage.ACTOR__INITIATED_USE_CASES:
			return initiatedUseCases != null && !initiatedUseCases.isEmpty();
		case RequirementPackage.ACTOR__PARTICIPATED_USE_CASES:
			return participatedUseCases != null && !participatedUseCases.isEmpty();
		case RequirementPackage.ACTOR__INSTANCES:
			return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ActorImpl
