/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shr List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ShrList#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getShrList()
 * @model
 * @generated
 */
public interface ShrList extends Beschreibbar, Identifiable {
	/**
     * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Entries</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getShrList_Entries()
     * @model containment="true"
     * @generated
     */
	EList<EObject> getEntries();

} // ShrList
