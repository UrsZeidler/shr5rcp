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

//        String parameter = event.getParameter("de.urszeidler.shr5.ecp.characterWizard.type");
//        IWizard wizard = null;
//        if ("sr5generator".equals(parameter))
//            wizard = new NewShr5GeneratorWizard();
//        else if ("sr5karmagenerator".equals(parameter))
//            wizard = new NewShr5KarmaGeneratorWizard();
//        else
//            wizard = new NewFreeStyleGeneratorWizard();
//
//        WizardDialog w = new WizardDialog(window.getShell(), wizard);
//        w.open();

        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        NewWizardAction newWizardAction = new NewWizardAction(window);
        newWizardAction.setCategoryId("de.urszeidler.shr5.ecp.character");

        newWizardAction.run();
        //
        // MessageDialog.openInformation(
        // window.getShell(),
        // "shr5 ecp forms",
        // "Hello, Eclipse world");
        return null;
    }
}
