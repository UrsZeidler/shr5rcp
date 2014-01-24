/**
 * 
 */
package de.urszeidler.eclipse.shr5.util;

import java.math.BigDecimal;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Spezies;

/**
 * 
 * Collection of tool methods.
 * 
 * @author urs
 * 
 */
public class ShadowrunTools {

	/**
	 * Creates and initalise a character with the given spezies.
	 * 
	 * @param spezies
	 * @param eclass
	 * @param edge 
	 * @return
	 */
	public static AbstraktPersona createPersona(Spezies spezies, EClass eclass, int edge) {
		EObject p = Shr5Factory.eINSTANCE.create(eclass);

		AbstraktPersona persona = (AbstraktPersona) p;
		persona.setSpezies(spezies);
		persona.setKonstitutionBasis(spezies.getKonstitutionMin());
		persona.setGeschicklichkeitBasis(spezies.getGeschicklichkeitMin());
		persona.setReaktionBasis(spezies.getReaktionMin());
		persona.setStaerkeBasis(spezies.getStaerkeMin());
		
		persona.setCharismaBasis(spezies.getCharismaMin());
		persona.setIntuitionBasis(spezies.getIntuitionMin());
		persona.setLogikBasis(spezies.getLogikMin());
		persona.setWillenskraftBasis(spezies.getWillenskraftMin());
		
		persona.setEdgeBasis(spezies.getEdgeMin());
		//persona.setEdgeBasis(edge);
		
		return persona;
	}

	/**
	 * Returns the geldwert as rounded string.
	 * 
	 * @param list
	 * @return
	 */
	public static String calcListenWertToString(EList<Object> list) {
		BigDecimal summ = calcListenWert(list);
		return summ.longValue() + "";
	}

	/**
	 * Calcs the wert of all {@link GeldWert} in the given list.
	 * 
	 * @param list
	 * @return
	 */
	public static BigDecimal calcListenWert(List<? extends Object> list) {
		BigDecimal summ = new BigDecimal(0);
		for (Object eo : list) {
			if (eo instanceof GeldWert) {
				GeldWert wert = (GeldWert) eo;

				if (wert.getWert() != null)
					summ = summ.add(wert.getWert());
			}
		}
		return summ;
	}
}
