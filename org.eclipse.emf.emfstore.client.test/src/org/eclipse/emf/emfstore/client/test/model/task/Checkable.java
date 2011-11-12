/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task;

import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Checkable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.Checkable#isChecked <em>Checked</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getCheckable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Checkable extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Checked</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Checked</em>' attribute.
	 * @see #setChecked(boolean)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getCheckable_Checked()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isChecked();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.Checkable#isChecked
	 * <em>Checked</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Checked</em>' attribute.
	 * @see #isChecked()
	 * @generated
	 */
	void setChecked(boolean value);

} // Checkable
