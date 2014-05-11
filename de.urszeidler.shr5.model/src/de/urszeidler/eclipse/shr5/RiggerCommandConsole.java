/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rigger Command Console</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getRauschunterdrueckung <em>Rauschunterdrueckung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriff <em>Zugriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getDatenverarbeitungBasis <em>Datenverarbeitung Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getFirewallBasis <em>Firewall Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriffBasis <em>Zugriff Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getRiggerCommandConsole()
 * @model
 * @generated
 */
public interface RiggerCommandConsole extends Commlink {
    /**
     * Returns the value of the '<em><b>Rauschunterdrueckung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rauschunterdrueckung</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rauschunterdrueckung</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getRiggerCommandConsole_Rauschunterdrueckung()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getRauschunterdrueckung();

    /**
     * Returns the value of the '<em><b>Zugriff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zugriff</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zugriff</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getRiggerCommandConsole_Zugriff()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getZugriff();

    /**
     * Returns the value of the '<em><b>Datenverarbeitung Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Datenverarbeitung Basis</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Datenverarbeitung Basis</em>' attribute.
     * @see #setDatenverarbeitungBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getRiggerCommandConsole_DatenverarbeitungBasis()
     * @model required="true"
     * @generated
     */
    int getDatenverarbeitungBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getDatenverarbeitungBasis <em>Datenverarbeitung Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datenverarbeitung Basis</em>' attribute.
     * @see #getDatenverarbeitungBasis()
     * @generated
     */
    void setDatenverarbeitungBasis(int value);

    /**
     * Returns the value of the '<em><b>Firewall Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Firewall Basis</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Firewall Basis</em>' attribute.
     * @see #setFirewallBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getRiggerCommandConsole_FirewallBasis()
     * @model required="true"
     * @generated
     */
    int getFirewallBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getFirewallBasis <em>Firewall Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Firewall Basis</em>' attribute.
     * @see #getFirewallBasis()
     * @generated
     */
    void setFirewallBasis(int value);

    /**
     * Returns the value of the '<em><b>Zugriff Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This value is for the zugriff feature, the rauchunter. is calculated as deviceRating-zugriffBasis.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Zugriff Basis</em>' attribute.
     * @see #setZugriffBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getRiggerCommandConsole_ZugriffBasis()
     * @model
     * @generated
     */
    int getZugriffBasis();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriffBasis <em>Zugriff Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zugriff Basis</em>' attribute.
     * @see #getZugriffBasis()
     * @generated
     */
    void setZugriffBasis(int value);

} // RiggerCommandConsole
