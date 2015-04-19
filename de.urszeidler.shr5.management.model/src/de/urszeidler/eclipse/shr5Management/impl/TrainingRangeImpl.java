/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.TrainingRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingRangeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingRangeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingRangeImpl#getDaysTrained <em>Days Trained</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainingRangeImpl extends MinimalEObjectImpl.Container implements TrainingRange {
    /**
     * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStart()
     * @generated
     * @ordered
     */
    protected static final Date START_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStart()
     * @generated
     * @ordered
     */
    protected Date start = START_EDEFAULT;

    /**
     * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected static final Date END_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected Date end = END_EDEFAULT;

    /**
     * The default value of the '{@link #getDaysTrained() <em>Days Trained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaysTrained()
     * @generated
     * @ordered
     */
    protected static final int DAYS_TRAINED_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TrainingRangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.TRAINING_RANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getStart() {
        return start;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStart(Date newStart) {
        Date oldStart = start;
        start = newStart;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAINING_RANGE__START, oldStart, start));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getEnd() {
        return end;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnd(Date newEnd) {
        Date oldEnd = end;
        end = newEnd;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAINING_RANGE__END, oldEnd, end));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getDaysTrained() {
        if(getStart()==null || getEnd()==null)
            return 0;
        
        Calendar cstart = Calendar.getInstance();
        cstart.setTime(getStart());
        cstart.set(Calendar.MILLISECOND, 0);
        cstart.set(Calendar.SECOND, 0);
        cstart.set(Calendar.MINUTE, 0);
        cstart.set(Calendar.HOUR, 0);
        
        Calendar cend = Calendar.getInstance();
        cend.setTime(getEnd());
        cend.set(Calendar.MILLISECOND, 0);
        cend.set(Calendar.SECOND, 0);
        cend.set(Calendar.MINUTE, 0);
        cend.set(Calendar.HOUR, 0);
        
        long days =Math.max(1+ (cend.getTimeInMillis()- cstart.getTimeInMillis())/(24*3600000),0);
        
        return (int)days;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.TRAINING_RANGE__START:
                return getStart();
            case Shr5managementPackage.TRAINING_RANGE__END:
                return getEnd();
            case Shr5managementPackage.TRAINING_RANGE__DAYS_TRAINED:
                return getDaysTrained();
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
            case Shr5managementPackage.TRAINING_RANGE__START:
                setStart((Date)newValue);
                return;
            case Shr5managementPackage.TRAINING_RANGE__END:
                setEnd((Date)newValue);
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
            case Shr5managementPackage.TRAINING_RANGE__START:
                setStart(START_EDEFAULT);
                return;
            case Shr5managementPackage.TRAINING_RANGE__END:
                setEnd(END_EDEFAULT);
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
            case Shr5managementPackage.TRAINING_RANGE__START:
                return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
            case Shr5managementPackage.TRAINING_RANGE__END:
                return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
            case Shr5managementPackage.TRAINING_RANGE__DAYS_TRAINED:
                return getDaysTrained() != DAYS_TRAINED_EDEFAULT;
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
        result.append(" (start: ");
        result.append(start);
        result.append(", end: ");
        result.append(end);
        result.append(')');
        return result.toString();
    }

} //TrainingRangeImpl
