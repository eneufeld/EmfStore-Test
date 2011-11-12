/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.testmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.testmodel.TestElement;
import org.eclipse.emf.emfstore.client.test.testmodel.TestmodelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Test Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.emfstore.client.test.testmodel.impl.TestElementImpl#getStrings <em>Strings</em>}</li>
 *   <li>{@link org.eclipse.emf.emfstore.client.test.testmodel.impl.TestElementImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipse.emf.emfstore.client.test.testmodel.impl.TestElementImpl#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestElementImpl extends EObjectImpl implements TestElement {
	/**
	 * The cached value of the '{@link #getStrings() <em>Strings</em>}' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStrings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> strings;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<TestElement> references;

	/**
	 * The cached value of the '{@link #getContainedElements() <em>Contained Elements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TestElement> containedElements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TestElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestmodelPackage.Literals.TEST_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStrings() {
		if (strings == null) {
			strings = new EDataTypeUniqueEList<String>(String.class, this, TestmodelPackage.TEST_ELEMENT__STRINGS);
		}
		return strings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestElement> getReferences() {
		if (references == null) {
			references = new EObjectResolvingEList<TestElement>(TestElement.class, this, TestmodelPackage.TEST_ELEMENT__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestElement> getContainedElements() {
		if (containedElements == null) {
			containedElements = new EObjectContainmentEList<TestElement>(TestElement.class, this, TestmodelPackage.TEST_ELEMENT__CONTAINED_ELEMENTS);
		}
		return containedElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestmodelPackage.TEST_ELEMENT__CONTAINED_ELEMENTS:
				return ((InternalEList<?>)getContainedElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestmodelPackage.TEST_ELEMENT__STRINGS:
				return getStrings();
			case TestmodelPackage.TEST_ELEMENT__REFERENCES:
				return getReferences();
			case TestmodelPackage.TEST_ELEMENT__CONTAINED_ELEMENTS:
				return getContainedElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestmodelPackage.TEST_ELEMENT__STRINGS:
				getStrings().clear();
				getStrings().addAll((Collection<? extends String>)newValue);
				return;
			case TestmodelPackage.TEST_ELEMENT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends TestElement>)newValue);
				return;
			case TestmodelPackage.TEST_ELEMENT__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				getContainedElements().addAll((Collection<? extends TestElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestmodelPackage.TEST_ELEMENT__STRINGS:
				getStrings().clear();
				return;
			case TestmodelPackage.TEST_ELEMENT__REFERENCES:
				getReferences().clear();
				return;
			case TestmodelPackage.TEST_ELEMENT__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestmodelPackage.TEST_ELEMENT__STRINGS:
				return strings != null && !strings.isEmpty();
			case TestmodelPackage.TEST_ELEMENT__REFERENCES:
				return references != null && !references.isEmpty();
			case TestmodelPackage.TEST_ELEMENT__CONTAINED_ELEMENTS:
				return containedElements != null && !containedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (strings: ");
		result.append(strings);
		result.append(')');
		return result.toString();
	}

} // TestElementImpl
