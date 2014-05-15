/**
 */
package de.urszeidler.eclipse.shr5.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.urszeidler.eclipse.shr5.*;

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
                if (result == null) result = caseIdentifiable(quelle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SOURCE_BOOK: {
                SourceBook sourceBook = (SourceBook)theEObject;
                T result = caseSourceBook(sourceBook);
                if (result == null) result = caseBeschreibbar(sourceBook);
                if (result == null) result = caseIdentifiable(sourceBook);
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
                if (result == null) result = caseModifikatorAttribute(abstraktPersona);
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
                if (result == null) result = caseIdentifiable(gegenstand);
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
                if (result == null) result = caseModifikatorAttribute(koerperlicheAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SPEZIELLE_ATTRIBUTE: {
                SpezielleAttribute spezielleAttribute = (SpezielleAttribute)theEObject;
                T result = caseSpezielleAttribute(spezielleAttribute);
                if (result == null) result = caseModifikatorAttribute(spezielleAttribute);
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
                if (result == null) result = caseIdentifiable(abstraktGegenstand);
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
                if (result == null) result = caseIdentifiable(abstaktFernKampfwaffe);
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
                if (result == null) result = caseIdentifiable(abstaktWaffe);
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
                if (result == null) result = caseIdentifiable(nahkampfwaffe);
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
                if (result == null) result = caseIdentifiable(feuerwaffe);
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
                if (result == null) result = caseIdentifiable(wurfwaffe);
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
                if (result == null) result = caseIdentifiable(projektilwaffe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FERTIGKEITS_GRUPPE: {
                FertigkeitsGruppe fertigkeitsGruppe = (FertigkeitsGruppe)theEObject;
                T result = caseFertigkeitsGruppe(fertigkeitsGruppe);
                if (result == null) result = caseBeschreibbar(fertigkeitsGruppe);
                if (result == null) result = caseQuelle(fertigkeitsGruppe);
                if (result == null) result = caseIdentifiable(fertigkeitsGruppe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FERTIGKEIT: {
                Fertigkeit fertigkeit = (Fertigkeit)theEObject;
                T result = caseFertigkeit(fertigkeit);
                if (result == null) result = caseBeschreibbar(fertigkeit);
                if (result == null) result = caseQuelle(fertigkeit);
                if (result == null) result = caseIdentifiable(fertigkeit);
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
                if (result == null) result = caseIdentifiable(cyberware);
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
                if (result == null) result = caseIdentifiable(bioWare);
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
                if (result == null) result = caseIdentifiable(koerpermods);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ABSTRAKT_MODIFIKATOREN: {
                AbstraktModifikatoren abstraktModifikatoren = (AbstraktModifikatoren)theEObject;
                T result = caseAbstraktModifikatoren(abstraktModifikatoren);
                if (result == null) result = caseBeschreibbar(abstraktModifikatoren);
                if (result == null) result = caseModifizierbar(abstraktModifikatoren);
                if (result == null) result = caseQuelle(abstraktModifikatoren);
                if (result == null) result = caseIdentifiable(abstraktModifikatoren);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.GEISTIGE_ATTRIBUTE: {
                GeistigeAttribute geistigeAttribute = (GeistigeAttribute)theEObject;
                T result = caseGeistigeAttribute(geistigeAttribute);
                if (result == null) result = caseModifikatorAttribute(geistigeAttribute);
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
                if (result == null) result = caseModifikatorAttribute(mudanPersona);
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
                if (result == null) result = caseModifikatorAttribute(koerperPersona);
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
                if (result == null) result = caseIdentifiable(magischeMods);
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
                if (result == null) result = caseIdentifiable(kiKraft);
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
                if (result == null) result = caseModifikatorAttribute(magischePersona);
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
                if (result == null) result = caseModifikatorAttribute(fernkampfwaffenModifikatoren);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SICHTVERHAELTNISSE: {
                Sichtverhaeltnisse sichtverhaeltnisse = (Sichtverhaeltnisse)theEObject;
                T result = caseSichtverhaeltnisse(sichtverhaeltnisse);
                if (result == null) result = caseModifikatorAttribute(sichtverhaeltnisse);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SPEZIES: {
                Spezies spezies = (Spezies)theEObject;
                T result = caseSpezies(spezies);
                if (result == null) result = caseBeschreibbar(spezies);
                if (result == null) result = caseModifizierbar(spezies);
                if (result == null) result = caseQuelle(spezies);
                if (result == null) result = caseIdentifiable(spezies);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.GEGENSTAND_STUFEN: {
                GegenstandStufen gegenstandStufen = (GegenstandStufen)theEObject;
                T result = caseGegenstandStufen(gegenstandStufen);
                if (result == null) result = caseModifikatorAttribute(gegenstandStufen);
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
                if (result == null) result = caseModifikatorAttribute(kiAdept);
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
                if (result == null) result = caseIdentifiable(kleidung);
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
                if (result == null) result = caseIdentifiable(fernkampfwaffeModifikator);
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
                if (result == null) result = caseIdentifiable(personaEigenschaft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PROBEN_MODIFIKATOREN: {
                ProbenModifikatoren probenModifikatoren = (ProbenModifikatoren)theEObject;
                T result = caseProbenModifikatoren(probenModifikatoren);
                if (result == null) result = caseModifikatorAttribute(probenModifikatoren);
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
                if (result == null) result = caseModifikatorAttribute(magier);
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
                if (result == null) result = caseModifikatorAttribute(mysticAdept);
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
                if (result == null) result = caseIdentifiable(zauber);
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
                if (result == null) result = caseModifikatorAttribute(aspektMagier);
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
                if (result == null) result = caseIdentifiable(schutzgeist);
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
                if (result == null) result = caseIdentifiable(metaMagie);
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
                if (result == null) result = caseIdentifiable(critterKraft);
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
                if (result == null) result = caseModifizierbar(fahrzeug);
                if (result == null) result = caseFahrzeugZustand(fahrzeug);
                if (result == null) result = caseIdentifiable(fahrzeug);
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
                if (result == null) result = caseModifizierbar(bodenfahrzeug);
                if (result == null) result = caseFahrzeugZustand(bodenfahrzeug);
                if (result == null) result = caseIdentifiable(bodenfahrzeug);
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
                if (result == null) result = caseModifizierbar(passagierFahrzeug);
                if (result == null) result = caseFahrzeugZustand(passagierFahrzeug);
                if (result == null) result = caseIdentifiable(passagierFahrzeug);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.DROHNE: {
                Drohne drohne = (Drohne)theEObject;
                T result = caseDrohne(drohne);
                if (result == null) result = caseFahrzeug(drohne);
                if (result == null) result = caseMatrixAttributes(drohne);
                if (result == null) result = caseBeschreibbar(drohne);
                if (result == null) result = caseQuelle(drohne);
                if (result == null) result = caseGeldWert(drohne);
                if (result == null) result = caseAnwendbar(drohne);
                if (result == null) result = caseModifizierbar(drohne);
                if (result == null) result = caseFahrzeugZustand(drohne);
                if (result == null) result = caseMatixConditionMonitor(drohne);
                if (result == null) result = caseIdentifiable(drohne);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FAHRZEUG_MODIFIKATION: {
                FahrzeugModifikation fahrzeugModifikation = (FahrzeugModifikation)theEObject;
                T result = caseFahrzeugModifikation(fahrzeugModifikation);
                if (result == null) result = caseBeschreibbar(fahrzeugModifikation);
                if (result == null) result = caseQuelle(fahrzeugModifikation);
                if (result == null) result = caseGeldWert(fahrzeugModifikation);
                if (result == null) result = caseIdentifiable(fahrzeugModifikation);
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
                if (result == null) result = caseActiveMatixDevice(technomancer);
                if (result == null) result = caseBeschreibbar(technomancer);
                if (result == null) result = caseKoerperlicheAttribute(technomancer);
                if (result == null) result = caseSpezielleAttribute(technomancer);
                if (result == null) result = caseGeistigeAttribute(technomancer);
                if (result == null) result = caseChrakterLimits(technomancer);
                if (result == null) result = caseMatrixAttributes(technomancer);
                if (result == null) result = caseModifikatorAttribute(technomancer);
                if (result == null) result = caseMatixConditionMonitor(technomancer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.RESONANZ_PERSONA: {
                ResonanzPersona resonanzPersona = (ResonanzPersona)theEObject;
                T result = caseResonanzPersona(resonanzPersona);
                if (result == null) result = caseActiveMatixDevice(resonanzPersona);
                if (result == null) result = caseMatrixAttributes(resonanzPersona);
                if (result == null) result = caseMatixConditionMonitor(resonanzPersona);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.KOMPLEXE_FORM: {
                KomplexeForm komplexeForm = (KomplexeForm)theEObject;
                T result = caseKomplexeForm(komplexeForm);
                if (result == null) result = caseQuelle(komplexeForm);
                if (result == null) result = caseBeschreibbar(komplexeForm);
                if (result == null) result = caseIdentifiable(komplexeForm);
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
                if (result == null) result = caseActiveMatixDevice(sprite);
                if (result == null) result = caseIdentifiable(sprite);
                if (result == null) result = caseMatrixAttributes(sprite);
                if (result == null) result = caseMatixConditionMonitor(sprite);
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
                if (result == null) result = caseIdentifiable(echo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.VERTRAG: {
                Vertrag vertrag = (Vertrag)theEObject;
                T result = caseVertrag(vertrag);
                if (result == null) result = caseBeschreibbar(vertrag);
                if (result == null) result = caseQuelle(vertrag);
                if (result == null) result = caseGeldWert(vertrag);
                if (result == null) result = caseIdentifiable(vertrag);
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
                if (result == null) result = caseIdentifiable(lifestyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.WISSENSFERTIGKEIT: {
                Wissensfertigkeit wissensfertigkeit = (Wissensfertigkeit)theEObject;
                T result = caseWissensfertigkeit(wissensfertigkeit);
                if (result == null) result = caseFertigkeit(wissensfertigkeit);
                if (result == null) result = caseBeschreibbar(wissensfertigkeit);
                if (result == null) result = caseQuelle(wissensfertigkeit);
                if (result == null) result = caseIdentifiable(wissensfertigkeit);
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
                if (result == null) result = caseIdentifiable(sprachfertigkeit);
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
                if (result == null) result = caseIdentifiable(critter);
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
                if (result == null) result = caseIdentifiable(intervallVertrag);
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
                if (result == null) result = caseIdentifiable(sin);
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
                if (result == null) result = caseIdentifiable(lizenz);
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
                if (result == null) result = caseIdentifiable(fakeable);
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
                if (result == null) result = caseIdentifiable(credstick);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MENGE: {
                Menge menge = (Menge)theEObject;
                T result = caseMenge(menge);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MUNITION: {
                Munition munition = (Munition)theEObject;
                T result = caseMunition(munition);
                if (result == null) result = caseAbstraktGegenstand(munition);
                if (result == null) result = caseMenge(munition);
                if (result == null) result = caseQuelle(munition);
                if (result == null) result = caseGeldWert(munition);
                if (result == null) result = caseBeschreibbar(munition);
                if (result == null) result = caseModifizierbar(munition);
                if (result == null) result = caseAnwendbar(munition);
                if (result == null) result = caseIdentifiable(munition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MODIFIKATOR_ATTRIBUTE: {
                ModifikatorAttribute modifikatorAttribute = (ModifikatorAttribute)theEObject;
                T result = caseModifikatorAttribute(modifikatorAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.GEBUNDENER_GEIST: {
                GebundenerGeist gebundenerGeist = (GebundenerGeist)theEObject;
                T result = caseGebundenerGeist(gebundenerGeist);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.STUFEN_PERSONA: {
                StufenPersona stufenPersona = (StufenPersona)theEObject;
                T result = caseStufenPersona(stufenPersona);
                if (result == null) result = caseQuelle(stufenPersona);
                if (result == null) result = caseSpezielleAttribute(stufenPersona);
                if (result == null) result = caseGeistigeAttribute(stufenPersona);
                if (result == null) result = caseKoerperlicheAttribute(stufenPersona);
                if (result == null) result = caseBeschreibbar(stufenPersona);
                if (result == null) result = caseChrakterLimits(stufenPersona);
                if (result == null) result = casePanzerung(stufenPersona);
                if (result == null) result = caseIdentifiable(stufenPersona);
                if (result == null) result = caseModifikatorAttribute(stufenPersona);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.GEIST: {
                Geist geist = (Geist)theEObject;
                T result = caseGeist(geist);
                if (result == null) result = caseStufenPersona(geist);
                if (result == null) result = caseAstraleProjektion(geist);
                if (result == null) result = caseQuelle(geist);
                if (result == null) result = caseSpezielleAttribute(geist);
                if (result == null) result = caseGeistigeAttribute(geist);
                if (result == null) result = caseKoerperlicheAttribute(geist);
                if (result == null) result = caseBeschreibbar(geist);
                if (result == null) result = caseChrakterLimits(geist);
                if (result == null) result = casePanzerung(geist);
                if (result == null) result = caseIdentifiable(geist);
                if (result == null) result = caseModifikatorAttribute(geist);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.IDENTIFIABLE: {
                Identifiable identifiable = (Identifiable)theEObject;
                T result = caseIdentifiable(identifiable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.CREDSTICK_TRANSACTION: {
                CredstickTransaction credstickTransaction = (CredstickTransaction)theEObject;
                T result = caseCredstickTransaction(credstickTransaction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SPEZIALISIERUNG: {
                Spezialisierung spezialisierung = (Spezialisierung)theEObject;
                T result = caseSpezialisierung(spezialisierung);
                if (result == null) result = caseBeschreibbar(spezialisierung);
                if (result == null) result = caseQuelle(spezialisierung);
                if (result == null) result = caseErlernbar(spezialisierung);
                if (result == null) result = caseIdentifiable(spezialisierung);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MATRIX_ATTRIBUTES: {
                MatrixAttributes matrixAttributes = (MatrixAttributes)theEObject;
                T result = caseMatrixAttributes(matrixAttributes);
                if (result == null) result = caseMatixConditionMonitor(matrixAttributes);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ACTIVE_MATIX_DEVICE: {
                ActiveMatixDevice activeMatixDevice = (ActiveMatixDevice)theEObject;
                T result = caseActiveMatixDevice(activeMatixDevice);
                if (result == null) result = caseMatrixAttributes(activeMatixDevice);
                if (result == null) result = caseMatixConditionMonitor(activeMatixDevice);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.COMMLINK: {
                Commlink commlink = (Commlink)theEObject;
                T result = caseCommlink(commlink);
                if (result == null) result = caseAbstractMatrixDevice(commlink);
                if (result == null) result = caseAbstraktGegenstand(commlink);
                if (result == null) result = caseMatrixDevice(commlink);
                if (result == null) result = caseQuelle(commlink);
                if (result == null) result = caseGeldWert(commlink);
                if (result == null) result = caseBeschreibbar(commlink);
                if (result == null) result = caseModifizierbar(commlink);
                if (result == null) result = caseAnwendbar(commlink);
                if (result == null) result = caseMatrixAttributes(commlink);
                if (result == null) result = caseIdentifiable(commlink);
                if (result == null) result = caseMatixConditionMonitor(commlink);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MATIX_CONDITION_MONITOR: {
                MatixConditionMonitor matixConditionMonitor = (MatixConditionMonitor)theEObject;
                T result = caseMatixConditionMonitor(matixConditionMonitor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.CYBERDECK: {
                Cyberdeck cyberdeck = (Cyberdeck)theEObject;
                T result = caseCyberdeck(cyberdeck);
                if (result == null) result = caseAbstractMatrixDevice(cyberdeck);
                if (result == null) result = caseActiveMatixDevice(cyberdeck);
                if (result == null) result = caseAbstraktGegenstand(cyberdeck);
                if (result == null) result = caseMatrixDevice(cyberdeck);
                if (result == null) result = caseQuelle(cyberdeck);
                if (result == null) result = caseGeldWert(cyberdeck);
                if (result == null) result = caseBeschreibbar(cyberdeck);
                if (result == null) result = caseModifizierbar(cyberdeck);
                if (result == null) result = caseAnwendbar(cyberdeck);
                if (result == null) result = caseMatrixAttributes(cyberdeck);
                if (result == null) result = caseIdentifiable(cyberdeck);
                if (result == null) result = caseMatixConditionMonitor(cyberdeck);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SOFTWARE_AGENT: {
                SoftwareAgent softwareAgent = (SoftwareAgent)theEObject;
                T result = caseSoftwareAgent(softwareAgent);
                if (result == null) result = caseMatrixProgram(softwareAgent);
                if (result == null) result = caseSoftware(softwareAgent);
                if (result == null) result = caseGeldWert(softwareAgent);
                if (result == null) result = caseBeschreibbar(softwareAgent);
                if (result == null) result = caseQuelle(softwareAgent);
                if (result == null) result = caseIdentifiable(softwareAgent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.HOST: {
                Host host = (Host)theEObject;
                T result = caseHost(host);
                if (result == null) result = caseBeschreibbar(host);
                if (result == null) result = caseMatrixDevice(host);
                if (result == null) result = caseActiveMatixDevice(host);
                if (result == null) result = caseMatrixAttributes(host);
                if (result == null) result = caseMatixConditionMonitor(host);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.CYBERWARE_MODIFIKATIOREN: {
                CyberwareModifikatioren cyberwareModifikatioren = (CyberwareModifikatioren)theEObject;
                T result = caseCyberwareModifikatioren(cyberwareModifikatioren);
                if (result == null) result = caseModifikatorAttribute(cyberwareModifikatioren);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.RIGGER_COMMAND_CONSOLE: {
                RiggerCommandConsole riggerCommandConsole = (RiggerCommandConsole)theEObject;
                T result = caseRiggerCommandConsole(riggerCommandConsole);
                if (result == null) result = caseAbstractMatrixDevice(riggerCommandConsole);
                if (result == null) result = caseAbstraktGegenstand(riggerCommandConsole);
                if (result == null) result = caseMatrixDevice(riggerCommandConsole);
                if (result == null) result = caseQuelle(riggerCommandConsole);
                if (result == null) result = caseGeldWert(riggerCommandConsole);
                if (result == null) result = caseBeschreibbar(riggerCommandConsole);
                if (result == null) result = caseModifizierbar(riggerCommandConsole);
                if (result == null) result = caseAnwendbar(riggerCommandConsole);
                if (result == null) result = caseMatrixAttributes(riggerCommandConsole);
                if (result == null) result = caseIdentifiable(riggerCommandConsole);
                if (result == null) result = caseMatixConditionMonitor(riggerCommandConsole);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.AUTO_SOFT: {
                AutoSoft autoSoft = (AutoSoft)theEObject;
                T result = caseAutoSoft(autoSoft);
                if (result == null) result = caseRiggerProgram(autoSoft);
                if (result == null) result = caseSoftware(autoSoft);
                if (result == null) result = caseGeldWert(autoSoft);
                if (result == null) result = caseBeschreibbar(autoSoft);
                if (result == null) result = caseQuelle(autoSoft);
                if (result == null) result = caseIdentifiable(autoSoft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SOFTWARE: {
                Software software = (Software)theEObject;
                T result = caseSoftware(software);
                if (result == null) result = caseGeldWert(software);
                if (result == null) result = caseBeschreibbar(software);
                if (result == null) result = caseQuelle(software);
                if (result == null) result = caseIdentifiable(software);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MATRIX_PROGRAM: {
                MatrixProgram matrixProgram = (MatrixProgram)theEObject;
                T result = caseMatrixProgram(matrixProgram);
                if (result == null) result = caseSoftware(matrixProgram);
                if (result == null) result = caseGeldWert(matrixProgram);
                if (result == null) result = caseBeschreibbar(matrixProgram);
                if (result == null) result = caseQuelle(matrixProgram);
                if (result == null) result = caseIdentifiable(matrixProgram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.TUTORSOFT: {
                Tutorsoft tutorsoft = (Tutorsoft)theEObject;
                T result = caseTutorsoft(tutorsoft);
                if (result == null) result = caseBasicProgram(tutorsoft);
                if (result == null) result = caseSoftware(tutorsoft);
                if (result == null) result = caseGeldWert(tutorsoft);
                if (result == null) result = caseBeschreibbar(tutorsoft);
                if (result == null) result = caseQuelle(tutorsoft);
                if (result == null) result = caseIdentifiable(tutorsoft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.SKILL_SOFT: {
                SkillSoft skillSoft = (SkillSoft)theEObject;
                T result = caseSkillSoft(skillSoft);
                if (result == null) result = caseSoftware(skillSoft);
                if (result == null) result = caseGeldWert(skillSoft);
                if (result == null) result = caseBeschreibbar(skillSoft);
                if (result == null) result = caseQuelle(skillSoft);
                if (result == null) result = caseIdentifiable(skillSoft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.FAHRZEUG_ZUSTAND: {
                FahrzeugZustand fahrzeugZustand = (FahrzeugZustand)theEObject;
                T result = caseFahrzeugZustand(fahrzeugZustand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PERSONAL_AREA_NETWORK: {
                PersonalAreaNetwork personalAreaNetwork = (PersonalAreaNetwork)theEObject;
                T result = casePersonalAreaNetwork(personalAreaNetwork);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.BASIC_PROGRAM: {
                BasicProgram basicProgram = (BasicProgram)theEObject;
                T result = caseBasicProgram(basicProgram);
                if (result == null) result = caseSoftware(basicProgram);
                if (result == null) result = caseGeldWert(basicProgram);
                if (result == null) result = caseBeschreibbar(basicProgram);
                if (result == null) result = caseQuelle(basicProgram);
                if (result == null) result = caseIdentifiable(basicProgram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.DATASOFT: {
                Datasoft datasoft = (Datasoft)theEObject;
                T result = caseDatasoft(datasoft);
                if (result == null) result = caseBasicProgram(datasoft);
                if (result == null) result = caseSoftware(datasoft);
                if (result == null) result = caseGeldWert(datasoft);
                if (result == null) result = caseBeschreibbar(datasoft);
                if (result == null) result = caseQuelle(datasoft);
                if (result == null) result = caseIdentifiable(datasoft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.ABSTRACT_MATRIX_DEVICE: {
                AbstractMatrixDevice abstractMatrixDevice = (AbstractMatrixDevice)theEObject;
                T result = caseAbstractMatrixDevice(abstractMatrixDevice);
                if (result == null) result = caseAbstraktGegenstand(abstractMatrixDevice);
                if (result == null) result = caseMatrixDevice(abstractMatrixDevice);
                if (result == null) result = caseQuelle(abstractMatrixDevice);
                if (result == null) result = caseGeldWert(abstractMatrixDevice);
                if (result == null) result = caseBeschreibbar(abstractMatrixDevice);
                if (result == null) result = caseModifizierbar(abstractMatrixDevice);
                if (result == null) result = caseAnwendbar(abstractMatrixDevice);
                if (result == null) result = caseMatrixAttributes(abstractMatrixDevice);
                if (result == null) result = caseIdentifiable(abstractMatrixDevice);
                if (result == null) result = caseMatixConditionMonitor(abstractMatrixDevice);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.CONSUMER_SOFT: {
                ConsumerSoft consumerSoft = (ConsumerSoft)theEObject;
                T result = caseConsumerSoft(consumerSoft);
                if (result == null) result = caseBasicProgram(consumerSoft);
                if (result == null) result = caseSoftware(consumerSoft);
                if (result == null) result = caseGeldWert(consumerSoft);
                if (result == null) result = caseBeschreibbar(consumerSoft);
                if (result == null) result = caseQuelle(consumerSoft);
                if (result == null) result = caseIdentifiable(consumerSoft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.RIGGER_PROGRAM: {
                RiggerProgram riggerProgram = (RiggerProgram)theEObject;
                T result = caseRiggerProgram(riggerProgram);
                if (result == null) result = caseSoftware(riggerProgram);
                if (result == null) result = caseGeldWert(riggerProgram);
                if (result == null) result = caseBeschreibbar(riggerProgram);
                if (result == null) result = caseQuelle(riggerProgram);
                if (result == null) result = caseIdentifiable(riggerProgram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.MATRIX_DEVICE: {
                MatrixDevice matrixDevice = (MatrixDevice)theEObject;
                T result = caseMatrixDevice(matrixDevice);
                if (result == null) result = caseMatrixAttributes(matrixDevice);
                if (result == null) result = caseMatixConditionMonitor(matrixDevice);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.COMMON_PROGRAM: {
                CommonProgram commonProgram = (CommonProgram)theEObject;
                T result = caseCommonProgram(commonProgram);
                if (result == null) result = caseMatrixProgram(commonProgram);
                if (result == null) result = caseRiggerProgram(commonProgram);
                if (result == null) result = caseSoftware(commonProgram);
                if (result == null) result = caseGeldWert(commonProgram);
                if (result == null) result = caseBeschreibbar(commonProgram);
                if (result == null) result = caseQuelle(commonProgram);
                if (result == null) result = caseIdentifiable(commonProgram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.WEAPON_MOUNT: {
                WeaponMount weaponMount = (WeaponMount)theEObject;
                T result = caseWeaponMount(weaponMount);
                if (result == null) result = caseFahrzeugModifikation(weaponMount);
                if (result == null) result = caseBeschreibbar(weaponMount);
                if (result == null) result = caseQuelle(weaponMount);
                if (result == null) result = caseGeldWert(weaponMount);
                if (result == null) result = caseIdentifiable(weaponMount);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.LIFESTYLE_OPTION: {
                LifestyleOption lifestyleOption = (LifestyleOption)theEObject;
                T result = caseLifestyleOption(lifestyleOption);
                if (result == null) result = caseBeschreibbar(lifestyleOption);
                if (result == null) result = caseQuelle(lifestyleOption);
                if (result == null) result = caseGeldWert(lifestyleOption);
                if (result == null) result = caseIdentifiable(lifestyleOption);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.PERCENT_LIFESTYLE_OPTION: {
                PercentLifestyleOption percentLifestyleOption = (PercentLifestyleOption)theEObject;
                T result = casePercentLifestyleOption(percentLifestyleOption);
                if (result == null) result = caseLifestyleOption(percentLifestyleOption);
                if (result == null) result = caseBeschreibbar(percentLifestyleOption);
                if (result == null) result = caseQuelle(percentLifestyleOption);
                if (result == null) result = caseGeldWert(percentLifestyleOption);
                if (result == null) result = caseIdentifiable(percentLifestyleOption);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5Package.LOCALIZATION: {
                Localization localization = (Localization)theEObject;
                T result = caseLocalization(localization);
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
     * Returns the result of interpreting the object as an instance of '<em>Menge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Menge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMenge(Menge object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Munition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Munition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMunition(Munition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Modifikator Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Modifikator Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModifikatorAttribute(ModifikatorAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gebundener Geist</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gebundener Geist</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGebundenerGeist(GebundenerGeist object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Stufen Persona</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Stufen Persona</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStufenPersona(StufenPersona object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Geist</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Geist</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeist(Geist object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifiable(Identifiable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Credstick Transaction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Credstick Transaction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCredstickTransaction(CredstickTransaction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spezialisierung</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spezialisierung</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSpezialisierung(Spezialisierung object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Matrix Attributes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Matrix Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMatrixAttributes(MatrixAttributes object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Matrix Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Matrix Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMatrixDevice(MatrixDevice object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Common Program</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Common Program</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommonProgram(CommonProgram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Weapon Mount</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Weapon Mount</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWeaponMount(WeaponMount object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lifestyle Option</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lifestyle Option</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLifestyleOption(LifestyleOption object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Percent Lifestyle Option</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Percent Lifestyle Option</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePercentLifestyleOption(PercentLifestyleOption object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Localization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Localization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalization(Localization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Active Matix Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Active Matix Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActiveMatixDevice(ActiveMatixDevice object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Commlink</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Commlink</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommlink(Commlink object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Matix Condition Monitor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Matix Condition Monitor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMatixConditionMonitor(MatixConditionMonitor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cyberdeck</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cyberdeck</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCyberdeck(Cyberdeck object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Software Agent</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Software Agent</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftwareAgent(SoftwareAgent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Host</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Host</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHost(Host object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cyberware Modifikatioren</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cyberware Modifikatioren</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCyberwareModifikatioren(CyberwareModifikatioren object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rigger Command Console</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rigger Command Console</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRiggerCommandConsole(RiggerCommandConsole object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Auto Soft</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Auto Soft</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAutoSoft(AutoSoft object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Software</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Software</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftware(Software object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Matrix Program</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Matrix Program</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMatrixProgram(MatrixProgram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tutorsoft</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tutorsoft</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTutorsoft(Tutorsoft object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Skill Soft</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Skill Soft</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSkillSoft(SkillSoft object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fahrzeug Zustand</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fahrzeug Zustand</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFahrzeugZustand(FahrzeugZustand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Personal Area Network</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Personal Area Network</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePersonalAreaNetwork(PersonalAreaNetwork object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Basic Program</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Basic Program</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasicProgram(BasicProgram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datasoft</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datasoft</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDatasoft(Datasoft object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Matrix Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Matrix Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractMatrixDevice(AbstractMatrixDevice object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Consumer Soft</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Consumer Soft</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConsumerSoft(ConsumerSoft object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rigger Program</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rigger Program</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRiggerProgram(RiggerProgram object) {
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
