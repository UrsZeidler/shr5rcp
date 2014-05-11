/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.Commlink;
import de.urszeidler.eclipse.shr5.InterfaceModus;
import de.urszeidler.eclipse.shr5.MatixConditionMonitor;
import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.Program;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comlink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl#getMatrixZustandMax <em>Matrix Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl#getGeraetestufe <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl#getFirewall <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl#getCurrentModus <em>Current Modus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl#getDeviceRating <em>Device Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl#getRunningProgramms <em>Running Programms</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl#getStroredProgramm <em>Strored Programm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommlinkImpl extends AbstraktGegenstandImpl implements Commlink {
    /**
     * The default value of the '{@link #getMatrixZustandMax() <em>Matrix Zustand Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatrixZustandMax()
     * @generated
     * @ordered
     */
    protected static final int MATRIX_ZUSTAND_MAX_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getGeraetestufe() <em>Geraetestufe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeraetestufe()
     * @generated
     * @ordered
     */
    protected static final int GERAETESTUFE_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getFirewall() <em>Firewall</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirewall()
     * @generated
     * @ordered
     */
    protected static final int FIREWALL_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getDatenverarbeitung() <em>Datenverarbeitung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatenverarbeitung()
     * @generated
     * @ordered
     */
    protected static final int DATENVERARBEITUNG_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getCurrentModus() <em>Current Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentModus()
     * @generated
     * @ordered
     */
    protected static final InterfaceModus CURRENT_MODUS_EDEFAULT = InterfaceModus.AUGMENTED_REALITY;

    /**
     * The cached value of the '{@link #getCurrentModus() <em>Current Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentModus()
     * @generated
     * @ordered
     */
    protected InterfaceModus currentModus = CURRENT_MODUS_EDEFAULT;

    /**
     * The default value of the '{@link #getDeviceRating() <em>Device Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeviceRating()
     * @generated
     * @ordered
     */
    protected static final int DEVICE_RATING_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDeviceRating() <em>Device Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeviceRating()
     * @generated
     * @ordered
     */
    protected int deviceRating = DEVICE_RATING_EDEFAULT;

    /**
     * The cached value of the '{@link #getRunningProgramms() <em>Running Programms</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRunningProgramms()
     * @generated
     * @ordered
     */
    protected EList<Program> runningProgramms;

    /**
     * The cached value of the '{@link #getStroredProgramm() <em>Strored Programm</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStroredProgramm()
     * @generated
     * @ordered
     */
    protected EList<Program> stroredProgramm;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommlinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.COMMLINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getMatrixZustandMax() {
        int value = (int)Math.ceil(getDeviceRating() / 2.0D);
        return 8 + value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getGeraetestufe() {
        return deviceRating + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_DEVICE__GERAETESTUFE, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getFirewall() {
        return deviceRating + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_DEVICE__FIREWALL, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getDatenverarbeitung() {
        return deviceRating + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_DEVICE__DATENVERARBEITUNG, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterfaceModus getCurrentModus() {
        return currentModus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCurrentModus(InterfaceModus newCurrentModus) {
        InterfaceModus oldCurrentModus = currentModus;
        currentModus = newCurrentModus == null ? CURRENT_MODUS_EDEFAULT : newCurrentModus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.COMMLINK__CURRENT_MODUS, oldCurrentModus, currentModus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDeviceRating() {
        return deviceRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeviceRating(int newDeviceRating) {
        int oldDeviceRating = deviceRating;
        deviceRating = newDeviceRating;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.COMMLINK__DEVICE_RATING, oldDeviceRating, deviceRating));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Program> getRunningProgramms() {
        if (runningProgramms == null) {
            runningProgramms = new EObjectResolvingEList<Program>(Program.class, this, Shr5Package.COMMLINK__RUNNING_PROGRAMMS);
        }
        return runningProgramms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Program> getStroredProgramm() {
        if (stroredProgramm == null) {
            stroredProgramm = new EObjectContainmentEList<Program>(Program.class, this, Shr5Package.COMMLINK__STRORED_PROGRAMM);
        }
        return stroredProgramm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.COMMLINK__STRORED_PROGRAMM:
                return ((InternalEList<?>)getStroredProgramm()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.COMMLINK__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax();
            case Shr5Package.COMMLINK__GERAETESTUFE:
                return getGeraetestufe();
            case Shr5Package.COMMLINK__FIREWALL:
                return getFirewall();
            case Shr5Package.COMMLINK__DATENVERARBEITUNG:
                return getDatenverarbeitung();
            case Shr5Package.COMMLINK__CURRENT_MODUS:
                return getCurrentModus();
            case Shr5Package.COMMLINK__DEVICE_RATING:
                return getDeviceRating();
            case Shr5Package.COMMLINK__RUNNING_PROGRAMMS:
                return getRunningProgramms();
            case Shr5Package.COMMLINK__STRORED_PROGRAMM:
                return getStroredProgramm();
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
            case Shr5Package.COMMLINK__CURRENT_MODUS:
                setCurrentModus((InterfaceModus)newValue);
                return;
            case Shr5Package.COMMLINK__DEVICE_RATING:
                setDeviceRating((Integer)newValue);
                return;
            case Shr5Package.COMMLINK__RUNNING_PROGRAMMS:
                getRunningProgramms().clear();
                getRunningProgramms().addAll((Collection<? extends Program>)newValue);
                return;
            case Shr5Package.COMMLINK__STRORED_PROGRAMM:
                getStroredProgramm().clear();
                getStroredProgramm().addAll((Collection<? extends Program>)newValue);
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
            case Shr5Package.COMMLINK__CURRENT_MODUS:
                setCurrentModus(CURRENT_MODUS_EDEFAULT);
                return;
            case Shr5Package.COMMLINK__DEVICE_RATING:
                setDeviceRating(DEVICE_RATING_EDEFAULT);
                return;
            case Shr5Package.COMMLINK__RUNNING_PROGRAMMS:
                getRunningProgramms().clear();
                return;
            case Shr5Package.COMMLINK__STRORED_PROGRAMM:
                getStroredProgramm().clear();
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
            case Shr5Package.COMMLINK__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax() != MATRIX_ZUSTAND_MAX_EDEFAULT;
            case Shr5Package.COMMLINK__GERAETESTUFE:
                return getGeraetestufe() != GERAETESTUFE_EDEFAULT;
            case Shr5Package.COMMLINK__FIREWALL:
                return getFirewall() != FIREWALL_EDEFAULT;
            case Shr5Package.COMMLINK__DATENVERARBEITUNG:
                return getDatenverarbeitung() != DATENVERARBEITUNG_EDEFAULT;
            case Shr5Package.COMMLINK__CURRENT_MODUS:
                return currentModus != CURRENT_MODUS_EDEFAULT;
            case Shr5Package.COMMLINK__DEVICE_RATING:
                return deviceRating != DEVICE_RATING_EDEFAULT;
            case Shr5Package.COMMLINK__RUNNING_PROGRAMMS:
                return runningProgramms != null && !runningProgramms.isEmpty();
            case Shr5Package.COMMLINK__STRORED_PROGRAMM:
                return stroredProgramm != null && !stroredProgramm.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == MatixConditionMonitor.class) {
            switch (derivedFeatureID) {
                case Shr5Package.COMMLINK__MATRIX_ZUSTAND_MAX: return Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX;
                default: return -1;
            }
        }
        if (baseClass == MatrixDevice.class) {
            switch (derivedFeatureID) {
                case Shr5Package.COMMLINK__GERAETESTUFE: return Shr5Package.MATRIX_DEVICE__GERAETESTUFE;
                case Shr5Package.COMMLINK__FIREWALL: return Shr5Package.MATRIX_DEVICE__FIREWALL;
                case Shr5Package.COMMLINK__DATENVERARBEITUNG: return Shr5Package.MATRIX_DEVICE__DATENVERARBEITUNG;
                case Shr5Package.COMMLINK__CURRENT_MODUS: return Shr5Package.MATRIX_DEVICE__CURRENT_MODUS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == MatixConditionMonitor.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX: return Shr5Package.COMMLINK__MATRIX_ZUSTAND_MAX;
                default: return -1;
            }
        }
        if (baseClass == MatrixDevice.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATRIX_DEVICE__GERAETESTUFE: return Shr5Package.COMMLINK__GERAETESTUFE;
                case Shr5Package.MATRIX_DEVICE__FIREWALL: return Shr5Package.COMMLINK__FIREWALL;
                case Shr5Package.MATRIX_DEVICE__DATENVERARBEITUNG: return Shr5Package.COMMLINK__DATENVERARBEITUNG;
                case Shr5Package.MATRIX_DEVICE__CURRENT_MODUS: return Shr5Package.COMMLINK__CURRENT_MODUS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (currentModus: ");
        result.append(currentModus);
        result.append(", deviceRating: ");
        result.append(deviceRating);
        result.append(')');
        return result.toString();
    }

} // ComlinkImpl
