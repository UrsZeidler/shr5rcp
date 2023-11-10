/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Identifiable#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Identifiable#getLocalizations <em>Localizations</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getIdentifiable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Identifiable extends EObject {
    /**
     * Returns the value of the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Id</em>' attribute.
     * @see #setParentId(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getIdentifiable_ParentId()
     * @model
     * @generated
     */
    String getParentId();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Identifiable#getParentId <em>Parent Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Id</em>' attribute.
     * @see #getParentId()
     * @generated
     */
    void setParentId(String value);

    /**
     * Returns the value of the '<em><b>Localizations</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Localization}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Localizations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Localizations</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getIdentifiable_Localizations()
     * @model containment="true"
     * @generated
     */
    EList<Localization> getLocalizations();

} // Identifiable
