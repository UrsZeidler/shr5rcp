/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fertigkeits Gruppe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.FertigkeitsGruppe#getFertigkeiten <em>Fertigkeiten</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFertigkeitsGruppe()
 * @model
 * @generated
 */
public interface FertigkeitsGruppe extends Beschreibbar, Quelle {
	/**
	 * Returns the value of the '<em><b>Fertigkeiten</b></em>' containment reference list.
	 * The list contents are of type {@link de.urszeidler.eclipse.shr5.Fertigkeit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fertigkeiten</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fertigkeiten</em>' containment reference list.
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFertigkeitsGruppe_Fertigkeiten()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fertigkeit> getFertigkeiten();

} // FertigkeitsGruppe
