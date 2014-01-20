/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5.Lifestyle;

import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifestyle To Start Money</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifestyleToStartMoneyImpl#getNumberOfW <em>Number Of W</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifestyleToStartMoneyImpl#getMoneyFactor <em>Money Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifestyleToStartMoneyImpl#getLifeStyles <em>Life Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifestyleToStartMoneyImpl extends MinimalEObjectImpl.Container implements LifestyleToStartMoney {
    /**
     * The default value of the '{@link #getNumberOfW() <em>Number Of W</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfW()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_OF_W_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumberOfW() <em>Number Of W</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfW()
     * @generated
     * @ordered
     */
    protected int numberOfW = NUMBER_OF_W_EDEFAULT;

    /**
     * The default value of the '{@link #getMoneyFactor() <em>Money Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMoneyFactor()
     * @generated
     * @ordered
     */
    protected static final int MONEY_FACTOR_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMoneyFactor() <em>Money Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMoneyFactor()
     * @generated
     * @ordered
     */
    protected int moneyFactor = MONEY_FACTOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getLifeStyles() <em>Life Styles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifeStyles()
     * @generated
     * @ordered
     */
    protected EList<Lifestyle> lifeStyles;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LifestyleToStartMoneyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.LIFESTYLE_TO_START_MONEY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getNumberOfW() {
        return numberOfW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNumberOfW(int newNumberOfW) {
        int oldNumberOfW = numberOfW;
        numberOfW = newNumberOfW;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.LIFESTYLE_TO_START_MONEY__NUMBER_OF_W, oldNumberOfW, numberOfW));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMoneyFactor() {
        return moneyFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMoneyFactor(int newMoneyFactor) {
        int oldMoneyFactor = moneyFactor;
        moneyFactor = newMoneyFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.LIFESTYLE_TO_START_MONEY__MONEY_FACTOR, oldMoneyFactor, moneyFactor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Lifestyle> getLifeStyles() {
        if (lifeStyles == null) {
            lifeStyles = new EObjectResolvingEList<Lifestyle>(Lifestyle.class, this, Shr5managementPackage.LIFESTYLE_TO_START_MONEY__LIFE_STYLES);
        }
        return lifeStyles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__NUMBER_OF_W:
                return getNumberOfW();
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__MONEY_FACTOR:
                return getMoneyFactor();
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__LIFE_STYLES:
                return getLifeStyles();
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
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__NUMBER_OF_W:
                setNumberOfW((Integer)newValue);
                return;
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__MONEY_FACTOR:
                setMoneyFactor((Integer)newValue);
                return;
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__LIFE_STYLES:
                getLifeStyles().clear();
                getLifeStyles().addAll((Collection<? extends Lifestyle>)newValue);
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
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__NUMBER_OF_W:
                setNumberOfW(NUMBER_OF_W_EDEFAULT);
                return;
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__MONEY_FACTOR:
                setMoneyFactor(MONEY_FACTOR_EDEFAULT);
                return;
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__LIFE_STYLES:
                getLifeStyles().clear();
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
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__NUMBER_OF_W:
                return numberOfW != NUMBER_OF_W_EDEFAULT;
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__MONEY_FACTOR:
                return moneyFactor != MONEY_FACTOR_EDEFAULT;
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__LIFE_STYLES:
                return lifeStyles != null && !lifeStyles.isEmpty();
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
        result.append(" (numberOfW: ");
        result.append(numberOfW);
        result.append(", moneyFactor: ");
        result.append(moneyFactor);
        result.append(')');
        return result.toString();
    }

} //LifestyleToStartMoneyImpl
