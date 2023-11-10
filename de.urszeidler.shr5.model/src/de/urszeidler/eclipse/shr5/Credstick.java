/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credstick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A credstick can hold money and has a transactions log.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Credstick#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Credstick#getTransactionlog <em>Transactionlog</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Credstick#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstick()
 * @model
 * @generated
 */
public interface Credstick extends AbstraktGegenstand {
    /**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The max value of money the credstick can store.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #setMaxValue(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstick_MaxValue()
     * @model required="true"
     * @generated
     */
    int getMaxValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Credstick#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Value</em>' attribute.
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue(int value);

    /**
     * Returns the value of the '<em><b>Transactionlog</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.CredstickTransaction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The sum of the entries is the current wertValue.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transactionlog</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstick_Transactionlog()
     * @model containment="true"
     * @generated
     */
    EList<CredstickTransaction> getTransactionlog();

    /**
     * Returns the value of the '<em><b>Current Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The current balance is the summ of all transactions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Current Value</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstick_CurrentValue()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    BigDecimal getCurrentValue();

} // Credstick
