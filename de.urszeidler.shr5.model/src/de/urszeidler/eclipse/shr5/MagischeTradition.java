/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Magische Tradition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MagischeTradition#getEnzug <em>Enzug</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MagischeTradition#getBeschwoerbar <em>Beschwoerbar</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagischeTradition()
 * @model
 * @generated
 */
public interface MagischeTradition extends Beschreibbar, Quelle {
    /**
     * Returns the value of the '<em><b>Enzug</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.Enzug}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enzug</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enzug</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Enzug
     * @see #setEnzug(Enzug)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagischeTradition_Enzug()
     * @model
     * @generated
     */
    Enzug getEnzug();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.MagischeTradition#getEnzug <em>Enzug</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enzug</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Enzug
     * @see #getEnzug()
     * @generated
     */
    void setEnzug(Enzug value);

    /**
     * Returns the value of the '<em><b>Beschwoerbar</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Geist}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Beschwoerbar</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Beschwoerbar</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagischeTradition_Beschwoerbar()
     * @model
     * @generated
     */
    EList<Geist> getBeschwoerbar();

} // MagischeTradition
