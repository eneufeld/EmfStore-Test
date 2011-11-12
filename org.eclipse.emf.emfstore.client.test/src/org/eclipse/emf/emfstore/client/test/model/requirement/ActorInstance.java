/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Actor Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getInitiatedScenarios <em>Initiated
 * Scenarios</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getParticipatedScenarios <em>
 * Participated Scenarios</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getInstantiatedActor <em>Instantiated
 * Actor</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getActorInstance()
 * @model
 * @generated
 */
public interface ActorInstance extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Initiated Scenarios</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario}. It is bidirectional and its opposite is
	 * '{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getInitiatingActorInstance
	 * <em>Initiating Actor Instance</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiated Scenarios</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Initiated Scenarios</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getActorInstance_InitiatedScenarios()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getInitiatingActorInstance
	 * @model opposite="initiatingActorInstance" annotation="org.unicase.ui.meeditor priority='10.0' position='right'"
	 * @generated
	 */
	EList<Scenario> getInitiatedScenarios();

	/**
	 * Returns the value of the '<em><b>Participated Scenarios</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario}. It is bidirectional and its opposite is
	 * '{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingActorInstances
	 * <em>Participating Actor Instances</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participated Scenarios</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Participated Scenarios</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getActorInstance_ParticipatedScenarios()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getParticipatingActorInstances
	 * @model opposite="participatingActorInstances"
	 *        annotation="org.unicase.ui.meeditor priority='11.0' position='right'"
	 * @generated
	 */
	EList<Scenario> getParticipatedScenarios();

	/**
	 * Returns the value of the '<em><b>Instantiated Actor</b></em>' reference. It is bidirectional and its opposite is
	 * '{@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInstances <em>Instances</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Actor</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instantiated Actor</em>' reference.
	 * @see #setInstantiatedActor(Actor)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getActorInstance_InstantiatedActor()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Actor#getInstances
	 * @model opposite="instances" annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	Actor getInstantiatedActor();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.ActorInstance#getInstantiatedActor
	 * <em>Instantiated Actor</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Instantiated Actor</em>' reference.
	 * @see #getInstantiatedActor()
	 * @generated
	 */
	void setInstantiatedActor(Actor value);

} // ActorInstance
