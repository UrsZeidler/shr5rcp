/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;

import de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Skill Group Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillGroupChangeImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillGroupChangeImpl#getSkillGroup <em>Skill Group</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillGroupChangeImpl#getSelectOne <em>Select One</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleSkillGroupChangeImpl extends ModuleChangeImpl implements ModuleSkillGroupChange {
    /**
     * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrade()
     * @generated
     * @ordered
     */
    protected static final int GRADE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrade()
     * @generated
     * @ordered
     */
    protected int grade = GRADE_EDEFAULT;

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
     * The cached value of the '{@link #getSelectOne() <em>Select One</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectOne()
     * @generated
     * @ordered
     */
    protected EList<FertigkeitsGruppe> selectOne;

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
     * @generated
     */
    public int getGrade() {
        return grade;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGrade(int newGrade) {
        int oldGrade = grade;
        grade = newGrade;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__GRADE, oldGrade, grade));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__GRADE:
                return getGrade();
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP:
                if (resolve) return getSkillGroup();
                return basicGetSkillGroup();
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SELECT_ONE:
                return getSelectOne();
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
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__GRADE:
                setGrade((Integer)newValue);
                return;
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP:
                setSkillGroup((FertigkeitsGruppe)newValue);
                return;
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SELECT_ONE:
                getSelectOne().clear();
                getSelectOne().addAll((Collection<? extends FertigkeitsGruppe>)newValue);
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
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__GRADE:
                setGrade(GRADE_EDEFAULT);
                return;
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP:
                setSkillGroup((FertigkeitsGruppe)null);
                return;
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SELECT_ONE:
                getSelectOne().clear();
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
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__GRADE:
                return grade != GRADE_EDEFAULT;
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP:
                return skillGroup != null;
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE__SELECT_ONE:
                return selectOne != null && !selectOne.isEmpty();
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
        result.append(" (grade: ");
        result.append(grade);
        result.append(')');
        return result.toString();
    }

} //ModuleSkillGroupChangeImpl
