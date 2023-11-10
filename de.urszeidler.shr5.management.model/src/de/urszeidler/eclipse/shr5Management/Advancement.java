/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advancement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Advancement#getKarmaFactor <em>Karma Factor</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getAdvancement()
 * @model abstract="true"
 * @generated
 */
public interface Advancement extends EObject {
	/**
     * Returns the value of the '<em><b>Karma Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karma Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Karma Factor</em>' attribute.
     * @see #setKarmaFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getAdvancement_KarmaFactor()
     * @model required="true"
     * @generated
     */
	int getKarmaFactor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Advancement#getKarmaFactor <em>Karma Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Karma Factor</em>' attribute.
     * @see #getKarmaFactor()
     * @generated
     */
	void setKarmaFactor(int value);

} // Advancement
