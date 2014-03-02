/**
 * 
 */
package de.urszeidler.shr5.ecp;

import org.eclipse.emf.ecp.core.exceptions.ECPProjectWithNameExistsException;
import org.eclipse.ui.IStartup;

/**
 * @author urs
 */
public class Shr5Initalizer implements IStartup {

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.IStartup#earlyStartup()
     */
    @Override
    public void earlyStartup() {
        Activator.logInfo("Begin early startup ...");
        Activator.getDefault().createDefaultWorkspace();
        try {
            Activator.getDefault().createECPWorkspace();
        } catch (ECPProjectWithNameExistsException e) {
            Activator.logError("Error while createing default workspace.", e);
        }

    }

}
