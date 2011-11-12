/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.bug;

import org.eclipse.emf.emfstore.client.test.model.task.Checkable;
import org.eclipse.emf.emfstore.client.test.model.task.WorkItem;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Report</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getSeverity <em>Severity</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getResolution <em>Resolution</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getResolutionType <em>Resolution Type</em>}</li>
 * <li>{@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#isDone <em>Done</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugPackage#getBugReport()
 * @model
 * @generated
 */
public interface BugReport extends WorkItem, Checkable {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute. The literals are from the enumeration
	 * {@link org.eclipse.emf.emfstore.client.test.model.bug.Severity}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.Severity
	 * @see #setSeverity(Severity)
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugPackage#getBugReport_Severity()
	 * @model annotation="org.unicase.ui.meeditor priority='9.5' position='left'"
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getSeverity
	 * <em>Severity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(String)
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugPackage#getBugReport_Resolution()
	 * @model annotation="org.unicase.ui.meeditor priority='16.0' position='left'"
	 * @generated
	 */
	String getResolution();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getResolution
	 * <em>Resolution</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(String value);

	/**
	 * Returns the value of the '<em><b>Resolution Type</b></em>' attribute. The literals are from the enumeration
	 * {@link org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution Type</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolution Type</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType
	 * @see #setResolutionType(ResolutionType)
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugPackage#getBugReport_ResolutionType()
	 * @model annotation="org.unicase.ui.meeditor priority='17.0' position='left'"
	 * @generated
	 */
	ResolutionType getResolutionType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#getResolutionType
	 * <em>Resolution Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Resolution Type</em>' attribute.
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.ResolutionType
	 * @see #getResolutionType()
	 * @generated
	 */
	void setResolutionType(ResolutionType value);

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(boolean)
	 * @see org.eclipse.emf.emfstore.client.test.model.bug.BugPackage#getBugReport_Done()
	 * @model
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.client.test.model.bug.BugReport#isDone <em>Done</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

} // BugReport
