/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.state;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.StateNode#getOutgoingTransitions <em>Outgoing Transitions
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.state.StateNode#getIncomingTransitions <em>Incoming Transitions
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.state.StatePackage#getStateNode()
 * @model abstract="true"
 * @generated
 */
public interface StateNode extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.state.Transition}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.state.Transition#getSource <em>Source</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.state.StatePackage#getStateNode_OutgoingTransitions()
	 * @see org.eclipse.emf.emfstore.client.test.model.state.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.state.Transition}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.state.Transition#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.state.StatePackage#getStateNode_IncomingTransitions()
	 * @see org.eclipse.emf.emfstore.client.test.model.state.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

} // StateNode
