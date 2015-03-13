/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Character Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleCharacterChange#getCharacterChange <em>Character Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleCharacterChange()
 * @model
 * @generated
 */
public interface ModuleCharacterChange extends ModuleChange {
    /**
     * Returns the value of the '<em><b>Character Change</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character Change</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character Change</em>' containment reference.
     * @see #setCharacterChange(Changes)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleCharacterChange_CharacterChange()
     * @model containment="true" required="true"
     * @generated
     */
    Changes getCharacterChange();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleCharacterChange#getCharacterChange <em>Character Change</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Change</em>' containment reference.
     * @see #getCharacterChange()
     * @generated
     */
    void setCharacterChange(Changes value);

} // ModuleCharacterChange
