/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fokus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The fokus has binding costs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fokus#getBindungskosten <em>Bindungskosten</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFokus()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Fokus extends MagischeStufe, Beschreibbar, Quelle, GeldWert, Erlernbar {
    /**
     * Returns the value of the '<em><b>Bindungskosten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The memory.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bindungskosten</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFokus_Bindungskosten()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getBindungskosten();

} // Fokus
