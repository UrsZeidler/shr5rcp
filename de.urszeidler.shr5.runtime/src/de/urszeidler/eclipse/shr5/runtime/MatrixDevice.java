/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.MatrixDevice#getDevice <em>Device</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.MatrixDevice#getMatrixCondition <em>Matrix Condition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.MatrixDevice#getMarks <em>Marks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getMatrixDevice()
 * @model
 * @generated
 */
public interface MatrixDevice<M extends de.urszeidler.eclipse.shr5.MatrixDevice> extends EObject {
    /**
     * Returns the value of the '<em><b>Device</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Device</em>' reference.
     * @see #setDevice(de.urszeidler.eclipse.shr5.MatrixDevice)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getMatrixDevice_Device()
     * @model required="true"
     * @generated
     */
    M getDevice();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.MatrixDevice#getDevice <em>Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Device</em>' reference.
     * @see #getDevice()
     * @generated
     */
    void setDevice(M value);

    /**
     * Returns the value of the '<em><b>Matrix Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matrix Condition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matrix Condition</em>' attribute.
     * @see #setMatrixCondition(int)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getMatrixDevice_MatrixCondition()
     * @model
     * @generated
     */
    int getMatrixCondition();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.MatrixDevice#getMatrixCondition <em>Matrix Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Matrix Condition</em>' attribute.
     * @see #getMatrixCondition()
     * @generated
     */
    void setMatrixCondition(int value);

    /**
     * Returns the value of the '<em><b>Marks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Marks</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Marks</em>' attribute.
     * @see #setMarks(int)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getMatrixDevice_Marks()
     * @model
     * @generated
     */
    int getMarks();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.MatrixDevice#getMarks <em>Marks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Marks</em>' attribute.
     * @see #getMarks()
     * @generated
     */
    void setMarks(int value);

} // MatrixDevice
