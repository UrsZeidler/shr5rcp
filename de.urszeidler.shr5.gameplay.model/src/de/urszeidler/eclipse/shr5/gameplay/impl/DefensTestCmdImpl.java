/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.shr5.gameplay.dice.W6Dice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defens Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.DefensTestCmdImpl#getAttackersHits <em>Attackers Hits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefensTestCmdImpl extends ProbeCommandImpl implements DefensTestCmd {
    /**
     * The default value of the '{@link #getAttackersHits() <em>Attackers Hits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttackersHits()
     * @generated
     * @ordered
     */
    protected static final int ATTACKERS_HITS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getAttackersHits() <em>Attackers Hits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttackersHits()
     * @generated
     * @ordered
     */
    protected int attackersHits = ATTACKERS_HITS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefensTestCmdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.DEFENS_TEST_CMD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getAttackersHits() {
        return attackersHits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAttackersHits(int newAttackersHits) {
        int oldAttackersHits = attackersHits;
        attackersHits = newAttackersHits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.DEFENS_TEST_CMD__ATTACKERS_HITS, oldAttackersHits, attackersHits));
    }

    @Override
    public void redo() {
        getProbe().clear();
        // getProbeMods().clear();
        mods = mods + GameplayTools.getDefenceMod(getSubject(), getProbeMods());
        mods = mods + GameplayTools.getWoundMod(getSubject(), getProbeMods());
        if(!prepareRedo()){
            cleanCommand();
            return;
        }

        pushTheLimit();
        if (!isSkipTest()) {
            W6Dice w6Dice = new W6Dice();

            int dicePool = getSubject().getCharacter().getPersona().getAusweichen();
            int dice = dicePool + mods;
            List<Integer> probe = w6Dice.probe(dice);// .probe(fertigkeit.getStufe(), mw);
            this.getProbe().addAll(probe);
            this.successes = isSetLimit() ? Math.min(limit, W6Dice.probeSucsessesShr5(getProbe())) : W6Dice.probeSucsessesShr5(getProbe());
            this.glitches = W6Dice.calcGlitchDice(probe);
        }
        if (getCmdCallback() != null && getSubject().canUseEdge()&& !isPushTheLimit())
            getCmdCallback().beforeSubcommands(this, GameplayPackage.Literals.PROBE__SECOND_CHANCE);

        secondChance(getProbe().size());
        this.thresholds = attackersHits;
        this.netHits = getSuccesses() - thresholds;

        GameplayTools.inreaseDefenceMod(getSubject(), -1);

        afterRedo();
    }

    @Override
    protected void afterRedo() {
        super.afterRedo();
        if (isCloseCall())
            GameplayTools.increaseEdgeValue(getSubject(), 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.DEFENS_TEST_CMD__ATTACKERS_HITS:
                return getAttackersHits();
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
            case GameplayPackage.DEFENS_TEST_CMD__ATTACKERS_HITS:
                setAttackersHits((Integer)newValue);
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
            case GameplayPackage.DEFENS_TEST_CMD__ATTACKERS_HITS:
                setAttackersHits(ATTACKERS_HITS_EDEFAULT);
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
            case GameplayPackage.DEFENS_TEST_CMD__ATTACKERS_HITS:
                return attackersHits != ATTACKERS_HITS_EDEFAULT;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (attackersHits: ");
        result.append(attackersHits);
        result.append(')');
        return result.toString();
    }

} // DefensTestCmdImpl
