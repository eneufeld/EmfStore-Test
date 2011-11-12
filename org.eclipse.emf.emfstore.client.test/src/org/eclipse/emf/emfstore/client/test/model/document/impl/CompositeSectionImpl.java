/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.document.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.document.CompositeSection;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage;
import org.eclipse.emf.emfstore.client.test.model.document.Section;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Composite Section</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.document.impl.CompositeSectionImpl#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.document.impl.CompositeSectionImpl#getSubsections <em>
 * Subsections</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CompositeSectionImpl extends UnicaseModelElementImpl implements CompositeSection {
	/**
	 * The cached value of the '{@link #getSubsections() <em>Subsections</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubsections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> subsections;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompositeSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.COMPOSITE_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompositeSection getParent() {
		if (eContainerFeatureID() != DocumentPackage.COMPOSITE_SECTION__PARENT)
			return null;
		return (CompositeSection) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompositeSection basicGetParent() {
		if (eContainerFeatureID() != DocumentPackage.COMPOSITE_SECTION__PARENT)
			return null;
		return (CompositeSection) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParent(CompositeSection newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, DocumentPackage.COMPOSITE_SECTION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParent(CompositeSection newParent) {
		if (newParent != eInternalContainer()
			|| (eContainerFeatureID() != DocumentPackage.COMPOSITE_SECTION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS,
					CompositeSection.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.COMPOSITE_SECTION__PARENT, newParent,
				newParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Section> getSubsections() {
		if (subsections == null) {
			subsections = new EObjectContainmentWithInverseEList.Resolving<Section>(Section.class, this,
				DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS, DocumentPackage.SECTION__PARENT);
		}
		return subsections;
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
		case DocumentPackage.COMPOSITE_SECTION__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((CompositeSection) otherEnd, msgs);
		case DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubsections()).basicAdd(otherEnd, msgs);
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
		case DocumentPackage.COMPOSITE_SECTION__PARENT:
			return basicSetParent(null, msgs);
		case DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS:
			return ((InternalEList<?>) getSubsections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case DocumentPackage.COMPOSITE_SECTION__PARENT:
			return eInternalContainer().eInverseRemove(this, DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS,
				CompositeSection.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DocumentPackage.COMPOSITE_SECTION__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS:
			return getSubsections();
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
		case DocumentPackage.COMPOSITE_SECTION__PARENT:
			setParent((CompositeSection) newValue);
			return;
		case DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS:
			getSubsections().clear();
			getSubsections().addAll((Collection<? extends Section>) newValue);
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
		case DocumentPackage.COMPOSITE_SECTION__PARENT:
			setParent((CompositeSection) null);
			return;
		case DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS:
			getSubsections().clear();
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
		case DocumentPackage.COMPOSITE_SECTION__PARENT:
			return basicGetParent() != null;
		case DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS:
			return subsections != null && !subsections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CompositeSectionImpl
