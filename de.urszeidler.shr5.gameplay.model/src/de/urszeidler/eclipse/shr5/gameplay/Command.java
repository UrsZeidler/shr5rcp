/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The basic command interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#isExecuted <em>Executed</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#getSubCommands <em>Sub Commands</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback <em>Cmd Callback</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#isExecuting <em>Executing</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute <em>Can Execute</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#isHidden <em>Hidden</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Command extends EObject {
    /**
     * Returns the value of the '<em><b>Executed</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Executed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If the command is executed the flag is set to true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Executed</em>' attribute.
     * @see #setExecuted(boolean)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand_Executed()
     * @model default="false" required="true"
     * @generated
     */
    boolean isExecuted();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isExecuted <em>Executed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Executed</em>' attribute.
     * @see #isExecuted()
     * @generated
     */
    void setExecuted(boolean value);

    /**
     * Returns the value of the '<em><b>Sub Commands</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.gameplay.Command}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Commands</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A command can contains many sub commands.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sub Commands</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand_SubCommands()
     * @model containment="true"
     * @generated
     */
    EList<Command> getSubCommands();

    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The game date the command is executed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(Date)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand_Date()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getDate();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(Date value);

    /**
     * Returns the value of the '<em><b>Cmd Callback</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cmd Callback</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A callback interface for configuring the command.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cmd Callback</em>' attribute.
     * @see #isSetCmdCallback()
     * @see #unsetCmdCallback()
     * @see #setCmdCallback(CommandCallback)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand_CmdCallback()
     * @model default="" unsettable="true" dataType="de.urszeidler.eclipse.shr5.gameplay.CommandCallback" transient="true" derived="true"
     * @generated
     */
    CommandCallback getCmdCallback();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback <em>Cmd Callback</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cmd Callback</em>' attribute.
     * @see #isSetCmdCallback()
     * @see #unsetCmdCallback()
     * @see #getCmdCallback()
     * @generated
     */
    void setCmdCallback(CommandCallback value);

    /**
     * Unsets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback <em>Cmd Callback</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCmdCallback()
     * @see #getCmdCallback()
     * @see #setCmdCallback(CommandCallback)
     * @generated
     */
    void unsetCmdCallback();

    /**
     * Returns whether the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback <em>Cmd Callback</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cmd Callback</em>' attribute is set.
     * @see #unsetCmdCallback()
     * @see #getCmdCallback()
     * @see #setCmdCallback(CommandCallback)
     * @generated
     */
    boolean isSetCmdCallback();

    /**
     * Returns the value of the '<em><b>Executing</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Executing</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This flag is true as long the command is executed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Executing</em>' attribute.
     * @see #setExecuting(boolean)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand_Executing()
     * @model default="false" required="true"
     * @generated
     */
    boolean isExecuting();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isExecuting <em>Executing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Executing</em>' attribute.
     * @see #isExecuting()
     * @generated
     */
    void setExecuting(boolean value);

    /**
     * Returns the value of the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Can Execute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A flag indication if the command is propper configured.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Can Execute</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand_CanExecute()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    boolean isCanExecute();

    /**
     * Returns the value of the '<em><b>Hidden</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Should the command not be notified and written in the history.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hidden</em>' attribute.
     * @see #setHidden(boolean)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand_Hidden()
     * @model
     * @generated
     */
    boolean isHidden();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isHidden <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hidden</em>' attribute.
     * @see #isHidden()
     * @generated
     */
    void setHidden(boolean value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The action method.
     * Executes  it self and the sub commands.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    void redo();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void undo();

} // Command
