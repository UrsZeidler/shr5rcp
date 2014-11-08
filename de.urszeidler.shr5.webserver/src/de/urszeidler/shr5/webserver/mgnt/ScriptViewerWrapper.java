/**
 * 
 */
package de.urszeidler.shr5.webserver.mgnt;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.CommandWrapper;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.SemanticAction;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.shr5.ecp.service.ScriptViewer;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.webserver.Activator;

/**
 * @author urs
 */
public class ScriptViewerWrapper implements ScriptViewer {
    public final class PlayerManager2RuntimeCharacterTransformer implements Function<PlayerManager, RuntimeCharacter> {
        @Override
        public RuntimeCharacter apply(PlayerManager input) {
            return input.getCharacter();
        }
    }

    private ScriptViewer sv;
    private List<PlayerManager> registeredPlayers = new ArrayList<PlayerManager>();
    private List<HttpSession> sessionList = new ArrayList<HttpSession>();

    public ScriptViewerWrapper(ScriptViewer sv) {
        super();
        this.sv = sv;
    }

    /*
     * (non-Javadoc)
     * @see de.urszeidler.shr5.ecp.service.ScriptViewer#setPlacement(de.urszeidler.shr5.scripting.Placement)
     */
    @Override
    public void setPlacement(Placement placement) {
        sv.setPlacement(placement);

    }

    /*
     * (non-Javadoc)
     * @see de.urszeidler.shr5.ecp.service.ScriptViewer#setScript(de.urszeidler.shr5.scripting.Script)
     */
    @Override
    public void setScript(Script script) {
        sv.setScript(script);

    }

    @Override
    public void sendMessage(RuntimeCharacter character, String message) {
        PlayerManager playerManager = getPlayerManager(character);
        if (playerManager != null) {
            playerManager.createDialog("Message", message);
        }
    }

    /*
     * (non-Javadoc)
     * @see de.urszeidler.shr5.ecp.service.ScriptViewer#getCmdCallback()
     */
    @Override
    public CommandCallback getCmdCallback() {
        CommandCallback commandCallback = new CommandCallback() {

            @Override
            public void prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {
                if (cmd instanceof CommandWrapper || cmd instanceof SimpleAction || cmd instanceof SemanticAction)
                    return;

                if (cmd instanceof CombatTurn) {
                    CombatTurn ct = (CombatTurn)cmd;

                    EList<Command> subCommands = ct.getSubCommands();
                    List<PlayerManager> pml = new ArrayList<PlayerManager>();
                    for (Command command : subCommands) {
                        PlayerManager playerManager = getPlayerManager(command);
                        if (playerManager != null) {
                            List<EStructuralFeature> eAllStructuralFeatures_1 = new ArrayList<EStructuralFeature>();
                            eAllStructuralFeatures_1.add(GameplayPackage.Literals.INITATIVE__INI);
                            eAllStructuralFeatures_1.add(GameplayPackage.Literals.INITATIVE__SIZE_INITATIVE);

                            createDialog(command, playerManager, eAllStructuralFeatures_1);
                            pml.add(playerManager);
                        }
                    }
                    waitForPlayers(pml.toArray(new PlayerManager[]{}));
                    sv.getCmdCallback().prepareCommand(cmd, eStructuralFeatures);
                    return;
                }

                PlayerManager playerManager = getPlayerManager(cmd);
                if (playerManager != null) {
                    if (cmd.equals(playerManager.getIgnoreCommand())) {
                        playerManager.setCommandToIgnore(null);
                    } else
                        createDefaultDialog(cmd, playerManager, eStructuralFeatures);
                } else
                    sv.getCmdCallback().prepareCommand(cmd, eStructuralFeatures);

            }

            @Override
            public void beforeSubcommands(Command cmd, EStructuralFeature... eStructuralFeatures) {
                sv.getCmdCallback().beforeSubcommands(cmd, eStructuralFeatures);

            }

            @Override
            public void beforeExecute(Command cmd, EStructuralFeature... eStructuralFeatures) {
                PlayerManager playerManager = getPlayerManager(cmd);
                if (playerManager != null) {
                    if (cmd.equals(playerManager.getIgnoreCommand())) {
                        playerManager.setCommandToIgnore(null);
                    } else
                        createDefaultDialog(cmd, playerManager, eStructuralFeatures);
                } else
                    sv.getCmdCallback().beforeExecute(cmd, eStructuralFeatures);

            }

            @Override
            public void afterCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {
                sv.getCmdCallback().afterCommand(cmd, eStructuralFeatures);

            }
        };
        return commandCallback;
    }

    public List<PlayerManager> getRegisteredPlayers() {
        return registeredPlayers;
    }

