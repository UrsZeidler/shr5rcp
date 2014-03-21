package de.urszeidler.shr5.dice;

import java.util.Random;

/**
 * This is the ini dice,rolling the initative for a character.
 * 
 * @author urs
 */
public class IniDice {
    private Random rnd = new Random();

    public int ini(int baseIni, int iniDice) {
        return baseIni + roleSimpleW6(iniDice);
    }

    /**
     * Rolls simple w6
     * 
     * @return
     */
    private int roleSimpleW6(int iniDice) {
        int val = 0;
        for (int i = 0; i < iniDice; i++) {
            val += rnd.nextInt(6) + 1;
        }
        return val;
    }
}
