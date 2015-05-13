/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a simple link to a source book page.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.SourceLink#getSubLinks <em>Sub Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSourceLink()
 * @model
 * @generated
 */
public interface SourceLink extends Beschreibbar, Quelle {
    /**
     * Returns the value of the '<em><b>Sub Links</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.SourceLink}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Links</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Links</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSourceLink_SubLinks()
     * @model containment="true"
     * @generated
     */
    EList<SourceLink> getSubLinks();

} // SourceLink
