package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ModuleAttributeChange;
import de.urszeidler.eclipse.shr5Management.ModuleChange;
import de.urszeidler.eclipse.shr5Management.ModuleFeatureChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange;
import de.urszeidler.eclipse.shr5Management.ModuleTeachableChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class ModuleChangePage extends AbstractShr5Page<ModuleChange> implements Adapter {
    private ModuleChange object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Group grpChangeDefinition;
    private Composite composite_1;
    private EmfFormBuilder detailBuilder;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public ModuleChangePage(String id, String title) {
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
    public ModuleChangePage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    public ModuleChangePage(FormEditor editor, String id, String title, ModuleChange object) {
        super(editor, id, title);
        this.object = object;

    }

    public ModuleChangePage(FormEditor editor, String id, String title, ModuleChange object, EditingDomain editingDomain, ReferenceManager manager) {
        super(editor, id, title, manager);
        this.object = object;
        this.editingDomain = editingDomain;

//        if (!object.eAdapters().contains(this))
//            object.eAdapters().add(this);
    }

    @Override
    public void dispose() {
//        if (detailBuilder != null)
//            detailBuilder.dispose();
//        if (!object.eAdapters().contains(this))
//            object.eAdapters().remove(this);

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
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        grpChangeDefinition = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpChangeDefinition.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpChangeDefinition.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        grpChangeDefinition.setText("change definition");
        managedForm.getToolkit().adapt(grpChangeDefinition);
        managedForm.getToolkit().paintBordersFor(grpChangeDefinition);

        composite_1 = new Composite(grpChangeDefinition, SWT.NONE);
        managedForm.getToolkit().adapt(composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);
        composite_1.setLayout(new GridLayout(3, false));

        m_bindingContext = initDataBindings();
        createFormBuilder(managedForm);

        if (object instanceof ModuleSkillChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SELECT_ONE, composite);
        }else if (object instanceof ModuleTeachableChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TEACHABLE_CHANGE__TEACHABLE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TEACHABLE_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TEACHABLE_CHANGE__SELECT_ONE, composite);
        }else if (object instanceof ModuleAttributeChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_ATTRIBUTE_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_ATTRIBUTE_CHANGE__SELECT_ONE, composite);
        }else if (object instanceof ModuleFeatureChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_FEATURE_CHANGE__FEATURE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_FEATURE_CHANGE__VALUE, composite);
        }else if (object instanceof ModuleSkillGroupChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_GROUP_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_GROUP_CHANGE__SELECT_ONE, composite);
        }

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
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

    private void createDetail(IManagedForm managedForm) {
        if (detailBuilder != null)
            detailBuilder.dispose();
        if (composite_1 != null)
            composite_1.dispose();

        composite_1 = new Composite(grpChangeDefinition, SWT.NONE);
        managedForm.getToolkit().adapt(composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);
        composite_1.setLayout(new GridLayout(3, false));

        EObject detailObject = null;
        detailBuilder = createConfiguredFormBuilder(managedForm);
//        if (object instanceof ModuleCharacterChange) {
//            ModuleCharacterChange mcc = (ModuleCharacterChange)object;
//            if (mcc.getCharacterChange() != null) {
//                detailObject = mcc.getCharacterChange();
//                if (mcc.getCharacterChange() instanceof AttributeChange) {
//                    detailBuilder.addTextEntry(Shr5managementPackage.Literals.ATTRIBUTE_CHANGE__ATTIBUTE, composite_1);
//                    detailBuilder.addTextEntry(Shr5managementPackage.Literals.PERSONA_VALUE_CHANGE__TO, composite_1);
//                } else if (mcc.getCharacterChange() instanceof PersonaChange) {
//                    detailBuilder.addTextEntry(Shr5managementPackage.Literals.PERSONA_CHANGE__CHANGEABLE, composite_1);
//                }
//            }
//        } else 
//            if (object instanceof ModuleSkillChange) {
//            ModuleSkillChange msc = (ModuleSkillChange)object;
//            if(msc.getSkill()!=null){
//                detailBuilder.addTextEntry(Shr5Package.Literals.PERSONA_FERTIGKEIT__FERTIGKEIT, composite_1);
//                detailBuilder.addTextEntry(Shr5Package.Literals.STEIGERBAR__STUFE, composite_1);
//                detailObject = msc.getSkill();
//            }else if(msc.getSkillgroup()!=null){
//                detailBuilder.addTextEntry(Shr5Package.Literals.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE, composite_1);
//                detailBuilder.addTextEntry(Shr5Package.Literals.STEIGERBAR__STUFE, composite_1);
//                detailObject = msc.getSkillgroup();
//            }
//        }
        detailBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), detailObject);
        grpChangeDefinition.layout(true);
        managedForm.getForm().reflow(true);
    }

    protected String featureName(EStructuralFeature feature) {
        return ShadowrunEditingTools.toFeatureName(object, feature);
    }

    @Override
    public void notifyChanged(Notification notification) {
        Object feature = notification.getFeature();
//        Object newValue = notification.getNewValue();
        if (feature == null)
            return;
//        if (Shr5managementPackage.Literals.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE.equals(feature)) {
//            createDetail(getManagedForm());
//        } else
//            if (Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL.equals(feature)) {
//            if (newValue != null) {
//                ((ModuleSkillChange)object).setSkillgroup(null);
//                createDetail(getManagedForm());
//            }
//        } else if (Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILLGROUP.equals(feature)) {
//            if (newValue != null) {
//                ((ModuleSkillChange)object).setSkill(null);
//                createDetail(getManagedForm());
//            }
//        }
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
