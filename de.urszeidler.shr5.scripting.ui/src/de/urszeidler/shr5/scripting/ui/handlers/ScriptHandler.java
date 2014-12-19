package de.urszeidler.shr5.scripting.ui.handlers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;

import com.google.common.collect.Collections2;

import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert.DialogType;
import de.urszeidler.shr5.ecp.handlers.Messages;
import de.urszeidler.shr5.ecp.handlers.OpenObjectHandler;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.webserver.Activator;
import de.urszeidler.shr5.webserver.mgnt.ServerStatusDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ScriptHandler extends AbstractHandler {
	private ScriptService scriptService;

    /**
	 * The constructor.
	 */
	public ScriptHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
	       final String parameter = event.getParameter("de.urszeidler.shr5.webserver.webserver"); //$NON-NLS-1$
	       

	        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
	        final Shell shell = window.getShell();
	        scriptService = (ScriptService)window.getService(ScriptService.class);

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
	        }else if (parameter.equals("combat")) {
	            
	        }else if (parameter.equals("openScript")) {
                openScript(shell, Messages.OpenObjectHandler_openScrip_titel, Messages.OpenObjectHandler_openScrip_message, false);
          
            }else if (parameter.equals("playScript")) {
                openScript(shell, Messages.OpenObjectHandler_playScript_titel, Messages.OpenObjectHandler_playScript_message, true);

            }
	        return null;
	}
	

    private void openScript(Shell shell, String titel, String message/*, IProgressMonitor monitor*/, boolean start) {
        EditingDomain editingDomain = de.urszeidler.shr5.ecp.Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof Script) {
                    return true;
                }
                return false;
            }
        });
//        monitor.done();

        OwnChooseDialog dialog = new OwnChooseDialog(shell, filteredObject.toArray(new Object[]{}), titel, message);
        dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0) {
                Script eo = (Script)result[0];
                if (start)
                    startScript(eo, shell);
                else
                    OpenObjectHandler.openOneObject(shell,Collections.singleton((EObject)eo), titel, message);

            }
        }
    }

    protected void startScript(Script eo, Shell shell) {

        Placement placement = eo.getEntry();
        if (eo.getHistory() == null) {
            initalizeScript(eo, shell);
        } else {
            if (MessageDialog.open(MessageDialog.QUESTION, shell, Messages.OpenObjectHandler_playScript_titel, Messages.OpenObjectHandler_playScript_continue, SWT.NONE))
                placement = eo.getHistory().getCurrentPlacement();
            else {
                eo.getPlayer().getMembers().clear();
                initalizeScript(eo, shell);
            }
        }
        try {
            PlatformUI.getWorkbench().showPerspective(OpenObjectHandler.RUNTIME_PERSPECTIVE, PlatformUI.getWorkbench().getActiveWorkbenchWindow());
        } catch (WorkbenchException e) {
            Activator.logError(e);
        }

        scriptService.setScript(eo);
        scriptService.setPlacement(placement);
    }

    protected void initalizeScript(Script eo, Shell shell) {
        eo.setHistory(ScriptingFactory.eINSTANCE.createScriptHistory());

        if (eo.getHistory().getCommandStack() == null) {
            eo.getHistory().setCommandStack(GameplayFactory.eINSTANCE.createExecutionStack());
            eo.getHistory().getCommandStack().setProtocol(GameplayFactory.eINSTANCE.createExecutionProtocol());
        }
        fillPayerGoup(eo, shell);
    }

    @SuppressWarnings("unchecked")
    protected void fillPayerGoup(Script eo, Shell shell) {
        Collection<? extends EObject> choiceOfValues = ItemPropertyDescriptor.getReachableObjectsOfType(eo,
                Shr5managementPackage.Literals.PLAYER_CHARACTER);
        eo.getPlayer().getMembers().clear();
        FeatureEditorDialogWert dialog = new FeatureEditorDialogWert(shell, AdapterFactoryUtil.getInstance().getLabelProvider(), eo.getPlayer(),
                RuntimePackage.Literals.TEAM__MEMBERS, Messages.OpenObjectHandler_select_combatans, new ArrayList<EObject>(Collections2.filter(
                        (Collection<ManagedCharacter>)choiceOfValues,
                        ShadowrunManagmentTools.characterGeneratorStatePredicate(GeneratorState.COMMITED))),eo,DialogType.simple);

        int result = dialog.open();
        if (result == Window.OK) {
            EList<?> list = dialog.getResult();
            Team player = eo.getPlayer();
            if (player == null)
                player = RuntimeFactory.eINSTANCE.createTeam();

            player.getMembers().addAll(
                    Collections2.transform((Collection<ManagedCharacter>)list, ShadowrunEditingTools.managedCharacter2RuntimeFunction()));
        }
    }

}
