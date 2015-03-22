/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5Management.ContractPayment;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ContractPaymentImpl#getContractToPay <em>Contract To Pay</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ContractPaymentImpl#isPayed <em>Payed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractPaymentImpl extends DiaryEntryImpl implements ContractPayment {
    /**
     * The cached value of the '{@link #getContractToPay() <em>Contract To Pay</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContractToPay()
     * @generated
     * @ordered
     */
    protected Vertrag contractToPay;

    /**
     * The default value of the '{@link #isPayed() <em>Payed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPayed()
     * @generated
     * @ordered
     */
    protected static final boolean PAYED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPayed() <em>Payed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPayed()
     * @generated
     * @ordered
     */
    protected boolean payed = PAYED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContractPaymentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.CONTRACT_PAYMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Vertrag getContractToPay() {
        if (contractToPay != null && contractToPay.eIsProxy()) {
            InternalEObject oldContractToPay = (InternalEObject)contractToPay;
            contractToPay = (Vertrag)eResolveProxy(oldContractToPay);
            if (contractToPay != oldContractToPay) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.CONTRACT_PAYMENT__CONTRACT_TO_PAY, oldContractToPay, contractToPay));
            }
        }
        return contractToPay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Vertrag basicGetContractToPay() {
        return contractToPay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContractToPay(Vertrag newContractToPay) {
        Vertrag oldContractToPay = contractToPay;
        contractToPay = newContractToPay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CONTRACT_PAYMENT__CONTRACT_TO_PAY, oldContractToPay, contractToPay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isPayed() {
        return payed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPayed(boolean newPayed) {
        boolean oldPayed = payed;
        payed = newPayed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CONTRACT_PAYMENT__PAYED, oldPayed, payed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.CONTRACT_PAYMENT__CONTRACT_TO_PAY:
                if (resolve) return getContractToPay();
                return basicGetContractToPay();
            case Shr5managementPackage.CONTRACT_PAYMENT__PAYED:
                return isPayed();
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
            case Shr5managementPackage.CONTRACT_PAYMENT__CONTRACT_TO_PAY:
                setContractToPay((Vertrag)newValue);
                return;
            case Shr5managementPackage.CONTRACT_PAYMENT__PAYED:
                setPayed((Boolean)newValue);
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
            case Shr5managementPackage.CONTRACT_PAYMENT__CONTRACT_TO_PAY:
                setContractToPay((Vertrag)null);
                return;
            case Shr5managementPackage.CONTRACT_PAYMENT__PAYED:
                setPayed(PAYED_EDEFAULT);
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
            case Shr5managementPackage.CONTRACT_PAYMENT__CONTRACT_TO_PAY:
                return contractToPay != null;
            case Shr5managementPackage.CONTRACT_PAYMENT__PAYED:
                return payed != PAYED_EDEFAULT;
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
        result.append(" (payed: ");
        result.append(payed);
        result.append(')');
        return result.toString();
    }

} //ContractPaymentImpl
