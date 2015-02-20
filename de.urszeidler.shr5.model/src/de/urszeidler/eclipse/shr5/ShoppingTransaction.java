/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ShoppingTransaction#getItems <em>Items</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ShoppingTransaction#getFee <em>Fee</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getShoppingTransaction()
 * @model
 * @generated
 */
public interface ShoppingTransaction extends CredstickTransaction {
    /**
     * Returns the value of the '<em><b>Items</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.GeldWert}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Items</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Items</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getShoppingTransaction_Items()
     * @model
     * @generated
     */
    EList<GeldWert> getItems();

    /**
     * Returns the value of the '<em><b>Fee</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The addional fee is a factor which will be added to the sum.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fee</em>' attribute.
     * @see #setFee(double)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getShoppingTransaction_Fee()
     * @model
     * @generated
     */
    double getFee();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.ShoppingTransaction#getFee <em>Fee</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fee</em>' attribute.
     * @see #getFee()
     * @generated
     */
    void setFee(double value);

} // ShoppingTransaction
