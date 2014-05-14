/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This defines the complink.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Commlink#getStoredPrograms <em>Stored Programs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCommlink()
 * @model
 * @generated
 */
public interface Commlink extends AbstractMatrixDevice {

    /**
     * Returns the value of the '<em><b>Stored Programs</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.BasicProgram}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The stored programs defines the programs to choose from when selecting the running programms.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Stored Programs</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCommlink_StoredPrograms()
     * @model containment="true"
     * @generated
     */
    EList<BasicProgram> getStoredPrograms();
} // Comlink
