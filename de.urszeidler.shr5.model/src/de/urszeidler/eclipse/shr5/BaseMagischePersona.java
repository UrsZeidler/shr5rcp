/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Magische Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie <em>Magie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getInitationen <em>Initationen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagieBasis <em>Magie Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getBoundFoki <em>Bound Foki</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getBaseMagischePersona()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BaseMagischePersona extends EObject {
	/**
     * Returns the value of the '<em><b>Magie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Magie</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBaseMagischePersona_Magie()
     * @model required="true" transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getMagie();

	/**
     * Returns the value of the '<em><b>Initationen</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Initation}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initationen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Initationen</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBaseMagischePersona_Initationen()
     * @model containment="true"
     * @generated
     */
	EList<Initation> getInitationen();

	/**
     * Returns the value of the '<em><b>Magie Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magie Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Magie Basis</em>' attribute.
     * @see #setMagieBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBaseMagischePersona_MagieBasis()
     * @model required="true"
     * @generated
     */
	int getMagieBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagieBasis <em>Magie Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Magie Basis</em>' attribute.
     * @see #getMagieBasis()
     * @generated
     */
	void setMagieBasis(int value);

    /**
     * Returns the value of the '<em><b>Bound Foki</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.FokusBinding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bound Foki</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bound Foki</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBaseMagischePersona_BoundFoki()
     * @model containment="true"
     * @generated
     */
    EList<FokusBinding> getBoundFoki();

} // BaseMagischePersona
