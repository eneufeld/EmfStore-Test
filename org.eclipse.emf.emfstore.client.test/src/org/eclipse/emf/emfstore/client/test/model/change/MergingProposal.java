/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.change;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.rationale.Proposal;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Merging Proposal</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.change.MergingProposal#getPendingOperations <em>Pending
 * Operations</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.change.ChangePackage#getMergingProposal()
 * @model
 * @generated
 */
public interface MergingProposal extends Proposal {
	/**
	 * Returns the value of the '<em><b>Pending Operations</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Operations</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pending Operations</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.change.ChangePackage#getMergingProposal_PendingOperations()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<AbstractOperation> getPendingOperations();

} // MergingProposal
