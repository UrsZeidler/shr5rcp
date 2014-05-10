/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.ActiveMatixDevice;
import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.Program;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getRunningProgramms <em>Running Programms</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getStroredProgramm <em>Strored Programm</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CyberdeckImpl extends CommlinkImpl implements Cyberdeck {
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
     * The default value of the '{@link #getAttribute1() <em>Attribute1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute1()
     * @generated
     * @ordered
     */
    protected static final int ATTRIBUTE1_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getAttribute1() <em>Attribute1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute1()
     * @generated
     * @ordered
     */
    protected int attribute1 = ATTRIBUTE1_EDEFAULT;

    /**
     * The default value of the '{@link #getAttribute2() <em>Attribute2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute2()
     * @generated
     * @ordered
     */
    protected static final int ATTRIBUTE2_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getAttribute2() <em>Attribute2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute2()
     * @generated
     * @ordered
     */
    protected int attribute2 = ATTRIBUTE2_EDEFAULT;

    /**
     * The default value of the '{@link #getAttribute3() <em>Attribute3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute3()
     * @generated
     * @ordered
     */
    protected static final int ATTRIBUTE3_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getAttribute3() <em>Attribute3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute3()
     * @generated
     * @ordered
     */
    protected int attribute3 = ATTRIBUTE3_EDEFAULT;

    /**
     * The default value of the '{@link #getAttribute4() <em>Attribute4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute4()
     * @generated
     * @ordered
     */
    protected static final int ATTRIBUTE4_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getAttribute4() <em>Attribute4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute4()
     * @generated
     * @ordered
     */
    protected int attribute4 = ATTRIBUTE4_EDEFAULT;

    /**
     * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfiguration()
     * @generated
     * @ordered
     */
    protected EList<EAttribute> configuration;

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
        if(getConfiguration().isEmpty())
            initDefaultConfiguration();
        
        EAttribute eAttribute = configuration.get(3);
        Object eGet = eGet(eAttribute);
        if (eGet instanceof Integer) {
            Integer value = (Integer)eGet;
            return value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.ACTIVE_MATIX_DEVICE__ANGRIFF, getMods());            
        }
        return -1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getSchleicher() {
        if(getConfiguration().isEmpty())
            initDefaultConfiguration();
        
        EAttribute eAttribute = configuration.get(2);
        Object eGet = eGet(eAttribute);
        if (eGet instanceof Integer) {
            Integer value = (Integer)eGet;
            return value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.ACTIVE_MATIX_DEVICE__SCHLEICHER, getMods());            
        }
        return -1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getFirewall() {
        if(getConfiguration().isEmpty())
            initDefaultConfiguration();
        
        EAttribute eAttribute = configuration.get(0);
        Object eGet = eGet(eAttribute);
        if (eGet instanceof Integer) {
            Integer value = (Integer)eGet;
            return value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_DEVICE__FIREWALL, getMods());            
        }
        return -1;
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getDatenverarbeitung() {
        if(getConfiguration().isEmpty())
            initDefaultConfiguration();
        
        EAttribute eAttribute = configuration.get(1);
        Object eGet = eGet(eAttribute);
        if (eGet instanceof Integer) {
            Integer value = (Integer)eGet;
            return value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_DEVICE__DATENVERARBEITUNG, getMods());            
        }
        return -1;
    }

    private void initDefaultConfiguration() {
        configuration.add(Shr5Package.Literals.CYBERDECK__ATTRIBUTE1);
        configuration.add(Shr5Package.Literals.CYBERDECK__ATTRIBUTE2);
        configuration.add(Shr5Package.Literals.CYBERDECK__ATTRIBUTE3);
        configuration.add(Shr5Package.Literals.CYBERDECK__ATTRIBUTE4);        
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
    public int getAttribute1() {
        return attribute1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute1(int newAttribute1) {
        int oldAttribute1 = attribute1;
        attribute1 = newAttribute1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERDECK__ATTRIBUTE1, oldAttribute1, attribute1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAttribute2() {
        return attribute2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute2(int newAttribute2) {
        int oldAttribute2 = attribute2;
        attribute2 = newAttribute2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERDECK__ATTRIBUTE2, oldAttribute2, attribute2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAttribute3() {
        return attribute3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute3(int newAttribute3) {
        int oldAttribute3 = attribute3;
        attribute3 = newAttribute3;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERDECK__ATTRIBUTE3, oldAttribute3, attribute3));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAttribute4() {
        return attribute4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute4(int newAttribute4) {
        int oldAttribute4 = attribute4;
        attribute4 = newAttribute4;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERDECK__ATTRIBUTE4, oldAttribute4, attribute4));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EAttribute> getConfiguration() {
        if (configuration == null) {
            configuration = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, Shr5Package.CYBERDECK__CONFIGURATION);
        }
        return configuration;
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
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMMS:
                return getRunningProgramms();
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
                return getStroredProgramm();
            case Shr5Package.CYBERDECK__ATTRIBUTE1:
                return getAttribute1();
            case Shr5Package.CYBERDECK__ATTRIBUTE2:
                return getAttribute2();
            case Shr5Package.CYBERDECK__ATTRIBUTE3:
                return getAttribute3();
            case Shr5Package.CYBERDECK__ATTRIBUTE4:
                return getAttribute4();
            case Shr5Package.CYBERDECK__CONFIGURATION:
                return getConfiguration();
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
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMMS:
                getRunningProgramms().clear();
                getRunningProgramms().addAll((Collection<? extends Program>)newValue);
                return;
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
                getStroredProgramm().clear();
                getStroredProgramm().addAll((Collection<? extends Program>)newValue);
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTE1:
                setAttribute1((Integer)newValue);
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTE2:
                setAttribute2((Integer)newValue);
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTE3:
                setAttribute3((Integer)newValue);
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTE4:
                setAttribute4((Integer)newValue);
                return;
            case Shr5Package.CYBERDECK__CONFIGURATION:
                getConfiguration().clear();
                getConfiguration().addAll((Collection<? extends EAttribute>)newValue);
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
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMMS:
                getRunningProgramms().clear();
                return;
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
                getStroredProgramm().clear();
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTE1:
                setAttribute1(ATTRIBUTE1_EDEFAULT);
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTE2:
                setAttribute2(ATTRIBUTE2_EDEFAULT);
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTE3:
                setAttribute3(ATTRIBUTE3_EDEFAULT);
                return;
            case Shr5Package.CYBERDECK__ATTRIBUTE4:
                setAttribute4(ATTRIBUTE4_EDEFAULT);
                return;
            case Shr5Package.CYBERDECK__CONFIGURATION:
                getConfiguration().clear();
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
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMMS:
                return runningProgramms != null && !runningProgramms.isEmpty();
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
                return stroredProgramm != null && !stroredProgramm.isEmpty();
            case Shr5Package.CYBERDECK__ATTRIBUTE1:
                return attribute1 != ATTRIBUTE1_EDEFAULT;
            case Shr5Package.CYBERDECK__ATTRIBUTE2:
                return attribute2 != ATTRIBUTE2_EDEFAULT;
            case Shr5Package.CYBERDECK__ATTRIBUTE3:
                return attribute3 != ATTRIBUTE3_EDEFAULT;
            case Shr5Package.CYBERDECK__ATTRIBUTE4:
                return attribute4 != ATTRIBUTE4_EDEFAULT;
            case Shr5Package.CYBERDECK__CONFIGURATION:
                return configuration != null && !configuration.isEmpty();
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
        result.append(", attribute1: ");
        result.append(attribute1);
        result.append(", attribute2: ");
        result.append(attribute2);
        result.append(", attribute3: ");
        result.append(attribute3);
        result.append(", attribute4: ");
        result.append(attribute4);
        result.append(')');
        return result.toString();
    }

} //CyberdeckImpl
