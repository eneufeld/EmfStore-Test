/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.test.model.ModelPackage;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;
import org.eclipse.emf.emfstore.client.test.model.rationale.Comment;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Comment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.CommentImpl#getSender <em>Sender</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.CommentImpl#getRecipients <em>Recipients</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.CommentImpl#getCommentedElement <em>Commented
 * Element</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CommentImpl extends UnicaseModelElementImpl implements Comment {
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected OrgUnit sender;

	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipients</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgUnit> recipients;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrgUnit getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject) sender;
			sender = (OrgUnit) eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RationalePackage.COMMENT__SENDER,
						oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrgUnit basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSender(OrgUnit newSender) {
		OrgUnit oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.COMMENT__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OrgUnit> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectResolvingEList<OrgUnit>(OrgUnit.class, this, RationalePackage.COMMENT__RECIPIENTS);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnicaseModelElement getCommentedElement() {
		if (eContainerFeatureID() != RationalePackage.COMMENT__COMMENTED_ELEMENT)
			return null;
		return (UnicaseModelElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnicaseModelElement basicGetCommentedElement() {
		if (eContainerFeatureID() != RationalePackage.COMMENT__COMMENTED_ELEMENT)
			return null;
		return (UnicaseModelElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCommentedElement(UnicaseModelElement newCommentedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCommentedElement, RationalePackage.COMMENT__COMMENTED_ELEMENT,
			msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCommentedElement(UnicaseModelElement newCommentedElement) {
		if (newCommentedElement != eInternalContainer()
			|| (eContainerFeatureID() != RationalePackage.COMMENT__COMMENTED_ELEMENT && newCommentedElement != null)) {
			if (EcoreUtil.isAncestor(this, newCommentedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCommentedElement != null)
				msgs = ((InternalEObject) newCommentedElement).eInverseAdd(this,
					ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS, UnicaseModelElement.class, msgs);
			msgs = basicSetCommentedElement(newCommentedElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.COMMENT__COMMENTED_ELEMENT,
				newCommentedElement, newCommentedElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RationalePackage.COMMENT__COMMENTED_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCommentedElement((UnicaseModelElement) otherEnd, msgs);
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
		case RationalePackage.COMMENT__COMMENTED_ELEMENT:
			return basicSetCommentedElement(null, msgs);
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
		case RationalePackage.COMMENT__COMMENTED_ELEMENT:
			return eInternalContainer().eInverseRemove(this, ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS,
				UnicaseModelElement.class, msgs);
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
		case RationalePackage.COMMENT__SENDER:
			if (resolve)
				return getSender();
			return basicGetSender();
		case RationalePackage.COMMENT__RECIPIENTS:
			return getRecipients();
		case RationalePackage.COMMENT__COMMENTED_ELEMENT:
			if (resolve)
				return getCommentedElement();
			return basicGetCommentedElement();
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
		case RationalePackage.COMMENT__SENDER:
			setSender((OrgUnit) newValue);
			return;
		case RationalePackage.COMMENT__RECIPIENTS:
			getRecipients().clear();
			getRecipients().addAll((Collection<? extends OrgUnit>) newValue);
			return;
		case RationalePackage.COMMENT__COMMENTED_ELEMENT:
			setCommentedElement((UnicaseModelElement) newValue);
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
		case RationalePackage.COMMENT__SENDER:
			setSender((OrgUnit) null);
			return;
		case RationalePackage.COMMENT__RECIPIENTS:
			getRecipients().clear();
			return;
		case RationalePackage.COMMENT__COMMENTED_ELEMENT:
			setCommentedElement((UnicaseModelElement) null);
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
		case RationalePackage.COMMENT__SENDER:
			return sender != null;
		case RationalePackage.COMMENT__RECIPIENTS:
			return recipients != null && !recipients.isEmpty();
		case RationalePackage.COMMENT__COMMENTED_ELEMENT:
			return basicGetCommentedElement() != null;
		}
		return super.eIsSet(featureID);
	}

} // CommentImpl
