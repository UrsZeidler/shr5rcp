/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;

/**
 * @author urs
 *
 */
public interface ScriptViewer {

    void setPlacement(Placement placement);

    void setScript(Script script);

    CommandCallback getCmdCallback();
    
    /**
     * Send a message to the impersonated player if there is one.
     * 
     * @param character
     * @param message
     */
    void sendMessage(RuntimeCharacter character, String message);


}
