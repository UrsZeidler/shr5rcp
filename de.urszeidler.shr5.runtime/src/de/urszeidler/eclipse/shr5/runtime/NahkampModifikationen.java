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
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isChracterIsDown <em>Chracter Is Down</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#getEnemyCloseCombat <em>Enemy Close Combat</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isCharacterRunning <em>Character Running</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isCharacterProne <em>Character Prone</em>}</li>
 * </ul>
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

    /**
     * Returns the value of the '<em><b>Character Running</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character Running</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character Running</em>' attribute.
     * @see #setCharacterRunning(boolean)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getNahkampModifikationen_CharacterRunning()
     * @model
     * @generated
     */
    boolean isCharacterRunning();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isCharacterRunning <em>Character Running</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Running</em>' attribute.
     * @see #isCharacterRunning()
     * @generated
     */
    void setCharacterRunning(boolean value);

    /**
     * Returns the value of the '<em><b>Character Prone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character Prone</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character Prone</em>' attribute.
     * @see #setCharacterProne(boolean)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getNahkampModifikationen_CharacterProne()
     * @model
     * @generated
     */
    boolean isCharacterProne();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isCharacterProne <em>Character Prone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Prone</em>' attribute.
     * @see #isCharacterProne()
     * @generated
     */
    void setCharacterProne(boolean value);

} // NahkampModifikationen
