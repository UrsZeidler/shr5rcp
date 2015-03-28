/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.pages.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.Dialog;
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

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Spezialisierung;
import de.urszeidler.eclipse.shr5.Wissensfertigkeit;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.LifeModule;
import de.urszeidler.eclipse.shr5Management.LifeModulesGenerator;
import de.urszeidler.eclipse.shr5Management.LifeModulesSystem;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.ModuleAttributeChange;
import de.urszeidler.eclipse.shr5Management.ModuleChange;
import de.urszeidler.eclipse.shr5Management.ModuleFeatureChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange;
import de.urszeidler.eclipse.shr5Management.ModuleTeachableChange;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.NullObject;
import de.urszeidler.shr5.ecp.editor.ShrReferenceManager;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.editor.widgets.ResourceGeneratorOption;

/**
 * @author urs
 */
public class LifeModuleGeneratorPage extends AbstractGeneratorPage {

    protected static final String EMPTY = ""; //$NON-NLS-1$
    private LifeModulesGenerator object;// = Shr5managementFactory.eINSTANCE.createShr5KarmaGenerator();
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

    public LifeModuleGeneratorPage(FormEditor editor, String id, String title) {
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
    public LifeModuleGeneratorPage(FormEditor editor, String id, String title, LifeModulesGenerator object, EditingDomain editingDomain,
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
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__NATIONALITY, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__FORMATIVE_YEARS, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__TEEN_YEARS, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__FURTHER_EDUCATION, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__REAL_LIFE, compositePrio);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.KARMA_GENERATOR__CHOISE_KARMA_COST, compositePrio, new LabelEntry());
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__MODULE_KARMA_COST, compositePrio, new LabelEntry());
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__STARTING_AGE, compositePrio, new LabelEntry());
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
        final int calcResourcesLeft = ShadowrunManagmentTools.calcResourcesLeft(object);
        int startMoney = calcResourcesLeft;
        startMoney = lifeStyleToStartMoneyDialog(calcResourcesLeft, startMoney,object);
        if(startMoney==-1)
            return;

        moveGeneratorToCharacterCommit(object);
        validateChange();

    }

