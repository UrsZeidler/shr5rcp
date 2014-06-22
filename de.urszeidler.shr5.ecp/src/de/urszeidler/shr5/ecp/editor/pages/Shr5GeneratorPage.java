/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.pages;

import java.math.BigDecimal;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.InputDialog;
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

import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.CredstickTransaction;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Technomancer;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementValidator;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.actions.ActionM2TDialog;
import de.urszeidler.shr5.ecp.editor.widgets.AttributeGeneratorOption;
import de.urszeidler.shr5.ecp.editor.widgets.MagicGeneratorOption;
import de.urszeidler.shr5.ecp.editor.widgets.MetaTypGeneratorOption;
import de.urszeidler.shr5.ecp.editor.widgets.ResourceGeneratorOption;
import de.urszeidler.shr5.ecp.editor.widgets.SkillGeneratorOption;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * @author urs
 */
public class Shr5GeneratorPage extends AbstractGeneratorPage {
    private static final String EMPTY = ""; //$NON-NLS-1$
    private Shr5Generator object;
    private EditingDomain editingDomain;
    private DataBindingContext m_bindingContext;

    private Label lblPhasestate;

    private Spinner spinner;
    private ToolItem tltmNewItem;
    private Composite grpAuswahl;
    private Composite grpTyp;
    private Composite composite_group;
    private ToolItem tltmChoose;
    private ToolItem tltmCommit;
    private Button btnRadioButton;
    private Label lblKarmaSpend;
    private AttributeGeneratorOption attributeGeneratorOption;
    private Composite composite_3;
    private Group grpAttribute;
    private Group grpSkills;
    private Section sctnCreate;
    private SkillGeneratorOption skillGeneratorOption;
    private Group grpResourcen;
    private ResourceGeneratorOption resourceGeneratorOption;
    private Group grpMetatyp;
    private Group grpMagic;
    private MetaTypGeneratorOption metaTypGeneratorOption;
    private MagicGeneratorOption magicGeneratorOption;
    private Section sctnChoose;
    private Group grpOverview;
    private Composite composite_overview;
    private Label lblInstruction;
    private ControlDecoration controlDecorationAttributes;
    private ControlDecoration controlDecorationSkills;
    private ControlDecoration controlDecorationMagic;
    private ControlDecoration controlDecorationMetaTyp;
    private Label lblConnectionleft;
    private ControlDecoration controlDecorationResources;
    private ControlDecoration controlDecorationKarma;
    private Label lblConnectionPoints;
    private ControlDecoration controlDecorationConnections;
    // private DiagnosticComposite diagnosticComposite;
    // private Group grpValidation;
    // private Composite composite_2;

    private HashSet<String> changeSet;
    private boolean optionWidgetsCreated = false;
    private ToolItem restItem;

