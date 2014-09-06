/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fahrzeug</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The basic vehicle type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getHandling <em>Handling</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getGeschwindigkeit <em>Geschwindigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getBeschleunigung <em>Beschleunigung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getRumpf <em>Rumpf</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getPilot <em>Pilot</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getSensor <em>Sensor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getFahrzeugTyp <em>Fahrzeug Typ</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getModifizierungen <em>Modifizierungen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getPanzer <em>Panzer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getWeaponMounts <em>Weapon Mounts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug()
 * @model abstract="true"
 * @generated
 */
public interface Fahrzeug extends Beschreibbar, Quelle, GeldWert, Anwendbar, Modifizierbar, FahrzeugZustand {
	/**
     * Returns the value of the '<em><b>Handling</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Handling</em>' attribute.
     * @see #setHandling(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_Handling()
     * @model
     * @generated
     */
	int getHandling();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getHandling <em>Handling</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Handling</em>' attribute.
     * @see #getHandling()
     * @generated
     */
	void setHandling(int value);

	/**
     * Returns the value of the '<em><b>Geschwindigkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geschwindigkeit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Geschwindigkeit</em>' attribute.
     * @see #setGeschwindigkeit(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_Geschwindigkeit()
     * @model
     * @generated
     */
	int getGeschwindigkeit();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getGeschwindigkeit <em>Geschwindigkeit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Geschwindigkeit</em>' attribute.
     * @see #getGeschwindigkeit()
     * @generated
     */
	void setGeschwindigkeit(int value);

	/**
     * Returns the value of the '<em><b>Beschleunigung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beschleunigung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Beschleunigung</em>' attribute.
     * @see #setBeschleunigung(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_Beschleunigung()
     * @model
     * @generated
     */
	int getBeschleunigung();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getBeschleunigung <em>Beschleunigung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Beschleunigung</em>' attribute.
     * @see #getBeschleunigung()
     * @generated
     */
	void setBeschleunigung(int value);

	/**
     * Returns the value of the '<em><b>Rumpf</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rumpf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rumpf</em>' attribute.
     * @see #setRumpf(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_Rumpf()
     * @model
     * @generated
     */
	int getRumpf();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getRumpf <em>Rumpf</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rumpf</em>' attribute.
     * @see #getRumpf()
     * @generated
     */
	void setRumpf(int value);

	/**
     * Returns the value of the '<em><b>Pilot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pilot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Pilot</em>' attribute.
     * @see #setPilot(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_Pilot()
     * @model
     * @generated
     */
	int getPilot();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getPilot <em>Pilot</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pilot</em>' attribute.
     * @see #getPilot()
     * @generated
     */
	void setPilot(int value);

	/**
     * Returns the value of the '<em><b>Sensor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sensor</em>' attribute.
     * @see #setSensor(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_Sensor()
     * @model
     * @generated
     */
	int getSensor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getSensor <em>Sensor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sensor</em>' attribute.
     * @see #getSensor()
     * @generated
     */
	void setSensor(int value);

	/**
     * Returns the value of the '<em><b>Fahrzeug Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fahrzeug Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Fahrzeug Typ</em>' attribute.
     * @see #setFahrzeugTyp(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_FahrzeugTyp()
     * @model
     * @generated
     */
	String getFahrzeugTyp();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getFahrzeugTyp <em>Fahrzeug Typ</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fahrzeug Typ</em>' attribute.
     * @see #getFahrzeugTyp()
     * @generated
     */
	void setFahrzeugTyp(String value);

	/**
     * Returns the value of the '<em><b>Modifizierungen</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.FahrzeugModifikation}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifizierungen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Modifizierungen</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_Modifizierungen()
     * @model containment="true"
     * @generated
     */
	EList<FahrzeugModifikation> getModifizierungen();

    /**
     * Returns the value of the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Panzer</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Panzer</em>' attribute.
     * @see #setPanzer(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_Panzer()
     * @model
     * @generated
     */
    int getPanzer();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getPanzer <em>Panzer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Panzer</em>' attribute.
     * @see #getPanzer()
     * @generated
     */
    void setPanzer(int value);

    /**
     * Returns the value of the '<em><b>Weapon Mounts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weapon Mounts</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weapon Mounts</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFahrzeug_WeaponMounts()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getWeaponMounts();

} // Fahrzeug
