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
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Drohne#getProgramSlotCount <em>Program Slot Count</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Drohne#getRunningPrograms <em>Running Programs</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Drohne#getStoredPrograms <em>Stored Programs</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrohne()
 * @model
 * @generated
 */
public interface Drohne extends Fahrzeug, MatrixAttributes {

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
     * Returns the value of the '<em><b>Running Programs</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.RiggerProgram}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The running programms are stored here.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Running Programs</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrohne_RunningPrograms()
     * @model
     * @generated
     */
    EList<RiggerProgram> getRunningPrograms();

    /**
     * Returns the value of the '<em><b>Stored Programs</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.RiggerProgram}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The stored programs defines the programs to choose from when selecting the running programms.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Stored Programs</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrohne_StoredPrograms()
     * @model containment="true"
     * @generated
     */
    EList<RiggerProgram> getStoredPrograms();
} // Drohne