//    /**
//     * 
//     */
//    protected void moveGeneratorToCharacterCommit() {
//        CompoundCommand command = new CompoundCommand();
//        command.append(SetCommand.create(getEditingDomain(), object, Shr5managementPackage.Literals.CHARACTER_GENERATOR__STATE,
//                GeneratorState.COMMITED));
//        command.append(SetCommand.create(getEditingDomain(), object.getCharacter(), Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC,
//                object));
//
//        getEditingDomain().getCommandStack().execute(command);
//    }

    protected void createManagedCharacter() {
        ManagedCharacter managedCharacter = createManagedCharacter(object.getCharacterConcept().getSelectableTypes(), object.getMetaType()
                .getChoosableTypes(), btnPlayerButton.getSelection(), object);

        ArrayList<ModuleChange> list = new ArrayList<ModuleChange>();
        list.addAll(object.getNationality().getCharacterChanges());
        list.addAll(object.getFormativeYears().getCharacterChanges());
        list.addAll(object.getTeenYears().getCharacterChanges());
        if (object.getFurtherEducation() != null)
            list.addAll(object.getFurtherEducation().getCharacterChanges());
        for (LifeModule lm : object.getRealLife()) {
            list.addAll(lm.getCharacterChanges());
        }
        FluentIterable<ModuleChange> transform = FluentIterable.from(list).transform(new Function<ModuleChange, ModuleChange>() {
            @Override
            public ModuleChange apply(ModuleChange input) {
                return EcoreUtil.copy(input);
            }
        });
        FluentIterable<ModuleAttributeChange> attributes = transform.filter(ModuleAttributeChange.class);
        FluentIterable<ModuleTeachableChange> teachable = transform.filter(ModuleTeachableChange.class);
        FluentIterable<ModuleFeatureChange> featueChanges = transform.filter(ModuleFeatureChange.class);
        FluentIterable<ModuleSkillGroupChange> skillGroups = transform.filter(ModuleSkillGroupChange.class);
        FluentIterable<ModuleSkillChange> skills = transform.filter(ModuleSkillChange.class);

        createAttributes(managedCharacter, attributes);
        createSkillGroups(managedCharacter, skillGroups);
        createSkills(managedCharacter, skills);
        createTachables(managedCharacter, teachable);
        // features
        for (ModuleFeatureChange mfc : featueChanges) {
            try {
                managedCharacter.eSet(mfc.getFeature(), mfc.getValue());
            } catch (Exception e) {
            }
        }

        addPersonaPage(object.getCharacter());
        validateChange();
    }

    private void createTachables(ManagedCharacter managedCharacter, FluentIterable<ModuleTeachableChange> teachable) {
        for (ModuleTeachableChange mtc : teachable) {
            Erlernbar teachable2 = mtc.getTeachable();
            if (teachable2 == null && !mtc.getSelectOne().isEmpty()) {
                displayChooseDialog(mtc);
            }
            if (teachable2 instanceof Spezialisierung) {
                Spezialisierung s = (Spezialisierung)teachable2;
                PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();

                managedCharacter.getChanges().add(personaChange);
                personaChange.setChangeable((Erlernbar)s);
                personaChange.setTo(1);

                personaChange.applyChanges();
                personaChange.setDateApplied(null);
            } else if (teachable2 instanceof PersonaEigenschaft) {
                PersonaEigenschaft pe = (PersonaEigenschaft)teachable2;
                EObject withParentId = ShrReferenceManager.copyWithParentId(pe);
                PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
                managedCharacter.getChanges().add(personaChange);
                personaChange.setChangeable((Erlernbar)withParentId);
                personaChange.setTo(1);

                personaChange.applyChanges();
                personaChange.setDateApplied(null);
            }
        }
    }

    /**
     * Displayes a choose dialog to fill in the objects not defined.
     * 
     * @param mtc
     */
    private void displayChooseDialog(ModuleChange mc) {
        if (mc instanceof ModuleAttributeChange) {
            ModuleAttributeChange ma = (ModuleAttributeChange)mc;
            OwnChooseDialog ownChooseDialog = new OwnChooseDialog(getSite().getShell(), NullObject.toChoises(ma.getSelectOne()));
            ownChooseDialog.setLabelProvider(labelprovider);
            if (ownChooseDialog.open() == Dialog.OK) {
                Object[] result = ownChooseDialog.getResult();
                ma.setAttribute((EAttribute)result[0]);
                ma.setSelected((EAttribute)result[0]);
            }
        } else if (mc instanceof ModuleSkillChange) {
            ModuleSkillChange ma = (ModuleSkillChange)mc;
            OwnChooseDialog ownChooseDialog = new OwnChooseDialog(getSite().getShell(), NullObject.toChoises(ma.getSelectOne()), "Select a skill",
                    "Select a skill 1");
            ownChooseDialog.setLabelProvider(labelprovider);
            if (ownChooseDialog.open() == Dialog.OK) {
                Object[] result = ownChooseDialog.getResult();
                ma.setSkill((Fertigkeit)result[0]);
                ma.setSelected((Fertigkeit)result[0]);
            }
        } else if (mc instanceof ModuleSkillGroupChange) {
            ModuleSkillGroupChange ma = (ModuleSkillGroupChange)mc;
            OwnChooseDialog ownChooseDialog = new OwnChooseDialog(getSite().getShell(), NullObject.toChoises(ma.getSelectOne()));
            ownChooseDialog.setLabelProvider(labelprovider);
            if (ownChooseDialog.open() == Dialog.OK) {
                Object[] result = ownChooseDialog.getResult();
                ma.setSkillGroup((FertigkeitsGruppe)result[0]);
                ma.setSelected((FertigkeitsGruppe)result[0]);
            }
        }

    }

    /**
     * @param managedCharacter
     * @param skills
     */
    private void createSkills(ManagedCharacter managedCharacter, FluentIterable<ModuleSkillChange> skills) {
        // for (ModuleSkillChange moduleSkillChange : skills) {
        // if (moduleSkillChange.getSkill() == null && !moduleSkillChange.getSelectOne().isEmpty())
        // displayChooseDialog(moduleSkillChange);
        // }

        HashMap<Fertigkeit, Integer> hashMap2 = new HashMap<Fertigkeit, Integer>();
        for (ModuleSkillChange msc : skills) {
            Fertigkeit skill = msc.getSkill();
            if (skill == null && !msc.getSelectOne().isEmpty()) {
                displayChooseDialog(msc);
                skill = msc.getSkill();
            }

            Integer value = hashMap2.get(skill);
            if (value == null) {
                value = 0;
                hashMap2.put(skill, msc.getGrade());
            } else {
                hashMap2.put(skill, value + msc.getGrade());
            }
        }
        Set<Entry<Fertigkeit, Integer>> entrySet2 = hashMap2.entrySet();
        for (Entry<Fertigkeit, Integer> entry : entrySet2) {
            if (entry.getKey() == null)
                continue;

            PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();

            PersonaFertigkeit fertigkeit = ShadowrunTools.findFertigkeit(entry.getKey(), managedCharacter.getPersona());
            if (fertigkeit == null) {
                fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
                fertigkeit.setFertigkeit(entry.getKey());
                fertigkeit.setStufe(0);
            }
            managedCharacter.getChanges().add(personaChange);
            personaChange.setChangeable(fertigkeit);
            int min = Math.max(ShadowrunTools.findFertigkeitValue(entry.getKey(), managedCharacter.getPersona()), 0);
//            personaChange.setTo(min + entry.getValue());

            if (entry.getKey() instanceof Wissensfertigkeit) {
                personaChange.setTo(Math.min(object.getGenerator().getKnowlegeSkillMax(), min + entry.getValue()));
            }else{
                personaChange.setTo(Math.min(object.getGenerator().getSkillMax(),  min + entry.getValue()) );
            }

            
            personaChange.applyChanges();
            personaChange.setDateApplied(null);
        }
    }

    /**
     * @param managedCharacter
     * @param skills
     */
    private void createSkillGroups(ManagedCharacter managedCharacter, FluentIterable<ModuleSkillGroupChange> skills) {
        // for (ModuleSkillGroupChange moduleSkillGroupChange : skills) {
        // if (moduleSkillGroupChange.getSkillGroup() == null && !moduleSkillGroupChange.getSelectOne().isEmpty())
        // displayChooseDialog(moduleSkillGroupChange);
        // }
LifeModulesSystem shr5System = object.getGenerator();
        
        HashMap<FertigkeitsGruppe, Integer> hashMap2 = new HashMap<FertigkeitsGruppe, Integer>();
        for (ModuleSkillGroupChange msc : skills) {
            FertigkeitsGruppe skill = msc.getSkillGroup();
            if (skill == null && !msc.getSelectOne().isEmpty()) {
                displayChooseDialog(msc);
                skill = msc.getSkillGroup();
            }
            Integer value = hashMap2.get(skill);
            if (value == null) {
                value = 0;
                hashMap2.put(skill, msc.getGrade());
            } else {
                hashMap2.put(skill, value + msc.getGrade());
            }
        }
        Set<Entry<FertigkeitsGruppe, Integer>> entrySet2 = hashMap2.entrySet();
        for (Entry<FertigkeitsGruppe, Integer> entry : entrySet2) {
            PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();

            PersonaFertigkeitsGruppe fertigkeit = ShadowrunTools.findGruppe(entry.getKey(), managedCharacter.getPersona());
            if (fertigkeit == null) {
                fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
                fertigkeit.setGruppe(entry.getKey());
                fertigkeit.setStufe(0);
            }
            managedCharacter.getChanges().add(personaChange);
            personaChange.setChangeable(fertigkeit);
            personaChange.setTo(Math.min(shr5System.getSkillMax(),  fertigkeit.getStufe() + entry.getValue()) );
            personaChange.applyChanges();
            personaChange.setDateApplied(null);
        }
    }

    /**
     * @param managedCharacter
     * @param attributes
     */
    private void createAttributes(ManagedCharacter managedCharacter, FluentIterable<ModuleAttributeChange> attributes) {
        for (ModuleAttributeChange moduleAttributeChange : attributes) {
            if (moduleAttributeChange.getAttribute() == null && !moduleAttributeChange.getSelectOne().isEmpty()) {
                displayChooseDialog(moduleAttributeChange);
            }
        }
        // Attributes
        HashMap<EAttribute, Integer> hashMap = new HashMap<EAttribute, Integer>();
        for (ModuleAttributeChange mac : attributes) {
            EAttribute attribute = mac.getAttribute();
            if (attribute == null && !mac.getSelectOne().isEmpty()) {
                displayChooseDialog(mac);
                attribute = mac.getAttribute();
            }
            Integer value = hashMap.get(attribute);
            if (value == null) {
                value = 0;
                hashMap.put(attribute, mac.getGrade());
            } else {
                hashMap.put(attribute, value + mac.getGrade());
            }
        }
        Set<Entry<EAttribute, Integer>> entrySet = hashMap.entrySet();
        for (Entry<EAttribute, Integer> entry : entrySet) {
            AttributeChange change = Shr5managementFactory.eINSTANCE.createAttributeChange();
            change.setAttibute(entry.getKey());
            managedCharacter.getChanges().add(change);
            Integer eGet = (Integer)managedCharacter.getPersona().eGet(change.getAttibute());
            change.setFrom(eGet);
            change.setTo(eGet + entry.getValue());
            change.applyChanges();
            change.setDateApplied(null);
        }
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

        if ((object.getCharacterConcept() == null || object.getMetaType() == null || object.getNationality() == null || object.getFormativeYears() == null)
                || object.getTeenYears() == null || object.getRealLife().isEmpty())
            object.setState(GeneratorState.NEW);

        if (object.getState() == GeneratorState.PERSONA_CREATED)
            createOptionWidgets();

        tltmNewItem.setEnabled(object.getState() == GeneratorState.READY_FOR_CREATION);
        tltmChoose.setEnabled(object.getState() == GeneratorState.NEW);
        tltmCommit.setEnabled(object.getState() == GeneratorState.PERSONA_CREATED && validate.getChildren().isEmpty());

        sctnChoose.setExpanded(object.getState() == GeneratorState.NEW || object.getState() == GeneratorState.READY_FOR_CREATION);
        sctnCreate.setExpanded(object.getState() == GeneratorState.PERSONA_CREATED);
        restItem.setEnabled(object.getCharacter()!=null);

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
