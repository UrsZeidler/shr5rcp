/**
 * 
 */
package de.urszeidler.eclipse.shr5.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Sprachfertigkeit;
import de.urszeidler.eclipse.shr5.Wissensfertigkeit;

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
    
    public static List<Object> createFertigkeitGroupsRoot(AbstraktPersona persona) {
        Collection<EObject> groups = ItemPropertyDescriptor.getReachableObjectsOfType(persona, Shr5Package.Literals.FERTIGKEITS_GRUPPE);
        Collection<EObject> skill = ItemPropertyDescriptor.getReachableObjectsOfType(persona, Shr5Package.Literals.FERTIGKEIT);

        ShrList root = Shr5Factory.eINSTANCE.createShrList();
        
        
        ShrList ungrouped = Shr5Factory.eINSTANCE.createShrList();
        ungrouped.setName("ungruppiert");
        ShrList knownGroup = Shr5Factory.eINSTANCE.createShrList();
        knownGroup.setName("wissen");
        ShrList languGoup = Shr5Factory.eINSTANCE.createShrList();
        languGoup.setName("sprache");

        root.getEntries().add(ungrouped);
        root.getEntries().add(knownGroup);
        root.getEntries().add(languGoup);
        
        for (EObject eObject : skill) {
            if (eObject instanceof Sprachfertigkeit) {
                Sprachfertigkeit wf = (Sprachfertigkeit)eObject;
                languGoup.getEntries().add(wf);
            } else if (eObject instanceof Wissensfertigkeit) {
                Wissensfertigkeit wf = (Wissensfertigkeit)eObject;
                knownGroup.getEntries().add(wf);
            } else if (eObject instanceof Fertigkeit) {
                Fertigkeit f = (Fertigkeit)eObject;
                if (!Shr5Package.Literals.FERTIGKEITS_GRUPPE__FERTIGKEITEN.equals(f.eContainingFeature())) {
                    ungrouped.getEntries().add(f);
                }
            }
        }

        List<Object> list = new ArrayList<Object>();
        list.addAll(groups);
        list.add(ungrouped);
        list.add(knownGroup);
        list.add(languGoup);

        return list;
    }

}
