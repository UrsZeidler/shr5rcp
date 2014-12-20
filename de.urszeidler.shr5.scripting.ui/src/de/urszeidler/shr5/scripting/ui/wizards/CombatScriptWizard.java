package de.urszeidler.shr5.scripting.ui.wizards;

import java.util.Date;
import java.util.List;

import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.Scripts;
import de.urszeidler.shr5.scripting.ui.Messages;
import de.urszeidler.shr5.scripting.ui.handlers.ScriptHandler;

public class CombatScriptWizard extends Wizard implements INewWizard {
    private CombatScriptWizardPage page;
    private List<EObject> scripts;
    private List<EObject> characters;
    // private List<RuntimeCharacter> runtimeCharacters;

    private WritableValue selectedScriptContainer = new WritableValue();
    private WritableValue selectedScriptName = new WritableValue();
    private WritableValue startDate = new WritableValue();

    private WritableList runtimeCharacters = new WritableList();
    private Shell shell;
    private ScriptService scriptService;

    /**
     * Constructor for CombatScriptWizard.
     */
    public CombatScriptWizard() {
        super();
        setNeedsProgressMonitor(true);
    }

    /**
     * Adding the page to the wizard.
     */

    public void addPages() {
        page = new CombatScriptWizardPage(scripts, characters, selectedScriptContainer, selectedScriptName, startDate, runtimeCharacters);
        addPage(page);
    }

    /**
     * This method is called when 'Finish' button is pressed in
     * the wizard. We will create an operation and run it
     * using wizard as execution context.
     */
    public boolean performFinish() {
        try {
            doFinish();
        } catch (Exception e) {
            Activator.logError("Error creating combat script", e);//$NON-NLS-1$
        }

        return true;
    }

    /**
     * The worker method.
     */
    private void doFinish() throws Exception {
        String sName = (String)selectedScriptName.getValue();

        Scripts sc = (Scripts)selectedScriptContainer.getValue();
        Script script = ScriptingFactory.eINSTANCE.createScript();
        script.setName(sName);
        Placement placement = ScriptingFactory.eINSTANCE.createPlacement();
        placement.setName(sName);
        placement.setActualDate((Date)startDate.getValue());
        
        script.getPlacements().add(placement);
        script.setEntry(placement);
        Team team = RuntimeFactory.eINSTANCE.createTeam();
        team.setName(Messages.CombatScriptWizard_enemies_name_default);
        script.getAllTeams().add(team);
        Team playerTeam = RuntimeFactory.eINSTANCE.createTeam();
        playerTeam.setName(Messages.CombatScriptWizard_players_name_default);
        script.setPlayer(playerTeam);
        placement.getTeams().add(team);
        team.getMembers().addAll(runtimeCharacters);
        sc.getStories().add(script);

        ScriptHandler.startScript(script, shell, scriptService);
        saveSettings();
    }

    private void saveSettings() {
        IDialogSettings settings = getDialogSettings();
        settings.put("scriptName", (String)selectedScriptName.getValue());//$NON-NLS-1$
        Date value = (Date)startDate.getValue();
        if (value != null)
            settings.put("scriptDate", value.getTime());//$NON-NLS-1$
    }

    /**
     * We will accept the selection in the workbench to see if
     * we can initialize from it.
     * 
     * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
     */
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        shell = workbench.getActiveWorkbenchWindow().getShell();
        scriptService = (ScriptService)workbench.getActiveWorkbenchWindow().getService(ScriptService.class);
        setDialogSettings(de.urszeidler.shr5.scripting.ui.Activator.getDefault().getDialogSettings());

        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        scripts = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof Scripts) {
                    return true;
                }
                return false;
            }
        });

        characters = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof ManagedCharacter) {
                    ManagedCharacter input2 = (ManagedCharacter)input;
                    if (input2.getGeneratorSrc() != null)
                        return input2.getGeneratorSrc().getState() == GeneratorState.COMMITED;
                }
                return false;
            }
        });

        selectedScriptContainer.setValue(scripts.get(0));
        selectedScriptName.setValue(Messages.CombatScriptWizard_script_default);
        try {
            IDialogSettings settings = getDialogSettings();
            if (settings != null) {
                String name = settings.get("scriptName");//$NON-NLS-1$
                selectedScriptName.setValue(name);
                String date = settings.get("scriptDate");//$NON-NLS-1$
                Date sDate = new Date(Long.parseLong(date));
                startDate.setValue(sDate);
            }

        } catch (Exception e) {
            startDate.setValue(new Date(3281986800365L));
        }
    }
}