/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drohne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Drohne#getProgramSlotCount <em>Program Slot Count</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Drohne#getRunningProgramms <em>Running Programms</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Drohne#getStroredProgramm <em>Strored Programm</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrohne()
 * @model
 * @generated
 */
public interface Drohne extends Fahrzeug, MatrixDevice {

    /**
     * Returns the value of the '<em><b>Program Slot Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Program Slot Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Program Slot Count</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrohne_ProgramSlotCount()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getProgramSlotCount();

    /**
     * Returns the value of the '<em><b>Running Programms</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.AutoSoft}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The running programms are stored here.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Running Programms</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrohne_RunningProgramms()
     * @model
     * @generated
     */
    EList<AutoSoft> getRunningProgramms();

    /**
     * Returns the value of the '<em><b>Strored Programm</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.AutoSoft}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The stored programs defines the programs to choose from when selecting the running programms.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Strored Programm</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrohne_StroredProgramm()
     * @model containment="true"
     * @generated
     */
    EList<AutoSoft> getStroredProgramm();
} // Drohne
