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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.emfstore.client.test.model.provider.ModelEditPlugin;
import org.eclipse.emf.emfstore.client.test.model.provider.UnicaseModelElementItemProvider;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.requirement.UseCase}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class UseCaseItemProvider extends UnicaseModelElementItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UseCaseItemProvider(AdapterFactory adapterFactory) {
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

			addInitiatingActorPropertyDescriptor(object);
			addParticipatingActorsPropertyDescriptor(object);
			addRealizedUserTaskPropertyDescriptor(object);
			addPreconditionPropertyDescriptor(object);
			addUseCaseStepsPropertyDescriptor(object);
			addPostconditionPropertyDescriptor(object);
			addScenariosPropertyDescriptor(object);
			addFunctionalRequirementsPropertyDescriptor(object);
			addNonFunctionalRequirementsPropertyDescriptor(object);
			addIdentifiedClassesPropertyDescriptor(object);
			addIncludedUseCasesPropertyDescriptor(object);
			addExtendedUseCasesPropertyDescriptor(object);
			addSystemFunctionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initiating Actor feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInitiatingActorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_UseCase_initiatingActor_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UseCase_initiatingActor_feature", "_UI_UseCase_type"),
			RequirementPackage.Literals.USE_CASE__INITIATING_ACTOR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Participating Actors feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addParticipatingActorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UseCase_participatingActors_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UseCase_participatingActors_feature",
				"_UI_UseCase_type"), RequirementPackage.Literals.USE_CASE__PARTICIPATING_ACTORS, true, false, true,
			null, null, null));
	}

	/**
	 * This adds a property descriptor for the Realized User Task feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRealizedUserTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_UseCase_realizedUserTask_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UseCase_realizedUserTask_feature",
					"_UI_UseCase_type"), RequirementPackage.Literals.USE_CASE__REALIZED_USER_TASK, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Precondition feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPreconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_UseCase_precondition_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UseCase_precondition_feature", "_UI_UseCase_type"),
			RequirementPackage.Literals.USE_CASE__PRECONDITION, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Use Case Steps feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUseCaseStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_UseCase_useCaseSteps_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UseCase_useCaseSteps_feature", "_UI_UseCase_type"),
			RequirementPackage.Literals.USE_CASE__USE_CASE_STEPS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Postcondition feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPostconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_UseCase_postcondition_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UseCase_postcondition_feature", "_UI_UseCase_type"),
			RequirementPackage.Literals.USE_CASE__POSTCONDITION, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scenarios feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addScenariosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_UseCase_scenarios_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UseCase_scenarios_feature", "_UI_UseCase_type"),
			RequirementPackage.Literals.USE_CASE__SCENARIOS, true, false, true, null, null, null));
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
			getString("_UI_UseCase_functionalRequirements_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UseCase_functionalRequirements_feature",
				"_UI_UseCase_type"), RequirementPackage.Literals.USE_CASE__FUNCTIONAL_REQUIREMENTS, true, false, true,
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
			getString("_UI_UseCase_nonFunctionalRequirements_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UseCase_nonFunctionalRequirements_feature",
				"_UI_UseCase_type"), RequirementPackage.Literals.USE_CASE__NON_FUNCTIONAL_REQUIREMENTS, true, false,
			true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Identified Classes feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdentifiedClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_UseCase_identifiedClasses_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UseCase_identifiedClasses_feature",
					"_UI_UseCase_type"), RequirementPackage.Literals.USE_CASE__IDENTIFIED_CLASSES, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Included Use Cases feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIncludedUseCasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_UseCase_includedUseCases_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UseCase_includedUseCases_feature",
					"_UI_UseCase_type"), RequirementPackage.Literals.USE_CASE__INCLUDED_USE_CASES, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Extended Use Cases feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addExtendedUseCasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_UseCase_extendedUseCases_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UseCase_extendedUseCases_feature",
					"_UI_UseCase_type"), RequirementPackage.Literals.USE_CASE__EXTENDED_USE_CASES, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the System Functions feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSystemFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_UseCase_systemFunctions_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UseCase_systemFunctions_feature", "_UI_UseCase_type"),
			RequirementPackage.Literals.USE_CASE__SYSTEM_FUNCTIONS, true, false, true, null, null, null));
	}

	/**
	 * This returns UseCase.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UseCase"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UseCase) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_UseCase_type") : getString("_UI_UseCase_type")
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

		switch (notification.getFeatureID(UseCase.class)) {
		case RequirementPackage.USE_CASE__PRECONDITION:
		case RequirementPackage.USE_CASE__POSTCONDITION:
		case RequirementPackage.USE_CASE__RULES:
		case RequirementPackage.USE_CASE__EXCEPTION:
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
