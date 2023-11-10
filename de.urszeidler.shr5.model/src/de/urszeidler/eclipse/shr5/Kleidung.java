/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kleidung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the clothes and armor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Kleidung#getRuestung <em>Ruestung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Kleidung#getKmods <em>Kmods</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKleidung()
 * @model
 * @generated
 */
public interface Kleidung extends AbstraktGegenstand, Capacity {
	/**
     * Returns the value of the '<em><b>Ruestung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruestung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ruestung</em>' attribute.
     * @see #setRuestung(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKleidung_Ruestung()
     * @model
     * @generated
     */
	int getRuestung();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Kleidung#getRuestung <em>Ruestung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ruestung</em>' attribute.
     * @see #getRuestung()
     * @generated
     */
	void setRuestung(int value);

    /**
     * Returns the value of the '<em><b>Kmods</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.KleindungsModifikator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kmods</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kmods</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKleidung_Kmods()
     * @model containment="true"
     * @generated
     */
    EList<KleindungsModifikator> getKmods();

} // Kleidung
