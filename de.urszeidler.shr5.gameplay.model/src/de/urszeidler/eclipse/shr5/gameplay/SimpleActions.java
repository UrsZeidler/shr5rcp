/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SimpleActions#getAction1 <em>Action1</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SimpleActions#getAction2 <em>Action2</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSimpleActions()
 * @model
 * @generated
 */
public interface SimpleActions extends CommandWrapper {
    /**
     * Returns the value of the '<em><b>Action1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action1</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action1</em>' containment reference.
     * @see #setAction1(SimpleAction)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSimpleActions_Action1()
     * @model containment="true"
     * @generated
     */
    SimpleAction getAction1();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SimpleActions#getAction1 <em>Action1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action1</em>' containment reference.
     * @see #getAction1()
     * @generated
     */
    void setAction1(SimpleAction value);

    /**
     * Returns the value of the '<em><b>Action2</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action2</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action2</em>' containment reference.
     * @see #setAction2(SimpleAction)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSimpleActions_Action2()
     * @model containment="true"
     * @generated
     */
    SimpleAction getAction2();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SimpleActions#getAction2 <em>Action2</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action2</em>' containment reference.
     * @see #getAction2()
     * @generated
     */
    void setAction2(SimpleAction value);

} // SimpleActions
