/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * Open the character of a runtime character.
 * 
 * @author urs
 */
public class OpenCharacterByRuntimeEditorAction extends Action implements IAction {
    private RuntimeCharacter theObject;

    public OpenCharacterByRuntimeEditorAction(RuntimeCharacter object) {
        this.theObject = object;
        setToolTipText("open character");
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/open-character.png"));
    }

    @Override
    public void run() {
        ShadowrunEditingTools.openEObject(theObject.getCharacter());
    }

}
