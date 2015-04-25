/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.urszeidler.eclipse.shr5.util;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;

import de.urszeidler.eclipse.shr5.provider.Shr5EditPlugin;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shadowrun.AbstaktFernKampfwaffe} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated not
 */
public class ModifikatorItemProvider extends ReflectiveItemProvider implements IItemLabelProvider {

    public ModifikatorItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);

    }

    @Override
    public Object getImage(Object object) {
        if (object instanceof EClass) {
            EClass ec = (EClass)object;
            try {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/"+ec.getName()));
            } catch (Exception e) {
            }

            // return getString(key);
        }

        
        
        return super.getImage(object);
    }
    
    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    @Override
    public String getText(Object object) {

        if (object instanceof EStructuralFeature) {
            EStructuralFeature es = (EStructuralFeature)object;
            try {
            String key = "_UI_" +es.getEContainingClass().getName()+"_"+es.getName() + "_feature";
                return getResourceLocator().getString(key);
            } catch (Exception e) {
            }
            
            return getFeatureText(es);
        }

        if (object instanceof EClass) {
           return getClassName((EClass)object);
        }

        EObject eObject = (EObject)object;
        EClass eClass = eObject.eClass();
        EStructuralFeature feature = getLabelFeature(eClass);

        if (feature != null) {
            Object value = eObject.eGet(feature);
            if (value != null) {
                return value.toString();
            }
        }

        return super.getText(eObject);
    }

    /**
     * Get the resource locator for this adapter's resources.
     */
    protected ResourceLocator getResourceLocator() {
        return Shr5EditPlugin.INSTANCE;
    }

    protected String getClassName(EClass object) {
        EClass ec = (EClass)object;
        String key = "_UI_" + ec.getName() + "_type";
        try {
            return getResourceLocator().getString(key);
        } catch (Exception e) {
            return ec.getName();
        }
    }

    
    public static String getEClassName(EClass object) {
        EClass ec = (EClass)object;
        String key = "_UI_" + ec.getName() + "_type";
        try {
            return Shr5EditPlugin.INSTANCE.getString(key);
        } catch (Exception e) {
            return ec.getName();
        }
        
    }
}
