package de.urszeidler.shr5.scripting.ui.wizards;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.nebula.jface.cdatetime.CDateTimeObservableValue;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;

import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.shr5.ecp.util.List2TreeContentProvider;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.scripting.ui.Messages;

public class CombatScriptWizardPage extends WizardPage {
    private DataBindingContext m_bindingContext;
    private List<EObject> scripts;
    private List<EObject> characters;
    // private List<RuntimeCharacter> runtimeCharacters;

    private WritableValue selectedScriptContainer = new WritableValue();
    private WritableValue<String> selectedScriptName = new WritableValue<>();
    private WritableValue startDate = new WritableValue();

    private WritableList runtimeCharacters = new WritableList();

    // private ISelection selection;
    private Combo combo;
    private ComboViewer comboViewer;
    private Text txtScriptnametext;
    private TreeViewer treeViewer;
    private TreeViewer treeViewer_1;
    private CDateTime dateTime;

    /**
     * Constructor for SampleNewWizardPage.
     * 
     * @param pageName
     * @wbp.parser.constructor
     */
    public CombatScriptWizardPage() {
        super("CombatScriptWizardPage");//$NON-NLS-1$
        setTitle("combat script wizard");//$NON-NLS-1$
        setDescription("This wizard creates a new script for combat, select the enemy players, when the stript start select the player characters.");//$NON-NLS-1$
    }

    public CombatScriptWizardPage(List<EObject> scripts, List<EObject> characters, WritableValue selectedScriptContainer,
            WritableValue<String> selectedScriptName, WritableValue startCombatTurn, WritableList runtimeCharacters) {
        super("CombatScriptWizardPage");//$NON-NLS-1$
        setTitle(Messages.CombatScriptWizardPage_titel);
        setDescription(Messages.CombatScriptWizardPage_description);
        this.scripts = scripts;
        this.characters = characters;
        this.selectedScriptContainer = selectedScriptContainer;
        this.selectedScriptName = selectedScriptName;
        this.startDate = startCombatTurn;
        this.runtimeCharacters = runtimeCharacters;

    }

