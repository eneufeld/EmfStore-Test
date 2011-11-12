/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.meeting.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.emfstore.client.test.model.meeting.IssueMeetingSection;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage;
import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Issue Meeting Section</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.IssueMeetingSectionImpl#getIncludedIssues <em>
 * Included Issues</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IssueMeetingSectionImpl extends MeetingSectionImpl implements IssueMeetingSection {
	/**
	 * The cached value of the '{@link #getIncludedIssues() <em>Included Issues</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncludedIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> includedIssues;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IssueMeetingSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeetingPackage.Literals.ISSUE_MEETING_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Issue> getIncludedIssues() {
		if (includedIssues == null) {
			includedIssues = new EObjectResolvingEList<Issue>(Issue.class, this,
				MeetingPackage.ISSUE_MEETING_SECTION__INCLUDED_ISSUES);
		}
		return includedIssues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MeetingPackage.ISSUE_MEETING_SECTION__INCLUDED_ISSUES:
			return getIncludedIssues();
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
		case MeetingPackage.ISSUE_MEETING_SECTION__INCLUDED_ISSUES:
			getIncludedIssues().clear();
			getIncludedIssues().addAll((Collection<? extends Issue>) newValue);
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
		case MeetingPackage.ISSUE_MEETING_SECTION__INCLUDED_ISSUES:
			getIncludedIssues().clear();
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
		case MeetingPackage.ISSUE_MEETING_SECTION__INCLUDED_ISSUES:
			return includedIssues != null && !includedIssues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // IssueMeetingSectionImpl
