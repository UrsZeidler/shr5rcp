/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A probe as command.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ProbeCommand#getMods <em>Mods</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbeCommand()
 * @model abstract="true"
 * @generated
 */
public interface ProbeCommand extends SubjectCommand, SuccesTest {
    /**
     * Returns the value of the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mods</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The dicepool modifer.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mods</em>' attribute.
     * @see #setMods(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbeCommand_Mods()
     * @model
     * @generated
     */
    int getMods();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeCommand#getMods <em>Mods</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mods</em>' attribute.
     * @see #getMods()
     * @generated
     */
    void setMods(int value);

} // ProbeCommand
