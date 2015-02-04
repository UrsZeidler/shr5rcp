/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterChangeImpl#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterChangeImpl extends DiaryEntryImpl implements CharacterChange {
    /**
     * The cached value of the '{@link #getChange() <em>Change</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChange()
     * @generated
     * @ordered
     */
    protected Changes change;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CharacterChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.CHARACTER_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Changes getChange() {
        if (change != null && change.eIsProxy()) {
            InternalEObject oldChange = (InternalEObject)change;
            change = (Changes)eResolveProxy(oldChange);
            if (change != oldChange) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.CHARACTER_CHANGE__CHANGE, oldChange, change));
            }
        }
        return change;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Changes basicGetChange() {
        return change;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChange(Changes newChange) {
        Changes oldChange = change;
        change = newChange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_CHANGE__CHANGE, oldChange, change));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_CHANGE__CHANGE:
                if (resolve) return getChange();
                return basicGetChange();
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
            case Shr5managementPackage.CHARACTER_CHANGE__CHANGE:
                setChange((Changes)newValue);
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
            case Shr5managementPackage.CHARACTER_CHANGE__CHANGE:
                setChange((Changes)null);
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
            case Shr5managementPackage.CHARACTER_CHANGE__CHANGE:
                return change != null;
        }
        return super.eIsSet(featureID);
    }

} //CharacterChangeImpl
