/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package de.urszeidler.shr5.acceleo.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * Entry point of the 'GenerateShr5MarkdownReport' generation module.
 *
 * @generated
 */
public class GenerateShr5MarkdownReport extends AbstractAcceleoGenerator {
    /**
     * The name of the module.
     *
     * @generated
     */
    public static final String MODULE_FILE_NAME = "/de/urszeidler/shr5/acceleo/main/generateShr5MarkdownReport";
    
    /**
     * The name of the templates that are to be generated.
     *
     * @generated
     */
    public static final String[] TEMPLATE_NAMES = { "generateElement" };
    
    /**
     * The list of properties files from the launch parameters (Launch configuration).
     *
     * @generated
     */
    private List<String> propertiesFiles = new ArrayList<String>();

    /**
     * Allows the public constructor to be used. Note that a generator created
     * this way cannot be used to launch generations before one of
     * {@link #initialize(EObject, File, List)} or
     * {@link #initialize(URI, File, List)} is called.
     * <p>
     * The main reason for this constructor is to allow clients of this
     * generation to call it from another Java file, as it allows for the
     * retrieval of {@link #getProperties()} and
     * {@link #getGenerationListeners()}.
     * </p>
     *
     * @generated
     */
    public GenerateShr5MarkdownReport() {
        // Empty implementation
    }

    /**
     * This allows clients to instantiates a generator with all required information.
     * 
     * @param modelURI
     *            URI where the model on which this generator will be used is located.
     * @param targetFolder
     *            This will be used as the output folder for this generation : it will be the base path
     *            against which all file block URLs will be resolved.
     * @param arguments
     *            If the template which will be called requires more than one argument taken from the model,
     *            pass them here.
     * @throws IOException
     *             This can be thrown in three scenarios : the module cannot be found, it cannot be loaded, or
     *             the model cannot be loaded.
     * @generated
     */
    public GenerateShr5MarkdownReport(URI modelURI, File targetFolder,
            List<? extends Object> arguments) throws IOException {
        initialize(modelURI, targetFolder, arguments);
    }

    /**
     * This allows clients to instantiates a generator with all required information.
     * 
     * @param model
     *            We'll iterate over the content of this element to find Objects matching the first parameter
     *            of the template we need to call.
     * @param targetFolder
     *            This will be used as the output folder for this generation : it will be the base path
     *            against which all file block URLs will be resolved.
     * @param arguments
     *            If the template which will be called requires more than one argument taken from the model,
     *            pass them here.
     * @throws IOException
     *             This can be thrown in two scenarios : the module cannot be found, or it cannot be loaded.
     * @generated
     */
    public GenerateShr5MarkdownReport(EObject model, File targetFolder,
            List<? extends Object> arguments) throws IOException {
        initialize(model, targetFolder, arguments);
    }
    
