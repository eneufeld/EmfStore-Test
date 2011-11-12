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
import org.eclipse.emf.emfstore.client.test.model.requirement.Scenario;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Actor Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorInstanceImpl#getInitiatedScenarios <em>
 * Initiated Scenarios</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorInstanceImpl#getParticipatedScenarios
 * <em>Participated Scenarios</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.ActorInstanceImpl#getInstantiatedActor <em>
 * Instantiated Actor</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ActorInstanceImpl extends UnicaseModelElementImpl implements ActorInstance {
	/**
	 * The cached value of the '{@link #getInitiatedScenarios() <em>Initiated Scenarios</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInitiatedScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> initiatedScenarios;

	/**
	 * The cached value of the '{@link #getParticipatedScenarios() <em>Participated Scenarios</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParticipatedScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> participatedScenarios;

	/**
	 * The cached value of the '{@link #getInstantiatedActor() <em>Instantiated Actor</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInstantiatedActor()
	 * @generated
	 * @ordered
	 */
	protected Actor instantiatedActor;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.ACTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Scenario> getInitiatedScenarios() {
		if (initiatedScenarios == null) {
			initiatedScenarios = new EObjectWithInverseResolvingEList<Scenario>(Scenario.class, this,
				RequirementPackage.ACTOR_INSTANCE__INITIATED_SCENARIOS,
				RequirementPackage.SCENARIO__INITIATING_ACTOR_INSTANCE);
		}
		return initiatedScenarios;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Scenario> getParticipatedScenarios() {
		if (participatedScenarios == null) {
			participatedScenarios = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
				RequirementPackage.ACTOR_INSTANCE__PARTICIPATED_SCENARIOS,
				RequirementPackage.SCENARIO__PARTICIPATING_ACTOR_INSTANCES);
		}
		return participatedScenarios;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Actor getInstantiatedActor() {
		if (instantiatedActor != null && instantiatedActor.eIsProxy()) {
			InternalEObject oldInstantiatedActor = (InternalEObject) instantiatedActor;
			instantiatedActor = (Actor) eResolveProxy(oldInstantiatedActor);
			if (instantiatedActor != oldInstantiatedActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR, oldInstantiatedActor, instantiatedActor));
			}
		}
		return instantiatedActor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Actor basicGetInstantiatedActor() {
		return instantiatedActor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInstantiatedActor(Actor newInstantiatedActor, NotificationChain msgs) {
		Actor oldInstantiatedActor = instantiatedActor;
		instantiatedActor = newInstantiatedActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR, oldInstantiatedActor, newInstantiatedActor);
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
	public void setInstantiatedActor(Actor newInstantiatedActor) {
		if (newInstantiatedActor != instantiatedActor) {
			NotificationChain msgs = null;
			if (instantiatedActor != null)
				msgs = ((InternalEObject) instantiatedActor).eInverseRemove(this, RequirementPackage.ACTOR__INSTANCES,
					Actor.class, msgs);
			if (newInstantiatedActor != null)
				msgs = ((InternalEObject) newInstantiatedActor).eInverseAdd(this, RequirementPackage.ACTOR__INSTANCES,
					Actor.class, msgs);
			msgs = basicSetInstantiatedActor(newInstantiatedActor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR, newInstantiatedActor, newInstantiatedActor));
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
		case RequirementPackage.ACTOR_INSTANCE__INITIATED_SCENARIOS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInitiatedScenarios()).basicAdd(otherEnd,
				msgs);
		case RequirementPackage.ACTOR_INSTANCE__PARTICIPATED_SCENARIOS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipatedScenarios()).basicAdd(otherEnd,
				msgs);
		case RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR:
			if (instantiatedActor != null)
				msgs = ((InternalEObject) instantiatedActor).eInverseRemove(this, RequirementPackage.ACTOR__INSTANCES,
					Actor.class, msgs);
			return basicSetInstantiatedActor((Actor) otherEnd, msgs);
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
		case RequirementPackage.ACTOR_INSTANCE__INITIATED_SCENARIOS:
			return ((InternalEList<?>) getInitiatedScenarios()).basicRemove(otherEnd, msgs);
		case RequirementPackage.ACTOR_INSTANCE__PARTICIPATED_SCENARIOS:
			return ((InternalEList<?>) getParticipatedScenarios()).basicRemove(otherEnd, msgs);
		case RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR:
			return basicSetInstantiatedActor(null, msgs);
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
		case RequirementPackage.ACTOR_INSTANCE__INITIATED_SCENARIOS:
			return getInitiatedScenarios();
		case RequirementPackage.ACTOR_INSTANCE__PARTICIPATED_SCENARIOS:
			return getParticipatedScenarios();
		case RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR:
			if (resolve)
				return getInstantiatedActor();
			return basicGetInstantiatedActor();
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
		case RequirementPackage.ACTOR_INSTANCE__INITIATED_SCENARIOS:
			getInitiatedScenarios().clear();
			getInitiatedScenarios().addAll((Collection<? extends Scenario>) newValue);
			return;
		case RequirementPackage.ACTOR_INSTANCE__PARTICIPATED_SCENARIOS:
			getParticipatedScenarios().clear();
			getParticipatedScenarios().addAll((Collection<? extends Scenario>) newValue);
			return;
		case RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR:
			setInstantiatedActor((Actor) newValue);
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
		case RequirementPackage.ACTOR_INSTANCE__INITIATED_SCENARIOS:
			getInitiatedScenarios().clear();
			return;
		case RequirementPackage.ACTOR_INSTANCE__PARTICIPATED_SCENARIOS:
			getParticipatedScenarios().clear();
			return;
		case RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR:
			setInstantiatedActor((Actor) null);
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
		case RequirementPackage.ACTOR_INSTANCE__INITIATED_SCENARIOS:
			return initiatedScenarios != null && !initiatedScenarios.isEmpty();
		case RequirementPackage.ACTOR_INSTANCE__PARTICIPATED_SCENARIOS:
			return participatedScenarios != null && !participatedScenarios.isEmpty();
		case RequirementPackage.ACTOR_INSTANCE__INSTANTIATED_ACTOR:
			return instantiatedActor != null;
		}
		return super.eIsSet(featureID);
	}

} // ActorInstanceImpl
