package de.urszeidler.shr5.webserver.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.urszeidler.shr5.webserver.Activator;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class WebserverPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public WebserverPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences for the webserver and the app.");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
	    {
	        IntegerFieldEditor integerFieldEditor = new IntegerFieldEditor(PreferenceConstants.SERVER_PORT, "Server port", getFieldEditorParent());
	        integerFieldEditor.setValidRange(1024, 65535);
	        integerFieldEditor.setTextLimit(8);
	        addField(integerFieldEditor);
	    }
	    addField(new BooleanFieldEditor(PreferenceConstants.OPEN_APP_URLS_AT_SERVER_START, "Open web app in brower on server start.", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
	    addField(new IntegerFieldEditor(PreferenceConstants.HISTORY_LINES, "History lines", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}