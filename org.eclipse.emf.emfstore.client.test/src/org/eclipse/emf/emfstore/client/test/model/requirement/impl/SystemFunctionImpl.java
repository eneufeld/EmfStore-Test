/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.requirement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.requirement.NonFunctionalRequirement;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.SystemFunction;
import org.eclipse.emf.emfstore.client.test.model.requirement.UseCase;
import org.eclipse.emf.emfstore.client.test.model.requirement.Workspace;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>System Function</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl#getInput <em>Input</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl#getOutput <em>Output</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl#getException <em>Exception
 * </em>}</li>
 * <li>
 * {@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl#getNonFunctionalRequirement
 * <em>Non Functional Requirement</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl#getUsecases <em>Usecases
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.requirement.impl.SystemFunctionImpl#getWorkspace <em>Workspace
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SystemFunctionImpl extends UnicaseModelElementImpl implements SystemFunction {
	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected String input = INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected String output = OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getException() <em>Exception</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected String exception = EXCEPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNonFunctionalRequirement() <em>Non Functional Requirement</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNonFunctionalRequirement()
	 * @generated
	 * @ordered
	 */
	protected NonFunctionalRequirement nonFunctionalRequirement;

	/**
	 * The cached value of the '{@link #getUsecases() <em>Usecases</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getUsecases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> usecases;

	/**
	 * The cached value of the '{@link #getWorkspace() <em>Workspace</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getWorkspace()
	 * @generated
	 * @ordered
	 */
	protected Workspace workspace;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SystemFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.SYSTEM_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInput(String newInput) {
		String oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.SYSTEM_FUNCTION__INPUT, oldInput,
				input));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOutput(String newOutput) {
		String oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.SYSTEM_FUNCTION__OUTPUT,
				oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setException(String newException) {
		String oldException = exception;
		exception = newException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.SYSTEM_FUNCTION__EXCEPTION,
				oldException, exception));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NonFunctionalRequirement getNonFunctionalRequirement() {
		if (nonFunctionalRequirement != null && nonFunctionalRequirement.eIsProxy()) {
			InternalEObject oldNonFunctionalRequirement = (InternalEObject) nonFunctionalRequirement;
			nonFunctionalRequirement = (NonFunctionalRequirement) eResolveProxy(oldNonFunctionalRequirement);
			if (nonFunctionalRequirement != oldNonFunctionalRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT, oldNonFunctionalRequirement,
						nonFunctionalRequirement));
			}
		}
		return nonFunctionalRequirement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NonFunctionalRequirement basicGetNonFunctionalRequirement() {
		return nonFunctionalRequirement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNonFunctionalRequirement(NonFunctionalRequirement newNonFunctionalRequirement,
		NotificationChain msgs) {
		NonFunctionalRequirement oldNonFunctionalRequirement = nonFunctionalRequirement;
		nonFunctionalRequirement = newNonFunctionalRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT, oldNonFunctionalRequirement,
				newNonFunctionalRequirement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNonFunctionalRequirement(NonFunctionalRequirement newNonFunctionalRequirement) {
		if (newNonFunctionalRequirement != nonFunctionalRequirement) {
			NotificationChain msgs = null;
			if (nonFunctionalRequirement != null)
				msgs = ((InternalEObject) nonFunctionalRequirement).eInverseRemove(this,
					RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS, NonFunctionalRequirement.class,
					msgs);
			if (newNonFunctionalRequirement != null)
				msgs = ((InternalEObject) newNonFunctionalRequirement).eInverseAdd(this,
					RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS, NonFunctionalRequirement.class,
					msgs);
			msgs = basicSetNonFunctionalRequirement(newNonFunctionalRequirement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT, newNonFunctionalRequirement,
				newNonFunctionalRequirement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UseCase> getUsecases() {
		if (usecases == null) {
			usecases = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this,
				RequirementPackage.SYSTEM_FUNCTION__USECASES, RequirementPackage.USE_CASE__SYSTEM_FUNCTIONS);
		}
		return usecases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Workspace getWorkspace() {
		if (workspace != null && workspace.eIsProxy()) {
			InternalEObject oldWorkspace = (InternalEObject) workspace;
			workspace = (Workspace) eResolveProxy(oldWorkspace);
			if (workspace != oldWorkspace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						RequirementPackage.SYSTEM_FUNCTION__WORKSPACE, oldWorkspace, workspace));
			}
		}
		return workspace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Workspace basicGetWorkspace() {
		return workspace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetWorkspace(Workspace newWorkspace, NotificationChain msgs) {
		Workspace oldWorkspace = workspace;
		workspace = newWorkspace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				RequirementPackage.SYSTEM_FUNCTION__WORKSPACE, oldWorkspace, newWorkspace);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWorkspace(Workspace newWorkspace) {
		if (newWorkspace != workspace) {
			NotificationChain msgs = null;
			if (workspace != null)
				msgs = ((InternalEObject) workspace).eInverseRemove(this,
					RequirementPackage.WORKSPACE__SYSTEM_FUNCTIONS, Workspace.class, msgs);
			if (newWorkspace != null)
				msgs = ((InternalEObject) newWorkspace).eInverseAdd(this,
					RequirementPackage.WORKSPACE__SYSTEM_FUNCTIONS, Workspace.class, msgs);
			msgs = basicSetWorkspace(newWorkspace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.SYSTEM_FUNCTION__WORKSPACE,
				newWorkspace, newWorkspace));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT:
			if (nonFunctionalRequirement != null)
				msgs = ((InternalEObject) nonFunctionalRequirement).eInverseRemove(this,
					RequirementPackage.NON_FUNCTIONAL_REQUIREMENT__SYSTEM_FUNCTIONS, NonFunctionalRequirement.class,
					msgs);
			return basicSetNonFunctionalRequirement((NonFunctionalRequirement) otherEnd, msgs);
		case RequirementPackage.SYSTEM_FUNCTION__USECASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUsecases()).basicAdd(otherEnd, msgs);
		case RequirementPackage.SYSTEM_FUNCTION__WORKSPACE:
			if (workspace != null)
				msgs = ((InternalEObject) workspace).eInverseRemove(this,
					RequirementPackage.WORKSPACE__SYSTEM_FUNCTIONS, Workspace.class, msgs);
			return basicSetWorkspace((Workspace) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT:
			return basicSetNonFunctionalRequirement(null, msgs);
		case RequirementPackage.SYSTEM_FUNCTION__USECASES:
			return ((InternalEList<?>) getUsecases()).basicRemove(otherEnd, msgs);
		case RequirementPackage.SYSTEM_FUNCTION__WORKSPACE:
			return basicSetWorkspace(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementPackage.SYSTEM_FUNCTION__INPUT:
			return getInput();
		case RequirementPackage.SYSTEM_FUNCTION__OUTPUT:
			return getOutput();
		case RequirementPackage.SYSTEM_FUNCTION__EXCEPTION:
			return getException();
		case RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT:
			if (resolve)
				return getNonFunctionalRequirement();
			return basicGetNonFunctionalRequirement();
		case RequirementPackage.SYSTEM_FUNCTION__USECASES:
			return getUsecases();
		case RequirementPackage.SYSTEM_FUNCTION__WORKSPACE:
			if (resolve)
				return getWorkspace();
			return basicGetWorkspace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RequirementPackage.SYSTEM_FUNCTION__INPUT:
			setInput((String) newValue);
			return;
		case RequirementPackage.SYSTEM_FUNCTION__OUTPUT:
			setOutput((String) newValue);
			return;
		case RequirementPackage.SYSTEM_FUNCTION__EXCEPTION:
			setException((String) newValue);
			return;
		case RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT:
			setNonFunctionalRequirement((NonFunctionalRequirement) newValue);
			return;
		case RequirementPackage.SYSTEM_FUNCTION__USECASES:
			getUsecases().clear();
			getUsecases().addAll((Collection<? extends UseCase>) newValue);
			return;
		case RequirementPackage.SYSTEM_FUNCTION__WORKSPACE:
			setWorkspace((Workspace) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RequirementPackage.SYSTEM_FUNCTION__INPUT:
			setInput(INPUT_EDEFAULT);
			return;
		case RequirementPackage.SYSTEM_FUNCTION__OUTPUT:
			setOutput(OUTPUT_EDEFAULT);
			return;
		case RequirementPackage.SYSTEM_FUNCTION__EXCEPTION:
			setException(EXCEPTION_EDEFAULT);
			return;
		case RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT:
			setNonFunctionalRequirement((NonFunctionalRequirement) null);
			return;
		case RequirementPackage.SYSTEM_FUNCTION__USECASES:
			getUsecases().clear();
			return;
		case RequirementPackage.SYSTEM_FUNCTION__WORKSPACE:
			setWorkspace((Workspace) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RequirementPackage.SYSTEM_FUNCTION__INPUT:
			return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
		case RequirementPackage.SYSTEM_FUNCTION__OUTPUT:
			return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
		case RequirementPackage.SYSTEM_FUNCTION__EXCEPTION:
			return EXCEPTION_EDEFAULT == null ? exception != null : !EXCEPTION_EDEFAULT.equals(exception);
		case RequirementPackage.SYSTEM_FUNCTION__NON_FUNCTIONAL_REQUIREMENT:
			return nonFunctionalRequirement != null;
		case RequirementPackage.SYSTEM_FUNCTION__USECASES:
			return usecases != null && !usecases.isEmpty();
		case RequirementPackage.SYSTEM_FUNCTION__WORKSPACE:
			return workspace != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (input: ");
		result.append(input);
		result.append(", output: ");
		result.append(output);
		result.append(", exception: ");
		result.append(exception);
		result.append(')');
		return result.toString();
	}

} // SystemFunctionImpl
