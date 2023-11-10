/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fahrzeug Modifikation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.FahrzeugModifikation#getCapacityUsed <em>Capacity Used</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeugModifikation()
 * @model abstract="true"
 * @generated
 */
public interface FahrzeugModifikation extends Beschreibbar, Quelle, GeldWert {

    /**
     * Returns the value of the '<em><b>Capacity Used</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacity Used</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capacity Used</em>' attribute.
     * @see #setCapacityUsed(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeugModifikation_CapacityUsed()
     * @model
     * @generated
     */
    int getCapacityUsed();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FahrzeugModifikation#getCapacityUsed <em>Capacity Used</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacity Used</em>' attribute.
     * @see #getCapacityUsed()
     * @generated
     */
    void setCapacityUsed(int value);

} // FahrzeugModifikation
