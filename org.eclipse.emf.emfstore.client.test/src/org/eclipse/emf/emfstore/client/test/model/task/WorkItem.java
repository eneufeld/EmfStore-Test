/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.task;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.test.model.Annotation;
import org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit;
import org.eclipse.emf.emfstore.client.test.model.organization.User;
import org.eclipse.emf.emfstore.client.test.model.release.Release;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Work Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getContainingWorkpackage <em>Containing
 * Workpackage</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getPredecessors <em>Predecessors</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getSuccessors <em>Successors</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getAssignee <em>Assignee</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getReviewer <em>Reviewer</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getParticipants <em>Participants</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getDueDate <em>Due Date</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getEstimate <em>Estimate</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getEffort <em>Effort</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getPriority <em>Priority</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#isResolved <em>Resolved</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getIncludingReleases <em>Including Releases</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface WorkItem extends Annotation {
	/**
	 * Returns the value of the '<em><b>Containing Workpackage</b></em>' container reference. It is bidirectional and
	 * its opposite is '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getContainedWorkItems
	 * <em>Contained Work Items</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Workpackage</em>' container reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Containing Workpackage</em>' container reference.
	 * @see #setContainingWorkpackage(WorkPackage)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_ContainingWorkpackage()
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkPackage#getContainedWorkItems
	 * @model opposite="containedWorkItems" transient="false"
	 *        annotation="org.unicase.ui.meeditor priority='10.0' position='left'"
	 * @generated
	 */
	WorkPackage getContainingWorkpackage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getContainingWorkpackage
	 * <em>Containing Workpackage</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Containing Workpackage</em>' container reference.
	 * @see #getContainingWorkpackage()
	 * @generated
	 */
	void setContainingWorkpackage(WorkPackage value);

	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getSuccessors <em>Successors</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessors</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_Predecessors()
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getSuccessors
	 * @model opposite="successors" annotation="org.unicase.ui.meeditor priority='11.0' position='right'"
	 * @generated
	 */
	EList<WorkItem> getPredecessors();

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getPredecessors <em>Predecessors</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successors</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_Successors()
	 * @see org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getPredecessors
	 * @model opposite="predecessors" annotation="org.unicase.ui.meeditor priority='12.0' position='right'"
	 * @generated
	 */
	EList<WorkItem> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(OrgUnit)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_Assignee()
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getAssignments
	 * @model opposite="assignments" annotation="org.unicase.ui.meeditor priority='11.0' position='left'"
	 * @generated
	 */
	OrgUnit getAssignee();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getAssignee
	 * <em>Assignee</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(OrgUnit value);

	/**
	 * Returns the value of the '<em><b>Reviewer</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.User#getWorkItemsToReview
	 * <em>Work Items To Review</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviewer</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reviewer</em>' reference.
	 * @see #setReviewer(User)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_Reviewer()
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.User#getWorkItemsToReview
	 * @model opposite="workItemsToReview" annotation="org.unicase.ui.meeditor priority='12.0' position='left'"
	 * @generated
	 */
	User getReviewer();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getReviewer
	 * <em>Reviewer</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Reviewer</em>' reference.
	 * @see #getReviewer()
	 * @generated
	 */
	void setReviewer(User value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit}. It is bidirectional and its opposite is
	 * '{@link org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getParticipations
	 * <em>Participations</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_Participants()
	 * @see org.eclipse.emf.emfstore.client.test.model.organization.OrgUnit#getParticipations
	 * @model opposite="participations" annotation="org.unicase.ui.meeditor priority='10.0' position='right'"
	 * @generated
	 */
	EList<OrgUnit> getParticipants();

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_DueDate()
	 * @model annotation="org.unicase.ui.meeditor priority='12.0' position='left'"
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getDueDate
	 * <em>Due Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimate</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimate</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Estimate</em>' attribute.
	 * @see #setEstimate(int)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_Estimate()
	 * @model annotation="org.unicase.ui.meeditor priority='18.0' position='left'"
	 * @generated
	 */
	int getEstimate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getEstimate
	 * <em>Estimate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Estimate</em>' attribute.
	 * @see #getEstimate()
	 * @generated
	 */
	void setEstimate(int value);

	/**
	 * Returns the value of the '<em><b>Effort</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effort</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Effort</em>' attribute.
	 * @see #setEffort(int)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_Effort()
	 * @model annotation="org.unicase.ui.meeditor priority='19.0' position='left'"
	 * @generated
	 */
	int getEffort();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getEffort <em>Effort</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Effort</em>' attribute.
	 * @see #getEffort()
	 * @generated
	 */
	void setEffort(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_Priority()
	 * @model annotation="org.unicase.ui.meeditor priority='12.0' position='left'"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#getPriority
	 * <em>Priority</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_Resolved()
	 * @model annotation="org.unicase.ui.meeditor priority='13.0' position='left'"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.task.WorkItem#isResolved
	 * <em>Resolved</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Including Releases</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.emf.emfstore.client.test.model.release.Release#getIncludedWorkItems
	 * <em>Included Work Items</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Including Releases</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Including Releases</em>' reference list.
	 * @see org.eclipse.emf.emfstore.client.test.model.task.TaskPackage#getWorkItem_IncludingReleases()
	 * @see org.eclipse.emf.emfstore.client.test.model.release.Release#getIncludedWorkItems
	 * @model opposite="includedWorkItems"
	 * @generated
	 */
	EList<Release> getIncludingReleases();

} // WorkItem
