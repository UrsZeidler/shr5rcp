/**
 */
package de.urszeidler.eclipse.shr5.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.urszeidler.eclipse.shr5.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package
 * @generated
 */
public class Shr5AdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static Shr5Package modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5AdapterFactory() {
        if (modelPackage == null) {
            modelPackage = Shr5Package.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Shr5Switch<Adapter> modelSwitch =
		new Shr5Switch<Adapter>() {
            @Override
            public Adapter caseBeschreibbar(Beschreibbar object) {
                return createBeschreibbarAdapter();
            }
            @Override
            public Adapter caseQuelle(Quelle object) {
                return createQuelleAdapter();
            }
            @Override
            public Adapter caseSourceBook(SourceBook object) {
                return createSourceBookAdapter();
            }
            @Override
            public Adapter caseAbstraktPersona(AbstraktPersona object) {
                return createAbstraktPersonaAdapter();
            }
            @Override
            public Adapter caseGegenstand(Gegenstand object) {
                return createGegenstandAdapter();
            }
            @Override
            public Adapter caseGeldWert(GeldWert object) {
                return createGeldWertAdapter();
            }
            @Override
            public Adapter caseReichweite(Reichweite object) {
                return createReichweiteAdapter();
            }
            @Override
            public Adapter caseAttributModifikatorWert(AttributModifikatorWert object) {
                return createAttributModifikatorWertAdapter();
            }
            @Override
            public Adapter caseModifizierbar(Modifizierbar object) {
                return createModifizierbarAdapter();
            }
            @Override
            public Adapter caseKoerperlicheAttribute(KoerperlicheAttribute object) {
                return createKoerperlicheAttributeAdapter();
            }
            @Override
            public Adapter caseSpezielleAttribute(SpezielleAttribute object) {
                return createSpezielleAttributeAdapter();
            }
            @Override
            public Adapter caseAbstraktGegenstand(AbstraktGegenstand object) {
                return createAbstraktGegenstandAdapter();
            }
            @Override
            public Adapter caseAbstaktFernKampfwaffe(AbstaktFernKampfwaffe object) {
                return createAbstaktFernKampfwaffeAdapter();
            }
            @Override
            public Adapter caseAbstaktWaffe(AbstaktWaffe object) {
                return createAbstaktWaffeAdapter();
            }
            @Override
            public Adapter caseNahkampfwaffe(Nahkampfwaffe object) {
                return createNahkampfwaffeAdapter();
            }
            @Override
            public Adapter caseFeuerwaffe(Feuerwaffe object) {
                return createFeuerwaffeAdapter();
            }
            @Override
            public Adapter caseWurfwaffe(Wurfwaffe object) {
                return createWurfwaffeAdapter();
            }
            @Override
            public Adapter caseShrList(ShrList object) {
                return createShrListAdapter();
            }
            @Override
            public Adapter caseProjektilwaffe(Projektilwaffe object) {
                return createProjektilwaffeAdapter();
            }
            @Override
            public Adapter caseFertigkeitsGruppe(FertigkeitsGruppe object) {
                return createFertigkeitsGruppeAdapter();
            }
            @Override
            public Adapter caseFertigkeit(Fertigkeit object) {
                return createFertigkeitAdapter();
            }
            @Override
            public Adapter casePersonaFertigkeit(PersonaFertigkeit object) {
                return createPersonaFertigkeitAdapter();
            }
            @Override
            public Adapter casePersonaFertigkeitsGruppe(PersonaFertigkeitsGruppe object) {
                return createPersonaFertigkeitsGruppeAdapter();
            }
            @Override
            public Adapter caseCyberware(Cyberware object) {
                return createCyberwareAdapter();
            }
            @Override
            public Adapter caseBioWare(BioWare object) {
                return createBioWareAdapter();
            }
            @Override
            public Adapter caseKoerpermods(Koerpermods object) {
                return createKoerpermodsAdapter();
            }
            @Override
            public Adapter caseAbstraktModifikatoren(AbstraktModifikatoren object) {
                return createAbstraktModifikatorenAdapter();
            }
            @Override
            public Adapter caseGeistigeAttribute(GeistigeAttribute object) {
                return createGeistigeAttributeAdapter();
            }
            @Override
            public Adapter caseMudanPersona(MudanPersona object) {
                return createMudanPersonaAdapter();
            }
            @Override
            public Adapter caseKoerperPersona(KoerperPersona object) {
                return createKoerperPersonaAdapter();
            }
            @Override
            public Adapter caseMagischeMods(MagischeMods object) {
                return createMagischeModsAdapter();
            }
            @Override
            public Adapter caseKiKraft(KiKraft object) {
                return createKiKraftAdapter();
            }
            @Override
            public Adapter caseMagischePersona(MagischePersona object) {
                return createMagischePersonaAdapter();
            }
            @Override
            public Adapter caseBaseMagischePersona(BaseMagischePersona object) {
                return createBaseMagischePersonaAdapter();
            }
            @Override
            public Adapter caseFernkampfwaffenModifikatoren(FernkampfwaffenModifikatoren object) {
                return createFernkampfwaffenModifikatorenAdapter();
            }
            @Override
            public Adapter caseSichtverhaeltnisse(Sichtverhaeltnisse object) {
                return createSichtverhaeltnisseAdapter();
            }
            @Override
            public Adapter caseSpezies(Spezies object) {
                return createSpeziesAdapter();
            }
            @Override
            public Adapter caseGegenstandStufen(GegenstandStufen object) {
                return createGegenstandStufenAdapter();
            }
            @Override
            public Adapter caseKiAdept(KiAdept object) {
                return createKiAdeptAdapter();
            }
            @Override
            public Adapter caseKleidung(Kleidung object) {
                return createKleidungAdapter();
            }
            @Override
            public Adapter caseFernkampfwaffeModifikator(FernkampfwaffeModifikator object) {
                return createFernkampfwaffeModifikatorAdapter();
            }
            @Override
            public Adapter caseAnwendbar(Anwendbar object) {
                return createAnwendbarAdapter();
            }
            @Override
            public Adapter casePersonaEigenschaft(PersonaEigenschaft object) {
                return createPersonaEigenschaftAdapter();
            }
            @Override
            public Adapter caseProbenModifikatoren(ProbenModifikatoren object) {
                return createProbenModifikatorenAdapter();
            }
            @Override
            public Adapter caseMagier(Magier object) {
                return createMagierAdapter();
            }
            @Override
            public Adapter caseZauberer(Zauberer object) {
                return createZaubererAdapter();
            }
            @Override
            public Adapter caseMysticAdept(MysticAdept object) {
                return createMysticAdeptAdapter();
            }
            @Override
            public Adapter casePersonaZauber(PersonaZauber object) {
                return createPersonaZauberAdapter();
            }
            @Override
            public Adapter caseZauber(Zauber object) {
                return createZauberAdapter();
            }
            @Override
            public Adapter caseChrakterLimits(ChrakterLimits object) {
                return createChrakterLimitsAdapter();
            }
            @Override
            public Adapter casePanzerung(Panzerung object) {
                return createPanzerungAdapter();
            }
            @Override
            public Adapter caseAspektMagier(AspektMagier object) {
                return createAspektMagierAdapter();
            }
            @Override
            public Adapter caseAstraleProjektion(AstraleProjektion object) {
                return createAstraleProjektionAdapter();
            }
            @Override
            public Adapter caseSchutzgeist(Schutzgeist object) {
                return createSchutzgeistAdapter();
            }
            @Override
            public Adapter caseInitation(Initation object) {
                return createInitationAdapter();
            }
            @Override
            public Adapter caseMetaMagie(MetaMagie object) {
                return createMetaMagieAdapter();
            }
            @Override
            public Adapter caseCritterKraft(CritterKraft object) {
                return createCritterKraftAdapter();
            }
            @Override
            public Adapter caseFahrzeug(Fahrzeug object) {
                return createFahrzeugAdapter();
            }
            @Override
            public Adapter caseBodenfahrzeug(Bodenfahrzeug object) {
                return createBodenfahrzeugAdapter();
            }
            @Override
            public Adapter casePassagierFahrzeug(PassagierFahrzeug object) {
                return createPassagierFahrzeugAdapter();
            }
            @Override
            public Adapter caseDrohne(Drohne object) {
                return createDrohneAdapter();
            }
            @Override
            public Adapter caseFahrzeugModifikation(FahrzeugModifikation object) {
                return createFahrzeugModifikationAdapter();
            }
            @Override
            public Adapter caseTechnomancer(Technomancer object) {
                return createTechnomancerAdapter();
            }
            @Override
            public Adapter caseResonanzPersona(ResonanzPersona object) {
                return createResonanzPersonaAdapter();
            }
            @Override
            public Adapter caseKomplexeForm(KomplexeForm object) {
                return createKomplexeFormAdapter();
            }
            @Override
            public Adapter casePersonaKomplexForm(PersonaKomplexForm object) {
                return createPersonaKomplexFormAdapter();
            }
            @Override
            public Adapter caseSprite(Sprite object) {
                return createSpriteAdapter();
            }
            @Override
            public Adapter caseEcho(Echo object) {
                return createEchoAdapter();
            }
            @Override
            public Adapter caseVertrag(Vertrag object) {
                return createVertragAdapter();
            }
            @Override
            public Adapter caseLifestyle(Lifestyle object) {
                return createLifestyleAdapter();
            }
            @Override
            public Adapter caseWissensfertigkeit(Wissensfertigkeit object) {
                return createWissensfertigkeitAdapter();
            }
            @Override
            public Adapter caseSprachfertigkeit(Sprachfertigkeit object) {
                return createSprachfertigkeitAdapter();
            }
            @Override
            public Adapter casePersonaZustand(PersonaZustand object) {
                return createPersonaZustandAdapter();
            }
            @Override
            public Adapter caseCritter(Critter object) {
                return createCritterAdapter();
            }
            @Override
            public Adapter caseIntervallVertrag(IntervallVertrag object) {
                return createIntervallVertragAdapter();
            }
            @Override
            public Adapter caseSin(Sin object) {
                return createSinAdapter();
            }
            @Override
            public Adapter caseLizenz(Lizenz object) {
                return createLizenzAdapter();
            }
            @Override
            public Adapter caseFakeable(Fakeable object) {
                return createFakeableAdapter();
            }
            @Override
            public Adapter caseSteigerbar(Steigerbar object) {
                return createSteigerbarAdapter();
            }
            @Override
            public Adapter caseErlernbar(Erlernbar object) {
                return createErlernbarAdapter();
            }
            @Override
            public Adapter caseCredstick(Credstick object) {
                return createCredstickAdapter();
            }
            @Override
            public Adapter caseMenge(Menge object) {
                return createMengeAdapter();
            }
            @Override
            public Adapter caseMunition(Munition object) {
                return createMunitionAdapter();
            }
            @Override
            public Adapter caseModifikatorAttribute(ModifikatorAttribute object) {
                return createModifikatorAttributeAdapter();
            }
            @Override
            public Adapter caseGebundenerGeist(GebundenerGeist object) {
                return createGebundenerGeistAdapter();
            }
            @Override
            public Adapter caseStufenPersona(StufenPersona object) {
                return createStufenPersonaAdapter();
            }
            @Override
            public Adapter caseGeist(Geist object) {
                return createGeistAdapter();
            }
            @Override
            public Adapter caseIdentifiable(Identifiable object) {
                return createIdentifiableAdapter();
            }
            @Override
            public Adapter caseCredstickTransaction(CredstickTransaction object) {
                return createCredstickTransactionAdapter();
            }
            @Override
            public Adapter caseSpezialisierung(Spezialisierung object) {
                return createSpezialisierungAdapter();
            }
            @Override
            public Adapter caseMatrixAttributes(MatrixAttributes object) {
                return createMatrixAttributesAdapter();
            }
            @Override
            public Adapter caseActiveMatixDevice(ActiveMatixDevice object) {
                return createActiveMatixDeviceAdapter();
            }
            @Override
            public Adapter caseCommlink(Commlink object) {
                return createCommlinkAdapter();
            }
            @Override
            public Adapter caseMatixConditionMonitor(MatixConditionMonitor object) {
                return createMatixConditionMonitorAdapter();
            }
            @Override
            public Adapter caseCyberdeck(Cyberdeck object) {
                return createCyberdeckAdapter();
            }
            @Override
            public Adapter caseSoftwareAgent(SoftwareAgent object) {
                return createSoftwareAgentAdapter();
            }
            @Override
            public Adapter caseHost(Host object) {
                return createHostAdapter();
            }
            @Override
            public Adapter caseCyberwareModifikatioren(CyberwareModifikatioren object) {
                return createCyberwareModifikatiorenAdapter();
            }
            @Override
            public Adapter caseRiggerCommandConsole(RiggerCommandConsole object) {
                return createRiggerCommandConsoleAdapter();
            }
            @Override
            public Adapter caseAutoSoft(AutoSoft object) {
                return createAutoSoftAdapter();
            }
            @Override
            public Adapter caseSoftware(Software object) {
                return createSoftwareAdapter();
            }
            @Override
            public Adapter caseMatrixProgram(MatrixProgram object) {
                return createMatrixProgramAdapter();
            }
            @Override
            public Adapter caseTutorsoft(Tutorsoft object) {
                return createTutorsoftAdapter();
            }
            @Override
            public Adapter caseSkillSoft(SkillSoft object) {
                return createSkillSoftAdapter();
            }
            @Override
            public Adapter caseFahrzeugZustand(FahrzeugZustand object) {
                return createFahrzeugZustandAdapter();
            }
            @Override
            public Adapter casePersonalAreaNetwork(PersonalAreaNetwork object) {
                return createPersonalAreaNetworkAdapter();
            }
            @Override
            public Adapter caseBasicProgram(BasicProgram object) {
                return createBasicProgramAdapter();
            }
            @Override
            public Adapter caseDatasoft(Datasoft object) {
                return createDatasoftAdapter();
            }
            @Override
            public Adapter caseAbstractMatrixDevice(AbstractMatrixDevice object) {
                return createAbstractMatrixDeviceAdapter();
            }
            @Override
            public Adapter caseConsumerSoft(ConsumerSoft object) {
                return createConsumerSoftAdapter();
            }
            @Override
            public Adapter caseRiggerProgram(RiggerProgram object) {
                return createRiggerProgramAdapter();
            }
            @Override
            public Adapter caseMatrixDevice(MatrixDevice object) {
                return createMatrixDeviceAdapter();
            }
            @Override
            public Adapter caseCommonProgram(CommonProgram object) {
                return createCommonProgramAdapter();
            }
            @Override
            public Adapter caseWeaponMount(WeaponMount object) {
                return createWeaponMountAdapter();
            }
            @Override
            public Adapter caseLifestyleOption(LifestyleOption object) {
                return createLifestyleOptionAdapter();
            }
            @Override
            public Adapter casePercentLifestyleOption(PercentLifestyleOption object) {
                return createPercentLifestyleOptionAdapter();
            }
            @Override
            public Adapter caseLocalization(Localization object) {
                return createLocalizationAdapter();
            }
            @Override
            public Adapter caseBerechneteAttribute(BerechneteAttribute object) {
                return createBerechneteAttributeAdapter();
            }
            @Override
            public Adapter caseMagischeStufe(MagischeStufe object) {
                return createMagischeStufeAdapter();
            }
            @Override
            public Adapter caseFokus(Fokus object) {
                return createFokusAdapter();
            }
            @Override
            public Adapter caseAbstraktFokus(AbstraktFokus object) {
                return createAbstraktFokusAdapter();
            }
            @Override
            public Adapter caseQiFokus(QiFokus object) {
                return createQiFokusAdapter();
            }
            @Override
            public Adapter caseWaffenFokus(WaffenFokus object) {
                return createWaffenFokusAdapter();
            }
            @Override
            public Adapter caseMagieFokus(MagieFokus object) {
                return createMagieFokusAdapter();
            }
            @Override
            public Adapter caseFokusBinding(FokusBinding object) {
                return createFokusBindingAdapter();
            }
            @Override
            public Adapter caseSubstance(Substance object) {
                return createSubstanceAdapter();
            }
            @Override
            public Adapter caseToxin(Toxin object) {
                return createToxinAdapter();
            }
            @Override
            public Adapter caseDrug(Drug object) {
                return createDrugAdapter();
            }
            @Override
            public Adapter caseMagazin(Magazin object) {
                return createMagazinAdapter();
            }
            @Override
            public Adapter caseDefaultWifi(DefaultWifi object) {
                return createDefaultWifiAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Beschreibbar <em>Beschreibbar</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Beschreibbar
     * @generated
     */
	public Adapter createBeschreibbarAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Quelle <em>Quelle</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Quelle
     * @generated
     */
	public Adapter createQuelleAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.SourceBook <em>Source Book</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.SourceBook
     * @generated
     */
	public Adapter createSourceBookAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AbstraktPersona <em>Abstrakt Persona</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona
     * @generated
     */
	public Adapter createAbstraktPersonaAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Gegenstand <em>Gegenstand</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Gegenstand
     * @generated
     */
	public Adapter createGegenstandAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.GeldWert <em>Geld Wert</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.GeldWert
     * @generated
     */
	public Adapter createGeldWertAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Reichweite <em>Reichweite</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Reichweite
     * @generated
     */
	public Adapter createReichweiteAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert <em>Attribut Modifikator Wert</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AttributModifikatorWert
     * @generated
     */
	public Adapter createAttributModifikatorWertAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Modifizierbar <em>Modifizierbar</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Modifizierbar
     * @generated
     */
	public Adapter createModifizierbarAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute <em>Koerperliche Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute
     * @generated
     */
	public Adapter createKoerperlicheAttributeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute <em>Spezielle Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute
     * @generated
     */
	public Adapter createSpezielleAttributeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AbstraktGegenstand <em>Abstrakt Gegenstand</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AbstraktGegenstand
     * @generated
     */
	public Adapter createAbstraktGegenstandAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe <em>Abstakt Fern Kampfwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe
     * @generated
     */
	public Adapter createAbstaktFernKampfwaffeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe <em>Abstakt Waffe</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AbstaktWaffe
     * @generated
     */
	public Adapter createAbstaktWaffeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Nahkampfwaffe <em>Nahkampfwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Nahkampfwaffe
     * @generated
     */
	public Adapter createNahkampfwaffeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Feuerwaffe <em>Feuerwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Feuerwaffe
     * @generated
     */
	public Adapter createFeuerwaffeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Wurfwaffe <em>Wurfwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Wurfwaffe
     * @generated
     */
	public Adapter createWurfwaffeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.ShrList <em>Shr List</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.ShrList
     * @generated
     */
	public Adapter createShrListAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Projektilwaffe <em>Projektilwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Projektilwaffe
     * @generated
     */
	public Adapter createProjektilwaffeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.FertigkeitsGruppe <em>Fertigkeits Gruppe</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.FertigkeitsGruppe
     * @generated
     */
	public Adapter createFertigkeitsGruppeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Fertigkeit <em>Fertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Fertigkeit
     * @generated
     */
	public Adapter createFertigkeitAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit <em>Persona Fertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.PersonaFertigkeit
     * @generated
     */
	public Adapter createPersonaFertigkeitAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe <em>Persona Fertigkeits Gruppe</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe
     * @generated
     */
	public Adapter createPersonaFertigkeitsGruppeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Cyberware <em>Cyberware</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Cyberware
     * @generated
     */
	public Adapter createCyberwareAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.BioWare <em>Bio Ware</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.BioWare
     * @generated
     */
	public Adapter createBioWareAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Koerpermods <em>Koerpermods</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Koerpermods
     * @generated
     */
	public Adapter createKoerpermodsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AbstraktModifikatoren <em>Abstrakt Modifikatoren</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AbstraktModifikatoren
     * @generated
     */
	public Adapter createAbstraktModifikatorenAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute <em>Geistige Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute
     * @generated
     */
	public Adapter createGeistigeAttributeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MudanPersona <em>Mudan Persona</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MudanPersona
     * @generated
     */
	public Adapter createMudanPersonaAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.KoerperPersona <em>Koerper Persona</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.KoerperPersona
     * @generated
     */
	public Adapter createKoerperPersonaAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MagischeMods <em>Magische Mods</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MagischeMods
     * @generated
     */
	public Adapter createMagischeModsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.KiKraft <em>Ki Kraft</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.KiKraft
     * @generated
     */
	public Adapter createKiKraftAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MagischePersona <em>Magische Persona</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MagischePersona
     * @generated
     */
	public Adapter createMagischePersonaAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona <em>Base Magische Persona</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.BaseMagischePersona
     * @generated
     */
	public Adapter createBaseMagischePersonaAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren <em>Fernkampfwaffen Modifikatoren</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren
     * @generated
     */
	public Adapter createFernkampfwaffenModifikatorenAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse <em>Sichtverhaeltnisse</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Sichtverhaeltnisse
     * @generated
     */
	public Adapter createSichtverhaeltnisseAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Spezies <em>Spezies</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Spezies
     * @generated
     */
	public Adapter createSpeziesAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.GegenstandStufen <em>Gegenstand Stufen</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.GegenstandStufen
     * @generated
     */
	public Adapter createGegenstandStufenAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.KiAdept <em>Ki Adept</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.KiAdept
     * @generated
     */
	public Adapter createKiAdeptAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Kleidung <em>Kleidung</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Kleidung
     * @generated
     */
	public Adapter createKleidungAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator <em>Fernkampfwaffe Modifikator</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator
     * @generated
     */
	public Adapter createFernkampfwaffeModifikatorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Anwendbar <em>Anwendbar</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Anwendbar
     * @generated
     */
	public Adapter createAnwendbarAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.PersonaEigenschaft <em>Persona Eigenschaft</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.PersonaEigenschaft
     * @generated
     */
	public Adapter createPersonaEigenschaftAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren <em>Proben Modifikatoren</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.ProbenModifikatoren
     * @generated
     */
	public Adapter createProbenModifikatorenAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Magier <em>Magier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Magier
     * @generated
     */
	public Adapter createMagierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Zauberer <em>Zauberer</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Zauberer
     * @generated
     */
	public Adapter createZaubererAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MysticAdept <em>Mystic Adept</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MysticAdept
     * @generated
     */
	public Adapter createMysticAdeptAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.PersonaZauber <em>Persona Zauber</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.PersonaZauber
     * @generated
     */
	public Adapter createPersonaZauberAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Zauber <em>Zauber</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Zauber
     * @generated
     */
	public Adapter createZauberAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.ChrakterLimits <em>Chrakter Limits</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.ChrakterLimits
     * @generated
     */
	public Adapter createChrakterLimitsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Panzerung <em>Panzerung</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Panzerung
     * @generated
     */
	public Adapter createPanzerungAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AspektMagier <em>Aspekt Magier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AspektMagier
     * @generated
     */
	public Adapter createAspektMagierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AstraleProjektion <em>Astrale Projektion</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion
     * @generated
     */
	public Adapter createAstraleProjektionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Schutzgeist <em>Schutzgeist</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Schutzgeist
     * @generated
     */
	public Adapter createSchutzgeistAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Initation <em>Initation</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Initation
     * @generated
     */
	public Adapter createInitationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MetaMagie <em>Meta Magie</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MetaMagie
     * @generated
     */
	public Adapter createMetaMagieAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.CritterKraft <em>Critter Kraft</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.CritterKraft
     * @generated
     */
	public Adapter createCritterKraftAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Fahrzeug <em>Fahrzeug</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug
     * @generated
     */
	public Adapter createFahrzeugAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Bodenfahrzeug <em>Bodenfahrzeug</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Bodenfahrzeug
     * @generated
     */
	public Adapter createBodenfahrzeugAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.PassagierFahrzeug <em>Passagier Fahrzeug</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.PassagierFahrzeug
     * @generated
     */
	public Adapter createPassagierFahrzeugAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Drohne <em>Drohne</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Drohne
     * @generated
     */
	public Adapter createDrohneAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.FahrzeugModifikation <em>Fahrzeug Modifikation</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.FahrzeugModifikation
     * @generated
     */
	public Adapter createFahrzeugModifikationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Technomancer <em>Technomancer</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Technomancer
     * @generated
     */
	public Adapter createTechnomancerAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.ResonanzPersona <em>Resonanz Persona</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.ResonanzPersona
     * @generated
     */
	public Adapter createResonanzPersonaAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.KomplexeForm <em>Komplexe Form</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.KomplexeForm
     * @generated
     */
	public Adapter createKomplexeFormAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.PersonaKomplexForm <em>Persona Komplex Form</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.PersonaKomplexForm
     * @generated
     */
	public Adapter createPersonaKomplexFormAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Sprite <em>Sprite</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Sprite
     * @generated
     */
	public Adapter createSpriteAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Echo <em>Echo</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Echo
     * @generated
     */
	public Adapter createEchoAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Vertrag <em>Vertrag</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Vertrag
     * @generated
     */
	public Adapter createVertragAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Lifestyle <em>Lifestyle</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Lifestyle
     * @generated
     */
	public Adapter createLifestyleAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Wissensfertigkeit <em>Wissensfertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Wissensfertigkeit
     * @generated
     */
	public Adapter createWissensfertigkeitAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Sprachfertigkeit <em>Sprachfertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Sprachfertigkeit
     * @generated
     */
	public Adapter createSprachfertigkeitAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.PersonaZustand <em>Persona Zustand</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.PersonaZustand
     * @generated
     */
    public Adapter createPersonaZustandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Critter <em>Critter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Critter
     * @generated
     */
    public Adapter createCritterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.IntervallVertrag <em>Intervall Vertrag</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.IntervallVertrag
     * @generated
     */
    public Adapter createIntervallVertragAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Sin <em>Sin</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Sin
     * @generated
     */
    public Adapter createSinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Lizenz <em>Lizenz</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Lizenz
     * @generated
     */
    public Adapter createLizenzAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Fakeable <em>Fakeable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Fakeable
     * @generated
     */
    public Adapter createFakeableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Steigerbar <em>Steigerbar</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Steigerbar
     * @generated
     */
    public Adapter createSteigerbarAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Erlernbar <em>Erlernbar</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Erlernbar
     * @generated
     */
    public Adapter createErlernbarAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Credstick <em>Credstick</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Credstick
     * @generated
     */
    public Adapter createCredstickAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Menge <em>Menge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Menge
     * @generated
     */
    public Adapter createMengeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Munition <em>Munition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Munition
     * @generated
     */
    public Adapter createMunitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.ModifikatorAttribute <em>Modifikator Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.ModifikatorAttribute
     * @generated
     */
    public Adapter createModifikatorAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.GebundenerGeist <em>Gebundener Geist</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.GebundenerGeist
     * @generated
     */
    public Adapter createGebundenerGeistAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.StufenPersona <em>Stufen Persona</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.StufenPersona
     * @generated
     */
    public Adapter createStufenPersonaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Geist <em>Geist</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Geist
     * @generated
     */
    public Adapter createGeistAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Identifiable <em>Identifiable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Identifiable
     * @generated
     */
    public Adapter createIdentifiableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.CredstickTransaction <em>Credstick Transaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.CredstickTransaction
     * @generated
     */
    public Adapter createCredstickTransactionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Spezialisierung <em>Spezialisierung</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Spezialisierung
     * @generated
     */
    public Adapter createSpezialisierungAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MatrixAttributes <em>Matrix Attributes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes
     * @generated
     */
    public Adapter createMatrixAttributesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MatrixDevice <em>Matrix Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MatrixDevice
     * @generated
     */
    public Adapter createMatrixDeviceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.CommonProgram <em>Common Program</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.CommonProgram
     * @generated
     */
    public Adapter createCommonProgramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.WeaponMount <em>Weapon Mount</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.WeaponMount
     * @generated
     */
    public Adapter createWeaponMountAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.LifestyleOption <em>Lifestyle Option</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.LifestyleOption
     * @generated
     */
    public Adapter createLifestyleOptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.PercentLifestyleOption <em>Percent Lifestyle Option</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.PercentLifestyleOption
     * @generated
     */
    public Adapter createPercentLifestyleOptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Localization <em>Localization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Localization
     * @generated
     */
    public Adapter createLocalizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.BerechneteAttribute <em>Berechnete Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.BerechneteAttribute
     * @generated
     */
    public Adapter createBerechneteAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MagischeStufe <em>Magische Stufe</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MagischeStufe
     * @generated
     */
    public Adapter createMagischeStufeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Fokus <em>Fokus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Fokus
     * @generated
     */
    public Adapter createFokusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AbstraktFokus <em>Abstrakt Fokus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AbstraktFokus
     * @generated
     */
    public Adapter createAbstraktFokusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.QiFokus <em>Qi Fokus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.QiFokus
     * @generated
     */
    public Adapter createQiFokusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.WaffenFokus <em>Waffen Fokus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.WaffenFokus
     * @generated
     */
    public Adapter createWaffenFokusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MagieFokus <em>Magie Fokus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MagieFokus
     * @generated
     */
    public Adapter createMagieFokusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.FokusBinding <em>Fokus Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.FokusBinding
     * @generated
     */
    public Adapter createFokusBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Substance <em>Substance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Substance
     * @generated
     */
    public Adapter createSubstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Toxin <em>Toxin</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Toxin
     * @generated
     */
    public Adapter createToxinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Drug <em>Drug</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Drug
     * @generated
     */
    public Adapter createDrugAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Magazin <em>Magazin</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Magazin
     * @generated
     */
    public Adapter createMagazinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.DefaultWifi <em>Default Wifi</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.DefaultWifi
     * @generated
     */
    public Adapter createDefaultWifiAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice <em>Active Matix Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice
     * @generated
     */
    public Adapter createActiveMatixDeviceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Commlink <em>Commlink</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Commlink
     * @generated
     */
    public Adapter createCommlinkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor <em>Matix Condition Monitor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MatixConditionMonitor
     * @generated
     */
    public Adapter createMatixConditionMonitorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Cyberdeck <em>Cyberdeck</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck
     * @generated
     */
    public Adapter createCyberdeckAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.SoftwareAgent <em>Software Agent</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.SoftwareAgent
     * @generated
     */
    public Adapter createSoftwareAgentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Host <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Host
     * @generated
     */
    public Adapter createHostAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren <em>Cyberware Modifikatioren</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.CyberwareModifikatioren
     * @generated
     */
    public Adapter createCyberwareModifikatiorenAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole <em>Rigger Command Console</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole
     * @generated
     */
    public Adapter createRiggerCommandConsoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AutoSoft <em>Auto Soft</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AutoSoft
     * @generated
     */
    public Adapter createAutoSoftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Software <em>Software</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Software
     * @generated
     */
    public Adapter createSoftwareAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.MatrixProgram <em>Matrix Program</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.MatrixProgram
     * @generated
     */
    public Adapter createMatrixProgramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Tutorsoft <em>Tutorsoft</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Tutorsoft
     * @generated
     */
    public Adapter createTutorsoftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.SkillSoft <em>Skill Soft</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.SkillSoft
     * @generated
     */
    public Adapter createSkillSoftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.FahrzeugZustand <em>Fahrzeug Zustand</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.FahrzeugZustand
     * @generated
     */
    public Adapter createFahrzeugZustandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork <em>Personal Area Network</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.PersonalAreaNetwork
     * @generated
     */
    public Adapter createPersonalAreaNetworkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.BasicProgram <em>Basic Program</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.BasicProgram
     * @generated
     */
    public Adapter createBasicProgramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Datasoft <em>Datasoft</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Datasoft
     * @generated
     */
    public Adapter createDatasoftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.AbstractMatrixDevice <em>Abstract Matrix Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.AbstractMatrixDevice
     * @generated
     */
    public Adapter createAbstractMatrixDeviceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.ConsumerSoft <em>Consumer Soft</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.ConsumerSoft
     * @generated
     */
    public Adapter createConsumerSoftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.RiggerProgram <em>Rigger Program</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.RiggerProgram
     * @generated
     */
    public Adapter createRiggerProgramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //Shr5AdapterFactory
