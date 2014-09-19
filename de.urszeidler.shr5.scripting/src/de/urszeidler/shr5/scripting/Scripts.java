/**
 */
package de.urszeidler.shr5.scripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for the scripts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.Scripts#getStories <em>Stories</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Scripts#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScripts()
 * @model
 * @generated
 */
public interface Scripts extends EObject {
    /**
     * Returns the value of the '<em><b>Stories</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.shr5.scripting.Script}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stories</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stories</em>' containment reference list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScripts_Stories()
     * @model containment="true"
     * @generated
     */
    EList<Script> getStories();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScripts_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Scripts#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Scripts
