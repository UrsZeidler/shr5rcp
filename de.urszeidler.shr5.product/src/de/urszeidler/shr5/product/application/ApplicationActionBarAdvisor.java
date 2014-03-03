/**
 * 
 */
package de.urszeidler.shr5.product.application;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * @author urs
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

    /**
     * Convinient constructor.
     * 
     * @param configurer the {@link IActionBarConfigurer} to use
     */
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    /** {@inheritDoc} */
    @Override
    protected void makeActions(IWorkbenchWindow window) {
        // nothing todo
    }

    /** {@inheritDoc} */
    @Override
    protected void fillMenuBar(IMenuManager menuBar) {
        // nothing todo
    }

}
