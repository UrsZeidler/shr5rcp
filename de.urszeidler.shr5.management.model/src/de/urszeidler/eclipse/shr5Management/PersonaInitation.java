/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Initation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Initation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PersonaInitation#getGarde <em>Garde</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaInitation()
 * @model
 * @generated
 */
public interface PersonaInitation extends Changes {
    /**
     * Returns the value of the '<em><b>Garde</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Garde</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Garde</em>' reference.
     * @see #setGarde(Initation)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaInitation_Garde()
     * @model required="true"
     * @generated
     */
    Initation getGarde();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PersonaInitation#getGarde <em>Garde</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Garde</em>' reference.
     * @see #getGarde()
     * @generated
     */
    void setGarde(Initation value);

} // PersonaInitation
