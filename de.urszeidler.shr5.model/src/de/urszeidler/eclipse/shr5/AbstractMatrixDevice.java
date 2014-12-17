/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Matrix Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstractMatrixDevice#getDeviceRating <em>Device Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstractMatrixDevice()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractMatrixDevice extends AbstraktGegenstand, MatrixDevice {
    /**
     * Returns the value of the '<em><b>Device Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The device rating, it defines the basic properties of a matrix device.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Device Rating</em>' attribute.
     * @see #setDeviceRating(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstractMatrixDevice_DeviceRating()
     * @model required="true"
     * @generated
     */
    int getDeviceRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstractMatrixDevice#getDeviceRating <em>Device Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Device Rating</em>' attribute.
     * @see #getDeviceRating()
     * @generated
     */
    void setDeviceRating(int value);

} // AbstractMatrixDevice
