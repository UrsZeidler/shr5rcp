package de.urszeidler.shr5.webserver.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.urszeidler.shr5.webserver.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.START_SERVER_AT_SCRIPT_START, true);
		store.setDefault(PreferenceConstants.SERVER_PORT, 8089);
		store.setDefault(PreferenceConstants.HISTORY_LINES,
				2000);
	}

}
