/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fernkampfwaffe Modifikator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator#getEp <em>Ep</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFernkampfwaffeModifikator()
 * @model
 * @generated
 */
public interface FernkampfwaffeModifikator extends AbstraktModifikatoren, GeldWert {
	/**
     * Returns the value of the '<em><b>Ep</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ep</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung
     * @see #setEp(FeuwerwaffenErweiterung)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFernkampfwaffeModifikator_Ep()
     * @model
     * @generated
     */
	FeuwerwaffenErweiterung getEp();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator#getEp <em>Ep</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ep</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung
     * @see #getEp()
     * @generated
     */
	void setEp(FeuwerwaffenErweiterung value);

} // FernkampfwaffeModifikator
