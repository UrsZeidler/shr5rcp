/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
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
 * An implementation of the model object '<em><b>Module Skill Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillChangeImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillChangeImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillChangeImpl#getSelectOne <em>Select One</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleSkillChangeImpl extends ModuleChangeImpl implements ModuleSkillChange {
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
     * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkill()
     * @generated
     * @ordered
     */
    protected Fertigkeit skill;

    /**
     * The cached value of the '{@link #getSelectOne() <em>Select One</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectOne()
     * @generated
     * @ordered
     */
    protected EList<Fertigkeit> selectOne;

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
     * @generated
     */
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_CHANGE__GRADE, oldGrade, grade));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.MODULE_SKILL_CHANGE__GRADE:
                return getGrade();
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                if (resolve) return getSkill();
                return basicGetSkill();
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SELECT_ONE:
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__GRADE:
                setGrade((Integer)newValue);
                return;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                setSkill((Fertigkeit)newValue);
                return;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SELECT_ONE:
                getSelectOne().clear();
                getSelectOne().addAll((Collection<? extends Fertigkeit>)newValue);
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__GRADE:
                setGrade(GRADE_EDEFAULT);
                return;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                setSkill((Fertigkeit)null);
                return;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SELECT_ONE:
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__GRADE:
                return grade != GRADE_EDEFAULT;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                return skill != null;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SELECT_ONE:
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

} //ModuleSkillChangeImpl
