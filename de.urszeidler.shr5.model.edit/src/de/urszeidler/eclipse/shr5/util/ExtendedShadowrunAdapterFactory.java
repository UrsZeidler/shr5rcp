/**
 * 
 */
package de.urszeidler.eclipse.shr5.util;

import java.util.Locale;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import de.urszeidler.eclipse.shr5.provider.Shr5ItemProviderAdapterFactory;

/**
 * Exteds the normal item adapter factory to supply some custom implentations
 * 
 * @author urs
 */
public class ExtendedShadowrunAdapterFactory extends Shr5ItemProviderAdapterFactory {
    private String iso3Country;
    private boolean doLocalize;

    /**
     * The singleton reflective instance.
     */
    protected ModifikatorItemProvider reflectiveItemProviderAdapter;

    public ExtendedShadowrunAdapterFactory() {
        super();
        Locale default1 = Locale.getDefault();
        iso3Country = default1.getLanguage();// default1.getISO3Country();
        if (iso3Country.equals("de"))
            doLocalize = true;
        
        doLocalize = false;
    }

    /**
		 */
    public Adapter createModifikatorItemProvider() {
        if (reflectiveItemProviderAdapter == null) {
            reflectiveItemProviderAdapter = new ModifikatorItemProvider(this);
        }

        return reflectiveItemProviderAdapter;
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc --> This implementation returns <code>true</code> if
     * the object is either the model's package or is an instance object of the
     * model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
//        if (object instanceof EClass) {
//            EClass ec = (EClass)object;
//            return Shr5Package.eINSTANCE.equals(ec.getEPackage());
//        }
        
//        if (object == EcorePackage.eINSTANCE) {
//            return true;
//        }

        return super.isFactoryForType(object);
    }

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param target
     * the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        if (target instanceof EAttribute) {
            return createModifikatorItemProvider();
        }
        if (target instanceof EReference) {
            return createModifikatorItemProvider();
        }

        if (target instanceof EClass) {
            return createModifikatorItemProvider();
        }
//        if (target instanceof EAttribute) {
//            if ( ((EAttribute)target).getEContainingClass().getEPackage().equals(Shr5Package.eINSTANCE))
//              return createModifikatorItemProvider();
//          }
//          if (target instanceof EReference) {
//                if ( ((EReference)target).getEContainingClass().getEPackage().equals(Shr5Package.eINSTANCE))
//              return createModifikatorItemProvider();
//          }
//
//          if (target instanceof EClass) {
//              if ( ((EClass)target).getEPackage().equals(Shr5Package.eINSTANCE))
//              return createModifikatorItemProvider();
//          }

        
        
//        Adapter doSwitch = modelSwitch.doSwitch((EObject)target);
//        if (doLocalize)
//            if (target instanceof Identifiable) {
//                return new AdapterItemProviderDelegator((ItemProviderAdapter)doSwitch) {
//                    @Override
//                    public String getText(Object object) {
//                        if (object instanceof Identifiable) {
//                            Identifiable id = (Identifiable)object;
//
//                            EObject eObject = (EObject)object;
//                            EClass eClass = eObject.eClass();
//                            // EStructuralFeature feature = getLabelFeature(eClass);
//
//                            String className = getClassName(eClass);
//                            EList<Localization> localizations = id.getLocalizations();
//                            for (Localization localization : localizations) {
//                                if (iso3Country.equals(localization.getLocal())) {
//                                    return className + " " + localization.getName();
//                                }
//                            }
//                        }
//                        return super.getText(object);
//                    }
//                };
//            }
        return super.createAdapter(target);//doSwitch;
    }

    protected String getClassName(EClass object) {
        if (reflectiveItemProviderAdapter == null)
            createModifikatorItemProvider();

        return reflectiveItemProviderAdapter.getClassName(object);
    }

    public void dispose() {
        if (reflectiveItemProviderAdapter != null) {
            reflectiveItemProviderAdapter.dispose();
        }

        super.dispose();
    }

}
