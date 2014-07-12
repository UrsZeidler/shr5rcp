package de.urszeidler.shr5.gameplay.dice;

import java.util.Collection;

/**
 * Holds the basic data of a Shr5Probe.
 * 
 * @author urs
 */
public class Shr5ProbeResult {
    /**
     * @author urs
     */
    public enum ProbeState {
        glitche, criticalGlitche, failure, success,
    }

    private final Collection<Integer> probe;
    private final int success;
    private final int glitchDice;
    protected ProbeState state = ProbeState.success;
    
    // /**
    // * Creates a probe from the string representation.
    // * @param probeString
    // * @return
    // */
    // public static Shr5ProbeResult fromString(String probeString) {
    // Collection<Integer> probe = W6Dice.probeFromString(probeString);
    // return new Shr5ProbeResult(probe);
    // }

    public Shr5ProbeResult(Collection<Integer> probe) {
        super();
        this.probe = probe;
        this.success = W6Dice.probe(W6Dice.BASE_SHR5_MW, probe).size();
        this.glitchDice = W6Dice.calcGlitchDice(probe);
        double half = probe.size() / 2.0;
        if (glitchDice > half) {
            if (success == 0)
                state = ProbeState.criticalGlitche;
            else
                state = ProbeState.glitche;
        } else {
            if (success == 0 )
                state = ProbeState.failure;
        }
    }

    public Collection<Integer> getProbe() {
        return probe;
    }

    public int getSuccess() {
        return success;
    }

    public int getGlitchDice() {
        return glitchDice;
    }

    public ProbeState getState() {
        return state;
    }
}