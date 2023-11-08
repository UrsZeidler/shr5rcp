/**
 * 
 */
package de.urszeidler.emf.commons.ui.util.converter;

import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;

import de.urszeidler.emf.commons.ui.util.NullObject;

public final class ReferenceToStringConverter extends Converter {
	private final ILabelProvider labelProvider;

	public ReferenceToStringConverter(ILabelProvider labelProvider) {
		super(EObject.class, String.class);
		this.labelProvider = labelProvider;
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject instanceof EObject) {
			return labelProvider.getText(fromObject);

		} else if (fromObject instanceof NullObject) {
			return null;

		}
		return null;
	}
}