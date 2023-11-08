package de.urszeidler.emf.commons.ui.util;

import java.util.Collection;


/**
 * An object used to replace a null entry in the comboViewer choices tab
 * 
 * Creation 6 avr. 2006
 * 
 * @author jlescot
 */
	public class NullObject {

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		return obj instanceof NullObject;
	}

	/**
	 * Set the objects in which the user can choose.
	 * 
	 * @param objs
	 *            the list of objects
	 */
	public static Object[] toChoises(Object[] objs) {
		if (objs != null && objs.length > 0) {
			// replace any null entry with a NullObject
			Object[] objects2 = new Object[objs.length];
			for (int cpt = 0; cpt < objs.length; cpt++) {
				if (objs[cpt] == null) {
					objects2[cpt] = new NullObject();
				} else {
					objects2[cpt] = objs[cpt];
				}
			}

			return objects2;
		}
		return new Object[] {};
	}
	/**
	 * Set the objects in which the user can choose.
	 * 
	 * @param objs
	 *            the list of objects
	 */
	public static Object[] toChoises(Collection<?> objs) {
		if (objs != null && objs.size() > 0) {
			// replace any null entry with a NullObject
			Object[] objects2 = new Object[objs.size()];
			int cpt = 0;
			for (Object object : objs) {
				if (object == null) {
					objects2[cpt] = new NullObject();
				} else {
					objects2[cpt] =object;
				}
				cpt++;
			}
			return objects2;
		}
		return new Object[] {};
	}

}
