/**
 * 
 */
package de.urszeidler.shr5.gameplay.calc;

/**
 * @author urs
 *
 */
public class BasicCalculator {
	/**
	 * @author urs
	 *
	 */
	public static class SchandeSteigerung {

		private final int niveau;

		public SchandeSteigerung(int niveau) {
			this.niveau = niveau;
		}

		public int getNiveau() {
			if(niveau>4)
				return 4;
			
			return niveau;
		}
		public int addPowerN(){
			int ap =niveau-4;
			if(ap>0)
				return ap;
			
			return 0;
		}

	}

	/**
	 * returns the mw modification for a damage
	 * @param schaden
	 * @return
	 */
	public static final int getSchadenMod(int schaden){
		if(schaden==0)
			return 0;
		if(schaden<3)
			return 1;
		if(schaden<6)
			return 2;
		if(schaden<10)
			return 3;

		return -1;
	}

	public static int calcResultingPowerNiveu(int powerN, int ruestungsSchutz) {
		int pn = powerN - ruestungsSchutz;
		if(pn<2)
			return 2;
		
		return pn;		
	}
	/**
	 * returns the damage value for a damage niveau
	 * @param niveau
	 * @return
	 */
	public static int getSchadenForNiveau(int niveau) {
		switch (niveau) {
		case 1:
			return 1;
		case 2:
			return 3;
		case 3:
			return 6;
		case 4:
			return 10;

		default:
			break;
		}
		return 0;
	}

	public static SchandeSteigerung calceffectiveSchadensNiveau(int schadenNiveau, int steigerung) {
		int niveau = schadenNiveau + steigerung;
		return new SchandeSteigerung(niveau);
		
	}

	public static String getSchadenSign(int schaden) {
		switch (schaden) {
		case 1:
			return "L";
		case 2:
			return "M";
		case 3:
			return "S";
		case 4:
			return "T";

		default:
			break;
		}
		return "T";
		
	}
}
