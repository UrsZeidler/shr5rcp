/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Substance;
import de.urszeidler.eclipse.shr5.SubstanceContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SubstanceContainerImpl#getSubstance <em>Substance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceContainerImpl extends AbstraktGegenstandImpl implements SubstanceContainer {
    /**
     * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubstance()
     * @generated
     * @ordered
     */
    protected Substance substance;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubstanceContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.SUBSTANCE_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Substance getSubstance() {
        return substance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubstance(Substance newSubstance, NotificationChain msgs) {
        Substance oldSubstance = substance;
        substance = newSubstance;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.SUBSTANCE_CONTAINER__SUBSTANCE, oldSubstance, newSubstance);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubstance(Substance newSubstance) {
        if (newSubstance != substance) {
            NotificationChain msgs = null;
            if (substance != null)
                msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.SUBSTANCE_CONTAINER__SUBSTANCE, null, msgs);
            if (newSubstance != null)
                msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5Package.SUBSTANCE_CONTAINER__SUBSTANCE, null, msgs);
            msgs = basicSetSubstance(newSubstance, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SUBSTANCE_CONTAINER__SUBSTANCE, newSubstance, newSubstance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.SUBSTANCE_CONTAINER__SUBSTANCE:
                return basicSetSubstance(null, msgs);
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
            case Shr5Package.SUBSTANCE_CONTAINER__SUBSTANCE:
                return getSubstance();
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
            case Shr5Package.SUBSTANCE_CONTAINER__SUBSTANCE:
                setSubstance((Substance)newValue);
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
            case Shr5Package.SUBSTANCE_CONTAINER__SUBSTANCE:
                setSubstance((Substance)null);
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
            case Shr5Package.SUBSTANCE_CONTAINER__SUBSTANCE:
                return substance != null;
        }
        return super.eIsSet(featureID);
    }

} //SubstanceContainerImpl
