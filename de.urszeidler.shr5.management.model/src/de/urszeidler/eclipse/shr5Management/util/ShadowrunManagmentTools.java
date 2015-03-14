/**
 * 
 */
package de.urszeidler.eclipse.shr5Management.util;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Steigerbar;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem;
import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.DiaryEntry;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.LifeModule;
import de.urszeidler.eclipse.shr5Management.LifeModuleType;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * @author urs
 */
public class ShadowrunManagmentTools {

    /**
     * @param managedCharacter
     * @return
     */
    public static int calcPowerPointsSpend(ManagedCharacter managedCharacter) {
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona == null)
            return 0;
        
        int sum = 0;
        if (persona instanceof KiAdept) {
            KiAdept ka = (KiAdept)persona;
            EList<KiKraft> kikraft = ka.getKikraft();
            for (KiKraft kraft : kikraft) {
                sum = sum + kraft.getKraftpunkte();
            }            
        }
        return sum;
    }

    
    /**
     * Finds the first credstick in the list.
     * 
     * @param eList
     * @return
     */
    public static Credstick findFirstCedstick(List<AbstraktGegenstand> eList) {
        EClass eClass = Shr5Package.Literals.CREDSTICK;
        return (Credstick)getFirstItemOfType(eList, eClass);
    }

    private static EObject getFirstItemOfType(List<? extends EObject> eList, EClass eClass) {
        for (EObject abstraktGegenstand : eList) {
            if (eClass.equals(abstraktGegenstand.eClass()))
                return abstraktGegenstand;
        }
        return null;
    }

    /**
     * Checks if the character has a matrix initiative.
     * 
     * @param character
     * @return
     */
    public static String getMatrixInitative(ManagedCharacter character) {
        return getMatrixInitativeValue(character) + "";

    }

    /**
     * Checks if the character has a matrix initiative.
     * 
     * @param character
     * @return
     */
    public static int getMatrixInitativeValue(ManagedCharacter character) {
        if (character == null || character.getPersona() == null)
            return -1;

        if (character.getPersona() instanceof Technomancer) {
            Technomancer t = (Technomancer)character.getPersona();
            return (t.getDatenverarbeitung() + t.getIntuition());
        } else {
            EList<AbstraktGegenstand> inventar = character.getInventar();
            for (AbstraktGegenstand abstraktGegenstand : inventar) {
                if (abstraktGegenstand instanceof Cyberdeck) {
                    return ((Cyberdeck)abstraktGegenstand).getDatenverarbeitung() + character.getPersona().getIntuition();
                }
            }
        }
        return -1;
    }

    /**
     * Checks if the character has a matrix initiative.
     * 
     * @param character
     * @return
     */
    public static boolean hasMatrixInitative(ManagedCharacter character) {
        if (character == null || character.getPersona() == null)
            return false;

        if (character.getPersona() instanceof Technomancer) {
            return true;
        } else {
            EList<AbstraktGegenstand> inventar = character.getInventar();
            for (AbstraktGegenstand abstraktGegenstand : inventar) {
                if (abstraktGegenstand instanceof Cyberdeck) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the character has a matrix initiative.
     * 
     * @param character
     * @return
     */
    public static boolean hasControllRig(ManagedCharacter character) {
        if (character == null || character.getPersona() == null)
            return false;

        int modWert = character.getPersona().getModManager().getmodWert(Shr5Package.Literals.CYBERWARE_MODIFIKATIOREN__CONTROL_RIG);
        return modWert > 0;
    }

    /**
     * Count the number of {@link Erlernbar} spend with Karma.
     * 
     * @param changes the changes of a character
     * @param erlernbar the {@link Erlernbar} type
     * @param type the type of the {@link Erlernbar} to look after
     * @return
     */
    public static int countSpendByKarma(List<Changes> changes, EClass erlernbar, EClass type) {
        int counter = 0;
        for (Changes change : changes) {
            if (change.isChangeApplied())
                if (change instanceof PersonaChange) {
                    PersonaChange pv = (PersonaChange)change;
                    if (erlernbar.equals(pv.getChangeable().eClass())) {
                        PersonaFertigkeit pfg = (PersonaFertigkeit)pv.getChangeable();
                        if (type.equals(pfg.getFertigkeit().eClass()))
                            counter++;

                    }
                }
        }
        return counter;
    }

    /**
     * Calculates the spend karma by advacements. The Karma cost are a negative number.
     */
    public static int getKarmaSpend(ManagedCharacter managedCharacter) {
        int karmaGaint = 0;
        EList<Changes> changes = managedCharacter.getChanges();
        for (Changes change : changes) {
            if (!change.eClass().equals(Shr5managementPackage.Literals.KARMA_GAINT)) {
                if (change.isChangeApplied()) {
                    if (managedCharacter.getGeneratorSrc() != null) {
                        if (managedCharacter.getGeneratorSrc().getState() == GeneratorState.COMMITED && change.getDate() != null)
                            karmaGaint = karmaGaint + change.getKarmaCost();
                    } else
                        karmaGaint = karmaGaint + change.getKarmaCost();
                }
            }
        }
        return karmaGaint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public static int getKarmaGaint(ManagedCharacter managedCharacter) {
        int karmaGaint = 0;
        EList<Changes> changes = managedCharacter.getChanges();
        for (Changes change : changes) {
            if (change.eClass().equals(Shr5managementPackage.Literals.KARMA_GAINT)) {
                if (change instanceof KarmaGaint) {
                    KarmaGaint kg = (KarmaGaint)change;
                    if (kg.isChangeApplied())
                        karmaGaint = karmaGaint + kg.getKarma();
                }
            }
        }
        return karmaGaint;
    }

    /**
     * Calcs the connection point used.
     * 
     * @param managedCharacter
     * @return
     */
    public static int calcQuallityKarmaCost(List<PersonaEigenschaft> eigenschaften) {
        int karmaKosten = 0;
        for (PersonaEigenschaft personaEigenschaft : eigenschaften) {
            karmaKosten = karmaKosten + personaEigenschaft.getKarmaKosten();
        }
        return karmaKosten;
    }

    /**
     * Calcs the resources for a managed character.
     * 
     * @param context
     * @return
     */
    public static BigDecimal calcResourcesSpend(ManagedCharacter context) {
        BigDecimal wert = ShadowrunTools.calcListenWert(context.getInventar());
        if (context.getPersona() instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)context.getPersona();
            wert = wert.add(ShadowrunTools.calcListenWert(kp.getKoerperMods()));
        }

        wert = wert.add(ShadowrunTools.calcListenWert(context.getContracts()));
        wert = wert.add(ShadowrunTools.calcListenWert(context.getVehicels()));
        return wert;
    }

    /**
     * Calcs the connection point used.
     * 
     * @param managedCharacter
     * @return
     */
    public static int calcConnectionsSpend(ManagedCharacter managedCharacter) {
        int pointsSpend = 0;
        EList<Connection> connections = managedCharacter.getConnections();
        for (Connection connection : connections) {
            pointsSpend = pointsSpend + connection.getInfluence() + connection.getLoyality();
        }
        return pointsSpend;
    }

    /**
     * Calcs the connections points for the sh5 system.
     * 
     * @param character
     * @param shr5Generator
     * @return
     */
    public static int calcConnectionsPoints(ManagedCharacter character, Shr5System shr5Generator) {
        if (character == null || character.getPersona() == null || shr5Generator == null)
            return 0;
        int connP = character.getPersona().getCharisma() * shr5Generator.getCharismaToConnectionFactor();
        return connP;
    }

    /**
     * Calcs the connections points for the sh5 system.
     * 
     * @param character
     * @param shr5Generator
     * @return
     */
    public static boolean hasEigenschaft(ManagedCharacter character, PersonaEigenschaft eigenschaft) {
        if (character == null || character.getPersona() == null)
            return false;

        if (character.getPersona() instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)character.getPersona();
            EList<PersonaEigenschaft> eigenschaften = kp.getEigenschaften();
            return eigenschaften.contains(eigenschaft);

        }
        return false;
    }

    /**
     * Finds the persona change for the given {@link Steigerbar}.
     * 
     * @param character
     * @param attribute
     * @return
     */
    public static AttributeChange findCharacterAdvacements(ManagedCharacter character, EAttribute attribute) {
        if (character == null || attribute == null)
            return null;

        EList<Changes> changes = character.getChanges();
        for (Changes change : changes) {
            if (change instanceof AttributeChange) {
                AttributeChange pc = (AttributeChange)change;
                if (attribute.equals(pc.getAttibute()))
                    return pc;
            }
        }
        return null;
    }

    /**
     * Finds the persona change for the given {@link Steigerbar}.
     * 
     * @param character
     * @param steigerbar
     * @return
     */
    public static PersonaChange findCharacterAdvacements(ManagedCharacter character, Steigerbar steigerbar) {
        if (character == null || steigerbar == null)
            return null;

        EList<Changes> changes = character.getChanges();
        for (Changes change : changes) {
            if (change instanceof PersonaChange) {
                PersonaChange pc = (PersonaChange)change;
                if (steigerbar.equals(pc.getChangeable()))
                    return pc;
            }
        }
        return null;
    }

    /**
     * Finds the persona change for the given {@link Steigerbar}.
     * 
     * @param character
     * @param steigerbar
     * @return
     */
    public static PersonaChange findCharacterAdvacements(ManagedCharacter character, Erlernbar steigerbar) {
        if (character == null || steigerbar == null)
            return null;

        EList<Changes> changes = character.getChanges();
        for (Changes change : changes) {
            if (change instanceof PersonaChange) {
                PersonaChange pc = (PersonaChange)change;
                if (steigerbar.equals(pc.getChangeable()))
                    return pc;
            }
        }
        return null;
    }

    /**
     * Finds the corresponding rule for a given type.
     * 
     * @param characterAdvancements the list
     * @param eClass
     * @return
     */
    public static IncreaseCharacterPart findAdvancment(List<Advancement> characterAdvancements, EClass eClass) {
        for (Advancement advancement : characterAdvancements) {
            if (advancement instanceof IncreaseCharacterPart) {
                IncreaseCharacterPart icp = (IncreaseCharacterPart)advancement;
                if (icp.getType().equals(eClass))
                    return icp;
            }
        }
        return null;
    }

    /**
     * Get the best date match.
     * 
     * @param character
     * @return
     */
    public static Date findCorrenspondingDate(ManagedCharacter character) {
        if (character == null)
            return new Date(System.currentTimeMillis());

        Comparator<Date> comparator = new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                if (o1 == null)
                    return 1;
                if (o2 == null)
                    return -1;

                return o2.compareTo(o1);
            }
        };

        Date date = null;
        if (character instanceof PlayerCharacter) {
            PlayerCharacter pc = (PlayerCharacter)character;
            CharacterDiary diary = pc.getDiary();
            date = diary.getCharacterDate();

            if (!diary.getEntries().isEmpty()) {
                List<Date> sortedList = FluentIterable.from(diary.getEntries()).transform(new Function<DiaryEntry, Date>() {
                    @Override
                    public Date apply(DiaryEntry input) {
                        return input.getDate();
                    }
                }).filter(Predicates.notNull()).toSortedList(comparator);
                if (!sortedList.isEmpty()) {
                    Date date2 = sortedList.get(0);
                    if (date == null)
                        date = date2;
                    else
                        date = date2.before(date) ? date : date2;
                }
            }
        }
        EList<Changes> changes = character.getChanges();
        if (!changes.isEmpty()) {
            List<Date> sortedList = FluentIterable.from(changes).transform(new Function<Changes, Date>() {
                @Override
                public Date apply(Changes input) {
                    return input.getDate();
                }
            }).filter(Predicates.notNull()).toSortedList(comparator);

            if (!sortedList.isEmpty()) {
                Date date2 = sortedList.get(0);

                if (date == null)
                    date = date2;
                else
                    date = date2.before(date) ? date : date2;
            }
        }
        if (date != null)
            return date;

        try {
            SourceBook srcBook = character.getChracterSource().getGenerator().getSrcBook();
            return srcBook.getStartShrTime();
        } catch (Exception e) {
        }
        return new Date(System.currentTimeMillis());
    }

    /**
     * Calcs the karma left for a generator.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaLeft(Shr5Generator object) {
        return object.getShr5Generator().getKarmaPoints() - object.getKarmaSpend();
    }

    /**
     * Calc the complete Karma cost for a character.
     * 
     * @param character
     * @param advacmentSystem
     * @return
     */
    public static int calcCompleteKaramaSpend(ManagedCharacter character, CharacterAdvancementSystem advacmentSystem) {
        int spendBySkills = calcKarmaSpendBySkills(character, advacmentSystem);
        int spendBySkillGroups = calcKarmaSpendBySkillGroups(character, advacmentSystem);
        int spendBySecalism = calcKarmaSpendBySpecalism(character, advacmentSystem);
        int spendByQuallities = calcKarmaSpendByQuallities(character, advacmentSystem);
        int spendByAttributes = calcKarmaSpendByAttributes(character, advacmentSystem);

        int spendByConnections = calcKarmaSpendByConnections(character);
        int spendByResources = calcKarmaSpendByResources(character);
        int spendBySpellsOrForms = calcKarmaSpendBySpellsOrForms(character, advacmentSystem);
        return spendBySpellsOrForms + spendByQuallities + spendBySecalism + spendBySkillGroups + spendBySkills + spendByAttributes
                + spendByConnections + spendByResources;
    }

    /**
     * Calcs the karma used for the spells or forms. Return 0 if not an apply able .
     * 
     * @param object
     * @return
     */
    public static int calcKarmaSpendBySpellsOrForms(ManagedCharacter character, CharacterAdvancementSystem advacmentSystem) {
        AbstraktPersona persona = character.getPersona();
        if (persona == null || advacmentSystem == null)
            return 0;

        if (persona instanceof Zauberer) {
            Zauberer z = (Zauberer)persona;
            EList<PersonaZauber> zauber = z.getZauber();
            IncreaseCharacterPart advancment = findAdvancment(advacmentSystem.getCharacterAdvancements(), Shr5Package.Literals.ZAUBER);
            if (advancment != null)
                return zauber.size() * advancment.getKarmaFactor();
        } else if (persona instanceof Technomancer) {
            Technomancer t = (Technomancer)persona;
            IncreaseCharacterPart advancment = findAdvancment(advacmentSystem.getCharacterAdvancements(), Shr5Package.Literals.KOMPLEXE_FORM);
            if (advancment != null)
                return t.getComplexForms().size() * advancment.getKarmaFactor();

        }
        return 0;
    }

    /**
     * Calcs the karma used for the attributes.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaSpendByResources(ManagedCharacter character) {
        if (character == null || character.getChracterSource() == null)
            return 0;

        if (!Shr5Generator.class.isAssignableFrom(character.getChracterSource().getClass()))
            return 0;

        Shr5Generator generator = (Shr5Generator)character.getChracterSource();
        return calcKarmaSpendByResources(generator);
    }

    /**
     * Calc the karma spend for the given {@link Shr5Generator}.
     * 
     * @param generator
     * @return
     */
    public static int calcKarmaSpendByResources(Shr5Generator generator) {
        if (generator == null || generator.getShr5Generator() == null)
            return 0;

        int karmaToResourceFactor = generator.getShr5Generator().getKarmaToResourceFactor();
        if (karmaToResourceFactor == 0)
            return 0;
        int resource = generator.getResourcen().getResource();
        int karmaToResources = ShadowrunManagmentTools.calcKarmaToResources(generator, generator.getShr5Generator());
        return (resource + karmaToResources) / karmaToResourceFactor;
    }

    /**
     * Calcs the karma used for the attributes.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaSpendByConnections(ManagedCharacter character) {
        if (character == null)
            return 0;

        CharacterGeneratorSystem generator = character.getChracterSource().getGenerator();
        return calcKarmaSpendByConnections(character, generator);
    }

    /**
     * Calcs the karma used for the attributes.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaSpendByConnections(ManagedCharacter character, Shr5System system) {
        if (character == null || system == null)
            return 0;

        return ShadowrunManagmentTools.calcConnectionsSpend(character) * system.getKarmaToConnectionFactor();
    }

    public static int calcKarmaSpendByConnections(ManagedCharacter character, CharacterGeneratorSystem generator) {
        if (Shr5System.class.isAssignableFrom(generator.getClass()))
            return calcKarmaSpendByConnections(character, (Shr5System)generator);

        return 0;
    }

    /**
     * Calcs the karma used for the attributes.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaSpendByAttributes(ManagedCharacter character, CharacterAdvancementSystem advacmentSystem) {
        AbstraktPersona persona = character.getPersona();
        if (persona == null || advacmentSystem == null)
            return 0;

        int sum = 0;
        Spezies spezies = persona.getSpezies();
        if (spezies == null)
            return 0;

        List<EAttribute> attibutes = ShadowrunTools.getOrderedAttibutes(persona);
        for (EAttribute eAttribute : attibutes) {
            EAttribute speciesMin = ShadowrunTools.base2SpeciesMin(eAttribute);
            Integer specMin = (Integer)spezies.eGet(speciesMin);
            Integer personaAttibuteValue = (Integer)persona.eGet(eAttribute);
            IncreaseCharacterPart advancment = findAdvancment(advacmentSystem.getCharacterAdvancements(), eAttribute.eClass());
            if (advancment != null)
                sum = sum + ShadowrunTools.calcKarmaCosts(specMin, personaAttibuteValue, advancment.getKarmaFactor());
        }
        return sum;
    }

    /**
     * Calcs the karma used for the skills.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaSpendByQuallities(ManagedCharacter character, CharacterAdvancementSystem advacmentSystem) {
        AbstraktPersona persona = character.getPersona();
        if (persona == null || advacmentSystem == null)
            return 0;

        int sum = 0;
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            EList<PersonaEigenschaft> eigenschaften = kp.getEigenschaften();
            for (PersonaEigenschaft personaEigenschaft : eigenschaften) {
                IncreaseCharacterPart advancment = findAdvancment(advacmentSystem.getCharacterAdvancements(), personaEigenschaft.eClass());
                if (advancment != null)
                    sum = sum + personaEigenschaft.getKarmaKosten() * advancment.getKarmaFactor();

            }
        }

        return sum;
    }

    /**
     * Calcs the karma used for the skills.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaSpendBySkills(ManagedCharacter character, CharacterAdvancementSystem advacmentSystem) {
        AbstraktPersona persona = character.getPersona();
        if (persona == null || advacmentSystem == null)
            return 0;

        int sum = 0;
        EList<PersonaFertigkeit> fertigkeiten = persona.getFertigkeiten();
        for (PersonaFertigkeit personaFertigkeit : fertigkeiten) {
            IncreaseCharacterPart advancment = findAdvancment(advacmentSystem.getCharacterAdvancements(), personaFertigkeit.getFertigkeit().eClass());
            if (advancment != null)
                sum = sum + ShadowrunTools.calcKarmaCosts(0, personaFertigkeit.getStufe(), advancment.getKarmaFactor());
        }
        return sum;// object.getShr5Generator().getKarmaPoints() - object.getKarmaSpend();
    }

    /**
     * Calcs the karma used for the secalism.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaSpendBySpecalism(ManagedCharacter character, CharacterAdvancementSystem advacmentSystem) {
        AbstraktPersona persona = character.getPersona();
        if (persona == null || advacmentSystem == null)
            return 0;

        int sum = 0;
        EList<PersonaFertigkeit> fertigkeiten = persona.getFertigkeiten();
        for (PersonaFertigkeit personaFertigkeit : fertigkeiten) {
            sum = sum + personaFertigkeit.getSpezialisierungen().size();
        }
        IncreaseCharacterPart advancment = findAdvancment(advacmentSystem.getCharacterAdvancements(), null);
        if (advancment != null)
            return sum * advancment.getKarmaFactor();

        return sum * 7;// object.getShr5Generator().getKarmaPoints() - object.getKarmaSpend();
    }

    /**
     * Calcs the karma used for the skill groups.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaSpendBySkillGroups(ManagedCharacter character, CharacterAdvancementSystem advacmentSystem) {
        AbstraktPersona persona = character.getPersona();
        if (persona == null || advacmentSystem == null)
            return 0;

        int sum = 0;
        EList<PersonaFertigkeitsGruppe> fertigkeiten = persona.getFertigkeitsGruppen();
        for (PersonaFertigkeitsGruppe personaFertigkeit : fertigkeiten) {
            IncreaseCharacterPart advancment = findAdvancment(advacmentSystem.getCharacterAdvancements(), personaFertigkeit.getGruppe().eClass());
            if (advancment != null)
                sum = sum + ShadowrunTools.calcKarmaCosts(0, personaFertigkeit.getStufe(), advancment.getKarmaFactor());
        }
        return sum;// object.getShr5Generator().getKarmaPoints() - object.getKarmaSpend();
    }

    /**
     * Calcs the karma left for a generator.
     * 
     * @param object
     * @return
     */
    public static int calcKarmaLeft(Shr5KarmaGenerator object) {
        return object.getShr5Generator().getKarmaPoints() - object.getKarmaSpend();
    }

    /**
     * Calcs the resources left for a generator.
     * 
     * @param object
     * @return
     */
    public static int calcResourcesLeft(Shr5Generator object) {
        Shr5System sr5g = object.getShr5Generator();
        if (sr5g == null)
            return 0;

        int calcResourceSpend = object.getResourceSpend();
        int karmaToResource = calcKarmaToResources(object, sr5g);

        return (object.getResourcen().getResource() + karmaToResource - calcResourceSpend);
    }

    /**
     * Calcs the resources for the spend karma.
     * 
     * @param object
     * @param sr5g
     * @return
     */
    public static int calcKarmaToResources(Shr5Generator object, Shr5System sr5g) {
        return object.getKarmaToResource() * sr5g.getKarmaToResourceFactor();
    }

    /**
     * Calcs the knowlege skill points for the spend karma.
     * 
     * @param object
     * @param sr5g
     * @return
     */
    public static int calcKnownlegeSkillPoints(ManagedCharacter context, Shr5System sr5g) {
        int intuition = context.getPersona().getIntuition();
        int logik = context.getPersona().getLogik();

        return (intuition + logik) * sr5g.getKnowlegeSkillFactor();
    }

    /**
     * Calcs the resources left for a generator.
     * 
     * @param object
     * @return
     */
    public static int calcResourcesLeft(Shr5KarmaGenerator object) {
        Shr5System sr5g = object.getShr5Generator();
        if (sr5g == null)
            return 0;

        int calcResourceSpend = object.getResourceSpend();
        int karmaToResource = object.getKarmaToResource() * sr5g.getKarmaToResourceFactor();

        return karmaToResource - calcResourceSpend;
    }

    /**
     * Creates a string from a list of beschreibbar.
     * 
     * @param list the attributes
     * @return the localized test
     */
    public static String beschreibarListToString(List<? extends Beschreibbar> list) {
        StringBuffer buffer = new StringBuffer();
        for (Iterator<? extends Beschreibbar> iterator2 = list.iterator(); iterator2.hasNext();) {
            Beschreibbar besch = iterator2.next();
            buffer.append(besch.getName());
            if (iterator2.hasNext())
                buffer.append(",");
        }
        return buffer.toString();
    }

    /**
     * Set the persona fertigkeit to the value by applying a persona change. It clears the persona fertigkeit and the advancement is set to 0.
     * 
     * @param character
     * @param fertigkeit
     * @param value
     */
    public static void changeFertigkeitByAdvacement(ManagedCharacter character, Fertigkeit fertigkeit, Integer value) {
        final AbstraktPersona persona = character.getPersona();

        PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
        if (personaFertigkeit == null) {
            PersonaFertigkeit pf = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
            pf.setFertigkeit(fertigkeit);
            PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
            character.getChanges().add(personaChange);
            personaChange.setChangeable(pf);
            personaChange.setFrom(0);
            personaChange.setTo((Integer)value);
            personaChange.applyChanges();
        } else {
            if ((Integer)value == 0) {
                persona.getFertigkeiten().remove(personaFertigkeit);
                PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(character, personaFertigkeit);
                if (advacements != null)
                    character.getChanges().remove(advacements);
            } else {
                PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(character, personaFertigkeit);
                if (advacements != null) {
                    advacements.setTo((Integer)value);
                    advacements.applyChanges();

                    persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET,
                            Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN, null, null));
                }
            }
        }

    }

    /**
     * Set the persona fertigkeit to the value by applying a persona change. It clears the persona fertigkeit and the advancement is set to 0.
     * 
     * @param character
     * @param fertigkeitsGruppe
     * @param value
     */
    public static void changeAttributeByAdvacement(ManagedCharacter character, EAttribute attribute, Integer value) {
        final AbstraktPersona persona = character.getPersona();
        EAttribute speciesMin = ShadowrunTools.base2SpeciesMin(attribute);

        Spezies spezies = persona.getSpezies();
        if (spezies == null)
            return;

        Integer eGet = (Integer)spezies.eGet(speciesMin);
        if (value < eGet)
            value = eGet;

        AttributeChange attributeChange = ShadowrunManagmentTools.findCharacterAdvacements(character, attribute);
        if (attributeChange == null) {
            if (value == eGet)
                return;
            attributeChange = Shr5managementFactory.eINSTANCE.createAttributeChange();
            attributeChange.setAttibute(attribute);
            character.getChanges().add(attributeChange);
            attributeChange.setFrom((Integer)eGet);
            attributeChange.setTo(value);
            attributeChange.applyChanges();
            persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET, attribute, eGet, value));
        } else if (eGet == value) {
            character.getChanges().remove(attributeChange);
            persona.eSet(attribute, eGet);
        } else {
            attributeChange.setTo((Integer)value);
            attributeChange.applyChanges();
            persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET, attribute, eGet, value));
        }

    }

    /**
     * Set the persona fertigkeit to the value by applying a persona change. It clears the persona fertigkeit and the advancement is set to 0.
     * 
     * @param character
     * @param fertigkeitsGruppe
     * @param value
     */
    public static void changeFertigkeitsGruppeByAdvacement(ManagedCharacter character, FertigkeitsGruppe fertigkeitsGruppe, Integer value) {
        final AbstraktPersona persona = character.getPersona();

        PersonaFertigkeitsGruppe personaFertigkeitsGruppe = ShadowrunTools.findGruppe(fertigkeitsGruppe, persona);
        if (personaFertigkeitsGruppe == null) {
            PersonaFertigkeitsGruppe pf = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
            pf.setGruppe(fertigkeitsGruppe);
            PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
            character.getChanges().add(personaChange);
            personaChange.setChangeable(pf);
            personaChange.setFrom(0);
            personaChange.setTo((Integer)value);
            personaChange.applyChanges();
        } else {
            if ((Integer)value == 0) {
                persona.getFertigkeitsGruppen().remove(personaFertigkeitsGruppe);
                PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(character, personaFertigkeitsGruppe);
                if (advacements != null)
                    character.getChanges().remove(advacements);
            } else {
                PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(character, personaFertigkeitsGruppe);
                if (advacements != null) {
                    advacements.setTo((Integer)value);
                    advacements.applyChanges();

                    persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET,
                            Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN, null, null));
                }
            }
        }

    }

    /**
     * Set the erlernbar or remove it.
     * 
     * @param character
     * @param erlernbar
     */
    public static void changeErlernbarByAdvacement(ManagedCharacter character, Erlernbar erlernbar) {
        PersonaChange advancements = ShadowrunManagmentTools.findCharacterAdvacements(character, erlernbar);
        if (advancements == null) {
            PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
            character.getChanges().add(personaChange);
            personaChange.setChangeable(erlernbar);
            personaChange.applyChanges();
        } else {
            advancements.setTo(0);
            advancements.applyChanges();
            character.getChanges().remove(advancements);
        }

    }

    /**
     * Returns a {@link Predicate} to filter the managed character by its {@link GeneratorState}.
     * 
     * @param state
     * @return
     */
    public static Predicate<ManagedCharacter> characterGeneratorStatePredicate(final GeneratorState state) {
        return new Predicate<ManagedCharacter>() {

            @Override
            public boolean apply(ManagedCharacter input) {
                return input.getChracterSource() != null && input.getChracterSource().getState() == state;
            }
        };
    }


    public static Predicate<? super LifeModule> moduleTypePredicate(final LifeModuleType type) {
        return new Predicate<LifeModule>() {
            @Override
            public boolean apply(LifeModule input) {
                return input.getModuleType() == type;
            }
        };
    }

}
