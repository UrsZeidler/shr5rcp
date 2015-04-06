/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.RangeTable;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.TrainingRate;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Increase Character Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.IncreaseCharacterPartImpl#getRangeTableEntries <em>Range Table Entries</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.IncreaseCharacterPartImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncreaseCharacterPartImpl extends AdvancementImpl implements IncreaseCharacterPart {
	/**
     * The cached value of the '{@link #getRangeTableEntries() <em>Range Table Entries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRangeTableEntries()
     * @generated
     * @ordered
     */
    protected EList<TrainingRate> rangeTableEntries;
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected EClass type;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected IncreaseCharacterPartImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.INCREASE_CHARACTER_PART;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TrainingRate> getRangeTableEntries() {
        if (rangeTableEntries == null) {
            rangeTableEntries = new EObjectContainmentEList<TrainingRate>(TrainingRate.class, this, Shr5managementPackage.INCREASE_CHARACTER_PART__RANGE_TABLE_ENTRIES);
        }
        return rangeTableEntries;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (EClass)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.INCREASE_CHARACTER_PART__TYPE, oldType, type));
            }
        }
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass basicGetType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(EClass newType) {
        EClass oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.INCREASE_CHARACTER_PART__TYPE, oldType, type));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.INCREASE_CHARACTER_PART__RANGE_TABLE_ENTRIES:
                return ((InternalEList<?>)getRangeTableEntries()).basicRemove(otherEnd, msgs);
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
            case Shr5managementPackage.INCREASE_CHARACTER_PART__RANGE_TABLE_ENTRIES:
                return getRangeTableEntries();
            case Shr5managementPackage.INCREASE_CHARACTER_PART__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case Shr5managementPackage.INCREASE_CHARACTER_PART__RANGE_TABLE_ENTRIES:
                getRangeTableEntries().clear();
                getRangeTableEntries().addAll((Collection<? extends TrainingRate>)newValue);
                return;
            case Shr5managementPackage.INCREASE_CHARACTER_PART__TYPE:
                setType((EClass)newValue);
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
            case Shr5managementPackage.INCREASE_CHARACTER_PART__RANGE_TABLE_ENTRIES:
                getRangeTableEntries().clear();
                return;
            case Shr5managementPackage.INCREASE_CHARACTER_PART__TYPE:
                setType((EClass)null);
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
            case Shr5managementPackage.INCREASE_CHARACTER_PART__RANGE_TABLE_ENTRIES:
                return rangeTableEntries != null && !rangeTableEntries.isEmpty();
            case Shr5managementPackage.INCREASE_CHARACTER_PART__TYPE:
                return type != null;
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
        if (baseClass == RangeTable.class) {
            switch (derivedFeatureID) {
                case Shr5managementPackage.INCREASE_CHARACTER_PART__RANGE_TABLE_ENTRIES: return Shr5managementPackage.RANGE_TABLE__RANGE_TABLE_ENTRIES;
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
        if (baseClass == RangeTable.class) {
            switch (baseFeatureID) {
                case Shr5managementPackage.RANGE_TABLE__RANGE_TABLE_ENTRIES: return Shr5managementPackage.INCREASE_CHARACTER_PART__RANGE_TABLE_ENTRIES;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //IncreaseCharacterPartImpl
