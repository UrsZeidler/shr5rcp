/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;

import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Feature Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl#isExecuted <em>Executed</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl#getSubCommands <em>Sub Commands</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl#getCmdCallback <em>Cmd Callback</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl#isExecuting <em>Executing</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl#isCanExecute <em>Can Execute</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl#getObject <em>Object</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetFeatureCommandImpl extends MinimalEObjectImpl.Container implements SetFeatureCommand {
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
     * @generated
     * @ordered
     */
    protected static final CommandCallback CMD_CALLBACK_EDEFAULT = (CommandCallback)GameplayFactory.eINSTANCE.createFromString(GameplayPackage.eINSTANCE.getCommandCallback(), "");

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
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Object VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Object value = VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObject()
     * @generated
     * @ordered
     */
    protected EObject object;

    /**
     * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeature()
     * @generated
     * @ordered
     */
    protected EStructuralFeature feature;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetFeatureCommandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.SET_FEATURE_COMMAND;
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_FEATURE_COMMAND__EXECUTED, oldExecuted, executed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Command> getSubCommands() {
        if (subCommands == null) {
            subCommands = new EObjectContainmentEList<Command>(Command.class, this, GameplayPackage.SET_FEATURE_COMMAND__SUB_COMMANDS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_FEATURE_COMMAND__DATE, oldDate, date));
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_FEATURE_COMMAND__CMD_CALLBACK, oldCmdCallback, cmdCallback, !oldCmdCallbackESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, GameplayPackage.SET_FEATURE_COMMAND__CMD_CALLBACK, oldCmdCallback, CMD_CALLBACK_EDEFAULT, oldCmdCallbackESet));
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
    public boolean isExecuting() {
        return executing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecuting(boolean newExecuting) {
        boolean oldExecuting = executing;
        executing = newExecuting;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_FEATURE_COMMAND__EXECUTING, oldExecuting, executing));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCanExecute() {
        // TODO: implement this method to return the 'Can Execute' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(Object newValue) {
        Object oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_FEATURE_COMMAND__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getObject() {
        if (object != null && object.eIsProxy()) {
            InternalEObject oldObject = (InternalEObject)object;
            object = eResolveProxy(oldObject);
            if (object != oldObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.SET_FEATURE_COMMAND__OBJECT, oldObject, object));
            }
        }
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetObject() {
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObject(EObject newObject) {
        EObject oldObject = object;
        object = newObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_FEATURE_COMMAND__OBJECT, oldObject, object));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EStructuralFeature getFeature() {
        if (feature != null && feature.eIsProxy()) {
            InternalEObject oldFeature = (InternalEObject)feature;
            feature = (EStructuralFeature)eResolveProxy(oldFeature);
            if (feature != oldFeature) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.SET_FEATURE_COMMAND__FEATURE, oldFeature, feature));
            }
        }
        return feature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EStructuralFeature basicGetFeature() {
        return feature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeature(EStructuralFeature newFeature) {
        EStructuralFeature oldFeature = feature;
        feature = newFeature;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_FEATURE_COMMAND__FEATURE, oldFeature, feature));
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
            case GameplayPackage.SET_FEATURE_COMMAND__SUB_COMMANDS:
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
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTED:
                return isExecuted();
            case GameplayPackage.SET_FEATURE_COMMAND__SUB_COMMANDS:
                return getSubCommands();
            case GameplayPackage.SET_FEATURE_COMMAND__DATE:
                return getDate();
            case GameplayPackage.SET_FEATURE_COMMAND__CMD_CALLBACK:
                return getCmdCallback();
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTING:
                return isExecuting();
            case GameplayPackage.SET_FEATURE_COMMAND__CAN_EXECUTE:
                return isCanExecute();
            case GameplayPackage.SET_FEATURE_COMMAND__VALUE:
                return getValue();
            case GameplayPackage.SET_FEATURE_COMMAND__OBJECT:
                if (resolve) return getObject();
                return basicGetObject();
            case GameplayPackage.SET_FEATURE_COMMAND__FEATURE:
                if (resolve) return getFeature();
                return basicGetFeature();
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
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTED:
                setExecuted((Boolean)newValue);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__SUB_COMMANDS:
                getSubCommands().clear();
                getSubCommands().addAll((Collection<? extends Command>)newValue);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__DATE:
                setDate((Date)newValue);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__CMD_CALLBACK:
                setCmdCallback((CommandCallback)newValue);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTING:
                setExecuting((Boolean)newValue);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__VALUE:
                setValue(newValue);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__OBJECT:
                setObject((EObject)newValue);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__FEATURE:
                setFeature((EStructuralFeature)newValue);
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
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTED:
                setExecuted(EXECUTED_EDEFAULT);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__SUB_COMMANDS:
                getSubCommands().clear();
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__DATE:
                setDate(DATE_EDEFAULT);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__CMD_CALLBACK:
                unsetCmdCallback();
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTING:
                setExecuting(EXECUTING_EDEFAULT);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__OBJECT:
                setObject((EObject)null);
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__FEATURE:
                setFeature((EStructuralFeature)null);
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
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTED:
                return executed != EXECUTED_EDEFAULT;
            case GameplayPackage.SET_FEATURE_COMMAND__SUB_COMMANDS:
                return subCommands != null && !subCommands.isEmpty();
            case GameplayPackage.SET_FEATURE_COMMAND__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
            case GameplayPackage.SET_FEATURE_COMMAND__CMD_CALLBACK:
                return isSetCmdCallback();
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTING:
                return executing != EXECUTING_EDEFAULT;
            case GameplayPackage.SET_FEATURE_COMMAND__CAN_EXECUTE:
                return isCanExecute() != CAN_EXECUTE_EDEFAULT;
            case GameplayPackage.SET_FEATURE_COMMAND__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case GameplayPackage.SET_FEATURE_COMMAND__OBJECT:
                return object != null;
            case GameplayPackage.SET_FEATURE_COMMAND__FEATURE:
                return feature != null;
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
            case GameplayPackage.SET_FEATURE_COMMAND___REDO:
                redo();
                return null;
            case GameplayPackage.SET_FEATURE_COMMAND___UNDO:
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
        result.append(", executing: ");
        result.append(executing);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //SetFeatureCommandImpl
