/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Damage Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getDamage <em>Damage</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDamageTest()
 * @model
 * @generated
 */
public interface DamageTest extends ProbeCommand {
    /**
     * Returns the value of the '<em><b>Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Damage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Damage</em>' attribute.
     * @see #setDamage(String)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDamageTest_Damage()
     * @model
     * @generated
     */
    String getDamage();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getDamage <em>Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Damage</em>' attribute.
     * @see #getDamage()
     * @generated
     */
    void setDamage(String value);

} // DamageTest
