/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Martialart Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaMartialartTechnique#getTechnique <em>Technique</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaMartialartTechnique()
 * @model
 * @generated
 */
public interface PersonaMartialartTechnique extends Erlernbar {
    /**
     * Returns the value of the '<em><b>Technique</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Technique</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Technique</em>' reference.
     * @see #setTechnique(MartialartTechnique)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaMartialartTechnique_Technique()
     * @model required="true"
     * @generated
     */
    MartialartTechnique getTechnique();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaMartialartTechnique#getTechnique <em>Technique</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Technique</em>' reference.
     * @see #getTechnique()
     * @generated
     */
    void setTechnique(MartialartTechnique value);

} // PersonaMartialartTechnique
