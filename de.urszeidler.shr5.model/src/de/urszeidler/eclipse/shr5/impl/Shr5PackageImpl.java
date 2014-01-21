/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.AbstaktWaffe;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktModifikatoren;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Anwendbar;
import de.urszeidler.eclipse.shr5.AspektMagier;
import de.urszeidler.eclipse.shr5.AstraleProjektion;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.BioWare;
import de.urszeidler.eclipse.shr5.Bodenfahrzeug;
import de.urszeidler.eclipse.shr5.ChrakterLimits;
import de.urszeidler.eclipse.shr5.Critter;
import de.urszeidler.eclipse.shr5.CritterDauer;
import de.urszeidler.eclipse.shr5.CritterHandlung;
import de.urszeidler.eclipse.shr5.CritterKraft;
import de.urszeidler.eclipse.shr5.CritterReichweite;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.Drohne;
import de.urszeidler.eclipse.shr5.Echo;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.FahrzeugModifikation;
import de.urszeidler.eclipse.shr5.Fakeable;
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.GegenstandStufen;
import de.urszeidler.eclipse.shr5.GeistigeAttribute;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.IntervallVertrag;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.KoerperlicheAttribute;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.Lizenz;
import de.urszeidler.eclipse.shr5.MagazinTyp;
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.MagischeMods;
import de.urszeidler.eclipse.shr5.MagischePersona;
import de.urszeidler.eclipse.shr5.MagischeTradition;
import de.urszeidler.eclipse.shr5.MetaMagie;
import de.urszeidler.eclipse.shr5.ModSetter;
import de.urszeidler.eclipse.shr5.ModifikatorType;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.MudanPersona;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.Panzerung;
import de.urszeidler.eclipse.shr5.PassagierFahrzeug;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.PersonaZustand;
import de.urszeidler.eclipse.shr5.ProbenModifikatoren;
import de.urszeidler.eclipse.shr5.Projektilwaffe;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.ResonanzPersona;
import de.urszeidler.eclipse.shr5.ResonanzZiel;
import de.urszeidler.eclipse.shr5.SchadensTyp;
import de.urszeidler.eclipse.shr5.Schutzgeist;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Sichtverhaeltnisse;
import de.urszeidler.eclipse.shr5.Sin;
import de.urszeidler.eclipse.shr5.SmartgunType;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.SpezielleAttribute;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Sprachfertigkeit;
import de.urszeidler.eclipse.shr5.Sprite;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5.Wissensfertigkeit;
import de.urszeidler.eclipse.shr5.Wurfwaffe;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.ZauberArt;
import de.urszeidler.eclipse.shr5.ZauberDauer;
import de.urszeidler.eclipse.shr5.ZauberReichweite;
import de.urszeidler.eclipse.shr5.Zauberer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5PackageImpl extends EPackageImpl implements Shr5Package {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass beschreibbarEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass quelleEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sourceBookEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstraktPersonaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gegenstandEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass geldWertEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass reichweiteEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass attributModifikatorWertEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass modifizierbarEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass koerperlicheAttributeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass spezielleAttributeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstraktGegenstandEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstaktFernKampfwaffeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstaktWaffeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass nahkampfwaffeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass feuerwaffeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wurfwaffeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass shrListEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass projektilwaffeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fertigkeitsGruppeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fertigkeitEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass personaFertigkeitEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass personaFertigkeitsGruppeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cyberwareEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bioWareEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass koerpermodsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstraktModifikatorenEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass geistigeAttributeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mudanPersonaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass koerperPersonaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass magischeModsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass kiKraftEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass magischePersonaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass baseMagischePersonaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fernkampfwaffenModifikatorenEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sichtverhaeltnisseEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass speziesEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gegenstandStufenEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass kiAdeptEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass kleidungEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fernkampfwaffeModifikatorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass anwendbarEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass personaEigenschaftEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass probenModifikatorenEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass magierEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass zaubererEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mysticAdeptEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass personaZauberEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass zauberEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass chrakterLimitsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass panzerungEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass aspektMagierEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass astraleProjektionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass schutzgeistEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass initationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass metaMagieEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass critterKraftEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fahrzeugEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bodenfahrzeugEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass passagierFahrzeugEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass drohneEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fahrzeugModifikationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass technomancerEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resonanzPersonaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass komplexeFormEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass personaKomplexFormEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass spriteEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass echoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass vertragEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass lifestyleEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wissensfertigkeitEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sprachfertigkeitEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass personaZustandEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass critterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intervallVertragEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sinEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lizenzEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fakeableEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum feuerModusEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum schadensTypEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum magazinTypEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum feuwerwaffenErweiterungEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum modifikatorTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum smartgunTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum zauberArtEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum zauberReichweiteEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum zauberDauerEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum magischeTraditionEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum critterHandlungEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum critterReichweiteEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum critterDauerEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum resonanzZielEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType shrDateEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType modificationManagerEDataType = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.urszeidler.eclipse.shr5.Shr5Package#eNS_URI
     * @see #init()
     * @generated
     */
	private Shr5PackageImpl() {
        super(eNS_URI, Shr5Factory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link Shr5Package#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static Shr5Package init() {
        if (isInited) return (Shr5Package)EPackage.Registry.INSTANCE.getEPackage(Shr5Package.eNS_URI);

        // Obtain or create and register package
        Shr5PackageImpl theShr5Package = (Shr5PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Shr5PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Shr5PackageImpl());

        isInited = true;

        // Create package meta-data objects
        theShr5Package.createPackageContents();

        // Initialize created meta-data
        theShr5Package.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theShr5Package.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Shr5Package.eNS_URI, theShr5Package);
        return theShr5Package;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBeschreibbar() {
        return beschreibbarEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeschreibbar_Name() {
        return (EAttribute)beschreibbarEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeschreibbar_Beschreibung() {
        return (EAttribute)beschreibbarEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeschreibbar_Image() {
        return (EAttribute)beschreibbarEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuelle() {
        return quelleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getQuelle_Page() {
        return (EAttribute)quelleEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getQuelle_SrcBook() {
        return (EReference)quelleEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSourceBook() {
        return sourceBookEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSourceBook_StartShrTime() {
        return (EAttribute)sourceBookEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSourceBook_EndShrTime() {
        return (EAttribute)sourceBookEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstraktPersona() {
        return abstraktPersonaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstraktPersona_KonstitutionBasis() {
        return (EAttribute)abstraktPersonaEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstraktPersona_GeschicklichkeitBasis() {
        return (EAttribute)abstraktPersonaEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstraktPersona_ReaktionBasis() {
        return (EAttribute)abstraktPersonaEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstraktPersona_StaerkeBasis() {
        return (EAttribute)abstraktPersonaEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstraktPersona_CharismaBasis() {
        return (EAttribute)abstraktPersonaEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstraktPersona_WillenskraftBasis() {
        return (EAttribute)abstraktPersonaEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstraktPersona_IntuitionBasis() {
        return (EAttribute)abstraktPersonaEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstraktPersona_LogikBasis() {
        return (EAttribute)abstraktPersonaEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAbstraktPersona_Fertigkeiten() {
        return (EReference)abstraktPersonaEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAbstraktPersona_FertigkeitsGruppen() {
        return (EReference)abstraktPersonaEClass.getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAbstraktPersona_Spezies() {
        return (EReference)abstraktPersonaEClass.getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstraktPersona_ModManager() {
        return (EAttribute)abstraktPersonaEClass.getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGegenstand() {
        return gegenstandEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGegenstand_Kategorie() {
        return (EAttribute)gegenstandEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGegenstand_Stufe() {
        return (EAttribute)gegenstandEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGeldWert() {
        return geldWertEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGeldWert_Wert() {
        return (EAttribute)geldWertEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGeldWert_Verfuegbarkeit() {
        return (EAttribute)geldWertEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getReichweite() {
        return reichweiteEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getReichweite_Min() {
        return (EAttribute)reichweiteEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getReichweite_Kurz() {
        return (EAttribute)reichweiteEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getReichweite_Mittel() {
        return (EAttribute)reichweiteEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getReichweite_Weit() {
        return (EAttribute)reichweiteEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getReichweite_Extrem() {
        return (EAttribute)reichweiteEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAttributModifikatorWert() {
        return attributModifikatorWertEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAttributModifikatorWert_Attribut() {
        return (EReference)attributModifikatorWertEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAttributModifikatorWert_Wert() {
        return (EAttribute)attributModifikatorWertEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAttributModifikatorWert_Modifiziertes() {
        return (EReference)attributModifikatorWertEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getModifizierbar() {
        return modifizierbarEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getModifizierbar_Mods() {
        return (EReference)modifizierbarEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKoerperlicheAttribute() {
        return koerperlicheAttributeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKoerperlicheAttribute_Konstitution() {
        return (EAttribute)koerperlicheAttributeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKoerperlicheAttribute_Geschicklichkeit() {
        return (EAttribute)koerperlicheAttributeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKoerperlicheAttribute_Reaktion() {
        return (EAttribute)koerperlicheAttributeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKoerperlicheAttribute_Staerke() {
        return (EAttribute)koerperlicheAttributeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSpezielleAttribute() {
        return spezielleAttributeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezielleAttribute_Initative() {
        return (EAttribute)spezielleAttributeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezielleAttribute_InitativWuerfel() {
        return (EAttribute)spezielleAttributeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezielleAttribute_Ausweichen() {
        return (EAttribute)spezielleAttributeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezielleAttribute_Essenz() {
        return (EAttribute)spezielleAttributeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezielleAttribute_EdgeBasis() {
        return (EAttribute)spezielleAttributeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezielleAttribute_Edge() {
        return (EAttribute)spezielleAttributeEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstraktGegenstand() {
        return abstraktGegenstandEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstaktFernKampfwaffe() {
        return abstaktFernKampfwaffeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAbstaktFernKampfwaffe_Reichweite() {
        return (EReference)abstaktFernKampfwaffeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstaktWaffe() {
        return abstaktWaffeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstaktWaffe_Schadenscode() {
        return (EAttribute)abstaktWaffeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstaktWaffe_SchadesTyp() {
        return (EAttribute)abstaktWaffeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstaktWaffe_Praezision() {
        return (EAttribute)abstaktWaffeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstaktWaffe_DurchschlagsKraft() {
        return (EAttribute)abstaktWaffeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNahkampfwaffe() {
        return nahkampfwaffeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNahkampfwaffe_Reichweite() {
        return (EAttribute)nahkampfwaffeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFeuerwaffe() {
        return feuerwaffeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFeuerwaffe_Munitionstyp() {
        return (EAttribute)feuerwaffeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFeuerwaffe_Modie() {
        return (EAttribute)feuerwaffeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFeuerwaffe_Kapazitaet() {
        return (EAttribute)feuerwaffeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFeuerwaffe_Erweiterung() {
        return (EAttribute)feuerwaffeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFeuerwaffe_Rueckstoss() {
        return (EAttribute)feuerwaffeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFeuerwaffe_Einbau() {
        return (EReference)feuerwaffeEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWurfwaffe() {
        return wurfwaffeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getShrList() {
        return shrListEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getShrList_Entries() {
        return (EReference)shrListEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getProjektilwaffe() {
        return projektilwaffeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFertigkeitsGruppe() {
        return fertigkeitsGruppeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFertigkeitsGruppe_Fertigkeiten() {
        return (EReference)fertigkeitsGruppeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFertigkeit() {
        return fertigkeitEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFertigkeit_Kategorie() {
        return (EAttribute)fertigkeitEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFertigkeit_Ausweichen() {
        return (EAttribute)fertigkeitEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFertigkeit_Attribut() {
        return (EReference)fertigkeitEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFertigkeit_Spezialisierungen() {
        return (EAttribute)fertigkeitEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPersonaFertigkeit() {
        return personaFertigkeitEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPersonaFertigkeit_Fertigkeit() {
        return (EReference)personaFertigkeitEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPersonaFertigkeit_Stufe() {
        return (EAttribute)personaFertigkeitEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPersonaFertigkeitsGruppe() {
        return personaFertigkeitsGruppeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPersonaFertigkeitsGruppe_Gruppe() {
        return (EReference)personaFertigkeitsGruppeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPersonaFertigkeitsGruppe_Stufe() {
        return (EAttribute)personaFertigkeitsGruppeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCyberware() {
        return cyberwareEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCyberware_Persona() {
        return (EReference)cyberwareEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCyberware_Einbau() {
        return (EReference)cyberwareEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBioWare() {
        return bioWareEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBioWare_Persona() {
        return (EReference)bioWareEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKoerpermods() {
        return koerpermodsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstraktModifikatoren() {
        return abstraktModifikatorenEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGeistigeAttribute() {
        return geistigeAttributeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGeistigeAttribute_Charisma() {
        return (EAttribute)geistigeAttributeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGeistigeAttribute_Willenskraft() {
        return (EAttribute)geistigeAttributeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGeistigeAttribute_Intuition() {
        return (EAttribute)geistigeAttributeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGeistigeAttribute_Logik() {
        return (EAttribute)geistigeAttributeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMudanPersona() {
        return mudanPersonaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKoerperPersona() {
        return koerperPersonaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getKoerperPersona_KoerperMods() {
        return (EReference)koerperPersonaEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getKoerperPersona_Eigenschaften() {
        return (EReference)koerperPersonaEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKoerperPersona_ZustandKoerperlich() {
        return (EAttribute)koerperPersonaEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKoerperPersona_ZustandGeistig() {
        return (EAttribute)koerperPersonaEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMagischeMods() {
        return magischeModsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKiKraft() {
        return kiKraftEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKiKraft_Kraftpunkte() {
        return (EAttribute)kiKraftEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMagischePersona() {
        return magischePersonaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMagischePersona_Mentor() {
        return (EReference)magischePersonaEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBaseMagischePersona() {
        return baseMagischePersonaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBaseMagischePersona_Magie() {
        return (EAttribute)baseMagischePersonaEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBaseMagischePersona_Initationen() {
        return (EReference)baseMagischePersonaEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBaseMagischePersona_MagieBasis() {
        return (EAttribute)baseMagischePersonaEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFernkampfwaffenModifikatoren() {
        return fernkampfwaffenModifikatorenEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFernkampfwaffenModifikatoren_Smartgun() {
        return (EAttribute)fernkampfwaffenModifikatorenEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFernkampfwaffenModifikatoren_Rueckstoss() {
        return (EAttribute)fernkampfwaffenModifikatorenEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFernkampfwaffenModifikatoren_LasterPointer() {
        return (EAttribute)fernkampfwaffenModifikatorenEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFernkampfwaffenModifikatoren_Schalldaempfer() {
        return (EAttribute)fernkampfwaffenModifikatorenEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFernkampfwaffenModifikatoren_Vergroesserung() {
        return (EAttribute)fernkampfwaffenModifikatorenEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSichtverhaeltnisse() {
        return sichtverhaeltnisseEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSichtverhaeltnisse_Restlichtverstaerkung() {
        return (EAttribute)sichtverhaeltnisseEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSichtverhaeltnisse_Infrarot() {
        return (EAttribute)sichtverhaeltnisseEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSichtverhaeltnisse_Ultrasound() {
        return (EAttribute)sichtverhaeltnisseEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSpezies() {
        return speziesEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_KonstitutionMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_GeschicklichkeitMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_ReaktionMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_StaerkeMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_CharismaMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_WillenskraftMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_IntuitionMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_LogikMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_EdgeMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_MagieMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_ResonanzMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_EssenzMin() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_KonstitutionMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_GeschicklichkeitMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_ReaktionMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_StaerkeMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_CharismaMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_WillenskraftMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_IntuitionMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_LogikMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_EdgeMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_MagieMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_ResonanzMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_EssenzMax() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_Laufen() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_Rennen() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpezies_Sprinten() {
        return (EAttribute)speziesEClass.getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGegenstandStufen() {
        return gegenstandStufenEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGegenstandStufen_Computer() {
        return (EAttribute)gegenstandStufenEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGegenstandStufen_Elektronik() {
        return (EAttribute)gegenstandStufenEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGegenstandStufen_Tracing() {
        return (EAttribute)gegenstandStufenEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGegenstandStufen_AntiTracing() {
        return (EAttribute)gegenstandStufenEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGegenstandStufen_Protection() {
        return (EAttribute)gegenstandStufenEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGegenstandStufen_AntiProtection() {
        return (EAttribute)gegenstandStufenEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKiAdept() {
        return kiAdeptEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getKiAdept_Kikraft() {
        return (EReference)kiAdeptEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKleidung() {
        return kleidungEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKleidung_Ruestung() {
        return (EAttribute)kleidungEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFernkampfwaffeModifikator() {
        return fernkampfwaffeModifikatorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFernkampfwaffeModifikator_Ep() {
        return (EAttribute)fernkampfwaffeModifikatorEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAnwendbar() {
        return anwendbarEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAnwendbar_Fertigkeit() {
        return (EReference)anwendbarEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPersonaEigenschaft() {
        return personaEigenschaftEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPersonaEigenschaft_KarmaKosten() {
        return (EAttribute)personaEigenschaftEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getProbenModifikatoren() {
        return probenModifikatorenEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProbenModifikatoren_Schadenswiederstand() {
        return (EAttribute)probenModifikatorenEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProbenModifikatoren_Heilung() {
        return (EAttribute)probenModifikatorenEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMagier() {
        return magierEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getZauberer() {
        return zaubererEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getZauberer_Zauber() {
        return (EReference)zaubererEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZauberer_Enzug() {
        return (EAttribute)zaubererEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZauberer_Tradition() {
        return (EAttribute)zaubererEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMysticAdept() {
        return mysticAdeptEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPersonaZauber() {
        return personaZauberEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPersonaZauber_Stufe() {
        return (EAttribute)personaZauberEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPersonaZauber_Formel() {
        return (EReference)personaZauberEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getZauber() {
        return zauberEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZauber_Art() {
        return (EAttribute)zauberEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZauber_Reichweite() {
        return (EAttribute)zauberEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZauber_Schaden() {
        return (EAttribute)zauberEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZauber_Dauer() {
        return (EAttribute)zauberEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZauber_Entzug() {
        return (EAttribute)zauberEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZauber_Kategorie() {
        return (EAttribute)zauberEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZauber_Merkmale() {
        return (EAttribute)zauberEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getChrakterLimits() {
        return chrakterLimitsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getChrakterLimits_Koerperlich() {
        return (EAttribute)chrakterLimitsEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getChrakterLimits_Geistig() {
        return (EAttribute)chrakterLimitsEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getChrakterLimits_Sozial() {
        return (EAttribute)chrakterLimitsEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPanzerung() {
        return panzerungEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPanzerung_Panzer() {
        return (EAttribute)panzerungEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAspektMagier() {
        return aspektMagierEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAspektMagier_Aspekt() {
        return (EReference)aspektMagierEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAstraleProjektion() {
        return astraleProjektionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAstraleProjektion_AstralesLimit() {
        return (EAttribute)astraleProjektionEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAstraleProjektion_AstraleKonstitution() {
        return (EAttribute)astraleProjektionEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAstraleProjektion_AstraleGeschicklichkeit() {
        return (EAttribute)astraleProjektionEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAstraleProjektion_AstraleReaktion() {
        return (EAttribute)astraleProjektionEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAstraleProjektion_AstraleStaerke() {
        return (EAttribute)astraleProjektionEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAstraleProjektion_AstraleInitative() {
        return (EAttribute)astraleProjektionEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAstraleProjektion_AstraleInitativWuerfel() {
        return (EAttribute)astraleProjektionEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAstraleProjektion_AstralePanzerung() {
        return (EAttribute)astraleProjektionEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSchutzgeist() {
        return schutzgeistEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSchutzgeist_Vorteile() {
        return (EAttribute)schutzgeistEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSchutzgeist_Nachteile() {
        return (EAttribute)schutzgeistEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInitation() {
        return initationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInitation_Stufe() {
        return (EAttribute)initationEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getInitation_Erlernt() {
        return (EReference)initationEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMetaMagie() {
        return metaMagieEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCritterKraft() {
        return critterKraftEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCritterKraft_Art() {
        return (EAttribute)critterKraftEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCritterKraft_Handlung() {
        return (EAttribute)critterKraftEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCritterKraft_Reichweite() {
        return (EAttribute)critterKraftEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCritterKraft_Dauer() {
        return (EAttribute)critterKraftEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFahrzeug() {
        return fahrzeugEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFahrzeug_Handling() {
        return (EAttribute)fahrzeugEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFahrzeug_Geschwindigkeit() {
        return (EAttribute)fahrzeugEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFahrzeug_Beschleunigung() {
        return (EAttribute)fahrzeugEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFahrzeug_Rumpf() {
        return (EAttribute)fahrzeugEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFahrzeug_Pilot() {
        return (EAttribute)fahrzeugEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFahrzeug_Sensor() {
        return (EAttribute)fahrzeugEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFahrzeug_FahrzeugTyp() {
        return (EAttribute)fahrzeugEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFahrzeug_Modifizierungen() {
        return (EReference)fahrzeugEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBodenfahrzeug() {
        return bodenfahrzeugEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBodenfahrzeug_HandlingGelaende() {
        return (EAttribute)bodenfahrzeugEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBodenfahrzeug_GeschwindigkeitGelände() {
        return (EAttribute)bodenfahrzeugEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPassagierFahrzeug() {
        return passagierFahrzeugEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPassagierFahrzeug_Sitze() {
        return (EAttribute)passagierFahrzeugEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDrohne() {
        return drohneEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFahrzeugModifikation() {
        return fahrzeugModifikationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFahrzeugModifikation_Funktion() {
        return (EReference)fahrzeugModifikationEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTechnomancer() {
        return technomancerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTechnomancer_ComplexForms() {
        return (EReference)technomancerEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTechnomancer_Echos() {
        return (EReference)technomancerEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResonanzPersona() {
        return resonanzPersonaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResonanzPersona_Resonanz() {
        return (EAttribute)resonanzPersonaEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResonanzPersona_Geraetestufe() {
        return (EAttribute)resonanzPersonaEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResonanzPersona_Angriff() {
        return (EAttribute)resonanzPersonaEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResonanzPersona_Schleicher() {
        return (EAttribute)resonanzPersonaEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResonanzPersona_Datenverarbeitung() {
        return (EAttribute)resonanzPersonaEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResonanzPersona_Firewall() {
        return (EAttribute)resonanzPersonaEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResonanzPersona_ResonanzBasis() {
        return (EAttribute)resonanzPersonaEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKomplexeForm() {
        return komplexeFormEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKomplexeForm_Ziel() {
        return (EAttribute)komplexeFormEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKomplexeForm_Dauer() {
        return (EAttribute)komplexeFormEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKomplexeForm_Schwund() {
        return (EAttribute)komplexeFormEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPersonaKomplexForm() {
        return personaKomplexFormEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPersonaKomplexForm_Form() {
        return (EReference)personaKomplexFormEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPersonaKomplexForm_Stufe() {
        return (EAttribute)personaKomplexFormEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSprite() {
        return spriteEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSprite_Stufe() {
        return (EAttribute)spriteEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSprite_AngriffMod() {
        return (EAttribute)spriteEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSprite_SchleicherMod() {
        return (EAttribute)spriteEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSprite_DatenverarbeitungMod() {
        return (EAttribute)spriteEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSprite_FirewallMod() {
        return (EAttribute)spriteEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSprite_InitativeMod() {
        return (EAttribute)spriteEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEcho() {
        return echoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getVertrag() {
        return vertragEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLifestyle() {
        return lifestyleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWissensfertigkeit() {
        return wissensfertigkeitEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSprachfertigkeit() {
        return sprachfertigkeitEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPersonaZustand() {
        return personaZustandEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPersonaZustand_ZustandKoerperlichMax() {
        return (EAttribute)personaZustandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPersonaZustand_ZustandGeistigMax() {
        return (EAttribute)personaZustandEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPersonaZustand_ZustandGrenze() {
        return (EAttribute)personaZustandEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCritter() {
        return critterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCritter_Kraefte() {
        return (EReference)critterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntervallVertrag() {
        return intervallVertragEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntervallVertrag_FaelligkeitsIntervall() {
        return (EAttribute)intervallVertragEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSin() {
        return sinEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLizenz() {
        return lizenzEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLizenz_LizenGegenstand() {
        return (EAttribute)lizenzEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLizenz_LizenzTraeger() {
        return (EReference)lizenzEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFakeable() {
        return fakeableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFakeable_Stufe() {
        return (EAttribute)fakeableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFakeable_Gefaelscht() {
        return (EAttribute)fakeableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFeuerModus() {
        return feuerModusEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSchadensTyp() {
        return schadensTypEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMagazinTyp() {
        return magazinTypEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFeuwerwaffenErweiterung() {
        return feuwerwaffenErweiterungEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getModifikatorType() {
        return modifikatorTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSmartgunType() {
        return smartgunTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getZauberArt() {
        return zauberArtEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getZauberReichweite() {
        return zauberReichweiteEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getZauberDauer() {
        return zauberDauerEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMagischeTradition() {
        return magischeTraditionEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCritterHandlung() {
        return critterHandlungEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCritterReichweite() {
        return critterReichweiteEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCritterDauer() {
        return critterDauerEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getResonanzZiel() {
        return resonanzZielEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getShrDate() {
        return shrDateEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getModificationManager() {
        return modificationManagerEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5Factory getShr5Factory() {
        return (Shr5Factory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        beschreibbarEClass = createEClass(BESCHREIBBAR);
        createEAttribute(beschreibbarEClass, BESCHREIBBAR__BESCHREIBUNG);
        createEAttribute(beschreibbarEClass, BESCHREIBBAR__IMAGE);
        createEAttribute(beschreibbarEClass, BESCHREIBBAR__NAME);

        quelleEClass = createEClass(QUELLE);
        createEAttribute(quelleEClass, QUELLE__PAGE);
        createEReference(quelleEClass, QUELLE__SRC_BOOK);

        sourceBookEClass = createEClass(SOURCE_BOOK);
        createEAttribute(sourceBookEClass, SOURCE_BOOK__START_SHR_TIME);
        createEAttribute(sourceBookEClass, SOURCE_BOOK__END_SHR_TIME);

        abstraktPersonaEClass = createEClass(ABSTRAKT_PERSONA);
        createEAttribute(abstraktPersonaEClass, ABSTRAKT_PERSONA__KONSTITUTION_BASIS);
        createEAttribute(abstraktPersonaEClass, ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS);
        createEAttribute(abstraktPersonaEClass, ABSTRAKT_PERSONA__REAKTION_BASIS);
        createEAttribute(abstraktPersonaEClass, ABSTRAKT_PERSONA__STAERKE_BASIS);
        createEAttribute(abstraktPersonaEClass, ABSTRAKT_PERSONA__CHARISMA_BASIS);
        createEAttribute(abstraktPersonaEClass, ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS);
        createEAttribute(abstraktPersonaEClass, ABSTRAKT_PERSONA__INTUITION_BASIS);
        createEAttribute(abstraktPersonaEClass, ABSTRAKT_PERSONA__LOGIK_BASIS);
        createEReference(abstraktPersonaEClass, ABSTRAKT_PERSONA__FERTIGKEITEN);
        createEReference(abstraktPersonaEClass, ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN);
        createEReference(abstraktPersonaEClass, ABSTRAKT_PERSONA__SPEZIES);
        createEAttribute(abstraktPersonaEClass, ABSTRAKT_PERSONA__MOD_MANAGER);

        gegenstandEClass = createEClass(GEGENSTAND);
        createEAttribute(gegenstandEClass, GEGENSTAND__KATEGORIE);
        createEAttribute(gegenstandEClass, GEGENSTAND__STUFE);

        geldWertEClass = createEClass(GELD_WERT);
        createEAttribute(geldWertEClass, GELD_WERT__WERT);
        createEAttribute(geldWertEClass, GELD_WERT__VERFUEGBARKEIT);

        reichweiteEClass = createEClass(REICHWEITE);
        createEAttribute(reichweiteEClass, REICHWEITE__MIN);
        createEAttribute(reichweiteEClass, REICHWEITE__KURZ);
        createEAttribute(reichweiteEClass, REICHWEITE__MITTEL);
        createEAttribute(reichweiteEClass, REICHWEITE__WEIT);
        createEAttribute(reichweiteEClass, REICHWEITE__EXTREM);

        attributModifikatorWertEClass = createEClass(ATTRIBUT_MODIFIKATOR_WERT);
        createEReference(attributModifikatorWertEClass, ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT);
        createEAttribute(attributModifikatorWertEClass, ATTRIBUT_MODIFIKATOR_WERT__WERT);
        createEReference(attributModifikatorWertEClass, ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES);

        modifizierbarEClass = createEClass(MODIFIZIERBAR);
        createEReference(modifizierbarEClass, MODIFIZIERBAR__MODS);

        koerperlicheAttributeEClass = createEClass(KOERPERLICHE_ATTRIBUTE);
        createEAttribute(koerperlicheAttributeEClass, KOERPERLICHE_ATTRIBUTE__KONSTITUTION);
        createEAttribute(koerperlicheAttributeEClass, KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);
        createEAttribute(koerperlicheAttributeEClass, KOERPERLICHE_ATTRIBUTE__REAKTION);
        createEAttribute(koerperlicheAttributeEClass, KOERPERLICHE_ATTRIBUTE__STAERKE);

        spezielleAttributeEClass = createEClass(SPEZIELLE_ATTRIBUTE);
        createEAttribute(spezielleAttributeEClass, SPEZIELLE_ATTRIBUTE__INITATIVE);
        createEAttribute(spezielleAttributeEClass, SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL);
        createEAttribute(spezielleAttributeEClass, SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
        createEAttribute(spezielleAttributeEClass, SPEZIELLE_ATTRIBUTE__ESSENZ);
        createEAttribute(spezielleAttributeEClass, SPEZIELLE_ATTRIBUTE__EDGE_BASIS);
        createEAttribute(spezielleAttributeEClass, SPEZIELLE_ATTRIBUTE__EDGE);

        abstraktGegenstandEClass = createEClass(ABSTRAKT_GEGENSTAND);

        abstaktFernKampfwaffeEClass = createEClass(ABSTAKT_FERN_KAMPFWAFFE);
        createEReference(abstaktFernKampfwaffeEClass, ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE);

        abstaktWaffeEClass = createEClass(ABSTAKT_WAFFE);
        createEAttribute(abstaktWaffeEClass, ABSTAKT_WAFFE__SCHADENSCODE);
        createEAttribute(abstaktWaffeEClass, ABSTAKT_WAFFE__SCHADES_TYP);
        createEAttribute(abstaktWaffeEClass, ABSTAKT_WAFFE__PRAEZISION);
        createEAttribute(abstaktWaffeEClass, ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT);

        nahkampfwaffeEClass = createEClass(NAHKAMPFWAFFE);
        createEAttribute(nahkampfwaffeEClass, NAHKAMPFWAFFE__REICHWEITE);

        feuerwaffeEClass = createEClass(FEUERWAFFE);
        createEAttribute(feuerwaffeEClass, FEUERWAFFE__MUNITIONSTYP);
        createEAttribute(feuerwaffeEClass, FEUERWAFFE__MODIE);
        createEAttribute(feuerwaffeEClass, FEUERWAFFE__KAPAZITAET);
        createEAttribute(feuerwaffeEClass, FEUERWAFFE__ERWEITERUNG);
        createEAttribute(feuerwaffeEClass, FEUERWAFFE__RUECKSTOSS);
        createEReference(feuerwaffeEClass, FEUERWAFFE__EINBAU);

        wurfwaffeEClass = createEClass(WURFWAFFE);

        shrListEClass = createEClass(SHR_LIST);
        createEReference(shrListEClass, SHR_LIST__ENTRIES);

        projektilwaffeEClass = createEClass(PROJEKTILWAFFE);

        fertigkeitsGruppeEClass = createEClass(FERTIGKEITS_GRUPPE);
        createEReference(fertigkeitsGruppeEClass, FERTIGKEITS_GRUPPE__FERTIGKEITEN);

        fertigkeitEClass = createEClass(FERTIGKEIT);
        createEAttribute(fertigkeitEClass, FERTIGKEIT__KATEGORIE);
        createEAttribute(fertigkeitEClass, FERTIGKEIT__AUSWEICHEN);
        createEReference(fertigkeitEClass, FERTIGKEIT__ATTRIBUT);
        createEAttribute(fertigkeitEClass, FERTIGKEIT__SPEZIALISIERUNGEN);

        personaFertigkeitEClass = createEClass(PERSONA_FERTIGKEIT);
        createEReference(personaFertigkeitEClass, PERSONA_FERTIGKEIT__FERTIGKEIT);
        createEAttribute(personaFertigkeitEClass, PERSONA_FERTIGKEIT__STUFE);

        personaFertigkeitsGruppeEClass = createEClass(PERSONA_FERTIGKEITS_GRUPPE);
        createEReference(personaFertigkeitsGruppeEClass, PERSONA_FERTIGKEITS_GRUPPE__GRUPPE);
        createEAttribute(personaFertigkeitsGruppeEClass, PERSONA_FERTIGKEITS_GRUPPE__STUFE);

        cyberwareEClass = createEClass(CYBERWARE);
        createEReference(cyberwareEClass, CYBERWARE__PERSONA);
        createEReference(cyberwareEClass, CYBERWARE__EINBAU);

        bioWareEClass = createEClass(BIO_WARE);
        createEReference(bioWareEClass, BIO_WARE__PERSONA);

        koerpermodsEClass = createEClass(KOERPERMODS);

        abstraktModifikatorenEClass = createEClass(ABSTRAKT_MODIFIKATOREN);

        geistigeAttributeEClass = createEClass(GEISTIGE_ATTRIBUTE);
        createEAttribute(geistigeAttributeEClass, GEISTIGE_ATTRIBUTE__CHARISMA);
        createEAttribute(geistigeAttributeEClass, GEISTIGE_ATTRIBUTE__WILLENSKRAFT);
        createEAttribute(geistigeAttributeEClass, GEISTIGE_ATTRIBUTE__INTUITION);
        createEAttribute(geistigeAttributeEClass, GEISTIGE_ATTRIBUTE__LOGIK);

        mudanPersonaEClass = createEClass(MUDAN_PERSONA);

        koerperPersonaEClass = createEClass(KOERPER_PERSONA);
        createEReference(koerperPersonaEClass, KOERPER_PERSONA__KOERPER_MODS);
        createEReference(koerperPersonaEClass, KOERPER_PERSONA__EIGENSCHAFTEN);
        createEAttribute(koerperPersonaEClass, KOERPER_PERSONA__ZUSTAND_KOERPERLICH);
        createEAttribute(koerperPersonaEClass, KOERPER_PERSONA__ZUSTAND_GEISTIG);

        magischeModsEClass = createEClass(MAGISCHE_MODS);

        kiKraftEClass = createEClass(KI_KRAFT);
        createEAttribute(kiKraftEClass, KI_KRAFT__KRAFTPUNKTE);

        magischePersonaEClass = createEClass(MAGISCHE_PERSONA);
        createEReference(magischePersonaEClass, MAGISCHE_PERSONA__MENTOR);

        baseMagischePersonaEClass = createEClass(BASE_MAGISCHE_PERSONA);
        createEAttribute(baseMagischePersonaEClass, BASE_MAGISCHE_PERSONA__MAGIE);
        createEReference(baseMagischePersonaEClass, BASE_MAGISCHE_PERSONA__INITATIONEN);
        createEAttribute(baseMagischePersonaEClass, BASE_MAGISCHE_PERSONA__MAGIE_BASIS);

        fernkampfwaffenModifikatorenEClass = createEClass(FERNKAMPFWAFFEN_MODIFIKATOREN);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__SMARTGUN);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__RUECKSTOSS);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__LASTER_POINTER);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__SCHALLDAEMPFER);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__VERGROESSERUNG);

        sichtverhaeltnisseEClass = createEClass(SICHTVERHAELTNISSE);
        createEAttribute(sichtverhaeltnisseEClass, SICHTVERHAELTNISSE__RESTLICHTVERSTAERKUNG);
        createEAttribute(sichtverhaeltnisseEClass, SICHTVERHAELTNISSE__INFRAROT);
        createEAttribute(sichtverhaeltnisseEClass, SICHTVERHAELTNISSE__ULTRASOUND);

        speziesEClass = createEClass(SPEZIES);
        createEAttribute(speziesEClass, SPEZIES__KONSTITUTION_MIN);
        createEAttribute(speziesEClass, SPEZIES__GESCHICKLICHKEIT_MIN);
        createEAttribute(speziesEClass, SPEZIES__REAKTION_MIN);
        createEAttribute(speziesEClass, SPEZIES__STAERKE_MIN);
        createEAttribute(speziesEClass, SPEZIES__CHARISMA_MIN);
        createEAttribute(speziesEClass, SPEZIES__WILLENSKRAFT_MIN);
        createEAttribute(speziesEClass, SPEZIES__INTUITION_MIN);
        createEAttribute(speziesEClass, SPEZIES__LOGIK_MIN);
        createEAttribute(speziesEClass, SPEZIES__EDGE_MIN);
        createEAttribute(speziesEClass, SPEZIES__MAGIE_MIN);
        createEAttribute(speziesEClass, SPEZIES__RESONANZ_MIN);
        createEAttribute(speziesEClass, SPEZIES__ESSENZ_MIN);
        createEAttribute(speziesEClass, SPEZIES__KONSTITUTION_MAX);
        createEAttribute(speziesEClass, SPEZIES__GESCHICKLICHKEIT_MAX);
        createEAttribute(speziesEClass, SPEZIES__REAKTION_MAX);
        createEAttribute(speziesEClass, SPEZIES__STAERKE_MAX);
        createEAttribute(speziesEClass, SPEZIES__CHARISMA_MAX);
        createEAttribute(speziesEClass, SPEZIES__WILLENSKRAFT_MAX);
        createEAttribute(speziesEClass, SPEZIES__INTUITION_MAX);
        createEAttribute(speziesEClass, SPEZIES__LOGIK_MAX);
        createEAttribute(speziesEClass, SPEZIES__EDGE_MAX);
        createEAttribute(speziesEClass, SPEZIES__MAGIE_MAX);
        createEAttribute(speziesEClass, SPEZIES__RESONANZ_MAX);
        createEAttribute(speziesEClass, SPEZIES__ESSENZ_MAX);
        createEAttribute(speziesEClass, SPEZIES__LAUFEN);
        createEAttribute(speziesEClass, SPEZIES__RENNEN);
        createEAttribute(speziesEClass, SPEZIES__SPRINTEN);

        gegenstandStufenEClass = createEClass(GEGENSTAND_STUFEN);
        createEAttribute(gegenstandStufenEClass, GEGENSTAND_STUFEN__COMPUTER);
        createEAttribute(gegenstandStufenEClass, GEGENSTAND_STUFEN__ELEKTRONIK);
        createEAttribute(gegenstandStufenEClass, GEGENSTAND_STUFEN__TRACING);
        createEAttribute(gegenstandStufenEClass, GEGENSTAND_STUFEN__ANTI_TRACING);
        createEAttribute(gegenstandStufenEClass, GEGENSTAND_STUFEN__PROTECTION);
        createEAttribute(gegenstandStufenEClass, GEGENSTAND_STUFEN__ANTI_PROTECTION);

        kiAdeptEClass = createEClass(KI_ADEPT);
        createEReference(kiAdeptEClass, KI_ADEPT__KIKRAFT);

        kleidungEClass = createEClass(KLEIDUNG);
        createEAttribute(kleidungEClass, KLEIDUNG__RUESTUNG);

        fernkampfwaffeModifikatorEClass = createEClass(FERNKAMPFWAFFE_MODIFIKATOR);
        createEAttribute(fernkampfwaffeModifikatorEClass, FERNKAMPFWAFFE_MODIFIKATOR__EP);

        anwendbarEClass = createEClass(ANWENDBAR);
        createEReference(anwendbarEClass, ANWENDBAR__FERTIGKEIT);

        personaEigenschaftEClass = createEClass(PERSONA_EIGENSCHAFT);
        createEAttribute(personaEigenschaftEClass, PERSONA_EIGENSCHAFT__KARMA_KOSTEN);

        probenModifikatorenEClass = createEClass(PROBEN_MODIFIKATOREN);
        createEAttribute(probenModifikatorenEClass, PROBEN_MODIFIKATOREN__SCHADENSWIEDERSTAND);
        createEAttribute(probenModifikatorenEClass, PROBEN_MODIFIKATOREN__HEILUNG);

        magierEClass = createEClass(MAGIER);

        zaubererEClass = createEClass(ZAUBERER);
        createEReference(zaubererEClass, ZAUBERER__ZAUBER);
        createEAttribute(zaubererEClass, ZAUBERER__ENZUG);
        createEAttribute(zaubererEClass, ZAUBERER__TRADITION);

        mysticAdeptEClass = createEClass(MYSTIC_ADEPT);

        personaZauberEClass = createEClass(PERSONA_ZAUBER);
        createEAttribute(personaZauberEClass, PERSONA_ZAUBER__STUFE);
        createEReference(personaZauberEClass, PERSONA_ZAUBER__FORMEL);

        zauberEClass = createEClass(ZAUBER);
        createEAttribute(zauberEClass, ZAUBER__ART);
        createEAttribute(zauberEClass, ZAUBER__REICHWEITE);
        createEAttribute(zauberEClass, ZAUBER__SCHADEN);
        createEAttribute(zauberEClass, ZAUBER__DAUER);
        createEAttribute(zauberEClass, ZAUBER__ENTZUG);
        createEAttribute(zauberEClass, ZAUBER__KATEGORIE);
        createEAttribute(zauberEClass, ZAUBER__MERKMALE);

        chrakterLimitsEClass = createEClass(CHRAKTER_LIMITS);
        createEAttribute(chrakterLimitsEClass, CHRAKTER_LIMITS__KOERPERLICH);
        createEAttribute(chrakterLimitsEClass, CHRAKTER_LIMITS__GEISTIG);
        createEAttribute(chrakterLimitsEClass, CHRAKTER_LIMITS__SOZIAL);

        panzerungEClass = createEClass(PANZERUNG);
        createEAttribute(panzerungEClass, PANZERUNG__PANZER);

        aspektMagierEClass = createEClass(ASPEKT_MAGIER);
        createEReference(aspektMagierEClass, ASPEKT_MAGIER__ASPEKT);

        astraleProjektionEClass = createEClass(ASTRALE_PROJEKTION);
        createEAttribute(astraleProjektionEClass, ASTRALE_PROJEKTION__ASTRALES_LIMIT);
        createEAttribute(astraleProjektionEClass, ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION);
        createEAttribute(astraleProjektionEClass, ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT);
        createEAttribute(astraleProjektionEClass, ASTRALE_PROJEKTION__ASTRALE_REAKTION);
        createEAttribute(astraleProjektionEClass, ASTRALE_PROJEKTION__ASTRALE_STAERKE);
        createEAttribute(astraleProjektionEClass, ASTRALE_PROJEKTION__ASTRALE_INITATIVE);
        createEAttribute(astraleProjektionEClass, ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL);
        createEAttribute(astraleProjektionEClass, ASTRALE_PROJEKTION__ASTRALE_PANZERUNG);

        schutzgeistEClass = createEClass(SCHUTZGEIST);
        createEAttribute(schutzgeistEClass, SCHUTZGEIST__VORTEILE);
        createEAttribute(schutzgeistEClass, SCHUTZGEIST__NACHTEILE);

        initationEClass = createEClass(INITATION);
        createEAttribute(initationEClass, INITATION__STUFE);
        createEReference(initationEClass, INITATION__ERLERNT);

        metaMagieEClass = createEClass(META_MAGIE);

        critterKraftEClass = createEClass(CRITTER_KRAFT);
        createEAttribute(critterKraftEClass, CRITTER_KRAFT__ART);
        createEAttribute(critterKraftEClass, CRITTER_KRAFT__HANDLUNG);
        createEAttribute(critterKraftEClass, CRITTER_KRAFT__REICHWEITE);
        createEAttribute(critterKraftEClass, CRITTER_KRAFT__DAUER);

        fahrzeugEClass = createEClass(FAHRZEUG);
        createEAttribute(fahrzeugEClass, FAHRZEUG__HANDLING);
        createEAttribute(fahrzeugEClass, FAHRZEUG__GESCHWINDIGKEIT);
        createEAttribute(fahrzeugEClass, FAHRZEUG__BESCHLEUNIGUNG);
        createEAttribute(fahrzeugEClass, FAHRZEUG__RUMPF);
        createEAttribute(fahrzeugEClass, FAHRZEUG__PILOT);
        createEAttribute(fahrzeugEClass, FAHRZEUG__SENSOR);
        createEAttribute(fahrzeugEClass, FAHRZEUG__FAHRZEUG_TYP);
        createEReference(fahrzeugEClass, FAHRZEUG__MODIFIZIERUNGEN);

        bodenfahrzeugEClass = createEClass(BODENFAHRZEUG);
        createEAttribute(bodenfahrzeugEClass, BODENFAHRZEUG__HANDLING_GELAENDE);
        createEAttribute(bodenfahrzeugEClass, BODENFAHRZEUG__GESCHWINDIGKEIT_GELÄNDE);

        passagierFahrzeugEClass = createEClass(PASSAGIER_FAHRZEUG);
        createEAttribute(passagierFahrzeugEClass, PASSAGIER_FAHRZEUG__SITZE);

        drohneEClass = createEClass(DROHNE);

        fahrzeugModifikationEClass = createEClass(FAHRZEUG_MODIFIKATION);
        createEReference(fahrzeugModifikationEClass, FAHRZEUG_MODIFIKATION__FUNKTION);

        technomancerEClass = createEClass(TECHNOMANCER);
        createEReference(technomancerEClass, TECHNOMANCER__COMPLEX_FORMS);
        createEReference(technomancerEClass, TECHNOMANCER__ECHOS);

        resonanzPersonaEClass = createEClass(RESONANZ_PERSONA);
        createEAttribute(resonanzPersonaEClass, RESONANZ_PERSONA__RESONANZ);
        createEAttribute(resonanzPersonaEClass, RESONANZ_PERSONA__GERAETESTUFE);
        createEAttribute(resonanzPersonaEClass, RESONANZ_PERSONA__ANGRIFF);
        createEAttribute(resonanzPersonaEClass, RESONANZ_PERSONA__SCHLEICHER);
        createEAttribute(resonanzPersonaEClass, RESONANZ_PERSONA__DATENVERARBEITUNG);
        createEAttribute(resonanzPersonaEClass, RESONANZ_PERSONA__FIREWALL);
        createEAttribute(resonanzPersonaEClass, RESONANZ_PERSONA__RESONANZ_BASIS);

        komplexeFormEClass = createEClass(KOMPLEXE_FORM);
        createEAttribute(komplexeFormEClass, KOMPLEXE_FORM__ZIEL);
        createEAttribute(komplexeFormEClass, KOMPLEXE_FORM__DAUER);
        createEAttribute(komplexeFormEClass, KOMPLEXE_FORM__SCHWUND);

        personaKomplexFormEClass = createEClass(PERSONA_KOMPLEX_FORM);
        createEReference(personaKomplexFormEClass, PERSONA_KOMPLEX_FORM__FORM);
        createEAttribute(personaKomplexFormEClass, PERSONA_KOMPLEX_FORM__STUFE);

        spriteEClass = createEClass(SPRITE);
        createEAttribute(spriteEClass, SPRITE__STUFE);
        createEAttribute(spriteEClass, SPRITE__ANGRIFF_MOD);
        createEAttribute(spriteEClass, SPRITE__SCHLEICHER_MOD);
        createEAttribute(spriteEClass, SPRITE__DATENVERARBEITUNG_MOD);
        createEAttribute(spriteEClass, SPRITE__FIREWALL_MOD);
        createEAttribute(spriteEClass, SPRITE__INITATIVE_MOD);

        echoEClass = createEClass(ECHO);

        vertragEClass = createEClass(VERTRAG);

        lifestyleEClass = createEClass(LIFESTYLE);

        wissensfertigkeitEClass = createEClass(WISSENSFERTIGKEIT);

        sprachfertigkeitEClass = createEClass(SPRACHFERTIGKEIT);

        personaZustandEClass = createEClass(PERSONA_ZUSTAND);
        createEAttribute(personaZustandEClass, PERSONA_ZUSTAND__ZUSTAND_KOERPERLICH_MAX);
        createEAttribute(personaZustandEClass, PERSONA_ZUSTAND__ZUSTAND_GEISTIG_MAX);
        createEAttribute(personaZustandEClass, PERSONA_ZUSTAND__ZUSTAND_GRENZE);

        critterEClass = createEClass(CRITTER);
        createEReference(critterEClass, CRITTER__KRAEFTE);

        intervallVertragEClass = createEClass(INTERVALL_VERTRAG);
        createEAttribute(intervallVertragEClass, INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL);

        sinEClass = createEClass(SIN);

        lizenzEClass = createEClass(LIZENZ);
        createEAttribute(lizenzEClass, LIZENZ__LIZEN_GEGENSTAND);
        createEReference(lizenzEClass, LIZENZ__LIZENZ_TRAEGER);

        fakeableEClass = createEClass(FAKEABLE);
        createEAttribute(fakeableEClass, FAKEABLE__STUFE);
        createEAttribute(fakeableEClass, FAKEABLE__GEFAELSCHT);

        // Create enums
        feuerModusEEnum = createEEnum(FEUER_MODUS);
        schadensTypEEnum = createEEnum(SCHADENS_TYP);
        magazinTypEEnum = createEEnum(MAGAZIN_TYP);
        feuwerwaffenErweiterungEEnum = createEEnum(FEUWERWAFFEN_ERWEITERUNG);
        modifikatorTypeEEnum = createEEnum(MODIFIKATOR_TYPE);
        smartgunTypeEEnum = createEEnum(SMARTGUN_TYPE);
        zauberArtEEnum = createEEnum(ZAUBER_ART);
        zauberReichweiteEEnum = createEEnum(ZAUBER_REICHWEITE);
        zauberDauerEEnum = createEEnum(ZAUBER_DAUER);
        magischeTraditionEEnum = createEEnum(MAGISCHE_TRADITION);
        critterHandlungEEnum = createEEnum(CRITTER_HANDLUNG);
        critterReichweiteEEnum = createEEnum(CRITTER_REICHWEITE);
        critterDauerEEnum = createEEnum(CRITTER_DAUER);
        resonanzZielEEnum = createEEnum(RESONANZ_ZIEL);

        // Create data types
        shrDateEDataType = createEDataType(SHR_DATE);
        modificationManagerEDataType = createEDataType(MODIFICATION_MANAGER);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        sourceBookEClass.getESuperTypes().add(this.getBeschreibbar());
        abstraktPersonaEClass.getESuperTypes().add(this.getBeschreibbar());
        abstraktPersonaEClass.getESuperTypes().add(this.getKoerperlicheAttribute());
        abstraktPersonaEClass.getESuperTypes().add(this.getSpezielleAttribute());
        abstraktPersonaEClass.getESuperTypes().add(this.getGeistigeAttribute());
        abstraktPersonaEClass.getESuperTypes().add(this.getChrakterLimits());
        gegenstandEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        reichweiteEClass.getESuperTypes().add(this.getBeschreibbar());
        abstraktGegenstandEClass.getESuperTypes().add(this.getQuelle());
        abstraktGegenstandEClass.getESuperTypes().add(this.getGeldWert());
        abstraktGegenstandEClass.getESuperTypes().add(this.getBeschreibbar());
        abstraktGegenstandEClass.getESuperTypes().add(this.getModifizierbar());
        abstraktGegenstandEClass.getESuperTypes().add(this.getAnwendbar());
        abstaktFernKampfwaffeEClass.getESuperTypes().add(this.getAbstaktWaffe());
        abstaktWaffeEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        nahkampfwaffeEClass.getESuperTypes().add(this.getAbstaktWaffe());
        feuerwaffeEClass.getESuperTypes().add(this.getAbstaktFernKampfwaffe());
        wurfwaffeEClass.getESuperTypes().add(this.getAbstaktFernKampfwaffe());
        shrListEClass.getESuperTypes().add(this.getBeschreibbar());
        projektilwaffeEClass.getESuperTypes().add(this.getAbstaktFernKampfwaffe());
        fertigkeitsGruppeEClass.getESuperTypes().add(this.getBeschreibbar());
        fertigkeitsGruppeEClass.getESuperTypes().add(this.getQuelle());
        fertigkeitEClass.getESuperTypes().add(this.getBeschreibbar());
        fertigkeitEClass.getESuperTypes().add(this.getQuelle());
        cyberwareEClass.getESuperTypes().add(this.getKoerpermods());
        cyberwareEClass.getESuperTypes().add(this.getGeldWert());
        bioWareEClass.getESuperTypes().add(this.getKoerpermods());
        bioWareEClass.getESuperTypes().add(this.getGeldWert());
        koerpermodsEClass.getESuperTypes().add(this.getAbstraktModifikatoren());
        abstraktModifikatorenEClass.getESuperTypes().add(this.getBeschreibbar());
        abstraktModifikatorenEClass.getESuperTypes().add(this.getModifizierbar());
        abstraktModifikatorenEClass.getESuperTypes().add(this.getQuelle());
        mudanPersonaEClass.getESuperTypes().add(this.getKoerperPersona());
        koerperPersonaEClass.getESuperTypes().add(this.getAbstraktPersona());
        koerperPersonaEClass.getESuperTypes().add(this.getPanzerung());
        koerperPersonaEClass.getESuperTypes().add(this.getPersonaZustand());
        magischeModsEClass.getESuperTypes().add(this.getAbstraktModifikatoren());
        kiKraftEClass.getESuperTypes().add(this.getMagischeMods());
        magischePersonaEClass.getESuperTypes().add(this.getKoerperPersona());
        magischePersonaEClass.getESuperTypes().add(this.getBaseMagischePersona());
        speziesEClass.getESuperTypes().add(this.getBeschreibbar());
        speziesEClass.getESuperTypes().add(this.getModifizierbar());
        speziesEClass.getESuperTypes().add(this.getQuelle());
        kiAdeptEClass.getESuperTypes().add(this.getMagischePersona());
        kleidungEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        fernkampfwaffeModifikatorEClass.getESuperTypes().add(this.getAbstraktModifikatoren());
        personaEigenschaftEClass.getESuperTypes().add(this.getAbstraktModifikatoren());
        magierEClass.getESuperTypes().add(this.getMagischePersona());
        magierEClass.getESuperTypes().add(this.getZauberer());
        magierEClass.getESuperTypes().add(this.getAstraleProjektion());
        mysticAdeptEClass.getESuperTypes().add(this.getKiAdept());
        mysticAdeptEClass.getESuperTypes().add(this.getZauberer());
        zauberEClass.getESuperTypes().add(this.getBeschreibbar());
        zauberEClass.getESuperTypes().add(this.getQuelle());
        aspektMagierEClass.getESuperTypes().add(this.getMagischePersona());
        aspektMagierEClass.getESuperTypes().add(this.getZauberer());
        schutzgeistEClass.getESuperTypes().add(this.getMagischeMods());
        metaMagieEClass.getESuperTypes().add(this.getBeschreibbar());
        metaMagieEClass.getESuperTypes().add(this.getQuelle());
        critterKraftEClass.getESuperTypes().add(this.getMagischeMods());
        fahrzeugEClass.getESuperTypes().add(this.getBeschreibbar());
        fahrzeugEClass.getESuperTypes().add(this.getQuelle());
        fahrzeugEClass.getESuperTypes().add(this.getGeldWert());
        fahrzeugEClass.getESuperTypes().add(this.getAnwendbar());
        bodenfahrzeugEClass.getESuperTypes().add(this.getPassagierFahrzeug());
        passagierFahrzeugEClass.getESuperTypes().add(this.getFahrzeug());
        drohneEClass.getESuperTypes().add(this.getFahrzeug());
        fahrzeugModifikationEClass.getESuperTypes().add(this.getBeschreibbar());
        fahrzeugModifikationEClass.getESuperTypes().add(this.getQuelle());
        fahrzeugModifikationEClass.getESuperTypes().add(this.getGeldWert());
        technomancerEClass.getESuperTypes().add(this.getKoerperPersona());
        technomancerEClass.getESuperTypes().add(this.getResonanzPersona());
        komplexeFormEClass.getESuperTypes().add(this.getQuelle());
        komplexeFormEClass.getESuperTypes().add(this.getBeschreibbar());
        spriteEClass.getESuperTypes().add(this.getResonanzPersona());
        spriteEClass.getESuperTypes().add(this.getBeschreibbar());
        spriteEClass.getESuperTypes().add(this.getQuelle());
        echoEClass.getESuperTypes().add(this.getAbstraktModifikatoren());
        vertragEClass.getESuperTypes().add(this.getBeschreibbar());
        vertragEClass.getESuperTypes().add(this.getQuelle());
        vertragEClass.getESuperTypes().add(this.getGeldWert());
        lifestyleEClass.getESuperTypes().add(this.getIntervallVertrag());
        wissensfertigkeitEClass.getESuperTypes().add(this.getFertigkeit());
        sprachfertigkeitEClass.getESuperTypes().add(this.getWissensfertigkeit());
        critterEClass.getESuperTypes().add(this.getSpezies());
        intervallVertragEClass.getESuperTypes().add(this.getVertrag());
        sinEClass.getESuperTypes().add(this.getFakeable());
        lizenzEClass.getESuperTypes().add(this.getFakeable());
        fakeableEClass.getESuperTypes().add(this.getVertrag());

        // Initialize classes, features, and operations; add parameters
        initEClass(beschreibbarEClass, Beschreibbar.class, "Beschreibbar", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBeschreibbar_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1, Beschreibbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBeschreibbar_Image(), ecorePackage.getEString(), "image", null, 0, 1, Beschreibbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBeschreibbar_Name(), ecorePackage.getEString(), "name", null, 1, 1, Beschreibbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(quelleEClass, Quelle.class, "Quelle", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getQuelle_Page(), ecorePackage.getEString(), "page", null, 0, 1, Quelle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getQuelle_SrcBook(), this.getSourceBook(), null, "srcBook", null, 0, 1, Quelle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sourceBookEClass, SourceBook.class, "SourceBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSourceBook_StartShrTime(), this.getShrDate(), "startShrTime", null, 0, 1, SourceBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSourceBook_EndShrTime(), this.getShrDate(), "endShrTime", null, 0, 1, SourceBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstraktPersonaEClass, AbstraktPersona.class, "AbstraktPersona", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstraktPersona_KonstitutionBasis(), ecorePackage.getEInt(), "konstitutionBasis", null, 0, 1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstraktPersona_GeschicklichkeitBasis(), ecorePackage.getEInt(), "geschicklichkeitBasis", null, 0, 1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstraktPersona_ReaktionBasis(), ecorePackage.getEInt(), "reaktionBasis", null, 0, 1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstraktPersona_StaerkeBasis(), ecorePackage.getEInt(), "staerkeBasis", null, 0, 1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstraktPersona_CharismaBasis(), ecorePackage.getEInt(), "charismaBasis", null, 0, 1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstraktPersona_WillenskraftBasis(), ecorePackage.getEInt(), "willenskraftBasis", null, 0, 1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstraktPersona_IntuitionBasis(), ecorePackage.getEInt(), "intuitionBasis", null, 0, 1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstraktPersona_LogikBasis(), ecorePackage.getEInt(), "logikBasis", null, 0, 1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstraktPersona_Fertigkeiten(), this.getPersonaFertigkeit(), null, "fertigkeiten", null, 0, -1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstraktPersona_FertigkeitsGruppen(), this.getPersonaFertigkeitsGruppe(), null, "fertigkeitsGruppen", null, 0, -1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstraktPersona_Spezies(), this.getSpezies(), null, "spezies", null, 1, 1, AbstraktPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstraktPersona_ModManager(), this.getModificationManager(), "modManager", null, 1, 1, AbstraktPersona.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(gegenstandEClass, Gegenstand.class, "Gegenstand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGegenstand_Kategorie(), ecorePackage.getEString(), "kategorie", null, 0, 1, Gegenstand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGegenstand_Stufe(), ecorePackage.getEInt(), "stufe", null, 0, 1, Gegenstand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(geldWertEClass, GeldWert.class, "GeldWert", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGeldWert_Wert(), ecorePackage.getEBigDecimal(), "wert", null, 0, 1, GeldWert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeldWert_Verfuegbarkeit(), ecorePackage.getEString(), "verfuegbarkeit", null, 0, 1, GeldWert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(reichweiteEClass, Reichweite.class, "Reichweite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getReichweite_Min(), ecorePackage.getEInt(), "min", null, 1, 1, Reichweite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReichweite_Kurz(), ecorePackage.getEInt(), "kurz", null, 1, 1, Reichweite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReichweite_Mittel(), ecorePackage.getEInt(), "mittel", null, 1, 1, Reichweite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReichweite_Weit(), ecorePackage.getEInt(), "weit", null, 1, 1, Reichweite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReichweite_Extrem(), ecorePackage.getEInt(), "extrem", null, 1, 1, Reichweite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributModifikatorWertEClass, AttributModifikatorWert.class, "AttributModifikatorWert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAttributModifikatorWert_Attribut(), ecorePackage.getEAttribute(), null, "attribut", null, 0, 1, AttributModifikatorWert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributModifikatorWert_Wert(), ecorePackage.getEInt(), "wert", null, 0, 1, AttributModifikatorWert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributModifikatorWert_Modifiziertes(), this.getModifizierbar(), this.getModifizierbar_Mods(), "modifiziertes", null, 0, 1, AttributModifikatorWert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modifizierbarEClass, Modifizierbar.class, "Modifizierbar", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModifizierbar_Mods(), this.getAttributModifikatorWert(), this.getAttributModifikatorWert_Modifiziertes(), "mods", null, 0, -1, Modifizierbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(koerperlicheAttributeEClass, KoerperlicheAttribute.class, "KoerperlicheAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKoerperlicheAttribute_Konstitution(), ecorePackage.getEInt(), "konstitution", null, 0, 1, KoerperlicheAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKoerperlicheAttribute_Geschicklichkeit(), ecorePackage.getEInt(), "geschicklichkeit", null, 0, 1, KoerperlicheAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKoerperlicheAttribute_Reaktion(), ecorePackage.getEInt(), "reaktion", null, 0, 1, KoerperlicheAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKoerperlicheAttribute_Staerke(), ecorePackage.getEInt(), "staerke", null, 0, 1, KoerperlicheAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(spezielleAttributeEClass, SpezielleAttribute.class, "SpezielleAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSpezielleAttribute_Initative(), ecorePackage.getEInt(), "initative", null, 1, 1, SpezielleAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezielleAttribute_InitativWuerfel(), ecorePackage.getEInt(), "initativWuerfel", null, 1, 1, SpezielleAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezielleAttribute_Ausweichen(), ecorePackage.getEInt(), "ausweichen", null, 1, 1, SpezielleAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezielleAttribute_Essenz(), ecorePackage.getEInt(), "essenz", null, 1, 1, SpezielleAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezielleAttribute_EdgeBasis(), ecorePackage.getEInt(), "edgeBasis", null, 0, 1, SpezielleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezielleAttribute_Edge(), ecorePackage.getEInt(), "edge", null, 0, 1, SpezielleAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstraktGegenstandEClass, AbstraktGegenstand.class, "AbstraktGegenstand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstaktFernKampfwaffeEClass, AbstaktFernKampfwaffe.class, "AbstaktFernKampfwaffe", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstaktFernKampfwaffe_Reichweite(), this.getReichweite(), null, "reichweite", null, 1, 1, AbstaktFernKampfwaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstaktWaffeEClass, AbstaktWaffe.class, "AbstaktWaffe", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstaktWaffe_Schadenscode(), ecorePackage.getEString(), "schadenscode", null, 0, 1, AbstaktWaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstaktWaffe_SchadesTyp(), this.getSchadensTyp(), "schadesTyp", null, 0, 1, AbstaktWaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstaktWaffe_Praezision(), ecorePackage.getEInt(), "praezision", null, 0, 1, AbstaktWaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstaktWaffe_DurchschlagsKraft(), ecorePackage.getEInt(), "durchschlagsKraft", null, 0, 1, AbstaktWaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nahkampfwaffeEClass, Nahkampfwaffe.class, "Nahkampfwaffe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNahkampfwaffe_Reichweite(), ecorePackage.getEInt(), "reichweite", null, 0, 1, Nahkampfwaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(feuerwaffeEClass, Feuerwaffe.class, "Feuerwaffe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFeuerwaffe_Munitionstyp(), this.getMagazinTyp(), "munitionstyp", null, 0, 1, Feuerwaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeuerwaffe_Modie(), this.getFeuerModus(), "modie", null, 0, -1, Feuerwaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeuerwaffe_Kapazitaet(), ecorePackage.getEInt(), "kapazitaet", null, 0, 1, Feuerwaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeuerwaffe_Erweiterung(), this.getFeuwerwaffenErweiterung(), "erweiterung", null, 0, -1, Feuerwaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeuerwaffe_Rueckstoss(), ecorePackage.getEInt(), "rueckstoss", null, 0, 1, Feuerwaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeuerwaffe_Einbau(), this.getFernkampfwaffeModifikator(), null, "einbau", null, 0, -1, Feuerwaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(wurfwaffeEClass, Wurfwaffe.class, "Wurfwaffe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(shrListEClass, ShrList.class, "ShrList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getShrList_Entries(), ecorePackage.getEObject(), null, "entries", null, 0, -1, ShrList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(projektilwaffeEClass, Projektilwaffe.class, "Projektilwaffe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fertigkeitsGruppeEClass, FertigkeitsGruppe.class, "FertigkeitsGruppe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFertigkeitsGruppe_Fertigkeiten(), this.getFertigkeit(), null, "fertigkeiten", null, 0, -1, FertigkeitsGruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fertigkeitEClass, Fertigkeit.class, "Fertigkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFertigkeit_Kategorie(), ecorePackage.getEString(), "kategorie", null, 0, 1, Fertigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFertigkeit_Ausweichen(), ecorePackage.getEBoolean(), "ausweichen", null, 0, 1, Fertigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFertigkeit_Attribut(), ecorePackage.getEAttribute(), null, "attribut", null, 0, 1, Fertigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFertigkeit_Spezialisierungen(), ecorePackage.getEString(), "spezialisierungen", null, 0, -1, Fertigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personaFertigkeitEClass, PersonaFertigkeit.class, "PersonaFertigkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPersonaFertigkeit_Fertigkeit(), this.getFertigkeit(), null, "fertigkeit", null, 0, 1, PersonaFertigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPersonaFertigkeit_Stufe(), ecorePackage.getEInt(), "stufe", null, 0, 1, PersonaFertigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personaFertigkeitsGruppeEClass, PersonaFertigkeitsGruppe.class, "PersonaFertigkeitsGruppe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPersonaFertigkeitsGruppe_Gruppe(), this.getFertigkeitsGruppe(), null, "gruppe", null, 0, 1, PersonaFertigkeitsGruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPersonaFertigkeitsGruppe_Stufe(), ecorePackage.getEInt(), "stufe", null, 0, 1, PersonaFertigkeitsGruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cyberwareEClass, Cyberware.class, "Cyberware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCyberware_Persona(), this.getAbstraktPersona(), null, "persona", null, 0, 1, Cyberware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCyberware_Einbau(), this.getAbstraktGegenstand(), null, "einbau", null, 0, -1, Cyberware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bioWareEClass, BioWare.class, "BioWare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBioWare_Persona(), this.getAbstraktPersona(), null, "persona", null, 0, 1, BioWare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(koerpermodsEClass, Koerpermods.class, "Koerpermods", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstraktModifikatorenEClass, AbstraktModifikatoren.class, "AbstraktModifikatoren", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(geistigeAttributeEClass, GeistigeAttribute.class, "GeistigeAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGeistigeAttribute_Charisma(), ecorePackage.getEInt(), "charisma", null, 0, 1, GeistigeAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeistigeAttribute_Willenskraft(), ecorePackage.getEInt(), "willenskraft", null, 0, 1, GeistigeAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeistigeAttribute_Intuition(), ecorePackage.getEInt(), "intuition", null, 0, 1, GeistigeAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeistigeAttribute_Logik(), ecorePackage.getEInt(), "logik", null, 0, 1, GeistigeAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mudanPersonaEClass, MudanPersona.class, "MudanPersona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(koerperPersonaEClass, KoerperPersona.class, "KoerperPersona", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKoerperPersona_KoerperMods(), this.getKoerpermods(), null, "koerperMods", null, 0, -1, KoerperPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKoerperPersona_Eigenschaften(), this.getPersonaEigenschaft(), null, "eigenschaften", null, 0, -1, KoerperPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKoerperPersona_ZustandKoerperlich(), ecorePackage.getEInt(), "zustandKoerperlich", null, 0, 1, KoerperPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKoerperPersona_ZustandGeistig(), ecorePackage.getEInt(), "zustandGeistig", null, 0, 1, KoerperPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(magischeModsEClass, MagischeMods.class, "MagischeMods", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(kiKraftEClass, KiKraft.class, "KiKraft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKiKraft_Kraftpunkte(), ecorePackage.getEInt(), "kraftpunkte", null, 0, 1, KiKraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(magischePersonaEClass, MagischePersona.class, "MagischePersona", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMagischePersona_Mentor(), this.getSchutzgeist(), null, "mentor", null, 0, 1, MagischePersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(baseMagischePersonaEClass, BaseMagischePersona.class, "BaseMagischePersona", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBaseMagischePersona_Magie(), ecorePackage.getEInt(), "magie", null, 1, 1, BaseMagischePersona.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseMagischePersona_Initationen(), this.getInitation(), null, "initationen", null, 0, -1, BaseMagischePersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBaseMagischePersona_MagieBasis(), ecorePackage.getEInt(), "magieBasis", null, 1, 1, BaseMagischePersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fernkampfwaffenModifikatorenEClass, FernkampfwaffenModifikatoren.class, "FernkampfwaffenModifikatoren", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFernkampfwaffenModifikatoren_Smartgun(), this.getSmartgunType(), "smartgun", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFernkampfwaffenModifikatoren_Rueckstoss(), ecorePackage.getEInt(), "rueckstoss", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFernkampfwaffenModifikatoren_LasterPointer(), ecorePackage.getEBoolean(), "lasterPointer", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFernkampfwaffenModifikatoren_Schalldaempfer(), ecorePackage.getEBoolean(), "schalldaempfer", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFernkampfwaffenModifikatoren_Vergroesserung(), ecorePackage.getEInt(), "vergroesserung", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sichtverhaeltnisseEClass, Sichtverhaeltnisse.class, "Sichtverhaeltnisse", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSichtverhaeltnisse_Restlichtverstaerkung(), this.getModifikatorType(), "restlichtverstaerkung", null, 0, 1, Sichtverhaeltnisse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSichtverhaeltnisse_Infrarot(), this.getModifikatorType(), "infrarot", null, 0, 1, Sichtverhaeltnisse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSichtverhaeltnisse_Ultrasound(), this.getModifikatorType(), "ultrasound", null, 0, 1, Sichtverhaeltnisse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(speziesEClass, Spezies.class, "Spezies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSpezies_KonstitutionMin(), ecorePackage.getEInt(), "konstitutionMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_GeschicklichkeitMin(), ecorePackage.getEInt(), "geschicklichkeitMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_ReaktionMin(), ecorePackage.getEInt(), "reaktionMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_StaerkeMin(), ecorePackage.getEInt(), "staerkeMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_CharismaMin(), ecorePackage.getEInt(), "charismaMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_WillenskraftMin(), ecorePackage.getEInt(), "willenskraftMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_IntuitionMin(), ecorePackage.getEInt(), "intuitionMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_LogikMin(), ecorePackage.getEInt(), "logikMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_EdgeMin(), ecorePackage.getEInt(), "edgeMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_MagieMin(), ecorePackage.getEInt(), "magieMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_ResonanzMin(), ecorePackage.getEInt(), "resonanzMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_EssenzMin(), ecorePackage.getEInt(), "essenzMin", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_KonstitutionMax(), ecorePackage.getEInt(), "konstitutionMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_GeschicklichkeitMax(), ecorePackage.getEInt(), "geschicklichkeitMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_ReaktionMax(), ecorePackage.getEInt(), "reaktionMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_StaerkeMax(), ecorePackage.getEInt(), "staerkeMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_CharismaMax(), ecorePackage.getEInt(), "charismaMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_WillenskraftMax(), ecorePackage.getEInt(), "willenskraftMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_IntuitionMax(), ecorePackage.getEInt(), "intuitionMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_LogikMax(), ecorePackage.getEInt(), "logikMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_EdgeMax(), ecorePackage.getEInt(), "edgeMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_MagieMax(), ecorePackage.getEInt(), "magieMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_ResonanzMax(), ecorePackage.getEInt(), "resonanzMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_EssenzMax(), ecorePackage.getEInt(), "essenzMax", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_Laufen(), ecorePackage.getEInt(), "laufen", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_Rennen(), ecorePackage.getEInt(), "rennen", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpezies_Sprinten(), ecorePackage.getEInt(), "sprinten", null, 0, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(gegenstandStufenEClass, GegenstandStufen.class, "GegenstandStufen", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGegenstandStufen_Computer(), ecorePackage.getEInt(), "computer", null, 0, 1, GegenstandStufen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGegenstandStufen_Elektronik(), ecorePackage.getEInt(), "elektronik", null, 0, 1, GegenstandStufen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGegenstandStufen_Tracing(), ecorePackage.getEInt(), "tracing", null, 0, 1, GegenstandStufen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGegenstandStufen_AntiTracing(), ecorePackage.getEInt(), "antiTracing", null, 0, 1, GegenstandStufen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGegenstandStufen_Protection(), ecorePackage.getEInt(), "protection", null, 0, 1, GegenstandStufen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGegenstandStufen_AntiProtection(), ecorePackage.getEInt(), "antiProtection", null, 0, 1, GegenstandStufen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kiAdeptEClass, KiAdept.class, "KiAdept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKiAdept_Kikraft(), this.getKiKraft(), null, "kikraft", null, 0, -1, KiAdept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kleidungEClass, Kleidung.class, "Kleidung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKleidung_Ruestung(), ecorePackage.getEInt(), "ruestung", null, 0, 1, Kleidung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fernkampfwaffeModifikatorEClass, FernkampfwaffeModifikator.class, "FernkampfwaffeModifikator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFernkampfwaffeModifikator_Ep(), this.getFeuwerwaffenErweiterung(), "ep", null, 0, 1, FernkampfwaffeModifikator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(anwendbarEClass, Anwendbar.class, "Anwendbar", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnwendbar_Fertigkeit(), this.getFertigkeit(), null, "fertigkeit", null, 0, 1, Anwendbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personaEigenschaftEClass, PersonaEigenschaft.class, "PersonaEigenschaft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPersonaEigenschaft_KarmaKosten(), ecorePackage.getEInt(), "karmaKosten", null, 0, 1, PersonaEigenschaft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(probenModifikatorenEClass, ProbenModifikatoren.class, "ProbenModifikatoren", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProbenModifikatoren_Schadenswiederstand(), ecorePackage.getEInt(), "schadenswiederstand", null, 0, 1, ProbenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbenModifikatoren_Heilung(), ecorePackage.getEInt(), "heilung", null, 0, 1, ProbenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(magierEClass, Magier.class, "Magier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(zaubererEClass, Zauberer.class, "Zauberer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getZauberer_Zauber(), this.getPersonaZauber(), null, "zauber", null, 0, -1, Zauberer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZauberer_Enzug(), ecorePackage.getEInt(), "enzug", null, 0, 1, Zauberer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZauberer_Tradition(), this.getMagischeTradition(), "tradition", null, 0, 1, Zauberer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mysticAdeptEClass, MysticAdept.class, "MysticAdept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(personaZauberEClass, PersonaZauber.class, "PersonaZauber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPersonaZauber_Stufe(), ecorePackage.getEInt(), "stufe", null, 1, 1, PersonaZauber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPersonaZauber_Formel(), this.getZauber(), null, "formel", null, 1, 1, PersonaZauber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(zauberEClass, Zauber.class, "Zauber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getZauber_Art(), this.getZauberArt(), "art", null, 0, 1, Zauber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZauber_Reichweite(), this.getZauberReichweite(), "reichweite", null, 0, 1, Zauber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZauber_Schaden(), ecorePackage.getEString(), "schaden", null, 0, 1, Zauber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZauber_Dauer(), this.getZauberDauer(), "dauer", null, 0, 1, Zauber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZauber_Entzug(), ecorePackage.getEString(), "entzug", null, 1, 1, Zauber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZauber_Kategorie(), ecorePackage.getEString(), "kategorie", null, 1, 1, Zauber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZauber_Merkmale(), ecorePackage.getEString(), "merkmale", null, 0, 1, Zauber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(chrakterLimitsEClass, ChrakterLimits.class, "ChrakterLimits", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getChrakterLimits_Koerperlich(), ecorePackage.getEInt(), "koerperlich", null, 1, 1, ChrakterLimits.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChrakterLimits_Geistig(), ecorePackage.getEInt(), "geistig", null, 1, 1, ChrakterLimits.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChrakterLimits_Sozial(), ecorePackage.getEInt(), "sozial", null, 1, 1, ChrakterLimits.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(panzerungEClass, Panzerung.class, "Panzerung", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPanzerung_Panzer(), ecorePackage.getEInt(), "panzer", null, 0, 1, Panzerung.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(aspektMagierEClass, AspektMagier.class, "AspektMagier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAspektMagier_Aspekt(), this.getFertigkeitsGruppe(), null, "aspekt", null, 1, 1, AspektMagier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(astraleProjektionEClass, AstraleProjektion.class, "AstraleProjektion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAstraleProjektion_AstralesLimit(), ecorePackage.getEInt(), "astralesLimit", null, 0, 1, AstraleProjektion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAstraleProjektion_AstraleKonstitution(), ecorePackage.getEInt(), "astraleKonstitution", null, 0, 1, AstraleProjektion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAstraleProjektion_AstraleGeschicklichkeit(), ecorePackage.getEInt(), "astraleGeschicklichkeit", null, 0, 1, AstraleProjektion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAstraleProjektion_AstraleReaktion(), ecorePackage.getEInt(), "astraleReaktion", null, 0, 1, AstraleProjektion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAstraleProjektion_AstraleStaerke(), ecorePackage.getEInt(), "astraleStaerke", null, 0, 1, AstraleProjektion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAstraleProjektion_AstraleInitative(), ecorePackage.getEInt(), "astraleInitative", null, 0, 1, AstraleProjektion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAstraleProjektion_AstraleInitativWuerfel(), ecorePackage.getEInt(), "astraleInitativWuerfel", null, 0, 1, AstraleProjektion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAstraleProjektion_AstralePanzerung(), ecorePackage.getEInt(), "astralePanzerung", null, 0, 1, AstraleProjektion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(schutzgeistEClass, Schutzgeist.class, "Schutzgeist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSchutzgeist_Vorteile(), ecorePackage.getEString(), "vorteile", null, 0, 1, Schutzgeist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchutzgeist_Nachteile(), ecorePackage.getEString(), "nachteile", null, 0, 1, Schutzgeist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(initationEClass, Initation.class, "Initation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInitation_Stufe(), ecorePackage.getEInt(), "stufe", null, 0, 1, Initation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInitation_Erlernt(), this.getMetaMagie(), null, "erlernt", null, 0, 1, Initation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(metaMagieEClass, MetaMagie.class, "MetaMagie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(critterKraftEClass, CritterKraft.class, "CritterKraft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCritterKraft_Art(), this.getZauberArt(), "art", null, 0, 1, CritterKraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCritterKraft_Handlung(), this.getCritterHandlung(), "handlung", null, 0, 1, CritterKraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCritterKraft_Reichweite(), this.getCritterReichweite(), "reichweite", null, 0, 1, CritterKraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCritterKraft_Dauer(), this.getCritterDauer(), "dauer", null, 0, 1, CritterKraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fahrzeugEClass, Fahrzeug.class, "Fahrzeug", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFahrzeug_Handling(), ecorePackage.getEInt(), "handling", null, 0, 1, Fahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFahrzeug_Geschwindigkeit(), ecorePackage.getEInt(), "geschwindigkeit", null, 0, 1, Fahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFahrzeug_Beschleunigung(), ecorePackage.getEInt(), "beschleunigung", null, 0, 1, Fahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFahrzeug_Rumpf(), ecorePackage.getEInt(), "rumpf", null, 0, 1, Fahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFahrzeug_Pilot(), ecorePackage.getEInt(), "pilot", null, 0, 1, Fahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFahrzeug_Sensor(), ecorePackage.getEInt(), "sensor", null, 0, 1, Fahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFahrzeug_FahrzeugTyp(), ecorePackage.getEString(), "fahrzeugTyp", null, 0, 1, Fahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFahrzeug_Modifizierungen(), this.getFahrzeugModifikation(), null, "modifizierungen", null, 0, -1, Fahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bodenfahrzeugEClass, Bodenfahrzeug.class, "Bodenfahrzeug", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBodenfahrzeug_HandlingGelaende(), ecorePackage.getEInt(), "handlingGelaende", null, 0, 1, Bodenfahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBodenfahrzeug_GeschwindigkeitGelände(), ecorePackage.getEInt(), "geschwindigkeitGelände", null, 0, 1, Bodenfahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(passagierFahrzeugEClass, PassagierFahrzeug.class, "PassagierFahrzeug", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPassagierFahrzeug_Sitze(), ecorePackage.getEInt(), "sitze", null, 0, 1, PassagierFahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(drohneEClass, Drohne.class, "Drohne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fahrzeugModifikationEClass, FahrzeugModifikation.class, "FahrzeugModifikation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFahrzeugModifikation_Funktion(), this.getAbstraktGegenstand(), null, "funktion", null, 0, -1, FahrzeugModifikation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(technomancerEClass, Technomancer.class, "Technomancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTechnomancer_ComplexForms(), this.getPersonaKomplexForm(), null, "complexForms", null, 0, -1, Technomancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTechnomancer_Echos(), this.getEcho(), null, "echos", null, 0, -1, Technomancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resonanzPersonaEClass, ResonanzPersona.class, "ResonanzPersona", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResonanzPersona_Resonanz(), ecorePackage.getEInt(), "resonanz", null, 0, 1, ResonanzPersona.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResonanzPersona_Geraetestufe(), ecorePackage.getEInt(), "geraetestufe", null, 0, 1, ResonanzPersona.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResonanzPersona_Angriff(), ecorePackage.getEInt(), "angriff", null, 0, 1, ResonanzPersona.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResonanzPersona_Schleicher(), ecorePackage.getEInt(), "schleicher", null, 0, 1, ResonanzPersona.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResonanzPersona_Datenverarbeitung(), ecorePackage.getEInt(), "datenverarbeitung", null, 0, 1, ResonanzPersona.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResonanzPersona_Firewall(), ecorePackage.getEInt(), "firewall", null, 0, 1, ResonanzPersona.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResonanzPersona_ResonanzBasis(), ecorePackage.getEInt(), "resonanzBasis", null, 0, 1, ResonanzPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(komplexeFormEClass, KomplexeForm.class, "KomplexeForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKomplexeForm_Ziel(), this.getResonanzZiel(), "ziel", null, 0, 1, KomplexeForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKomplexeForm_Dauer(), this.getZauberDauer(), "dauer", null, 0, 1, KomplexeForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKomplexeForm_Schwund(), ecorePackage.getEString(), "schwund", null, 0, 1, KomplexeForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personaKomplexFormEClass, PersonaKomplexForm.class, "PersonaKomplexForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPersonaKomplexForm_Form(), this.getKomplexeForm(), null, "form", null, 1, 1, PersonaKomplexForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPersonaKomplexForm_Stufe(), ecorePackage.getEInt(), "stufe", null, 1, 1, PersonaKomplexForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(spriteEClass, Sprite.class, "Sprite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSprite_Stufe(), ecorePackage.getEInt(), "stufe", null, 0, 1, Sprite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSprite_AngriffMod(), ecorePackage.getEInt(), "angriffMod", null, 0, 1, Sprite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSprite_SchleicherMod(), ecorePackage.getEInt(), "schleicherMod", null, 0, 1, Sprite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSprite_DatenverarbeitungMod(), ecorePackage.getEInt(), "datenverarbeitungMod", null, 0, 1, Sprite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSprite_FirewallMod(), ecorePackage.getEInt(), "firewallMod", null, 0, 1, Sprite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSprite_InitativeMod(), ecorePackage.getEInt(), "initativeMod", null, 0, 1, Sprite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(echoEClass, Echo.class, "Echo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(vertragEClass, Vertrag.class, "Vertrag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(lifestyleEClass, Lifestyle.class, "Lifestyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wissensfertigkeitEClass, Wissensfertigkeit.class, "Wissensfertigkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sprachfertigkeitEClass, Sprachfertigkeit.class, "Sprachfertigkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(personaZustandEClass, PersonaZustand.class, "PersonaZustand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPersonaZustand_ZustandKoerperlichMax(), ecorePackage.getEInt(), "zustandKoerperlichMax", null, 0, 1, PersonaZustand.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPersonaZustand_ZustandGeistigMax(), ecorePackage.getEInt(), "zustandGeistigMax", null, 0, 1, PersonaZustand.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPersonaZustand_ZustandGrenze(), ecorePackage.getEInt(), "zustandGrenze", null, 0, 1, PersonaZustand.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(critterEClass, Critter.class, "Critter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCritter_Kraefte(), this.getCritterKraft(), null, "kraefte", null, 0, -1, Critter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(intervallVertragEClass, IntervallVertrag.class, "IntervallVertrag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntervallVertrag_FaelligkeitsIntervall(), ecorePackage.getEInt(), "faelligkeitsIntervall", null, 0, 1, IntervallVertrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sinEClass, Sin.class, "Sin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(lizenzEClass, Lizenz.class, "Lizenz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLizenz_LizenGegenstand(), ecorePackage.getEString(), "lizenGegenstand", null, 0, 1, Lizenz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLizenz_LizenzTraeger(), this.getSin(), null, "lizenzTraeger", null, 1, 1, Lizenz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fakeableEClass, Fakeable.class, "Fakeable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFakeable_Stufe(), ecorePackage.getEInt(), "stufe", null, 0, 1, Fakeable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFakeable_Gefaelscht(), ecorePackage.getEBoolean(), "gefaelscht", null, 0, 1, Fakeable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(feuerModusEEnum, FeuerModus.class, "FeuerModus");
        addEEnumLiteral(feuerModusEEnum, FeuerModus.EM);
        addEEnumLiteral(feuerModusEEnum, FeuerModus.HM);
        addEEnumLiteral(feuerModusEEnum, FeuerModus.SM);
        addEEnumLiteral(feuerModusEEnum, FeuerModus.AM);

        initEEnum(schadensTypEEnum, SchadensTyp.class, "SchadensTyp");
        addEEnumLiteral(schadensTypEEnum, SchadensTyp.KOERPERLICH);
        addEEnumLiteral(schadensTypEEnum, SchadensTyp.GEISTIG);
        addEEnumLiteral(schadensTypEEnum, SchadensTyp.SPEZIELL);

        initEEnum(magazinTypEEnum, MagazinTyp.class, "MagazinTyp");
        addEEnumLiteral(magazinTypEEnum, MagazinTyp.CLIP);
        addEEnumLiteral(magazinTypEEnum, MagazinTyp.TROMMEL);
        addEEnumLiteral(magazinTypEEnum, MagazinTyp.GURT);
        addEEnumLiteral(magazinTypEEnum, MagazinTyp.STREIFEN);

        initEEnum(feuwerwaffenErweiterungEEnum, FeuwerwaffenErweiterung.class, "FeuwerwaffenErweiterung");
        addEEnumLiteral(feuwerwaffenErweiterungEEnum, FeuwerwaffenErweiterung.LAUF);
        addEEnumLiteral(feuwerwaffenErweiterungEEnum, FeuwerwaffenErweiterung.UNTEN);
        addEEnumLiteral(feuwerwaffenErweiterungEEnum, FeuwerwaffenErweiterung.OBEN);

        initEEnum(modifikatorTypeEEnum, ModifikatorType.class, "ModifikatorType");
        addEEnumLiteral(modifikatorTypeEEnum, ModifikatorType.NATURAL);
        addEEnumLiteral(modifikatorTypeEEnum, ModifikatorType.CYBER);
        addEEnumLiteral(modifikatorTypeEEnum, ModifikatorType.BIO);

        initEEnum(smartgunTypeEEnum, SmartgunType.class, "SmartgunType");
        addEEnumLiteral(smartgunTypeEEnum, SmartgunType.SMART_BRILLE);
        addEEnumLiteral(smartgunTypeEEnum, SmartgunType.SMART_GUN);
        addEEnumLiteral(smartgunTypeEEnum, SmartgunType.SMATGUN_II);

        initEEnum(zauberArtEEnum, ZauberArt.class, "ZauberArt");
        addEEnumLiteral(zauberArtEEnum, ZauberArt.MANA);
        addEEnumLiteral(zauberArtEEnum, ZauberArt.PHYSISCH);

        initEEnum(zauberReichweiteEEnum, ZauberReichweite.class, "ZauberReichweite");
        addEEnumLiteral(zauberReichweiteEEnum, ZauberReichweite.BLICKFELD);
        addEEnumLiteral(zauberReichweiteEEnum, ZauberReichweite.BEGRENZT);
        addEEnumLiteral(zauberReichweiteEEnum, ZauberReichweite.SELBST);
        addEEnumLiteral(zauberReichweiteEEnum, ZauberReichweite.BERUEHRUNG);

        initEEnum(zauberDauerEEnum, ZauberDauer.class, "ZauberDauer");
        addEEnumLiteral(zauberDauerEEnum, ZauberDauer.SOFORT);
        addEEnumLiteral(zauberDauerEEnum, ZauberDauer.AUFRECHTERHALTEN);
        addEEnumLiteral(zauberDauerEEnum, ZauberDauer.PERMANENT);

        initEEnum(magischeTraditionEEnum, MagischeTradition.class, "MagischeTradition");
        addEEnumLiteral(magischeTraditionEEnum, MagischeTradition.HERMETISCH);
        addEEnumLiteral(magischeTraditionEEnum, MagischeTradition.SCHAMANISCH);

        initEEnum(critterHandlungEEnum, CritterHandlung.class, "CritterHandlung");
        addEEnumLiteral(critterHandlungEEnum, CritterHandlung.KOMPLEX);
        addEEnumLiteral(critterHandlungEEnum, CritterHandlung.AUTO);

        initEEnum(critterReichweiteEEnum, CritterReichweite.class, "CritterReichweite");
        addEEnumLiteral(critterReichweiteEEnum, CritterReichweite.BLICKFELD);
        addEEnumLiteral(critterReichweiteEEnum, CritterReichweite.BERUEHRUNG);
        addEEnumLiteral(critterReichweiteEEnum, CritterReichweite.SELBST);
        addEEnumLiteral(critterReichweiteEEnum, CritterReichweite.SPEZIELL);

        initEEnum(critterDauerEEnum, CritterDauer.class, "CritterDauer");
        addEEnumLiteral(critterDauerEEnum, CritterDauer.IMMER);
        addEEnumLiteral(critterDauerEEnum, CritterDauer.SOFORT);
        addEEnumLiteral(critterDauerEEnum, CritterDauer.AUFRECHTERHALTEN);
        addEEnumLiteral(critterDauerEEnum, CritterDauer.PERMANENT);
        addEEnumLiteral(critterDauerEEnum, CritterDauer.SPEZIELL);

        initEEnum(resonanzZielEEnum, ResonanzZiel.class, "ResonanzZiel");
        addEEnumLiteral(resonanzZielEEnum, ResonanzZiel.DATEI);
        addEEnumLiteral(resonanzZielEEnum, ResonanzZiel.GERAET);
        addEEnumLiteral(resonanzZielEEnum, ResonanzZiel.SELBST);
        addEEnumLiteral(resonanzZielEEnum, ResonanzZiel.PERSONA);
        addEEnumLiteral(resonanzZielEEnum, ResonanzZiel.SPRITE);

        // Initialize data types
        initEDataType(shrDateEDataType, Date.class, "ShrDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(modificationManagerEDataType, ModSetter.class, "ModificationManager", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //Shr5PackageImpl
