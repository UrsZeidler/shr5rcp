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

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Skill Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillChangeImpl#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleSkillChangeImpl extends ModuleTypeChangeImpl<Fertigkeit> implements ModuleSkillChange {
    /**
     * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkill()
     * @generated
     * @ordered
     */
    protected Fertigkeit skill;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleSkillChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.MODULE_SKILL_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setSelected(Fertigkeit newSelected) {
        super.setSelected(newSelected);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific element type known in this context.
     * @generated
     */
    @Override
    public EList<Fertigkeit> getSelectOne() {
        if (selectOne == null) {
            selectOne = new EObjectResolvingEList<Fertigkeit>(Fertigkeit.class, this, Shr5managementPackage.MODULE_SKILL_CHANGE__SELECT_ONE);
        }
        return selectOne;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Fertigkeit getSkill() {
        if (skill != null && skill.eIsProxy()) {
            InternalEObject oldSkill = (InternalEObject)skill;
            skill = (Fertigkeit)eResolveProxy(oldSkill);
            if (skill != oldSkill) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL, oldSkill, skill));
            }
        }
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fertigkeit basicGetSkill() {
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSkill(Fertigkeit newSkill) {
        Fertigkeit oldSkill = skill;
        skill = newSkill;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL, oldSkill, skill));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                if (resolve) return getSkill();
                return basicGetSkill();
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                setSkill((Fertigkeit)newValue);
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                setSkill((Fertigkeit)null);
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                return skill != null;
        }
        return super.eIsSet(featureID);
    }

} //ModuleSkillChangeImpl
