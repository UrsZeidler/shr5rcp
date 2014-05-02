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

import de.urszeidler.eclipse.shr5.AstraleProjektion;
import de.urszeidler.eclipse.shr5.GebundenerGeist;
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.MagischeTradition;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauberer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Magier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getZauber <em>Zauber</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getEnzug <em>Enzug</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getTradition <em>Tradition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getGebundeneGeister <em>Gebundene Geister</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getAstralesLimit <em>Astrales Limit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getAstraleKonstitution <em>Astrale Konstitution</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getAstraleGeschicklichkeit <em>Astrale Geschicklichkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getAstraleReaktion <em>Astrale Reaktion</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getAstraleStaerke <em>Astrale Staerke</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getAstraleInitative <em>Astrale Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getAstraleInitativWuerfel <em>Astrale Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagierImpl#getAstralePanzerung <em>Astrale Panzerung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MagierImpl extends MagischePersonaImpl implements Magier {
	/**
     * The cached value of the '{@link #getZauber() <em>Zauber</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getZauber()
     * @generated
     * @ordered
     */
	protected EList<PersonaZauber> zauber;

	/**
     * The default value of the '{@link #getEnzug() <em>Enzug</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEnzug()
     * @generated
     * @ordered
     */
	protected static final int ENZUG_EDEFAULT = 0;
	/**
     * The default value of the '{@link #getTradition() <em>Tradition</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTradition()
     * @generated
     * @ordered
     */
	protected static final MagischeTradition TRADITION_EDEFAULT = MagischeTradition.HERMETISCH;
	/**
     * The cached value of the '{@link #getTradition() <em>Tradition</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTradition()
     * @generated
     * @ordered
     */
	protected MagischeTradition tradition = TRADITION_EDEFAULT;
	/**
     * The cached value of the '{@link #getGebundeneGeister() <em>Gebundene Geister</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGebundeneGeister()
     * @generated
     * @ordered
     */
    protected EList<GebundenerGeist> gebundeneGeister;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MagierImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.MAGIER;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PersonaZauber> getZauber() {
        if (zauber == null) {
            zauber = new EObjectContainmentEList<PersonaZauber>(PersonaZauber.class, this, Shr5Package.MAGIER__ZAUBER);
        }
        return zauber;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getEnzug() {
		switch (tradition) {
		case HERMETISCH:
			return getWillenskraft() + getLogik();
		case SCHAMANISCH :
			return getWillenskraft()+ getIntuition();
			
		default:
			return 0;
		}
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MagischeTradition getTradition() {
        return tradition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTradition(MagischeTradition newTradition) {
        MagischeTradition oldTradition = tradition;
        tradition = newTradition == null ? TRADITION_EDEFAULT : newTradition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MAGIER__TRADITION, oldTradition, tradition));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GebundenerGeist> getGebundeneGeister() {
        if (gebundeneGeister == null) {
            gebundeneGeister = new EObjectContainmentEList<GebundenerGeist>(GebundenerGeist.class, this, Shr5Package.MAGIER__GEBUNDENE_GEISTER);
        }
        return gebundeneGeister;
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
	 * @generated not
	 */
	public int getAstraleInitative() {
		return 2* getIntuition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getAstraleInitativWuerfel() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL);

		return 2 +getmodWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getAstralePanzerung() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG);
		return getmodWert;
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.MAGIER__ZAUBER:
                return ((InternalEList<?>)getZauber()).basicRemove(otherEnd, msgs);
            case Shr5Package.MAGIER__GEBUNDENE_GEISTER:
                return ((InternalEList<?>)getGebundeneGeister()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.MAGIER__ZAUBER:
                return getZauber();
            case Shr5Package.MAGIER__ENZUG:
                return getEnzug();
            case Shr5Package.MAGIER__TRADITION:
                return getTradition();
            case Shr5Package.MAGIER__GEBUNDENE_GEISTER:
                return getGebundeneGeister();
            case Shr5Package.MAGIER__ASTRALES_LIMIT:
                return getAstralesLimit();
            case Shr5Package.MAGIER__ASTRALE_KONSTITUTION:
                return getAstraleKonstitution();
            case Shr5Package.MAGIER__ASTRALE_GESCHICKLICHKEIT:
                return getAstraleGeschicklichkeit();
            case Shr5Package.MAGIER__ASTRALE_REAKTION:
                return getAstraleReaktion();
            case Shr5Package.MAGIER__ASTRALE_STAERKE:
                return getAstraleStaerke();
            case Shr5Package.MAGIER__ASTRALE_INITATIVE:
                return getAstraleInitative();
            case Shr5Package.MAGIER__ASTRALE_INITATIV_WUERFEL:
                return getAstraleInitativWuerfel();
            case Shr5Package.MAGIER__ASTRALE_PANZERUNG:
                return getAstralePanzerung();
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
            case Shr5Package.MAGIER__ZAUBER:
                getZauber().clear();
                getZauber().addAll((Collection<? extends PersonaZauber>)newValue);
                return;
            case Shr5Package.MAGIER__TRADITION:
                setTradition((MagischeTradition)newValue);
                return;
            case Shr5Package.MAGIER__GEBUNDENE_GEISTER:
                getGebundeneGeister().clear();
                getGebundeneGeister().addAll((Collection<? extends GebundenerGeist>)newValue);
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
            case Shr5Package.MAGIER__ZAUBER:
                getZauber().clear();
                return;
            case Shr5Package.MAGIER__TRADITION:
                setTradition(TRADITION_EDEFAULT);
                return;
            case Shr5Package.MAGIER__GEBUNDENE_GEISTER:
                getGebundeneGeister().clear();
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
            case Shr5Package.MAGIER__ZAUBER:
                return zauber != null && !zauber.isEmpty();
            case Shr5Package.MAGIER__ENZUG:
                return getEnzug() != ENZUG_EDEFAULT;
            case Shr5Package.MAGIER__TRADITION:
                return tradition != TRADITION_EDEFAULT;
            case Shr5Package.MAGIER__GEBUNDENE_GEISTER:
                return gebundeneGeister != null && !gebundeneGeister.isEmpty();
            case Shr5Package.MAGIER__ASTRALES_LIMIT:
                return getAstralesLimit() != ASTRALES_LIMIT_EDEFAULT;
            case Shr5Package.MAGIER__ASTRALE_KONSTITUTION:
                return getAstraleKonstitution() != ASTRALE_KONSTITUTION_EDEFAULT;
            case Shr5Package.MAGIER__ASTRALE_GESCHICKLICHKEIT:
                return getAstraleGeschicklichkeit() != ASTRALE_GESCHICKLICHKEIT_EDEFAULT;
            case Shr5Package.MAGIER__ASTRALE_REAKTION:
                return getAstraleReaktion() != ASTRALE_REAKTION_EDEFAULT;
            case Shr5Package.MAGIER__ASTRALE_STAERKE:
                return getAstraleStaerke() != ASTRALE_STAERKE_EDEFAULT;
            case Shr5Package.MAGIER__ASTRALE_INITATIVE:
                return getAstraleInitative() != ASTRALE_INITATIVE_EDEFAULT;
            case Shr5Package.MAGIER__ASTRALE_INITATIV_WUERFEL:
                return getAstraleInitativWuerfel() != ASTRALE_INITATIV_WUERFEL_EDEFAULT;
            case Shr5Package.MAGIER__ASTRALE_PANZERUNG:
                return getAstralePanzerung() != ASTRALE_PANZERUNG_EDEFAULT;
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
        if (baseClass == Zauberer.class) {
            switch (derivedFeatureID) {
                case Shr5Package.MAGIER__ZAUBER: return Shr5Package.ZAUBERER__ZAUBER;
                case Shr5Package.MAGIER__ENZUG: return Shr5Package.ZAUBERER__ENZUG;
                case Shr5Package.MAGIER__TRADITION: return Shr5Package.ZAUBERER__TRADITION;
                case Shr5Package.MAGIER__GEBUNDENE_GEISTER: return Shr5Package.ZAUBERER__GEBUNDENE_GEISTER;
                default: return -1;
            }
        }
        if (baseClass == AstraleProjektion.class) {
            switch (derivedFeatureID) {
                case Shr5Package.MAGIER__ASTRALES_LIMIT: return Shr5Package.ASTRALE_PROJEKTION__ASTRALES_LIMIT;
                case Shr5Package.MAGIER__ASTRALE_KONSTITUTION: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION;
                case Shr5Package.MAGIER__ASTRALE_GESCHICKLICHKEIT: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT;
                case Shr5Package.MAGIER__ASTRALE_REAKTION: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_REAKTION;
                case Shr5Package.MAGIER__ASTRALE_STAERKE: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_STAERKE;
                case Shr5Package.MAGIER__ASTRALE_INITATIVE: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIVE;
                case Shr5Package.MAGIER__ASTRALE_INITATIV_WUERFEL: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL;
                case Shr5Package.MAGIER__ASTRALE_PANZERUNG: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG;
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
        if (baseClass == Zauberer.class) {
            switch (baseFeatureID) {
                case Shr5Package.ZAUBERER__ZAUBER: return Shr5Package.MAGIER__ZAUBER;
                case Shr5Package.ZAUBERER__ENZUG: return Shr5Package.MAGIER__ENZUG;
                case Shr5Package.ZAUBERER__TRADITION: return Shr5Package.MAGIER__TRADITION;
                case Shr5Package.ZAUBERER__GEBUNDENE_GEISTER: return Shr5Package.MAGIER__GEBUNDENE_GEISTER;
                default: return -1;
            }
        }
        if (baseClass == AstraleProjektion.class) {
            switch (baseFeatureID) {
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALES_LIMIT: return Shr5Package.MAGIER__ASTRALES_LIMIT;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION: return Shr5Package.MAGIER__ASTRALE_KONSTITUTION;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT: return Shr5Package.MAGIER__ASTRALE_GESCHICKLICHKEIT;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_REAKTION: return Shr5Package.MAGIER__ASTRALE_REAKTION;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_STAERKE: return Shr5Package.MAGIER__ASTRALE_STAERKE;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIVE: return Shr5Package.MAGIER__ASTRALE_INITATIVE;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL: return Shr5Package.MAGIER__ASTRALE_INITATIV_WUERFEL;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG: return Shr5Package.MAGIER__ASTRALE_PANZERUNG;
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
        result.append(" (tradition: ");
        result.append(tradition);
        result.append(')');
        return result.toString();
    }

} //MagierImpl
