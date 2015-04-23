package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.PersonaMartialartStyle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.CharacterChange;
import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.ContractPayment;
import de.urszeidler.eclipse.shr5Management.DiaryEntry;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.ModuleAttributeChange;
import de.urszeidler.eclipse.shr5Management.ModuleFeatureChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange;
import de.urszeidler.eclipse.shr5Management.ModuleTeachableChange;
import de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange;
import de.urszeidler.eclipse.shr5Management.QuellenConstrain;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.TrainingRange;
import de.urszeidler.eclipse.shr5Management.TrainingRate;
import de.urszeidler.eclipse.shr5Management.TrainingsTime;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class EObjectBasicPage extends AbstractShr5Page<EObject> implements Adapter {
    private EObject object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Composite compositedetail_1;
    private EmfFormBuilder changeFormBuilder;
    private Composite compositedetail_2;
    private Composite composite_1;
    private Composite composite_2;
    private Label validateText;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public EObjectBasicPage(String id, String title) {
        super(id, title);
    }

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
    public EObjectBasicPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    public EObjectBasicPage(FormEditor editor, String id, String title, EObject object) {
        super(editor, id, title);
        this.object = object;

    }

    public EObjectBasicPage(FormEditor editor, String id, String title, EObject object, EditingDomain editingDomain, ReferenceManager manager) {
        super(editor, id, title, manager);
        this.object = object;
        this.editingDomain = editingDomain;

        // if (!object.eAdapters().contains(this))
        // object.eAdapters().add(this);
        object.eAdapters().add(this);
    }

    @Override
    public void dispose() {
        if (object.eAdapters().contains(this))
            object.eAdapters().remove(this);

        if (changeFormBuilder != null)
            changeFormBuilder.dispose();

        super.dispose();
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
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object.eClass()));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        composite_1 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);
        composite_1.setLayout(new GridLayout(1, false));

        Composite composite = new Composite(composite_1, SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        compositedetail_1 = new Composite(composite_1, SWT.NONE);
        compositedetail_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        compositedetail_1.setSize(10, 10);
        compositedetail_1.setLayout(new GridLayout(3, false));
        managedForm.getToolkit().adapt(compositedetail_1);
        managedForm.getToolkit().paintBordersFor(compositedetail_1);

        compositedetail_2 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        compositedetail_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        compositedetail_2.setLayout(new GridLayout(3, false));
        managedForm.getToolkit().adapt(compositedetail_2);
        managedForm.getToolkit().paintBordersFor(compositedetail_2);

        composite_2 = managedForm.getToolkit().createComposite(managedForm.getForm().getBody(), SWT.NONE);
        composite_2.setLayout(new GridLayout(1, false));
        composite_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite_2);

        m_bindingContext = initDataBindings();
        createFormBuilder(managedForm);
        DateEntryFactory dateEntryFactory = new DateEntryFactory(toolkit);

        if (object instanceof ModuleSkillChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__SELECT_ONE, composite);
        } else if (object instanceof ModuleTeachableChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TEACHABLE_CHANGE__TEACHABLE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__SELECT_ONE, composite);
        } else if (object instanceof ModuleAttributeChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__SELECT_ONE, composite);
        } else if (object instanceof ModuleFeatureChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_FEATURE_CHANGE__FEATURE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_FEATURE_CHANGE__VALUE, composite);
        } else if (object instanceof ModuleSkillGroupChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__SELECT_ONE, composite);
        } else if (object instanceof QuellenConstrain) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.QUELLEN_CONSTRAIN__SOURCE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.QUELLEN_CONSTRAIN__CONSTRAIN_TYPE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.QUELLEN_CONSTRAIN__TARGETS, composite);
        } else if (object instanceof IncreaseCharacterPart) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.INCREASE_CHARACTER_PART__TYPE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.ADVANCEMENT__KARMA_FACTOR, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.RANGE_TABLE__RANGE_TABLE_ENTRIES, composite);
        } else if (object instanceof TrainingRate) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.RANGE_TABLE_ENTRY__FROM, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.RANGE_TABLE_ENTRY__TO, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAINING_RATE__FACTOR, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAINING_RATE__TIME_UNIT, composite);
        } else if (object instanceof AttributModifikatorWert) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT, composite);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ATTRIBUT_MODIFIKATOR_WERT__MODIFYABLE, composite);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ATTRIBUT_MODIFIKATOR_WERT__WERT, composite);
        } else if (object instanceof DiaryEntry) {
            DiaryEntry de = (DiaryEntry)object;
            EObject eContainer = de.eContainer();
            if (de.getDate() == null && eContainer instanceof CharacterDiary && eContainer.eContainer() instanceof ManagedCharacter)
                de.setDate(ShadowrunManagmentTools.findCorrenspondingDate((ManagedCharacter)eContainer.eContainer()));

            if (object instanceof TrainingsTime) {
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_CHANGE__CHANGE, composite);
                emfFormBuilder.addTextEntry("Training Start", Shr5managementPackage.Literals.DIARY_ENTRY__DATE, composite, dateEntryFactory);
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAININGS_TIME__DAYS_TRAINED, composite, labelEntryFactory);
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAININGS_TIME__DAYS_REMAINS, composite, labelEntryFactory);
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAININGS_TIME__TRAINING_COMPLETE, composite, labelEntryFactory);
                // emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAININGS_TIME__TRAINING_COMPLETE, composite);
                TrainingsTime tt = (TrainingsTime)object;
                if (tt.getChange() instanceof PersonaMartialArtChange) {
                    // emfFormBuilder.addTextEntry(tt.getChange(),Shr5managementPackage.Literals.PERSONA_CHANGE__CHANGEABLE, composite);
                    // emfFormBuilder.addTextEntry(tt.getChange(),Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE__STYLE, composite);
                    // emfFormBuilder.addTextEntry(tt.getChange(),Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE, composite);

                    PersonaMartialArtChange pmac = (PersonaMartialArtChange)tt.getChange();
                    compositedetail_1 = createChangeDetail(managedForm, pmac, compositedetail_1);
                }
                // emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAININGS_TIME__TRAINING, composite, createControllGridData(80));
                createTreeTableWidget(compositedetail_2, Shr5managementPackage.Literals.TRAININGS_TIME__TRAINING, managedForm, tt);
                validateText = new Label(composite_2, SWT.WRAP);
                validateText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
                managedForm.getToolkit().adapt(validateText, true, true);
                validateText.setText("");

            } else if (object instanceof CharacterChange) {
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.DIARY_ENTRY__DATE, composite, dateEntryFactory);
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_CHANGE__CHANGE, composite);
            } else if (object instanceof ContractPayment) {
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.DIARY_ENTRY__DATE, composite, dateEntryFactory);
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.DIARY_ENTRY__MESSAGE, composite);
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CONTRACT_PAYMENT__CONTRACT_TO_PAY, composite, new ReadOnlyLinkEntry(
                        toolkit));
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CONTRACT_PAYMENT__PAYED, composite);
                managedForm.getForm().setEnabled(!((ContractPayment)object).isPayed());
            } else {
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.DIARY_ENTRY__DATE, composite, dateEntryFactory);
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.DIARY_ENTRY__MESSAGE, composite, createControllGridData(300));
            }
        } else if (object instanceof PersonaMartialartStyle) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.PERSONA_MARTIALART_STYLE__STYLE, composite, new ReadOnlyLinkEntry(toolkit));
            emfFormBuilder.addTextEntry(Shr5Package.Literals.PERSONA_MARTIALART_STYLE__TECHNIQUES, composite, createControllGridData(100));

        } else if (object instanceof TrainingRange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAINING_RANGE__DAYS_TRAINED, composite, labelEntryFactory);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAINING_RANGE__START, composite, dateEntryFactory);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAINING_RANGE__END, composite, dateEntryFactory);

            // emfFormBuilder.addTextEntry(((TrainingRange)object).getTrainingTime(), Shr5managementPackage.Literals.TRAININGS_TIME__DAYS_REMAINS,
            // composite);

        }

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);

    }

    private Composite createChangeDetail(IManagedForm managedForm, PersonaMartialArtChange pmac, Composite compositedetail_12) {
        if (changeFormBuilder != null)
            changeFormBuilder.dispose();

        compositedetail_12.dispose();
        Group composite = new Group(composite_1, SWT.NONE);
        composite.setText(labelprovider.getText(Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE));
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        changeFormBuilder = createConfiguredFormBuilder(managedForm);
        changeFormBuilder.addTextEntry(Shr5managementPackage.Literals.PERSONA_CHANGE__CHANGEABLE, composite);
        changeFormBuilder.addTextEntry(Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE__STYLE, composite);
        changeFormBuilder.addTextEntry(Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE, composite);

        changeFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), pmac);
        composite.getParent().layout(true);
        managedForm.reflow(true);
        return composite;
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }

    protected String featureName(EStructuralFeature feature) {
        return ShadowrunEditingTools.toFeatureName(object, feature);
    }

    @Override
    public void notifyChanged(Notification notification) {
        Object feature = notification.getFeature();
        if (Shr5managementPackage.Literals.CHARACTER_CHANGE__CHANGE.equals(feature)) {
            if (((TrainingsTime)object).getChange() instanceof PersonaMartialArtChange)
                compositedetail_1 = createChangeDetail(getManagedForm(), (PersonaMartialArtChange)((TrainingsTime)object).getChange(),
                        compositedetail_1);
            else
                compositedetail_1.dispose();
        } else if (Shr5managementPackage.Literals.TRAININGS_TIME__DAYS_TRAINED.equals(feature)) {
            Diagnostic validate = Diagnostician.INSTANCE.validate(object, createValidationContext());
            if (!validate.getChildren().isEmpty()) {
                final String message = Joiner.on("\n").join(
                        FluentIterable.from(validate.getChildren()).transform(ShadowrunEditingTools.diagnosticToStringTransformer()));
                validateText.setText(message);
            } else
                validateText.setText("");
            if (object instanceof TrainingsTime) {
                TrainingsTime tt = (TrainingsTime)object;
                if (tt.getDaysRemains() == 0)
                    getManagedForm().getForm().setEnabled(false);
            }
        } else if (Shr5managementPackage.Literals.CONTRACT_PAYMENT__PAYED.equals(feature)) {
            if (object instanceof ContractPayment) {
                ContractPayment cp = (ContractPayment)object;
                getManagedForm().getForm().setEnabled(!cp.isPayed());
            }
        }

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
