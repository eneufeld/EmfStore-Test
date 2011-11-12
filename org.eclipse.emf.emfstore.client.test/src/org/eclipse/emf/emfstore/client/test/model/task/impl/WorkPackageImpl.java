/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.AnnotationImpl;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage;
import org.eclipse.emf.emfstore.client.test.model.organization.User;
import org.eclipse.emf.emfstore.client.test.model.release.Release;
import org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;
import org.eclipse.emf.emfstore.client.test.model.task.WorkPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Work Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getContainingWorkpackage <em>
 * Containing Workpackage</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getPredecessors <em>Predecessors
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getSuccessors <em>Successors</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getAssignee <em>Assignee</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getReviewer <em>Reviewer</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getParticipants <em>Participants
 * </em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getDueDate <em>Due Date</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getEstimate <em>Estimate</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getEffort <em>Effort</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getPriority <em>Priority</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#isResolved <em>Resolved</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getIncludingReleases <em>Including
 * Releases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getContainedWorkItems <em>Contained
 * Work Items</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getStartDate <em>Start Date</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.impl.WorkPackageImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WorkPackageImpl extends AnnotationImpl implements WorkPackage {
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
	 * The cached value of the '{@link #getContainedWorkItems() <em>Contained Work Items</em>}' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContainedWorkItems()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkItem> containedWorkItems;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WorkPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.WORK_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkPackage getContainingWorkpackage() {
		if (eContainerFeatureID() != TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE)
			return null;
		return (WorkPackage) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkPackage basicGetContainingWorkpackage() {
		if (eContainerFeatureID() != TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE)
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
			TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContainingWorkpackage(WorkPackage newContainingWorkpackage) {
		if (newContainingWorkpackage != eInternalContainer()
			|| (eContainerFeatureID() != TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE && newContainingWorkpackage != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE,
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
				TaskPackage.WORK_PACKAGE__PREDECESSORS, TaskPackage.WORK_ITEM__SUCCESSORS);
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
				TaskPackage.WORK_PACKAGE__SUCCESSORS, TaskPackage.WORK_ITEM__PREDECESSORS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.WORK_PACKAGE__ASSIGNEE,
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
				TaskPackage.WORK_PACKAGE__ASSIGNEE, oldAssignee, newAssignee);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__ASSIGNEE, newAssignee,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.WORK_PACKAGE__REVIEWER,
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
				TaskPackage.WORK_PACKAGE__REVIEWER, oldReviewer, newReviewer);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__REVIEWER, newReviewer,
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
				TaskPackage.WORK_PACKAGE__PARTICIPANTS, OrganizationPackage.ORG_UNIT__PARTICIPATIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__DUE_DATE, oldDueDate,
				dueDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__ESTIMATE, oldEstimate,
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__EFFORT, oldEffort, effort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__PRIORITY, oldPriority,
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__RESOLVED, oldResolved,
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
				TaskPackage.WORK_PACKAGE__INCLUDING_RELEASES, ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS);
		}
		return includingReleases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<WorkItem> getContainedWorkItems() {
		if (containedWorkItems == null) {
			containedWorkItems = new EObjectContainmentWithInverseEList.Resolving<WorkItem>(WorkItem.class, this,
				TaskPackage.WORK_PACKAGE__CONTAINED_WORK_ITEMS, TaskPackage.WORK_ITEM__CONTAINING_WORKPACKAGE);
		}
		return containedWorkItems;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__START_DATE, oldStartDate,
				startDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK_PACKAGE__END_DATE, oldEndDate,
				endDate));
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
		case TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainingWorkpackage((WorkPackage) otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__PREDECESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPredecessors()).basicAdd(otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__SUCCESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSuccessors()).basicAdd(otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__ASSIGNEE:
			if (assignee != null)
				msgs = ((InternalEObject) assignee).eInverseRemove(this, OrganizationPackage.ORG_UNIT__ASSIGNMENTS,
					OrgUnit.class, msgs);
			return basicSetAssignee((OrgUnit) otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__REVIEWER:
			if (reviewer != null)
				msgs = ((InternalEObject) reviewer).eInverseRemove(this,
					OrganizationPackage.USER__WORK_ITEMS_TO_REVIEW, User.class, msgs);
			return basicSetReviewer((User) otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__PARTICIPANTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipants()).basicAdd(otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__INCLUDING_RELEASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncludingReleases())
				.basicAdd(otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__CONTAINED_WORK_ITEMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedWorkItems()).basicAdd(otherEnd,
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
		case TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE:
			return basicSetContainingWorkpackage(null, msgs);
		case TaskPackage.WORK_PACKAGE__PREDECESSORS:
			return ((InternalEList<?>) getPredecessors()).basicRemove(otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__SUCCESSORS:
			return ((InternalEList<?>) getSuccessors()).basicRemove(otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__ASSIGNEE:
			return basicSetAssignee(null, msgs);
		case TaskPackage.WORK_PACKAGE__REVIEWER:
			return basicSetReviewer(null, msgs);
		case TaskPackage.WORK_PACKAGE__PARTICIPANTS:
			return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__INCLUDING_RELEASES:
			return ((InternalEList<?>) getIncludingReleases()).basicRemove(otherEnd, msgs);
		case TaskPackage.WORK_PACKAGE__CONTAINED_WORK_ITEMS:
			return ((InternalEList<?>) getContainedWorkItems()).basicRemove(otherEnd, msgs);
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
		case TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE:
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
		case TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE:
			if (resolve)
				return getContainingWorkpackage();
			return basicGetContainingWorkpackage();
		case TaskPackage.WORK_PACKAGE__PREDECESSORS:
			return getPredecessors();
		case TaskPackage.WORK_PACKAGE__SUCCESSORS:
			return getSuccessors();
		case TaskPackage.WORK_PACKAGE__ASSIGNEE:
			if (resolve)
				return getAssignee();
			return basicGetAssignee();
		case TaskPackage.WORK_PACKAGE__REVIEWER:
			if (resolve)
				return getReviewer();
			return basicGetReviewer();
		case TaskPackage.WORK_PACKAGE__PARTICIPANTS:
			return getParticipants();
		case TaskPackage.WORK_PACKAGE__DUE_DATE:
			return getDueDate();
		case TaskPackage.WORK_PACKAGE__ESTIMATE:
			return getEstimate();
		case TaskPackage.WORK_PACKAGE__EFFORT:
			return getEffort();
		case TaskPackage.WORK_PACKAGE__PRIORITY:
			return getPriority();
		case TaskPackage.WORK_PACKAGE__RESOLVED:
			return isResolved();
		case TaskPackage.WORK_PACKAGE__INCLUDING_RELEASES:
			return getIncludingReleases();
		case TaskPackage.WORK_PACKAGE__CONTAINED_WORK_ITEMS:
			return getContainedWorkItems();
		case TaskPackage.WORK_PACKAGE__START_DATE:
			return getStartDate();
		case TaskPackage.WORK_PACKAGE__END_DATE:
			return getEndDate();
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
		case TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE:
			setContainingWorkpackage((WorkPackage) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__PREDECESSORS:
			getPredecessors().clear();
			getPredecessors().addAll((Collection<? extends WorkItem>) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__SUCCESSORS:
			getSuccessors().clear();
			getSuccessors().addAll((Collection<? extends WorkItem>) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__ASSIGNEE:
			setAssignee((OrgUnit) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__REVIEWER:
			setReviewer((User) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends OrgUnit>) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__DUE_DATE:
			setDueDate((Date) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__ESTIMATE:
			setEstimate((Integer) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__EFFORT:
			setEffort((Integer) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__PRIORITY:
			setPriority((Integer) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__RESOLVED:
			setResolved((Boolean) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__INCLUDING_RELEASES:
			getIncludingReleases().clear();
			getIncludingReleases().addAll((Collection<? extends Release>) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__CONTAINED_WORK_ITEMS:
			getContainedWorkItems().clear();
			getContainedWorkItems().addAll((Collection<? extends WorkItem>) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__START_DATE:
			setStartDate((Date) newValue);
			return;
		case TaskPackage.WORK_PACKAGE__END_DATE:
			setEndDate((Date) newValue);
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
		case TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE:
			setContainingWorkpackage((WorkPackage) null);
			return;
		case TaskPackage.WORK_PACKAGE__PREDECESSORS:
			getPredecessors().clear();
			return;
		case TaskPackage.WORK_PACKAGE__SUCCESSORS:
			getSuccessors().clear();
			return;
		case TaskPackage.WORK_PACKAGE__ASSIGNEE:
			setAssignee((OrgUnit) null);
			return;
		case TaskPackage.WORK_PACKAGE__REVIEWER:
			setReviewer((User) null);
			return;
		case TaskPackage.WORK_PACKAGE__PARTICIPANTS:
			getParticipants().clear();
			return;
		case TaskPackage.WORK_PACKAGE__DUE_DATE:
			setDueDate(DUE_DATE_EDEFAULT);
			return;
		case TaskPackage.WORK_PACKAGE__ESTIMATE:
			setEstimate(ESTIMATE_EDEFAULT);
			return;
		case TaskPackage.WORK_PACKAGE__EFFORT:
			setEffort(EFFORT_EDEFAULT);
			return;
		case TaskPackage.WORK_PACKAGE__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case TaskPackage.WORK_PACKAGE__RESOLVED:
			setResolved(RESOLVED_EDEFAULT);
			return;
		case TaskPackage.WORK_PACKAGE__INCLUDING_RELEASES:
			getIncludingReleases().clear();
			return;
		case TaskPackage.WORK_PACKAGE__CONTAINED_WORK_ITEMS:
			getContainedWorkItems().clear();
			return;
		case TaskPackage.WORK_PACKAGE__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case TaskPackage.WORK_PACKAGE__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
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
		case TaskPackage.WORK_PACKAGE__CONTAINING_WORKPACKAGE:
			return basicGetContainingWorkpackage() != null;
		case TaskPackage.WORK_PACKAGE__PREDECESSORS:
			return predecessors != null && !predecessors.isEmpty();
		case TaskPackage.WORK_PACKAGE__SUCCESSORS:
			return successors != null && !successors.isEmpty();
		case TaskPackage.WORK_PACKAGE__ASSIGNEE:
			return assignee != null;
		case TaskPackage.WORK_PACKAGE__REVIEWER:
			return reviewer != null;
		case TaskPackage.WORK_PACKAGE__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
		case TaskPackage.WORK_PACKAGE__DUE_DATE:
			return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
		case TaskPackage.WORK_PACKAGE__ESTIMATE:
			return estimate != ESTIMATE_EDEFAULT;
		case TaskPackage.WORK_PACKAGE__EFFORT:
			return effort != EFFORT_EDEFAULT;
		case TaskPackage.WORK_PACKAGE__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case TaskPackage.WORK_PACKAGE__RESOLVED:
			return resolved != RESOLVED_EDEFAULT;
		case TaskPackage.WORK_PACKAGE__INCLUDING_RELEASES:
			return includingReleases != null && !includingReleases.isEmpty();
		case TaskPackage.WORK_PACKAGE__CONTAINED_WORK_ITEMS:
			return containedWorkItems != null && !containedWorkItems.isEmpty();
		case TaskPackage.WORK_PACKAGE__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case TaskPackage.WORK_PACKAGE__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
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
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} // WorkPackageImpl
