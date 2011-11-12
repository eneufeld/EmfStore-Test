/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.component;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.component.ComponentService#getOfferingComponent <em>Offering
 * Component</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.component.ComponentService#getConsumingComponents <em>Consuming
 * Components</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.component.ComponentPackage#getComponentService()
 * @model
 * @generated
 */
public interface ComponentService extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Offering Component</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.emfstore.client.test.model.component.Component#getOfferedServices
	 * <em>Offered Services</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offering Component</em>' container reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Offering Component</em>' container reference.
	 * @see #setOfferingComponent(Component)
	 * @see org.eclipse.emf.emfstore.client.test.model.component.ComponentPackage#getComponentService_OfferingComponent()
	 * @see org.eclipse.emf.emfstore.client.test.model.component.Component#getOfferedServices
	 * @model opposite="offeredServices" transient="false"
	 *        annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	Component getOfferingComponent();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.component.ComponentService#getOfferingComponent
	 * <em>Offering Component</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Offering Component</em>' container reference.
	 * @see #getOfferingComponent()
	 * @generated
	 */
	void setOfferingComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Consuming Components</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.component.Component}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.component.Component#getConsumedServices
	 * <em>Consumed Services</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consuming Components</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Consuming Components</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.component.ComponentPackage#getComponentService_ConsumingComponents()
	 * @see org.eclipse.emf.emfstore.client.test.model.component.Component#getConsumedServices
	 * @model opposite="consumedServices" annotation="org.unicase.ui.meeditor priority='10.0' position='right'"
	 * @generated
	 */
	EList<Component> getConsumingComponents();

} // ComponentService
