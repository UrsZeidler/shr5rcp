/**
 * 
 */
package de.urszeidler.eclipse.shr5.gameplay.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

/**
 * @author urs
 */
public class GamplayEditingTools {

    /**
     * Provide a null safe reflective label for a eobject.
     * 
     * @param factory
     * @param defaultVaule
     * @param eObject
     * @return
     */
    public static String getLabelForEObject(ComposeableAdapterFactory factory, String defaultVaule, EObject eObject) {
        IItemLabelProvider labelprovider;
        if (factory != null)
            if (eObject != null) {
                labelprovider = (IItemLabelProvider)factory.adapt(eObject, IItemLabelProvider.class);
                if (labelprovider != null)
                    defaultVaule = labelprovider.getText(eObject);
            }
        return defaultVaule;
    }

}
