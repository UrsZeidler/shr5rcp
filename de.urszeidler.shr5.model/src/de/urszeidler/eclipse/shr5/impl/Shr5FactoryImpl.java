/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.urszeidler.eclipse.shr5.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5FactoryImpl extends EFactoryImpl implements Shr5Factory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Shr5Factory init() {
        try {
            Shr5Factory theShr5Factory = (Shr5Factory)EPackage.Registry.INSTANCE.getEFactory(Shr5Package.eNS_URI);
            if (theShr5Factory != null) {
                return theShr5Factory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new Shr5FactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5FactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case Shr5Package.SOURCE_BOOK: return createSourceBook();
            case Shr5Package.GEGENSTAND: return createGegenstand();
            case Shr5Package.REICHWEITE: return createReichweite();
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT: return createAttributModifikatorWert();
            case Shr5Package.NAHKAMPFWAFFE: return createNahkampfwaffe();
            case Shr5Package.FEUERWAFFE: return createFeuerwaffe();
            case Shr5Package.WURFWAFFE: return createWurfwaffe();
            case Shr5Package.SHR_LIST: return createShrList();
            case Shr5Package.PROJEKTILWAFFE: return createProjektilwaffe();
            case Shr5Package.FERTIGKEITS_GRUPPE: return createFertigkeitsGruppe();
            case Shr5Package.FERTIGKEIT: return createFertigkeit();
            case Shr5Package.PERSONA_FERTIGKEIT: return createPersonaFertigkeit();
            case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE: return createPersonaFertigkeitsGruppe();
            case Shr5Package.CYBERWARE: return createCyberware();
            case Shr5Package.BIO_WARE: return createBioWare();
            case Shr5Package.MUDAN_PERSONA: return createMudanPersona();
            case Shr5Package.KI_KRAFT: return createKiKraft();
            case Shr5Package.SPEZIES: return createSpezies();
            case Shr5Package.KI_ADEPT: return createKiAdept();
            case Shr5Package.KLEIDUNG: return createKleidung();
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR: return createFernkampfwaffeModifikator();
            case Shr5Package.PERSONA_EIGENSCHAFT: return createPersonaEigenschaft();
            case Shr5Package.MAGIER: return createMagier();
            case Shr5Package.MYSTIC_ADEPT: return createMysticAdept();
            case Shr5Package.PERSONA_ZAUBER: return createPersonaZauber();
            case Shr5Package.ZAUBER: return createZauber();
            case Shr5Package.ASPEKT_MAGIER: return createAspektMagier();
            case Shr5Package.SCHUTZGEIST: return createSchutzgeist();
            case Shr5Package.INITATION: return createInitation();
            case Shr5Package.META_MAGIE: return createMetaMagie();
            case Shr5Package.CRITTER_KRAFT: return createCritterKraft();
            case Shr5Package.BODENFAHRZEUG: return createBodenfahrzeug();
            case Shr5Package.PASSAGIER_FAHRZEUG: return createPassagierFahrzeug();
            case Shr5Package.DROHNE: return createDrohne();
            case Shr5Package.TECHNOMANCER: return createTechnomancer();
            case Shr5Package.KOMPLEXE_FORM: return createKomplexeForm();
            case Shr5Package.PERSONA_KOMPLEX_FORM: return createPersonaKomplexForm();
            case Shr5Package.SPRITE: return createSprite();
            case Shr5Package.ECHO: return createEcho();
            case Shr5Package.VERTRAG: return createVertrag();
            case Shr5Package.LIFESTYLE: return createLifestyle();
            case Shr5Package.WISSENSFERTIGKEIT: return createWissensfertigkeit();
            case Shr5Package.SPRACHFERTIGKEIT: return createSprachfertigkeit();
            case Shr5Package.CRITTER: return createCritter();
            case Shr5Package.INTERVALL_VERTRAG: return createIntervallVertrag();
            case Shr5Package.SIN: return createSin();
            case Shr5Package.LIZENZ: return createLizenz();
            case Shr5Package.CREDSTICK: return createCredstick();
            case Shr5Package.MUNITION: return createMunition();
            case Shr5Package.GEBUNDENER_GEIST: return createGebundenerGeist();
            case Shr5Package.GEIST: return createGeist();
            case Shr5Package.CREDSTICK_TRANSACTION: return createCredstickTransaction();
            case Shr5Package.SPEZIALISIERUNG: return createSpezialisierung();
            case Shr5Package.COMMLINK: return createCommlink();
            case Shr5Package.CYBERDECK: return createCyberdeck();
            case Shr5Package.SOFTWARE_AGENT: return createSoftwareAgent();
            case Shr5Package.HOST: return createHost();
            case Shr5Package.RIGGER_COMMAND_CONSOLE: return createRiggerCommandConsole();
            case Shr5Package.AUTO_SOFT: return createAutoSoft();
            case Shr5Package.TUTORSOFT: return createTutorsoft();
            case Shr5Package.SKILL_SOFT: return createSkillSoft();
            case Shr5Package.PERSONAL_AREA_NETWORK: return createPersonalAreaNetwork();
            case Shr5Package.DATASOFT: return createDatasoft();
            case Shr5Package.CONSUMER_SOFT: return createConsumerSoft();
            case Shr5Package.COMMON_PROGRAM: return createCommonProgram();
            case Shr5Package.WEAPON_MOUNT: return createWeaponMount();
            case Shr5Package.LIFESTYLE_OPTION: return createLifestyleOption();
            case Shr5Package.PERCENT_LIFESTYLE_OPTION: return createPercentLifestyleOption();
            case Shr5Package.LOCALIZATION: return createLocalization();
            case Shr5Package.QI_FOKUS: return createQiFokus();
            case Shr5Package.WAFFEN_FOKUS: return createWaffenFokus();
            case Shr5Package.MAGIE_FOKUS: return createMagieFokus();
            case Shr5Package.FOKUS_BINDING: return createFokusBinding();
            case Shr5Package.TOXIN: return createToxin();
            case Shr5Package.DRUG: return createDrug();
            case Shr5Package.MAGAZIN: return createMagazin();
            case Shr5Package.DEFAULT_WIFI: return createDefaultWifi();
            case Shr5Package.SUBSTANCE_CONTAINER: return createSubstanceContainer();
            case Shr5Package.CYBERWARE_ENHANCEMENT: return createCyberwareEnhancement();
            case Shr5Package.CYBER_IMPLANT_WEAPON: return createCyberImplantWeapon();
            case Shr5Package.MAGISCHE_TRADITION: return createMagischeTradition();
            case Shr5Package.SHOPPING_TRANSACTION: return createShoppingTransaction();
            case Shr5Package.TRANSFER_AMOUNT: return createTransferAmount();
            case Shr5Package.KLEINDUNGS_MODIFIKATOR: return createKleindungsModifikator();
            case Shr5Package.SENSOR: return createSensor();
            case Shr5Package.SENSOR_ARRAY: return createSensorArray();
            case Shr5Package.SENSOR_FUNCTION: return createSensorFunction();
            case Shr5Package.MARTIALART_STYLE: return createMartialartStyle();
            case Shr5Package.MARTIALART_TECHNIQUE: return createMartialartTechnique();
            case Shr5Package.PERSONA_MARTIALART_STYLE: return createPersonaMartialartStyle();
            case Shr5Package.PERSONA_MARTIALART_TECHNIQUE: return createPersonaMartialartTechnique();
            case Shr5Package.FAHRZEUG_ERWEITERUNG: return createFahrzeugErweiterung();
            case Shr5Package.MINI_GRENATE: return createMiniGrenate();
            case Shr5Package.GRANATE: return createGranate();
            case Shr5Package.SOURCE_LINK: return createSourceLink();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case Shr5Package.FEUER_MODUS:
                return createFeuerModusFromString(eDataType, initialValue);
            case Shr5Package.SCHADENS_TYP:
                return createSchadensTypFromString(eDataType, initialValue);
            case Shr5Package.MAGAZIN_TYP:
                return createMagazinTypFromString(eDataType, initialValue);
            case Shr5Package.FEUWERWAFFEN_ERWEITERUNG:
                return createFeuwerwaffenErweiterungFromString(eDataType, initialValue);
            case Shr5Package.MODIFIKATOR_TYPE:
                return createModifikatorTypeFromString(eDataType, initialValue);
            case Shr5Package.SMARTGUN_TYPE:
                return createSmartgunTypeFromString(eDataType, initialValue);
            case Shr5Package.ZAUBER_ART:
                return createZauberArtFromString(eDataType, initialValue);
            case Shr5Package.ZAUBER_REICHWEITE:
                return createZauberReichweiteFromString(eDataType, initialValue);
            case Shr5Package.ZAUBER_DAUER:
                return createZauberDauerFromString(eDataType, initialValue);
            case Shr5Package.CRITTER_HANDLUNG:
                return createCritterHandlungFromString(eDataType, initialValue);
            case Shr5Package.CRITTER_REICHWEITE:
                return createCritterReichweiteFromString(eDataType, initialValue);
            case Shr5Package.CRITTER_DAUER:
                return createCritterDauerFromString(eDataType, initialValue);
            case Shr5Package.RESONANZ_ZIEL:
                return createResonanzZielFromString(eDataType, initialValue);
            case Shr5Package.INTERFACE_MODUS:
                return createInterfaceModusFromString(eDataType, initialValue);
            case Shr5Package.PROGRAM_TYPE:
                return createProgramTypeFromString(eDataType, initialValue);
            case Shr5Package.MATRIX_PROGRAM_TYPE:
                return createMatrixProgramTypeFromString(eDataType, initialValue);
            case Shr5Package.SUBSTANCE_VECTOR:
                return createSubstanceVectorFromString(eDataType, initialValue);
            case Shr5Package.SUBSTANCE_EFFECT:
                return createSubstanceEffectFromString(eDataType, initialValue);
            case Shr5Package.ADDICTION_TYPE:
                return createAddictionTypeFromString(eDataType, initialValue);
            case Shr5Package.TIME_UNITS:
                return createTimeUnitsFromString(eDataType, initialValue);
            case Shr5Package.CYBERWARE_TYPE:
                return createCyberwareTypeFromString(eDataType, initialValue);
            case Shr5Package.ENZUG:
                return createEnzugFromString(eDataType, initialValue);
            case Shr5Package.ARMOR_MODIFICATION_TYPE:
                return createarmorModificationTypeFromString(eDataType, initialValue);
            case Shr5Package.SHR_DATE:
                return createShrDateFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case Shr5Package.FEUER_MODUS:
                return convertFeuerModusToString(eDataType, instanceValue);
            case Shr5Package.SCHADENS_TYP:
                return convertSchadensTypToString(eDataType, instanceValue);
            case Shr5Package.MAGAZIN_TYP:
                return convertMagazinTypToString(eDataType, instanceValue);
            case Shr5Package.FEUWERWAFFEN_ERWEITERUNG:
                return convertFeuwerwaffenErweiterungToString(eDataType, instanceValue);
            case Shr5Package.MODIFIKATOR_TYPE:
                return convertModifikatorTypeToString(eDataType, instanceValue);
            case Shr5Package.SMARTGUN_TYPE:
                return convertSmartgunTypeToString(eDataType, instanceValue);
            case Shr5Package.ZAUBER_ART:
                return convertZauberArtToString(eDataType, instanceValue);
            case Shr5Package.ZAUBER_REICHWEITE:
                return convertZauberReichweiteToString(eDataType, instanceValue);
            case Shr5Package.ZAUBER_DAUER:
                return convertZauberDauerToString(eDataType, instanceValue);
            case Shr5Package.CRITTER_HANDLUNG:
                return convertCritterHandlungToString(eDataType, instanceValue);
            case Shr5Package.CRITTER_REICHWEITE:
                return convertCritterReichweiteToString(eDataType, instanceValue);
            case Shr5Package.CRITTER_DAUER:
                return convertCritterDauerToString(eDataType, instanceValue);
            case Shr5Package.RESONANZ_ZIEL:
                return convertResonanzZielToString(eDataType, instanceValue);
            case Shr5Package.INTERFACE_MODUS:
                return convertInterfaceModusToString(eDataType, instanceValue);
            case Shr5Package.PROGRAM_TYPE:
                return convertProgramTypeToString(eDataType, instanceValue);
            case Shr5Package.MATRIX_PROGRAM_TYPE:
                return convertMatrixProgramTypeToString(eDataType, instanceValue);
            case Shr5Package.SUBSTANCE_VECTOR:
                return convertSubstanceVectorToString(eDataType, instanceValue);
            case Shr5Package.SUBSTANCE_EFFECT:
                return convertSubstanceEffectToString(eDataType, instanceValue);
            case Shr5Package.ADDICTION_TYPE:
                return convertAddictionTypeToString(eDataType, instanceValue);
            case Shr5Package.TIME_UNITS:
                return convertTimeUnitsToString(eDataType, instanceValue);
            case Shr5Package.CYBERWARE_TYPE:
                return convertCyberwareTypeToString(eDataType, instanceValue);
            case Shr5Package.ENZUG:
                return convertEnzugToString(eDataType, instanceValue);
            case Shr5Package.ARMOR_MODIFICATION_TYPE:
                return convertarmorModificationTypeToString(eDataType, instanceValue);
            case Shr5Package.SHR_DATE:
                return convertShrDateToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public SourceBook createSourceBook() {
        SourceBookImpl sourceBook = new SourceBookImpl();
        return sourceBook;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Gegenstand createGegenstand() {
        GegenstandImpl gegenstand = new GegenstandImpl();
        return gegenstand;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Reichweite createReichweite() {
        ReichweiteImpl reichweite = new ReichweiteImpl();
        return reichweite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public AttributModifikatorWert createAttributModifikatorWert() {
        AttributModifikatorWertImpl attributModifikatorWert = new AttributModifikatorWertImpl();
        return attributModifikatorWert;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Nahkampfwaffe createNahkampfwaffe() {
        NahkampfwaffeImpl nahkampfwaffe = new NahkampfwaffeImpl();
        return nahkampfwaffe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Feuerwaffe createFeuerwaffe() {
        FeuerwaffeImpl feuerwaffe = new FeuerwaffeImpl();
        return feuerwaffe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Wurfwaffe createWurfwaffe() {
        WurfwaffeImpl wurfwaffe = new WurfwaffeImpl();
        return wurfwaffe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ShrList createShrList() {
        ShrListImpl shrList = new ShrListImpl();
        return shrList;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Projektilwaffe createProjektilwaffe() {
        ProjektilwaffeImpl projektilwaffe = new ProjektilwaffeImpl();
        return projektilwaffe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public FertigkeitsGruppe createFertigkeitsGruppe() {
        FertigkeitsGruppeImpl fertigkeitsGruppe = new FertigkeitsGruppeImpl();
        return fertigkeitsGruppe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Fertigkeit createFertigkeit() {
        FertigkeitImpl fertigkeit = new FertigkeitImpl();
        return fertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public PersonaFertigkeit createPersonaFertigkeit() {
        PersonaFertigkeitImpl personaFertigkeit = new PersonaFertigkeitImpl();
        return personaFertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public PersonaFertigkeitsGruppe createPersonaFertigkeitsGruppe() {
        PersonaFertigkeitsGruppeImpl personaFertigkeitsGruppe = new PersonaFertigkeitsGruppeImpl();
        return personaFertigkeitsGruppe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Cyberware createCyberware() {
        CyberwareImpl cyberware = new CyberwareImpl();
        return cyberware;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public BioWare createBioWare() {
        BioWareImpl bioWare = new BioWareImpl();
        return bioWare;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public MudanPersona createMudanPersona() {
        MudanPersonaImpl mudanPersona = new MudanPersonaImpl();
        return mudanPersona;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public KiKraft createKiKraft() {
        KiKraftImpl kiKraft = new KiKraftImpl();
        return kiKraft;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Spezies createSpezies() {
        SpeziesImpl spezies = new SpeziesImpl();
        return spezies;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public KiAdept createKiAdept() {
        KiAdeptImpl kiAdept = new KiAdeptImpl();
        return kiAdept;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Kleidung createKleidung() {
        KleidungImpl kleidung = new KleidungImpl();
        return kleidung;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public FernkampfwaffeModifikator createFernkampfwaffeModifikator() {
        FernkampfwaffeModifikatorImpl fernkampfwaffeModifikator = new FernkampfwaffeModifikatorImpl();
        return fernkampfwaffeModifikator;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public PersonaEigenschaft createPersonaEigenschaft() {
        PersonaEigenschaftImpl personaEigenschaft = new PersonaEigenschaftImpl();
        return personaEigenschaft;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Magier createMagier() {
        MagierImpl magier = new MagierImpl();
        return magier;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public MysticAdept createMysticAdept() {
        MysticAdeptImpl mysticAdept = new MysticAdeptImpl();
        return mysticAdept;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public PersonaZauber createPersonaZauber() {
        PersonaZauberImpl personaZauber = new PersonaZauberImpl();
        return personaZauber;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Zauber createZauber() {
        ZauberImpl zauber = new ZauberImpl();
        return zauber;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public AspektMagier createAspektMagier() {
        AspektMagierImpl aspektMagier = new AspektMagierImpl();
        return aspektMagier;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Schutzgeist createSchutzgeist() {
        SchutzgeistImpl schutzgeist = new SchutzgeistImpl();
        return schutzgeist;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Initation createInitation() {
        InitationImpl initation = new InitationImpl();
        return initation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public MetaMagie createMetaMagie() {
        MetaMagieImpl metaMagie = new MetaMagieImpl();
        return metaMagie;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public CritterKraft createCritterKraft() {
        CritterKraftImpl critterKraft = new CritterKraftImpl();
        return critterKraft;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Bodenfahrzeug createBodenfahrzeug() {
        BodenfahrzeugImpl bodenfahrzeug = new BodenfahrzeugImpl();
        return bodenfahrzeug;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public PassagierFahrzeug createPassagierFahrzeug() {
        PassagierFahrzeugImpl passagierFahrzeug = new PassagierFahrzeugImpl();
        return passagierFahrzeug;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Drohne createDrohne() {
        DrohneImpl drohne = new DrohneImpl();
        return drohne;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Technomancer createTechnomancer() {
        TechnomancerImpl technomancer = new TechnomancerImpl();
        return technomancer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public KomplexeForm createKomplexeForm() {
        KomplexeFormImpl komplexeForm = new KomplexeFormImpl();
        return komplexeForm;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public PersonaKomplexForm createPersonaKomplexForm() {
        PersonaKomplexFormImpl personaKomplexForm = new PersonaKomplexFormImpl();
        return personaKomplexForm;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Sprite createSprite() {
        SpriteImpl sprite = new SpriteImpl();
        return sprite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Echo createEcho() {
        EchoImpl echo = new EchoImpl();
        return echo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Vertrag createVertrag() {
        VertragImpl vertrag = new VertragImpl();
        return vertrag;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Lifestyle createLifestyle() {
        LifestyleImpl lifestyle = new LifestyleImpl();
        return lifestyle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Wissensfertigkeit createWissensfertigkeit() {
        WissensfertigkeitImpl wissensfertigkeit = new WissensfertigkeitImpl();
        return wissensfertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Sprachfertigkeit createSprachfertigkeit() {
        SprachfertigkeitImpl sprachfertigkeit = new SprachfertigkeitImpl();
        return sprachfertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Critter createCritter() {
        CritterImpl critter = new CritterImpl();
        return critter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntervallVertrag createIntervallVertrag() {
        IntervallVertragImpl intervallVertrag = new IntervallVertragImpl();
        return intervallVertrag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Sin createSin() {
        SinImpl sin = new SinImpl();
        return sin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Lizenz createLizenz() {
        LizenzImpl lizenz = new LizenzImpl();
        return lizenz;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Credstick createCredstick() {
        CredstickImpl credstick = new CredstickImpl();
        return credstick;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Munition createMunition() {
        MunitionImpl munition = new MunitionImpl();
        return munition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GebundenerGeist createGebundenerGeist() {
        GebundenerGeistImpl gebundenerGeist = new GebundenerGeistImpl();
        return gebundenerGeist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Geist createGeist() {
        GeistImpl geist = new GeistImpl();
        return geist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CredstickTransaction createCredstickTransaction() {
        CredstickTransactionImpl credstickTransaction = new CredstickTransactionImpl();
        return credstickTransaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Spezialisierung createSpezialisierung() {
        SpezialisierungImpl spezialisierung = new SpezialisierungImpl();
        return spezialisierung;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Commlink createCommlink() {
        CommlinkImpl commlink = new CommlinkImpl();
        return commlink;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Cyberdeck createCyberdeck() {
        CyberdeckImpl cyberdeck = new CyberdeckImpl();
        return cyberdeck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SoftwareAgent createSoftwareAgent() {
        SoftwareAgentImpl softwareAgent = new SoftwareAgentImpl();
        return softwareAgent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Host createHost() {
        HostImpl host = new HostImpl();
        return host;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RiggerCommandConsole createRiggerCommandConsole() {
        RiggerCommandConsoleImpl riggerCommandConsole = new RiggerCommandConsoleImpl();
        return riggerCommandConsole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AutoSoft createAutoSoft() {
        AutoSoftImpl autoSoft = new AutoSoftImpl();
        return autoSoft;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tutorsoft createTutorsoft() {
        TutorsoftImpl tutorsoft = new TutorsoftImpl();
        return tutorsoft;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SkillSoft createSkillSoft() {
        SkillSoftImpl skillSoft = new SkillSoftImpl();
        return skillSoft;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PersonalAreaNetwork createPersonalAreaNetwork() {
        PersonalAreaNetworkImpl personalAreaNetwork = new PersonalAreaNetworkImpl();
        return personalAreaNetwork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Datasoft createDatasoft() {
        DatasoftImpl datasoft = new DatasoftImpl();
        return datasoft;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConsumerSoft createConsumerSoft() {
        ConsumerSoftImpl consumerSoft = new ConsumerSoftImpl();
        return consumerSoft;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CommonProgram createCommonProgram() {
        CommonProgramImpl commonProgram = new CommonProgramImpl();
        return commonProgram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WeaponMount createWeaponMount() {
        WeaponMountImpl weaponMount = new WeaponMountImpl();
        return weaponMount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LifestyleOption createLifestyleOption() {
        LifestyleOptionImpl lifestyleOption = new LifestyleOptionImpl();
        return lifestyleOption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PercentLifestyleOption createPercentLifestyleOption() {
        PercentLifestyleOptionImpl percentLifestyleOption = new PercentLifestyleOptionImpl();
        return percentLifestyleOption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Localization createLocalization() {
        LocalizationImpl localization = new LocalizationImpl();
        return localization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public QiFokus createQiFokus() {
        QiFokusImpl qiFokus = new QiFokusImpl();
        return qiFokus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WaffenFokus createWaffenFokus() {
        WaffenFokusImpl waffenFokus = new WaffenFokusImpl();
        return waffenFokus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MagieFokus createMagieFokus() {
        MagieFokusImpl magieFokus = new MagieFokusImpl();
        return magieFokus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FokusBinding createFokusBinding() {
        FokusBindingImpl fokusBinding = new FokusBindingImpl();
        return fokusBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Toxin createToxin() {
        ToxinImpl toxin = new ToxinImpl();
        return toxin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Drug createDrug() {
        DrugImpl drug = new DrugImpl();
        return drug;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Magazin createMagazin() {
        MagazinImpl magazin = new MagazinImpl();
        return magazin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DefaultWifi createDefaultWifi() {
        DefaultWifiImpl defaultWifi = new DefaultWifiImpl();
        return defaultWifi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubstanceContainer createSubstanceContainer() {
        SubstanceContainerImpl substanceContainer = new SubstanceContainerImpl();
        return substanceContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CyberwareEnhancement createCyberwareEnhancement() {
        CyberwareEnhancementImpl cyberwareEnhancement = new CyberwareEnhancementImpl();
        return cyberwareEnhancement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CyberImplantWeapon createCyberImplantWeapon() {
        CyberImplantWeaponImpl cyberImplantWeapon = new CyberImplantWeaponImpl();
        return cyberImplantWeapon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MagischeTradition createMagischeTradition() {
        MagischeTraditionImpl magischeTradition = new MagischeTraditionImpl();
        return magischeTradition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShoppingTransaction createShoppingTransaction() {
        ShoppingTransactionImpl shoppingTransaction = new ShoppingTransactionImpl();
        return shoppingTransaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransferAmount createTransferAmount() {
        TransferAmountImpl transferAmount = new TransferAmountImpl();
        return transferAmount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public KleindungsModifikator createKleindungsModifikator() {
        KleindungsModifikatorImpl kleindungsModifikator = new KleindungsModifikatorImpl();
        return kleindungsModifikator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Sensor createSensor() {
        SensorImpl sensor = new SensorImpl();
        return sensor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SensorArray createSensorArray() {
        SensorArrayImpl sensorArray = new SensorArrayImpl();
        return sensorArray;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SensorFunction createSensorFunction() {
        SensorFunctionImpl sensorFunction = new SensorFunctionImpl();
        return sensorFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MartialartStyle createMartialartStyle() {
        MartialartStyleImpl martialartStyle = new MartialartStyleImpl();
        return martialartStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MartialartTechnique createMartialartTechnique() {
        MartialartTechniqueImpl martialartTechnique = new MartialartTechniqueImpl();
        return martialartTechnique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PersonaMartialartStyle createPersonaMartialartStyle() {
        PersonaMartialartStyleImpl personaMartialartStyle = new PersonaMartialartStyleImpl();
        return personaMartialartStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PersonaMartialartTechnique createPersonaMartialartTechnique() {
        PersonaMartialartTechniqueImpl personaMartialartTechnique = new PersonaMartialartTechniqueImpl();
        return personaMartialartTechnique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FahrzeugErweiterung createFahrzeugErweiterung() {
        FahrzeugErweiterungImpl fahrzeugErweiterung = new FahrzeugErweiterungImpl();
        return fahrzeugErweiterung;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MiniGrenate createMiniGrenate() {
        MiniGrenateImpl miniGrenate = new MiniGrenateImpl();
        return miniGrenate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Granate createGranate() {
        GranateImpl granate = new GranateImpl();
        return granate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SourceLink createSourceLink() {
        SourceLinkImpl sourceLink = new SourceLinkImpl();
        return sourceLink;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeuerModus createFeuerModusFromString(EDataType eDataType, String initialValue) {
        FeuerModus result = FeuerModus.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertFeuerModusToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SchadensTyp createSchadensTypFromString(EDataType eDataType, String initialValue) {
        SchadensTyp result = SchadensTyp.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertSchadensTypToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MagazinTyp createMagazinTypFromString(EDataType eDataType, String initialValue) {
        MagazinTyp result = MagazinTyp.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertMagazinTypToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeuwerwaffenErweiterung createFeuwerwaffenErweiterungFromString(EDataType eDataType, String initialValue) {
        FeuwerwaffenErweiterung result = FeuwerwaffenErweiterung.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertFeuwerwaffenErweiterungToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ModifikatorType createModifikatorTypeFromString(EDataType eDataType, String initialValue) {
        ModifikatorType result = ModifikatorType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertModifikatorTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SmartgunType createSmartgunTypeFromString(EDataType eDataType, String initialValue) {
        SmartgunType result = SmartgunType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertSmartgunTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ZauberArt createZauberArtFromString(EDataType eDataType, String initialValue) {
        ZauberArt result = ZauberArt.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertZauberArtToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ZauberReichweite createZauberReichweiteFromString(EDataType eDataType, String initialValue) {
        ZauberReichweite result = ZauberReichweite.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertZauberReichweiteToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ZauberDauer createZauberDauerFromString(EDataType eDataType, String initialValue) {
        ZauberDauer result = ZauberDauer.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertZauberDauerToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CritterHandlung createCritterHandlungFromString(EDataType eDataType, String initialValue) {
        CritterHandlung result = CritterHandlung.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCritterHandlungToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CritterReichweite createCritterReichweiteFromString(EDataType eDataType, String initialValue) {
        CritterReichweite result = CritterReichweite.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCritterReichweiteToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CritterDauer createCritterDauerFromString(EDataType eDataType, String initialValue) {
        CritterDauer result = CritterDauer.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCritterDauerToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResonanzZiel createResonanzZielFromString(EDataType eDataType, String initialValue) {
        ResonanzZiel result = ResonanzZiel.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertResonanzZielToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterfaceModus createInterfaceModusFromString(EDataType eDataType, String initialValue) {
        InterfaceModus result = InterfaceModus.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInterfaceModusToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProgramType createProgramTypeFromString(EDataType eDataType, String initialValue) {
        ProgramType result = ProgramType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProgramTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatrixProgramType createMatrixProgramTypeFromString(EDataType eDataType, String initialValue) {
        MatrixProgramType result = MatrixProgramType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMatrixProgramTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubstanceVector createSubstanceVectorFromString(EDataType eDataType, String initialValue) {
        SubstanceVector result = SubstanceVector.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSubstanceVectorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubstanceEffect createSubstanceEffectFromString(EDataType eDataType, String initialValue) {
        SubstanceEffect result = SubstanceEffect.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSubstanceEffectToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddictionType createAddictionTypeFromString(EDataType eDataType, String initialValue) {
        AddictionType result = AddictionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAddictionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnits createTimeUnitsFromString(EDataType eDataType, String initialValue) {
        TimeUnits result = TimeUnits.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitsToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CyberwareType createCyberwareTypeFromString(EDataType eDataType, String initialValue) {
        CyberwareType result = CyberwareType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCyberwareTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enzug createEnzugFromString(EDataType eDataType, String initialValue) {
        Enzug result = Enzug.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEnzugToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public armorModificationType createarmorModificationTypeFromString(EDataType eDataType, String initialValue) {
        armorModificationType result = armorModificationType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertarmorModificationTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date createShrDateFromString(EDataType eDataType, String initialValue) {
        return (Date)super.createFromString(eDataType, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertShrDateToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Shr5Package getShr5Package() {
        return (Shr5Package)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static Shr5Package getPackage() {
        return Shr5Package.eINSTANCE;
    }

} //Shr5FactoryImpl
