/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.urszeidler.eclipse.shr5.util;

import java.util.Locale;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;

import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.provider.Shr5EditPlugin;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shadowrun.AbstaktFernKampfwaffe} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated not
 */
public class IdentifiableItemProvider extends ModifikatorItemProvider {

    private String iso3Country;
    private boolean doLocalize = false;

    protected IdentifiableItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
        Locale default1 = Locale.getDefault();
        iso3Country = default1.getLanguage();// default1.getISO3Country();
        if (iso3Country.equals("de"))
            doLocalize = true;
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    @Override
    public String getText(Object object) {
        if (doLocalize)
            if (object instanceof Identifiable) {
                Identifiable id = (Identifiable)object;

                EObject eObject = (EObject)object;
                EClass eClass = eObject.eClass();
                // EStructuralFeature feature = getLabelFeature(eClass);

                String className = getClassName(eClass);
                EList<Localization> localizations = id.getLocalizations();
                for (Localization localization : localizations) {
                    if (iso3Country.equals(localization.getLocal())) {
                        return className + " " + localization.getName();
                    }
                }

            }

        return super.getText(object);
    }
}
