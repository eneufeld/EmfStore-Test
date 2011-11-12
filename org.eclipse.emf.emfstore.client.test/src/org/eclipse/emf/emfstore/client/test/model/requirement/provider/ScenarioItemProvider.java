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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.emfstore.client.test.model.provider.ModelEditPlugin;
import org.eclipse.emf.emfstore.client.test.model.provider.UnicaseModelElementItemProvider;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.Scenario;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.requirement.Scenario}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ScenarioItemProvider extends UnicaseModelElementItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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

			addInitiatingActorInstancePropertyDescriptor(object);
			addParticipatingActorInstancesPropertyDescriptor(object);
			addInstantiatedUseCasesPropertyDescriptor(object);
			addFunctionalRequirementsPropertyDescriptor(object);
			addNonFunctionalRequirementsPropertyDescriptor(object);
			addParticipatingMethodsPropertyDescriptor(object);
			addParticipatingClassesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initiating Actor Instance feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInitiatingActorInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Scenario_initiatingActorInstance_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Scenario_initiatingActorInstance_feature",
				"_UI_Scenario_type"), RequirementPackage.Literals.SCENARIO__INITIATING_ACTOR_INSTANCE, true, false,
			true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Participating Actor Instances feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParticipatingActorInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Scenario_participatingActorInstances_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Scenario_participatingActorInstances_feature",
				"_UI_Scenario_type"), RequirementPackage.Literals.SCENARIO__PARTICIPATING_ACTOR_INSTANCES, true, false,
			true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Instantiated Use Cases feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addInstantiatedUseCasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Scenario_instantiatedUseCases_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Scenario_instantiatedUseCases_feature",
				"_UI_Scenario_type"), RequirementPackage.Literals.SCENARIO__INSTANTIATED_USE_CASES, true, false, true,
			null, null, null));
	}

	/**
	 * This adds a property descriptor for the Functional Requirements feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFunctionalRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Scenario_functionalRequirements_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Scenario_functionalRequirements_feature",
				"_UI_Scenario_type"), RequirementPackage.Literals.SCENARIO__FUNCTIONAL_REQUIREMENTS, true, false, true,
			null, null, null));
	}

	/**
	 * This adds a property descriptor for the Non Functional Requirements feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNonFunctionalRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Scenario_nonFunctionalRequirements_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Scenario_nonFunctionalRequirements_feature",
				"_UI_Scenario_type"), RequirementPackage.Literals.SCENARIO__NON_FUNCTIONAL_REQUIREMENTS, true, false,
			true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Participating Methods feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addParticipatingMethodsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Scenario_participatingMethods_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Scenario_participatingMethods_feature",
				"_UI_Scenario_type"), RequirementPackage.Literals.SCENARIO__PARTICIPATING_METHODS, true, false, true,
			null, null, null));
	}

	/**
	 * This adds a property descriptor for the Participating Classes feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addParticipatingClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Scenario_participatingClasses_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Scenario_participatingClasses_feature",
				"_UI_Scenario_type"), RequirementPackage.Literals.SCENARIO__PARTICIPATING_CLASSES, true, false, true,
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
			childrenFeatures.add(RequirementPackage.Literals.SCENARIO__STEPS);
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
	 * This returns Scenario.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scenario) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Scenario_type") : getString("_UI_Scenario_type")
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

		switch (notification.getFeatureID(Scenario.class)) {
		case RequirementPackage.SCENARIO__STEPS:
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

		newChildDescriptors.add(createChildParameter(RequirementPackage.Literals.SCENARIO__STEPS,
			RequirementFactory.eINSTANCE.createStep()));
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
