/**
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.*;
import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.urszeidler.eclipse.shr5.AspektMagier;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.BioWare;
import de.urszeidler.eclipse.shr5.Bodenfahrzeug;
import de.urszeidler.eclipse.shr5.CritterDauer;
import de.urszeidler.eclipse.shr5.CritterHandlung;
import de.urszeidler.eclipse.shr5.CritterKraft;
import de.urszeidler.eclipse.shr5.CritterReichweite;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.Drohne;
import de.urszeidler.eclipse.shr5.Echo;
import de.urszeidler.eclipse.shr5.FahrzeugModifikation;
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.MagazinTyp;
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.MagischeTradition;
import de.urszeidler.eclipse.shr5.MetaMagie;
import de.urszeidler.eclipse.shr5.ModifikatorType;
import de.urszeidler.eclipse.shr5.MudanPersona;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.PassagierFahrzeug;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Projektilwaffe;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.ResonanzZiel;
import de.urszeidler.eclipse.shr5.SchadensTyp;
import de.urszeidler.eclipse.shr5.Schutzgeist;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.SmartgunType;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Sprite;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Wurfwaffe;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.ZauberArt;
import de.urszeidler.eclipse.shr5.ZauberDauer;
import de.urszeidler.eclipse.shr5.ZauberReichweite;

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
            case Shr5Package.FAHRZEUG_MODIFIKATION: return createFahrzeugModifikation();
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
            case Shr5Package.MAGISCHE_TRADITION:
                return createMagischeTraditionFromString(eDataType, initialValue);
            case Shr5Package.CRITTER_HANDLUNG:
                return createCritterHandlungFromString(eDataType, initialValue);
            case Shr5Package.CRITTER_REICHWEITE:
                return createCritterReichweiteFromString(eDataType, initialValue);
            case Shr5Package.CRITTER_DAUER:
                return createCritterDauerFromString(eDataType, initialValue);
            case Shr5Package.RESONANZ_ZIEL:
                return createResonanzZielFromString(eDataType, initialValue);
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
            case Shr5Package.MAGISCHE_TRADITION:
                return convertMagischeTraditionToString(eDataType, instanceValue);
            case Shr5Package.CRITTER_HANDLUNG:
                return convertCritterHandlungToString(eDataType, instanceValue);
            case Shr5Package.CRITTER_REICHWEITE:
                return convertCritterReichweiteToString(eDataType, instanceValue);
            case Shr5Package.CRITTER_DAUER:
                return convertCritterDauerToString(eDataType, instanceValue);
            case Shr5Package.RESONANZ_ZIEL:
                return convertResonanzZielToString(eDataType, instanceValue);
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
	public SourceBook createSourceBook() {
        SourceBookImpl sourceBook = new SourceBookImpl();
        return sourceBook;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Gegenstand createGegenstand() {
        GegenstandImpl gegenstand = new GegenstandImpl();
        return gegenstand;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Reichweite createReichweite() {
        ReichweiteImpl reichweite = new ReichweiteImpl();
        return reichweite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AttributModifikatorWert createAttributModifikatorWert() {
        AttributModifikatorWertImpl attributModifikatorWert = new AttributModifikatorWertImpl();
        return attributModifikatorWert;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Nahkampfwaffe createNahkampfwaffe() {
        NahkampfwaffeImpl nahkampfwaffe = new NahkampfwaffeImpl();
        return nahkampfwaffe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Feuerwaffe createFeuerwaffe() {
        FeuerwaffeImpl feuerwaffe = new FeuerwaffeImpl();
        return feuerwaffe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Wurfwaffe createWurfwaffe() {
        WurfwaffeImpl wurfwaffe = new WurfwaffeImpl();
        return wurfwaffe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShrList createShrList() {
        ShrListImpl shrList = new ShrListImpl();
        return shrList;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Projektilwaffe createProjektilwaffe() {
        ProjektilwaffeImpl projektilwaffe = new ProjektilwaffeImpl();
        return projektilwaffe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FertigkeitsGruppe createFertigkeitsGruppe() {
        FertigkeitsGruppeImpl fertigkeitsGruppe = new FertigkeitsGruppeImpl();
        return fertigkeitsGruppe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Fertigkeit createFertigkeit() {
        FertigkeitImpl fertigkeit = new FertigkeitImpl();
        return fertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PersonaFertigkeit createPersonaFertigkeit() {
        PersonaFertigkeitImpl personaFertigkeit = new PersonaFertigkeitImpl();
        return personaFertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PersonaFertigkeitsGruppe createPersonaFertigkeitsGruppe() {
        PersonaFertigkeitsGruppeImpl personaFertigkeitsGruppe = new PersonaFertigkeitsGruppeImpl();
        return personaFertigkeitsGruppe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Cyberware createCyberware() {
        CyberwareImpl cyberware = new CyberwareImpl();
        return cyberware;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BioWare createBioWare() {
        BioWareImpl bioWare = new BioWareImpl();
        return bioWare;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MudanPersona createMudanPersona() {
        MudanPersonaImpl mudanPersona = new MudanPersonaImpl();
        return mudanPersona;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KiKraft createKiKraft() {
        KiKraftImpl kiKraft = new KiKraftImpl();
        return kiKraft;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Spezies createSpezies() {
        SpeziesImpl spezies = new SpeziesImpl();
        return spezies;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KiAdept createKiAdept() {
        KiAdeptImpl kiAdept = new KiAdeptImpl();
        return kiAdept;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Kleidung createKleidung() {
        KleidungImpl kleidung = new KleidungImpl();
        return kleidung;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FernkampfwaffeModifikator createFernkampfwaffeModifikator() {
        FernkampfwaffeModifikatorImpl fernkampfwaffeModifikator = new FernkampfwaffeModifikatorImpl();
        return fernkampfwaffeModifikator;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PersonaEigenschaft createPersonaEigenschaft() {
        PersonaEigenschaftImpl personaEigenschaft = new PersonaEigenschaftImpl();
        return personaEigenschaft;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Magier createMagier() {
        MagierImpl magier = new MagierImpl();
        return magier;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MysticAdept createMysticAdept() {
        MysticAdeptImpl mysticAdept = new MysticAdeptImpl();
        return mysticAdept;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PersonaZauber createPersonaZauber() {
        PersonaZauberImpl personaZauber = new PersonaZauberImpl();
        return personaZauber;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Zauber createZauber() {
        ZauberImpl zauber = new ZauberImpl();
        return zauber;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AspektMagier createAspektMagier() {
        AspektMagierImpl aspektMagier = new AspektMagierImpl();
        return aspektMagier;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Schutzgeist createSchutzgeist() {
        SchutzgeistImpl schutzgeist = new SchutzgeistImpl();
        return schutzgeist;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Initation createInitation() {
        InitationImpl initation = new InitationImpl();
        return initation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaMagie createMetaMagie() {
        MetaMagieImpl metaMagie = new MetaMagieImpl();
        return metaMagie;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CritterKraft createCritterKraft() {
        CritterKraftImpl critterKraft = new CritterKraftImpl();
        return critterKraft;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Bodenfahrzeug createBodenfahrzeug() {
        BodenfahrzeugImpl bodenfahrzeug = new BodenfahrzeugImpl();
        return bodenfahrzeug;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PassagierFahrzeug createPassagierFahrzeug() {
        PassagierFahrzeugImpl passagierFahrzeug = new PassagierFahrzeugImpl();
        return passagierFahrzeug;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Drohne createDrohne() {
        DrohneImpl drohne = new DrohneImpl();
        return drohne;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FahrzeugModifikation createFahrzeugModifikation() {
        FahrzeugModifikationImpl fahrzeugModifikation = new FahrzeugModifikationImpl();
        return fahrzeugModifikation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Technomancer createTechnomancer() {
        TechnomancerImpl technomancer = new TechnomancerImpl();
        return technomancer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KomplexeForm createKomplexeForm() {
        KomplexeFormImpl komplexeForm = new KomplexeFormImpl();
        return komplexeForm;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PersonaKomplexForm createPersonaKomplexForm() {
        PersonaKomplexFormImpl personaKomplexForm = new PersonaKomplexFormImpl();
        return personaKomplexForm;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Sprite createSprite() {
        SpriteImpl sprite = new SpriteImpl();
        return sprite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Echo createEcho() {
        EchoImpl echo = new EchoImpl();
        return echo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Vertrag createVertrag() {
        VertragImpl vertrag = new VertragImpl();
        return vertrag;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Lifestyle createLifestyle() {
        LifestyleImpl lifestyle = new LifestyleImpl();
        return lifestyle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Wissensfertigkeit createWissensfertigkeit() {
        WissensfertigkeitImpl wissensfertigkeit = new WissensfertigkeitImpl();
        return wissensfertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Sprachfertigkeit createSprachfertigkeit() {
        SprachfertigkeitImpl sprachfertigkeit = new SprachfertigkeitImpl();
        return sprachfertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Critter createCritter() {
        CritterImpl critter = new CritterImpl();
        return critter;
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
	public MagischeTradition createMagischeTraditionFromString(EDataType eDataType, String initialValue) {
        MagischeTradition result = MagischeTradition.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertMagischeTraditionToString(EDataType eDataType, Object instanceValue) {
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
