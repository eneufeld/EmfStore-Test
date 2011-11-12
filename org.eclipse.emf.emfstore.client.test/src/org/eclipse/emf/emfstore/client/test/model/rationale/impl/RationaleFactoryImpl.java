/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.emfstore.client.test.model.rationale.Assessment;
import org.eclipse.emf.emfstore.client.test.model.rationale.AudioComment;
import org.eclipse.emf.emfstore.client.test.model.rationale.Comment;
import org.eclipse.emf.emfstore.client.test.model.rationale.Criterion;
import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;
import org.eclipse.emf.emfstore.client.test.model.rationale.Proposal;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationaleFactory;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;
import org.eclipse.emf.emfstore.client.test.model.rationale.Solution;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class RationaleFactoryImpl extends EFactoryImpl implements RationaleFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static RationaleFactory init() {
		try {
			RationaleFactory theRationaleFactory = (RationaleFactory) EPackage.Registry.INSTANCE
				.getEFactory("http://eclipse.org/emf/emfstore/client/test/model/rationale");
			if (theRationaleFactory != null) {
				return theRationaleFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RationaleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RationaleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RationalePackage.ISSUE:
			return createIssue();
		case RationalePackage.PROPOSAL:
			return createProposal();
		case RationalePackage.SOLUTION:
			return createSolution();
		case RationalePackage.CRITERION:
			return createCriterion();
		case RationalePackage.ASSESSMENT:
			return createAssessment();
		case RationalePackage.COMMENT:
			return createComment();
		case RationalePackage.AUDIO_COMMENT:
			return createAudioComment();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Proposal createProposal() {
		ProposalImpl proposal = new ProposalImpl();
		return proposal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Criterion createCriterion() {
		CriterionImpl criterion = new CriterionImpl();
		return criterion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Assessment createAssessment() {
		AssessmentImpl assessment = new AssessmentImpl();
		return assessment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AudioComment createAudioComment() {
		AudioCommentImpl audioComment = new AudioCommentImpl();
		return audioComment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RationalePackage getRationalePackage() {
		return (RationalePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RationalePackage getPackage() {
		return RationalePackage.eINSTANCE;
	}

} // RationaleFactoryImpl
