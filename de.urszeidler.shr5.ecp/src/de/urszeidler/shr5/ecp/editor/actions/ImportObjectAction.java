/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.actions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
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
public class ImportObjectAction extends Action {
    protected EObject currentEObject;
    protected Shell shell;
    private Job job;

    private String filename;
    private String objectName;
    private IDialogSettings dialogSettings;
    private String titel;

    public ImportObjectAction(Shell shell, EObject eObject) {
        super();
        this.shell = shell;
        this.currentEObject = eObject;
        IDialogSettings iDialogSettings = Activator.getDefault().getDialogSettings();
        dialogSettings = iDialogSettings.getSection(ImportObjectAction.class.getSimpleName());
        if (dialogSettings == null)
            dialogSettings = iDialogSettings.addNewSection(ImportObjectAction.class.getSimpleName());

        objectName = AdapterFactoryUtil.getInstance().getLabelProvider().getText(currentEObject);
        titel = String.format("Load a file as child of %s", objectName);
        setToolTipText(String.format("Import as child of %s", objectName));
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/import.gif"));
    }

    @Override
    public void run() {
        String path = dialogSettings.get("PATH_OPEN");
        if (path == null)
            path = System.getProperty("user.dir");

        FileDialog fileDialog = new FileDialog(shell, SWT.OPEN);
        // fileDialog.setFileName(objectName+".xmi");
        fileDialog.setFilterPath(path);
        fileDialog.setFilterExtensions(new String[]{ "*.xmi" });
        // fileDialog.setFilterNames(new String[]{"shr5 files"});

        fileDialog.setText(titel);
        String newFile = fileDialog.open();

        if (newFile == null)
            return;// Status.CANCEL_STATUS;

        filename = newFile;
        final File file = new File(filename);
        dialogSettings.put("PATH_OPEN", file.getParentFile().getAbsolutePath());

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
        Map<?, ?> options = new HashMap<Object, Object>();
        final URI uri = URI.createFileURI(filename);

        monitor.beginTask("Import modelelement...", 100);
        monitor.worked(10);
        final Shr5ResourceFactoryImpl resourceSet = new Shr5ResourceFactoryImpl();
        final XMIResource resource = (XMIResource)resourceSet.createResource(uri);
        final EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(currentEObject);
        try {
            resource.load(options);
            monitor.worked(20);
            final EObject eObjectImport = resource.getContents().get(0);
            EList<EReference> allContainments = currentEObject.eClass().getEAllContainments();
            for (EReference eReference : allContainments) {
                if (eReference.getEReferenceType().isInstance(eObjectImport)) {
                    if (eReference.isMany()) {
                        editingDomain.getCommandStack().execute(new AddCommand(editingDomain, currentEObject, eReference, eObjectImport));
                    } else {
                        editingDomain.getCommandStack().execute(new SetCommand(editingDomain, currentEObject, eReference, eObjectImport));
                    }
                }
            }
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
