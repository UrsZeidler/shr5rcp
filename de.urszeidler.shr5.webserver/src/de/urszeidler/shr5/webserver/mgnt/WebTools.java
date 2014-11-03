/**
 * 
 */
package de.urszeidler.shr5.webserver.mgnt;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import com.google.common.collect.Collections2;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.provider.util.GameplayEditTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * @author urs
 */
public class WebTools {

    public static String getAvailableCredits(RuntimeCharacter character) {
        Collection<AbstraktGegenstand> collection = Collections2.filter(character.getInUse(),ShadowrunTools.eclassPredicate(Shr5Package.Literals.CREDSTICK));
        BigDecimal decimal = new BigDecimal(0);
        for (AbstraktGegenstand abstraktGegenstand : collection) {
            Credstick cs = (Credstick)abstraktGegenstand;
            decimal = cs.getCurrentValue().add(decimal);
        }
        
        
        return DecimalFormat.getInstance().format(decimal);
    }
    
    public static String escapeHTML(String s) {
        StringBuilder out = new StringBuilder(Math.max(16, s.length()));
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 127 || c == '"' || c == '<' || c == '>' || c == '&') {
                out.append("&#");
                out.append((int)c);
                out.append(';');
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }

    public static String probe2ProbeString(Probe probe) {
        String escapeHTML = escapeHTML(GameplayEditTools.probe2ProbeString(probe));
        return escapeHTML;
    }

    /**
     * Get the text from the adapterFactory. Html escaped.
     */
    public static String getText(Object object) {
        return escapeHTML(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
    }

    public static String getUriFragment(EObject eObject) {
        if(eObject==null)
            return "";
        Resource eResource = eObject.eResource();
        if(eResource==null)
            return "";
        
       String uriFragment = eResource.getURIFragment(eObject);
       return escapeHTML(uriFragment);
    }
    
    /**
     * Returns the localized feature name. Html escaped.
     * 
     * @param object
     * @param eAttribute
     * @return
     */
    public static String toFeatureName(EObject object, EStructuralFeature eAttribute) {
        return escapeHTML(ShadowrunEditingTools.toFeatureName(object, eAttribute));
    }
    
    /**
     * Enccoded and localized literal name.
     * @param literal
     * @param eobject
     * @param feature
     * @return
     */
    public static String literal2Name(Object literal, EObject eobject, EAttribute feature) {
        if (literal == null)
            return "";

        String text2 = literal.toString();
        IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(eobject, feature);
        if (propertyDescriptor != null)
            text2 = propertyDescriptor.getLabelProvider(eobject).getText(literal);

        return  escapeHTML(text2);

    }


}
