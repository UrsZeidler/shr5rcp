package de.urszeidler.shr5.runtime.ui.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.nebula.jface.cdatetime.CDateTimeObservableValue;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.actions.DuplicateObjectAction;
import de.urszeidler.shr5.ecp.editor.pages.AbstractShr5Page;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.ScriptingPackage;
import de.urszeidler.shr5.scripting.ScriptingPackage.Literals;

public class PlacementPage extends AbstractShr5Page<Placement> {
    private Placement object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private StyledText styledText_1;
    private StyledText styledText_2;
    private StyledText txtNewText;
    private CDateTime dateTime_1;
    private CDateTime dateTime;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public PlacementPage(String id, String title) {
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
    public PlacementPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = ScriptingFactory.eINSTANCE.createPlacement();
    }

    public PlacementPage(FormEditor editor, String id, String title, Placement object) {
        super(editor, id, title);
        this.object = object;

    }
    
    public PlacementPage(FormEditor editor, String id, String title, Placement object, EditingDomain editingDomain, ReferenceManager manager) {
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
        FormToolkit formToolkit = managedForm.getToolkit();
        FormToolkit toolkit = formToolkit;
        ScrolledForm form = managedForm.getForm();
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        form.getToolBarManager().add(new DuplicateObjectAction(object));
        form.getToolBarManager().update(true);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        beschreibbarWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        formToolkit.adapt(beschreibbarWidget);
        formToolkit.paintBordersFor(beschreibbarWidget);
        
        Composite composite = managedForm.getToolkit().createComposite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite);
        
