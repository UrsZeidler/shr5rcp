/**
 * 
 */
package de.urszeidler.shr5.acceleo.sheets;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.engine.event.AbstractAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.event.AcceleoTextGenerationEvent;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;

/**
 * @author urs
 *
 */
public abstract class AbstractGenerator extends AbstractAcceleoGenerator {

    protected boolean open;
    protected List<String> files = new ArrayList<String>();
    protected List<File> tmpFiles = new ArrayList<File>();

    /**
     * If this generator needs to listen to text generation events, listeners can be returned from here.
     * 
     * @return List of listeners that are to be notified when text is generated through this launch.
     * @generated not
     */
    @Override
    public List<IAcceleoTextGenerationListener> getGenerationListeners() {
        List<IAcceleoTextGenerationListener> listeners = super.getGenerationListeners();
    
        AbstractAcceleoTextGenerationListener listner = new AbstractAcceleoTextGenerationListener() {
    
            @Override
            public void filePathComputed(AcceleoTextGenerationEvent event) {
                files.add(event.getText());
            }
        };
    
        listeners.add(listner);
        return listeners;
    }

    protected void removeTmpFiles() {
        for (File file : tmpFiles) {
            file.delete();
        }
     }

    
    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

}
