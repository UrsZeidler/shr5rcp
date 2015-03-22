/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.pages.generator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.fieldassist.ControlDecoration;
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
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.editor.widgets.ResourceGeneratorOption;

/**
 * @author urs
 */
public class Shr5KarmaGeneratorPage extends AbstractGeneratorPage {

    protected static final String EMPTY = ""; //$NON-NLS-1$
    private Shr5KarmaGenerator object;// = Shr5managementFactory.eINSTANCE.createShr5KarmaGenerator();
    private EditingDomain editingDomain;
    private DataBindingContext m_bindingContext;

    private Button btnPlayerButton;
    private ToolItem tltmNewItem;
    private ToolItem tltmCommit;
    private ToolItem restItem;
    private ToolItem tltmChoose;
    private Section sctnChoose;
    private Section sctnCreate;
    // private DiagnosticComposite diagnosticComposite;
    private Label lblInstruction;
    private Spinner spinner;
    private Label lblPhasestate;
    private Label lblKarmaToResorcen;
    private Label lblKarmaSpend;
    private ResourceGeneratorOption resourceGeneratorOption;
    private boolean optionWidgetsCreated;
    private Resourcen resourcen;
    private Group grpResources;
    private Set<String> changeSet;

    public Shr5KarmaGeneratorPage(FormEditor editor, String id, String title) {
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
    public Shr5KarmaGeneratorPage(FormEditor editor, String id, String title, Shr5KarmaGenerator object, EditingDomain editingDomain,
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
        tltmChoose.setText(Messages.GeneratorPage_Step_One);
        tltmChoose.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/btn_1.png")); //$NON-NLS-1$ //$NON-NLS-2$
        tltmChoose.setToolTipText(Messages.Shr5KarmaGeneratorPage_Step_One_tooltip);

        tltmNewItem = new ToolItem(toolBar, SWT.NONE);
        tltmNewItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                createManagedCharacter();

            }
        });
        tltmNewItem.setText(Messages.GeneratorPage_Step_Two);
        tltmNewItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/btn_2.png")); //$NON-NLS-1$ //$NON-NLS-2$
        tltmNewItem.setToolTipText(Messages.GeneratorPage_Step_Two_tooltip);

        tltmCommit = new ToolItem(toolBar, SWT.NONE);
        tltmCommit.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                commitCharacter();
            }
        });
        tltmCommit.setText(Messages.GeneratorPage_Step_Three);
        tltmCommit.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/btn_3.png")); //$NON-NLS-1$ //$NON-NLS-2$
        tltmCommit.setToolTipText(Messages.GeneratorPage_Step_Tree_tooltip);

        restItem = new ToolItem(toolBar, SWT.NONE);
        restItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                resetCharacter(object);
            }
        });
        restItem.setText(Messages.GeneratorPage_reset);
        restItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/btn_4.png")); //$NON-NLS-1$ //$NON-NLS-2$
        restItem.setToolTipText(Messages.GeneratorPage_Reset_tooltip);

        Group grpOverview = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpOverview.setLayout(new GridLayout(1, false));
        grpOverview.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        grpOverview.setText(Messages.GeneratorPage_overview);
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

        lblInstruction = managedForm.getToolkit().createLabel(composite_1, "ttt", SWT.NONE); //$NON-NLS-1$

        sctnChoose = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnChoose.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnChoose);
        sctnChoose.setText(Messages.GeneratorPage_Step_One);
        sctnChoose.setExpanded(true);

        Composite grpAuswahl = new Composite(sctnChoose, SWT.NONE);
        sctnChoose.setClient(grpAuswahl);
        grpAuswahl.setLayout(new GridLayout(3, false));
        managedForm.getToolkit().adapt(grpAuswahl);
        managedForm.getToolkit().paintBordersFor(grpAuswahl);

        Composite grpTyp = new Composite(grpAuswahl, SWT.NONE);
        managedForm.getToolkit().adapt(grpTyp);
        managedForm.getToolkit().paintBordersFor(grpTyp);
        grpTyp.setLayout(new GridLayout(1, false));

        btnPlayerButton = new Button(grpTyp, SWT.RADIO);
        btnPlayerButton.setSelection(true);
        managedForm.getToolkit().adapt(btnPlayerButton, true, true);
        btnPlayerButton.setText(Messages.GeneratorPage_player);

        Button btnRadioButton_1 = new Button(grpTyp, SWT.RADIO);
        managedForm.getToolkit().adapt(btnRadioButton_1, true, true);
        btnRadioButton_1.setText(Messages.GeneratorPage_non_player);

        Composite compositePrio = new Composite(grpAuswahl, SWT.NONE);
        compositePrio.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        compositePrio.setLayout(new GridLayout(3, false));
        managedForm.getToolkit().adapt(compositePrio);
        managedForm.getToolkit().paintBordersFor(compositePrio);
        
        Composite compositeAllowedSource = new Composite(grpAuswahl, SWT.NONE);
        compositeAllowedSource.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        compositeAllowedSource.setLayout(new GridLayout(1, false));
        managedForm.getToolkit().adapt(compositeAllowedSource);
        managedForm.getToolkit().paintBordersFor(compositeAllowedSource);


        Composite composite_group = new Composite(grpAuswahl, SWT.NONE);
        composite_group.setLayout(new GridLayout(3, false));
        composite_group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        managedForm.getToolkit().adapt(composite_group);
        managedForm.getToolkit().paintBordersFor(composite_group);

        sctnCreate = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnCreate);
        sctnCreate.setText(Messages.GeneratorPage_Step_Two);
        sctnCreate.setExpanded(true);

        Composite composite_3 = managedForm.getToolkit().createComposite(sctnCreate, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_3);
        sctnCreate.setClient(composite_3);
        composite_3.setLayout(new GridLayout(3, false));

        managedForm.getToolkit().createLabel(composite_3, Messages.GeneratorPage_phase, SWT.NONE);

        lblPhasestate = managedForm.getToolkit().createLabel(composite_3, "phase_State", SWT.NONE); //$NON-NLS-1$
        GridData gd_lblPhasestate = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
        gd_lblPhasestate.widthHint = 150;
        lblPhasestate.setLayoutData(gd_lblPhasestate);

        lblKarmaToResorcen = new Label(composite_3, SWT.NONE);
        managedForm.getToolkit().adapt(lblKarmaToResorcen, true, true);
        lblKarmaToResorcen.setText(Messages.GeneratorPage_karma2Resource);

        spinner = new Spinner(composite_3, SWT.BORDER);
        GridData gd_spinner = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_spinner.widthHint = 40;
        spinner.setLayoutData(gd_spinner);
        managedForm.getToolkit().adapt(spinner);
        managedForm.getToolkit().paintBordersFor(spinner);

        ControlDecoration controlDecorationKarma = new ControlDecoration(spinner, SWT.LEFT | SWT.TOP);
        controlDecorationKarma.setDescriptionText("Some description"); //$NON-NLS-1$

        lblKarmaSpend = new Label(composite_3, SWT.NONE);
        GridData gd_lblKarmaSpend = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        gd_lblKarmaSpend.widthHint = 60;
        lblKarmaSpend.setLayoutData(gd_lblKarmaSpend);
        managedForm.getToolkit().adapt(lblKarmaSpend, true, true);
        lblKarmaSpend.setText("New Label"); //$NON-NLS-1$

        resourcen = Shr5managementFactory.eINSTANCE.createResourcen();
        resourcen.setResource(0);

        grpResources = new Group(composite_3, SWT.NONE);
        grpResources.setLayout(new GridLayout(3, false));
        grpResources.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
        grpResources.setText(Messages.Shr5KarmaGeneratorPage_grpResources_text);
        managedForm.getToolkit().adapt(grpResources);
        managedForm.getToolkit().paintBordersFor(grpResources);
        new Label(composite_3, SWT.NONE);
        new Label(composite_3, SWT.NONE);
        new Label(composite_3, SWT.NONE);

        m_bindingContext = initDataBindings();
        // --------------
        ownBinding(m_bindingContext);
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_GENERATOR__SELECTED_GROUP, composite_group);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_GENERATOR__CHARACTER_NAME, composite_overview);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_GENERATOR__GENERATOR, composite_overview);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.KARMA_GENERATOR__META_TYPE, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.KARMA_GENERATOR__CHARACTER_CONCEPT, compositePrio);
        emfFormBuilder.addSeperatorEntry(compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.KARMA_GENERATOR__CHOISE_KARMA_COST, compositePrio, new LabelEntry());

        // emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__SELECTED_PERSONA, compositePrio);
        GridData controlGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 3);
        controlGridData.heightHint = 150;
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_RULE_GENERATOR__ALLOWED_SOURCES, compositeAllowedSource, controlGridData);

        
        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);

        managedForm.reflow(true);
        if (!object.eAdapters().contains(this))
            object.eAdapters().add(this);
        if (object.getCharacter() != null && object.getCharacter().getPersona() != null && object.getState() != GeneratorState.COMMITED) {
            addPersonaPage(object.getCharacter());
        }
        validateChange();
    }

    /**
     * Commit the character.
     */
    protected void commitCharacter() {
        if (!openDefaultCommitMessageDialog())
            return;

        moveGeneratorToCharacterCommit();
        validateChange();

    }

    /**
     * 
     */
    protected void moveGeneratorToCharacterCommit() {
        CompoundCommand command = new CompoundCommand();
        command.append(SetCommand.create(getEditingDomain(), object, Shr5managementPackage.Literals.CHARACTER_GENERATOR__STATE,
                GeneratorState.COMMITED));
        command.append(SetCommand.create(getEditingDomain(), object.getCharacter(), Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC,
                object));

        getEditingDomain().getCommandStack().execute(command);
    }

    protected void createManagedCharacter() {
        createManagedCharacter(object.getCharacterConcept().getSelectableTypes(), object.getMetaType().getChoosableTypes(),
                btnPlayerButton.getSelection(), object);
        addPersonaPage(object.getCharacter());
//        createOptionWidgets();
        validateChange();


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
        Set<String> newChangeset = new HashSet<String>();
        List<Diagnostic> children = validate.getChildren();
        for (Diagnostic diagnostic : children) {
            updateGeneratorState(diagnostic, object);
            newChangeset.add(diagnostic.getMessage());
        }
        if (newChangeset.equals(changeSet))
            return;
        changeSet = newChangeset;
        // if (object.getCharacterConcept() == null && object.getMetaType() == null)
        // object.setState(GeneratorState.NEW);
        // else if ((object.getCharacterConcept() != null && object.getMetaType() != null))
        // object.setState(GeneratorState.NEW);
        // else

        if ((object.getCharacterConcept() == null || object.getMetaType() == null))
            object.setState(GeneratorState.NEW);

        if (object.getState() == GeneratorState.PERSONA_CREATED)
            createOptionWidgets();

        tltmNewItem.setEnabled(object.getState() == GeneratorState.READY_FOR_CREATION);
        tltmChoose.setEnabled(object.getState() == GeneratorState.NEW);
        tltmCommit.setEnabled(object.getState() == GeneratorState.PERSONA_CREATED && validate.getChildren().isEmpty());

        sctnChoose.setExpanded(object.getState() == GeneratorState.NEW || object.getState() == GeneratorState.READY_FOR_CREATION);
        sctnCreate.setExpanded(object.getState() == GeneratorState.PERSONA_CREATED);

        validationService.updateValidation(object, validate);
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
        IObservableValue observeSelectionSpinnerObserveWidget = WidgetProperties.selection().observe(spinner);
        IObservableValue objectKarmaToResourceObserveValue = EMFEditObservables.observeValue(editingDomain, object,
                Literals.KARMA_GENERATOR__KARMA_TO_RESOURCE);
        UpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
        bindingContext.bindValue(observeSelectionSpinnerObserveWidget, objectKarmaToResourceObserveValue, modelToTarget, modelToTarget);
        //
        IObservableValue observeTextLblPhasestateObserveWidget = WidgetProperties.text().observe(lblPhasestate);
        IObservableValue objectStateObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.CHARACTER_GENERATOR__STATE);
        bindingContext.bindValue(observeTextLblPhasestateObserveWidget, objectStateObserveValue, new EMFUpdateValueStrategy(),
                new EMFUpdateValueStrategy());
        //

        //
        return bindingContext;
    }

    /**
     * Creates the option widget lazy.
     */
    private void createOptionWidgets() {
        if (object.getCharacter() == null || optionWidgetsCreated)
            return;

        if (resourceGeneratorOption != null)
            resourceGeneratorOption.dispose();
        resourceGeneratorOption = new ResourceGeneratorOption(grpResources, SWT.NONE, resourcen, object.getCharacter(),
                getManagedForm().getToolkit(), editingDomain, Literals.KARMA_GENERATOR__RESOURCE_SPEND);
        resourceGeneratorOption.layout();

        optionWidgetsCreated = true;
    }

    private void ownBinding(DataBindingContext bindingContext) {
        IObservableValue observeTextLblKarmaSpendObserveWidget = WidgetProperties.text().observe(lblKarmaSpend);
        IObservableValue objectKarmaSpendObserveValue = EMFEditObservables.observeValue(editingDomain, object,
                Literals.KARMA_GENERATOR__KARMA_SPEND);
        EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
        modelToTarget.setConverter(new Converter(Integer.class, String.class) {
            @Override
            public Object convert(Object fromObject) {
                if (object.getGenerator() == null)
                    return Messages.GeneratorPage_left1;

                return Messages.GeneratorPage_left + (ShadowrunManagmentTools.calcKarmaLeft(object) + EMPTY);
            }
        });

        bindingContext.bindValue(observeTextLblKarmaSpendObserveWidget, objectKarmaSpendObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), modelToTarget);

        // ----
    }

}
