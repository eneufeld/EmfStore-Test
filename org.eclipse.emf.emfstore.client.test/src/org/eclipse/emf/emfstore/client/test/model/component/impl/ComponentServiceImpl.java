/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.component.Component;
import org.eclipse.emf.emfstore.client.test.model.component.ComponentPackage;
import org.eclipse.emf.emfstore.client.test.model.component.ComponentService;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.component.impl.ComponentServiceImpl#getOfferingComponent <em>
 * Offering Component</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.component.impl.ComponentServiceImpl#getConsumingComponents <em>
 * Consuming Components</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ComponentServiceImpl extends UnicaseModelElementImpl implements ComponentService {
	/**
	 * The cached value of the '{@link #getConsumingComponents() <em>Consuming Components</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConsumingComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> consumingComponents;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComponentServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Component getOfferingComponent() {
		if (eContainerFeatureID() != ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT)
			return null;
		return (Component) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Component basicGetOfferingComponent() {
		if (eContainerFeatureID() != ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT)
			return null;
		return (Component) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOfferingComponent(Component newOfferingComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOfferingComponent,
			ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOfferingComponent(Component newOfferingComponent) {
		if (newOfferingComponent != eInternalContainer()
			|| (eContainerFeatureID() != ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT && newOfferingComponent != null)) {
			if (EcoreUtil.isAncestor(this, newOfferingComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOfferingComponent != null)
				msgs = ((InternalEObject) newOfferingComponent).eInverseAdd(this,
					ComponentPackage.COMPONENT__OFFERED_SERVICES, Component.class, msgs);
			msgs = basicSetOfferingComponent(newOfferingComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT, newOfferingComponent, newOfferingComponent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Component> getConsumingComponents() {
		if (consumingComponents == null) {
			consumingComponents = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this,
				ComponentPackage.COMPONENT_SERVICE__CONSUMING_COMPONENTS, ComponentPackage.COMPONENT__CONSUMED_SERVICES);
		}
		return consumingComponents;
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
		case ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOfferingComponent((Component) otherEnd, msgs);
		case ComponentPackage.COMPONENT_SERVICE__CONSUMING_COMPONENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConsumingComponents()).basicAdd(otherEnd,
				msgs);
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
		case ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT:
			return basicSetOfferingComponent(null, msgs);
		case ComponentPackage.COMPONENT_SERVICE__CONSUMING_COMPONENTS:
			return ((InternalEList<?>) getConsumingComponents()).basicRemove(otherEnd, msgs);
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
		case ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT:
			return eInternalContainer().eInverseRemove(this, ComponentPackage.COMPONENT__OFFERED_SERVICES,
				Component.class, msgs);
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
		case ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT:
			if (resolve)
				return getOfferingComponent();
			return basicGetOfferingComponent();
		case ComponentPackage.COMPONENT_SERVICE__CONSUMING_COMPONENTS:
			return getConsumingComponents();
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
		case ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT:
			setOfferingComponent((Component) newValue);
			return;
		case ComponentPackage.COMPONENT_SERVICE__CONSUMING_COMPONENTS:
			getConsumingComponents().clear();
			getConsumingComponents().addAll((Collection<? extends Component>) newValue);
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
		case ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT:
			setOfferingComponent((Component) null);
			return;
		case ComponentPackage.COMPONENT_SERVICE__CONSUMING_COMPONENTS:
			getConsumingComponents().clear();
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
		case ComponentPackage.COMPONENT_SERVICE__OFFERING_COMPONENT:
			return basicGetOfferingComponent() != null;
		case ComponentPackage.COMPONENT_SERVICE__CONSUMING_COMPONENTS:
			return consumingComponents != null && !consumingComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ComponentServiceImpl
