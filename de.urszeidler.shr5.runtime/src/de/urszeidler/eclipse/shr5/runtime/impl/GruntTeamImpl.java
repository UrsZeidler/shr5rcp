/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import de.urszeidler.eclipse.shr5.runtime.GruntTeam;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;

import de.urszeidler.eclipse.shr5Management.GruntGroup;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grunt Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.GruntTeamImpl#getGruntGroup <em>Grunt Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GruntTeamImpl extends TeamImpl implements GruntTeam {
    /**
     * The cached value of the '{@link #getGruntGroup() <em>Grunt Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGruntGroup()
     * @generated
     * @ordered
     */
    protected GruntGroup gruntGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GruntTeamImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.GRUNT_TEAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntGroup getGruntGroup() {
        if (gruntGroup != null && gruntGroup.eIsProxy()) {
            InternalEObject oldGruntGroup = (InternalEObject)gruntGroup;
            gruntGroup = (GruntGroup)eResolveProxy(oldGruntGroup);
            if (gruntGroup != oldGruntGroup) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.GRUNT_TEAM__GRUNT_GROUP, oldGruntGroup, gruntGroup));
            }
        }
        return gruntGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntGroup basicGetGruntGroup() {
        return gruntGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGruntGroup(GruntGroup newGruntGroup) {
        GruntGroup oldGruntGroup = gruntGroup;
        gruntGroup = newGruntGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.GRUNT_TEAM__GRUNT_GROUP, oldGruntGroup, gruntGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void buildMembers() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RuntimePackage.GRUNT_TEAM__GRUNT_GROUP:
                if (resolve) return getGruntGroup();
                return basicGetGruntGroup();
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
            case RuntimePackage.GRUNT_TEAM__GRUNT_GROUP:
                setGruntGroup((GruntGroup)newValue);
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
            case RuntimePackage.GRUNT_TEAM__GRUNT_GROUP:
                setGruntGroup((GruntGroup)null);
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
            case RuntimePackage.GRUNT_TEAM__GRUNT_GROUP:
                return gruntGroup != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case RuntimePackage.GRUNT_TEAM___BUILD_MEMBERS:
                buildMembers();
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //GruntTeamImpl
