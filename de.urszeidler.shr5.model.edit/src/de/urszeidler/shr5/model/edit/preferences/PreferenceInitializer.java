package de.urszeidler.shr5.model.edit.preferences;

import java.io.File;
import java.util.Locale;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.urszeidler.eclipse.shr5.provider.Shr5EditPlugin;

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
		IPreferenceStore store = Shr5EditPlugin.getPlugin().getPreferenceStore();
		
        store.setDefault(PreferenceConstants.RESOURCE_LOCALIZAION_ENABLED, true);
        store.setDefault(PreferenceConstants.AUTOMATIC_CHOOSEN_LOCALISATION, true);
        String sep = File.pathSeparator;
        store.setDefault(PreferenceConstants.AVAILABLE_LOCALISATION, "en"+sep+"de");
        
        Locale default1 = Locale.getDefault();
        store.setDefault(PreferenceConstants.CHOOSEN_LOCALISATION,  default1.getLanguage());
        store.setDefault(PreferenceConstants.REDUCE_TREE_COMPLEXITY,  true);
	}

}
