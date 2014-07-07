/**
 * 
 */
package de.urszeidler.shr5.gameplay.calc;

/**
 * @author urs
 * 
 */
public class KarmaCostCaculator {
	/**
	 * calcs a simple Karma costs.
	 * 
	 * @param from
	 * @param to
	 * @param fac
	 * @return
	 */
	public int calcKarmaCosts(int from, int to, float fac) {
		if (from <= 0 || to <= 0)
			return 0;

		if (from >= to)
			return 0;

		float sum = 0;
		for (int i = from; i < to ; i++) {
			sum += (i + 1) * fac;
		}
		return (int) sum;
	}

	/**
	 * calcs a simple Karma costs.
	 * 
	 */
	public int clacSimpleKarmaCost(int from, int to) {
		return calcKarmaCosts(from, to, 1);
	}
	
	public int clacKarmaForFertigkeit(int from , int to) {
		return calcKarmaCosts(from, to, 2F);
	}
	
}
