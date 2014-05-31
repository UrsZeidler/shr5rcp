package de.urszeidler.shr5.ecp.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.jface.preference.StringFieldEditor;

public class Sr5MainPreferences extends FieldEditorPreferencePage {

    /**
     * Create the preference page.
     */
    public Sr5MainPreferences() {
        super(FLAT);
        setTitle("Shr5MainPreferences");
    }

    /**
     * Create contents of the preference page.
     */
    @Override
    protected void createFieldEditors() {
        // Create the field editors
        addField(new StringFieldEditor(PreferenceConstants.DEFAUL_PROJECT_NAME, "main project name", -1, StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
    }

    /**
     * Initialize the preference page.
     */
    public void init(IWorkbench workbench) {
        // Initialize the preference page
    }

}
