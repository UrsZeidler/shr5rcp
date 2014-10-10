package de.urszeidler.shr5.runtime.ui.dialogs;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.PrintJob;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import java.awt.datatransfer.Clipboard;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.peer.DragSourceContextPeer;
import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.peer.ButtonPeer;
import java.awt.peer.CanvasPeer;
import java.awt.peer.CheckboxMenuItemPeer;
import java.awt.peer.CheckboxPeer;
import java.awt.peer.ChoicePeer;
import java.awt.peer.DesktopPeer;
import java.awt.peer.DialogPeer;
import java.awt.peer.FileDialogPeer;
import java.awt.peer.FontPeer;
import java.awt.peer.FramePeer;
import java.awt.peer.LabelPeer;
import java.awt.peer.ListPeer;
import java.awt.peer.MenuBarPeer;
import java.awt.peer.MenuItemPeer;
import java.awt.peer.MenuPeer;
import java.awt.peer.PanelPeer;
import java.awt.peer.PopupMenuPeer;
import java.awt.peer.ScrollPanePeer;
import java.awt.peer.ScrollbarPeer;
import java.awt.peer.TextAreaPeer;
import java.awt.peer.TextFieldPeer;
import java.awt.peer.WindowPeer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.ProbeCommand;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTest;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class ProbeDialog extends TitleAreaDialog implements Adapter {

    public enum ProbeExecutionState {
        prepare, beforeExecute, beforeSubcommands, afterExecute
    }

    private EmfFormBuilder emfFormBuilder;
    private EmfFormBuilder emfFormBuilder_skip;
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

        FormToolkit formToolkit = new FormToolkit(shell.getDisplay());

        emfFormBuilder = new EmfFormBuilder(null, itemDelegator, labelProvider, null);
        emfFormBuilder.setManager(mananger);
        emfFormBuilder_skip = new EmfFormBuilder(null, itemDelegator, labelProvider, null);
        emfFormBuilder_skip.setManager(mananger);
        eAllStructuralFeatures = new ArrayList<EStructuralFeature>(Arrays.asList(features));
    }

    @Override
    public boolean close() {
        emfFormBuilder_skip.dispose();
        emfFormBuilder.dispose();
        probe.eAdapters().remove(this);
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
        if (desc != null)
            setTitleImage(AdapterFactoryUtil.getInstance().getImageScaledBy(48f, desc.getImage()));
        setMessage(labelProvider.getText(probe));
        probe.eAdapters().add(this);
        
        if (probe instanceof SubjectCommand) {
            SubjectCommand sc = (SubjectCommand)probe;
            if(!sc.getSubject().canUseEdge()){
                eAllStructuralFeatures.remove(GameplayPackage.Literals.PROBE__PUSH_THE_LIMIT);
                eAllStructuralFeatures.remove(GameplayPackage.Literals.PROBE__SECOND_CHANCE);                
            }
        }
        
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
            grpData.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, eAllStructuralFeatures.size()));
            grpData.setText("probe data");

            emfFormBuilder.addAllEntries(eAllStructuralFeatures, null);
            emfFormBuilder.buildinComposite(ctx, grpData, probe);
            grpData.setSize(grpData.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        }
        if (state == ProbeExecutionState.prepare) {
            List<EStructuralFeature> eAllStructuralFeatures_1 = new ArrayList<EStructuralFeature>();
            eAllStructuralFeatures_1.add(GameplayPackage.Literals.PROBE__SKIP_TEST);
            eAllStructuralFeatures_1.add(GameplayPackage.Literals.PROBE__SUCCESSES);
            eAllStructuralFeatures_1.add(GameplayPackage.Literals.PROBE__GLITCHES);
            eAllStructuralFeatures_1.add(GameplayPackage.Literals.PROBE__LIMIT);
            if (probe instanceof SuccesTest) {
                eAllStructuralFeatures_1.add(GameplayPackage.Literals.SUCCES_TEST__THRESHOLDS);
            }
            Group grpData = new Group(container, SWT.NONE);
            grpData.setLayout(new GridLayout(3, false));
            grpData.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, eAllStructuralFeatures_1.size()));
            grpData.setText("skip probe");
            emfFormBuilder_skip.addAllEntries(eAllStructuralFeatures_1, null);
            emfFormBuilder_skip.buildinComposite(ctx, grpData, probe);
            grpData.setSize(grpData.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        }

        TreeViewer treeViewer = new TreeViewer(container, SWT.BORDER);
        Tree tree = treeViewer.getTree();
        GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
        layoutData.heightHint = 80;
        tree.setLayoutData(layoutData);

        treeViewer.setLabelProvider(labelProvider);
        treeViewer.setContentProvider(new AdapterFactoryContentProvider(AdapterFactoryUtil.getInstance().getAdapterFactory()));
        treeViewer.setInput(probe);

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
         Point initialSize = super.getInitialSize();
        return new Point(450, Math.max(initialSize.y, 500) );
    }

    @Override
    public void notifyChanged(Notification notification) {
        setMessage(labelProvider.getText(probe));
    }

    @Override
    public Notifier getTarget() {
        return null;
    }

    @Override
    public void setTarget(Notifier newTarget) {

    }

    @Override
    public boolean isAdapterForType(Object type) {
        return false;
    }

}
