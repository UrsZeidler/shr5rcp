/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ki Adept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.KiAdept#getKikraft <em>Kikraft</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKiAdept()
 * @model
 * @generated
 */
public interface KiAdept extends MagischePersona {
	/**
     * Returns the value of the '<em><b>Kikraft</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.KiKraft}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kikraft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Kikraft</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKiAdept_Kikraft()
     * @model containment="true"
     * @generated
     */
	EList<KiKraft> getKikraft();

} // KiAdept
