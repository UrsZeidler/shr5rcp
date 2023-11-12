/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.PhaseCmd#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getPhaseCmd()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PhaseCmd extends EObject {
    /**
     * Returns the value of the '<em><b>Phase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase</em>' attribute.
     * @see #setPhase(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getPhaseCmd_Phase()
     * @model
     * @generated
     */
    int getPhase();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.PhaseCmd#getPhase <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase</em>' attribute.
     * @see #getPhase()
     * @generated
     */
    void setPhase(int value);

} // PhaseCmd
