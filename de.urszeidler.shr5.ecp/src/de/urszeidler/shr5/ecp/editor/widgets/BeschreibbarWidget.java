package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;
import de.urszeidler.shr5.ecp.editor.pages.Messages;

public class BeschreibbarWidget extends Composite {

    private final FormToolkit toolkit;
    private Text textName;
    private Label imageLabel;
    private Text textBeschreibung;
    private Button btnChange;
    private DataBindingContext m_bindingContext;
    private EditingDomain editingDomain;
    private Beschreibbar beschreibbar;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public BeschreibbarWidget(Composite parent1, int style) {
        super(parent1, style);
        toolkit = new FormToolkit(Display.getCurrent());
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        createWidgets(parent1, style);
    }

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     * @param editingDomain 
     */
    public BeschreibbarWidget(Composite parent, int style, Beschreibbar object, FormToolkit toolkit, EditingDomain editingDomain) {
        super(parent, style);
        this.toolkit = toolkit;
        this.beschreibbar = object;
        this.editingDomain = editingDomain;
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        createWidgets(parent, style);
    }

    private void createWidgets(Composite parent1, int style) {
        Composite parent = new Composite(parent1, style);
        toolkit.adapt(parent);
        toolkit.paintBordersFor(parent);

        parent.setLayout(new GridLayout(3, false));
        parent.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblName = new Label(parent, SWT.NONE);
        toolkit.adapt(lblName, true, true);
        lblName.setText(Messages.BeschreibbarWidget_name);

        textName = new Text(parent, SWT.NONE);
        textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.adapt(textName, true, true);

        imageLabel = new Label(parent, SWT.BORDER);
        imageLabel.setImage(null);
        GridData gd_imageLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2);
        gd_imageLabel.heightHint = 128;
        gd_imageLabel.minimumWidth = 128;
        gd_imageLabel.minimumHeight = 128;
        gd_imageLabel.widthHint = 128;
        imageLabel.setLayoutData(gd_imageLabel);
        toolkit.adapt(imageLabel, true, true);

        Label lblBeschreibbar = new Label(parent, SWT.NONE);
        lblBeschreibbar.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        toolkit.adapt(lblBeschreibbar, true, true);
        lblBeschreibbar.setText(Messages.BeschreibbarWidget_description);

        textBeschreibung = new Text(parent, SWT.MULTI);
        GridData gd_textBeschreibung = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 2);
        gd_textBeschreibung.heightHint = 74;
        textBeschreibung.setLayoutData(gd_textBeschreibung);
        toolkit.adapt(textBeschreibung, true, true);
        new Label(parent, SWT.NONE);

        btnChange = new Button(parent, SWT.NONE);
        btnChange.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.adapt(btnChange, true, true);
        btnChange.setText(Messages.BeschreibbarWidget_change_image);
        btnChange.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                IWorkspace workspace = ResourcesPlugin.getWorkspace();

                SelectionDialog dlg;
                dlg = new ResourceListSelectionDialog(getShell(), workspace.getRoot(), 1);
                dlg.setTitle(Messages.BeschreibbarWidget_select_image);

                int open = dlg.open();
                if (open == Window.OK) {
                    Object[] result = dlg.getResult();
                    if (result != null)
                        beschreibbar.setImage(((IFile)result[0]).getFullPath().toString());

                }

            }
        });
        m_bindingContext = initDataBindings();
    }

    protected DataBindingContext initDataBindings() {
        if (beschreibbar == null)
            return null;

        DataBindingContext bindingContext = new DataBindingContext();
        //
        IWidgetValueProperty image = WidgetProperties.image();
        ISWTObservableValue observedImage = image.observe(imageLabel);
        IObservableValue observeValue = EMFEditObservables.observeValue(editingDomain, beschreibbar, Shr5Package.Literals.BESCHREIBBAR__IMAGE);

        IConverter converter = null;

        converter = new PathToImageConverter(String.class, Image.class);
        UpdateValueStrategy toModel = new UpdateValueStrategy();
        UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
        bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);

        //
        IObservableValue observeTextTextNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(textName);
        IObservableValue beschreibbarNameObserveValue = EMFEditObservables.observeValue(editingDomain, beschreibbar,
                Shr5Package.Literals.BESCHREIBBAR__NAME);
        bindingContext.bindValue(observeTextTextNameObserveWidget, beschreibbarNameObserveValue, null, null);
        //
        IObservableValue observeTextTextBeschreibungObserveWidget = WidgetProperties.text(SWT.Modify).observe(textBeschreibung);
        IObservableValue beschreibbarBeschreibungObserveValue = EMFEditObservables.observeValue(editingDomain, beschreibbar,
                Shr5Package.Literals.BESCHREIBBAR__BESCHREIBUNG);
        bindingContext.bindValue(observeTextTextBeschreibungObserveWidget, beschreibbarBeschreibungObserveValue, null, null);
        //
        return bindingContext;
    }

}
