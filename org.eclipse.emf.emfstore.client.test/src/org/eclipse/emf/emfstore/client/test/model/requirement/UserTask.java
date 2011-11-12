/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>User Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getInitiatingActor <em>Initiating Actor
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getParticipatingActors <em>Participating
 * Actors</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getRealizingUseCases <em>Realizing Use
 * Cases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getNonFunctionalRequirements <em>Non
 * Functional Requirements</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getUserTask()
 * @model
 * @generated
 */
public interface UserTask extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Initiating Actor</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInitiatedUserTask
	 * <em>Initiated User Task</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiating Actor</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Initiating Actor</em>' reference.
	 * @see #setInitiatingActor(Actor)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getUserTask_InitiatingActor()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInitiatedUserTask
	 * @model opposite="initiatedUserTask"
	 * @generated
	 */
	Actor getInitiatingActor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.requirement.UserTask#getInitiatingActor
	 * <em>Initiating Actor</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Initiating Actor</em>' reference.
	 * @see #getInitiatingActor()
	 * @generated
	 */
	void setInitiatingActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Participating Actors</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getParticipatedUserTasks
	 * <em>Participated User Tasks</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Actors</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Participating Actors</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getUserTask_ParticipatingActors()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getParticipatedUserTasks
	 * @model opposite="participatedUserTasks" annotation="org.unicase.ui.meeditor priority='12.0' position='right'"
	 * @generated
	 */
	EList<Actor> getParticipatingActors();

	/**
	 * Returns the value of the '<em><b>Realizing Use Cases</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getRealizedUserTask
	 * <em>Realized User Task</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Use Cases</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Realizing Use Cases</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getUserTask_RealizingUseCases()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getRealizedUserTask
	 * @model opposite="realizedUserTask" annotation="org.unicase.ui.meeditor priority='12.0' position='right'"
	 * @generated
	 */
	EList<UseCase> getRealizingUseCases();

	/**
	 * Returns the value of the '<em><b>Non Functional Requirements</b></em>' reference list. The list contents are of
	 * type {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement}. It is bidirectional
	 * and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getUserTasks
	 * <em>User Tasks</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Functional Requirements</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Non Functional Requirements</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getUserTask_NonFunctionalRequirements()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement#getUserTasks
	 * @model opposite="userTasks" annotation="org.unicase.ui.meeditor priority='12.0' position='right'"
	 * @generated
	 */
	EList<NonFunctionalRequirement> getNonFunctionalRequirements();

} // UserTask
