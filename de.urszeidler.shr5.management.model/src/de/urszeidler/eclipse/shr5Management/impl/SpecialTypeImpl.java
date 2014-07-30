/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.SpecialType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Special Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.SpecialTypeImpl#getSelectableTypes <em>Selectable Types</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.SpecialTypeImpl#getSkillValue <em>Skill Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.SpecialTypeImpl#getSkillNumber <em>Skill Number</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.SpecialTypeImpl#getSelectableSkills <em>Selectable Skills</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.SpecialTypeImpl#getSelectableSkillGroups <em>Selectable Skill Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SpecialTypeImpl extends PriorityCategorieImpl implements SpecialType {
	/**
     * The cached value of the '{@link #getSelectableTypes() <em>Selectable Types</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSelectableTypes()
     * @generated
     * @ordered
     */
	protected EClass selectableTypes;

	/**
     * The default value of the '{@link #getSkillValue() <em>Skill Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSkillValue()
     * @generated
     * @ordered
     */
	protected static final int SKILL_VALUE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getSkillValue() <em>Skill Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSkillValue()
     * @generated
     * @ordered
     */
	protected int skillValue = SKILL_VALUE_EDEFAULT;

	/**
     * The default value of the '{@link #getSkillNumber() <em>Skill Number</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSkillNumber()
     * @generated
     * @ordered
     */
	protected static final int SKILL_NUMBER_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getSkillNumber() <em>Skill Number</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSkillNumber()
     * @generated
     * @ordered
     */
	protected int skillNumber = SKILL_NUMBER_EDEFAULT;

	/**
     * The cached value of the '{@link #getSelectableSkills() <em>Selectable Skills</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSelectableSkills()
     * @generated
     * @ordered
     */
	protected EList<Fertigkeit> selectableSkills;

	/**
     * The cached value of the '{@link #getSelectableSkillGroups() <em>Selectable Skill Groups</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSelectableSkillGroups()
     * @generated
     * @ordered
     */
	protected EList<FertigkeitsGruppe> selectableSkillGroups;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SpecialTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.SPECIAL_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSelectableTypes() {
        if (selectableTypes != null && selectableTypes.eIsProxy()) {
            InternalEObject oldSelectableTypes = (InternalEObject)selectableTypes;
            selectableTypes = (EClass)eResolveProxy(oldSelectableTypes);
            if (selectableTypes != oldSelectableTypes) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_TYPES, oldSelectableTypes, selectableTypes));
            }
        }
        return selectableTypes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass basicGetSelectableTypes() {
        return selectableTypes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSelectableTypes(EClass newSelectableTypes) {
        EClass oldSelectableTypes = selectableTypes;
        selectableTypes = newSelectableTypes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_TYPES, oldSelectableTypes, selectableTypes));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getSkillValue() {
        return skillValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSkillValue(int newSkillValue) {
        int oldSkillValue = skillValue;
        skillValue = newSkillValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SPECIAL_TYPE__SKILL_VALUE, oldSkillValue, skillValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getSkillNumber() {
        return skillNumber;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSkillNumber(int newSkillNumber) {
        int oldSkillNumber = skillNumber;
        skillNumber = newSkillNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SPECIAL_TYPE__SKILL_NUMBER, oldSkillNumber, skillNumber));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Fertigkeit> getSelectableSkills() {
        if (selectableSkills == null) {
            selectableSkills = new EObjectResolvingEList<Fertigkeit>(Fertigkeit.class, this, Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILLS);
        }
        return selectableSkills;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<FertigkeitsGruppe> getSelectableSkillGroups() {
        if (selectableSkillGroups == null) {
            selectableSkillGroups = new EObjectResolvingEList<FertigkeitsGruppe>(FertigkeitsGruppe.class, this, Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS);
        }
        return selectableSkillGroups;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int calcSkillsSpend(ManagedCharacter context) {
		if (skillNumber == 0)
			return 0;

		ManagedCharacter managedCharacter = context;
		if (managedCharacter == null)
			return 0;
		AbstraktPersona persona = managedCharacter.getPersona();
		if (persona == null)
			return 0;

		
		ArrayList<Fertigkeit> list = new ArrayList<Fertigkeit>();
		list.addAll(getSelectableSkills());
		EList<FertigkeitsGruppe> selectableSkillGroups2 = getSelectableSkillGroups();
		for (FertigkeitsGruppe fertigkeitsGruppe : selectableSkillGroups2) {
			list.addAll(fertigkeitsGruppe.getFertigkeiten());
		}
		
		int count = 0;
		EList<PersonaFertigkeit> fertigkeiten = context.getPersona().getFertigkeiten();
		for (PersonaFertigkeit personaFertigkeit : fertigkeiten) {
			if(list.contains(personaFertigkeit.getFertigkeit()))
				if(personaFertigkeit.getStufe()>=getSkillValue() )
					count++;					
			
		}		
		return Math.min(count,getSkillNumber());
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_TYPES:
                if (resolve) return getSelectableTypes();
                return basicGetSelectableTypes();
            case Shr5managementPackage.SPECIAL_TYPE__SKILL_VALUE:
                return getSkillValue();
            case Shr5managementPackage.SPECIAL_TYPE__SKILL_NUMBER:
                return getSkillNumber();
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILLS:
                return getSelectableSkills();
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS:
                return getSelectableSkillGroups();
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
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_TYPES:
                setSelectableTypes((EClass)newValue);
                return;
            case Shr5managementPackage.SPECIAL_TYPE__SKILL_VALUE:
                setSkillValue((Integer)newValue);
                return;
            case Shr5managementPackage.SPECIAL_TYPE__SKILL_NUMBER:
                setSkillNumber((Integer)newValue);
                return;
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILLS:
                getSelectableSkills().clear();
                getSelectableSkills().addAll((Collection<? extends Fertigkeit>)newValue);
                return;
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS:
                getSelectableSkillGroups().clear();
                getSelectableSkillGroups().addAll((Collection<? extends FertigkeitsGruppe>)newValue);
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
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_TYPES:
                setSelectableTypes((EClass)null);
                return;
            case Shr5managementPackage.SPECIAL_TYPE__SKILL_VALUE:
                setSkillValue(SKILL_VALUE_EDEFAULT);
                return;
            case Shr5managementPackage.SPECIAL_TYPE__SKILL_NUMBER:
                setSkillNumber(SKILL_NUMBER_EDEFAULT);
                return;
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILLS:
                getSelectableSkills().clear();
                return;
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS:
                getSelectableSkillGroups().clear();
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
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_TYPES:
                return selectableTypes != null;
            case Shr5managementPackage.SPECIAL_TYPE__SKILL_VALUE:
                return skillValue != SKILL_VALUE_EDEFAULT;
            case Shr5managementPackage.SPECIAL_TYPE__SKILL_NUMBER:
                return skillNumber != SKILL_NUMBER_EDEFAULT;
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILLS:
                return selectableSkills != null && !selectableSkills.isEmpty();
            case Shr5managementPackage.SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS:
                return selectableSkillGroups != null && !selectableSkillGroups.isEmpty();
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
            case Shr5managementPackage.SPECIAL_TYPE___CALC_SKILLS_SPEND__MANAGEDCHARACTER:
                return calcSkillsSpend((ManagedCharacter)arguments.get(0));
        }
        return super.eInvoke(operationID, arguments);
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
        result.append(" (skillValue: ");
        result.append(skillValue);
        result.append(", skillNumber: ");
        result.append(skillNumber);
        result.append(')');
        return result.toString();
    }

} //SpecialTypeImpl
