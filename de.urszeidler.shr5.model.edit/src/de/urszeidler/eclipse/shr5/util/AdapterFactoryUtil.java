/**
 * 
 */
package de.urszeidler.eclipse.shr5.util;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import de.urszeidler.emf.commons.ui.util.AbstractAdapterFactoryUtil;

/**
 * @author urs
 *
 */
public class AdapterFactoryUtil extends AbstractAdapterFactoryUtil {

	


	public static AdapterFactoryUtil getInstance() {
		if (instance == null)
			instance = new AdapterFactoryUtil();

		return (AdapterFactoryUtil) instance;
	}

	
	/* (non-Javadoc)
	 * @see de.urszeidler.emf.commons.ui.util.AbstractAdapterFactoryUtil#createAdapterFactory()
	 */
	@Override
	protected ComposedAdapterFactory createAdapterFactory() {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ExtendedShadowrunAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		return adapterFactory;
	}

}
