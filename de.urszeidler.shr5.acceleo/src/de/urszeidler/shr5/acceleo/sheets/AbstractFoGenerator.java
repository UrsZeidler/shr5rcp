/**
 * 
 */
package de.urszeidler.shr5.acceleo.sheets;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.eclipse.emf.common.util.Monitor;

import de.urszeidler.shr5.acceleo.Activator;

/**
 * @author urs
 *
 */
public abstract class AbstractFoGenerator extends AbstractGenerator{

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
                transform(file);
                monitor.subTask("open :"+fname);
            }
        } catch (FOPException e) {
            Activator.logError("Error while storing as pdf", e);
        } catch (TransformerException e) {
            Activator.logError("Error while storing as pdf", e);
        }
    }



    protected void transform(File file) throws FOPException, TransformerException, IOException{
        /*..*/

        String svg_URI_input = file.toURI().toURL().toString();
        String outputFilename = file.getAbsolutePath() + ".pdf";
     // Step 1: Construct a FopFactory
     // (reuse if you plan to render multiple documents!)
     FopFactory fopFactory = FopFactory.newInstance();

     // Step 2: Set up output stream.
     // Note: Using BufferedOutputStream for performance reasons (helpful with FileOutputStreams).
     OutputStream out = new BufferedOutputStream(new FileOutputStream(new File(outputFilename)));


     try {
         // Step 3: Construct fop with desired output format
         Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, out);

         // Step 4: Setup JAXP using identity transformer
         TransformerFactory factory = TransformerFactory.newInstance();
         Transformer transformer = factory.newTransformer(); // identity transformer

         // Step 5: Setup input and output for XSLT transformation
         // Setup input stream
         Source src = new StreamSource(file);

         // Resulting SAX events (the generated FO) must be piped through to FOP
         Result res = new SAXResult(fop.getDefaultHandler());

         // Step 6: Start XSLT transformation and FOP processing
         transformer.transform(src, res);

     } finally {
         //Clean-up
         out.close();
     }
    }
    

}
