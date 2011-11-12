/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.classes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.emfstore.client.test.model.classes.ArgumentDirectionType;
import org.eclipse.emf.emfstore.client.test.model.classes.Association;
import org.eclipse.emf.emfstore.client.test.model.classes.AssociationType;
import org.eclipse.emf.emfstore.client.test.model.classes.Attribute;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesFactory;
import org.eclipse.emf.emfstore.client.test.model.classes.ClassesPackage;
import org.eclipse.emf.emfstore.client.test.model.classes.Dependency;
import org.eclipse.emf.emfstore.client.test.model.classes.Enumeration;
import org.eclipse.emf.emfstore.client.test.model.classes.InstantiationType;
import org.eclipse.emf.emfstore.client.test.model.classes.Literal;
import org.eclipse.emf.emfstore.client.test.model.classes.Method;
import org.eclipse.emf.emfstore.client.test.model.classes.MethodArgument;
import org.eclipse.emf.emfstore.client.test.model.classes.PrimitiveType;
import org.eclipse.emf.emfstore.client.test.model.classes.ScopeType;
import org.eclipse.emf.emfstore.client.test.model.classes.VisibilityType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClassesFactoryImpl extends EFactoryImpl implements ClassesFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ClassesFactory init() {
		try {
			ClassesFactory theClassesFactory = (ClassesFactory) EPackage.Registry.INSTANCE
				.getEFactory("http://eclipse.org/emf/emfstore/client/test/model/classes");
			if (theClassesFactory != null) {
				return theClassesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassesFactoryImpl() {
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
		case ClassesPackage.CLASS:
			return createClass();
		case ClassesPackage.PACKAGE:
			return createPackage();
		case ClassesPackage.ASSOCIATION:
			return createAssociation();
		case ClassesPackage.ATTRIBUTE:
			return createAttribute();
		case ClassesPackage.METHOD:
			return createMethod();
		case ClassesPackage.METHOD_ARGUMENT:
			return createMethodArgument();
		case ClassesPackage.DEPENDENCY:
			return createDependency();
		case ClassesPackage.ENUMERATION:
			return createEnumeration();
		case ClassesPackage.LITERAL:
			return createLiteral();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ClassesPackage.ASSOCIATION_TYPE:
			return createAssociationTypeFromString(eDataType, initialValue);
		case ClassesPackage.VISIBILITY_TYPE:
			return createVisibilityTypeFromString(eDataType, initialValue);
		case ClassesPackage.SCOPE_TYPE:
			return createScopeTypeFromString(eDataType, initialValue);
		case ClassesPackage.ARGUMENT_DIRECTION_TYPE:
			return createArgumentDirectionTypeFromString(eDataType, initialValue);
		case ClassesPackage.INSTANTIATION_TYPE:
			return createInstantiationTypeFromString(eDataType, initialValue);
		case ClassesPackage.PRIMITIVE_TYPE:
			return createPrimitiveTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ClassesPackage.ASSOCIATION_TYPE:
			return convertAssociationTypeToString(eDataType, instanceValue);
		case ClassesPackage.VISIBILITY_TYPE:
			return convertVisibilityTypeToString(eDataType, instanceValue);
		case ClassesPackage.SCOPE_TYPE:
			return convertScopeTypeToString(eDataType, instanceValue);
		case ClassesPackage.ARGUMENT_DIRECTION_TYPE:
			return convertArgumentDirectionTypeToString(eDataType, instanceValue);
		case ClassesPackage.INSTANTIATION_TYPE:
			return convertInstantiationTypeToString(eDataType, instanceValue);
		case ClassesPackage.PRIMITIVE_TYPE:
			return convertPrimitiveTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.emf.emfstore.client.test.model.classes.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MethodArgument createMethodArgument() {
		MethodArgumentImpl methodArgument = new MethodArgumentImpl();
		return methodArgument;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationType createAssociationTypeFromString(EDataType eDataType, String initialValue) {
		AssociationType result = AssociationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAssociationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VisibilityType createVisibilityTypeFromString(EDataType eDataType, String initialValue) {
		VisibilityType result = VisibilityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertVisibilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
		ScopeType result = ScopeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ArgumentDirectionType createArgumentDirectionTypeFromString(EDataType eDataType, String initialValue) {
		ArgumentDirectionType result = ArgumentDirectionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertArgumentDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InstantiationType createInstantiationTypeFromString(EDataType eDataType, String initialValue) {
		InstantiationType result = InstantiationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertInstantiationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassesPackage getClassesPackage() {
		return (ClassesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassesPackage getPackage() {
		return ClassesPackage.eINSTANCE;
	}

} // ClassesFactoryImpl
