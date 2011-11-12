/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.release.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.attachment.AttachmentPackage;
import org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment;
import org.eclipse.emf.emfstore.client.test.model.release.Release;
import org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage;
import org.eclipse.emf.emfstore.client.test.model.release.SourceCodeRepositoryRevision;
import org.eclipse.emf.emfstore.client.test.model.release.Stream;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Release</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl#getStream <em>Stream</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl#getPredecessor <em>Predecessor</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl#getSuccessor <em>Successor</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl#getAppliedPatches <em>Applied Patches
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl#getIncludedWorkItems <em>Included Work
 * Items</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl#getSourceCodeRepositoryRevision <em>
 * Source Code Repository Revision</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReleaseImpl extends EObjectImpl implements Release {
	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Release predecessor;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected Release successor;

	/**
	 * The cached value of the '{@link #getAppliedPatches() <em>Applied Patches</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAppliedPatches()
	 * @generated
	 * @ordered
	 */
	protected EList<PatchAttachment> appliedPatches;

	/**
	 * The cached value of the '{@link #getIncludedWorkItems() <em>Included Work Items</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncludedWorkItems()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkItem> includedWorkItems;

	/**
	 * The cached value of the '{@link #getSourceCodeRepositoryRevision() <em>Source Code Repository Revision</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSourceCodeRepositoryRevision()
	 * @generated
	 * @ordered
	 */
	protected SourceCodeRepositoryRevision sourceCodeRepositoryRevision;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReleaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReleasePackage.Literals.RELEASE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Stream getStream() {
		if (eContainerFeatureID() != ReleasePackage.RELEASE__STREAM)
			return null;
		return (Stream) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Stream basicGetStream() {
		if (eContainerFeatureID() != ReleasePackage.RELEASE__STREAM)
			return null;
		return (Stream) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStream(Stream newStream, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStream, ReleasePackage.RELEASE__STREAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStream(Stream newStream) {
		if (newStream != eInternalContainer()
			|| (eContainerFeatureID() != ReleasePackage.RELEASE__STREAM && newStream != null)) {
			if (EcoreUtil.isAncestor(this, newStream))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStream != null)
				msgs = ((InternalEObject) newStream).eInverseAdd(this, ReleasePackage.STREAM__RELEASES, Stream.class,
					msgs);
			msgs = basicSetStream(newStream, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReleasePackage.RELEASE__STREAM, newStream, newStream));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Release getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject) predecessor;
			predecessor = (Release) eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReleasePackage.RELEASE__PREDECESSOR,
						oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Release basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(Release newPredecessor, NotificationChain msgs) {
		Release oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				ReleasePackage.RELEASE__PREDECESSOR, oldPredecessor, newPredecessor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPredecessor(Release newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null)
				msgs = ((InternalEObject) predecessor).eInverseRemove(this, ReleasePackage.RELEASE__SUCCESSOR,
					Release.class, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject) newPredecessor).eInverseAdd(this, ReleasePackage.RELEASE__SUCCESSOR,
					Release.class, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReleasePackage.RELEASE__PREDECESSOR, newPredecessor,
				newPredecessor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Release getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject) successor;
			successor = (Release) eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReleasePackage.RELEASE__SUCCESSOR,
						oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Release basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSuccessor(Release newSuccessor, NotificationChain msgs) {
		Release oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				ReleasePackage.RELEASE__SUCCESSOR, oldSuccessor, newSuccessor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSuccessor(Release newSuccessor) {
		if (newSuccessor != successor) {
			NotificationChain msgs = null;
			if (successor != null)
				msgs = ((InternalEObject) successor).eInverseRemove(this, ReleasePackage.RELEASE__PREDECESSOR,
					Release.class, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject) newSuccessor).eInverseAdd(this, ReleasePackage.RELEASE__PREDECESSOR,
					Release.class, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReleasePackage.RELEASE__SUCCESSOR, newSuccessor,
				newSuccessor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PatchAttachment> getAppliedPatches() {
		if (appliedPatches == null) {
			appliedPatches = new EObjectWithInverseResolvingEList.ManyInverse<PatchAttachment>(PatchAttachment.class,
				this, ReleasePackage.RELEASE__APPLIED_PATCHES, AttachmentPackage.PATCH_ATTACHMENT__APPLIED_TO);
		}
		return appliedPatches;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<WorkItem> getIncludedWorkItems() {
		if (includedWorkItems == null) {
			includedWorkItems = new EObjectWithInverseResolvingEList.ManyInverse<WorkItem>(WorkItem.class, this,
				ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS, TaskPackage.WORK_ITEM__INCLUDING_RELEASES);
		}
		return includedWorkItems;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceCodeRepositoryRevision getSourceCodeRepositoryRevision() {
		if (sourceCodeRepositoryRevision != null && sourceCodeRepositoryRevision.eIsProxy()) {
			InternalEObject oldSourceCodeRepositoryRevision = (InternalEObject) sourceCodeRepositoryRevision;
			sourceCodeRepositoryRevision = (SourceCodeRepositoryRevision) eResolveProxy(oldSourceCodeRepositoryRevision);
			if (sourceCodeRepositoryRevision != oldSourceCodeRepositoryRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						ReleasePackage.RELEASE__SOURCE_CODE_REPOSITORY_REVISION, oldSourceCodeRepositoryRevision,
						sourceCodeRepositoryRevision));
			}
		}
		return sourceCodeRepositoryRevision;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceCodeRepositoryRevision basicGetSourceCodeRepositoryRevision() {
		return sourceCodeRepositoryRevision;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceCodeRepositoryRevision(SourceCodeRepositoryRevision newSourceCodeRepositoryRevision) {
		SourceCodeRepositoryRevision oldSourceCodeRepositoryRevision = sourceCodeRepositoryRevision;
		sourceCodeRepositoryRevision = newSourceCodeRepositoryRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				ReleasePackage.RELEASE__SOURCE_CODE_REPOSITORY_REVISION, oldSourceCodeRepositoryRevision,
				sourceCodeRepositoryRevision));
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
		case ReleasePackage.RELEASE__STREAM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStream((Stream) otherEnd, msgs);
		case ReleasePackage.RELEASE__PREDECESSOR:
			if (predecessor != null)
				msgs = ((InternalEObject) predecessor).eInverseRemove(this, ReleasePackage.RELEASE__SUCCESSOR,
					Release.class, msgs);
			return basicSetPredecessor((Release) otherEnd, msgs);
		case ReleasePackage.RELEASE__SUCCESSOR:
			if (successor != null)
				msgs = ((InternalEObject) successor).eInverseRemove(this, ReleasePackage.RELEASE__PREDECESSOR,
					Release.class, msgs);
			return basicSetSuccessor((Release) otherEnd, msgs);
		case ReleasePackage.RELEASE__APPLIED_PATCHES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAppliedPatches()).basicAdd(otherEnd, msgs);
		case ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncludedWorkItems())
				.basicAdd(otherEnd, msgs);
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
		case ReleasePackage.RELEASE__STREAM:
			return basicSetStream(null, msgs);
		case ReleasePackage.RELEASE__PREDECESSOR:
			return basicSetPredecessor(null, msgs);
		case ReleasePackage.RELEASE__SUCCESSOR:
			return basicSetSuccessor(null, msgs);
		case ReleasePackage.RELEASE__APPLIED_PATCHES:
			return ((InternalEList<?>) getAppliedPatches()).basicRemove(otherEnd, msgs);
		case ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS:
			return ((InternalEList<?>) getIncludedWorkItems()).basicRemove(otherEnd, msgs);
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
		case ReleasePackage.RELEASE__STREAM:
			return eInternalContainer().eInverseRemove(this, ReleasePackage.STREAM__RELEASES, Stream.class, msgs);
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
		case ReleasePackage.RELEASE__STREAM:
			if (resolve)
				return getStream();
			return basicGetStream();
		case ReleasePackage.RELEASE__PREDECESSOR:
			if (resolve)
				return getPredecessor();
			return basicGetPredecessor();
		case ReleasePackage.RELEASE__SUCCESSOR:
			if (resolve)
				return getSuccessor();
			return basicGetSuccessor();
		case ReleasePackage.RELEASE__APPLIED_PATCHES:
			return getAppliedPatches();
		case ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS:
			return getIncludedWorkItems();
		case ReleasePackage.RELEASE__SOURCE_CODE_REPOSITORY_REVISION:
			if (resolve)
				return getSourceCodeRepositoryRevision();
			return basicGetSourceCodeRepositoryRevision();
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
		case ReleasePackage.RELEASE__STREAM:
			setStream((Stream) newValue);
			return;
		case ReleasePackage.RELEASE__PREDECESSOR:
			setPredecessor((Release) newValue);
			return;
		case ReleasePackage.RELEASE__SUCCESSOR:
			setSuccessor((Release) newValue);
			return;
		case ReleasePackage.RELEASE__APPLIED_PATCHES:
			getAppliedPatches().clear();
			getAppliedPatches().addAll((Collection<? extends PatchAttachment>) newValue);
			return;
		case ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS:
			getIncludedWorkItems().clear();
			getIncludedWorkItems().addAll((Collection<? extends WorkItem>) newValue);
			return;
		case ReleasePackage.RELEASE__SOURCE_CODE_REPOSITORY_REVISION:
			setSourceCodeRepositoryRevision((SourceCodeRepositoryRevision) newValue);
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
		case ReleasePackage.RELEASE__STREAM:
			setStream((Stream) null);
			return;
		case ReleasePackage.RELEASE__PREDECESSOR:
			setPredecessor((Release) null);
			return;
		case ReleasePackage.RELEASE__SUCCESSOR:
			setSuccessor((Release) null);
			return;
		case ReleasePackage.RELEASE__APPLIED_PATCHES:
			getAppliedPatches().clear();
			return;
		case ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS:
			getIncludedWorkItems().clear();
			return;
		case ReleasePackage.RELEASE__SOURCE_CODE_REPOSITORY_REVISION:
			setSourceCodeRepositoryRevision((SourceCodeRepositoryRevision) null);
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
		case ReleasePackage.RELEASE__STREAM:
			return basicGetStream() != null;
		case ReleasePackage.RELEASE__PREDECESSOR:
			return predecessor != null;
		case ReleasePackage.RELEASE__SUCCESSOR:
			return successor != null;
		case ReleasePackage.RELEASE__APPLIED_PATCHES:
			return appliedPatches != null && !appliedPatches.isEmpty();
		case ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS:
			return includedWorkItems != null && !includedWorkItems.isEmpty();
		case ReleasePackage.RELEASE__SOURCE_CODE_REPOSITORY_REVISION:
			return sourceCodeRepositoryRevision != null;
		}
		return super.eIsSet(featureID);
	}

} // ReleaseImpl
