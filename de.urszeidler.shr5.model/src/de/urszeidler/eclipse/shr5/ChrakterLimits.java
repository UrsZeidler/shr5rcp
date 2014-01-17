/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chrakter Limits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getKoerperlich <em>Koerperlich</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig <em>Geistig</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial <em>Sozial</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getChrakterLimits()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ChrakterLimits extends EObject {
	/**
	 * Returns the value of the '<em><b>Koerperlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Koerperlich</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Koerperlich</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getChrakterLimits_Koerperlich()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	int getKoerperlich();

	/**
	 * Returns the value of the '<em><b>Geistig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geistig</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geistig</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getChrakterLimits_Geistig()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	int getGeistig();

	/**
	 * Returns the value of the '<em><b>Sozial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sozial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sozial</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getChrakterLimits_Sozial()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	int getSozial();

} // ChrakterLimits
