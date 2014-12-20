package de.urszeidler.shr5.scripting.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "de.urszeidler.shr5.scripting.ui.messages"; //$NON-NLS-1$
    public static String CombatScriptWizard_enemies_name_default;
    public static String CombatScriptWizard_players_name_default;
    public static String CombatScriptWizard_script_default;
    public static String CombatScriptWizardPage_add;
    public static String CombatScriptWizardPage_Container;
    public static String CombatScriptWizardPage_defaultScriptName;
    public static String CombatScriptWizardPage_description;
    public static String CombatScriptWizardPage_enemie_group;
    public static String CombatScriptWizardPage_error1;
    public static String CombatScriptWizardPage_error2;
    public static String CombatScriptWizardPage_error3;
    public static String CombatScriptWizardPage_remove;
    public static String CombatScriptWizardPage_scriptName;
    public static String CombatScriptWizardPage_titel;
    public static String ScriptHandler_no_script_started_dlg;
    public static String ScriptHandler_server_scrip_started_dlg;
    public static String ScriptHandler_server_scriptStarted_status_msg;
    public static String ScriptHandler_serverStopped_status_msg;
    public static String ScriptHandler_startWebserver_dlg_daa;
    public static String ScriptHandler_startWebserver_dlg_msg;
    public static String ScriptHandler_startWebserver_dlg_titel;
    public static String CombatScriptWizardPage_lblDate_text;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
