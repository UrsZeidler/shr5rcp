/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyber Implant Weapon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.CyberImplantWeapon#getWeapon <em>Weapon</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberImplantWeapon()
 * @model
 * @generated
 */
public interface CyberImplantWeapon extends CyberwareEnhancement {
    /**
     * Returns the value of the '<em><b>Weapon</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weapon</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weapon</em>' containment reference.
     * @see #setWeapon(AbstaktWaffe)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberImplantWeapon_Weapon()
     * @model containment="true" required="true"
     * @generated
     */
    AbstaktWaffe getWeapon();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CyberImplantWeapon#getWeapon <em>Weapon</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weapon</em>' containment reference.
     * @see #getWeapon()
     * @generated
     */
    void setWeapon(AbstaktWaffe value);

} // CyberImplantWeapon
