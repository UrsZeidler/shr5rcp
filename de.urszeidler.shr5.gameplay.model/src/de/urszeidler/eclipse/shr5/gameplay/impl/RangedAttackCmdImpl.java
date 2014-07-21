/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.FeuerModus;

import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranged Attack Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.RangedAttackCmdImpl#getModus <em>Modus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.RangedAttackCmdImpl#getRange <em>Range</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.RangedAttackCmdImpl#getWeapon <em>Weapon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangedAttackCmdImpl extends OpposedSkillTestCmdImpl implements RangedAttackCmd {
    /**
     * The default value of the '{@link #getModus() <em>Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModus()
     * @generated
     * @ordered
     */
    protected static final FeuerModus MODUS_EDEFAULT = FeuerModus.EM;

    /**
     * The cached value of the '{@link #getModus() <em>Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModus()
     * @generated
     * @ordered
     */
    protected FeuerModus modus = MODUS_EDEFAULT;

    /**
     * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected static final int RANGE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected int range = RANGE_EDEFAULT;

    /**
     * The cached value of the '{@link #getWeapon() <em>Weapon</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeapon()
     * @generated
     * @ordered
     */
    protected AbstaktFernKampfwaffe weapon;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RangedAttackCmdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.RANGED_ATTACK_CMD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeuerModus getModus() {
        return modus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModus(FeuerModus newModus) {
        FeuerModus oldModus = modus;
        modus = newModus == null ? MODUS_EDEFAULT : newModus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.RANGED_ATTACK_CMD__MODUS, oldModus, modus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRange() {
        return range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRange(int newRange) {
        int oldRange = range;
        range = newRange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.RANGED_ATTACK_CMD__RANGE, oldRange, range));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstaktFernKampfwaffe getWeapon() {
        if (weapon != null && weapon.eIsProxy()) {
            InternalEObject oldWeapon = (InternalEObject)weapon;
            weapon = (AbstaktFernKampfwaffe)eResolveProxy(oldWeapon);
            if (weapon != oldWeapon) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.RANGED_ATTACK_CMD__WEAPON, oldWeapon, weapon));
            }
        }
        return weapon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstaktFernKampfwaffe basicGetWeapon() {
        return weapon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWeapon(AbstaktFernKampfwaffe newWeapon) {
        AbstaktFernKampfwaffe oldWeapon = weapon;
        weapon = newWeapon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.RANGED_ATTACK_CMD__WEAPON, oldWeapon, weapon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.RANGED_ATTACK_CMD__MODUS:
                return getModus();
            case GameplayPackage.RANGED_ATTACK_CMD__RANGE:
                return getRange();
            case GameplayPackage.RANGED_ATTACK_CMD__WEAPON:
                if (resolve) return getWeapon();
                return basicGetWeapon();
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
            case GameplayPackage.RANGED_ATTACK_CMD__MODUS:
                setModus((FeuerModus)newValue);
                return;
            case GameplayPackage.RANGED_ATTACK_CMD__RANGE:
                setRange((Integer)newValue);
                return;
            case GameplayPackage.RANGED_ATTACK_CMD__WEAPON:
                setWeapon((AbstaktFernKampfwaffe)newValue);
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
            case GameplayPackage.RANGED_ATTACK_CMD__MODUS:
                setModus(MODUS_EDEFAULT);
                return;
            case GameplayPackage.RANGED_ATTACK_CMD__RANGE:
                setRange(RANGE_EDEFAULT);
                return;
            case GameplayPackage.RANGED_ATTACK_CMD__WEAPON:
                setWeapon((AbstaktFernKampfwaffe)null);
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
            case GameplayPackage.RANGED_ATTACK_CMD__MODUS:
                return modus != MODUS_EDEFAULT;
            case GameplayPackage.RANGED_ATTACK_CMD__RANGE:
                return range != RANGE_EDEFAULT;
            case GameplayPackage.RANGED_ATTACK_CMD__WEAPON:
                return weapon != null;
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
        result.append(" (modus: ");
        result.append(modus);
        result.append(", range: ");
        result.append(range);
        result.append(')');
        return result.toString();
    }

} //RangedAttackCmdImpl
