/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.organization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.organization.Group;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Group</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.organization.impl.GroupImpl#getOrgUnits <em>Org Units</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GroupImpl extends OrgUnitImpl implements Group {
	/**
	 * The cached value of the '{@link #getOrgUnits() <em>Org Units</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOrgUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgUnit> orgUnits;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OrgUnit> getOrgUnits() {
		if (orgUnits == null) {
			orgUnits = new EObjectWithInverseResolvingEList.ManyInverse<OrgUnit>(OrgUnit.class, this,
				OrganizationPackage.GROUP__ORG_UNITS, OrganizationPackage.ORG_UNIT__GROUP_MEMBERSHIPS);
		}
		return orgUnits;
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
		case OrganizationPackage.GROUP__ORG_UNITS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOrgUnits()).basicAdd(otherEnd, msgs);
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
		case OrganizationPackage.GROUP__ORG_UNITS:
			return ((InternalEList<?>) getOrgUnits()).basicRemove(otherEnd, msgs);
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
		case OrganizationPackage.GROUP__ORG_UNITS:
			return getOrgUnits();
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
		case OrganizationPackage.GROUP__ORG_UNITS:
			getOrgUnits().clear();
			getOrgUnits().addAll((Collection<? extends OrgUnit>) newValue);
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
		case OrganizationPackage.GROUP__ORG_UNITS:
			getOrgUnits().clear();
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
		case OrganizationPackage.GROUP__ORG_UNITS:
			return orgUnits != null && !orgUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // GroupImpl
