/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.SchadensTyp;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.gameplay.DrainCommand;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.shr5.gameplay.dice.W6Dice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drain Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.DrainCommandImpl#getDamage <em>Damage</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.DrainCommandImpl#getDamageType <em>Damage Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrainCommandImpl extends ProbeCommandImpl implements DrainCommand {
    /**
     * The default value of the '{@link #getDamage() <em>Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamage()
     * @generated
     * @ordered
     */
    protected static final int DAMAGE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDamage() <em>Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamage()
     * @generated
     * @ordered
     */
    protected int damage = DAMAGE_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DrainCommandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.DRAIN_COMMAND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getDamage() {
        return damage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDamage(int newDamage) {
        int oldDamage = damage;
        damage = newDamage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.DRAIN_COMMAND__DAMAGE, oldDamage, damage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SchadensTyp getDamageType() {
        return damageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDamageType(SchadensTyp newDamageType) {
        SchadensTyp oldDamageType = damageType;
        damageType = newDamageType == null ? DAMAGE_TYPE_EDEFAULT : newDamageType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.DRAIN_COMMAND__DAMAGE_TYPE, oldDamageType, damageType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.DRAIN_COMMAND__DAMAGE:
                return getDamage();
            case GameplayPackage.DRAIN_COMMAND__DAMAGE_TYPE:
                return getDamageType();
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
            case GameplayPackage.DRAIN_COMMAND__DAMAGE:
                setDamage((Integer)newValue);
                return;
            case GameplayPackage.DRAIN_COMMAND__DAMAGE_TYPE:
                setDamageType((SchadensTyp)newValue);
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
            case GameplayPackage.DRAIN_COMMAND__DAMAGE:
                setDamage(DAMAGE_EDEFAULT);
                return;
            case GameplayPackage.DRAIN_COMMAND__DAMAGE_TYPE:
                setDamageType(DAMAGE_TYPE_EDEFAULT);
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
            case GameplayPackage.DRAIN_COMMAND__DAMAGE:
                return damage != DAMAGE_EDEFAULT;
            case GameplayPackage.DRAIN_COMMAND__DAMAGE_TYPE:
                return damageType != DAMAGE_TYPE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     */
    public void redo() {
        if(!prepareRedo()){
            cleanCommand();
            return;
        }

        RuntimeCharacter character = getSubject();
        AbstraktPersona persona = character.getCharacter().getPersona();
        if (persona instanceof Zauberer) {
            Zauberer spellcaster = (Zauberer)persona;
            int enzug = spellcaster.getEnzug();
            int damage = Math.max(2, getDamage());

            pushTheLimit();
            if (!isSkipTest()) {
                W6Dice w6Dice = new W6Dice();

                int dice = enzug + mods;// getSkill().getStufe() + att + mods;
                List<Integer> probe = w6Dice.probe(dice);
                this.getProbe().addAll(probe);
                this.successes = W6Dice.probeSucsessesShr5(getProbe());
                this.glitches = W6Dice.calcGlitchDice(probe);
            }

            if (getCmdCallback() != null && getSubject().canUseEdge() && !isPushTheLimit())
                getCmdCallback().beforeSubcommands(this, GameplayPackage.Literals.PROBE__SECOND_CHANCE);

            secondChance(getProbe().size());
            this.netHits = getSuccesses() - damage;
            if (netHits < 0) {
                int damageLeft = damage - getSuccesses();
                if (getDamageType() == SchadensTyp.KOERPERLICH)
                    getSubject().setPhysicalDamage(getSubject().getPhysicalDamage() + damageLeft);
                else
                    getSubject().setMentalDamage(getSubject().getMentalDamage() + damageLeft);
            }
        }
        afterRedo();
    }

    /**
     * Set the state and call the callback.
     */
    protected boolean prepareRedo() {
        setExecuting(true);
        if (isSetCmdCallback() && getCmdCallback() != null)
            return cmdCallback.prepareCommand(this, GameplayPackage.Literals.DRAIN_COMMAND__DAMAGE, GameplayPackage.Literals.DRAIN_COMMAND__DAMAGE_TYPE);
        return true;
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
        result.append(" (damage: ");
        result.append(damage);
        result.append(", damageType: ");
        result.append(damageType);
        result.append(')');
        return result.toString();
    }

} // DrainCommandImpl
