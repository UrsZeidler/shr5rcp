/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.AstraleProjektion;
import de.urszeidler.eclipse.shr5.Geist;
import de.urszeidler.eclipse.shr5.GeisterArt;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstralesLimit <em>Astrales Limit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleKonstitution <em>Astrale Konstitution</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleGeschicklichkeit <em>Astrale Geschicklichkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleReaktion <em>Astrale Reaktion</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleStaerke <em>Astrale Staerke</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleInitative <em>Astrale Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleInitativWuerfel <em>Astrale Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstralePanzerung <em>Astrale Panzerung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getSpezies <em>Spezies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeistImpl extends StufenPersonaImpl implements Geist {
    /**
     * The default value of the '{@link #getAstralesLimit() <em>Astrales Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstralesLimit()
     * @generated
     * @ordered
     */
    protected static final int ASTRALES_LIMIT_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleKonstitution() <em>Astrale Konstitution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleKonstitution()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_KONSTITUTION_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleGeschicklichkeit() <em>Astrale Geschicklichkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleGeschicklichkeit()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_GESCHICKLICHKEIT_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleReaktion() <em>Astrale Reaktion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleReaktion()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_REAKTION_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleStaerke() <em>Astrale Staerke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleStaerke()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_STAERKE_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleInitative() <em>Astrale Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleInitative()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_INITATIVE_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleInitativWuerfel() <em>Astrale Initativ Wuerfel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleInitativWuerfel()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_INITATIV_WUERFEL_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstralePanzerung() <em>Astrale Panzerung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstralePanzerung()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_PANZERUNG_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSpezies() <em>Spezies</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpezies()
     * @generated
     * @ordered
     */
    protected GeisterArt spezies;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeistImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.GEIST;
    }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getAstralesLimit() {
        return Math.max(getSozial(), getGeistig());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getAstraleKonstitution() {
        return getWillenskraft();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getAstraleGeschicklichkeit() {
        return getLogik();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getAstraleReaktion() {
        return getIntuition();
                
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getAstraleStaerke() {
        return getCharisma();
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstraleInitative() {
        int value = getStufe() * 2;
        if (getSpezies() != null) {
            value = value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_INITATIVE, getSpezies().getMods());
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstraleInitativWuerfel() {
        return 3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstralePanzerung() {
        int value = 0;
        if (getSpezies() != null) {
            value = value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG, getSpezies().getMods());
        }
        return value;

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeisterArt getSpezies() {
        if (spezies != null && spezies.eIsProxy()) {
            InternalEObject oldSpezies = (InternalEObject)spezies;
            spezies = (GeisterArt)eResolveProxy(oldSpezies);
            if (spezies != oldSpezies) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.GEIST__SPEZIES, oldSpezies, spezies));
            }
        }
        return spezies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeisterArt basicGetSpezies() {
        return spezies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpezies(GeisterArt newSpezies) {
        GeisterArt oldSpezies = spezies;
        spezies = newSpezies;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__SPEZIES, oldSpezies, spezies));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.GEIST__ASTRALES_LIMIT:
                return getAstralesLimit();
            case Shr5Package.GEIST__ASTRALE_KONSTITUTION:
                return getAstraleKonstitution();
            case Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT:
                return getAstraleGeschicklichkeit();
            case Shr5Package.GEIST__ASTRALE_REAKTION:
                return getAstraleReaktion();
            case Shr5Package.GEIST__ASTRALE_STAERKE:
                return getAstraleStaerke();
            case Shr5Package.GEIST__ASTRALE_INITATIVE:
                return getAstraleInitative();
            case Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL:
                return getAstraleInitativWuerfel();
            case Shr5Package.GEIST__ASTRALE_PANZERUNG:
                return getAstralePanzerung();
            case Shr5Package.GEIST__SPEZIES:
                if (resolve) return getSpezies();
                return basicGetSpezies();
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
            case Shr5Package.GEIST__SPEZIES:
                setSpezies((GeisterArt)newValue);
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
            case Shr5Package.GEIST__SPEZIES:
                setSpezies((GeisterArt)null);
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
            case Shr5Package.GEIST__ASTRALES_LIMIT:
                return getAstralesLimit() != ASTRALES_LIMIT_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_KONSTITUTION:
                return getAstraleKonstitution() != ASTRALE_KONSTITUTION_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT:
                return getAstraleGeschicklichkeit() != ASTRALE_GESCHICKLICHKEIT_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_REAKTION:
                return getAstraleReaktion() != ASTRALE_REAKTION_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_STAERKE:
                return getAstraleStaerke() != ASTRALE_STAERKE_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_INITATIVE:
                return getAstraleInitative() != ASTRALE_INITATIVE_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL:
                return getAstraleInitativWuerfel() != ASTRALE_INITATIV_WUERFEL_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_PANZERUNG:
                return getAstralePanzerung() != ASTRALE_PANZERUNG_EDEFAULT;
            case Shr5Package.GEIST__SPEZIES:
                return spezies != null;
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
        if (baseClass == AstraleProjektion.class) {
            switch (derivedFeatureID) {
                case Shr5Package.GEIST__ASTRALES_LIMIT: return Shr5Package.ASTRALE_PROJEKTION__ASTRALES_LIMIT;
                case Shr5Package.GEIST__ASTRALE_KONSTITUTION: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION;
                case Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT;
                case Shr5Package.GEIST__ASTRALE_REAKTION: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_REAKTION;
                case Shr5Package.GEIST__ASTRALE_STAERKE: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_STAERKE;
                case Shr5Package.GEIST__ASTRALE_INITATIVE: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIVE;
                case Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL;
                case Shr5Package.GEIST__ASTRALE_PANZERUNG: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG;
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
        if (baseClass == AstraleProjektion.class) {
            switch (baseFeatureID) {
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALES_LIMIT: return Shr5Package.GEIST__ASTRALES_LIMIT;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION: return Shr5Package.GEIST__ASTRALE_KONSTITUTION;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT: return Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_REAKTION: return Shr5Package.GEIST__ASTRALE_REAKTION;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_STAERKE: return Shr5Package.GEIST__ASTRALE_STAERKE;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIVE: return Shr5Package.GEIST__ASTRALE_INITATIVE;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL: return Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG: return Shr5Package.GEIST__ASTRALE_PANZERUNG;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getCharisma() {
        int value = getStufe();
        if (getSpezies() != null) {
            value = value + getSpezies().getCharismaMin();
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getWillenskraft() {
        int value = getStufe();
        if (getSpezies() != null) {
            value = value + getSpezies().getWillenskraftMin();
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getIntuition() {
        int value = getStufe();
        if (getSpezies() != null) {
            value = value + getSpezies().getIntuitionMin();
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getLogik() {
        int value = getStufe();
        if (getSpezies() != null) {
            value = value + getSpezies().getLogikMin();
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKonstitution() {
        int value = getStufe();
        if (getSpezies() != null) {
            value = value + getSpezies().getKonstitutionMin();
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getGeschicklichkeit() {
        int value = getStufe();
        if (getSpezies() != null) {
            value = value + getSpezies().getGeschicklichkeitMin();
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getReaktion() {
        int value = getStufe();
        if (getSpezies() != null) {
            value = value + getSpezies().getReaktionMin();
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getStaerke() {
        int value = getStufe();
        if (getSpezies() != null) {
            value = value + getSpezies().getStaerkeMin();
        }
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKoerperlich() {
        double baselimit1 = ((getStaerke() * 2) + getKonstitution() + getReaktion()) / 3.0;
        int baselimit = (int)Math.ceil(baselimit1);
        return baselimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getGeistig() {
        double baselimit1 = ((getLogik() * 2) + getIntuition() + getWillenskraft()) / 3.0;
        int baselimit = (int)Math.ceil(baselimit1);
        return baselimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getSozial() {
        double baselimit1 = ((getCharisma() * 2) + getWillenskraft() + (getEssenz() / 100)) / 3.0;
        int baselimit = (int)Math.ceil(baselimit1);
        return baselimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getInitative() {
        int value = getStufe() * 2;
        if (getSpezies() != null) {
            value = value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, getSpezies().getMods());
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated  not
     */
    public int getEdge() {
        int stufe2 = getStufe();

        int baselimit = (int)Math.ceil(stufe2 / 2);
        return baselimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getInitativWuerfel() {
        return 2;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAusweichen() {
        int value = getReaktion() + getIntuition();
        if (getSpezies() != null) {
            value = value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN, getSpezies().getMods());
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getEssenz() {
        int stufe2 = getStufe();
        return stufe2 * 100;
    }

    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getPanzer() {
        int value = 0;
        if (getSpezies() != null) {
            value = value + ShadowrunTools.getModificatorValue(Shr5Package.Literals.PANZERUNG__PANZER, getSpezies().getMods());
        }
        return value;
    }

} // GeistImpl
