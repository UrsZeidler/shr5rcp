/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.PrioritySystem;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Priority System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PrioritySystemImpl#getPriorities <em>Priorities</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PrioritySystemImpl#getKarmaPoints <em>Karma Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PrioritySystemImpl extends CharacterGeneratorSystemImpl implements PrioritySystem {
	/**
     * The cached value of the '{@link #getPriorities() <em>Priorities</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPriorities()
     * @generated
     * @ordered
     */
	protected EList<PriorityCategorie> priorities;

	/**
     * The default value of the '{@link #getKarmaPoints() <em>Karma Points</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKarmaPoints()
     * @generated
     * @ordered
     */
	protected static final int KARMA_POINTS_EDEFAULT = 0;
	/**
     * The cached value of the '{@link #getKarmaPoints() <em>Karma Points</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKarmaPoints()
     * @generated
     * @ordered
     */
	protected int karmaPoints = KARMA_POINTS_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PrioritySystemImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.PRIORITY_SYSTEM;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PriorityCategorie> getPriorities() {
        if (priorities == null) {
            priorities = new EObjectContainmentEList<PriorityCategorie>(PriorityCategorie.class, this, Shr5managementPackage.PRIORITY_SYSTEM__PRIORITIES);
        }
        return priorities;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getKarmaPoints() {
        return karmaPoints;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKarmaPoints(int newKarmaPoints) {
        int oldKarmaPoints = karmaPoints;
        karmaPoints = newKarmaPoints;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PRIORITY_SYSTEM__KARMA_POINTS, oldKarmaPoints, karmaPoints));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.PRIORITY_SYSTEM__PRIORITIES:
                return ((InternalEList<?>)getPriorities()).basicRemove(otherEnd, msgs);
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
            case Shr5managementPackage.PRIORITY_SYSTEM__PRIORITIES:
                return getPriorities();
            case Shr5managementPackage.PRIORITY_SYSTEM__KARMA_POINTS:
                return getKarmaPoints();
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
            case Shr5managementPackage.PRIORITY_SYSTEM__PRIORITIES:
                getPriorities().clear();
                getPriorities().addAll((Collection<? extends PriorityCategorie>)newValue);
                return;
            case Shr5managementPackage.PRIORITY_SYSTEM__KARMA_POINTS:
                setKarmaPoints((Integer)newValue);
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
            case Shr5managementPackage.PRIORITY_SYSTEM__PRIORITIES:
                getPriorities().clear();
                return;
            case Shr5managementPackage.PRIORITY_SYSTEM__KARMA_POINTS:
                setKarmaPoints(KARMA_POINTS_EDEFAULT);
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
            case Shr5managementPackage.PRIORITY_SYSTEM__PRIORITIES:
                return priorities != null && !priorities.isEmpty();
            case Shr5managementPackage.PRIORITY_SYSTEM__KARMA_POINTS:
                return karmaPoints != KARMA_POINTS_EDEFAULT;
        }
        return super.eIsSet(featureID);
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
        result.append(" (karmaPoints: ");
        result.append(karmaPoints);
        result.append(')');
        return result.toString();
    }

} //PrioritySystemImpl
