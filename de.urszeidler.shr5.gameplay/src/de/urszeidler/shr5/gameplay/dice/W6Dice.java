/**
 * 
 */
package de.urszeidler.shr5.gameplay.dice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author urs
 */
public class W6Dice {

    public static final int BASE_SHR5_MW = 5;
    private Random rnd = new Random();

    public Shr5ProbeResult shr5ProbeFromString(String probeStr) {
        Collection<Integer> probe = probeFromString(probeStr);
        return new Shr5ProbeResult(probe);
    }

    /**
     * Split the string with ":" and creates a list of integers.
     * 
     * @param probeStr
     * @return
     */
    public static Collection<Integer> probeFromString(String probeStr) {
        String[] split = probeStr.split(":");
        ArrayList<Integer> arrayList = new ArrayList<Integer>(split.length);
        for (int i = 0; i < split.length; i++) {
            String string = split[i];
            try {
                arrayList.add(Integer.parseInt(string));
            } catch (NumberFormatException e) {
            }
        }
        return arrayList;
    }
    
    /**
     * Creates a readable string for {@link #probeFromString(String)}.
     * @param probe
     * @return
     */
    public static String probeToString(Collection<Integer> probe) {
        StringBuilder builder = new StringBuilder();
        for (Iterator<Integer> iterator = probe.iterator(); iterator.hasNext();) {
            Integer integer = iterator.next();
            builder.append(Integer.toString(integer));
            if (iterator.hasNext())
                builder.append(":");
        }
        return builder.toString();
    }

    /**
     * contains the probe and the succes list
     * 
     * @author urs
     */
    public class SimpleProbeResult {
        private final Collection<Integer> propbe;
        private final Collection<Integer> successes;
        private int mw;

        SimpleProbeResult(Collection<Integer> propbe, Collection<Integer> successes, int mw) {
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

        public Collection<Integer> getPropbe() {
            return propbe;
        }

        public Collection<Integer> getSuccesses() {
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
     * Calc the glitches in a probe.
     * 
     * @param probe
     * @return
     */
    public static int calcGlitchDice(Collection<Integer> probe) {
        int patzer = 0;
        for (Integer integer : probe) {
            if (integer < 2)
                patzer++;
        }
        return patzer;
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
    public static Collection<Integer> probe(int mw, Collection<Integer> probe) {
        ArrayList<Integer> erfolge = new ArrayList<Integer>();
        for (Integer integer : probe) {
            if (integer >= mw && integer >= 1)
                erfolge.add(integer);
        }

        return erfolge;
    }

    /**
     * returns successes against mw for a probe
     * 
     * @param mw
     * @param probe
     * @return list of successes
     */
    public static int probeSucsessesShr5(Collection<Integer> probe) {
        return probeSucsesses(BASE_SHR5_MW, probe);
    }
    
    /**
     * returns count successes  against mw for a probe
     * 
     * @param mw
     * @param probe
     * @return list of successes
     */
    public static int probeSucsesses(int mw, Collection<Integer> probe) {
        int erfolge = 0;
        for (Integer integer : probe) {
            if (integer >= mw && integer >= 1)
                erfolge++;
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

    public int[] probe_(int stufe) {
        int[] ret = new int[stufe];
        for (int i = 0; i < stufe; i++) {
            ret[i] = rollW6();
        }
        return ret;
    }

    /**
     * rolls one open W6 dice
     * 
     * @return
     */
    protected int rollW6Open() {
        int val = rnd.nextInt(6) + 1;
        if (val == 6)
            val = val + rollW6();
        return val;
    }
    /**
     * rolls one open W6 dice
     * 
     * @return
     */
    private int rollW6() {
        return rnd.nextInt(6) + 1;
    }
}
