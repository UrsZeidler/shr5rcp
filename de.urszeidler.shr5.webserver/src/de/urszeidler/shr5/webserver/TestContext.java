/**
 * 
 */
package de.urszeidler.shr5.webserver;

import java.io.IOException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.services.ServiceLocator;
import org.eclipse.ui.internal.services.ServiceLocatorCreator;
import org.osgi.framework.Bundle;

import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;

/**
 * @author urs
 *
 */
public class TestContext implements org.osgi.service.http.HttpContext{

    public TestContext() {
        super();
//      scriptService = (ScriptService)WorkbenchPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getService(ScriptService.class);

    }

    private Bundle bundle;
    private ScriptService scriptService;

    public TestContext(Bundle bundle) {
        this.bundle = bundle;
        
//        scriptService = (ScriptService)WorkbenchPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getService(ScriptService.class);
//        scriptService.registerCombatViewer(this);

        
    }

    public boolean handleSecurity(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // default behaviour assumes the container has already performed authentication
        return true;
    }

    public URL getResource(String name) {
        return bundle.getResource(name);
    }

    public String getMimeType(String name) {
        return null;
    }

//    public Script getCurrentScript() {
//        return scriptService.getCurrentScript();
//    }
//
//    public Placement getPlacement() {
//        return scriptService.getPlacement();
//    }

}
