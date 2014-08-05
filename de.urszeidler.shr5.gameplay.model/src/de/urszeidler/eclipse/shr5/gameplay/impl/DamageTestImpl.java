/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.util.List;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.SchadensTyp;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools.DamageCode;
import de.urszeidler.shr5.gameplay.dice.W6Dice;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Damage Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.DamageTestImpl#getDamage <em>Damage</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.DamageTestImpl#getDv <em>Dv</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.DamageTestImpl#getEffectiveDamage <em>Effective Damage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DamageTestImpl extends ProbeCommandImpl implements DamageTest {
    /**
     * The default value of the '{@link #getDamage() <em>Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamage()
     * @generated
     * @ordered
     */
    protected static final String DAMAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDamage() <em>Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamage()
     * @generated
     * @ordered
     */
    protected String damage = DAMAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getDv() <em>Dv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDv()
     * @generated
     * @ordered
     */
    protected static final int DV_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDv() <em>Dv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDv()
     * @generated
     * @ordered
     */
    protected int dv = DV_EDEFAULT;

    /**
     * The default value of the '{@link #getEffectiveDamage() <em>Effective Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffectiveDamage()
     * @generated
     * @ordered
     */
    protected static final String EFFECTIVE_DAMAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEffectiveDamage() <em>Effective Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffectiveDamage()
     * @generated
     * @ordered
     */
    protected String effectiveDamage = EFFECTIVE_DAMAGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DamageTestImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.DAMAGE_TEST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDamage() {
        return damage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDamage(String newDamage) {
        String oldDamage = damage;
        damage = newDamage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.DAMAGE_TEST__DAMAGE, oldDamage, damage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDv() {
        return dv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDv(int newDv) {
        int oldDv = dv;
        dv = newDv;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.DAMAGE_TEST__DV, oldDv, dv));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEffectiveDamage() {
        return effectiveDamage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.DAMAGE_TEST__DAMAGE:
                return getDamage();
            case GameplayPackage.DAMAGE_TEST__DV:
                return getDv();
            case GameplayPackage.DAMAGE_TEST__EFFECTIVE_DAMAGE:
                return getEffectiveDamage();
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
            case GameplayPackage.DAMAGE_TEST__DAMAGE:
                setDamage((String)newValue);
                return;
            case GameplayPackage.DAMAGE_TEST__DV:
                setDv((Integer)newValue);
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
            case GameplayPackage.DAMAGE_TEST__DAMAGE:
                setDamage(DAMAGE_EDEFAULT);
                return;
            case GameplayPackage.DAMAGE_TEST__DV:
                setDv(DV_EDEFAULT);
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
            case GameplayPackage.DAMAGE_TEST__DAMAGE:
                return DAMAGE_EDEFAULT == null ? damage != null : !DAMAGE_EDEFAULT.equals(damage);
            case GameplayPackage.DAMAGE_TEST__DV:
                return dv != DV_EDEFAULT;
            case GameplayPackage.DAMAGE_TEST__EFFECTIVE_DAMAGE:
                return EFFECTIVE_DAMAGE_EDEFAULT == null ? effectiveDamage != null : !EFFECTIVE_DAMAGE_EDEFAULT.equals(effectiveDamage);
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
        result.append(" (damage: ");
        result.append(damage);
        result.append(", dv: ");
        result.append(dv);
        result.append(", effectiveDamage: ");
        result.append(effectiveDamage);
        result.append(')');
        return result.toString();
    }

    @Override
    public void redo() {
        executing = true;

        getProbe().clear();
        if (isSetCmdCallback()&& getCmdCallback() != null)
            cmdCallback.prepareCommand(this, GameplayPackage.Literals.PROBE_COMMAND__MODS);

        AbstraktPersona persona = getSubject().getCharacter().getPersona();
        int armor = 0;
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            armor = armor + kp.getPanzer();
        }
        Kleidung k = getSubject().getArmor();
        if (k != null)
            armor = armor + k.getRuestung();

        DamageCode damageCode = ShadowrunTools.parseDamageCode(getDamage());
        int modArmor = armor + getDv();
        SchadensTyp type;
        if (damageCode.getPower() < modArmor && damageCode.getType() == SchadensTyp.KOERPERLICH)
            type = SchadensTyp.GEISTIG;
        else
            type = damageCode.getType();

        W6Dice w6Dice = new W6Dice();

        int dicePool = persona.getKonstitution() //
                + persona.getModManager().getmodWert(Shr5Package.Literals.PROBEN_MODIFIKATOREN__SCHADENSWIEDERSTAND) //
                + Math.max(0, modArmor);
        int dice = dicePool + mods;
        this.thresholds = 0;// attackersHits;

        List<Integer> probe = w6Dice.probe(dice);
        this.getProbe().addAll(probe);
        this.successes = W6Dice.probeSucsessesShr5(probe);
        this.glitches = W6Dice.calcGlitchDice(probe);
        this.netHits = getSuccesses();

        int damageLeft = damageCode.getPower() - getSuccesses();
        if (damageLeft > 0) {
            effectiveDamage = new DamageCode(damageLeft, type).toString();
            
            if (type == SchadensTyp.KOERPERLICH)
                getSubject().setPhysicalDamage(getSubject().getPhysicalDamage() + damageLeft);
            else
                getSubject().setMentalDamage(getSubject().getMentalDamage() + damageLeft);
        }

        executed = true;
        executing = false;
        if (isSetCmdCallback()&& getCmdCallback() != null)
            cmdCallback.afterCommand(this, GameplayPackage.Literals.PROBE_COMMAND__MODS);

    }

} // DamageTestImpl
