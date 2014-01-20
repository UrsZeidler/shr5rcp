/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proben Modifikatoren</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren#getSchadenswiederstand <em>Schadenswiederstand</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren#getHeilung <em>Heilung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getProbenModifikatoren()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ProbenModifikatoren extends EObject {
	/**
     * Returns the value of the '<em><b>Schadenswiederstand</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schadenswiederstand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Schadenswiederstand</em>' attribute.
     * @see #setSchadenswiederstand(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getProbenModifikatoren_Schadenswiederstand()
     * @model
     * @generated
     */
	int getSchadenswiederstand();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren#getSchadenswiederstand <em>Schadenswiederstand</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schadenswiederstand</em>' attribute.
     * @see #getSchadenswiederstand()
     * @generated
     */
	void setSchadenswiederstand(int value);

	/**
     * Returns the value of the '<em><b>Heilung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heilung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Heilung</em>' attribute.
     * @see #setHeilung(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getProbenModifikatoren_Heilung()
     * @model
     * @generated
     */
	int getHeilung();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren#getHeilung <em>Heilung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heilung</em>' attribute.
     * @see #getHeilung()
     * @generated
     */
	void setHeilung(int value);

} // ProbenModifikatoren
