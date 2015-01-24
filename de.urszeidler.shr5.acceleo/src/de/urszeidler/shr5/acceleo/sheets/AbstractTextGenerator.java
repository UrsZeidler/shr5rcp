/**
 * 
 */
package de.urszeidler.shr5.acceleo.sheets;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.Monitor;

import de.urszeidler.emf.commons.ui.util.DesktopApi;

/**
 * @author urs
 *
 */
public abstract class AbstractTextGenerator extends AbstractGenerator {

     
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
        
        if(open)
            for (String filename : files) {
                File file = new File(filename);
                DesktopApi.open(file);
            }
    }
     
}
