/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.ActiveMatixDevice;
import de.urszeidler.eclipse.shr5.Host;
import de.urszeidler.eclipse.shr5.InterfaceModus;
import de.urszeidler.eclipse.shr5.MatixConditionMonitor;
import de.urszeidler.eclipse.shr5.MatrixAttributes;
import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.PersonalAreaNetwork;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getMatrixZustandMax <em>Matrix Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getGeraetestufe <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getFirewall <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getCurrentModus <em>Current Modus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getAngriff <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.HostImpl#getSchleicher <em>Schleicher</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostImpl extends MinimalEObjectImpl.Container implements Host {
    /**
     * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeschreibung()
     * @generated
     * @ordered
     */
    protected static final String BESCHREIBUNG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeschreibung()
     * @generated
     * @ordered
     */
    protected String beschreibung = BESCHREIBUNG_EDEFAULT;

    /**
     * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
    protected static final String IMAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
    protected String image = IMAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HostImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.HOST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMatrixZustandMax() {
        // TODO: implement this method to return the 'Matrix Zustand Max' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getGeraetestufe() {
        // TODO: implement this method to return the 'Geraetestufe' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getFirewall() {
        // TODO: implement this method to return the 'Firewall' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDatenverarbeitung() {
        // TODO: implement this method to return the 'Datenverarbeitung' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.HOST__CURRENT_MODUS, oldCurrentModus, currentModus));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.HOST__PAN, oldPan, newPan);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.HOST__PAN, newPan, newPan));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAngriff() {
        // TODO: implement this method to return the 'Angriff' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSchleicher() {
        // TODO: implement this method to return the 'Schleicher' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBeschreibung(String newBeschreibung) {
        String oldBeschreibung = beschreibung;
        beschreibung = newBeschreibung;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.HOST__BESCHREIBUNG, oldBeschreibung, beschreibung));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImage() {
        return image;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImage(String newImage) {
        String oldImage = image;
        image = newImage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.HOST__IMAGE, oldImage, image));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.HOST__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.HOST__PAN:
                if (pan != null)
                    msgs = ((InternalEObject)pan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.HOST__PAN, null, msgs);
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
            case Shr5Package.HOST__PAN:
                return basicSetPan(null, msgs);
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
            case Shr5Package.HOST__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.HOST__IMAGE:
                return getImage();
            case Shr5Package.HOST__NAME:
                return getName();
            case Shr5Package.HOST__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax();
            case Shr5Package.HOST__GERAETESTUFE:
                return getGeraetestufe();
            case Shr5Package.HOST__FIREWALL:
                return getFirewall();
            case Shr5Package.HOST__DATENVERARBEITUNG:
                return getDatenverarbeitung();
            case Shr5Package.HOST__CURRENT_MODUS:
                return getCurrentModus();
            case Shr5Package.HOST__PAN:
                return getPan();
            case Shr5Package.HOST__ANGRIFF:
                return getAngriff();
            case Shr5Package.HOST__SCHLEICHER:
                return getSchleicher();
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
            case Shr5Package.HOST__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.HOST__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.HOST__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.HOST__CURRENT_MODUS:
                setCurrentModus((InterfaceModus)newValue);
                return;
            case Shr5Package.HOST__PAN:
                setPan((PersonalAreaNetwork)newValue);
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
            case Shr5Package.HOST__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.HOST__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.HOST__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.HOST__CURRENT_MODUS:
                setCurrentModus(CURRENT_MODUS_EDEFAULT);
                return;
            case Shr5Package.HOST__PAN:
                setPan((PersonalAreaNetwork)null);
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
            case Shr5Package.HOST__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.HOST__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.HOST__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.HOST__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax() != MATRIX_ZUSTAND_MAX_EDEFAULT;
            case Shr5Package.HOST__GERAETESTUFE:
                return getGeraetestufe() != GERAETESTUFE_EDEFAULT;
            case Shr5Package.HOST__FIREWALL:
                return getFirewall() != FIREWALL_EDEFAULT;
            case Shr5Package.HOST__DATENVERARBEITUNG:
                return getDatenverarbeitung() != DATENVERARBEITUNG_EDEFAULT;
            case Shr5Package.HOST__CURRENT_MODUS:
                return currentModus != CURRENT_MODUS_EDEFAULT;
            case Shr5Package.HOST__PAN:
                return pan != null;
            case Shr5Package.HOST__ANGRIFF:
                return getAngriff() != ANGRIFF_EDEFAULT;
            case Shr5Package.HOST__SCHLEICHER:
                return getSchleicher() != SCHLEICHER_EDEFAULT;
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
                case Shr5Package.HOST__MATRIX_ZUSTAND_MAX: return Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX;
                default: return -1;
            }
        }
        if (baseClass == MatrixAttributes.class) {
            switch (derivedFeatureID) {
                case Shr5Package.HOST__GERAETESTUFE: return Shr5Package.MATRIX_ATTRIBUTES__GERAETESTUFE;
                case Shr5Package.HOST__FIREWALL: return Shr5Package.MATRIX_ATTRIBUTES__FIREWALL;
                case Shr5Package.HOST__DATENVERARBEITUNG: return Shr5Package.MATRIX_ATTRIBUTES__DATENVERARBEITUNG;
                case Shr5Package.HOST__CURRENT_MODUS: return Shr5Package.MATRIX_ATTRIBUTES__CURRENT_MODUS;
                default: return -1;
            }
        }
        if (baseClass == MatrixDevice.class) {
            switch (derivedFeatureID) {
                case Shr5Package.HOST__PAN: return Shr5Package.MATRIX_DEVICE__PAN;
                default: return -1;
            }
        }
        if (baseClass == ActiveMatixDevice.class) {
            switch (derivedFeatureID) {
                case Shr5Package.HOST__ANGRIFF: return Shr5Package.ACTIVE_MATIX_DEVICE__ANGRIFF;
                case Shr5Package.HOST__SCHLEICHER: return Shr5Package.ACTIVE_MATIX_DEVICE__SCHLEICHER;
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
                case Shr5Package.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX: return Shr5Package.HOST__MATRIX_ZUSTAND_MAX;
                default: return -1;
            }
        }
        if (baseClass == MatrixAttributes.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATRIX_ATTRIBUTES__GERAETESTUFE: return Shr5Package.HOST__GERAETESTUFE;
                case Shr5Package.MATRIX_ATTRIBUTES__FIREWALL: return Shr5Package.HOST__FIREWALL;
                case Shr5Package.MATRIX_ATTRIBUTES__DATENVERARBEITUNG: return Shr5Package.HOST__DATENVERARBEITUNG;
                case Shr5Package.MATRIX_ATTRIBUTES__CURRENT_MODUS: return Shr5Package.HOST__CURRENT_MODUS;
                default: return -1;
            }
        }
        if (baseClass == MatrixDevice.class) {
            switch (baseFeatureID) {
                case Shr5Package.MATRIX_DEVICE__PAN: return Shr5Package.HOST__PAN;
                default: return -1;
            }
        }
        if (baseClass == ActiveMatixDevice.class) {
            switch (baseFeatureID) {
                case Shr5Package.ACTIVE_MATIX_DEVICE__ANGRIFF: return Shr5Package.HOST__ANGRIFF;
                case Shr5Package.ACTIVE_MATIX_DEVICE__SCHLEICHER: return Shr5Package.HOST__SCHLEICHER;
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
        result.append(" (beschreibung: ");
        result.append(beschreibung);
        result.append(", image: ");
        result.append(image);
        result.append(", name: ");
        result.append(name);
        result.append(", currentModus: ");
        result.append(currentModus);
        result.append(')');
        return result.toString();
    }

} //HostImpl
