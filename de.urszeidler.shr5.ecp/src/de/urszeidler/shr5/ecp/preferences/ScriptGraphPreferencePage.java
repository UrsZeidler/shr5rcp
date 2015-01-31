/**
 * 
 */
package de.urszeidler.shr5.ecp.preferences;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.urszeidler.commons.eclipse.preferences.editor.SeparatorFieldEditor;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.scripting.ScriptingPackage;

/**
 * @author urs
 *
 */
public class ScriptGraphPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    /**
     * @wbp.parser.constructor
     * 
     */
    public ScriptGraphPreferencePage() {
        setTitle("Script graph perferences");
        setPreferenceStore(Activator.getDefault().getPreferenceStore());
    }


    /* (non-Javadoc)
     * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    @Override
    public void init(IWorkbench workbench) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void createFieldEditors() {
        EList<EEnumLiteral> eLiterals = ScriptingPackage.Literals.PLACEMENT_OPTIONS.getELiterals();
        for (EEnumLiteral eEnumLiteral : eLiterals) {
            addField(new ColorFieldEditor(PreferenceConstants.SCRIPT_GRAPH_COLOR_FG+eEnumLiteral.getName(), "fg color for "+eEnumLiteral.getName(), getFieldEditorParent()));
            addField(new ColorFieldEditor(PreferenceConstants.SCRIPT_GRAPH_COLOR_BG+eEnumLiteral.getName(), "bg color for "+eEnumLiteral.getName(), getFieldEditorParent()));
            addField(new SeparatorFieldEditor(getFieldEditorParent()));
        }
        
    }

}
