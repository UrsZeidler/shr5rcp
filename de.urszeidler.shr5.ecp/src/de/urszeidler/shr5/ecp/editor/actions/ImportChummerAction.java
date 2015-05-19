/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.actions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
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
public class ImportChummerAction extends Action {
    protected EObject currentEObject;
    protected Shell shell;

    private String filename;
    private String objectName;
    private IDialogSettings dialogSettings;
    private String titel;

    public ImportChummerAction(Shell shell, EObject eObject) {
        super();
        this.shell = shell;
        this.currentEObject = eObject;
        IDialogSettings iDialogSettings = Activator.getDefault().getDialogSettings();
        dialogSettings = iDialogSettings.getSection(ImportChummerAction.class.getSimpleName());
        if (dialogSettings == null)
            dialogSettings = iDialogSettings.addNewSection(ImportChummerAction.class.getSimpleName());

        objectName = AdapterFactoryUtil.getInstance().getLabelProvider().getText(currentEObject);
        titel = String.format("Import a chummer file as child of %s", objectName);
        setToolTipText(String.format("Import a chummer file as child of %s", objectName));
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/import-chummer.gif"));
    }

    @Override
    public void run() {
        String path = dialogSettings.get("PATH_OPEN_CHUMMER");
        if (path == null)
            path = System.getProperty("user.dir");

        FileDialog fileDialog = new FileDialog(shell, SWT.OPEN);
        fileDialog.setFilterPath(path);
        fileDialog.setFilterExtensions(new String[]{ "*.chum5" });

        fileDialog.setText(titel);
        String newFile = fileDialog.open();

        if (newFile == null)
            return;

        filename = newFile;
        final File file = new File(filename);
        dialogSettings.put("PATH_OPEN_CHUMMER", file.getParentFile().getAbsolutePath());
        Job job = new Job("Import Chummer character") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                doImport(file);
                return Status.OK_STATUS;
            }
        };
        job.setUser(true);
        job.schedule();
    }

    /**
     * @param file
     * @throws TransformerFactoryConfigurationError
     */
    private void doImport(final File file) throws TransformerFactoryConfigurationError {
        try {
            File outFile = File.createTempFile("charcter-import", "xmi");

            StreamSource stylesource = new StreamSource(this.getClass().getResourceAsStream("ch2shr5Character.xsl"));
            Transformer transformer;
            transformer = TransformerFactory.newInstance().newTransformer(stylesource);

            Source xmlInput = new StreamSource(file);
            Result xmlOutput = new StreamResult(outFile);// new DOMResult();
            transformer.transform(xmlInput, xmlOutput);

            final URI uri = URI.createFileURI(outFile.getAbsolutePath());
            Map<Object, Object> options = new HashMap<Object, Object>();

            final Shr5ResourceFactoryImpl resourceSet = new Shr5ResourceFactoryImpl();
            final XMIResource resource = (XMIResource)resourceSet.createResource(uri);
            final EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(currentEObject);
            EList<EReference> allContainments = currentEObject.eClass().getEAllContainments();

            resource.load(options);
            EObject eObjectImport = resource.getContents().get(0);
            for (EReference eReference : allContainments) {
                if (eReference.getEReferenceType().isInstance(eObjectImport)) {
                    if (eReference.isMany()) {
                        editingDomain.getCommandStack().execute(new AddCommand(editingDomain, currentEObject, eReference, eObjectImport));
                    } else {
                        editingDomain.getCommandStack().execute(new SetCommand(editingDomain, currentEObject, eReference, eObjectImport));
                    }
                    break;
                }
            }
        } catch (Exception e) {
            Activator.logError(e);
        }
    }
}
