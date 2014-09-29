/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.TimeUnits;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intervall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Intervall#getQuantities <em>Quantities</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Intervall#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getIntervall()
 * @model
 * @generated
 */
public interface Intervall extends EObject {
    /**
     * Returns the value of the '<em><b>Quantities</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quantities</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quantities</em>' attribute.
     * @see #setQuantities(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getIntervall_Quantities()
     * @model required="true"
     * @generated
     */
    int getQuantities();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Intervall#getQuantities <em>Quantities</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quantities</em>' attribute.
     * @see #getQuantities()
     * @generated
     */
    void setQuantities(int value);

    /**
     * Returns the value of the '<em><b>Units</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.TimeUnits}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Units</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Units</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.TimeUnits
     * @see #setUnits(TimeUnits)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getIntervall_Units()
     * @model required="true"
     * @generated
     */
    TimeUnits getUnits();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Intervall#getUnits <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Units</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.TimeUnits
     * @see #getUnits()
     * @generated
     */
    void setUnits(TimeUnits value);

} // Intervall
