package de.urszeidler.shr5.runtime.ui.dialogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
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

import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.ProbeCommand;
import de.urszeidler.eclipse.shr5.gameplay.ProbeState;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTest;
import de.urszeidler.eclipse.shr5.gameplay.provider.util.GameplayEditTools;
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

        configerEdgeOption();
        removeSettedReferences();
        validateCommand();

        if (state == ProbeExecutionState.afterExecute || state == ProbeExecutionState.beforeSubcommands) {
            txtProbe = new Text(container, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI);
            txtProbe.setEnabled(false);
            txtProbe.setText(ShadowrunEditingTools.command2String(probe));
            GridData gd_txtProbe = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
            gd_txtProbe.heightHint = 34;
            txtProbe.setLayoutData(gd_txtProbe);
        }

        if (eAllStructuralFeatures != null && state != ProbeExecutionState.afterExecute) {
            Group grpData = new Group(container, SWT.NONE);
            grpData.setLayout(new GridLayout(3, false));
            grpData.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, eAllStructuralFeatures.size()));
            grpData.setText(Messages.ProbeDialog_probe_data_section);

            emfFormBuilder.addAllEntries(eAllStructuralFeatures, null);
            emfFormBuilder.buildinComposite(ctx, grpData, probe);
            grpData.setSize(grpData.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        }
        //TODO : 
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
            grpData.setText(Messages.ProbeDialog_skip_probe_section);
            emfFormBuilder_skip.addAllEntries(eAllStructuralFeatures_1, null);
            emfFormBuilder_skip.buildinComposite(ctx, grpData, probe);
            grpData.setSize(grpData.computeSize(SWT.DEFAULT, SWT.DEFAULT));

            txtProbe = new Text(container, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI);
            txtProbe.setEnabled(false);
            // txtProbe.setText(GameplayEditTools.probe2ProbeString((Probe)probe));
            GridData gd_txtProbe = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
            gd_txtProbe.heightHint = 34;
            txtProbe.setLayoutData(gd_txtProbe);
        }

        TreeViewer treeViewer = new TreeViewer(container, SWT.BORDER);
        Tree tree = treeViewer.getTree();
        GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
        layoutData.heightHint = 60;
        tree.setLayoutData(layoutData);

        treeViewer.setLabelProvider(labelProvider);
        treeViewer.setContentProvider(new AdapterFactoryContentProvider(AdapterFactoryUtil.getInstance().getAdapterFactory()));
        treeViewer.setInput(probe);

        area.setSize(area.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        return area;
    }

    private void removeSettedReferences() {
//        Iterator<EStructuralFeature> iterator = eAllStructuralFeatures.iterator();
        for ( Iterator<EStructuralFeature> iterator = eAllStructuralFeatures.iterator(); iterator.hasNext();) {
            EStructuralFeature fearure = iterator.next();            
             if (fearure instanceof EReference) {
                EReference er = (EReference)fearure;
                Object eGet = probe.eGet(er);
                if(eGet!=null)
                    iterator.remove();
            }
        }
    }

    /**
     * 
     */
    protected void configerEdgeOption() {
        if (probe instanceof SubjectCommand) {
            SubjectCommand sc = (SubjectCommand)probe;
            if (!sc.getSubject().canUseEdge()) {
                eAllStructuralFeatures.remove(GameplayPackage.Literals.PROBE__PUSH_THE_LIMIT);
                eAllStructuralFeatures.remove(GameplayPackage.Literals.PROBE__SECOND_CHANCE);
            } else {
                if (probe instanceof ProbeCommand) {
                    ProbeCommand pc = (ProbeCommand)probe;
                    if (pc.getProbeState() != ProbeState.CRITICAL_GLITCH)
                        eAllStructuralFeatures.remove(GameplayPackage.Literals.PROBE__CLOSE_CALL);
                    if (pc.isPushTheLimit()) {
                        eAllStructuralFeatures.remove(GameplayPackage.Literals.PROBE__SECOND_CHANCE);
                        eAllStructuralFeatures.remove(GameplayPackage.Literals.PROBE__CLOSE_CALL);
                    }
                    if (pc.isSecondChance())
                        eAllStructuralFeatures.remove(GameplayPackage.Literals.PROBE__CLOSE_CALL);
                }
            }
        }
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
//        if (state == ProbeExecutionState.prepare)
//            createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        Point initialSize = super.getInitialSize();
        return new Point(450, Math.max(initialSize.y, 500));
    }

    @Override
    public void notifyChanged(Notification notification) {
        setMessage(labelProvider.getText(probe));
        
        validateCommand();
            
        if (txtProbe != null)
            txtProbe.setText(GameplayEditTools.probe2ProbeString((Probe)probe));
    }

    /**
     * 
     */
    private void validateCommand() {
        Diagnostic validate = Diagnostician.INSTANCE.validate(probe, Collections.EMPTY_MAP);
        if(!validate.getChildren().isEmpty()){
            final String message = Joiner.on("\n").join(
                    FluentIterable.from(validate.getChildren()).transform(ShadowrunEditingTools.diagnosticToStringTransformer()));
            setErrorMessage(message);
        }else
            setErrorMessage(null);
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
