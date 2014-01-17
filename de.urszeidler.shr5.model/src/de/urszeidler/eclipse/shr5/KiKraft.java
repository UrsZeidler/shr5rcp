/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ki Kraft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.KiKraft#getKraftpunkte <em>Kraftpunkte</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKiKraft()
 * @model
 * @generated
 */
public interface KiKraft extends MagischeMods {

	/**
	 * Returns the value of the '<em><b>Kraftpunkte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kraftpunkte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kraftpunkte</em>' attribute.
	 * @see #setKraftpunkte(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKiKraft_Kraftpunkte()
	 * @model
	 * @generated
	 */
	int getKraftpunkte();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.KiKraft#getKraftpunkte <em>Kraftpunkte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kraftpunkte</em>' attribute.
	 * @see #getKraftpunkte()
	 * @generated
	 */
	void setKraftpunkte(int value);
} // KiKraft
