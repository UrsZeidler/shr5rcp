/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import java.util.Date;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.services.IServiceLocator;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingPackage;

/**
 * @author urs
 */
public class ScriptServiceImpl implements ScriptService {

    private Adapter adapter = new EContentAdapter() {

        public void notifyChanged(Notification notification) {
            super.notifyChanged(notification);
            notification.getFeature();
            if (GameplayPackage.Literals.COMMAND__EXECUTED.equals(notification.getFeature())) {
                System.out.println(GameplayTools.printCommand((Command)notification.getNotifier()));
            }
        }
    };
    private Script script;
    private Placement placement;
    private IServiceLocator locator;
    private ScriptViewer scriptViewer;
    private CombatViewer combatViewer;

    public ScriptServiceImpl(IServiceLocator locator) {
        this.locator = locator;
    }

    @Override
    public Script getCurrentScript() {
        return script;
    }

    @Override
    public void setScript(Script script) {
        // if(this.script!=null)
        // this.script.eAdapters().remove(adapter);

        this.script = script;
        if (scriptViewer != null)
            scriptViewer.setScript(script);

        // this.script.eAdapters().add(adapter);

    }

    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
        if (script != null) {
            ECPProject defaultEcpProject = Activator.getDefault().getDefaultEcpProject();
            EditingDomain editingDomain = defaultEcpProject.getEditingDomain();
            org.eclipse.emf.common.command.Command createCommand = editingDomain.createCommand(SetCommand.class, new CommandParameter(script.getHistory(),
                    ScriptingPackage.Literals.SCRIPT_HISTORY__CURRENT_PLACEMENT, placement));
            editingDomain.getCommandStack().execute(createCommand);
            //script.getHistory().setCurrentPlacement(placement);
        }
        if (scriptViewer != null)
            scriptViewer.setPlacement(placement);
    }

    @Override
    public void registerScriptViewer(ScriptViewer viewer) {
        this.scriptViewer = viewer;
    }

    @Override
    public void registerCombatViewer(CombatViewer viewer) {
        this.combatViewer = viewer;
    }

    @Override
    public void setCombatTurn(CombatTurn kr) {
        if(script.getHistory().getCommandStack().getCurrentCommand() instanceof CombatTurn){
            CombatTurn ct = (CombatTurn)script.getHistory().getCommandStack().getCurrentCommand();
            kr.setSequence(ct.getSequence()+1);
        }else
            kr.setSequence(1);
           
            
        executeCommand(kr);
        
        if (combatViewer != null)
            combatViewer.setCombatTurn(kr);
    }

    @Override
    public void executeCommand(Command command) {
        if (script != null && script.getHistory() != null && script.getHistory().getCommandStack() != null) {
            if (placement != null) {
                Date actualDate = placement.getActualDate();
                if (actualDate != null && command.getDate() == null) {
                    command.setDate(actualDate);
                    script.getHistory().setCurrentDate(actualDate);
                }
            }
            if (scriptViewer != null && scriptViewer.getCmdCallback() != null)
                command.setCmdCallback(scriptViewer.getCmdCallback());

            script.getHistory().getCommandStack().setCurrentCommand(command);
            script.getHistory().getCommandStack().redo();

        }
    }
}
