/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;

/**
 * @author urs
 */
public interface ScriptService {

    void setScript(Script script);

    Script getCurrentScript();

    Placement getPlacement();

    /**
     * A placement change.
     * 
     * @param placement
     */
    void setPlacement(Placement placement);

    /**
     * A combat turn has started.
     * 
     * @param kr
     */
    void setCombatTurn(CombatTurn kr);

    /**
     * Let the commandstack execute the given command.
     * 
     * @param command
     */
    void executeCommand(Command command);

    /**
     * Send a message to the impersonated player if there is one.
     * 
     * @param character
     * @param message
     */
    void sendMessage(RuntimeCharacter character, String message);

    void registerScriptViewer(ScriptViewer viewer);

    void registerCombatViewer(CombatViewer viewer);

    ScriptViewer getScriptViewer();
}
