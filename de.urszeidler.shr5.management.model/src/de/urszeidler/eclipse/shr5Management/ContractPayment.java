/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Vertrag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ContractPayment#getContractToPay <em>Contract To Pay</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ContractPayment#isPayed <em>Payed</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getContractPayment()
 * @model
 * @generated
 */
public interface ContractPayment extends DiaryEntry {
    /**
     * Returns the value of the '<em><b>Contract To Pay</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contract To Pay</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contract To Pay</em>' reference.
     * @see #setContractToPay(Vertrag)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getContractPayment_ContractToPay()
     * @model required="true"
     * @generated
     */
    Vertrag getContractToPay();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ContractPayment#getContractToPay <em>Contract To Pay</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contract To Pay</em>' reference.
     * @see #getContractToPay()
     * @generated
     */
    void setContractToPay(Vertrag value);

    /**
     * Returns the value of the '<em><b>Payed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Payed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Payed</em>' attribute.
     * @see #setPayed(boolean)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getContractPayment_Payed()
     * @model
     * @generated
     */
    boolean isPayed();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ContractPayment#isPayed <em>Payed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Payed</em>' attribute.
     * @see #isPayed()
     * @generated
     */
    void setPayed(boolean value);

} // ContractPayment
