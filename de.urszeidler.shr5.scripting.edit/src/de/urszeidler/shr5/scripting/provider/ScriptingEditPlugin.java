/**
 */
package de.urszeidler.shr5.scripting.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import de.urszeidler.eclipse.shr5.gameplay.provider.GameplayEditPlugin;
import de.urszeidler.eclipse.shr5.provider.Shr5EditPlugin;
import de.urszeidler.eclipse.shr5.runtime.provider.RuntimeEditPlugin;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.provider.Shr5ManagementEditPlugin;

/**
 * This is the central singleton for the Scripting edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ScriptingEditPlugin extends EMFPlugin {
    /**
     * Keep track of the singleton.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final ScriptingEditPlugin INSTANCE = new ScriptingEditPlugin();

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
    public ScriptingEditPlugin() {
        super
          (new ResourceLocator [] {
             GameplayEditPlugin.INSTANCE,
             RuntimeEditPlugin.INSTANCE,
             Shr5EditPlugin.INSTANCE,
             Shr5ManagementEditPlugin.INSTANCE,
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
            AdapterFactoryUtil.getInstance().insertAdapterFactory(new ScriptingItemProviderAdapterFactory());

        }
    }

}
