package de.urszeidler.shr5.runtime.ui.dialogs;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "de.urszeidler.shr5.runtime.ui.dialogs.messages"; //$NON-NLS-1$
    public static String CheckInitative_message;
    public static String CheckInitative_section;
    public static String CheckInitative_titel;
    public static String DamageProbeFinishedDialog_mental_state;
    public static String DamageProbeFinishedDialog_overdead_state;
    public static String DamageProbeFinishedDialog_physical_state;
    public static String DamageProbeFinishedDialog_titel;
    public static String ProbeDialog_probe_data_section;
    public static String ProbeDialog_skip_probe_section;
    public static String ProbeFinishedDialog_probeFinished_titel;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
