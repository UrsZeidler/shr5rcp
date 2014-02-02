package de.urszeidler.shr5.ecp.printer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5Management.ManagedCharacter;

// This is only for development as we could see the changes in the preview.
public class PrintPage extends FormPage {
    private ManagedCharacter character;
    /**
     * Create the form page.
     * @param id
     * @param title
     */
    public PrintPage(String id, String title) {
        super(id, title);
    }

    /**
     * Create the form page.
     * @param editor
     * @param id
     * @param title
     * @wbp.parser.constructor
     * @wbp.eval.method.parameter id "Some id"
     * @wbp.eval.method.parameter title "Some title"
     */
    public PrintPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }
    public PrintPage(FormEditor editor, String id, String title,ManagedCharacter character) {
        super(editor, id, title);
        this.character = character;
    }

    /**
     * Create contents of the form.
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText("Basic Printer");
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new FillLayout(SWT.HORIZONTAL));
        
        TestPrint testPrint = new TestPrint(managedForm.getForm().getBody(), SWT.NONE,character);
        //testPrint.setBounds(0, 0, 827, 1195);
        managedForm.getToolkit().adapt(testPrint);
        managedForm.getToolkit().paintBordersFor(testPrint);
        managedForm.reflow(true);
    }
}