        Section sctnData = managedForm.getToolkit().createSection(composite, Section.TWISTIE | Section.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(sctnData);
        sctnData.setText("Data");
        sctnData.setExpanded(true);
        
        Composite composite_1 = managedForm.getToolkit().createComposite(sctnData, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_1);
        sctnData.setClient(composite_1);
        {
            TableWrapLayout twl_composite_1 = new TableWrapLayout();
            twl_composite_1.numColumns = 3;
            composite_1.setLayout(twl_composite_1);
        }
        
        managedForm.getToolkit().createLabel(composite_1, "start Date", SWT.NONE);
        
        dateTime = new CDateTime(composite_1, CDT.CLOCK_24_HOUR | CDT.DROP_DOWN | CDT.DATE_SHORT | CDT.TIME_SHORT);
        managedForm.getToolkit().adapt(dateTime);
        managedForm.getToolkit().paintBordersFor(dateTime);
        
        Composite composite_5 = managedForm.getToolkit().createComposite(composite_1, SWT.NONE);
        composite_5.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL, 4, 1));
        composite_5.setBounds(0, 0, 64, 64);
        managedForm.getToolkit().paintBordersFor(composite_5);
        composite_5.setLayout(new GridLayout(1, false));
        
        managedForm.getToolkit().createLabel(composite_1, "end Date", SWT.NONE);
        
        dateTime_1 = new CDateTime(composite_1, CDT.CLOCK_24_HOUR | CDT.DROP_DOWN | CDT.DATE_SHORT | CDT.TIME_SHORT);
        managedForm.getToolkit().adapt(dateTime_1);
        managedForm.getToolkit().paintBordersFor(dateTime_1);
        
        Composite composite_7 = new Composite(composite_1, SWT.NONE);
        composite_7.setLayout(new GridLayout(3, false));
        composite_7.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP, 1, 2));
        managedForm.getToolkit().adapt(composite_7);
        managedForm.getToolkit().paintBordersFor(composite_7);
        new Label(composite_1, SWT.NONE);
        new Label(composite_1, SWT.NONE);

      Composite composite_6 = managedForm.getToolkit().createComposite(composite_1, SWT.NONE);
      composite_6.setLayout(new GridLayout(1, false));
      composite_6.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 3));
      managedForm.getToolkit().paintBordersFor(composite_6);
       
        
        
        Composite composite_9 = formToolkit.createComposite(managedForm.getForm().getBody(), SWT.NONE);
        {
            TableWrapLayout twl_composite_9 = new TableWrapLayout();
            twl_composite_9.topMargin = 0;
            twl_composite_9.makeColumnsEqualWidth = true;
            twl_composite_9.numColumns = 1;
            composite_9.setLayout(twl_composite_9);
        }
        GridData gd_composite_9 = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        gd_composite_9.widthHint = 223;
        composite_9.setLayoutData(gd_composite_9);
        formToolkit.paintBordersFor(composite_9);

        Section sctnBackground = formToolkit.createSection(composite_9, Section.TWISTIE | Section.TITLE_BAR);
        sctnBackground.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.MIDDLE, 1, 1));
        sctnBackground.setSize(1183, 116);
        formToolkit.paintBordersFor(sctnBackground);
        sctnBackground.setText("Background");
        sctnBackground.setExpanded(true);

        Composite composite_2 = formToolkit.createComposite(sctnBackground, SWT.NONE);
        formToolkit.paintBordersFor(composite_2);
        sctnBackground.setClient(composite_2);
        composite_2.setLayout(new GridLayout(1, false));
        
        txtNewText =  new StyledText(composite_2,  SWT.WRAP);
        GridData gd_styledText_ = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gd_styledText_.minimumHeight = 80;
        gd_styledText_.widthHint = 120;
        txtNewText.setLayoutData(gd_styledText_);
        txtNewText.setEditable(true);
        txtNewText.setAlwaysShowScrollBars(false);
        formToolkit.adapt(txtNewText);
        formToolkit.paintBordersFor(txtNewText);

 
        // Button btnNewButton = formToolkit.createButton(composite_6, "New Button", SWT.NONE);

        Section sctnInTheirFace = formToolkit.createSection(composite_9, Section.TWISTIE | Section.TITLE_BAR);
        sctnInTheirFace.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(sctnInTheirFace);
        sctnInTheirFace.setText("In their face");
        sctnInTheirFace.setExpanded(true);

        Composite composite_3 = formToolkit.createComposite(sctnInTheirFace, SWT.NONE);
        formToolkit.paintBordersFor(composite_3);
        sctnInTheirFace.setClient(composite_3);
        composite_3.setLayout(new GridLayout(1, false));

        styledText_1 = new StyledText(composite_3,  SWT.WRAP);
        GridData gd_styledText_1 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gd_styledText_1.minimumHeight = 80;
        gd_styledText_1.widthHint = 120;
        styledText_1.setLayoutData(gd_styledText_1);
        styledText_1.setEditable(true);
        styledText_1.setAlwaysShowScrollBars(false);
        formToolkit.adapt(styledText_1);
        formToolkit.paintBordersFor(styledText_1);

        Section sctnDebugging = formToolkit.createSection(composite_9, Section.TWISTIE | Section.TITLE_BAR);
        sctnDebugging.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        sctnInTheirFace.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(sctnInTheirFace);
        sctnDebugging.setText("Debugging");
        sctnDebugging.setExpanded(true);

        Composite composite_4 = formToolkit.createComposite(sctnDebugging, SWT.NONE);
        formToolkit.paintBordersFor(composite_4);
        sctnDebugging.setClient(composite_4);
        composite_4.setLayout(new GridLayout(1, false));

        styledText_2 = new StyledText(composite_4,  SWT.WRAP);
        GridData gd_styledText_2 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gd_styledText_2.minimumHeight = 80;
        gd_styledText_2.widthHint = 120;
        styledText_2.setLayoutData(gd_styledText_2);
        styledText_2.setEditable(true);
        styledText_2.setAlwaysShowScrollBars(false);
        formToolkit.adapt(styledText_2);
        formToolkit.paintBordersFor(styledText_2);

        m_bindingContext = initDataBindings();
        createFormBuilder(managedForm);

        GridData controlGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 3);
        controlGridData.heightHint = 120;

        emfFormBuilder.addTextEntry(ScriptingPackage.Literals.PLACEMENT__OPTIONS, composite_7,controlGridData);
        emfFormBuilder.addTextEntry(ScriptingPackage.Literals.PLACEMENT__SECTIONS, composite_7);
        emfFormBuilder.addTextEntry(ScriptingPackage.Literals.PLACEMENT__NEXT_PLACEMENTS, composite_5);
        emfFormBuilder.addTextEntry(ScriptingPackage.Literals.PLACEMENT__TEAMS, composite_5);
        emfFormBuilder.addTextEntry(ScriptingPackage.Literals.PLACEMENT__HANDOUTS, composite_5);

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        managedForm.reflow(true);
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeLocationDatewidgetObserveWidget = new CDateTimeObservableValue(dateTime);
        IObservableValue currentChangeDateObserveValue = EMFEditObservables.observeValue(editingDomain,object,
                ScriptingPackage.Literals.TIME_FRAME__START_DATE);
        bindingContext.bindValue(observeLocationDatewidgetObserveWidget, currentChangeDateObserveValue, null, null);

        //
        IObservableValue observeLocationDatewidgetObserveWidget1 = new CDateTimeObservableValue(dateTime_1);
        IObservableValue currentChangeDateObserveValue1 = EMFEditObservables.observeValue(editingDomain,object,
                ScriptingPackage.Literals.TIME_FRAME__END_DATE);
        bindingContext.bindValue(observeLocationDatewidgetObserveWidget1, currentChangeDateObserveValue1, null, null);

        //
        IObservableValue observeTextStyledText_1ObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(200, styledText_1);
        IObservableValue objectInTheirFaceObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.PLACEMENT__IN_THEIR_FACE);
        bindingContext.bindValue(observeTextStyledText_1ObserveWidget, objectInTheirFaceObserveValue, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextStyledText_2ObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(200, styledText_2);
        IObservableValue objectDebuggingObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.PLACEMENT__DEBUGGING);
        bindingContext.bindValue(observeTextStyledText_2ObserveWidget, objectDebuggingObserveValue, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextTxtNewTextObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(200, txtNewText);
        IObservableValue objectBackgroundObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.PLACEMENT__BACKGROUND);
        bindingContext.bindValue(observeTextTxtNewTextObserveWidget, objectBackgroundObserveValue, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        //
        return bindingContext;
    }
}
