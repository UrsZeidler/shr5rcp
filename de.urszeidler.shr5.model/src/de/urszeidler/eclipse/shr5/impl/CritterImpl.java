/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.Critter;
import de.urszeidler.eclipse.shr5.CritterKraft;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Critter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CritterImpl#getPowers <em>Powers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CritterImpl extends SpeziesImpl implements Critter {
    /**
     * The cached value of the '{@link #getPowers() <em>Powers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowers()
     * @generated
     * @ordered
     */
    protected EList<CritterKraft> powers;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CritterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.CRITTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CritterKraft> getPowers() {
        if (powers == null) {
            powers = new EObjectContainmentEList<CritterKraft>(CritterKraft.class, this, Shr5Package.CRITTER__POWERS);
        }
        return powers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.CRITTER__POWERS:
                return ((InternalEList<?>)getPowers()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.CRITTER__POWERS:
                return getPowers();
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
            case Shr5Package.CRITTER__POWERS:
                getPowers().clear();
                getPowers().addAll((Collection<? extends CritterKraft>)newValue);
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
            case Shr5Package.CRITTER__POWERS:
                getPowers().clear();
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
            case Shr5Package.CRITTER__POWERS:
                return powers != null && !powers.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CritterImpl
