/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.test.model.Annotation;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.task.ActionItem;
import org.eclipse.emf.emfstore.client.test.model.task.Checkable;
import org.eclipse.emf.emfstore.client.test.model.task.Milestone;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;
import org.eclipse.emf.emfstore.client.test.model.task.WorkPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage
 * @generated
 */
public class TaskAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static TaskPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TaskAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TaskPackage.eINSTANCE;
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
	protected TaskSwitch<Adapter> modelSwitch = new TaskSwitch<Adapter>() {
		@Override
		public Adapter caseActionItem(ActionItem object) {
			return createActionItemAdapter();
		}

		@Override
		public Adapter caseWorkPackage(WorkPackage object) {
			return createWorkPackageAdapter();
		}

		@Override
		public Adapter caseWorkItem(WorkItem object) {
			return createWorkItemAdapter();
		}

		@Override
		public Adapter caseMilestone(Milestone object) {
			return createMilestoneAdapter();
		}

		@Override
		public Adapter caseCheckable(Checkable object) {
			return createCheckableAdapter();
		}

		@Override
		public Adapter caseUnicaseModelElement(UnicaseModelElement object) {
			return createUnicaseModelElementAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.emfstore.client.test.model.task.ActionItem
	 * <em>Action Item</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.ActionItem
	 * @generated
	 */
	public Adapter createActionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage
	 * <em>Work Package</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkPackage
	 * @generated
	 */
	public Adapter createWorkPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem
	 * <em>Work Item</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem
	 * @generated
	 */
	public Adapter createWorkItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.emfstore.client.test.model.task.Milestone
	 * <em>Milestone</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.Milestone
	 * @generated
	 */
	public Adapter createMilestoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.emfstore.client.test.model.task.Checkable
	 * <em>Checkable</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.Checkable
	 * @generated
	 */
	public Adapter createCheckableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.emfstore.client.test.model.Annotation
	 * <em>Annotation</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.client.test.model.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
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

} // TaskAdapterFactory
