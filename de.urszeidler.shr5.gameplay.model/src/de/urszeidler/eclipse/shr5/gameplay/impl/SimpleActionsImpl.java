/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SimpleActions;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionsImpl#getAction1 <em>Action1</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionsImpl#getAction2 <em>Action2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleActionsImpl extends CommandWrapperImpl implements SimpleActions {
    /**
     * The cached value of the '{@link #getAction1() <em>Action1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAction1()
     * @generated
     * @ordered
     */
    protected SimpleAction action1;

    /**
     * The cached value of the '{@link #getAction2() <em>Action2</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAction2()
     * @generated
     * @ordered
     */
    protected SimpleAction action2;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleActionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.SIMPLE_ACTIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleAction getAction1() {
        return action1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAction1(SimpleAction newAction1, NotificationChain msgs) {
        SimpleAction oldAction1 = action1;
        action1 = newAction1;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameplayPackage.SIMPLE_ACTIONS__ACTION1, oldAction1, newAction1);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAction1(SimpleAction newAction1) {
        if (newAction1 != action1) {
            NotificationChain msgs = null;
            if (action1 != null)
                msgs = ((InternalEObject)action1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.SIMPLE_ACTIONS__ACTION1, null, msgs);
            if (newAction1 != null)
                msgs = ((InternalEObject)newAction1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.SIMPLE_ACTIONS__ACTION1, null, msgs);
            msgs = basicSetAction1(newAction1, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SIMPLE_ACTIONS__ACTION1, newAction1, newAction1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleAction getAction2() {
        return action2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAction2(SimpleAction newAction2, NotificationChain msgs) {
        SimpleAction oldAction2 = action2;
        action2 = newAction2;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameplayPackage.SIMPLE_ACTIONS__ACTION2, oldAction2, newAction2);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAction2(SimpleAction newAction2) {
        if (newAction2 != action2) {
            NotificationChain msgs = null;
            if (action2 != null)
                msgs = ((InternalEObject)action2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.SIMPLE_ACTIONS__ACTION2, null, msgs);
            if (newAction2 != null)
                msgs = ((InternalEObject)newAction2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.SIMPLE_ACTIONS__ACTION2, null, msgs);
            msgs = basicSetAction2(newAction2, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SIMPLE_ACTIONS__ACTION2, newAction2, newAction2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GameplayPackage.SIMPLE_ACTIONS__ACTION1:
                return basicSetAction1(null, msgs);
            case GameplayPackage.SIMPLE_ACTIONS__ACTION2:
                return basicSetAction2(null, msgs);
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
            case GameplayPackage.SIMPLE_ACTIONS__ACTION1:
                return getAction1();
            case GameplayPackage.SIMPLE_ACTIONS__ACTION2:
                return getAction2();
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
            case GameplayPackage.SIMPLE_ACTIONS__ACTION1:
                setAction1((SimpleAction)newValue);
                return;
            case GameplayPackage.SIMPLE_ACTIONS__ACTION2:
                setAction2((SimpleAction)newValue);
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
            case GameplayPackage.SIMPLE_ACTIONS__ACTION1:
                setAction1((SimpleAction)null);
                return;
            case GameplayPackage.SIMPLE_ACTIONS__ACTION2:
                setAction2((SimpleAction)null);
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
            case GameplayPackage.SIMPLE_ACTIONS__ACTION1:
                return action1 != null;
            case GameplayPackage.SIMPLE_ACTIONS__ACTION2:
                return action2 != null;
        }
        return super.eIsSet(featureID);
    }

    @Override
    public boolean isCanExecute() {
        return (getAction1() != null ) || (getAction2() != null );
    }

    @Override
    public void redo() {
        executing = true;

        if (getAction1() != null) {
            getAction1().setCmdCallback(getCmdCallback());
            getAction1().setSubject(getSubject());
            getAction1().setDate(getDate());
            getAction1().redo();
        }
        if (getAction2() != null) {
            getAction2().setCmdCallback(getCmdCallback());
            getAction2().setSubject(getSubject());
            getAction2().setDate(getDate());
            getAction2().redo();
        }
        executed = true;
        executing = false;
    }
} // SimpleActionsImpl