    /**
     * Create the form page.
     * 
     * @param editor
     * @param id
     * @param title
     * @wbp.parser.constructor
     * @wbp.eval.method.parameter id "Some id"
     * @wbp.eval.method.parameter title "Some title"
     */
    public Shr5GeneratorPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        object = Shr5managementFactory.eINSTANCE.createShr5Generator();
        context = createValidationContext();
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
    public Shr5GeneratorPage(FormEditor editor, String id, String title, Shr5Generator object, EditingDomain editingDomain, ReferenceManager manager) {
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
        form.getToolBarManager().add(new ActionM2TDialog(form.getShell(), object));
        form.getToolBarManager().update(true);

        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        ToolBar toolBar = new ToolBar(managedForm.getForm().getBody(), SWT.FLAT | SWT.RIGHT | SWT.SHADOW_OUT);
        managedForm.getToolkit().adapt(toolBar);
        managedForm.getToolkit().paintBordersFor(toolBar);

        tltmChoose = new ToolItem(toolBar, SWT.NONE);
        tltmChoose.setText(Messages.GeneratorPage_Step_One);
        tltmChoose.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/btn_1.png")); //$NON-NLS-1$ //$NON-NLS-2$

        tltmNewItem = new ToolItem(toolBar, SWT.NONE);
        tltmNewItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                createManagedCharacter();

            }
        });
        tltmNewItem.setText(Messages.GeneratorPage_Step_Two);
        tltmNewItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/btn_2.png")); //$NON-NLS-1$ //$NON-NLS-2$

        tltmCommit = new ToolItem(toolBar, SWT.NONE);
        tltmCommit.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                commitCharacter();
            }
        });
        tltmCommit.setText(Messages.GeneratorPage_Step_Three);
        tltmCommit.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/btn_3.png")); //$NON-NLS-1$ //$NON-NLS-2$

        restItem = new ToolItem(toolBar, SWT.NONE);
        restItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                resetCharacter(object);
            }
        });
        restItem.setText(Messages.GeneratorPage_reset);
        restItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/btn_4.png")); //$NON-NLS-1$ //$NON-NLS-2$

        grpOverview = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpOverview.setLayout(new GridLayout(1, false));
        grpOverview.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        grpOverview.setText(Messages.GeneratorPage_overview);
        managedForm.getToolkit().adapt(grpOverview);
        managedForm.getToolkit().paintBordersFor(grpOverview);

        composite_overview = managedForm.getToolkit().createComposite(grpOverview, SWT.NONE);
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

        grpAuswahl = new Composite(sctnChoose, SWT.NONE);
        sctnChoose.setClient(grpAuswahl);
        grpAuswahl.setLayout(new GridLayout(2, false));
        managedForm.getToolkit().adapt(grpAuswahl);
        managedForm.getToolkit().paintBordersFor(grpAuswahl);

        grpTyp = new Composite(grpAuswahl, SWT.NONE);
        managedForm.getToolkit().adapt(grpTyp);
        managedForm.getToolkit().paintBordersFor(grpTyp);
        grpTyp.setLayout(new GridLayout(1, false));

        btnRadioButton = new Button(grpTyp, SWT.RADIO);
        btnRadioButton.setSelection(true);
        managedForm.getToolkit().adapt(btnRadioButton, true, true);
        btnRadioButton.setText(Messages.GeneratorPage_player);

        Button btnRadioButton_1 = new Button(grpTyp, SWT.RADIO);
        managedForm.getToolkit().adapt(btnRadioButton_1, true, true);
        btnRadioButton_1.setText(Messages.GeneratorPage_non_player);

        Composite compositePrio = new Composite(grpAuswahl, SWT.NONE);
        compositePrio.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        compositePrio.setLayout(new GridLayout(3, false));
        managedForm.getToolkit().adapt(compositePrio);
        managedForm.getToolkit().paintBordersFor(compositePrio);

        composite_group = new Composite(grpAuswahl, SWT.NONE);
        composite_group.setLayout(new GridLayout(3, false));
        composite_group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        managedForm.getToolkit().adapt(composite_group);
        managedForm.getToolkit().paintBordersFor(composite_group);

        sctnCreate = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnCreate);
        sctnCreate.setText(Messages.GeneratorPage_Step_Two);
        sctnCreate.setExpanded(true);

        composite_3 = managedForm.getToolkit().createComposite(sctnCreate, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_3);
        sctnCreate.setClient(composite_3);
        composite_3.setLayout(new GridLayout(3, false));

        Composite composite = new Composite(composite_3, SWT.NONE);
        composite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
        composite.setLayout(new GridLayout(3, false));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        managedForm.getToolkit().createLabel(composite, Messages.GeneratorPage_phase, SWT.NONE);

        lblPhasestate = managedForm.getToolkit().createLabel(composite, "phase_State", SWT.NONE); //$NON-NLS-1$
        GridData gd_lblPhasestate = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
        gd_lblPhasestate.widthHint = 150;
        lblPhasestate.setLayoutData(gd_lblPhasestate);

        Label lblKarmaToResorcen = new Label(composite, SWT.NONE);
        managedForm.getToolkit().adapt(lblKarmaToResorcen, true, true);
        lblKarmaToResorcen.setText(Messages.GeneratorPage_karma2Resource);

        spinner = new Spinner(composite, SWT.BORDER);
        GridData gd_spinner = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_spinner.widthHint = 40;
        spinner.setLayoutData(gd_spinner);
        managedForm.getToolkit().adapt(spinner);
        managedForm.getToolkit().paintBordersFor(spinner);

        controlDecorationKarma = new ControlDecoration(spinner, SWT.LEFT | SWT.TOP);
        controlDecorationKarma.setDescriptionText("Some description"); //$NON-NLS-1$

        lblKarmaSpend = new Label(composite, SWT.NONE);
        GridData gd_lblKarmaSpend = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblKarmaSpend.widthHint = 60;
        lblKarmaSpend.setLayoutData(gd_lblKarmaSpend);
        managedForm.getToolkit().adapt(lblKarmaSpend, true, true);
        lblKarmaSpend.setText("New Label"); //$NON-NLS-1$

        managedForm.getToolkit().createLabel(composite, Messages.GeneratorPage_connections, SWT.NONE);

        lblConnectionPoints = managedForm.getToolkit().createLabel(composite, "New Label", SWT.NONE); //$NON-NLS-1$
        GridData gd_lblConnectionPoints = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblConnectionPoints.widthHint = 40;
        lblConnectionPoints.setLayoutData(gd_lblConnectionPoints);

        controlDecorationConnections = new ControlDecoration(lblConnectionPoints, SWT.LEFT | SWT.TOP);
        controlDecorationConnections.setDescriptionText("Some description"); //$NON-NLS-1$

        lblConnectionleft = managedForm.getToolkit().createLabel(composite, "connectionLeft", SWT.NONE); //$NON-NLS-1$
        GridData gd_lblConnectionleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblConnectionleft.widthHint = 40;
        lblConnectionleft.setLayoutData(gd_lblConnectionleft);

        grpAttribute = new Group(composite_3, SWT.NONE);
        grpAttribute.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpAttribute.setText(Messages.GeneratorPage_Attribute);
        managedForm.getToolkit().adapt(grpAttribute);
        managedForm.getToolkit().paintBordersFor(grpAttribute);
        grpAttribute.setLayout(new FillLayout(SWT.HORIZONTAL));

        controlDecorationAttributes = new ControlDecoration(grpAttribute, SWT.RIGHT | SWT.TOP);

        grpSkills = new Group(composite_3, SWT.NONE);
        grpSkills.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpSkills.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpSkills.setText(Messages.GeneratorPage_Skills);
        managedForm.getToolkit().adapt(grpSkills);
        managedForm.getToolkit().paintBordersFor(grpSkills);

        controlDecorationSkills = new ControlDecoration(grpSkills, SWT.RIGHT | SWT.TOP);

        grpMagic = new Group(composite_3, SWT.NONE);
        grpMagic.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpMagic.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpMagic.setText(Messages.GeneratorPage_Magic);
        managedForm.getToolkit().adapt(grpMagic);
        managedForm.getToolkit().paintBordersFor(grpMagic);

        controlDecorationMagic = new ControlDecoration(grpMagic, SWT.RIGHT | SWT.TOP);

        grpResourcen = new Group(composite_3, SWT.NONE);
        grpResourcen.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpResourcen.setText(Messages.GeneratorPage_Resources);
        managedForm.getToolkit().adapt(grpResourcen);
        managedForm.getToolkit().paintBordersFor(grpResourcen);
        grpResourcen.setLayout(new FillLayout(SWT.HORIZONTAL));

        controlDecorationResources = new ControlDecoration(grpResourcen, SWT.RIGHT | SWT.TOP);

        grpMetatyp = new Group(composite_3, SWT.NONE);
        grpMetatyp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpMetatyp.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpMetatyp.setText(Messages.GeneratorPage_Metatype);
        managedForm.getToolkit().adapt(grpMetatyp);
        managedForm.getToolkit().paintBordersFor(grpMetatyp);

        controlDecorationMetaTyp = new ControlDecoration(grpMetatyp, SWT.RIGHT | SWT.TOP);
        new Label(composite_3, SWT.NONE);

        m_bindingContext = initDataBindings();
        // ----------
        ownBinding(m_bindingContext);
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_GENERATOR__META_TYPE, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_GENERATOR__ATTRIBUTE, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_GENERATOR__MAGIC, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_GENERATOR__SKILLS, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_GENERATOR__RESOURCEN, compositePrio);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_GENERATOR__SELECTED_GROUP, composite_group);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_GENERATOR__CHARACTER_NAME, composite_overview);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_GENERATOR__GENERATOR, composite_overview);

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);

        managedForm.reflow(true);
        if (!object.eAdapters().contains(this) && object.getState() != GeneratorState.COMMITED)
            object.eAdapters().add(this);
        if (object.getCharacter() != null && object.getCharacter().getPersona() != null && object.getState() != GeneratorState.COMMITED) {
            addPersonaPage(object.getCharacter());
        }
        validateChange();
    }

    @Override
    public void dispose() {
        if (object != null)
            object.eAdapters().remove(this);

        super.dispose();
    }

    protected void resetCharacter(CharacterGenerator object) {
        optionWidgetsCreated = false;
        super.resetCharacter(object);
    }

    /**
     * Commit the character.
     */
    protected void commitCharacter() {
        final int calcResourcesLeft = ShadowrunManagmentTools.calcResourcesLeft(object);
        int startMoney = calcResourcesLeft;
        Credstick credstick = ShadowrunManagmentTools.findFirstCedstick(object.getCharacter().getInventar());

        Lifestyle choosenLifestyle = object.getCharacter().getChoosenLifestyle();
        Shr5System shr5System = object.getShr5Generator();
        EList<LifestyleToStartMoney> lifestyleToStartMoney = shr5System.getLifestyleToStartMoney();
        LifestyleToStartMoney lifestyleToMoney = ShadowrunEditingTools.getLifestyleToMoney(choosenLifestyle, lifestyleToStartMoney);

        if (lifestyleToMoney != null) {
            InputDialog inputDialog = createLifestyle2MoneyDialog(calcResourcesLeft, lifestyleToMoney);
            int open = inputDialog.open();
            if (open != InputDialog.OK)
                return;

            String value = inputDialog.getValue();
            startMoney = Integer.parseInt(value);
        }

        CompoundCommand command = new CompoundCommand();
        command.append(SetCommand.create(getEditingDomain(), object, Shr5managementPackage.Literals.CHARACTER_GENERATOR__STATE,
                GeneratorState.COMMITED));
        command.append(SetCommand.create(getEditingDomain(), object, Shr5managementPackage.Literals.SHR5_GENERATOR__START_KARMA,
                ShadowrunManagmentTools.calcKarmaLeft(object)));
        command.append(SetCommand.create(getEditingDomain(), object, Shr5managementPackage.Literals.SHR5_GENERATOR__START_RESOURCES, startMoney));
        command.append(SetCommand.create(getEditingDomain(), object.getCharacter(), Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC,
                object));

        if (credstick != null) {
            CredstickTransaction transaction = Shr5Factory.eINSTANCE.createCredstickTransaction();
            transaction.setAmount(new BigDecimal(startMoney));
            transaction.setDescription(String.format(Messages.Shr5GeneratorPage_initial_transaction_message0, startMoney));
            command.append(AddCommand.create(getEditingDomain(), credstick, Shr5Package.Literals.CREDSTICK__TRANSACTIONLOG, transaction));
        }

        getEditingDomain().getCommandStack().execute(command);
        validateChange();
    }

    /**
     * Validates the changes and update the gui.
     */
    protected void validateChange() {
        if (object.getState() == GeneratorState.COMMITED) {
            tltmNewItem.setEnabled(false);
            tltmChoose.setEnabled(false);
            tltmCommit.setEnabled(false);
            restItem.setEnabled(false);

            grpAuswahl.setEnabled(false);
            sctnCreate.setEnabled(false);
            return;
        }

        Diagnostic validate = Diagnostician.INSTANCE.validate(object, context);

        Set<Integer> newSet = new HashSet<Integer>();
        HashSet<String> newChangeset = new HashSet<String>();

        List<Diagnostic> children = validate.getChildren();
        for (Diagnostic diagnostic : children) {
            if (Shr5managementValidator.DIAGNOSTIC_SOURCE.equals(diagnostic.getSource()))
                newSet.add(diagnostic.getCode());

            newChangeset.add(diagnostic.getMessage());
            updateGeneratorState(diagnostic, object);
        }

        if (newChangeset.equals(changeSet))
            return;

        if (newSet.contains(Shr5managementValidator.SHR5_GENERATOR__HAS_CATEGORY_ONLY_ONCE)) {
            object.setState(GeneratorState.NEW);
        } else if (object.getCharacter() != null && object.getCharacter().getPersona() != null) {
            object.setState(GeneratorState.PERSONA_CREATED);
        }
        updateDecorators(newSet);
        changeSet = newChangeset;

        if (object.getState() == GeneratorState.PERSONA_CREATED)
            createOptionWidgets();

        tltmNewItem.setEnabled(object.getState() == GeneratorState.READY_FOR_CREATION);
        tltmChoose.setEnabled(object.getState() == GeneratorState.NEW);
        tltmCommit.setEnabled(object.getState() == GeneratorState.PERSONA_CREATED && validate.getChildren().isEmpty());

        sctnChoose.setExpanded(object.getState() == GeneratorState.NEW || object.getState() == GeneratorState.READY_FOR_CREATION);
        sctnCreate.setExpanded(object.getState() == GeneratorState.PERSONA_CREATED);
        grpAuswahl.setEnabled(object.getState() == GeneratorState.NEW || object.getState() == GeneratorState.READY_FOR_CREATION);

        // diagnosticComposite.setDiagnostic(validate);
        // diagnosticComposite.update();

        validationService.updateValidation(object, validate);
    }

    /**
     * Update the decorators.
     * 
     * @param newSet
     */
    private void updateDecorators(Set<Integer> newSet) {
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_TYPE_POINTS, controlDecorationMagic,
                "Not all type points spend."); //$NON-NLS-1$
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_POINTS, controlDecorationMetaTyp,
                "Not all special points spend."); //$NON-NLS-1$
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SKILL_POINTS, controlDecorationSkills, "Not all skill spend."); //$NON-NLS-1$
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_KNOWLEGE_SKILL_POINTS, controlDecorationSkills,
                "Not all skill spend."); //$NON-NLS-1$
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_GROUP_POINTS, controlDecorationSkills, "Not all skill spend."); //$NON-NLS-1$
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_ATTRIBUTES_POINTS, controlDecorationAttributes,
                "Not all attributes spend."); //$NON-NLS-1$
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_RESOURCE_POINTS, controlDecorationResources,
                "Not all resource points spend."); //$NON-NLS-1$
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_CONNECTION_POINTS, controlDecorationConnections,
                "Not all Connection points spend."); //$NON-NLS-1$
    }

    private void createManagedCharacter() {
        MetaType metaType = object.getMetaType();
        SpecialType magic = object.getMagic();
        EClass selectableType = magic.getSelectableTypes();
        Spezies spezies = metaType.getChoosableTypes();
        ManagedCharacter playerCharacter;
        boolean createPlayer = btnRadioButton.getSelection();
        playerCharacter = createManagedCharacter(selectableType, spezies, createPlayer, object);

        if (magic instanceof Adept) {
            Adept a = (Adept)magic;
            ((BaseMagischePersona)playerCharacter.getPersona()).setMagieBasis(a.getMagic());
        } else if (magic instanceof Technomancer) {
            Technomancer t = (Technomancer)magic;
            ((de.urszeidler.eclipse.shr5.Technomancer)playerCharacter.getPersona()).setResonanzBasis(t.getResonanz());
        }

        addPersonaPage(playerCharacter);
        createOptionWidgets();
        validateChange();
    }

    /**
     * Creates the option widget lazy.
     */
    private void createOptionWidgets() {
        if (object.getAttribute() == null || object.getCharacter() == null || optionWidgetsCreated)
            return;

        if (attributeGeneratorOption != null)
            attributeGeneratorOption.dispose();

        attributeGeneratorOption = new AttributeGeneratorOption(grpAttribute, SWT.NONE, object.getAttribute(), object.getCharacter(),
                getManagedForm().getToolkit(), editingDomain);
        attributeGeneratorOption.layout();

        if (skillGeneratorOption != null)
            skillGeneratorOption.dispose();
        skillGeneratorOption = new SkillGeneratorOption(grpSkills, SWT.NONE, object.getSkills(), object.getCharacter(),
                getManagedForm().getToolkit(), editingDomain);
        skillGeneratorOption.layout();

        if (resourceGeneratorOption != null)
            resourceGeneratorOption.dispose();
        resourceGeneratorOption = new ResourceGeneratorOption(grpResourcen, SWT.NONE, object.getResourcen(), object.getCharacter(), getManagedForm()
                .getToolkit(), editingDomain, Literals.SHR5_GENERATOR__RESOURCE_SPEND);
        resourceGeneratorOption.layout();

        if (metaTypGeneratorOption != null)
            metaTypGeneratorOption.dispose();
        metaTypGeneratorOption = new MetaTypGeneratorOption(grpMetatyp, SWT.NONE, object.getMetaType(), object.getCharacter(), getManagedForm()
                .getToolkit(), editingDomain);
        metaTypGeneratorOption.layout();

        if (magicGeneratorOption != null)
            magicGeneratorOption.dispose();
        magicGeneratorOption = new MagicGeneratorOption(grpMagic, SWT.NONE, object.getMagic(), object.getCharacter(), getManagedForm().getToolkit(),
                editingDomain);
        magicGeneratorOption.layout();

        grpAttribute.layout(true, true);
        grpSkills.layout(true, true);
        grpResourcen.layout(true, true);
        grpMetatyp.layout(true, true);
        grpMagic.layout(true, true);
        sctnCreate.setExpanded(true);
        optionWidgetsCreated = true;
    }

    private void ownBinding(DataBindingContext bindingContext) {
        IObservableValue observeTextLblKarmaSpendObserveWidget = WidgetProperties.text().observe(lblKarmaSpend);
        IObservableValue objectKarmaSpendObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.SHR5_GENERATOR__KARMA_SPEND);
        EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
        modelToTarget.setConverter(new Converter(Integer.class, String.class) {
            @Override
            public Object convert(Object fromObject) {
                if (object.getShr5Generator() == null)
                    return Messages.GeneratorPage_left1;

                return Messages.GeneratorPage_left + (ShadowrunManagmentTools.calcKarmaLeft(object) + EMPTY);
            }
        });

        bindingContext.bindValue(observeTextLblKarmaSpendObserveWidget, objectKarmaSpendObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), modelToTarget);
        // ----
        observeTextLblKarmaSpendObserveWidget = WidgetProperties.text().observe(lblConnectionleft);
        objectKarmaSpendObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.SHR5_GENERATOR__CONNECTION_SPEND);
        modelToTarget = new EMFUpdateValueStrategy();
        modelToTarget.setConverter(new Converter(Integer.class, String.class) {
            @Override
            public Object convert(Object fromObject) {
                if (object.getShr5Generator() == null || object.getCharacter() == null)
                    return Messages.GeneratorPage_spend;
                return ShadowrunManagmentTools.calcConnectionsSpend(object.getCharacter()) + EMPTY;
            }
        });

        bindingContext.bindValue(observeTextLblKarmaSpendObserveWidget, objectKarmaSpendObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), modelToTarget);

        // ----
        observeTextLblKarmaSpendObserveWidget = WidgetProperties.text().observe(lblConnectionPoints);
        objectKarmaSpendObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.SHR5_GENERATOR__CONNECTION_SPEND);
        modelToTarget = new EMFUpdateValueStrategy();
        modelToTarget.setConverter(new Converter(Integer.class, String.class) {
            @Override
            public Object convert(Object fromObject) {
                if (object.getShr5Generator() == null || object.getCharacter() == null)
                    return "---"; //$NON-NLS-1$
                return EMPTY + ShadowrunManagmentTools.calcConnectionsPoints(object.getCharacter(), object.getShr5Generator());
            }
        });

        bindingContext.bindValue(observeTextLblKarmaSpendObserveWidget, objectKarmaSpendObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), modelToTarget);

        // ----
        IObservableValue objectStateObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.CHARACTER_GENERATOR__STATE);

        IObservableValue observeTextLblInstructionObserveWidget = WidgetProperties.text().observe(lblInstruction);
        modelToTarget = new EMFUpdateValueStrategy();
        modelToTarget.setConverter(new Converter(Integer.class, String.class) {
            @Override
            public Object convert(Object fromObject) {
                return object.getCurrentInstruction();
            }
        });
        bindingContext.bindValue(observeTextLblInstructionObserveWidget, objectStateObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), modelToTarget);
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }

    /**
     * Some events we do not need.
     */
    @Override
    protected boolean notificationIsRequierd(Notification notification) {
        Object feature = notification.getFeature();
        if (Shr5managementPackage.Literals.SHR5_GENERATOR__KARMA_TO_RESOURCE.equals(feature))
            return false;
        return true;
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeSelectionSpinnerObserveWidget = WidgetProperties.selection().observe(spinner);
        IObservableValue objectKarmaToResourceObserveValue = EMFEditObservables.observeValue(editingDomain, object,
                Literals.SHR5_GENERATOR__KARMA_TO_RESOURCE);
        UpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
        bindingContext.bindValue(observeSelectionSpinnerObserveWidget, objectKarmaToResourceObserveValue, modelToTarget, modelToTarget);
        //
        IObservableValue observeTextLblPhasestateObserveWidget = WidgetProperties.text().observe(lblPhasestate);
        IObservableValue objectStateObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.CHARACTER_GENERATOR__STATE);
        bindingContext.bindValue(observeTextLblPhasestateObserveWidget, objectStateObserveValue, new EMFUpdateValueStrategy(),
                new EMFUpdateValueStrategy());
        //
        return bindingContext;
    }
}
