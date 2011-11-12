/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.common.model.NonDomainElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Solution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.Solution#getUnderlyingProposals <em>Underlying
 * Proposals</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.Solution#getIssue <em>Issue</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends UnicaseModelElement, NonDomainElement {
	/**
	 * Returns the value of the '<em><b>Underlying Proposals</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Proposal}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underlying Proposals</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Underlying Proposals</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getSolution_UnderlyingProposals()
	 * @model annotation="org.unicase.ui.meeditor priority='10.0' position='right'"
	 * @generated
	 */
	EList<Proposal> getUnderlyingProposals();

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' container reference. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getSolution <em>Solution</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Issue</em>' container reference.
	 * @see #setIssue(Issue)
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getSolution_Issue()
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getSolution
	 * @model opposite="solution" transient="false" annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	Issue getIssue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Solution#getIssue
	 * <em>Issue</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Issue</em>' container reference.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(Issue value);

} // Solution
