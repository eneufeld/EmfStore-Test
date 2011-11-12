/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.organization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.organization.Group;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Org Unit</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.impl.OrgUnitImpl#getAcOrgId <em>Ac Org Id</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.impl.OrgUnitImpl#getGroupMemberships <em>Group
 * Memberships</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.impl.OrgUnitImpl#getAssignments <em>Assignments
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.impl.OrgUnitImpl#getParticipations <em>
 * Participations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class OrgUnitImpl extends UnicaseModelElementImpl implements OrgUnit {
	/**
	 * The default value of the '{@link #getAcOrgId() <em>Ac Org Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAcOrgId()
	 * @generated
	 * @ordered
	 */
	protected static final String AC_ORG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcOrgId() <em>Ac Org Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAcOrgId()
	 * @generated
	 * @ordered
	 */
	protected String acOrgId = AC_ORG_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroupMemberships() <em>Group Memberships</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGroupMemberships()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groupMemberships;

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkItem> assignments;

	/**
	 * The cached value of the '{@link #getParticipations() <em>Participations</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParticipations()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkItem> participations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OrgUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationPackage.Literals.ORG_UNIT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAcOrgId() {
		return acOrgId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAcOrgId(String newAcOrgId) {
		String oldAcOrgId = acOrgId;
		acOrgId = newAcOrgId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.ORG_UNIT__AC_ORG_ID, oldAcOrgId,
				acOrgId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Group> getGroupMemberships() {
		if (groupMemberships == null) {
			groupMemberships = new EObjectWithInverseResolvingEList.ManyInverse<Group>(Group.class, this,
				OrganizationPackage.ORG_UNIT__GROUP_MEMBERSHIPS, OrganizationPackage.GROUP__ORG_UNITS);
		}
		return groupMemberships;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<WorkItem> getAssignments() {
		if (assignments == null) {
			assignments = new EObjectWithInverseResolvingEList<WorkItem>(WorkItem.class, this,
				OrganizationPackage.ORG_UNIT__ASSIGNMENTS, TaskPackage.WORK_ITEM__ASSIGNEE);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<WorkItem> getParticipations() {
		if (participations == null) {
			participations = new EObjectWithInverseResolvingEList.ManyInverse<WorkItem>(WorkItem.class, this,
				OrganizationPackage.ORG_UNIT__PARTICIPATIONS, TaskPackage.WORK_ITEM__PARTICIPANTS);
		}
		return participations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OrganizationPackage.ORG_UNIT__GROUP_MEMBERSHIPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGroupMemberships()).basicAdd(otherEnd, msgs);
		case OrganizationPackage.ORG_UNIT__ASSIGNMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssignments()).basicAdd(otherEnd, msgs);
		case OrganizationPackage.ORG_UNIT__PARTICIPATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OrganizationPackage.ORG_UNIT__GROUP_MEMBERSHIPS:
			return ((InternalEList<?>) getGroupMemberships()).basicRemove(otherEnd, msgs);
		case OrganizationPackage.ORG_UNIT__ASSIGNMENTS:
			return ((InternalEList<?>) getAssignments()).basicRemove(otherEnd, msgs);
		case OrganizationPackage.ORG_UNIT__PARTICIPATIONS:
			return ((InternalEList<?>) getParticipations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OrganizationPackage.ORG_UNIT__AC_ORG_ID:
			return getAcOrgId();
		case OrganizationPackage.ORG_UNIT__GROUP_MEMBERSHIPS:
			return getGroupMemberships();
		case OrganizationPackage.ORG_UNIT__ASSIGNMENTS:
			return getAssignments();
		case OrganizationPackage.ORG_UNIT__PARTICIPATIONS:
			return getParticipations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OrganizationPackage.ORG_UNIT__AC_ORG_ID:
			setAcOrgId((String) newValue);
			return;
		case OrganizationPackage.ORG_UNIT__GROUP_MEMBERSHIPS:
			getGroupMemberships().clear();
			getGroupMemberships().addAll((Collection<? extends Group>) newValue);
			return;
		case OrganizationPackage.ORG_UNIT__ASSIGNMENTS:
			getAssignments().clear();
			getAssignments().addAll((Collection<? extends WorkItem>) newValue);
			return;
		case OrganizationPackage.ORG_UNIT__PARTICIPATIONS:
			getParticipations().clear();
			getParticipations().addAll((Collection<? extends WorkItem>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OrganizationPackage.ORG_UNIT__AC_ORG_ID:
			setAcOrgId(AC_ORG_ID_EDEFAULT);
			return;
		case OrganizationPackage.ORG_UNIT__GROUP_MEMBERSHIPS:
			getGroupMemberships().clear();
			return;
		case OrganizationPackage.ORG_UNIT__ASSIGNMENTS:
			getAssignments().clear();
			return;
		case OrganizationPackage.ORG_UNIT__PARTICIPATIONS:
			getParticipations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OrganizationPackage.ORG_UNIT__AC_ORG_ID:
			return AC_ORG_ID_EDEFAULT == null ? acOrgId != null : !AC_ORG_ID_EDEFAULT.equals(acOrgId);
		case OrganizationPackage.ORG_UNIT__GROUP_MEMBERSHIPS:
			return groupMemberships != null && !groupMemberships.isEmpty();
		case OrganizationPackage.ORG_UNIT__ASSIGNMENTS:
			return assignments != null && !assignments.isEmpty();
		case OrganizationPackage.ORG_UNIT__PARTICIPATIONS:
			return participations != null && !participations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (acOrgId: ");
		result.append(acOrgId);
		result.append(')');
		return result.toString();
	}

} // OrgUnitImpl
