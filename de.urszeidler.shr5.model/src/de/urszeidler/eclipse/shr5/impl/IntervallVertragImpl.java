/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.IntervallVertrag;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervall Vertrag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.IntervallVertragImpl#getFaelligkeitsIntervall <em>Faelligkeits Intervall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IntervallVertragImpl extends VertragImpl implements IntervallVertrag {
    /**
     * The default value of the '{@link #getFaelligkeitsIntervall() <em>Faelligkeits Intervall</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaelligkeitsIntervall()
     * @generated
     * @ordered
     */
    protected static final int FAELLIGKEITS_INTERVALL_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFaelligkeitsIntervall() <em>Faelligkeits Intervall</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaelligkeitsIntervall()
     * @generated
     * @ordered
     */
    protected int faelligkeitsIntervall = FAELLIGKEITS_INTERVALL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntervallVertragImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.INTERVALL_VERTRAG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getFaelligkeitsIntervall() {
        return faelligkeitsIntervall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFaelligkeitsIntervall(int newFaelligkeitsIntervall) {
        int oldFaelligkeitsIntervall = faelligkeitsIntervall;
        faelligkeitsIntervall = newFaelligkeitsIntervall;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL, oldFaelligkeitsIntervall, faelligkeitsIntervall));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL:
                return getFaelligkeitsIntervall();
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
            case Shr5Package.INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL:
                setFaelligkeitsIntervall((Integer)newValue);
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
            case Shr5Package.INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL:
                setFaelligkeitsIntervall(FAELLIGKEITS_INTERVALL_EDEFAULT);
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
            case Shr5Package.INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL:
                return faelligkeitsIntervall != FAELLIGKEITS_INTERVALL_EDEFAULT;
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
        result.append(" (faelligkeitsIntervall: ");
        result.append(faelligkeitsIntervall);
        result.append(')');
        return result.toString();
    }

} //IntervallVertragImpl
