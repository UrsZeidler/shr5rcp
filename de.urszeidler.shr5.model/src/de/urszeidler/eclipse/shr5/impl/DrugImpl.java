/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.AddictionType;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Drug;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Shr5Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drug</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.DrugImpl#getMods <em>Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.DrugImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.DrugImpl#getAddictionType <em>Addiction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrugImpl extends SubstanceImpl implements Drug {
    /**
     * The cached value of the '{@link #getMods() <em>Mods</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMods()
     * @generated
     * @ordered
     */
    protected EList<AttributModifikatorWert> mods;

    /**
     * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected static final String DURATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected String duration = DURATION_EDEFAULT;

    /**
     * The default value of the '{@link #getAddictionType() <em>Addiction Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddictionType()
     * @generated
     * @ordered
     */
    protected static final AddictionType ADDICTION_TYPE_EDEFAULT = AddictionType.PSYCHOLOGICAL;

    /**
     * The cached value of the '{@link #getAddictionType() <em>Addiction Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddictionType()
     * @generated
     * @ordered
     */
    protected AddictionType addictionType = ADDICTION_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DrugImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.DRUG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributModifikatorWert> getMods() {
        if (mods == null) {
            mods = new EObjectContainmentWithInverseEList<AttributModifikatorWert>(AttributModifikatorWert.class, this, Shr5Package.DRUG__MODS, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES);
        }
        return mods;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDuration() {
        return duration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDuration(String newDuration) {
        String oldDuration = duration;
        duration = newDuration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.DRUG__DURATION, oldDuration, duration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddictionType getAddictionType() {
        return addictionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddictionType(AddictionType newAddictionType) {
        AddictionType oldAddictionType = addictionType;
        addictionType = newAddictionType == null ? ADDICTION_TYPE_EDEFAULT : newAddictionType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.DRUG__ADDICTION_TYPE, oldAddictionType, addictionType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.DRUG__MODS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMods()).basicAdd(otherEnd, msgs);
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
            case Shr5Package.DRUG__MODS:
                return ((InternalEList<?>)getMods()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.DRUG__MODS:
                return getMods();
            case Shr5Package.DRUG__DURATION:
                return getDuration();
            case Shr5Package.DRUG__ADDICTION_TYPE:
                return getAddictionType();
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
            case Shr5Package.DRUG__MODS:
                getMods().clear();
                getMods().addAll((Collection<? extends AttributModifikatorWert>)newValue);
                return;
            case Shr5Package.DRUG__DURATION:
                setDuration((String)newValue);
                return;
            case Shr5Package.DRUG__ADDICTION_TYPE:
                setAddictionType((AddictionType)newValue);
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
            case Shr5Package.DRUG__MODS:
                getMods().clear();
                return;
            case Shr5Package.DRUG__DURATION:
                setDuration(DURATION_EDEFAULT);
                return;
            case Shr5Package.DRUG__ADDICTION_TYPE:
                setAddictionType(ADDICTION_TYPE_EDEFAULT);
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
            case Shr5Package.DRUG__MODS:
                return mods != null && !mods.isEmpty();
            case Shr5Package.DRUG__DURATION:
                return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
            case Shr5Package.DRUG__ADDICTION_TYPE:
                return addictionType != ADDICTION_TYPE_EDEFAULT;
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
        if (baseClass == Modifizierbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.DRUG__MODS: return Shr5Package.MODIFIZIERBAR__MODS;
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
        if (baseClass == Modifizierbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.MODIFIZIERBAR__MODS: return Shr5Package.DRUG__MODS;
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
        result.append(" (duration: ");
        result.append(duration);
        result.append(", addictionType: ");
        result.append(addictionType);
        result.append(')');
        return result.toString();
    }

} //DrugImpl
