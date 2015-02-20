/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.TransferAmount#getSource <em>Source</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.TransferAmount#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getTransferAmount()
 * @model
 * @generated
 */
public interface TransferAmount extends CredstickTransaction {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Credstick)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getTransferAmount_Source()
     * @model required="true"
     * @generated
     */
    Credstick getSource();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.TransferAmount#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Credstick value);

    /**
     * Returns the value of the '<em><b>Dest</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dest</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dest</em>' reference.
     * @see #setDest(Credstick)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getTransferAmount_Dest()
     * @model required="true"
     * @generated
     */
    Credstick getDest();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.TransferAmount#getDest <em>Dest</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dest</em>' reference.
     * @see #getDest()
     * @generated
     */
    void setDest(Credstick value);

} // TransferAmount
