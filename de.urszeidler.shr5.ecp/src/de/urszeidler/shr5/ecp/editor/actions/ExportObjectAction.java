/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.actions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.Shr5ResourceFactoryImpl;
import de.urszeidler.shr5.ecp.Activator;

/**
 * @author urs
 */
public class ExportObjectAction extends Action{
    protected EObject currentEObject;
    protected Shell shell;
    private Job job;

    private String filename;
    private String objectName;
    private IDialogSettings dialogSettings;
    private String titel;

    public ExportObjectAction(Shell shell, EObject eObject) {
        super();
        this.shell = shell;
        this.currentEObject = eObject;
        IDialogSettings iDialogSettings = Activator.getDefault().getDialogSettings();        
        dialogSettings = iDialogSettings.getSection(ExportObjectAction.class.getSimpleName());
        if(dialogSettings==null)
            dialogSettings = iDialogSettings.addNewSection(ExportObjectAction.class.getSimpleName());
        
        objectName = AdapterFactoryUtil.getInstance().getLabelProvider().getText(currentEObject);
        titel = String.format("Save the object %s", objectName);
        setToolTipText(String.format("Export the object %s", objectName));
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/export.gif"));
    }

    @Override
    public void run() {        
        String path = dialogSettings.get("PATH");
        if(path==null)
            path = System.getProperty("user.dir");
        
        FileDialog fileDialog = new FileDialog(shell,SWT.SAVE);
        fileDialog.setFileName(objectName+".xmi");
        fileDialog.setFilterPath(path);
        fileDialog.setFilterExtensions(new String[]{"*.xmi"});
//        fileDialog.setFilterNames(new String[]{"shr5 files"});
        
        fileDialog.setText(titel);
        String newFile = fileDialog.open();
        
        if(newFile==null)
            return ;//Status.CANCEL_STATUS;
        
        filename = newFile;
        final File file = new File(filename);
        dialogSettings.put("PATH", file.getParentFile().getAbsolutePath());
        
        job = new Job(getJobName()) {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                return doAction(monitor);
            }
        };
        
        job.setUser(true);
        job.schedule();
    }
    
    
    protected IStatus doAction(IProgressMonitor monitor) {
        Map<?, ?> options = new HashMap<Object,Object>();
        final URI uri = URI.createFileURI(filename);

        monitor.beginTask("Export modelelement...", 100); 
        monitor.worked(10);
       
        Copier copier = new Copier();
        EObject copy = copier.copy(currentEObject);
        copier.copyReferences();
        XMIResource eResource = (XMIResource)currentEObject.eResource();
        
        monitor.worked(20);
        try {
            final Shr5ResourceFactoryImpl resourceSet = new Shr5ResourceFactoryImpl();
            final XMIResource resource = (XMIResource)resourceSet.createResource(uri);
            resource.getContents().add(copy);
            Set<Entry<EObject, EObject>> entrySet = copier.entrySet();
            for (Entry<EObject, EObject> entry : entrySet) {
                String id = eResource.getID(entry.getKey());
                resource.setID(entry.getValue(), id);
            }
            monitor.worked(30);           
            resource.save(options);
        } catch (final IOException e) {
            return Status.CANCEL_STATUS;
        }
        monitor.done();
        return Status.OK_STATUS;
    }


    protected String getJobName() {
        return String.format("exporting %s to the file %s", objectName, filename);
    }
}
