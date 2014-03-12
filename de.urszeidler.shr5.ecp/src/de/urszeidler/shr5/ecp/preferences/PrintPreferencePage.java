package de.urszeidler.shr5.ecp.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import de.urszeidler.shr5.ecp.Activator;

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

public class PrintPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public PrintPreferencePage() {
		super(GRID);
		setTitle("printing");
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Main printing prefereces");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(new StringFieldEditor(PreferenceConstants.CURRENCY_SYMBOL, "currency symbol", -1, StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
	    addField(new BooleanFieldEditor(PreferenceConstants.PRINT_USEABLE_SKILLS, "print all usable skills", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
	    addField(new FontFieldEditor(PreferenceConstants.FONT_MAIN_HEADER, "header", "This is a titel as example header", getFieldEditorParent()));
	    addField(new FontFieldEditor(PreferenceConstants.FONT_TABLE_HEADER, "table header", "table header", getFieldEditorParent()));
	    addField(new FontFieldEditor(PreferenceConstants.FONT_NORMAL_TEXT, "normal text", "attribute", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}