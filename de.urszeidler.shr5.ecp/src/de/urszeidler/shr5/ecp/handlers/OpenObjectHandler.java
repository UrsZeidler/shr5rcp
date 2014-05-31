/**
 * 
 */
package de.urszeidler.shr5.ecp.handlers;

import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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
public class OpenObjectHandler extends AbstractHandler{

    /*
     * (non-Javadoc)
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        String parameter = event.getParameter("de.urszeidler.shr5.ecp.commands.openObjectCommand.parameter.type"); //$NON-NLS-1$
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        Shell shell = window.getShell();
        try {
            int parseInt = Integer.parseInt(parameter);

            switch (parseInt) {
                case 1:
                    openGenerator(shell,Messages.OpenObjectHandler_open_Generator_titel,Messages.OpenObjectHandler_open_Generator_message);
                    break;
                case 2:
                    openCharacter(shell,Messages.OpenObjectHandler_open_character_titel,Messages.OpenObjectHandler_open_character_message);
                    break;

                default:
                    break;
            }

        } catch (Exception e) {
            Activator.logError(e);
        }
        return null;
    }

    private void openCharacter(Shell shell,String titel, String message) {
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
        openOneObject(shell, filteredObject,titel,message);
    }

    private void openGenerator(Shell shell, String titel, String message) {
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
        openOneObject(shell, filteredObject, titel,  message);
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

        OwnChooseDialog dialog = new OwnChooseDialog(shell, filteredObject.toArray(new Object[]{}), titel,
                message);
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
