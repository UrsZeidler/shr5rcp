/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SubstanceEffect;
import de.urszeidler.eclipse.shr5.Toxin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toxin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ToxinImpl#getPower <em>Power</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ToxinImpl#getPenetration <em>Penetration</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ToxinImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToxinImpl extends SubstanceImpl implements Toxin {
    /**
     * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPower()
     * @generated
     * @ordered
     */
    protected static final int POWER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPower()
     * @generated
     * @ordered
     */
    protected int power = POWER_EDEFAULT;

    /**
     * The default value of the '{@link #getPenetration() <em>Penetration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPenetration()
     * @generated
     * @ordered
     */
    protected static final int PENETRATION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPenetration() <em>Penetration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPenetration()
     * @generated
     * @ordered
     */
    protected int penetration = PENETRATION_EDEFAULT;

    /**
     * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffect()
     * @generated
     * @ordered
     */
    protected EList<SubstanceEffect> effect;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ToxinImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.TOXIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPower() {
        return power;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPower(int newPower) {
        int oldPower = power;
        power = newPower;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.TOXIN__POWER, oldPower, power));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPenetration() {
        return penetration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPenetration(int newPenetration) {
        int oldPenetration = penetration;
        penetration = newPenetration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.TOXIN__PENETRATION, oldPenetration, penetration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SubstanceEffect> getEffect() {
        if (effect == null) {
            effect = new EDataTypeUniqueEList<SubstanceEffect>(SubstanceEffect.class, this, Shr5Package.TOXIN__EFFECT);
        }
        return effect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.TOXIN__POWER:
                return getPower();
            case Shr5Package.TOXIN__PENETRATION:
                return getPenetration();
            case Shr5Package.TOXIN__EFFECT:
                return getEffect();
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
            case Shr5Package.TOXIN__POWER:
                setPower((Integer)newValue);
                return;
            case Shr5Package.TOXIN__PENETRATION:
                setPenetration((Integer)newValue);
                return;
            case Shr5Package.TOXIN__EFFECT:
                getEffect().clear();
                getEffect().addAll((Collection<? extends SubstanceEffect>)newValue);
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
            case Shr5Package.TOXIN__POWER:
                setPower(POWER_EDEFAULT);
                return;
            case Shr5Package.TOXIN__PENETRATION:
                setPenetration(PENETRATION_EDEFAULT);
                return;
            case Shr5Package.TOXIN__EFFECT:
                getEffect().clear();
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
            case Shr5Package.TOXIN__POWER:
                return power != POWER_EDEFAULT;
            case Shr5Package.TOXIN__PENETRATION:
                return penetration != PENETRATION_EDEFAULT;
            case Shr5Package.TOXIN__EFFECT:
                return effect != null && !effect.isEmpty();
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
        result.append(" (power: ");
        result.append(power);
        result.append(", penetration: ");
        result.append(penetration);
        result.append(", effect: ");
        result.append(effect);
        result.append(')');
        return result.toString();
    }

} //ToxinImpl
