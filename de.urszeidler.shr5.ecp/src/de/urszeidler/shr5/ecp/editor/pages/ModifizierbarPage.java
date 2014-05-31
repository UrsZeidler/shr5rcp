package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;

public class ModifizierbarPage extends AbstractShr5Page<Modifizierbar> {
	private Modifizierbar object;
	private EditingDomain editingDomain;
	private DataBindingContext m_bindingContext;

	/**
	 * Create the form page.
	 * 
	 * @param id
	 * @param title
	 */
	public ModifizierbarPage(String id, String title) {
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
	public ModifizierbarPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
		this.object = Shr5Factory.eINSTANCE.createGegenstand();
	}

	public ModifizierbarPage(FormEditor editor, String id, String title,
			Modifizierbar object) {
		super(editor, id, title);
		this.object = object;
		
	}

	public ModifizierbarPage(FormEditor editor, String id, String title, Modifizierbar object, EditingDomain editingDomain,
			ReferenceManager manager) {
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
		form.setText(AdapterFactoryUtil.getInstance()
				.getLabelProvider().getText(object));
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new GridLayout(1, false));
		
		Group grpModifikationen = new Group(managedForm.getForm().getBody(), SWT.NONE);
		grpModifikationen.setLayout(new GridLayout(3, false));
		grpModifikationen.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpModifikationen.setText(Messages.ObjectPage_modifications);
		managedForm.getToolkit().adapt(grpModifikationen);
		managedForm.getToolkit().paintBordersFor(grpModifikationen);

		m_bindingContext = initDataBindings();

		TreeTableWidget treeTableWidget = new TreeTableWidget(grpModifikationen,Messages.ObjectPage_modifications, SWT.NONE, object,
				Shr5Package.Literals.MODIFIZIERBAR__MODS, toolkit, mananger, editingDomain,this);
		treeTableWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		managedForm.getToolkit().adapt(treeTableWidget);
		managedForm.getToolkit().paintBordersFor(treeTableWidget);

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
