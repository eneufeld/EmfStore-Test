/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import testModel.TestModelPackage;
import testModel.multiRefElement;
import testModel.referenziertesElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>referenziertes Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getInt <em>Int</em>}</li>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getLong <em>Long</em>}</li>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getLongObj <em>Long Obj</em>}</li>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getShort <em>Short</em>}</li>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getShortObj <em>Short Obj</em>}</li>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getNotChangeable <em>Not Changeable</em>}</li>
 *   <li>{@link testModel.impl.referenziertesElementImpl#getMultiRef <em>Multi Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class referenziertesElementImpl extends ElementImpl implements referenziertesElement {
	/**
	 * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected static final Float FLOAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected Float float_ = FLOAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected int int_ = INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInteger() <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTEGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected Integer integer = INTEGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected static final long LONG_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected long long_ = LONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongObj() <em>Long Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongObj()
	 * @generated
	 * @ordered
	 */
	protected static final Long LONG_OBJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongObj() <em>Long Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongObj()
	 * @generated
	 * @ordered
	 */
	protected Long longObj = LONG_OBJ_EDEFAULT;

	/**
	 * The default value of the '{@link #getShort() <em>Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort()
	 * @generated
	 * @ordered
	 */
	protected static final short SHORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShort() <em>Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort()
	 * @generated
	 * @ordered
	 */
	protected short short_ = SHORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortObj() <em>Short Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortObj()
	 * @generated
	 * @ordered
	 */
	protected static final Short SHORT_OBJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortObj() <em>Short Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortObj()
	 * @generated
	 * @ordered
	 */
	protected Short shortObj = SHORT_OBJ_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotChangeable() <em>Not Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_CHANGEABLE_EDEFAULT = "NOT";

	/**
	 * The cached value of the '{@link #getNotChangeable() <em>Not Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotChangeable()
	 * @generated
	 * @ordered
	 */
	protected String notChangeable = NOT_CHANGEABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultiRef() <em>Multi Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiRef()
	 * @generated
	 * @ordered
	 */
	protected EList<multiRefElement> multiRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected referenziertesElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestModelPackage.Literals.REFERENZIERTES_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getFloat() {
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(Float newFloat) {
		Float oldFloat = float_;
		float_ = newFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.REFERENZIERTES_ELEMENT__FLOAT, oldFloat, float_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInt() {
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt(int newInt) {
		int oldInt = int_;
		int_ = newInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.REFERENZIERTES_ELEMENT__INT, oldInt, int_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInteger() {
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteger(Integer newInteger) {
		Integer oldInteger = integer;
		integer = newInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.REFERENZIERTES_ELEMENT__INTEGER, oldInteger, integer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLong() {
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong(long newLong) {
		long oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.REFERENZIERTES_ELEMENT__LONG, oldLong, long_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getLongObj() {
		return longObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongObj(Long newLongObj) {
		Long oldLongObj = longObj;
		longObj = newLongObj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.REFERENZIERTES_ELEMENT__LONG_OBJ, oldLongObj, longObj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getShort() {
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShort(short newShort) {
		short oldShort = short_;
		short_ = newShort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.REFERENZIERTES_ELEMENT__SHORT, oldShort, short_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getShortObj() {
		return shortObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortObj(Short newShortObj) {
		Short oldShortObj = shortObj;
		shortObj = newShortObj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.REFERENZIERTES_ELEMENT__SHORT_OBJ, oldShortObj, shortObj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.REFERENZIERTES_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotChangeable() {
		return notChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<multiRefElement> getMultiRef() {
		if (multiRef == null) {
			multiRef = new EObjectResolvingEList<multiRefElement>(multiRefElement.class, this, TestModelPackage.REFERENZIERTES_ELEMENT__MULTI_REF);
		}
		return multiRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestModelPackage.REFERENZIERTES_ELEMENT__FLOAT:
				return getFloat();
			case TestModelPackage.REFERENZIERTES_ELEMENT__INT:
				return getInt();
			case TestModelPackage.REFERENZIERTES_ELEMENT__INTEGER:
				return getInteger();
			case TestModelPackage.REFERENZIERTES_ELEMENT__LONG:
				return getLong();
			case TestModelPackage.REFERENZIERTES_ELEMENT__LONG_OBJ:
				return getLongObj();
			case TestModelPackage.REFERENZIERTES_ELEMENT__SHORT:
				return getShort();
			case TestModelPackage.REFERENZIERTES_ELEMENT__SHORT_OBJ:
				return getShortObj();
			case TestModelPackage.REFERENZIERTES_ELEMENT__NAME:
				return getName();
			case TestModelPackage.REFERENZIERTES_ELEMENT__NOT_CHANGEABLE:
				return getNotChangeable();
			case TestModelPackage.REFERENZIERTES_ELEMENT__MULTI_REF:
				return getMultiRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestModelPackage.REFERENZIERTES_ELEMENT__FLOAT:
				setFloat((Float)newValue);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__INT:
				setInt((Integer)newValue);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__INTEGER:
				setInteger((Integer)newValue);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__LONG:
				setLong((Long)newValue);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__LONG_OBJ:
				setLongObj((Long)newValue);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__SHORT:
				setShort((Short)newValue);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__SHORT_OBJ:
				setShortObj((Short)newValue);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__MULTI_REF:
				getMultiRef().clear();
				getMultiRef().addAll((Collection<? extends multiRefElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestModelPackage.REFERENZIERTES_ELEMENT__FLOAT:
				setFloat(FLOAT_EDEFAULT);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__INT:
				setInt(INT_EDEFAULT);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__INTEGER:
				setInteger(INTEGER_EDEFAULT);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__LONG:
				setLong(LONG_EDEFAULT);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__LONG_OBJ:
				setLongObj(LONG_OBJ_EDEFAULT);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__SHORT:
				setShort(SHORT_EDEFAULT);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__SHORT_OBJ:
				setShortObj(SHORT_OBJ_EDEFAULT);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestModelPackage.REFERENZIERTES_ELEMENT__MULTI_REF:
				getMultiRef().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestModelPackage.REFERENZIERTES_ELEMENT__FLOAT:
				return FLOAT_EDEFAULT == null ? float_ != null : !FLOAT_EDEFAULT.equals(float_);
			case TestModelPackage.REFERENZIERTES_ELEMENT__INT:
				return int_ != INT_EDEFAULT;
			case TestModelPackage.REFERENZIERTES_ELEMENT__INTEGER:
				return INTEGER_EDEFAULT == null ? integer != null : !INTEGER_EDEFAULT.equals(integer);
			case TestModelPackage.REFERENZIERTES_ELEMENT__LONG:
				return long_ != LONG_EDEFAULT;
			case TestModelPackage.REFERENZIERTES_ELEMENT__LONG_OBJ:
				return LONG_OBJ_EDEFAULT == null ? longObj != null : !LONG_OBJ_EDEFAULT.equals(longObj);
			case TestModelPackage.REFERENZIERTES_ELEMENT__SHORT:
				return short_ != SHORT_EDEFAULT;
			case TestModelPackage.REFERENZIERTES_ELEMENT__SHORT_OBJ:
				return SHORT_OBJ_EDEFAULT == null ? shortObj != null : !SHORT_OBJ_EDEFAULT.equals(shortObj);
			case TestModelPackage.REFERENZIERTES_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestModelPackage.REFERENZIERTES_ELEMENT__NOT_CHANGEABLE:
				return NOT_CHANGEABLE_EDEFAULT == null ? notChangeable != null : !NOT_CHANGEABLE_EDEFAULT.equals(notChangeable);
			case TestModelPackage.REFERENZIERTES_ELEMENT__MULTI_REF:
				return multiRef != null && !multiRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Float: ");
		result.append(float_);
		result.append(", int: ");
		result.append(int_);
		result.append(", Integer: ");
		result.append(integer);
		result.append(", long: ");
		result.append(long_);
		result.append(", LongObj: ");
		result.append(longObj);
		result.append(", short: ");
		result.append(short_);
		result.append(", ShortObj: ");
		result.append(shortObj);
		result.append(", name: ");
		result.append(name);
		result.append(", notChangeable: ");
		result.append(notChangeable);
		result.append(')');
		return result.toString();
	}

} //referenziertesElementImpl
