/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.PersonalAreaNetwork;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Area Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonalAreaNetworkImpl#getSlaves <em>Slaves</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonalAreaNetworkImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonalAreaNetworkImpl#getSlaveMax <em>Slave Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonalAreaNetworkImpl extends MinimalEObjectImpl.Container implements PersonalAreaNetwork {
    /**
     * The cached value of the '{@link #getSlaves() <em>Slaves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlaves()
     * @generated
     * @ordered
     */
    protected EList<MatrixDevice> slaves;

    /**
     * The default value of the '{@link #getSlaveMax() <em>Slave Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlaveMax()
     * @generated
     * @ordered
     */
    protected static final int SLAVE_MAX_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonalAreaNetworkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.PERSONAL_AREA_NETWORK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<MatrixDevice> getSlaves() {
        if (slaves == null) {
            slaves = new EObjectResolvingEList<MatrixDevice>(MatrixDevice.class, this, Shr5Package.PERSONAL_AREA_NETWORK__SLAVES);
        }
        return slaves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MatrixDevice getMaster() {
        if (eContainerFeatureID() != Shr5Package.PERSONAL_AREA_NETWORK__MASTER) return null;
        return (MatrixDevice)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMaster(MatrixDevice newMaster, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newMaster, Shr5Package.PERSONAL_AREA_NETWORK__MASTER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaster(MatrixDevice newMaster) {
        if (newMaster != eInternalContainer() || (eContainerFeatureID() != Shr5Package.PERSONAL_AREA_NETWORK__MASTER && newMaster != null)) {
            if (EcoreUtil.isAncestor(this, newMaster))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newMaster != null)
                msgs = ((InternalEObject)newMaster).eInverseAdd(this, Shr5Package.MATRIX_DEVICE__PAN, MatrixDevice.class, msgs);
            msgs = basicSetMaster(newMaster, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONAL_AREA_NETWORK__MASTER, newMaster, newMaster));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getSlaveMax() {
        if(getMaster()==null)
            return 0;
        
        if(getMaster().getGeraetestufe()<1)
            return 0;
        
        return getMaster().getGeraetestufe() * 3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.PERSONAL_AREA_NETWORK__MASTER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetMaster((MatrixDevice)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.PERSONAL_AREA_NETWORK__MASTER:
                return basicSetMaster(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case Shr5Package.PERSONAL_AREA_NETWORK__MASTER:
                return eInternalContainer().eInverseRemove(this, Shr5Package.MATRIX_DEVICE__PAN, MatrixDevice.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.PERSONAL_AREA_NETWORK__SLAVES:
                return getSlaves();
            case Shr5Package.PERSONAL_AREA_NETWORK__MASTER:
                return getMaster();
            case Shr5Package.PERSONAL_AREA_NETWORK__SLAVE_MAX:
                return getSlaveMax();
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
            case Shr5Package.PERSONAL_AREA_NETWORK__SLAVES:
                getSlaves().clear();
                getSlaves().addAll((Collection<? extends MatrixDevice>)newValue);
                return;
            case Shr5Package.PERSONAL_AREA_NETWORK__MASTER:
                setMaster((MatrixDevice)newValue);
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
            case Shr5Package.PERSONAL_AREA_NETWORK__SLAVES:
                getSlaves().clear();
                return;
            case Shr5Package.PERSONAL_AREA_NETWORK__MASTER:
                setMaster((MatrixDevice)null);
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
            case Shr5Package.PERSONAL_AREA_NETWORK__SLAVES:
                return slaves != null && !slaves.isEmpty();
            case Shr5Package.PERSONAL_AREA_NETWORK__MASTER:
                return getMaster() != null;
            case Shr5Package.PERSONAL_AREA_NETWORK__SLAVE_MAX:
                return getSlaveMax() != SLAVE_MAX_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //PersonalAreaNetworkImpl
