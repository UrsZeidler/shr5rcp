/**
 * 
 */
package de.urszeidler.shr5.webserver;

import java.util.Hashtable;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.equinox.http.jetty.JettyConfigurator;
import org.eclipse.equinox.http.jetty.JettyConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.urszeidler.shr5.ecp.preferences.Sr5MainPreferences;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.ecp.service.ScriptViewer;
import de.urszeidler.shr5.webserver.mgnt.ScriptViewerWrapper;
import de.urszeidler.shr5.webserver.preferences.PreferenceConstants;

/**
 * @author urs
 */
public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.urszeidler.shr5.webserver"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

    private IPreferenceStore store;

    private ScriptService scriptService;

    private ScriptViewerWrapper scriptViewerWrapper;

    /**
     * The constructor
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        store = getPreferenceStore();

        // startJetty();
    }

    /**
     * @throws Exception
     */
    public void startJetty() throws Exception {
        Hashtable<String, Object> dictionary = new Hashtable<String, Object>();
        int http_port = store.getInt(PreferenceConstants.SERVER_PORT);
        dictionary.put(JettyConstants.HTTP_ENABLED, Boolean.TRUE);
        dictionary.put(JettyConstants.HTTP_PORT, http_port);

        try {
            JettyConfigurator.startServer(PLUGIN_ID + ".server", dictionary);
        } catch (RuntimeException e) {
            logError("Error starting jetty server", e);
        }
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        stopJetty();
        plugin = null;
        super.stop(context);
    }

    /**
     * @throws Exception
     */
    public void stopJetty() {
        try {
            JettyConfigurator.stopServer(PLUGIN_ID + ".server");
        } catch (RuntimeException e) {
            logError("Error stopping jetty server", e);
        } catch (Exception e) {
            logError("Error stopping jetty server", e);
        }
    }

    public static void logError(String message, Exception e) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), message, e));
    }

    public static void logError(String message) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), message));
    }

    public static void logError(Exception e) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), e.getMessage(), e));
    }

    public static void logInfo(String message) {
        plugin.getLog().log(new Status(IStatus.INFO, plugin.getBundle().getSymbolicName(), message));
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    public void setScriptService(ScriptService scriptService) {
        this.scriptService = scriptService;
        ScriptViewer scriptViewer = this.scriptService.getScriptViewer();
        scriptViewerWrapper = new ScriptViewerWrapper(scriptViewer);
        scriptService.registerScriptViewer(scriptViewerWrapper);
    }

    public ScriptService getScriptService() {
        return scriptService;
    }

    public ScriptViewerWrapper getScriptViewerWrapper() {
        return scriptViewerWrapper;
    }

    /**
     * Cleans the script wrapper and restore the the old one.
     */
    public void cleanScriptWrapper() {
        if (scriptViewerWrapper != null) {
            ScriptViewer sv = scriptViewerWrapper.getSv();
            scriptService.registerScriptViewer(sv);
            scriptViewerWrapper = null;
        }
    }

    public IPreferenceStore getStore() {
        return store;
    }
}
