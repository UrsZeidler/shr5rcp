package de.urszeidler.shr5.gameplay.dice;

import java.util.Collection;

/**
 * The basic shr test has a limit.
 * 
 * @author urs
 */
public class Shr5TestResult extends Shr5ProbeResult {

    protected final int limit;

    public Shr5TestResult(Collection<Integer> probe, int limit) {
        super(probe);
        this.limit = limit;
    }

    /**
     * The number of successes is limited by the given limit.
     */
    @Override
    public int getSuccess() {
        return Math.min(super.getSuccess(), limit);
    }

}