    /**
     * @see IDialogPage#createControl(Composite)
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        layout.verticalSpacing = 9;
        Label label = new Label(container, SWT.NULL);
        label.setText(Messages.CombatScriptWizardPage_Container);

        comboViewer = new ComboViewer(container, SWT.NONE);
        combo = comboViewer.getCombo();
        combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        Label lblScriptName = new Label(container, SWT.NONE);
        lblScriptName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblScriptName.setText(Messages.CombatScriptWizardPage_scriptName);

        comboViewer.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        comboViewer.setContentProvider(ArrayContentProvider.getInstance());
        comboViewer.setInput(scripts);

        txtScriptnametext = new Text(container, SWT.BORDER);
        txtScriptnametext.setText(Messages.CombatScriptWizardPage_defaultScriptName);
        txtScriptnametext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        Label lblDate = new Label(container, SWT.NONE);
        lblDate.setText(Messages.CombatScriptWizardPage_lblDate_text);
        
        dateTime = new CDateTime(container, CDT.DROP_DOWN | CDT.DATE_LONG | CDT.TIME_MEDIUM);
        dateTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

        Group grpEnemies = new Group(container, SWT.NONE);
        grpEnemies.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpEnemies.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
        grpEnemies.setText(Messages.CombatScriptWizardPage_enemie_group);

        SashForm sashForm = new SashForm(grpEnemies, SWT.NONE);

        Composite composite = new Composite(sashForm, SWT.NONE);
        composite.setLayout(new GridLayout(2, false));

        treeViewer_1 = new TreeViewer(composite, SWT.BORDER | SWT.MULTI);
        treeViewer_1.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        treeViewer_1.setContentProvider(new List2TreeContentProvider());
        treeViewer_1.setInput(characters);
        Tree tree_1 = treeViewer_1.getTree();
        tree_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDoubleClick(MouseEvent e) {
                addSelection();
            }
        });
        tree_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

        Composite composite_1 = new Composite(composite, SWT.NONE);
        composite_1.setLayout(new GridLayout(1, false));
        composite_1.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, false, 1, 1));

        Button btnNewButton = new Button(composite_1, SWT.NONE);
        btnNewButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addSelection();
            }
        });
        btnNewButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        btnNewButton.setSize(93, 29);
        btnNewButton.setText(Messages.CombatScriptWizardPage_add);

        Button btnNewButton_1 = new Button(composite_1, SWT.NONE);
        btnNewButton_1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                removeSelection();
            }
        });
        btnNewButton_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        btnNewButton_1.setText(Messages.CombatScriptWizardPage_remove);

        treeViewer = new TreeViewer(sashForm, SWT.BORDER | SWT.MULTI);
        treeViewer.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        treeViewer.setContentProvider(new List2TreeContentProvider());
        Tree tree = treeViewer.getTree();
        sashForm.setWeights(new int[]{ 10, 8 });
        m_bindingContext = initDataBindings();

        treeViewer_1.setInput(characters);
        treeViewer.setInput(runtimeCharacters);

        setControl(container);
        dialogChanged();
    }

    protected void removeSelection() {
        ISelection selection2 = treeViewer.getSelection();
        if (selection2 instanceof IStructuredSelection) {
            IStructuredSelection is = (IStructuredSelection)selection2;
            for (Iterator<?> i = is.iterator(); i.hasNext();) {
                EObject eObject = (EObject)i.next();
                runtimeCharacters.remove(eObject);
            }
        }
        treeViewer.setInput(runtimeCharacters);
        dialogChanged();
    }

    protected void addSelection() {
        ISelection selection2 = treeViewer_1.getSelection();
        if (selection2 instanceof IStructuredSelection) {
            IStructuredSelection is = (IStructuredSelection)selection2;
            for (Iterator<?> i = is.iterator(); i.hasNext();) {
                EObject eObject = (EObject)i.next();
                if (eObject instanceof ManagedCharacter) {
                    ManagedCharacter mc = (ManagedCharacter)eObject;
                    RuntimeCharacter character = ShadowrunEditingTools.managedCharacter2RuntimeFunction().apply(mc);
                    runtimeCharacters.add(character);
                }
            }
        }
        treeViewer.setInput(runtimeCharacters);
        dialogChanged();
    }

    /**
     * Ensures that both text fields are set.
     */

    private void dialogChanged() {
        StringBuffer buffer = new StringBuffer();
        
        if (runtimeCharacters.isEmpty())
            buffer.append(Messages.CombatScriptWizardPage_error1);
        if(selectedScriptName.getValue()==null || ((String)selectedScriptName.getValue()).isEmpty())
            buffer.append(Messages.CombatScriptWizardPage_error2);
        if(selectedScriptContainer.getValue()==null)
            buffer.append(Messages.CombatScriptWizardPage_error3);
        
        String msg = buffer.toString();
        if(msg.isEmpty())
            updateStatus(null);
        else
            updateStatus(msg);
    }

    private void updateStatus(String message) {
        setErrorMessage(message);
        setPageComplete(message == null);
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IViewerObservableValue<Object> observeSingleSelectionComboViewer = ViewerProperties.singleSelection().observe(comboViewer);
        bindingContext.bindValue(observeSingleSelectionComboViewer, selectedScriptContainer, null, null);
        //
        IObservableValue observeTextTxtScriptnametextObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(200, txtScriptnametext);
        bindingContext.bindValue(observeTextTxtScriptnametextObserveWidget, selectedScriptName, null, null);
        //
        IObservableValue observeLocationDatewidgetObserveWidget1 = new CDateTimeObservableValue(dateTime);
        bindingContext.bindValue(observeLocationDatewidgetObserveWidget1, startDate, null, null);
        //

        return bindingContext;
    }
}