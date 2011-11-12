/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.meeting;

import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.MeetingSection#getAllocatedTime <em>Allocated Time
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage#getMeetingSection()
 * @model abstract="true"
 * @generated
 */
public interface MeetingSection extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Allocated Time</b></em>' attribute. The default value is <code>"0"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Time</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Allocated Time</em>' attribute.
	 * @see #setAllocatedTime(int)
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage#getMeetingSection_AllocatedTime()
	 * @model default="0" annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	int getAllocatedTime();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.meeting.MeetingSection#getAllocatedTime
	 * <em>Allocated Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Allocated Time</em>' attribute.
	 * @see #getAllocatedTime()
	 * @generated
	 */
	void setAllocatedTime(int value);

} // MeetingSection
