/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.preference.IPreferenceStore;

import de.urszeidler.eclipse.shr5.provider.Shr5EditPlugin;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.util.ExtendedShr5managementItemProviderAdapterFactory;

/**
 * This is the central singleton for the Shr5Management edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Shr5ManagementEditPlugin extends EMFPlugin {
	/**
     * Keep track of the singleton.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final Shr5ManagementEditPlugin INSTANCE = new Shr5ManagementEditPlugin();

	/**
     * Keep track of the singleton.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static Implementation plugin;
    protected static IPreferenceStore shr5Store;

	/**
     * Create the instance.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5ManagementEditPlugin() {
        super
          (new ResourceLocator [] {
             Shr5EditPlugin.INSTANCE,
           });
    }

	/**
     * Returns the singleton instance of the Eclipse plugin.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the singleton instance.
     * @generated
     */
	@Override
	public ResourceLocator getPluginResourceLocator() {
        return plugin;
    }

	/**
     * Returns the singleton instance of the Eclipse plugin.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the singleton instance.
     * @generated
     */
	public static Implementation getPlugin() {
        return plugin;
    }

	/**
     * The actual implementation of the Eclipse <b>Plugin</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated not
     */
	public static class Implementation extends EclipsePlugin {

        /**
         * Creates an instance.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated not
         */
		public Implementation() {
            super();

            // Remember the static instance.
            //
            plugin = this;
            AdapterFactoryUtil.getInstance().insertAdapterFactory(new ExtendedShr5managementItemProviderAdapterFactory());
//            shr5Store = Shr5EditPlugin.getPlugin().getPreferenceStore();// .getEclipsePreferences().get("localization", "de1");

        }
	}

}
