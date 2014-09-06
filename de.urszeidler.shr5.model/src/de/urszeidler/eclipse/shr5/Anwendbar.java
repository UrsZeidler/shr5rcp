/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anwendbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Link the item with the skill when using.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Anwendbar#getFertigkeit <em>Fertigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Anwendbar#getSpezialisierung <em>Spezialisierung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAnwendbar()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Anwendbar extends EObject {
	/**
     * Returns the value of the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fertigkeit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the skill.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fertigkeit</em>' reference.
     * @see #setFertigkeit(Fertigkeit)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAnwendbar_Fertigkeit()
     * @model
     * @generated
     */
	Fertigkeit getFertigkeit();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Anwendbar#getFertigkeit <em>Fertigkeit</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fertigkeit</em>' reference.
     * @see #getFertigkeit()
     * @generated
     */
	void setFertigkeit(Fertigkeit value);

    /**
     * Returns the value of the '<em><b>Spezialisierung</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines a specalism of the skill, for examples for weapons.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Spezialisierung</em>' reference.
     * @see #setSpezialisierung(Spezialisierung)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAnwendbar_Spezialisierung()
     * @model
     * @generated
     */
    Spezialisierung getSpezialisierung();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Anwendbar#getSpezialisierung <em>Spezialisierung</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spezialisierung</em>' reference.
     * @see #getSpezialisierung()
     * @generated
     */
    void setSpezialisierung(Spezialisierung value);

} // Anwendbar
