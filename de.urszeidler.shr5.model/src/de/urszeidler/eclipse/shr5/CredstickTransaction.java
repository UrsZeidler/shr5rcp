/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credstick Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an entry in the log.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.CredstickTransaction#getAmount <em>Amount</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.CredstickTransaction#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.CredstickTransaction#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstickTransaction()
 * @model
 * @generated
 */
public interface CredstickTransaction extends EObject {
    /**
     * Returns the value of the '<em><b>Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Amount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Amount</em>' attribute.
     * @see #setAmount(BigDecimal)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstickTransaction_Amount()
     * @model required="true"
     * @generated
     */
    BigDecimal getAmount();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CredstickTransaction#getAmount <em>Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Amount</em>' attribute.
     * @see #getAmount()
     * @generated
     */
    void setAmount(BigDecimal value);

    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(Date)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstickTransaction_Date()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate" required="true"
     * @generated
     */
    Date getDate();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CredstickTransaction#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(Date value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstickTransaction_Description()
     * @model required="true"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CredstickTransaction#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // CredstickTransaction
