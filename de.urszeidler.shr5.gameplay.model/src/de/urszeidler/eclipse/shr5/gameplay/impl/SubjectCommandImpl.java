/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.ComandCallback;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SubjectCommandImpl#isExecuted <em>Executed</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SubjectCommandImpl#getSubCommands <em>Sub Commands</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SubjectCommandImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SubjectCommandImpl#getCmdCallback <em>Cmd Callback</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SubjectCommandImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectCommandImpl extends MinimalEObjectImpl.Container implements SubjectCommand {
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
    protected static final ComandCallback CMD_CALLBACK_EDEFAULT = null;//(ComandCallback)GameplayFactory.eINSTANCE.createFromString(GameplayPackage.eINSTANCE.getComandCallback(), "");

    /**
     * The cached value of the '{@link #getCmdCallback() <em>Cmd Callback</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCmdCallback()
     * @generated
     * @ordered
     */
    protected ComandCallback cmdCallback = CMD_CALLBACK_EDEFAULT;

    /**
     * This is true if the Cmd Callback attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cmdCallbackESet;

    /**
     * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected RuntimeCharacter subject;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubjectCommandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.SUBJECT_COMMAND;
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SUBJECT_COMMAND__EXECUTED, oldExecuted, executed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Command> getSubCommands() {
        if (subCommands == null) {
            subCommands = new EObjectContainmentEList<Command>(Command.class, this, GameplayPackage.SUBJECT_COMMAND__SUB_COMMANDS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SUBJECT_COMMAND__DATE, oldDate, date));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComandCallback getCmdCallback() {
        return cmdCallback;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCmdCallback(ComandCallback newCmdCallback) {
        ComandCallback oldCmdCallback = cmdCallback;
        cmdCallback = newCmdCallback;
        boolean oldCmdCallbackESet = cmdCallbackESet;
        cmdCallbackESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SUBJECT_COMMAND__CMD_CALLBACK, oldCmdCallback, cmdCallback, !oldCmdCallbackESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCmdCallback() {
        ComandCallback oldCmdCallback = cmdCallback;
        boolean oldCmdCallbackESet = cmdCallbackESet;
        cmdCallback = CMD_CALLBACK_EDEFAULT;
        cmdCallbackESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, GameplayPackage.SUBJECT_COMMAND__CMD_CALLBACK, oldCmdCallback, CMD_CALLBACK_EDEFAULT, oldCmdCallbackESet));
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
    public RuntimeCharacter getSubject() {
        if (subject != null && subject.eIsProxy()) {
            InternalEObject oldSubject = (InternalEObject)subject;
            subject = (RuntimeCharacter)eResolveProxy(oldSubject);
            if (subject != oldSubject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.SUBJECT_COMMAND__SUBJECT, oldSubject, subject));
            }
        }
        return subject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeCharacter basicGetSubject() {
        return subject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubject(RuntimeCharacter newSubject) {
        RuntimeCharacter oldSubject = subject;
        subject = newSubject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SUBJECT_COMMAND__SUBJECT, oldSubject, subject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void redo() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void undo() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GameplayPackage.SUBJECT_COMMAND__SUB_COMMANDS:
                return ((InternalEList<?>)getSubCommands()).basicRemove(otherEnd, msgs);
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
            case GameplayPackage.SUBJECT_COMMAND__EXECUTED:
                return isExecuted();
            case GameplayPackage.SUBJECT_COMMAND__SUB_COMMANDS:
                return getSubCommands();
            case GameplayPackage.SUBJECT_COMMAND__DATE:
                return getDate();
            case GameplayPackage.SUBJECT_COMMAND__CMD_CALLBACK:
                return getCmdCallback();
            case GameplayPackage.SUBJECT_COMMAND__SUBJECT:
                if (resolve) return getSubject();
                return basicGetSubject();
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
            case GameplayPackage.SUBJECT_COMMAND__EXECUTED:
                setExecuted((Boolean)newValue);
                return;
            case GameplayPackage.SUBJECT_COMMAND__SUB_COMMANDS:
                getSubCommands().clear();
                getSubCommands().addAll((Collection<? extends Command>)newValue);
                return;
            case GameplayPackage.SUBJECT_COMMAND__DATE:
                setDate((Date)newValue);
                return;
            case GameplayPackage.SUBJECT_COMMAND__CMD_CALLBACK:
                setCmdCallback((ComandCallback)newValue);
                return;
            case GameplayPackage.SUBJECT_COMMAND__SUBJECT:
                setSubject((RuntimeCharacter)newValue);
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
            case GameplayPackage.SUBJECT_COMMAND__EXECUTED:
                setExecuted(EXECUTED_EDEFAULT);
                return;
            case GameplayPackage.SUBJECT_COMMAND__SUB_COMMANDS:
                getSubCommands().clear();
                return;
            case GameplayPackage.SUBJECT_COMMAND__DATE:
                setDate(DATE_EDEFAULT);
                return;
            case GameplayPackage.SUBJECT_COMMAND__CMD_CALLBACK:
                unsetCmdCallback();
                return;
            case GameplayPackage.SUBJECT_COMMAND__SUBJECT:
                setSubject((RuntimeCharacter)null);
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
            case GameplayPackage.SUBJECT_COMMAND__EXECUTED:
                return executed != EXECUTED_EDEFAULT;
            case GameplayPackage.SUBJECT_COMMAND__SUB_COMMANDS:
                return subCommands != null && !subCommands.isEmpty();
            case GameplayPackage.SUBJECT_COMMAND__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
            case GameplayPackage.SUBJECT_COMMAND__CMD_CALLBACK:
                return isSetCmdCallback();
            case GameplayPackage.SUBJECT_COMMAND__SUBJECT:
                return subject != null;
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
            case GameplayPackage.SUBJECT_COMMAND___REDO:
                redo();
                return null;
            case GameplayPackage.SUBJECT_COMMAND___UNDO:
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

} //SubjectCommandImpl
