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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.ModelPackage;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.document.CompositeSection;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage;
import org.eclipse.emf.emfstore.client.test.model.document.LeafSection;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Leaf Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.document.impl.LeafSectionImpl#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.document.impl.LeafSectionImpl#getModelElements <em>Model
 * Elements</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.document.impl.LeafSectionImpl#getReferencedModelElements <em>
 * Referenced Model Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LeafSectionImpl extends UnicaseModelElementImpl implements LeafSection {
	/**
	 * The cached value of the '{@link #getModelElements() <em>Model Elements</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<UnicaseModelElement> modelElements;

	/**
	 * The cached value of the '{@link #getReferencedModelElements() <em>Referenced Model Elements</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferencedModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<UnicaseModelElement> referencedModelElements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LeafSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.LEAF_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompositeSection getParent() {
		if (eContainerFeatureID() != DocumentPackage.LEAF_SECTION__PARENT)
			return null;
		return (CompositeSection) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompositeSection basicGetParent() {
		if (eContainerFeatureID() != DocumentPackage.LEAF_SECTION__PARENT)
			return null;
		return (CompositeSection) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParent(CompositeSection newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, DocumentPackage.LEAF_SECTION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParent(CompositeSection newParent) {
		if (newParent != eInternalContainer()
			|| (eContainerFeatureID() != DocumentPackage.LEAF_SECTION__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.LEAF_SECTION__PARENT, newParent,
				newParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UnicaseModelElement> getModelElements() {
		if (modelElements == null) {
			modelElements = new EObjectContainmentWithInverseEList.Resolving<UnicaseModelElement>(
				UnicaseModelElement.class, this, DocumentPackage.LEAF_SECTION__MODEL_ELEMENTS,
				ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION);
		}
		return modelElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UnicaseModelElement> getReferencedModelElements() {
		if (referencedModelElements == null) {
			referencedModelElements = new EObjectWithInverseResolvingEList.ManyInverse<UnicaseModelElement>(
				UnicaseModelElement.class, this, DocumentPackage.LEAF_SECTION__REFERENCED_MODEL_ELEMENTS,
				ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES);
		}
		return referencedModelElements;
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
		case DocumentPackage.LEAF_SECTION__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((CompositeSection) otherEnd, msgs);
		case DocumentPackage.LEAF_SECTION__MODEL_ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getModelElements()).basicAdd(otherEnd, msgs);
		case DocumentPackage.LEAF_SECTION__REFERENCED_MODEL_ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferencedModelElements()).basicAdd(
				otherEnd, msgs);
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
		case DocumentPackage.LEAF_SECTION__PARENT:
			return basicSetParent(null, msgs);
		case DocumentPackage.LEAF_SECTION__MODEL_ELEMENTS:
			return ((InternalEList<?>) getModelElements()).basicRemove(otherEnd, msgs);
		case DocumentPackage.LEAF_SECTION__REFERENCED_MODEL_ELEMENTS:
			return ((InternalEList<?>) getReferencedModelElements()).basicRemove(otherEnd, msgs);
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
		case DocumentPackage.LEAF_SECTION__PARENT:
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
		case DocumentPackage.LEAF_SECTION__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case DocumentPackage.LEAF_SECTION__MODEL_ELEMENTS:
			return getModelElements();
		case DocumentPackage.LEAF_SECTION__REFERENCED_MODEL_ELEMENTS:
			return getReferencedModelElements();
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
		case DocumentPackage.LEAF_SECTION__PARENT:
			setParent((CompositeSection) newValue);
			return;
		case DocumentPackage.LEAF_SECTION__MODEL_ELEMENTS:
			getModelElements().clear();
			getModelElements().addAll((Collection<? extends UnicaseModelElement>) newValue);
			return;
		case DocumentPackage.LEAF_SECTION__REFERENCED_MODEL_ELEMENTS:
			getReferencedModelElements().clear();
			getReferencedModelElements().addAll((Collection<? extends UnicaseModelElement>) newValue);
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
		case DocumentPackage.LEAF_SECTION__PARENT:
			setParent((CompositeSection) null);
			return;
		case DocumentPackage.LEAF_SECTION__MODEL_ELEMENTS:
			getModelElements().clear();
			return;
		case DocumentPackage.LEAF_SECTION__REFERENCED_MODEL_ELEMENTS:
			getReferencedModelElements().clear();
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
		case DocumentPackage.LEAF_SECTION__PARENT:
			return basicGetParent() != null;
		case DocumentPackage.LEAF_SECTION__MODEL_ELEMENTS:
			return modelElements != null && !modelElements.isEmpty();
		case DocumentPackage.LEAF_SECTION__REFERENCED_MODEL_ELEMENTS:
			return referencedModelElements != null && !referencedModelElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // LeafSectionImpl
