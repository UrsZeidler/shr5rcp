/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passagier Fahrzeug</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PassagierFahrzeug#getSitze <em>Sitze</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPassagierFahrzeug()
 * @model
 * @generated
 */
public interface PassagierFahrzeug extends Fahrzeug {
	/**
     * Returns the value of the '<em><b>Sitze</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sitze</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sitze</em>' attribute.
     * @see #setSitze(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPassagierFahrzeug_Sitze()
     * @model
     * @generated
     */
	int getSitze();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PassagierFahrzeug#getSitze <em>Sitze</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sitze</em>' attribute.
     * @see #getSitze()
     * @generated
     */
	void setSitze(int value);

} // PassagierFahrzeug
