/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.emfstore.client.test.model.component.Component;
import org.eclipse.emf.emfstore.client.test.model.component.ComponentPackage;
import org.eclipse.emf.emfstore.client.test.model.component.DeploymentNode;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Deployment Node</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.component.impl.DeploymentNodeImpl#getComponents <em>Components
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DeploymentNodeImpl extends UnicaseModelElementImpl implements DeploymentNode {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DeploymentNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.DEPLOYMENT_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<Component>(Component.class, this,
				ComponentPackage.DEPLOYMENT_NODE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentPackage.DEPLOYMENT_NODE__COMPONENTS:
			return getComponents();
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
		case ComponentPackage.DEPLOYMENT_NODE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
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
		case ComponentPackage.DEPLOYMENT_NODE__COMPONENTS:
			getComponents().clear();
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
		case ComponentPackage.DEPLOYMENT_NODE__COMPONENTS:
			return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DeploymentNodeImpl
