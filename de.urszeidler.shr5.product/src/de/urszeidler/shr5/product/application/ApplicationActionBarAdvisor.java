/**
 * 
 */
package de.urszeidler.shr5.product.application;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * @author urs
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

//    private IWorkbenchAction openWorkspaceAction;

    /**
     * Convinient constructor.
     * 
     * @param configurer the {@link IActionBarConfigurer} to use
     */
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
        ICoolBarManager coolBarManager = configurer.getCoolBarManager();
        coolBarManager.getItems();
        configurer.getWindowConfigurer();
    }

    /** {@inheritDoc} */
    @Override
    protected void makeActions(IWorkbenchWindow window) {
        // nothing todo
//        openWorkspaceAction = IDEActionFactory.OPEN_WORKSPACE
//                .create(window);
//        register(openWorkspaceAction);
    }

    /** {@inheritDoc} */
    @Override
    protected void fillMenuBar(IMenuManager menuBar) {
        // nothing todo
//        menuBar.add(openWorkspaceAction);
//         menuBar.insertAfter("project.menu.id", openWorkspaceAction);
    }

}
