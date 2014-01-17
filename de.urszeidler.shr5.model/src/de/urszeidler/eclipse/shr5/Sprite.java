/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sprite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sprite#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sprite#getAngriffMod <em>Angriff Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sprite#getSchleicherMod <em>Schleicher Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sprite#getDatenverarbeitungMod <em>Datenverarbeitung Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sprite#getFirewallMod <em>Firewall Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sprite#getInitativeMod <em>Initative Mod</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSprite()
 * @model
 * @generated
 */
public interface Sprite extends ResonanzPersona, Beschreibbar, Quelle {
	/**
	 * Returns the value of the '<em><b>Stufe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stufe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stufe</em>' attribute.
	 * @see #setStufe(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSprite_Stufe()
	 * @model
	 * @generated
	 */
	int getStufe();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sprite#getStufe <em>Stufe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stufe</em>' attribute.
	 * @see #getStufe()
	 * @generated
	 */
	void setStufe(int value);

	/**
	 * Returns the value of the '<em><b>Angriff Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angriff Mod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angriff Mod</em>' attribute.
	 * @see #setAngriffMod(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSprite_AngriffMod()
	 * @model
	 * @generated
	 */
	int getAngriffMod();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sprite#getAngriffMod <em>Angriff Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angriff Mod</em>' attribute.
	 * @see #getAngriffMod()
	 * @generated
	 */
	void setAngriffMod(int value);

	/**
	 * Returns the value of the '<em><b>Schleicher Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schleicher Mod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schleicher Mod</em>' attribute.
	 * @see #setSchleicherMod(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSprite_SchleicherMod()
	 * @model
	 * @generated
	 */
	int getSchleicherMod();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sprite#getSchleicherMod <em>Schleicher Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schleicher Mod</em>' attribute.
	 * @see #getSchleicherMod()
	 * @generated
	 */
	void setSchleicherMod(int value);

	/**
	 * Returns the value of the '<em><b>Datenverarbeitung Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenverarbeitung Mod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenverarbeitung Mod</em>' attribute.
	 * @see #setDatenverarbeitungMod(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSprite_DatenverarbeitungMod()
	 * @model
	 * @generated
	 */
	int getDatenverarbeitungMod();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sprite#getDatenverarbeitungMod <em>Datenverarbeitung Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenverarbeitung Mod</em>' attribute.
	 * @see #getDatenverarbeitungMod()
	 * @generated
	 */
	void setDatenverarbeitungMod(int value);

	/**
	 * Returns the value of the '<em><b>Firewall Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firewall Mod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firewall Mod</em>' attribute.
	 * @see #setFirewallMod(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSprite_FirewallMod()
	 * @model
	 * @generated
	 */
	int getFirewallMod();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sprite#getFirewallMod <em>Firewall Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firewall Mod</em>' attribute.
	 * @see #getFirewallMod()
	 * @generated
	 */
	void setFirewallMod(int value);

	/**
	 * Returns the value of the '<em><b>Initative Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initative Mod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initative Mod</em>' attribute.
	 * @see #setInitativeMod(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSprite_InitativeMod()
	 * @model
	 * @generated
	 */
	int getInitativeMod();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sprite#getInitativeMod <em>Initative Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initative Mod</em>' attribute.
	 * @see #getInitativeMod()
	 * @generated
	 */
	void setInitativeMod(int value);

} // Sprite
