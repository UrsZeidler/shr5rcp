/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.gameplay.CommandWrapper;
import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptAction;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initative Pass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl#getTurn <em>Turn</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl#isSizeInitative <em>Size Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl#getFreeAction <em>Free Action</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl#getInterruptAction <em>Interrupt Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitativePassImpl extends SubjectCommandImpl implements InitativePass {
    /**
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final int PHASE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected int phase = PHASE_EDEFAULT;

    /**
     * The default value of the '{@link #getTurn() <em>Turn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurn()
     * @generated
     * @ordered
     */
    protected static final int TURN_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTurn() <em>Turn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurn()
     * @generated
     * @ordered
     */
    protected int turn = TURN_EDEFAULT;

    /**
     * The default value of the '{@link #isSizeInitative() <em>Size Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSizeInitative()
     * @generated
     * @ordered
     */
    protected static final boolean SIZE_INITATIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSizeInitative() <em>Size Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSizeInitative()
     * @generated
     * @ordered
     */
    protected boolean sizeInitative = SIZE_INITATIVE_EDEFAULT;

    /**
     * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAction()
     * @generated
     * @ordered
     */
    protected CommandWrapper action;

    /**
     * The cached value of the '{@link #getFreeAction() <em>Free Action</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFreeAction()
     * @generated
     * @ordered
     */
    protected FreeAction freeAction;

    /**
     * The cached value of the '{@link #getInterruptAction() <em>Interrupt Action</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterruptAction()
     * @generated
     * @ordered
     */
    protected InterruptAction interruptAction;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InitativePassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.INITATIVE_PASS;
    }

    @Override
    public boolean isCanExecute() {
        return subject != null && subject.getCharacter() != null && subject.getCharacter().getPersona() != null

        && !executed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public void redo() {
        if (!isCanExecute())
            return;
        executing = true;

        if (getFreeAction() != null) {
            getFreeAction().setDate(getDate());
            getFreeAction().redo();
        }

        InterruptAction interruptAction2 = getInterruptAction();
        if (interruptAction2 != null) {
            interruptAction2.setDate(getDate());
            interruptAction2.redo();
        } else if (getAction() != null) {
            getAction().setDate(getDate());
            getAction().redo();
        }
        
        executed = true;
        executing = false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPhase() {
        return phase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPhase(int newPhase) {
        int oldPhase = phase;
        phase = newPhase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE_PASS__PHASE, oldPhase, phase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTurn() {
        return turn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTurn(int newTurn) {
        int oldTurn = turn;
        turn = newTurn;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE_PASS__TURN, oldTurn, turn));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSizeInitative() {
        return sizeInitative;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSizeInitative(boolean newSizeInitative) {
        boolean oldSizeInitative = sizeInitative;
        sizeInitative = newSizeInitative;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE_PASS__SIZE_INITATIVE, oldSizeInitative, sizeInitative));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommandWrapper getAction() {
        return action;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAction(CommandWrapper newAction, NotificationChain msgs) {
        CommandWrapper oldAction = action;
        action = newAction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE_PASS__ACTION, oldAction, newAction);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setAction(CommandWrapper newAction) {
        if (newAction != action) {
            NotificationChain msgs = null;
            if (action != null)
                msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.INITATIVE_PASS__ACTION, null, msgs);
            if (newAction != null){
                msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.INITATIVE_PASS__ACTION, null, msgs);
            
                newAction.setCmdCallback(getCmdCallback());
                newAction.setSubject(getSubject());
            } msgs = basicSetAction(newAction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE_PASS__ACTION, newAction, newAction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FreeAction getFreeAction() {
        return freeAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFreeAction(FreeAction newFreeAction, NotificationChain msgs) {
        FreeAction oldFreeAction = freeAction;
        freeAction = newFreeAction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE_PASS__FREE_ACTION, oldFreeAction, newFreeAction);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setFreeAction(FreeAction newFreeAction) {
        if (newFreeAction != freeAction) {
            NotificationChain msgs = null;
            if (freeAction != null)
                msgs = ((InternalEObject)freeAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.INITATIVE_PASS__FREE_ACTION, null, msgs);
            if (newFreeAction != null){
                msgs = ((InternalEObject)newFreeAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.INITATIVE_PASS__FREE_ACTION, null, msgs);
            
                newFreeAction.setCmdCallback(getCmdCallback());
                newFreeAction.setSubject(getSubject());
            } msgs = basicSetFreeAction(newFreeAction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE_PASS__FREE_ACTION, newFreeAction, newFreeAction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterruptAction getInterruptAction() {
        return interruptAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInterruptAction(InterruptAction newInterruptAction, NotificationChain msgs) {
        InterruptAction oldInterruptAction = interruptAction;
        interruptAction = newInterruptAction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION, oldInterruptAction, newInterruptAction);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setInterruptAction(InterruptAction newInterruptAction) {
        if (newInterruptAction != interruptAction) {
            NotificationChain msgs = null;
            if (interruptAction != null)
                msgs = ((InternalEObject)interruptAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION, null, msgs);
            if (newInterruptAction != null){
                msgs = ((InternalEObject)newInterruptAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION, null, msgs);
            
                newInterruptAction.setCmdCallback(getCmdCallback());
                newInterruptAction.setSubject(getSubject());
            } msgs = basicSetInterruptAction(newInterruptAction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION, newInterruptAction, newInterruptAction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GameplayPackage.INITATIVE_PASS__ACTION:
                return basicSetAction(null, msgs);
            case GameplayPackage.INITATIVE_PASS__FREE_ACTION:
                return basicSetFreeAction(null, msgs);
            case GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION:
                return basicSetInterruptAction(null, msgs);
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
            case GameplayPackage.INITATIVE_PASS__PHASE:
                return getPhase();
            case GameplayPackage.INITATIVE_PASS__TURN:
                return getTurn();
            case GameplayPackage.INITATIVE_PASS__SIZE_INITATIVE:
                return isSizeInitative();
            case GameplayPackage.INITATIVE_PASS__ACTION:
                return getAction();
            case GameplayPackage.INITATIVE_PASS__FREE_ACTION:
                return getFreeAction();
            case GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION:
                return getInterruptAction();
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
            case GameplayPackage.INITATIVE_PASS__PHASE:
                setPhase((Integer)newValue);
                return;
            case GameplayPackage.INITATIVE_PASS__TURN:
                setTurn((Integer)newValue);
                return;
            case GameplayPackage.INITATIVE_PASS__SIZE_INITATIVE:
                setSizeInitative((Boolean)newValue);
                return;
            case GameplayPackage.INITATIVE_PASS__ACTION:
                setAction((CommandWrapper)newValue);
                return;
            case GameplayPackage.INITATIVE_PASS__FREE_ACTION:
                setFreeAction((FreeAction)newValue);
                return;
            case GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION:
                setInterruptAction((InterruptAction)newValue);
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
            case GameplayPackage.INITATIVE_PASS__PHASE:
                setPhase(PHASE_EDEFAULT);
                return;
            case GameplayPackage.INITATIVE_PASS__TURN:
                setTurn(TURN_EDEFAULT);
                return;
            case GameplayPackage.INITATIVE_PASS__SIZE_INITATIVE:
                setSizeInitative(SIZE_INITATIVE_EDEFAULT);
                return;
            case GameplayPackage.INITATIVE_PASS__ACTION:
                setAction((CommandWrapper)null);
                return;
            case GameplayPackage.INITATIVE_PASS__FREE_ACTION:
                setFreeAction((FreeAction)null);
                return;
            case GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION:
                setInterruptAction((InterruptAction)null);
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
            case GameplayPackage.INITATIVE_PASS__PHASE:
                return phase != PHASE_EDEFAULT;
            case GameplayPackage.INITATIVE_PASS__TURN:
                return turn != TURN_EDEFAULT;
            case GameplayPackage.INITATIVE_PASS__SIZE_INITATIVE:
                return sizeInitative != SIZE_INITATIVE_EDEFAULT;
            case GameplayPackage.INITATIVE_PASS__ACTION:
                return action != null;
            case GameplayPackage.INITATIVE_PASS__FREE_ACTION:
                return freeAction != null;
            case GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION:
                return interruptAction != null;
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
        if (baseClass == PhaseCmd.class) {
            switch (derivedFeatureID) {
                case GameplayPackage.INITATIVE_PASS__PHASE: return GameplayPackage.PHASE_CMD__PHASE;
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
        if (baseClass == PhaseCmd.class) {
            switch (baseFeatureID) {
                case GameplayPackage.PHASE_CMD__PHASE: return GameplayPackage.INITATIVE_PASS__PHASE;
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
        result.append(" (phase: ");
        result.append(phase);
        result.append(", turn: ");
        result.append(turn);
        result.append(", sizeInitative: ");
        result.append(sizeInitative);
        result.append(')');
        return result.toString();
    }

} // InitativePassImpl
