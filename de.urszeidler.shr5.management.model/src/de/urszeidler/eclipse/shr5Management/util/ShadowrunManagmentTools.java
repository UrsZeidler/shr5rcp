/**
 * 
 */
package de.urszeidler.eclipse.shr5Management.util;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;

/**
 * @author urs
 *
 */
public class ShadowrunManagmentTools {

	/**
	 * Calcs the connection point used.
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

}
