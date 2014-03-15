/**
 * 
 */
package de.urszeidler.shr5.product.application;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * @author urs
 *
 */
public class Application implements IApplication {

    protected static final String PERSPECTIVE_ID = "de.urszeidler.shr5.product.application.ShadowrunPerspective";

    public Object start(IApplicationContext context) throws Exception {
        Display display = PlatformUI.createDisplay();
        try {
            int returnCode = PlatformUI.createAndRunWorkbench(display, new org.eclipse.emf.ecp.application3x.ApplicationWorkbenchAdvisor(){
                /** {@inheritDoc} */
                @Override
                public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
                    return new ApplicationWorkbenchWindowAdvisor(configurer);
                }
                
                /** {@inheritDoc} */
                @Override
                public String getInitialWindowPerspectiveId() {
                    return PERSPECTIVE_ID;
                }

            });
            if (returnCode == PlatformUI.RETURN_RESTART) {
                return IApplication.EXIT_RESTART;
            }
            return IApplication.EXIT_OK;
        } finally {
            display.dispose();
        }

    }

    /** {@inheritDoc} */
    public void stop() {
        if (!PlatformUI.isWorkbenchRunning()) {
            return;
        }
        final IWorkbench workbench = PlatformUI.getWorkbench();
        final Display display = workbench.getDisplay();
        display.syncExec(new Runnable() {
            public void run() {
                if (!display.isDisposed()) {
                    workbench.close();
                }
            }
        });
    }

}
