/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.util.List;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.shr5.gameplay.dice.W6Dice;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meele Attack Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.MeeleAttackCmdImpl#getWeapon <em>Weapon</em>}</li>
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
     * 
     * @see #getWeapon()
     * @generated
     * @ordered
     */
    protected Nahkampfwaffe weapon;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MeeleAttackCmdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.MEELE_ATTACK_CMD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
     * 
     * @generated
     */
    public Nahkampfwaffe basicGetWeapon() {
        return weapon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setWeapon(Nahkampfwaffe newWeapon) {
        Nahkampfwaffe oldWeapon = weapon;
        weapon = newWeapon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.MEELE_ATTACK_CMD__WEAPON, oldWeapon, weapon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.MEELE_ATTACK_CMD__WEAPON:
                if (resolve)
                    return getWeapon();
                return basicGetWeapon();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
     * 
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
     * 
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

    @Override
    public void redo() {
        executing = true;

        Fertigkeit fertigkeit = getWeapon().getFertigkeit();
        PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, getSubject().getCharacter().getPersona());
        setSkill(personaFertigkeit);

        setLimit(getWeapon().getPraezision());

        if (getCmdCallback() != null)
            getCmdCallback().prepareCommand(this, GameplayPackage.Literals.PROBE_COMMAND__MODS, GameplayPackage.Literals.SKILL_TEST_CMD__SKILL,
                    GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD__OBJECT);

        getProbe().clear();

        W6Dice w6Dice = new W6Dice();
        AbstraktPersona persona = getSubject().getCharacter().getPersona();
        EAttribute attribut = getSkill().getFertigkeit().getAttribut();
        Integer att = (Integer)persona.eGet(attribut);

        int dice = getSkill().getStufe() + att + mods;
        // AbstaktPersona persona = subject.getPersona();
        List<Integer> probe = w6Dice.probe(dice);// .probe(fertigkeit.getStufe(), mw);
        this.getProbe().addAll(probe);
        // if(isSetLimit())
        this.successes = isSetLimit() ? Math.min(limit, W6Dice.probeSucsessesShr5(probe)) : W6Dice.probeSucsessesShr5(probe);
        this.glitches = W6Dice.calcGlitchDice(probe);
        this.netHits = getSuccesses() - thresholds;

        if (netHits > 0) {
            DefensTestCmd defensTestCmd = GameplayFactory.eINSTANCE.createDefensTestCmd();
            defensTestCmd.setSubject(getObject());
            defensTestCmd.setCmdCallback(getCmdCallback());
            defensTestCmd.setDate(getDate());
            defensTestCmd.setAttackersHits(netHits);
            getSubCommands().add(defensTestCmd);
            defensTestCmd.redo();

            if (defensTestCmd.getNetHits() < 0) {
                DamageTest damageTest = GameplayFactory.eINSTANCE.createDamageTest();
                defensTestCmd.getSubCommands().add(damageTest);
                damageTest.setSubject(getObject());
                damageTest.setCmdCallback(getCmdCallback());
                damageTest.setDate(getDate());
                damageTest.setDamage(weapon.getSchadenscode());
                getSubCommands().add(damageTest);
                damageTest.redo();
            }
        }

        executing = false;
        executed = true;
    }
} // MeeleAttackCmdImpl
