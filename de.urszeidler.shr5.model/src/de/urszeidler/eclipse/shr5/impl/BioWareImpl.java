/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.BioWare;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bio Ware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.BioWareImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.BioWareImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.BioWareImpl#getPersona <em>Persona</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BioWareImpl extends KoerpermodsImpl implements BioWare {
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
     * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWert()
     * @generated
     * @ordered
     */
	protected BigDecimal wert = WERT_EDEFAULT;

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
     * The cached value of the '{@link #getPersona() <em>Persona</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPersona()
     * @generated
     * @ordered
     */
	protected AbstraktPersona persona;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BioWareImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.BIO_WARE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BigDecimal getWert() {
        return wert;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWert(BigDecimal newWert) {
        BigDecimal oldWert = wert;
        wert = newWert;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.BIO_WARE__WERT, oldWert, wert));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVerfuegbarkeit(String newVerfuegbarkeit) {
        String oldVerfuegbarkeit = verfuegbarkeit;
        verfuegbarkeit = newVerfuegbarkeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.BIO_WARE__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AbstraktPersona getPersona() {
        if (persona != null && persona.eIsProxy()) {
            InternalEObject oldPersona = (InternalEObject)persona;
            persona = (AbstraktPersona)eResolveProxy(oldPersona);
            if (persona != oldPersona) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.BIO_WARE__PERSONA, oldPersona, persona));
            }
        }
        return persona;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AbstraktPersona basicGetPersona() {
        return persona;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPersona(AbstraktPersona newPersona) {
        AbstraktPersona oldPersona = persona;
        persona = newPersona;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.BIO_WARE__PERSONA, oldPersona, persona));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.BIO_WARE__WERT:
                return getWert();
            case Shr5Package.BIO_WARE__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5Package.BIO_WARE__PERSONA:
                if (resolve) return getPersona();
                return basicGetPersona();
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
            case Shr5Package.BIO_WARE__WERT:
                setWert((BigDecimal)newValue);
                return;
            case Shr5Package.BIO_WARE__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5Package.BIO_WARE__PERSONA:
                setPersona((AbstraktPersona)newValue);
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
            case Shr5Package.BIO_WARE__WERT:
                setWert(WERT_EDEFAULT);
                return;
            case Shr5Package.BIO_WARE__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5Package.BIO_WARE__PERSONA:
                setPersona((AbstraktPersona)null);
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
            case Shr5Package.BIO_WARE__WERT:
                return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
            case Shr5Package.BIO_WARE__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5Package.BIO_WARE__PERSONA:
                return persona != null;
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
                case Shr5Package.BIO_WARE__WERT: return Shr5Package.GELD_WERT__WERT;
                case Shr5Package.BIO_WARE__VERFUEGBARKEIT: return Shr5Package.GELD_WERT__VERFUEGBARKEIT;
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
                case Shr5Package.GELD_WERT__WERT: return Shr5Package.BIO_WARE__WERT;
                case Shr5Package.GELD_WERT__VERFUEGBARKEIT: return Shr5Package.BIO_WARE__VERFUEGBARKEIT;
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
        result.append(" (wert: ");
        result.append(wert);
        result.append(", verfuegbarkeit: ");
        result.append(verfuegbarkeit);
        result.append(')');
        return result.toString();
    }

} //BioWareImpl
