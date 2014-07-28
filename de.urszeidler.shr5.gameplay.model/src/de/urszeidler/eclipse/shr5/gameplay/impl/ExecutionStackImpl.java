/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionStack;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionStackImpl#getCurrentCommand <em>Current Command</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionStackImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionStackImpl extends MinimalEObjectImpl.Container implements ExecutionStack {
    /**
     * The cached value of the '{@link #getCurrentCommand() <em>Current Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentCommand()
     * @generated
     * @ordered
     */
    protected Command currentCommand;

    /**
     * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocol()
     * @generated
     * @ordered
     */
    protected ExecutionProtocol protocol;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionStackImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.EXECUTION_STACK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Command getCurrentCommand() {
        if (currentCommand != null && currentCommand.eIsProxy()) {
            InternalEObject oldCurrentCommand = (InternalEObject)currentCommand;
            currentCommand = (Command)eResolveProxy(oldCurrentCommand);
            if (currentCommand != oldCurrentCommand) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.EXECUTION_STACK__CURRENT_COMMAND, oldCurrentCommand, currentCommand));
            }
        }
        return currentCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Command basicGetCurrentCommand() {
        return currentCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public NotificationChain basicSetCurrentCommand(Command newCurrentCommand, NotificationChain msgs) {
        Command oldCurrentCommand = currentCommand;
        if (oldCurrentCommand != null)
            if (getProtocol() != null)
                getProtocol().getCommands().add(oldCurrentCommand);

        currentCommand = newCurrentCommand;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameplayPackage.EXECUTION_STACK__CURRENT_COMMAND,
                    oldCurrentCommand, newCurrentCommand);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setCurrentCommand(Command newCurrentCommand) {
        Command oldCurrentCommand = currentCommand;
        currentCommand = newCurrentCommand;
        if (newCurrentCommand != null)
            if (getProtocol() != null)
                getProtocol().getCommands().add(newCurrentCommand);

        
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.EXECUTION_STACK__CURRENT_COMMAND, oldCurrentCommand, currentCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionProtocol getProtocol() {
        return protocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProtocol(ExecutionProtocol newProtocol, NotificationChain msgs) {
        ExecutionProtocol oldProtocol = protocol;
        protocol = newProtocol;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameplayPackage.EXECUTION_STACK__PROTOCOL, oldProtocol, newProtocol);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProtocol(ExecutionProtocol newProtocol) {
        if (newProtocol != protocol) {
            NotificationChain msgs = null;
            if (protocol != null)
                msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.EXECUTION_STACK__PROTOCOL, null, msgs);
            if (newProtocol != null)
                msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.EXECUTION_STACK__PROTOCOL, null, msgs);
            msgs = basicSetProtocol(newProtocol, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.EXECUTION_STACK__PROTOCOL, newProtocol, newProtocol));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void redo() {
        if (getCurrentCommand() == null)
            return;

        getCurrentCommand().redo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GameplayPackage.EXECUTION_STACK__PROTOCOL:
                return basicSetProtocol(null, msgs);
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
            case GameplayPackage.EXECUTION_STACK__CURRENT_COMMAND:
                if (resolve) return getCurrentCommand();
                return basicGetCurrentCommand();
            case GameplayPackage.EXECUTION_STACK__PROTOCOL:
                return getProtocol();
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
            case GameplayPackage.EXECUTION_STACK__CURRENT_COMMAND:
                setCurrentCommand((Command)newValue);
                return;
            case GameplayPackage.EXECUTION_STACK__PROTOCOL:
                setProtocol((ExecutionProtocol)newValue);
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
            case GameplayPackage.EXECUTION_STACK__CURRENT_COMMAND:
                setCurrentCommand((Command)null);
                return;
            case GameplayPackage.EXECUTION_STACK__PROTOCOL:
                setProtocol((ExecutionProtocol)null);
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
            case GameplayPackage.EXECUTION_STACK__CURRENT_COMMAND:
                return currentCommand != null;
            case GameplayPackage.EXECUTION_STACK__PROTOCOL:
                return protocol != null;
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
            case GameplayPackage.EXECUTION_STACK___REDO:
                redo();
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} // ExecutionStackImpl
