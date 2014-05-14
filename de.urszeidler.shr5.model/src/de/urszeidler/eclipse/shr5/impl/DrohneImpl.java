/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;
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

import de.urszeidler.eclipse.shr5.Drohne;
import de.urszeidler.eclipse.shr5.InterfaceModus;
import de.urszeidler.eclipse.shr5.MatixConditionMonitor;
import de.urszeidler.eclipse.shr5.MatrixAttributes;
import de.urszeidler.eclipse.shr5.RiggerProgram;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drohne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl#getMatrixZustandMax <em>Matrix Zustand Max</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl#getGeraetestufe <em>Geraetestufe</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl#getFirewall <em>Firewall</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl#getCurrentModus <em>Current Modus</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl#getProgramSlotCount <em>Program Slot Count</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl#getRunningPrograms <em>Running Programs</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl#getStoredPrograms <em>Stored Programs</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DrohneImpl extends FahrzeugImpl implements Drohne {
    /**
     * The default value of the '{@link #getMatrixZustandMax() <em>Matrix Zustand Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getMatrixZustandMax()
     * @generated
     * @ordered
     */
    protected static final int MATRIX_ZUSTAND_MAX_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getGeraetestufe() <em>Geraetestufe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getGeraetestufe()
     * @generated
     * @ordered
     */
    protected static final int GERAETESTUFE_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getFirewall() <em>Firewall</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getFirewall()
     * @generated
     * @ordered
     */
    protected static final int FIREWALL_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getDatenverarbeitung() <em>Datenverarbeitung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDatenverarbeitung()
     * @generated
     * @ordered
     */
    protected static final int DATENVERARBEITUNG_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getCurrentModus() <em>Current Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getCurrentModus()
     * @generated
     * @ordered
     */
    protected static final InterfaceModus CURRENT_MODUS_EDEFAULT = InterfaceModus.AUGMENTED_REALITY;
    /**
     * The cached value of the '{@link #getCurrentModus() <em>Current Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getCurrentModus()
     * @generated
     * @ordered
     */
    protected InterfaceModus currentModus = CURRENT_MODUS_EDEFAULT;
    /**
     * The default value of the '{@link #getProgramSlotCount() <em>Program Slot Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getProgramSlotCount()
     * @generated
     * @ordered
     */
    protected static final int PROGRAM_SLOT_COUNT_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getRunningPrograms() <em>Running Programs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getRunningPrograms()
     * @generated
     * @ordered
     */
    protected EList<RiggerProgram> runningPrograms;
    /**
     * The cached value of the '{@link #getStoredPrograms() <em>Stored Programs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getStoredPrograms()
     * @generated
     * @ordered
     */
    protected EList<RiggerProgram> storedPrograms;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DrohneImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.DROHNE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getMatrixZustandMax() {
        int value = (int)Math.ceil(getGeraetestufe() / 2.0D);
        return 8 + value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getGeraetestufe() {
        return getPilot();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getFirewall() {
        return getGeraetestufe() + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getDatenverarbeitung() {
        return getGeraetestufe() + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public InterfaceModus getCurrentModus() {
        return currentModus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setCurrentModus(InterfaceModus newCurrentModus) {
        InterfaceModus oldCurrentModus = currentModus;
        currentModus = newCurrentModus == null ? CURRENT_MODUS_EDEFAULT : newCurrentModus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.DROHNE__CURRENT_MODUS, oldCurrentModus, currentModus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getProgramSlotCount() {
        int value = getGeraetestufe() / 2;
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<RiggerProgram> getRunningPrograms() {
        if (runningPrograms == null) {
            runningPrograms = new EObjectResolvingEList<RiggerProgram>(RiggerProgram.class, this, Shr5Package.DROHNE__RUNNING_PROGRAMS);
        }
        return runningPrograms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<RiggerProgram> getStoredPrograms() {
        if (storedPrograms == null) {
            storedPrograms = new EObjectContainmentEList<RiggerProgram>(RiggerProgram.class, this, Shr5Package.DROHNE__STORED_PROGRAMS);
        }
        return storedPrograms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.DROHNE__STORED_PROGRAMS:
                return ((InternalEList<?>)getStoredPrograms()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.DROHNE__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax();
            case Shr5Package.DROHNE__GERAETESTUFE:
                return getGeraetestufe();
            case Shr5Package.DROHNE__FIREWALL:
                return getFirewall();
            case Shr5Package.DROHNE__DATENVERARBEITUNG:
                return getDatenverarbeitung();
            case Shr5Package.DROHNE__CURRENT_MODUS:
                return getCurrentModus();
            case Shr5Package.DROHNE__PROGRAM_SLOT_COUNT:
                return getProgramSlotCount();
            case Shr5Package.DROHNE__RUNNING_PROGRAMS:
                return getRunningPrograms();
            case Shr5Package.DROHNE__STORED_PROGRAMS:
                return getStoredPrograms();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5Package.DROHNE__CURRENT_MODUS:
                setCurrentModus((InterfaceModus)newValue);
                return;
            case Shr5Package.DROHNE__RUNNING_PROGRAMS:
                getRunningPrograms().clear();
                getRunningPrograms().addAll((Collection<? extends RiggerProgram>)newValue);
                return;
            case Shr5Package.DROHNE__STORED_PROGRAMS:
                getStoredPrograms().clear();
                getStoredPrograms().addAll((Collection<? extends RiggerProgram>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5Package.DROHNE__CURRENT_MODUS:
                setCurrentModus(CURRENT_MODUS_EDEFAULT);
                return;
            case Shr5Package.DROHNE__RUNNING_PROGRAMS:
                getRunningPrograms().clear();
                return;
            case Shr5Package.DROHNE__STORED_PROGRAMS:
                getStoredPrograms().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5Package.DROHNE__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax() != MATRIX_ZUSTAND_MAX_EDEFAULT;
            case Shr5Package.DROHNE__GERAETESTUFE:
                return getGeraetestufe() != GERAETESTUFE_EDEFAULT;
            case Shr5Package.DROHNE__FIREWALL:
                return getFirewall() != FIREWALL_EDEFAULT;
            case Shr5Package.DROHNE__DATENVERARBEITUNG:
                return getDatenverarbeitung() != DATENVERARBEITUNG_EDEFAULT;
            case Shr5Package.DROHNE__CURRENT_MODUS:
                return currentModus != CURRENT_MODUS_EDEFAULT;
            case Shr5Package.DROHNE__PROGRAM_SLOT_COUNT:
                return getProgramSlotCount() != PROGRAM_SLOT_COUNT_EDEFAULT;
            case Shr5Package.DROHNE__RUNNING_PROGRAMS:
                return runningPrograms != null && !runningPrograms.isEmpty();
            case Shr5Package.DROHNE__STORED_PROGRAMS:
                return storedPrograms != null && !storedPrograms.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == MatixConditionMonitor.class) {
            switch (derivedFeatureID) {
                case Shr5Package.DROHNE__MATRIX_ZUSTAND_MAX:
                    return Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX;
                default:
                    return -1;
            }
        }
        if (baseClass == MatrixAttributes.class) {
            switch (derivedFeatureID) {
                case Shr5Package.DROHNE__GERAETESTUFE:
                    return Shr5Package.MATRIX_ATTRIBUTES__GERAETESTUFE;
                case Shr5Package.DROHNE__FIREWALL:
                    return Shr5Package.MATRIX_ATTRIBUTES__FIREWALL;
                case Shr5Package.DROHNE__DATENVERARBEITUNG:
                    return Shr5Package.MATRIX_ATTRIBUTES__DATENVERARBEITUNG;
                case Shr5Package.DROHNE__CURRENT_MODUS:
                    return Shr5Package.MATRIX_ATTRIBUTES__CURRENT_MODUS;
                default:
                    return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == MatixConditionMonitor.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX:
                    return Shr5Package.DROHNE__MATRIX_ZUSTAND_MAX;
                default:
                    return -1;
            }
        }
        if (baseClass == MatrixAttributes.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATRIX_ATTRIBUTES__GERAETESTUFE:
                    return Shr5Package.DROHNE__GERAETESTUFE;
                case Shr5Package.MATRIX_ATTRIBUTES__FIREWALL:
                    return Shr5Package.DROHNE__FIREWALL;
                case Shr5Package.MATRIX_ATTRIBUTES__DATENVERARBEITUNG:
                    return Shr5Package.DROHNE__DATENVERARBEITUNG;
                case Shr5Package.MATRIX_ATTRIBUTES__CURRENT_MODUS:
                    return Shr5Package.DROHNE__CURRENT_MODUS;
                default:
                    return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (currentModus: ");
        result.append(currentModus);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getZustandMax() {
        return 6 + (getRumpf() / 2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public BigDecimal getWert() {
        BigDecimal wert = super.getWert();
        BigDecimal calcListenWert = ShadowrunTools.calcListenWert(getStoredPrograms());

        if (wert == null)
            return calcListenWert;

        return wert.add(calcListenWert);
    }

} // DrohneImpl
