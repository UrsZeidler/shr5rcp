/**
 * 
 */
package de.urszeidler.emf.commons.ui.util.converter;

import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.emf.ecore.EObject;

import de.urszeidler.emf.commons.ui.util.NullObject;

public final class ReferenceConverter extends Converter {
	public ReferenceConverter() {
		super(EObject.class, EObject.class);
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject instanceof EObject) {
			return fromObject;

		} else if (fromObject instanceof NullObject) {
			return null;

		}
		return null;
	}
}