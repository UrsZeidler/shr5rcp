/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resonanz Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanz <em>Resonanz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getGeraetestufe <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getAngriff <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getSchleicher <em>Schleicher</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getFirewall <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanzBasis <em>Resonanz Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResonanzPersona extends EObject {
	/**
     * Returns the value of the '<em><b>Resonanz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resonanz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resonanz</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona_Resonanz()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getResonanz();

	/**
     * Returns the value of the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geraetestufe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Geraetestufe</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona_Geraetestufe()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getGeraetestufe();

	/**
     * Returns the value of the '<em><b>Angriff</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angriff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Angriff</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona_Angriff()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getAngriff();

	/**
     * Returns the value of the '<em><b>Schleicher</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schleicher</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Schleicher</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona_Schleicher()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getSchleicher();

	/**
     * Returns the value of the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenverarbeitung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Datenverarbeitung</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona_Datenverarbeitung()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getDatenverarbeitung();

	/**
     * Returns the value of the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firewall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Firewall</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona_Firewall()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getFirewall();

	/**
     * Returns the value of the '<em><b>Resonanz Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resonanz Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resonanz Basis</em>' attribute.
     * @see #setResonanzBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona_ResonanzBasis()
     * @model
     * @generated
     */
	int getResonanzBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanzBasis <em>Resonanz Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resonanz Basis</em>' attribute.
     * @see #getResonanzBasis()
     * @generated
     */
	void setResonanzBasis(int value);

} // ResonanzPersona
