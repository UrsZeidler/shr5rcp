/**
 * 
 */
package de.urszeidler.shr5.ecp.handlers;

import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.urszeidler.commons.functors.Predicate;
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
public class OpenObjectHandler extends AbstractHandler implements IHandler {

    /*
     * (non-Javadoc)
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        String parameter = event.getParameter("de.urszeidler.shr5.ecp.commands.openObjectCommand.parameter.type");
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        Shell shell = window.getShell();
        try {
            int parseInt = Integer.parseInt(parameter);

            switch (parseInt) {
                case 1:
                    openGenerator(shell);
                    break;
                case 2:
                    openCharacter(shell);
                    break;

                default:
                    break;
            }

        } catch (Exception e) {
            Activator.logError(e);
        }
        return null;
    }

    private void openCharacter(Shell shell) {
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
        openOneObject(shell, filteredObject);
    }

    private void openGenerator(Shell shell) {
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
        openOneObject(shell, filteredObject);
    }

    /**
     * Open one object of in the list. If selected.
     * 
     * @param shell
     * @param filteredObject
     */
    private void openOneObject(Shell shell, Collection<EObject> filteredObject) {
        if (filteredObject.size() == 1) {
            EObject eo = filteredObject.iterator().next();
            ShadowrunEditingTools.openEObject(eo);
            return;
        }

        OwnChooseDialog dialog = new OwnChooseDialog(shell, filteredObject.toArray(new Object[]{}), "Open generator",
                "Select a generator object to open.");
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
