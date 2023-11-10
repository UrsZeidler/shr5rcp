/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This defines a spirit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getKonstitutionBasis <em>Konstitution Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getGeschicklichkeitBasis <em>Geschicklichkeit Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getReaktionBasis <em>Reaktion Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getStaerkeBasis <em>Staerke Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getCharismaBasis <em>Charisma Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getWillenskraftBasis <em>Willenskraft Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getIntuitionBasis <em>Intuition Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getLogikBasis <em>Logik Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getPowers <em>Powers</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getOptionalPowers <em>Optional Powers</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist()
 * @model
 * @generated
 */
public interface Geist extends StufenPersona, AstraleProjektion {
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_KonstitutionBasis()
     * @model
     * @generated
     */
    int getKonstitutionBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Geist#getKonstitutionBasis <em>Konstitution Basis</em>}' attribute.
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_GeschicklichkeitBasis()
     * @model
     * @generated
     */
    int getGeschicklichkeitBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Geist#getGeschicklichkeitBasis <em>Geschicklichkeit Basis</em>}' attribute.
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_ReaktionBasis()
     * @model
     * @generated
     */
    int getReaktionBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Geist#getReaktionBasis <em>Reaktion Basis</em>}' attribute.
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_StaerkeBasis()
     * @model
     * @generated
     */
    int getStaerkeBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Geist#getStaerkeBasis <em>Staerke Basis</em>}' attribute.
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_CharismaBasis()
     * @model
     * @generated
     */
    int getCharismaBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Geist#getCharismaBasis <em>Charisma Basis</em>}' attribute.
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_WillenskraftBasis()
     * @model
     * @generated
     */
    int getWillenskraftBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Geist#getWillenskraftBasis <em>Willenskraft Basis</em>}' attribute.
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_IntuitionBasis()
     * @model
     * @generated
     */
    int getIntuitionBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Geist#getIntuitionBasis <em>Intuition Basis</em>}' attribute.
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_LogikBasis()
     * @model
     * @generated
     */
    int getLogikBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Geist#getLogikBasis <em>Logik Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Logik Basis</em>' attribute.
     * @see #getLogikBasis()
     * @generated
     */
    void setLogikBasis(int value);

    /**
     * Returns the value of the '<em><b>Powers</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.CritterKraft}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Powers</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Powers</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_Powers()
     * @model containment="true"
     * @generated
     */
    EList<CritterKraft> getPowers();

    /**
     * Returns the value of the '<em><b>Optional Powers</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.CritterKraft}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Optional Powers</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Optional Powers</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_OptionalPowers()
     * @model containment="true"
     * @generated
     */
    EList<CritterKraft> getOptionalPowers();

} // Geist
