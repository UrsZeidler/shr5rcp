/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kleidung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Kleidung#getRuestung <em>Ruestung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKleidung()
 * @model
 * @generated
 */
public interface Kleidung extends AbstraktGegenstand {
	/**
     * Returns the value of the '<em><b>Ruestung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruestung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ruestung</em>' attribute.
     * @see #setRuestung(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKleidung_Ruestung()
     * @model
     * @generated
     */
	int getRuestung();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Kleidung#getRuestung <em>Ruestung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ruestung</em>' attribute.
     * @see #getRuestung()
     * @generated
     */
	void setRuestung(int value);

} // Kleidung
