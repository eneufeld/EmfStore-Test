/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.Method;
import org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument;
import org.eclipse.emf.emfstore.client.test.model.classes.ScopeType;
import org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.requirement.RequirementPackage;
import org.eclipse.emf.emfstore.client.test.model.requirement.Scenario;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Method</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getVisibility <em>Visibility</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getScope <em>Scope</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getSignature <em>Signature</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getArguments <em>Arguments</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getProperties <em>Properties</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getDefiningClass <em>Defining Class
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getLabel <em>Label</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#isStubbed <em>Stubbed</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getCalledMethods <em>Called Methods
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getCallingMethods <em>Calling Methods
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.MethodImpl#getDemoParticipations <em>Demo
 * Participations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MethodImpl extends UnicaseModelElementImpl implements Method {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityType VISIBILITY_EDEFAULT = VisibilityType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityType visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeType SCOPE_EDEFAULT = ScopeType.INSTANCE;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected ScopeType scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodArgument> arguments;

	/**
	 * The default value of the '{@link #getProperties() <em>Properties</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected String properties = PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isStubbed() <em>Stubbed</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isStubbed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STUBBED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStubbed() <em>Stubbed</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isStubbed()
	 * @generated
	 * @ordered
	 */
	protected boolean stubbed = STUBBED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalledMethods() <em>Called Methods</em>}' reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getCalledMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> calledMethods;

	/**
	 * The cached value of the '{@link #getCallingMethods() <em>Calling Methods</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCallingMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> callingMethods;

	/**
	 * The cached value of the '{@link #getDemoParticipations() <em>Demo Participations</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDemoParticipations()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> demoParticipations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VisibilityType getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVisibility(VisibilityType newVisibility) {
		VisibilityType oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD__VISIBILITY, oldVisibility,
				visibility));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScopeType getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setScope(ScopeType newScope) {
		ScopeType oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD__RETURN_TYPE, oldReturnType,
				returnType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSignature() {
		// TODO: implement this method to return the 'Signature' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MethodArgument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList.Resolving<MethodArgument>(MethodArgument.class, this,
				ClassesPackage.METHOD__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProperties(String newProperties) {
		String oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD__PROPERTIES, oldProperties,
				properties));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Class getDefiningClass() {
		if (eContainerFeatureID() != ClassesPackage.METHOD__DEFINING_CLASS)
			return null;
		return (org.eclipse.emf.emfstore.client.test.model.classes.Class) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Class basicGetDefiningClass() {
		if (eContainerFeatureID() != ClassesPackage.METHOD__DEFINING_CLASS)
			return null;
		return (org.eclipse.emf.emfstore.client.test.model.classes.Class) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDefiningClass(
		org.eclipse.emf.emfstore.client.test.model.classes.Class newDefiningClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDefiningClass, ClassesPackage.METHOD__DEFINING_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefiningClass(org.eclipse.emf.emfstore.client.test.model.classes.Class newDefiningClass) {
		if (newDefiningClass != eInternalContainer()
			|| (eContainerFeatureID() != ClassesPackage.METHOD__DEFINING_CLASS && newDefiningClass != null)) {
			if (EcoreUtil.isAncestor(this, newDefiningClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefiningClass != null)
				msgs = ((InternalEObject) newDefiningClass).eInverseAdd(this, ClassesPackage.CLASS__METHODS,
					org.eclipse.emf.emfstore.client.test.model.classes.Class.class, msgs);
			msgs = basicSetDefiningClass(newDefiningClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD__DEFINING_CLASS,
				newDefiningClass, newDefiningClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isStubbed() {
		return stubbed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStubbed(boolean newStubbed) {
		boolean oldStubbed = stubbed;
		stubbed = newStubbed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.METHOD__STUBBED, oldStubbed, stubbed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Method> getCalledMethods() {
		if (calledMethods == null) {
			calledMethods = new EObjectWithInverseResolvingEList.ManyInverse<Method>(Method.class, this,
				ClassesPackage.METHOD__CALLED_METHODS, ClassesPackage.METHOD__CALLING_METHODS);
		}
		return calledMethods;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Method> getCallingMethods() {
		if (callingMethods == null) {
			callingMethods = new EObjectWithInverseResolvingEList.ManyInverse<Method>(Method.class, this,
				ClassesPackage.METHOD__CALLING_METHODS, ClassesPackage.METHOD__CALLED_METHODS);
		}
		return callingMethods;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Scenario> getDemoParticipations() {
		if (demoParticipations == null) {
			demoParticipations = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
				ClassesPackage.METHOD__DEMO_PARTICIPATIONS, RequirementPackage.SCENARIO__PARTICIPATING_METHODS);
		}
		return demoParticipations;
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
		case ClassesPackage.METHOD__DEFINING_CLASS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDefiningClass((org.eclipse.emf.emfstore.client.test.model.classes.Class) otherEnd, msgs);
		case ClassesPackage.METHOD__CALLED_METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCalledMethods()).basicAdd(otherEnd, msgs);
		case ClassesPackage.METHOD__CALLING_METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCallingMethods()).basicAdd(otherEnd, msgs);
		case ClassesPackage.METHOD__DEMO_PARTICIPATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDemoParticipations()).basicAdd(otherEnd,
				msgs);
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
		case ClassesPackage.METHOD__ARGUMENTS:
			return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
		case ClassesPackage.METHOD__DEFINING_CLASS:
			return basicSetDefiningClass(null, msgs);
		case ClassesPackage.METHOD__CALLED_METHODS:
			return ((InternalEList<?>) getCalledMethods()).basicRemove(otherEnd, msgs);
		case ClassesPackage.METHOD__CALLING_METHODS:
			return ((InternalEList<?>) getCallingMethods()).basicRemove(otherEnd, msgs);
		case ClassesPackage.METHOD__DEMO_PARTICIPATIONS:
			return ((InternalEList<?>) getDemoParticipations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ClassesPackage.METHOD__DEFINING_CLASS:
			return eInternalContainer().eInverseRemove(this, ClassesPackage.CLASS__METHODS,
				org.eclipse.emf.emfstore.client.test.model.classes.Class.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ClassesPackage.METHOD__VISIBILITY:
			return getVisibility();
		case ClassesPackage.METHOD__SCOPE:
			return getScope();
		case ClassesPackage.METHOD__RETURN_TYPE:
			return getReturnType();
		case ClassesPackage.METHOD__SIGNATURE:
			return getSignature();
		case ClassesPackage.METHOD__ARGUMENTS:
			return getArguments();
		case ClassesPackage.METHOD__PROPERTIES:
			return getProperties();
		case ClassesPackage.METHOD__DEFINING_CLASS:
			if (resolve)
				return getDefiningClass();
			return basicGetDefiningClass();
		case ClassesPackage.METHOD__LABEL:
			return getLabel();
		case ClassesPackage.METHOD__STUBBED:
			return isStubbed();
		case ClassesPackage.METHOD__CALLED_METHODS:
			return getCalledMethods();
		case ClassesPackage.METHOD__CALLING_METHODS:
			return getCallingMethods();
		case ClassesPackage.METHOD__DEMO_PARTICIPATIONS:
			return getDemoParticipations();
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
		case ClassesPackage.METHOD__VISIBILITY:
			setVisibility((VisibilityType) newValue);
			return;
		case ClassesPackage.METHOD__SCOPE:
			setScope((ScopeType) newValue);
			return;
		case ClassesPackage.METHOD__RETURN_TYPE:
			setReturnType((String) newValue);
			return;
		case ClassesPackage.METHOD__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection<? extends MethodArgument>) newValue);
			return;
		case ClassesPackage.METHOD__PROPERTIES:
			setProperties((String) newValue);
			return;
		case ClassesPackage.METHOD__DEFINING_CLASS:
			setDefiningClass((org.eclipse.emf.emfstore.client.test.model.classes.Class) newValue);
			return;
		case ClassesPackage.METHOD__LABEL:
			setLabel((String) newValue);
			return;
		case ClassesPackage.METHOD__STUBBED:
			setStubbed((Boolean) newValue);
			return;
		case ClassesPackage.METHOD__CALLED_METHODS:
			getCalledMethods().clear();
			getCalledMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case ClassesPackage.METHOD__CALLING_METHODS:
			getCallingMethods().clear();
			getCallingMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case ClassesPackage.METHOD__DEMO_PARTICIPATIONS:
			getDemoParticipations().clear();
			getDemoParticipations().addAll((Collection<? extends Scenario>) newValue);
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
		case ClassesPackage.METHOD__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case ClassesPackage.METHOD__SCOPE:
			setScope(SCOPE_EDEFAULT);
			return;
		case ClassesPackage.METHOD__RETURN_TYPE:
			setReturnType(RETURN_TYPE_EDEFAULT);
			return;
		case ClassesPackage.METHOD__ARGUMENTS:
			getArguments().clear();
			return;
		case ClassesPackage.METHOD__PROPERTIES:
			setProperties(PROPERTIES_EDEFAULT);
			return;
		case ClassesPackage.METHOD__DEFINING_CLASS:
			setDefiningClass((org.eclipse.emf.emfstore.client.test.model.classes.Class) null);
			return;
		case ClassesPackage.METHOD__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case ClassesPackage.METHOD__STUBBED:
			setStubbed(STUBBED_EDEFAULT);
			return;
		case ClassesPackage.METHOD__CALLED_METHODS:
			getCalledMethods().clear();
			return;
		case ClassesPackage.METHOD__CALLING_METHODS:
			getCallingMethods().clear();
			return;
		case ClassesPackage.METHOD__DEMO_PARTICIPATIONS:
			getDemoParticipations().clear();
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
		case ClassesPackage.METHOD__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case ClassesPackage.METHOD__SCOPE:
			return scope != SCOPE_EDEFAULT;
		case ClassesPackage.METHOD__RETURN_TYPE:
			return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
		case ClassesPackage.METHOD__SIGNATURE:
			return SIGNATURE_EDEFAULT == null ? getSignature() != null : !SIGNATURE_EDEFAULT.equals(getSignature());
		case ClassesPackage.METHOD__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
		case ClassesPackage.METHOD__PROPERTIES:
			return PROPERTIES_EDEFAULT == null ? properties != null : !PROPERTIES_EDEFAULT.equals(properties);
		case ClassesPackage.METHOD__DEFINING_CLASS:
			return basicGetDefiningClass() != null;
		case ClassesPackage.METHOD__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case ClassesPackage.METHOD__STUBBED:
			return stubbed != STUBBED_EDEFAULT;
		case ClassesPackage.METHOD__CALLED_METHODS:
			return calledMethods != null && !calledMethods.isEmpty();
		case ClassesPackage.METHOD__CALLING_METHODS:
			return callingMethods != null && !callingMethods.isEmpty();
		case ClassesPackage.METHOD__DEMO_PARTICIPATIONS:
			return demoParticipations != null && !demoParticipations.isEmpty();
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", scope: ");
		result.append(scope);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", properties: ");
		result.append(properties);
		result.append(", label: ");
		result.append(label);
		result.append(", stubbed: ");
		result.append(stubbed);
		result.append(')');
		return result.toString();
	}

} // MethodImpl
