/*
 * 
 */
package de.urszeidler.shr5.ecp.util;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * @author urs
 */
public class ShadowrunEditingTools {

    /**
     * Create a float string from an int with base 100.
     * 
     * @param essenz
     * @return
     */
    public static String powerPointsToFloat(int essenz) {
        return essenzToFloat(essenz);
    }

    /**
     * Create a float string from an int with base 100.
     * 
     * @param essenz
     * @return
     */
    public static String essenzToFloat(int essenz) {
        float f = essenz / 100f;
        String string = String.format("%.2f", f);//$NON-NLS-1$
        return string;
    }

    /**
     * Extract the eclasses from acceptable for a feature in the contex of the object.
     * 
     * @param eobject
     * @param feature
     * @param editingDomain
     * @return the collection of eclasses accapable for the given feauture
     */
    public static Collection<EClass> provideNewClassTypes(EObject eobject, EStructuralFeature feature, EditingDomain editingDomain) {
        Collection<EClass> filteredEClasses = new HashSet<EClass>();
        Collection<?> newChildDescriptors = AdapterFactoryUtil.getInstance().getItemDelegator().getNewChildDescriptors(eobject, editingDomain, null);
        for (Object object2 : newChildDescriptors) {
            if (object2 instanceof CommandParameter) {
                CommandParameter cp = (CommandParameter)object2;
                if (cp.feature.equals(feature))
                    filteredEClasses.add(((EObject)cp.value).eClass());
            }

        }
        return filteredEClasses;
    }

}
