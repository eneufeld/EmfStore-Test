/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.document;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.emfstore.client.test.model.ModelPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.document.DocumentFactory
 * @model kind="package"
 * @generated
 */
public interface DocumentPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "document";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/document";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.document";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DocumentPackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.document.impl.DocumentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.document.Section <em>Section</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.document.Section
	 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.DocumentPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = ModelPackage.UNICASE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__DESCRIPTION = ModelPackage.UNICASE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__ANNOTATIONS = ModelPackage.UNICASE_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__ATTACHMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__INCOMING_DOCUMENT_REFERENCES = ModelPackage.UNICASE_MODEL_ELEMENT__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__LEAF_SECTION = ModelPackage.UNICASE_MODEL_ELEMENT__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__STATE = ModelPackage.UNICASE_MODEL_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__APPLIED_STEREOTYPE_INSTANCES = ModelPackage.UNICASE_MODEL_ELEMENT__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__COMMENTS = ModelPackage.UNICASE_MODEL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__CREATION_DATE = ModelPackage.UNICASE_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__CREATOR = ModelPackage.UNICASE_MODEL_ELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION__PARENT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = ModelPackage.UNICASE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.document.impl.LeafSectionImpl
	 * <em>Leaf Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.LeafSectionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.DocumentPackageImpl#getLeafSection()
	 * @generated
	 */
	int LEAF_SECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__DESCRIPTION = SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__ANNOTATIONS = SECTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__ATTACHMENTS = SECTION__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__INCOMING_DOCUMENT_REFERENCES = SECTION__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__LEAF_SECTION = SECTION__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__STATE = SECTION__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__APPLIED_STEREOTYPE_INSTANCES = SECTION__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__COMMENTS = SECTION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__CREATION_DATE = SECTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__CREATOR = SECTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__PARENT = SECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__MODEL_ELEMENTS = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Model Elements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION__REFERENCED_MODEL_ELEMENTS = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Leaf Section</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.document.impl.CompositeSectionImpl
	 * <em>Composite Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.CompositeSectionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.DocumentPackageImpl#getCompositeSection()
	 * @generated
	 */
	int COMPOSITE_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__DESCRIPTION = SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__ANNOTATIONS = SECTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__ATTACHMENTS = SECTION__ATTACHMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Document References</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__INCOMING_DOCUMENT_REFERENCES = SECTION__INCOMING_DOCUMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Leaf Section</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__LEAF_SECTION = SECTION__LEAF_SECTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__STATE = SECTION__STATE;

	/**
	 * The feature id for the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__APPLIED_STEREOTYPE_INSTANCES = SECTION__APPLIED_STEREOTYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__COMMENTS = SECTION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__CREATION_DATE = SECTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__CREATOR = SECTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__PARENT = SECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION__SUBSECTIONS = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Section</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.document.LeafSection
	 * <em>Leaf Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Leaf Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.LeafSection
	 * @generated
	 */
	EClass getLeafSection();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getModelElements <em>Model Elements</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Model Elements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getModelElements()
	 * @see #getLeafSection()
	 * @generated
	 */
	EReference getLeafSection_ModelElements();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getReferencedModelElements
	 * <em>Referenced Model Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Referenced Model Elements</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getReferencedModelElements()
	 * @see #getLeafSection()
	 * @generated
	 */
	EReference getLeafSection_ReferencedModelElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.document.CompositeSection
	 * <em>Composite Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Composite Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.CompositeSection
	 * @generated
	 */
	EClass getCompositeSection();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.document.CompositeSection#getSubsections <em>Subsections</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Subsections</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.CompositeSection#getSubsections()
	 * @see #getCompositeSection()
	 * @generated
	 */
	EReference getCompositeSection_Subsections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.document.Section
	 * <em>Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.document.Section#getParent <em>Parent</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.document.Section#getParent()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Parent();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocumentFactory getDocumentFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.document.impl.LeafSectionImpl <em>Leaf Section</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.LeafSectionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.DocumentPackageImpl#getLeafSection()
		 * @generated
		 */
		EClass LEAF_SECTION = eINSTANCE.getLeafSection();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LEAF_SECTION__MODEL_ELEMENTS = eINSTANCE.getLeafSection_ModelElements();

		/**
		 * The meta object literal for the '<em><b>Referenced Model Elements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LEAF_SECTION__REFERENCED_MODEL_ELEMENTS = eINSTANCE.getLeafSection_ReferencedModelElements();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.document.impl.CompositeSectionImpl
		 * <em>Composite Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.CompositeSectionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.DocumentPackageImpl#getCompositeSection()
		 * @generated
		 */
		EClass COMPOSITE_SECTION = eINSTANCE.getCompositeSection();

		/**
		 * The meta object literal for the '<em><b>Subsections</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPOSITE_SECTION__SUBSECTIONS = eINSTANCE.getCompositeSection_Subsections();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.document.Section
		 * <em>Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.document.Section
		 * @see org.eclipse.emf.emfstore.client.test.model.document.impl.DocumentPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SECTION__PARENT = eINSTANCE.getSection_Parent();

	}

} // DocumentPackage
