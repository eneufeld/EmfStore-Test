/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.model.attachment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>File Attachment Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.emfstore.client.test.model.attachment.AttachmentPackage#getFileAttachmentType()
 * @model
 * @generated
 */
public enum FileAttachmentType implements Enumerator {
	/**
	 * The '<em><b>BINARY</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(0, "BINARY", "BINARY"),

	/**
	 * The '<em><b>IMAGE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(1, "IMAGE", "IMAGE"),

	/**
	 * The '<em><b>AUDIO</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #AUDIO_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO(2, "AUDIO", "AUDIO"),

	/**
	 * The '<em><b>VIDEO</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO(3, "VIDEO", "VIDEO");

	/**
	 * The '<em><b>BINARY</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINARY</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BINARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 0;

	/**
	 * The '<em><b>IMAGE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #IMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 1;

	/**
	 * The '<em><b>AUDIO</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUDIO</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #AUDIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_VALUE = 2;

	/**
	 * The '<em><b>VIDEO</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIDEO</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #VIDEO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_VALUE = 3;

	/**
	 * An array of all the '<em><b>File Attachment Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final FileAttachmentType[] VALUES_ARRAY = new FileAttachmentType[] { BINARY, IMAGE, AUDIO, VIDEO, };

	/**
	 * A public read-only list of all the '<em><b>File Attachment Type</b></em>' enumerators. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<FileAttachmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>File Attachment Type</b></em>' literal with the specified literal value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FileAttachmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileAttachmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Attachment Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static FileAttachmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileAttachmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Attachment Type</b></em>' literal with the specified integer value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FileAttachmentType get(int value) {
		switch (value) {
		case BINARY_VALUE:
			return BINARY;
		case IMAGE_VALUE:
			return IMAGE;
		case AUDIO_VALUE:
			return AUDIO;
		case VIDEO_VALUE:
			return VIDEO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private FileAttachmentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // FileAttachmentType
