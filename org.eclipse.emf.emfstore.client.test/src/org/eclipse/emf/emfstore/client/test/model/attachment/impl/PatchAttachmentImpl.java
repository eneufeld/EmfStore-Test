/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.attachment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.attachment.AttachmentPackage;
import org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment;
import org.eclipse.emf.emfstore.client.test.model.release.Release;
import org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Patch Attachment</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.attachment.impl.PatchAttachmentImpl#getAppliedTo <em>Applied To
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PatchAttachmentImpl extends FileAttachmentImpl implements PatchAttachment {
	/**
	 * The cached value of the '{@link #getAppliedTo() <em>Applied To</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAppliedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Release> appliedTo;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PatchAttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttachmentPackage.Literals.PATCH_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Release> getAppliedTo() {
		if (appliedTo == null) {
			appliedTo = new EObjectWithInverseResolvingEList.ManyInverse<Release>(Release.class, this,
				AttachmentPackage.PATCH_ATTACHMENT__APPLIED_TO, ReleasePackage.RELEASE__APPLIED_PATCHES);
		}
		return appliedTo;
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
		case AttachmentPackage.PATCH_ATTACHMENT__APPLIED_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAppliedTo()).basicAdd(otherEnd, msgs);
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
		case AttachmentPackage.PATCH_ATTACHMENT__APPLIED_TO:
			return ((InternalEList<?>) getAppliedTo()).basicRemove(otherEnd, msgs);
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
		case AttachmentPackage.PATCH_ATTACHMENT__APPLIED_TO:
			return getAppliedTo();
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
		case AttachmentPackage.PATCH_ATTACHMENT__APPLIED_TO:
			getAppliedTo().clear();
			getAppliedTo().addAll((Collection<? extends Release>) newValue);
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
		case AttachmentPackage.PATCH_ATTACHMENT__APPLIED_TO:
			getAppliedTo().clear();
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
		case AttachmentPackage.PATCH_ATTACHMENT__APPLIED_TO:
			return appliedTo != null && !appliedTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PatchAttachmentImpl
