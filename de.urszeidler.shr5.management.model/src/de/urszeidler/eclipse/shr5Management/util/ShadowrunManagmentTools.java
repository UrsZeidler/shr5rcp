/**
 * 
 */
package de.urszeidler.eclipse.shr5Management.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5System;

/**
 * @author urs
 */
public class ShadowrunManagmentTools {

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
}
