/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SoftwareAgent;
import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SoftwareAgentImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SoftwareAgentImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SoftwareAgentImpl#getWertValue <em>Wert Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SoftwareAgentImpl#getRating <em>Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareAgentImpl extends MinimalEObjectImpl.Container implements SoftwareAgent {
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
     * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRating()
     * @generated
     * @ordered
     */
    protected static final int RATING_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRating()
     * @generated
     * @ordered
     */
    protected int rating = RATING_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SoftwareAgentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.SOFTWARE_AGENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getWert() {
        // TODO: implement this method to return the 'Wert' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SOFTWARE_AGENT__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getWertValue() {
        return wertValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWertValue(BigDecimal newWertValue) {
        BigDecimal oldWertValue = wertValue;
        wertValue = newWertValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SOFTWARE_AGENT__WERT_VALUE, oldWertValue, wertValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRating() {
        return rating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRating(int newRating) {
        int oldRating = rating;
        rating = newRating;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SOFTWARE_AGENT__RATING, oldRating, rating));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.SOFTWARE_AGENT__WERT:
                return getWert();
            case Shr5Package.SOFTWARE_AGENT__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5Package.SOFTWARE_AGENT__WERT_VALUE:
                return getWertValue();
            case Shr5Package.SOFTWARE_AGENT__RATING:
                return getRating();
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
            case Shr5Package.SOFTWARE_AGENT__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5Package.SOFTWARE_AGENT__WERT_VALUE:
                setWertValue((BigDecimal)newValue);
                return;
            case Shr5Package.SOFTWARE_AGENT__RATING:
                setRating((Integer)newValue);
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
            case Shr5Package.SOFTWARE_AGENT__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5Package.SOFTWARE_AGENT__WERT_VALUE:
                setWertValue(WERT_VALUE_EDEFAULT);
                return;
            case Shr5Package.SOFTWARE_AGENT__RATING:
                setRating(RATING_EDEFAULT);
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
            case Shr5Package.SOFTWARE_AGENT__WERT:
                return WERT_EDEFAULT == null ? getWert() != null : !WERT_EDEFAULT.equals(getWert());
            case Shr5Package.SOFTWARE_AGENT__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5Package.SOFTWARE_AGENT__WERT_VALUE:
                return WERT_VALUE_EDEFAULT == null ? wertValue != null : !WERT_VALUE_EDEFAULT.equals(wertValue);
            case Shr5Package.SOFTWARE_AGENT__RATING:
                return rating != RATING_EDEFAULT;
        }
        return super.eIsSet(featureID);
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
        result.append(" (verfuegbarkeit: ");
        result.append(verfuegbarkeit);
        result.append(", wertValue: ");
        result.append(wertValue);
        result.append(", rating: ");
        result.append(rating);
        result.append(')');
        return result.toString();
    }

} //SoftwareAgentImpl
