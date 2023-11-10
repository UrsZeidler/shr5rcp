/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datasoft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Datasoft#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getDatasoft()
 * @model
 * @generated
 */
public interface Datasoft extends BasicProgram {
    /**
     * Returns the value of the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill</em>' reference.
     * @see #setSkill(Wissensfertigkeit)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getDatasoft_Skill()
     * @model required="true"
     * @generated
     */
    Wissensfertigkeit getSkill();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Datasoft#getSkill <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill</em>' reference.
     * @see #getSkill()
     * @generated
     */
    void setSkill(Wissensfertigkeit value);

} // Datasoft
