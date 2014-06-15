package de.urszeidler.shr5.model.edit.preferences;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "de.urszeidler.shr5.model.edit.preferences.messages"; //$NON-NLS-1$
    public static String LocalisationPreferencePage_active_loc;
    public static String LocalisationPreferencePage_auto_localize;
    public static String LocalisationPreferencePage_avail_loc;
    public static String LocalisationPreferencePage_description;
    public static String LocalisationPreferencePage_dlg_new_loc_code;
    public static String LocalisationPreferencePage_localize;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
