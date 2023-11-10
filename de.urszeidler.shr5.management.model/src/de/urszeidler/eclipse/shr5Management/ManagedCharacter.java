/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.Sprachfertigkeit;
import de.urszeidler.eclipse.shr5.Vertrag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Managed Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * the managed chracter contains the mudan parts of a character.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getPersona <em>Persona</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChanges <em>Changes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChracterSource <em>Chracter Source</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getInventar <em>Inventar</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getContracts <em>Contracts</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getConnections <em>Connections</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getVehicels <em>Vehicels</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChoosenLifestyle <em>Choosen Lifestyle</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNativeLanguage <em>Native Language</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getSex <em>Sex</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getStreetCred <em>Street Cred</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotoriety <em>Notoriety</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotorietyBasic <em>Notoriety Basic</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getPublicAwareness <em>Public Awareness</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getKarmaGaint <em>Karma Gaint</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getCurrentKarma <em>Current Karma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getGeneratorSrc <em>Generator Src</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getHeight <em>Height</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getDateofbirth <em>Dateofbirth</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter()
 * @model abstract="true"
 * @generated
 */
public interface ManagedCharacter extends EObject {
	/**
     * Returns the value of the '<em><b>Persona</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Persona</em>' containment reference.
     * @see #setPersona(AbstraktPersona)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Persona()
     * @model containment="true" required="true"
     * @generated
     */
	AbstraktPersona getPersona();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getPersona <em>Persona</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persona</em>' containment reference.
     * @see #getPersona()
     * @generated
     */
	void setPersona(AbstraktPersona value);

	/**
     * Returns the value of the '<em><b>Changes</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.Changes}.
     * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5Management.Changes#getCharacter <em>Character</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Changes</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Changes()
     * @see de.urszeidler.eclipse.shr5Management.Changes#getCharacter
     * @model opposite="character" containment="true"
     * @generated
     */
	EList<Changes> getChanges();

	/**
     * Returns the value of the '<em><b>Chracter Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacter <em>Character</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chracter Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Refers the generator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Chracter Source</em>' reference.
     * @see #setChracterSource(CharacterGenerator)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_ChracterSource()
     * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacter
     * @model opposite="character" required="true"
     * @generated
     */
	CharacterGenerator<?> getChracterSource();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChracterSource <em>Chracter Source</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chracter Source</em>' reference.
     * @see #getChracterSource()
     * @generated
     */
	void setChracterSource(CharacterGenerator<?> value);

	/**
     * Returns the value of the '<em><b>Inventar</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.AbstraktGegenstand}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Inventar</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Inventar()
     * @model containment="true"
     * @generated
     */
	EList<AbstraktGegenstand> getInventar();

	/**
     * Returns the value of the '<em><b>Contracts</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Vertrag}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contracts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Contracts</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Contracts()
     * @model containment="true"
     * @generated
     */
	EList<Vertrag> getContracts();

	/**
     * Returns the value of the '<em><b>Sex</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5Management.Sex}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sex</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Sex
     * @see #setSex(Sex)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Sex()
     * @model required="true"
     * @generated
     */
	Sex getSex();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getSex <em>Sex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sex</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Sex
     * @see #getSex()
     * @generated
     */
	void setSex(Sex value);

	/**
     * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.Connection}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Connections</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Connections()
     * @model containment="true"
     * @generated
     */
	EList<Connection> getConnections();

	/**
     * Returns the value of the '<em><b>Vehicels</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Fahrzeug}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The vehicles the character owns.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vehicels</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Vehicels()
     * @model containment="true"
     * @generated
     */
	EList<Fahrzeug> getVehicels();

	/**
     * Returns the value of the '<em><b>Choosen Lifestyle</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choosen Lifestyle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The primary lifestyle.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Choosen Lifestyle</em>' reference.
     * @see #setChoosenLifestyle(Lifestyle)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_ChoosenLifestyle()
     * @model required="true"
     * @generated
     */
	Lifestyle getChoosenLifestyle();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChoosenLifestyle <em>Choosen Lifestyle</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choosen Lifestyle</em>' reference.
     * @see #getChoosenLifestyle()
     * @generated
     */
	void setChoosenLifestyle(Lifestyle value);

