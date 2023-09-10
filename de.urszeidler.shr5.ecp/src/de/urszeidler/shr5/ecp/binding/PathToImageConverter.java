/**
 * 
 */
package de.urszeidler.shr5.ecp.binding;


import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.swt.graphics.Image;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * This converts the path of an image to an image, it uses the
 * AdapterFactoryUtil for it.
 * 
 * @author urs
 */
public class PathToImageConverter extends Converter<String,Image> {
    private int max = 128;

    public PathToImageConverter(Object fromType, Object toType) {
        super(fromType, toType);
    }

    public PathToImageConverter(Object fromType, Object toType, int size) {
        super(fromType, toType);
        max = size;
    }

    @Override
    public Image convert(String fromObject) {
        // System.out.println("imageConverter -->" + fromObject);

        if (!(fromObject instanceof String))
            return null;
        String s = (String)fromObject;

        return AdapterFactoryUtil.getInstance().getImageScaledBy(max, s);
    }
}