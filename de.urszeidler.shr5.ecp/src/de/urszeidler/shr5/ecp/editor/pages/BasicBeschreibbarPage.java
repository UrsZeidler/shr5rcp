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
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

public class BasicBeschreibbarPage extends AbstractShr5Page<Beschreibbar> {
	private Beschreibbar object;
	private EditingDomain editingDomain;

	private DataBindingContext m_bindingContext;

	/**
	 * Create the form page.
	 * 
	 * @param id
	 * @param title
	 */
	public BasicBeschreibbarPage(String id, String title) {
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
	public BasicBeschreibbarPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
		this.object = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
	}

	public BasicBeschreibbarPage(FormEditor editor, String id, String title,
			Beschreibbar object) {
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
		form.setText(AdapterFactoryUtil.getInstance()
				.getLabelProvider().getText(object));
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

		BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(
				managedForm.getForm().getBody(), SWT.NONE, object,
				toolkit);
		GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP,
				true, false, 1, 1);
		gd_beschreibbarWidget.widthHint = 0;
		gd_beschreibbarWidget.heightHint = 0;
		beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
		managedForm.getToolkit().adapt(beschreibbarWidget);
		managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

		m_bindingContext = initDataBindings();

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
