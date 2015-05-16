/**
 * 
 */
package de.urszeidler.shr5.acceleo.util;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.text.CharacterIterator;
import java.text.DateFormat;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AstraleProjektion;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.ModSetter;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.provider.Shr5EditPlugin;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
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
    private static Feuerwaffe fiereweapon = Shr5Factory.eINSTANCE.createFeuerwaffe();
    private static DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
    private static DateFormat dateTimeFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    private static DateFormat dateTimeFormatSec = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG);

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

    public static String getImageBase64(Object element) {
        if (element instanceof Beschreibbar) {
            Beschreibbar b = (Beschreibbar)element;
            Image imageScaledBy = AdapterFactoryUtil.getInstance().getImageScaledBy(64f, b.getImage());
           ImageLoader imageLoader = new ImageLoader();
           imageLoader.data = new ImageData[] {imageScaledBy.getImageData()};
           ByteArrayOutputStream stream = new ByteArrayOutputStream(500);
           imageLoader.save(stream,SWT.IMAGE_PNG);

        String encodeBase64String = Base64.encodeBase64String(stream.toByteArray());
        return "data:image/png;base64,"+encodeBase64String;
        }
        
        return null;
    }

    /**
     * To name for the enum literals.
     * 
     * @param literal
     * @param eobject
     * @param feature
     * @return
     */
    /**
     * Print all the modifications active on this persona.
     * 
     * @param persona
     * @return
     */
    public static List<List<Object>> getModList(AbstraktPersona persona) {
        ModSetter modManager = persona.getModManager();
        Set<Entry<EObject, Integer>> set = modManager.getModificatorMap().entrySet();
        ArrayList<List<Object>> list = new ArrayList<List<Object>>(set.size());
        for (Entry<EObject, Integer> entry : set) {
            ArrayList<Object> arrayList = new ArrayList<Object>(2);
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
            list.add(arrayList);
        }
        return list;
    }

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
    public static String zauberArtToName(Object literal) {
        return toName(literal, zauber, Shr5Package.Literals.ZAUBER__ART);
    }

    public static String sexToName(Object literal) {
        return toName(literal, character, Shr5managementPackage.Literals.MANAGED_CHARACTER__SEX);
    }

    public static String fwModusToName(Object literal) {
        return toName(literal, fiereweapon, Shr5Package.Literals.FEUERWAFFE__MODIE);
    }

    public static String fwMagazinToName(Object literal) {
        return toName(literal, fiereweapon, Shr5Package.Literals.FEUERWAFFE__MUNITIONSTYP);
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

    public static String formatMoney(BigDecimal decimal) {
        return String.format("%,.0f %s" , decimal, "¥");//TODO: need to use the prefs when able
     }
     
    
    
    public static String formatDate(Date date) {
        if(date==null)
            return "unset";
        
        return dateFormat.format(date);
     }
    
    public static String formatDateTime(Date date) {
        if(date==null)
            return "unset";
        
        return dateTimeFormat.format(date);
     }
     
    public static String formatDateTimeSec(Date date) {
        if(date==null)
            return "unset";
        
        return dateTimeFormatSec.format(date);
     }
     
    /**
     * Get a localized text from the managenent plugin with the prefix _PR_.
     * 
     * @param string
     * @return
     */
    public static String localizedString(String string) {
        try {
            String loc = Shr5EditPlugin.INSTANCE.getString(string, true);
            return loc;
        } catch (Exception e) {
            try {
                String loc = Shr5ManagementEditPlugin.INSTANCE.getString(string, true);
                return loc;
            } catch (Exception e2) {
                return string;
            }
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
     * @param initative 
     * @param initativWuerfel 
     * 
     * @param persona
     * @return
     */
    public static String toLocalizedInitative(Integer initative, Integer initativWuerfel) {
        if(initative==null||initativWuerfel==null)
            return EMPTY;
        
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