    /**
     * This can be used to launch the generation from a standalone application.
     * 
     * @param args
     *            Arguments of the generation.
     * @generated
     */
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Arguments not valid : {model, folder}.");
            } else {
                URI modelURI = URI.createFileURI(args[0]);
                File folder = new File(args[1]);
                
                List<String> arguments = new ArrayList<String>();
                
                /*
                 * If you want to change the content of this method, do NOT forget to change the "@generated"
                 * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
                 * of the Acceleo module with the main template that has caused the creation of this class will
                 * revert your modifications.
                 */

                /*
                 * Add in this list all the arguments used by the starting point of the generation
                 * If your main template is called on an element of your model and a String, you can
                 * add in "arguments" this "String" attribute.
                 */
                
                GenerateShr5MarkdownReport generator = new GenerateShr5MarkdownReport(modelURI, folder, arguments);
                
                /*
                 * Add the properties from the launch arguments.
                 * If you want to programmatically add new properties, add them in "propertiesFiles"
                 * You can add the absolute path of a properties files, or even a project relative path.
                 * If you want to add another "protocol" for your properties files, please override 
                 * "getPropertiesLoaderService(AcceleoService)" in order to return a new property loader.
                 * The behavior of the properties loader service is explained in the Acceleo documentation
                 * (Help -> Help Contents).
                 */
                 
                for (int i = 2; i < args.length; i++) {
                    generator.addPropertiesFile(args[i]);
                }
                
                generator.doGenerate(new BasicMonitor());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Launches the generation described by this instance.
     * 
     * @param monitor
     *            This will be used to display progress information to the user.
     * @throws IOException
     *             This will be thrown if any of the output files cannot be saved to disk.
     * @generated
     */
    @Override
    public void doGenerate(Monitor monitor) throws IOException {
         super.doGenerate(monitor);
    }
    
    /**
     * If this generator needs to listen to text generation events, listeners can be returned from here.
     * 
     * @return List of listeners that are to be notified when text is generated through this launch.
     * @generated
     */
    @Override
    public List<IAcceleoTextGenerationListener> getGenerationListeners() {
        List<IAcceleoTextGenerationListener> listeners = super.getGenerationListeners();
        return listeners;
    }
    
    /**
     * If you need to change the way files are generated, this is your entry point.
     * <p>
     * The default is {@link org.eclipse.acceleo.engine.generation.strategy.DefaultStrategy}; it generates
     * files on the fly. If you only need to preview the results, return a new
     * {@link org.eclipse.acceleo.engine.generation.strategy.PreviewStrategy}. Both of these aren't aware of
     * the running Eclipse and can be used standalone.
     * </p>
     * <p>
     * If you need the file generation to be aware of the workspace (A typical example is when you wanna
     * override files that are under clear case or any other VCS that could forbid the overriding), then
     * return a new {@link org.eclipse.acceleo.engine.generation.strategy.WorkspaceAwareStrategy}.
     * <b>Note</b>, however, that this <b>cannot</b> be used standalone.
     * </p>
     * <p>
     * All three of these default strategies support merging through JMerge.
     * </p>
     * 
     * @return The generation strategy that is to be used for generations launched through this launcher.
     * @generated
     */
    @Override
    public IAcceleoGenerationStrategy getGenerationStrategy() {
        return super.getGenerationStrategy();
    }
    
    /**
     * This will be called in order to find and load the module that will be launched through this launcher.
     * We expect this name not to contain file extension, and the module to be located beside the launcher.
     * 
     * @return The name of the module that is to be launched.
     * @generated
     */
    @Override
    public String getModuleName() {
        return MODULE_FILE_NAME;
    }
    
    /**
     * If the module(s) called by this launcher require properties files, return their qualified path from
     * here.Take note that the first added properties files will take precedence over subsequent ones if they
     * contain conflicting keys.
     * 
     * @return The list of properties file we need to add to the generation context.
     * @see java.util.ResourceBundle#getBundle(String)
     * @generated
     */
    @Override
    public List<String> getProperties() {
        return propertiesFiles;
    }
    
    /**
     * Adds a properties file in the list of properties files.
     * 
     * @param propertiesFile
     *            The properties file to add.
     * @generated
     * @since 3.1
     */
    @Override
    public void addPropertiesFile(String propertiesFile) {
        this.propertiesFiles.add(propertiesFile);
    }
    
    /**
     * This will be used to get the list of templates that are to be launched by this launcher.
     * 
     * @return The list of templates to call on the module {@link #getModuleName()}.
     * @generated
     */
    @Override
    public String[] getTemplateNames() {
        return TEMPLATE_NAMES;
    }
    
    /**
     * This can be used to update the resource set's package registry with all needed EPackages.
     * 
     * @param resourceSet
     *            The resource set which registry has to be updated.
     * @generated
     */
    @Override
    public void registerPackages(ResourceSet resourceSet) {
        super.registerPackages(resourceSet);
        if (!isInWorkspace(org.eclipse.emf.ecore.EcorePackage.class)) {
            resourceSet.getPackageRegistry().put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getNsURI(), org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
        }
        
        /*
         * If you want to change the content of this method, do NOT forget to change the "@generated"
         * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
         * of the Acceleo module with the main template that has caused the creation of this class will
         * revert your modifications.
         */
        
        /*
         * If you need additional package registrations, you can register them here. The following line
         * (in comment) is an example of the package registration for UML.
         * 
         * You can use the method  "isInWorkspace(Class c)" to check if the package that you are about to
         * register is in the workspace.
         * 
         * To register a package properly, please follow the following conventions:
         *
         * If the package is located in another plug-in, already installed in Eclipse. The following content should
         * have been generated at the beginning of this method. Do not register the package using this mechanism if
         * the metamodel is located in the workspace.
         *  
         * if (!isInWorkspace(UMLPackage.class)) {
         *     // The normal package registration if your metamodel is in a plugin.
         *     resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
         * }
         * 
         * If the package is located in another project in your workspace, the plugin containing the package has not
         * been register by EMF and Acceleo should register it automatically. If you want to use the generator in
         * stand alone, the regular registration (seen a couple lines before) is needed.
         * 
         * To learn more about Package Registration, have a look at the Acceleo documentation (Help -> Help Contents).
         */
    }

    /**
     * This can be used to update the resource set's resource factory registry with all needed factories.
     * 
     * @param resourceSet
     *            The resource set which registry has to be updated.
     * @generated
     */
    @Override
    public void registerResourceFactories(ResourceSet resourceSet) {
        super.registerResourceFactories(resourceSet);
         
        // resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
    }
    
}
