/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.organization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Group</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.Group#getOrgUnits <em>Org Units</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends OrgUnit {
	/**
	 * Returns the value of the '<em><b>Org Units</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit}. It is bidirectional and its opposite is
	 * '{@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getGroupMemberships
	 * <em>Group Memberships</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Org Units</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Org Units</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage#getGroup_OrgUnits()
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getGroupMemberships
	 * @model opposite="groupMemberships" annotation="org.unicase.ui.meeditor priority='10.5' position='right'"
	 * @generated
	 */
	EList<OrgUnit> getOrgUnits();

} // Group
