/**
 * 
 */
package de.urszeidler.eclipse.shr5.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;

/**
 * @author urs
 *
 */
public class Shr5EditingTools {

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


    /**
     * Localize the resource object when it is an Identifiable.
     * @param object
     * @param orgText 
     * @param iso3CountryCode 
     * @return
     */
    public static String localizeText(Object object, String orgText, String iso3CountryCode) {
        if (object instanceof Identifiable) {
            Identifiable id = (Identifiable)object;

            EObject eObject = (EObject)object;
            EClass eClass = eObject.eClass();

            String className = ModifikatorItemProvider.getEClassName(eClass);
            EList<Localization> localizations = id.getLocalizations();
            for (Localization localization : localizations) {
                if (iso3CountryCode.equals(localization.getLocal())) {
                    if (id instanceof Beschreibbar) {
                        Beschreibbar b = (Beschreibbar)id;
                        if(localization.getName()!=null)
                            return orgText.replace(b.getName(), localization.getName());
                    }
                    return className + " " + localization.getName();
                }
            }
        }
        return orgText;
    }
    
}
