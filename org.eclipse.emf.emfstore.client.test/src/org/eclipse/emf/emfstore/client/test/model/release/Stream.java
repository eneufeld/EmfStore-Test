/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.release;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Stream</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.Stream#getReleases <em>Releases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.release.Stream#getSourceCodeRepositoryStream <em>Source Code
 * Repository Stream</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getStream()
 * @model
 * @generated
 */
public interface Stream extends EObject {
	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getStream <em>Stream</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releases</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getStream_Releases()
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getStream
	 * @model opposite="stream" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Source Code Repository Stream</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Code Repository Stream</em>' reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Code Repository Stream</em>' reference.
	 * @see #setSourceCodeRepositoryStream(SourceCodeRepositoryStream)
	 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage#getStream_SourceCodeRepositoryStream()
	 * @model
	 * @generated
	 */
	SourceCodeRepositoryStream getSourceCodeRepositoryStream();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Stream#getSourceCodeRepositoryStream
	 * <em>Source Code Repository Stream</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Source Code Repository Stream</em>' reference.
	 * @see #getSourceCodeRepositoryStream()
	 * @generated
	 */
	void setSourceCodeRepositoryStream(SourceCodeRepositoryStream value);

} // Stream
