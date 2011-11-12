/**
 * ] * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.change.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.test.model.Annotation;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.change.ChangePackage;
import org.eclipse.emf.emfstore.client.test.model.change.MergingIssue;
import org.eclipse.emf.emfstore.client.test.model.change.MergingProposal;
import org.eclipse.emf.emfstore.client.test.model.change.MergingSolution;
import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;
import org.eclipse.emf.emfstore.client.test.model.rationale.Proposal;
import org.eclipse.emf.emfstore.client.test.model.rationale.Solution;
import org.eclipse.emf.emfstore.client.test.model.task.Checkable;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;
import org.eclipse.emf.emfstore.common.model.NonDomainElement;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.change.ChangePackage
 * @generated
 */
public class ChangeSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ChangePackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeSwitch() {
		if (modelPackage == null) {
			modelPackage = ChangePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
	 * result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
	 * result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
	 * result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ChangePackage.MERGING_ISSUE: {
			MergingIssue mergingIssue = (MergingIssue) theEObject;
			T result = caseMergingIssue(mergingIssue);
			if (result == null)
				result = caseIssue(mergingIssue);
			if (result == null)
				result = caseCheckable(mergingIssue);
			if (result == null)
				result = caseWorkItem(mergingIssue);
			if (result == null)
				result = caseAnnotation(mergingIssue);
			if (result == null)
				result = caseUnicaseModelElement(mergingIssue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChangePackage.MERGING_PROPOSAL: {
			MergingProposal mergingProposal = (MergingProposal) theEObject;
			T result = caseMergingProposal(mergingProposal);
			if (result == null)
				result = caseProposal(mergingProposal);
			if (result == null)
				result = caseUnicaseModelElement(mergingProposal);
			if (result == null)
				result = caseNonDomainElement(mergingProposal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChangePackage.MERGING_SOLUTION: {
			MergingSolution mergingSolution = (MergingSolution) theEObject;
			T result = caseMergingSolution(mergingSolution);
			if (result == null)
				result = caseSolution(mergingSolution);
			if (result == null)
				result = caseUnicaseModelElement(mergingSolution);
			if (result == null)
				result = caseNonDomainElement(mergingSolution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Issue</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingIssue(MergingIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Proposal</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingProposal(MergingProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Solution</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingSolution(MergingSolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unicase Model Element</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unicase Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnicaseModelElement(UnicaseModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkable</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckable(Checkable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Item</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkItem(WorkItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssue(Issue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Domain Element</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonDomainElement(NonDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proposal</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProposal(Proposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // ChangeSwitch
