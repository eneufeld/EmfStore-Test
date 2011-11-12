/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.organization;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>User</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.User#getEmail <em>Email</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.User#getFirstName <em>First Name</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.User#getLastName <em>Last Name</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.User#getWorkItemsToReview <em>Work Items To Review
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage#getUser()
 * @model
 * @generated
 */
public interface User extends OrgUnit {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage#getUser_Email()
	 * @model annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.organization.User#getEmail
	 * <em>Email</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage#getUser_FirstName()
	 * @model annotation="org.unicase.ui.meeditor priority='11.0' position='left'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.organization.User#getFirstName
	 * <em>First Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage#getUser_LastName()
	 * @model annotation="org.unicase.ui.meeditor priority='12.0' position='left'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.organization.User#getLastName
	 * <em>Last Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Work Items To Review</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getReviewer <em>Reviewer</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Items To Review</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Work Items To Review</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage#getUser_WorkItemsToReview()
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getReviewer
	 * @model opposite="reviewer"
	 * @generated
	 */
	EList<WorkItem> getWorkItemsToReview();

} // User
