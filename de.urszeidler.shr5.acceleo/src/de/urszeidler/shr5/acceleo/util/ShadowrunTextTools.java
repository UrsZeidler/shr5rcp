/**
 * 
 */
package de.urszeidler.shr5.acceleo.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.ZauberArt;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * @author urs
 *
 */
public class ShadowrunTextTools {

    private static Zauber zauber = Shr5Factory.eINSTANCE.createZauber();
    /**
     * Returns the localized feature name.
     * 
     * @param object
     * @param eAttribute
     * @return
     */
    public static String toFeatureName(EObject object, EStructuralFeature eAttribute) {
        IItemPropertyDescriptor descriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(object, eAttribute);
        return descriptor.getDisplayName(eAttribute);
    }

    public static String getObjectText(Object element) {
        return AdapterFactoryUtil.getInstance().getLabelProvider().getText(element);
    }

    /**
     * To name for the enum literals.
     * 
     * @param literal
     * @param eobject
     * @param feature
     * @return
     */
    public static String toName(Object literal, EObject eobject, EAttribute feature) {
        if (literal == null)
            return "";

        String text2 = literal.toString();
        IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(eobject, feature);
        if (propertyDescriptor != null)
            text2 = propertyDescriptor.getLabelProvider(eobject).getText(literal);

        return text2;

    }
    /**
     * To name for the enum literals.
     * 
     * @param literal
     * @return the localized name
     */
    public static String zauberArtToName(ZauberArt literal) {
        if (literal == null)
            return "";

        String text2 = literal.toString();
        IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(zauber, Shr5Package.Literals.ZAUBER__ART);
        if (propertyDescriptor != null)
            text2 = propertyDescriptor.getLabelProvider(zauber).getText(literal);

        return text2;

    }
}
