/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "util";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/util";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.util";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	UtilPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.util.impl.UtilPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.util.impl.ModelElementPathImpl
	 * <em>Model Element Path</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.util.impl.ModelElementPathImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.util.impl.UtilPackageImpl#getModelElementPath()
	 * @generated
	 */
	int MODEL_ELEMENT_PATH = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_PATH__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_PATH__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_PATH__PATH = 2;

	/**
	 * The number of structural features of the '<em>Model Element Path</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_PATH_FEATURE_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath
	 * <em>Model Element Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Model Element Path</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath
	 * @generated
	 */
	EClass getModelElementPath();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getSource()
	 * @see #getModelElementPath()
	 * @generated
	 */
	EReference getModelElementPath_Source();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getTarget()
	 * @see #getModelElementPath()
	 * @generated
	 */
	EReference getModelElementPath_Target();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getPath <em>Path</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.util.ModelElementPath#getPath()
	 * @see #getModelElementPath()
	 * @generated
	 */
	EReference getModelElementPath_Path();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilFactory getUtilFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.util.impl.ModelElementPathImpl <em>Model Element Path</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.util.impl.ModelElementPathImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.util.impl.UtilPackageImpl#getModelElementPath()
		 * @generated
		 */
		EClass MODEL_ELEMENT_PATH = eINSTANCE.getModelElementPath();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODEL_ELEMENT_PATH__SOURCE = eINSTANCE.getModelElementPath_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODEL_ELEMENT_PATH__TARGET = eINSTANCE.getModelElementPath_Target();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODEL_ELEMENT_PATH__PATH = eINSTANCE.getModelElementPath_Path();

	}

} // UtilPackage
