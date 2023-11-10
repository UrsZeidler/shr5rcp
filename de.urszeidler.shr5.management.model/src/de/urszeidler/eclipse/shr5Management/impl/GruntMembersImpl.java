/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5Management.GruntMembers;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grunt Members</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.GruntMembersImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.GruntMembersImpl#getNsc <em>Nsc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GruntMembersImpl extends MinimalEObjectImpl.Container implements GruntMembers {
    /**
     * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected static final int COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected int count = COUNT_EDEFAULT;

    /**
     * The cached value of the '{@link #getNsc() <em>Nsc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNsc()
     * @generated
     * @ordered
     */
    protected NonPlayerCharacter nsc;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GruntMembersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.GRUNT_MEMBERS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getCount() {
        return count;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCount(int newCount) {
        int oldCount = count;
        count = newCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.GRUNT_MEMBERS__COUNT, oldCount, count));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonPlayerCharacter getNsc() {
        if (nsc != null && nsc.eIsProxy()) {
            InternalEObject oldNsc = (InternalEObject)nsc;
            nsc = (NonPlayerCharacter)eResolveProxy(oldNsc);
            if (nsc != oldNsc) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.GRUNT_MEMBERS__NSC, oldNsc, nsc));
            }
        }
        return nsc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonPlayerCharacter basicGetNsc() {
        return nsc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNsc(NonPlayerCharacter newNsc) {
        NonPlayerCharacter oldNsc = nsc;
        nsc = newNsc;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.GRUNT_MEMBERS__NSC, oldNsc, nsc));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.GRUNT_MEMBERS__COUNT:
                return getCount();
            case Shr5managementPackage.GRUNT_MEMBERS__NSC:
                if (resolve) return getNsc();
                return basicGetNsc();
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
            case Shr5managementPackage.GRUNT_MEMBERS__COUNT:
                setCount((Integer)newValue);
                return;
            case Shr5managementPackage.GRUNT_MEMBERS__NSC:
                setNsc((NonPlayerCharacter)newValue);
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
            case Shr5managementPackage.GRUNT_MEMBERS__COUNT:
                setCount(COUNT_EDEFAULT);
                return;
            case Shr5managementPackage.GRUNT_MEMBERS__NSC:
                setNsc((NonPlayerCharacter)null);
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
            case Shr5managementPackage.GRUNT_MEMBERS__COUNT:
                return count != COUNT_EDEFAULT;
            case Shr5managementPackage.GRUNT_MEMBERS__NSC:
                return nsc != null;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (count: ");
        result.append(count);
        result.append(')');
        return result.toString();
    }

} //GruntMembersImpl
