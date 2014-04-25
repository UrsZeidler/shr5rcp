/**
 * 
 */
package de.urszeidler.shr5.acceleo.sheets;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * @author urs
 *
 */
public class ShadowrunSheetTools {
    
    public static String getObjectText(Object element) {
        return AdapterFactoryUtil.getInstance().getLabelProvider().getText(element);
    }
 }
