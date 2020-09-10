/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package de.urszeidler.shr5.acceleo;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.fop.apps.FopFactory;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;
import org.xml.sax.SAXException;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends Plugin {

    /**
     * The plug-in ID.
     */
    public static final String PLUGIN_ID = "de.urszeidler.shr5.acceleo";

    /**
     * The shared instance.
     */
    private static Activator plugin;

    private FopFactory fopFactory;

    /**
     * The constructor.
     */
    public Activator() {
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     *
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    public FopFactory getFopFactory() {
        if (fopFactory != null)
            return fopFactory;

        try {
            URL find = FileLocator.find(getBundle(), new Path("fop.conf/fop.xconf"));
            URL fileURL = FileLocator.toFileURL(find);
            fopFactory = FopFactory.newInstance(new File(fileURL.toURI()));
        } catch (SAXException e) {
            logError(e);
        } catch (IOException e) {
            logError(e);
        } catch (URISyntaxException e) {
            logError(e);
        }
        return fopFactory;
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
