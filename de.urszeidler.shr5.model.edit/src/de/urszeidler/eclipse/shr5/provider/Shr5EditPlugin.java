/**
 */
package de.urszeidler.eclipse.shr5.provider;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * This is the central singleton for the Shr5 edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Shr5EditPlugin extends EMFPlugin {
	/**
     * Keep track of the singleton.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final Shr5EditPlugin INSTANCE = new Shr5EditPlugin();

	/**
     * Keep track of the singleton.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static Implementation plugin;

	/**
     * Create the instance.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5EditPlugin() {
        super
          (new ResourceLocator [] {
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
     * @generated
     */
	public static class Implementation extends EclipsePlugin {
		private IEclipsePreferences eclipsePreferences;
        private IPreferenceStore preferenceStore;

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
            AdapterFactoryUtil.getInstance().insertAdapterFactory(new Shr5ItemProviderAdapterFactory());

        }

//        public IEclipsePreferences getEclipsePreferences() {
//            return eclipsePreferences;
//        }
        
        public IPreferenceStore getPreferenceStore() {
            // Create the preference store lazily.
            if (preferenceStore == null) {
                preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE ,getBundle().getSymbolicName());
            }
            return preferenceStore;
        }

	}

}
