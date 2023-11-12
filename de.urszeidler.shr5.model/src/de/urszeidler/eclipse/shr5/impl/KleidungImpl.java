/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.Capacity;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.KleindungsModifikator;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kleidung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KleidungImpl#getCapacityFeature <em>Capacity Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KleidungImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KleidungImpl#getCapacityRemains <em>Capacity Remains</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KleidungImpl#getRuestung <em>Ruestung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KleidungImpl#getKmods <em>Kmods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KleidungImpl extends AbstraktGegenstandImpl implements Kleidung {
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
     * The default value of the '{@link #getRuestung() <em>Ruestung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRuestung()
     * @generated
     * @ordered
     */
	protected static final int RUESTUNG_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getRuestung() <em>Ruestung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRuestung()
     * @generated
     * @ordered
     */
	protected int ruestung = RUESTUNG_EDEFAULT;

	/**
     * The cached value of the '{@link #getKmods() <em>Kmods</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKmods()
     * @generated
     * @ordered
     */
    protected EList<KleindungsModifikator> kmods;

    private EContentAdapter eContentAdapter;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated not
     */
	protected KleidungImpl() {
        super();
        
        eContentAdapter = new EContentAdapter() {
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                Object feature = notification.getFeature();
                if (Shr5Package.Literals.KLEIDUNG__KMODS.equals(feature) || Shr5Package.Literals.KLEINDUNGS_MODIFIKATOR__RATING.equals(feature)){
                    KleidungImpl.this
                    .eNotify(new ENotificationImpl(KleidungImpl.this, Notification.SET, Shr5Package.Literals.GELD_WERT__WERT, 1, 2));
                    KleidungImpl.this
                    .eNotify(new ENotificationImpl(KleidungImpl.this, Notification.SET, Shr5Package.Literals.CAPACITY__CAPACITY_REMAINS, 1, 2));
                    
                }
                
  
            }

        };
        eContentAdapter.setTarget(this);
        this.eAdapters().add(eContentAdapter);

    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.KLEIDUNG;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
       return Shr5Package.Literals.KLEIDUNG__KMODS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getCapacity() {
        return getRuestung();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getCapacityRemains() {
        EList<KleindungsModifikator> kmods2 = getKmods();
        int sum = 0;
        for (KleindungsModifikator kleindungsModifikator : kmods2) {
            sum += kleindungsModifikator.getCapacity();
        }
        return getCapacity()-sum;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getRuestung() {
        return ruestung;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setRuestung(int newRuestung) {
        int oldRuestung = ruestung;
        ruestung = newRuestung;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KLEIDUNG__RUESTUNG, oldRuestung, ruestung));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<KleindungsModifikator> getKmods() {
        if (kmods == null) {
            kmods = new EObjectContainmentEList<KleindungsModifikator>(KleindungsModifikator.class, this, Shr5Package.KLEIDUNG__KMODS);
        }
        return kmods;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public boolean canAdd(EObject object) {
        if (object instanceof KleindungsModifikator) {
            KleindungsModifikator km = (KleindungsModifikator)object;
            return getCapacityRemains()-km.getRating()>=0;
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.KLEIDUNG__KMODS:
                return ((InternalEList<?>)getKmods()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.KLEIDUNG__CAPACITY_FEATURE:
                if (resolve) return getCapacityFeature();
                return basicGetCapacityFeature();
            case Shr5Package.KLEIDUNG__CAPACITY:
                return getCapacity();
            case Shr5Package.KLEIDUNG__CAPACITY_REMAINS:
                return getCapacityRemains();
            case Shr5Package.KLEIDUNG__RUESTUNG:
                return getRuestung();
            case Shr5Package.KLEIDUNG__KMODS:
                return getKmods();
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
            case Shr5Package.KLEIDUNG__RUESTUNG:
                setRuestung((Integer)newValue);
                return;
            case Shr5Package.KLEIDUNG__KMODS:
                getKmods().clear();
                getKmods().addAll((Collection<? extends KleindungsModifikator>)newValue);
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
            case Shr5Package.KLEIDUNG__RUESTUNG:
                setRuestung(RUESTUNG_EDEFAULT);
                return;
            case Shr5Package.KLEIDUNG__KMODS:
                getKmods().clear();
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
            case Shr5Package.KLEIDUNG__CAPACITY_FEATURE:
                return basicGetCapacityFeature() != null;
            case Shr5Package.KLEIDUNG__CAPACITY:
                return getCapacity() != CAPACITY_EDEFAULT;
            case Shr5Package.KLEIDUNG__CAPACITY_REMAINS:
                return getCapacityRemains() != CAPACITY_REMAINS_EDEFAULT;
            case Shr5Package.KLEIDUNG__RUESTUNG:
                return ruestung != RUESTUNG_EDEFAULT;
            case Shr5Package.KLEIDUNG__KMODS:
                return kmods != null && !kmods.isEmpty();
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
                case Shr5Package.KLEIDUNG__CAPACITY_FEATURE: return Shr5Package.CAPACITY__CAPACITY_FEATURE;
                case Shr5Package.KLEIDUNG__CAPACITY: return Shr5Package.CAPACITY__CAPACITY;
                case Shr5Package.KLEIDUNG__CAPACITY_REMAINS: return Shr5Package.CAPACITY__CAPACITY_REMAINS;
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
                case Shr5Package.CAPACITY__CAPACITY_FEATURE: return Shr5Package.KLEIDUNG__CAPACITY_FEATURE;
                case Shr5Package.CAPACITY__CAPACITY: return Shr5Package.KLEIDUNG__CAPACITY;
                case Shr5Package.CAPACITY__CAPACITY_REMAINS: return Shr5Package.KLEIDUNG__CAPACITY_REMAINS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == Capacity.class) {
            switch (baseOperationID) {
                case Shr5Package.CAPACITY___CAN_ADD__EOBJECT: return Shr5Package.KLEIDUNG___CAN_ADD__EOBJECT;
                default: return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5Package.KLEIDUNG___CAN_ADD__EOBJECT:
                return canAdd((EObject)arguments.get(0));
        }
        return super.eInvoke(operationID, arguments);
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
        result.append(" (ruestung: ");
        result.append(ruestung);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public BigDecimal getWert() {
        if(getWertValue()==null)
            return new BigDecimal(0);
        
        BigDecimal calcListenWert = ShadowrunTools.calcListenWert(getKmods());
        return getWertValue().add(calcListenWert);
    }

} //KleidungImpl
