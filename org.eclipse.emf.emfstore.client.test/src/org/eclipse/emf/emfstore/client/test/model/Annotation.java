/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Annotation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.Annotation#getAnnotatedModelElements <em>Annotated Model
 * Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface Annotation extends UnicaseModelElement {
	/**
	 * Returns the value of the '<em><b>Annotated Model Elements</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAnnotations <em>Annotations</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Model Elements</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Annotated Model Elements</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getAnnotation_AnnotatedModelElements()
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAnnotations
	 * @model opposite="annotations" annotation="org.unicase.ui.meeditor priority='90.0' position='right'"
	 * @generated
	 */
	EList<UnicaseModelElement> getAnnotatedModelElements();

} // Annotation
