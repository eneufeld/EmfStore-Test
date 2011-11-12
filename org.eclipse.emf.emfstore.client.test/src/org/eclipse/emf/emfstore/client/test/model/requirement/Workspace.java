/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Workspace</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.Workspace#getSystemFunctions <em>System Functions
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>System Functions</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction}. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getWorkspace
	 * <em>Workspace</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Functions</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>System Functions</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getWorkspace_SystemFunctions()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction#getWorkspace
	 * @model opposite="workspace" annotation="org.unicase.ui.meeditor priority='12.0' position='right'"
	 * @generated
	 */
	EList<SystemFunction> getSystemFunctions();

} // Workspace
