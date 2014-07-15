/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.gameplay.util.ComandCallback;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#isExecuted <em>Executed</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#getSubCommands <em>Sub Commands</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback <em>Cmd Callback</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Command extends EObject {
    /**
     * Returns the value of the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Executed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Executed</em>' attribute.
     * @see #setExecuted(boolean)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand_Executed()
     * @model
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
     * @return the value of the '<em>Cmd Callback</em>' attribute.
     * @see #isSetCmdCallback()
     * @see #unsetCmdCallback()
     * @see #setCmdCallback(ComandCallback)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCommand_CmdCallback()
     * @model default="" unsettable="true" dataType="de.urszeidler.eclipse.shr5.gameplay.ComandCallback" transient="true" derived="true"
     * @generated
     */
    ComandCallback getCmdCallback();

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
    void setCmdCallback(ComandCallback value);

    /**
     * Unsets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback <em>Cmd Callback</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCmdCallback()
     * @see #getCmdCallback()
     * @see #setCmdCallback(ComandCallback)
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
     * @see #setCmdCallback(ComandCallback)
     * @generated
     */
    boolean isSetCmdCallback();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
