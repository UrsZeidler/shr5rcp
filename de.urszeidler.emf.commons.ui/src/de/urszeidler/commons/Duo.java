/**
 * 
 */
package de.urszeidler.commons;

/**
 * @author urs
 * 
 */
public class Duo<A, B> {

	public Duo(A objectA, B objectB) {
		super();
		this.objectA = objectA;
		this.objectB = objectB;
	}

	private final A objectA;
	private final B objectB;

	public A getObjectA() {
		return objectA;
	}

	public B getObjectB() {
		return objectB;
	}

}
