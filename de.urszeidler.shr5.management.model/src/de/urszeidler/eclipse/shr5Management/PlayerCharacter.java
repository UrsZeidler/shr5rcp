/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PlayerCharacter#getDiary <em>Diary</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PlayerCharacter#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPlayerCharacter()
 * @model
 * @generated
 */
public interface PlayerCharacter extends ManagedCharacter {

    /**
     * Returns the value of the '<em><b>Diary</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diary</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diary</em>' containment reference.
     * @see #setDiary(CharacterDiary)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPlayerCharacter_Diary()
     * @model containment="true" required="true"
     * @generated
     */
    CharacterDiary getDiary();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PlayerCharacter#getDiary <em>Diary</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diary</em>' containment reference.
     * @see #getDiary()
     * @generated
     */
    void setDiary(CharacterDiary value);

    /**
     * Returns the value of the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When the diary is used, the age is calculated by the character date.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Age</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPlayerCharacter_Age()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getAge();
} // PlayerCharacter
