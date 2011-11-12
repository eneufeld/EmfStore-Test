/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Functional Requirement</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefinedRequirement <em>
 * Refined Requirement</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getStoryPoints <em>Story
 * Points</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getPriority <em>Priority
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefiningRequirements <em>
 * Refining Requirements</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getUseCases <em>Use Cases
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getScenarios <em>Scenarios
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#isReviewed <em>Reviewed</em>}
 * </li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getStakeholder <em>
 * Stakeholder</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getCost <em>Cost</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement()
 * @model
 * @generated
 */
public interface FunctionalRequirement extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Refined Requirement</b></em>' container reference. It is bidirectional and its
	 * opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefiningRequirements
	 * <em>Refining Requirements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Requirement</em>' container reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Refined Requirement</em>' container reference.
	 * @see #setRefinedRequirement(FunctionalRequirement)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement_RefinedRequirement()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefiningRequirements
	 * @model opposite="refiningRequirements" transient="false"
	 *        annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	FunctionalRequirement getRefinedRequirement();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefinedRequirement
	 * <em>Refined Requirement</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Refined Requirement</em>' container reference.
	 * @see #getRefinedRequirement()
	 * @generated
	 */
	void setRefinedRequirement(FunctionalRequirement value);

	/**
	 * Returns the value of the '<em><b>Story Points</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Points</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Story Points</em>' attribute.
	 * @see #setStoryPoints(int)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement_StoryPoints()
	 * @model
	 * @generated
	 */
	int getStoryPoints();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getStoryPoints
	 * <em>Story Points</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Story Points</em>' attribute.
	 * @see #getStoryPoints()
	 * @generated
	 */
	void setStoryPoints(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement_Priority()
	 * @model annotation="org.unicase.ui.meeditor priority='12.0' position='left'"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getPriority
	 * <em>Priority</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Refining Requirements</b></em>' containment reference list. The list contents
	 * are of type {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement}. It is
	 * bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefinedRequirement
	 * <em>Refined Requirement</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refining Requirements</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Refining Requirements</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement_RefiningRequirements()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getRefinedRequirement
	 * @model opposite="refinedRequirement" containment="true" resolveProxies="true"
	 *        annotation="org.unicase.ui.meeditor priority='12.0' position='right'"
	 * @generated
	 */
	EList<FunctionalRequirement> getRefiningRequirements();

	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getFunctionalRequirements
	 * <em>Functional Requirements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Cases</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Use Cases</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement_UseCases()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.UseCase#getFunctionalRequirements
	 * @model opposite="functionalRequirements" annotation="org.unicase.ui.meeditor priority='10.0' position='right'"
	 * @generated
	 */
	EList<UseCase> getUseCases();

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario}. It is bidirectional and its opposite is
	 * '{@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getFunctionalRequirements
	 * <em>Functional Requirements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Scenarios</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement_Scenarios()
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.Scenario#getFunctionalRequirements
	 * @model opposite="functionalRequirements" annotation="org.unicase.ui.meeditor priority='11.0' position='right'"
	 * @generated
	 */
	EList<Scenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Reviewed</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviewed</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reviewed</em>' attribute.
	 * @see #setReviewed(boolean)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement_Reviewed()
	 * @model annotation="org.unicase.ui.meeditor priority='13.0' position='left'"
	 * @generated
	 */
	boolean isReviewed();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#isReviewed <em>Reviewed</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Reviewed</em>' attribute.
	 * @see #isReviewed()
	 * @generated
	 */
	void setReviewed(boolean value);

	/**
	 * Returns the value of the '<em><b>Stakeholder</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stakeholder</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stakeholder</em>' reference.
	 * @see #setStakeholder(OrgUnit)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement_Stakeholder()
	 * @model annotation="org.unicase.ui.meeditor priority='11.0' position='left'"
	 * @generated
	 */
	OrgUnit getStakeholder();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getStakeholder
	 * <em>Stakeholder</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Stakeholder</em>' reference.
	 * @see #getStakeholder()
	 * @generated
	 */
	void setStakeholder(OrgUnit value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage#getFunctionalRequirement_Cost()
	 * @model
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement#getCost <em>Cost</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

} // FunctionalRequirement
