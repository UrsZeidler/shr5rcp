/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intervall Vertrag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Intervall conctract. The cost have to be paid in the given period. Defined by the intervall and the unit and a start date.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.IntervallVertrag#getFaelligkeitsIntervall <em>Faelligkeits Intervall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.IntervallVertrag#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.IntervallVertrag#getBegin <em>Begin</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getIntervallVertrag()
 * @model
 * @generated
 */
public interface IntervallVertrag extends Vertrag {
    /**
     * Returns the value of the '<em><b>Faelligkeits Intervall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faelligkeits Intervall</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Faelligkeits Intervall</em>' attribute.
     * @see #setFaelligkeitsIntervall(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getIntervallVertrag_FaelligkeitsIntervall()
     * @model
     * @generated
     */
    int getFaelligkeitsIntervall();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.IntervallVertrag#getFaelligkeitsIntervall <em>Faelligkeits Intervall</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Faelligkeits Intervall</em>' attribute.
     * @see #getFaelligkeitsIntervall()
     * @generated
     */
    void setFaelligkeitsIntervall(int value);

    /**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.TimeUnits}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.TimeUnits
     * @see #setUnit(TimeUnits)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getIntervallVertrag_Unit()
     * @model
     * @generated
     */
    TimeUnits getUnit();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.IntervallVertrag#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.TimeUnits
     * @see #getUnit()
     * @generated
     */
    void setUnit(TimeUnits value);

    /**
     * Returns the value of the '<em><b>Begin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The start of the contract.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Begin</em>' attribute.
     * @see #setBegin(Date)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getIntervallVertrag_Begin()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getBegin();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.IntervallVertrag#getBegin <em>Begin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Begin</em>' attribute.
     * @see #getBegin()
     * @generated
     */
    void setBegin(Date value);

} // IntervallVertrag
