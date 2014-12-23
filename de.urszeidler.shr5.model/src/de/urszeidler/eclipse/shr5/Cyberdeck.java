/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;

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
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getStoredPrograms <em>Stored Programs</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberdeck#getRunningPrograms <em>Running Programs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck()
 * @model
 * @generated
 */
public interface Cyberdeck extends AbstractMatrixDevice, MatrixDevice, ActiveMatixDevice, Capacity {
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
     * Returns the value of the '<em><b>Attribute1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute1</em>' attribute.
     * @see #setAttribute1(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_Attribute1()
     * @model required="true"
     * @generated
     */
    int getAttribute1();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute1 <em>Attribute1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute1</em>' attribute.
     * @see #getAttribute1()
     * @generated
     */
    void setAttribute1(int value);

    /**
     * Returns the value of the '<em><b>Attribute2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute2</em>' attribute.
     * @see #setAttribute2(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_Attribute2()
     * @model required="true"
     * @generated
     */
    int getAttribute2();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute2 <em>Attribute2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute2</em>' attribute.
     * @see #getAttribute2()
     * @generated
     */
    void setAttribute2(int value);

    /**
     * Returns the value of the '<em><b>Attribute3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute3</em>' attribute.
     * @see #setAttribute3(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_Attribute3()
     * @model required="true"
     * @generated
     */
    int getAttribute3();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute3 <em>Attribute3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute3</em>' attribute.
     * @see #getAttribute3()
     * @generated
     */
    void setAttribute3(int value);

    /**
     * Returns the value of the '<em><b>Attribute4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute4</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute4</em>' attribute.
     * @see #setAttribute4(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_Attribute4()
     * @model required="true"
     * @generated
     */
    int getAttribute4();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute4 <em>Attribute4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute4</em>' attribute.
     * @see #getAttribute4()
     * @generated
     */
    void setAttribute4(int value);

    /**
     * Returns the value of the '<em><b>Configuration</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Contains the value attribues for the matrix attributes. Index 0 firewall,1datenverarbeitung, 2 angriff and 3 schleicher.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Configuration</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_Configuration()
     * @model lower="4" upper="4"
     * @generated
     */
    EList<EAttribute> getConfiguration();

    /**
     * Returns the value of the '<em><b>Stored Programs</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.MatrixProgram}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stored Programs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stored Programs</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_StoredPrograms()
     * @model containment="true"
     * @generated
     */
    EList<MatrixProgram> getStoredPrograms();

    /**
     * Returns the value of the '<em><b>Running Programs</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.MatrixProgram}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Running Programs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Running Programs</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberdeck_RunningPrograms()
     * @model
     * @generated
     */
    EList<MatrixProgram> getRunningPrograms();

} // Cyberdeck
