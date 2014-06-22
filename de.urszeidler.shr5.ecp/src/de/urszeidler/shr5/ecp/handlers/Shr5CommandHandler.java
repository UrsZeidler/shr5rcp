package de.urszeidler.shr5.ecp.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.NewWizardAction;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class Shr5CommandHandler extends AbstractHandler {
    /**
     * The constructor.
     */
    public Shr5CommandHandler() {
    }

    /**
     * the command has been executed, so extract extract the needed information
     * from the application context.
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        NewWizardAction newWizardAction = new NewWizardAction(window);
        newWizardAction.setCategoryId("de.urszeidler.shr5.ecp.character");
        newWizardAction.setWizardWindowTitle("Select generator object to create ...");

        newWizardAction.run();
        return null;
    }
}
