/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.CommonProgram#getProgramType <em>Program Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCommonProgram()
 * @model
 * @generated
 */
public interface CommonProgram extends MatrixProgram, RiggerProgram {
    /**
     * Returns the value of the '<em><b>Program Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.MatrixProgramType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Program Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Program Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.MatrixProgramType
     * @see #setProgramType(MatrixProgramType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCommonProgram_ProgramType()
     * @model
     * @generated
     */
    MatrixProgramType getProgramType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CommonProgram#getProgramType <em>Program Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Program Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.MatrixProgramType
     * @see #getProgramType()
     * @generated
     */
    void setProgramType(MatrixProgramType value);

} // CommonProgram
