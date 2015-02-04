/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Diary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds the data of the diary and the current time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterDiary#getCharacterDate <em>Character Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterDiary#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterDiary()
 * @model
 * @generated
 */
public interface CharacterDiary extends EObject {
    /**
     * Returns the value of the '<em><b>Character Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The current date for the character, should be at lest the last entry of the diary. it is used for caculation of the contract payments.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Character Date</em>' attribute.
     * @see #setCharacterDate(Date)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterDiary_CharacterDate()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getCharacterDate();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.CharacterDiary#getCharacterDate <em>Character Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Date</em>' attribute.
     * @see #getCharacterDate()
     * @generated
     */
    void setCharacterDate(Date value);

    /**
     * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.DiaryEntry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entries</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterDiary_Entries()
     * @model containment="true"
     * @generated
     */
    EList<DiaryEntry> getEntries();

} // CharacterDiary
