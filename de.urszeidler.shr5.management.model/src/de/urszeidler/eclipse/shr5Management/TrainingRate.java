/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.TimeUnits;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingRate#getFactor <em>Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingRate#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingRate()
 * @model
 * @generated
 */
public interface TrainingRate extends RangeTableEntry {
    /**
     * Returns the value of the '<em><b>Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Factor</em>' attribute.
     * @see #setFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingRate_Factor()
     * @model
     * @generated
     */
    int getFactor();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.TrainingRate#getFactor <em>Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Factor</em>' attribute.
     * @see #getFactor()
     * @generated
     */
    void setFactor(int value);

    /**
     * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.TimeUnits}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Unit</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.TimeUnits
     * @see #setTimeUnit(TimeUnits)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTrainingRate_TimeUnit()
     * @model
     * @generated
     */
    TimeUnits getTimeUnit();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.TrainingRate#getTimeUnit <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Unit</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.TimeUnits
     * @see #getTimeUnit()
     * @generated
     */
    void setTimeUnit(TimeUnits value);

} // TrainingRate
