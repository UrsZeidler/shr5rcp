/**
 * 
 */
package de.urszeidler.eclipse.shr5Management.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import de.urszeidler.eclipse.shr5.util.ModifikatorItemProvider;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.provider.Shr5ManagementEditPlugin;
import de.urszeidler.eclipse.shr5Management.provider.Shr5managementItemProviderAdapterFactory;

/**
 * @author urs
 */
public class ExtendedShr5managementItemProviderAdapterFactory extends Shr5managementItemProviderAdapterFactory {

    private ModifikatorItemProvider shr5ManagementAdapter;
    private ModifikatorItemProvider shr5Adapter;

    /**
     * 
    */
    public Adapter createShr5ModifikatorItemProvider() {
        if (shr5Adapter == null) {
            shr5Adapter = new ModifikatorItemProvider(this) ;
        }

        return shr5Adapter;
    }
    
    /**
     * anagement
    */
    public Adapter createSr5ManagementItemProvider() {
        if (shr5ManagementAdapter == null) {
            shr5ManagementAdapter = new ModifikatorItemProvider(this) {
                @Override
                protected ResourceLocator getResourceLocator() {
                    return Shr5ManagementEditPlugin.INSTANCE;
                }

            };
        }

        return shr5ManagementAdapter;
    }

    @Override
    public boolean isFactoryForType(Object object) {
        if (object == EcorePackage.eINSTANCE) {
            return true;
        }

        return super.isFactoryForType(object);
    }

    
    @Override
    public Adapter createAdapter(Notifier target) {
        if (target instanceof EAttribute) {
            if (Shr5managementPackage.eINSTANCE.equals(((EAttribute)target).getEContainingClass().getEPackage()))
                return createSr5ManagementItemProvider();
//            if (((EAttribute)target).getEContainingClass().getEPackage().equals(Shr5Package.eINSTANCE))
                return createShr5ModifikatorItemProvider();
        }
        if (target instanceof EReference) {
            if (Shr5managementPackage.eINSTANCE.equals(((EReference)target).getEContainingClass().getEPackage()))
                return createSr5ManagementItemProvider();
//            if (((EReference)target).getEContainingClass().getEPackage().equals(Shr5Package.eINSTANCE))
                return createShr5ModifikatorItemProvider();
        }

        if (target instanceof EClass) {
            if (Shr5managementPackage.eINSTANCE.equals(((EClass)target).getEPackage()))
                return createSr5ManagementItemProvider();
//            if (((EClass)target).getEPackage().equals(Shr5Package.eINSTANCE))
                return createShr5ModifikatorItemProvider();
        }

        return super.createAdapter(target);
    }
    
    @Override
    public void dispose() {
        if (shr5Adapter != null) shr5Adapter.dispose();
        if (shr5ManagementAdapter != null) shr5ManagementAdapter.dispose();
        
        super.dispose();
    }
}
