/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.MartialartStyle;
import de.urszeidler.eclipse.shr5.MartialartTechnique;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Martial Art Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A persona martialart change manage the gain of a style or a technique.
 * For a style select the skill as changeabel and the style, for a technique the technique and the stlye. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange#getStyle <em>Style</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange#getTechnique <em>Technique</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaMartialArtChange()
 * @model
 * @generated
 */
public interface PersonaMartialArtChange extends PersonaChange {
    /**
     * Returns the value of the '<em><b>Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When the changeable skill is not null the style is learned as spec for the selected skill.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Style</em>' reference.
     * @see #setStyle(MartialartStyle)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaMartialArtChange_Style()
     * @model
     * @generated
     */
    MartialartStyle getStyle();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange#getStyle <em>Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' reference.
     * @see #getStyle()
     * @generated
     */
    void setStyle(MartialartStyle value);

    /**
     * Returns the value of the '<em><b>Technique</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Technique</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When the skill is not set the technique will be added to the selected style, when not it repesents the first technique learned.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Technique</em>' reference.
     * @see #setTechnique(MartialartTechnique)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaMartialArtChange_Technique()
     * @model
     * @generated
     */
    MartialartTechnique getTechnique();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange#getTechnique <em>Technique</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Technique</em>' reference.
     * @see #getTechnique()
     * @generated
     */
    void setTechnique(MartialartTechnique value);

} // PersonaMartialArtChange
