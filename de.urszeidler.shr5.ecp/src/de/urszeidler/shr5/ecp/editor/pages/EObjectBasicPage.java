package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.ModuleAttributeChange;
import de.urszeidler.eclipse.shr5Management.ModuleFeatureChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange;
import de.urszeidler.eclipse.shr5Management.ModuleTeachableChange;
import de.urszeidler.eclipse.shr5Management.QuellenConstrain;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.TrainingRate;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class EObjectBasicPage extends AbstractShr5Page<EObject> {
    private EObject object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;

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

//        if (!object.eAdapters().contains(this))
//            object.eAdapters().add(this);
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

        m_bindingContext = initDataBindings();
        createFormBuilder(managedForm);

        if (object instanceof ModuleSkillChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__SELECT_ONE, composite);
        }else if (object instanceof ModuleTeachableChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TEACHABLE_CHANGE__TEACHABLE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__SELECT_ONE, composite);
        }else if (object instanceof ModuleAttributeChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__GRADE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_TYPE_CHANGE__SELECT_ONE, composite);
        }else if (object instanceof ModuleFeatureChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_FEATURE_CHANGE__FEATURE, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_FEATURE_CHANGE__VALUE, composite);
        }else if (object instanceof ModuleSkillGroupChange) {
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
        }else if (object instanceof TrainingRate) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.RANGE_TABLE_ENTRY__FROM, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.RANGE_TABLE_ENTRY__TO, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAINING_RATE__FACTOR, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.TRAINING_RATE__TIME_UNIT, composite);
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

    protected String featureName(EStructuralFeature feature) {
        return ShadowrunEditingTools.toFeatureName(object, feature);
    }
}
