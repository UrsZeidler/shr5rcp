/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamemaster Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The gemmaster manager contains more stuff only interessting for gamemaster. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.GamemasterManagement#getGrunts <em>Grunts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGamemasterManagement()
 * @model
 * @generated
 */
public interface GamemasterManagement extends PlayerManagement {
    /**
     * Returns the value of the '<em><b>Grunts</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.GruntGroup}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grunts</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grunts</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGamemasterManagement_Grunts()
     * @model containment="true"
     * @generated
     */
    EList<GruntGroup> getGrunts();

} // GamemasterManagement
