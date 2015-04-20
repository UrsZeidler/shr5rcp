/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5Management.ModuleTeachableChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Teachable Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleTeachableChangeImpl#getTeachable <em>Teachable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleTeachableChangeImpl extends ModuleTypeChangeImpl<Erlernbar> implements ModuleTeachableChange {
    /**
     * The cached value of the '{@link #getTeachable() <em>Teachable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeachable()
     * @generated
     * @ordered
     */
    protected Erlernbar teachable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleTeachableChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.MODULE_TEACHABLE_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setSelected(Erlernbar newSelected) {
        super.setSelected(newSelected);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific element type known in this context.
     * @generated
     */
    @Override
    public EList<Erlernbar> getSelectOne() {
        if (selectOne == null) {
            selectOne = new EObjectResolvingEList<Erlernbar>(Erlernbar.class, this, Shr5managementPackage.MODULE_TEACHABLE_CHANGE__SELECT_ONE);
        }
        return selectOne;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Erlernbar getTeachable() {
        if (teachable != null && teachable.eIsProxy()) {
            InternalEObject oldTeachable = (InternalEObject)teachable;
            teachable = (Erlernbar)eResolveProxy(oldTeachable);
            if (teachable != oldTeachable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.MODULE_TEACHABLE_CHANGE__TEACHABLE, oldTeachable, teachable));
            }
        }
        return teachable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Erlernbar basicGetTeachable() {
        return teachable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTeachable(Erlernbar newTeachable) {
        Erlernbar oldTeachable = teachable;
        teachable = newTeachable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_TEACHABLE_CHANGE__TEACHABLE, oldTeachable, teachable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.MODULE_TEACHABLE_CHANGE__TEACHABLE:
                if (resolve) return getTeachable();
                return basicGetTeachable();
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
            case Shr5managementPackage.MODULE_TEACHABLE_CHANGE__TEACHABLE:
                setTeachable((Erlernbar)newValue);
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
            case Shr5managementPackage.MODULE_TEACHABLE_CHANGE__TEACHABLE:
                setTeachable((Erlernbar)null);
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
            case Shr5managementPackage.MODULE_TEACHABLE_CHANGE__TEACHABLE:
                return teachable != null;
        }
        return super.eIsSet(featureID);
    }

} //ModuleTeachableChangeImpl
