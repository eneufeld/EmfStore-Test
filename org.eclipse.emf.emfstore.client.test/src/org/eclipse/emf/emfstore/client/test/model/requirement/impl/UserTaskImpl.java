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
import org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.requirement.UserTask;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>User Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UserTaskImpl#getInitiatingActor <em>Initiating
 * Actor</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UserTaskImpl#getParticipatingActors <em>
 * Participating Actors</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UserTaskImpl#getRealizingUseCases <em>
 * Realizing Use Cases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UserTaskImpl#getNonFunctionalRequirements <em>
 * Non Functional Requirements</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class UserTaskImpl extends UnicaseModelElementImpl implements UserTask {
	/**
	 * The cached value of the '{@link #getInitiatingActor() <em>Initiating Actor</em>}' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getInitiatingActor()
	 * @generated
	 * @ordered
	 */
	protected Actor initiatingActor;

	/**
	 * The cached value of the '{@link #getParticipatingActors() <em>Participating Actors</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParticipatingActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> participatingActors;

	/**
	 * The cached value of the '{@link #getRealizingUseCases() <em>Realizing Use Cases</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRealizingUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> realizingUseCases;

	/**
	 * The cached value of the '{@link #getNonFunctionalRequirements() <em>Non Functional Requirements</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNonFunctionalRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<NonFunctionalRequirement> nonFunctionalRequirements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UserTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.USER_TASK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Actor getInitiatingActor() {
		if (initiatingActor != null && initiatingActor.eIsProxy()) {
			InternalEObject oldInitiatingActor = (InternalEObject) initiatingActor;
			initiatingActor = (Actor) eResolveProxy(oldInitiatingActor);
			if (initiatingActor != oldInitiatingActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						RequirementPackage.USER_TASK__INITIATING_ACTOR, oldInitiatingActor, initiatingActor));
			}
		}
		return initiatingActor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Actor basicGetInitiatingActor() {
		return initiatingActor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInitiatingActor(Actor newInitiatingActor, NotificationChain msgs) {
		Actor oldInitiatingActor = initiatingActor;
		initiatingActor = newInitiatingActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				RequirementPackage.USER_TASK__INITIATING_ACTOR, oldInitiatingActor, newInitiatingActor);
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
	public void setInitiatingActor(Actor newInitiatingActor) {
		if (newInitiatingActor != initiatingActor) {
			NotificationChain msgs = null;
			if (initiatingActor != null)
				msgs = ((InternalEObject) initiatingActor).eInverseRemove(this,
					RequirementPackage.ACTOR__INITIATED_USER_TASK, Actor.class, msgs);
			if (newInitiatingActor != null)
				msgs = ((InternalEObject) newInitiatingActor).eInverseAdd(this,
					RequirementPackage.ACTOR__INITIATED_USER_TASK, Actor.class, msgs);
			msgs = basicSetInitiatingActor(newInitiatingActor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.USER_TASK__INITIATING_ACTOR,
				newInitiatingActor, newInitiatingActor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Actor> getParticipatingActors() {
		if (participatingActors == null) {
			participatingActors = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this,
				RequirementPackage.USER_TASK__PARTICIPATING_ACTORS, RequirementPackage.ACTOR__PARTICIPATED_USER_TASKS);
		}
		return participatingActors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UseCase> getRealizingUseCases() {
		if (realizingUseCases == null) {
			realizingUseCases = new EObjectWithInverseResolvingEList<UseCase>(UseCase.class, this,
				RequirementPackage.USER_TASK__REALIZING_USE_CASES, RequirementPackage.USE_CASE__REALIZED_USER_TASK);
		}
		return realizingUseCases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<NonFunctionalRequirement> getNonFunctionalRequirements() {
		if (nonFunctionalRequirements == null) {
			nonFunctionalRequirements = new EObjectWithInverseResolvingEList.ManyInverse<NonFunctionalRequirement>(
				NonFunctionalRequirement.class, this, RequirementPackage.USER_TASK__NON_FUNCTIONAL_REQUIREMENTS,
				RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__USER_TASKS);
		}
		return nonFunctionalRequirements;
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
		case RequirementPackage.USER_TASK__INITIATING_ACTOR:
			if (initiatingActor != null)
				msgs = ((InternalEObject) initiatingActor).eInverseRemove(this,
					RequirementPackage.ACTOR__INITIATED_USER_TASK, Actor.class, msgs);
			return basicSetInitiatingActor((Actor) otherEnd, msgs);
		case RequirementPackage.USER_TASK__PARTICIPATING_ACTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipatingActors()).basicAdd(otherEnd,
				msgs);
		case RequirementPackage.USER_TASK__REALIZING_USE_CASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRealizingUseCases())
				.basicAdd(otherEnd, msgs);
		case RequirementPackage.USER_TASK__NON_FUNCTIONAL_REQUIREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNonFunctionalRequirements()).basicAdd(
				otherEnd, msgs);
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
		case RequirementPackage.USER_TASK__INITIATING_ACTOR:
			return basicSetInitiatingActor(null, msgs);
		case RequirementPackage.USER_TASK__PARTICIPATING_ACTORS:
			return ((InternalEList<?>) getParticipatingActors()).basicRemove(otherEnd, msgs);
		case RequirementPackage.USER_TASK__REALIZING_USE_CASES:
			return ((InternalEList<?>) getRealizingUseCases()).basicRemove(otherEnd, msgs);
		case RequirementPackage.USER_TASK__NON_FUNCTIONAL_REQUIREMENTS:
			return ((InternalEList<?>) getNonFunctionalRequirements()).basicRemove(otherEnd, msgs);
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
		case RequirementPackage.USER_TASK__INITIATING_ACTOR:
			if (resolve)
				return getInitiatingActor();
			return basicGetInitiatingActor();
		case RequirementPackage.USER_TASK__PARTICIPATING_ACTORS:
			return getParticipatingActors();
		case RequirementPackage.USER_TASK__REALIZING_USE_CASES:
			return getRealizingUseCases();
		case RequirementPackage.USER_TASK__NON_FUNCTIONAL_REQUIREMENTS:
			return getNonFunctionalRequirements();
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
		case RequirementPackage.USER_TASK__INITIATING_ACTOR:
			setInitiatingActor((Actor) newValue);
			return;
		case RequirementPackage.USER_TASK__PARTICIPATING_ACTORS:
			getParticipatingActors().clear();
			getParticipatingActors().addAll((Collection<? extends Actor>) newValue);
			return;
		case RequirementPackage.USER_TASK__REALIZING_USE_CASES:
			getRealizingUseCases().clear();
			getRealizingUseCases().addAll((Collection<? extends UseCase>) newValue);
			return;
		case RequirementPackage.USER_TASK__NON_FUNCTIONAL_REQUIREMENTS:
			getNonFunctionalRequirements().clear();
			getNonFunctionalRequirements().addAll((Collection<? extends NonFunctionalRequirement>) newValue);
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
		case RequirementPackage.USER_TASK__INITIATING_ACTOR:
			setInitiatingActor((Actor) null);
			return;
		case RequirementPackage.USER_TASK__PARTICIPATING_ACTORS:
			getParticipatingActors().clear();
			return;
		case RequirementPackage.USER_TASK__REALIZING_USE_CASES:
			getRealizingUseCases().clear();
			return;
		case RequirementPackage.USER_TASK__NON_FUNCTIONAL_REQUIREMENTS:
			getNonFunctionalRequirements().clear();
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
		case RequirementPackage.USER_TASK__INITIATING_ACTOR:
			return initiatingActor != null;
		case RequirementPackage.USER_TASK__PARTICIPATING_ACTORS:
			return participatingActors != null && !participatingActors.isEmpty();
		case RequirementPackage.USER_TASK__REALIZING_USE_CASES:
			return realizingUseCases != null && !realizingUseCases.isEmpty();
		case RequirementPackage.USER_TASK__NON_FUNCTIONAL_REQUIREMENTS:
			return nonFunctionalRequirements != null && !nonFunctionalRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // UserTaskImpl
