/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getStart <em>Start</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getEnd <em>End</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained <em>Days Trained</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingRange()
 * @model
 * @generated
 */
public interface TrainingRange extends EObject {
    /**
     * Returns the value of the '<em><b>Start</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start</em>' attribute.
     * @see #setStart(Date)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingRange_Start()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getStart();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getStart <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start</em>' attribute.
     * @see #getStart()
     * @generated
     */
    void setStart(Date value);

    /**
     * Returns the value of the '<em><b>End</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End</em>' attribute.
     * @see #setEnd(Date)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingRange_End()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getEnd();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getEnd <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End</em>' attribute.
     * @see #getEnd()
     * @generated
     */
    void setEnd(Date value);

    /**
     * Returns the value of the '<em><b>Days Trained</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Days Trained</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Days Trained</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingRange_DaysTrained()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getDaysTrained();

} // TrainingRange
