/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task.provider;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.emfstore.client.test.model.provider.AnnotationItemProvider;
import org.eclipse.emf.emfstore.client.test.model.provider.ModelEditPlugin;
import org.eclipse.emf.emfstore.client.test.model.task.ActionItem;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.task.ActionItem} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActionItemItemProvider extends AnnotationItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActionItemItemProvider(AdapterFactory adapterFactory) {
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

			addContainingWorkpackagePropertyDescriptor(object);
			addPredecessorsPropertyDescriptor(object);
			addSuccessorsPropertyDescriptor(object);
			addAssigneePropertyDescriptor(object);
			addReviewerPropertyDescriptor(object);
			addParticipantsPropertyDescriptor(object);
			addDueDatePropertyDescriptor(object);
			addEstimatePropertyDescriptor(object);
			addEffortPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addResolvedPropertyDescriptor(object);
			addIncludingReleasesPropertyDescriptor(object);
			addDonePropertyDescriptor(object);
			addActivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Containing Workpackage feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addContainingWorkpackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_WorkItem_containingWorkpackage_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_containingWorkpackage_feature",
				"_UI_WorkItem_type"), TaskPackage.Literals.WORK_ITEM__CONTAINING_WORKPACKAGE, true, false, false, null,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Predecessors feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPredecessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_predecessors_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_predecessors_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__PREDECESSORS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Successors feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSuccessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_successors_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_successors_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__SUCCESSORS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Assignee feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAssigneePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_assignee_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_assignee_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__ASSIGNEE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Reviewer feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addReviewerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_reviewer_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_reviewer_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__REVIEWER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Participants feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParticipantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_participants_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_participants_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__PARTICIPANTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Due Date feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDueDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_dueDate_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_dueDate_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__DUE_DATE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Estimate feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEstimatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_estimate_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_estimate_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__ESTIMATE, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Effort feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEffortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_effort_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_effort_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__EFFORT, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Priority feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_priority_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_priority_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__PRIORITY, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Resolved feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addResolvedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_WorkItem_resolved_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_resolved_feature", "_UI_WorkItem_type"),
			TaskPackage.Literals.WORK_ITEM__RESOLVED, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Including Releases feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIncludingReleasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_WorkItem_includingReleases_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WorkItem_includingReleases_feature",
				"_UI_WorkItem_type"), TaskPackage.Literals.WORK_ITEM__INCLUDING_RELEASES, true, false, true, null,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Done feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_ActionItem_done_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ActionItem_done_feature", "_UI_ActionItem_type"),
			TaskPackage.Literals.ACTION_ITEM__DONE, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Activity feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_ActionItem_activity_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ActionItem_activity_feature", "_UI_ActionItem_type"),
			TaskPackage.Literals.ACTION_ITEM__ACTIVITY, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This returns ActionItem.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActionItem"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActionItem) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ActionItem_type")
			: getString("_UI_ActionItem_type") + " " + label;
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

		switch (notification.getFeatureID(ActionItem.class)) {
		case TaskPackage.ACTION_ITEM__DUE_DATE:
		case TaskPackage.ACTION_ITEM__ESTIMATE:
		case TaskPackage.ACTION_ITEM__EFFORT:
		case TaskPackage.ACTION_ITEM__PRIORITY:
		case TaskPackage.ACTION_ITEM__RESOLVED:
		case TaskPackage.ACTION_ITEM__CHECKED:
		case TaskPackage.ACTION_ITEM__DONE:
		case TaskPackage.ACTION_ITEM__ACTIVITY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
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
