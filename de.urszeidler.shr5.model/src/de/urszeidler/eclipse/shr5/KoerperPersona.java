/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Koerper Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperPersona#getKoerperMods <em>Koerper Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperPersona#getEigenschaften <em>Eigenschaften</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKoerperPersona()
 * @model abstract="true"
 * @generated
 */
public interface KoerperPersona extends AbstraktPersona, Panzerung {
	/**
	 * Returns the value of the '<em><b>Koerper Mods</b></em>' containment reference list.
	 * The list contents are of type {@link de.urszeidler.eclipse.shr5.Koerpermods}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Koerper Mods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Koerper Mods</em>' containment reference list.
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKoerperPersona_KoerperMods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Koerpermods> getKoerperMods();

	/**
	 * Returns the value of the '<em><b>Eigenschaften</b></em>' containment reference list.
	 * The list contents are of type {@link de.urszeidler.eclipse.shr5.PersonaEigenschaft}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eigenschaften</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eigenschaften</em>' containment reference list.
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKoerperPersona_Eigenschaften()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonaEigenschaft> getEigenschaften();

} // KoerperPersona
