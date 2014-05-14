/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fahrzeug Zustand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax <em>Zustand Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeugZustand()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FahrzeugZustand extends EObject {
    /**
     * Returns the value of the '<em><b>Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zustand Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zustand Max</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeugZustand_ZustandMax()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getZustandMax();

} // FahrzeugZustand
