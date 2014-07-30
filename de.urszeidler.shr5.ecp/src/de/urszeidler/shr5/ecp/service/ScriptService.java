/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

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
}
