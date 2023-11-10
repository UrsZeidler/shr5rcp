/**
 */
package de.urszeidler.shr5.scripting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.Section#getTitel <em>Titel</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Section#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
    /**
     * Returns the value of the '<em><b>Titel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Titel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Titel</em>' attribute.
     * @see #setTitel(String)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getSection_Titel()
     * @model
     * @generated
     */
    String getTitel();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Section#getTitel <em>Titel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Titel</em>' attribute.
     * @see #getTitel()
     * @generated
     */
    void setTitel(String value);

    /**
     * Returns the value of the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' attribute.
     * @see #setText(String)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getSection_Text()
     * @model
     * @generated
     */
    String getText();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Section#getText <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' attribute.
     * @see #getText()
     * @generated
     */
    void setText(String value);

} // Section
