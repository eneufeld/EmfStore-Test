/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Action Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.ActionItem#isDone <em>Done</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.ActionItem#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getActionItem()
 * @model
 * @generated
 */
public interface ActionItem extends WorkItem, Checkable {
	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(boolean)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getActionItem_Done()
	 * @model annotation="org.unicase.ui.meeditor priority='17.0' position='left'"
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.ActionItem#isDone <em>Done</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

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
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getActionItem_Activity()
	 * @model annotation="org.unicase.ui.meeditor priority='9.5' position='left'"
	 * @generated
	 */
	ActivityType getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.ActionItem#getActivity
	 * <em>Activity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Activity</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.ActivityType
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(ActivityType value);

} // ActionItem
