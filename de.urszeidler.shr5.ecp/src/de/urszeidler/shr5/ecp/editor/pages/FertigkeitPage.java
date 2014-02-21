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

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

/**
 * Manages {@link Fertigkeit} and {@link FertigkeitsGruppe}.
 * @author urs
 *
 */
public class FertigkeitPage extends AbstractShr5Page<Beschreibbar> {
	private Beschreibbar object;
	private EditingDomain editingDomain;

	private DataBindingContext m_bindingContext;

	/**
	 * Create the form page.
	 * 
	 * @param id
	 * @param title
	 */
	public FertigkeitPage(String id, String title) {
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
	public FertigkeitPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
		this.object = Shr5Factory.eINSTANCE.createFertigkeit();
	}

	public FertigkeitPage(FormEditor editor, String id, String title, Beschreibbar object, EditingDomain editingDomain,
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
		form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

		BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit);
		GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_beschreibbarWidget.widthHint = 0;
		gd_beschreibbarWidget.heightHint = 0;
		beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
		managedForm.getToolkit().adapt(beschreibbarWidget);
		managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

		Group grpFertigkeit = new Group(managedForm.getForm().getBody(), SWT.NONE);
		grpFertigkeit.setLayout(new GridLayout(3, false));
		grpFertigkeit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpFertigkeit.setText("Fertigkeit");
		managedForm.getToolkit().adapt(grpFertigkeit);
		managedForm.getToolkit().paintBordersFor(grpFertigkeit);

		Group grpQuelle = new Group(managedForm.getForm().getBody(), SWT.NONE);
		grpQuelle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		grpQuelle.setText("Quelle");
		managedForm.getToolkit().adapt(grpQuelle);
		managedForm.getToolkit().paintBordersFor(grpQuelle);
		grpQuelle.setLayout(new GridLayout(6, false));

		m_bindingContext = initDataBindings();

		createFormBuilder(managedForm);

		if (object instanceof Fertigkeit) {
			grpFertigkeit.setText("Fertigkeit");
			emfFormBuilder.addTextEntry( Shr5Package.Literals.FERTIGKEIT__ATTRIBUT, grpFertigkeit);
			emfFormBuilder.addTextEntry( Shr5Package.Literals.FERTIGKEIT__KATEGORIE, grpFertigkeit);
			emfFormBuilder.addTextEntry( Shr5Package.Literals.FERTIGKEIT__AUSWEICHEN, grpFertigkeit);
		} else if (object instanceof FertigkeitsGruppe) {
			grpFertigkeit.setText("Fertigkeitsgruppe");
			emfFormBuilder.addTextEntry( Shr5Package.Literals.FERTIGKEITS_GRUPPE__FERTIGKEITEN, grpFertigkeit);
		}

		emfFormBuilder.addTextEntry( Shr5Package.Literals.QUELLE__SRC_BOOK, grpQuelle);
		emfFormBuilder.addTextEntry( Shr5Package.Literals.QUELLE__PAGE, grpQuelle);

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
