package de.urszeidler.shr5.runtime.ui.dialogs;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class ProbeDialog extends TitleAreaDialog {

    public enum ProbeExecutionState {
        prepare, beforeExecute, beforeSubcommands, afterExecute
    }

    private EmfFormBuilder emfFormBuilder;
    // private FormToolkit toolkit;
    private List<EStructuralFeature> eAllStructuralFeatures;
    protected EMFDataBindingContext ctx = new EMFDataBindingContext();

    // private DataBindingContext m_bindingContext;

    private Command probe;
    private Beschreibbar desc;

    private LabelProvider labelProvider;
    private Text txtProbe;
    private String newTitle;

    private ProbeExecutionState state;

    /**
     * Create the dialog.
     * 
     * @param parentShell
     * @wbp.parser.constructor
     */
    public ProbeDialog(Shell parentShell, Command probe) {
        super(parentShell);
        setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE);
        setHelpAvailable(false);
        this.probe = probe;
        if (probe instanceof SubjectCommand) {
            SubjectCommand sc = (SubjectCommand)probe;
            desc = sc.getSubject().getCharacter().getPersona();
        }
    }

    public ProbeDialog(Shell shell, Command cmd, LabelProvider labelProvider, AdapterFactoryItemDelegator itemDelegator, ReferenceManager mananger,
            String titel, ProbeExecutionState pstate, EStructuralFeature... features) {
        this(shell, cmd);
        this.labelProvider = labelProvider;
        this.newTitle = titel + " " + labelProvider.getText(cmd.eClass());
        this.state = pstate;
        emfFormBuilder = new EmfFormBuilder(null, itemDelegator, labelProvider, null);
        emfFormBuilder.setManager(mananger);
        eAllStructuralFeatures = Arrays.asList(features);
    }

    @Override
    public boolean close() {
        emfFormBuilder.dispose();
        return super.close();
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle(newTitle);
        Composite area = (Composite)super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayout(new GridLayout(1, false));
        container.setLayoutData(new GridData(GridData.FILL_BOTH));

        setTitleImage(AdapterFactoryUtil.getInstance().getImageScaledBy(48f, desc.getImage()));
        setMessage(labelProvider.getText(probe));
        if (state == ProbeExecutionState.afterExecute || state == ProbeExecutionState.beforeSubcommands) {
            txtProbe = new Text(container, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI);
            txtProbe.setEnabled(false);
            txtProbe.setText(ShadowrunEditingTools.command2String(probe));
            GridData gd_txtProbe = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
            gd_txtProbe.heightHint = 53;
            txtProbe.setLayoutData(gd_txtProbe);
        }

        if (eAllStructuralFeatures != null && state != ProbeExecutionState.afterExecute) {
            Group grpData = new Group(container, SWT.NONE);
            grpData.setLayout(new GridLayout(3, false));
            grpData.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
            grpData.setText("probe data");

            emfFormBuilder.addAllEntries(eAllStructuralFeatures, null);
            emfFormBuilder.buildinComposite(ctx, grpData, probe);
            grpData.setSize(grpData.computeSize(SWT.DEFAULT, SWT.DEFAULT));

        }
        TreeViewer treeViewer = new TreeViewer(container, SWT.BORDER);
        Tree tree = treeViewer.getTree();
        tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

        treeViewer.setLabelProvider(labelProvider);
        treeViewer.setContentProvider(new AdapterFactoryContentProvider(AdapterFactoryUtil.getInstance().getAdapterFactory()));
        treeViewer.setInput(probe);
        // lblProbetext = new Label(container, SWT.WRAP);
        // GridData gd_lblProbetext = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 2);
        // gd_lblProbetext.heightHint = 27;
        // lblProbetext.setLayoutData(gd_lblProbetext);
        // lblProbetext.setText(labelProvider.getText(probe));
        area.setSize(area.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        return area;
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        // createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        // return super.getInitialSize();
        return new Point(450, 500);
    }

}
