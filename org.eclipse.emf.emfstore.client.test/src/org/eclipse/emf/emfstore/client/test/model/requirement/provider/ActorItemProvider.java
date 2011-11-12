/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.emfstore.client.test.model.provider.ModelEditPlugin;
import org.eclipse.emf.emfstore.client.test.model.provider.UnicaseModelElementItemProvider;
import org.eclipse.emf.emfstore.client.test.model.requirement.Actor;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.requirement.Actor} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActorItemProvider extends UnicaseModelElementItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInitiatedUserTaskPropertyDescriptor(object);
			addParticipatedUserTasksPropertyDescriptor(object);
			addInitiatedUseCasesPropertyDescriptor(object);
			addParticipatedUseCasesPropertyDescriptor(object);
			addInstancesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initiated User Task feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addInitiatedUserTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Actor_initiatedUserTask_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Actor_initiatedUserTask_feature", "_UI_Actor_type"),
			RequirementPackage.Literals.ACTOR__INITIATED_USER_TASK, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Participated User Tasks feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParticipatedUserTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Actor_participatedUserTasks_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Actor_participatedUserTasks_feature",
					"_UI_Actor_type"), RequirementPackage.Literals.ACTOR__PARTICIPATED_USER_TASKS, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Initiated Use Cases feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addInitiatedUseCasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Actor_initiatedUseCases_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Actor_initiatedUseCases_feature", "_UI_Actor_type"),
			RequirementPackage.Literals.ACTOR__INITIATED_USE_CASES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Participated Use Cases feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addParticipatedUseCasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Actor_participatedUseCases_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Actor_participatedUseCases_feature",
					"_UI_Actor_type"), RequirementPackage.Literals.ACTOR__PARTICIPATED_USE_CASES, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Instances feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Actor_instances_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Actor_instances_feature", "_UI_Actor_type"),
			RequirementPackage.Literals.ACTOR__INSTANCES, true, false, true, null, null, null));
	}

	/**
	 * This returns Actor.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Actor"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Actor) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Actor_type") : getString("_UI_Actor_type") + " "
			+ label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
	 * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelEditPlugin.INSTANCE;
	}

}
