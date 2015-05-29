/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initative Pass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getTurn <em>Turn</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#isSizeInitative <em>Size Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getAction <em>Action</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getFreeAction <em>Free Action</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getInterruptAction <em>Interrupt Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitativePass()
 * @model
 * @generated
 */
public interface InitativePass extends SubjectCommand, PhaseCmd {
    /**
     * Returns the value of the '<em><b>Turn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Turn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Turn</em>' attribute.
     * @see #setTurn(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitativePass_Turn()
     * @model
     * @generated
     */
    int getTurn();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getTurn <em>Turn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turn</em>' attribute.
     * @see #getTurn()
     * @generated
     */
    void setTurn(int value);

    /**
     * Returns the value of the '<em><b>Size Initative</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size Initative</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size Initative</em>' attribute.
     * @see #setSizeInitative(boolean)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitativePass_SizeInitative()
     * @model default="false"
     * @generated
     */
    boolean isSizeInitative();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#isSizeInitative <em>Size Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size Initative</em>' attribute.
     * @see #isSizeInitative()
     * @generated
     */
    void setSizeInitative(boolean value);

    /**
     * Returns the value of the '<em><b>Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action</em>' containment reference.
     * @see #setAction(CommandWrapper)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitativePass_Action()
     * @model containment="true" required="true"
     * @generated
     */
    CommandWrapper getAction();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getAction <em>Action</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action</em>' containment reference.
     * @see #getAction()
     * @generated
     */
    void setAction(CommandWrapper value);

    /**
     * Returns the value of the '<em><b>Free Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Free Action</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Free Action</em>' containment reference.
     * @see #setFreeAction(FreeAction)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitativePass_FreeAction()
     * @model containment="true"
     * @generated
     */
    FreeAction getFreeAction();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getFreeAction <em>Free Action</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Free Action</em>' containment reference.
     * @see #getFreeAction()
     * @generated
     */
    void setFreeAction(FreeAction value);

    /**
     * Returns the value of the '<em><b>Interrupt Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interrupt Action</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interrupt Action</em>' containment reference.
     * @see #setInterruptAction(InterruptAction)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitativePass_InterruptAction()
     * @model containment="true"
     * @generated
     */
    InterruptAction getInterruptAction();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getInterruptAction <em>Interrupt Action</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interrupt Action</em>' containment reference.
     * @see #getInterruptAction()
     * @generated
     */
    void setInterruptAction(InterruptAction value);

} // InitativePass
