package de.urszeidler.shr5.product.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDEActionFactory;

/**
 * @author urs
 */
public class ApplicationHandler extends AbstractHandler {
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

        IWorkbenchAction openWorkspaceAction = IDEActionFactory.OPEN_WORKSPACE.create(window);
        openWorkspaceAction.run();
        return null;
    }

}
