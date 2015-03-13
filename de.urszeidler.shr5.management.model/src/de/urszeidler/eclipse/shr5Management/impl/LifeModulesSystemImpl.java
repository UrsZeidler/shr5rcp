/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.LifeModule;
import de.urszeidler.eclipse.shr5Management.LifeModulesSystem;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Modules System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifeModulesSystemImpl#getModules <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifeModulesSystemImpl extends Shr5SystemImpl implements LifeModulesSystem {
    /**
     * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModules()
     * @generated
     * @ordered
     */
    protected EList<LifeModule> modules;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LifeModulesSystemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.LIFE_MODULES_SYSTEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LifeModule> getModules() {
        if (modules == null) {
            modules = new EObjectContainmentEList<LifeModule>(LifeModule.class, this, Shr5managementPackage.LIFE_MODULES_SYSTEM__MODULES);
        }
        return modules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.LIFE_MODULES_SYSTEM__MODULES:
                return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
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
            case Shr5managementPackage.LIFE_MODULES_SYSTEM__MODULES:
                return getModules();
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
            case Shr5managementPackage.LIFE_MODULES_SYSTEM__MODULES:
                getModules().clear();
                getModules().addAll((Collection<? extends LifeModule>)newValue);
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
            case Shr5managementPackage.LIFE_MODULES_SYSTEM__MODULES:
                getModules().clear();
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
            case Shr5managementPackage.LIFE_MODULES_SYSTEM__MODULES:
                return modules != null && !modules.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //LifeModulesSystemImpl
