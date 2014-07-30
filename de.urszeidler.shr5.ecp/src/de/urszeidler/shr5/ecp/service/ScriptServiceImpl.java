/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import org.eclipse.ui.services.IServiceLocator;

import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;

/**
 * @author urs
 *
 */
public class ScriptServiceImpl implements ScriptService {

    private Script script;
    private Placement placement;
    private IServiceLocator locator;

    public ScriptServiceImpl(IServiceLocator locator) {
        this.locator = locator;
    }

    @Override
    public Script getCurrentScript() {
        return script;
    }
    @Override
    public void setScript(Script script) {
        this.script = script;
    }

    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

}
