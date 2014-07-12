/**
 * 
 */
package de.urszeidler.shr5.gameplay.dice;

import java.util.Collection;

/**
 * Holds a SuccesTest result.
 * 
 * @author urs
 */
public class Shr5SuccesTestResult extends Shr5TestResult {

    private final int netHits;
    private final int thresholds;

    /**
     * Creates the data holder with the data.
     * 
     * @param probe the dices
     * @param limit the limit
     * @param thresholds the thresholds
     */
    public Shr5SuccesTestResult(Collection<Integer> probe, int limit, int thresholds) {
        super(probe, limit);
        this.thresholds = thresholds;

        this.netHits = getSuccess() - thresholds;
        if (netHits < 0)
            state = ProbeState.failure;
    }

    public int getNetHits() {
        return netHits;
    }

    public int getThresholds() {
        return thresholds;
    }

    public int getLimit() {
        return limit;
    }
}
