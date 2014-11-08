/**
 * 
 */
package de.urszeidler.shr5.webserver.mgnt;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.collect.Lists;

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.ProbeState;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * Holds the data for a connected player.
 * 
 * @author urs
 */
public class PlayerManager {

    /**
     * Holds a probe dialog info which is a command at a probe phase, the state.
     * 
     * @author urs
     */
    public class ProbeDialog {
        private ProbeState state;
        private Command cmd;
        private List<EStructuralFeature> features;
        private String message;

        public ProbeDialog(Command cmd, EStructuralFeature[] eStructuralFeatures) {
            this.cmd = cmd;
            if (eStructuralFeatures != null)
                this.features = Lists.newArrayList(eStructuralFeatures);
        }

        public ProbeState getState() {
            return state;
        }

        public void setState(ProbeState state) {
            this.state = state;
        }

        public Command getCmd() {
            return cmd;
        }

        public void setCmd(Command cmd) {
            this.cmd = cmd;
        }

        public List<EStructuralFeature> getFeatures() {
            return features;
        }

        public void setFeatures(List<EStructuralFeature> features) {
            this.features = features;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    private RuntimeCharacter character;
    private String characterId;
    private boolean active;
    private ProbeDialog currentDialog;
    private Command ignoreCommand;
    private int historyLinesReaded;
    private int woundState;
    private boolean inCombat;

    public RuntimeCharacter getCharacter() {
        return character;
    }

    public void setCharacter(RuntimeCharacter character) {
        this.character = character;
        characterId = ShadowrunTools.getResourceId(character);
    }

    public ProbeDialog getCurrentDialog() {
        return currentDialog;
    }

    public void setCurrentDialog(ProbeDialog currentDialog) {
        this.currentDialog = currentDialog;
    }

    public void createDialog(Command cmd, EStructuralFeature[] eStructuralFeatures) {
        this.currentDialog = new ProbeDialog(cmd, eStructuralFeatures);

    }

    public void createDialog(String titel, String message) {
        this.currentDialog = new ProbeDialog(null, null);
        this.currentDialog.setMessage(message);
    }

    public void setCommandToIgnore(Command command) {
        ignoreCommand = command;
    }

    public Command getIgnoreCommand() {
        return ignoreCommand;
    }

    public int getHistoryLinesReaded() {
        return historyLinesReaded;
    }

    public void setHistoryLinesReaded(int historyLinesReaded) {
        this.historyLinesReaded = historyLinesReaded;
    }

    public int getWoundState() {
        return woundState;
    }

    public void setWoundState(int woundState) {
        this.woundState = woundState;
    }


    public boolean isInCombat() {
        return inCombat;
    }

    public void setInCombat(boolean inCombat) {
        this.inCombat = inCombat;
    }
}
