/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tutorsoft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Tutorsoft#getRating <em>Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Tutorsoft#getSkill <em>Skill</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getTutorsoft()
 * @model
 * @generated
 */
public interface Tutorsoft extends MatrixPrograms {
    /**
     * Returns the value of the '<em><b>Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rating</em>' attribute.
     * @see #setRating(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getTutorsoft_Rating()
     * @model required="true"
     * @generated
     */
    int getRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Tutorsoft#getRating <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rating</em>' attribute.
     * @see #getRating()
     * @generated
     */
    void setRating(int value);

    /**
     * Returns the value of the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill</em>' reference.
     * @see #setSkill(Fertigkeit)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getTutorsoft_Skill()
     * @model required="true"
     * @generated
     */
    Fertigkeit getSkill();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Tutorsoft#getSkill <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill</em>' reference.
     * @see #getSkill()
     * @generated
     */
    void setSkill(Fertigkeit value);

} // Tutorsoft
