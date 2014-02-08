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
 * 
 * @author urs
 *
 */
public class ShadowrunEditingTools {
    
    
    
    /**
     * Extract the eclasses from acceptable for a feature.
     * @param eobject
     * @param feature
     * @param editingDomain 
     * @return
     */
    public static Collection<EClass> provideNewClassTypes(EObject eobject, EStructuralFeature feature, EditingDomain editingDomain) {
        Collection<EClass> filteredEClasses = new HashSet<EClass>();
        Collection<?> newChildDescriptors = AdapterFactoryUtil.getInstance().getItemDelegator()
                .getNewChildDescriptors(eobject, editingDomain, null);
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
