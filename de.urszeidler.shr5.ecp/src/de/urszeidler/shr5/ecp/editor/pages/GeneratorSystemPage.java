/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.LifeModulesSystem;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;

/**
 * @author urs
 */
public class GeneratorSystemPage extends AbstractShr5Page<Shr5System> {
    private Shr5System object;
    private EditingDomain editingDomain;
    private DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public GeneratorSystemPage(String id, String title) {
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
    public GeneratorSystemPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    public GeneratorSystemPage(FormEditor editor, String id, String title, Shr5System object, EditingDomain editingDomain, ReferenceManager manager) {
        super(editor, id, title, manager);
        this.object = object;
        this.editingDomain = editingDomain;
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
        LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();
        form.setText(labelProvider.getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        addFillToolbar(form.getToolBarManager(), object, form.getShell());
        form.getToolBarManager().update(true);

        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);

        beschreibbarWidget.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Section sctnNewSection = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnNewSection.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnNewSection);
        // sctnNewSection.setText("New Section");
        sctnNewSection.setExpanded(true);

        Composite composite = managedForm.getToolkit().createComposite(sctnNewSection, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite);
        sctnNewSection.setClient(composite);
        composite.setLayout(new GridLayout(4, false));

        Group grpPrioritySytem = new Group(composite, SWT.NONE);
        grpPrioritySytem.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        grpPrioritySytem.setText("Priority sytem");
        managedForm.getToolkit().adapt(grpPrioritySytem);
        managedForm.getToolkit().paintBordersFor(grpPrioritySytem);
        grpPrioritySytem.setLayout(new GridLayout(3, false));

        Group grpKarmapriority = new Group(composite, SWT.NONE);
        grpKarmapriority.setLayout(new GridLayout(3, false));
        grpKarmapriority.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        grpKarmapriority.setText("Karma");
        managedForm.getToolkit().adapt(grpKarmapriority);
        managedForm.getToolkit().paintBordersFor(grpKarmapriority);

        Group grpKarmafactors = new Group(composite, SWT.NONE);
        grpKarmafactors.setLayout(new GridLayout(3, false));
        grpKarmafactors.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        grpKarmafactors.setText("Karmafactors");
        managedForm.getToolkit().adapt(grpKarmafactors);
        managedForm.getToolkit().paintBordersFor(grpKarmafactors);

        Group grpConstraint = new Group(composite, SWT.NONE);
        grpConstraint.setLayout(new GridLayout(3, false));
        grpConstraint.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        grpConstraint.setText("Constrains");
        managedForm.getToolkit().adapt(grpConstraint);
        managedForm.getToolkit().paintBordersFor(grpConstraint);

        Group grpQuelle = new Group(composite, SWT.NONE);
        grpQuelle.setText(Messages.ObjectPage_source);
        grpQuelle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
        managedForm.getToolkit().adapt(grpQuelle);
        managedForm.getToolkit().paintBordersFor(grpQuelle);
        grpQuelle.setLayout(new GridLayout(6, false));

        Section sctnNewSection_1 = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnNewSection_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnNewSection_1);
        sctnNewSection_1.setText("New Section");
        sctnNewSection_1.setExpanded(true);

        Composite composite_1 = managedForm.getToolkit().createComposite(sctnNewSection_1, SWT.NONE);
        sctnNewSection_1.setClient(composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);
        composite_1.setLayout(new GridLayout(3, false));

        Composite composite_2 = managedForm.getToolkit().createComposite(managedForm.getForm().getBody(), SWT.NONE);
        composite_2.setLayout(new GridLayout(2, true));
        composite_2.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite_2);

        String refname = AdapterFactoryUtil.getInstance().getLabelProvider().getText(Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES);
        TreeTableWidget treeTableWidget = new TreeTableWidget(composite_2, refname, SWT.NONE, object,
                Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES, toolkit, mananger, editingDomain, this);
        GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        layoutData.heightHint = 250;
        layoutData.minimumHeight = 250;

        treeTableWidget.setLayoutData(layoutData);
        managedForm.getToolkit().adapt(treeTableWidget);
        managedForm.getToolkit().paintBordersFor(treeTableWidget);

        if (object instanceof LifeModulesSystem) {
            treeTableWidget = new TreeTableWidget(composite_2, AdapterFactoryUtil.getInstance().getLabelProvider()
                    .getText(Shr5managementPackage.Literals.LIFE_MODULES_SYSTEM__MODULES), SWT.NONE, object,
                    Shr5managementPackage.Literals.LIFE_MODULES_SYSTEM__MODULES, toolkit, mananger, editingDomain, this);
            treeTableWidget.setLayoutData(layoutData);
            managedForm.getToolkit().adapt(treeTableWidget);
            managedForm.getToolkit().paintBordersFor(treeTableWidget);
        }

        refname = AdapterFactoryUtil.getInstance().getLabelProvider()
                .getText(Shr5managementPackage.Literals.CHARACTER_GENERATOR_SYSTEM__ADDITIONAL_CONSTRAINS);
        treeTableWidget = new TreeTableWidget(composite_2, refname, SWT.NONE, object,
                Shr5managementPackage.Literals.CHARACTER_GENERATOR_SYSTEM__ADDITIONAL_CONSTRAINS, toolkit, mananger, editingDomain, this);
        treeTableWidget.setLayoutData(layoutData);
        managedForm.getToolkit().adapt(treeTableWidget);
        managedForm.getToolkit().paintBordersFor(treeTableWidget);

        {
            m_bindingContext = initDataBindings();
            createFormBuilder(managedForm);

            sctnNewSection.setText(labelProvider.getText(object.eClass()));

            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR, grpPrioritySytem);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR, grpPrioritySytem);
            emfFormBuilder.addSeperatorEntry(grpPrioritySytem);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__BOUND_SPRITIT_SERVICE_COST, grpPrioritySytem);

            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR, grpKarmafactors);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR, grpKarmafactors);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR, grpKarmafactors);

            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.PRIORITY_SYSTEM__KARMA_POINTS, grpKarmapriority);
            emfFormBuilder.addSeperatorEntry(grpKarmapriority);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__MAX_KARMA_TO_KEEP, grpKarmapriority);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES, grpKarmapriority);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP, grpKarmapriority);

            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES, grpConstraint);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__NUMBER_OF_SPECALISM, grpConstraint);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__SKILL_MAX, grpConstraint);

            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.SHR5_SYSTEM__APPLICABLE_GENERATORS, composite_1);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY, composite_1);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS, composite_1);
            if (object instanceof LifeModulesSystem) {
                emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.LIFE_MODULES_SYSTEM__KNOWLEGE_SKILL_MAX, grpConstraint);
            }
            addSourceFeature(grpQuelle);
        }

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);

        managedForm.reflow(true);
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
}
