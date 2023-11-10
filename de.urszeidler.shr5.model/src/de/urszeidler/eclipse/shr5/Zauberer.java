/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zauberer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauberer#getZauber <em>Zauber</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauberer#getEnzug <em>Enzug</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauberer#getGebundeneGeister <em>Gebundene Geister</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauberer#getUngebundenerGeist <em>Ungebundener Geist</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauberer#getTradition <em>Tradition</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauberer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Zauberer extends EObject {
	/**
     * Returns the value of the '<em><b>Zauber</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.PersonaZauber}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zauber</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Zauber</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauberer_Zauber()
     * @model containment="true"
     * @generated
     */
	EList<PersonaZauber> getZauber();

	/**
     * Returns the value of the '<em><b>Enzug</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enzug</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Enzug</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauberer_Enzug()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getEnzug();

	/**
     * Returns the value of the '<em><b>Tradition</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tradition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Tradition</em>' reference.
     * @see #setTradition(MagischeTradition)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauberer_Tradition()
     * @model required="true"
     * @generated
     */
	MagischeTradition getTradition();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Zauberer#getTradition <em>Tradition</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tradition</em>' reference.
     * @see #getTradition()
     * @generated
     */
	void setTradition(MagischeTradition value);

    /**
     * Returns the value of the '<em><b>Gebundene Geister</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.GebundenerGeist}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The bound spirits are hold here.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gebundene Geister</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauberer_GebundeneGeister()
     * @model containment="true"
     * @generated
     */
    EList<GebundenerGeist> getGebundeneGeister();

    /**
     * Returns the value of the '<em><b>Ungebundener Geist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ungebundener Geist</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A spirit can be bound.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ungebundener Geist</em>' containment reference.
     * @see #setUngebundenerGeist(GebundenerGeist)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauberer_UngebundenerGeist()
     * @model containment="true"
     * @generated
     */
    GebundenerGeist getUngebundenerGeist();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Zauberer#getUngebundenerGeist <em>Ungebundener Geist</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ungebundener Geist</em>' containment reference.
     * @see #getUngebundenerGeist()
     * @generated
     */
    void setUngebundenerGeist(GebundenerGeist value);

} // Zauberer
