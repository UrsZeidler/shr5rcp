/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


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
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Geist#getSpezies <em>Spezies</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist()
 * @model
 * @generated
 */
public interface Geist extends StufenPersona, AstraleProjektion {
    /**
     * Returns the value of the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Refers the metatyp or species the persona represent.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Spezies</em>' reference.
     * @see #setSpezies(GeisterArt)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeist_Spezies()
     * @model required="true"
     * @generated
     */
    GeisterArt getSpezies();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Geist#getSpezies <em>Spezies</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spezies</em>' reference.
     * @see #getSpezies()
     * @generated
     */
    void setSpezies(GeisterArt value);

} // Geist
