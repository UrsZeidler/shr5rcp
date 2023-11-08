/**
 * 
 */
package de.urszeidler.commons;

/**
 * @author urs
 *
 */
public class Trio<A,B,C> {
	private A objectA;
	private B objectB;
	private C objectC;

	public Trio(A objectA, B objectB, C objectC) {
		super();
		this.objectA = objectA;
		this.objectB = objectB;
		this.objectC = objectC;
	}

	/**
	 * @return the objectA
	 */
	public A getObjectA() {
		return objectA;
	}
	/**
	 * @return the objectB
	 */
	public B getObjectB() {
		return objectB;
	}
	/**
	 * @return the objectC
	 */
	public C getObjectC() {
		return objectC;
	}
	
}
