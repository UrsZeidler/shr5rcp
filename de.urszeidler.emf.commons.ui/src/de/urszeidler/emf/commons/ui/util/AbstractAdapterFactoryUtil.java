/**
 * 
 */
package de.urszeidler.emf.commons.ui.util;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;

/**
 * @author urs
 */
public abstract class AbstractAdapterFactoryUtil {
    private final Map<String, Image> images = new HashMap<String, Image>();
    protected static AbstractAdapterFactoryUtil instance;

    public static void dispose() {
        if (instance == null)
            return;

        disposeImagesMap();
        try {
            instance.adapterFactory.dispose();

        } catch (Exception e) {
            logError("error while disposing AdapterFactoryUtil", e);
        }
        instance = null;
    }

    protected static void logError(String string, Exception e) {
        // TODO Auto-generated method stub

    }

    /**
	 * 
	 */
    private static void disposeImagesMap() {
        if (instance == null)
            return;
        Collection<Image> values = instance.images.values();
        for (Image image : values) {
            try {
                image.dispose();
            } catch (Exception e) {
                logError("error while disposing image", e);
            }
        }
        instance.images.clear();
    }

    protected final ComposedAdapterFactory adapterFactory;
    private AdapterFactoryItemDelegator itemDelegator;
    private final LabelProvider labelProvider;

    public AbstractAdapterFactoryUtil() {
        super();

        adapterFactory = createAdapterFactory();
        // new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        // adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new ExtendedShadowrunAdapterFactory());
        // adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
        itemDelegator = new AdapterFactoryItemDelegator(adapterFactory);

        labelProvider = new LabelProvider() {
            @Override
            public String getText(Object object) {
                return getItemDelegator().getText(object);
            }

            @Override
            public Image getImage(Object object) {
                return ExtendedImageRegistry.getInstance().getImage(itemDelegator.getImage(object));
            }
        };

    }

    protected abstract ComposedAdapterFactory createAdapterFactory();

    public void insertAdapterFactory(AdapterFactory adapterFactory) {
        getAdapterFactory().insertAdapterFactory(adapterFactory);
       
        itemDelegator = new AdapterFactoryItemDelegator(getAdapterFactory());
    }

    public ComposedAdapterFactory getAdapterFactory() {
        return adapterFactory;
    }

    public AdapterFactoryItemDelegator getItemDelegator() {
        return itemDelegator;
    }

    public LabelProvider getLabelProvider() {
        return labelProvider;
    }

    public Map<String, Image> getImageMap() {
        return images;
    }

    /**
     * creates or get an image
     * 
     * @param scale
     * @param imageUrl
     */
    public Image getImageScaledBy(float scale, String imageUrl) {

        if (imageUrl == null)
            return null;
        if (imageUrl.equals(""))
            return null;

        if (!isShowImageEnabled())
            return null;

        String key = imageUrl + scale + "x" + scale;
        Image image = images.get(key);
        try {
            if (image == null) {

                File file = new File(imageUrl);
                String s = imageUrl;
                if (!file.exists()) {
                    IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(s));
                    if (ifile.exists())
                        s = ifile.getLocation().toOSString();
                }

                try {
                    image = new Image(Display.getCurrent(), s);
                    final Image scaled050 = scaleImage_Quadrad(scale, image);

                    images.put(key, scaled050);

                    return scaled050;
                } finally {
                    if (image != null)
                        image.dispose();
                }

            } else
                return image;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    /**
     * @return
     */
    protected boolean isShowImageEnabled() {
        return true;
    }

    /**
     * @param scale
     * @param image
     * @return
     */
    public static Image scaleImage_Quadrad(float scale, Image image) {

        Point newSize = ImageUtils.getBestSize(image.getBounds().width, image.getBounds().height, (int)scale, (int)scale);
        Image blankImage = new Image(image.getDevice(), (int)scale, (int)scale);
        final Image scaled050 = ImageUtils.resize(image, newSize.x, newSize.y);

        GC gc = new GC(blankImage);
        gc.drawImage(scaled050, (int)(scale - newSize.x) / 2, (int)(scale - newSize.y) / 2);
        gc.dispose();
        scaled050.dispose();

        return blankImage;
    }

}
