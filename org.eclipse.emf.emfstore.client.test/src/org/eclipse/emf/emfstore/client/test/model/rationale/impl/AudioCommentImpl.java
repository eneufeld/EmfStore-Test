/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.emfstore.client.test.model.attachment.FileAttachment;
import org.eclipse.emf.emfstore.client.test.model.rationale.AudioComment;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Audio Comment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.AudioCommentImpl#getAudioFile <em>Audio File
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AudioCommentImpl extends EObjectImpl implements AudioComment {
	/**
	 * The cached value of the '{@link #getAudioFile() <em>Audio File</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getAudioFile()
	 * @generated
	 * @ordered
	 */
	protected FileAttachment audioFile;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AudioCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.AUDIO_COMMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FileAttachment getAudioFile() {
		if (audioFile != null && audioFile.eIsProxy()) {
			InternalEObject oldAudioFile = (InternalEObject) audioFile;
			audioFile = (FileAttachment) eResolveProxy(oldAudioFile);
			if (audioFile != oldAudioFile) {
				InternalEObject newAudioFile = (InternalEObject) audioFile;
				NotificationChain msgs = oldAudioFile.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- RationalePackage.AUDIO_COMMENT__AUDIO_FILE, null, null);
				if (newAudioFile.eInternalContainer() == null) {
					msgs = newAudioFile.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- RationalePackage.AUDIO_COMMENT__AUDIO_FILE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						RationalePackage.AUDIO_COMMENT__AUDIO_FILE, oldAudioFile, audioFile));
			}
		}
		return audioFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FileAttachment basicGetAudioFile() {
		return audioFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAudioFile(FileAttachment newAudioFile, NotificationChain msgs) {
		FileAttachment oldAudioFile = audioFile;
		audioFile = newAudioFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				RationalePackage.AUDIO_COMMENT__AUDIO_FILE, oldAudioFile, newAudioFile);
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
	public void setAudioFile(FileAttachment newAudioFile) {
		if (newAudioFile != audioFile) {
			NotificationChain msgs = null;
			if (audioFile != null)
				msgs = ((InternalEObject) audioFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- RationalePackage.AUDIO_COMMENT__AUDIO_FILE, null, msgs);
			if (newAudioFile != null)
				msgs = ((InternalEObject) newAudioFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
					- RationalePackage.AUDIO_COMMENT__AUDIO_FILE, null, msgs);
			msgs = basicSetAudioFile(newAudioFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.AUDIO_COMMENT__AUDIO_FILE,
				newAudioFile, newAudioFile));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RationalePackage.AUDIO_COMMENT__AUDIO_FILE:
			return basicSetAudioFile(null, msgs);
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
		case RationalePackage.AUDIO_COMMENT__AUDIO_FILE:
			if (resolve)
				return getAudioFile();
			return basicGetAudioFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RationalePackage.AUDIO_COMMENT__AUDIO_FILE:
			setAudioFile((FileAttachment) newValue);
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
		case RationalePackage.AUDIO_COMMENT__AUDIO_FILE:
			setAudioFile((FileAttachment) null);
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
		case RationalePackage.AUDIO_COMMENT__AUDIO_FILE:
			return audioFile != null;
		}
		return super.eIsSet(featureID);
	}

} // AudioCommentImpl
