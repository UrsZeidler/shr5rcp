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

import de.urszeidler.eclipse.shr5.*;

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
    private EClass steigerbarEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass erlernbarEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass credstickEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mengeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass munitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modifikatorAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gebundenerGeistEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stufenPersonaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass geistEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identifiableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass credstickTransactionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass spezialisierungEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass matrixAttributesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass matrixDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commonProgramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass weaponMountEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lifestyleOptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass percentLifestyleOptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass berechneteAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass magischeStufeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fokusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstraktFokusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qiFokusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass waffenFokusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass magieFokusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fokusBindingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass substanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass toxinEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass drugEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass magazinEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultWifiEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activeMatixDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commlinkEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass matixConditionMonitorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cyberdeckEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass softwareAgentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hostEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cyberwareModifikatiorenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass riggerCommandConsoleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass autoSoftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass softwareEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass matrixProgramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tutorsoftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass skillSoftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fahrzeugZustandEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass personalAreaNetworkEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass basicProgramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datasoftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractMatrixDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass consumerSoftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass riggerProgramEClass = null;

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
    private EEnum interfaceModusEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum programTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum matrixProgramTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum substanceVectorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum substanceEffectEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum addictionTypeEEnum = null;

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
    public EAttribute getGeldWert_WertValue() {
        return (EAttribute)geldWertEClass.getEStructuralFeatures().get(2);
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
    public EReference getAbstraktGegenstand_Wifi() {
        return (EReference)abstraktGegenstandEClass.getEStructuralFeatures().get(0);
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
    public EReference getFeuerwaffe_Magazin() {
        return (EReference)feuerwaffeEClass.getEStructuralFeatures().get(6);
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
	public EReference getFertigkeit_Spezialisierungen() {
        return (EReference)fertigkeitEClass.getEStructuralFeatures().get(3);
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
    public EReference getPersonaFertigkeit_Spezialisierungen() {
        return (EReference)personaFertigkeitEClass.getEStructuralFeatures().get(1);
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
    public EReference getBaseMagischePersona_BoundFoki() {
        return (EReference)baseMagischePersonaEClass.getEStructuralFeatures().get(3);
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
    public EAttribute getFernkampfwaffenModifikatoren_Sichtverbesserung() {
        return (EAttribute)fernkampfwaffenModifikatorenEClass.getEStructuralFeatures().get(5);
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
    public EReference getSpezies_Angriff() {
        return (EReference)speziesEClass.getEStructuralFeatures().get(27);
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
    public EReference getAnwendbar_Spezialisierung() {
        return (EReference)anwendbarEClass.getEStructuralFeatures().get(1);
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
    public EReference getZauberer_GebundeneGeister() {
        return (EReference)zaubererEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getZauberer_UngebundenerGeist() {
        return (EReference)zaubererEClass.getEStructuralFeatures().get(4);
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
	public EReference getInitation_Erlernt() {
        return (EReference)initationEClass.getEStructuralFeatures().get(0);
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
    public EAttribute getFahrzeug_Panzer() {
        return (EAttribute)fahrzeugEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFahrzeug_WeaponMounts() {
        return (EAttribute)fahrzeugEClass.getEStructuralFeatures().get(9);
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
    public EAttribute getBodenfahrzeug_GeschwindigkeitGelaende() {
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
    public EAttribute getDrohne_ProgramSlotCount() {
        return (EAttribute)drohneEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDrohne_RunningPrograms() {
        return (EReference)drohneEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDrohne_StoredPrograms() {
        return (EReference)drohneEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getResonanzPersona_ResonanzBasis() {
        return (EAttribute)resonanzPersonaEClass.getEStructuralFeatures().get(1);
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
    public EReference getLifestyle_Options() {
        return (EReference)lifestyleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLifestyle_Owned() {
        return (EAttribute)lifestyleEClass.getEStructuralFeatures().get(1);
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
    public EReference getCritter_Powers() {
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
    public EClass getSteigerbar() {
        return steigerbarEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSteigerbar_Stufe() {
        return (EAttribute)steigerbarEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getErlernbar() {
        return erlernbarEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCredstick() {
        return credstickEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCredstick_MaxValue() {
        return (EAttribute)credstickEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCredstick_Transactionlog() {
        return (EReference)credstickEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCredstick_CurrentValue() {
        return (EAttribute)credstickEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMenge() {
        return mengeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMenge_Anzahl() {
        return (EAttribute)mengeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMenge_ProAnzahl() {
        return (EAttribute)mengeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMunition() {
        return munitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMunition_DamageType() {
        return (EAttribute)munitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMunition_DamageMod() {
        return (EAttribute)munitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMunition_ArmorMod() {
        return (EAttribute)munitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMunition_Type() {
        return (EReference)munitionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModifikatorAttribute() {
        return modifikatorAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGebundenerGeist() {
        return gebundenerGeistEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGebundenerGeist_Dienste() {
        return (EAttribute)gebundenerGeistEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGebundenerGeist_Geist() {
        return (EReference)gebundenerGeistEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStufenPersona() {
        return stufenPersonaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStufenPersona_Stufe() {
        return (EAttribute)stufenPersonaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStufenPersona_SkillGroups() {
        return (EReference)stufenPersonaEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStufenPersona_Skills() {
        return (EReference)stufenPersonaEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGeist() {
        return geistEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeist_KonstitutionBasis() {
        return (EAttribute)geistEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeist_GeschicklichkeitBasis() {
        return (EAttribute)geistEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeist_ReaktionBasis() {
        return (EAttribute)geistEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeist_StaerkeBasis() {
        return (EAttribute)geistEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeist_CharismaBasis() {
        return (EAttribute)geistEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeist_WillenskraftBasis() {
        return (EAttribute)geistEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeist_IntuitionBasis() {
        return (EAttribute)geistEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeist_LogikBasis() {
        return (EAttribute)geistEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGeist_Powers() {
        return (EReference)geistEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGeist_OptionalPowers() {
        return (EReference)geistEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentifiable() {
        return identifiableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentifiable_ParentId() {
        return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentifiable_Localizations() {
        return (EReference)identifiableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCredstickTransaction() {
        return credstickTransactionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCredstickTransaction_Amount() {
        return (EAttribute)credstickTransactionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCredstickTransaction_Date() {
        return (EAttribute)credstickTransactionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCredstickTransaction_Description() {
        return (EAttribute)credstickTransactionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpezialisierung() {
        return spezialisierungEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMatrixAttributes() {
        return matrixAttributesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrixAttributes_Geraetestufe() {
        return (EAttribute)matrixAttributesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrixAttributes_Firewall() {
        return (EAttribute)matrixAttributesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrixAttributes_Datenverarbeitung() {
        return (EAttribute)matrixAttributesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrixAttributes_CurrentModus() {
        return (EAttribute)matrixAttributesEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMatrixDevice() {
        return matrixDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMatrixDevice_Pan() {
        return (EReference)matrixDeviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCommonProgram() {
        return commonProgramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommonProgram_ProgramType() {
        return (EAttribute)commonProgramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWeaponMount() {
        return weaponMountEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWeaponMount_Weapon() {
        return (EReference)weaponMountEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLifestyleOption() {
        return lifestyleOptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPercentLifestyleOption() {
        return percentLifestyleOptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalization() {
        return localizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocalization_Local() {
        return (EAttribute)localizationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocalization_Name() {
        return (EAttribute)localizationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocalization_Page() {
        return (EAttribute)localizationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBerechneteAttribute() {
        return berechneteAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBerechneteAttribute_Errinerungsvermoegen() {
        return (EAttribute)berechneteAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBerechneteAttribute_Menschenkenntnis() {
        return (EAttribute)berechneteAttributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBerechneteAttribute_Selbstbeherrschung() {
        return (EAttribute)berechneteAttributeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMagischeStufe() {
        return magischeStufeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMagischeStufe_Stufe() {
        return (EAttribute)magischeStufeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFokus() {
        return fokusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFokus_Bindungskosten() {
        return (EAttribute)fokusEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstraktFokus() {
        return abstraktFokusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQiFokus() {
        return qiFokusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getQiFokus_Power() {
        return (EReference)qiFokusEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWaffenFokus() {
        return waffenFokusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMagieFokus() {
        return magieFokusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMagieFokus_BindungsFaktor() {
        return (EAttribute)magieFokusEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFokusBinding() {
        return fokusBindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFokusBinding_Fokus() {
        return (EReference)fokusBindingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFokusBinding_Active() {
        return (EAttribute)fokusBindingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubstance() {
        return substanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubstance_Vector() {
        return (EAttribute)substanceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubstance_Speed() {
        return (EAttribute)substanceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getToxin() {
        return toxinEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getToxin_Power() {
        return (EAttribute)toxinEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getToxin_Penetration() {
        return (EAttribute)toxinEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getToxin_Effect() {
        return (EAttribute)toxinEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDrug() {
        return drugEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDrug_Duration() {
        return (EAttribute)drugEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDrug_AddictionType() {
        return (EAttribute)drugEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMagazin() {
        return magazinEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMagazin_Type() {
        return (EReference)magazinEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMagazin_Bullets() {
        return (EReference)magazinEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefaultWifi() {
        return defaultWifiEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActiveMatixDevice() {
        return activeMatixDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActiveMatixDevice_Angriff() {
        return (EAttribute)activeMatixDeviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActiveMatixDevice_Schleicher() {
        return (EAttribute)activeMatixDeviceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCommlink() {
        return commlinkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCommlink_StoredPrograms() {
        return (EReference)commlinkEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMatixConditionMonitor() {
        return matixConditionMonitorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatixConditionMonitor_MatrixZustandMax() {
        return (EAttribute)matixConditionMonitorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCyberdeck() {
        return cyberdeckEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberdeck_ProgramSlots() {
        return (EAttribute)cyberdeckEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberdeck_Attribute1() {
        return (EAttribute)cyberdeckEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberdeck_Attribute2() {
        return (EAttribute)cyberdeckEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberdeck_Attribute3() {
        return (EAttribute)cyberdeckEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberdeck_Attribute4() {
        return (EAttribute)cyberdeckEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCyberdeck_Configuration() {
        return (EReference)cyberdeckEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCyberdeck_StoredPrograms() {
        return (EReference)cyberdeckEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCyberdeck_RunningPrograms() {
        return (EReference)cyberdeckEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSoftwareAgent() {
        return softwareAgentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSoftwareAgent_Rating() {
        return (EAttribute)softwareAgentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHost() {
        return hostEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHost_HostRating() {
        return (EAttribute)hostEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHost_BaseFirewall() {
        return (EAttribute)hostEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHost_BaseDatenverarbeitung() {
        return (EAttribute)hostEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHost_BaseAngriff() {
        return (EAttribute)hostEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHost_BaseSchleicher() {
        return (EAttribute)hostEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCyberwareModifikatioren() {
        return cyberwareModifikatiorenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberwareModifikatioren_DirectNeuralInterface() {
        return (EAttribute)cyberwareModifikatiorenEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberwareModifikatioren_UniversalDataConnector() {
        return (EAttribute)cyberwareModifikatiorenEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberwareModifikatioren_ControlRig() {
        return (EAttribute)cyberwareModifikatiorenEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberwareModifikatioren_SimRig() {
        return (EAttribute)cyberwareModifikatiorenEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCyberwareModifikatioren_RiggerInterface() {
        return (EAttribute)cyberwareModifikatiorenEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRiggerCommandConsole() {
        return riggerCommandConsoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRiggerCommandConsole_Rauschunterdrueckung() {
        return (EAttribute)riggerCommandConsoleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRiggerCommandConsole_Zugriff() {
        return (EAttribute)riggerCommandConsoleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRiggerCommandConsole_DatenverarbeitungBasis() {
        return (EAttribute)riggerCommandConsoleEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRiggerCommandConsole_FirewallBasis() {
        return (EAttribute)riggerCommandConsoleEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRiggerCommandConsole_ZugriffBasis() {
        return (EAttribute)riggerCommandConsoleEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiggerCommandConsole_StoredPrograms() {
        return (EReference)riggerCommandConsoleEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiggerCommandConsole_RunningPrograms() {
        return (EReference)riggerCommandConsoleEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAutoSoft() {
        return autoSoftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAutoSoft_Rating() {
        return (EAttribute)autoSoftEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAutoSoft_Skill() {
        return (EReference)autoSoftEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAutoSoft_Weapon() {
        return (EReference)autoSoftEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAutoSoft_Model() {
        return (EReference)autoSoftEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSoftware() {
        return softwareEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMatrixProgram() {
        return matrixProgramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTutorsoft() {
        return tutorsoftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTutorsoft_Rating() {
        return (EAttribute)tutorsoftEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTutorsoft_Skill() {
        return (EReference)tutorsoftEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSkillSoft() {
        return skillSoftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSkillSoft_Skill() {
        return (EReference)skillSoftEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSkillSoft_Rating() {
        return (EAttribute)skillSoftEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFahrzeugZustand() {
        return fahrzeugZustandEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFahrzeugZustand_ZustandMax() {
        return (EAttribute)fahrzeugZustandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPersonalAreaNetwork() {
        return personalAreaNetworkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPersonalAreaNetwork_Slaves() {
        return (EReference)personalAreaNetworkEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPersonalAreaNetwork_Master() {
        return (EReference)personalAreaNetworkEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPersonalAreaNetwork_SlaveMax() {
        return (EAttribute)personalAreaNetworkEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBasicProgram() {
        return basicProgramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatasoft() {
        return datasoftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatasoft_Skill() {
        return (EReference)datasoftEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractMatrixDevice() {
        return abstractMatrixDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractMatrixDevice_DeviceRating() {
        return (EAttribute)abstractMatrixDeviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConsumerSoft() {
        return consumerSoftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConsumerSoft_Type() {
        return (EAttribute)consumerSoftEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRiggerProgram() {
        return riggerProgramEClass;
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
    public EEnum getInterfaceModus() {
        return interfaceModusEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProgramType() {
        return programTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMatrixProgramType() {
        return matrixProgramTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSubstanceVector() {
        return substanceVectorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSubstanceEffect() {
        return substanceEffectEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAddictionType() {
        return addictionTypeEEnum;
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
        createEAttribute(geldWertEClass, GELD_WERT__WERT_VALUE);

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
        createEReference(abstraktGegenstandEClass, ABSTRAKT_GEGENSTAND__WIFI);

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
        createEReference(feuerwaffeEClass, FEUERWAFFE__MAGAZIN);

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
        createEReference(fertigkeitEClass, FERTIGKEIT__SPEZIALISIERUNGEN);

        personaFertigkeitEClass = createEClass(PERSONA_FERTIGKEIT);
        createEReference(personaFertigkeitEClass, PERSONA_FERTIGKEIT__FERTIGKEIT);
        createEReference(personaFertigkeitEClass, PERSONA_FERTIGKEIT__SPEZIALISIERUNGEN);

        personaFertigkeitsGruppeEClass = createEClass(PERSONA_FERTIGKEITS_GRUPPE);
        createEReference(personaFertigkeitsGruppeEClass, PERSONA_FERTIGKEITS_GRUPPE__GRUPPE);

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
        createEReference(baseMagischePersonaEClass, BASE_MAGISCHE_PERSONA__BOUND_FOKI);

        fernkampfwaffenModifikatorenEClass = createEClass(FERNKAMPFWAFFEN_MODIFIKATOREN);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__SMARTGUN);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__RUECKSTOSS);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__LASTER_POINTER);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__SCHALLDAEMPFER);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__VERGROESSERUNG);
        createEAttribute(fernkampfwaffenModifikatorenEClass, FERNKAMPFWAFFEN_MODIFIKATOREN__SICHTVERBESSERUNG);

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
        createEReference(speziesEClass, SPEZIES__ANGRIFF);

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
        createEReference(anwendbarEClass, ANWENDBAR__SPEZIALISIERUNG);

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
        createEReference(zaubererEClass, ZAUBERER__GEBUNDENE_GEISTER);
        createEReference(zaubererEClass, ZAUBERER__UNGEBUNDENER_GEIST);

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
        createEAttribute(fahrzeugEClass, FAHRZEUG__PANZER);
        createEAttribute(fahrzeugEClass, FAHRZEUG__WEAPON_MOUNTS);

        bodenfahrzeugEClass = createEClass(BODENFAHRZEUG);
        createEAttribute(bodenfahrzeugEClass, BODENFAHRZEUG__HANDLING_GELAENDE);
        createEAttribute(bodenfahrzeugEClass, BODENFAHRZEUG__GESCHWINDIGKEIT_GELAENDE);

        passagierFahrzeugEClass = createEClass(PASSAGIER_FAHRZEUG);
        createEAttribute(passagierFahrzeugEClass, PASSAGIER_FAHRZEUG__SITZE);

        drohneEClass = createEClass(DROHNE);
        createEAttribute(drohneEClass, DROHNE__PROGRAM_SLOT_COUNT);
        createEReference(drohneEClass, DROHNE__RUNNING_PROGRAMS);
        createEReference(drohneEClass, DROHNE__STORED_PROGRAMS);

        fahrzeugModifikationEClass = createEClass(FAHRZEUG_MODIFIKATION);

        technomancerEClass = createEClass(TECHNOMANCER);
        createEReference(technomancerEClass, TECHNOMANCER__COMPLEX_FORMS);
        createEReference(technomancerEClass, TECHNOMANCER__ECHOS);

        resonanzPersonaEClass = createEClass(RESONANZ_PERSONA);
        createEAttribute(resonanzPersonaEClass, RESONANZ_PERSONA__RESONANZ);
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
        createEReference(lifestyleEClass, LIFESTYLE__OPTIONS);
        createEAttribute(lifestyleEClass, LIFESTYLE__OWNED);

        wissensfertigkeitEClass = createEClass(WISSENSFERTIGKEIT);

        sprachfertigkeitEClass = createEClass(SPRACHFERTIGKEIT);

        personaZustandEClass = createEClass(PERSONA_ZUSTAND);
        createEAttribute(personaZustandEClass, PERSONA_ZUSTAND__ZUSTAND_KOERPERLICH_MAX);
        createEAttribute(personaZustandEClass, PERSONA_ZUSTAND__ZUSTAND_GEISTIG_MAX);
        createEAttribute(personaZustandEClass, PERSONA_ZUSTAND__ZUSTAND_GRENZE);

        critterEClass = createEClass(CRITTER);
        createEReference(critterEClass, CRITTER__POWERS);

        intervallVertragEClass = createEClass(INTERVALL_VERTRAG);
        createEAttribute(intervallVertragEClass, INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL);

        sinEClass = createEClass(SIN);

        lizenzEClass = createEClass(LIZENZ);
        createEAttribute(lizenzEClass, LIZENZ__LIZEN_GEGENSTAND);
        createEReference(lizenzEClass, LIZENZ__LIZENZ_TRAEGER);

        fakeableEClass = createEClass(FAKEABLE);
        createEAttribute(fakeableEClass, FAKEABLE__STUFE);
        createEAttribute(fakeableEClass, FAKEABLE__GEFAELSCHT);

        steigerbarEClass = createEClass(STEIGERBAR);
        createEAttribute(steigerbarEClass, STEIGERBAR__STUFE);

        erlernbarEClass = createEClass(ERLERNBAR);

        credstickEClass = createEClass(CREDSTICK);
        createEAttribute(credstickEClass, CREDSTICK__MAX_VALUE);
        createEReference(credstickEClass, CREDSTICK__TRANSACTIONLOG);
        createEAttribute(credstickEClass, CREDSTICK__CURRENT_VALUE);

        mengeEClass = createEClass(MENGE);
        createEAttribute(mengeEClass, MENGE__ANZAHL);
        createEAttribute(mengeEClass, MENGE__PRO_ANZAHL);

        munitionEClass = createEClass(MUNITION);
        createEAttribute(munitionEClass, MUNITION__DAMAGE_TYPE);
        createEAttribute(munitionEClass, MUNITION__DAMAGE_MOD);
        createEAttribute(munitionEClass, MUNITION__ARMOR_MOD);
        createEReference(munitionEClass, MUNITION__TYPE);

        modifikatorAttributeEClass = createEClass(MODIFIKATOR_ATTRIBUTE);

        gebundenerGeistEClass = createEClass(GEBUNDENER_GEIST);
        createEAttribute(gebundenerGeistEClass, GEBUNDENER_GEIST__DIENSTE);
        createEReference(gebundenerGeistEClass, GEBUNDENER_GEIST__GEIST);

        stufenPersonaEClass = createEClass(STUFEN_PERSONA);
        createEAttribute(stufenPersonaEClass, STUFEN_PERSONA__STUFE);
        createEReference(stufenPersonaEClass, STUFEN_PERSONA__SKILL_GROUPS);
        createEReference(stufenPersonaEClass, STUFEN_PERSONA__SKILLS);

        geistEClass = createEClass(GEIST);
        createEAttribute(geistEClass, GEIST__KONSTITUTION_BASIS);
        createEAttribute(geistEClass, GEIST__GESCHICKLICHKEIT_BASIS);
        createEAttribute(geistEClass, GEIST__REAKTION_BASIS);
        createEAttribute(geistEClass, GEIST__STAERKE_BASIS);
        createEAttribute(geistEClass, GEIST__CHARISMA_BASIS);
        createEAttribute(geistEClass, GEIST__WILLENSKRAFT_BASIS);
        createEAttribute(geistEClass, GEIST__INTUITION_BASIS);
        createEAttribute(geistEClass, GEIST__LOGIK_BASIS);
        createEReference(geistEClass, GEIST__POWERS);
        createEReference(geistEClass, GEIST__OPTIONAL_POWERS);

        identifiableEClass = createEClass(IDENTIFIABLE);
        createEAttribute(identifiableEClass, IDENTIFIABLE__PARENT_ID);
        createEReference(identifiableEClass, IDENTIFIABLE__LOCALIZATIONS);

        credstickTransactionEClass = createEClass(CREDSTICK_TRANSACTION);
        createEAttribute(credstickTransactionEClass, CREDSTICK_TRANSACTION__AMOUNT);
        createEAttribute(credstickTransactionEClass, CREDSTICK_TRANSACTION__DATE);
        createEAttribute(credstickTransactionEClass, CREDSTICK_TRANSACTION__DESCRIPTION);

        spezialisierungEClass = createEClass(SPEZIALISIERUNG);

        matrixAttributesEClass = createEClass(MATRIX_ATTRIBUTES);
        createEAttribute(matrixAttributesEClass, MATRIX_ATTRIBUTES__GERAETESTUFE);
        createEAttribute(matrixAttributesEClass, MATRIX_ATTRIBUTES__FIREWALL);
        createEAttribute(matrixAttributesEClass, MATRIX_ATTRIBUTES__DATENVERARBEITUNG);
        createEAttribute(matrixAttributesEClass, MATRIX_ATTRIBUTES__CURRENT_MODUS);

        activeMatixDeviceEClass = createEClass(ACTIVE_MATIX_DEVICE);
        createEAttribute(activeMatixDeviceEClass, ACTIVE_MATIX_DEVICE__ANGRIFF);
        createEAttribute(activeMatixDeviceEClass, ACTIVE_MATIX_DEVICE__SCHLEICHER);

        commlinkEClass = createEClass(COMMLINK);
        createEReference(commlinkEClass, COMMLINK__STORED_PROGRAMS);

        matixConditionMonitorEClass = createEClass(MATIX_CONDITION_MONITOR);
        createEAttribute(matixConditionMonitorEClass, MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX);

        cyberdeckEClass = createEClass(CYBERDECK);
        createEAttribute(cyberdeckEClass, CYBERDECK__PROGRAM_SLOTS);
        createEAttribute(cyberdeckEClass, CYBERDECK__ATTRIBUTE1);
        createEAttribute(cyberdeckEClass, CYBERDECK__ATTRIBUTE2);
        createEAttribute(cyberdeckEClass, CYBERDECK__ATTRIBUTE3);
        createEAttribute(cyberdeckEClass, CYBERDECK__ATTRIBUTE4);
        createEReference(cyberdeckEClass, CYBERDECK__CONFIGURATION);
        createEReference(cyberdeckEClass, CYBERDECK__STORED_PROGRAMS);
        createEReference(cyberdeckEClass, CYBERDECK__RUNNING_PROGRAMS);

        softwareAgentEClass = createEClass(SOFTWARE_AGENT);
        createEAttribute(softwareAgentEClass, SOFTWARE_AGENT__RATING);

        hostEClass = createEClass(HOST);
        createEAttribute(hostEClass, HOST__HOST_RATING);
        createEAttribute(hostEClass, HOST__BASE_FIREWALL);
        createEAttribute(hostEClass, HOST__BASE_DATENVERARBEITUNG);
        createEAttribute(hostEClass, HOST__BASE_ANGRIFF);
        createEAttribute(hostEClass, HOST__BASE_SCHLEICHER);

        cyberwareModifikatiorenEClass = createEClass(CYBERWARE_MODIFIKATIOREN);
        createEAttribute(cyberwareModifikatiorenEClass, CYBERWARE_MODIFIKATIOREN__DIRECT_NEURAL_INTERFACE);
        createEAttribute(cyberwareModifikatiorenEClass, CYBERWARE_MODIFIKATIOREN__UNIVERSAL_DATA_CONNECTOR);
        createEAttribute(cyberwareModifikatiorenEClass, CYBERWARE_MODIFIKATIOREN__CONTROL_RIG);
        createEAttribute(cyberwareModifikatiorenEClass, CYBERWARE_MODIFIKATIOREN__SIM_RIG);
        createEAttribute(cyberwareModifikatiorenEClass, CYBERWARE_MODIFIKATIOREN__RIGGER_INTERFACE);

        riggerCommandConsoleEClass = createEClass(RIGGER_COMMAND_CONSOLE);
        createEAttribute(riggerCommandConsoleEClass, RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG);
        createEAttribute(riggerCommandConsoleEClass, RIGGER_COMMAND_CONSOLE__ZUGRIFF);
        createEAttribute(riggerCommandConsoleEClass, RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS);
        createEAttribute(riggerCommandConsoleEClass, RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS);
        createEAttribute(riggerCommandConsoleEClass, RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS);
        createEReference(riggerCommandConsoleEClass, RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS);
        createEReference(riggerCommandConsoleEClass, RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS);

        autoSoftEClass = createEClass(AUTO_SOFT);
        createEAttribute(autoSoftEClass, AUTO_SOFT__RATING);
        createEReference(autoSoftEClass, AUTO_SOFT__SKILL);
        createEReference(autoSoftEClass, AUTO_SOFT__WEAPON);
        createEReference(autoSoftEClass, AUTO_SOFT__MODEL);

        softwareEClass = createEClass(SOFTWARE);

        matrixProgramEClass = createEClass(MATRIX_PROGRAM);

        tutorsoftEClass = createEClass(TUTORSOFT);
        createEAttribute(tutorsoftEClass, TUTORSOFT__RATING);
        createEReference(tutorsoftEClass, TUTORSOFT__SKILL);

        skillSoftEClass = createEClass(SKILL_SOFT);
        createEReference(skillSoftEClass, SKILL_SOFT__SKILL);
        createEAttribute(skillSoftEClass, SKILL_SOFT__RATING);

        fahrzeugZustandEClass = createEClass(FAHRZEUG_ZUSTAND);
        createEAttribute(fahrzeugZustandEClass, FAHRZEUG_ZUSTAND__ZUSTAND_MAX);

        personalAreaNetworkEClass = createEClass(PERSONAL_AREA_NETWORK);
        createEReference(personalAreaNetworkEClass, PERSONAL_AREA_NETWORK__SLAVES);
        createEReference(personalAreaNetworkEClass, PERSONAL_AREA_NETWORK__MASTER);
        createEAttribute(personalAreaNetworkEClass, PERSONAL_AREA_NETWORK__SLAVE_MAX);

        basicProgramEClass = createEClass(BASIC_PROGRAM);

        datasoftEClass = createEClass(DATASOFT);
        createEReference(datasoftEClass, DATASOFT__SKILL);

        abstractMatrixDeviceEClass = createEClass(ABSTRACT_MATRIX_DEVICE);
        createEAttribute(abstractMatrixDeviceEClass, ABSTRACT_MATRIX_DEVICE__DEVICE_RATING);

        consumerSoftEClass = createEClass(CONSUMER_SOFT);
        createEAttribute(consumerSoftEClass, CONSUMER_SOFT__TYPE);

        riggerProgramEClass = createEClass(RIGGER_PROGRAM);

        matrixDeviceEClass = createEClass(MATRIX_DEVICE);
        createEReference(matrixDeviceEClass, MATRIX_DEVICE__PAN);

        commonProgramEClass = createEClass(COMMON_PROGRAM);
        createEAttribute(commonProgramEClass, COMMON_PROGRAM__PROGRAM_TYPE);

        weaponMountEClass = createEClass(WEAPON_MOUNT);
        createEReference(weaponMountEClass, WEAPON_MOUNT__WEAPON);

        lifestyleOptionEClass = createEClass(LIFESTYLE_OPTION);

        percentLifestyleOptionEClass = createEClass(PERCENT_LIFESTYLE_OPTION);

        localizationEClass = createEClass(LOCALIZATION);
        createEAttribute(localizationEClass, LOCALIZATION__LOCAL);
        createEAttribute(localizationEClass, LOCALIZATION__NAME);
        createEAttribute(localizationEClass, LOCALIZATION__PAGE);

        berechneteAttributeEClass = createEClass(BERECHNETE_ATTRIBUTE);
        createEAttribute(berechneteAttributeEClass, BERECHNETE_ATTRIBUTE__ERRINERUNGSVERMOEGEN);
        createEAttribute(berechneteAttributeEClass, BERECHNETE_ATTRIBUTE__MENSCHENKENNTNIS);
        createEAttribute(berechneteAttributeEClass, BERECHNETE_ATTRIBUTE__SELBSTBEHERRSCHUNG);

        magischeStufeEClass = createEClass(MAGISCHE_STUFE);
        createEAttribute(magischeStufeEClass, MAGISCHE_STUFE__STUFE);

        fokusEClass = createEClass(FOKUS);
        createEAttribute(fokusEClass, FOKUS__BINDUNGSKOSTEN);

        abstraktFokusEClass = createEClass(ABSTRAKT_FOKUS);

        qiFokusEClass = createEClass(QI_FOKUS);
        createEReference(qiFokusEClass, QI_FOKUS__POWER);

        waffenFokusEClass = createEClass(WAFFEN_FOKUS);

        magieFokusEClass = createEClass(MAGIE_FOKUS);
        createEAttribute(magieFokusEClass, MAGIE_FOKUS__BINDUNGS_FAKTOR);

        fokusBindingEClass = createEClass(FOKUS_BINDING);
        createEReference(fokusBindingEClass, FOKUS_BINDING__FOKUS);
        createEAttribute(fokusBindingEClass, FOKUS_BINDING__ACTIVE);

        substanceEClass = createEClass(SUBSTANCE);
        createEAttribute(substanceEClass, SUBSTANCE__VECTOR);
        createEAttribute(substanceEClass, SUBSTANCE__SPEED);

        toxinEClass = createEClass(TOXIN);
        createEAttribute(toxinEClass, TOXIN__POWER);
        createEAttribute(toxinEClass, TOXIN__PENETRATION);
        createEAttribute(toxinEClass, TOXIN__EFFECT);

        drugEClass = createEClass(DRUG);
        createEAttribute(drugEClass, DRUG__DURATION);
        createEAttribute(drugEClass, DRUG__ADDICTION_TYPE);

        magazinEClass = createEClass(MAGAZIN);
        createEReference(magazinEClass, MAGAZIN__TYPE);
        createEReference(magazinEClass, MAGAZIN__BULLETS);

        defaultWifiEClass = createEClass(DEFAULT_WIFI);

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
        interfaceModusEEnum = createEEnum(INTERFACE_MODUS);
        programTypeEEnum = createEEnum(PROGRAM_TYPE);
        matrixProgramTypeEEnum = createEEnum(MATRIX_PROGRAM_TYPE);
        substanceVectorEEnum = createEEnum(SUBSTANCE_VECTOR);
        substanceEffectEEnum = createEEnum(SUBSTANCE_EFFECT);
        addictionTypeEEnum = createEEnum(ADDICTION_TYPE);

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
        quelleEClass.getESuperTypes().add(this.getIdentifiable());
        sourceBookEClass.getESuperTypes().add(this.getBeschreibbar());
        sourceBookEClass.getESuperTypes().add(this.getIdentifiable());
        abstraktPersonaEClass.getESuperTypes().add(this.getBeschreibbar());
        abstraktPersonaEClass.getESuperTypes().add(this.getKoerperlicheAttribute());
        abstraktPersonaEClass.getESuperTypes().add(this.getSpezielleAttribute());
        abstraktPersonaEClass.getESuperTypes().add(this.getGeistigeAttribute());
        abstraktPersonaEClass.getESuperTypes().add(this.getChrakterLimits());
        gegenstandEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        reichweiteEClass.getESuperTypes().add(this.getBeschreibbar());
        reichweiteEClass.getESuperTypes().add(this.getIdentifiable());
        koerperlicheAttributeEClass.getESuperTypes().add(this.getModifikatorAttribute());
        spezielleAttributeEClass.getESuperTypes().add(this.getModifikatorAttribute());
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
        personaFertigkeitEClass.getESuperTypes().add(this.getSteigerbar());
        personaFertigkeitsGruppeEClass.getESuperTypes().add(this.getSteigerbar());
        cyberwareEClass.getESuperTypes().add(this.getKoerpermods());
        cyberwareEClass.getESuperTypes().add(this.getGeldWert());
        bioWareEClass.getESuperTypes().add(this.getKoerpermods());
        bioWareEClass.getESuperTypes().add(this.getGeldWert());
        koerpermodsEClass.getESuperTypes().add(this.getAbstraktModifikatoren());
        abstraktModifikatorenEClass.getESuperTypes().add(this.getBeschreibbar());
        abstraktModifikatorenEClass.getESuperTypes().add(this.getModifizierbar());
        abstraktModifikatorenEClass.getESuperTypes().add(this.getQuelle());
        geistigeAttributeEClass.getESuperTypes().add(this.getModifikatorAttribute());
        mudanPersonaEClass.getESuperTypes().add(this.getKoerperPersona());
        koerperPersonaEClass.getESuperTypes().add(this.getAbstraktPersona());
        koerperPersonaEClass.getESuperTypes().add(this.getPanzerung());
        koerperPersonaEClass.getESuperTypes().add(this.getPersonaZustand());
        koerperPersonaEClass.getESuperTypes().add(this.getBerechneteAttribute());
        magischeModsEClass.getESuperTypes().add(this.getAbstraktModifikatoren());
        kiKraftEClass.getESuperTypes().add(this.getMagischeMods());
        kiKraftEClass.getESuperTypes().add(this.getErlernbar());
        magischePersonaEClass.getESuperTypes().add(this.getKoerperPersona());
        magischePersonaEClass.getESuperTypes().add(this.getBaseMagischePersona());
        fernkampfwaffenModifikatorenEClass.getESuperTypes().add(this.getModifikatorAttribute());
        sichtverhaeltnisseEClass.getESuperTypes().add(this.getModifikatorAttribute());
        speziesEClass.getESuperTypes().add(this.getBeschreibbar());
        speziesEClass.getESuperTypes().add(this.getModifizierbar());
        speziesEClass.getESuperTypes().add(this.getQuelle());
        gegenstandStufenEClass.getESuperTypes().add(this.getModifikatorAttribute());
        kiAdeptEClass.getESuperTypes().add(this.getMagischePersona());
        kleidungEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        fernkampfwaffeModifikatorEClass.getESuperTypes().add(this.getAbstraktModifikatoren());
        personaEigenschaftEClass.getESuperTypes().add(this.getAbstraktModifikatoren());
        personaEigenschaftEClass.getESuperTypes().add(this.getErlernbar());
        probenModifikatorenEClass.getESuperTypes().add(this.getModifikatorAttribute());
        magierEClass.getESuperTypes().add(this.getMagischePersona());
        magierEClass.getESuperTypes().add(this.getZauberer());
        magierEClass.getESuperTypes().add(this.getAstraleProjektion());
        mysticAdeptEClass.getESuperTypes().add(this.getKiAdept());
        mysticAdeptEClass.getESuperTypes().add(this.getZauberer());
        personaZauberEClass.getESuperTypes().add(this.getErlernbar());
        zauberEClass.getESuperTypes().add(this.getBeschreibbar());
        zauberEClass.getESuperTypes().add(this.getQuelle());
        aspektMagierEClass.getESuperTypes().add(this.getMagischePersona());
        aspektMagierEClass.getESuperTypes().add(this.getZauberer());
        schutzgeistEClass.getESuperTypes().add(this.getMagischeMods());
        initationEClass.getESuperTypes().add(this.getSteigerbar());
        metaMagieEClass.getESuperTypes().add(this.getBeschreibbar());
        metaMagieEClass.getESuperTypes().add(this.getQuelle());
        critterKraftEClass.getESuperTypes().add(this.getMagischeMods());
        fahrzeugEClass.getESuperTypes().add(this.getBeschreibbar());
        fahrzeugEClass.getESuperTypes().add(this.getQuelle());
        fahrzeugEClass.getESuperTypes().add(this.getGeldWert());
        fahrzeugEClass.getESuperTypes().add(this.getAnwendbar());
        fahrzeugEClass.getESuperTypes().add(this.getModifizierbar());
        fahrzeugEClass.getESuperTypes().add(this.getFahrzeugZustand());
        bodenfahrzeugEClass.getESuperTypes().add(this.getPassagierFahrzeug());
        passagierFahrzeugEClass.getESuperTypes().add(this.getFahrzeug());
        drohneEClass.getESuperTypes().add(this.getFahrzeug());
        drohneEClass.getESuperTypes().add(this.getMatrixAttributes());
        fahrzeugModifikationEClass.getESuperTypes().add(this.getBeschreibbar());
        fahrzeugModifikationEClass.getESuperTypes().add(this.getQuelle());
        fahrzeugModifikationEClass.getESuperTypes().add(this.getGeldWert());
        technomancerEClass.getESuperTypes().add(this.getKoerperPersona());
        technomancerEClass.getESuperTypes().add(this.getResonanzPersona());
        resonanzPersonaEClass.getESuperTypes().add(this.getActiveMatixDevice());
        komplexeFormEClass.getESuperTypes().add(this.getQuelle());
        komplexeFormEClass.getESuperTypes().add(this.getBeschreibbar());
        personaKomplexFormEClass.getESuperTypes().add(this.getErlernbar());
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
        steigerbarEClass.getESuperTypes().add(this.getErlernbar());
        credstickEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        munitionEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        munitionEClass.getESuperTypes().add(this.getMenge());
        stufenPersonaEClass.getESuperTypes().add(this.getQuelle());
        stufenPersonaEClass.getESuperTypes().add(this.getSpezielleAttribute());
        stufenPersonaEClass.getESuperTypes().add(this.getGeistigeAttribute());
        stufenPersonaEClass.getESuperTypes().add(this.getKoerperlicheAttribute());
        stufenPersonaEClass.getESuperTypes().add(this.getBeschreibbar());
        stufenPersonaEClass.getESuperTypes().add(this.getChrakterLimits());
        stufenPersonaEClass.getESuperTypes().add(this.getPanzerung());
        geistEClass.getESuperTypes().add(this.getStufenPersona());
        geistEClass.getESuperTypes().add(this.getAstraleProjektion());
        spezialisierungEClass.getESuperTypes().add(this.getBeschreibbar());
        spezialisierungEClass.getESuperTypes().add(this.getQuelle());
        spezialisierungEClass.getESuperTypes().add(this.getErlernbar());
        matrixAttributesEClass.getESuperTypes().add(this.getMatixConditionMonitor());
        activeMatixDeviceEClass.getESuperTypes().add(this.getMatrixAttributes());
        commlinkEClass.getESuperTypes().add(this.getAbstractMatrixDevice());
        cyberdeckEClass.getESuperTypes().add(this.getAbstractMatrixDevice());
        cyberdeckEClass.getESuperTypes().add(this.getMatrixDevice());
        cyberdeckEClass.getESuperTypes().add(this.getActiveMatixDevice());
        softwareAgentEClass.getESuperTypes().add(this.getMatrixProgram());
        hostEClass.getESuperTypes().add(this.getBeschreibbar());
        hostEClass.getESuperTypes().add(this.getMatrixDevice());
        hostEClass.getESuperTypes().add(this.getActiveMatixDevice());
        cyberwareModifikatiorenEClass.getESuperTypes().add(this.getModifikatorAttribute());
        riggerCommandConsoleEClass.getESuperTypes().add(this.getAbstractMatrixDevice());
        autoSoftEClass.getESuperTypes().add(this.getRiggerProgram());
        softwareEClass.getESuperTypes().add(this.getGeldWert());
        softwareEClass.getESuperTypes().add(this.getBeschreibbar());
        softwareEClass.getESuperTypes().add(this.getQuelle());
        matrixProgramEClass.getESuperTypes().add(this.getSoftware());
        tutorsoftEClass.getESuperTypes().add(this.getBasicProgram());
        skillSoftEClass.getESuperTypes().add(this.getSoftware());
        basicProgramEClass.getESuperTypes().add(this.getSoftware());
        datasoftEClass.getESuperTypes().add(this.getBasicProgram());
        abstractMatrixDeviceEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        abstractMatrixDeviceEClass.getESuperTypes().add(this.getMatrixDevice());
        consumerSoftEClass.getESuperTypes().add(this.getBasicProgram());
        riggerProgramEClass.getESuperTypes().add(this.getSoftware());
        matrixDeviceEClass.getESuperTypes().add(this.getMatrixAttributes());
        commonProgramEClass.getESuperTypes().add(this.getMatrixProgram());
        commonProgramEClass.getESuperTypes().add(this.getRiggerProgram());
        weaponMountEClass.getESuperTypes().add(this.getFahrzeugModifikation());
        lifestyleOptionEClass.getESuperTypes().add(this.getBeschreibbar());
        lifestyleOptionEClass.getESuperTypes().add(this.getQuelle());
        lifestyleOptionEClass.getESuperTypes().add(this.getGeldWert());
        percentLifestyleOptionEClass.getESuperTypes().add(this.getLifestyleOption());
        fokusEClass.getESuperTypes().add(this.getMagischeStufe());
        fokusEClass.getESuperTypes().add(this.getErlernbar());
        abstraktFokusEClass.getESuperTypes().add(this.getFokus());
        abstraktFokusEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        qiFokusEClass.getESuperTypes().add(this.getAbstraktFokus());
        waffenFokusEClass.getESuperTypes().add(this.getNahkampfwaffe());
        waffenFokusEClass.getESuperTypes().add(this.getFokus());
        magieFokusEClass.getESuperTypes().add(this.getAbstraktFokus());
        substanceEClass.getESuperTypes().add(this.getBeschreibbar());
        substanceEClass.getESuperTypes().add(this.getQuelle());
        substanceEClass.getESuperTypes().add(this.getGeldWert());
        substanceEClass.getESuperTypes().add(this.getMenge());
        toxinEClass.getESuperTypes().add(this.getSubstance());
        drugEClass.getESuperTypes().add(this.getSubstance());
        drugEClass.getESuperTypes().add(this.getModifizierbar());
        magazinEClass.getESuperTypes().add(this.getAbstraktGegenstand());
        defaultWifiEClass.getESuperTypes().add(this.getAbstractMatrixDevice());

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
        initEAttribute(getGeldWert_Wert(), ecorePackage.getEBigDecimal(), "wert", null, 0, 1, GeldWert.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeldWert_Verfuegbarkeit(), ecorePackage.getEString(), "verfuegbarkeit", null, 0, 1, GeldWert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeldWert_WertValue(), ecorePackage.getEBigDecimal(), "wertValue", null, 0, 1, GeldWert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getAbstraktGegenstand_Wifi(), this.getMatrixDevice(), null, "wifi", null, 0, 1, AbstraktGegenstand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getFeuerwaffe_Magazin(), this.getMagazin(), null, "magazin", null, 0, 1, Feuerwaffe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getFertigkeit_Spezialisierungen(), this.getSpezialisierung(), null, "spezialisierungen", null, 0, -1, Fertigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personaFertigkeitEClass, PersonaFertigkeit.class, "PersonaFertigkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPersonaFertigkeit_Fertigkeit(), this.getFertigkeit(), null, "fertigkeit", null, 0, 1, PersonaFertigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPersonaFertigkeit_Spezialisierungen(), this.getSpezialisierung(), null, "spezialisierungen", null, 0, -1, PersonaFertigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personaFertigkeitsGruppeEClass, PersonaFertigkeitsGruppe.class, "PersonaFertigkeitsGruppe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPersonaFertigkeitsGruppe_Gruppe(), this.getFertigkeitsGruppe(), null, "gruppe", null, 0, 1, PersonaFertigkeitsGruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getBaseMagischePersona_BoundFoki(), this.getFokusBinding(), null, "boundFoki", null, 0, -1, BaseMagischePersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fernkampfwaffenModifikatorenEClass, FernkampfwaffenModifikatoren.class, "FernkampfwaffenModifikatoren", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFernkampfwaffenModifikatoren_Smartgun(), this.getSmartgunType(), "smartgun", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFernkampfwaffenModifikatoren_Rueckstoss(), ecorePackage.getEInt(), "rueckstoss", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFernkampfwaffenModifikatoren_LasterPointer(), ecorePackage.getEBoolean(), "lasterPointer", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFernkampfwaffenModifikatoren_Schalldaempfer(), ecorePackage.getEBoolean(), "schalldaempfer", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFernkampfwaffenModifikatoren_Vergroesserung(), ecorePackage.getEInt(), "vergroesserung", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFernkampfwaffenModifikatoren_Sichtverbesserung(), ecorePackage.getEInt(), "sichtverbesserung", null, 0, 1, FernkampfwaffenModifikatoren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getSpezies_Angriff(), this.getNahkampfwaffe(), null, "angriff", null, 1, 1, Spezies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getAnwendbar_Spezialisierung(), this.getSpezialisierung(), null, "spezialisierung", null, 0, 1, Anwendbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getZauberer_GebundeneGeister(), this.getGebundenerGeist(), null, "gebundeneGeister", null, 0, -1, Zauberer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getZauberer_UngebundenerGeist(), this.getGebundenerGeist(), null, "ungebundenerGeist", null, 0, 1, Zauberer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEAttribute(getFahrzeug_Panzer(), ecorePackage.getEInt(), "panzer", null, 0, 1, Fahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFahrzeug_WeaponMounts(), ecorePackage.getEInt(), "weaponMounts", null, 0, 1, Fahrzeug.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bodenfahrzeugEClass, Bodenfahrzeug.class, "Bodenfahrzeug", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBodenfahrzeug_HandlingGelaende(), ecorePackage.getEInt(), "handlingGelaende", null, 0, 1, Bodenfahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBodenfahrzeug_GeschwindigkeitGelaende(), ecorePackage.getEInt(), "geschwindigkeitGelaende", null, 0, 1, Bodenfahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(passagierFahrzeugEClass, PassagierFahrzeug.class, "PassagierFahrzeug", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPassagierFahrzeug_Sitze(), ecorePackage.getEInt(), "sitze", null, 0, 1, PassagierFahrzeug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(drohneEClass, Drohne.class, "Drohne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDrohne_ProgramSlotCount(), ecorePackage.getEInt(), "programSlotCount", null, 0, 1, Drohne.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDrohne_RunningPrograms(), this.getRiggerProgram(), null, "runningPrograms", null, 0, -1, Drohne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDrohne_StoredPrograms(), this.getRiggerProgram(), null, "storedPrograms", null, 0, -1, Drohne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fahrzeugModifikationEClass, FahrzeugModifikation.class, "FahrzeugModifikation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(technomancerEClass, Technomancer.class, "Technomancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTechnomancer_ComplexForms(), this.getPersonaKomplexForm(), null, "complexForms", null, 0, -1, Technomancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTechnomancer_Echos(), this.getEcho(), null, "echos", null, 0, -1, Technomancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resonanzPersonaEClass, ResonanzPersona.class, "ResonanzPersona", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResonanzPersona_Resonanz(), ecorePackage.getEInt(), "resonanz", null, 0, 1, ResonanzPersona.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
        initEReference(getLifestyle_Options(), this.getLifestyleOption(), null, "options", null, 0, -1, Lifestyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifestyle_Owned(), ecorePackage.getEBoolean(), "owned", null, 0, 1, Lifestyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(wissensfertigkeitEClass, Wissensfertigkeit.class, "Wissensfertigkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sprachfertigkeitEClass, Sprachfertigkeit.class, "Sprachfertigkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(personaZustandEClass, PersonaZustand.class, "PersonaZustand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPersonaZustand_ZustandKoerperlichMax(), ecorePackage.getEInt(), "zustandKoerperlichMax", null, 0, 1, PersonaZustand.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPersonaZustand_ZustandGeistigMax(), ecorePackage.getEInt(), "zustandGeistigMax", null, 0, 1, PersonaZustand.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPersonaZustand_ZustandGrenze(), ecorePackage.getEInt(), "zustandGrenze", null, 0, 1, PersonaZustand.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(critterEClass, Critter.class, "Critter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCritter_Powers(), this.getCritterKraft(), null, "powers", null, 0, -1, Critter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(intervallVertragEClass, IntervallVertrag.class, "IntervallVertrag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntervallVertrag_FaelligkeitsIntervall(), ecorePackage.getEInt(), "faelligkeitsIntervall", null, 0, 1, IntervallVertrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sinEClass, Sin.class, "Sin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(lizenzEClass, Lizenz.class, "Lizenz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLizenz_LizenGegenstand(), ecorePackage.getEString(), "lizenGegenstand", null, 0, 1, Lizenz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLizenz_LizenzTraeger(), this.getSin(), null, "lizenzTraeger", null, 1, 1, Lizenz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fakeableEClass, Fakeable.class, "Fakeable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFakeable_Stufe(), ecorePackage.getEInt(), "stufe", null, 0, 1, Fakeable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFakeable_Gefaelscht(), ecorePackage.getEBoolean(), "gefaelscht", null, 0, 1, Fakeable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(steigerbarEClass, Steigerbar.class, "Steigerbar", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSteigerbar_Stufe(), ecorePackage.getEInt(), "stufe", null, 0, 1, Steigerbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(erlernbarEClass, Erlernbar.class, "Erlernbar", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(credstickEClass, Credstick.class, "Credstick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCredstick_MaxValue(), ecorePackage.getEInt(), "maxValue", null, 1, 1, Credstick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCredstick_Transactionlog(), this.getCredstickTransaction(), null, "transactionlog", null, 0, -1, Credstick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCredstick_CurrentValue(), ecorePackage.getEBigDecimal(), "currentValue", null, 0, 1, Credstick.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mengeEClass, Menge.class, "Menge", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMenge_Anzahl(), ecorePackage.getEInt(), "anzahl", null, 0, 1, Menge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMenge_ProAnzahl(), ecorePackage.getEInt(), "proAnzahl", null, 0, 1, Menge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(munitionEClass, Munition.class, "Munition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMunition_DamageType(), this.getSchadensTyp(), "damageType", null, 0, 1, Munition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMunition_DamageMod(), ecorePackage.getEInt(), "damageMod", null, 0, 1, Munition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMunition_ArmorMod(), ecorePackage.getEInt(), "armorMod", null, 0, 1, Munition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMunition_Type(), this.getReichweite(), null, "type", null, 1, 1, Munition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modifikatorAttributeEClass, ModifikatorAttribute.class, "ModifikatorAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(gebundenerGeistEClass, GebundenerGeist.class, "GebundenerGeist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGebundenerGeist_Dienste(), ecorePackage.getEInt(), "dienste", null, 0, 1, GebundenerGeist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGebundenerGeist_Geist(), this.getGeist(), null, "geist", null, 1, 1, GebundenerGeist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stufenPersonaEClass, StufenPersona.class, "StufenPersona", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStufenPersona_Stufe(), ecorePackage.getEInt(), "stufe", null, 1, 1, StufenPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStufenPersona_SkillGroups(), this.getFertigkeitsGruppe(), null, "skillGroups", null, 0, -1, StufenPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStufenPersona_Skills(), this.getFertigkeit(), null, "skills", null, 0, -1, StufenPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(geistEClass, Geist.class, "Geist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGeist_KonstitutionBasis(), ecorePackage.getEInt(), "konstitutionBasis", null, 0, 1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeist_GeschicklichkeitBasis(), ecorePackage.getEInt(), "geschicklichkeitBasis", null, 0, 1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeist_ReaktionBasis(), ecorePackage.getEInt(), "reaktionBasis", null, 0, 1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeist_StaerkeBasis(), ecorePackage.getEInt(), "staerkeBasis", null, 0, 1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeist_CharismaBasis(), ecorePackage.getEInt(), "charismaBasis", null, 0, 1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeist_WillenskraftBasis(), ecorePackage.getEInt(), "willenskraftBasis", null, 0, 1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeist_IntuitionBasis(), ecorePackage.getEInt(), "intuitionBasis", null, 0, 1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeist_LogikBasis(), ecorePackage.getEInt(), "logikBasis", null, 0, 1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGeist_Powers(), this.getCritterKraft(), null, "powers", null, 0, -1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGeist_OptionalPowers(), this.getCritterKraft(), null, "optionalPowers", null, 0, -1, Geist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIdentifiable_ParentId(), ecorePackage.getEString(), "parentId", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentifiable_Localizations(), this.getLocalization(), null, "localizations", null, 0, -1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(credstickTransactionEClass, CredstickTransaction.class, "CredstickTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCredstickTransaction_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 1, 1, CredstickTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCredstickTransaction_Date(), this.getShrDate(), "date", null, 1, 1, CredstickTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCredstickTransaction_Description(), ecorePackage.getEString(), "description", null, 1, 1, CredstickTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(spezialisierungEClass, Spezialisierung.class, "Spezialisierung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(matrixAttributesEClass, MatrixAttributes.class, "MatrixAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMatrixAttributes_Geraetestufe(), ecorePackage.getEInt(), "geraetestufe", null, 0, 1, MatrixAttributes.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMatrixAttributes_Firewall(), ecorePackage.getEInt(), "firewall", null, 0, 1, MatrixAttributes.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMatrixAttributes_Datenverarbeitung(), ecorePackage.getEInt(), "datenverarbeitung", null, 0, 1, MatrixAttributes.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMatrixAttributes_CurrentModus(), this.getInterfaceModus(), "currentModus", null, 0, 1, MatrixAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(activeMatixDeviceEClass, ActiveMatixDevice.class, "ActiveMatixDevice", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActiveMatixDevice_Angriff(), ecorePackage.getEInt(), "angriff", null, 0, 1, ActiveMatixDevice.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActiveMatixDevice_Schleicher(), ecorePackage.getEInt(), "schleicher", null, 0, 1, ActiveMatixDevice.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(commlinkEClass, Commlink.class, "Commlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCommlink_StoredPrograms(), this.getBasicProgram(), null, "storedPrograms", null, 0, -1, Commlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(matixConditionMonitorEClass, MatixConditionMonitor.class, "MatixConditionMonitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMatixConditionMonitor_MatrixZustandMax(), ecorePackage.getEInt(), "matrixZustandMax", null, 0, 1, MatixConditionMonitor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cyberdeckEClass, Cyberdeck.class, "Cyberdeck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCyberdeck_ProgramSlots(), ecorePackage.getEInt(), "programSlots", null, 0, 1, Cyberdeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCyberdeck_Attribute1(), ecorePackage.getEInt(), "attribute1", null, 1, 1, Cyberdeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCyberdeck_Attribute2(), ecorePackage.getEInt(), "attribute2", null, 1, 1, Cyberdeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCyberdeck_Attribute3(), ecorePackage.getEInt(), "attribute3", null, 1, 1, Cyberdeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCyberdeck_Attribute4(), ecorePackage.getEInt(), "attribute4", null, 1, 1, Cyberdeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCyberdeck_Configuration(), ecorePackage.getEAttribute(), null, "configuration", null, 4, 4, Cyberdeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCyberdeck_StoredPrograms(), this.getMatrixProgram(), null, "storedPrograms", null, 0, -1, Cyberdeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCyberdeck_RunningPrograms(), this.getMatrixProgram(), null, "runningPrograms", null, 0, -1, Cyberdeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(softwareAgentEClass, SoftwareAgent.class, "SoftwareAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSoftwareAgent_Rating(), ecorePackage.getEInt(), "rating", null, 1, 1, SoftwareAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hostEClass, Host.class, "Host", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHost_HostRating(), ecorePackage.getEInt(), "hostRating", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHost_BaseFirewall(), ecorePackage.getEInt(), "baseFirewall", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHost_BaseDatenverarbeitung(), ecorePackage.getEInt(), "baseDatenverarbeitung", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHost_BaseAngriff(), ecorePackage.getEInt(), "baseAngriff", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHost_BaseSchleicher(), ecorePackage.getEInt(), "baseSchleicher", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cyberwareModifikatiorenEClass, CyberwareModifikatioren.class, "CyberwareModifikatioren", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCyberwareModifikatioren_DirectNeuralInterface(), ecorePackage.getEBoolean(), "directNeuralInterface", null, 0, 1, CyberwareModifikatioren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCyberwareModifikatioren_UniversalDataConnector(), ecorePackage.getEBoolean(), "universalDataConnector", null, 0, 1, CyberwareModifikatioren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCyberwareModifikatioren_ControlRig(), ecorePackage.getEInt(), "controlRig", null, 0, 1, CyberwareModifikatioren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCyberwareModifikatioren_SimRig(), ecorePackage.getEInt(), "simRig", null, 0, 1, CyberwareModifikatioren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCyberwareModifikatioren_RiggerInterface(), ecorePackage.getEBoolean(), "riggerInterface", null, 0, 1, CyberwareModifikatioren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(riggerCommandConsoleEClass, RiggerCommandConsole.class, "RiggerCommandConsole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRiggerCommandConsole_Rauschunterdrueckung(), ecorePackage.getEInt(), "rauschunterdrueckung", null, 0, 1, RiggerCommandConsole.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRiggerCommandConsole_Zugriff(), ecorePackage.getEInt(), "zugriff", null, 0, 1, RiggerCommandConsole.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRiggerCommandConsole_DatenverarbeitungBasis(), ecorePackage.getEInt(), "datenverarbeitungBasis", null, 1, 1, RiggerCommandConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRiggerCommandConsole_FirewallBasis(), ecorePackage.getEInt(), "firewallBasis", null, 1, 1, RiggerCommandConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRiggerCommandConsole_ZugriffBasis(), ecorePackage.getEInt(), "zugriffBasis", null, 0, 1, RiggerCommandConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiggerCommandConsole_StoredPrograms(), this.getRiggerProgram(), null, "storedPrograms", null, 0, -1, RiggerCommandConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiggerCommandConsole_RunningPrograms(), this.getRiggerProgram(), null, "runningPrograms", null, 0, -1, RiggerCommandConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(autoSoftEClass, AutoSoft.class, "AutoSoft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAutoSoft_Rating(), ecorePackage.getEInt(), "rating", null, 1, 1, AutoSoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAutoSoft_Skill(), this.getFertigkeit(), null, "skill", null, 0, 1, AutoSoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAutoSoft_Weapon(), this.getAbstaktWaffe(), null, "weapon", null, 0, 1, AutoSoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAutoSoft_Model(), this.getDrohne(), null, "model", null, 0, 1, AutoSoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(softwareEClass, Software.class, "Software", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(matrixProgramEClass, MatrixProgram.class, "MatrixProgram", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tutorsoftEClass, Tutorsoft.class, "Tutorsoft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTutorsoft_Rating(), ecorePackage.getEInt(), "rating", null, 1, 1, Tutorsoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTutorsoft_Skill(), this.getFertigkeit(), null, "skill", null, 1, 1, Tutorsoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(skillSoftEClass, SkillSoft.class, "SkillSoft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSkillSoft_Skill(), this.getFertigkeit(), null, "skill", null, 1, 1, SkillSoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSkillSoft_Rating(), ecorePackage.getEInt(), "rating", null, 1, 1, SkillSoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fahrzeugZustandEClass, FahrzeugZustand.class, "FahrzeugZustand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFahrzeugZustand_ZustandMax(), ecorePackage.getEInt(), "zustandMax", null, 0, 1, FahrzeugZustand.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personalAreaNetworkEClass, PersonalAreaNetwork.class, "PersonalAreaNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPersonalAreaNetwork_Slaves(), this.getMatrixDevice(), null, "slaves", null, 0, -1, PersonalAreaNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPersonalAreaNetwork_Master(), this.getMatrixDevice(), this.getMatrixDevice_Pan(), "master", null, 1, 1, PersonalAreaNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPersonalAreaNetwork_SlaveMax(), ecorePackage.getEInt(), "slaveMax", null, 0, 1, PersonalAreaNetwork.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(basicProgramEClass, BasicProgram.class, "BasicProgram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(datasoftEClass, Datasoft.class, "Datasoft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDatasoft_Skill(), this.getWissensfertigkeit(), null, "skill", null, 1, 1, Datasoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractMatrixDeviceEClass, AbstractMatrixDevice.class, "AbstractMatrixDevice", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractMatrixDevice_DeviceRating(), ecorePackage.getEInt(), "deviceRating", null, 1, 1, AbstractMatrixDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(consumerSoftEClass, ConsumerSoft.class, "ConsumerSoft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConsumerSoft_Type(), this.getProgramType(), "type", null, 0, 1, ConsumerSoft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(riggerProgramEClass, RiggerProgram.class, "RiggerProgram", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(matrixDeviceEClass, MatrixDevice.class, "MatrixDevice", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMatrixDevice_Pan(), this.getPersonalAreaNetwork(), this.getPersonalAreaNetwork_Master(), "pan", null, 0, 1, MatrixDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(commonProgramEClass, CommonProgram.class, "CommonProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCommonProgram_ProgramType(), this.getMatrixProgramType(), "programType", null, 0, 1, CommonProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(weaponMountEClass, WeaponMount.class, "WeaponMount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWeaponMount_Weapon(), this.getAbstaktWaffe(), null, "weapon", null, 1, 1, WeaponMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(lifestyleOptionEClass, LifestyleOption.class, "LifestyleOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(percentLifestyleOptionEClass, PercentLifestyleOption.class, "PercentLifestyleOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(localizationEClass, Localization.class, "Localization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLocalization_Local(), ecorePackage.getEString(), "local", null, 1, 1, Localization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLocalization_Name(), ecorePackage.getEString(), "name", null, 1, 1, Localization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLocalization_Page(), ecorePackage.getEInt(), "page", null, 0, 1, Localization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(berechneteAttributeEClass, BerechneteAttribute.class, "BerechneteAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBerechneteAttribute_Errinerungsvermoegen(), ecorePackage.getEInt(), "errinerungsvermoegen", null, 1, 1, BerechneteAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getBerechneteAttribute_Menschenkenntnis(), ecorePackage.getEInt(), "menschenkenntnis", null, 1, 1, BerechneteAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getBerechneteAttribute_Selbstbeherrschung(), ecorePackage.getEInt(), "selbstbeherrschung", null, 1, 1, BerechneteAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(magischeStufeEClass, MagischeStufe.class, "MagischeStufe", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMagischeStufe_Stufe(), ecorePackage.getEInt(), "stufe", null, 0, 1, MagischeStufe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fokusEClass, Fokus.class, "Fokus", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFokus_Bindungskosten(), ecorePackage.getEInt(), "bindungskosten", null, 1, 1, Fokus.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(abstraktFokusEClass, AbstraktFokus.class, "AbstraktFokus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(qiFokusEClass, QiFokus.class, "QiFokus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getQiFokus_Power(), this.getKiKraft(), null, "power", null, 1, 1, QiFokus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(waffenFokusEClass, WaffenFokus.class, "WaffenFokus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(magieFokusEClass, MagieFokus.class, "MagieFokus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMagieFokus_BindungsFaktor(), ecorePackage.getEInt(), "bindungsFaktor", null, 1, 1, MagieFokus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fokusBindingEClass, FokusBinding.class, "FokusBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFokusBinding_Fokus(), this.getFokus(), null, "fokus", null, 1, 1, FokusBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFokusBinding_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, FokusBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(substanceEClass, Substance.class, "Substance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSubstance_Vector(), this.getSubstanceVector(), "vector", null, 0, 1, Substance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubstance_Speed(), ecorePackage.getEString(), "speed", null, 0, 1, Substance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(toxinEClass, Toxin.class, "Toxin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getToxin_Power(), ecorePackage.getEInt(), "power", null, 0, 1, Toxin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getToxin_Penetration(), ecorePackage.getEInt(), "penetration", null, 0, 1, Toxin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getToxin_Effect(), this.getSubstanceEffect(), "effect", null, 0, -1, Toxin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(drugEClass, Drug.class, "Drug", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDrug_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, Drug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDrug_AddictionType(), this.getAddictionType(), "addictionType", null, 0, 1, Drug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(magazinEClass, Magazin.class, "Magazin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMagazin_Type(), this.getFeuerwaffe(), null, "type", null, 1, 1, Magazin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMagazin_Bullets(), this.getMunition(), null, "bullets", null, 0, -1, Magazin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(defaultWifiEClass, DefaultWifi.class, "DefaultWifi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

        initEEnum(interfaceModusEEnum, InterfaceModus.class, "InterfaceModus");
        addEEnumLiteral(interfaceModusEEnum, InterfaceModus.AUGMENTED_REALITY);
        addEEnumLiteral(interfaceModusEEnum, InterfaceModus.COLD_SIM);
        addEEnumLiteral(interfaceModusEEnum, InterfaceModus.HOT_SIM);

        initEEnum(programTypeEEnum, ProgramType.class, "ProgramType");
        addEEnumLiteral(programTypeEEnum, ProgramType.DEFAULT_SOFT);
        addEEnumLiteral(programTypeEEnum, ProgramType.DATA_SOFT);
        addEEnumLiteral(programTypeEEnum, ProgramType.SHOP_SOFT);

        initEEnum(matrixProgramTypeEEnum, MatrixProgramType.class, "MatrixProgramType");
        addEEnumLiteral(matrixProgramTypeEEnum, MatrixProgramType.DEFAULT_PROGRAM);
        addEEnumLiteral(matrixProgramTypeEEnum, MatrixProgramType.HACKING_PROGRAM);

        initEEnum(substanceVectorEEnum, SubstanceVector.class, "SubstanceVector");
        addEEnumLiteral(substanceVectorEEnum, SubstanceVector.CONTACT);
        addEEnumLiteral(substanceVectorEEnum, SubstanceVector.INHALATION);
        addEEnumLiteral(substanceVectorEEnum, SubstanceVector.INGESTION);
        addEEnumLiteral(substanceVectorEEnum, SubstanceVector.INJECTION);

        initEEnum(substanceEffectEEnum, SubstanceEffect.class, "SubstanceEffect");
        addEEnumLiteral(substanceEffectEEnum, SubstanceEffect.DISORIENTATION);
        addEEnumLiteral(substanceEffectEEnum, SubstanceEffect.NAUSEA);
        addEEnumLiteral(substanceEffectEEnum, SubstanceEffect.PARALYSIS);
        addEEnumLiteral(substanceEffectEEnum, SubstanceEffect.STUN_DAMAGE);

        initEEnum(addictionTypeEEnum, AddictionType.class, "AddictionType");
        addEEnumLiteral(addictionTypeEEnum, AddictionType.PSYCHOLOGICAL);
        addEEnumLiteral(addictionTypeEEnum, AddictionType.PHYSIOLOGICAL);
        addEEnumLiteral(addictionTypeEEnum, AddictionType.BOTH);

        // Initialize data types
        initEDataType(shrDateEDataType, Date.class, "ShrDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(modificationManagerEDataType, ModSetter.class, "ModificationManager", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //Shr5PackageImpl
