/**
 * 
 */
package de.urszeidler.shr5.webserver.mgnt;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.webserver.Activator;

/**
 * @author urs
 */
public class WebserverHandler extends AbstractHandler implements IHandler {

    /*
     * (non-Javadoc)
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final String parameter = event.getParameter("de.urszeidler.shr5.webserver.webserver"); //$NON-NLS-1$

        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        final Shell shell = window.getShell();
        ScriptService scriptService = (ScriptService)window.getService(ScriptService.class);

        if (parameter.equals("start")) {
            try {
                if(scriptService.getCurrentScript()==null){
                    MessageBox messageBox = new MessageBox(shell);
                    messageBox.setMessage("No script started.");
                    messageBox.open();
                    return null;
                }
                if(Activator.getDefault().getScriptViewerWrapper()!=null){
                    MessageBox messageBox = new MessageBox(shell);
                    messageBox.setMessage("Script and server started started, try stop first.");
                    messageBox.open();
                    return null;                   
                }
                Activator.getDefault().startJetty();
                Activator.getDefault().setScriptService(scriptService);
            } catch (Exception e) {
                Activator.logError("Could not start jetty", e);
            }
        } else if (parameter.equals("stop")) {
            try {
                Activator.getDefault().cleanScriptWrapper();
                Activator.getDefault().stopJetty();
            } catch (Exception e) {
                Activator.logError("Could not stop jetty", e);
            }
        } else if (parameter.equals("manage")) {
            try {
                ServerStatusDialog serverStatusDialog = new ServerStatusDialog(shell);
                serverStatusDialog.open();
            } catch (Exception e) {
                Activator.logError("Could not stop jetty", e);
            }
        }
        return null;
    }

}
