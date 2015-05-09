/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Menge;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Wurfwaffe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wurfwaffe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.WurfwaffeImpl#getAnzahl <em>Anzahl</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.WurfwaffeImpl#getProAnzahl <em>Pro Anzahl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WurfwaffeImpl extends AbstaktFernKampfwaffeImpl implements Wurfwaffe {
	/**
     * The default value of the '{@link #getAnzahl() <em>Anzahl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnzahl()
     * @generated
     * @ordered
     */
    protected static final int ANZAHL_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getAnzahl() <em>Anzahl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnzahl()
     * @generated
     * @ordered
     */
    protected int anzahl = ANZAHL_EDEFAULT;
    /**
     * The default value of the '{@link #getProAnzahl() <em>Pro Anzahl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProAnzahl()
     * @generated
     * @ordered
     */
    protected static final int PRO_ANZAHL_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getProAnzahl() <em>Pro Anzahl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProAnzahl()
     * @generated
     * @ordered
     */
    protected int proAnzahl = PRO_ANZAHL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected WurfwaffeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.WURFWAFFE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAnzahl() {
        return anzahl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnzahl(int newAnzahl) {
        int oldAnzahl = anzahl;
        anzahl = newAnzahl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.WURFWAFFE__ANZAHL, oldAnzahl, anzahl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getProAnzahl() {
        return proAnzahl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProAnzahl(int newProAnzahl) {
        int oldProAnzahl = proAnzahl;
        proAnzahl = newProAnzahl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.WURFWAFFE__PRO_ANZAHL, oldProAnzahl, proAnzahl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.WURFWAFFE__ANZAHL:
                return getAnzahl();
            case Shr5Package.WURFWAFFE__PRO_ANZAHL:
                return getProAnzahl();
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
            case Shr5Package.WURFWAFFE__ANZAHL:
                setAnzahl((Integer)newValue);
                return;
            case Shr5Package.WURFWAFFE__PRO_ANZAHL:
                setProAnzahl((Integer)newValue);
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
            case Shr5Package.WURFWAFFE__ANZAHL:
                setAnzahl(ANZAHL_EDEFAULT);
                return;
            case Shr5Package.WURFWAFFE__PRO_ANZAHL:
                setProAnzahl(PRO_ANZAHL_EDEFAULT);
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
            case Shr5Package.WURFWAFFE__ANZAHL:
                return anzahl != ANZAHL_EDEFAULT;
            case Shr5Package.WURFWAFFE__PRO_ANZAHL:
                return proAnzahl != PRO_ANZAHL_EDEFAULT;
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
        if (baseClass == Menge.class) {
            switch (derivedFeatureID) {
                case Shr5Package.WURFWAFFE__ANZAHL: return Shr5Package.MENGE__ANZAHL;
                case Shr5Package.WURFWAFFE__PRO_ANZAHL: return Shr5Package.MENGE__PRO_ANZAHL;
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
        if (baseClass == Menge.class) {
            switch (baseFeatureID) {
                case Shr5Package.MENGE__ANZAHL: return Shr5Package.WURFWAFFE__ANZAHL;
                case Shr5Package.MENGE__PRO_ANZAHL: return Shr5Package.WURFWAFFE__PRO_ANZAHL;
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
        result.append(" (anzahl: ");
        result.append(anzahl);
        result.append(", proAnzahl: ");
        result.append(proAnzahl);
        result.append(')');
        return result.toString();
    }

} //WurfwaffeImpl