    /**
     * @param cmd
     * @return
     */
    protected PlayerManager getPlayerManager(Command cmd) {
        if (cmd instanceof SubjectCommand) {
            SubjectCommand sc = (SubjectCommand)cmd;
            RuntimeCharacter subject = sc.getSubject();
            return getPlayerManager(subject);
        }
        return null;
    }

    /**
     * @param subject
     * @return
     */
    private PlayerManager getPlayerManager(RuntimeCharacter subject) {
        for (PlayerManager pm : registeredPlayers) {
            if (pm.getCharacter() == subject)
                return pm;
        }
        return null;
    }

    /**
     * Creates the player dialogs and wait for the end of the player dialog.
     * 
     * @param cmd
     * @param playerManager
     * @param eStructuralFeatures
     */
    private void createDefaultDialog(Command cmd, final PlayerManager playerManager, EStructuralFeature... eStructuralFeatures) {
        sv.getCmdCallback().prepareCommand(cmd, eStructuralFeatures);
        if (cmd.isHidden())
            return;

        List<EStructuralFeature> eAllStructuralFeatures_1 = new ArrayList<EStructuralFeature>();
        if (cmd instanceof Probe) {
            eAllStructuralFeatures_1.add(GameplayPackage.Literals.PROBE__SKIP_TEST);
            eAllStructuralFeatures_1.add(GameplayPackage.Literals.PROBE__SUCCESSES);
            eAllStructuralFeatures_1.add(GameplayPackage.Literals.PROBE__GLITCHES);
            if (playerManager.getCharacter().canUseEdge()) {
                eAllStructuralFeatures_1.add(GameplayPackage.Literals.PROBE__PUSH_THE_LIMIT);
                eAllStructuralFeatures_1.add(GameplayPackage.Literals.PROBE__SECOND_CHANCE);
            }
        } else if (cmd instanceof SemanticAction) {
            eAllStructuralFeatures_1.add(GameplayPackage.Literals.SEMANTIC_ACTION__MESSAGE);
        }

        createDialog(cmd, playerManager, eAllStructuralFeatures_1);
        waitForPlayers(playerManager);

    }

    /**
     * @param playerManager
     */
    private void waitForPlayers(final PlayerManager... playerManager) {
        try {
            IRunnableWithProgress op = new IRunnableWithProgress() {
                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

                    Joiner on = Joiner.on(',');
                    String allNames = on.join(Collections2.transform(
                            Collections2.transform(Arrays.asList(playerManager), new PlayerManager2RuntimeCharacterTransformer()),
                            ShadowrunEditingTools.eObject2StringTransformer()));
                    monitor.setTaskName("Waiting for the players : " + allNames);

                    while (!monitor.isCanceled()) {
                        Thread.sleep(300);
                        boolean allFinished = true;
                        for (PlayerManager playerManager2 : playerManager) {
                            allFinished = allFinished && playerManager2.getCurrentDialog() == null;
                        }
                        if (allFinished)
                            return;
                    }
                    return;
                }
            };
            new ProgressMonitorDialog(Display.getCurrent().getActiveShell()).run(true, true, op);
        } catch (InvocationTargetException e) {
            Activator.logError(e);
        } catch (InterruptedException e) {
            Activator.logError(e);
        }
    }

    /**
     * Creates the player dialogs and wait for the end of the player dialog.
     * 
     * @param cmd
     * @param playerManager
     * @param eAllStructuralFeatures_1
     */
    private void createDialog(Command cmd, final PlayerManager playerManager, List<EStructuralFeature> eAllStructuralFeatures_1) {
        playerManager.createDialog(cmd, eAllStructuralFeatures_1.toArray(new EStructuralFeature[]{}));
        // new MessageBox(Display.getCurrent().getActiveShell()).open();
    }

    public ScriptViewer getSv() {
        return sv;
    }

    public PlayerManager2RuntimeCharacterTransformer createPlayerManager2RuntimeCharacterTransformer() {
        return new PlayerManager2RuntimeCharacterTransformer();
    }

    public void removePlayer(PlayerManager pm){
        HttpSession sessions = getSessions(pm);
        if(sessions!=null)
            sessionList.remove(sessions);
        
        registeredPlayers.remove(pm);
    }
    
    public void addSession(HttpSession session) {
        sessionList.add(session);

    }
    public void removeSession(HttpSession session) {
        sessionList.remove(session);

    }

    public HttpSession getSessions(PlayerManager pm) {
        for (HttpSession session : sessionList) {
            Object attribute = session.getAttribute("playerManager");
            if (attribute != null)
                if (attribute.equals(pm))
                    return session;

        }
        return null;
    }
}
