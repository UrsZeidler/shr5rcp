/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getExecutionProtocol()
 * @model
 * @generated
 */
public interface ExecutionProtocol extends EObject {
    /**
     * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.gameplay.Command}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Commands</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getExecutionProtocol_Commands()
     * @model containment="true"
     * @generated
     */
    EList<Command> getCommands();

} // ExecutionProtocol
