/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

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

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SetExtendetData;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Extendet Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl#isExecuted <em>Executed</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl#getSubCommands <em>Sub Commands</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl#getCmdCallback <em>Cmd Callback</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl#isExecuting <em>Executing</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl#isCanExecute <em>Can Execute</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl#getDataAware <em>Data Aware</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl#getData <em>Data</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetExtendetDataImpl extends MinimalEObjectImpl.Container implements SetExtendetData {
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
    protected static final CommandCallback CMD_CALLBACK_EDEFAULT =  null;// (CommandCallback)GameplayFactory.eINSTANCE.createFromString(GameplayPackage.eINSTANCE.getCommandCallback(), "");

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
     * The cached value of the '{@link #getDataAware() <em>Data Aware</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataAware()
     * @generated
     * @ordered
     */
    protected AbstractExtendetDataAware dataAware;

    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected ExtendetData data;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetExtendetDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.SET_EXTENDET_DATA;
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_EXTENDET_DATA__EXECUTED, oldExecuted, executed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Command> getSubCommands() {
        if (subCommands == null) {
            subCommands = new EObjectContainmentEList<Command>(Command.class, this, GameplayPackage.SET_EXTENDET_DATA__SUB_COMMANDS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_EXTENDET_DATA__DATE, oldDate, date));
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_EXTENDET_DATA__CMD_CALLBACK, oldCmdCallback, cmdCallback, !oldCmdCallbackESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, GameplayPackage.SET_EXTENDET_DATA__CMD_CALLBACK, oldCmdCallback, CMD_CALLBACK_EDEFAULT, oldCmdCallbackESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_EXTENDET_DATA__EXECUTING, oldExecuting, executing));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public boolean isCanExecute() {
        return (getDataAware() != null && getData() != null);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractExtendetDataAware getDataAware() {
        if (dataAware != null && dataAware.eIsProxy()) {
            InternalEObject oldDataAware = (InternalEObject)dataAware;
            dataAware = (AbstractExtendetDataAware)eResolveProxy(oldDataAware);
            if (dataAware != oldDataAware) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.SET_EXTENDET_DATA__DATA_AWARE, oldDataAware, dataAware));
            }
        }
        return dataAware;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractExtendetDataAware basicGetDataAware() {
        return dataAware;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataAware(AbstractExtendetDataAware newDataAware) {
        AbstractExtendetDataAware oldDataAware = dataAware;
        dataAware = newDataAware;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_EXTENDET_DATA__DATA_AWARE, oldDataAware, dataAware));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtendetData getData() {
        if (data != null && data.eIsProxy()) {
            InternalEObject oldData = (InternalEObject)data;
            data = (ExtendetData)eResolveProxy(oldData);
            if (data != oldData) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.SET_EXTENDET_DATA__DATA, oldData, data));
            }
        }
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtendetData basicGetData() {
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setData(ExtendetData newData) {
        ExtendetData oldData = data;
        data = newData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_EXTENDET_DATA__DATA, oldData, data));
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SET_EXTENDET_DATA__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void redo() {
        setExecuting(true);

        if (isSetCmdCallback())
            cmdCallback.prepareCommand(this, GameplayPackage.Literals.SET_EXTENDET_DATA__DATA_AWARE);

        getDataAware().getExtendetData().put(getData(), getValue());
        
        setExecuted(true);
        setExecuting(false);

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
            case GameplayPackage.SET_EXTENDET_DATA__SUB_COMMANDS:
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
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTED:
                return isExecuted();
            case GameplayPackage.SET_EXTENDET_DATA__SUB_COMMANDS:
                return getSubCommands();
            case GameplayPackage.SET_EXTENDET_DATA__DATE:
                return getDate();
            case GameplayPackage.SET_EXTENDET_DATA__CMD_CALLBACK:
                return getCmdCallback();
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTING:
                return isExecuting();
            case GameplayPackage.SET_EXTENDET_DATA__CAN_EXECUTE:
                return isCanExecute();
            case GameplayPackage.SET_EXTENDET_DATA__DATA_AWARE:
                if (resolve) return getDataAware();
                return basicGetDataAware();
            case GameplayPackage.SET_EXTENDET_DATA__DATA:
                if (resolve) return getData();
                return basicGetData();
            case GameplayPackage.SET_EXTENDET_DATA__VALUE:
                return getValue();
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
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTED:
                setExecuted((Boolean)newValue);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__SUB_COMMANDS:
                getSubCommands().clear();
                getSubCommands().addAll((Collection<? extends Command>)newValue);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__DATE:
                setDate((Date)newValue);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__CMD_CALLBACK:
                setCmdCallback((CommandCallback)newValue);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTING:
                setExecuting((Boolean)newValue);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__DATA_AWARE:
                setDataAware((AbstractExtendetDataAware)newValue);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__DATA:
                setData((ExtendetData)newValue);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__VALUE:
                setValue(newValue);
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
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTED:
                setExecuted(EXECUTED_EDEFAULT);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__SUB_COMMANDS:
                getSubCommands().clear();
                return;
            case GameplayPackage.SET_EXTENDET_DATA__DATE:
                setDate(DATE_EDEFAULT);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__CMD_CALLBACK:
                unsetCmdCallback();
                return;
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTING:
                setExecuting(EXECUTING_EDEFAULT);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__DATA_AWARE:
                setDataAware((AbstractExtendetDataAware)null);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__DATA:
                setData((ExtendetData)null);
                return;
            case GameplayPackage.SET_EXTENDET_DATA__VALUE:
                setValue(VALUE_EDEFAULT);
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
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTED:
                return executed != EXECUTED_EDEFAULT;
            case GameplayPackage.SET_EXTENDET_DATA__SUB_COMMANDS:
                return subCommands != null && !subCommands.isEmpty();
            case GameplayPackage.SET_EXTENDET_DATA__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
            case GameplayPackage.SET_EXTENDET_DATA__CMD_CALLBACK:
                return isSetCmdCallback();
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTING:
                return executing != EXECUTING_EDEFAULT;
            case GameplayPackage.SET_EXTENDET_DATA__CAN_EXECUTE:
                return isCanExecute() != CAN_EXECUTE_EDEFAULT;
            case GameplayPackage.SET_EXTENDET_DATA__DATA_AWARE:
                return dataAware != null;
            case GameplayPackage.SET_EXTENDET_DATA__DATA:
                return data != null;
            case GameplayPackage.SET_EXTENDET_DATA__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
            case GameplayPackage.SET_EXTENDET_DATA___REDO:
                redo();
                return null;
            case GameplayPackage.SET_EXTENDET_DATA___UNDO:
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

} //SetExtendetDataImpl
