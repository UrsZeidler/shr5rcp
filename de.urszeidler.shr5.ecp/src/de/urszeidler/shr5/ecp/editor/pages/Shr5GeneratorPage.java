/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.pages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.DiagnosticComposite;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;
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
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Technomancer;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementValidator;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.AttributeGeneratorOption;
import de.urszeidler.shr5.ecp.editor.widgets.MagicGeneratorOption;
import de.urszeidler.shr5.ecp.editor.widgets.MetaTypGeneratorOption;
import de.urszeidler.shr5.ecp.editor.widgets.ResourceGeneratorOption;
import de.urszeidler.shr5.ecp.editor.widgets.SkillGeneratorOption;

/**
 * @author urs
 */
public class Shr5GeneratorPage extends AbstractGeneratorPage {
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
    private Set<Integer> oldSet;
    private Label lblConnectionleft;
    private ControlDecoration controlDecorationResources;
    private ControlDecoration controlDecorationKarma;
    private Label lblConnectionPoints;
    private ControlDecoration controlDecorationConnections;
    private Composite compositeValidation;
    private DiagnosticComposite diagnosticComposite;
    private Group grpValidation;
    private Composite composite_2;
    private HashSet<Diagnostic> oldDia;

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
        tltmCommit.setText("3. commit");

