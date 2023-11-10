/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Zustand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandKoerperlichMax <em>Zustand Koerperlich Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGeistigMax <em>Zustand Geistig Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGrenze <em>Zustand Grenze</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaZustand()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PersonaZustand extends EObject {
    /**
     * Returns the value of the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zustand Koerperlich Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zustand Koerperlich Max</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaZustand_ZustandKoerperlichMax()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getZustandKoerperlichMax();

    /**
     * Returns the value of the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zustand Geistig Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zustand Geistig Max</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaZustand_ZustandGeistigMax()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getZustandGeistigMax();

    /**
     * Returns the value of the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zustand Grenze</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zustand Grenze</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaZustand_ZustandGrenze()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getZustandGrenze();

} // PersonaZustand
