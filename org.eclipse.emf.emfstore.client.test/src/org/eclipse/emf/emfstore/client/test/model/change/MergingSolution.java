/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.change;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.rationale.Solution;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Merging Solution</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.change.MergingSolution#getAppliedOperations <em>Applied
 * Operations</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.change.ChangePackage#getMergingSolution()
 * @model
 * @generated
 */
public interface MergingSolution extends Solution {
	/**
	 * Returns the value of the '<em><b>Applied Operations</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Operations</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Applied Operations</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.change.ChangePackage#getMergingSolution_AppliedOperations()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<AbstractOperation> getAppliedOperations();

} // MergingSolution
