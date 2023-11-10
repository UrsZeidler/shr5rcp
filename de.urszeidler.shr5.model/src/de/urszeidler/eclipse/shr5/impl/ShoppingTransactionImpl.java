/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.ShoppingTransaction;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ShoppingTransactionImpl#getItems <em>Items</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ShoppingTransactionImpl#getFee <em>Fee</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ShoppingTransactionImpl#getCaculatedCosts <em>Caculated Costs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingTransactionImpl extends CredstickTransactionImpl implements ShoppingTransaction {
    /**
     * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItems()
     * @generated
     * @ordered
     */
    protected EList<GeldWert> items;

    /**
     * The default value of the '{@link #getFee() <em>Fee</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFee()
     * @generated
     * @ordered
     */
    protected static final double FEE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getFee() <em>Fee</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFee()
     * @generated
     * @ordered
     */
    protected double fee = FEE_EDEFAULT;

    /**
     * The default value of the '{@link #getCaculatedCosts() <em>Caculated Costs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCaculatedCosts()
     * @generated
     * @ordered
     */
    protected static final BigDecimal CACULATED_COSTS_EDEFAULT = null;

    private EContentAdapter eContentAdapter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected ShoppingTransactionImpl() {
        super();
        eContentAdapter = new EContentAdapter() {
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                Object feature = notification.getFeature();
                if (!Shr5Package.Literals.CREDSTICK_TRANSACTION__AMOUNT.equals(feature)
                        && !Shr5Package.Literals.CREDSTICK_TRANSACTION__DATE.equals(feature)
                        && !Shr5Package.Literals.CREDSTICK_TRANSACTION__DESCRIPTION.equals(feature)
                        && !Shr5Package.Literals.SHOPPING_TRANSACTION__CACULATED_COSTS.equals(feature)
                        && !Shr5Package.Literals.CREDSTICK_TRANSACTION__DATE.equals(feature))
                    ShoppingTransactionImpl.this
                            .eNotify(new ENotificationImpl(ShoppingTransactionImpl.this, Notification.SET, Shr5Package.SHOPPING_TRANSACTION__CACULATED_COSTS, 1, 2));

            }

        };
        eContentAdapter.setTarget(this);
        this.eAdapters().add(eContentAdapter);

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.SHOPPING_TRANSACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<GeldWert> getItems() {
        if (items == null) {
            items = new EObjectResolvingEList<GeldWert>(GeldWert.class, this, Shr5Package.SHOPPING_TRANSACTION__ITEMS);
        }
        return items;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getFee() {
        return fee;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFee(double newFee) {
        double oldFee = fee;
        fee = newFee;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SHOPPING_TRANSACTION__FEE, oldFee, fee));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public BigDecimal getCaculatedCosts() {
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
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.SHOPPING_TRANSACTION__ITEMS:
                return getItems();
            case Shr5Package.SHOPPING_TRANSACTION__FEE:
                return getFee();
            case Shr5Package.SHOPPING_TRANSACTION__CACULATED_COSTS:
                return getCaculatedCosts();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5Package.SHOPPING_TRANSACTION__ITEMS:
                return items != null && !items.isEmpty();
            case Shr5Package.SHOPPING_TRANSACTION__FEE:
                return fee != FEE_EDEFAULT;
            case Shr5Package.SHOPPING_TRANSACTION__CACULATED_COSTS:
                return CACULATED_COSTS_EDEFAULT == null ? getCaculatedCosts() != null : !CACULATED_COSTS_EDEFAULT.equals(getCaculatedCosts());
        }
        return super.eIsSet(featureID);
    }

//    @Override
//    public BigDecimal getAmount() {
//        BigDecimal sum = new BigDecimal(0);
//        for (GeldWert geldWert : getItems()) {
//            sum = sum.add(geldWert.getWert());
//        }
//        BigDecimal aFee = sum.multiply(new BigDecimal(fee));
//        return sum.add(aFee);
//    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (fee: ");
        result.append(fee);
        result.append(')');
        return result.toString();
    }

} // ShoppingTransactionImpl
