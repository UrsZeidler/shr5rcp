package de.urszeidler.shr5.ecp.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.urszeidler.shr5.ecp.Activator;

public class Sr5MainPreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

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
            StringFieldEditor stringFieldEditor = new StringFieldEditor(PreferenceConstants.DEFAUL_PROJECT_NAME, "main project name", -1,
                    StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent());
            stringFieldEditor.setEmptyStringAllowed(false);
            addField(stringFieldEditor);
            
            addField(new ComboFieldEditor(PreferenceConstants.SWITCH_CHARACTERBUILDING_PERSPECTIVE, "Switch to the character building perspective.",
                    new String[][]{{"ask always", "prompt"}, {"switch always", "always"}, {"dont switch", "never"}}, getFieldEditorParent()));

            // stringFieldEditor.setEnabled(false, getFieldEditorParent());
        }
        addField(new BooleanFieldEditor(PreferenceConstants.NO_DEFAULT_SKILL_GROUP_BCK_COLOR, "Higlight Skillgroup", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
        addField(new ColorFieldEditor(PreferenceConstants.SKILL_GROUP_BCK_COLOR, "Skillgroup background", getFieldEditorParent()));
        addField(new BooleanFieldEditor(PreferenceConstants.SKILL_GROUP_BOLT, "display the skillgroup bold", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
    }

    /**
     * Initialize the preference page.
     */
    public void init(IWorkbench workbench) {
        // Initialize the preference page
    }

}
