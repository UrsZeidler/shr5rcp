package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Shr5Package.Literals;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;

@Deprecated
public class BeschreibbarPage extends FormPage {
	private DataBindingContext m_bindingContext;

	private Beschreibbar beschreibbar;
	private Text textName;
	private Text textBeschreibung;
	private Label imageLabel;
	private Button btnChange;

	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public BeschreibbarPage(String id, String title) {
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
	public BeschreibbarPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	public BeschreibbarPage(FormEditor editor, String id, String title, Beschreibbar object) {
		super(editor, id, title);
		beschreibbar = object;
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Empty FormPage");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new GridLayout(3, false));
		
		Label lblName = new Label(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(lblName, true, true);
		lblName.setText("Name");
		
		textName = new Text(managedForm.getForm().getBody(), SWT.NONE);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(textName, true, true);
		
		imageLabel = new Label(managedForm.getForm().getBody(), SWT.BORDER);
		imageLabel.setImage(null);
		GridData gd_imageLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2);
		gd_imageLabel.heightHint = 128;
		gd_imageLabel.minimumWidth = 128;
		gd_imageLabel.minimumHeight = 128;
		gd_imageLabel.widthHint = 128;
		imageLabel.setLayoutData(gd_imageLabel);
		managedForm.getToolkit().adapt(imageLabel, true, true);
		
		Label lblBeschreibbar = new Label(managedForm.getForm().getBody(), SWT.NONE);
		lblBeschreibbar.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblBeschreibbar, true, true);
		lblBeschreibbar.setText("Beschreibbar");
		
		textBeschreibung = new Text(managedForm.getForm().getBody(), SWT.MULTI);
		GridData gd_textBeschreibung = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 2);
		gd_textBeschreibung.heightHint = 74;
		textBeschreibung.setLayoutData(gd_textBeschreibung);
		managedForm.getToolkit().adapt(textBeschreibung, true, true);
		new Label(managedForm.getForm().getBody(), SWT.NONE);
		
		btnChange = new Button(managedForm.getForm().getBody(), SWT.NONE);
		btnChange.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(btnChange, true, true);
		btnChange.setText("change");
		btnChange.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IWorkspace workspace = ResourcesPlugin.getWorkspace();

				SelectionDialog dlg;
				dlg = new ResourceListSelectionDialog(getEditor().getSite().getShell(), workspace.getRoot(), 1);
				dlg.setTitle("select image");
				int open = dlg.open();
				if (open == Window.OK) {
					Object[] result = dlg.getResult();
					if (result != null)
						beschreibbar.setImage(((IFile) result[0]).getFullPath()
								.toString());

				}

			}
		});
		new Label(managedForm.getForm().getBody(), SWT.NONE);
		new Label(managedForm.getForm().getBody(), SWT.NONE);
		new Label(managedForm.getForm().getBody(), SWT.NONE);
		m_bindingContext = initDataBindings();
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IWidgetValueProperty image = WidgetProperties.image();
		ISWTObservableValue observedImage = image.observe(imageLabel);
		IObservableValue observeValue = EMFObservables.observeValue(beschreibbar, Literals.BESCHREIBBAR__IMAGE);

		IConverter converter = null;
//		if (size > 0) {
//			converter = new PathToImageConverter(String.class, Image.class, size);
//		} else
			converter = new PathToImageConverter(String.class, Image.class);
		UpdateValueStrategy toModel = new UpdateValueStrategy();
		UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
		Binding binding = bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);

		
		//
		IObservableValue observeTextTextNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(textName);
		IObservableValue beschreibbarNameObserveValue = EMFObservables.observeValue(beschreibbar, Literals.BESCHREIBBAR__NAME);
		bindingContext.bindValue(observeTextTextNameObserveWidget, beschreibbarNameObserveValue, null, null);
		//
		IObservableValue observeTextTextBeschreibungObserveWidget = WidgetProperties.text(SWT.Modify).observe(textBeschreibung);
		IObservableValue beschreibbarBeschreibungObserveValue = EMFObservables.observeValue(beschreibbar, Literals.BESCHREIBBAR__BESCHREIBUNG);
		bindingContext.bindValue(observeTextTextBeschreibungObserveWidget, beschreibbarBeschreibungObserveValue, null, null);
		//
		return bindingContext;
	}
}
