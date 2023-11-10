/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This defines a host.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Host#getHostRating <em>Host Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Host#getBaseFirewall <em>Base Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Host#getBaseDatenverarbeitung <em>Base Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Host#getBaseAngriff <em>Base Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Host#getBaseSchleicher <em>Base Schleicher</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getHost()
 * @model
 * @generated
 */
public interface Host extends Beschreibbar, MatrixDevice, ActiveMatixDevice {

    /**
     * Returns the value of the '<em><b>Host Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host Rating</em>' attribute.
     * @see #setHostRating(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getHost_HostRating()
     * @model
     * @generated
     */
    int getHostRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Host#getHostRating <em>Host Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host Rating</em>' attribute.
     * @see #getHostRating()
     * @generated
     */
    void setHostRating(int value);

    /**
     * Returns the value of the '<em><b>Base Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Firewall</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Firewall</em>' attribute.
     * @see #setBaseFirewall(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getHost_BaseFirewall()
     * @model
     * @generated
     */
    int getBaseFirewall();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Host#getBaseFirewall <em>Base Firewall</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Firewall</em>' attribute.
     * @see #getBaseFirewall()
     * @generated
     */
    void setBaseFirewall(int value);

    /**
     * Returns the value of the '<em><b>Base Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Datenverarbeitung</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Datenverarbeitung</em>' attribute.
     * @see #setBaseDatenverarbeitung(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getHost_BaseDatenverarbeitung()
     * @model
     * @generated
     */
    int getBaseDatenverarbeitung();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Host#getBaseDatenverarbeitung <em>Base Datenverarbeitung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Datenverarbeitung</em>' attribute.
     * @see #getBaseDatenverarbeitung()
     * @generated
     */
    void setBaseDatenverarbeitung(int value);

    /**
     * Returns the value of the '<em><b>Base Angriff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Angriff</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Angriff</em>' attribute.
     * @see #setBaseAngriff(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getHost_BaseAngriff()
     * @model
     * @generated
     */
    int getBaseAngriff();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Host#getBaseAngriff <em>Base Angriff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Angriff</em>' attribute.
     * @see #getBaseAngriff()
     * @generated
     */
    void setBaseAngriff(int value);

    /**
     * Returns the value of the '<em><b>Base Schleicher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Schleicher</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Schleicher</em>' attribute.
     * @see #setBaseSchleicher(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getHost_BaseSchleicher()
     * @model
     * @generated
     */
    int getBaseSchleicher();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Host#getBaseSchleicher <em>Base Schleicher</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Schleicher</em>' attribute.
     * @see #getBaseSchleicher()
     * @generated
     */
    void setBaseSchleicher(int value);
} // Host
