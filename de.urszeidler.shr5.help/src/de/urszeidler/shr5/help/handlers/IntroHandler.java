/**
 * 
 */
package de.urszeidler.shr5.help.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author urs
 *
 */
public class IntroHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        PlatformUI.getWorkbench().getIntroManager().showIntro(window, false);
//        final Shell shell = window.getShell();
//        IRunnableWithProgress runnable = new IRunnableWithProgress() {
//            @Override
//            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
//                executeAction(parameter, shell, monitor);
//            }
//        };
//        try { 
//             window.run(true, true, runnable);
//        } catch (InvocationTargetException e) {
//            Activator.logError(e);
//        } catch (InterruptedException e) {
//            Activator.logError(e);
//        }

        return null;
    }

  

}
