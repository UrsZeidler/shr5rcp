/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyberware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberware#getPersona <em>Persona</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberware#getEinbau <em>Einbau</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberware#getCyberwareCapacity <em>Cyberware Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberware#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberware()
 * @model
 * @generated
 */
public interface Cyberware extends Koerpermods, GeldWert, Capacity {
	/**
     * Returns the value of the '<em><b>Persona</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Persona</em>' reference.
     * @see #setPersona(AbstraktPersona)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberware_Persona()
     * @model
     * @generated
     */
	AbstraktPersona getPersona();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Cyberware#getPersona <em>Persona</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persona</em>' reference.
     * @see #getPersona()
     * @generated
     */
	void setPersona(AbstraktPersona value);

	/**
     * Returns the value of the '<em><b>Einbau</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.AbstraktGegenstand}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Einbau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Einbau</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberware_Einbau()
     * @model containment="true"
     * @generated
     */
	EList<AbstraktGegenstand> getEinbau();

    /**
     * Returns the value of the '<em><b>Cyberware Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cyberware Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cyberware Capacity</em>' attribute.
     * @see #setCyberwareCapacity(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberware_CyberwareCapacity()
     * @model required="true"
     * @generated
     */
    int getCyberwareCapacity();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Cyberware#getCyberwareCapacity <em>Cyberware Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cyberware Capacity</em>' attribute.
     * @see #getCyberwareCapacity()
     * @generated
     */
    void setCyberwareCapacity(int value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.CyberwareType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.CyberwareType
     * @see #setType(CyberwareType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberware_Type()
     * @model
     * @generated
     */
    CyberwareType getType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Cyberware#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.CyberwareType
     * @see #getType()
     * @generated
     */
    void setType(CyberwareType value);

} // Cyberware
