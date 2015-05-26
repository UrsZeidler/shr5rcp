package de.urszeidler.shr5.m2t;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.urszeidler.shr5.m2t"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

    private IConfigurationElement[] registry;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	public class TransformerMaps{
	    Map<String, Map<String, AbstractAcceleoGenerator>> transformerMap;
	    Map<String, IConfigurationElement> imageMap;
	    Map<String, String> descriptionMap;
        public Map<String, Map<String, AbstractAcceleoGenerator>> getTransformerMap() {
            return transformerMap;
        }
        public Map<String, IConfigurationElement> getImageMap() {
            return imageMap;
        }
        public Map<String, String> getDescriptionMap() {
            return descriptionMap;
        }	    
	}
	
	public TransformerMaps getTransformers(){
	   registry = Platform.getExtensionRegistry().getConfigurationElementsFor("de.urszeidler.shr5.m2t"); 
	     Map<String, Map<String, AbstractAcceleoGenerator>> transformerMap = new HashMap<String, Map<String, AbstractAcceleoGenerator>>();
	     Map<String, IConfigurationElement> imageMap = new HashMap<String,IConfigurationElement >();
	     Map<String, String> descriptionMap = new HashMap<String, String>();

	   
       for (IConfigurationElement iConfigurationElement : registry) {
           try {
               Object extension = iConfigurationElement.createExecutableExtension("acceleoGenerator");
               String name = iConfigurationElement.getAttribute("name");
               String description = iConfigurationElement.getAttribute("description");
//               String dImage = iConfigurationElement.getAttribute("dialogImage");
               imageMap.put(name, iConfigurationElement); //$NON-NLS-1$
               descriptionMap.put(name, description);
               IConfigurationElement[] children = iConfigurationElement.getChildren("TransformerMapping");
               for (IConfigurationElement ic : children) {
                  String executableExtension = ic.getAttribute("class");
                  Map<String, AbstractAcceleoGenerator> map = transformerMap.get(executableExtension);
                  if(map==null){
                      map = new HashMap<String, AbstractAcceleoGenerator>();
                      transformerMap.put(executableExtension, map);
                  }
                  map.put(name, (AbstractAcceleoGenerator)extension);
               }
           } catch (CoreException e) {

           }
       }
       TransformerMaps transformerMaps = new TransformerMaps();
       transformerMaps.transformerMap = transformerMap;
       transformerMaps.imageMap = imageMap;
       transformerMaps.descriptionMap = descriptionMap;
	   return transformerMaps;
	} 
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

    public static void logError(String message, Exception e) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), message, e));
    }

    public static void logError(String message) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), message));
    }

    public static void logError(Exception e) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), e.getMessage(), e));
    }

    public static void logInfo(String message) {
        plugin.getLog().log(new Status(IStatus.INFO, plugin.getBundle().getSymbolicName(), message));
    }


}
