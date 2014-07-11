/**
 * 
 */
package de.urszeidler.shr5.ecp.handlers;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * @author urs
 */
public class OpenObjectHandler extends AbstractHandler {

    /*
     * (non-Javadoc)
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final String parameter = event.getParameter("de.urszeidler.shr5.ecp.commands.openObjectCommand.parameter.type"); //$NON-NLS-1$

        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        final Shell shell = window.getShell();
        IRunnableWithProgress runnable = new IRunnableWithProgress() {
            @Override
            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                 executeAction(parameter, shell, monitor);
            }
        };
        try {
            window.run(false, false, runnable);
        } catch (InvocationTargetException e) {
            Activator.logError(e);
        } catch (InterruptedException e) {
            Activator.logError(e);
        }
        return null;
    }

    /**
     * The worker method.
     * 
     * @param parameter
     * @param shell
     * @param monitor
     */
    private void executeAction(String parameter, Shell shell, IProgressMonitor monitor) {
        try {
            int parseInt = Integer.parseInt(parameter);

            switch (parseInt) {
                case 1:
                    openGenerator(shell, Messages.OpenObjectHandler_open_Generator_titel, Messages.OpenObjectHandler_open_Generator_message, monitor);
                    break;
                case 2:
                    openCharacter(shell, Messages.OpenObjectHandler_open_character_titel, Messages.OpenObjectHandler_open_character_message, monitor);
                    break;
                case 3:
                    openBeschreibbar(shell, Messages.OpenObjectHandler_open_any_titel, Messages.OpenObjectHandler_open_any_message, monitor);
                    break;
                case 4:
                    openItem(shell, Messages.OpenObjectHandler_open_item_titel, Messages.OpenObjectHandler_open_item_message, monitor);
                    break;

                default:
                    break;
            }

        } catch (Exception e) {
            Activator.logError(e);
        }
    }

    private void openItem(Shell shell, String titel, String message, IProgressMonitor monitor) {
        monitor.beginTask("collection items ...", 1);
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof AbstraktGegenstand) {
                    return true;
                }
                return false;
            }
        });
        monitor.done();
        openOneObject(shell, filteredObject, titel, message);
    }
    
    private void openBeschreibbar(Shell shell, String titel, String message, IProgressMonitor monitor) {
        monitor.beginTask("collection Objects ...", 1);
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof Beschreibbar) {
                    return true;
                }
                return false;
            }
        });
        monitor.done();
        openOneObject(shell, filteredObject, titel, message);
    }

    private void openCharacter(Shell shell, String titel, String message, IProgressMonitor monitor) {
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof ManagedCharacter) {
                    return true;
                }
                return false;
            }
        });
        monitor.done();
        openOneObject(shell, filteredObject, titel, message);
    }

    private void openGenerator(Shell shell, String titel, String message, IProgressMonitor monitor) {
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof CharacterGenerator) {
                    CharacterGenerator cg = (CharacterGenerator)input;
                    if (cg.getState() != GeneratorState.COMMITED)
                        return true;
                }
                return false;
            }
        });
        monitor.done();
        openOneObject(shell, filteredObject, titel, message);
    }

    /**
     * Open one object of in the list. If selected.
     * 
     * @param shell
     * @param filteredObject
     * @param titel
     * @param message
     */
    private void openOneObject(Shell shell, Collection<EObject> filteredObject, String titel, String message) {
        if (filteredObject.size() == 1) {
            EObject eo = filteredObject.iterator().next();
            ShadowrunEditingTools.openEObject(eo);
            return;
        }

        OwnChooseDialog dialog = new OwnChooseDialog(shell, filteredObject.toArray(new Object[]{}), titel, message);
        dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0) {
                EObject eo = (EObject)result[0];
                ShadowrunEditingTools.openEObject(eo);
                return;
            }
        }
        return;
    }

}
