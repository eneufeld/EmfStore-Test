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
import org.eclipse.emf.emfstore.client.test.model.provider.ModelEditPlugin;
import org.eclipse.emf.emfstore.client.test.model.provider.UnicaseModelElementItemProvider;
import org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.FunctionalRequirement} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class FunctionalRequirementItemProvider extends UnicaseModelElementItemProvider implements
	IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
	IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionalRequirementItemProvider(AdapterFactory adapterFactory) {
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

			addRefinedRequirementPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addRefiningRequirementsPropertyDescriptor(object);
			addUseCasesPropertyDescriptor(object);
			addScenariosPropertyDescriptor(object);
			addReviewedPropertyDescriptor(object);
			addStakeholderPropertyDescriptor(object);
			addCostPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Refined Requirement feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addRefinedRequirementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FunctionalRequirement_refinedRequirement_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_refinedRequirement_feature",
				"_UI_FunctionalRequirement_type"),
			RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__REFINED_REQUIREMENT, true, false, false, null, null,
			null));
	}

	/**
	 * This adds a property descriptor for the Priority feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FunctionalRequirement_priority_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_priority_feature",
				"_UI_FunctionalRequirement_type"), RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__PRIORITY, true,
			false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Refining Requirements feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addRefiningRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FunctionalRequirement_refiningRequirements_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_refiningRequirements_feature",
				"_UI_FunctionalRequirement_type"),
			RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__REFINING_REQUIREMENTS, true, false, false, null, null,
			null));
	}

	/**
	 * This adds a property descriptor for the Use Cases feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUseCasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FunctionalRequirement_useCases_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_useCases_feature",
				"_UI_FunctionalRequirement_type"), RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__USE_CASES, true,
			false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Scenarios feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addScenariosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FunctionalRequirement_scenarios_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_scenarios_feature",
				"_UI_FunctionalRequirement_type"), RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__SCENARIOS, true,
			false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Reviewed feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addReviewedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FunctionalRequirement_reviewed_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_reviewed_feature",
				"_UI_FunctionalRequirement_type"), RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__REVIEWED, true,
			false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stakeholder feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStakeholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FunctionalRequirement_stakeholder_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_stakeholder_feature",
				"_UI_FunctionalRequirement_type"), RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__STAKEHOLDER,
			true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Cost feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FunctionalRequirement_cost_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_cost_feature",
				"_UI_FunctionalRequirement_type"), RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__COST, true,
			false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__REFINING_REQUIREMENTS);
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
	 * This returns FunctionalRequirement.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionalRequirement"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionalRequirement) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FunctionalRequirement_type")
			: getString("_UI_FunctionalRequirement_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionalRequirement.class)) {
		case RequirementPackage.FUNCTIONAL_REQUIREMENT__STORY_POINTS:
		case RequirementPackage.FUNCTIONAL_REQUIREMENT__PRIORITY:
		case RequirementPackage.FUNCTIONAL_REQUIREMENT__REVIEWED:
		case RequirementPackage.FUNCTIONAL_REQUIREMENT__COST:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case RequirementPackage.FUNCTIONAL_REQUIREMENT__REFINING_REQUIREMENTS:
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
			RequirementPackage.Literals.FUNCTIONAL_REQUIREMENT__REFINING_REQUIREMENTS,
			RequirementFactory.eINSTANCE.createFunctionalRequirement()));
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
