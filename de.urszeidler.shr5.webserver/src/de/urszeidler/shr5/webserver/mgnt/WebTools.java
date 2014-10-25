/**
 * 
 */
package de.urszeidler.shr5.webserver.mgnt;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.provider.util.GameplayEditTools;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * @author urs
 */
public class WebTools {

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
}
