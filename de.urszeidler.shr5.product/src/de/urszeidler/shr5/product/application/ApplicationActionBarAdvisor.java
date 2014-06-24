/**
 * 
 */
package de.urszeidler.shr5.product.application;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
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
        ICoolBarManager coolBarManager = configurer.getCoolBarManager();
        coolBarManager.getItems();
        configurer.getWindowConfigurer();
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
        MenuManager helpMenu1 = new MenuManager("&File", "project.menu.id");
        menuBar.add(helpMenu1);
        
        MenuManager helpMenu2 = new MenuManager("&Window", "windows.menu.id");
        menuBar.add(helpMenu2);
        
        MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
        helpMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
        helpMenu.add(new Separator());
        menuBar.add(helpMenu);
        
       // menuBar.insertAfter("windows.menu.id", helpMenu);
    }

}
