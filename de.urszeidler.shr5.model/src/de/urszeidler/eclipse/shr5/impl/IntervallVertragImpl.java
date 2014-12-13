/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.IntervallVertrag;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.TimeUnits;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervall Vertrag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.IntervallVertragImpl#getFaelligkeitsIntervall <em>Faelligkeits Intervall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.IntervallVertragImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.IntervallVertragImpl#getBegin <em>Begin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervallVertragImpl extends VertragImpl implements IntervallVertrag {
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
     * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected static final TimeUnits UNIT_EDEFAULT = TimeUnits.SEC;

    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected TimeUnits unit = UNIT_EDEFAULT;

    /**
     * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBegin()
     * @generated
     * @ordered
     */
    protected static final Date BEGIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBegin()
     * @generated
     * @ordered
     */
    protected Date begin = BEGIN_EDEFAULT;

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
    public TimeUnits getUnit() {
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnit(TimeUnits newUnit) {
        TimeUnits oldUnit = unit;
        unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.INTERVALL_VERTRAG__UNIT, oldUnit, unit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getBegin() {
        return begin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBegin(Date newBegin) {
        Date oldBegin = begin;
        begin = newBegin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.INTERVALL_VERTRAG__BEGIN, oldBegin, begin));
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
            case Shr5Package.INTERVALL_VERTRAG__UNIT:
                return getUnit();
            case Shr5Package.INTERVALL_VERTRAG__BEGIN:
                return getBegin();
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
            case Shr5Package.INTERVALL_VERTRAG__UNIT:
                setUnit((TimeUnits)newValue);
                return;
            case Shr5Package.INTERVALL_VERTRAG__BEGIN:
                setBegin((Date)newValue);
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
            case Shr5Package.INTERVALL_VERTRAG__UNIT:
                setUnit(UNIT_EDEFAULT);
                return;
            case Shr5Package.INTERVALL_VERTRAG__BEGIN:
                setBegin(BEGIN_EDEFAULT);
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
            case Shr5Package.INTERVALL_VERTRAG__UNIT:
                return unit != UNIT_EDEFAULT;
            case Shr5Package.INTERVALL_VERTRAG__BEGIN:
                return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
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
        result.append(", unit: ");
        result.append(unit);
        result.append(", begin: ");
        result.append(begin);
        result.append(')');
        return result.toString();
    }

} //IntervallVertragImpl