        ToolItem restItem = new ToolItem(toolBar, SWT.NONE);
        restItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                resetCharacter(object);
            }
        });
        restItem.setText("reset");

        grpOverview = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpOverview.setLayout(new GridLayout(1, false));
        grpOverview.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        grpOverview.setText("Overview");
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

        lblInstruction = managedForm.getToolkit().createLabel(composite_1, "ttt", SWT.NONE);

        sctnChoose = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnChoose.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnChoose);
        sctnChoose.setText("1. choose");
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
        btnRadioButton.setText("Spieler");

        Button btnRadioButton_1 = new Button(grpTyp, SWT.RADIO);
        managedForm.getToolkit().adapt(btnRadioButton_1, true, true);
        btnRadioButton_1.setText("Nichtspieler");

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
        sctnCreate.setText("2. create");
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

        managedForm.getToolkit().createLabel(composite, "phase", SWT.NONE);

        lblPhasestate = managedForm.getToolkit().createLabel(composite, "phase_State", SWT.NONE);
        GridData gd_lblPhasestate = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
        gd_lblPhasestate.widthHint = 150;
        lblPhasestate.setLayoutData(gd_lblPhasestate);

        Label lblKarmaToResorcen = new Label(composite, SWT.NONE);
        managedForm.getToolkit().adapt(lblKarmaToResorcen, true, true);
        lblKarmaToResorcen.setText("karma to resorcen");

        spinner = new Spinner(composite, SWT.BORDER);
        GridData gd_spinner = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_spinner.widthHint = 40;
        spinner.setLayoutData(gd_spinner);
        managedForm.getToolkit().adapt(spinner);
        managedForm.getToolkit().paintBordersFor(spinner);

        controlDecorationKarma = new ControlDecoration(spinner, SWT.LEFT | SWT.TOP);
        controlDecorationKarma.setDescriptionText("Some description");

        lblKarmaSpend = new Label(composite, SWT.NONE);
        GridData gd_lblKarmaSpend = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblKarmaSpend.widthHint = 60;
        lblKarmaSpend.setLayoutData(gd_lblKarmaSpend);
        managedForm.getToolkit().adapt(lblKarmaSpend, true, true);
        lblKarmaSpend.setText("New Label");

        managedForm.getToolkit().createLabel(composite, "Connections (avail/spend)", SWT.NONE);

        lblConnectionPoints = managedForm.getToolkit().createLabel(composite, "New Label", SWT.NONE);
        GridData gd_lblConnectionPoints = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblConnectionPoints.widthHint = 40;
        lblConnectionPoints.setLayoutData(gd_lblConnectionPoints);

        controlDecorationConnections = new ControlDecoration(lblConnectionPoints, SWT.LEFT | SWT.TOP);
        controlDecorationConnections.setDescriptionText("Some description");

        lblConnectionleft = managedForm.getToolkit().createLabel(composite, "connectionLeft", SWT.NONE);
        GridData gd_lblConnectionleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblConnectionleft.widthHint = 40;
        lblConnectionleft.setLayoutData(gd_lblConnectionleft);

        grpAttribute = new Group(composite_3, SWT.NONE);
        grpAttribute.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpAttribute.setText("Attribute");
        managedForm.getToolkit().adapt(grpAttribute);
        managedForm.getToolkit().paintBordersFor(grpAttribute);
        grpAttribute.setLayout(new FillLayout(SWT.HORIZONTAL));

        controlDecorationAttributes = new ControlDecoration(grpAttribute, SWT.RIGHT | SWT.TOP);

        grpSkills = new Group(composite_3, SWT.NONE);
        grpSkills.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpSkills.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpSkills.setText("Skills");
        managedForm.getToolkit().adapt(grpSkills);
        managedForm.getToolkit().paintBordersFor(grpSkills);

        controlDecorationSkills = new ControlDecoration(grpSkills, SWT.RIGHT | SWT.TOP);

        grpMagic = new Group(composite_3, SWT.NONE);
        grpMagic.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpMagic.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpMagic.setText("Magic");
        managedForm.getToolkit().adapt(grpMagic);
        managedForm.getToolkit().paintBordersFor(grpMagic);

        controlDecorationMagic = new ControlDecoration(grpMagic, SWT.RIGHT | SWT.TOP);

        grpResourcen = new Group(composite_3, SWT.NONE);
        grpResourcen.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpResourcen.setText("Resourcen");
        managedForm.getToolkit().adapt(grpResourcen);
        managedForm.getToolkit().paintBordersFor(grpResourcen);
        grpResourcen.setLayout(new FillLayout(SWT.HORIZONTAL));

        controlDecorationResources = new ControlDecoration(grpResourcen, SWT.RIGHT | SWT.TOP);

        grpMetatyp = new Group(composite_3, SWT.NONE);
        grpMetatyp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpMetatyp.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpMetatyp.setText("MetaTyp");
        managedForm.getToolkit().adapt(grpMetatyp);
        managedForm.getToolkit().paintBordersFor(grpMetatyp);

        controlDecorationMetaTyp = new ControlDecoration(grpMetatyp, SWT.RIGHT | SWT.TOP);
        new Label(composite_3, SWT.NONE);

        grpValidation = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpValidation.setLayout(new FillLayout(SWT.HORIZONTAL));
        GridData gd_grpValidation = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
        gd_grpValidation.heightHint = 80;
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

        composite_2 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_2);
        managedForm.getToolkit().paintBordersFor(composite_2);

        m_bindingContext = initDataBindings();
        // ----------
        ownBinding(m_bindingContext);
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry("Metatype", Shr5managementPackage.Literals.SHR5_GENERATOR__META_TYPE, compositePrio);
        emfFormBuilder.addTextEntry("Attribute", Shr5managementPackage.Literals.SHR5_GENERATOR__ATTRIBUTE, compositePrio);
        emfFormBuilder.addTextEntry("Magie", Shr5managementPackage.Literals.SHR5_GENERATOR__MAGIC, compositePrio);
        emfFormBuilder.addTextEntry("Fertigkeiten", Shr5managementPackage.Literals.SHR5_GENERATOR__SKILLS, compositePrio);
        emfFormBuilder.addTextEntry("Resourcen", Shr5managementPackage.Literals.SHR5_GENERATOR__RESOURCEN, compositePrio);

        emfFormBuilder.addTextEntry("Gruppe", Shr5managementPackage.Literals.CHARACTER_GENERATOR__SELECTED_GROUP, composite_group);

        emfFormBuilder.addTextEntry("Name", Shr5managementPackage.Literals.CHARACTER_GENERATOR__CHARACTER_NAME, composite_overview);
        emfFormBuilder.addTextEntry("Generator", Shr5managementPackage.Literals.CHARACTER_GENERATOR__GENERATOR, composite_overview);

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);

        managedForm.reflow(true);
        if (!object.eAdapters().contains(this))
            object.eAdapters().add(this);
        if (object.getCharacter() != null && object.getCharacter().getPersona() != null) {
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

    /**
     * Validates the changes and update the gui.
     */
    protected void validateChange() {
        if (object.getState() == GeneratorState.COMMITED) {
            tltmNewItem.setEnabled(false);
            tltmChoose.setEnabled(false);
            tltmCommit.setEnabled(false);

            grpAuswahl.setEnabled(false);
            sctnCreate.setEnabled(false);
            return;
        }

        Diagnostic validate = Diagnostician.INSTANCE.validate(object, context);
        if (object.getCharacter() != null) {
            // Diagnostic validate2 = Diagnostician.INSTANCE.validate(object.getCharacter(), context);

            // validate.getChildren().addAll(validate2.getChildren());
        }

        Set<Integer> newSet = new HashSet<Integer>();
        HashSet<Diagnostic> dia = new HashSet<Diagnostic>();

        List<Diagnostic> children = validate.getChildren();
        for (Diagnostic diagnostic : children) {
            if (Shr5managementValidator.DIAGNOSTIC_SOURCE.equals(diagnostic.getSource()))
                newSet.add(diagnostic.getCode());

            dia.add(diagnostic);
        }

        for (Diagnostic diagnostic : children) {
            if (EObjectValidator.DIAGNOSTIC_SOURCE.equals(diagnostic.getSource())) {
                if (diagnostic.getCode() == EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS) {
                    Object object2 = diagnostic.getData().get(1);
                    if (Shr5managementPackage.Literals.CHARACTER_GENERATOR__SELECTED_GROUP.equals(object2))
                        object.setState(GeneratorState.NEW);
                    if (Shr5managementPackage.Literals.CHARACTER_GENERATOR__CHARACTER.equals(object2))
                        object.setState(GeneratorState.READY_FOR_CREATION);
                }
            }
        }

        if (dia.equals(oldDia))
            //if (newSet.equals(oldSet))
                return;

        if (newSet.contains(Shr5managementValidator.SHR5_GENERATOR__HAS_CATEGORY_ONLY_ONCE)) {
            object.setState(GeneratorState.NEW);
        }
        updateDecorators(newSet);
        oldSet = newSet;
        oldDia = dia;

        if (object.getState() == GeneratorState.PERSONA_CREATED)
            createOptionWidgets();

        tltmNewItem.setEnabled(object.getState() == GeneratorState.READY_FOR_CREATION);
        tltmChoose.setEnabled(object.getState() == GeneratorState.NEW);
        tltmCommit.setEnabled(object.getState() == GeneratorState.PERSONA_CREATED && validate.getChildren().isEmpty());

        sctnChoose.setExpanded(object.getState() == GeneratorState.NEW || object.getState() == GeneratorState.READY_FOR_CREATION);
        sctnCreate.setExpanded(object.getState() == GeneratorState.PERSONA_CREATED);
        grpAuswahl.setEnabled(object.getState() == GeneratorState.NEW || object.getState() == GeneratorState.READY_FOR_CREATION);

        diagnosticComposite.setDiagnostic(validate);
        diagnosticComposite.update();
    }

    /**
     * Update the decorators.
     * 
     * @param newSet
     */
    private void updateDecorators(Set<Integer> newSet) {
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_TYPE_POINTS, controlDecorationMagic,
                "Not all type points spend.");
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_POINTS, controlDecorationMetaTyp,
                "Not all special points spend.");
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SKILL_POINTS, controlDecorationSkills, "Not all skill spend.");
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_ATTRIBUTES_POINTS, controlDecorationAttributes,
                "Not all attributes spend.");
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_RESOURCE_POINTS, controlDecorationResources,
                "Not all resource points spend.");
        updateDecorator(newSet, Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_CONNECTION_POINTS, controlDecorationConnections,
                "Not all Connection points spend.");
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

    private void addPersonaPage(ManagedCharacter playerCharacter) {
        try {
            if (Shr5GeneratorPage.this.getEditor().findPage("character") != null)
                Shr5GeneratorPage.this.getEditor().removePage(2);
            if (Shr5GeneratorPage.this.getEditor().findPage("persona") != null)
                Shr5GeneratorPage.this.getEditor().removePage(1);
            Shr5GeneratorPage.this.getEditor().addPage(
                    1,
                    new AbstraktPersonaPage(Shr5GeneratorPage.this.getEditor(), "persona", "AbstractPersona", playerCharacter.getPersona(),
                            editingDomain, mananger));
            Shr5GeneratorPage.this.getEditor().addPage(2,
                    new ManagedCharacterPage(Shr5GeneratorPage.this.getEditor(), "character", "Inventar", playerCharacter, editingDomain, mananger));
        } catch (PartInitException e1) {
            e1.printStackTrace();
        };
    }

    /**
     * Creates the option widget lazy.
     */
    private void createOptionWidgets() {
        if (object.getAttribute() == null || object.getCharacter() == null)
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
                .getToolkit(), editingDomain);
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
    }

    private void ownBinding(DataBindingContext bindingContext) {
        IObservableValue observeTextLblKarmaSpendObserveWidget = WidgetProperties.text().observe(lblKarmaSpend);
        IObservableValue objectKarmaSpendObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.SHR5_GENERATOR__KARMA_SPEND);
        EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
        modelToTarget.setConverter(new Converter(Integer.class, String.class) {
            @Override
            public Object convert(Object fromObject) {
                if (object.getShr5Generator() == null)
                    return "left : ---";

                return "left :" + (object.getShr5Generator().getKarmaPoints() - object.getKarmaSpend() + "");
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
                    return "Spend : ---";
                return ShadowrunManagmentTools.calcConnectionsSpend(object.getCharacter()) + "";
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
                    return "---";
                return "" + ShadowrunManagmentTools.calcConnectionsPoints(object.getCharacter(), object.getShr5Generator());
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
