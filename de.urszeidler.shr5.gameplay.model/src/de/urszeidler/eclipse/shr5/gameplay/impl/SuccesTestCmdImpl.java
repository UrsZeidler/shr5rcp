/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.shr5.gameplay.dice.W6Dice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Succes Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SuccesTestCmdImpl#getDicePool <em>Dice Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuccesTestCmdImpl extends ProbeCommandImpl implements SuccesTestCmd {
    /**
     * The default value of the '{@link #getDicePool() <em>Dice Pool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDicePool()
     * @generated
     * @ordered
     */
    protected static final int DICE_POOL_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDicePool() <em>Dice Pool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDicePool()
     * @generated
     * @ordered
     */
    protected int dicePool = DICE_POOL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SuccesTestCmdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.SUCCES_TEST_CMD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDicePool() {
        return dicePool;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDicePool(int newDicePool) {
        int oldDicePool = dicePool;
        dicePool = newDicePool;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SUCCES_TEST_CMD__DICE_POOL, oldDicePool, dicePool));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.SUCCES_TEST_CMD__DICE_POOL:
                return getDicePool();
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
            case GameplayPackage.SUCCES_TEST_CMD__DICE_POOL:
                setDicePool((Integer)newValue);
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
            case GameplayPackage.SUCCES_TEST_CMD__DICE_POOL:
                setDicePool(DICE_POOL_EDEFAULT);
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
            case GameplayPackage.SUCCES_TEST_CMD__DICE_POOL:
                return dicePool != DICE_POOL_EDEFAULT;
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
        result.append(" (dicePool: ");
        result.append(dicePool);
        result.append(')');
        return result.toString();
    }

    /**
     * Set the state and call the callback.
     */
    protected boolean prepareRedo() {
        setExecuting(true);
        mods = mods + GameplayTools.getWoundMod(getSubject(), getProbeMods());
        if (isSetCmdCallback() && getCmdCallback() != null)
            return cmdCallback.prepareCommand(this, GameplayPackage.Literals.PROBE_COMMAND__MODS, GameplayPackage.Literals.SUCCES_TEST_CMD__DICE_POOL,
                    GameplayPackage.Literals.PROBE__PUSH_THE_LIMIT);
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
        getProbeMods().clear();
        getProbe().clear();
        if(!prepareRedo()){
            cleanCommand();
            return;
        }
        
        pushTheLimit();
        if (!isSkipTest()) {
            W6Dice w6Dice = new W6Dice();
            int dice = dicePool + mods;
            List<Integer> probe = w6Dice.probe(dice);
            this.getProbe().addAll(probe);
            this.successes = isSetLimit() ? Math.min(limit, W6Dice.probeSucsessesShr5(getProbe())) : W6Dice.probeSucsessesShr5(getProbe());
            this.glitches = W6Dice.calcGlitchDice(probe);
        }
        
        if (getCmdCallback() != null && getSubject().canUseEdge() && !isPushTheLimit())
            getCmdCallback().beforeSubcommands(this, GameplayPackage.Literals.PROBE__SECOND_CHANCE);

        secondChance(getProbe().size());
        this.netHits = getSuccesses() - thresholds;
        afterRedo();
    }


} // SuccesTestCmdImpl
