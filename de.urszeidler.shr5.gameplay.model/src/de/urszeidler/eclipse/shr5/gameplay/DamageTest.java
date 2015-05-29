/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Damage Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the damage test.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getDamage <em>Damage</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getDv <em>Dv</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getEffectiveDamage <em>Effective Damage</em>}</li>
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
     * <!-- begin-model-doc -->
     * This is the damage the subject has to test agaist.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Damage</em>' attribute.
     * @see #setDamage(String)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDamageTest_Damage()
     * @model required="true"
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

    /**
     * Returns the value of the '<em><b>Dv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This is the armor piercing of the attack.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dv</em>' attribute.
     * @see #setDv(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDamageTest_Dv()
     * @model required="true"
     * @generated
     */
    int getDv();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getDv <em>Dv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dv</em>' attribute.
     * @see #getDv()
     * @generated
     */
    void setDv(int value);

    /**
     * Returns the value of the '<em><b>Effective Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Effective Damage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This is thedamage the subject suffers. 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Effective Damage</em>' attribute.
     * @see #setEffectiveDamage(String)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDamageTest_EffectiveDamage()
     * @model
     * @generated
     */
    String getEffectiveDamage();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getEffectiveDamage <em>Effective Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Effective Damage</em>' attribute.
     * @see #getEffectiveDamage()
     * @generated
     */
    void setEffectiveDamage(String value);

} // DamageTest
