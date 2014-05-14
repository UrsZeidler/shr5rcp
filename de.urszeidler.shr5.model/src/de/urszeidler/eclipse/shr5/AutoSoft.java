/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Soft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the software for drones.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AutoSoft#getRating <em>Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AutoSoft#getSkill <em>Skill</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AutoSoft#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AutoSoft#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAutoSoft()
 * @model
 * @generated
 */
public interface AutoSoft extends RiggerProgram {

    /**
     * Returns the value of the '<em><b>Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rating</em>' attribute.
     * @see #setRating(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAutoSoft_Rating()
     * @model required="true"
     * @generated
     */
    int getRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AutoSoft#getRating <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rating</em>' attribute.
     * @see #getRating()
     * @generated
     */
    void setRating(int value);

    /**
     * Returns the value of the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill</em>' reference.
     * @see #setSkill(Fertigkeit)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAutoSoft_Skill()
     * @model
     * @generated
     */
    Fertigkeit getSkill();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AutoSoft#getSkill <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill</em>' reference.
     * @see #getSkill()
     * @generated
     */
    void setSkill(Fertigkeit value);

    /**
     * Returns the value of the '<em><b>Weapon</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weapon</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weapon</em>' reference.
     * @see #setWeapon(AbstaktWaffe)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAutoSoft_Weapon()
     * @model
     * @generated
     */
    AbstaktWaffe getWeapon();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AutoSoft#getWeapon <em>Weapon</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weapon</em>' reference.
     * @see #getWeapon()
     * @generated
     */
    void setWeapon(AbstaktWaffe value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' reference.
     * @see #setModel(Drohne)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAutoSoft_Model()
     * @model
     * @generated
     */
    Drohne getModel();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AutoSoft#getModel <em>Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' reference.
     * @see #getModel()
     * @generated
     */
    void setModel(Drohne value);
} // AutoSoft
