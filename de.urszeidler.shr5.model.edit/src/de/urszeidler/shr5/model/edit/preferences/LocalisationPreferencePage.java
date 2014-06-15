package de.urszeidler.shr5.model.edit.preferences;

import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.PathEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.urszeidler.eclipse.shr5.provider.Shr5EditPlugin;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the preference store that belongs to the main plug-in class. That way, preferences
 * can be accessed directly via the preference store.
 */

public class LocalisationPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    private ComboFieldEditor choosenLoc;
    private PathEditor availableLoc;

    public LocalisationPreferencePage() {
        super(GRID);
        setPreferenceStore(Shr5EditPlugin.getPlugin().getPreferenceStore());
        setDescription(Messages.LocalisationPreferencePage_description);
    }

    /**
     * Creates the field editors. Field editors are abstractions of
     * the common GUI blocks needed to manipulate various types
     * of preferences. Each field editor knows how to save and
     * restore itself.
     */
    public void createFieldEditors() {
        addField(new BooleanFieldEditor(PreferenceConstants.RESOURCE_LOCALIZAION_ENABLED, Messages.LocalisationPreferencePage_localize, BooleanFieldEditor.DEFAULT,
                getFieldEditorParent()));
        addField(new BooleanFieldEditor(PreferenceConstants.AUTOMATIC_CHOOSEN_LOCALISATION, Messages.LocalisationPreferencePage_auto_localize, BooleanFieldEditor.DEFAULT,
                getFieldEditorParent()) {
            @Override
            protected void valueChanged(boolean oldValue, boolean newValue) {
                super.valueChanged(oldValue, newValue);
                changeAutoLoc(!newValue);
            }

        });

        String locs = getPreferenceStore().getString(PreferenceConstants.AVAILABLE_LOCALISATION);
        String[] parseString = parseString(locs);

        String[][] entryNamesAndValues = new String[parseString.length][parseString.length];
        for (int i = 0; i < parseString.length; i++) {
            String string = parseString[i];
            entryNamesAndValues[i] = new String[]{ string, string };
        }

        choosenLoc = new ComboFieldEditor(PreferenceConstants.CHOOSEN_LOCALISATION, Messages.LocalisationPreferencePage_active_loc, entryNamesAndValues,
                getFieldEditorParent());
        addField(choosenLoc);

        availableLoc = new PathEditor(PreferenceConstants.AVAILABLE_LOCALISATION, Messages.LocalisationPreferencePage_avail_loc, "", //$NON-NLS-2$
                getFieldEditorParent()) {
            @Override
            protected String getNewInputObject() {
                InputDialog inputDialog = new InputDialog(getShell(), Messages.LocalisationPreferencePage_dlg_new_loc_code, null, null, null);

                int open = inputDialog.open();
                if (open == InputDialog.OK) {
                    return inputDialog.getValue().toLowerCase().trim();
                }
                return null;
            }
        };
        addField(availableLoc);
        boolean enabled = !getPreferenceStore().getBoolean(PreferenceConstants.AUTOMATIC_CHOOSEN_LOCALISATION);
        changeAutoLoc(enabled);
    }

    private void changeAutoLoc(boolean enabled) {
        availableLoc.setEnabled(enabled, getFieldEditorParent());
        choosenLoc.setEnabled(enabled, getFieldEditorParent());
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {
    }

    protected String[] parseString(String stringList) {
        StringTokenizer st = new StringTokenizer(stringList, File.pathSeparator + "\n\r");//$NON-NLS-1$
        ArrayList<Object> v = new ArrayList<Object>();
        while (st.hasMoreElements()) {
            v.add(st.nextElement());
        }
        return (String[])v.toArray(new String[v.size()]);
    }
}