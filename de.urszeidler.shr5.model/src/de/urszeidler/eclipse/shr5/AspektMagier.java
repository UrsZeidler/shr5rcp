/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspekt Magier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AspektMagier#getAspekt <em>Aspekt</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAspektMagier()
 * @model
 * @generated
 */
public interface AspektMagier extends MagischePersona, Zauberer {
	/**
	 * Returns the value of the '<em><b>Aspekt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspekt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspekt</em>' reference.
	 * @see #setAspekt(FertigkeitsGruppe)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAspektMagier_Aspekt()
	 * @model required="true"
	 * @generated
	 */
	FertigkeitsGruppe getAspekt();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AspektMagier#getAspekt <em>Aspekt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspekt</em>' reference.
	 * @see #getAspekt()
	 * @generated
	 */
	void setAspekt(FertigkeitsGruppe value);

} // AspektMagier
