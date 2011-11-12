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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.release.Release;
import org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage;
import org.eclipse.emf.emfstore.client.test.model.release.SourceCodeRepositoryStream;
import org.eclipse.emf.emfstore.client.test.model.release.Stream;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stream</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.impl.StreamImpl#getReleases <em>Releases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.impl.StreamImpl#getSourceCodeRepositoryStream <em>
 * Source Code Repository Stream</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StreamImpl extends EObjectImpl implements Stream {
	/**
	 * The cached value of the '{@link #getReleases() <em>Releases</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReleases()
	 * @generated
	 * @ordered
	 */
	protected EList<Release> releases;

	/**
	 * The cached value of the '{@link #getSourceCodeRepositoryStream() <em>Source Code Repository Stream</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSourceCodeRepositoryStream()
	 * @generated
	 * @ordered
	 */
	protected SourceCodeRepositoryStream sourceCodeRepositoryStream;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReleasePackage.Literals.STREAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Release> getReleases() {
		if (releases == null) {
			releases = new EObjectContainmentWithInverseEList.Resolving<Release>(Release.class, this,
				ReleasePackage.STREAM__RELEASES, ReleasePackage.RELEASE__STREAM);
		}
		return releases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceCodeRepositoryStream getSourceCodeRepositoryStream() {
		if (sourceCodeRepositoryStream != null && sourceCodeRepositoryStream.eIsProxy()) {
			InternalEObject oldSourceCodeRepositoryStream = (InternalEObject) sourceCodeRepositoryStream;
			sourceCodeRepositoryStream = (SourceCodeRepositoryStream) eResolveProxy(oldSourceCodeRepositoryStream);
			if (sourceCodeRepositoryStream != oldSourceCodeRepositoryStream) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						ReleasePackage.STREAM__SOURCE_CODE_REPOSITORY_STREAM, oldSourceCodeRepositoryStream,
						sourceCodeRepositoryStream));
			}
		}
		return sourceCodeRepositoryStream;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceCodeRepositoryStream basicGetSourceCodeRepositoryStream() {
		return sourceCodeRepositoryStream;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceCodeRepositoryStream(SourceCodeRepositoryStream newSourceCodeRepositoryStream) {
		SourceCodeRepositoryStream oldSourceCodeRepositoryStream = sourceCodeRepositoryStream;
		sourceCodeRepositoryStream = newSourceCodeRepositoryStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReleasePackage.STREAM__SOURCE_CODE_REPOSITORY_STREAM,
				oldSourceCodeRepositoryStream, sourceCodeRepositoryStream));
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
		case ReleasePackage.STREAM__RELEASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReleases()).basicAdd(otherEnd, msgs);
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
		case ReleasePackage.STREAM__RELEASES:
			return ((InternalEList<?>) getReleases()).basicRemove(otherEnd, msgs);
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
		case ReleasePackage.STREAM__RELEASES:
			return getReleases();
		case ReleasePackage.STREAM__SOURCE_CODE_REPOSITORY_STREAM:
			if (resolve)
				return getSourceCodeRepositoryStream();
			return basicGetSourceCodeRepositoryStream();
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
		case ReleasePackage.STREAM__RELEASES:
			getReleases().clear();
			getReleases().addAll((Collection<? extends Release>) newValue);
			return;
		case ReleasePackage.STREAM__SOURCE_CODE_REPOSITORY_STREAM:
			setSourceCodeRepositoryStream((SourceCodeRepositoryStream) newValue);
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
		case ReleasePackage.STREAM__RELEASES:
			getReleases().clear();
			return;
		case ReleasePackage.STREAM__SOURCE_CODE_REPOSITORY_STREAM:
			setSourceCodeRepositoryStream((SourceCodeRepositoryStream) null);
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
		case ReleasePackage.STREAM__RELEASES:
			return releases != null && !releases.isEmpty();
		case ReleasePackage.STREAM__SOURCE_CODE_REPOSITORY_STREAM:
			return sourceCodeRepositoryStream != null;
		}
		return super.eIsSet(featureID);
	}

} // StreamImpl
