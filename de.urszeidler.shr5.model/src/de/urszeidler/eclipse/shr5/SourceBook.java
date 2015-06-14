/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.SourceBook#getStartShrTime <em>Start Shr Time</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SourceBook#getEndShrTime <em>End Shr Time</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SourceBook#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSourceBook()
 * @model
 * @generated
 */
public interface SourceBook extends Beschreibbar, Identifiable {
	/**
     * Returns the value of the '<em><b>Start Shr Time</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Shr Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Start Shr Time</em>' attribute.
     * @see #setStartShrTime(Date)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSourceBook_StartShrTime()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
	Date getStartShrTime();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.SourceBook#getStartShrTime <em>Start Shr Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Shr Time</em>' attribute.
     * @see #getStartShrTime()
     * @generated
     */
	void setStartShrTime(Date value);

	/**
     * Returns the value of the '<em><b>End Shr Time</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Shr Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>End Shr Time</em>' attribute.
     * @see #setEndShrTime(Date)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSourceBook_EndShrTime()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
	Date getEndShrTime();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.SourceBook#getEndShrTime <em>End Shr Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Shr Time</em>' attribute.
     * @see #getEndShrTime()
     * @generated
     */
	void setEndShrTime(Date value);

    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Code</em>' attribute.
     * @see #setCode(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSourceBook_Code()
     * @model
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.SourceBook#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Code</em>' attribute.
     * @see #getCode()
     * @generated
     */
    void setCode(String value);

} // SourceBook
