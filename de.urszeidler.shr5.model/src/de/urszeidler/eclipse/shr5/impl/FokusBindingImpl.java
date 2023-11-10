/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.Fokus;
import de.urszeidler.eclipse.shr5.FokusBinding;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fokus Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FokusBindingImpl#getFokus <em>Fokus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FokusBindingImpl#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FokusBindingImpl extends MinimalEObjectImpl.Container implements FokusBinding {
    /**
     * The cached value of the '{@link #getFokus() <em>Fokus</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFokus()
     * @generated
     * @ordered
     */
    protected Fokus fokus;

    /**
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean active = ACTIVE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FokusBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.FOKUS_BINDING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Fokus getFokus() {
        if (fokus != null && fokus.eIsProxy()) {
            InternalEObject oldFokus = (InternalEObject)fokus;
            fokus = (Fokus)eResolveProxy(oldFokus);
            if (fokus != oldFokus) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.FOKUS_BINDING__FOKUS, oldFokus, fokus));
            }
        }
        return fokus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fokus basicGetFokus() {
        return fokus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFokus(Fokus newFokus) {
        Fokus oldFokus = fokus;
        fokus = newFokus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FOKUS_BINDING__FOKUS, oldFokus, fokus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isActive() {
        return active;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActive(boolean newActive) {
        boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FOKUS_BINDING__ACTIVE, oldActive, active));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.FOKUS_BINDING__FOKUS:
                if (resolve) return getFokus();
                return basicGetFokus();
            case Shr5Package.FOKUS_BINDING__ACTIVE:
                return isActive();
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
            case Shr5Package.FOKUS_BINDING__FOKUS:
                setFokus((Fokus)newValue);
                return;
            case Shr5Package.FOKUS_BINDING__ACTIVE:
                setActive((Boolean)newValue);
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
            case Shr5Package.FOKUS_BINDING__FOKUS:
                setFokus((Fokus)null);
                return;
            case Shr5Package.FOKUS_BINDING__ACTIVE:
                setActive(ACTIVE_EDEFAULT);
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
            case Shr5Package.FOKUS_BINDING__FOKUS:
                return fokus != null;
            case Shr5Package.FOKUS_BINDING__ACTIVE:
                return active != ACTIVE_EDEFAULT;
        }
        return super.eIsSet(featureID);
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
        result.append(" (active: ");
        result.append(active);
        result.append(')');
        return result.toString();
    }

} //FokusBindingImpl
