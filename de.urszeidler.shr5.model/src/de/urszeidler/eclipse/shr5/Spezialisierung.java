/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spezialisierung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Spezialisierung#getFertigkeit <em>Fertigkeit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSpezialisierung()
 * @model
 * @generated
 */
public interface Spezialisierung extends Beschreibbar, Quelle, Erlernbar, Modifyable {

    /**
     * Returns the value of the '<em><b>Fertigkeit</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5.Fertigkeit#getSpezialisierungen <em>Spezialisierungen</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fertigkeit</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fertigkeit</em>' container reference.
     * @see #setFertigkeit(Fertigkeit)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSpezialisierung_Fertigkeit()
     * @see de.urszeidler.eclipse.shr5.Fertigkeit#getSpezialisierungen
     * @model opposite="spezialisierungen" transient="false"
     * @generated
     */
    Fertigkeit getFertigkeit();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Spezialisierung#getFertigkeit <em>Fertigkeit</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fertigkeit</em>' container reference.
     * @see #getFertigkeit()
     * @generated
     */
    void setFertigkeit(Fertigkeit value);
} // Spezialisierung
