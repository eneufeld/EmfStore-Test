/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes.provider;

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
import org.eclipse.emf.emfstore.client.test.model.classes.Attribute;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.provider.ModelEditPlugin;
import org.eclipse.emf.emfstore.client.test.model.provider.UnicaseModelElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.classes.Attribute} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AttributeItemProvider extends UnicaseModelElementItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeItemProvider(AdapterFactory adapterFactory) {
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

			addDefiningClassPropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addScopePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addImplementationTypePropertyDescriptor(object);
			addImplementationEnumerationPropertyDescriptor(object);
			addTransientPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Defining Class feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDefiningClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Attribute_definingClass_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Attribute_definingClass_feature",
					"_UI_Attribute_type"), ClassesPackage.Literals.ATTRIBUTE__DEFINING_CLASS, true, false, false, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Attribute_visibility_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Attribute_visibility_feature", "_UI_Attribute_type"),
			ClassesPackage.Literals.ATTRIBUTE__VISIBILITY, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scope feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Attribute_scope_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Attribute_scope_feature", "_UI_Attribute_type"),
			ClassesPackage.Literals.ATTRIBUTE__SCOPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Attribute_type_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Attribute_type_feature", "_UI_Attribute_type"),
			ClassesPackage.Literals.ATTRIBUTE__TYPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Attribute_defaultValue_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Attribute_defaultValue_feature",
					"_UI_Attribute_type"), ClassesPackage.Literals.ATTRIBUTE__DEFAULT_VALUE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Properties feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Attribute_properties_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Attribute_properties_feature", "_UI_Attribute_type"),
			ClassesPackage.Literals.ATTRIBUTE__PROPERTIES, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Label feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Attribute_label_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Attribute_label_feature", "_UI_Attribute_type"),
			ClassesPackage.Literals.ATTRIBUTE__LABEL, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Attribute_id_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Attribute_id_feature", "_UI_Attribute_type"),
			ClassesPackage.Literals.ATTRIBUTE__ID, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Implementation Type feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addImplementationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Attribute_implementationType_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Attribute_implementationType_feature",
				"_UI_Attribute_type"), ClassesPackage.Literals.ATTRIBUTE__IMPLEMENTATION_TYPE, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Implementation Enumeration feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addImplementationEnumerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Attribute_implementationEnumeration_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Attribute_implementationEnumeration_feature",
				"_UI_Attribute_type"), ClassesPackage.Literals.ATTRIBUTE__IMPLEMENTATION_ENUMERATION, true, false,
			true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Transient feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTransientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Attribute_transient_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Attribute_transient_feature", "_UI_Attribute_type"),
			ClassesPackage.Literals.ATTRIBUTE__TRANSIENT, true, false, false,
			ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Attribute.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Attribute"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Attribute) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Attribute_type") : getString("_UI_Attribute_type")
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

		switch (notification.getFeatureID(Attribute.class)) {
		case ClassesPackage.ATTRIBUTE__VISIBILITY:
		case ClassesPackage.ATTRIBUTE__SCOPE:
		case ClassesPackage.ATTRIBUTE__SIGNATURE:
		case ClassesPackage.ATTRIBUTE__TYPE:
		case ClassesPackage.ATTRIBUTE__DEFAULT_VALUE:
		case ClassesPackage.ATTRIBUTE__PROPERTIES:
		case ClassesPackage.ATTRIBUTE__LABEL:
		case ClassesPackage.ATTRIBUTE__ID:
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_TYPE:
		case ClassesPackage.ATTRIBUTE__TRANSIENT:
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
