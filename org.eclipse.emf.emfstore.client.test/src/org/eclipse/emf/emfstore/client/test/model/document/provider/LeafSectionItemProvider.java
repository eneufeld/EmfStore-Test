/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.document.provider;

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
import org.eclipse.emf.emfstore.client.test.model.ModelPackage;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityFactory;
import org.eclipse.emf.emfstore.client.test.model.attachment.AttachmentFactory;
import org.eclipse.emf.emfstore.client.test.model.bug.BugFactory;
import org.eclipse.emf.emfstore.client.test.model.change.ChangeFactory;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesFactory;
import org.eclipse.emf.emfstore.client.test.model.component.ComponentFactory;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentFactory;
import org.eclipse.emf.emfstore.client.test.model.document.DocumentPackage;
import org.eclipse.emf.emfstore.client.test.model.document.LeafSection;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingFactory;
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationFactory;
import org.eclipse.emf.emfstore.client.test.model.profile.ProfileFactory;
import org.eclipse.emf.emfstore.client.test.model.provider.ModelEditPlugin;
import org.eclipse.emf.emfstore.client.test.model.provider.UnicaseModelElementItemProvider;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationaleFactory;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementFactory;
import org.eclipse.emf.emfstore.client.test.model.state.StateFactory;
import org.eclipse.emf.emfstore.client.test.model.task.TaskFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.client.test.model.document.LeafSection}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class LeafSectionItemProvider extends UnicaseModelElementItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LeafSectionItemProvider(AdapterFactory adapterFactory) {
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

			addModelElementsPropertyDescriptor(object);
			addReferencedModelElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model Elements feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addModelElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_LeafSection_modelElements_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LeafSection_modelElements_feature",
				"_UI_LeafSection_type"), DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS, true, false, false,
			null, null, null));
	}

	/**
	 * This adds a property descriptor for the Referenced Model Elements feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addReferencedModelElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_LeafSection_referencedModelElements_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LeafSection_referencedModelElements_feature",
				"_UI_LeafSection_type"), DocumentPackage.Literals.LEAF_SECTION__REFERENCED_MODEL_ELEMENTS, true, false,
			true, null, null, null));
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
			childrenFeatures.add(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS);
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
	 * This returns LeafSection.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LeafSection"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LeafSection) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_LeafSection_type")
			: getString("_UI_LeafSection_type") + " " + label;
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

		switch (notification.getFeatureID(LeafSection.class)) {
		case DocumentPackage.LEAF_SECTION__MODEL_ELEMENTS:
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

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			DocumentFactory.eINSTANCE.createLeafSection()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			DocumentFactory.eINSTANCE.createCompositeSection()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			OrganizationFactory.eINSTANCE.createUser()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			OrganizationFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			TaskFactory.eINSTANCE.createActionItem()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			TaskFactory.eINSTANCE.createWorkPackage()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			TaskFactory.eINSTANCE.createMilestone()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ClassesFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ClassesFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ClassesFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ClassesFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ClassesFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ClassesFactory.eINSTANCE.createMethodArgument()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ClassesFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ClassesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ClassesFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createNonFunctionalRequirement()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createFunctionalRequirement()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createActorInstance()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createStep()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createSystemFunction()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RequirementFactory.eINSTANCE.createWorkspace()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RationaleFactory.eINSTANCE.createIssue()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RationaleFactory.eINSTANCE.createProposal()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RationaleFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RationaleFactory.eINSTANCE.createCriterion()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RationaleFactory.eINSTANCE.createAssessment()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			RationaleFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ChangeFactory.eINSTANCE.createMergingIssue()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ChangeFactory.eINSTANCE.createMergingProposal()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ChangeFactory.eINSTANCE.createMergingSolution()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			BugFactory.eINSTANCE.createBugReport()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ComponentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ComponentFactory.eINSTANCE.createComponentService()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ComponentFactory.eINSTANCE.createDeploymentNode()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			MeetingFactory.eINSTANCE.createMeeting()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			MeetingFactory.eINSTANCE.createCompositeMeetingSection()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			MeetingFactory.eINSTANCE.createIssueMeetingSection()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			MeetingFactory.eINSTANCE.createWorkItemMeetingSection()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			StateFactory.eINSTANCE.createState()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			StateFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			StateFactory.eINSTANCE.createStateInitial()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			StateFactory.eINSTANCE.createStateEnd()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			AttachmentFactory.eINSTANCE.createUrlAttachment()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			AttachmentFactory.eINSTANCE.createFileAttachment()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			AttachmentFactory.eINSTANCE.createPatchAttachment()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ProfileFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ProfileFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ProfileFactory.eINSTANCE.createStereotypeInstance()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ProfileFactory.eINSTANCE.createStereotypeAttributeSimple()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ProfileFactory.eINSTANCE.createStereotypeAttributeInstanceString()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ActivityFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ActivityFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ActivityFactory.eINSTANCE.createFork()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ActivityFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ActivityFactory.eINSTANCE.createActivityInitial()));

		newChildDescriptors.add(createChildParameter(DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS,
			ActivityFactory.eINSTANCE.createActivityEnd()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == ModelPackage.Literals.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES
			|| childFeature == DocumentPackage.Literals.LEAF_SECTION__MODEL_ELEMENTS
			|| childFeature == ModelPackage.Literals.UNICASE_MODEL_ELEMENT__COMMENTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject),
				getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
