package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.spi.ui.ECPReferenceServiceImpl;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.shr5.ecp.Activator;

public class DefaultEmfFormsPage extends FormPage {

    private ECPSWTView ecpView;
    private EObject object;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public DefaultEmfFormsPage(String id, String title) {
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
    public DefaultEmfFormsPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
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
    public DefaultEmfFormsPage(FormEditor editor, String id, String title, EObject object) {
        super(editor, id, title);
        this.object = object;
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
        form.setText("default model page");
        Composite body = form.getBody();
        body.setLayout(new GridLayout());
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);

        final EObject domainObject = object;
        final VView view = ViewProviderHelper.getView(domainObject, null);
        final ViewModelContext vmc = ViewModelContextFactory.INSTANCE.createViewModelContext(view, domainObject, new ECPReferenceServiceImpl());
        try {
            ecpView = ECPSWTViewRenderer.INSTANCE.render(body, vmc);
        } catch (final ECPRendererException ex) {
            MessageDialog.openError(form.getShell(), ex.getClass().getName(), ex.getMessage());
            Activator.logError(ex);
        }
        form.pack();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        if (ecpView != null)
            ecpView.dispose();
        super.dispose();
    }
}
