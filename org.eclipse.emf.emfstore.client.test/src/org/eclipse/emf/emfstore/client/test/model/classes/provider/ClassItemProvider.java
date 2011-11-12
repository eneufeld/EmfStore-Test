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
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesFactory;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.classes.Class} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClassItemProvider extends PackageElementItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassItemProvider(AdapterFactory adapterFactory) {
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

			addInstantiationTypePropertyDescriptor(object);
			addParticipatedUseCasesPropertyDescriptor(object);
			addSuperClassesPropertyDescriptor(object);
			addSubClassesPropertyDescriptor(object);
			addIncomingAssociationsPropertyDescriptor(object);
			addOutgoingAssociationsPropertyDescriptor(object);
			addAttributesPropertyDescriptor(object);
			addMethodsPropertyDescriptor(object);
			addDemoParticipationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instantiation Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInstantiationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Class_instantiationType_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Class_instantiationType_feature", "_UI_Class_type"),
			ClassesPackage.Literals.CLASS__INSTANTIATION_TYPE, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_Class_participatedUseCases_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Class_participatedUseCases_feature",
					"_UI_Class_type"), ClassesPackage.Literals.CLASS__PARTICIPATED_USE_CASES, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Super Classes feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSuperClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Class_superClasses_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Class_superClasses_feature", "_UI_Class_type"),
			ClassesPackage.Literals.CLASS__SUPER_CLASSES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sub Classes feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSubClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Class_subClasses_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Class_subClasses_feature", "_UI_Class_type"),
			ClassesPackage.Literals.CLASS__SUB_CLASSES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Incoming Associations feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addIncomingAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_incomingAssociations_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Class_incomingAssociations_feature",
					"_UI_Class_type"), ClassesPackage.Literals.CLASS__INCOMING_ASSOCIATIONS, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Associations feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addOutgoingAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_outgoingAssociations_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Class_outgoingAssociations_feature",
					"_UI_Class_type"), ClassesPackage.Literals.CLASS__OUTGOING_ASSOCIATIONS, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Attributes feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Class_attributes_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Class_attributes_feature", "_UI_Class_type"),
			ClassesPackage.Literals.CLASS__ATTRIBUTES, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Methods feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMethodsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Class_methods_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Class_methods_feature", "_UI_Class_type"),
			ClassesPackage.Literals.CLASS__METHODS, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Demo Participations feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addDemoParticipationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Class_demoParticipations_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Class_demoParticipations_feature", "_UI_Class_type"),
			ClassesPackage.Literals.CLASS__DEMO_PARTICIPATIONS, true, false, true, null, null, null));
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
			childrenFeatures.add(ClassesPackage.Literals.CLASS__ATTRIBUTES);
			childrenFeatures.add(ClassesPackage.Literals.CLASS__METHODS);
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
	 * This returns Class.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Class"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.eclipse.emf.emfstore.client.test.model.classes.Class) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Class_type") : getString("_UI_Class_type") + " "
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

		switch (notification.getFeatureID(org.eclipse.emf.emfstore.client.test.model.classes.Class.class)) {
		case ClassesPackage.CLASS__INSTANTIATION_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ClassesPackage.CLASS__ATTRIBUTES:
		case ClassesPackage.CLASS__METHODS:
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

		newChildDescriptors.add(createChildParameter(ClassesPackage.Literals.CLASS__ATTRIBUTES,
			ClassesFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add(createChildParameter(ClassesPackage.Literals.CLASS__METHODS,
			ClassesFactory.eINSTANCE.createMethod()));
	}

}
