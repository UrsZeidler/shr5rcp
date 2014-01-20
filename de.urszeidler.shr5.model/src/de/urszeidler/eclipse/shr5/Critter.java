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
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Critter#getKraefte <em>Kraefte</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritter()
 * @model
 * @generated
 */
public interface Critter extends Spezies {
    /**
     * Returns the value of the '<em><b>Kraefte</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.CritterKraft}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kraefte</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kraefte</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritter_Kraefte()
     * @model containment="true"
     * @generated
     */
    EList<CritterKraft> getKraefte();

} // Critter
