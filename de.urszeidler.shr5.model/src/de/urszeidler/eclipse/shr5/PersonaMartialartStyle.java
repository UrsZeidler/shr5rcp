/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Martialart Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaMartialartStyle#getStyle <em>Style</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaMartialartStyle#getTechniques <em>Techniques</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaMartialartStyle()
 * @model
 * @generated
 */
public interface PersonaMartialartStyle extends Spezialisierung {
    /**
     * Returns the value of the '<em><b>Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' reference.
     * @see #setStyle(MartialartStyle)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaMartialartStyle_Style()
     * @model required="true"
     * @generated
     */
    MartialartStyle getStyle();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaMartialartStyle#getStyle <em>Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' reference.
     * @see #getStyle()
     * @generated
     */
    void setStyle(MartialartStyle value);

    /**
     * Returns the value of the '<em><b>Techniques</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.PersonaMartialartTechnique}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Techniques</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Techniques</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaMartialartStyle_Techniques()
     * @model containment="true"
     * @generated
     */
    EList<PersonaMartialartTechnique> getTechniques();

} // PersonaMartialartStyle
