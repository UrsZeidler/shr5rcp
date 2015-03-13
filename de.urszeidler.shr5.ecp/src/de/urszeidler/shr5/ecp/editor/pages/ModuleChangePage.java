package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Software;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ModuleChange;
import de.urszeidler.eclipse.shr5Management.ModuleCharacterChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

import org.eclipse.swt.widgets.Label;

public class ModuleChangePage extends AbstractShr5Page<ModuleChange> {
    private ModuleChange object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;

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
//        this.object = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
    }

    public ModuleChangePage(FormEditor editor, String id, String title, ModuleChange object) {
        super(editor, id, title);
        this.object = object;

    }

    public ModuleChangePage(FormEditor editor, String id, String title, ModuleChange object, EditingDomain editingDomain, ReferenceManager manager) {
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
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILLGROUP, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL, composite);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SPECALISM, composite);
        }else if (object instanceof ModuleCharacterChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE, composite);
            ModuleCharacterChange mcc = (ModuleCharacterChange)object;
            if(mcc.getCharacterChange()!=null){
                EmfFormBuilder builder = createConfiguredFormBuilder(managedForm);
                
            }
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
}
