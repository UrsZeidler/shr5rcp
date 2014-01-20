/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstrakt Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getKonstitutionBasis <em>Konstitution Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getGeschicklichkeitBasis <em>Geschicklichkeit Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getReaktionBasis <em>Reaktion Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getStaerkeBasis <em>Staerke Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getCharismaBasis <em>Charisma Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getWillenskraftBasis <em>Willenskraft Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getIntuitionBasis <em>Intuition Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getLogikBasis <em>Logik Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getFertigkeiten <em>Fertigkeiten</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getFertigkeitsGruppen <em>Fertigkeits Gruppen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getSpezies <em>Spezies</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getModManager <em>Mod Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona()
 * @model abstract="true"
 * @generated
 */
public interface AbstraktPersona extends Beschreibbar, KoerperlicheAttribute, SpezielleAttribute, GeistigeAttribute, ChrakterLimits {
	/**
     * Returns the value of the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Konstitution Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Konstitution Basis</em>' attribute.
     * @see #setKonstitutionBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_KonstitutionBasis()
     * @model
     * @generated
     */
	int getKonstitutionBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getKonstitutionBasis <em>Konstitution Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Konstitution Basis</em>' attribute.
     * @see #getKonstitutionBasis()
     * @generated
     */
	void setKonstitutionBasis(int value);

	/**
     * Returns the value of the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geschicklichkeit Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Geschicklichkeit Basis</em>' attribute.
     * @see #setGeschicklichkeitBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_GeschicklichkeitBasis()
     * @model
     * @generated
     */
	int getGeschicklichkeitBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getGeschicklichkeitBasis <em>Geschicklichkeit Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Geschicklichkeit Basis</em>' attribute.
     * @see #getGeschicklichkeitBasis()
     * @generated
     */
	void setGeschicklichkeitBasis(int value);

	/**
     * Returns the value of the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reaktion Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Reaktion Basis</em>' attribute.
     * @see #setReaktionBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_ReaktionBasis()
     * @model
     * @generated
     */
	int getReaktionBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getReaktionBasis <em>Reaktion Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reaktion Basis</em>' attribute.
     * @see #getReaktionBasis()
     * @generated
     */
	void setReaktionBasis(int value);

	/**
     * Returns the value of the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staerke Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Staerke Basis</em>' attribute.
     * @see #setStaerkeBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_StaerkeBasis()
     * @model
     * @generated
     */
	int getStaerkeBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getStaerkeBasis <em>Staerke Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Staerke Basis</em>' attribute.
     * @see #getStaerkeBasis()
     * @generated
     */
	void setStaerkeBasis(int value);

	/**
     * Returns the value of the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charisma Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Charisma Basis</em>' attribute.
     * @see #setCharismaBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_CharismaBasis()
     * @model
     * @generated
     */
	int getCharismaBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getCharismaBasis <em>Charisma Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charisma Basis</em>' attribute.
     * @see #getCharismaBasis()
     * @generated
     */
	void setCharismaBasis(int value);

	/**
     * Returns the value of the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Willenskraft Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Willenskraft Basis</em>' attribute.
     * @see #setWillenskraftBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_WillenskraftBasis()
     * @model
     * @generated
     */
	int getWillenskraftBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getWillenskraftBasis <em>Willenskraft Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Willenskraft Basis</em>' attribute.
     * @see #getWillenskraftBasis()
     * @generated
     */
	void setWillenskraftBasis(int value);

	/**
     * Returns the value of the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intuition Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intuition Basis</em>' attribute.
     * @see #setIntuitionBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_IntuitionBasis()
     * @model
     * @generated
     */
	int getIntuitionBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getIntuitionBasis <em>Intuition Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intuition Basis</em>' attribute.
     * @see #getIntuitionBasis()
     * @generated
     */
	void setIntuitionBasis(int value);

	/**
     * Returns the value of the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logik Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Logik Basis</em>' attribute.
     * @see #setLogikBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_LogikBasis()
     * @model
     * @generated
     */
	int getLogikBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getLogikBasis <em>Logik Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Logik Basis</em>' attribute.
     * @see #getLogikBasis()
     * @generated
     */
	void setLogikBasis(int value);

	/**
     * Returns the value of the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.PersonaFertigkeit}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fertigkeiten</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Fertigkeiten</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_Fertigkeiten()
     * @model containment="true"
     * @generated
     */
	EList<PersonaFertigkeit> getFertigkeiten();

	/**
     * Returns the value of the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fertigkeits Gruppen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Fertigkeits Gruppen</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_FertigkeitsGruppen()
     * @model containment="true"
     * @generated
     */
	EList<PersonaFertigkeitsGruppe> getFertigkeitsGruppen();

	/**
     * Returns the value of the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spezies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Spezies</em>' reference.
     * @see #setSpezies(Spezies)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_Spezies()
     * @model required="true"
     * @generated
     */
	Spezies getSpezies();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getSpezies <em>Spezies</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spezies</em>' reference.
     * @see #getSpezies()
     * @generated
     */
	void setSpezies(Spezies value);

	/**
     * Returns the value of the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mod Manager</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktPersona_ModManager()
     * @model dataType="de.urszeidler.eclipse.shr5.ModificationManager" required="true" transient="true" changeable="false"
     * @generated
     */
	ModSetter getModManager();

} // AbstraktPersona
