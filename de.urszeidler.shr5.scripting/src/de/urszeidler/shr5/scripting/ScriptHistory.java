/**
 */
package de.urszeidler.shr5.scripting;

import de.urszeidler.eclipse.shr5.gameplay.ExecutionStack;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains the current state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.ScriptHistory#getCommandStack <em>Command Stack</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.ScriptHistory#getCurrentDate <em>Current Date</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.ScriptHistory#getCurrentPlacement <em>Current Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScriptHistory()
 * @model
 * @generated
 */
public interface ScriptHistory extends EObject {
    /**
     * Returns the value of the '<em><b>Command Stack</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Command Stack</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Command Stack</em>' containment reference.
     * @see #setCommandStack(ExecutionStack)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScriptHistory_CommandStack()
     * @model containment="true"
     * @generated
     */
    ExecutionStack getCommandStack();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.ScriptHistory#getCommandStack <em>Command Stack</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Command Stack</em>' containment reference.
     * @see #getCommandStack()
     * @generated
     */
    void setCommandStack(ExecutionStack value);

    /**
     * Returns the value of the '<em><b>Current Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Date</em>' attribute.
     * @see #setCurrentDate(Date)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScriptHistory_CurrentDate()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getCurrentDate();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.ScriptHistory#getCurrentDate <em>Current Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Date</em>' attribute.
     * @see #getCurrentDate()
     * @generated
     */
    void setCurrentDate(Date value);

    /**
     * Returns the value of the '<em><b>Current Placement</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Placement</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Placement</em>' reference.
     * @see #setCurrentPlacement(Placement)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScriptHistory_CurrentPlacement()
     * @model
     * @generated
     */
    Placement getCurrentPlacement();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.ScriptHistory#getCurrentPlacement <em>Current Placement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Placement</em>' reference.
     * @see #getCurrentPlacement()
     * @generated
     */
    void setCurrentPlacement(Placement value);

} // ScriptHistory
