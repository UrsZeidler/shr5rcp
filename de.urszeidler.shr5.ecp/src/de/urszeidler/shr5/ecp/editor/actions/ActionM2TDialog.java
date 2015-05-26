package de.urszeidler.shr5.ecp.editor.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.shr5.ecp.dialogs.ModelToTextExportDialog;

public class ActionM2TDialog extends Action {
    private Shell shell;
    private EObject theObject;

    public ActionM2TDialog(Shell shell, EObject object) {
        this.shell = shell;
        this.theObject = object;
        setToolTipText("Transform to text");
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/print_edit.gif"));
    }

    @Override
    public void run() {
        ModelToTextExportDialog toTextExportDialog = new ModelToTextExportDialog(shell, theObject);  //new ModelToTextExportDialog(shell, theObject);
        toTextExportDialog.open();
    }
}