	/**
     * Returns the value of the '<em><b>Native Language</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * One languageSkill is the nativ language.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Native Language</em>' reference.
     * @see #setNativeLanguage(Sprachfertigkeit)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_NativeLanguage()
     * @model required="true"
     * @generated
     */
	Sprachfertigkeit getNativeLanguage();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNativeLanguage <em>Native Language</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Native Language</em>' reference.
     * @see #getNativeLanguage()
     * @generated
     */
	void setNativeLanguage(Sprachfertigkeit value);

	/**
     * Returns the value of the '<em><b>Street Cred</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Cred</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Street Cred</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_StreetCred()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getStreetCred();

	/**
     * Returns the value of the '<em><b>Notoriety</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notoriety</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Notoriety</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Notoriety()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getNotoriety();

	/**
     * Returns the value of the '<em><b>Notoriety Basic</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notoriety Basic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Notoriety Basic</em>' attribute.
     * @see #setNotorietyBasic(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_NotorietyBasic()
     * @model
     * @generated
     */
	int getNotorietyBasic();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotorietyBasic <em>Notoriety Basic</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notoriety Basic</em>' attribute.
     * @see #getNotorietyBasic()
     * @generated
     */
	void setNotorietyBasic(int value);

	/**
     * Returns the value of the '<em><b>Public Awareness</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Awareness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Public Awareness</em>' attribute.
     * @see #setPublicAwareness(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_PublicAwareness()
     * @model
     * @generated
     */
	int getPublicAwareness();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getPublicAwareness <em>Public Awareness</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Public Awareness</em>' attribute.
     * @see #getPublicAwareness()
     * @generated
     */
	void setPublicAwareness(int value);

	/**
     * Returns the value of the '<em><b>Karma Gaint</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karma Gaint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The karma the characters has currenly at his disposal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Karma Gaint</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_KarmaGaint()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getKarmaGaint();

    /**
     * Returns the value of the '<em><b>Current Karma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Karma</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The complete karma the character has gained over the time.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Current Karma</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_CurrentKarma()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getCurrentKarma();

    /**
     * Returns the value of the '<em><b>Generator Src</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generator Src</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When commited contains the generator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Generator Src</em>' containment reference.
     * @see #setGeneratorSrc(CharacterGenerator)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_GeneratorSrc()
     * @model containment="true"
     * @generated
     */
    CharacterGenerator<?> getGeneratorSrc();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getGeneratorSrc <em>Generator Src</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generator Src</em>' containment reference.
     * @see #getGeneratorSrc()
     * @generated
     */
    void setGeneratorSrc(CharacterGenerator<?> value);

    /**
     * Returns the value of the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The height in cm.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Height</em>' attribute.
     * @see #setHeight(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Height()
     * @model
     * @generated
     */
    int getHeight();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getHeight <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Height</em>' attribute.
     * @see #getHeight()
     * @generated
     */
    void setHeight(int value);

    /**
     * Returns the value of the '<em><b>Dateofbirth</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The date of the birth.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dateofbirth</em>' attribute.
     * @see #setDateofbirth(Date)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Dateofbirth()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
    Date getDateofbirth();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getDateofbirth <em>Dateofbirth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dateofbirth</em>' attribute.
     * @see #getDateofbirth()
     * @generated
     */
    void setDateofbirth(Date value);

    /**
     * Returns the value of the '<em><b>Weight</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The weight in kg.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Weight</em>' attribute.
     * @see #setWeight(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getManagedCharacter_Weight()
     * @model
     * @generated
     */
    int getWeight();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getWeight <em>Weight</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weight</em>' attribute.
     * @see #getWeight()
     * @generated
     */
    void setWeight(int value);

} // ManagedCharacter
