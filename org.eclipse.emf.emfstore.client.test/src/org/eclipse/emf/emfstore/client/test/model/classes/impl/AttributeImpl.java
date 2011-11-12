/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.test.model.classes.Attribute;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.Enumeration;
import org.eclipse.emf.emfstore.client.test.model.classes.PrimitiveType;
import org.eclipse.emf.emfstore.client.test.model.classes.ScopeType;
import org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getDefiningClass <em>Defining Class
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getVisibility <em>Visibility</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getScope <em>Scope</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getSignature <em>Signature</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getDefaultValue <em>Default Value
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getProperties <em>Properties</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getLabel <em>Label</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#isId <em>Id</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getImplementationType <em>
 * Implementation Type</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#getImplementationEnumeration <em>
 * Implementation Enumeration</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.classes.impl.AttributeImpl#isTransient <em>Transient</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AttributeImpl extends UnicaseModelElementImpl implements Attribute {
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
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #isId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected boolean id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationType() <em>Implementation Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getImplementationType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType IMPLEMENTATION_TYPE_EDEFAULT = PrimitiveType.STRING;

	/**
	 * The cached value of the '{@link #getImplementationType() <em>Implementation Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getImplementationType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType implementationType = IMPLEMENTATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementationEnumeration() <em>Implementation Enumeration</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getImplementationEnumeration()
	 * @generated
	 * @ordered
	 */
	protected Enumeration implementationEnumeration;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Class getDefiningClass() {
		if (eContainerFeatureID() != ClassesPackage.ATTRIBUTE__DEFINING_CLASS)
			return null;
		return (org.eclipse.emf.emfstore.client.test.model.classes.Class) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Class basicGetDefiningClass() {
		if (eContainerFeatureID() != ClassesPackage.ATTRIBUTE__DEFINING_CLASS)
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
		msgs = eBasicSetContainer((InternalEObject) newDefiningClass, ClassesPackage.ATTRIBUTE__DEFINING_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefiningClass(org.eclipse.emf.emfstore.client.test.model.classes.Class newDefiningClass) {
		if (newDefiningClass != eInternalContainer()
			|| (eContainerFeatureID() != ClassesPackage.ATTRIBUTE__DEFINING_CLASS && newDefiningClass != null)) {
			if (EcoreUtil.isAncestor(this, newDefiningClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefiningClass != null)
				msgs = ((InternalEObject) newDefiningClass).eInverseAdd(this, ClassesPackage.CLASS__ATTRIBUTES,
					org.eclipse.emf.emfstore.client.test.model.classes.Class.class, msgs);
			msgs = basicSetDefiningClass(newDefiningClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__DEFINING_CLASS,
				newDefiningClass, newDefiningClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__VISIBILITY, oldVisibility,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__SCOPE, oldScope, scope));
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
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__DEFAULT_VALUE,
				oldDefaultValue, defaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__PROPERTIES, oldProperties,
				properties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(boolean newId) {
		boolean oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PrimitiveType getImplementationType() {
		return implementationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setImplementationType(PrimitiveType newImplementationType) {
		PrimitiveType oldImplementationType = implementationType;
		implementationType = newImplementationType == null ? IMPLEMENTATION_TYPE_EDEFAULT : newImplementationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__IMPLEMENTATION_TYPE,
				oldImplementationType, implementationType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Enumeration getImplementationEnumeration() {
		if (implementationEnumeration != null && implementationEnumeration.eIsProxy()) {
			InternalEObject oldImplementationEnumeration = (InternalEObject) implementationEnumeration;
			implementationEnumeration = (Enumeration) eResolveProxy(oldImplementationEnumeration);
			if (implementationEnumeration != oldImplementationEnumeration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION, oldImplementationEnumeration,
						implementationEnumeration));
			}
		}
		return implementationEnumeration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Enumeration basicGetImplementationEnumeration() {
		return implementationEnumeration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetImplementationEnumeration(Enumeration newImplementationEnumeration,
		NotificationChain msgs) {
		Enumeration oldImplementationEnumeration = implementationEnumeration;
		implementationEnumeration = newImplementationEnumeration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION, oldImplementationEnumeration,
				newImplementationEnumeration);
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
	public void setImplementationEnumeration(Enumeration newImplementationEnumeration) {
		if (newImplementationEnumeration != implementationEnumeration) {
			NotificationChain msgs = null;
			if (implementationEnumeration != null)
				msgs = ((InternalEObject) implementationEnumeration).eInverseRemove(this,
					ClassesPackage.ENUMERATION__ATTRIBUTES, Enumeration.class, msgs);
			if (newImplementationEnumeration != null)
				msgs = ((InternalEObject) newImplementationEnumeration).eInverseAdd(this,
					ClassesPackage.ENUMERATION__ATTRIBUTES, Enumeration.class, msgs);
			msgs = basicSetImplementationEnumeration(newImplementationEnumeration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION,
				newImplementationEnumeration, newImplementationEnumeration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ATTRIBUTE__TRANSIENT, oldTransient,
				transient_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ClassesPackage.ATTRIBUTE__DEFINING_CLASS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDefiningClass((org.eclipse.emf.emfstore.client.test.model.classes.Class) otherEnd, msgs);
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION:
			if (implementationEnumeration != null)
				msgs = ((InternalEObject) implementationEnumeration).eInverseRemove(this,
					ClassesPackage.ENUMERATION__ATTRIBUTES, Enumeration.class, msgs);
			return basicSetImplementationEnumeration((Enumeration) otherEnd, msgs);
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
		case ClassesPackage.ATTRIBUTE__DEFINING_CLASS:
			return basicSetDefiningClass(null, msgs);
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION:
			return basicSetImplementationEnumeration(null, msgs);
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
		case ClassesPackage.ATTRIBUTE__DEFINING_CLASS:
			return eInternalContainer().eInverseRemove(this, ClassesPackage.CLASS__ATTRIBUTES,
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
		case ClassesPackage.ATTRIBUTE__DEFINING_CLASS:
			if (resolve)
				return getDefiningClass();
			return basicGetDefiningClass();
		case ClassesPackage.ATTRIBUTE__VISIBILITY:
			return getVisibility();
		case ClassesPackage.ATTRIBUTE__SCOPE:
			return getScope();
		case ClassesPackage.ATTRIBUTE__SIGNATURE:
			return getSignature();
		case ClassesPackage.ATTRIBUTE__TYPE:
			return getType();
		case ClassesPackage.ATTRIBUTE__DEFAULT_VALUE:
			return getDefaultValue();
		case ClassesPackage.ATTRIBUTE__PROPERTIES:
			return getProperties();
		case ClassesPackage.ATTRIBUTE__LABEL:
			return getLabel();
		case ClassesPackage.ATTRIBUTE__ID:
			return isId();
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_TYPE:
			return getImplementationType();
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION:
			if (resolve)
				return getImplementationEnumeration();
			return basicGetImplementationEnumeration();
		case ClassesPackage.ATTRIBUTE__TRANSIENT:
			return isTransient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ClassesPackage.ATTRIBUTE__DEFINING_CLASS:
			setDefiningClass((org.eclipse.emf.emfstore.client.test.model.classes.Class) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__VISIBILITY:
			setVisibility((VisibilityType) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__SCOPE:
			setScope((ScopeType) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__TYPE:
			setType((String) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__PROPERTIES:
			setProperties((String) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__LABEL:
			setLabel((String) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__ID:
			setId((Boolean) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_TYPE:
			setImplementationType((PrimitiveType) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION:
			setImplementationEnumeration((Enumeration) newValue);
			return;
		case ClassesPackage.ATTRIBUTE__TRANSIENT:
			setTransient((Boolean) newValue);
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
		case ClassesPackage.ATTRIBUTE__DEFINING_CLASS:
			setDefiningClass((org.eclipse.emf.emfstore.client.test.model.classes.Class) null);
			return;
		case ClassesPackage.ATTRIBUTE__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case ClassesPackage.ATTRIBUTE__SCOPE:
			setScope(SCOPE_EDEFAULT);
			return;
		case ClassesPackage.ATTRIBUTE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ClassesPackage.ATTRIBUTE__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case ClassesPackage.ATTRIBUTE__PROPERTIES:
			setProperties(PROPERTIES_EDEFAULT);
			return;
		case ClassesPackage.ATTRIBUTE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case ClassesPackage.ATTRIBUTE__ID:
			setId(ID_EDEFAULT);
			return;
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_TYPE:
			setImplementationType(IMPLEMENTATION_TYPE_EDEFAULT);
			return;
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION:
			setImplementationEnumeration((Enumeration) null);
			return;
		case ClassesPackage.ATTRIBUTE__TRANSIENT:
			setTransient(TRANSIENT_EDEFAULT);
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
		case ClassesPackage.ATTRIBUTE__DEFINING_CLASS:
			return basicGetDefiningClass() != null;
		case ClassesPackage.ATTRIBUTE__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case ClassesPackage.ATTRIBUTE__SCOPE:
			return scope != SCOPE_EDEFAULT;
		case ClassesPackage.ATTRIBUTE__SIGNATURE:
			return SIGNATURE_EDEFAULT == null ? getSignature() != null : !SIGNATURE_EDEFAULT.equals(getSignature());
		case ClassesPackage.ATTRIBUTE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ClassesPackage.ATTRIBUTE__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		case ClassesPackage.ATTRIBUTE__PROPERTIES:
			return PROPERTIES_EDEFAULT == null ? properties != null : !PROPERTIES_EDEFAULT.equals(properties);
		case ClassesPackage.ATTRIBUTE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case ClassesPackage.ATTRIBUTE__ID:
			return id != ID_EDEFAULT;
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_TYPE:
			return implementationType != IMPLEMENTATION_TYPE_EDEFAULT;
		case ClassesPackage.ATTRIBUTE__IMPLEMENTATION_ENUMERATION:
			return implementationEnumeration != null;
		case ClassesPackage.ATTRIBUTE__TRANSIENT:
			return transient_ != TRANSIENT_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", properties: ");
		result.append(properties);
		result.append(", label: ");
		result.append(label);
		result.append(", id: ");
		result.append(id);
		result.append(", implementationType: ");
		result.append(implementationType);
		result.append(", transient: ");
		result.append(transient_);
		result.append(')');
		return result.toString();
	}

} // AttributeImpl
