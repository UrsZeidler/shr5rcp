/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;

/**
 * @author urs
 */
public interface ScriptService {

    void setScript(Script script);

    Script getCurrentScript();

    Placement getPlacement();

    void setPlacement(Placement placement);
    
    void setCombatTurn(CombatTurn kr);
    
    void executeCommand(Command command);
    
    void registerScriptViewer(ScriptViewer viewer);
    
    void registerCombatViewer(CombatViewer viewer);
}
