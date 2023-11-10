/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Skill Group Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillGroupChangeImpl#getSkillGroup <em>Skill Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleSkillGroupChangeImpl extends ModuleTypeChangeImpl<FertigkeitsGruppe> implements ModuleSkillGroupChange {
    /**
     * The cached value of the '{@link #getSkillGroup() <em>Skill Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkillGroup()
     * @generated
     * @ordered
     */
    protected FertigkeitsGruppe skillGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleSkillGroupChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.MODULE_SKILL_GROUP_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setSelected(FertigkeitsGruppe newSelected) {
        super.setSelected(newSelected);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific element type known in this context.
     * @generated
     */
    @Override
    public EList<FertigkeitsGruppe> getSelectOne() {
        if (selectOne == null) {
            selectOne = new EObjectResolvingEList<FertigkeitsGruppe>(FertigkeitsGruppe.class, this, Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SELECT_ONE);
        }
        return selectOne;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FertigkeitsGruppe getSkillGroup() {
        if (skillGroup != null && skillGroup.eIsProxy()) {
            InternalEObject oldSkillGroup = (InternalEObject)skillGroup;
            skillGroup = (FertigkeitsGruppe)eResolveProxy(oldSkillGroup);
            if (skillGroup != oldSkillGroup) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP, oldSkillGroup, skillGroup));
            }
        }
        return skillGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FertigkeitsGruppe basicGetSkillGroup() {
        return skillGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSkillGroup(FertigkeitsGruppe newSkillGroup) {
        FertigkeitsGruppe oldSkillGroup = skillGroup;
        skillGroup = newSkillGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP, oldSkillGroup, skillGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP:
                if (resolve) return getSkillGroup();
                return basicGetSkillGroup();
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
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP:
                setSkillGroup((FertigkeitsGruppe)newValue);
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
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP:
                setSkillGroup((FertigkeitsGruppe)null);
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
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP:
                return skillGroup != null;
        }
        return super.eIsSet(featureID);
    }

} //ModuleSkillGroupChangeImpl
