/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.common.model.ModelElementId;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Model Element Path</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getSource <em>Source</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getTarget <em>Target</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.util.UtilPackage#getModelElementPath()
 * @model
 * @generated
 */
public interface ModelElementPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ModelElementId)
	 * @see org.eclipse.emf.emfstore.client.test.model.util.UtilPackage#getModelElementPath_Source()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ModelElementId getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getSource
	 * <em>Source</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ModelElementId value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ModelElementId)
	 * @see org.eclipse.emf.emfstore.client.test.model.util.UtilPackage#getModelElementPath_Target()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ModelElementId getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getTarget
	 * <em>Target</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ModelElementId value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.common.model.ModelElementId}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.util.UtilPackage#getModelElementPath_Path()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ModelElementId> getPath();

} // ModelElementPath
