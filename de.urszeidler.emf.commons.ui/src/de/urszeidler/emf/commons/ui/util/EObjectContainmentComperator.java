/**
 * 
 */
package de.urszeidler.emf.commons.ui.util;

import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * Compares the oebjects with the position in the container
 * @author urs
 *
 * @param <A>
 */
public class EObjectContainmentComperator<A extends EObject> implements
		Comparator<EObject> {
	@Override
	public int compare(EObject o1,
			EObject o2) {
		if (o1 == null)
			return 0;
		if (o2 == null)
			return 0;

		EObject container = o1.eContainer();
		if (container == null)
			return 0;
		Object object = container.eGet(o1
				.eContainingFeature());
		if (object instanceof List) {
			List<?> l = (List<?>) object;
			int o1pos = l.indexOf(o1);
			int o2pos = l.indexOf(o2);
			return o1pos - o2pos;
		}

		return 0;
	}
}