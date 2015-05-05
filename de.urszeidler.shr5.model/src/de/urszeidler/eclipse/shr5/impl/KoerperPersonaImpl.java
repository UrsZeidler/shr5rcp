/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.BerechneteAttribute;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.Panzerung;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaZustand;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Koerper Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getPanzer <em>Panzer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getZustandKoerperlichMax <em>Zustand Koerperlich Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getZustandGeistigMax <em>Zustand Geistig Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getZustandGrenze <em>Zustand Grenze</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getErrinerungsvermoegen <em>Errinerungsvermoegen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getMenschenkenntnis <em>Menschenkenntnis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getSelbstbeherrschung <em>Selbstbeherrschung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getKoerperMods <em>Koerper Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getEigenschaften <em>Eigenschaften</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getZustandKoerperlich <em>Zustand Koerperlich</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getZustandGeistig <em>Zustand Geistig</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class KoerperPersonaImpl extends AbstraktPersonaImpl implements KoerperPersona {
    /**
     * The default value of the '{@link #getPanzer() <em>Panzer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPanzer()
     * @generated
     * @ordered
     */
    protected static final int PANZER_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getZustandKoerperlichMax() <em>Zustand Koerperlich Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustandKoerperlichMax()
     * @generated
     * @ordered
     */
    protected static final int ZUSTAND_KOERPERLICH_MAX_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getZustandGeistigMax() <em>Zustand Geistig Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustandGeistigMax()
     * @generated
     * @ordered
     */
    protected static final int ZUSTAND_GEISTIG_MAX_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getZustandGrenze() <em>Zustand Grenze</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustandGrenze()
     * @generated
     * @ordered
     */
    protected static final int ZUSTAND_GRENZE_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getErrinerungsvermoegen() <em>Errinerungsvermoegen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrinerungsvermoegen()
     * @generated
     * @ordered
     */
    protected static final int ERRINERUNGSVERMOEGEN_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getMenschenkenntnis() <em>Menschenkenntnis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMenschenkenntnis()
     * @generated
     * @ordered
     */
    protected static final int MENSCHENKENNTNIS_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getSelbstbeherrschung() <em>Selbstbeherrschung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelbstbeherrschung()
     * @generated
     * @ordered
     */
    protected static final int SELBSTBEHERRSCHUNG_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getKoerperMods() <em>Koerper Mods</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKoerperMods()
     * @generated
     * @ordered
     */
    protected EList<Koerpermods> koerperMods;

    /**
     * The cached value of the '{@link #getEigenschaften() <em>Eigenschaften</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEigenschaften()
     * @generated
     * @ordered
     */
    protected EList<PersonaEigenschaft> eigenschaften;

    /**
     * The default value of the '{@link #getZustandKoerperlich() <em>Zustand Koerperlich</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustandKoerperlich()
     * @generated
     * @ordered
     */
    protected static final int ZUSTAND_KOERPERLICH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getZustandKoerperlich() <em>Zustand Koerperlich</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustandKoerperlich()
     * @generated
     * @ordered
     */
    protected int zustandKoerperlich = ZUSTAND_KOERPERLICH_EDEFAULT;

    /**
     * The default value of the '{@link #getZustandGeistig() <em>Zustand Geistig</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustandGeistig()
     * @generated
     * @ordered
     */
    protected static final int ZUSTAND_GEISTIG_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getZustandGeistig() <em>Zustand Geistig</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustandGeistig()
     * @generated
     * @ordered
     */
    protected int zustandGeistig = ZUSTAND_GEISTIG_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KoerperPersonaImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.KOERPER_PERSONA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getPanzer() {
        int getmodWert = modManager.getmodWert(Shr5Package.Literals.PANZERUNG__PANZER);
        return getmodWert;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getZustandKoerperlichMax() {
        int konstitution = (int)Math.ceil(getKonstitution() / 2.0D);
        return 8 + konstitution + getModManager().getmodWert(Shr5Package.Literals.PERSONA_ZUSTAND__ZUSTAND_KOERPERLICH_MAX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getZustandGeistigMax() {
        int willenskraft = (int)Math.ceil(getWillenskraft() / 2.0D);
        return 8 + willenskraft +getModManager().getmodWert(Shr5Package.Literals.PERSONA_ZUSTAND__ZUSTAND_GEISTIG_MAX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getZustandGrenze() {
        return getKonstitutionBasis()+ +getModManager().getmodWert(Shr5Package.Literals.PERSONA_ZUSTAND__ZUSTAND_GRENZE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getErrinerungsvermoegen() {
        return getWillenskraft()+getLogik()+ getModManager().getmodWert(Shr5Package.Literals.BERECHNETE_ATTRIBUTE__ERRINERUNGSVERMOEGEN) ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getMenschenkenntnis() {
        return getIntuition()+getCharisma()+ getModManager().getmodWert(Shr5Package.Literals.BERECHNETE_ATTRIBUTE__MENSCHENKENNTNIS) ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getSelbstbeherrschung() {
        return getWillenskraft()+getCharisma()+ getModManager().getmodWert(Shr5Package.Literals.BERECHNETE_ATTRIBUTE__SELBSTBEHERRSCHUNG) ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Koerpermods> getKoerperMods() {
        if (koerperMods == null) {
            koerperMods = new EObjectContainmentEList<Koerpermods>(Koerpermods.class, this, Shr5Package.KOERPER_PERSONA__KOERPER_MODS);
        }
        return koerperMods;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PersonaEigenschaft> getEigenschaften() {
        if (eigenschaften == null) {
            eigenschaften = new EObjectContainmentEList<PersonaEigenschaft>(PersonaEigenschaft.class, this, Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN);
        }
        return eigenschaften;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getZustandKoerperlich() {
        return zustandKoerperlich;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setZustandKoerperlich(int newZustandKoerperlich) {
        int oldZustandKoerperlich = zustandKoerperlich;
        zustandKoerperlich = newZustandKoerperlich;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH, oldZustandKoerperlich, zustandKoerperlich));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getZustandGeistig() {
        return zustandGeistig;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setZustandGeistig(int newZustandGeistig) {
        int oldZustandGeistig = zustandGeistig;
        zustandGeistig = newZustandGeistig;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG, oldZustandGeistig, zustandGeistig));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
                return ((InternalEList<?>)getKoerperMods()).basicRemove(otherEnd, msgs);
            case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
                return ((InternalEList<?>)getEigenschaften()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.KOERPER_PERSONA__PANZER:
                return getPanzer();
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH_MAX:
                return getZustandKoerperlichMax();
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG_MAX:
                return getZustandGeistigMax();
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GRENZE:
                return getZustandGrenze();
            case Shr5Package.KOERPER_PERSONA__ERRINERUNGSVERMOEGEN:
                return getErrinerungsvermoegen();
            case Shr5Package.KOERPER_PERSONA__MENSCHENKENNTNIS:
                return getMenschenkenntnis();
            case Shr5Package.KOERPER_PERSONA__SELBSTBEHERRSCHUNG:
                return getSelbstbeherrschung();
            case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
                return getKoerperMods();
            case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
                return getEigenschaften();
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH:
                return getZustandKoerperlich();
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG:
                return getZustandGeistig();
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
            case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
                getKoerperMods().clear();
                getKoerperMods().addAll((Collection<? extends Koerpermods>)newValue);
                return;
            case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
                getEigenschaften().clear();
                getEigenschaften().addAll((Collection<? extends PersonaEigenschaft>)newValue);
                return;
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH:
                setZustandKoerperlich((Integer)newValue);
                return;
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG:
                setZustandGeistig((Integer)newValue);
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
            case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
                getKoerperMods().clear();
                return;
            case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
                getEigenschaften().clear();
                return;
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH:
                setZustandKoerperlich(ZUSTAND_KOERPERLICH_EDEFAULT);
                return;
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG:
                setZustandGeistig(ZUSTAND_GEISTIG_EDEFAULT);
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
            case Shr5Package.KOERPER_PERSONA__PANZER:
                return getPanzer() != PANZER_EDEFAULT;
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH_MAX:
                return getZustandKoerperlichMax() != ZUSTAND_KOERPERLICH_MAX_EDEFAULT;
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG_MAX:
                return getZustandGeistigMax() != ZUSTAND_GEISTIG_MAX_EDEFAULT;
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GRENZE:
                return getZustandGrenze() != ZUSTAND_GRENZE_EDEFAULT;
            case Shr5Package.KOERPER_PERSONA__ERRINERUNGSVERMOEGEN:
                return getErrinerungsvermoegen() != ERRINERUNGSVERMOEGEN_EDEFAULT;
            case Shr5Package.KOERPER_PERSONA__MENSCHENKENNTNIS:
                return getMenschenkenntnis() != MENSCHENKENNTNIS_EDEFAULT;
            case Shr5Package.KOERPER_PERSONA__SELBSTBEHERRSCHUNG:
                return getSelbstbeherrschung() != SELBSTBEHERRSCHUNG_EDEFAULT;
            case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
                return koerperMods != null && !koerperMods.isEmpty();
            case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
                return eigenschaften != null && !eigenschaften.isEmpty();
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH:
                return zustandKoerperlich != ZUSTAND_KOERPERLICH_EDEFAULT;
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG:
                return zustandGeistig != ZUSTAND_GEISTIG_EDEFAULT;
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
        if (baseClass == Panzerung.class) {
            switch (derivedFeatureID) {
                case Shr5Package.KOERPER_PERSONA__PANZER: return Shr5Package.PANZERUNG__PANZER;
                default: return -1;
            }
        }
        if (baseClass == PersonaZustand.class) {
            switch (derivedFeatureID) {
                case Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH_MAX: return Shr5Package.PERSONA_ZUSTAND__ZUSTAND_KOERPERLICH_MAX;
                case Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG_MAX: return Shr5Package.PERSONA_ZUSTAND__ZUSTAND_GEISTIG_MAX;
                case Shr5Package.KOERPER_PERSONA__ZUSTAND_GRENZE: return Shr5Package.PERSONA_ZUSTAND__ZUSTAND_GRENZE;
                default: return -1;
            }
        }
        if (baseClass == BerechneteAttribute.class) {
            switch (derivedFeatureID) {
                case Shr5Package.KOERPER_PERSONA__ERRINERUNGSVERMOEGEN: return Shr5Package.BERECHNETE_ATTRIBUTE__ERRINERUNGSVERMOEGEN;
                case Shr5Package.KOERPER_PERSONA__MENSCHENKENNTNIS: return Shr5Package.BERECHNETE_ATTRIBUTE__MENSCHENKENNTNIS;
                case Shr5Package.KOERPER_PERSONA__SELBSTBEHERRSCHUNG: return Shr5Package.BERECHNETE_ATTRIBUTE__SELBSTBEHERRSCHUNG;
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
        if (baseClass == Panzerung.class) {
            switch (baseFeatureID) {
                case Shr5Package.PANZERUNG__PANZER: return Shr5Package.KOERPER_PERSONA__PANZER;
                default: return -1;
            }
        }
        if (baseClass == PersonaZustand.class) {
            switch (baseFeatureID) {
                case Shr5Package.PERSONA_ZUSTAND__ZUSTAND_KOERPERLICH_MAX: return Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH_MAX;
                case Shr5Package.PERSONA_ZUSTAND__ZUSTAND_GEISTIG_MAX: return Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG_MAX;
                case Shr5Package.PERSONA_ZUSTAND__ZUSTAND_GRENZE: return Shr5Package.KOERPER_PERSONA__ZUSTAND_GRENZE;
                default: return -1;
            }
        }
        if (baseClass == BerechneteAttribute.class) {
            switch (baseFeatureID) {
                case Shr5Package.BERECHNETE_ATTRIBUTE__ERRINERUNGSVERMOEGEN: return Shr5Package.KOERPER_PERSONA__ERRINERUNGSVERMOEGEN;
                case Shr5Package.BERECHNETE_ATTRIBUTE__MENSCHENKENNTNIS: return Shr5Package.KOERPER_PERSONA__MENSCHENKENNTNIS;
                case Shr5Package.BERECHNETE_ATTRIBUTE__SELBSTBEHERRSCHUNG: return Shr5Package.KOERPER_PERSONA__SELBSTBEHERRSCHUNG;
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
        result.append(" (zustandKoerperlich: ");
        result.append(zustandKoerperlich);
        result.append(", zustandGeistig: ");
        result.append(zustandGeistig);
        result.append(')');
        return result.toString();
    }

} // KoerperPersonaImpl
