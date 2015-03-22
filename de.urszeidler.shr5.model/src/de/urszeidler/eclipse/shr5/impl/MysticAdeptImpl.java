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

import de.urszeidler.eclipse.shr5.GebundenerGeist;
import de.urszeidler.eclipse.shr5.MagischeTradition;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauberer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mystic Adept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MysticAdeptImpl#getZauber <em>Zauber</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MysticAdeptImpl#getEnzug <em>Enzug</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MysticAdeptImpl#getGebundeneGeister <em>Gebundene Geister</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MysticAdeptImpl#getUngebundenerGeist <em>Ungebundener Geist</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MysticAdeptImpl#getTradition <em>Tradition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MysticAdeptImpl extends KiAdeptImpl implements MysticAdept {
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
     * The cached value of the '{@link #getGebundeneGeister() <em>Gebundene Geister</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGebundeneGeister()
     * @generated
     * @ordered
     */
    protected EList<GebundenerGeist> gebundeneGeister;

    /**
     * The cached value of the '{@link #getUngebundenerGeist() <em>Ungebundener Geist</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUngebundenerGeist()
     * @generated
     * @ordered
     */
    protected GebundenerGeist ungebundenerGeist;

    /**
     * The cached value of the '{@link #getTradition() <em>Tradition</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTradition()
     * @generated
     * @ordered
     */
	protected MagischeTradition tradition;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MysticAdeptImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.MYSTIC_ADEPT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PersonaZauber> getZauber() {
        if (zauber == null) {
            zauber = new EObjectContainmentEList<PersonaZauber>(PersonaZauber.class, this, Shr5Package.MYSTIC_ADEPT__ZAUBER);
        }
        return zauber;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getEnzug() {
        if (tradition != null)
            switch (tradition.getEnzug()) {
                case WIL_LOG:
                    return getWillenskraft() + getLogik();
                case WIL_INT:
                    return getWillenskraft() + getIntuition();
                case WIL_CHA:
                    return getWillenskraft() + getCharisma();

                default:
                    return 0;
            }
        return 0;
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MagischeTradition getTradition() {
        if (tradition != null && tradition.eIsProxy()) {
            InternalEObject oldTradition = (InternalEObject)tradition;
            tradition = (MagischeTradition)eResolveProxy(oldTradition);
            if (tradition != oldTradition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.MYSTIC_ADEPT__TRADITION, oldTradition, tradition));
            }
        }
        return tradition;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MagischeTradition basicGetTradition() {
        return tradition;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTradition(MagischeTradition newTradition) {
        MagischeTradition oldTradition = tradition;
        tradition = newTradition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MYSTIC_ADEPT__TRADITION, oldTradition, tradition));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GebundenerGeist> getGebundeneGeister() {
        if (gebundeneGeister == null) {
            gebundeneGeister = new EObjectContainmentEList<GebundenerGeist>(GebundenerGeist.class, this, Shr5Package.MYSTIC_ADEPT__GEBUNDENE_GEISTER);
        }
        return gebundeneGeister;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GebundenerGeist getUngebundenerGeist() {
        return ungebundenerGeist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUngebundenerGeist(GebundenerGeist newUngebundenerGeist, NotificationChain msgs) {
        GebundenerGeist oldUngebundenerGeist = ungebundenerGeist;
        ungebundenerGeist = newUngebundenerGeist;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST, oldUngebundenerGeist, newUngebundenerGeist);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUngebundenerGeist(GebundenerGeist newUngebundenerGeist) {
        if (newUngebundenerGeist != ungebundenerGeist) {
            NotificationChain msgs = null;
            if (ungebundenerGeist != null)
                msgs = ((InternalEObject)ungebundenerGeist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST, null, msgs);
            if (newUngebundenerGeist != null)
                msgs = ((InternalEObject)newUngebundenerGeist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST, null, msgs);
            msgs = basicSetUngebundenerGeist(newUngebundenerGeist, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST, newUngebundenerGeist, newUngebundenerGeist));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.MYSTIC_ADEPT__ZAUBER:
                return ((InternalEList<?>)getZauber()).basicRemove(otherEnd, msgs);
            case Shr5Package.MYSTIC_ADEPT__GEBUNDENE_GEISTER:
                return ((InternalEList<?>)getGebundeneGeister()).basicRemove(otherEnd, msgs);
            case Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST:
                return basicSetUngebundenerGeist(null, msgs);
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
            case Shr5Package.MYSTIC_ADEPT__ZAUBER:
                return getZauber();
            case Shr5Package.MYSTIC_ADEPT__ENZUG:
                return getEnzug();
            case Shr5Package.MYSTIC_ADEPT__GEBUNDENE_GEISTER:
                return getGebundeneGeister();
            case Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST:
                return getUngebundenerGeist();
            case Shr5Package.MYSTIC_ADEPT__TRADITION:
                if (resolve) return getTradition();
                return basicGetTradition();
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
            case Shr5Package.MYSTIC_ADEPT__ZAUBER:
                getZauber().clear();
                getZauber().addAll((Collection<? extends PersonaZauber>)newValue);
                return;
            case Shr5Package.MYSTIC_ADEPT__GEBUNDENE_GEISTER:
                getGebundeneGeister().clear();
                getGebundeneGeister().addAll((Collection<? extends GebundenerGeist>)newValue);
                return;
            case Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST:
                setUngebundenerGeist((GebundenerGeist)newValue);
                return;
            case Shr5Package.MYSTIC_ADEPT__TRADITION:
                setTradition((MagischeTradition)newValue);
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
            case Shr5Package.MYSTIC_ADEPT__ZAUBER:
                getZauber().clear();
                return;
            case Shr5Package.MYSTIC_ADEPT__GEBUNDENE_GEISTER:
                getGebundeneGeister().clear();
                return;
            case Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST:
                setUngebundenerGeist((GebundenerGeist)null);
                return;
            case Shr5Package.MYSTIC_ADEPT__TRADITION:
                setTradition((MagischeTradition)null);
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
            case Shr5Package.MYSTIC_ADEPT__ZAUBER:
                return zauber != null && !zauber.isEmpty();
            case Shr5Package.MYSTIC_ADEPT__ENZUG:
                return getEnzug() != ENZUG_EDEFAULT;
            case Shr5Package.MYSTIC_ADEPT__GEBUNDENE_GEISTER:
                return gebundeneGeister != null && !gebundeneGeister.isEmpty();
            case Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST:
                return ungebundenerGeist != null;
            case Shr5Package.MYSTIC_ADEPT__TRADITION:
                return tradition != null;
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
                case Shr5Package.MYSTIC_ADEPT__ZAUBER: return Shr5Package.ZAUBERER__ZAUBER;
                case Shr5Package.MYSTIC_ADEPT__ENZUG: return Shr5Package.ZAUBERER__ENZUG;
                case Shr5Package.MYSTIC_ADEPT__GEBUNDENE_GEISTER: return Shr5Package.ZAUBERER__GEBUNDENE_GEISTER;
                case Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST: return Shr5Package.ZAUBERER__UNGEBUNDENER_GEIST;
                case Shr5Package.MYSTIC_ADEPT__TRADITION: return Shr5Package.ZAUBERER__TRADITION;
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
                case Shr5Package.ZAUBERER__ZAUBER: return Shr5Package.MYSTIC_ADEPT__ZAUBER;
                case Shr5Package.ZAUBERER__ENZUG: return Shr5Package.MYSTIC_ADEPT__ENZUG;
                case Shr5Package.ZAUBERER__GEBUNDENE_GEISTER: return Shr5Package.MYSTIC_ADEPT__GEBUNDENE_GEISTER;
                case Shr5Package.ZAUBERER__UNGEBUNDENER_GEIST: return Shr5Package.MYSTIC_ADEPT__UNGEBUNDENER_GEIST;
                case Shr5Package.ZAUBERER__TRADITION: return Shr5Package.MYSTIC_ADEPT__TRADITION;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //MysticAdeptImpl
