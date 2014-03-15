/**
 */
package de.urszeidler.eclipse.shr5.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.Critter;
import de.urszeidler.eclipse.shr5.CritterKraft;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.Drohne;
import de.urszeidler.eclipse.shr5.Echo;
import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.FahrzeugModifikation;
import de.urszeidler.eclipse.shr5.Fakeable;
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
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
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.MagischeMods;
import de.urszeidler.eclipse.shr5.MagischePersona;
import de.urszeidler.eclipse.shr5.MetaMagie;
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
import de.urszeidler.eclipse.shr5.Schutzgeist;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Sichtverhaeltnisse;
import de.urszeidler.eclipse.shr5.Sin;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.SpezielleAttribute;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Sprachfertigkeit;
import de.urszeidler.eclipse.shr5.Sprite;
import de.urszeidler.eclipse.shr5.Steigerbar;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5.Wissensfertigkeit;
import de.urszeidler.eclipse.shr5.Wurfwaffe;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.Zauberer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package
 * @generated
 */
public class Shr5Switch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static Shr5Package modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5Switch() {
        if (modelPackage == null) {
            modelPackage = Shr5Package.eINSTANCE;
        }
    }

	/**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case Shr5Package.BESCHREIBBAR: {
                Beschreibbar beschreibbar = (Beschreibbar)theEObject;
                T result = caseBeschreibbar(beschreibbar);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.QUELLE: {
                Quelle quelle = (Quelle)theEObject;
                T result = caseQuelle(quelle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SOURCE_BOOK: {
                SourceBook sourceBook = (SourceBook)theEObject;
                T result = caseSourceBook(sourceBook);
                if (result == null) result = caseBeschreibbar(sourceBook);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ABSTRAKT_PERSONA: {
                AbstraktPersona abstraktPersona = (AbstraktPersona)theEObject;
                T result = caseAbstraktPersona(abstraktPersona);
                if (result == null) result = caseBeschreibbar(abstraktPersona);
                if (result == null) result = caseKoerperlicheAttribute(abstraktPersona);
                if (result == null) result = caseSpezielleAttribute(abstraktPersona);
                if (result == null) result = caseGeistigeAttribute(abstraktPersona);
                if (result == null) result = caseChrakterLimits(abstraktPersona);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.GEGENSTAND: {
                Gegenstand gegenstand = (Gegenstand)theEObject;
                T result = caseGegenstand(gegenstand);
                if (result == null) result = caseAbstraktGegenstand(gegenstand);
                if (result == null) result = caseQuelle(gegenstand);
                if (result == null) result = caseGeldWert(gegenstand);
                if (result == null) result = caseBeschreibbar(gegenstand);
                if (result == null) result = caseModifizierbar(gegenstand);
                if (result == null) result = caseAnwendbar(gegenstand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.GELD_WERT: {
                GeldWert geldWert = (GeldWert)theEObject;
                T result = caseGeldWert(geldWert);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.REICHWEITE: {
                Reichweite reichweite = (Reichweite)theEObject;
                T result = caseReichweite(reichweite);
                if (result == null) result = caseBeschreibbar(reichweite);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT: {
                AttributModifikatorWert attributModifikatorWert = (AttributModifikatorWert)theEObject;
                T result = caseAttributModifikatorWert(attributModifikatorWert);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MODIFIZIERBAR: {
                Modifizierbar modifizierbar = (Modifizierbar)theEObject;
                T result = caseModifizierbar(modifizierbar);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.KOERPERLICHE_ATTRIBUTE: {
                KoerperlicheAttribute koerperlicheAttribute = (KoerperlicheAttribute)theEObject;
                T result = caseKoerperlicheAttribute(koerperlicheAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SPEZIELLE_ATTRIBUTE: {
                SpezielleAttribute spezielleAttribute = (SpezielleAttribute)theEObject;
                T result = caseSpezielleAttribute(spezielleAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ABSTRAKT_GEGENSTAND: {
                AbstraktGegenstand abstraktGegenstand = (AbstraktGegenstand)theEObject;
                T result = caseAbstraktGegenstand(abstraktGegenstand);
                if (result == null) result = caseQuelle(abstraktGegenstand);
                if (result == null) result = caseGeldWert(abstraktGegenstand);
                if (result == null) result = caseBeschreibbar(abstraktGegenstand);
                if (result == null) result = caseModifizierbar(abstraktGegenstand);
                if (result == null) result = caseAnwendbar(abstraktGegenstand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ABSTAKT_FERN_KAMPFWAFFE: {
                AbstaktFernKampfwaffe abstaktFernKampfwaffe = (AbstaktFernKampfwaffe)theEObject;
                T result = caseAbstaktFernKampfwaffe(abstaktFernKampfwaffe);
                if (result == null) result = caseAbstaktWaffe(abstaktFernKampfwaffe);
                if (result == null) result = caseAbstraktGegenstand(abstaktFernKampfwaffe);
                if (result == null) result = caseQuelle(abstaktFernKampfwaffe);
                if (result == null) result = caseGeldWert(abstaktFernKampfwaffe);
                if (result == null) result = caseBeschreibbar(abstaktFernKampfwaffe);
                if (result == null) result = caseModifizierbar(abstaktFernKampfwaffe);
                if (result == null) result = caseAnwendbar(abstaktFernKampfwaffe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ABSTAKT_WAFFE: {
                AbstaktWaffe abstaktWaffe = (AbstaktWaffe)theEObject;
                T result = caseAbstaktWaffe(abstaktWaffe);
                if (result == null) result = caseAbstraktGegenstand(abstaktWaffe);
                if (result == null) result = caseQuelle(abstaktWaffe);
                if (result == null) result = caseGeldWert(abstaktWaffe);
                if (result == null) result = caseBeschreibbar(abstaktWaffe);
                if (result == null) result = caseModifizierbar(abstaktWaffe);
                if (result == null) result = caseAnwendbar(abstaktWaffe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.NAHKAMPFWAFFE: {
                Nahkampfwaffe nahkampfwaffe = (Nahkampfwaffe)theEObject;
                T result = caseNahkampfwaffe(nahkampfwaffe);
                if (result == null) result = caseAbstaktWaffe(nahkampfwaffe);
                if (result == null) result = caseAbstraktGegenstand(nahkampfwaffe);
                if (result == null) result = caseQuelle(nahkampfwaffe);
                if (result == null) result = caseGeldWert(nahkampfwaffe);
                if (result == null) result = caseBeschreibbar(nahkampfwaffe);
                if (result == null) result = caseModifizierbar(nahkampfwaffe);
                if (result == null) result = caseAnwendbar(nahkampfwaffe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FEUERWAFFE: {
                Feuerwaffe feuerwaffe = (Feuerwaffe)theEObject;
                T result = caseFeuerwaffe(feuerwaffe);
                if (result == null) result = caseAbstaktFernKampfwaffe(feuerwaffe);
                if (result == null) result = caseAbstaktWaffe(feuerwaffe);
                if (result == null) result = caseAbstraktGegenstand(feuerwaffe);
                if (result == null) result = caseQuelle(feuerwaffe);
                if (result == null) result = caseGeldWert(feuerwaffe);
                if (result == null) result = caseBeschreibbar(feuerwaffe);
                if (result == null) result = caseModifizierbar(feuerwaffe);
                if (result == null) result = caseAnwendbar(feuerwaffe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.WURFWAFFE: {
                Wurfwaffe wurfwaffe = (Wurfwaffe)theEObject;
                T result = caseWurfwaffe(wurfwaffe);
                if (result == null) result = caseAbstaktFernKampfwaffe(wurfwaffe);
                if (result == null) result = caseAbstaktWaffe(wurfwaffe);
                if (result == null) result = caseAbstraktGegenstand(wurfwaffe);
                if (result == null) result = caseQuelle(wurfwaffe);
                if (result == null) result = caseGeldWert(wurfwaffe);
                if (result == null) result = caseBeschreibbar(wurfwaffe);
                if (result == null) result = caseModifizierbar(wurfwaffe);
                if (result == null) result = caseAnwendbar(wurfwaffe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SHR_LIST: {
                ShrList shrList = (ShrList)theEObject;
                T result = caseShrList(shrList);
                if (result == null) result = caseBeschreibbar(shrList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PROJEKTILWAFFE: {
                Projektilwaffe projektilwaffe = (Projektilwaffe)theEObject;
                T result = caseProjektilwaffe(projektilwaffe);
                if (result == null) result = caseAbstaktFernKampfwaffe(projektilwaffe);
                if (result == null) result = caseAbstaktWaffe(projektilwaffe);
                if (result == null) result = caseAbstraktGegenstand(projektilwaffe);
                if (result == null) result = caseQuelle(projektilwaffe);
                if (result == null) result = caseGeldWert(projektilwaffe);
                if (result == null) result = caseBeschreibbar(projektilwaffe);
                if (result == null) result = caseModifizierbar(projektilwaffe);
                if (result == null) result = caseAnwendbar(projektilwaffe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FERTIGKEITS_GRUPPE: {
                FertigkeitsGruppe fertigkeitsGruppe = (FertigkeitsGruppe)theEObject;
                T result = caseFertigkeitsGruppe(fertigkeitsGruppe);
                if (result == null) result = caseBeschreibbar(fertigkeitsGruppe);
                if (result == null) result = caseQuelle(fertigkeitsGruppe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FERTIGKEIT: {
                Fertigkeit fertigkeit = (Fertigkeit)theEObject;
                T result = caseFertigkeit(fertigkeit);
                if (result == null) result = caseBeschreibbar(fertigkeit);
                if (result == null) result = caseQuelle(fertigkeit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PERSONA_FERTIGKEIT: {
                PersonaFertigkeit personaFertigkeit = (PersonaFertigkeit)theEObject;
                T result = casePersonaFertigkeit(personaFertigkeit);
                if (result == null) result = caseSteigerbar(personaFertigkeit);
                if (result == null) result = caseErlernbar(personaFertigkeit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE: {
                PersonaFertigkeitsGruppe personaFertigkeitsGruppe = (PersonaFertigkeitsGruppe)theEObject;
                T result = casePersonaFertigkeitsGruppe(personaFertigkeitsGruppe);
                if (result == null) result = caseSteigerbar(personaFertigkeitsGruppe);
                if (result == null) result = caseErlernbar(personaFertigkeitsGruppe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.CYBERWARE: {
                Cyberware cyberware = (Cyberware)theEObject;
                T result = caseCyberware(cyberware);
                if (result == null) result = caseKoerpermods(cyberware);
                if (result == null) result = caseGeldWert(cyberware);
                if (result == null) result = caseAbstraktModifikatoren(cyberware);
                if (result == null) result = caseBeschreibbar(cyberware);
                if (result == null) result = caseModifizierbar(cyberware);
                if (result == null) result = caseQuelle(cyberware);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.BIO_WARE: {
                BioWare bioWare = (BioWare)theEObject;
                T result = caseBioWare(bioWare);
                if (result == null) result = caseKoerpermods(bioWare);
                if (result == null) result = caseGeldWert(bioWare);
                if (result == null) result = caseAbstraktModifikatoren(bioWare);
                if (result == null) result = caseBeschreibbar(bioWare);
                if (result == null) result = caseModifizierbar(bioWare);
                if (result == null) result = caseQuelle(bioWare);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.KOERPERMODS: {
                Koerpermods koerpermods = (Koerpermods)theEObject;
                T result = caseKoerpermods(koerpermods);
                if (result == null) result = caseAbstraktModifikatoren(koerpermods);
                if (result == null) result = caseBeschreibbar(koerpermods);
                if (result == null) result = caseModifizierbar(koerpermods);
                if (result == null) result = caseQuelle(koerpermods);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ABSTRAKT_MODIFIKATOREN: {
                AbstraktModifikatoren abstraktModifikatoren = (AbstraktModifikatoren)theEObject;
                T result = caseAbstraktModifikatoren(abstraktModifikatoren);
                if (result == null) result = caseBeschreibbar(abstraktModifikatoren);
                if (result == null) result = caseModifizierbar(abstraktModifikatoren);
                if (result == null) result = caseQuelle(abstraktModifikatoren);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.GEISTIGE_ATTRIBUTE: {
                GeistigeAttribute geistigeAttribute = (GeistigeAttribute)theEObject;
                T result = caseGeistigeAttribute(geistigeAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MUDAN_PERSONA: {
                MudanPersona mudanPersona = (MudanPersona)theEObject;
                T result = caseMudanPersona(mudanPersona);
                if (result == null) result = caseKoerperPersona(mudanPersona);
                if (result == null) result = caseAbstraktPersona(mudanPersona);
                if (result == null) result = casePanzerung(mudanPersona);
                if (result == null) result = casePersonaZustand(mudanPersona);
                if (result == null) result = caseBeschreibbar(mudanPersona);
                if (result == null) result = caseKoerperlicheAttribute(mudanPersona);
                if (result == null) result = caseSpezielleAttribute(mudanPersona);
                if (result == null) result = caseGeistigeAttribute(mudanPersona);
                if (result == null) result = caseChrakterLimits(mudanPersona);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.KOERPER_PERSONA: {
                KoerperPersona koerperPersona = (KoerperPersona)theEObject;
                T result = caseKoerperPersona(koerperPersona);
                if (result == null) result = caseAbstraktPersona(koerperPersona);
                if (result == null) result = casePanzerung(koerperPersona);
                if (result == null) result = casePersonaZustand(koerperPersona);
                if (result == null) result = caseBeschreibbar(koerperPersona);
                if (result == null) result = caseKoerperlicheAttribute(koerperPersona);
                if (result == null) result = caseSpezielleAttribute(koerperPersona);
                if (result == null) result = caseGeistigeAttribute(koerperPersona);
                if (result == null) result = caseChrakterLimits(koerperPersona);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MAGISCHE_MODS: {
                MagischeMods magischeMods = (MagischeMods)theEObject;
                T result = caseMagischeMods(magischeMods);
                if (result == null) result = caseAbstraktModifikatoren(magischeMods);
                if (result == null) result = caseBeschreibbar(magischeMods);
                if (result == null) result = caseModifizierbar(magischeMods);
                if (result == null) result = caseQuelle(magischeMods);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.KI_KRAFT: {
                KiKraft kiKraft = (KiKraft)theEObject;
                T result = caseKiKraft(kiKraft);
                if (result == null) result = caseMagischeMods(kiKraft);
                if (result == null) result = caseErlernbar(kiKraft);
                if (result == null) result = caseAbstraktModifikatoren(kiKraft);
                if (result == null) result = caseBeschreibbar(kiKraft);
                if (result == null) result = caseModifizierbar(kiKraft);
                if (result == null) result = caseQuelle(kiKraft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MAGISCHE_PERSONA: {
                MagischePersona magischePersona = (MagischePersona)theEObject;
                T result = caseMagischePersona(magischePersona);
                if (result == null) result = caseKoerperPersona(magischePersona);
                if (result == null) result = caseBaseMagischePersona(magischePersona);
                if (result == null) result = caseAbstraktPersona(magischePersona);
                if (result == null) result = casePanzerung(magischePersona);
                if (result == null) result = casePersonaZustand(magischePersona);
                if (result == null) result = caseBeschreibbar(magischePersona);
                if (result == null) result = caseKoerperlicheAttribute(magischePersona);
                if (result == null) result = caseSpezielleAttribute(magischePersona);
                if (result == null) result = caseGeistigeAttribute(magischePersona);
                if (result == null) result = caseChrakterLimits(magischePersona);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.BASE_MAGISCHE_PERSONA: {
                BaseMagischePersona baseMagischePersona = (BaseMagischePersona)theEObject;
                T result = caseBaseMagischePersona(baseMagischePersona);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FERNKAMPFWAFFEN_MODIFIKATOREN: {
                FernkampfwaffenModifikatoren fernkampfwaffenModifikatoren = (FernkampfwaffenModifikatoren)theEObject;
                T result = caseFernkampfwaffenModifikatoren(fernkampfwaffenModifikatoren);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SICHTVERHAELTNISSE: {
                Sichtverhaeltnisse sichtverhaeltnisse = (Sichtverhaeltnisse)theEObject;
                T result = caseSichtverhaeltnisse(sichtverhaeltnisse);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SPEZIES: {
                Spezies spezies = (Spezies)theEObject;
                T result = caseSpezies(spezies);
                if (result == null) result = caseBeschreibbar(spezies);
                if (result == null) result = caseModifizierbar(spezies);
                if (result == null) result = caseQuelle(spezies);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.GEGENSTAND_STUFEN: {
                GegenstandStufen gegenstandStufen = (GegenstandStufen)theEObject;
                T result = caseGegenstandStufen(gegenstandStufen);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.KI_ADEPT: {
                KiAdept kiAdept = (KiAdept)theEObject;
                T result = caseKiAdept(kiAdept);
                if (result == null) result = caseMagischePersona(kiAdept);
                if (result == null) result = caseKoerperPersona(kiAdept);
                if (result == null) result = caseBaseMagischePersona(kiAdept);
                if (result == null) result = caseAbstraktPersona(kiAdept);
                if (result == null) result = casePanzerung(kiAdept);
                if (result == null) result = casePersonaZustand(kiAdept);
                if (result == null) result = caseBeschreibbar(kiAdept);
                if (result == null) result = caseKoerperlicheAttribute(kiAdept);
                if (result == null) result = caseSpezielleAttribute(kiAdept);
                if (result == null) result = caseGeistigeAttribute(kiAdept);
                if (result == null) result = caseChrakterLimits(kiAdept);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.KLEIDUNG: {
                Kleidung kleidung = (Kleidung)theEObject;
                T result = caseKleidung(kleidung);
                if (result == null) result = caseAbstraktGegenstand(kleidung);
                if (result == null) result = caseQuelle(kleidung);
                if (result == null) result = caseGeldWert(kleidung);
                if (result == null) result = caseBeschreibbar(kleidung);
                if (result == null) result = caseModifizierbar(kleidung);
                if (result == null) result = caseAnwendbar(kleidung);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR: {
                FernkampfwaffeModifikator fernkampfwaffeModifikator = (FernkampfwaffeModifikator)theEObject;
                T result = caseFernkampfwaffeModifikator(fernkampfwaffeModifikator);
                if (result == null) result = caseAbstraktModifikatoren(fernkampfwaffeModifikator);
                if (result == null) result = caseBeschreibbar(fernkampfwaffeModifikator);
                if (result == null) result = caseModifizierbar(fernkampfwaffeModifikator);
                if (result == null) result = caseQuelle(fernkampfwaffeModifikator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ANWENDBAR: {
                Anwendbar anwendbar = (Anwendbar)theEObject;
                T result = caseAnwendbar(anwendbar);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PERSONA_EIGENSCHAFT: {
                PersonaEigenschaft personaEigenschaft = (PersonaEigenschaft)theEObject;
                T result = casePersonaEigenschaft(personaEigenschaft);
                if (result == null) result = caseAbstraktModifikatoren(personaEigenschaft);
                if (result == null) result = caseErlernbar(personaEigenschaft);
                if (result == null) result = caseBeschreibbar(personaEigenschaft);
                if (result == null) result = caseModifizierbar(personaEigenschaft);
                if (result == null) result = caseQuelle(personaEigenschaft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PROBEN_MODIFIKATOREN: {
                ProbenModifikatoren probenModifikatoren = (ProbenModifikatoren)theEObject;
                T result = caseProbenModifikatoren(probenModifikatoren);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MAGIER: {
                Magier magier = (Magier)theEObject;
                T result = caseMagier(magier);
                if (result == null) result = caseMagischePersona(magier);
                if (result == null) result = caseZauberer(magier);
                if (result == null) result = caseAstraleProjektion(magier);
                if (result == null) result = caseKoerperPersona(magier);
                if (result == null) result = caseBaseMagischePersona(magier);
                if (result == null) result = caseAbstraktPersona(magier);
                if (result == null) result = casePanzerung(magier);
                if (result == null) result = casePersonaZustand(magier);
                if (result == null) result = caseBeschreibbar(magier);
                if (result == null) result = caseKoerperlicheAttribute(magier);
                if (result == null) result = caseSpezielleAttribute(magier);
                if (result == null) result = caseGeistigeAttribute(magier);
                if (result == null) result = caseChrakterLimits(magier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ZAUBERER: {
                Zauberer zauberer = (Zauberer)theEObject;
                T result = caseZauberer(zauberer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MYSTIC_ADEPT: {
                MysticAdept mysticAdept = (MysticAdept)theEObject;
                T result = caseMysticAdept(mysticAdept);
                if (result == null) result = caseKiAdept(mysticAdept);
                if (result == null) result = caseZauberer(mysticAdept);
                if (result == null) result = caseMagischePersona(mysticAdept);
                if (result == null) result = caseKoerperPersona(mysticAdept);
                if (result == null) result = caseBaseMagischePersona(mysticAdept);
                if (result == null) result = caseAbstraktPersona(mysticAdept);
                if (result == null) result = casePanzerung(mysticAdept);
                if (result == null) result = casePersonaZustand(mysticAdept);
                if (result == null) result = caseBeschreibbar(mysticAdept);
                if (result == null) result = caseKoerperlicheAttribute(mysticAdept);
                if (result == null) result = caseSpezielleAttribute(mysticAdept);
                if (result == null) result = caseGeistigeAttribute(mysticAdept);
                if (result == null) result = caseChrakterLimits(mysticAdept);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PERSONA_ZAUBER: {
                PersonaZauber personaZauber = (PersonaZauber)theEObject;
                T result = casePersonaZauber(personaZauber);
                if (result == null) result = caseErlernbar(personaZauber);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ZAUBER: {
                Zauber zauber = (Zauber)theEObject;
                T result = caseZauber(zauber);
                if (result == null) result = caseBeschreibbar(zauber);
                if (result == null) result = caseQuelle(zauber);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.CHRAKTER_LIMITS: {
                ChrakterLimits chrakterLimits = (ChrakterLimits)theEObject;
                T result = caseChrakterLimits(chrakterLimits);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PANZERUNG: {
                Panzerung panzerung = (Panzerung)theEObject;
                T result = casePanzerung(panzerung);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ASPEKT_MAGIER: {
                AspektMagier aspektMagier = (AspektMagier)theEObject;
                T result = caseAspektMagier(aspektMagier);
                if (result == null) result = caseMagischePersona(aspektMagier);
                if (result == null) result = caseZauberer(aspektMagier);
                if (result == null) result = caseKoerperPersona(aspektMagier);
                if (result == null) result = caseBaseMagischePersona(aspektMagier);
                if (result == null) result = caseAbstraktPersona(aspektMagier);
                if (result == null) result = casePanzerung(aspektMagier);
                if (result == null) result = casePersonaZustand(aspektMagier);
                if (result == null) result = caseBeschreibbar(aspektMagier);
                if (result == null) result = caseKoerperlicheAttribute(aspektMagier);
                if (result == null) result = caseSpezielleAttribute(aspektMagier);
                if (result == null) result = caseGeistigeAttribute(aspektMagier);
                if (result == null) result = caseChrakterLimits(aspektMagier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ASTRALE_PROJEKTION: {
                AstraleProjektion astraleProjektion = (AstraleProjektion)theEObject;
                T result = caseAstraleProjektion(astraleProjektion);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SCHUTZGEIST: {
                Schutzgeist schutzgeist = (Schutzgeist)theEObject;
                T result = caseSchutzgeist(schutzgeist);
                if (result == null) result = caseMagischeMods(schutzgeist);
                if (result == null) result = caseAbstraktModifikatoren(schutzgeist);
                if (result == null) result = caseBeschreibbar(schutzgeist);
                if (result == null) result = caseModifizierbar(schutzgeist);
                if (result == null) result = caseQuelle(schutzgeist);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.INITATION: {
                Initation initation = (Initation)theEObject;
                T result = caseInitation(initation);
                if (result == null) result = caseSteigerbar(initation);
                if (result == null) result = caseErlernbar(initation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.META_MAGIE: {
                MetaMagie metaMagie = (MetaMagie)theEObject;
                T result = caseMetaMagie(metaMagie);
                if (result == null) result = caseBeschreibbar(metaMagie);
                if (result == null) result = caseQuelle(metaMagie);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.CRITTER_KRAFT: {
                CritterKraft critterKraft = (CritterKraft)theEObject;
                T result = caseCritterKraft(critterKraft);
                if (result == null) result = caseMagischeMods(critterKraft);
                if (result == null) result = caseAbstraktModifikatoren(critterKraft);
                if (result == null) result = caseBeschreibbar(critterKraft);
                if (result == null) result = caseModifizierbar(critterKraft);
                if (result == null) result = caseQuelle(critterKraft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FAHRZEUG: {
                Fahrzeug fahrzeug = (Fahrzeug)theEObject;
                T result = caseFahrzeug(fahrzeug);
                if (result == null) result = caseBeschreibbar(fahrzeug);
                if (result == null) result = caseQuelle(fahrzeug);
                if (result == null) result = caseGeldWert(fahrzeug);
                if (result == null) result = caseAnwendbar(fahrzeug);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.BODENFAHRZEUG: {
                Bodenfahrzeug bodenfahrzeug = (Bodenfahrzeug)theEObject;
                T result = caseBodenfahrzeug(bodenfahrzeug);
                if (result == null) result = casePassagierFahrzeug(bodenfahrzeug);
                if (result == null) result = caseFahrzeug(bodenfahrzeug);
                if (result == null) result = caseBeschreibbar(bodenfahrzeug);
                if (result == null) result = caseQuelle(bodenfahrzeug);
                if (result == null) result = caseGeldWert(bodenfahrzeug);
                if (result == null) result = caseAnwendbar(bodenfahrzeug);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PASSAGIER_FAHRZEUG: {
                PassagierFahrzeug passagierFahrzeug = (PassagierFahrzeug)theEObject;
                T result = casePassagierFahrzeug(passagierFahrzeug);
                if (result == null) result = caseFahrzeug(passagierFahrzeug);
                if (result == null) result = caseBeschreibbar(passagierFahrzeug);
                if (result == null) result = caseQuelle(passagierFahrzeug);
                if (result == null) result = caseGeldWert(passagierFahrzeug);
                if (result == null) result = caseAnwendbar(passagierFahrzeug);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.DROHNE: {
                Drohne drohne = (Drohne)theEObject;
                T result = caseDrohne(drohne);
                if (result == null) result = caseFahrzeug(drohne);
                if (result == null) result = caseBeschreibbar(drohne);
                if (result == null) result = caseQuelle(drohne);
                if (result == null) result = caseGeldWert(drohne);
                if (result == null) result = caseAnwendbar(drohne);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FAHRZEUG_MODIFIKATION: {
                FahrzeugModifikation fahrzeugModifikation = (FahrzeugModifikation)theEObject;
                T result = caseFahrzeugModifikation(fahrzeugModifikation);
                if (result == null) result = caseBeschreibbar(fahrzeugModifikation);
                if (result == null) result = caseQuelle(fahrzeugModifikation);
                if (result == null) result = caseGeldWert(fahrzeugModifikation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.TECHNOMANCER: {
                Technomancer technomancer = (Technomancer)theEObject;
                T result = caseTechnomancer(technomancer);
                if (result == null) result = caseKoerperPersona(technomancer);
                if (result == null) result = caseResonanzPersona(technomancer);
                if (result == null) result = caseAbstraktPersona(technomancer);
                if (result == null) result = casePanzerung(technomancer);
                if (result == null) result = casePersonaZustand(technomancer);
                if (result == null) result = caseBeschreibbar(technomancer);
                if (result == null) result = caseKoerperlicheAttribute(technomancer);
                if (result == null) result = caseSpezielleAttribute(technomancer);
                if (result == null) result = caseGeistigeAttribute(technomancer);
                if (result == null) result = caseChrakterLimits(technomancer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.RESONANZ_PERSONA: {
                ResonanzPersona resonanzPersona = (ResonanzPersona)theEObject;
                T result = caseResonanzPersona(resonanzPersona);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.KOMPLEXE_FORM: {
                KomplexeForm komplexeForm = (KomplexeForm)theEObject;
                T result = caseKomplexeForm(komplexeForm);
                if (result == null) result = caseQuelle(komplexeForm);
                if (result == null) result = caseBeschreibbar(komplexeForm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PERSONA_KOMPLEX_FORM: {
                PersonaKomplexForm personaKomplexForm = (PersonaKomplexForm)theEObject;
                T result = casePersonaKomplexForm(personaKomplexForm);
                if (result == null) result = caseErlernbar(personaKomplexForm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SPRITE: {
                Sprite sprite = (Sprite)theEObject;
                T result = caseSprite(sprite);
                if (result == null) result = caseResonanzPersona(sprite);
                if (result == null) result = caseBeschreibbar(sprite);
                if (result == null) result = caseQuelle(sprite);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ECHO: {
                Echo echo = (Echo)theEObject;
                T result = caseEcho(echo);
                if (result == null) result = caseAbstraktModifikatoren(echo);
                if (result == null) result = caseBeschreibbar(echo);
                if (result == null) result = caseModifizierbar(echo);
                if (result == null) result = caseQuelle(echo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.VERTRAG: {
                Vertrag vertrag = (Vertrag)theEObject;
                T result = caseVertrag(vertrag);
                if (result == null) result = caseBeschreibbar(vertrag);
                if (result == null) result = caseQuelle(vertrag);
                if (result == null) result = caseGeldWert(vertrag);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.LIFESTYLE: {
                Lifestyle lifestyle = (Lifestyle)theEObject;
                T result = caseLifestyle(lifestyle);
                if (result == null) result = caseIntervallVertrag(lifestyle);
                if (result == null) result = caseVertrag(lifestyle);
                if (result == null) result = caseBeschreibbar(lifestyle);
                if (result == null) result = caseQuelle(lifestyle);
                if (result == null) result = caseGeldWert(lifestyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.WISSENSFERTIGKEIT: {
                Wissensfertigkeit wissensfertigkeit = (Wissensfertigkeit)theEObject;
                T result = caseWissensfertigkeit(wissensfertigkeit);
                if (result == null) result = caseFertigkeit(wissensfertigkeit);
                if (result == null) result = caseBeschreibbar(wissensfertigkeit);
                if (result == null) result = caseQuelle(wissensfertigkeit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SPRACHFERTIGKEIT: {
                Sprachfertigkeit sprachfertigkeit = (Sprachfertigkeit)theEObject;
                T result = caseSprachfertigkeit(sprachfertigkeit);
                if (result == null) result = caseWissensfertigkeit(sprachfertigkeit);
                if (result == null) result = caseFertigkeit(sprachfertigkeit);
                if (result == null) result = caseBeschreibbar(sprachfertigkeit);
                if (result == null) result = caseQuelle(sprachfertigkeit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PERSONA_ZUSTAND: {
                PersonaZustand personaZustand = (PersonaZustand)theEObject;
                T result = casePersonaZustand(personaZustand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.CRITTER: {
                Critter critter = (Critter)theEObject;
                T result = caseCritter(critter);
                if (result == null) result = caseSpezies(critter);
                if (result == null) result = caseBeschreibbar(critter);
                if (result == null) result = caseModifizierbar(critter);
                if (result == null) result = caseQuelle(critter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.INTERVALL_VERTRAG: {
                IntervallVertrag intervallVertrag = (IntervallVertrag)theEObject;
                T result = caseIntervallVertrag(intervallVertrag);
                if (result == null) result = caseVertrag(intervallVertrag);
                if (result == null) result = caseBeschreibbar(intervallVertrag);
                if (result == null) result = caseQuelle(intervallVertrag);
                if (result == null) result = caseGeldWert(intervallVertrag);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SIN: {
                Sin sin = (Sin)theEObject;
                T result = caseSin(sin);
                if (result == null) result = caseFakeable(sin);
                if (result == null) result = caseVertrag(sin);
                if (result == null) result = caseBeschreibbar(sin);
                if (result == null) result = caseQuelle(sin);
                if (result == null) result = caseGeldWert(sin);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.LIZENZ: {
                Lizenz lizenz = (Lizenz)theEObject;
                T result = caseLizenz(lizenz);
                if (result == null) result = caseFakeable(lizenz);
                if (result == null) result = caseVertrag(lizenz);
                if (result == null) result = caseBeschreibbar(lizenz);
                if (result == null) result = caseQuelle(lizenz);
                if (result == null) result = caseGeldWert(lizenz);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FAKEABLE: {
                Fakeable fakeable = (Fakeable)theEObject;
                T result = caseFakeable(fakeable);
                if (result == null) result = caseVertrag(fakeable);
                if (result == null) result = caseBeschreibbar(fakeable);
                if (result == null) result = caseQuelle(fakeable);
                if (result == null) result = caseGeldWert(fakeable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.STEIGERBAR: {
                Steigerbar steigerbar = (Steigerbar)theEObject;
                T result = caseSteigerbar(steigerbar);
                if (result == null) result = caseErlernbar(steigerbar);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ERLERNBAR: {
                Erlernbar erlernbar = (Erlernbar)theEObject;
                T result = caseErlernbar(erlernbar);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.CREDSTICK: {
                Credstick credstick = (Credstick)theEObject;
                T result = caseCredstick(credstick);
                if (result == null) result = caseAbstraktGegenstand(credstick);
                if (result == null) result = caseQuelle(credstick);
                if (result == null) result = caseGeldWert(credstick);
                if (result == null) result = caseBeschreibbar(credstick);
                if (result == null) result = caseModifizierbar(credstick);
                if (result == null) result = caseAnwendbar(credstick);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Beschreibbar</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Beschreibbar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBeschreibbar(Beschreibbar object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Quelle</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quelle</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseQuelle(Quelle object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Source Book</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source Book</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSourceBook(SourceBook object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstrakt Persona</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstrakt Persona</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstraktPersona(AbstraktPersona object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Gegenstand</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gegenstand</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseGegenstand(Gegenstand object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Geld Wert</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Geld Wert</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseGeldWert(GeldWert object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Reichweite</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reichweite</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseReichweite(Reichweite object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Attribut Modifikator Wert</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribut Modifikator Wert</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAttributModifikatorWert(AttributModifikatorWert object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Modifizierbar</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Modifizierbar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseModifizierbar(Modifizierbar object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Koerperliche Attribute</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Koerperliche Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKoerperlicheAttribute(KoerperlicheAttribute object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Spezielle Attribute</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spezielle Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSpezielleAttribute(SpezielleAttribute object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstrakt Gegenstand</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstrakt Gegenstand</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstraktGegenstand(AbstraktGegenstand object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstakt Fern Kampfwaffe</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstakt Fern Kampfwaffe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstaktFernKampfwaffe(AbstaktFernKampfwaffe object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstakt Waffe</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstakt Waffe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstaktWaffe(AbstaktWaffe object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Nahkampfwaffe</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nahkampfwaffe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNahkampfwaffe(Nahkampfwaffe object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Feuerwaffe</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feuerwaffe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFeuerwaffe(Feuerwaffe object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Wurfwaffe</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wurfwaffe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWurfwaffe(Wurfwaffe object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Shr List</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shr List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseShrList(ShrList object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Projektilwaffe</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Projektilwaffe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProjektilwaffe(Projektilwaffe object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Fertigkeits Gruppe</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fertigkeits Gruppe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFertigkeitsGruppe(FertigkeitsGruppe object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Fertigkeit</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fertigkeit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFertigkeit(Fertigkeit object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Persona Fertigkeit</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persona Fertigkeit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePersonaFertigkeit(PersonaFertigkeit object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Persona Fertigkeits Gruppe</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persona Fertigkeits Gruppe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePersonaFertigkeitsGruppe(PersonaFertigkeitsGruppe object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Cyberware</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cyberware</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCyberware(Cyberware object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Bio Ware</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bio Ware</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBioWare(BioWare object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Koerpermods</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Koerpermods</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKoerpermods(Koerpermods object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstrakt Modifikatoren</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstrakt Modifikatoren</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstraktModifikatoren(AbstraktModifikatoren object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Geistige Attribute</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Geistige Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseGeistigeAttribute(GeistigeAttribute object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Mudan Persona</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mudan Persona</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMudanPersona(MudanPersona object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Koerper Persona</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Koerper Persona</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKoerperPersona(KoerperPersona object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Magische Mods</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Magische Mods</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMagischeMods(MagischeMods object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Ki Kraft</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ki Kraft</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKiKraft(KiKraft object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Magische Persona</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Magische Persona</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMagischePersona(MagischePersona object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Base Magische Persona</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Magische Persona</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBaseMagischePersona(BaseMagischePersona object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Fernkampfwaffen Modifikatoren</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fernkampfwaffen Modifikatoren</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFernkampfwaffenModifikatoren(FernkampfwaffenModifikatoren object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Sichtverhaeltnisse</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sichtverhaeltnisse</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSichtverhaeltnisse(Sichtverhaeltnisse object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Spezies</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spezies</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSpezies(Spezies object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Gegenstand Stufen</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gegenstand Stufen</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseGegenstandStufen(GegenstandStufen object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Ki Adept</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ki Adept</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKiAdept(KiAdept object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Kleidung</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Kleidung</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKleidung(Kleidung object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Fernkampfwaffe Modifikator</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fernkampfwaffe Modifikator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFernkampfwaffeModifikator(FernkampfwaffeModifikator object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Anwendbar</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Anwendbar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAnwendbar(Anwendbar object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Persona Eigenschaft</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persona Eigenschaft</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePersonaEigenschaft(PersonaEigenschaft object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Proben Modifikatoren</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Proben Modifikatoren</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProbenModifikatoren(ProbenModifikatoren object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Magier</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Magier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMagier(Magier object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Zauberer</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Zauberer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseZauberer(Zauberer object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Mystic Adept</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mystic Adept</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMysticAdept(MysticAdept object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Persona Zauber</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persona Zauber</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePersonaZauber(PersonaZauber object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Zauber</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Zauber</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseZauber(Zauber object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Chrakter Limits</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chrakter Limits</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseChrakterLimits(ChrakterLimits object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Panzerung</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Panzerung</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePanzerung(Panzerung object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Aspekt Magier</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aspekt Magier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAspektMagier(AspektMagier object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Astrale Projektion</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Astrale Projektion</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAstraleProjektion(AstraleProjektion object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Schutzgeist</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schutzgeist</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSchutzgeist(Schutzgeist object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Initation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Initation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInitation(Initation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Meta Magie</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meta Magie</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMetaMagie(MetaMagie object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Critter Kraft</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Critter Kraft</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCritterKraft(CritterKraft object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Fahrzeug</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fahrzeug</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFahrzeug(Fahrzeug object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Bodenfahrzeug</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bodenfahrzeug</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBodenfahrzeug(Bodenfahrzeug object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Passagier Fahrzeug</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Passagier Fahrzeug</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePassagierFahrzeug(PassagierFahrzeug object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Drohne</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Drohne</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDrohne(Drohne object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Fahrzeug Modifikation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fahrzeug Modifikation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFahrzeugModifikation(FahrzeugModifikation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Technomancer</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Technomancer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTechnomancer(Technomancer object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Resonanz Persona</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resonanz Persona</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseResonanzPersona(ResonanzPersona object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Komplexe Form</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Komplexe Form</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKomplexeForm(KomplexeForm object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Persona Komplex Form</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persona Komplex Form</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePersonaKomplexForm(PersonaKomplexForm object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Sprite</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sprite</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSprite(Sprite object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Echo</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Echo</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEcho(Echo object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Vertrag</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vertrag</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseVertrag(Vertrag object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Lifestyle</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lifestyle</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseLifestyle(Lifestyle object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Wissensfertigkeit</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wissensfertigkeit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWissensfertigkeit(Wissensfertigkeit object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Sprachfertigkeit</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sprachfertigkeit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSprachfertigkeit(Sprachfertigkeit object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Persona Zustand</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persona Zustand</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePersonaZustand(PersonaZustand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Critter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Critter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCritter(Critter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Intervall Vertrag</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intervall Vertrag</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntervallVertrag(IntervallVertrag object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sin</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sin</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSin(Sin object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lizenz</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lizenz</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLizenz(Lizenz object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fakeable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fakeable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFakeable(Fakeable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Steigerbar</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Steigerbar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSteigerbar(Steigerbar object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Erlernbar</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Erlernbar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseErlernbar(Erlernbar object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Credstick</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Credstick</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCredstick(Credstick object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	@Override
	public T defaultCase(EObject object) {
        return null;
    }

} //Shr5Switch
