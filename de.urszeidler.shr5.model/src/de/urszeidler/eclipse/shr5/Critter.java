/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Critter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Critter#getPowers <em>Powers</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritter()
 * @model
 * @generated
 */
public interface Critter extends Spezies {
    /**
     * Returns the value of the '<em><b>Powers</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.CritterKraft}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Powers</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Powers</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritter_Powers()
     * @model containment="true"
     * @generated
     */
    EList<CritterKraft> getPowers();

} // Critter
