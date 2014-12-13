/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.MatrixDeviceImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.MatrixDeviceImpl#getMatrixCondition <em>Matrix Condition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.MatrixDeviceImpl#getMarks <em>Marks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrixDeviceImpl<M extends MatrixDevice> extends MinimalEObjectImpl.Container implements de.urszeidler.eclipse.shr5.runtime.MatrixDevice<M> {
    /**
     * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDevice()
     * @generated
     * @ordered
     */
    protected M device;

    /**
     * The default value of the '{@link #getMatrixCondition() <em>Matrix Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatrixCondition()
     * @generated
     * @ordered
     */
    protected static final int MATRIX_CONDITION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMatrixCondition() <em>Matrix Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatrixCondition()
     * @generated
     * @ordered
     */
    protected int matrixCondition = MATRIX_CONDITION_EDEFAULT;

    /**
     * The default value of the '{@link #getMarks() <em>Marks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMarks()
     * @generated
     * @ordered
     */
    protected static final int MARKS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMarks() <em>Marks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMarks()
     * @generated
     * @ordered
     */
    protected int marks = MARKS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MatrixDeviceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.MATRIX_DEVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public M getDevice() {
        if (device != null && device.eIsProxy()) {
            InternalEObject oldDevice = (InternalEObject)device;
            device = (M)eResolveProxy(oldDevice);
            if (device != oldDevice) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.MATRIX_DEVICE__DEVICE, oldDevice, device));
            }
        }
        return device;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public M basicGetDevice() {
        return device;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDevice(M newDevice) {
        M oldDevice = device;
        device = newDevice;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MATRIX_DEVICE__DEVICE, oldDevice, device));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMatrixCondition() {
        return matrixCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMatrixCondition(int newMatrixCondition) {
        int oldMatrixCondition = matrixCondition;
        matrixCondition = newMatrixCondition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MATRIX_DEVICE__MATRIX_CONDITION, oldMatrixCondition, matrixCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMarks() {
        return marks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMarks(int newMarks) {
        int oldMarks = marks;
        marks = newMarks;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MATRIX_DEVICE__MARKS, oldMarks, marks));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RuntimePackage.MATRIX_DEVICE__DEVICE:
                if (resolve) return getDevice();
                return basicGetDevice();
            case RuntimePackage.MATRIX_DEVICE__MATRIX_CONDITION:
                return getMatrixCondition();
            case RuntimePackage.MATRIX_DEVICE__MARKS:
                return getMarks();
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
            case RuntimePackage.MATRIX_DEVICE__DEVICE:
                setDevice((M)newValue);
                return;
            case RuntimePackage.MATRIX_DEVICE__MATRIX_CONDITION:
                setMatrixCondition((Integer)newValue);
                return;
            case RuntimePackage.MATRIX_DEVICE__MARKS:
                setMarks((Integer)newValue);
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
            case RuntimePackage.MATRIX_DEVICE__DEVICE:
                setDevice((M)null);
                return;
            case RuntimePackage.MATRIX_DEVICE__MATRIX_CONDITION:
                setMatrixCondition(MATRIX_CONDITION_EDEFAULT);
                return;
            case RuntimePackage.MATRIX_DEVICE__MARKS:
                setMarks(MARKS_EDEFAULT);
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
            case RuntimePackage.MATRIX_DEVICE__DEVICE:
                return device != null;
            case RuntimePackage.MATRIX_DEVICE__MATRIX_CONDITION:
                return matrixCondition != MATRIX_CONDITION_EDEFAULT;
            case RuntimePackage.MATRIX_DEVICE__MARKS:
                return marks != MARKS_EDEFAULT;
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
        result.append(" (matrixCondition: ");
        result.append(matrixCondition);
        result.append(", marks: ");
        result.append(marks);
        result.append(')');
        return result.toString();
    }

} //MatrixDeviceImpl
