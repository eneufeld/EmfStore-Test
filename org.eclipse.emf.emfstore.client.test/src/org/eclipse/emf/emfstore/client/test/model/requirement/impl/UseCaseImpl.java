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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement;
import org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.Scenario;
import org.eclipse.emf.emfstore.client.test.model.requirement.Step;
import org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.requirement.UserTask;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Use Case</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getInitiatingActor <em>Initiating
 * Actor</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getParticipatingActors <em>
 * Participating Actors</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getRealizedUserTask <em>Realized
 * User Task</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getPrecondition <em>Precondition
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getUseCaseSteps <em>Use Case Steps
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getPostcondition <em>Postcondition
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getRules <em>Rules</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getException <em>Exception</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getScenarios <em>Scenarios</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getFunctionalRequirements <em>
 * Functional Requirements</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getNonFunctionalRequirements <em>
 * Non Functional Requirements</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getIdentifiedClasses <em>
 * Identified Classes</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getIncludedUseCases <em>Included
 * Use Cases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getExtendedUseCases <em>Extended
 * Use Cases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.UseCaseImpl#getSystemFunctions <em>System
 * Functions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class UseCaseImpl extends UnicaseModelElementImpl implements UseCase {
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
	 * The cached value of the '{@link #getRealizedUserTask() <em>Realized User Task</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRealizedUserTask()
	 * @generated
	 * @ordered
	 */
	protected UserTask realizedUserTask;

	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUseCaseSteps() <em>Use Case Steps</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUseCaseSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> useCaseSteps;

	/**
	 * The default value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected String postcondition = POSTCONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRules() <em>Rules</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected static final String RULES_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected String rules = RULES_EDEFAULT;

	/**
	 * The default value of the '{@link #getException() <em>Exception</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected String exception = EXCEPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * The cached value of the '{@link #getFunctionalRequirements() <em>Functional Requirements</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFunctionalRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalRequirement> functionalRequirements;

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
	 * The cached value of the '{@link #getIdentifiedClasses() <em>Identified Classes</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIdentifiedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.emf.emfstore.client.test.model.classes.Class> identifiedClasses;

	/**
	 * The cached value of the '{@link #getIncludedUseCases() <em>Included Use Cases</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncludedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> includedUseCases;

	/**
	 * The cached value of the '{@link #getExtendedUseCases() <em>Extended Use Cases</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExtendedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> extendedUseCases;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.USE_CASE;
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
						RequirementPackage.USE_CASE__INITIATING_ACTOR, oldInitiatingActor, initiatingActor));
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
				RequirementPackage.USE_CASE__INITIATING_ACTOR, oldInitiatingActor, newInitiatingActor);
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
					RequirementPackage.ACTOR__INITIATED_USE_CASES, Actor.class, msgs);
			if (newInitiatingActor != null)
				msgs = ((InternalEObject) newInitiatingActor).eInverseAdd(this,
					RequirementPackage.ACTOR__INITIATED_USE_CASES, Actor.class, msgs);
			msgs = basicSetInitiatingActor(newInitiatingActor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.USE_CASE__INITIATING_ACTOR,
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
				RequirementPackage.USE_CASE__PARTICIPATING_ACTORS, RequirementPackage.ACTOR__PARTICIPATED_USE_CASES);
		}
		return participatingActors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UserTask getRealizedUserTask() {
		if (realizedUserTask != null && realizedUserTask.eIsProxy()) {
			InternalEObject oldRealizedUserTask = (InternalEObject) realizedUserTask;
			realizedUserTask = (UserTask) eResolveProxy(oldRealizedUserTask);
			if (realizedUserTask != oldRealizedUserTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						RequirementPackage.USE_CASE__REALIZED_USER_TASK, oldRealizedUserTask, realizedUserTask));
			}
		}
		return realizedUserTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UserTask basicGetRealizedUserTask() {
		return realizedUserTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRealizedUserTask(UserTask newRealizedUserTask, NotificationChain msgs) {
		UserTask oldRealizedUserTask = realizedUserTask;
		realizedUserTask = newRealizedUserTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				RequirementPackage.USE_CASE__REALIZED_USER_TASK, oldRealizedUserTask, newRealizedUserTask);
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
	public void setRealizedUserTask(UserTask newRealizedUserTask) {
		if (newRealizedUserTask != realizedUserTask) {
			NotificationChain msgs = null;
			if (realizedUserTask != null)
				msgs = ((InternalEObject) realizedUserTask).eInverseRemove(this,
					RequirementPackage.USER_TASK__REALIZING_USE_CASES, UserTask.class, msgs);
			if (newRealizedUserTask != null)
				msgs = ((InternalEObject) newRealizedUserTask).eInverseAdd(this,
					RequirementPackage.USER_TASK__REALIZING_USE_CASES, UserTask.class, msgs);
			msgs = basicSetRealizedUserTask(newRealizedUserTask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.USE_CASE__REALIZED_USER_TASK,
				newRealizedUserTask, newRealizedUserTask));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.USE_CASE__PRECONDITION,
				oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Step> getUseCaseSteps() {
		if (useCaseSteps == null) {
			useCaseSteps = new EObjectContainmentWithInverseEList.Resolving<Step>(Step.class, this,
				RequirementPackage.USE_CASE__USE_CASE_STEPS, RequirementPackage.STEP__USE_CASE);
		}
		return useCaseSteps;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPostcondition(String newPostcondition) {
		String oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.USE_CASE__POSTCONDITION,
				oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRules(String newRules) {
		String oldRules = rules;
		rules = newRules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.USE_CASE__RULES, oldRules, rules));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setException(String newException) {
		String oldException = exception;
		exception = newException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.USE_CASE__EXCEPTION, oldException,
				exception));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
				RequirementPackage.USE_CASE__SCENARIOS, RequirementPackage.SCENARIO__INSTANTIATED_USE_CASES);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<FunctionalRequirement> getFunctionalRequirements() {
		if (functionalRequirements == null) {
			functionalRequirements = new EObjectWithInverseResolvingEList.ManyInverse<FunctionalRequirement>(
				FunctionalRequirement.class, this, RequirementPackage.USE_CASE__FUNCTIONAL_REQUIREMENTS,
				RequirementPackage.FUNCTIONAL_REQUIREMENT__USE_CASES);
		}
		return functionalRequirements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<NonFunctionalRequirement> getNonFunctionalRequirements() {
		if (nonFunctionalRequirements == null) {
			nonFunctionalRequirements = new EObjectWithInverseResolvingEList.ManyInverse<NonFunctionalRequirement>(
				NonFunctionalRequirement.class, this, RequirementPackage.USE_CASE__NON_FUNCTIONAL_REQUIREMENTS,
				RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__RESTRICTED_USE_CASES);
		}
		return nonFunctionalRequirements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<org.eclipse.emf.emfstore.client.test.model.classes.Class> getIdentifiedClasses() {
		if (identifiedClasses == null) {
			identifiedClasses = new EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.emfstore.client.test.model.classes.Class>(
				org.eclipse.emf.emfstore.client.test.model.classes.Class.class, this,
				RequirementPackage.USE_CASE__IDENTIFIED_CLASSES, ClassesPackage.CLASS__PARTICIPATED_USE_CASES);
		}
		return identifiedClasses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UseCase> getIncludedUseCases() {
		if (includedUseCases == null) {
			includedUseCases = new EObjectResolvingEList<UseCase>(UseCase.class, this,
				RequirementPackage.USE_CASE__INCLUDED_USE_CASES);
		}
		return includedUseCases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UseCase> getExtendedUseCases() {
		if (extendedUseCases == null) {
			extendedUseCases = new EObjectResolvingEList<UseCase>(UseCase.class, this,
				RequirementPackage.USE_CASE__EXTENDED_USE_CASES);
		}
		return extendedUseCases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SystemFunction> getSystemFunctions() {
		if (systemFunctions == null) {
			systemFunctions = new EObjectWithInverseResolvingEList.ManyInverse<SystemFunction>(SystemFunction.class,
				this, RequirementPackage.USE_CASE__SYSTEM_FUNCTIONS, RequirementPackage.SYSTEM_FUNCTION__USECASES);
		}
		return systemFunctions;
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
		case RequirementPackage.USE_CASE__INITIATING_ACTOR:
			if (initiatingActor != null)
				msgs = ((InternalEObject) initiatingActor).eInverseRemove(this,
					RequirementPackage.ACTOR__INITIATED_USE_CASES, Actor.class, msgs);
			return basicSetInitiatingActor((Actor) otherEnd, msgs);
		case RequirementPackage.USE_CASE__PARTICIPATING_ACTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipatingActors()).basicAdd(otherEnd,
				msgs);
		case RequirementPackage.USE_CASE__REALIZED_USER_TASK:
			if (realizedUserTask != null)
				msgs = ((InternalEObject) realizedUserTask).eInverseRemove(this,
					RequirementPackage.USER_TASK__REALIZING_USE_CASES, UserTask.class, msgs);
			return basicSetRealizedUserTask((UserTask) otherEnd, msgs);
		case RequirementPackage.USE_CASE__USE_CASE_STEPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCaseSteps()).basicAdd(otherEnd, msgs);
		case RequirementPackage.USE_CASE__SCENARIOS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getScenarios()).basicAdd(otherEnd, msgs);
		case RequirementPackage.USE_CASE__FUNCTIONAL_REQUIREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFunctionalRequirements()).basicAdd(otherEnd,
				msgs);
		case RequirementPackage.USE_CASE__NON_FUNCTIONAL_REQUIREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNonFunctionalRequirements()).basicAdd(
				otherEnd, msgs);
		case RequirementPackage.USE_CASE__IDENTIFIED_CLASSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIdentifiedClasses())
				.basicAdd(otherEnd, msgs);
		case RequirementPackage.USE_CASE__SYSTEM_FUNCTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSystemFunctions()).basicAdd(otherEnd, msgs);
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
		case RequirementPackage.USE_CASE__INITIATING_ACTOR:
			return basicSetInitiatingActor(null, msgs);
		case RequirementPackage.USE_CASE__PARTICIPATING_ACTORS:
			return ((InternalEList<?>) getParticipatingActors()).basicRemove(otherEnd, msgs);
		case RequirementPackage.USE_CASE__REALIZED_USER_TASK:
			return basicSetRealizedUserTask(null, msgs);
		case RequirementPackage.USE_CASE__USE_CASE_STEPS:
			return ((InternalEList<?>) getUseCaseSteps()).basicRemove(otherEnd, msgs);
		case RequirementPackage.USE_CASE__SCENARIOS:
			return ((InternalEList<?>) getScenarios()).basicRemove(otherEnd, msgs);
		case RequirementPackage.USE_CASE__FUNCTIONAL_REQUIREMENTS:
			return ((InternalEList<?>) getFunctionalRequirements()).basicRemove(otherEnd, msgs);
		case RequirementPackage.USE_CASE__NON_FUNCTIONAL_REQUIREMENTS:
			return ((InternalEList<?>) getNonFunctionalRequirements()).basicRemove(otherEnd, msgs);
		case RequirementPackage.USE_CASE__IDENTIFIED_CLASSES:
			return ((InternalEList<?>) getIdentifiedClasses()).basicRemove(otherEnd, msgs);
		case RequirementPackage.USE_CASE__SYSTEM_FUNCTIONS:
			return ((InternalEList<?>) getSystemFunctions()).basicRemove(otherEnd, msgs);
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
		case RequirementPackage.USE_CASE__INITIATING_ACTOR:
			if (resolve)
				return getInitiatingActor();
			return basicGetInitiatingActor();
		case RequirementPackage.USE_CASE__PARTICIPATING_ACTORS:
			return getParticipatingActors();
		case RequirementPackage.USE_CASE__REALIZED_USER_TASK:
			if (resolve)
				return getRealizedUserTask();
			return basicGetRealizedUserTask();
		case RequirementPackage.USE_CASE__PRECONDITION:
			return getPrecondition();
		case RequirementPackage.USE_CASE__USE_CASE_STEPS:
			return getUseCaseSteps();
		case RequirementPackage.USE_CASE__POSTCONDITION:
			return getPostcondition();
		case RequirementPackage.USE_CASE__RULES:
			return getRules();
		case RequirementPackage.USE_CASE__EXCEPTION:
			return getException();
		case RequirementPackage.USE_CASE__SCENARIOS:
			return getScenarios();
		case RequirementPackage.USE_CASE__FUNCTIONAL_REQUIREMENTS:
			return getFunctionalRequirements();
		case RequirementPackage.USE_CASE__NON_FUNCTIONAL_REQUIREMENTS:
			return getNonFunctionalRequirements();
		case RequirementPackage.USE_CASE__IDENTIFIED_CLASSES:
			return getIdentifiedClasses();
		case RequirementPackage.USE_CASE__INCLUDED_USE_CASES:
			return getIncludedUseCases();
		case RequirementPackage.USE_CASE__EXTENDED_USE_CASES:
			return getExtendedUseCases();
		case RequirementPackage.USE_CASE__SYSTEM_FUNCTIONS:
			return getSystemFunctions();
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
		case RequirementPackage.USE_CASE__INITIATING_ACTOR:
			setInitiatingActor((Actor) newValue);
			return;
		case RequirementPackage.USE_CASE__PARTICIPATING_ACTORS:
			getParticipatingActors().clear();
			getParticipatingActors().addAll((Collection<? extends Actor>) newValue);
			return;
		case RequirementPackage.USE_CASE__REALIZED_USER_TASK:
			setRealizedUserTask((UserTask) newValue);
			return;
		case RequirementPackage.USE_CASE__PRECONDITION:
			setPrecondition((String) newValue);
			return;
		case RequirementPackage.USE_CASE__USE_CASE_STEPS:
			getUseCaseSteps().clear();
			getUseCaseSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case RequirementPackage.USE_CASE__POSTCONDITION:
			setPostcondition((String) newValue);
			return;
		case RequirementPackage.USE_CASE__RULES:
			setRules((String) newValue);
			return;
		case RequirementPackage.USE_CASE__EXCEPTION:
			setException((String) newValue);
			return;
		case RequirementPackage.USE_CASE__SCENARIOS:
			getScenarios().clear();
			getScenarios().addAll((Collection<? extends Scenario>) newValue);
			return;
		case RequirementPackage.USE_CASE__FUNCTIONAL_REQUIREMENTS:
			getFunctionalRequirements().clear();
			getFunctionalRequirements().addAll((Collection<? extends FunctionalRequirement>) newValue);
			return;
		case RequirementPackage.USE_CASE__NON_FUNCTIONAL_REQUIREMENTS:
			getNonFunctionalRequirements().clear();
			getNonFunctionalRequirements().addAll((Collection<? extends NonFunctionalRequirement>) newValue);
			return;
		case RequirementPackage.USE_CASE__IDENTIFIED_CLASSES:
			getIdentifiedClasses().clear();
			getIdentifiedClasses().addAll(
				(Collection<? extends org.eclipse.emf.emfstore.client.test.model.classes.Class>) newValue);
			return;
		case RequirementPackage.USE_CASE__INCLUDED_USE_CASES:
			getIncludedUseCases().clear();
			getIncludedUseCases().addAll((Collection<? extends UseCase>) newValue);
			return;
		case RequirementPackage.USE_CASE__EXTENDED_USE_CASES:
			getExtendedUseCases().clear();
			getExtendedUseCases().addAll((Collection<? extends UseCase>) newValue);
			return;
		case RequirementPackage.USE_CASE__SYSTEM_FUNCTIONS:
			getSystemFunctions().clear();
			getSystemFunctions().addAll((Collection<? extends SystemFunction>) newValue);
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
		case RequirementPackage.USE_CASE__INITIATING_ACTOR:
			setInitiatingActor((Actor) null);
			return;
		case RequirementPackage.USE_CASE__PARTICIPATING_ACTORS:
			getParticipatingActors().clear();
			return;
		case RequirementPackage.USE_CASE__REALIZED_USER_TASK:
			setRealizedUserTask((UserTask) null);
			return;
		case RequirementPackage.USE_CASE__PRECONDITION:
			setPrecondition(PRECONDITION_EDEFAULT);
			return;
		case RequirementPackage.USE_CASE__USE_CASE_STEPS:
			getUseCaseSteps().clear();
			return;
		case RequirementPackage.USE_CASE__POSTCONDITION:
			setPostcondition(POSTCONDITION_EDEFAULT);
			return;
		case RequirementPackage.USE_CASE__RULES:
			setRules(RULES_EDEFAULT);
			return;
		case RequirementPackage.USE_CASE__EXCEPTION:
			setException(EXCEPTION_EDEFAULT);
			return;
		case RequirementPackage.USE_CASE__SCENARIOS:
			getScenarios().clear();
			return;
		case RequirementPackage.USE_CASE__FUNCTIONAL_REQUIREMENTS:
			getFunctionalRequirements().clear();
			return;
		case RequirementPackage.USE_CASE__NON_FUNCTIONAL_REQUIREMENTS:
			getNonFunctionalRequirements().clear();
			return;
		case RequirementPackage.USE_CASE__IDENTIFIED_CLASSES:
			getIdentifiedClasses().clear();
			return;
		case RequirementPackage.USE_CASE__INCLUDED_USE_CASES:
			getIncludedUseCases().clear();
			return;
		case RequirementPackage.USE_CASE__EXTENDED_USE_CASES:
			getExtendedUseCases().clear();
			return;
		case RequirementPackage.USE_CASE__SYSTEM_FUNCTIONS:
			getSystemFunctions().clear();
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
		case RequirementPackage.USE_CASE__INITIATING_ACTOR:
			return initiatingActor != null;
		case RequirementPackage.USE_CASE__PARTICIPATING_ACTORS:
			return participatingActors != null && !participatingActors.isEmpty();
		case RequirementPackage.USE_CASE__REALIZED_USER_TASK:
			return realizedUserTask != null;
		case RequirementPackage.USE_CASE__PRECONDITION:
			return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
		case RequirementPackage.USE_CASE__USE_CASE_STEPS:
			return useCaseSteps != null && !useCaseSteps.isEmpty();
		case RequirementPackage.USE_CASE__POSTCONDITION:
			return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT
				.equals(postcondition);
		case RequirementPackage.USE_CASE__RULES:
			return RULES_EDEFAULT == null ? rules != null : !RULES_EDEFAULT.equals(rules);
		case RequirementPackage.USE_CASE__EXCEPTION:
			return EXCEPTION_EDEFAULT == null ? exception != null : !EXCEPTION_EDEFAULT.equals(exception);
		case RequirementPackage.USE_CASE__SCENARIOS:
			return scenarios != null && !scenarios.isEmpty();
		case RequirementPackage.USE_CASE__FUNCTIONAL_REQUIREMENTS:
			return functionalRequirements != null && !functionalRequirements.isEmpty();
		case RequirementPackage.USE_CASE__NON_FUNCTIONAL_REQUIREMENTS:
			return nonFunctionalRequirements != null && !nonFunctionalRequirements.isEmpty();
		case RequirementPackage.USE_CASE__IDENTIFIED_CLASSES:
			return identifiedClasses != null && !identifiedClasses.isEmpty();
		case RequirementPackage.USE_CASE__INCLUDED_USE_CASES:
			return includedUseCases != null && !includedUseCases.isEmpty();
		case RequirementPackage.USE_CASE__EXTENDED_USE_CASES:
			return extendedUseCases != null && !extendedUseCases.isEmpty();
		case RequirementPackage.USE_CASE__SYSTEM_FUNCTIONS:
			return systemFunctions != null && !systemFunctions.isEmpty();
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
		result.append(" (precondition: ");
		result.append(precondition);
		result.append(", postcondition: ");
		result.append(postcondition);
		result.append(", rules: ");
		result.append(rules);
		result.append(", exception: ");
		result.append(exception);
		result.append(')');
		return result.toString();
	}

} // UseCaseImpl
