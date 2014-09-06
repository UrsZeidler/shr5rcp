/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feuerwaffe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getMunitionstyp <em>Munitionstyp</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getModie <em>Modie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getKapazitaet <em>Kapazitaet</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getErweiterung <em>Erweiterung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getRueckstoss <em>Rueckstoss</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getEinbau <em>Einbau</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getMagazin <em>Magazin</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuerwaffe()
 * @model
 * @generated
 */
public interface Feuerwaffe extends AbstaktFernKampfwaffe {
	/**
     * Returns the value of the '<em><b>Munitionstyp</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.MagazinTyp}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Munitionstyp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Munitionstyp</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.MagazinTyp
     * @see #setMunitionstyp(MagazinTyp)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuerwaffe_Munitionstyp()
     * @model
     * @generated
     */
	MagazinTyp getMunitionstyp();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getMunitionstyp <em>Munitionstyp</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Munitionstyp</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.MagazinTyp
     * @see #getMunitionstyp()
     * @generated
     */
	void setMunitionstyp(MagazinTyp value);

	/**
     * Returns the value of the '<em><b>Modie</b></em>' attribute list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.FeuerModus}.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.FeuerModus}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modie</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Modie</em>' attribute list.
     * @see de.urszeidler.eclipse.shr5.FeuerModus
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuerwaffe_Modie()
     * @model
     * @generated
     */
	EList<FeuerModus> getModie();

	/**
     * Returns the value of the '<em><b>Kapazitaet</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kapazitaet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Kapazitaet</em>' attribute.
     * @see #setKapazitaet(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuerwaffe_Kapazitaet()
     * @model
     * @generated
     */
	int getKapazitaet();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getKapazitaet <em>Kapazitaet</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kapazitaet</em>' attribute.
     * @see #getKapazitaet()
     * @generated
     */
	void setKapazitaet(int value);

	/**
     * Returns the value of the '<em><b>Erweiterung</b></em>' attribute list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung}.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erweiterung</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Erweiterung</em>' attribute list.
     * @see de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuerwaffe_Erweiterung()
     * @model
     * @generated
     */
	EList<FeuwerwaffenErweiterung> getErweiterung();

	/**
     * Returns the value of the '<em><b>Rueckstoss</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rueckstoss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rueckstoss</em>' attribute.
     * @see #setRueckstoss(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuerwaffe_Rueckstoss()
     * @model
     * @generated
     */
	int getRueckstoss();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getRueckstoss <em>Rueckstoss</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rueckstoss</em>' attribute.
     * @see #getRueckstoss()
     * @generated
     */
	void setRueckstoss(int value);

	/**
     * Returns the value of the '<em><b>Einbau</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Einbau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Einbau</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuerwaffe_Einbau()
     * @model containment="true"
     * @generated
     */
	EList<FernkampfwaffeModifikator> getEinbau();

    /**
     * Returns the value of the '<em><b>Magazin</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This reference holds the current insert magazine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Magazin</em>' reference.
     * @see #setMagazin(Magazin)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuerwaffe_Magazin()
     * @model
     * @generated
     */
    Magazin getMagazin();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getMagazin <em>Magazin</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Magazin</em>' reference.
     * @see #getMagazin()
     * @generated
     */
    void setMagazin(Magazin value);

} // Feuerwaffe
