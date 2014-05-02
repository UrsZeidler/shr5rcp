/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spezielle Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitative <em>Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel <em>Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getAusweichen <em>Ausweichen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz <em>Essenz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdgeBasis <em>Edge Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdge <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSpezielleAttribute()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SpezielleAttribute extends ModifikatorAttribute {
	/**
     * Returns the value of the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Initative</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSpezielleAttribute_Initative()
     * @model required="true" transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getInitative();

	/**
     * Returns the value of the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initativ Wuerfel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Initativ Wuerfel</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSpezielleAttribute_InitativWuerfel()
     * @model required="true" transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getInitativWuerfel();

	/**
     * Returns the value of the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ausweichen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ausweichen</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSpezielleAttribute_Ausweichen()
     * @model required="true" transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getAusweichen();

	/**
     * Returns the value of the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Essenz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Essenz</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSpezielleAttribute_Essenz()
     * @model required="true" transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getEssenz();

	/**
     * Returns the value of the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Edge Basis</em>' attribute.
     * @see #setEdgeBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSpezielleAttribute_EdgeBasis()
     * @model
     * @generated
     */
	int getEdgeBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdgeBasis <em>Edge Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Edge Basis</em>' attribute.
     * @see #getEdgeBasis()
     * @generated
     */
	void setEdgeBasis(int value);

	/**
     * Returns the value of the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Edge</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSpezielleAttribute_Edge()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getEdge();

} // SpezielleAttribute
