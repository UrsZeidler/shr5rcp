/**
 * 
 */
package de.urszeidler.shr5.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This is a shadowrun dice, it's an open w6.
 * 
 * @author urs
 */
public class W6Dice {
    private static final int BASE_SHR5_MW = 5;
    private Random rnd = new Random();

    /**
     * contains the probe and the success list
     * 
     * @author urs
     */
    public class SimpleProbeResult {
        private final List<Integer> propbe;
        private final List<Integer> successes;
        private int mw;

        SimpleProbeResult(List<Integer> propbe, List<Integer> successes, int mw) {
            super();
            this.propbe = propbe;
            this.successes = successes;
            this.mw = mw;
        }

        public int getSuccessCount() {
            return successes.size();
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("Erfolge :");
            builder.append(getSuccessCount()).append(" ").append(propbe).append(" ").append(successes);

            return builder.toString();
        }

        public List<Integer> getPropbe() {
            return propbe;
        }

        public List<Integer> getSuccesses() {
            return successes;
        }

        public int getMw() {
            return mw;
        }
    }

    /**
     * Probe against the mw BASE_SHR5_MW.
     * 
     * @param dice
     * @return {@link SimpleProbeResult} containing the probe dices
     */
    public SimpleProbeResult probeShr5(int dice) {
        List<Integer> probe = probe(dice);
        return new SimpleProbeResult(probe, probe(BASE_SHR5_MW, probe), BASE_SHR5_MW);
    }

    /**
     * probe against a mw
     * 
     * @param w
     * @param mw
     * @return list of successes
     */
    public SimpleProbeResult probe(int w, int mw) {
        List<Integer> probe = probe(w);
        return new SimpleProbeResult(probe, probe(mw, probe), mw);
    }

    /**
     * returns successes against mw for a probe
     * 
     * @param mw
     * @param probe
     * @return list of successes
     */
    public List<Integer> probe(int mw, List<Integer> probe) {
        ArrayList<Integer> erfolge = new ArrayList<Integer>();
        for (Integer integer : probe) {
            if (integer >= mw && integer >= 1)
                erfolge.add(integer);
        }

        return erfolge;
    }

    /**
     * rolls w open W6 dice
     * 
     * @param w
     * @return
     */
    public List<Integer> probe(int w) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < w; i++) {
            list.add(rollW6());
        }
        return list;
    }

    /**
     * rolls one open W6 dice
     * 
     * @return
     */
    private int rollW6() {
        int val = rnd.nextInt(6) + 1;
        if (val == 6)
            val = val + rollW6();
        return val;
    }
}
