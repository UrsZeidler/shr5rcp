package de.urszeidler.shr5.ecp.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;

import de.urszeidler.shr5.ecp.Activator;

public class Sr5MainPreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage{

    /**
     * Create the preference page.
     */
    public Sr5MainPreferences() {
        super(FLAT);
        setPreferenceStore(Activator.getDefault().getPreferenceStore());
        setTitle("Main Shr5 Project Preferences");
    }

    /**
     * Create contents of the preference page.
     */
    @Override
    protected void createFieldEditors() {
        {
            // Create the field editors
            StringFieldEditor stringFieldEditor = new StringFieldEditor(PreferenceConstants.DEFAUL_PROJECT_NAME, "main project name", -1, StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent());
            stringFieldEditor.setEmptyStringAllowed(false);
            addField(stringFieldEditor);
            stringFieldEditor.setEnabled(false, getFieldEditorParent());
        }
    }

    /**
     * Initialize the preference page.
     */
    public void init(IWorkbench workbench) {
        // Initialize the preference page
    }

}
