/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.Annotation;
import org.eclipse.emf.emfstore.client.test.model.task.ActivityType;
import org.eclipse.emf.emfstore.client.test.model.task.Checkable;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Issue</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getProposals <em>Proposals</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getSolution <em>Solution</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getCriteria <em>Criteria</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getActivity <em>Activity</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getAssessments <em>Assessments</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends Annotation, Checkable, WorkItem {
	/**
	 * Returns the value of the '<em><b>Proposals</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Proposal}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Proposal#getIssue <em>Issue</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposals</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Proposals</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getIssue_Proposals()
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Proposal#getIssue
	 * @model opposite="issue" containment="true" resolveProxies="true"
	 *        annotation="org.unicase.ui.meeditor priority='21.0' position='left'"
	 * @generated
	 */
	EList<Proposal> getProposals();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' containment reference. It is bidirectional and its opposite
	 * is '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Solution#getIssue <em>Issue</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Solution</em>' containment reference.
	 * @see #setSolution(Solution)
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getIssue_Solution()
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Solution#getIssue
	 * @model opposite="issue" containment="true" resolveProxies="true"
	 *        annotation="org.unicase.ui.meeditor priority='20.0' position='left'"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getSolution
	 * <em>Solution</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Solution</em>' containment reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Criterion}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Criteria</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getIssue_Criteria()
	 * @model annotation="org.unicase.ui.meeditor priority='22.0' position='left'"
	 * @generated
	 */
	EList<Criterion> getCriteria();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' attribute. The literals are from the enumeration
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.ActivityType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Activity</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.ActivityType
	 * @see #setActivity(ActivityType)
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getIssue_Activity()
	 * @model annotation="org.unicase.ui.meeditor priority='9.5' position='left'"
	 * @generated
	 */
	ActivityType getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue#getActivity
	 * <em>Activity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Activity</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.ActivityType
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(ActivityType value);

	/**
	 * Returns the value of the '<em><b>Assessments</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Assessment}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessments</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Assessments</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage#getIssue_Assessments()
	 * @model changeable="false" derived="true" annotation="org.unicase.ui.meeditor priority='30' position='bottom'"
	 * @generated
	 */
	EList<Assessment> getAssessments();

} // Issue
