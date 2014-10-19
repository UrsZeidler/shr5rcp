package de.urszeidler.shr5.webserver.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
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
		setDescription("A demonstration of a preference page implementation");
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
	    addField(new BooleanFieldEditor(PreferenceConstants.START_SERVER_AT_SCRIPT_START, "Start server with script", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
	    addField(new IntegerFieldEditor(PreferenceConstants.HISTORY_LINES, "History lines", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}