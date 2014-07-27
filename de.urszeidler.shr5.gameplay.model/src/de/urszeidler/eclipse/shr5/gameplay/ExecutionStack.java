/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The execution stack holds the current command and the execution protokoll.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getCurrentCommand <em>Current Command</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getExecutionStack()
 * @model
 * @generated
 */
public interface ExecutionStack extends EObject {
    /**
     * Returns the value of the '<em><b>Current Command</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Command</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Command</em>' reference.
     * @see #setCurrentCommand(Command)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getExecutionStack_CurrentCommand()
     * @model
     * @generated
     */
    Command getCurrentCommand();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getCurrentCommand <em>Current Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Command</em>' reference.
     * @see #getCurrentCommand()
     * @generated
     */
    void setCurrentCommand(Command value);

    /**
     * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Protocol</em>' containment reference.
     * @see #setProtocol(ExecutionProtocol)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getExecutionStack_Protocol()
     * @model containment="true" required="true"
     * @generated
     */
    ExecutionProtocol getProtocol();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getProtocol <em>Protocol</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protocol</em>' containment reference.
     * @see #getProtocol()
     * @generated
     */
    void setProtocol(ExecutionProtocol value);

} // ExecutionStack
