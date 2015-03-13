/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.ModuleCharacterChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Character Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleCharacterChangeImpl#getCharacterChange <em>Character Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleCharacterChangeImpl extends ModuleChangeImpl implements ModuleCharacterChange {
    /**
     * The cached value of the '{@link #getCharacterChange() <em>Character Change</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacterChange()
     * @generated
     * @ordered
     */
    protected Changes characterChange;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleCharacterChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.MODULE_CHARACTER_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Changes getCharacterChange() {
        return characterChange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCharacterChange(Changes newCharacterChange, NotificationChain msgs) {
        Changes oldCharacterChange = characterChange;
        characterChange = newCharacterChange;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE, oldCharacterChange, newCharacterChange);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharacterChange(Changes newCharacterChange) {
        if (newCharacterChange != characterChange) {
            NotificationChain msgs = null;
            if (characterChange != null)
                msgs = ((InternalEObject)characterChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE, null, msgs);
            if (newCharacterChange != null)
                msgs = ((InternalEObject)newCharacterChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE, null, msgs);
            msgs = basicSetCharacterChange(newCharacterChange, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE, newCharacterChange, newCharacterChange));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE:
                return basicSetCharacterChange(null, msgs);
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
            case Shr5managementPackage.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE:
                return getCharacterChange();
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
            case Shr5managementPackage.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE:
                setCharacterChange((Changes)newValue);
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
            case Shr5managementPackage.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE:
                setCharacterChange((Changes)null);
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
            case Shr5managementPackage.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE:
                return characterChange != null;
        }
        return super.eIsSet(featureID);
    }

} //ModuleCharacterChangeImpl
