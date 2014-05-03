/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stufen Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The rating defines the attribute values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.StufenPersona#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.StufenPersona#getFertigkeiten <em>Fertigkeiten</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.StufenPersona#getFertigkeitsGruppen <em>Fertigkeits Gruppen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.StufenPersona#getSkillGroups <em>Skill Groups</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.StufenPersona#getSkills <em>Skills</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getStufenPersona()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StufenPersona extends Quelle, SpezielleAttribute, GeistigeAttribute, KoerperlicheAttribute, Beschreibbar, ChrakterLimits, Panzerung {
    /**
     * Returns the value of the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stufe</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stufe</em>' attribute.
     * @see #setStufe(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getStufenPersona_Stufe()
     * @model required="true"
     * @generated
     */
    int getStufe();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.StufenPersona#getStufe <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stufe</em>' attribute.
     * @see #getStufe()
     * @generated
     */
    void setStufe(int value);

    /**
     * Returns the value of the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.PersonaFertigkeit}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Contains the fertigkeiten.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fertigkeiten</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getStufenPersona_Fertigkeiten()
     * @model containment="true"
     * @generated
     */
    EList<PersonaFertigkeit> getFertigkeiten();

    /**
     * Returns the value of the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Contains the skillgroups.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fertigkeits Gruppen</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getStufenPersona_FertigkeitsGruppen()
     * @model containment="true"
     * @generated
     */
    EList<PersonaFertigkeitsGruppe> getFertigkeitsGruppen();

    /**
     * Returns the value of the '<em><b>Skill Groups</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.FertigkeitsGruppe}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill Groups</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill Groups</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getStufenPersona_SkillGroups()
     * @model
     * @generated
     */
    EList<FertigkeitsGruppe> getSkillGroups();

    /**
     * Returns the value of the '<em><b>Skills</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Fertigkeit}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skills</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skills</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getStufenPersona_Skills()
     * @model
     * @generated
     */
    EList<Fertigkeit> getSkills();

} // StufenPersona
