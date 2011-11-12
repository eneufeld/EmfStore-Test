/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.activity.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.activity.Activity;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityEnd;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityInitial;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityPackage;
import org.eclipse.emf.emfstore.client.test.model.activity.Branch;
import org.eclipse.emf.emfstore.client.test.model.activity.Fork;
import org.eclipse.emf.emfstore.client.test.model.activity.Transition;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityPackage
 * @generated
 */
public class ActivityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ActivityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActivityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActivitySwitch<Adapter> modelSwitch = new ActivitySwitch<Adapter>() {
		@Override
		public Adapter caseActivityObject(ActivityObject object) {
			return createActivityObjectAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseFork(Fork object) {
			return createForkAdapter();
		}

		@Override
		public Adapter caseBranch(Branch object) {
			return createBranchAdapter();
		}

		@Override
		public Adapter caseActivityInitial(ActivityInitial object) {
			return createActivityInitialAdapter();
		}

		@Override
		public Adapter caseActivityEnd(ActivityEnd object) {
			return createActivityEndAdapter();
		}

		@Override
		public Adapter caseUnicaseModelElement(UnicaseModelElement object) {
			return createUnicaseModelElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject <em>Object</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject
	 * @generated
	 */
	public Adapter createActivityObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.Transition <em>Transition</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.Activity <em>Activity</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.emfstore.client.test.model.activity.Fork
	 * <em>Fork</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.emfstore.client.test.model.activity.Branch
	 * <em>Branch</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.ActivityInitial <em>Initial</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityInitial
	 * @generated
	 */
	public Adapter createActivityInitialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.activity.ActivityEnd <em>End</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityEnd
	 * @generated
	 */
	public Adapter createActivityEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement <em>Unicase Model Element</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement
	 * @generated
	 */
	public Adapter createUnicaseModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ActivityAdapterFactory
