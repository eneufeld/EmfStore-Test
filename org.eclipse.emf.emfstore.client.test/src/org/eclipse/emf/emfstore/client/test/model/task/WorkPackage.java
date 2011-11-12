/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Work Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getContainedWorkItems <em>Contained Work Items
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getStartDate <em>Start Date</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkPackage()
 * @model
 * @generated
 */
public interface WorkPackage extends WorkItem {
	/**
	 * Returns the value of the '<em><b>Contained Work Items</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem}. It is bidirectional and its opposite is
	 * '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getContainingWorkpackage
	 * <em>Containing Workpackage</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Work Items</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Contained Work Items</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkPackage_ContainedWorkItems()
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getContainingWorkpackage
	 * @model opposite="containingWorkpackage" containment="true" resolveProxies="true"
	 *        annotation="org.unicase.ui.meeditor priority='20.0' position='right'"
	 * @generated
	 */
	EList<WorkItem> getContainedWorkItems();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkPackage_StartDate()
	 * @model annotation="org.unicase.ui.meeditor priority='20.0' position='left'"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getStartDate
	 * <em>Start Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkPackage_EndDate()
	 * @model annotation="org.unicase.ui.meeditor priority='21.0' position='left'"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getEndDate
	 * <em>End Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

} // WorkPackage
