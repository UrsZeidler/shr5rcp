package de.urszeidler.shr5.acceleo.sheets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.batik.transcoder.Transcoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.fop.svg.PDFTranscoder;
import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.urszeidler.emf.commons.ui.util.DesktopApi;
import de.urszeidler.shr5.acceleo.Activator;

public abstract class AbstractSvg2PdfGenerator extends AbstractGenerator {

    /**
     * The list of properties files from the launch parameters (Launch configuration).
     * 
     * @generated
     */
    private List<String> propertiesFiles = new ArrayList<String>();

    public AbstractSvg2PdfGenerator() {
        super();
    }

    /**
     * Launches the generation described by this instance.
     * 
     * @param monitor
     * This will be used to display progress information to the user.
     * @throws IOException
     * This will be thrown if any of the output files cannot be saved to disk.
     * @generated not
     */
    @Override
    public void doGenerate(Monitor monitor) throws IOException {
        super.doGenerate(monitor);
        
        monitor.subTask("transforming to pdf");
        try {
            for (String fname : files) {
                File file = new File(fname);
                monitor.subTask("writing :"+fname);
                storeAsPdf(file);
                monitor.subTask("open :"+fname);
            }
    
        } catch (TranscoderException e) {
           Activator.logError("Error while storing as pdf", e);
        }
    }

    /**
     * Transforms the svg file to pdf.
     * 
     * @param file
     * @throws TranscoderException
     * @throws IOException
     */
    private void storeAsPdf(File file) throws TranscoderException, IOException {
    
        String svg_URI_input = file.toURI().toURL().toString();
        String outputFilename = file.getAbsolutePath() + ".pdf";
    
        TranscoderInput input_svg_image = new TranscoderInput(svg_URI_input);
        // Step-2: Define OutputStream to PDF file and attach to TranscoderOutput
        OutputStream pdf_ostream = new FileOutputStream(outputFilename);
        TranscoderOutput output_pdf_file = new TranscoderOutput(pdf_ostream);
        // Step-3: Create a PDF Transcoder and define hints
        Transcoder transcoder = new PDFTranscoder();
        transcoder.transcode(input_svg_image, output_pdf_file);
        pdf_ostream.flush();
        pdf_ostream.close();
        if(open)
            DesktopApi.open(new File(outputFilename));
    }

 
    /**
     * If you need to change the way files are generated, this is your entry point.
     * <p>
     * The default is {@link org.eclipse.acceleo.engine.generation.strategy.DefaultStrategy}; it generates files on the fly. If you only need to
     * preview the results, return a new {@link org.eclipse.acceleo.engine.generation.strategy.PreviewStrategy}. Both of these aren't aware of the
     * running Eclipse and can be used standalone.
     * </p>
     * <p>
     * If you need the file generation to be aware of the workspace (A typical example is when you wanna override files that are under clear case or
     * any other VCS that could forbid the overriding), then return a new
     * {@link org.eclipse.acceleo.engine.generation.strategy.WorkspaceAwareStrategy}. <b>Note</b>, however, that this <b>cannot</b> be used
     * standalone.
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
     * If the module(s) called by this launcher require properties files, return their qualified path from
     * here.Take note that the first added properties files will take precedence over subsequent ones if they
     * contain conflicting keys.
     * 
     * @return The list of properties file we need to add to the generation context.
     * @see java.util.ResourceBundle#getBundle(String)
     * @generated not
     */
    @Override
    public List<String> getProperties() {
        /*
         * If you want to change the content of this method, do NOT forget to change the "@generated"
         * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
         * of the Acceleo module with the main template that has caused the creation of this class will
         * revert your modifications.
         */
    
        String prefix = "platform:/plugin/";
        String pluginName = "de.urszeidler.shr5.model.edit";
        String packagePath = "/";
    
        propertiesFiles.add(prefix + pluginName + packagePath + "plugin.properties");
        propertiesFiles.add(prefix + pluginName + packagePath + "plugin_de.properties");
    
        pluginName = "de.urszeidler.shr5.management.model.edit";
        propertiesFiles.add(prefix + pluginName + packagePath + "plugin.properties");
        propertiesFiles.add(prefix + pluginName + packagePath + "plugin_de.properties");
    
        return propertiesFiles;
    }

    /**
     * Adds a properties file in the list of properties files.
     * 
     * @param propertiesFile
     * The properties file to add.
     * @generated
     * @since 3.1
     */
    @Override
    public void addPropertiesFile(String propertiesFile) {
        this.propertiesFiles.add(propertiesFile);
    }

    /**
     * This can be used to update the resource set's package registry with all needed EPackages.
     * 
     * @param resourceSet
     * The resource set which registry has to be updated.
     * @generated not
     */
    @Override
    public void registerPackages(ResourceSet resourceSet) {
        super.registerPackages(resourceSet);
        if (!isInWorkspace(org.eclipse.emf.ecore.EcorePackage.class)) {
            resourceSet.getPackageRegistry().put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getNsURI(),
                    org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
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
         * You can use the method "isInWorkspace(Class c)" to check if the package that you are about to
         * register is in the workspace.
         * To register a package properly, please follow the following conventions:
         * If the package is located in another plug-in, already installed in Eclipse. The following content should
         * have been generated at the beginning of this method. Do not register the package using this mechanism if
         * the metamodel is located in the workspace.
         * if (!isInWorkspace(UMLPackage.class)) {
         * // The normal package registration if your metamodel is in a plugin.
         * resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
         * }
         * If the package is located in another project in your workspace, the plugin containing the package has not
         * been register by EMF and Acceleo should register it automatically. If you want to use the generator in
         * stand alone, the regular registration (seen a couple lines before) is needed.
         * To learn more about Package Registration, have a look at the Acceleo documentation (Help -> Help Contents).
         */
    }

    /**
     * This can be used to update the resource set's resource factory registry with all needed factories.
     * 
     * @param resourceSet
     * The resource set which registry has to be updated.
     * @generated not
     */
    @Override
    public void registerResourceFactories(ResourceSet resourceSet) {
        super.registerResourceFactories(resourceSet);
        /*
         * If you want to change the content of this method, do NOT forget to change the "@generated"
         * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
         * of the Acceleo module with the main template that has caused the creation of this class will
         * revert your modifications.
         */
    
        // resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
    }

  
}