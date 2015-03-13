/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;

import de.urszeidler.eclipse.shr5.Spezialisierung;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Skill Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillChangeImpl#getSkillgroup <em>Skillgroup</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillChangeImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleSkillChangeImpl#getSpecalism <em>Specalism</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleSkillChangeImpl extends ModuleChangeImpl implements ModuleSkillChange {
    /**
     * The cached value of the '{@link #getSkillgroup() <em>Skillgroup</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkillgroup()
     * @generated
     * @ordered
     */
    protected PersonaFertigkeitsGruppe skillgroup;

    /**
     * The cached value of the '{@link #getSkill() <em>Skill</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkill()
     * @generated
     * @ordered
     */
    protected PersonaFertigkeit skill;
    /**
     * The cached value of the '{@link #getSpecalism() <em>Specalism</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecalism()
     * @generated
     * @ordered
     */
    protected Spezialisierung specalism;

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
    public PersonaFertigkeitsGruppe getSkillgroup() {
        return skillgroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSkillgroup(PersonaFertigkeitsGruppe newSkillgroup, NotificationChain msgs) {
        PersonaFertigkeitsGruppe oldSkillgroup = skillgroup;
        skillgroup = newSkillgroup;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_CHANGE__SKILLGROUP, oldSkillgroup, newSkillgroup);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSkillgroup(PersonaFertigkeitsGruppe newSkillgroup) {
        if (newSkillgroup != skillgroup) {
            NotificationChain msgs = null;
            if (skillgroup != null)
                msgs = ((InternalEObject)skillgroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MODULE_SKILL_CHANGE__SKILLGROUP, null, msgs);
            if (newSkillgroup != null)
                msgs = ((InternalEObject)newSkillgroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MODULE_SKILL_CHANGE__SKILLGROUP, null, msgs);
            msgs = basicSetSkillgroup(newSkillgroup, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_CHANGE__SKILLGROUP, newSkillgroup, newSkillgroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersonaFertigkeit getSkill() {
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSkill(PersonaFertigkeit newSkill, NotificationChain msgs) {
        PersonaFertigkeit oldSkill = skill;
        skill = newSkill;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL, oldSkill, newSkill);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSkill(PersonaFertigkeit newSkill) {
        if (newSkill != skill) {
            NotificationChain msgs = null;
            if (skill != null)
                msgs = ((InternalEObject)skill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL, null, msgs);
            if (newSkill != null)
                msgs = ((InternalEObject)newSkill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL, null, msgs);
            msgs = basicSetSkill(newSkill, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL, newSkill, newSkill));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Spezialisierung getSpecalism() {
        return specalism;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSpecalism(Spezialisierung newSpecalism, NotificationChain msgs) {
        Spezialisierung oldSpecalism = specalism;
        specalism = newSpecalism;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_CHANGE__SPECALISM, oldSpecalism, newSpecalism);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpecalism(Spezialisierung newSpecalism) {
        if (newSpecalism != specalism) {
            NotificationChain msgs = null;
            if (specalism != null)
                msgs = ((InternalEObject)specalism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MODULE_SKILL_CHANGE__SPECALISM, null, msgs);
            if (newSpecalism != null)
                msgs = ((InternalEObject)newSpecalism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MODULE_SKILL_CHANGE__SPECALISM, null, msgs);
            msgs = basicSetSpecalism(newSpecalism, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_SKILL_CHANGE__SPECALISM, newSpecalism, newSpecalism));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILLGROUP:
                return basicSetSkillgroup(null, msgs);
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                return basicSetSkill(null, msgs);
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SPECALISM:
                return basicSetSpecalism(null, msgs);
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILLGROUP:
                return getSkillgroup();
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                return getSkill();
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SPECALISM:
                return getSpecalism();
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILLGROUP:
                setSkillgroup((PersonaFertigkeitsGruppe)newValue);
                return;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                setSkill((PersonaFertigkeit)newValue);
                return;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SPECALISM:
                setSpecalism((Spezialisierung)newValue);
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILLGROUP:
                setSkillgroup((PersonaFertigkeitsGruppe)null);
                return;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                setSkill((PersonaFertigkeit)null);
                return;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SPECALISM:
                setSpecalism((Spezialisierung)null);
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
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILLGROUP:
                return skillgroup != null;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                return skill != null;
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SPECALISM:
                return specalism != null;
        }
        return super.eIsSet(featureID);
    }

} //ModuleSkillChangeImpl
