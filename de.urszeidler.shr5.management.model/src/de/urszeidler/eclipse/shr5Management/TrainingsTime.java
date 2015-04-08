/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trainings Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysTrained <em>Days Trained</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains <em>Days Remains</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#isTrainingComplete <em>Training Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingsTime()
 * @model
 * @generated
 */
public interface TrainingsTime extends CharacterChange {
    /**
     * Returns the value of the '<em><b>Days Trained</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Days Trained</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Days Trained</em>' attribute.
     * @see #setDaysTrained(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingsTime_DaysTrained()
     * @model
     * @generated
     */
    int getDaysTrained();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysTrained <em>Days Trained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Days Trained</em>' attribute.
     * @see #getDaysTrained()
     * @generated
     */
    void setDaysTrained(int value);

    /**
     * Returns the value of the '<em><b>Days Remains</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Days Remains</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Days Remains</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingsTime_DaysRemains()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getDaysRemains();

    /**
     * Returns the value of the '<em><b>Training Complete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Training Complete</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Training Complete</em>' attribute.
     * @see #setTrainingComplete(boolean)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingsTime_TrainingComplete()
     * @model
     * @generated
     */
    boolean isTrainingComplete();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#isTrainingComplete <em>Training Complete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Training Complete</em>' attribute.
     * @see #isTrainingComplete()
     * @generated
     */
    void setTrainingComplete(boolean value);

} // TrainingsTime
