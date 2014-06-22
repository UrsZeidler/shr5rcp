package de.urszeidler.shr5.ecp.handlers;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "de.urszeidler.shr5.ecp.handlers.messages"; //$NON-NLS-1$
    public static String OpenObjectHandler_open_any_titel;
    public static String OpenObjectHandler_open_character_message;
    public static String OpenObjectHandler_open_character_titel;
    public static String OpenObjectHandler_open_Generator_message;
    public static String OpenObjectHandler_open_Generator_titel;
    public static String OpenObjectHandler_open_any_message;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
