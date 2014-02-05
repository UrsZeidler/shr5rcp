/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.pages;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.DiagnosticComposite;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.emf.databinding.edit.EMFEditObservables;

import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.shr5.ecp.printer.PersonaPrinter;

import org.eclipse.core.databinding.UpdateValueStrategy;

/**
 * @author urs
 */
public class FreeStyleGeneratorPage extends AbstractGeneratorPage {

    private FreeStyleGenerator object;
    private EditingDomain editingDomain;
    private DataBindingContext m_bindingContext;

    // private EClass selectedType = null;
    // private Spezies selectedSpecies = null;
    // private AbstraktPersona selectedPersona = null;
    private Button btnPlayerButton;
    private ToolItem tltmNewItem;
    private ToolItem tltmCommit;
    private ToolItem restItem;
    private ToolItem tltmChoose;
    private Section sctnChoose;
    private Section sctnCreate;
    private DiagnosticComposite diagnosticComposite;
    private Label lblInstruction;
    private IObservableValue selectedType;

    public FreeStyleGeneratorPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    /**
     * The main constructor.
     * 
     * @param editor
     * @param id
     * @param title
     * @param object
     * @param editingDomain
     * @param manager
     */
    public FreeStyleGeneratorPage(FormEditor editor, String id, String title, FreeStyleGenerator object, EditingDomain editingDomain,
            ReferenceManager manager) {
        super(editor, id, title, manager);
        this.object = object;
        this.editingDomain = editingDomain;
        context = createValidationContext();
    }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().setEnabled(object.getState() != GeneratorState.COMMITED);

        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        ToolBar toolBar = new ToolBar(managedForm.getForm().getBody(), SWT.FLAT | SWT.RIGHT | SWT.SHADOW_OUT);
        managedForm.getToolkit().adapt(toolBar);
        managedForm.getToolkit().paintBordersFor(toolBar);

        tltmChoose = new ToolItem(toolBar, SWT.NONE);
        tltmChoose.setText("1. choose");

