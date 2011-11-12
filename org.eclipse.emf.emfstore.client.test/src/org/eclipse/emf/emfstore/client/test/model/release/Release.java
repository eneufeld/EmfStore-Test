/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.release;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Release</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.Release#getStream <em>Stream</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.Release#getPredecessor <em>Predecessor</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.Release#getSuccessor <em>Successor</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.Release#getAppliedPatches <em>Applied Patches</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.Release#getIncludedWorkItems <em>Included Work Items
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.Release#getSourceCodeRepositoryRevision <em>Source Code
 * Repository Revision</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends EObject {
	/**
	 * Returns the value of the '<em><b>Stream</b></em>' container reference. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Stream#getReleases <em>Releases</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stream</em>' container reference.
	 * @see #setStream(Stream)
	 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getRelease_Stream()
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Stream#getReleases
	 * @model opposite="releases" transient="false"
	 * @generated
	 */
	Stream getStream();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.release.Release#getStream
	 * <em>Stream</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Stream</em>' container reference.
	 * @see #getStream()
	 * @generated
	 */
	void setStream(Stream value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getSuccessor <em>Successor</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Release)
	 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getRelease_Predecessor()
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	Release getPredecessor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.release.Release#getPredecessor
	 * <em>Predecessor</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Release value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getPredecessor <em>Predecessor</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Release)
	 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getRelease_Successor()
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	Release getSuccessor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.release.Release#getSuccessor
	 * <em>Successor</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Release value);

	/**
	 * Returns the value of the '<em><b>Applied Patches</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment}. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment#getAppliedTo
	 * <em>Applied To</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Patches</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Applied Patches</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getRelease_AppliedPatches()
	 * @see org.eclipse.emf.emfstore.client.test.model.attachment.PatchAttachment#getAppliedTo
	 * @model opposite="appliedTo"
	 * @generated
	 */
	EList<PatchAttachment> getAppliedPatches();

	/**
	 * Returns the value of the '<em><b>Included Work Items</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getIncludingReleases <em>Including Releases</em>}
	 * '. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Work Items</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Included Work Items</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getRelease_IncludedWorkItems()
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getIncludingReleases
	 * @model opposite="includingReleases"
	 * @generated
	 */
	EList<WorkItem> getIncludedWorkItems();

	/**
	 * Returns the value of the '<em><b>Source Code Repository Revision</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Code Repository Revision</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Code Repository Revision</em>' reference.
	 * @see #setSourceCodeRepositoryRevision(SourceCodeRepositoryRevision)
	 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getRelease_SourceCodeRepositoryRevision()
	 * @model
	 * @generated
	 */
	SourceCodeRepositoryRevision getSourceCodeRepositoryRevision();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getSourceCodeRepositoryRevision
	 * <em>Source Code Repository Revision</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Source Code Repository Revision</em>' reference.
	 * @see #getSourceCodeRepositoryRevision()
	 * @generated
	 */
	void setSourceCodeRepositoryRevision(SourceCodeRepositoryRevision value);

} // Release
