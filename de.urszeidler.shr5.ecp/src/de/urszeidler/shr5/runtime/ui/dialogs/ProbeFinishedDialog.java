package de.urszeidler.shr5.runtime.ui.dialogs;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.layout.TreeColumnLayout;

public class ProbeFinishedDialog extends TitleAreaDialog {
    private DataBindingContext m_bindingContext;

    private Command probe;
    private Beschreibbar desc;
 
    private LabelProvider labelProvider;
    private Text txtProbe;

    /**
     * Create the dialog.
     * @param parentShell
     * @wbp.parser.constructor
     */
    public ProbeFinishedDialog(Shell parentShell,Command probe) {
        super(parentShell);
        setShellStyle(SWT.TITLE);
        setHelpAvailable(false);
        this.probe = probe;
        if (probe instanceof SubjectCommand) {
            SubjectCommand sc = (SubjectCommand)probe;
            desc = sc.getSubject().getCharacter().getPersona();
        }
    }

    public ProbeFinishedDialog(Shell shell, Command cmd, LabelProvider labelProvider) {
        this(shell, cmd);
        this.labelProvider = labelProvider;
    }

    /**
     * Create contents of the dialog.
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle("Probe finished");
        Composite area = (Composite)super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayout(new GridLayout(1, false));
        container.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        setTitleImage(AdapterFactoryUtil.getInstance().getImageScaledBy(48f, desc.getImage()));
        setMessage(labelProvider.getText(probe));
         
        txtProbe = new Text(container, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI);
        txtProbe.setEnabled(false);
        txtProbe.setText(ShadowrunEditingTools.command2String(probe));
        GridData gd_txtProbe = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
        gd_txtProbe.heightHint = 53;
        txtProbe.setLayoutData(gd_txtProbe);
        
        TreeViewer treeViewer = new TreeViewer(container, SWT.BORDER);
        Tree tree = treeViewer.getTree();
        tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        
        treeViewer.setLabelProvider(labelProvider);
        treeViewer.setContentProvider(new AdapterFactoryContentProvider(AdapterFactoryUtil.getInstance().getAdapterFactory()));
        treeViewer.setInput(probe);
//        lblProbetext = new Label(container, SWT.WRAP);
//        GridData gd_lblProbetext = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 2);
//        gd_lblProbetext.heightHint = 27;
//        lblProbetext.setLayoutData(gd_lblProbetext);
//        lblProbetext.setText(labelProvider.getText(probe));
        
 
        return area;
    }

    /**
     * Create contents of the button bar.
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        //createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 300);
    }

}
