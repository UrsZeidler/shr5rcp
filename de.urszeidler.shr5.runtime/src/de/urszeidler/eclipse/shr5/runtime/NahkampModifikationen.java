/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nahkamp Modifikationen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains the close combat modification types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isChracterIsDown <em>Chracter Is Down</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#getEnemyCloseCombat <em>Enemy Close Combat</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getNahkampModifikationen()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NahkampModifikationen extends EObject {
    /**
     * Returns the value of the '<em><b>Chracter Is Down</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Chracter Is Down</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Chracter Is Down</em>' attribute.
     * @see #setChracterIsDown(boolean)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getNahkampModifikationen_ChracterIsDown()
     * @model
     * @generated
     */
    boolean isChracterIsDown();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isChracterIsDown <em>Chracter Is Down</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chracter Is Down</em>' attribute.
     * @see #isChracterIsDown()
     * @generated
     */
    void setChracterIsDown(boolean value);

    /**
     * Returns the value of the '<em><b>Enemy Close Combat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enemy Close Combat</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enemy Close Combat</em>' attribute.
     * @see #setEnemyCloseCombat(int)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getNahkampModifikationen_EnemyCloseCombat()
     * @model
     * @generated
     */
    int getEnemyCloseCombat();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#getEnemyCloseCombat <em>Enemy Close Combat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enemy Close Combat</em>' attribute.
     * @see #getEnemyCloseCombat()
     * @generated
     */
    void setEnemyCloseCombat(int value);

} // NahkampModifikationen
