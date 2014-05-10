/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.ActiveMatixDevice;
import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.Program;
import de.urszeidler.eclipse.shr5.Shr5Package;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyberdeck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAngriff <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getSchleicher <em>Schleicher</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getProgramSlots <em>Program Slots</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getRunningProgramms <em>Running Programms</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getStroredProgramm <em>Strored Programm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CyberdeckImpl extends ComlinkImpl implements Cyberdeck {
    /**
     * The default value of the '{@link #getAngriff() <em>Angriff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngriff()
     * @generated
     * @ordered
     */
    protected static final int ANGRIFF_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getSchleicher() <em>Schleicher</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchleicher()
     * @generated
     * @ordered
     */
    protected static final int SCHLEICHER_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getProgramSlots() <em>Program Slots</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProgramSlots()
     * @generated
     * @ordered
     */
    protected static final int PROGRAM_SLOTS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getProgramSlots() <em>Program Slots</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProgramSlots()
     * @generated
     * @ordered
     */
    protected int programSlots = PROGRAM_SLOTS_EDEFAULT;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Integer> attributes;

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
    protected CyberdeckImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.CYBERDECK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getAngriff() {
        return getAttributes().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getSchleicher() {
        return getAttributes().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getProgramSlots() {
        return programSlots;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProgramSlots(int newProgramSlots) {
        int oldProgramSlots = programSlots;
        programSlots = newProgramSlots;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERDECK__PROGRAM_SLOTS, oldProgramSlots, programSlots));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Integer> getAttributes() {
        if (attributes == null) {
            attributes = new EDataTypeUniqueEList<Integer>(Integer.class, this, Shr5Package.CYBERDECK__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Program> getRunningProgramms() {
        if (runningProgramms == null) {
            runningProgramms = new EObjectResolvingEList<Program>(Program.class, this, Shr5Package.CYBERDECK__RUNNING_PROGRAMMS);
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
            stroredProgramm = new EObjectContainmentEList<Program>(Program.class, this, Shr5Package.CYBERDECK__STRORED_PROGRAMM);
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
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
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
            case Shr5Package.CYBERDECK__ANGRIFF:
                return getAngriff();
            case Shr5Package.CYBERDECK__SCHLEICHER:
                return getSchleicher();
            case Shr5Package.CYBERDECK__PROGRAM_SLOTS:
                return getProgramSlots();
            case Shr5Package.CYBERDECK__ATTRIBUTES:
                return getAttributes();
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMMS:
                return getRunningProgramms();
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
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
            case Shr5Package.CYBERDECK__PROGRAM_SLOTS:
                setProgramSlots((Integer)newValue);
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Integer>)newValue);
                return;
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMMS:
                getRunningProgramms().clear();
                getRunningProgramms().addAll((Collection<? extends Program>)newValue);
                return;
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
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
            case Shr5Package.CYBERDECK__PROGRAM_SLOTS:
                setProgramSlots(PROGRAM_SLOTS_EDEFAULT);
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTES:
                getAttributes().clear();
                return;
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMMS:
                getRunningProgramms().clear();
                return;
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
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
            case Shr5Package.CYBERDECK__ANGRIFF:
                return getAngriff() != ANGRIFF_EDEFAULT;
            case Shr5Package.CYBERDECK__SCHLEICHER:
                return getSchleicher() != SCHLEICHER_EDEFAULT;
            case Shr5Package.CYBERDECK__PROGRAM_SLOTS:
                return programSlots != PROGRAM_SLOTS_EDEFAULT;
            case Shr5Package.CYBERDECK__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMMS:
                return runningProgramms != null && !runningProgramms.isEmpty();
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
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
        if (baseClass == ActiveMatixDevice.class) {
            switch (derivedFeatureID) {
                case Shr5Package.CYBERDECK__ANGRIFF: return Shr5Package.ACTIVE_MATIX_DEVICE__ANGRIFF;
                case Shr5Package.CYBERDECK__SCHLEICHER: return Shr5Package.ACTIVE_MATIX_DEVICE__SCHLEICHER;
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
        if (baseClass == ActiveMatixDevice.class) {
            switch (baseFeatureID) {
                case Shr5Package.ACTIVE_MATIX_DEVICE__ANGRIFF: return Shr5Package.CYBERDECK__ANGRIFF;
                case Shr5Package.ACTIVE_MATIX_DEVICE__SCHLEICHER: return Shr5Package.CYBERDECK__SCHLEICHER;
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
        result.append(" (programSlots: ");
        result.append(programSlots);
        result.append(", attributes: ");
        result.append(attributes);
        result.append(')');
        return result.toString();
    }

} //CyberdeckImpl
