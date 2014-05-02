/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geistige Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getCharisma <em>Charisma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getWillenskraft <em>Willenskraft</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getIntuition <em>Intuition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getLogik <em>Logik</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeistigeAttribute()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GeistigeAttribute extends ModifikatorAttribute {
	/**
     * Returns the value of the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charisma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Charisma</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeistigeAttribute_Charisma()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getCharisma();

	/**
     * Returns the value of the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Willenskraft</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Willenskraft</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeistigeAttribute_Willenskraft()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getWillenskraft();

	/**
     * Returns the value of the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intuition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intuition</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeistigeAttribute_Intuition()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getIntuition();

	/**
     * Returns the value of the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logik</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Logik</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeistigeAttribute_Logik()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getLogik();

} // GeistigeAttribute
