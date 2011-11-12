/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.meeting;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Issue Meeting Section</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.IssueMeetingSection#getIncludedIssues <em>Included
 * Issues</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage#getIssueMeetingSection()
 * @model
 * @generated
 */
public interface IssueMeetingSection extends MeetingSection {
	/**
	 * Returns the value of the '<em><b>Included Issues</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Issue}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Issues</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Included Issues</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage#getIssueMeetingSection_IncludedIssues()
	 * @model annotation="org.unicase.ui.meeditor priority='10.0' position='right'"
	 * @generated
	 */
	EList<Issue> getIncludedIssues();

} // IssueMeetingSection
