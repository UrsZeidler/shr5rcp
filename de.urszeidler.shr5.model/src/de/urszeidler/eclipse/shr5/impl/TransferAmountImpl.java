/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.TransferAmount;

import java.math.BigDecimal;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TransferAmountImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TransferAmountImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TransferAmountImpl#getAmountToTransfer <em>Amount To Transfer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransferAmountImpl extends CredstickTransactionImpl implements TransferAmount {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected Credstick source;

    /**
     * The cached value of the '{@link #getDest() <em>Dest</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDest()
     * @generated
     * @ordered
     */
    protected Credstick dest;

    /**
     * The default value of the '{@link #getAmountToTransfer() <em>Amount To Transfer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmountToTransfer()
     * @generated
     * @ordered
     */
    protected static final BigDecimal AMOUNT_TO_TRANSFER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAmountToTransfer() <em>Amount To Transfer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmountToTransfer()
     * @generated
     * @ordered
     */
    protected BigDecimal amountToTransfer = AMOUNT_TO_TRANSFER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransferAmountImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.TRANSFER_AMOUNT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Credstick getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (Credstick)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.TRANSFER_AMOUNT__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Credstick basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(Credstick newSource) {
        Credstick oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.TRANSFER_AMOUNT__SOURCE, oldSource, source));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Credstick getDest() {
        if (dest != null && dest.eIsProxy()) {
            InternalEObject oldDest = (InternalEObject)dest;
            dest = (Credstick)eResolveProxy(oldDest);
            if (dest != oldDest) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.TRANSFER_AMOUNT__DEST, oldDest, dest));
            }
        }
        return dest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Credstick basicGetDest() {
        return dest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDest(Credstick newDest) {
        Credstick oldDest = dest;
        dest = newDest;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.TRANSFER_AMOUNT__DEST, oldDest, dest));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getAmountToTransfer() {
        return amountToTransfer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAmountToTransfer(BigDecimal newAmountToTransfer) {
        BigDecimal oldAmountToTransfer = amountToTransfer;
        amountToTransfer = newAmountToTransfer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.TRANSFER_AMOUNT__AMOUNT_TO_TRANSFER, oldAmountToTransfer, amountToTransfer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.TRANSFER_AMOUNT__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case Shr5Package.TRANSFER_AMOUNT__DEST:
                if (resolve) return getDest();
                return basicGetDest();
            case Shr5Package.TRANSFER_AMOUNT__AMOUNT_TO_TRANSFER:
                return getAmountToTransfer();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5Package.TRANSFER_AMOUNT__SOURCE:
                setSource((Credstick)newValue);
                return;
            case Shr5Package.TRANSFER_AMOUNT__DEST:
                setDest((Credstick)newValue);
                return;
            case Shr5Package.TRANSFER_AMOUNT__AMOUNT_TO_TRANSFER:
                setAmountToTransfer((BigDecimal)newValue);
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
            case Shr5Package.TRANSFER_AMOUNT__SOURCE:
                setSource((Credstick)null);
                return;
            case Shr5Package.TRANSFER_AMOUNT__DEST:
                setDest((Credstick)null);
                return;
            case Shr5Package.TRANSFER_AMOUNT__AMOUNT_TO_TRANSFER:
                setAmountToTransfer(AMOUNT_TO_TRANSFER_EDEFAULT);
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
            case Shr5Package.TRANSFER_AMOUNT__SOURCE:
                return source != null;
            case Shr5Package.TRANSFER_AMOUNT__DEST:
                return dest != null;
            case Shr5Package.TRANSFER_AMOUNT__AMOUNT_TO_TRANSFER:
                return AMOUNT_TO_TRANSFER_EDEFAULT == null ? amountToTransfer != null : !AMOUNT_TO_TRANSFER_EDEFAULT.equals(amountToTransfer);
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
        result.append(" (amountToTransfer: ");
        result.append(amountToTransfer);
        result.append(')');
        return result.toString();
    }

} //TransferAmountImpl
