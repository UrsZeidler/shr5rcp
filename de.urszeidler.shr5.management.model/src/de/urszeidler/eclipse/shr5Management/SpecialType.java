/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableTypes <em>Selectable Types</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSkillValue <em>Skill Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSkillNumber <em>Skill Number</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableSkills <em>Selectable Skills</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableSkillGroups <em>Selectable Skill Groups</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSpecialType()
 * @model abstract="true"
 * @generated
 */
public interface SpecialType extends PriorityCategorie {
	/**
     * Returns the value of the '<em><b>Selectable Types</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectable Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Selectable Types</em>' reference.
     * @see #setSelectableTypes(EClass)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSpecialType_SelectableTypes()
     * @model required="true"
     * @generated
     */
	EClass getSelectableTypes();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableTypes <em>Selectable Types</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selectable Types</em>' reference.
     * @see #getSelectableTypes()
     * @generated
     */
	void setSelectableTypes(EClass value);

	/**
     * Returns the value of the '<em><b>Skill Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Skill Value</em>' attribute.
     * @see #setSkillValue(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSpecialType_SkillValue()
     * @model
     * @generated
     */
	int getSkillValue();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSkillValue <em>Skill Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill Value</em>' attribute.
     * @see #getSkillValue()
     * @generated
     */
	void setSkillValue(int value);

	/**
     * Returns the value of the '<em><b>Skill Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Skill Number</em>' attribute.
     * @see #setSkillNumber(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSpecialType_SkillNumber()
     * @model
     * @generated
     */
	int getSkillNumber();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSkillNumber <em>Skill Number</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill Number</em>' attribute.
     * @see #getSkillNumber()
     * @generated
     */
	void setSkillNumber(int value);

	/**
     * Returns the value of the '<em><b>Selectable Skills</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Fertigkeit}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectable Skills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Selectable Skills</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSpecialType_SelectableSkills()
     * @model
     * @generated
     */
	EList<Fertigkeit> getSelectableSkills();

	/**
     * Returns the value of the '<em><b>Selectable Skill Groups</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.FertigkeitsGruppe}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectable Skill Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Selectable Skill Groups</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSpecialType_SelectableSkillGroups()
     * @model
     * @generated
     */
	EList<FertigkeitsGruppe> getSelectableSkillGroups();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model contextRequired="true"
     * @generated
     */
	int calcSkillsSpend(ManagedCharacter context);

} // SpecialType
