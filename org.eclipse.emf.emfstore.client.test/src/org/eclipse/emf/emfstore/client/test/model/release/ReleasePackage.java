/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.release;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.emfstore.client.test.model.release.ReleaseFactory
 * @model kind="package"
 * @generated
 */
public interface ReleasePackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "release";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfstore/client/test/model/release";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.emfstore.client.test.model.release";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ReleasePackage eINSTANCE = org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.release.impl.StreamImpl
	 * <em>Stream</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.StreamImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 0;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STREAM__RELEASES = 0;

	/**
	 * The feature id for the '<em><b>Source Code Repository Stream</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STREAM__SOURCE_CODE_REPOSITORY_STREAM = 1;

	/**
	 * The number of structural features of the '<em>Stream</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl
	 * <em>Release</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 1;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELEASE__STREAM = 0;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELEASE__PREDECESSOR = 1;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELEASE__SUCCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Applied Patches</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELEASE__APPLIED_PATCHES = 3;

	/**
	 * The feature id for the '<em><b>Included Work Items</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELEASE__INCLUDED_WORK_ITEMS = 4;

	/**
	 * The feature id for the '<em><b>Source Code Repository Revision</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELEASE__SOURCE_CODE_REPOSITORY_REVISION = 5;

	/**
	 * The number of structural features of the '<em>Release</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.impl.SourceCodeRepositoryRevisionImpl
	 * <em>Source Code Repository Revision</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.SourceCodeRepositoryRevisionImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl#getSourceCodeRepositoryRevision()
	 * @generated
	 */
	int SOURCE_CODE_REPOSITORY_REVISION = 2;

	/**
	 * The number of structural features of the '<em>Source Code Repository Revision</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_REPOSITORY_REVISION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.impl.SourceCodeRepositoryStreamImpl
	 * <em>Source Code Repository Stream</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.SourceCodeRepositoryStreamImpl
	 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl#getSourceCodeRepositoryStream()
	 * @generated
	 */
	int SOURCE_CODE_REPOSITORY_STREAM = 3;

	/**
	 * The number of structural features of the '<em>Source Code Repository Stream</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_REPOSITORY_STREAM_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.release.Stream
	 * <em>Stream</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Stream#getReleases <em>Releases</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Stream#getReleases()
	 * @see #getStream()
	 * @generated
	 */
	EReference getStream_Releases();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Stream#getSourceCodeRepositoryStream
	 * <em>Source Code Repository Stream</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source Code Repository Stream</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Stream#getSourceCodeRepositoryStream()
	 * @see #getStream()
	 * @generated
	 */
	EReference getStream_SourceCodeRepositoryStream();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.client.test.model.release.Release
	 * <em>Release</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getStream <em>Stream</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Stream</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getStream()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Stream();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getPredecessor <em>Predecessor</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getPredecessor()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Predecessor();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getSuccessor <em>Successor</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getSuccessor()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Successor();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getAppliedPatches <em>Applied Patches</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Applied Patches</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getAppliedPatches()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_AppliedPatches();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getIncludedWorkItems
	 * <em>Included Work Items</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Included Work Items</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getIncludedWorkItems()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_IncludedWorkItems();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getSourceCodeRepositoryRevision
	 * <em>Source Code Repository Revision</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source Code Repository Revision</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getSourceCodeRepositoryRevision()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_SourceCodeRepositoryRevision();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.SourceCodeRepositoryRevision
	 * <em>Source Code Repository Revision</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source Code Repository Revision</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.SourceCodeRepositoryRevision
	 * @generated
	 */
	EClass getSourceCodeRepositoryRevision();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.SourceCodeRepositoryStream
	 * <em>Source Code Repository Stream</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source Code Repository Stream</em>'.
	 * @see org.eclipse.emf.emfstore.client.test.model.release.SourceCodeRepositoryStream
	 * @generated
	 */
	EClass getSourceCodeRepositoryStream();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReleaseFactory getReleaseFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.release.impl.StreamImpl
		 * <em>Stream</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.StreamImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STREAM__RELEASES = eINSTANCE.getStream_Releases();

		/**
		 * The meta object literal for the '<em><b>Source Code Repository Stream</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STREAM__SOURCE_CODE_REPOSITORY_STREAM = eINSTANCE.getStream_SourceCodeRepositoryStream();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl
		 * <em>Release</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleaseImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Stream</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELEASE__STREAM = eINSTANCE.getRelease_Stream();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELEASE__PREDECESSOR = eINSTANCE.getRelease_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELEASE__SUCCESSOR = eINSTANCE.getRelease_Successor();

		/**
		 * The meta object literal for the '<em><b>Applied Patches</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELEASE__APPLIED_PATCHES = eINSTANCE.getRelease_AppliedPatches();

		/**
		 * The meta object literal for the '<em><b>Included Work Items</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELEASE__INCLUDED_WORK_ITEMS = eINSTANCE.getRelease_IncludedWorkItems();

		/**
		 * The meta object literal for the '<em><b>Source Code Repository Revision</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELEASE__SOURCE_CODE_REPOSITORY_REVISION = eINSTANCE.getRelease_SourceCodeRepositoryRevision();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.release.impl.SourceCodeRepositoryRevisionImpl
		 * <em>Source Code Repository Revision</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.SourceCodeRepositoryRevisionImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl#getSourceCodeRepositoryRevision()
		 * @generated
		 */
		EClass SOURCE_CODE_REPOSITORY_REVISION = eINSTANCE.getSourceCodeRepositoryRevision();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.emfstore.client.test.model.release.impl.SourceCodeRepositoryStreamImpl
		 * <em>Source Code Repository Stream</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.SourceCodeRepositoryStreamImpl
		 * @see org.eclipse.emf.emfstore.client.test.model.release.impl.ReleasePackageImpl#getSourceCodeRepositoryStream()
		 * @generated
		 */
		EClass SOURCE_CODE_REPOSITORY_STREAM = eINSTANCE.getSourceCodeRepositoryStream();

	}

} // ReleasePackage
