/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Initative;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Zustand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combat Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#isExecuted <em>Executed</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getSubCommands <em>Sub Commands</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getCmdCallback <em>Cmd Callback</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#isExecuting <em>Executing</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#isCanExecute <em>Can Execute</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getCombatants <em>Combatants</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getActionPhases <em>Action Phases</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getCurrentTurn <em>Current Turn</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombatTurnImpl extends MinimalEObjectImpl.Container implements CombatTurn {
    public final static class InitativeComperator implements Comparator<InitativePass> {
        @Override
        public int compare(InitativePass o1, InitativePass o2) {
            if (o1.isSizeInitative())
                return -1;
            if (o2.isSizeInitative())
                return 1;

            int turn1 = o1.getTurn() - o2.getTurn();
            if (turn1 != 0)
                return turn1;

            int val = o1.getPhase() - o2.getPhase();

            if (val == 0) {
                // TODO : we need to check all the other compare options
            }
            return val * -1;
        }
    }

    /**
     * The default value of the '{@link #isExecuted() <em>Executed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExecuted()
     * @generated
     * @ordered
     */
    protected static final boolean EXECUTED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExecuted() <em>Executed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExecuted()
     * @generated
     * @ordered
     */
    protected boolean executed = EXECUTED_EDEFAULT;

    /**
     * The cached value of the '{@link #getSubCommands() <em>Sub Commands</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubCommands()
     * @generated
     * @ordered
     */
    protected EList<Command> subCommands;

    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final Date DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected Date date = DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getCmdCallback() <em>Cmd Callback</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getCmdCallback()
     * @generated not
     * @ordered
     */
    protected static final CommandCallback CMD_CALLBACK_EDEFAULT = null;// (ComandCallback)GameplayFactory.eINSTANCE.createFromString(GameplayPackage.eINSTANCE.getComandCallback(),
                                                                        // "");

    /**
     * The cached value of the '{@link #getCmdCallback() <em>Cmd Callback</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCmdCallback()
     * @generated
     * @ordered
     */
    protected CommandCallback cmdCallback = CMD_CALLBACK_EDEFAULT;

    /**
     * This is true if the Cmd Callback attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cmdCallbackESet;

    /**
     * The default value of the '{@link #isExecuting() <em>Executing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExecuting()
     * @generated
     * @ordered
     */
    protected static final boolean EXECUTING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExecuting() <em>Executing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExecuting()
     * @generated
     * @ordered
     */
    protected boolean executing = EXECUTING_EDEFAULT;

    /**
     * The default value of the '{@link #isCanExecute() <em>Can Execute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCanExecute()
     * @generated
     * @ordered
     */
    protected static final boolean CAN_EXECUTE_EDEFAULT = false;

    /**
     * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHidden()
     * @generated
     * @ordered
     */
    protected static final boolean HIDDEN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHidden()
     * @generated
     * @ordered
     */
    protected boolean hidden = HIDDEN_EDEFAULT;

    /**
     * The cached value of the '{@link #getCombatants() <em>Combatants</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombatants()
     * @generated
     * @ordered
     */
    protected EList<RuntimeCharacter> combatants;

    /**
     * The cached value of the '{@link #getActionPhases() <em>Action Phases</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionPhases()
     * @generated
     * @ordered
     */
    protected EList<InitativePass> actionPhases;

    /**
     * The cached value of the '{@link #getCurrentTurn() <em>Current Turn</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentTurn()
     * @generated
     * @ordered
     */
    protected InitativePass currentTurn;

    /**
     * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected static final int SEQUENCE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected int sequence = SEQUENCE_EDEFAULT;

    private Adapter adapter = new EContentAdapter() {

        public void notifyChanged(Notification notification) {
            super.notifyChanged(notification);
            Object notifier = notification.getNotifier();
            Object feature = notification.getFeature();
            if (notifier instanceof RuntimeCharacter) {
                final RuntimeCharacter rc = (RuntimeCharacter)notifier;
                if (RuntimePackage.Literals.PHYICAL_STATE__PHYSICAL_DAMAGE.equals(feature)) {
                    int oldIntValue = notification.getOldIntValue();
                    int newIntValue = notification.getNewIntValue();
                    int rest = oldIntValue % 3;
                    int diffMod = (newIntValue - oldIntValue) + rest;
                    int mod = diffMod / 3;

                    changeInitatives(rc, mod);
                } else if (RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE.equals(feature)) {
                    int oldIntValue = notification.getOldIntValue();
                    int newIntValue = notification.getNewIntValue();
                    int rest = oldIntValue % 3;
                    int diffMod = (newIntValue - oldIntValue) + rest;
                    int mod = diffMod / 3;

                    changeInitatives(rc, mod);
                }
            }
        }
    };

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombatTurnImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.COMBAT_TURN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isExecuted() {
        return executed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExecuted(boolean newExecuted) {
        boolean oldExecuted = executed;
        executed = newExecuted;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.COMBAT_TURN__EXECUTED, oldExecuted, executed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Command> getSubCommands() {
        if (subCommands == null) {
            subCommands = new EObjectContainmentEList<Command>(Command.class, this, GameplayPackage.COMBAT_TURN__SUB_COMMANDS);
        }
        return subCommands;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDate(Date newDate) {
        Date oldDate = date;
        date = newDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.COMBAT_TURN__DATE, oldDate, date));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CommandCallback getCmdCallback() {
        return cmdCallback;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCmdCallback(CommandCallback newCmdCallback) {
        CommandCallback oldCmdCallback = cmdCallback;
        cmdCallback = newCmdCallback;
        boolean oldCmdCallbackESet = cmdCallbackESet;
        cmdCallbackESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.COMBAT_TURN__CMD_CALLBACK, oldCmdCallback, cmdCallback, !oldCmdCallbackESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCmdCallback() {
        CommandCallback oldCmdCallback = cmdCallback;
        boolean oldCmdCallbackESet = cmdCallbackESet;
        cmdCallback = CMD_CALLBACK_EDEFAULT;
        cmdCallbackESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, GameplayPackage.COMBAT_TURN__CMD_CALLBACK, oldCmdCallback, CMD_CALLBACK_EDEFAULT, oldCmdCallbackESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCmdCallback() {
        return cmdCallbackESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isExecuting() {
        return executing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExecuting(boolean newExecuting) {
        boolean oldExecuting = executing;
        executing = newExecuting;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.COMBAT_TURN__EXECUTING, oldExecuting, executing));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean isCanExecute() {
        return !executed && getCombatants().size() > 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isHidden() {
        return hidden;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHidden(boolean newHidden) {
        boolean oldHidden = hidden;
        hidden = newHidden;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.COMBAT_TURN__HIDDEN, oldHidden, hidden));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RuntimeCharacter> getCombatants() {
        if (combatants == null) {
            combatants = new EObjectResolvingEList<RuntimeCharacter>(RuntimeCharacter.class, this, GameplayPackage.COMBAT_TURN__COMBATANTS);
        }
        return combatants;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<InitativePass> getActionPhases() {
        if (actionPhases == null) {
            actionPhases = new EObjectContainmentEList<InitativePass>(InitativePass.class, this, GameplayPackage.COMBAT_TURN__ACTION_PHASES);
        }
        return actionPhases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InitativePass getCurrentTurn() {
        if (currentTurn != null && currentTurn.eIsProxy()) {
            InternalEObject oldCurrentTurn = (InternalEObject)currentTurn;
            currentTurn = (InitativePass)eResolveProxy(oldCurrentTurn);
            if (currentTurn != oldCurrentTurn) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.COMBAT_TURN__CURRENT_TURN, oldCurrentTurn, currentTurn));
            }
        }
        return currentTurn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitativePass basicGetCurrentTurn() {
        return currentTurn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentTurn(InitativePass newCurrentTurn) {
        InitativePass oldCurrentTurn = currentTurn;
        currentTurn = newCurrentTurn;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.COMBAT_TURN__CURRENT_TURN, oldCurrentTurn, currentTurn));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getSequence() {
        return sequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequence(int newSequence) {
        int oldSequence = sequence;
        sequence = newSequence;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.COMBAT_TURN__SEQUENCE, oldSequence, sequence));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void doTurn() {
        if (getCurrentTurn() != null) {
            InitativePass turn = getCurrentTurn();
            if (turn instanceof InitativePass) {
                InitativePass ip = (InitativePass)turn;
                if (ip.isCanExecute()) {
                    ip.redo();
                    if (isCanceled(ip)){
                        ip.setExecuted(false);
                        ip.setExecuting(false);
                        return;
                    }
                    int indexOf = getActionPhases().indexOf(ip) + 1;
                    if (indexOf < getActionPhases().size()) {
                        setCurrentTurn(getActionPhases().get(indexOf));
                    } else {
                        // the combarturn is done
                        setCurrentTurn(null);
                        setExecuted(true);
                        setExecuting(false);
                        for (RuntimeCharacter abstractNaturalPerson : combatants) {
                            abstractNaturalPerson.eAdapters().remove(adapter);
                        }
                        if (getCmdCallback() != null)
                            getCmdCallback().afterCommand(this, GameplayPackage.Literals.COMMAND__SUB_COMMANDS);
                    }
                }
            }
        }
    }

    private boolean isCanceled(InitativePass ip) {
        TreeIterator<EObject> eAllContents2 = ip.eAllContents();
        boolean cancled = false;

        while (eAllContents2.hasNext()) {
            EObject eo = eAllContents2.next();
            if (eo instanceof Command) {
                Command c = (Command)eo;
                if (c.isExecuting() && !c.isExecuted())
                    cancled = true;
            }
        }
         return cancled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void redo() {
        setExecuted(false);
        setExecuting(true);
        for (RuntimeCharacter abstractNaturalPerson : combatants) {
            abstractNaturalPerson.eAdapters().add(adapter);
        }

        getActionPhases().clear();
        getSubCommands().clear();
        setCurrentTurn(null);

        for (RuntimeCharacter abstractNaturalPerson : combatants) {
            GameplayTools.clearInterruptActions(abstractNaturalPerson);
            if (abstractNaturalPerson.getZustand() == Zustand.OK) {
                Initative initative = GameplayFactory.eINSTANCE.createInitative();
                initative.setSubject(abstractNaturalPerson);
                initative.redo();
                subCommands.add(initative);
            }
        }
        if (getCmdCallback() != null)
            if (!getCmdCallback().prepareCommand(this, GameplayPackage.Literals.COMMAND__SUB_COMMANDS)) {
                cleanCombatTurn();
                return;
            }

        List<InitativePass> phaseCommands = new ArrayList<InitativePass>();
        for (Command command : subCommands) {
            if (command instanceof Initative) {
                Initative ini = (Initative)command;
                if (ini.isSizeInitative()) {
                    GameplayTools.increaseEdgeValue(ini.getSubject(), 1);
                }

                int currentIni = ini.getIni();
                int turn = 1;
                while (currentIni > 0) {
                    InitativePass action = GameplayFactory.eINSTANCE.createInitativePass();
                    action.setSubject(ini.getSubject());
                    action.setCmdCallback(getCmdCallback());
                    action.setDate(getDate());
                    action.setPhase(currentIni);
                    action.setTurn(turn);
                    if (turn == 1)
                        action.setSizeInitative(ini.isSizeInitative());
                    else
                        action.setSizeInitative(false);
                    turn++;
                    currentIni = currentIni - 10;

                    phaseCommands.add(action);
                }
            }
        }
        Collections.sort(phaseCommands, new InitativeComperator());

        // subCommands.addAll((Collection<? extends Command>) phaseCommands);
        if (phaseCommands.size() > 0)
            setCurrentTurn(phaseCommands.get(0));

        getActionPhases().addAll(phaseCommands);
        // executed = true;

    }

    private void cleanCombatTurn() {
        EObject eObject = this.eContainer();
        if (eObject instanceof ExecutionProtocol) {
            ExecutionProtocol ep = (ExecutionProtocol)eObject;

            ep.getCommands().remove(this);
            EcoreUtil.delete(this);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void undo() {
        executed = false;
        getActionPhases().clear();
        getSubCommands().clear();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GameplayPackage.COMBAT_TURN__SUB_COMMANDS:
                return ((InternalEList<?>)getSubCommands()).basicRemove(otherEnd, msgs);
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
                return ((InternalEList<?>)getActionPhases()).basicRemove(otherEnd, msgs);
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
            case GameplayPackage.COMBAT_TURN__EXECUTED:
                return isExecuted();
            case GameplayPackage.COMBAT_TURN__SUB_COMMANDS:
                return getSubCommands();
            case GameplayPackage.COMBAT_TURN__DATE:
                return getDate();
            case GameplayPackage.COMBAT_TURN__CMD_CALLBACK:
                return getCmdCallback();
            case GameplayPackage.COMBAT_TURN__EXECUTING:
                return isExecuting();
            case GameplayPackage.COMBAT_TURN__CAN_EXECUTE:
                return isCanExecute();
            case GameplayPackage.COMBAT_TURN__HIDDEN:
                return isHidden();
            case GameplayPackage.COMBAT_TURN__COMBATANTS:
                return getCombatants();
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
                return getActionPhases();
            case GameplayPackage.COMBAT_TURN__CURRENT_TURN:
                if (resolve) return getCurrentTurn();
                return basicGetCurrentTurn();
            case GameplayPackage.COMBAT_TURN__SEQUENCE:
                return getSequence();
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
            case GameplayPackage.COMBAT_TURN__EXECUTED:
                setExecuted((Boolean)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__SUB_COMMANDS:
                getSubCommands().clear();
                getSubCommands().addAll((Collection<? extends Command>)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__DATE:
                setDate((Date)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__CMD_CALLBACK:
                setCmdCallback((CommandCallback)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__EXECUTING:
                setExecuting((Boolean)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__HIDDEN:
                setHidden((Boolean)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__COMBATANTS:
                getCombatants().clear();
                getCombatants().addAll((Collection<? extends RuntimeCharacter>)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
                getActionPhases().clear();
                getActionPhases().addAll((Collection<? extends InitativePass>)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__CURRENT_TURN:
                setCurrentTurn((InitativePass)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__SEQUENCE:
                setSequence((Integer)newValue);
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
            case GameplayPackage.COMBAT_TURN__EXECUTED:
                setExecuted(EXECUTED_EDEFAULT);
                return;
            case GameplayPackage.COMBAT_TURN__SUB_COMMANDS:
                getSubCommands().clear();
                return;
            case GameplayPackage.COMBAT_TURN__DATE:
                setDate(DATE_EDEFAULT);
                return;
            case GameplayPackage.COMBAT_TURN__CMD_CALLBACK:
                unsetCmdCallback();
                return;
            case GameplayPackage.COMBAT_TURN__EXECUTING:
                setExecuting(EXECUTING_EDEFAULT);
                return;
            case GameplayPackage.COMBAT_TURN__HIDDEN:
                setHidden(HIDDEN_EDEFAULT);
                return;
            case GameplayPackage.COMBAT_TURN__COMBATANTS:
                getCombatants().clear();
                return;
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
                getActionPhases().clear();
                return;
            case GameplayPackage.COMBAT_TURN__CURRENT_TURN:
                setCurrentTurn((InitativePass)null);
                return;
            case GameplayPackage.COMBAT_TURN__SEQUENCE:
                setSequence(SEQUENCE_EDEFAULT);
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
            case GameplayPackage.COMBAT_TURN__EXECUTED:
                return executed != EXECUTED_EDEFAULT;
            case GameplayPackage.COMBAT_TURN__SUB_COMMANDS:
                return subCommands != null && !subCommands.isEmpty();
            case GameplayPackage.COMBAT_TURN__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
            case GameplayPackage.COMBAT_TURN__CMD_CALLBACK:
                return isSetCmdCallback();
            case GameplayPackage.COMBAT_TURN__EXECUTING:
                return executing != EXECUTING_EDEFAULT;
            case GameplayPackage.COMBAT_TURN__CAN_EXECUTE:
                return isCanExecute() != CAN_EXECUTE_EDEFAULT;
            case GameplayPackage.COMBAT_TURN__HIDDEN:
                return hidden != HIDDEN_EDEFAULT;
            case GameplayPackage.COMBAT_TURN__COMBATANTS:
                return combatants != null && !combatants.isEmpty();
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
                return actionPhases != null && !actionPhases.isEmpty();
            case GameplayPackage.COMBAT_TURN__CURRENT_TURN:
                return currentTurn != null;
            case GameplayPackage.COMBAT_TURN__SEQUENCE:
                return sequence != SEQUENCE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case GameplayPackage.COMBAT_TURN___DO_TURN:
                doTurn();
                return null;
            case GameplayPackage.COMBAT_TURN___REDO:
                redo();
                return null;
            case GameplayPackage.COMBAT_TURN___UNDO:
                undo();
                return null;
        }
        return super.eInvoke(operationID, arguments);
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
        result.append(" (executed: ");
        result.append(executed);
        result.append(", date: ");
        result.append(date);
        result.append(", cmdCallback: ");
        if (cmdCallbackESet) result.append(cmdCallback); else result.append("<unset>");
        result.append(", executing: ");
        result.append(executing);
        result.append(", hidden: ");
        result.append(hidden);
        result.append(", sequence: ");
        result.append(sequence);
        result.append(')');
        return result.toString();
    }

    protected void changeInitatives(final RuntimeCharacter rc, int mod) {
        EList<InitativePass> actionPhases = getActionPhases();

        Collection<InitativePass> filter = Collections2.filter(actionPhases, new Predicate<InitativePass>() {

            @Override
            public boolean apply(InitativePass input) {
                return rc.equals(input.getSubject()) && !input.isExecuted();
            }
        });
        ArrayList<InitativePass> removelist = new ArrayList<InitativePass>();
        for (InitativePass initativePass : filter) {
            if (rc.getZustand() != Zustand.OK)
                initativePass.setPhase(-1);
            else
                initativePass.setPhase(initativePass.getPhase() - mod);
            if (initativePass.getPhase() < 0)
                removelist.add(initativePass);
        }
        if (!removelist.isEmpty()) {
            actionPhases.removeAll(removelist);
        }
        ArrayList<InitativePass> list = new ArrayList<InitativePass>(actionPhases);
        Collections.sort(list, new CombatTurnImpl.InitativeComperator());
        actionPhases.clear();
        actionPhases.addAll(list);
    }

} // CombatTurnImpl
