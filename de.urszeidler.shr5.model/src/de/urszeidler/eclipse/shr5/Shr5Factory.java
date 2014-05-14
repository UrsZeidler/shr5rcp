/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package
 * @generated
 */
public interface Shr5Factory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	Shr5Factory eINSTANCE = de.urszeidler.eclipse.shr5.impl.Shr5FactoryImpl.init();

	/**
     * Returns a new object of class '<em>Source Book</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Source Book</em>'.
     * @generated
     */
	SourceBook createSourceBook();

	/**
     * Returns a new object of class '<em>Gegenstand</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gegenstand</em>'.
     * @generated
     */
	Gegenstand createGegenstand();

	/**
     * Returns a new object of class '<em>Reichweite</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Reichweite</em>'.
     * @generated
     */
	Reichweite createReichweite();

	/**
     * Returns a new object of class '<em>Attribut Modifikator Wert</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribut Modifikator Wert</em>'.
     * @generated
     */
	AttributModifikatorWert createAttributModifikatorWert();

	/**
     * Returns a new object of class '<em>Nahkampfwaffe</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Nahkampfwaffe</em>'.
     * @generated
     */
	Nahkampfwaffe createNahkampfwaffe();

	/**
     * Returns a new object of class '<em>Feuerwaffe</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Feuerwaffe</em>'.
     * @generated
     */
	Feuerwaffe createFeuerwaffe();

	/**
     * Returns a new object of class '<em>Wurfwaffe</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Wurfwaffe</em>'.
     * @generated
     */
	Wurfwaffe createWurfwaffe();

	/**
     * Returns a new object of class '<em>Shr List</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shr List</em>'.
     * @generated
     */
	ShrList createShrList();

	/**
     * Returns a new object of class '<em>Projektilwaffe</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Projektilwaffe</em>'.
     * @generated
     */
	Projektilwaffe createProjektilwaffe();

	/**
     * Returns a new object of class '<em>Fertigkeits Gruppe</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Fertigkeits Gruppe</em>'.
     * @generated
     */
	FertigkeitsGruppe createFertigkeitsGruppe();

	/**
     * Returns a new object of class '<em>Fertigkeit</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Fertigkeit</em>'.
     * @generated
     */
	Fertigkeit createFertigkeit();

	/**
     * Returns a new object of class '<em>Persona Fertigkeit</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Persona Fertigkeit</em>'.
     * @generated
     */
	PersonaFertigkeit createPersonaFertigkeit();

	/**
     * Returns a new object of class '<em>Persona Fertigkeits Gruppe</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Persona Fertigkeits Gruppe</em>'.
     * @generated
     */
	PersonaFertigkeitsGruppe createPersonaFertigkeitsGruppe();

	/**
     * Returns a new object of class '<em>Cyberware</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Cyberware</em>'.
     * @generated
     */
	Cyberware createCyberware();

	/**
     * Returns a new object of class '<em>Bio Ware</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Bio Ware</em>'.
     * @generated
     */
	BioWare createBioWare();

	/**
     * Returns a new object of class '<em>Mudan Persona</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Mudan Persona</em>'.
     * @generated
     */
	MudanPersona createMudanPersona();

	/**
     * Returns a new object of class '<em>Ki Kraft</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ki Kraft</em>'.
     * @generated
     */
	KiKraft createKiKraft();

	/**
     * Returns a new object of class '<em>Spezies</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Spezies</em>'.
     * @generated
     */
	Spezies createSpezies();

	/**
     * Returns a new object of class '<em>Ki Adept</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ki Adept</em>'.
     * @generated
     */
	KiAdept createKiAdept();

	/**
     * Returns a new object of class '<em>Kleidung</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Kleidung</em>'.
     * @generated
     */
	Kleidung createKleidung();

	/**
     * Returns a new object of class '<em>Fernkampfwaffe Modifikator</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Fernkampfwaffe Modifikator</em>'.
     * @generated
     */
	FernkampfwaffeModifikator createFernkampfwaffeModifikator();

	/**
     * Returns a new object of class '<em>Persona Eigenschaft</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Persona Eigenschaft</em>'.
     * @generated
     */
	PersonaEigenschaft createPersonaEigenschaft();

	/**
     * Returns a new object of class '<em>Magier</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Magier</em>'.
     * @generated
     */
	Magier createMagier();

	/**
     * Returns a new object of class '<em>Mystic Adept</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Mystic Adept</em>'.
     * @generated
     */
	MysticAdept createMysticAdept();

	/**
     * Returns a new object of class '<em>Persona Zauber</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Persona Zauber</em>'.
     * @generated
     */
	PersonaZauber createPersonaZauber();

	/**
     * Returns a new object of class '<em>Zauber</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Zauber</em>'.
     * @generated
     */
	Zauber createZauber();

	/**
     * Returns a new object of class '<em>Aspekt Magier</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Aspekt Magier</em>'.
     * @generated
     */
	AspektMagier createAspektMagier();

	/**
     * Returns a new object of class '<em>Schutzgeist</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Schutzgeist</em>'.
     * @generated
     */
	Schutzgeist createSchutzgeist();

	/**
     * Returns a new object of class '<em>Initation</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Initation</em>'.
     * @generated
     */
	Initation createInitation();

	/**
     * Returns a new object of class '<em>Meta Magie</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Meta Magie</em>'.
     * @generated
     */
	MetaMagie createMetaMagie();

	/**
     * Returns a new object of class '<em>Critter Kraft</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Critter Kraft</em>'.
     * @generated
     */
	CritterKraft createCritterKraft();

	/**
     * Returns a new object of class '<em>Bodenfahrzeug</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Bodenfahrzeug</em>'.
     * @generated
     */
	Bodenfahrzeug createBodenfahrzeug();

	/**
     * Returns a new object of class '<em>Passagier Fahrzeug</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Passagier Fahrzeug</em>'.
     * @generated
     */
	PassagierFahrzeug createPassagierFahrzeug();

	/**
     * Returns a new object of class '<em>Drohne</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Drohne</em>'.
     * @generated
     */
	Drohne createDrohne();

	/**
     * Returns a new object of class '<em>Fahrzeug Modifikation</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Fahrzeug Modifikation</em>'.
     * @generated
     */
	FahrzeugModifikation createFahrzeugModifikation();

	/**
     * Returns a new object of class '<em>Technomancer</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Technomancer</em>'.
     * @generated
     */
	Technomancer createTechnomancer();

	/**
     * Returns a new object of class '<em>Komplexe Form</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Komplexe Form</em>'.
     * @generated
     */
	KomplexeForm createKomplexeForm();

	/**
     * Returns a new object of class '<em>Persona Komplex Form</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Persona Komplex Form</em>'.
     * @generated
     */
	PersonaKomplexForm createPersonaKomplexForm();

	/**
     * Returns a new object of class '<em>Sprite</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Sprite</em>'.
     * @generated
     */
	Sprite createSprite();

	/**
     * Returns a new object of class '<em>Echo</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Echo</em>'.
     * @generated
     */
	Echo createEcho();

	/**
     * Returns a new object of class '<em>Vertrag</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Vertrag</em>'.
     * @generated
     */
	Vertrag createVertrag();

	/**
     * Returns a new object of class '<em>Lifestyle</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Lifestyle</em>'.
     * @generated
     */
	Lifestyle createLifestyle();

	/**
     * Returns a new object of class '<em>Wissensfertigkeit</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Wissensfertigkeit</em>'.
     * @generated
     */
	Wissensfertigkeit createWissensfertigkeit();

	/**
     * Returns a new object of class '<em>Sprachfertigkeit</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Sprachfertigkeit</em>'.
     * @generated
     */
	Sprachfertigkeit createSprachfertigkeit();

	/**
     * Returns a new object of class '<em>Critter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Critter</em>'.
     * @generated
     */
    Critter createCritter();

    /**
     * Returns a new object of class '<em>Sin</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sin</em>'.
     * @generated
     */
    Sin createSin();

    /**
     * Returns a new object of class '<em>Lizenz</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lizenz</em>'.
     * @generated
     */
    Lizenz createLizenz();

    /**
     * Returns a new object of class '<em>Credstick</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Credstick</em>'.
     * @generated
     */
    Credstick createCredstick();

    /**
     * Returns a new object of class '<em>Munition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Munition</em>'.
     * @generated
     */
    Munition createMunition();

    /**
     * Returns a new object of class '<em>Gebundener Geist</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gebundener Geist</em>'.
     * @generated
     */
    GebundenerGeist createGebundenerGeist();

    /**
     * Returns a new object of class '<em>Geist</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Geist</em>'.
     * @generated
     */
    Geist createGeist();

    /**
     * Returns a new object of class '<em>Credstick Transaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Credstick Transaction</em>'.
     * @generated
     */
    CredstickTransaction createCredstickTransaction();

    /**
     * Returns a new object of class '<em>Spezialisierung</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Spezialisierung</em>'.
     * @generated
     */
    Spezialisierung createSpezialisierung();

    /**
     * Returns a new object of class '<em>Commlink</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Commlink</em>'.
     * @generated
     */
    Commlink createCommlink();

    /**
     * Returns a new object of class '<em>Cyberdeck</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cyberdeck</em>'.
     * @generated
     */
    Cyberdeck createCyberdeck();

    /**
     * Returns a new object of class '<em>Software Agent</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Software Agent</em>'.
     * @generated
     */
    SoftwareAgent createSoftwareAgent();

    /**
     * Returns a new object of class '<em>Host</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Host</em>'.
     * @generated
     */
    Host createHost();

    /**
     * Returns a new object of class '<em>Rigger Command Console</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rigger Command Console</em>'.
     * @generated
     */
    RiggerCommandConsole createRiggerCommandConsole();

    /**
     * Returns a new object of class '<em>Auto Soft</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Auto Soft</em>'.
     * @generated
     */
    AutoSoft createAutoSoft();

    /**
     * Returns a new object of class '<em>Tutorsoft</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tutorsoft</em>'.
     * @generated
     */
    Tutorsoft createTutorsoft();

    /**
     * Returns a new object of class '<em>Skill Soft</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Skill Soft</em>'.
     * @generated
     */
    SkillSoft createSkillSoft();

    /**
     * Returns a new object of class '<em>Personal Area Network</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Personal Area Network</em>'.
     * @generated
     */
    PersonalAreaNetwork createPersonalAreaNetwork();

    /**
     * Returns a new object of class '<em>Datasoft</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Datasoft</em>'.
     * @generated
     */
    Datasoft createDatasoft();

    /**
     * Returns a new object of class '<em>Consumer Soft</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Consumer Soft</em>'.
     * @generated
     */
    ConsumerSoft createConsumerSoft();

    /**
     * Returns a new object of class '<em>Common Program</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Common Program</em>'.
     * @generated
     */
    CommonProgram createCommonProgram();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	Shr5Package getShr5Package();

} //Shr5Factory
