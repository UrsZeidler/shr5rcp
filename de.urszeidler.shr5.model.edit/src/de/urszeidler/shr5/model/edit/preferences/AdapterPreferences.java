package de.urszeidler.shr5.model.edit.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.urszeidler.eclipse.shr5.provider.Shr5EditPlugin;

public class AdapterPreferences extends FieldEditorPreferencePage  implements IWorkbenchPreferencePage {

    /**
     * Create the preference page.
     */
    public AdapterPreferences() {
        super(FLAT);
        setPreferenceStore(Shr5EditPlugin.getPlugin().getPreferenceStore());
    }

    /**
     * Create contents of the preference page.
     */
    @Override
    protected void createFieldEditors() {
        // Create the field editors
        addField(new BooleanFieldEditor(PreferenceConstants.REDUCE_TREE_COMPLEXITY, "Reduce tree complexity", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
    }

    /**
     * Initialize the preference page.
     */
    public void init(IWorkbench workbench) {
        // Initialize the preference page
    }

}
