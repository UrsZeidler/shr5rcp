/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Koerper Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * We will remove this and store the properties in the abstractPersona.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperPersona#getKoerperMods <em>Koerper Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperPersona#getEigenschaften <em>Eigenschaften</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperPersona#getZustandKoerperlich <em>Zustand Koerperlich</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperPersona#getZustandGeistig <em>Zustand Geistig</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKoerperPersona()
 * @model abstract="true"
 * @generated
 */
public interface KoerperPersona extends AbstraktPersona, Panzerung, PersonaZustand, BerechneteAttribute {
	/**
     * Returns the value of the '<em><b>Koerper Mods</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Koerpermods}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Koerper Mods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Koerper Mods</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKoerperPersona_KoerperMods()
     * @model containment="true"
     * @generated
     */
	EList<Koerpermods> getKoerperMods();

	/**
     * Returns the value of the '<em><b>Eigenschaften</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.PersonaEigenschaft}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eigenschaften</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Eigenschaften</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKoerperPersona_Eigenschaften()
     * @model containment="true"
     * @generated
     */
	EList<PersonaEigenschaft> getEigenschaften();

    /**
     * Returns the value of the '<em><b>Zustand Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zustand Koerperlich</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zustand Koerperlich</em>' attribute.
     * @see #setZustandKoerperlich(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKoerperPersona_ZustandKoerperlich()
     * @model
     * @generated
     */
    int getZustandKoerperlich();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.KoerperPersona#getZustandKoerperlich <em>Zustand Koerperlich</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zustand Koerperlich</em>' attribute.
     * @see #getZustandKoerperlich()
     * @generated
     */
    void setZustandKoerperlich(int value);

    /**
     * Returns the value of the '<em><b>Zustand Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zustand Geistig</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zustand Geistig</em>' attribute.
     * @see #setZustandGeistig(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKoerperPersona_ZustandGeistig()
     * @model
     * @generated
     */
    int getZustandGeistig();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.KoerperPersona#getZustandGeistig <em>Zustand Geistig</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zustand Geistig</em>' attribute.
     * @see #getZustandGeistig()
     * @generated
     */
    void setZustandGeistig(int value);

} // KoerperPersona
