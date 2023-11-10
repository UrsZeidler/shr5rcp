/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.SchadensTyp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drain Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.DrainCommand#getDamage <em>Damage</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.DrainCommand#getDamageType <em>Damage Type</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDrainCommand()
 * @model
 * @generated
 */
public interface DrainCommand extends ProbeCommand {
    /**
     * Returns the value of the '<em><b>Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Damage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Damage</em>' attribute.
     * @see #setDamage(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDrainCommand_Damage()
     * @model required="true"
     * @generated
     */
    int getDamage();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.DrainCommand#getDamage <em>Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Damage</em>' attribute.
     * @see #getDamage()
     * @generated
     */
    void setDamage(int value);

    /**
     * Returns the value of the '<em><b>Damage Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.SchadensTyp}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Damage Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Damage Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.SchadensTyp
     * @see #setDamageType(SchadensTyp)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDrainCommand_DamageType()
     * @model
     * @generated
     */
    SchadensTyp getDamageType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.DrainCommand#getDamageType <em>Damage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Damage Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.SchadensTyp
     * @see #getDamageType()
     * @generated
     */
    void setDamageType(SchadensTyp value);

} // DrainCommand
