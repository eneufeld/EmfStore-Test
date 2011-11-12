/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.rationale.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.client.test.model.impl.AnnotationImpl;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;
import org.eclipse.emf.emfstore.client.test.model.organization.OrganizationPackage;
import org.eclipse.emf.emfstore.client.test.model.organization.User;
import org.eclipse.emf.emfstore.client.test.model.rationale.Assessment;
import org.eclipse.emf.emfstore.client.test.model.rationale.Criterion;
import org.eclipse.emf.emfstore.client.test.model.rationale.Issue;
import org.eclipse.emf.emfstore.client.test.model.rationale.Proposal;
import org.eclipse.emf.emfstore.client.test.model.rationale.RationalePackage;
import org.eclipse.emf.emfstore.client.test.model.rationale.Solution;
import org.eclipse.emf.emfstore.client.test.model.release.Release;
import org.eclipse.emf.emfstore.client.test.model.release.ReleasePackage;
import org.eclipse.emf.emfstore.client.test.model.task.ActivityType;
import org.eclipse.emf.emfstore.client.test.model.task.Checkable;
import org.eclipse.emf.emfstore.client.test.model.task.TaskPackage;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;
import org.eclipse.emf.emfstore.client.test.model.task.WorkPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Issue</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#isChecked <em>Checked</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getContainingWorkpackage <em>
 * Containing Workpackage</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getPredecessors <em>Predecessors</em>}
 * </li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getSuccessors <em>Successors</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getAssignee <em>Assignee</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getReviewer <em>Reviewer</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getParticipants <em>Participants</em>}
 * </li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getDueDate <em>Due Date</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getEstimate <em>Estimate</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getEffort <em>Effort</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getPriority <em>Priority</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#isResolved <em>Resolved</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getIncludingReleases <em>Including
 * Releases</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getProposals <em>Proposals</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getSolution <em>Solution</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getCriteria <em>Criteria</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getActivity <em>Activity</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.rationale.impl.IssueImpl#getAssessments <em>Assessments</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IssueImpl extends AnnotationImpl implements Issue {
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
	 * The cached value of the '{@link #getProposals() <em>Proposals</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProposals()
	 * @generated
	 * @ordered
	 */
	protected EList<Proposal> proposals;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution solution;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criterion> criteria;

	/**
	 * The default value of the '{@link #getActivity() <em>Activity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityType ACTIVITY_EDEFAULT = ActivityType.NONE;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected ActivityType activity = ACTIVITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssessments() <em>Assessments</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssessments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assessment> assessments;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.ISSUE;
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
	public WorkPackage getContainingWorkpackage() {
		if (eContainerFeatureID() != RationalePackage.ISSUE__CONTAINING_WORKPACKAGE)
			return null;
		return (WorkPackage) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkPackage basicGetContainingWorkpackage() {
		if (eContainerFeatureID() != RationalePackage.ISSUE__CONTAINING_WORKPACKAGE)
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
			RationalePackage.ISSUE__CONTAINING_WORKPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContainingWorkpackage(WorkPackage newContainingWorkpackage) {
		if (newContainingWorkpackage != eInternalContainer()
			|| (eContainerFeatureID() != RationalePackage.ISSUE__CONTAINING_WORKPACKAGE && newContainingWorkpackage != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__CONTAINING_WORKPACKAGE,
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
				RationalePackage.ISSUE__PREDECESSORS, TaskPackage.WORK_ITEM__SUCCESSORS);
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
				RationalePackage.ISSUE__SUCCESSORS, TaskPackage.WORK_ITEM__PREDECESSORS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RationalePackage.ISSUE__ASSIGNEE,
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
				RationalePackage.ISSUE__ASSIGNEE, oldAssignee, newAssignee);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__ASSIGNEE, newAssignee,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RationalePackage.ISSUE__REVIEWER,
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
				RationalePackage.ISSUE__REVIEWER, oldReviewer, newReviewer);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__REVIEWER, newReviewer,
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
				RationalePackage.ISSUE__PARTICIPANTS, OrganizationPackage.ORG_UNIT__PARTICIPATIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__DUE_DATE, oldDueDate, dueDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__ESTIMATE, oldEstimate,
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
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__EFFORT, oldEffort, effort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__PRIORITY, oldPriority,
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
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__RESOLVED, oldResolved,
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
				RationalePackage.ISSUE__INCLUDING_RELEASES, ReleasePackage.RELEASE__INCLUDED_WORK_ITEMS);
		}
		return includingReleases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Proposal> getProposals() {
		if (proposals == null) {
			proposals = new EObjectContainmentWithInverseEList.Resolving<Proposal>(Proposal.class, this,
				RationalePackage.ISSUE__PROPOSALS, RationalePackage.PROPOSAL__ISSUE);
		}
		return proposals;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Solution getSolution() {
		if (solution != null && solution.eIsProxy()) {
			InternalEObject oldSolution = (InternalEObject) solution;
			solution = (Solution) eResolveProxy(oldSolution);
			if (solution != oldSolution) {
				InternalEObject newSolution = (InternalEObject) solution;
				NotificationChain msgs = oldSolution.eInverseRemove(this, RationalePackage.SOLUTION__ISSUE,
					Solution.class, null);
				if (newSolution.eInternalContainer() == null) {
					msgs = newSolution.eInverseAdd(this, RationalePackage.SOLUTION__ISSUE, Solution.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RationalePackage.ISSUE__SOLUTION,
						oldSolution, solution));
			}
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Solution basicGetSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSolution(Solution newSolution, NotificationChain msgs) {
		Solution oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				RationalePackage.ISSUE__SOLUTION, oldSolution, newSolution);
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
	public void setSolution(Solution newSolution) {
		if (newSolution != solution) {
			NotificationChain msgs = null;
			if (solution != null)
				msgs = ((InternalEObject) solution).eInverseRemove(this, RationalePackage.SOLUTION__ISSUE,
					Solution.class, msgs);
			if (newSolution != null)
				msgs = ((InternalEObject) newSolution).eInverseAdd(this, RationalePackage.SOLUTION__ISSUE,
					Solution.class, msgs);
			msgs = basicSetSolution(newSolution, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__SOLUTION, newSolution,
				newSolution));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Criterion> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectResolvingEList<Criterion>(Criterion.class, this, RationalePackage.ISSUE__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityType getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setActivity(ActivityType newActivity) {
		ActivityType oldActivity = activity;
		activity = newActivity == null ? ACTIVITY_EDEFAULT : newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ISSUE__ACTIVITY, oldActivity,
				activity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Assessment> getAssessments() {
		if (assessments == null) {
			assessments = new EObjectResolvingEList<Assessment>(Assessment.class, this,
				RationalePackage.ISSUE__ASSESSMENTS);
		}
		return assessments;
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
		case RationalePackage.ISSUE__CONTAINING_WORKPACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainingWorkpackage((WorkPackage) otherEnd, msgs);
		case RationalePackage.ISSUE__PREDECESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPredecessors()).basicAdd(otherEnd, msgs);
		case RationalePackage.ISSUE__SUCCESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSuccessors()).basicAdd(otherEnd, msgs);
		case RationalePackage.ISSUE__ASSIGNEE:
			if (assignee != null)
				msgs = ((InternalEObject) assignee).eInverseRemove(this, OrganizationPackage.ORG_UNIT__ASSIGNMENTS,
					OrgUnit.class, msgs);
			return basicSetAssignee((OrgUnit) otherEnd, msgs);
		case RationalePackage.ISSUE__REVIEWER:
			if (reviewer != null)
				msgs = ((InternalEObject) reviewer).eInverseRemove(this,
					OrganizationPackage.USER__WORK_ITEMS_TO_REVIEW, User.class, msgs);
			return basicSetReviewer((User) otherEnd, msgs);
		case RationalePackage.ISSUE__PARTICIPANTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipants()).basicAdd(otherEnd, msgs);
		case RationalePackage.ISSUE__INCLUDING_RELEASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncludingReleases())
				.basicAdd(otherEnd, msgs);
		case RationalePackage.ISSUE__PROPOSALS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProposals()).basicAdd(otherEnd, msgs);
		case RationalePackage.ISSUE__SOLUTION:
			if (solution != null)
				msgs = ((InternalEObject) solution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- RationalePackage.ISSUE__SOLUTION, null, msgs);
			return basicSetSolution((Solution) otherEnd, msgs);
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
		case RationalePackage.ISSUE__CONTAINING_WORKPACKAGE:
			return basicSetContainingWorkpackage(null, msgs);
		case RationalePackage.ISSUE__PREDECESSORS:
			return ((InternalEList<?>) getPredecessors()).basicRemove(otherEnd, msgs);
		case RationalePackage.ISSUE__SUCCESSORS:
			return ((InternalEList<?>) getSuccessors()).basicRemove(otherEnd, msgs);
		case RationalePackage.ISSUE__ASSIGNEE:
			return basicSetAssignee(null, msgs);
		case RationalePackage.ISSUE__REVIEWER:
			return basicSetReviewer(null, msgs);
		case RationalePackage.ISSUE__PARTICIPANTS:
			return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
		case RationalePackage.ISSUE__INCLUDING_RELEASES:
			return ((InternalEList<?>) getIncludingReleases()).basicRemove(otherEnd, msgs);
		case RationalePackage.ISSUE__PROPOSALS:
			return ((InternalEList<?>) getProposals()).basicRemove(otherEnd, msgs);
		case RationalePackage.ISSUE__SOLUTION:
			return basicSetSolution(null, msgs);
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
		case RationalePackage.ISSUE__CONTAINING_WORKPACKAGE:
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
		case RationalePackage.ISSUE__CHECKED:
			return isChecked();
		case RationalePackage.ISSUE__CONTAINING_WORKPACKAGE:
			if (resolve)
				return getContainingWorkpackage();
			return basicGetContainingWorkpackage();
		case RationalePackage.ISSUE__PREDECESSORS:
			return getPredecessors();
		case RationalePackage.ISSUE__SUCCESSORS:
			return getSuccessors();
		case RationalePackage.ISSUE__ASSIGNEE:
			if (resolve)
				return getAssignee();
			return basicGetAssignee();
		case RationalePackage.ISSUE__REVIEWER:
			if (resolve)
				return getReviewer();
			return basicGetReviewer();
		case RationalePackage.ISSUE__PARTICIPANTS:
			return getParticipants();
		case RationalePackage.ISSUE__DUE_DATE:
			return getDueDate();
		case RationalePackage.ISSUE__ESTIMATE:
			return getEstimate();
		case RationalePackage.ISSUE__EFFORT:
			return getEffort();
		case RationalePackage.ISSUE__PRIORITY:
			return getPriority();
		case RationalePackage.ISSUE__RESOLVED:
			return isResolved();
		case RationalePackage.ISSUE__INCLUDING_RELEASES:
			return getIncludingReleases();
		case RationalePackage.ISSUE__PROPOSALS:
			return getProposals();
		case RationalePackage.ISSUE__SOLUTION:
			if (resolve)
				return getSolution();
			return basicGetSolution();
		case RationalePackage.ISSUE__CRITERIA:
			return getCriteria();
		case RationalePackage.ISSUE__ACTIVITY:
			return getActivity();
		case RationalePackage.ISSUE__ASSESSMENTS:
			return getAssessments();
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
		case RationalePackage.ISSUE__CHECKED:
			setChecked((Boolean) newValue);
			return;
		case RationalePackage.ISSUE__CONTAINING_WORKPACKAGE:
			setContainingWorkpackage((WorkPackage) newValue);
			return;
		case RationalePackage.ISSUE__PREDECESSORS:
			getPredecessors().clear();
			getPredecessors().addAll((Collection<? extends WorkItem>) newValue);
			return;
		case RationalePackage.ISSUE__SUCCESSORS:
			getSuccessors().clear();
			getSuccessors().addAll((Collection<? extends WorkItem>) newValue);
			return;
		case RationalePackage.ISSUE__ASSIGNEE:
			setAssignee((OrgUnit) newValue);
			return;
		case RationalePackage.ISSUE__REVIEWER:
			setReviewer((User) newValue);
			return;
		case RationalePackage.ISSUE__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends OrgUnit>) newValue);
			return;
		case RationalePackage.ISSUE__DUE_DATE:
			setDueDate((Date) newValue);
			return;
		case RationalePackage.ISSUE__ESTIMATE:
			setEstimate((Integer) newValue);
			return;
		case RationalePackage.ISSUE__EFFORT:
			setEffort((Integer) newValue);
			return;
		case RationalePackage.ISSUE__PRIORITY:
			setPriority((Integer) newValue);
			return;
		case RationalePackage.ISSUE__RESOLVED:
			setResolved((Boolean) newValue);
			return;
		case RationalePackage.ISSUE__INCLUDING_RELEASES:
			getIncludingReleases().clear();
			getIncludingReleases().addAll((Collection<? extends Release>) newValue);
			return;
		case RationalePackage.ISSUE__PROPOSALS:
			getProposals().clear();
			getProposals().addAll((Collection<? extends Proposal>) newValue);
			return;
		case RationalePackage.ISSUE__SOLUTION:
			setSolution((Solution) newValue);
			return;
		case RationalePackage.ISSUE__CRITERIA:
			getCriteria().clear();
			getCriteria().addAll((Collection<? extends Criterion>) newValue);
			return;
		case RationalePackage.ISSUE__ACTIVITY:
			setActivity((ActivityType) newValue);
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
		case RationalePackage.ISSUE__CHECKED:
			setChecked(CHECKED_EDEFAULT);
			return;
		case RationalePackage.ISSUE__CONTAINING_WORKPACKAGE:
			setContainingWorkpackage((WorkPackage) null);
			return;
		case RationalePackage.ISSUE__PREDECESSORS:
			getPredecessors().clear();
			return;
		case RationalePackage.ISSUE__SUCCESSORS:
			getSuccessors().clear();
			return;
		case RationalePackage.ISSUE__ASSIGNEE:
			setAssignee((OrgUnit) null);
			return;
		case RationalePackage.ISSUE__REVIEWER:
			setReviewer((User) null);
			return;
		case RationalePackage.ISSUE__PARTICIPANTS:
			getParticipants().clear();
			return;
		case RationalePackage.ISSUE__DUE_DATE:
			setDueDate(DUE_DATE_EDEFAULT);
			return;
		case RationalePackage.ISSUE__ESTIMATE:
			setEstimate(ESTIMATE_EDEFAULT);
			return;
		case RationalePackage.ISSUE__EFFORT:
			setEffort(EFFORT_EDEFAULT);
			return;
		case RationalePackage.ISSUE__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case RationalePackage.ISSUE__RESOLVED:
			setResolved(RESOLVED_EDEFAULT);
			return;
		case RationalePackage.ISSUE__INCLUDING_RELEASES:
			getIncludingReleases().clear();
			return;
		case RationalePackage.ISSUE__PROPOSALS:
			getProposals().clear();
			return;
		case RationalePackage.ISSUE__SOLUTION:
			setSolution((Solution) null);
			return;
		case RationalePackage.ISSUE__CRITERIA:
			getCriteria().clear();
			return;
		case RationalePackage.ISSUE__ACTIVITY:
			setActivity(ACTIVITY_EDEFAULT);
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
		case RationalePackage.ISSUE__CHECKED:
			return isChecked() != CHECKED_EDEFAULT;
		case RationalePackage.ISSUE__CONTAINING_WORKPACKAGE:
			return basicGetContainingWorkpackage() != null;
		case RationalePackage.ISSUE__PREDECESSORS:
			return predecessors != null && !predecessors.isEmpty();
		case RationalePackage.ISSUE__SUCCESSORS:
			return successors != null && !successors.isEmpty();
		case RationalePackage.ISSUE__ASSIGNEE:
			return assignee != null;
		case RationalePackage.ISSUE__REVIEWER:
			return reviewer != null;
		case RationalePackage.ISSUE__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
		case RationalePackage.ISSUE__DUE_DATE:
			return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
		case RationalePackage.ISSUE__ESTIMATE:
			return estimate != ESTIMATE_EDEFAULT;
		case RationalePackage.ISSUE__EFFORT:
			return effort != EFFORT_EDEFAULT;
		case RationalePackage.ISSUE__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case RationalePackage.ISSUE__RESOLVED:
			return resolved != RESOLVED_EDEFAULT;
		case RationalePackage.ISSUE__INCLUDING_RELEASES:
			return includingReleases != null && !includingReleases.isEmpty();
		case RationalePackage.ISSUE__PROPOSALS:
			return proposals != null && !proposals.isEmpty();
		case RationalePackage.ISSUE__SOLUTION:
			return solution != null;
		case RationalePackage.ISSUE__CRITERIA:
			return criteria != null && !criteria.isEmpty();
		case RationalePackage.ISSUE__ACTIVITY:
			return activity != ACTIVITY_EDEFAULT;
		case RationalePackage.ISSUE__ASSESSMENTS:
			return assessments != null && !assessments.isEmpty();
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
			case RationalePackage.ISSUE__CHECKED:
				return TaskPackage.CHECKABLE__CHECKED;
			default:
				return -1;
			}
		}
		if (baseClass == WorkItem.class) {
			switch (derivedFeatureID) {
			case RationalePackage.ISSUE__CONTAINING_WORKPACKAGE:
				return TaskPackage.WORK_ITEM__CONTAINING_WORKPACKAGE;
			case RationalePackage.ISSUE__PREDECESSORS:
				return TaskPackage.WORK_ITEM__PREDECESSORS;
			case RationalePackage.ISSUE__SUCCESSORS:
				return TaskPackage.WORK_ITEM__SUCCESSORS;
			case RationalePackage.ISSUE__ASSIGNEE:
				return TaskPackage.WORK_ITEM__ASSIGNEE;
			case RationalePackage.ISSUE__REVIEWER:
				return TaskPackage.WORK_ITEM__REVIEWER;
			case RationalePackage.ISSUE__PARTICIPANTS:
				return TaskPackage.WORK_ITEM__PARTICIPANTS;
			case RationalePackage.ISSUE__DUE_DATE:
				return TaskPackage.WORK_ITEM__DUE_DATE;
			case RationalePackage.ISSUE__ESTIMATE:
				return TaskPackage.WORK_ITEM__ESTIMATE;
			case RationalePackage.ISSUE__EFFORT:
				return TaskPackage.WORK_ITEM__EFFORT;
			case RationalePackage.ISSUE__PRIORITY:
				return TaskPackage.WORK_ITEM__PRIORITY;
			case RationalePackage.ISSUE__RESOLVED:
				return TaskPackage.WORK_ITEM__RESOLVED;
			case RationalePackage.ISSUE__INCLUDING_RELEASES:
				return TaskPackage.WORK_ITEM__INCLUDING_RELEASES;
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
				return RationalePackage.ISSUE__CHECKED;
			default:
				return -1;
			}
		}
		if (baseClass == WorkItem.class) {
			switch (baseFeatureID) {
			case TaskPackage.WORK_ITEM__CONTAINING_WORKPACKAGE:
				return RationalePackage.ISSUE__CONTAINING_WORKPACKAGE;
			case TaskPackage.WORK_ITEM__PREDECESSORS:
				return RationalePackage.ISSUE__PREDECESSORS;
			case TaskPackage.WORK_ITEM__SUCCESSORS:
				return RationalePackage.ISSUE__SUCCESSORS;
			case TaskPackage.WORK_ITEM__ASSIGNEE:
				return RationalePackage.ISSUE__ASSIGNEE;
			case TaskPackage.WORK_ITEM__REVIEWER:
				return RationalePackage.ISSUE__REVIEWER;
			case TaskPackage.WORK_ITEM__PARTICIPANTS:
				return RationalePackage.ISSUE__PARTICIPANTS;
			case TaskPackage.WORK_ITEM__DUE_DATE:
				return RationalePackage.ISSUE__DUE_DATE;
			case TaskPackage.WORK_ITEM__ESTIMATE:
				return RationalePackage.ISSUE__ESTIMATE;
			case TaskPackage.WORK_ITEM__EFFORT:
				return RationalePackage.ISSUE__EFFORT;
			case TaskPackage.WORK_ITEM__PRIORITY:
				return RationalePackage.ISSUE__PRIORITY;
			case TaskPackage.WORK_ITEM__RESOLVED:
				return RationalePackage.ISSUE__RESOLVED;
			case TaskPackage.WORK_ITEM__INCLUDING_RELEASES:
				return RationalePackage.ISSUE__INCLUDING_RELEASES;
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
		result.append(", activity: ");
		result.append(activity);
		result.append(')');
		return result.toString();
	}

} // IssueImpl
