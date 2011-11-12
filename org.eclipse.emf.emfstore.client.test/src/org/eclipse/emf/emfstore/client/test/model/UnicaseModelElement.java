/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.test.model.document.LeafSection;
import org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance;
import org.eclipse.emf.emfstore.client.test.model.rationale.Comment;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Unicase Model Element</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getDescription <em>Description</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAttachments <em>Attachments</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getIncomingDocumentReferences <em>Incoming
 * Document References</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getLeafSection <em>Leaf Section</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getState <em>State</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getAppliedStereotypeInstances <em>Applied
 * Stereotype Instances</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getComments <em>Comments</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getCreationDate <em>Creation Date</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getCreator <em>Creator</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement()
 * @model abstract="true"
 * @generated
 */
public interface UnicaseModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_Name()
	 * @model annotation="org.unicase.ui.meeditor priority='1.0' position='left'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_Description()
	 * @model annotation="org.unicase.ui.meeditor priority='1.0' position='left'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getDescription
	 * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.Annotation}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.Annotation#getAnnotatedModelElements
	 * <em>Annotated Model Elements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_Annotations()
	 * @see org.eclipse.emf.emfstore.client.test.model.Annotation#getAnnotatedModelElements
	 * @model opposite="annotatedModelElements" annotation="org.unicase.ui.meeditor priority='100.0' position='right'"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.Attachment}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.Attachment#getReferringModelElements
	 * <em>Referring Model Elements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attachments</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_Attachments()
	 * @see org.eclipse.emf.emfstore.client.test.model.Attachment#getReferringModelElements
	 * @model opposite="referringModelElements" annotation="org.unicase.ui.meeditor priority='101.0' position='right'"
	 * @generated
	 */
	EList<Attachment> getAttachments();

	/**
	 * Returns the value of the '<em><b>Incoming Document References</b></em>' reference list. The list contents are of
	 * type {@link org.eclipse.emf.emfstore.client.test.model.document.LeafSection}. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getReferencedModelElements
	 * <em>Referenced Model Elements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Document References</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Incoming Document References</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_IncomingDocumentReferences()
	 * @see org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getReferencedModelElements
	 * @model opposite="referencedModelElements" annotation="org.unicase.ui.meeditor priority='102.0' position='right'"
	 * @generated
	 */
	EList<LeafSection> getIncomingDocumentReferences();

	/**
	 * Returns the value of the '<em><b>Leaf Section</b></em>' container reference. It is bidirectional and its opposite
	 * is '{@link org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getModelElements
	 * <em>Model Elements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leaf Section</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Leaf Section</em>' container reference.
	 * @see #setLeafSection(LeafSection)
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_LeafSection()
	 * @see org.eclipse.emf.emfstore.client.test.model.document.LeafSection#getModelElements
	 * @model opposite="modelElements" transient="false"
	 * @generated
	 */
	LeafSection getLeafSection();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getLeafSection
	 * <em>Leaf Section</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Leaf Section</em>' container reference.
	 * @see #getLeafSection()
	 * @generated
	 */
	void setLeafSection(LeafSection value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute. The default value is <code>""</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_State()
	 * @model default="" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getState();

	/**
	 * Returns the value of the '<em><b>Applied Stereotype Instances</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance}. It is
	 * bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getModelElement
	 * <em>Model Element</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Stereotype Instances</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Applied Stereotype Instances</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_AppliedStereotypeInstances()
	 * @see org.eclipse.emf.emfstore.client.test.model.profile.StereotypeInstance#getModelElement
	 * @model opposite="modelElement" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<StereotypeInstance> getAppliedStereotypeInstances();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Comment}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.rationale.Comment#getCommentedElement
	 * <em>Commented Element</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_Comments()
	 * @see org.eclipse.emf.emfstore.client.test.model.rationale.Comment#getCommentedElement
	 * @model opposite="commentedElement" containment="true" resolveProxies="true"
	 *        annotation="org.unicase.ui.meeditor priority='2.0' position='left'"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getCreationDate
	 * <em>Creation Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Creator</em>' attribute.
	 * @see #setCreator(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.ModelPackage#getUnicaseModelElement_Creator()
	 * @model
	 * @generated
	 */
	String getCreator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement#getCreator
	 * <em>Creator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Creator</em>' attribute.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(String value);

} // UnicaseModelElement
