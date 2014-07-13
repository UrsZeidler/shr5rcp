/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.GruntTeam;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.GruntMembers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

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
 * <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.GruntTeamImpl#getGruntGroup <em>Grunt Group</em>}</li>
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
     * 
     * @see #getGruntGroup()
     * @generated
     * @ordered
     */
    protected GruntGroup gruntGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected GruntTeamImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.GRUNT_TEAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
     * 
     * @generated
     */
    public GruntGroup basicGetGruntGroup() {
        return gruntGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setGruntGroup(GruntGroup newGruntGroup) {
        GruntGroup oldGruntGroup = gruntGroup;
        gruntGroup = newGruntGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.GRUNT_TEAM__GRUNT_GROUP, oldGruntGroup, gruntGroup));
        
        buildMembers();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void buildMembers() {
        if (getGruntGroup() == null)
            return;
        getMembers().clear();
        
        GruntMembers leader = getGruntGroup().getLeader();
        ArrayList<GruntMembers> list = new ArrayList<GruntMembers>(getGruntGroup().getMembers().size() + 1);
        if (leader != null)
            list.add(leader);

        list.addAll(getGruntGroup().getMembers());
        for (GruntMembers gruntMembers : list) {
            createRuntimeCharacters(gruntMembers);
        }
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.ADD_MANY, RuntimePackage.TEAM__MEMBERS, 1, 2));

    }

    /**
     * Creates all gruntRuntime Characters for the {@link GruntMembers} object.
     * @param gruntMembers
     */
    private void createRuntimeCharacters(GruntMembers gruntMembers) {
        int count = gruntMembers.getCount();
        for (int i = 1; i <= count; i++) {
            GruntRuntimeCharacter gruntRuntimeCharacter = RuntimeFactory.eINSTANCE.createGruntRuntimeCharacter();
            gruntRuntimeCharacter.setCharacter(gruntMembers.getNsc());
            getMembers().add(gruntRuntimeCharacter);
        }
        
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RuntimePackage.GRUNT_TEAM__GRUNT_GROUP:
                if (resolve)
                    return getGruntGroup();
                return basicGetGruntGroup();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
     * 
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
     * 
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
     * 
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

} // GruntTeamImpl
