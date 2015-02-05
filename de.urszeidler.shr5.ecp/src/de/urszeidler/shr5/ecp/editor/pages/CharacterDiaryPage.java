/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.actions.ActionM2TDialog;
import de.urszeidler.shr5.ecp.editor.actions.ExportObjectAction;

/**
 * @author urs 
 *
 */
public class CharacterDiaryPage extends AbstractShr5Page<CharacterDiary> {
    private CharacterDiary object;
    private EditingDomain editingDomain;
    protected DataBindingContext m_bindingContext;
    
    
    
    
    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public CharacterDiaryPage(String id, String title) {
        super(id, title);
    }

    
    /**
     * The main contructor.
     * 
     * @param editor
     * @param id
     * @param title
     * @param object
     * @param editingDomain
     * @param manager
     */
    public CharacterDiaryPage(FormEditor editor, String id, String title, CharacterDiary object, EditingDomain editingDomain,
            ReferenceManager manager) {
        super(editor, id, title);
        this.object = object;
        this.editingDomain = editingDomain;
        this.mananger = manager;

    }
   
    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        final FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText(labelprovider.getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        form.getToolBarManager().add(new Action("pay fine"){
            
        });
        form.getToolBarManager().add(new Action("test"){
            
        });
        form.getToolBarManager().update(true);

        
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));
        
        Group grpCurrentDate = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpCurrentDate.setLayout(new GridLayout(3, false));
        grpCurrentDate.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        grpCurrentDate.setText("Personal Diary");
        managedForm.getToolkit().adapt(grpCurrentDate);
        managedForm.getToolkit().paintBordersFor(grpCurrentDate);
        
        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new GridLayout(6, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);
        
        initDataBindings();
        createFormBuilder(managedForm);
        
//        for (DiaryEntry de : object.getEntries()) {
//            createDiaryEntry(managedForm,de);
//        }
        
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_DIARY__CHARACTER_DATE, grpCurrentDate, new DateEntryFactory(toolkit));
        GridData controlGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 3);
        controlGridData.heightHint = 250;
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_DIARY__ENTRIES, grpCurrentDate,controlGridData);

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        managedForm.reflow(true);
    }
    
//    private void createDiaryEntry(IManagedForm managedForm, DiaryEntry de) {
//        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
//        composite.setLayout(new GridLayout(3, false));
//        composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
//        managedForm.getToolkit().adapt(composite);
//        managedForm.getToolkit().paintBordersFor(composite);
//
//        EmfFormBuilder emfFormBuilder = new EmfFormBuilder(managedForm.getToolkit(), AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
//                .getInstance().getLabelProvider(), getEditingDomain());
//        emfFormBuilder.setManager(mananger);
//        emfFormBuilder.setNullString(Messages.EmfFormbuilder_non_selected);
////        emfFormBuilder.setBorderStyle(SWT.NONE);
//        emfFormBuilder.setDblListner(this);
//
//        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.DIARY_ENTRY__MESSAGE, composite);
//        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.DIARY_ENTRY__DATE, composite, new DateEntryFactory(managedForm.getToolkit()));
//        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), de);
//
//    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }
    
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        m_bindingContext = bindingContext;
        //
         return bindingContext;
    }
}
