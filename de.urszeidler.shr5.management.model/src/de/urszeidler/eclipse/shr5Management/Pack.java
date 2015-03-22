/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Quelle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pack is used in the generation process, to speed up somes choises. It contains a set of things.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Pack#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPack()
 * @model
 * @generated
 */
public interface Pack extends Beschreibbar, Quelle, GeldWert {
    /**
     * Returns the value of the '<em><b>Items</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Quelle}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The list of items this pack contains.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Items</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPack_Items()
     * @model containment="true"
     * @generated
     */
    EList<Quelle> getItems();

} // Pack
