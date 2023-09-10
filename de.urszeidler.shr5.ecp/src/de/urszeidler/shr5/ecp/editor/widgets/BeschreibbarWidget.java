package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;
import de.urszeidler.shr5.ecp.dialogs.ImageChooseDialog;
import de.urszeidler.shr5.ecp.editor.pages.Messages;

public class BeschreibbarWidget extends Composite {

    private final FormToolkit toolkit;
    private Text textName;
    private Label imageLabel;
    private StyledText textBeschreibung;
    private DataBindingContext m_bindingContext;
    private EditingDomain editingDomain;
    private Beschreibbar beschreibbar;
    private Section sctnNewSection;
    private Composite composite;
    private Link link;
    private Link link_clear;

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
        this.pack();
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
        this.pack();
    }

    private void createWidgets(Composite parent1, int style) {
        setLayout(new FillLayout(SWT.HORIZONTAL));
        sctnNewSection = toolkit.createSection(this, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);

        toolkit.paintBordersFor(sctnNewSection);
        sctnNewSection.setText(Messages.BeschreibbarWidget_sctnNewSection_text);
        sctnNewSection.setExpanded(true);

        Composite parent = new Composite(sctnNewSection, style);
        sctnNewSection.setClient(parent);

        toolkit.adapt(parent);
        toolkit.paintBordersFor(parent);

        parent.setLayout(new GridLayout(3, false));
        parent.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblName = new Label(parent, SWT.NONE);
        toolkit.adapt(lblName, true, true);
        lblName.setText(Messages.BeschreibbarWidget_name);

        textName = new Text(parent, SWT.BORDER);// toolkit.createText(parent, "");//
        textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        textName.setMessage(Messages.BeschreibbarWidget_name);
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

        textBeschreibung = new StyledText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI);// toolkit.createText(parent, "", SWT.MULTI|SWT.BORDER);
        textBeschreibung.setToolTipText(Messages.BeschreibbarWidget_textBeschreibung_toolTipText);
        // textBeschreibung.setMessage(Messages.BeschreibbarWidget_description);
        GridData gd_textBeschreibung = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 2);
        gd_textBeschreibung.widthHint = 50;
        gd_textBeschreibung.heightHint = 74;
        textBeschreibung.setLayoutData(gd_textBeschreibung);
        toolkit.adapt(textBeschreibung, true, true);
        new Label(parent, SWT.NONE);

        composite = new Composite(parent, SWT.NONE);
        composite.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
        toolkit.adapt(composite);
        toolkit.paintBordersFor(composite);
        GridLayout gl_composite = new GridLayout(2, true);
        gl_composite.marginHeight = 0;
        composite.setLayout(gl_composite);

        link = new Link(composite, SWT.NONE);
        link.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
        link.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                ImageChooseDialog imageChooseDialog = new ImageChooseDialog(getShell(),beschreibbar.getImage());
                if (imageChooseDialog.open() == Window.OK) {
                    if (imageChooseDialog.getValue() != null) {
                        Command create = SetCommand.create(editingDomain, beschreibbar, Shr5Package.Literals.BESCHREIBBAR__IMAGE, imageChooseDialog.getValue()
                                );
                        editingDomain.getCommandStack().execute(create);
                    }
                }
            }

        });
        toolkit.adapt(link, true, true);
        link.setText(Messages.BeschreibbarWidget_link_text);

        link_clear = new Link(composite, SWT.NONE);
        link_clear.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
        link_clear.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Command create = SetCommand.create(editingDomain, beschreibbar, Shr5Package.Literals.BESCHREIBBAR__IMAGE, null);
                editingDomain.getCommandStack().execute(create);
            }
        });
        toolkit.adapt(link_clear, true, true);
        link_clear.setText(Messages.BeschreibbarWidget_link_clear_text);
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
