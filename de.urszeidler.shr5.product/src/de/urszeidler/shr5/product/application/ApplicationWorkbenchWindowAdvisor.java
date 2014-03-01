package de.urszeidler.shr5.product.application;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecp.application3x.ApplicationActionBarAdvisor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * The WorkbenchWindowAdvisor class.
 * 
 * @author urs
 * 
 */
public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    private static final String ECP_WINDOW_TITLE_DEFAULT = "EMF Client Platform"; //$NON-NLS-1$
    private static final String ECP_WINDOW_TITLE = "-ECPWindowTitle"; //$NON-NLS-1$

    /**
     * Convinient constructor.
     * 
     * @param configurer teh {@link IWorkbenchWindowConfigurer} to use
     */
    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    /** {@inheritDoc} */
    @Override
    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }

    /** {@inheritDoc} */
    @Override
    public void preWindowOpen() {
        final IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setInitialSize(new Point(400, 300));
        configurer.setShowCoolBar(false);
        configurer.setShowStatusLine(false);
        configurer.setTitle(getWindowTitle());
    }

    private static String getWindowTitle() {
        for (final String arg : Platform.getApplicationArgs()) {
            if (arg.startsWith(ECP_WINDOW_TITLE) && arg.length() > ECP_WINDOW_TITLE.length()
                && arg.charAt(ECP_WINDOW_TITLE.length()) == '=') {
                return arg.substring(ECP_WINDOW_TITLE.length() + 1, arg.length());
            }
        }
        return ECP_WINDOW_TITLE_DEFAULT;
    }
}
