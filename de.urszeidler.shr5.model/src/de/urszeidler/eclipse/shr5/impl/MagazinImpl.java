/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.Capacity;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.Munition;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Magazin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagazinImpl#getCapacityFeature <em>Capacity Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagazinImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagazinImpl#getCapacityRemains <em>Capacity Remains</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagazinImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagazinImpl#getBullets <em>Bullets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MagazinImpl extends AbstraktGegenstandImpl implements Magazin {
    /**
     * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacity()
     * @generated
     * @ordered
     */
    protected static final int CAPACITY_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getCapacityRemains() <em>Capacity Remains</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacityRemains()
     * @generated
     * @ordered
     */
    protected static final int CAPACITY_REMAINS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected Feuerwaffe type;

    /**
     * The cached value of the '{@link #getBullets() <em>Bullets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBullets()
     * @generated
     * @ordered
     */
    protected EList<Munition> bullets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MagazinImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.MAGAZIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCapacityFeature() {
        EReference capacityFeature = basicGetCapacityFeature();
        return capacityFeature != null && capacityFeature.eIsProxy() ? (EReference)eResolveProxy((InternalEObject)capacityFeature) : capacityFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public EReference basicGetCapacityFeature() {
       return Shr5Package.Literals.MAGAZIN__BULLETS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getCapacity() {
        Feuerwaffe type2 = getType();
        if(type2!=null){
            return type2.getKapazitaet();
        }
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getCapacityRemains() {
        return getCapacity()-getBullets().size();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feuerwaffe getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (Feuerwaffe)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.MAGAZIN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feuerwaffe basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(Feuerwaffe newType) {
        Feuerwaffe oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MAGAZIN__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * workaround for Bug 89325
     * @generated not
     */
    public EList<Munition> getBullets() {
        if (bullets == null) {
            bullets = new EObjectResolvingEList<Munition>(Munition.class, this, Shr5Package.MAGAZIN__BULLETS){
                @Override
                protected boolean isUnique() {
                    return false;
                }
            };
        }
        return bullets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.MAGAZIN__CAPACITY_FEATURE:
                if (resolve) return getCapacityFeature();
                return basicGetCapacityFeature();
            case Shr5Package.MAGAZIN__CAPACITY:
                return getCapacity();
            case Shr5Package.MAGAZIN__CAPACITY_REMAINS:
                return getCapacityRemains();
            case Shr5Package.MAGAZIN__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case Shr5Package.MAGAZIN__BULLETS:
                return getBullets();
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
            case Shr5Package.MAGAZIN__TYPE:
                setType((Feuerwaffe)newValue);
                return;
            case Shr5Package.MAGAZIN__BULLETS:
                getBullets().clear();
                getBullets().addAll((Collection<? extends Munition>)newValue);
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
            case Shr5Package.MAGAZIN__TYPE:
                setType((Feuerwaffe)null);
                return;
            case Shr5Package.MAGAZIN__BULLETS:
                getBullets().clear();
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
            case Shr5Package.MAGAZIN__CAPACITY_FEATURE:
                return basicGetCapacityFeature() != null;
            case Shr5Package.MAGAZIN__CAPACITY:
                return getCapacity() != CAPACITY_EDEFAULT;
            case Shr5Package.MAGAZIN__CAPACITY_REMAINS:
                return getCapacityRemains() != CAPACITY_REMAINS_EDEFAULT;
            case Shr5Package.MAGAZIN__TYPE:
                return type != null;
            case Shr5Package.MAGAZIN__BULLETS:
                return bullets != null && !bullets.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Capacity.class) {
            switch (derivedFeatureID) {
                case Shr5Package.MAGAZIN__CAPACITY_FEATURE: return Shr5Package.CAPACITY__CAPACITY_FEATURE;
                case Shr5Package.MAGAZIN__CAPACITY: return Shr5Package.CAPACITY__CAPACITY;
                case Shr5Package.MAGAZIN__CAPACITY_REMAINS: return Shr5Package.CAPACITY__CAPACITY_REMAINS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Capacity.class) {
            switch (baseFeatureID) {
                case Shr5Package.CAPACITY__CAPACITY_FEATURE: return Shr5Package.MAGAZIN__CAPACITY_FEATURE;
                case Shr5Package.CAPACITY__CAPACITY: return Shr5Package.MAGAZIN__CAPACITY;
                case Shr5Package.CAPACITY__CAPACITY_REMAINS: return Shr5Package.MAGAZIN__CAPACITY_REMAINS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //MagazinImpl
