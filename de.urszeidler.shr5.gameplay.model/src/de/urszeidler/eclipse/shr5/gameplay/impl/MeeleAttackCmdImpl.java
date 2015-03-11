/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools.DamageCode;
import de.urszeidler.shr5.gameplay.dice.W6Dice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meele Attack Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.MeeleAttackCmdImpl#getWeapon <em>Weapon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeeleAttackCmdImpl extends OpposedSkillTestCmdImpl implements MeeleAttackCmd {
    /**
     * The cached value of the '{@link #getWeapon() <em>Weapon</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeapon()
     * @generated
     * @ordered
     */
    protected Nahkampfwaffe weapon;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeeleAttackCmdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.MEELE_ATTACK_CMD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Nahkampfwaffe getWeapon() {
        if (weapon != null && weapon.eIsProxy()) {
            InternalEObject oldWeapon = (InternalEObject)weapon;
            weapon = (Nahkampfwaffe)eResolveProxy(oldWeapon);
            if (weapon != oldWeapon) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.MEELE_ATTACK_CMD__WEAPON, oldWeapon, weapon));
            }
        }
        return weapon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Nahkampfwaffe basicGetWeapon() {
        return weapon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setWeapon(Nahkampfwaffe newWeapon) {
        Nahkampfwaffe oldWeapon = weapon;
        weapon = newWeapon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.MEELE_ATTACK_CMD__WEAPON, oldWeapon, weapon));
        if(weapon!=null){
            if(weapon.getFertigkeit()!=null)
                setSkill(weapon.getFertigkeit());
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.MEELE_ATTACK_CMD__WEAPON:
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
            case GameplayPackage.MEELE_ATTACK_CMD__WEAPON:
                setWeapon((Nahkampfwaffe)newValue);
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
            case GameplayPackage.MEELE_ATTACK_CMD__WEAPON:
                setWeapon((Nahkampfwaffe)null);
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
            case GameplayPackage.MEELE_ATTACK_CMD__WEAPON:
                return weapon != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * Set the state and call the callback.
     */
    protected boolean prepareRedo() {
        getProbe().clear();
        getProbeMods().clear();
        setExecuting(true);
        mods = mods + GameplayTools.getWoundMod(getSubject(), getProbeMods());
        mods = mods + GameplayTools.getMeleeCombatMod(getSubject(), getProbeMods());

        if (getWeapon() != null) {
            Fertigkeit fertigkeit = getWeapon().getFertigkeit();
            setSkill(fertigkeit);
            setLimit(getWeapon().getPraezision());
        }
        if (isSetCmdCallback() && getCmdCallback() != null)
            return getCmdCallback().prepareCommand(this, GameplayPackage.Literals.PROBE_COMMAND__MODS, GameplayPackage.Literals.MEELE_ATTACK_CMD__WEAPON ,GameplayPackage.Literals.SKILL_TEST_CMD__SKILL,
                    GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD__OBJECT, GameplayPackage.Literals.PROBE__PUSH_THE_LIMIT);
        return true;
    }

    @Override
    protected void afterRedo() {
        super.afterRedo();
        if (isCloseCall())
            GameplayTools.increaseEdgeValue(getSubject(), 1);
    }

    @Override
    public void redo() {
        if(!prepareRedo()){
            cleanCommand();
            return;
        }

        pushTheLimit();
        if (!isSkipTest()) {
            W6Dice w6Dice = new W6Dice();

            int dice = GameplayTools.getSkillDicePool(getSkill(), getSubject()) + mods;// getSkill().getStufe() + att + mods;
            List<Integer> probe = w6Dice.probe(dice);
            this.getProbe().addAll(probe);
            // if(isSetLimit())
            this.successes = isSetLimit() ? Math.min(limit, W6Dice.probeSucsessesShr5(getProbe())) : W6Dice.probeSucsessesShr5(getProbe());
            this.glitches = W6Dice.calcGlitchDice(probe);
        }

        if (getCmdCallback() != null)
            getCmdCallback().beforeSubcommands(this, GameplayPackage.Literals.SUCCES_TEST__NET_HITS, GameplayPackage.Literals.SKILL_TEST_CMD__SKILL,
                    GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD__OBJECT, GameplayPackage.Literals.PROBE__SECOND_CHANCE);

        secondChance(getProbe().size());
        this.netHits = getSuccesses() - thresholds;
        if (netHits > 0) {
            DefensTestCmd defensTestCmd = GameplayFactory.eINSTANCE.createDefensTestCmd();
            defensTestCmd.setSubject(getObject());
            defensTestCmd.setCmdCallback(getCmdCallback());
            defensTestCmd.setDate(getDate());
            defensTestCmd.setAttackersHits(netHits);
            defensTestCmd.setMods(defensTestCmd.getMods()
                    + GameplayTools.getMeleeReachMod(getSubject(), getWeapon(), getObject(), defensTestCmd.getProbeMods()));
            getSubCommands().add(defensTestCmd);
            defensTestCmd.redo();

            if (defensTestCmd.getNetHits() < 0) {
                DamageTest damageTest = GameplayFactory.eINSTANCE.createDamageTest();
                defensTestCmd.getSubCommands().add(damageTest);
                damageTest.setSubject(getObject());
                damageTest.setCmdCallback(getCmdCallback());
                damageTest.setDate(getDate());
                damageTest.setDv(weapon.getDurchschlagsKraft());
                // DamageCode damageCode = ShadowrunTools.parseDamageCode(weapon.getSchadenscode());
                DamageCode damageCode = ShadowrunTools.parseDamageCode(weapon.getSchadenscode(), getSubject().getCharacter().getPersona());
                if (damageCode != null) {
                    int d = damageCode.getPower() - defensTestCmd.getNetHits();
                    damageTest.setDamage(new DamageCode(d, damageCode.getType()).toString());
                    // damageTest.setDamage(damageCode.toString());
                }
                getSubCommands().add(damageTest);
                damageTest.redo();
            }
        }

        afterRedo();
    }
} // MeeleAttackCmdImpl
