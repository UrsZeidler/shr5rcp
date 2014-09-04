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
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.shr5.gameplay.dice.W6Dice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SkillTestCmdImpl#getSkill <em>Skill</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SkillTestCmdImpl extends ProbeCommandImpl implements SkillTestCmd {
    /**
     * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSkill()
     * @generated
     * @ordered
     */
    protected Fertigkeit skill;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SkillTestCmdImpl() {
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
        return GameplayPackage.Literals.SKILL_TEST_CMD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Fertigkeit getSkill() {
        if (skill != null && skill.eIsProxy()) {
            InternalEObject oldSkill = (InternalEObject)skill;
            skill = (Fertigkeit)eResolveProxy(oldSkill);
            if (skill != oldSkill) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.SKILL_TEST_CMD__SKILL, oldSkill, skill));
            }
        }
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Fertigkeit basicGetSkill() {
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSkill(Fertigkeit newSkill) {
        Fertigkeit oldSkill = skill;
        skill = newSkill;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SKILL_TEST_CMD__SKILL, oldSkill, skill));
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
            case GameplayPackage.SKILL_TEST_CMD__SKILL:
                if (resolve)
                    return getSkill();
                return basicGetSkill();
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
            case GameplayPackage.SKILL_TEST_CMD__SKILL:
                setSkill((Fertigkeit)newValue);
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
            case GameplayPackage.SKILL_TEST_CMD__SKILL:
                setSkill((Fertigkeit)null);
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
            case GameplayPackage.SKILL_TEST_CMD__SKILL:
                return skill != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * Set the state and call the callback.
     */
    protected void prepareRedo() {
        getProbe().clear();
        getProbeMods().clear();
        setExecuting(true);

        mods = mods + GameplayTools.getWoundMod(getSubject(), getProbeMods());       
        
        if (isSetCmdCallback() && getCmdCallback() != null)
            cmdCallback.prepareCommand(this, GameplayPackage.Literals.PROBE_COMMAND__MODS,GameplayPackage.Literals.SKILL_TEST_CMD__SKILL);

    }

    
    @Override
    public void redo() {
         prepareRedo();

        if (!isSkipTest()) {
            W6Dice w6Dice = new W6Dice();

            int dice = GameplayTools.getSkillDicePool(getSkill(), getSubject()) + mods;// getSkill().getStufe() + att + mods;
            List<Integer> probe = w6Dice.probe(dice);
            this.getProbe().addAll(probe);
            this.successes = isSetLimit() ? Math.min(limit, W6Dice.probeSucsessesShr5(probe)) : W6Dice.probeSucsessesShr5(probe);
            this.glitches = W6Dice.calcGlitchDice(probe);
        }
        this.netHits = getSuccesses() - thresholds;

        if (isSetCmdCallback() && getCmdCallback() != null)
            cmdCallback.afterCommand(this, GameplayPackage.Literals.PROBE_COMMAND__MODS);

        setExecuting(false);
        setExecuted(true);
    }

} // SkillTestCmdImpl
