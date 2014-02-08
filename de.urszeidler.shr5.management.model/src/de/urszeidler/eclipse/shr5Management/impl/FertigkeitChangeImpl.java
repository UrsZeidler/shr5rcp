/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.FertigkeitChange;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fertigkeit Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.FertigkeitChangeImpl#getSkill <em>Skill</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.FertigkeitChangeImpl#getSkillGroup <em>Skill Group</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class FertigkeitChangeImpl extends PersonaValueChangeImpl implements FertigkeitChange {
    /**
     * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSkill()
     * @generated
     * @ordered
     */
    protected PersonaFertigkeit skill;
    /**
     * The cached value of the '{@link #getSkillGroup() <em>Skill Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSkillGroup()
     * @generated
     * @ordered
     */
    protected PersonaFertigkeitsGruppe skillGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected FertigkeitChangeImpl() {
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
        return Shr5managementPackage.Literals.FERTIGKEIT_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersonaFertigkeit getSkill() {
        if (skill != null && skill.eIsProxy()) {
            InternalEObject oldSkill = (InternalEObject)skill;
            skill = (PersonaFertigkeit)eResolveProxy(oldSkill);
            if (skill != oldSkill) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL, oldSkill, skill));
            }
        }
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersonaFertigkeit basicGetSkill() {
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSkill(PersonaFertigkeit newSkill) {
        PersonaFertigkeit oldSkill = skill;
        skill = newSkill;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL, oldSkill, skill));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersonaFertigkeitsGruppe getSkillGroup() {
        if (skillGroup != null && skillGroup.eIsProxy()) {
            InternalEObject oldSkillGroup = (InternalEObject)skillGroup;
            skillGroup = (PersonaFertigkeitsGruppe)eResolveProxy(oldSkillGroup);
            if (skillGroup != oldSkillGroup) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL_GROUP, oldSkillGroup,
                            skillGroup));
            }
        }
        return skillGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersonaFertigkeitsGruppe basicGetSkillGroup() {
        return skillGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSkillGroup(PersonaFertigkeitsGruppe newSkillGroup) {
        PersonaFertigkeitsGruppe oldSkillGroup = skillGroup;
        skillGroup = newSkillGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL_GROUP, oldSkillGroup, skillGroup));
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
            case Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL:
                if (resolve)
                    return getSkill();
                return basicGetSkill();
            case Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL_GROUP:
                if (resolve)
                    return getSkillGroup();
                return basicGetSkillGroup();
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
            case Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL:
                setSkill((PersonaFertigkeit)newValue);
                return;
            case Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL_GROUP:
                setSkillGroup((PersonaFertigkeitsGruppe)newValue);
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
            case Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL:
                setSkill((PersonaFertigkeit)null);
                return;
            case Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL_GROUP:
                setSkillGroup((PersonaFertigkeitsGruppe)null);
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
            case Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL:
                return skill != null;
            case Shr5managementPackage.FERTIGKEIT_CHANGE__SKILL_GROUP:
                return skillGroup != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * @generated not
     */
    public int getKarmaCost() {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        PersonaFertigkeit skill2 = getSkill();
        if (skill2 != null) {
            Fertigkeit fertigkeit = skill2.getFertigkeit();
            EClass eClass = fertigkeit.eClass();

            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(), eClass);
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * karmaFactor * (getTo());
            }
        } else if (getSkillGroup() != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(),
                    getSkillGroup().getGruppe().eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * karmaFactor * (getTo());
            }
        }
        return 0;
    }

} // FertigkeitChangeImpl
