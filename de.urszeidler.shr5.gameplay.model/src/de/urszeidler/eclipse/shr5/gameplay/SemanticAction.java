/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Is used to define some informtion passing on in the gameplay.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SemanticAction#getType <em>Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SemanticAction#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSemanticAction()
 * @model
 * @generated
 */
public interface SemanticAction extends SubjectCommand {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.gameplay.SemanticType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.gameplay.SemanticType
     * @see #setType(SemanticType)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSemanticAction_Type()
     * @model
     * @generated
     */
    SemanticType getType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SemanticAction#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.gameplay.SemanticType
     * @see #getType()
     * @generated
     */
    void setType(SemanticType value);

    /**
     * Returns the value of the '<em><b>Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The message.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Message</em>' attribute.
     * @see #setMessage(String)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSemanticAction_Message()
     * @model
     * @generated
     */
    String getMessage();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SemanticAction#getMessage <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' attribute.
     * @see #getMessage()
     * @generated
     */
    void setMessage(String value);

} // SemanticAction
