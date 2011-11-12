/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.classes.Method;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Scenario</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getSteps <em>Steps</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getInitiatingActorInstance <em>Initiating
 * Actor Instance</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingActorInstances <em>
 * Participating Actor Instances</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getInstantiatedUseCases <em>Instantiated
 * Use Cases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getFunctionalRequirements <em>Functional
 * Requirements</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getNonFunctionalRequirements <em>Non
 * Functional Requirements</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingMethods <em>Participating
 * Methods</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingClasses <em>Participating
 * Classes</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Step}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getScenario_Steps()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Initiating Actor Instance</b></em>' reference. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getInitiatedScenarios
	 * <em>Initiated Scenarios</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiating Actor Instance</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Initiating Actor Instance</em>' reference.
	 * @see #setInitiatingActorInstance(ActorInstance)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getScenario_InitiatingActorInstance()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getInitiatedScenarios
	 * @model opposite="initiatedScenarios" annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	ActorInstance getInitiatingActorInstance();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getInitiatingActorInstance
	 * <em>Initiating Actor Instance</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Initiating Actor Instance</em>' reference.
	 * @see #getInitiatingActorInstance()
	 * @generated
	 */
	void setInitiatingActorInstance(ActorInstance value);

	/**
	 * Returns the value of the '<em><b>Participating Actor Instances</b></em>' reference list. The list contents are of
	 * type {@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance}. It is bidirectional and its
	 * opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getParticipatedScenarios
	 * <em>Participated Scenarios</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Actor Instances</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Participating Actor Instances</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getScenario_ParticipatingActorInstances()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getParticipatedScenarios
	 * @model opposite="participatedScenarios" annotation="org.unicase.ui.meeditor priority='11.0' position='left'"
	 * @generated
	 */
	EList<ActorInstance> getParticipatingActorInstances();

	/**
	 * Returns the value of the '<em><b>Instantiated Use Cases</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getScenarios <em>Scenarios</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Use Cases</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instantiated Use Cases</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getScenario_InstantiatedUseCases()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getScenarios
	 * @model opposite="scenarios" annotation="org.unicase.ui.meeditor priority='10.0' position='right'"
	 * @generated
	 */
	EList<UseCase> getInstantiatedUseCases();

	/**
	 * Returns the value of the '<em><b>Functional Requirements</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement}. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getScenarios
	 * <em>Scenarios</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Requirements</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Functional Requirements</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getScenario_FunctionalRequirements()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getScenarios
	 * @model opposite="scenarios" annotation="org.unicase.ui.meeditor priority='11.0' position='right'"
	 * @generated
	 */
	EList<FunctionalRequirement> getFunctionalRequirements();

	/**
	 * Returns the value of the '<em><b>Non Functional Requirements</b></em>' reference list. The list contents are of
	 * type {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement}. It is bidirectional
	 * and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getRestrictedScenarios
	 * <em>Restricted Scenarios</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Functional Requirements</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Non Functional Requirements</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getScenario_NonFunctionalRequirements()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getRestrictedScenarios
	 * @model opposite="restrictedScenarios" annotation="org.unicase.ui.meeditor priority='12.0' position='right'"
	 * @generated
	 */
	EList<NonFunctionalRequirement> getNonFunctionalRequirements();

	/**
	 * Returns the value of the '<em><b>Participating Methods</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Method#getDemoParticipations
	 * <em>Demo Participations</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Methods</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Participating Methods</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getScenario_ParticipatingMethods()
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Method#getDemoParticipations
	 * @model opposite="demoParticipations"
	 * @generated
	 */
	EList<Method> getParticipatingMethods();

	/**
	 * Returns the value of the '<em><b>Participating Classes</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.classes.Class#getDemoParticipations
	 * <em>Demo Participations</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Classes</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Participating Classes</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getScenario_ParticipatingClasses()
	 * @see org.eclipse.emf.emfstore.client.test.model.classes.Class#getDemoParticipations
	 * @model opposite="demoParticipations"
	 * @generated
	 */
	EList<org.eclipse.emf.emfstore.client.test.model.classes.Class> getParticipatingClasses();

} // Scenario
