/**
 * 
 */
package de.urszeidler.eclipse.shr5Management.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * @author urs
 */
public class ShadowrunManagmentTools {

    /**
     * Count the number of {@link Erlernbar} spend with Karma.
     * 
     * @param changes the changes of a character
     * @param erlernbar the {@link Erlernbar} type
     * @param type the type of the {@link Erlernbar} to look after
     * @return
     */
    public static int countSpendByKarma(EList<Changes> changes, EClass erlernbar, EClass type) {
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
     * The Karma cost are a negative number.
     */
    public static int getKarmaSpend(ManagedCharacter managedCharacter) {
        int karmaGaint = 0;
        EList<Changes> changes = managedCharacter.getChanges();
        for (Changes change : changes) {
            if (!change.eClass().equals(Shr5managementPackage.Literals.KARMA_GAINT)) {
                if (change.isChangeApplied()) {
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
     * Finds the corresponding rule for a given type.
     * 
     * @param characterAdvancements the list
     * @param eClass
     * @return
     */
    public static IncreaseCharacterPart findAdvancment(EList<Advancement> characterAdvancements, EClass eClass) {
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

        EList<Changes> changes = character.getChanges();

        if (!changes.isEmpty()) {
            ArrayList<Changes> list = new ArrayList<Changes>(changes);
            Collections.sort(list, new Comparator<Changes>() {
                @Override
                public int compare(Changes o1, Changes o2) {
                    if (o1.getDate() == null)
                        return 1;
                    if (o2.getDate() == null)
                        return -1;

                    if (o1.getDate().getTime() < o2.getDate().getTime())
                        return 1;
                    if (o1.getDate().getTime() > o2.getDate().getTime())
                        return -1;

                    return 0;
                }
            });
            return list.get(0).getDate();
        }

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
        int karmaToResource = object.getKarmaToResource() * sr5g.getKarmaToResourceFactor();

        return (object.getResourcen().getResource() + karmaToResource - calcResourceSpend);
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

        return  karmaToResource - calcResourceSpend;
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
}
