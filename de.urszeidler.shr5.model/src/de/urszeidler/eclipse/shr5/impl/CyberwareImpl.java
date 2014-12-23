/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Capacity;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.CyberwareType;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyberware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getWertValue <em>Wert Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getCapacityFeature <em>Capacity Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getEinbau <em>Einbau</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getCyberwareCapacity <em>Cyberware Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CyberwareImpl extends KoerpermodsImpl implements Cyberware {
    /**
     * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWert()
     * @generated
     * @ordered
     */
    protected static final BigDecimal WERT_EDEFAULT = null;

    /**
     * The default value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerfuegbarkeit()
     * @generated
     * @ordered
     */
    protected static final String VERFUEGBARKEIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerfuegbarkeit()
     * @generated
     * @ordered
     */
    protected String verfuegbarkeit = VERFUEGBARKEIT_EDEFAULT;

    /**
     * The default value of the '{@link #getWertValue() <em>Wert Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWertValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal WERT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWertValue() <em>Wert Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWertValue()
     * @generated
     * @ordered
     */
    protected BigDecimal wertValue = WERT_VALUE_EDEFAULT;

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
     * The cached value of the '{@link #getPersona() <em>Persona</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersona()
     * @generated
     * @ordered
     */
    protected AbstraktPersona persona;

    /**
     * The cached value of the '{@link #getEinbau() <em>Einbau</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEinbau()
     * @generated
     * @ordered
     */
    protected EList<AbstraktGegenstand> einbau;

    /**
     * The default value of the '{@link #getCyberwareCapacity() <em>Cyberware Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCyberwareCapacity()
     * @generated
     * @ordered
     */
    protected static final int CYBERWARE_CAPACITY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCyberwareCapacity() <em>Cyberware Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCyberwareCapacity()
     * @generated
     * @ordered
     */
    protected int cyberwareCapacity = CYBERWARE_CAPACITY_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final CyberwareType TYPE_EDEFAULT = CyberwareType.HEADWARE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected CyberwareType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CyberwareImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.CYBERWARE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public BigDecimal getWert() {
        if (getWertValue() == null)
            return null;

        BigDecimal listenWert = ShadowrunTools.calcListenWert(getEinbau());
        return getWertValue().add(listenWert);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVerfuegbarkeit(String newVerfuegbarkeit) {
        String oldVerfuegbarkeit = verfuegbarkeit;
        verfuegbarkeit = newVerfuegbarkeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERWARE__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getWertValue() {
        return wertValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setWertValue(BigDecimal newWertValue) {
        BigDecimal oldWertValue = wertValue;
        wertValue = newWertValue;
        if (eNotificationRequired()){
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERWARE__WERT_VALUE, oldWertValue, wertValue));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERWARE__WERT, oldWertValue, wertValue));
        }}

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
        return Shr5Package.Literals.CYBERWARE__EINBAU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getCapacity() {
        return getCyberwareCapacity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstraktPersona getPersona() {
        if (persona != null && persona.eIsProxy()) {
            InternalEObject oldPersona = (InternalEObject)persona;
            persona = (AbstraktPersona)eResolveProxy(oldPersona);
            if (persona != oldPersona) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.CYBERWARE__PERSONA, oldPersona, persona));
            }
        }
        return persona;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstraktPersona basicGetPersona() {
        return persona;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPersona(AbstraktPersona newPersona) {
        AbstraktPersona oldPersona = persona;
        persona = newPersona;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERWARE__PERSONA, oldPersona, persona));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstraktGegenstand> getEinbau() {
        if (einbau == null) {
            einbau = new EObjectContainmentEList<AbstraktGegenstand>(AbstraktGegenstand.class, this, Shr5Package.CYBERWARE__EINBAU);
        }
        return einbau;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCyberwareCapacity() {
        return cyberwareCapacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCyberwareCapacity(int newCyberwareCapacity) {
        int oldCyberwareCapacity = cyberwareCapacity;
        cyberwareCapacity = newCyberwareCapacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERWARE__CYBERWARE_CAPACITY, oldCyberwareCapacity, cyberwareCapacity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CyberwareType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(CyberwareType newType) {
        CyberwareType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERWARE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.CYBERWARE__EINBAU:
                return ((InternalEList<?>)getEinbau()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.CYBERWARE__WERT:
                return getWert();
            case Shr5Package.CYBERWARE__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5Package.CYBERWARE__WERT_VALUE:
                return getWertValue();
            case Shr5Package.CYBERWARE__CAPACITY_FEATURE:
                if (resolve) return getCapacityFeature();
                return basicGetCapacityFeature();
            case Shr5Package.CYBERWARE__CAPACITY:
                return getCapacity();
            case Shr5Package.CYBERWARE__PERSONA:
                if (resolve) return getPersona();
                return basicGetPersona();
            case Shr5Package.CYBERWARE__EINBAU:
                return getEinbau();
            case Shr5Package.CYBERWARE__CYBERWARE_CAPACITY:
                return getCyberwareCapacity();
            case Shr5Package.CYBERWARE__TYPE:
                return getType();
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
            case Shr5Package.CYBERWARE__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5Package.CYBERWARE__WERT_VALUE:
                setWertValue((BigDecimal)newValue);
                return;
            case Shr5Package.CYBERWARE__PERSONA:
                setPersona((AbstraktPersona)newValue);
                return;
            case Shr5Package.CYBERWARE__EINBAU:
                getEinbau().clear();
                getEinbau().addAll((Collection<? extends AbstraktGegenstand>)newValue);
                return;
            case Shr5Package.CYBERWARE__CYBERWARE_CAPACITY:
                setCyberwareCapacity((Integer)newValue);
                return;
            case Shr5Package.CYBERWARE__TYPE:
                setType((CyberwareType)newValue);
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
            case Shr5Package.CYBERWARE__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5Package.CYBERWARE__WERT_VALUE:
                setWertValue(WERT_VALUE_EDEFAULT);
                return;
            case Shr5Package.CYBERWARE__PERSONA:
                setPersona((AbstraktPersona)null);
                return;
            case Shr5Package.CYBERWARE__EINBAU:
                getEinbau().clear();
                return;
            case Shr5Package.CYBERWARE__CYBERWARE_CAPACITY:
                setCyberwareCapacity(CYBERWARE_CAPACITY_EDEFAULT);
                return;
            case Shr5Package.CYBERWARE__TYPE:
                setType(TYPE_EDEFAULT);
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
            case Shr5Package.CYBERWARE__WERT:
                return WERT_EDEFAULT == null ? getWert() != null : !WERT_EDEFAULT.equals(getWert());
            case Shr5Package.CYBERWARE__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5Package.CYBERWARE__WERT_VALUE:
                return WERT_VALUE_EDEFAULT == null ? wertValue != null : !WERT_VALUE_EDEFAULT.equals(wertValue);
            case Shr5Package.CYBERWARE__CAPACITY_FEATURE:
                return basicGetCapacityFeature() != null;
            case Shr5Package.CYBERWARE__CAPACITY:
                return getCapacity() != CAPACITY_EDEFAULT;
            case Shr5Package.CYBERWARE__PERSONA:
                return persona != null;
            case Shr5Package.CYBERWARE__EINBAU:
                return einbau != null && !einbau.isEmpty();
            case Shr5Package.CYBERWARE__CYBERWARE_CAPACITY:
                return cyberwareCapacity != CYBERWARE_CAPACITY_EDEFAULT;
            case Shr5Package.CYBERWARE__TYPE:
                return type != TYPE_EDEFAULT;
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
        if (baseClass == GeldWert.class) {
            switch (derivedFeatureID) {
                case Shr5Package.CYBERWARE__WERT: return Shr5Package.GELD_WERT__WERT;
                case Shr5Package.CYBERWARE__VERFUEGBARKEIT: return Shr5Package.GELD_WERT__VERFUEGBARKEIT;
                case Shr5Package.CYBERWARE__WERT_VALUE: return Shr5Package.GELD_WERT__WERT_VALUE;
                default: return -1;
            }
        }
        if (baseClass == Capacity.class) {
            switch (derivedFeatureID) {
                case Shr5Package.CYBERWARE__CAPACITY_FEATURE: return Shr5Package.CAPACITY__CAPACITY_FEATURE;
                case Shr5Package.CYBERWARE__CAPACITY: return Shr5Package.CAPACITY__CAPACITY;
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
        if (baseClass == GeldWert.class) {
            switch (baseFeatureID) {
                case Shr5Package.GELD_WERT__WERT: return Shr5Package.CYBERWARE__WERT;
                case Shr5Package.GELD_WERT__VERFUEGBARKEIT: return Shr5Package.CYBERWARE__VERFUEGBARKEIT;
                case Shr5Package.GELD_WERT__WERT_VALUE: return Shr5Package.CYBERWARE__WERT_VALUE;
                default: return -1;
            }
        }
        if (baseClass == Capacity.class) {
            switch (baseFeatureID) {
                case Shr5Package.CAPACITY__CAPACITY_FEATURE: return Shr5Package.CYBERWARE__CAPACITY_FEATURE;
                case Shr5Package.CAPACITY__CAPACITY: return Shr5Package.CYBERWARE__CAPACITY;
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
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (verfuegbarkeit: ");
        result.append(verfuegbarkeit);
        result.append(", wertValue: ");
        result.append(wertValue);
        result.append(", cyberwareCapacity: ");
        result.append(cyberwareCapacity);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} // CyberwareImpl
