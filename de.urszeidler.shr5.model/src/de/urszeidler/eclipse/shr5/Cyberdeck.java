/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyberdeck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This defines the cyberdeck.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getProgramSlots <em>Program Slots</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getRunningProgramms <em>Running Programms</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getStroredProgramm <em>Strored Programm</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck()
 * @model
 * @generated
 */
public interface Cyberdeck extends Comlink, ActiveMatixDevice {
    /**
     * Returns the value of the '<em><b>Program Slots</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Program Slots</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number probrams the deck can run concuntrly.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Program Slots</em>' attribute.
     * @see #setProgramSlots(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_ProgramSlots()
     * @model
     * @generated
     */
    int getProgramSlots();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getProgramSlots <em>Program Slots</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Program Slots</em>' attribute.
     * @see #getProgramSlots()
     * @generated
     */
    void setProgramSlots(int value);

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Integer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Contains the attribute ratings.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Attributes</em>' attribute list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_Attributes()
     * @model lower="4" upper="4"
     * @generated
     */
    EList<Integer> getAttributes();

    /**
     * Returns the value of the '<em><b>Running Programms</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Program}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Running Programms</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Running Programms</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_RunningProgramms()
     * @model
     * @generated
     */
    EList<Program> getRunningProgramms();

    /**
     * Returns the value of the '<em><b>Strored Programm</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Program}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Strored Programm</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Strored Programm</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_StroredProgramm()
     * @model containment="true"
     * @generated
     */
    EList<Program> getStroredProgramm();

} // Cyberdeck
