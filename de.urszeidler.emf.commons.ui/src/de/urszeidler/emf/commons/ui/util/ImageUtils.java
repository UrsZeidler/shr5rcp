package de.urszeidler.emf.commons.ui.util;

import java.io.ByteArrayOutputStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;

public class ImageUtils {

	public static Point getBestSize(Point original, Point max) {
		return getBestSize(original.x, original.y, max.x, max.y);
	}

	public static Point getBestSize(int originalX, int originalY, int maxX, int maxY) {

		double bestRatio = getBestRatio(originalX, originalY, maxX, maxY);

		int newWidth = (int) (originalX / bestRatio);
		int newHeight = (int) (originalY / bestRatio);
		// logger.debug("newWidth " + newWidth + " newHeight " + newHeight);

		return new Point(newWidth, newHeight);
	}

	public static double getBestRatio(int originalX, int originalY, int maxX, int maxY) {
		double widthRatio = (double) originalX / (double) maxX;
		double heightRatio = (double) originalY / (double) maxY;

		double bestRatio = widthRatio > heightRatio ? widthRatio : heightRatio;
		return bestRatio;
	}

	/**
	 * Resize an image to the best fitting size. Old and new Image (result)must
	 * be disposed after use.
	 * 
	 * @param img
	 * @param maxWidth
	 * @param maxHeight
	 * @return
	 */
	public static Image resizeBestSize(Image img, int maxWidth, int maxHeight) {
		// Check for null
		if (img == null)
			return null;

		// Calculate best size
		Point newSize = getBestSize(img.getBounds().width, img.getBounds().height, maxWidth, maxHeight);

		// Resize image
		return ImageUtils.resize(img, newSize.x, newSize.y);
	}

	public static ImageData resize(ImageData imageData, int width, int height, boolean antiAliasing) {

		if (imageData == null)
			return null;

		if (imageData.width == width && imageData.height == height)
			return imageData;

		if (antiAliasing) {
			Image tmpImage = null;
			Image fullImage = new Image(Display.getCurrent(), imageData);
			ImageData result = null;
			tmpImage = resize(fullImage, width, height);

			result = tmpImage.getImageData();
			tmpImage.dispose();
			fullImage.dispose();
			return result;
		}
		return imageData.scaledTo(width, height);
	}

	public static boolean isResizeRequired(Image image, int width, int height) {
		Rectangle bounds = image.getBounds();
		return !(bounds.width == width && bounds.height == height);
	}

	/**
	 * Returns a new scaled image. new Image must be disposed after use.
	 * 
	 * @param image
	 * @param width
	 * @param height
	 * @return
	 */
	public static Image resize(Image image, int width, int height) {

		if (image == null)
			return null;

		final Image scaled = new Image(Display.getDefault(), width, height);
		GC gc = new GC(scaled);
		// Linux-GTK Bug 174932
		if (!SWT.getPlatform().equals("gtk")) {
			gc.setAdvanced(true);
		}

		if (gc.getAdvanced()) {
			gc.setAntialias(SWT.ON);
			gc.setInterpolation(SWT.HIGH);
		}
		gc.drawImage(image, 0, 0, image.getBounds().width, image.getBounds().height, 0, 0, width, height);
		gc.dispose();

		return scaled;
	}

	

	public static byte[] saveImage(Image image, int format) {
		if (image == null)
			return null;

		ImageLoader il = new ImageLoader();
		il.data = new ImageData[] { image.getImageData() };
		ByteArrayOutputStream bas = new ByteArrayOutputStream();
		il.save(bas, format);
		return bas.toByteArray();
	}

}
