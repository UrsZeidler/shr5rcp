/**
 * 
 */
package de.urszeidler.shr5.webserver.mgnt;

import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.provider.util.GameplayEditTools;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

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
     * Get the text from the adapterFactory.
     */
    public static String getText(Object object) {
        return escapeHTML(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
    }
}
