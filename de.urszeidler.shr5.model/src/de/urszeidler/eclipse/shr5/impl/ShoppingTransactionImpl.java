/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.ShoppingTransaction;
import de.urszeidler.eclipse.shr5.Shr5Package;

import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.ShoppingTransactionImpl#getItems <em>Items</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.ShoppingTransactionImpl#getFee <em>Fee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShoppingTransactionImpl extends CredstickTransactionImpl implements ShoppingTransaction {
    /**
     * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getItems()
     * @generated
     * @ordered
     */
    protected EList<GeldWert> items;

    /**
     * The default value of the '{@link #getFee() <em>Fee</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getFee()
     * @generated
     * @ordered
     */
    protected static final double FEE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getFee() <em>Fee</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getFee()
     * @generated
     * @ordered
     */
    protected double fee = FEE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ShoppingTransactionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.SHOPPING_TRANSACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<GeldWert> getItems() {
        if (items == null) {
            items = new EObjectResolvingEList<GeldWert>(GeldWert.class, this, Shr5Package.SHOPPING_TRANSACTION__ITEMS);
        }
        return items;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public double getFee() {
        return fee;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setFee(double newFee) {
        double oldFee = fee;
        fee = newFee;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SHOPPING_TRANSACTION__FEE, oldFee, fee));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.SHOPPING_TRANSACTION__ITEMS:
                return getItems();
            case Shr5Package.SHOPPING_TRANSACTION__FEE:
                return getFee();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5Package.SHOPPING_TRANSACTION__ITEMS:
                getItems().clear();
                getItems().addAll((Collection<? extends GeldWert>)newValue);
                return;
            case Shr5Package.SHOPPING_TRANSACTION__FEE:
                setFee((Double)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5Package.SHOPPING_TRANSACTION__ITEMS:
                getItems().clear();
                return;
            case Shr5Package.SHOPPING_TRANSACTION__FEE:
                setFee(FEE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5Package.SHOPPING_TRANSACTION__ITEMS:
                return items != null && !items.isEmpty();
            case Shr5Package.SHOPPING_TRANSACTION__FEE:
                return fee != FEE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    @Override
    public BigDecimal getAmount() {
        BigDecimal sum = new BigDecimal(0);
        for (GeldWert geldWert : getItems()) {
            sum = sum.add(geldWert.getWert());
        }
        BigDecimal aFee = sum.multiply(new BigDecimal(fee));
        return sum.add(aFee);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (fee: ");
        result.append(fee);
        result.append(')');
        return result.toString();
    }

} // ShoppingTransactionImpl
