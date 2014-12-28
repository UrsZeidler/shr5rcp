package de.urszeidler.shr5.scripting.ui.handlers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.internal.WorkbenchWindow;

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
import de.urszeidler.shr5.scripting.ui.wizards.CombatScriptWizard;
import de.urszeidler.shr5.webserver.Activator;
import de.urszeidler.shr5.webserver.mgnt.ServerStatusDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ScriptHandler extends AbstractHandler {
    private static final String START_WEBSERVER_DEFAULT = "START_WEBSERVER_DEFAULT";//$NON-NLS-1$
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

        if (parameter.equals("start")) {//$NON-NLS-1$
            startWebserver(shell, scriptService);
        } else if (parameter.equals("stop")) {//$NON-NLS-1$
            try {
                Activator.getDefault().cleanScriptWrapper();
                Activator.getDefault().stopJetty();
                setStatusMessage(de.urszeidler.shr5.scripting.ui.Messages.ScriptHandler_serverStopped_status_msg);
            } catch (Exception e) {
                Activator.logError("Could not stop jetty", e);//$NON-NLS-1$
            }
        } else if (parameter.equals("manage")) {//$NON-NLS-1$
            try {
                ServerStatusDialog serverStatusDialog = new ServerStatusDialog(shell);
                serverStatusDialog.open();
            } catch (Exception e) {
                Activator.logError("Could not stop jetty", e);//$NON-NLS-1$
            }
        } else if (parameter.equals("combat")) {//$NON-NLS-1$
            CombatScriptWizard wizard = new CombatScriptWizard();
            wizard.init(window.getWorkbench(), null);
            WizardDialog dialog = new WizardDialog(shell, wizard);
            dialog.create();
            dialog.open();
            return null;
        } else if (parameter.equals("openScript")) {//$NON-NLS-1$
            openScript(shell, Messages.OpenObjectHandler_openScrip_titel, Messages.OpenObjectHandler_openScrip_message, false);

        } else if (parameter.equals("playScript")) {//$NON-NLS-1$
            openScript(shell, Messages.OpenObjectHandler_playScript_titel, Messages.OpenObjectHandler_playScript_message, true);

        }
        return null;
    }

    /**
     * @param shell
     */
    private static void startWebserver(final Shell shell, ScriptService scriptService) {
        try {
            if (scriptService.getCurrentScript() == null) {
                MessageBox messageBox = new MessageBox(shell);
                messageBox.setMessage(de.urszeidler.shr5.scripting.ui.Messages.ScriptHandler_no_script_started_dlg);
                messageBox.open();
                return;
            }
            if (Activator.getDefault().getScriptViewerWrapper() != null) {
                MessageBox messageBox = new MessageBox(shell);
                messageBox.setMessage(de.urszeidler.shr5.scripting.ui.Messages.ScriptHandler_server_scrip_started_dlg);
                messageBox.open();
                return;
            }
            Activator.getDefault().startJetty();
            Activator.getDefault().setScriptService(scriptService);
            setStatusMessage(de.urszeidler.shr5.scripting.ui.Messages.ScriptHandler_server_scriptStarted_status_msg);
        } catch (Exception e) {
            Activator.logError("Could not start jetty", e);//$NON-NLS-1$
        }
    }

    private void openScript(Shell shell, String titel, String message/* , IProgressMonitor monitor */, boolean start) {
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

        OwnChooseDialog dialog = new OwnChooseDialog(shell, filteredObject.toArray(new Object[]{}), titel, message);
        dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0) {
                Script eo = (Script)result[0];
                if (start)
                    startScript(eo, shell, scriptService);
                else
                    OpenObjectHandler.openOneObject(shell, Collections.singleton((EObject)eo), titel, message);

            }
        }
    }

    @SuppressWarnings("restriction")
    public static void setStatusMessage(String msg){
        IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (activeWorkbenchWindow instanceof WorkbenchWindow) {
            WorkbenchWindow w = (WorkbenchWindow)activeWorkbenchWindow;
           w.getStatusLineManager().setMessage(msg); 
        }        
    }
    
    public static void startScript(Script eo, Shell shell, ScriptService scriptService) {
        Placement placement = eo.getEntry();
        if (eo.getHistory() == null || eo.getHistory().getCommandStack() == null) {
           if(!initalizeScript(eo, shell))
               return;
        } else {
            if (MessageDialog.open(MessageDialog.QUESTION, shell, Messages.OpenObjectHandler_playScript_titel,
                    Messages.OpenObjectHandler_playScript_continue, SWT.NONE))
                placement = eo.getHistory().getCurrentPlacement();
            else {
                eo.getPlayer().getMembers().clear();
                if(!initalizeScript(eo, shell))
                    return;
            }
        }
        try {
            PlatformUI.getWorkbench().showPerspective(OpenObjectHandler.RUNTIME_PERSPECTIVE, PlatformUI.getWorkbench().getActiveWorkbenchWindow());
        } catch (WorkbenchException e) {
            Activator.logError(e);
        }

        scriptService.setScript(eo);
        scriptService.setPlacement(placement);

        if (!Activator.getDefault().isStarted()) {
            IPreferenceStore store = de.urszeidler.shr5.scripting.ui.Activator.getDefault().getPreferenceStore();
            String value = store.getString(START_WEBSERVER_DEFAULT);
            if (MessageDialogWithToggle.ALWAYS.equals(value)) {
                startWebserver(shell, scriptService);
                return;
            }
            if (MessageDialogWithToggle.NEVER.equals(value)) {
                return;
            }
            MessageDialogWithToggle open = MessageDialogWithToggle.open(MessageDialogWithToggle.QUESTION_WITH_CANCEL, shell, de.urszeidler.shr5.scripting.ui.Messages.ScriptHandler_startWebserver_dlg_titel,
                    de.urszeidler.shr5.scripting.ui.Messages.ScriptHandler_startWebserver_dlg_msg, de.urszeidler.shr5.scripting.ui.Messages.ScriptHandler_startWebserver_dlg_daa, false, store, START_WEBSERVER_DEFAULT, SWT.NONE);

            if (open.getReturnCode() == 2){
                startWebserver(shell, scriptService);                
            }
        }

    }

    protected static boolean initalizeScript(Script eo, Shell shell) {
        eo.setHistory(ScriptingFactory.eINSTANCE.createScriptHistory());

        if (eo.getHistory().getCommandStack() == null) {
            eo.getHistory().setCommandStack(GameplayFactory.eINSTANCE.createExecutionStack());
            eo.getHistory().getCommandStack().setProtocol(GameplayFactory.eINSTANCE.createExecutionProtocol());
        }

        Collection<? extends EObject> choiceOfValues = ItemPropertyDescriptor.getReachableObjectsOfType(eo,
                Shr5managementPackage.Literals.PLAYER_CHARACTER);
        eo.getPlayer().getMembers().clear();
        FeatureEditorDialogWert dialog = new FeatureEditorDialogWert(shell, AdapterFactoryUtil.getInstance().getLabelProvider(), eo.getPlayer(),
                RuntimePackage.Literals.TEAM__MEMBERS, Messages.OpenObjectHandler_select_combatans, new ArrayList<EObject>(Collections2.filter(
                        (Collection<ManagedCharacter>)choiceOfValues,
                        ShadowrunManagmentTools.characterGeneratorStatePredicate(GeneratorState.COMMITED))), eo, DialogType.simple);

        int result = dialog.open();
        if (result == Window.OK) {
            EList<?> list = dialog.getResult();
            Team player = eo.getPlayer();
            if (player == null)
                player = RuntimeFactory.eINSTANCE.createTeam();

            player.getMembers().addAll(
                    Collections2.transform((Collection<ManagedCharacter>)list, ShadowrunEditingTools.managedCharacter2RuntimeFunction()));
            return true;
        }
        return false;
    }

}
