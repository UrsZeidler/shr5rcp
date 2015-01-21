/**
 */
package de.urszeidler.shr5.scripting;

import de.urszeidler.eclipse.shr5.Beschreibbar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.Handout#getType <em>Type</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Handout#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getHandout()
 * @model
 * @generated
 */
public interface Handout extends Beschreibbar {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.shr5.scripting.HandoutType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.shr5.scripting.HandoutType
     * @see #setType(HandoutType)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getHandout_Type()
     * @model
     * @generated
     */
    HandoutType getType();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Handout#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.shr5.scripting.HandoutType
     * @see #getType()
     * @generated
     */
    void setType(HandoutType value);

    /**
     * Returns the value of the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Url</em>' attribute.
     * @see #setUrl(String)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getHandout_Url()
     * @model
     * @generated
     */
    String getUrl();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Handout#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(String value);

} // Handout
