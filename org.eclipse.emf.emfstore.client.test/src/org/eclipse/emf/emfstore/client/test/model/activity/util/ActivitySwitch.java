/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.activity.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.test.model.UnicaseModelElement;
import org.eclipse.emf.emfstore.client.test.model.activity.Activity;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityEnd;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityInitial;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityObject;
import org.eclipse.emf.emfstore.client.test.model.activity.ActivityPackage;
import org.eclipse.emf.emfstore.client.test.model.activity.Branch;
import org.eclipse.emf.emfstore.client.test.model.activity.Fork;
import org.eclipse.emf.emfstore.client.test.model.activity.Transition;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.activity.ActivityPackage
 * @generated
 */
public class ActivitySwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ActivityPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivitySwitch() {
		if (modelPackage == null) {
			modelPackage = ActivityPackage.eINSTANCE;
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
		case ActivityPackage.ACTIVITY_OBJECT: {
			ActivityObject activityObject = (ActivityObject) theEObject;
			T result = caseActivityObject(activityObject);
			if (result == null)
				result = caseUnicaseModelElement(activityObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = caseUnicaseModelElement(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseActivityObject(activity);
			if (result == null)
				result = caseUnicaseModelElement(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.FORK: {
			Fork fork = (Fork) theEObject;
			T result = caseFork(fork);
			if (result == null)
				result = caseActivityObject(fork);
			if (result == null)
				result = caseUnicaseModelElement(fork);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.BRANCH: {
			Branch branch = (Branch) theEObject;
			T result = caseBranch(branch);
			if (result == null)
				result = caseActivityObject(branch);
			if (result == null)
				result = caseUnicaseModelElement(branch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTIVITY_INITIAL: {
			ActivityInitial activityInitial = (ActivityInitial) theEObject;
			T result = caseActivityInitial(activityInitial);
			if (result == null)
				result = caseActivityObject(activityInitial);
			if (result == null)
				result = caseUnicaseModelElement(activityInitial);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTIVITY_END: {
			ActivityEnd activityEnd = (ActivityEnd) theEObject;
			T result = caseActivityEnd(activityEnd);
			if (result == null)
				result = caseActivityObject(activityEnd);
			if (result == null)
				result = caseUnicaseModelElement(activityEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityObject(ActivityObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFork(Fork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityInitial(ActivityInitial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEnd(ActivityEnd object) {
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

} // ActivitySwitch
