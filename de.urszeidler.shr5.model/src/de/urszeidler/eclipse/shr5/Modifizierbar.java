/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifizierbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Modifizierbar#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getModifizierbar()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Modifizierbar extends EObject {
	/**
	 * Returns the value of the '<em><b>Mods</b></em>' containment reference list.
	 * The list contents are of type {@link de.urszeidler.eclipse.shr5.AttributModifikatorWert}.
	 * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getModifiziertes <em>Modifiziertes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mods</em>' containment reference list.
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getModifizierbar_Mods()
	 * @see de.urszeidler.eclipse.shr5.AttributModifikatorWert#getModifiziertes
	 * @model opposite="modifiziertes" containment="true"
	 * @generated
	 */
	EList<AttributModifikatorWert> getMods();

} // Modifizierbar
