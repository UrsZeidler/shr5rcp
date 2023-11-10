/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technomancer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Technomancer#getComplexForms <em>Complex Forms</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Technomancer#getEchos <em>Echos</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getTechnomancer()
 * @model
 * @generated
 */
public interface Technomancer extends KoerperPersona, ResonanzPersona {
	/**
     * Returns the value of the '<em><b>Complex Forms</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.PersonaKomplexForm}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Forms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Complex Forms</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getTechnomancer_ComplexForms()
     * @model containment="true"
     * @generated
     */
	EList<PersonaKomplexForm> getComplexForms();

	/**
     * Returns the value of the '<em><b>Echos</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Echo}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Echos</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getTechnomancer_Echos()
     * @model containment="true"
     * @generated
     */
	EList<Echo> getEchos();

} // Technomancer
