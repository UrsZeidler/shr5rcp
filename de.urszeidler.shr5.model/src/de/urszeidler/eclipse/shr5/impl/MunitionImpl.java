/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Menge;
import de.urszeidler.eclipse.shr5.Munition;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.SchadensTyp;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Munition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MunitionImpl#getAnzahl <em>Anzahl</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MunitionImpl#getProAnzahl <em>Pro Anzahl</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MunitionImpl#getDamageType <em>Damage Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MunitionImpl#getDamageMod <em>Damage Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MunitionImpl#getArmorMod <em>Armor Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MunitionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MunitionImpl extends AbstraktGegenstandImpl implements Munition {
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
     * The default value of the '{@link #getDamageType() <em>Damage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamageType()
     * @generated
     * @ordered
     */
    protected static final SchadensTyp DAMAGE_TYPE_EDEFAULT = SchadensTyp.KOERPERLICH;

    /**
     * The cached value of the '{@link #getDamageType() <em>Damage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamageType()
     * @generated
     * @ordered
     */
    protected SchadensTyp damageType = DAMAGE_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getDamageMod() <em>Damage Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamageMod()
     * @generated
     * @ordered
     */
    protected static final int DAMAGE_MOD_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDamageMod() <em>Damage Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamageMod()
     * @generated
     * @ordered
     */
    protected int damageMod = DAMAGE_MOD_EDEFAULT;

    /**
     * The default value of the '{@link #getArmorMod() <em>Armor Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArmorMod()
     * @generated
     * @ordered
     */
    protected static final int ARMOR_MOD_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getArmorMod() <em>Armor Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArmorMod()
     * @generated
     * @ordered
     */
    protected int armorMod = ARMOR_MOD_EDEFAULT;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected Reichweite type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MunitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.MUNITION;
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
     * @generated not
     */
    public void setAnzahl(int newAnzahl) {
        int oldAnzahl = anzahl;
        anzahl = newAnzahl;
        if (eNotificationRequired()){
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MUNITION__ANZAHL, oldAnzahl, anzahl));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MUNITION__WERT, oldAnzahl, anzahl));
        }}

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
     * @generated not
     */
    public void setProAnzahl(int newProAnzahl) {
        int oldProAnzahl = proAnzahl;
        proAnzahl = newProAnzahl;
        if (eNotificationRequired()){
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MUNITION__PRO_ANZAHL, oldProAnzahl, proAnzahl));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MUNITION__WERT, oldProAnzahl, proAnzahl));
        }}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchadensTyp getDamageType() {
        return damageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDamageType(SchadensTyp newDamageType) {
        SchadensTyp oldDamageType = damageType;
        damageType = newDamageType == null ? DAMAGE_TYPE_EDEFAULT : newDamageType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MUNITION__DAMAGE_TYPE, oldDamageType, damageType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDamageMod() {
        return damageMod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDamageMod(int newDamageMod) {
        int oldDamageMod = damageMod;
        damageMod = newDamageMod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MUNITION__DAMAGE_MOD, oldDamageMod, damageMod));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getArmorMod() {
        return armorMod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArmorMod(int newArmorMod) {
        int oldArmorMod = armorMod;
        armorMod = newArmorMod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MUNITION__ARMOR_MOD, oldArmorMod, armorMod));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public BigDecimal getWert() {
        if (getProAnzahl() == 0)
            return new BigDecimal(0);

        if (getWertValue() == null)
            return null;

        BigDecimal bigDecimal = new BigDecimal(getAnzahl());
        BigDecimal factor = bigDecimal.divide(new BigDecimal(getProAnzahl()),BigDecimal.ROUND_HALF_EVEN);

        return getWertValue().multiply(factor).setScale(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Reichweite getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (Reichweite)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.MUNITION__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Reichweite basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(Reichweite newType) {
        Reichweite oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MUNITION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.MUNITION__ANZAHL:
                return getAnzahl();
            case Shr5Package.MUNITION__PRO_ANZAHL:
                return getProAnzahl();
            case Shr5Package.MUNITION__DAMAGE_TYPE:
                return getDamageType();
            case Shr5Package.MUNITION__DAMAGE_MOD:
                return getDamageMod();
            case Shr5Package.MUNITION__ARMOR_MOD:
                return getArmorMod();
            case Shr5Package.MUNITION__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case Shr5Package.MUNITION__ANZAHL:
                setAnzahl((Integer)newValue);
                return;
            case Shr5Package.MUNITION__PRO_ANZAHL:
                setProAnzahl((Integer)newValue);
                return;
            case Shr5Package.MUNITION__DAMAGE_TYPE:
                setDamageType((SchadensTyp)newValue);
                return;
            case Shr5Package.MUNITION__DAMAGE_MOD:
                setDamageMod((Integer)newValue);
                return;
            case Shr5Package.MUNITION__ARMOR_MOD:
                setArmorMod((Integer)newValue);
                return;
            case Shr5Package.MUNITION__TYPE:
                setType((Reichweite)newValue);
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
            case Shr5Package.MUNITION__ANZAHL:
                setAnzahl(ANZAHL_EDEFAULT);
                return;
            case Shr5Package.MUNITION__PRO_ANZAHL:
                setProAnzahl(PRO_ANZAHL_EDEFAULT);
                return;
            case Shr5Package.MUNITION__DAMAGE_TYPE:
                setDamageType(DAMAGE_TYPE_EDEFAULT);
                return;
            case Shr5Package.MUNITION__DAMAGE_MOD:
                setDamageMod(DAMAGE_MOD_EDEFAULT);
                return;
            case Shr5Package.MUNITION__ARMOR_MOD:
                setArmorMod(ARMOR_MOD_EDEFAULT);
                return;
            case Shr5Package.MUNITION__TYPE:
                setType((Reichweite)null);
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
            case Shr5Package.MUNITION__ANZAHL:
                return anzahl != ANZAHL_EDEFAULT;
            case Shr5Package.MUNITION__PRO_ANZAHL:
                return proAnzahl != PRO_ANZAHL_EDEFAULT;
            case Shr5Package.MUNITION__DAMAGE_TYPE:
                return damageType != DAMAGE_TYPE_EDEFAULT;
            case Shr5Package.MUNITION__DAMAGE_MOD:
                return damageMod != DAMAGE_MOD_EDEFAULT;
            case Shr5Package.MUNITION__ARMOR_MOD:
                return armorMod != ARMOR_MOD_EDEFAULT;
            case Shr5Package.MUNITION__TYPE:
                return type != null;
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
                case Shr5Package.MUNITION__ANZAHL: return Shr5Package.MENGE__ANZAHL;
                case Shr5Package.MUNITION__PRO_ANZAHL: return Shr5Package.MENGE__PRO_ANZAHL;
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
                case Shr5Package.MENGE__ANZAHL: return Shr5Package.MUNITION__ANZAHL;
                case Shr5Package.MENGE__PRO_ANZAHL: return Shr5Package.MUNITION__PRO_ANZAHL;
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
        result.append(", damageType: ");
        result.append(damageType);
        result.append(", damageMod: ");
        result.append(damageMod);
        result.append(", armorMod: ");
        result.append(armorMod);
        result.append(')');
        return result.toString();
    }

} // MunitionImpl
