/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intervall Vertrag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.IntervallVertrag#getFaelligkeitsIntervall <em>Faelligkeits Intervall</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getIntervallVertrag()
 * @model abstract="true"
 * @generated
 */
public interface IntervallVertrag extends Vertrag {
    /**
     * Returns the value of the '<em><b>Faelligkeits Intervall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faelligkeits Intervall</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Faelligkeits Intervall</em>' attribute.
     * @see #setFaelligkeitsIntervall(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getIntervallVertrag_FaelligkeitsIntervall()
     * @model
     * @generated
     */
    int getFaelligkeitsIntervall();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.IntervallVertrag#getFaelligkeitsIntervall <em>Faelligkeits Intervall</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Faelligkeits Intervall</em>' attribute.
     * @see #getFaelligkeitsIntervall()
     * @generated
     */
    void setFaelligkeitsIntervall(int value);

} // IntervallVertrag
