/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.services.IServiceLocator;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingPackage;

/**
 * @author urs
 */
public class ScriptServiceImpl implements ScriptService {
    protected static final String COMBAT_PERSPECTIVE = "de.urszeidler.shr5.product.application.CombatPerspective";

    private Lock lock = new ReentrantLock();
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
        this.script = script;
        if (scriptViewer != null)
            scriptViewer.setScript(script);
    }

    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
        if (script != null) {
            ECPProject defaultEcpProject = Activator.getDefault().getDefaultEcpProject();
            EditingDomain editingDomain = defaultEcpProject.getEditingDomain();
            org.eclipse.emf.common.command.Command createCommand = editingDomain.createCommand(SetCommand.class,
                    new CommandParameter(script.getHistory(), ScriptingPackage.Literals.SCRIPT_HISTORY__CURRENT_PLACEMENT, placement));
            editingDomain.getCommandStack().execute(createCommand);
            // script.getHistory().setCurrentPlacement(placement);
        }
        if (scriptViewer != null){
            if (Realm.getDefault() == null) {
                Display.getDefault().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        scriptViewer.setPlacement(ScriptServiceImpl.this.placement);
                    }
                });
            } else         
                scriptViewer.setPlacement(placement);            
        }
    }


    @Override
    public void sendMessage(RuntimeCharacter character, String message) {
        if (scriptViewer != null)
            scriptViewer.sendMessage(character, message);        
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

        if (script.getHistory().getCommandStack().getCurrentCommand() instanceof CombatTurn) {
            CombatTurn ct = (CombatTurn)script.getHistory().getCommandStack().getCurrentCommand();
            kr.setSequence(ct.getSequence() + 1);
        } else
            kr.setSequence(1);

        executeCommand(kr);

        if (combatViewer != null)
            combatViewer.setCombatTurn(kr);
    }

    @Override
    public void executeCommand(final Command command) {
        if (Realm.getDefault() == null) {
            Display.getDefault().asyncExec(new Runnable() {
                @Override
                public void run() {
                    doExecution(command);
                }
            });
        } else
            doExecution(command);
    }

    /**
     * @param command
     */
    private void doExecution(Command command) {
        try {
            lock.lock();
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
        } finally {
            lock.unlock();
        }
    }

    @Override
    public ScriptViewer getScriptViewer() {
        return scriptViewer;
    }
}
