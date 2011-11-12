/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.bug.provider;

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
import org.eclipse.emf.emfstore.client.test.model.bug.BugPackage;
import org.eclipse.emf.emfstore.client.test.model.bug.BugReport;
import org.eclipse.emf.emfstore.client.test.model.provider.AnnotationItemProvider;
import org.eclipse.emf.emfstore.client.test.model.provider.ModelEditPlugin;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BugReportItemProvider extends AnnotationItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BugReportItemProvider(AdapterFactory adapterFactory) {
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
			addSeverityPropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
			addResolutionTypePropertyDescriptor(object);
			addDonePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Severity feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSeverityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_BugReport_severity_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_BugReport_severity_feature", "_UI_BugReport_type"),
			BugPackage.Literals.BUG_REPORT__SEVERITY, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Resolution feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_BugReport_resolution_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_BugReport_resolution_feature", "_UI_BugReport_type"),
			BugPackage.Literals.BUG_REPORT__RESOLUTION, true, true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Resolution Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addResolutionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_BugReport_resolutionType_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_BugReport_resolutionType_feature",
				"_UI_BugReport_type"), BugPackage.Literals.BUG_REPORT__RESOLUTION_TYPE, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Done feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_BugReport_done_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_BugReport_done_feature", "_UI_BugReport_type"),
			BugPackage.Literals.BUG_REPORT__DONE, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
			null));
	}

	/**
	 * This returns BugReport.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BugReport"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BugReport) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BugReport_type") : getString("_UI_BugReport_type")
			+ " " + label;
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

		switch (notification.getFeatureID(BugReport.class)) {
		case BugPackage.BUG_REPORT__DUE_DATE:
		case BugPackage.BUG_REPORT__ESTIMATE:
		case BugPackage.BUG_REPORT__EFFORT:
		case BugPackage.BUG_REPORT__PRIORITY:
		case BugPackage.BUG_REPORT__RESOLVED:
		case BugPackage.BUG_REPORT__CHECKED:
		case BugPackage.BUG_REPORT__SEVERITY:
		case BugPackage.BUG_REPORT__RESOLUTION:
		case BugPackage.BUG_REPORT__RESOLUTION_TYPE:
		case BugPackage.BUG_REPORT__DONE:
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
