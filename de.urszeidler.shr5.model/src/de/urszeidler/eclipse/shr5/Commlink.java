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
 *   <li>{@link de.urszeidler.eclipse.shr5.Commlink#getDeviceRating <em>Device Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Commlink#getRunningProgramms <em>Running Programms</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Commlink#getStroredProgramm <em>Strored Programm</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCommlink()
 * @model
 * @generated
 */
public interface Commlink extends AbstraktGegenstand, MatrixDevice {

    /**
     * Returns the value of the '<em><b>Device Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Device Rating</em>' attribute.
     * @see #setDeviceRating(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCommlink_DeviceRating()
     * @model required="true"
     * @generated
     */
    int getDeviceRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Commlink#getDeviceRating <em>Device Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Device Rating</em>' attribute.
     * @see #getDeviceRating()
     * @generated
     */
    void setDeviceRating(int value);

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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCommlink_RunningProgramms()
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCommlink_StroredProgramm()
     * @model containment="true"
     * @generated
     */
    EList<Program> getStroredProgramm();
} // Comlink
