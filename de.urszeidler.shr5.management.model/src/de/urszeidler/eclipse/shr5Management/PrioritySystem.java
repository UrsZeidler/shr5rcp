/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Priority System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The priority system collects a set of generation options.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PrioritySystem#getPriorities <em>Priorities</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PrioritySystem#getKarmaPoints <em>Karma Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPrioritySystem()
 * @model abstract="true"
 * @generated
 */
public interface PrioritySystem extends CharacterGeneratorSystem {
	/**
     * Returns the value of the '<em><b>Priorities</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.PriorityCategorie}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Priorities</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPrioritySystem_Priorities()
     * @model containment="true"
     * @generated
     */
	EList<PriorityCategorie> getPriorities();

	/**
     * Returns the value of the '<em><b>Karma Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karma Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Karma Points</em>' attribute.
     * @see #setKarmaPoints(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPrioritySystem_KarmaPoints()
     * @model
     * @generated
     */
	int getKarmaPoints();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PrioritySystem#getKarmaPoints <em>Karma Points</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Karma Points</em>' attribute.
     * @see #getKarmaPoints()
     * @generated
     */
	void setKarmaPoints(int value);

} // PrioritySystem
