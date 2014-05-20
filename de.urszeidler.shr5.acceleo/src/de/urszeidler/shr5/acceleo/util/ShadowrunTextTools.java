/**
 * 
 */
package de.urszeidler.shr5.acceleo.util;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AstraleProjektion;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.ZauberArt;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Sex;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.provider.Shr5ManagementEditPlugin;

/**
 * @author urs
 */
public class ShadowrunTextTools {

    private static final String EMPTY = "";
    private static Zauber zauber = Shr5Factory.eINSTANCE.createZauber();
    private static NonPlayerCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();

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
            return EMPTY;

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
            return EMPTY;

        String text2 = literal.toString();
        IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator()
                .getPropertyDescriptor(zauber, Shr5Package.Literals.ZAUBER__ART);
        if (propertyDescriptor != null)
            text2 = propertyDescriptor.getLabelProvider(zauber).getText(literal);

        return text2;

    }

    
    public static String sexToName(Sex literal) {
        String text2 = literal.toString();
        IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator()
                .getPropertyDescriptor(character, Shr5managementPackage.Literals.MANAGED_CHARACTER__SEX);
        if (propertyDescriptor != null)
            text2 = propertyDescriptor.getLabelProvider(zauber).getText(literal);

        return text2;
       
    }
    /**
     * Creates a list of string with the numbers from 1 to count.
     * 
     * @param count
     * @return
     */
    public static List<String> createNumberList(Integer count) {
        ArrayList<String> list = new ArrayList<String>(count);
        for (int i = 1; i < count + 1; i++) {
            list.add(i + EMPTY);
        }
        return list;
    }

    /**
     * Get a localized text from the managenent plugin with the prefix _PR_.
     * 
     * @param string
     * @return
     */
    public static String localizedString(String string) {
        try {
            String loc = Shr5ManagementEditPlugin.INSTANCE.getString("_PR_" + string, true);
            return loc;
        } catch (Exception e) {
            return string;
        }
    }

    /**
     * Looksup the initiative as localized string.
     * 
     * @param persona
     * @return
     */
    public static String toLocalizedInitative(AbstraktPersona persona) {
        if (persona == null)
            return EMPTY;

        int initative = persona.getInitative();
        int initativWuerfel = persona.getInitativWuerfel();
        Object[] arr = new Object[]{ initative, initativWuerfel };
        return Shr5ManagementEditPlugin.INSTANCE.getString("_UI_Initative_Format_String", arr, true);
    }

    /**
     * Looksup the initiative as localized string.
     * 
     * @param persona
     * @return
     */
    public static String toLocalizedAstralInitative(AstraleProjektion persona) {
        if (persona == null)
            return EMPTY;

        int initative = persona.getAstraleInitative();
        int initativWuerfel = persona.getAstraleInitativWuerfel();
        Object[] arr = new Object[]{ initative, initativWuerfel };
        return Shr5ManagementEditPlugin.INSTANCE.getString("_UI_Initative_Format_String", arr, true);
    }

    /**
     * Really simple escape function.
     * 
     * @param s
     * @return
     */
    public static String escapeXML(String s) {
        StringBuilder result = new StringBuilder();
        StringCharacterIterator i = new StringCharacterIterator(s);
        char c = i.current();
        while (c != CharacterIterator.DONE) {
            switch (c) {
                case '<':
                    result.append("&lt;");
                    break;
                case '>':
                    result.append("&gt;");
                    break;
                case '"':
                    result.append("&quot;");
                    break;
                case '\'':
                    result.append("&apos;");
                    break;
                case '&':
                    result.append("&amp;");
                    break;
                default:
                    result.append(c);
            }
            c = i.next();
        }
        return result.toString();
    }
}
