/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.TimeUnits;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.TrainingRate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingRateImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingRateImpl#getTo <em>To</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingRateImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingRateImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingRateImpl extends MinimalEObjectImpl.Container implements TrainingRate {
    /**
     * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected static final int FROM_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected int from = FROM_EDEFAULT;

    /**
     * The default value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected static final int TO_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected int to = TO_EDEFAULT;

    /**
     * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFactor()
     * @generated
     * @ordered
     */
    protected static final int FACTOR_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFactor()
     * @generated
     * @ordered
     */
    protected int factor = FACTOR_EDEFAULT;

    /**
     * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeUnit()
     * @generated
     * @ordered
     */
    protected static final TimeUnits TIME_UNIT_EDEFAULT = TimeUnits.SEC;

    /**
     * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeUnit()
     * @generated
     * @ordered
     */
    protected TimeUnits timeUnit = TIME_UNIT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TrainingRateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.TRAINING_RATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFrom(int newFrom) {
        int oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAINING_RATE__FROM, oldFrom, from));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTo(int newTo) {
        int oldTo = to;
        to = newTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAINING_RATE__TO, oldTo, to));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getFactor() {
        return factor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFactor(int newFactor) {
        int oldFactor = factor;
        factor = newFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAINING_RATE__FACTOR, oldFactor, factor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimeUnits getTimeUnit() {
        return timeUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeUnit(TimeUnits newTimeUnit) {
        TimeUnits oldTimeUnit = timeUnit;
        timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAINING_RATE__TIME_UNIT, oldTimeUnit, timeUnit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.TRAINING_RATE__FROM:
                return getFrom();
            case Shr5managementPackage.TRAINING_RATE__TO:
                return getTo();
            case Shr5managementPackage.TRAINING_RATE__FACTOR:
                return getFactor();
            case Shr5managementPackage.TRAINING_RATE__TIME_UNIT:
                return getTimeUnit();
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
            case Shr5managementPackage.TRAINING_RATE__FROM:
                setFrom((Integer)newValue);
                return;
            case Shr5managementPackage.TRAINING_RATE__TO:
                setTo((Integer)newValue);
                return;
            case Shr5managementPackage.TRAINING_RATE__FACTOR:
                setFactor((Integer)newValue);
                return;
            case Shr5managementPackage.TRAINING_RATE__TIME_UNIT:
                setTimeUnit((TimeUnits)newValue);
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
            case Shr5managementPackage.TRAINING_RATE__FROM:
                setFrom(FROM_EDEFAULT);
                return;
            case Shr5managementPackage.TRAINING_RATE__TO:
                setTo(TO_EDEFAULT);
                return;
            case Shr5managementPackage.TRAINING_RATE__FACTOR:
                setFactor(FACTOR_EDEFAULT);
                return;
            case Shr5managementPackage.TRAINING_RATE__TIME_UNIT:
                setTimeUnit(TIME_UNIT_EDEFAULT);
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
            case Shr5managementPackage.TRAINING_RATE__FROM:
                return from != FROM_EDEFAULT;
            case Shr5managementPackage.TRAINING_RATE__TO:
                return to != TO_EDEFAULT;
            case Shr5managementPackage.TRAINING_RATE__FACTOR:
                return factor != FACTOR_EDEFAULT;
            case Shr5managementPackage.TRAINING_RATE__TIME_UNIT:
                return timeUnit != TIME_UNIT_EDEFAULT;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (from: ");
        result.append(from);
        result.append(", to: ");
        result.append(to);
        result.append(", factor: ");
        result.append(factor);
        result.append(", timeUnit: ");
        result.append(timeUnit);
        result.append(')');
        return result.toString();
    }

} //TrainingRateImpl
