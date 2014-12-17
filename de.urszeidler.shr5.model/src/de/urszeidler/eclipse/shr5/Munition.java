/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Munition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ammunition defines the damage modifcation the ammunition does. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Munition#getDamageType <em>Damage Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Munition#getDamageMod <em>Damage Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Munition#getArmorMod <em>Armor Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Munition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMunition()
 * @model
 * @generated
 */
public interface Munition extends AbstraktGegenstand, Menge {
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMunition_DamageType()
     * @model
     * @generated
     */
    SchadensTyp getDamageType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Munition#getDamageType <em>Damage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Damage Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.SchadensTyp
     * @see #getDamageType()
     * @generated
     */
    void setDamageType(SchadensTyp value);

    /**
     * Returns the value of the '<em><b>Damage Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Damage Mod</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The damage modifation of the ammo, this value is added to the damage value of the weapon when used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Damage Mod</em>' attribute.
     * @see #setDamageMod(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMunition_DamageMod()
     * @model
     * @generated
     */
    int getDamageMod();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Munition#getDamageMod <em>Damage Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Damage Mod</em>' attribute.
     * @see #getDamageMod()
     * @generated
     */
    void setDamageMod(int value);

    /**
     * Returns the value of the '<em><b>Armor Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Armor Mod</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The armor modifation of the ammo, this value is added to the armor piercing of the weapon when used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Armor Mod</em>' attribute.
     * @see #setArmorMod(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMunition_ArmorMod()
     * @model
     * @generated
     */
    int getArmorMod();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Munition#getArmorMod <em>Armor Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Armor Mod</em>' attribute.
     * @see #getArmorMod()
     * @generated
     */
    void setArmorMod(int value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The categorie of the ammo, the ammo can be used in every weapon with the same range category.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(Reichweite)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMunition_Type()
     * @model required="true"
     * @generated
     */
    Reichweite getType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Munition#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(Reichweite value);

} // Munition
