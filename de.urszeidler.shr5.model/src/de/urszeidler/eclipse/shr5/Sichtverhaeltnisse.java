/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sichtverhaeltnisse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getRestlichtverstaerkung <em>Restlichtverstaerkung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getInfrarot <em>Infrarot</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getUltrasound <em>Ultrasound</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSichtverhaeltnisse()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Sichtverhaeltnisse extends EObject {
	/**
     * Returns the value of the '<em><b>Restlichtverstaerkung</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.ModifikatorType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restlichtverstaerkung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Restlichtverstaerkung</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ModifikatorType
     * @see #setRestlichtverstaerkung(ModifikatorType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSichtverhaeltnisse_Restlichtverstaerkung()
     * @model
     * @generated
     */
	ModifikatorType getRestlichtverstaerkung();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getRestlichtverstaerkung <em>Restlichtverstaerkung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Restlichtverstaerkung</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ModifikatorType
     * @see #getRestlichtverstaerkung()
     * @generated
     */
	void setRestlichtverstaerkung(ModifikatorType value);

	/**
     * Returns the value of the '<em><b>Infrarot</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.ModifikatorType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrarot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Infrarot</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ModifikatorType
     * @see #setInfrarot(ModifikatorType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSichtverhaeltnisse_Infrarot()
     * @model
     * @generated
     */
	ModifikatorType getInfrarot();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getInfrarot <em>Infrarot</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Infrarot</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ModifikatorType
     * @see #getInfrarot()
     * @generated
     */
	void setInfrarot(ModifikatorType value);

	/**
     * Returns the value of the '<em><b>Ultrasound</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.ModifikatorType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultrasound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ultrasound</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ModifikatorType
     * @see #setUltrasound(ModifikatorType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSichtverhaeltnisse_Ultrasound()
     * @model
     * @generated
     */
	ModifikatorType getUltrasound();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getUltrasound <em>Ultrasound</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ultrasound</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ModifikatorType
     * @see #getUltrasound()
     * @generated
     */
	void setUltrasound(ModifikatorType value);

} // Sichtverhaeltnisse
