/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.ProbeCommand;
import de.urszeidler.eclipse.shr5.gameplay.ProbeMod;
import de.urszeidler.eclipse.shr5.gameplay.ProbeState;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTest;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestState;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.shr5.gameplay.dice.W6Dice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probe Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getProbe <em>Probe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getSuccesses <em>Successes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getGlitches <em>Glitches</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getProbeState <em>Probe State</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getProbeMods <em>Probe Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#isSkipTest <em>Skip Test</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#isPushTheLimit <em>Push The Limit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#isSecondChance <em>Second Chance</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#isCloseCall <em>Close Call</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getThresholds <em>Thresholds</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getNetHits <em>Net Hits</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getTestState <em>Test State</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProbeCommandImpl extends SubjectCommandImpl implements ProbeCommand {
    /**
     * The cached value of the '{@link #getProbe() <em>Probe</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProbe()
     * @generated
     * @ordered
     */
    protected EList<Integer> probe;

    /**
     * The default value of the '{@link #getSuccesses() <em>Successes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuccesses()
     * @generated
     * @ordered
     */
    protected static final int SUCCESSES_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSuccesses() <em>Successes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuccesses()
     * @generated
     * @ordered
     */
    protected int successes = SUCCESSES_EDEFAULT;

    /**
     * The default value of the '{@link #getGlitches() <em>Glitches</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGlitches()
     * @generated
     * @ordered
     */
    protected static final int GLITCHES_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGlitches() <em>Glitches</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGlitches()
     * @generated
     * @ordered
     */
    protected int glitches = GLITCHES_EDEFAULT;

    /**
     * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimit()
     * @generated
     * @ordered
     */
    protected static final int LIMIT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimit()
     * @generated
     * @ordered
     */
    protected int limit = LIMIT_EDEFAULT;

    /**
     * This is true if the Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean limitESet;

    /**
     * The default value of the '{@link #getProbeState() <em>Probe State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProbeState()
     * @generated
     * @ordered
     */
    protected static final ProbeState PROBE_STATE_EDEFAULT = ProbeState.NO_GLITCH;

    /**
     * The cached value of the '{@link #getProbeMods() <em>Probe Mods</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProbeMods()
     * @generated
     * @ordered
     */
    protected EList<ProbeMod> probeMods;

    /**
     * The default value of the '{@link #isSkipTest() <em>Skip Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSkipTest()
     * @generated
     * @ordered
     */
    protected static final boolean SKIP_TEST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSkipTest() <em>Skip Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSkipTest()
     * @generated
     * @ordered
     */
    protected boolean skipTest = SKIP_TEST_EDEFAULT;

    /**
     * The default value of the '{@link #isPushTheLimit() <em>Push The Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPushTheLimit()
     * @generated
     * @ordered
     */
    protected static final boolean PUSH_THE_LIMIT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPushTheLimit() <em>Push The Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPushTheLimit()
     * @generated
     * @ordered
     */
    protected boolean pushTheLimit = PUSH_THE_LIMIT_EDEFAULT;

    /**
     * The default value of the '{@link #isSecondChance() <em>Second Chance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSecondChance()
     * @generated
     * @ordered
     */
    protected static final boolean SECOND_CHANCE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSecondChance() <em>Second Chance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSecondChance()
     * @generated
     * @ordered
     */
    protected boolean secondChance = SECOND_CHANCE_EDEFAULT;

    /**
     * The default value of the '{@link #isCloseCall() <em>Close Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCloseCall()
     * @generated
     * @ordered
     */
    protected static final boolean CLOSE_CALL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCloseCall() <em>Close Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCloseCall()
     * @generated
     * @ordered
     */
    protected boolean closeCall = CLOSE_CALL_EDEFAULT;

    /**
     * The default value of the '{@link #getThresholds() <em>Thresholds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThresholds()
     * @generated
     * @ordered
     */
    protected static final int THRESHOLDS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getThresholds() <em>Thresholds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThresholds()
     * @generated
     * @ordered
     */
    protected int thresholds = THRESHOLDS_EDEFAULT;

    /**
     * The default value of the '{@link #getNetHits() <em>Net Hits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNetHits()
     * @generated
     * @ordered
     */
    protected static final int NET_HITS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNetHits() <em>Net Hits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNetHits()
     * @generated
     * @ordered
     */
    protected int netHits = NET_HITS_EDEFAULT;

    /**
     * The default value of the '{@link #getTestState() <em>Test State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestState()
     * @generated
     * @ordered
     */
    protected static final SuccesTestState TEST_STATE_EDEFAULT = SuccesTestState.SUCCES;

    /**
     * The default value of the '{@link #getMods() <em>Mods</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMods()
     * @generated
     * @ordered
     */
    protected static final int MODS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMods() <em>Mods</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMods()
     * @generated
     * @ordered
     */
    protected int mods = MODS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProbeCommandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.PROBE_COMMAND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Integer> getProbe() {
        if (probe == null) {
            probe = new EDataTypeEList<Integer>(Integer.class, this, GameplayPackage.PROBE_COMMAND__PROBE);
        }
        return probe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSuccesses() {
        return successes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuccesses(int newSuccesses) {
        int oldSuccesses = successes;
        successes = newSuccesses;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__SUCCESSES, oldSuccesses, successes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getGlitches() {
        return glitches;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlitches(int newGlitches) {
        int oldGlitches = glitches;
        glitches = newGlitches;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__GLITCHES, oldGlitches, glitches));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLimit() {
        return limit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLimit(int newLimit) {
        int oldLimit = limit;
        limit = newLimit;
        boolean oldLimitESet = limitESet;
        limitESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__LIMIT, oldLimit, limit, !oldLimitESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLimit() {
        int oldLimit = limit;
        boolean oldLimitESet = limitESet;
        limit = LIMIT_EDEFAULT;
        limitESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, GameplayPackage.PROBE_COMMAND__LIMIT, oldLimit, LIMIT_EDEFAULT, oldLimitESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLimit() {
        return limitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public ProbeState getProbeState() {
        if (!isExecuted())
            return ProbeState.NO_GLITCH;

        double half = probe.size() / 2.0;
        if (getGlitches() > half)
            if (getSuccesses() == 0 && ! isCloseCall())
                return ProbeState.CRITICAL_GLITCH;
            else
                return ProbeState.GLITCH;

        return ProbeState.NO_GLITCH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ProbeMod> getProbeMods() {
        if (probeMods == null) {
            probeMods = new EObjectContainmentEList<ProbeMod>(ProbeMod.class, this, GameplayPackage.PROBE_COMMAND__PROBE_MODS);
        }
        return probeMods;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSkipTest() {
        return skipTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSkipTest(boolean newSkipTest) {
        boolean oldSkipTest = skipTest;
        skipTest = newSkipTest;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__SKIP_TEST, oldSkipTest, skipTest));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isPushTheLimit() {
        return pushTheLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPushTheLimit(boolean newPushTheLimit) {
        boolean oldPushTheLimit = pushTheLimit;
        pushTheLimit = newPushTheLimit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__PUSH_THE_LIMIT, oldPushTheLimit, pushTheLimit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSecondChance() {
        return secondChance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecondChance(boolean newSecondChance) {
        boolean oldSecondChance = secondChance;
        secondChance = newSecondChance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__SECOND_CHANCE, oldSecondChance, secondChance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCloseCall() {
        return closeCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCloseCall(boolean newCloseCall) {
        boolean oldCloseCall = closeCall;
        closeCall = newCloseCall;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__CLOSE_CALL, oldCloseCall, closeCall));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getThresholds() {
        return thresholds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThresholds(int newThresholds) {
        int oldThresholds = thresholds;
        thresholds = newThresholds;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__THRESHOLDS, oldThresholds, thresholds));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getNetHits() {
        return netHits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNetHits(int newNetHits) {
        int oldNetHits = netHits;
        netHits = newNetHits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__NET_HITS, oldNetHits, netHits));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public SuccesTestState getTestState() {
        if (getNetHits() < 0)
            return SuccesTestState.FAILURE;
        else
            return SuccesTestState.SUCCES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMods() {
        return mods;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMods(int newMods) {
        int oldMods = mods;
        mods = newMods;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.PROBE_COMMAND__MODS, oldMods, mods));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GameplayPackage.PROBE_COMMAND__PROBE_MODS:
                return ((InternalEList<?>)getProbeMods()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.PROBE_COMMAND__PROBE:
                return getProbe();
            case GameplayPackage.PROBE_COMMAND__SUCCESSES:
                return getSuccesses();
            case GameplayPackage.PROBE_COMMAND__GLITCHES:
                return getGlitches();
            case GameplayPackage.PROBE_COMMAND__LIMIT:
                return getLimit();
            case GameplayPackage.PROBE_COMMAND__PROBE_STATE:
                return getProbeState();
            case GameplayPackage.PROBE_COMMAND__PROBE_MODS:
                return getProbeMods();
            case GameplayPackage.PROBE_COMMAND__SKIP_TEST:
                return isSkipTest();
            case GameplayPackage.PROBE_COMMAND__PUSH_THE_LIMIT:
                return isPushTheLimit();
            case GameplayPackage.PROBE_COMMAND__SECOND_CHANCE:
                return isSecondChance();
            case GameplayPackage.PROBE_COMMAND__CLOSE_CALL:
                return isCloseCall();
            case GameplayPackage.PROBE_COMMAND__THRESHOLDS:
                return getThresholds();
            case GameplayPackage.PROBE_COMMAND__NET_HITS:
                return getNetHits();
            case GameplayPackage.PROBE_COMMAND__TEST_STATE:
                return getTestState();
            case GameplayPackage.PROBE_COMMAND__MODS:
                return getMods();
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
            case GameplayPackage.PROBE_COMMAND__SUCCESSES:
                setSuccesses((Integer)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__GLITCHES:
                setGlitches((Integer)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__LIMIT:
                setLimit((Integer)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__PROBE_MODS:
                getProbeMods().clear();
                getProbeMods().addAll((Collection<? extends ProbeMod>)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__SKIP_TEST:
                setSkipTest((Boolean)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__PUSH_THE_LIMIT:
                setPushTheLimit((Boolean)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__SECOND_CHANCE:
                setSecondChance((Boolean)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__CLOSE_CALL:
                setCloseCall((Boolean)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__THRESHOLDS:
                setThresholds((Integer)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__NET_HITS:
                setNetHits((Integer)newValue);
                return;
            case GameplayPackage.PROBE_COMMAND__MODS:
                setMods((Integer)newValue);
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
            case GameplayPackage.PROBE_COMMAND__SUCCESSES:
                setSuccesses(SUCCESSES_EDEFAULT);
                return;
            case GameplayPackage.PROBE_COMMAND__GLITCHES:
                setGlitches(GLITCHES_EDEFAULT);
                return;
            case GameplayPackage.PROBE_COMMAND__LIMIT:
                unsetLimit();
                return;
            case GameplayPackage.PROBE_COMMAND__PROBE_MODS:
                getProbeMods().clear();
                return;
            case GameplayPackage.PROBE_COMMAND__SKIP_TEST:
                setSkipTest(SKIP_TEST_EDEFAULT);
                return;
            case GameplayPackage.PROBE_COMMAND__PUSH_THE_LIMIT:
                setPushTheLimit(PUSH_THE_LIMIT_EDEFAULT);
                return;
            case GameplayPackage.PROBE_COMMAND__SECOND_CHANCE:
                setSecondChance(SECOND_CHANCE_EDEFAULT);
                return;
            case GameplayPackage.PROBE_COMMAND__CLOSE_CALL:
                setCloseCall(CLOSE_CALL_EDEFAULT);
                return;
            case GameplayPackage.PROBE_COMMAND__THRESHOLDS:
                setThresholds(THRESHOLDS_EDEFAULT);
                return;
            case GameplayPackage.PROBE_COMMAND__NET_HITS:
                setNetHits(NET_HITS_EDEFAULT);
                return;
            case GameplayPackage.PROBE_COMMAND__MODS:
                setMods(MODS_EDEFAULT);
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
            case GameplayPackage.PROBE_COMMAND__PROBE:
                return probe != null && !probe.isEmpty();
            case GameplayPackage.PROBE_COMMAND__SUCCESSES:
                return successes != SUCCESSES_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__GLITCHES:
                return glitches != GLITCHES_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__LIMIT:
                return isSetLimit();
            case GameplayPackage.PROBE_COMMAND__PROBE_STATE:
                return getProbeState() != PROBE_STATE_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__PROBE_MODS:
                return probeMods != null && !probeMods.isEmpty();
            case GameplayPackage.PROBE_COMMAND__SKIP_TEST:
                return skipTest != SKIP_TEST_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__PUSH_THE_LIMIT:
                return pushTheLimit != PUSH_THE_LIMIT_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__SECOND_CHANCE:
                return secondChance != SECOND_CHANCE_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__CLOSE_CALL:
                return closeCall != CLOSE_CALL_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__THRESHOLDS:
                return thresholds != THRESHOLDS_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__NET_HITS:
                return netHits != NET_HITS_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__TEST_STATE:
                return getTestState() != TEST_STATE_EDEFAULT;
            case GameplayPackage.PROBE_COMMAND__MODS:
                return mods != MODS_EDEFAULT;
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
        if (baseClass == Probe.class) {
            switch (derivedFeatureID) {
                case GameplayPackage.PROBE_COMMAND__PROBE: return GameplayPackage.PROBE__PROBE;
                case GameplayPackage.PROBE_COMMAND__SUCCESSES: return GameplayPackage.PROBE__SUCCESSES;
                case GameplayPackage.PROBE_COMMAND__GLITCHES: return GameplayPackage.PROBE__GLITCHES;
                case GameplayPackage.PROBE_COMMAND__LIMIT: return GameplayPackage.PROBE__LIMIT;
                case GameplayPackage.PROBE_COMMAND__PROBE_STATE: return GameplayPackage.PROBE__PROBE_STATE;
                case GameplayPackage.PROBE_COMMAND__PROBE_MODS: return GameplayPackage.PROBE__PROBE_MODS;
                case GameplayPackage.PROBE_COMMAND__SKIP_TEST: return GameplayPackage.PROBE__SKIP_TEST;
                case GameplayPackage.PROBE_COMMAND__PUSH_THE_LIMIT: return GameplayPackage.PROBE__PUSH_THE_LIMIT;
                case GameplayPackage.PROBE_COMMAND__SECOND_CHANCE: return GameplayPackage.PROBE__SECOND_CHANCE;
                case GameplayPackage.PROBE_COMMAND__CLOSE_CALL: return GameplayPackage.PROBE__CLOSE_CALL;
                default: return -1;
            }
        }
        if (baseClass == SuccesTest.class) {
            switch (derivedFeatureID) {
                case GameplayPackage.PROBE_COMMAND__THRESHOLDS: return GameplayPackage.SUCCES_TEST__THRESHOLDS;
                case GameplayPackage.PROBE_COMMAND__NET_HITS: return GameplayPackage.SUCCES_TEST__NET_HITS;
                case GameplayPackage.PROBE_COMMAND__TEST_STATE: return GameplayPackage.SUCCES_TEST__TEST_STATE;
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
        if (baseClass == Probe.class) {
            switch (baseFeatureID) {
                case GameplayPackage.PROBE__PROBE: return GameplayPackage.PROBE_COMMAND__PROBE;
                case GameplayPackage.PROBE__SUCCESSES: return GameplayPackage.PROBE_COMMAND__SUCCESSES;
                case GameplayPackage.PROBE__GLITCHES: return GameplayPackage.PROBE_COMMAND__GLITCHES;
                case GameplayPackage.PROBE__LIMIT: return GameplayPackage.PROBE_COMMAND__LIMIT;
                case GameplayPackage.PROBE__PROBE_STATE: return GameplayPackage.PROBE_COMMAND__PROBE_STATE;
                case GameplayPackage.PROBE__PROBE_MODS: return GameplayPackage.PROBE_COMMAND__PROBE_MODS;
                case GameplayPackage.PROBE__SKIP_TEST: return GameplayPackage.PROBE_COMMAND__SKIP_TEST;
                case GameplayPackage.PROBE__PUSH_THE_LIMIT: return GameplayPackage.PROBE_COMMAND__PUSH_THE_LIMIT;
                case GameplayPackage.PROBE__SECOND_CHANCE: return GameplayPackage.PROBE_COMMAND__SECOND_CHANCE;
                case GameplayPackage.PROBE__CLOSE_CALL: return GameplayPackage.PROBE_COMMAND__CLOSE_CALL;
                default: return -1;
            }
        }
        if (baseClass == SuccesTest.class) {
            switch (baseFeatureID) {
                case GameplayPackage.SUCCES_TEST__THRESHOLDS: return GameplayPackage.PROBE_COMMAND__THRESHOLDS;
                case GameplayPackage.SUCCES_TEST__NET_HITS: return GameplayPackage.PROBE_COMMAND__NET_HITS;
                case GameplayPackage.SUCCES_TEST__TEST_STATE: return GameplayPackage.PROBE_COMMAND__TEST_STATE;
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
        result.append(" (probe: ");
        result.append(probe);
        result.append(", successes: ");
        result.append(successes);
        result.append(", glitches: ");
        result.append(glitches);
        result.append(", limit: ");
        if (limitESet) result.append(limit); else result.append("<unset>");
        result.append(", skipTest: ");
        result.append(skipTest);
        result.append(", pushTheLimit: ");
        result.append(pushTheLimit);
        result.append(", secondChance: ");
        result.append(secondChance);
        result.append(", closeCall: ");
        result.append(closeCall);
        result.append(", thresholds: ");
        result.append(thresholds);
        result.append(", netHits: ");
        result.append(netHits);
        result.append(", mods: ");
        result.append(mods);
        result.append(')');
        return result.toString();
    }

    /**
     * Doing the second chance. If chosen.
     * @param dicePool the number of dices thrown
     */
    protected void secondChance(int dicePool) {
        if(isSecondChance()){
            W6Dice w6Dice = new W6Dice();
            int dice = dicePool-successes;
            List<Integer> probe = w6Dice.probe(dice);// .probe(fertigkeit.getStufe(), mw);
            this.getProbe().addAll(probe);
            this.successes = isSetLimit() ? Math.min(limit, W6Dice.probeSucsessesShr5(getProbe())) : W6Dice.probeSucsessesShr5(getProbe());
            GameplayTools.increaseEdgeValue(getSubject(),1);
        }
    }

    
    /**
     * Checks for the option and  If chosen.
     * All the stuff to push the limit.
     */
    protected void pushTheLimit() {
        if(isPushTheLimit()){
             int edgeValue = GameplayTools.getEdgeValue(getSubject());
             List<Integer> rollPushTheLimit = GameplayTools.rollPushTheLimit(edgeValue);
             unsetLimit();
             this.getProbe().addAll(rollPushTheLimit);
             GameplayTools.increaseEdgeValue(getSubject(),1);
         }
    }

} // ProbeCommandImpl
