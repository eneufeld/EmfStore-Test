/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.meeting.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.emfstore.client.test.model.meeting.Meeting;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingFactory;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage;
import org.eclipse.emf.emfstore.client.test.model.provider.ModelEditPlugin;
import org.eclipse.emf.emfstore.client.test.model.provider.UnicaseModelElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.meeting.Meeting} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MeetingItemProvider extends UnicaseModelElementItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MeetingItemProvider(AdapterFactory adapterFactory) {
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

			addLocationPropertyDescriptor(object);
			addStarttimePropertyDescriptor(object);
			addEndtimePropertyDescriptor(object);
			addFacilitatorPropertyDescriptor(object);
			addMinutetakerPropertyDescriptor(object);
			addTimekeeperPropertyDescriptor(object);
			addParticipantsPropertyDescriptor(object);
			addSectionsPropertyDescriptor(object);
			addIdentifiedIssuesSectionPropertyDescriptor(object);
			addIdentifiedWorkItemsSectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Location feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Meeting_location_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_location_feature", "_UI_Meeting_type"),
			MeetingPackage.Literals.MEETING__LOCATION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Starttime feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStarttimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Meeting_starttime_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_starttime_feature", "_UI_Meeting_type"),
			MeetingPackage.Literals.MEETING__STARTTIME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Endtime feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEndtimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Meeting_endtime_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_endtime_feature", "_UI_Meeting_type"),
			MeetingPackage.Literals.MEETING__ENDTIME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Facilitator feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFacilitatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Meeting_facilitator_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_facilitator_feature", "_UI_Meeting_type"),
			MeetingPackage.Literals.MEETING__FACILITATOR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Minutetaker feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMinutetakerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Meeting_minutetaker_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_minutetaker_feature", "_UI_Meeting_type"),
			MeetingPackage.Literals.MEETING__MINUTETAKER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Timekeeper feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTimekeeperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Meeting_timekeeper_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_timekeeper_feature", "_UI_Meeting_type"),
			MeetingPackage.Literals.MEETING__TIMEKEEPER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Participants feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParticipantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Meeting_participants_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_participants_feature", "_UI_Meeting_type"),
			MeetingPackage.Literals.MEETING__PARTICIPANTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sections feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Meeting_sections_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_sections_feature", "_UI_Meeting_type"),
			MeetingPackage.Literals.MEETING__SECTIONS, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Identified Issues Section feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdentifiedIssuesSectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Meeting_identifiedIssuesSection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_identifiedIssuesSection_feature",
				"_UI_Meeting_type"), MeetingPackage.Literals.MEETING__IDENTIFIED_ISSUES_SECTION, true, false, true,
			null, null, null));
	}

	/**
	 * This adds a property descriptor for the Identified Work Items Section feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdentifiedWorkItemsSectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Meeting_identifiedWorkItemsSection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Meeting_identifiedWorkItemsSection_feature",
				"_UI_Meeting_type"), MeetingPackage.Literals.MEETING__IDENTIFIED_WORK_ITEMS_SECTION, true, false, true,
			null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MeetingPackage.Literals.MEETING__SECTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Meeting.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Meeting"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Meeting) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Meeting_type") : getString("_UI_Meeting_type")
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

		switch (notification.getFeatureID(Meeting.class)) {
		case MeetingPackage.MEETING__LOCATION:
		case MeetingPackage.MEETING__STARTTIME:
		case MeetingPackage.MEETING__ENDTIME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MeetingPackage.MEETING__SECTIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(MeetingPackage.Literals.MEETING__SECTIONS,
			MeetingFactory.eINSTANCE.createCompositeMeetingSection()));

		newChildDescriptors.add(createChildParameter(MeetingPackage.Literals.MEETING__SECTIONS,
			MeetingFactory.eINSTANCE.createIssueMeetingSection()));

		newChildDescriptors.add(createChildParameter(MeetingPackage.Literals.MEETING__SECTIONS,
			MeetingFactory.eINSTANCE.createWorkItemMeetingSection()));
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
