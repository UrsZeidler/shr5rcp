/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

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
import de.urszeidler.eclipse.shr5.ActiveMatixDevice;
import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.InterfaceModus;
import de.urszeidler.eclipse.shr5.MatixConditionMonitor;
import de.urszeidler.eclipse.shr5.MatrixAttributes;
import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.MatrixProgram;
import de.urszeidler.eclipse.shr5.PersonalAreaNetwork;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyberdeck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getMatrixZustandMax <em>Matrix Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getGeraetestufe <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getFirewall <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getCurrentModus <em>Current Modus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getDeviceRating <em>Device Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAngriff <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getSchleicher <em>Schleicher</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getProgramSlots <em>Program Slots</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getStoredPrograms <em>Stored Programs</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl#getRunningPrograms <em>Running Programs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CyberdeckImpl extends AbstraktGegenstandImpl implements Cyberdeck {
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
     * The cached value of the '{@link #getPan() <em>Pan</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPan()
     * @generated
     * @ordered
     */
    protected PersonalAreaNetwork pan;

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
     * The cached value of the '{@link #getStoredPrograms() <em>Stored Programs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStoredPrograms()
     * @generated
     * @ordered
     */
    protected EList<MatrixProgram> storedPrograms;

    /**
     * The cached value of the '{@link #getRunningPrograms() <em>Running Programs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRunningPrograms()
     * @generated
     * @ordered
     */
    protected EList<MatrixProgram> runningPrograms;

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
        return getDeviceRating() + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_ATTRIBUTES__GERAETESTUFE, getMods());
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
            return value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL, getMods());            
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
            return value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG, getMods());            
        }
        return -1;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERDECK__CURRENT_MODUS, oldCurrentModus, currentModus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersonalAreaNetwork getPan() {
        return pan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPan(PersonalAreaNetwork newPan, NotificationChain msgs) {
        PersonalAreaNetwork oldPan = pan;
        pan = newPan;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERDECK__PAN, oldPan, newPan);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPan(PersonalAreaNetwork newPan) {
        if (newPan != pan) {
            NotificationChain msgs = null;
            if (pan != null)
                msgs = ((InternalEObject)pan).eInverseRemove(this, Shr5Package.PERSONAL_AREA_NETWORK__MASTER, PersonalAreaNetwork.class, msgs);
            if (newPan != null)
                msgs = ((InternalEObject)newPan).eInverseAdd(this, Shr5Package.PERSONAL_AREA_NETWORK__MASTER, PersonalAreaNetwork.class, msgs);
            msgs = basicSetPan(newPan, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERDECK__PAN, newPan, newPan));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERDECK__DEVICE_RATING, oldDeviceRating, deviceRating));
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
    public EList<MatrixProgram> getStoredPrograms() {
        if (storedPrograms == null) {
            storedPrograms = new EObjectContainmentEList<MatrixProgram>(MatrixProgram.class, this, Shr5Package.CYBERDECK__STORED_PROGRAMS);
        }
        return storedPrograms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MatrixProgram> getRunningPrograms() {
        if (runningPrograms == null) {
            runningPrograms = new EObjectResolvingEList<MatrixProgram>(MatrixProgram.class, this, Shr5Package.CYBERDECK__RUNNING_PROGRAMS);
        }
        return runningPrograms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.CYBERDECK__PAN:
                if (pan != null)
                    msgs = ((InternalEObject)pan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.CYBERDECK__PAN, null, msgs);
                return basicSetPan((PersonalAreaNetwork)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.CYBERDECK__PAN:
                return basicSetPan(null, msgs);
            case Shr5Package.CYBERDECK__STORED_PROGRAMS:
                return ((InternalEList<?>)getStoredPrograms()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.CYBERDECK__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax();
            case Shr5Package.CYBERDECK__GERAETESTUFE:
                return getGeraetestufe();
            case Shr5Package.CYBERDECK__FIREWALL:
                return getFirewall();
            case Shr5Package.CYBERDECK__DATENVERARBEITUNG:
                return getDatenverarbeitung();
            case Shr5Package.CYBERDECK__CURRENT_MODUS:
                return getCurrentModus();
            case Shr5Package.CYBERDECK__PAN:
                return getPan();
            case Shr5Package.CYBERDECK__DEVICE_RATING:
                return getDeviceRating();
            case Shr5Package.CYBERDECK__ANGRIFF:
                return getAngriff();
            case Shr5Package.CYBERDECK__SCHLEICHER:
                return getSchleicher();
            case Shr5Package.CYBERDECK__PROGRAM_SLOTS:
                return getProgramSlots();
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
            case Shr5Package.CYBERDECK__STORED_PROGRAMS:
                return getStoredPrograms();
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMS:
                return getRunningPrograms();
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
            case Shr5Package.CYBERDECK__CURRENT_MODUS:
                setCurrentModus((InterfaceModus)newValue);
                return;
            case Shr5Package.CYBERDECK__PAN:
                setPan((PersonalAreaNetwork)newValue);
                return;
            case Shr5Package.CYBERDECK__DEVICE_RATING:
                setDeviceRating((Integer)newValue);
                return;
            case Shr5Package.CYBERDECK__PROGRAM_SLOTS:
                setProgramSlots((Integer)newValue);
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
            case Shr5Package.CYBERDECK__STORED_PROGRAMS:
                getStoredPrograms().clear();
                getStoredPrograms().addAll((Collection<? extends MatrixProgram>)newValue);
                return;
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMS:
                getRunningPrograms().clear();
                getRunningPrograms().addAll((Collection<? extends MatrixProgram>)newValue);
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
            case Shr5Package.CYBERDECK__CURRENT_MODUS:
                setCurrentModus(CURRENT_MODUS_EDEFAULT);
                return;
            case Shr5Package.CYBERDECK__PAN:
                setPan((PersonalAreaNetwork)null);
                return;
            case Shr5Package.CYBERDECK__DEVICE_RATING:
                setDeviceRating(DEVICE_RATING_EDEFAULT);
                return;
            case Shr5Package.CYBERDECK__PROGRAM_SLOTS:
                setProgramSlots(PROGRAM_SLOTS_EDEFAULT);
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
            case Shr5Package.CYBERDECK__STORED_PROGRAMS:
                getStoredPrograms().clear();
                return;
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMS:
                getRunningPrograms().clear();
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
            case Shr5Package.CYBERDECK__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax() != MATRIX_ZUSTAND_MAX_EDEFAULT;
            case Shr5Package.CYBERDECK__GERAETESTUFE:
                return getGeraetestufe() != GERAETESTUFE_EDEFAULT;
            case Shr5Package.CYBERDECK__FIREWALL:
                return getFirewall() != FIREWALL_EDEFAULT;
            case Shr5Package.CYBERDECK__DATENVERARBEITUNG:
                return getDatenverarbeitung() != DATENVERARBEITUNG_EDEFAULT;
            case Shr5Package.CYBERDECK__CURRENT_MODUS:
                return currentModus != CURRENT_MODUS_EDEFAULT;
            case Shr5Package.CYBERDECK__PAN:
                return pan != null;
            case Shr5Package.CYBERDECK__DEVICE_RATING:
                return deviceRating != DEVICE_RATING_EDEFAULT;
            case Shr5Package.CYBERDECK__ANGRIFF:
                return getAngriff() != ANGRIFF_EDEFAULT;
            case Shr5Package.CYBERDECK__SCHLEICHER:
                return getSchleicher() != SCHLEICHER_EDEFAULT;
            case Shr5Package.CYBERDECK__PROGRAM_SLOTS:
                return programSlots != PROGRAM_SLOTS_EDEFAULT;
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
            case Shr5Package.CYBERDECK__STORED_PROGRAMS:
                return storedPrograms != null && !storedPrograms.isEmpty();
            case Shr5Package.CYBERDECK__RUNNING_PROGRAMS:
                return runningPrograms != null && !runningPrograms.isEmpty();
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
                case Shr5Package.CYBERDECK__MATRIX_ZUSTAND_MAX: return Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX;
                default: return -1;
            }
        }
        if (baseClass == MatrixAttributes.class) {
            switch (derivedFeatureID) {
                case Shr5Package.CYBERDECK__GERAETESTUFE: return Shr5Package.MATRIX_ATTRIBUTES__GERAETESTUFE;
                case Shr5Package.CYBERDECK__FIREWALL: return Shr5Package.MATRIX_ATTRIBUTES__FIREWALL;
                case Shr5Package.CYBERDECK__DATENVERARBEITUNG: return Shr5Package.MATRIX_ATTRIBUTES__DATENVERARBEITUNG;
                case Shr5Package.CYBERDECK__CURRENT_MODUS: return Shr5Package.MATRIX_ATTRIBUTES__CURRENT_MODUS;
                default: return -1;
            }
        }
        if (baseClass == MatrixDevice.class) {
            switch (derivedFeatureID) {
                case Shr5Package.CYBERDECK__PAN: return Shr5Package.MATRIX_DEVICE__PAN;
                default: return -1;
            }
        }
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
        if (baseClass == MatixConditionMonitor.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX: return Shr5Package.CYBERDECK__MATRIX_ZUSTAND_MAX;
                default: return -1;
            }
        }
        if (baseClass == MatrixAttributes.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATRIX_ATTRIBUTES__GERAETESTUFE: return Shr5Package.CYBERDECK__GERAETESTUFE;
                case Shr5Package.MATRIX_ATTRIBUTES__FIREWALL: return Shr5Package.CYBERDECK__FIREWALL;
                case Shr5Package.MATRIX_ATTRIBUTES__DATENVERARBEITUNG: return Shr5Package.CYBERDECK__DATENVERARBEITUNG;
                case Shr5Package.MATRIX_ATTRIBUTES__CURRENT_MODUS: return Shr5Package.CYBERDECK__CURRENT_MODUS;
                default: return -1;
            }
        }
        if (baseClass == MatrixDevice.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATRIX_DEVICE__PAN: return Shr5Package.CYBERDECK__PAN;
                default: return -1;
            }
        }
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
        result.append(" (currentModus: ");
        result.append(currentModus);
        result.append(", deviceRating: ");
        result.append(deviceRating);
        result.append(", programSlots: ");
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
