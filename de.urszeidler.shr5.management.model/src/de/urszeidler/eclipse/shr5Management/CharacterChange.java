/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterChange#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterChange()
 * @model
 * @generated
 */
public interface CharacterChange extends DiaryEntry {
    /**
     * Returns the value of the '<em><b>Change</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Change</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Change</em>' reference.
     * @see #setChange(Changes)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterChange_Change()
     * @model required="true"
     * @generated
     */
    Changes getChange();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.CharacterChange#getChange <em>Change</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Change</em>' reference.
     * @see #getChange()
     * @generated
     */
    void setChange(Changes value);

} // CharacterChange
