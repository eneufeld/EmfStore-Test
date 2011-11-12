/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.provider;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.emfstore.client.test.model.ModelPackage;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.profile.ProfileFactory;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationaleFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class UnicaseModelElementItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnicaseModelElementItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addAnnotationsPropertyDescriptor(object);
			addAttachmentsPropertyDescriptor(object);
			addCommentsPropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addCreatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnicaseModelElement_name_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnicaseModelElement_name_feature",
				"_UI_UnicaseModelElement_type"), ModelPackage.Literals.UNICASE_MODEL_ELEMENT__NAME, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnicaseModelElement_description_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnicaseModelElement_description_feature",
				"_UI_UnicaseModelElement_type"), ModelPackage.Literals.UNICASE_MODEL_ELEMENT__DESCRIPTION, true, true,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Annotations feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAnnotationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnicaseModelElement_annotations_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnicaseModelElement_annotations_feature",
				"_UI_UnicaseModelElement_type"), ModelPackage.Literals.UNICASE_MODEL_ELEMENT__ANNOTATIONS, true, false,
			true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Attachments feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAttachmentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnicaseModelElement_attachments_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnicaseModelElement_attachments_feature",
				"_UI_UnicaseModelElement_type"), ModelPackage.Literals.UNICASE_MODEL_ELEMENT__ATTACHMENTS, true, false,
			true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Comments feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCommentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnicaseModelElement_comments_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnicaseModelElement_comments_feature",
				"_UI_UnicaseModelElement_type"), ModelPackage.Literals.UNICASE_MODEL_ELEMENT__COMMENTS, true, false,
			false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnicaseModelElement_creationDate_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnicaseModelElement_creationDate_feature",
				"_UI_UnicaseModelElement_type"), ModelPackage.Literals.UNICASE_MODEL_ELEMENT__CREATION_DATE, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Creator feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCreatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnicaseModelElement_creator_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnicaseModelElement_creator_feature",
				"_UI_UnicaseModelElement_type"), ModelPackage.Literals.UNICASE_MODEL_ELEMENT__CREATOR, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(ModelPackage.Literals.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES);
			childrenFeatures.add(ModelPackage.Literals.UNICASE_MODEL_ELEMENT__COMMENTS);
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
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnicaseModelElement) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_UnicaseModelElement_type")
			: getString("_UI_UnicaseModelElement_type") + " " + label;
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

		switch (notification.getFeatureID(UnicaseModelElement.class)) {
		case ModelPackage.UNICASE_MODEL_ELEMENT__NAME:
		case ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION:
		case ModelPackage.UNICASE_MODEL_ELEMENT__STATE:
		case ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE:
		case ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES:
		case ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS:
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

		newChildDescriptors.add(createChildParameter(
			ModelPackage.Literals.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES,
			ProfileFactory.eINSTANCE.createStereotypeInstance()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.UNICASE_MODEL_ELEMENT__COMMENTS,
			RationaleFactory.eINSTANCE.createComment()));
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
