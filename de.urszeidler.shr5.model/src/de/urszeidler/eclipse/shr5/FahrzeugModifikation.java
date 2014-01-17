/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fahrzeug Modifikation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.FahrzeugModifikation#getFunktion <em>Funktion</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeugModifikation()
 * @model
 * @generated
 */
public interface FahrzeugModifikation extends Beschreibbar, Quelle, GeldWert {
	/**
	 * Returns the value of the '<em><b>Funktion</b></em>' containment reference list.
	 * The list contents are of type {@link de.urszeidler.eclipse.shr5.AbstraktGegenstand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funktion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funktion</em>' containment reference list.
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeugModifikation_Funktion()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstraktGegenstand> getFunktion();

} // FahrzeugModifikation
