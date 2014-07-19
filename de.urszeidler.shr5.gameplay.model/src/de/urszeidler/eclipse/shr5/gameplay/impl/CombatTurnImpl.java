/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Initative;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combat Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#isExecuted <em>Executed</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getSubCommands <em>Sub Commands</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getCmdCallback <em>Cmd Callback</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getCombatants <em>Combatants</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl#getActionPhases <em>Action Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombatTurnImpl extends MinimalEObjectImpl.Container implements CombatTurn {
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
     * @see #getCmdCallback()
     * @generated not
     * @ordered
     */
    protected static final CommandCallback CMD_CALLBACK_EDEFAULT = null;//(ComandCallback)GameplayFactory.eINSTANCE.createFromString(GameplayPackage.eINSTANCE.getComandCallback(), "");

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
    protected EList<PhaseCmd> actionPhases;

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
    public boolean isExecuted() {
        return executed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public Date getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public CommandCallback getCmdCallback() {
        return cmdCallback;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public boolean isSetCmdCallback() {
        return cmdCallbackESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public EList<PhaseCmd> getActionPhases() {
        if (actionPhases == null) {
            actionPhases = new EObjectContainmentEList<PhaseCmd>(PhaseCmd.class, this, GameplayPackage.COMBAT_TURN__ACTION_PHASES);
        }
        return actionPhases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void redo() {
        executed = true; 
        getActionPhases().clear();
        getSubCommands().clear();

        for (RuntimeCharacter abstractNaturalPerson : combatants) {
            Initative initative = GameplayFactory.eINSTANCE.createInitative();
            initative.setSubject(abstractNaturalPerson);
            initative.redo();
            subCommands.add(initative);
        }
        List<PhaseCmd> phaseCommands = new ArrayList<PhaseCmd>();
        for (Command command : subCommands) {
            if (command instanceof Initative) {
                Initative ini = (Initative) command;
                int currentIni = ini.getIni();
                while (currentIni>0) {
                    ActionPhaseCmd action = GameplayFactory.eINSTANCE.createActionPhaseCmd();
                    action.setSubject(ini.getSubject());
                    action.setPhase(currentIni);
                    currentIni=currentIni-10;
                    
                    phaseCommands.add(action);
                }                
            }           
        }
        Collections.sort(phaseCommands, new Comparator<PhaseCmd>(){
              @Override
            public int compare(PhaseCmd o1, PhaseCmd o2) {
                int val = o1.getPhase() - o2.getPhase();
                
                if(val==0){
                    //TODO : we need to check all the other compare options
                }
                return val * -1;
            }
            
        });
        
        //subCommands.addAll((Collection<? extends Command>) phaseCommands);
        getActionPhases().addAll(phaseCommands);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
            case GameplayPackage.COMBAT_TURN__COMBATANTS:
                return getCombatants();
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
                return getActionPhases();
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
            case GameplayPackage.COMBAT_TURN__COMBATANTS:
                getCombatants().clear();
                getCombatants().addAll((Collection<? extends RuntimeCharacter>)newValue);
                return;
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
                getActionPhases().clear();
                getActionPhases().addAll((Collection<? extends PhaseCmd>)newValue);
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
            case GameplayPackage.COMBAT_TURN__COMBATANTS:
                getCombatants().clear();
                return;
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
                getActionPhases().clear();
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
            case GameplayPackage.COMBAT_TURN__COMBATANTS:
                return combatants != null && !combatants.isEmpty();
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
                return actionPhases != null && !actionPhases.isEmpty();
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (executed: ");
        result.append(executed);
        result.append(", date: ");
        result.append(date);
        result.append(", cmdCallback: ");
        if (cmdCallbackESet) result.append(cmdCallback); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CombatTurnImpl