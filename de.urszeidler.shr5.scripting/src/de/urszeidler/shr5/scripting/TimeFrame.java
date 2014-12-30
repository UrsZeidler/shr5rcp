/**
 */
package de.urszeidler.shr5.scripting;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The timeframe interface defines and time range and a current time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.TimeFrame#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.TimeFrame#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.TimeFrame#getActualDate <em>Actual Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getTimeFrame()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TimeFrame extends EObject {
    /**
     * Returns the value of the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Date</em>' attribute.
     * @see #setStartDate(Date)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getTimeFrame_StartDate()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getStartDate();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.TimeFrame#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Date</em>' attribute.
     * @see #getStartDate()
     * @generated
     */
    void setStartDate(Date value);

    /**
     * Returns the value of the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Date</em>' attribute.
     * @see #setEndDate(Date)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getTimeFrame_EndDate()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getEndDate();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.TimeFrame#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Date</em>' attribute.
     * @see #getEndDate()
     * @generated
     */
    void setEndDate(Date value);

    /**
     * Returns the value of the '<em><b>Actual Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actual Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actual Date</em>' attribute.
     * @see #setActualDate(Date)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getTimeFrame_ActualDate()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getActualDate();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.TimeFrame#getActualDate <em>Actual Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actual Date</em>' attribute.
     * @see #getActualDate()
     * @generated
     */
    void setActualDate(Date value);

} // TimeFrame
