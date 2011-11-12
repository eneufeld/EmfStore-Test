/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.util.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath;
import org.eclipse.emf.emfstore.client.test.model.util.UtilPackage;
import org.eclipse.emf.emfstore.common.model.ModelElementId;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Model Element Path</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.util.impl.ModelElementPathImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.util.impl.ModelElementPathImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.util.impl.ModelElementPathImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ModelElementPathImpl extends EObjectImpl implements ModelElementPath {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ModelElementId source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ModelElementId target;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElementId> path;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModelElementPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilPackage.Literals.MODEL_ELEMENT_PATH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelElementId getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ModelElementId) eResolveProxy(oldSource);
			if (source != oldSource) {
				InternalEObject newSource = (InternalEObject) source;
				NotificationChain msgs = oldSource.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- UtilPackage.MODEL_ELEMENT_PATH__SOURCE, null, null);
				if (newSource.eInternalContainer() == null) {
					msgs = newSource.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UtilPackage.MODEL_ELEMENT_PATH__SOURCE,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UtilPackage.MODEL_ELEMENT_PATH__SOURCE,
						oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelElementId basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSource(ModelElementId newSource, NotificationChain msgs) {
		ModelElementId oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				UtilPackage.MODEL_ELEMENT_PATH__SOURCE, oldSource, newSource);
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
	public void setSource(ModelElementId newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- UtilPackage.MODEL_ELEMENT_PATH__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
					- UtilPackage.MODEL_ELEMENT_PATH__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.MODEL_ELEMENT_PATH__SOURCE, newSource,
				newSource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelElementId getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (ModelElementId) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject) target;
				NotificationChain msgs = oldTarget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- UtilPackage.MODEL_ELEMENT_PATH__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UtilPackage.MODEL_ELEMENT_PATH__TARGET,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UtilPackage.MODEL_ELEMENT_PATH__TARGET,
						oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelElementId basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTarget(ModelElementId newTarget, NotificationChain msgs) {
		ModelElementId oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				UtilPackage.MODEL_ELEMENT_PATH__TARGET, oldTarget, newTarget);
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
	public void setTarget(ModelElementId newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- UtilPackage.MODEL_ELEMENT_PATH__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
					- UtilPackage.MODEL_ELEMENT_PATH__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.MODEL_ELEMENT_PATH__TARGET, newTarget,
				newTarget));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ModelElementId> getPath() {
		if (path == null) {
			path = new EObjectContainmentEList.Resolving<ModelElementId>(ModelElementId.class, this,
				UtilPackage.MODEL_ELEMENT_PATH__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UtilPackage.MODEL_ELEMENT_PATH__SOURCE:
			return basicSetSource(null, msgs);
		case UtilPackage.MODEL_ELEMENT_PATH__TARGET:
			return basicSetTarget(null, msgs);
		case UtilPackage.MODEL_ELEMENT_PATH__PATH:
			return ((InternalEList<?>) getPath()).basicRemove(otherEnd, msgs);
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
		case UtilPackage.MODEL_ELEMENT_PATH__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case UtilPackage.MODEL_ELEMENT_PATH__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case UtilPackage.MODEL_ELEMENT_PATH__PATH:
			return getPath();
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
		case UtilPackage.MODEL_ELEMENT_PATH__SOURCE:
			setSource((ModelElementId) newValue);
			return;
		case UtilPackage.MODEL_ELEMENT_PATH__TARGET:
			setTarget((ModelElementId) newValue);
			return;
		case UtilPackage.MODEL_ELEMENT_PATH__PATH:
			getPath().clear();
			getPath().addAll((Collection<? extends ModelElementId>) newValue);
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
		case UtilPackage.MODEL_ELEMENT_PATH__SOURCE:
			setSource((ModelElementId) null);
			return;
		case UtilPackage.MODEL_ELEMENT_PATH__TARGET:
			setTarget((ModelElementId) null);
			return;
		case UtilPackage.MODEL_ELEMENT_PATH__PATH:
			getPath().clear();
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
		case UtilPackage.MODEL_ELEMENT_PATH__SOURCE:
			return source != null;
		case UtilPackage.MODEL_ELEMENT_PATH__TARGET:
			return target != null;
		case UtilPackage.MODEL_ELEMENT_PATH__PATH:
			return path != null && !path.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ModelElementPathImpl
