/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diary Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Can hold a message and a date.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.DiaryEntry#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.DiaryEntry#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getDiaryEntry()
 * @model
 * @generated
 */
public interface DiaryEntry extends EObject {
    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(Date)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getDiaryEntry_Date()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getDate();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.DiaryEntry#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(Date value);

    /**
     * Returns the value of the '<em><b>Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' attribute.
     * @see #setMessage(String)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getDiaryEntry_Message()
     * @model
     * @generated
     */
    String getMessage();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.DiaryEntry#getMessage <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' attribute.
     * @see #getMessage()
     * @generated
     */
    void setMessage(String value);

} // DiaryEntry
