/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertrag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Vertrag#getFaelligkeitsIntervall <em>Faelligkeits Intervall</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getVertrag()
 * @model
 * @generated
 */
public interface Vertrag extends Beschreibbar, Quelle, GeldWert {
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getVertrag_FaelligkeitsIntervall()
     * @model
     * @generated
     */
	int getFaelligkeitsIntervall();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Vertrag#getFaelligkeitsIntervall <em>Faelligkeits Intervall</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Faelligkeits Intervall</em>' attribute.
     * @see #getFaelligkeitsIntervall()
     * @generated
     */
	void setFaelligkeitsIntervall(int value);

} // Vertrag