        tltmNewItem = new ToolItem(toolBar, SWT.NONE);
        tltmNewItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                createManagedCharacter();

            }
        });
        tltmNewItem.setText("2. create");

        tltmCommit = new ToolItem(toolBar, SWT.NONE);
        tltmCommit.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                commitCharacter();
            }
        });
        tltmCommit.setText("3. commit");

        restItem = new ToolItem(toolBar, SWT.NONE);
        restItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                resetCharacter(object);
            }
        });
        restItem.setText("reset");

        Group grpOverview = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpOverview.setLayout(new GridLayout(1, false));
        grpOverview.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        grpOverview.setText("Overview");
        managedForm.getToolkit().adapt(grpOverview);
        managedForm.getToolkit().paintBordersFor(grpOverview);

        Composite composite_overview = managedForm.getToolkit().createComposite(grpOverview, SWT.NONE);
        composite_overview.setLayout(new GridLayout(3, false));
        composite_overview.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite_overview);

        Composite composite_1 = managedForm.getToolkit().createComposite(grpOverview, SWT.NONE);
        composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite_1);

        lblInstruction = managedForm.getToolkit().createLabel(composite_1, "ttt", SWT.NONE);

        sctnChoose = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnChoose.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnChoose);
        sctnChoose.setText("1. choose");
        sctnChoose.setExpanded(true);

        Composite grpAuswahl = new Composite(sctnChoose, SWT.NONE);
        sctnChoose.setClient(grpAuswahl);
        grpAuswahl.setLayout(new GridLayout(2, false));
        managedForm.getToolkit().adapt(grpAuswahl);
        managedForm.getToolkit().paintBordersFor(grpAuswahl);

        Composite grpTyp = new Composite(grpAuswahl, SWT.NONE);
        managedForm.getToolkit().adapt(grpTyp);
        managedForm.getToolkit().paintBordersFor(grpTyp);
        grpTyp.setLayout(new GridLayout(1, false));

        btnPlayerButton = new Button(grpTyp, SWT.RADIO);
        btnPlayerButton.setSelection(true);
        managedForm.getToolkit().adapt(btnPlayerButton, true, true);
        btnPlayerButton.setText("Player");

        Button btnRadioButton_1 = new Button(grpTyp, SWT.RADIO);
        managedForm.getToolkit().adapt(btnRadioButton_1, true, true);
        btnRadioButton_1.setText("None player");

        Composite compositePrio = new Composite(grpAuswahl, SWT.NONE);
        compositePrio.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        compositePrio.setLayout(new GridLayout(3, false));
        managedForm.getToolkit().adapt(compositePrio);
        managedForm.getToolkit().paintBordersFor(compositePrio);

        Label lblType = new Label(compositePrio, SWT.NONE);
        managedForm.getToolkit().adapt(lblType, true, true);
        lblType.setText("Type");

        final ImageHyperlink mghprlnkNewImagehyperlink_1 = managedForm.getToolkit().createImageHyperlink(compositePrio, SWT.NONE);
        mghprlnkNewImagehyperlink_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
        mghprlnkNewImagehyperlink_1.addHyperlinkListener(new IHyperlinkListener() {
            public void linkActivated(HyperlinkEvent e) {
                handleType();
                mghprlnkNewImagehyperlink_1.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(selectedType.getValue()));
                mghprlnkNewImagehyperlink_1.setImage(AdapterFactoryUtil.getInstance().getLabelProvider().getImage(selectedType.getValue()));

                validateChange();
            }

            public void linkEntered(HyperlinkEvent e) {
            }

            public void linkExited(HyperlinkEvent e) {
            }
        });
        managedForm.getToolkit().paintBordersFor(mghprlnkNewImagehyperlink_1);
        mghprlnkNewImagehyperlink_1.setText("[null]");

        Composite composite_group = new Composite(grpAuswahl, SWT.NONE);
        composite_group.setLayout(new GridLayout(3, false));
        composite_group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        managedForm.getToolkit().adapt(composite_group);
        managedForm.getToolkit().paintBordersFor(composite_group);

        sctnCreate = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnCreate);
        sctnCreate.setText("2. create");
        sctnCreate.setExpanded(true);

        Composite composite_3 = managedForm.getToolkit().createComposite(sctnCreate, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_3);
        sctnCreate.setClient(composite_3);
        composite_3.setLayout(new GridLayout(3, false));

        Group grpValidation = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpValidation.setLayout(new FillLayout(SWT.HORIZONTAL));
        GridData gd_grpValidation = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
        gd_grpValidation.heightHint = 150;
        grpValidation.setLayoutData(gd_grpValidation);
        grpValidation.setText("Validation");
        managedForm.getToolkit().adapt(grpValidation);
        managedForm.getToolkit().paintBordersFor(grpValidation);

        diagnosticComposite = new DiagnosticComposite(grpValidation, SWT.NONE);
        diagnosticComposite.setSeverityMask(Diagnostic.ERROR | Diagnostic.INFO | Diagnostic.WARNING);
        diagnosticComposite.setShowRootDiagnostic(false);
        diagnosticComposite.initialize(null);
        managedForm.getToolkit().adapt(diagnosticComposite);
        managedForm.getToolkit().paintBordersFor(diagnosticComposite);

        m_bindingContext = initDataBindings();
        // --------------
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_GENERATOR__SELECTED_GROUP, composite_group);

        emfFormBuilder.addTextEntry( Shr5managementPackage.Literals.CHARACTER_GENERATOR__CHARACTER_NAME, composite_overview);
        emfFormBuilder.addTextEntry( Shr5managementPackage.Literals.CHARACTER_GENERATOR__GENERATOR, composite_overview);

        emfFormBuilder.addTextEntry( Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__SELECTED_SPECIES, compositePrio);
        emfFormBuilder.addSeperatorEntry(compositePrio);
        emfFormBuilder.addTextEntry( Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__SELECTED_PERSONA, compositePrio);

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);

        managedForm.reflow(true);
        if (!object.eAdapters().contains(this))
            object.eAdapters().add(this);
        if (object.getCharacter() != null && object.getCharacter().getPersona() != null) {
            addPersonaPage(object.getCharacter());
        }
        validateChange();
        selectedType = EMFEditObservables.observeValue(editingDomain, object, Literals.FREE_STYLE_GENERATOR__SELECTED_TYPE);

    }

    /**
     * Commit the character.
     */
    protected void commitCharacter() {
        object.setState(GeneratorState.COMMITED);
        validateChange();

    }

    /**
     * Choose the persona type.
     */
    protected void handleType() {
        Collection<EClass> filteredEClasses = new HashSet<EClass>();
        Collection<?> newChildDescriptors = AdapterFactoryUtil.getInstance().getItemDelegator()
                .getNewChildDescriptors(Shr5managementFactory.eINSTANCE.createPlayerCharacter(), editingDomain, null);
        for (Object object2 : newChildDescriptors) {
            if (object2 instanceof CommandParameter) {
                CommandParameter cp = (CommandParameter)object2;
                if (cp.feature.equals(Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA))
                    filteredEClasses.add(((EObject)cp.value).eClass());
            }

        }

        OwnChooseDialog dialog = new OwnChooseDialog(getEditorSite().getShell(), filteredEClasses.toArray(new Object[]{}), "Select type",
                "Choose a persona type.");
        dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0)
                selectedType.setValue((EClass)result[0]);
            else
                selectedType.setValue(null);
        }

    }

    protected void createManagedCharacter() {
        AbstraktPersona selectedPersona = object.getSelectedPersona();
        if (selectedPersona != null) {
            ManagedCharacter playerCharacter;
            if (btnPlayerButton.getSelection())
                playerCharacter = Shr5managementFactory.eINSTANCE.createPlayerCharacter();
            else
                playerCharacter = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();

            AbstraktPersona persona = EcoreUtil.copy(selectedPersona);

            playerCharacter.setPersona(persona);
            persona.setName(object.getCharacterName());

            object.setState(GeneratorState.PERSONA_CREATED);
            object.getSelectedGroup().getMembers().add(playerCharacter);
            object.setCharacter(playerCharacter);

        } else {
            createManagedCharacter((EClass)selectedType.getValue(), object.getSelectedSpecies(), btnPlayerButton.getSelection(), object);
        }
        addPersonaPage(object.getCharacter());

    }

    /**
     * Validates the changes.
     */
    @Override
    protected void validateChange() {
        if (object.getState() == GeneratorState.COMMITED) {
            tltmNewItem.setEnabled(false);
            tltmChoose.setEnabled(false);
            tltmCommit.setEnabled(false);
            restItem.setEnabled(false);

            // grpAuswahl.setEnabled(false);
            sctnCreate.setEnabled(false);
            return;
        }

        Diagnostic validate = Diagnostician.INSTANCE.validate(object, context);
        List<Diagnostic> children = validate.getChildren();
        for (Diagnostic diagnostic : children) {
            updateGeneratorState(diagnostic, object);
        }
        if (object.getSelectedPersona() == null && object.getSelectedType() == null && object.getSelectedSpecies() == null)
            object.setState(GeneratorState.NEW);
        else if ((object.getSelectedType() != null && object.getSelectedSpecies() != null) && (object.getSelectedPersona() != null))
            object.setState(GeneratorState.NEW);
        else if ((object.getSelectedType() == null || object.getSelectedSpecies() == null) && (object.getSelectedPersona() == null))
            object.setState(GeneratorState.NEW);

        tltmNewItem.setEnabled(object.getState() == GeneratorState.READY_FOR_CREATION);
        tltmChoose.setEnabled(object.getState() == GeneratorState.NEW);
        tltmCommit.setEnabled(object.getState() == GeneratorState.PERSONA_CREATED);// && validate.getChildren().isEmpty());

        sctnChoose.setExpanded(object.getState() == GeneratorState.NEW || object.getState() == GeneratorState.READY_FOR_CREATION);
        sctnCreate.setExpanded(object.getState() == GeneratorState.PERSONA_CREATED);
        // grpAuswahl.setEnabled(object.getState() == GeneratorState.NEW || object.getState() == GeneratorState.READY_FOR_CREATION);
        diagnosticComposite.setDiagnostic(validate);
        diagnosticComposite.update();

    }

    @Override
    protected boolean notificationIsRequierd(Notification notification) {
        return true;
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }

    @Override
    public void dispose() {
        if (object != null)
            object.eAdapters().remove(this);

        super.dispose();
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextLblInstructionObserveWidget = WidgetProperties.text().observe(lblInstruction);
        IObservableValue objectCurrentInstructionObserveValue = EMFEditObservables.observeValue(editingDomain, object,
                Literals.CHARACTER_GENERATOR__CURRENT_INSTRUCTION);
        bindingContext.bindValue(observeTextLblInstructionObserveWidget, objectCurrentInstructionObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), null);

        //
        return bindingContext;
    }
}
