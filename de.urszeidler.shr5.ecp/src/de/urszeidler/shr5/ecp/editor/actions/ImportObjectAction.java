/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.actions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
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

        // job = new Job(getJobName()) {
        // @Override
        // protected IStatus run(IProgressMonitor monitor) {
        // return doAction(monitor);
        // }
        // };
        //
        // job.setUser(true);
        // job.schedule();
        doAction(new NullProgressMonitor());
    }

    protected IStatus doAction(IProgressMonitor monitor) {
        Map<?, ?> options = new HashMap<Object, Object>();
        final URI uri = URI.createFileURI(filename);
        boolean imported = false;

        monitor.beginTask("Import modelelement...", 100);
        monitor.worked(10);
        final Shr5ResourceFactoryImpl resourceSet = new Shr5ResourceFactoryImpl();
        final XMIResource resource = (XMIResource)resourceSet.createResource(uri);
        final EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(currentEObject);
        try {
            resource.load(options);
            monitor.worked(20);
            EObject eObjectImport = resource.getContents().get(0);
            String id2 = resource.getID(eObjectImport);
            EList<EReference> allContainments = currentEObject.eClass().getEAllContainments();
            XMIResource orgResource = (XMIResource)currentEObject.eResource();
            if (orgResource.getEObject(id2) != null) {
                MessageDialog messageDialog = new MessageDialog(shell, "Object with id exist", null, String.format(
                        "%s already exist, you could replace the old one or change the id and import as a new or leave it by canceling", AdapterFactoryUtil.getInstance()
                                .getLabelProvider().getText(eObjectImport)), MessageDialog.WARNING, new String[]{ "replace", "change id",
                        "cancle" }, 1);
                int open = messageDialog.open();
                if (open == 0) {
                    EObject eObject = orgResource.getEObject(id2);
                    EObject eContainer = eObject.eContainer();
                    EStructuralFeature eContainingFeature = eObject.eContainingFeature();
                    if (eContainingFeature.isMany()) {
                        final int indexOf = ((List<?>)eContainer.eGet(eContainingFeature)).indexOf(eObject);
                        editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, eContainer, eContainingFeature, eObjectImport, indexOf));
//                        editingDomain.getCommandStack().execute(new RemoveCommand(editingDomain, eContainer, eContainingFeature, eObject));
//                        editingDomain.getCommandStack().execute(new AddCommand(editingDomain, eContainer, eContainingFeature, eObjectImport));
//                        EcoreUtil.delete(eObject);
                    } else {
                        editingDomain.getCommandStack().execute(new SetCommand(editingDomain, eContainer, eContainingFeature, eObjectImport));
                        EcoreUtil.delete(eObject);
                    }
                    imported = true;
                } else if (open == 1) {
                    eObjectImport = EcoreUtil.copy(eObjectImport);

                }else
                    return Status.OK_STATUS;

            }
            if (!imported)
                for (EReference eReference : allContainments) {
                    if (eReference.getEReferenceType().isInstance(eObjectImport)) {
                        if (eReference.isMany()) {
                            editingDomain.getCommandStack().execute(new AddCommand(editingDomain, currentEObject, eReference, eObjectImport));
                        } else {
                            editingDomain.getCommandStack().execute(new SetCommand(editingDomain, currentEObject, eReference, eObjectImport));
                        }
                        imported = true;
                        break;
                    }
                }
            if (!imported)
                return new Status(Status.WARNING, Activator.PLUGIN_ID, "No feature for import found.");
        } catch (final IOException e) {
            return Status.CANCEL_STATUS;
        } finally {
            monitor.done();
        }
        return Status.OK_STATUS;
    }

    // /**
    // * @return
    // */
    // private int doDialog() {
    // Display.getDefault().asyncExec(new Runnable() {
    // @Override
    // public void run() {
    // MessageDialog messageDialog = new MessageDialog(shell, "Object with id exist", null, "", MessageDialog.WARNING, new String[]{
    // "replace", "change id", "cancle" }, 1);
    // int open = messageDialog.open();
    // }
    // });
    //
    //
    // return open;
    // }

    protected String getJobName() {
        return String.format("importing the file %s to  %s", filename, objectName);
    }
}
