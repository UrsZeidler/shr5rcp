/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.CredstickTransaction;
import de.urszeidler.eclipse.shr5.Shr5Package;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credstick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CredstickImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CredstickImpl#getTransactionlog <em>Transactionlog</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CredstickImpl#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CredstickImpl extends AbstraktGegenstandImpl implements Credstick {
    /**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected static final int MAX_VALUE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected int maxValue = MAX_VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getTransactionlog() <em>Transactionlog</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactionlog()
     * @generated
     * @ordered
     */
    protected EList<CredstickTransaction> transactionlog;

    /**
     * The default value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal CURRENT_VALUE_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CredstickImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.CREDSTICK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxValue(int newMaxValue) {
        int oldMaxValue = maxValue;
        maxValue = newMaxValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CREDSTICK__MAX_VALUE, oldMaxValue, maxValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CredstickTransaction> getTransactionlog() {
        if (transactionlog == null) {
            transactionlog = new EObjectContainmentEList<CredstickTransaction>(CredstickTransaction.class, this, Shr5Package.CREDSTICK__TRANSACTIONLOG);
        }
        return transactionlog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public BigDecimal getCurrentValue() {
        EList<CredstickTransaction> transactionlog2 = getTransactionlog();
        BigDecimal value = new BigDecimal(0);
        for (CredstickTransaction credstickTransaction : transactionlog2) {
            value = value.add(credstickTransaction.getAmount());
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.CREDSTICK__TRANSACTIONLOG:
                return ((InternalEList<?>)getTransactionlog()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.CREDSTICK__MAX_VALUE:
                return getMaxValue();
            case Shr5Package.CREDSTICK__TRANSACTIONLOG:
                return getTransactionlog();
            case Shr5Package.CREDSTICK__CURRENT_VALUE:
                return getCurrentValue();
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
            case Shr5Package.CREDSTICK__MAX_VALUE:
                setMaxValue((Integer)newValue);
                return;
            case Shr5Package.CREDSTICK__TRANSACTIONLOG:
                getTransactionlog().clear();
                getTransactionlog().addAll((Collection<? extends CredstickTransaction>)newValue);
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
            case Shr5Package.CREDSTICK__MAX_VALUE:
                setMaxValue(MAX_VALUE_EDEFAULT);
                return;
            case Shr5Package.CREDSTICK__TRANSACTIONLOG:
                getTransactionlog().clear();
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
            case Shr5Package.CREDSTICK__MAX_VALUE:
                return maxValue != MAX_VALUE_EDEFAULT;
            case Shr5Package.CREDSTICK__TRANSACTIONLOG:
                return transactionlog != null && !transactionlog.isEmpty();
            case Shr5Package.CREDSTICK__CURRENT_VALUE:
                return CURRENT_VALUE_EDEFAULT == null ? getCurrentValue() != null : !CURRENT_VALUE_EDEFAULT.equals(getCurrentValue());
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (maxValue: ");
        result.append(maxValue);
        result.append(')');
        return result.toString();
    }

} //CredstickImpl
