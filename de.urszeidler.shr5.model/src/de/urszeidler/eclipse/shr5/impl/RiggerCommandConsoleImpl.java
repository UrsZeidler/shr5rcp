/**
 * 2014 Urs Zeidler
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
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.InterfaceModus;
import de.urszeidler.eclipse.shr5.MatixConditionMonitor;
import de.urszeidler.eclipse.shr5.MatrixAttributes;
import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.PersonalAreaNetwork;
import de.urszeidler.eclipse.shr5.RiggerCommandConsole;
import de.urszeidler.eclipse.shr5.RiggerProgram;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rigger Command Console</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getMatrixZustandMax <em>Matrix Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getGeraetestufe <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getFirewall <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getCurrentModus <em>Current Modus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getDeviceRating <em>Device Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getRauschunterdrueckung <em>Rauschunterdrueckung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getZugriff <em>Zugriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getDatenverarbeitungBasis <em>Datenverarbeitung Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getFirewallBasis <em>Firewall Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getZugriffBasis <em>Zugriff Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getStoredPrograms <em>Stored Programs</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getRunningPrograms <em>Running Programs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiggerCommandConsoleImpl extends AbstraktGegenstandImpl implements RiggerCommandConsole {
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
     * The default value of the '{@link #getRauschunterdrueckung() <em>Rauschunterdrueckung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRauschunterdrueckung()
     * @generated
     * @ordered
     */
    protected static final int RAUSCHUNTERDRUECKUNG_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getZugriff() <em>Zugriff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZugriff()
     * @generated
     * @ordered
     */
    protected static final int ZUGRIFF_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getDatenverarbeitungBasis() <em>Datenverarbeitung Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatenverarbeitungBasis()
     * @generated
     * @ordered
     */
    protected static final int DATENVERARBEITUNG_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDatenverarbeitungBasis() <em>Datenverarbeitung Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatenverarbeitungBasis()
     * @generated
     * @ordered
     */
    protected int datenverarbeitungBasis = DATENVERARBEITUNG_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getFirewallBasis() <em>Firewall Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirewallBasis()
     * @generated
     * @ordered
     */
    protected static final int FIREWALL_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFirewallBasis() <em>Firewall Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirewallBasis()
     * @generated
     * @ordered
     */
    protected int firewallBasis = FIREWALL_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getZugriffBasis() <em>Zugriff Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZugriffBasis()
     * @generated
     * @ordered
     */
    protected static final int ZUGRIFF_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getZugriffBasis() <em>Zugriff Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZugriffBasis()
     * @generated
     * @ordered
     */
    protected int zugriffBasis = ZUGRIFF_BASIS_EDEFAULT;

    /**
     * The cached value of the '{@link #getStoredPrograms() <em>Stored Programs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStoredPrograms()
     * @generated
     * @ordered
     */
    protected EList<RiggerProgram> storedPrograms;

    /**
     * The cached value of the '{@link #getRunningPrograms() <em>Running Programs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRunningPrograms()
     * @generated
     * @ordered
     */
    protected EList<RiggerProgram> runningPrograms;

    private EContentAdapter eContentAdapter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected RiggerCommandConsoleImpl() {
        super();
        
        eContentAdapter = new EContentAdapter() {
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                Object feature = notification.getFeature();
                if (Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS.equals(feature))
                    RiggerCommandConsoleImpl.this
                            .eNotify(new ENotificationImpl(RiggerCommandConsoleImpl.this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__WERT, 1, 2));

            }

        };
        eContentAdapter.setTarget(this);
        this.eAdapters().add(eContentAdapter);

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.RIGGER_COMMAND_CONSOLE;
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
    public int getRauschunterdrueckung() {
       int geraetestufe = getGeraetestufe();
       int val = geraetestufe - getZugriffBasis();
       return val +ShadowrunTools.getModificatorValue(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getZugriff() {
        return getZugriffBasis()+ ShadowrunTools.getModificatorValue(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__ZUGRIFF, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getFirewall() {
        return getFirewallBasis() + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getDatenverarbeitung() {
        return getDatenverarbeitungBasis() + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG, getMods());
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__CURRENT_MODUS, oldCurrentModus, currentModus));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__PAN, oldPan, newPan);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__PAN, newPan, newPan));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__DEVICE_RATING, oldDeviceRating, deviceRating));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDatenverarbeitungBasis() {
        return datenverarbeitungBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDatenverarbeitungBasis(int newDatenverarbeitungBasis) {
        int oldDatenverarbeitungBasis = datenverarbeitungBasis;
        datenverarbeitungBasis = newDatenverarbeitungBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS, oldDatenverarbeitungBasis, datenverarbeitungBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getFirewallBasis() {
        return firewallBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFirewallBasis(int newFirewallBasis) {
        int oldFirewallBasis = firewallBasis;
        firewallBasis = newFirewallBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS, oldFirewallBasis, firewallBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getZugriffBasis() {
        return zugriffBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setZugriffBasis(int newZugriffBasis) {
        int oldZugriffBasis = zugriffBasis;
        zugriffBasis = newZugriffBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS, oldZugriffBasis, zugriffBasis));
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG, oldZugriffBasis, zugriffBasis));
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF, oldZugriffBasis, zugriffBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RiggerProgram> getStoredPrograms() {
        if (storedPrograms == null) {
            storedPrograms = new EObjectContainmentEList<RiggerProgram>(RiggerProgram.class, this, Shr5Package.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS);
        }
        return storedPrograms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RiggerProgram> getRunningPrograms() {
        if (runningPrograms == null) {
            runningPrograms = new EObjectResolvingEList<RiggerProgram>(RiggerProgram.class, this, Shr5Package.RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS);
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
            case Shr5Package.RIGGER_COMMAND_CONSOLE__PAN:
                if (pan != null)
                    msgs = ((InternalEObject)pan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.RIGGER_COMMAND_CONSOLE__PAN, null, msgs);
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
            case Shr5Package.RIGGER_COMMAND_CONSOLE__PAN:
                return basicSetPan(null, msgs);
            case Shr5Package.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS:
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
            case Shr5Package.RIGGER_COMMAND_CONSOLE__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__GERAETESTUFE:
                return getGeraetestufe();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL:
                return getFirewall();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG:
                return getDatenverarbeitung();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__CURRENT_MODUS:
                return getCurrentModus();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__PAN:
                return getPan();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DEVICE_RATING:
                return getDeviceRating();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG:
                return getRauschunterdrueckung();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF:
                return getZugriff();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
                return getDatenverarbeitungBasis();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
                return getFirewallBasis();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
                return getZugriffBasis();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS:
                return getStoredPrograms();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS:
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
            case Shr5Package.RIGGER_COMMAND_CONSOLE__CURRENT_MODUS:
                setCurrentModus((InterfaceModus)newValue);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__PAN:
                setPan((PersonalAreaNetwork)newValue);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DEVICE_RATING:
                setDeviceRating((Integer)newValue);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
                setDatenverarbeitungBasis((Integer)newValue);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
                setFirewallBasis((Integer)newValue);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
                setZugriffBasis((Integer)newValue);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS:
                getStoredPrograms().clear();
                getStoredPrograms().addAll((Collection<? extends RiggerProgram>)newValue);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS:
                getRunningPrograms().clear();
                getRunningPrograms().addAll((Collection<? extends RiggerProgram>)newValue);
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
            case Shr5Package.RIGGER_COMMAND_CONSOLE__CURRENT_MODUS:
                setCurrentModus(CURRENT_MODUS_EDEFAULT);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__PAN:
                setPan((PersonalAreaNetwork)null);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DEVICE_RATING:
                setDeviceRating(DEVICE_RATING_EDEFAULT);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
                setDatenverarbeitungBasis(DATENVERARBEITUNG_BASIS_EDEFAULT);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
                setFirewallBasis(FIREWALL_BASIS_EDEFAULT);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
                setZugriffBasis(ZUGRIFF_BASIS_EDEFAULT);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS:
                getStoredPrograms().clear();
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS:
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
            case Shr5Package.RIGGER_COMMAND_CONSOLE__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax() != MATRIX_ZUSTAND_MAX_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__GERAETESTUFE:
                return getGeraetestufe() != GERAETESTUFE_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL:
                return getFirewall() != FIREWALL_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG:
                return getDatenverarbeitung() != DATENVERARBEITUNG_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__CURRENT_MODUS:
                return currentModus != CURRENT_MODUS_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__PAN:
                return pan != null;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DEVICE_RATING:
                return deviceRating != DEVICE_RATING_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG:
                return getRauschunterdrueckung() != RAUSCHUNTERDRUECKUNG_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF:
                return getZugriff() != ZUGRIFF_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
                return datenverarbeitungBasis != DATENVERARBEITUNG_BASIS_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
                return firewallBasis != FIREWALL_BASIS_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
                return zugriffBasis != ZUGRIFF_BASIS_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS:
                return storedPrograms != null && !storedPrograms.isEmpty();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS:
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
                case Shr5Package.RIGGER_COMMAND_CONSOLE__MATRIX_ZUSTAND_MAX: return Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX;
                default: return -1;
            }
        }
        if (baseClass == MatrixAttributes.class) {
            switch (derivedFeatureID) {
                case Shr5Package.RIGGER_COMMAND_CONSOLE__GERAETESTUFE: return Shr5Package.MATRIX_ATTRIBUTES__GERAETESTUFE;
                case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL: return Shr5Package.MATRIX_ATTRIBUTES__FIREWALL;
                case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG: return Shr5Package.MATRIX_ATTRIBUTES__DATENVERARBEITUNG;
                case Shr5Package.RIGGER_COMMAND_CONSOLE__CURRENT_MODUS: return Shr5Package.MATRIX_ATTRIBUTES__CURRENT_MODUS;
                default: return -1;
            }
        }
        if (baseClass == MatrixDevice.class) {
            switch (derivedFeatureID) {
                case Shr5Package.RIGGER_COMMAND_CONSOLE__PAN: return Shr5Package.MATRIX_DEVICE__PAN;
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
                case Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX: return Shr5Package.RIGGER_COMMAND_CONSOLE__MATRIX_ZUSTAND_MAX;
                default: return -1;
            }
        }
        if (baseClass == MatrixAttributes.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATRIX_ATTRIBUTES__GERAETESTUFE: return Shr5Package.RIGGER_COMMAND_CONSOLE__GERAETESTUFE;
                case Shr5Package.MATRIX_ATTRIBUTES__FIREWALL: return Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL;
                case Shr5Package.MATRIX_ATTRIBUTES__DATENVERARBEITUNG: return Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG;
                case Shr5Package.MATRIX_ATTRIBUTES__CURRENT_MODUS: return Shr5Package.RIGGER_COMMAND_CONSOLE__CURRENT_MODUS;
                default: return -1;
            }
        }
        if (baseClass == MatrixDevice.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATRIX_DEVICE__PAN: return Shr5Package.RIGGER_COMMAND_CONSOLE__PAN;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public BigDecimal getWert() {
        if(getWertValue()==null)
            return new BigDecimal(0);

        BigDecimal calcListenWert = ShadowrunTools.calcListenWert(getStoredPrograms());
        return getWertValue().add(calcListenWert);
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
        result.append(", datenverarbeitungBasis: ");
        result.append(datenverarbeitungBasis);
        result.append(", firewallBasis: ");
        result.append(firewallBasis);
        result.append(", zugriffBasis: ");
        result.append(zugriffBasis);
        result.append(')');
        return result.toString();
    }

} //RiggerCommandConsoleImpl
