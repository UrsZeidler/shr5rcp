/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fernkampfwaffe Modifikator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FernkampfwaffeModifikatorImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FernkampfwaffeModifikatorImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FernkampfwaffeModifikatorImpl#getWertValue <em>Wert Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FernkampfwaffeModifikatorImpl#getEp <em>Ep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FernkampfwaffeModifikatorImpl extends AbstraktModifikatorenImpl implements FernkampfwaffeModifikator {
	/**
     * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWert()
     * @generated
     * @ordered
     */
    protected static final BigDecimal WERT_EDEFAULT = null;

    /**
     * The default value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerfuegbarkeit()
     * @generated
     * @ordered
     */
    protected static final String VERFUEGBARKEIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerfuegbarkeit()
     * @generated
     * @ordered
     */
    protected String verfuegbarkeit = VERFUEGBARKEIT_EDEFAULT;

    /**
     * The default value of the '{@link #getWertValue() <em>Wert Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWertValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal WERT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWertValue() <em>Wert Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWertValue()
     * @generated
     * @ordered
     */
    protected BigDecimal wertValue = WERT_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getEp() <em>Ep</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEp()
     * @generated
     * @ordered
     */
	protected static final FeuwerwaffenErweiterung EP_EDEFAULT = FeuwerwaffenErweiterung.LAUF;

	/**
     * The cached value of the '{@link #getEp() <em>Ep</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEp()
     * @generated
     * @ordered
     */
	protected FeuwerwaffenErweiterung ep = EP_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FernkampfwaffeModifikatorImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.FERNKAMPFWAFFE_MODIFIKATOR;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public BigDecimal getWert() {
        return getWertValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVerfuegbarkeit(String newVerfuegbarkeit) {
        String oldVerfuegbarkeit = verfuegbarkeit;
        verfuegbarkeit = newVerfuegbarkeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getWertValue() {
        return wertValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWertValue(BigDecimal newWertValue) {
        BigDecimal oldWertValue = wertValue;
        wertValue = newWertValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT_VALUE, oldWertValue, wertValue));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public FeuwerwaffenErweiterung getEp() {
        return ep;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setEp(FeuwerwaffenErweiterung newEp) {
        FeuwerwaffenErweiterung oldEp = ep;
        ep = newEp == null ? EP_EDEFAULT : newEp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP, oldEp, ep));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT:
                return getWert();
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT_VALUE:
                return getWertValue();
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP:
                return getEp();
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
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT_VALUE:
                setWertValue((BigDecimal)newValue);
                return;
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP:
                setEp((FeuwerwaffenErweiterung)newValue);
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
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT_VALUE:
                setWertValue(WERT_VALUE_EDEFAULT);
                return;
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP:
                setEp(EP_EDEFAULT);
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
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT:
                return WERT_EDEFAULT == null ? getWert() != null : !WERT_EDEFAULT.equals(getWert());
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT_VALUE:
                return WERT_VALUE_EDEFAULT == null ? wertValue != null : !WERT_VALUE_EDEFAULT.equals(wertValue);
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP:
                return ep != EP_EDEFAULT;
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
        if (baseClass == GeldWert.class) {
            switch (derivedFeatureID) {
                case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT: return Shr5Package.GELD_WERT__WERT;
                case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__VERFUEGBARKEIT: return Shr5Package.GELD_WERT__VERFUEGBARKEIT;
                case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT_VALUE: return Shr5Package.GELD_WERT__WERT_VALUE;
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
        if (baseClass == GeldWert.class) {
            switch (baseFeatureID) {
                case Shr5Package.GELD_WERT__WERT: return Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT;
                case Shr5Package.GELD_WERT__VERFUEGBARKEIT: return Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__VERFUEGBARKEIT;
                case Shr5Package.GELD_WERT__WERT_VALUE: return Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__WERT_VALUE;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (verfuegbarkeit: ");
        result.append(verfuegbarkeit);
        result.append(", wertValue: ");
        result.append(wertValue);
        result.append(", ep: ");
        result.append(ep);
        result.append(')');
        return result.toString();
    }

} //FernkampfwaffeModifikatorImpl
