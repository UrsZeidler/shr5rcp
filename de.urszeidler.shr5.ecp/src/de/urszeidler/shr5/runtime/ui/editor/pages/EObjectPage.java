package de.urszeidler.shr5.runtime.ui.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EObject;
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
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.actions.ActionM2TDialog;
import de.urszeidler.shr5.ecp.editor.actions.ExportObjectAction;
import de.urszeidler.shr5.ecp.editor.actions.ImportObjectAction;
import de.urszeidler.shr5.ecp.editor.pages.AbstractShr5Page;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptHistory;
import de.urszeidler.shr5.scripting.ScriptingPackage;
import de.urszeidler.shr5.scripting.Scripts;

public class EObjectPage extends AbstractShr5Page<EObject> {
    private EObject object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public EObjectPage(String id, String title) {
        super(id, title);
    }

 
    public EObjectPage(FormEditor editor, String id, String title, EObject object, EditingDomain editingDomain, ReferenceManager manager) {
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
        if (object instanceof ScriptHistory) {
            form.getToolBarManager().add(new ActionM2TDialog(form.getShell(), object));
        }  else if (object instanceof Scripts) {
            form.getToolBarManager().add(new ActionM2TDialog(form.getShell(), object));
            form.getToolBarManager().add(new ImportObjectAction(form.getShell(),object));
        }else{
            addFillToolbar(form.getToolBarManager(), object, form.getShell());
        }
        form.getToolBarManager().update(true);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));
        
        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

 
        m_bindingContext = initDataBindings();
        createFormBuilder(managedForm);
        DateEntryFactory dateEntryFactory = new DateEntryFactory(toolkit);
        ReadOnlyLinkEntry linkEntryFactory = new ReadOnlyLinkEntry(toolkit);

        if (object instanceof ScriptHistory) {
            emfFormBuilder.addTextEntry(ScriptingPackage.Literals.SCRIPT_HISTORY__CURRENT_DATE, composite,dateEntryFactory);          
            emfFormBuilder.addTextEntry(ScriptingPackage.Literals.SCRIPT_HISTORY__CURRENT_PLACEMENT, composite,linkEntryFactory);          
            emfFormBuilder.addTextEntry(ScriptingPackage.Literals.SCRIPT_HISTORY__WRITTEN_PROTOKOL, composite,createControllGridData(200));          
        }else if (object instanceof Scripts) {
            emfFormBuilder.addTextEntry(ScriptingPackage.Literals.SCRIPTS__NAME, composite);          
            emfFormBuilder.addTextEntry(ScriptingPackage.Literals.SCRIPTS__STORIES, composite,createControllGridData(250));          
            
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
