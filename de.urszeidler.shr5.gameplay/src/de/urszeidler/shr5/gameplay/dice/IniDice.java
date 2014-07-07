package de.urszeidler.shr5.gameplay.dice;

import java.util.Random;

public class IniDice {
	private Random rnd = new Random();
	
	public int ini(int baseIni,int iniDice) {		
		return baseIni + roleSimpleW6(iniDice);
	}
	/**
	 * rolls one open W6 dice
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
