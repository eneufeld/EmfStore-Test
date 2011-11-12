/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.meeting.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.UnicaseModelElementImpl;
import org.eclipse.emf.emfstore.client.test.model.meeting.IssueMeetingSection;
import org.eclipse.emf.emfstore.client.test.model.meeting.Meeting;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingPackage;
import org.eclipse.emf.emfstore.client.test.model.meeting.MeetingSection;
import org.eclipse.emf.emfstore.client.test.model.meeting.WorkItemMeetingSection;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;
import org.eclipse.emf.emfstore.client.test.model.organization.User;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Meeting</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getStarttime <em>Starttime</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getEndtime <em>Endtime</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getFacilitator <em>Facilitator</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getMinutetaker <em>Minutetaker</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getTimekeeper <em>Timekeeper</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getParticipants <em>Participants</em>}
 * </li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getSections <em>Sections</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getIdentifiedIssuesSection <em>
 * Identified Issues Section</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.meeting.impl.MeetingImpl#getIdentifiedWorkItemsSection <em>
 * Identified Work Items Section</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MeetingImpl extends UnicaseModelElementImpl implements Meeting {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStarttime() <em>Starttime</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStarttime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STARTTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStarttime() <em>Starttime</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStarttime()
	 * @generated
	 * @ordered
	 */
	protected Date starttime = STARTTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndtime() <em>Endtime</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEndtime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENDTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndtime() <em>Endtime</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEndtime()
	 * @generated
	 * @ordered
	 */
	protected Date endtime = ENDTIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFacilitator() <em>Facilitator</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getFacilitator()
	 * @generated
	 * @ordered
	 */
	protected User facilitator;

	/**
	 * The cached value of the '{@link #getMinutetaker() <em>Minutetaker</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMinutetaker()
	 * @generated
	 * @ordered
	 */
	protected User minutetaker;

	/**
	 * The cached value of the '{@link #getTimekeeper() <em>Timekeeper</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTimekeeper()
	 * @generated
	 * @ordered
	 */
	protected User timekeeper;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgUnit> participants;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<MeetingSection> sections;

	/**
	 * The cached value of the '{@link #getIdentifiedIssuesSection() <em>Identified Issues Section</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIdentifiedIssuesSection()
	 * @generated
	 * @ordered
	 */
	protected IssueMeetingSection identifiedIssuesSection;

	/**
	 * The cached value of the '{@link #getIdentifiedWorkItemsSection() <em>Identified Work Items Section</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIdentifiedWorkItemsSection()
	 * @generated
	 * @ordered
	 */
	protected WorkItemMeetingSection identifiedWorkItemsSection;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MeetingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeetingPackage.Literals.MEETING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeetingPackage.MEETING__LOCATION, oldLocation,
				location));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getStarttime() {
		return starttime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStarttime(Date newStarttime) {
		Date oldStarttime = starttime;
		starttime = newStarttime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeetingPackage.MEETING__STARTTIME, oldStarttime,
				starttime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getEndtime() {
		return endtime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEndtime(Date newEndtime) {
		Date oldEndtime = endtime;
		endtime = newEndtime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeetingPackage.MEETING__ENDTIME, oldEndtime, endtime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public User getFacilitator() {
		if (facilitator != null && facilitator.eIsProxy()) {
			InternalEObject oldFacilitator = (InternalEObject) facilitator;
			facilitator = (User) eResolveProxy(oldFacilitator);
			if (facilitator != oldFacilitator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeetingPackage.MEETING__FACILITATOR,
						oldFacilitator, facilitator));
			}
		}
		return facilitator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public User basicGetFacilitator() {
		return facilitator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFacilitator(User newFacilitator) {
		User oldFacilitator = facilitator;
		facilitator = newFacilitator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeetingPackage.MEETING__FACILITATOR, oldFacilitator,
				facilitator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public User getMinutetaker() {
		if (minutetaker != null && minutetaker.eIsProxy()) {
			InternalEObject oldMinutetaker = (InternalEObject) minutetaker;
			minutetaker = (User) eResolveProxy(oldMinutetaker);
			if (minutetaker != oldMinutetaker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeetingPackage.MEETING__MINUTETAKER,
						oldMinutetaker, minutetaker));
			}
		}
		return minutetaker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public User basicGetMinutetaker() {
		return minutetaker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMinutetaker(User newMinutetaker) {
		User oldMinutetaker = minutetaker;
		minutetaker = newMinutetaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeetingPackage.MEETING__MINUTETAKER, oldMinutetaker,
				minutetaker));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public User getTimekeeper() {
		if (timekeeper != null && timekeeper.eIsProxy()) {
			InternalEObject oldTimekeeper = (InternalEObject) timekeeper;
			timekeeper = (User) eResolveProxy(oldTimekeeper);
			if (timekeeper != oldTimekeeper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeetingPackage.MEETING__TIMEKEEPER,
						oldTimekeeper, timekeeper));
			}
		}
		return timekeeper;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public User basicGetTimekeeper() {
		return timekeeper;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTimekeeper(User newTimekeeper) {
		User oldTimekeeper = timekeeper;
		timekeeper = newTimekeeper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeetingPackage.MEETING__TIMEKEEPER, oldTimekeeper,
				timekeeper));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OrgUnit> getParticipants() {
		if (participants == null) {
			participants = new EObjectResolvingEList<OrgUnit>(OrgUnit.class, this, MeetingPackage.MEETING__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MeetingSection> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList.Resolving<MeetingSection>(MeetingSection.class, this,
				MeetingPackage.MEETING__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IssueMeetingSection getIdentifiedIssuesSection() {
		if (identifiedIssuesSection != null && identifiedIssuesSection.eIsProxy()) {
			InternalEObject oldIdentifiedIssuesSection = (InternalEObject) identifiedIssuesSection;
			identifiedIssuesSection = (IssueMeetingSection) eResolveProxy(oldIdentifiedIssuesSection);
			if (identifiedIssuesSection != oldIdentifiedIssuesSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						MeetingPackage.MEETING__IDENTIFIED_ISSUES_SECTION, oldIdentifiedIssuesSection,
						identifiedIssuesSection));
			}
		}
		return identifiedIssuesSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IssueMeetingSection basicGetIdentifiedIssuesSection() {
		return identifiedIssuesSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIdentifiedIssuesSection(IssueMeetingSection newIdentifiedIssuesSection) {
		IssueMeetingSection oldIdentifiedIssuesSection = identifiedIssuesSection;
		identifiedIssuesSection = newIdentifiedIssuesSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeetingPackage.MEETING__IDENTIFIED_ISSUES_SECTION,
				oldIdentifiedIssuesSection, identifiedIssuesSection));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkItemMeetingSection getIdentifiedWorkItemsSection() {
		if (identifiedWorkItemsSection != null && identifiedWorkItemsSection.eIsProxy()) {
			InternalEObject oldIdentifiedWorkItemsSection = (InternalEObject) identifiedWorkItemsSection;
			identifiedWorkItemsSection = (WorkItemMeetingSection) eResolveProxy(oldIdentifiedWorkItemsSection);
			if (identifiedWorkItemsSection != oldIdentifiedWorkItemsSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						MeetingPackage.MEETING__IDENTIFIED_WORK_ITEMS_SECTION, oldIdentifiedWorkItemsSection,
						identifiedWorkItemsSection));
			}
		}
		return identifiedWorkItemsSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkItemMeetingSection basicGetIdentifiedWorkItemsSection() {
		return identifiedWorkItemsSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIdentifiedWorkItemsSection(WorkItemMeetingSection newIdentifiedWorkItemsSection) {
		WorkItemMeetingSection oldIdentifiedWorkItemsSection = identifiedWorkItemsSection;
		identifiedWorkItemsSection = newIdentifiedWorkItemsSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				MeetingPackage.MEETING__IDENTIFIED_WORK_ITEMS_SECTION, oldIdentifiedWorkItemsSection,
				identifiedWorkItemsSection));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MeetingPackage.MEETING__SECTIONS:
			return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
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
		case MeetingPackage.MEETING__LOCATION:
			return getLocation();
		case MeetingPackage.MEETING__STARTTIME:
			return getStarttime();
		case MeetingPackage.MEETING__ENDTIME:
			return getEndtime();
		case MeetingPackage.MEETING__FACILITATOR:
			if (resolve)
				return getFacilitator();
			return basicGetFacilitator();
		case MeetingPackage.MEETING__MINUTETAKER:
			if (resolve)
				return getMinutetaker();
			return basicGetMinutetaker();
		case MeetingPackage.MEETING__TIMEKEEPER:
			if (resolve)
				return getTimekeeper();
			return basicGetTimekeeper();
		case MeetingPackage.MEETING__PARTICIPANTS:
			return getParticipants();
		case MeetingPackage.MEETING__SECTIONS:
			return getSections();
		case MeetingPackage.MEETING__IDENTIFIED_ISSUES_SECTION:
			if (resolve)
				return getIdentifiedIssuesSection();
			return basicGetIdentifiedIssuesSection();
		case MeetingPackage.MEETING__IDENTIFIED_WORK_ITEMS_SECTION:
			if (resolve)
				return getIdentifiedWorkItemsSection();
			return basicGetIdentifiedWorkItemsSection();
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
		case MeetingPackage.MEETING__LOCATION:
			setLocation((String) newValue);
			return;
		case MeetingPackage.MEETING__STARTTIME:
			setStarttime((Date) newValue);
			return;
		case MeetingPackage.MEETING__ENDTIME:
			setEndtime((Date) newValue);
			return;
		case MeetingPackage.MEETING__FACILITATOR:
			setFacilitator((User) newValue);
			return;
		case MeetingPackage.MEETING__MINUTETAKER:
			setMinutetaker((User) newValue);
			return;
		case MeetingPackage.MEETING__TIMEKEEPER:
			setTimekeeper((User) newValue);
			return;
		case MeetingPackage.MEETING__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends OrgUnit>) newValue);
			return;
		case MeetingPackage.MEETING__SECTIONS:
			getSections().clear();
			getSections().addAll((Collection<? extends MeetingSection>) newValue);
			return;
		case MeetingPackage.MEETING__IDENTIFIED_ISSUES_SECTION:
			setIdentifiedIssuesSection((IssueMeetingSection) newValue);
			return;
		case MeetingPackage.MEETING__IDENTIFIED_WORK_ITEMS_SECTION:
			setIdentifiedWorkItemsSection((WorkItemMeetingSection) newValue);
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
		case MeetingPackage.MEETING__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case MeetingPackage.MEETING__STARTTIME:
			setStarttime(STARTTIME_EDEFAULT);
			return;
		case MeetingPackage.MEETING__ENDTIME:
			setEndtime(ENDTIME_EDEFAULT);
			return;
		case MeetingPackage.MEETING__FACILITATOR:
			setFacilitator((User) null);
			return;
		case MeetingPackage.MEETING__MINUTETAKER:
			setMinutetaker((User) null);
			return;
		case MeetingPackage.MEETING__TIMEKEEPER:
			setTimekeeper((User) null);
			return;
		case MeetingPackage.MEETING__PARTICIPANTS:
			getParticipants().clear();
			return;
		case MeetingPackage.MEETING__SECTIONS:
			getSections().clear();
			return;
		case MeetingPackage.MEETING__IDENTIFIED_ISSUES_SECTION:
			setIdentifiedIssuesSection((IssueMeetingSection) null);
			return;
		case MeetingPackage.MEETING__IDENTIFIED_WORK_ITEMS_SECTION:
			setIdentifiedWorkItemsSection((WorkItemMeetingSection) null);
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
		case MeetingPackage.MEETING__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case MeetingPackage.MEETING__STARTTIME:
			return STARTTIME_EDEFAULT == null ? starttime != null : !STARTTIME_EDEFAULT.equals(starttime);
		case MeetingPackage.MEETING__ENDTIME:
			return ENDTIME_EDEFAULT == null ? endtime != null : !ENDTIME_EDEFAULT.equals(endtime);
		case MeetingPackage.MEETING__FACILITATOR:
			return facilitator != null;
		case MeetingPackage.MEETING__MINUTETAKER:
			return minutetaker != null;
		case MeetingPackage.MEETING__TIMEKEEPER:
			return timekeeper != null;
		case MeetingPackage.MEETING__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
		case MeetingPackage.MEETING__SECTIONS:
			return sections != null && !sections.isEmpty();
		case MeetingPackage.MEETING__IDENTIFIED_ISSUES_SECTION:
			return identifiedIssuesSection != null;
		case MeetingPackage.MEETING__IDENTIFIED_WORK_ITEMS_SECTION:
			return identifiedWorkItemsSection != null;
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
		result.append(" (location: ");
		result.append(location);
		result.append(", starttime: ");
		result.append(starttime);
		result.append(", endtime: ");
		result.append(endtime);
		result.append(')');
		return result.toString();
	}

} // MeetingImpl
