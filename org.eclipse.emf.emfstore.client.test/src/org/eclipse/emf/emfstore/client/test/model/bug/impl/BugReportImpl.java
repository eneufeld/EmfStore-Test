/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.bug.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.bug.BugPackage;
import org.eclipse.emf.emfstore.client.test.model.bug.BugReport;
import org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType;
import org.eclipse.emf.emfstore.client.test.model.bug.Severity;
import org.eclipse.emf.emfstore.client.test.model.impl.AnnotationImpl;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage;
import org.eclipse.emf.emfstore.client.test.model.organization.User;
import org.eclipse.emf.emfstore.client.test.model.release.Release;
import org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage;
import org.eclipse.emf.emfstore.client.test.model.task.Checkable;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;
import org.eclipse.emf.emfstore.client.test.model.task.WorkPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Report</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getContainingWorkpackage <em>Containing
 * Workpackage</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getPredecessors <em>Predecessors</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getSuccessors <em>Successors</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getAssignee <em>Assignee</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getReviewer <em>Reviewer</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getParticipants <em>Participants</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getDueDate <em>Due Date</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getEstimate <em>Estimate</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getEffort <em>Effort</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getPriority <em>Priority</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#isResolved <em>Resolved</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getIncludingReleases <em>Including
 * Releases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#isChecked <em>Checked</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getSeverity <em>Severity</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getResolution <em>Resolution</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#getResolutionType <em>Resolution Type
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.impl.BugReportImpl#isDone <em>Done</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BugReportImpl extends AnnotationImpl implements BugReport {
	/**
	 * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkItem> predecessors;

	/**
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkItem> successors;

	/**
	 * The cached value of the '{@link #getAssignee() <em>Assignee</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected OrgUnit assignee;

	/**
	 * The cached value of the '{@link #getReviewer() <em>Reviewer</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReviewer()
	 * @generated
	 * @ordered
	 */
	protected User reviewer;

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
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimate() <em>Estimate</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final int ESTIMATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEstimate() <em>Estimate</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEstimate()
	 * @generated
	 * @ordered
	 */
	protected int estimate = ESTIMATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffort() <em>Effort</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected static final int EFFORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEffort() <em>Effort</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected int effort = EFFORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean resolved = RESOLVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludingReleases() <em>Including Releases</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncludingReleases()
	 * @generated
	 * @ordered
	 */
	protected EList<Release> includingReleases;

	/**
	 * The default value of the '{@link #isChecked() <em>Checked</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isChecked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity.FEATURE;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected String resolution = RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionType() <em>Resolution Type</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getResolutionType()
	 * @generated
	 * @ordered
	 */
	protected static final ResolutionType RESOLUTION_TYPE_EDEFAULT = ResolutionType.FIXED;

	/**
	 * The cached value of the '{@link #getResolutionType() <em>Resolution Type</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getResolutionType()
	 * @generated
	 * @ordered
	 */
	protected ResolutionType resolutionType = RESOLUTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDone() <em>Done</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDone() <em>Done</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected boolean done = DONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BugReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BugPackage.Literals.BUG_REPORT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkPackage getContainingWorkpackage() {
		if (eContainerFeatureID() != BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE)
			return null;
		return (WorkPackage) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkPackage basicGetContainingWorkpackage() {
		if (eContainerFeatureID() != BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE)
			return null;
		return (WorkPackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContainingWorkpackage(WorkPackage newContainingWorkpackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainingWorkpackage,
			BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContainingWorkpackage(WorkPackage newContainingWorkpackage) {
		if (newContainingWorkpackage != eInternalContainer()
			|| (eContainerFeatureID() != BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE && newContainingWorkpackage != null)) {
			if (EcoreUtil.isAncestor(this, newContainingWorkpackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingWorkpackage != null)
				msgs = ((InternalEObject) newContainingWorkpackage).eInverseAdd(this,
					TaskPackage.WORK_PACKAGE__CONTAINED_WORK_ITEMS, WorkPackage.class, msgs);
			msgs = basicSetContainingWorkpackage(newContainingWorkpackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE,
				newContainingWorkpackage, newContainingWorkpackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<WorkItem> getPredecessors() {
		if (predecessors == null) {
			predecessors = new EObjectWithInverseResolvingEList.ManyInverse<WorkItem>(WorkItem.class, this,
				BugPackage.BUG_REPORT__PREDECESSORS, TaskPackage.WORK_ITEM__SUCCESSORS);
		}
		return predecessors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<WorkItem> getSuccessors() {
		if (successors == null) {
			successors = new EObjectWithInverseResolvingEList.ManyInverse<WorkItem>(WorkItem.class, this,
				BugPackage.BUG_REPORT__SUCCESSORS, TaskPackage.WORK_ITEM__PREDECESSORS);
		}
		return successors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrgUnit getAssignee() {
		if (assignee != null && assignee.eIsProxy()) {
			InternalEObject oldAssignee = (InternalEObject) assignee;
			assignee = (OrgUnit) eResolveProxy(oldAssignee);
			if (assignee != oldAssignee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BugPackage.BUG_REPORT__ASSIGNEE,
						oldAssignee, assignee));
			}
		}
		return assignee;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrgUnit basicGetAssignee() {
		return assignee;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssignee(OrgUnit newAssignee, NotificationChain msgs) {
		OrgUnit oldAssignee = assignee;
		assignee = newAssignee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				BugPackage.BUG_REPORT__ASSIGNEE, oldAssignee, newAssignee);
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
	public void setAssignee(OrgUnit newAssignee) {
		if (newAssignee != assignee) {
			NotificationChain msgs = null;
			if (assignee != null)
				msgs = ((InternalEObject) assignee).eInverseRemove(this, OrganizationPackage.ORG_UNIT__ASSIGNMENTS,
					OrgUnit.class, msgs);
			if (newAssignee != null)
				msgs = ((InternalEObject) newAssignee).eInverseAdd(this, OrganizationPackage.ORG_UNIT__ASSIGNMENTS,
					OrgUnit.class, msgs);
			msgs = basicSetAssignee(newAssignee, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__ASSIGNEE, newAssignee,
				newAssignee));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public User getReviewer() {
		if (reviewer != null && reviewer.eIsProxy()) {
			InternalEObject oldReviewer = (InternalEObject) reviewer;
			reviewer = (User) eResolveProxy(oldReviewer);
			if (reviewer != oldReviewer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BugPackage.BUG_REPORT__REVIEWER,
						oldReviewer, reviewer));
			}
		}
		return reviewer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public User basicGetReviewer() {
		return reviewer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetReviewer(User newReviewer, NotificationChain msgs) {
		User oldReviewer = reviewer;
		reviewer = newReviewer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				BugPackage.BUG_REPORT__REVIEWER, oldReviewer, newReviewer);
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
	public void setReviewer(User newReviewer) {
		if (newReviewer != reviewer) {
			NotificationChain msgs = null;
			if (reviewer != null)
				msgs = ((InternalEObject) reviewer).eInverseRemove(this,
					OrganizationPackage.USER__WORK_ITEMS_TO_REVIEW, User.class, msgs);
			if (newReviewer != null)
				msgs = ((InternalEObject) newReviewer).eInverseAdd(this,
					OrganizationPackage.USER__WORK_ITEMS_TO_REVIEW, User.class, msgs);
			msgs = basicSetReviewer(newReviewer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__REVIEWER, newReviewer,
				newReviewer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OrgUnit> getParticipants() {
		if (participants == null) {
			participants = new EObjectWithInverseResolvingEList.ManyInverse<OrgUnit>(OrgUnit.class, this,
				BugPackage.BUG_REPORT__PARTICIPANTS, OrganizationPackage.ORG_UNIT__PARTICIPATIONS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getEstimate() {
		return estimate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEstimate(int newEstimate) {
		int oldEstimate = estimate;
		estimate = newEstimate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__ESTIMATE, oldEstimate,
				estimate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getEffort() {
		return effort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEffort(int newEffort) {
		int oldEffort = effort;
		effort = newEffort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__EFFORT, oldEffort, effort));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__PRIORITY, oldPriority,
				priority));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		boolean oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__RESOLVED, oldResolved,
				resolved));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Release> getIncludingReleases() {
		if (includingReleases == null) {
			includingReleases = new EObjectWithInverseResolvingEList.ManyInverse<Release>(Release.class, this,
				BugPackage.BUG_REPORT__INCLUDING_RELEASES, ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS);
		}
		return includingReleases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isChecked() {
		// TODO: implement this method to return the 'Checked' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setChecked(boolean newChecked) {
		// TODO: implement this method to set the 'Checked' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSeverity(Severity newSeverity) {
		Severity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__SEVERITY, oldSeverity,
				severity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolution(String newResolution) {
		String oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__RESOLUTION, oldResolution,
				resolution));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolutionType getResolutionType() {
		return resolutionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolutionType(ResolutionType newResolutionType) {
		ResolutionType oldResolutionType = resolutionType;
		resolutionType = newResolutionType == null ? RESOLUTION_TYPE_EDEFAULT : newResolutionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__RESOLUTION_TYPE,
				oldResolutionType, resolutionType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDone(boolean newDone) {
		boolean oldDone = done;
		done = newDone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.BUG_REPORT__DONE, oldDone, done));
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
		case BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainingWorkpackage((WorkPackage) otherEnd, msgs);
		case BugPackage.BUG_REPORT__PREDECESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPredecessors()).basicAdd(otherEnd, msgs);
		case BugPackage.BUG_REPORT__SUCCESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSuccessors()).basicAdd(otherEnd, msgs);
		case BugPackage.BUG_REPORT__ASSIGNEE:
			if (assignee != null)
				msgs = ((InternalEObject) assignee).eInverseRemove(this, OrganizationPackage.ORG_UNIT__ASSIGNMENTS,
					OrgUnit.class, msgs);
			return basicSetAssignee((OrgUnit) otherEnd, msgs);
		case BugPackage.BUG_REPORT__REVIEWER:
			if (reviewer != null)
				msgs = ((InternalEObject) reviewer).eInverseRemove(this,
					OrganizationPackage.USER__WORK_ITEMS_TO_REVIEW, User.class, msgs);
			return basicSetReviewer((User) otherEnd, msgs);
		case BugPackage.BUG_REPORT__PARTICIPANTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipants()).basicAdd(otherEnd, msgs);
		case BugPackage.BUG_REPORT__INCLUDING_RELEASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncludingReleases())
				.basicAdd(otherEnd, msgs);
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
		case BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE:
			return basicSetContainingWorkpackage(null, msgs);
		case BugPackage.BUG_REPORT__PREDECESSORS:
			return ((InternalEList<?>) getPredecessors()).basicRemove(otherEnd, msgs);
		case BugPackage.BUG_REPORT__SUCCESSORS:
			return ((InternalEList<?>) getSuccessors()).basicRemove(otherEnd, msgs);
		case BugPackage.BUG_REPORT__ASSIGNEE:
			return basicSetAssignee(null, msgs);
		case BugPackage.BUG_REPORT__REVIEWER:
			return basicSetReviewer(null, msgs);
		case BugPackage.BUG_REPORT__PARTICIPANTS:
			return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
		case BugPackage.BUG_REPORT__INCLUDING_RELEASES:
			return ((InternalEList<?>) getIncludingReleases()).basicRemove(otherEnd, msgs);
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
		case BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE:
			return eInternalContainer().eInverseRemove(this, TaskPackage.WORK_PACKAGE__CONTAINED_WORK_ITEMS,
				WorkPackage.class, msgs);
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
		case BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE:
			if (resolve)
				return getContainingWorkpackage();
			return basicGetContainingWorkpackage();
		case BugPackage.BUG_REPORT__PREDECESSORS:
			return getPredecessors();
		case BugPackage.BUG_REPORT__SUCCESSORS:
			return getSuccessors();
		case BugPackage.BUG_REPORT__ASSIGNEE:
			if (resolve)
				return getAssignee();
			return basicGetAssignee();
		case BugPackage.BUG_REPORT__REVIEWER:
			if (resolve)
				return getReviewer();
			return basicGetReviewer();
		case BugPackage.BUG_REPORT__PARTICIPANTS:
			return getParticipants();
		case BugPackage.BUG_REPORT__DUE_DATE:
			return getDueDate();
		case BugPackage.BUG_REPORT__ESTIMATE:
			return getEstimate();
		case BugPackage.BUG_REPORT__EFFORT:
			return getEffort();
		case BugPackage.BUG_REPORT__PRIORITY:
			return getPriority();
		case BugPackage.BUG_REPORT__RESOLVED:
			return isResolved();
		case BugPackage.BUG_REPORT__INCLUDING_RELEASES:
			return getIncludingReleases();
		case BugPackage.BUG_REPORT__CHECKED:
			return isChecked();
		case BugPackage.BUG_REPORT__SEVERITY:
			return getSeverity();
		case BugPackage.BUG_REPORT__RESOLUTION:
			return getResolution();
		case BugPackage.BUG_REPORT__RESOLUTION_TYPE:
			return getResolutionType();
		case BugPackage.BUG_REPORT__DONE:
			return isDone();
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
		case BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE:
			setContainingWorkpackage((WorkPackage) newValue);
			return;
		case BugPackage.BUG_REPORT__PREDECESSORS:
			getPredecessors().clear();
			getPredecessors().addAll((Collection<? extends WorkItem>) newValue);
			return;
		case BugPackage.BUG_REPORT__SUCCESSORS:
			getSuccessors().clear();
			getSuccessors().addAll((Collection<? extends WorkItem>) newValue);
			return;
		case BugPackage.BUG_REPORT__ASSIGNEE:
			setAssignee((OrgUnit) newValue);
			return;
		case BugPackage.BUG_REPORT__REVIEWER:
			setReviewer((User) newValue);
			return;
		case BugPackage.BUG_REPORT__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends OrgUnit>) newValue);
			return;
		case BugPackage.BUG_REPORT__DUE_DATE:
			setDueDate((Date) newValue);
			return;
		case BugPackage.BUG_REPORT__ESTIMATE:
			setEstimate((Integer) newValue);
			return;
		case BugPackage.BUG_REPORT__EFFORT:
			setEffort((Integer) newValue);
			return;
		case BugPackage.BUG_REPORT__PRIORITY:
			setPriority((Integer) newValue);
			return;
		case BugPackage.BUG_REPORT__RESOLVED:
			setResolved((Boolean) newValue);
			return;
		case BugPackage.BUG_REPORT__INCLUDING_RELEASES:
			getIncludingReleases().clear();
			getIncludingReleases().addAll((Collection<? extends Release>) newValue);
			return;
		case BugPackage.BUG_REPORT__CHECKED:
			setChecked((Boolean) newValue);
			return;
		case BugPackage.BUG_REPORT__SEVERITY:
			setSeverity((Severity) newValue);
			return;
		case BugPackage.BUG_REPORT__RESOLUTION:
			setResolution((String) newValue);
			return;
		case BugPackage.BUG_REPORT__RESOLUTION_TYPE:
			setResolutionType((ResolutionType) newValue);
			return;
		case BugPackage.BUG_REPORT__DONE:
			setDone((Boolean) newValue);
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
		case BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE:
			setContainingWorkpackage((WorkPackage) null);
			return;
		case BugPackage.BUG_REPORT__PREDECESSORS:
			getPredecessors().clear();
			return;
		case BugPackage.BUG_REPORT__SUCCESSORS:
			getSuccessors().clear();
			return;
		case BugPackage.BUG_REPORT__ASSIGNEE:
			setAssignee((OrgUnit) null);
			return;
		case BugPackage.BUG_REPORT__REVIEWER:
			setReviewer((User) null);
			return;
		case BugPackage.BUG_REPORT__PARTICIPANTS:
			getParticipants().clear();
			return;
		case BugPackage.BUG_REPORT__DUE_DATE:
			setDueDate(DUE_DATE_EDEFAULT);
			return;
		case BugPackage.BUG_REPORT__ESTIMATE:
			setEstimate(ESTIMATE_EDEFAULT);
			return;
		case BugPackage.BUG_REPORT__EFFORT:
			setEffort(EFFORT_EDEFAULT);
			return;
		case BugPackage.BUG_REPORT__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case BugPackage.BUG_REPORT__RESOLVED:
			setResolved(RESOLVED_EDEFAULT);
			return;
		case BugPackage.BUG_REPORT__INCLUDING_RELEASES:
			getIncludingReleases().clear();
			return;
		case BugPackage.BUG_REPORT__CHECKED:
			setChecked(CHECKED_EDEFAULT);
			return;
		case BugPackage.BUG_REPORT__SEVERITY:
			setSeverity(SEVERITY_EDEFAULT);
			return;
		case BugPackage.BUG_REPORT__RESOLUTION:
			setResolution(RESOLUTION_EDEFAULT);
			return;
		case BugPackage.BUG_REPORT__RESOLUTION_TYPE:
			setResolutionType(RESOLUTION_TYPE_EDEFAULT);
			return;
		case BugPackage.BUG_REPORT__DONE:
			setDone(DONE_EDEFAULT);
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
		case BugPackage.BUG_REPORT__CONTAINING_WORKPACKAGE:
			return basicGetContainingWorkpackage() != null;
		case BugPackage.BUG_REPORT__PREDECESSORS:
			return predecessors != null && !predecessors.isEmpty();
		case BugPackage.BUG_REPORT__SUCCESSORS:
			return successors != null && !successors.isEmpty();
		case BugPackage.BUG_REPORT__ASSIGNEE:
			return assignee != null;
		case BugPackage.BUG_REPORT__REVIEWER:
			return reviewer != null;
		case BugPackage.BUG_REPORT__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
		case BugPackage.BUG_REPORT__DUE_DATE:
			return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
		case BugPackage.BUG_REPORT__ESTIMATE:
			return estimate != ESTIMATE_EDEFAULT;
		case BugPackage.BUG_REPORT__EFFORT:
			return effort != EFFORT_EDEFAULT;
		case BugPackage.BUG_REPORT__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case BugPackage.BUG_REPORT__RESOLVED:
			return resolved != RESOLVED_EDEFAULT;
		case BugPackage.BUG_REPORT__INCLUDING_RELEASES:
			return includingReleases != null && !includingReleases.isEmpty();
		case BugPackage.BUG_REPORT__CHECKED:
			return isChecked() != CHECKED_EDEFAULT;
		case BugPackage.BUG_REPORT__SEVERITY:
			return severity != SEVERITY_EDEFAULT;
		case BugPackage.BUG_REPORT__RESOLUTION:
			return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
		case BugPackage.BUG_REPORT__RESOLUTION_TYPE:
			return resolutionType != RESOLUTION_TYPE_EDEFAULT;
		case BugPackage.BUG_REPORT__DONE:
			return done != DONE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Checkable.class) {
			switch (derivedFeatureID) {
			case BugPackage.BUG_REPORT__CHECKED:
				return TaskPackage.CHECKABLE__CHECKED;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Checkable.class) {
			switch (baseFeatureID) {
			case TaskPackage.CHECKABLE__CHECKED:
				return BugPackage.BUG_REPORT__CHECKED;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (dueDate: ");
		result.append(dueDate);
		result.append(", estimate: ");
		result.append(estimate);
		result.append(", effort: ");
		result.append(effort);
		result.append(", priority: ");
		result.append(priority);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(", severity: ");
		result.append(severity);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(", resolutionType: ");
		result.append(resolutionType);
		result.append(", done: ");
		result.append(done);
		result.append(')');
		return result.toString();
	}

} // BugReportImpl
