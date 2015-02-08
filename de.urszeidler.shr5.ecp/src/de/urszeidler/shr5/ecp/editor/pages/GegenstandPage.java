package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Commlink;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.DefaultWifi;
import de.urszeidler.eclipse.shr5.Fokus;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.MagieFokus;
import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.Munition;
import de.urszeidler.eclipse.shr5.QiFokus;
import de.urszeidler.eclipse.shr5.RiggerCommandConsole;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SubstanceContainer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.runtime.ui.widgets.CommlinkWidget;
import de.urszeidler.shr5.runtime.ui.widgets.CyberdeckWidget;
import de.urszeidler.shr5.runtime.ui.widgets.RiggerCommandConsoleWidget;

/**
 * Manages {@link Gegenstand} and {@link Kleidung}, {@link Credstick} and {@link Munition}.
 * 
 * @author urs
 */
public class GegenstandPage extends AbstractShr5Page<AbstraktGegenstand> {
    private AbstraktGegenstand object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public GegenstandPage(String id, String title) {
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
    public GegenstandPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createGegenstand();
    }

    public GegenstandPage(FormEditor editor, String id, String title, AbstraktGegenstand object, EditingDomain editingDomain, ReferenceManager manager) {
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
        LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();
        form.setText(labelProvider.getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);

        beschreibbarWidget.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Group grpGegenstand = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpGegenstand.setLayout(new GridLayout(6, false));
        grpGegenstand.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(grpGegenstand);
        managedForm.getToolkit().paintBordersFor(grpGegenstand);

        Composite composite_Additional = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_Additional.setLayout(new GridLayout(3, false));
        composite_Additional.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_Additional);
        managedForm.getToolkit().paintBordersFor(composite_Additional);

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        Group grpWert = new Group(composite, SWT.NONE);
        grpWert.setText(Messages.ObjectPage_price);
        managedForm.getToolkit().adapt(grpWert);
        managedForm.getToolkit().paintBordersFor(grpWert);
        grpWert.setLayout(new GridLayout(9, false));

        Group grpQuelle = new Group(composite, SWT.NONE);
        grpQuelle.setText(Messages.ObjectPage_source);
        managedForm.getToolkit().adapt(grpQuelle);
        managedForm.getToolkit().paintBordersFor(grpQuelle);
        grpQuelle.setLayout(new GridLayout(6, false));
        
        Section sctnRuntime = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnRuntime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnRuntime);
        sctnRuntime.setText(Messages.GegenstandPage_sctnRuntime_text);
        sctnRuntime.setExpanded(false);
        
        final Composite composite_runtime = managedForm.getToolkit().createComposite(sctnRuntime, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_runtime);
        sctnRuntime.setClient(composite_runtime);
        composite_runtime.setLayout(new GridLayout(6, false));


        m_bindingContext = initDataBindings();

        createFormBuilder(managedForm);

        grpGegenstand.setText(labelProvider.getText(object.eClass()));
        if (object instanceof Gegenstand) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEGENSTAND__KATEGORIE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEGENSTAND__STUFE, grpGegenstand);
        } else if (object instanceof Kleidung) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.KLEIDUNG__RUESTUNG, grpGegenstand);
        } else if (object instanceof Credstick) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK__MAX_VALUE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK__CURRENT_VALUE, grpGegenstand, new LabelMoneyEntry());
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK__TRANSACTIONLOG, grpGegenstand);
        } else if (object instanceof Munition) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MENGE__ANZAHL, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MENGE__PRO_ANZAHL, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MUNITION__TYPE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MUNITION__DAMAGE_MOD, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MUNITION__DAMAGE_TYPE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MUNITION__ARMOR_MOD, grpGegenstand);
        } else if (object instanceof Cyberdeck) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__ATTRIBUTE1, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__ATTRIBUTE2, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__ATTRIBUTE3, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__ATTRIBUTE4, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ABSTRACT_MATRIX_DEVICE__DEVICE_RATING, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__PROGRAM_SLOTS, composite_Additional);
//            emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__CONFIGURATION, composite_Additional);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__STORED_PROGRAMS, composite_Additional);
//            emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__RUNNING_PROGRAMS, composite_Additional);
            CyberdeckWidget riggerCommandConsoleWidget = new CyberdeckWidget(composite_runtime,SWT.NONE, (Cyberdeck)object,getEditingDomain());
            riggerCommandConsoleWidget.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 6, 1));
        
        } else if (object instanceof RiggerCommandConsole) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ABSTRACT_MATRIX_DEVICE__DEVICE_RATING, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS, composite_Additional);

            RiggerCommandConsoleWidget riggerCommandConsoleWidget = new RiggerCommandConsoleWidget(composite_runtime,SWT.NONE, (RiggerCommandConsole)object,getEditingDomain());
            riggerCommandConsoleWidget.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 6, 1));
            new Label(composite_runtime, SWT.NONE);
            new Label(composite_runtime, SWT.NONE);
            new Label(composite_runtime, SWT.NONE);
            new Label(composite_runtime, SWT.NONE);
            new Label(composite_runtime, SWT.NONE);

        } else if (object instanceof Commlink) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ABSTRACT_MATRIX_DEVICE__DEVICE_RATING, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.COMMLINK__STORED_PROGRAMS, composite_Additional);
            
            CommlinkWidget riggerCommandConsoleWidget = new CommlinkWidget(composite_runtime,SWT.NONE, (Commlink)object,getEditingDomain());
            riggerCommandConsoleWidget.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 6, 1));
            new Label(composite_runtime, SWT.NONE);
            new Label(composite_runtime, SWT.NONE);
            new Label(composite_runtime, SWT.NONE);
            new Label(composite_runtime, SWT.NONE);
            new Label(composite_runtime, SWT.NONE);

        } else if (object instanceof Fokus) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MAGISCHE_STUFE__STUFE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.FOKUS__BINDUNGSKOSTEN, grpGegenstand);
            if (object instanceof QiFokus) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.QI_FOKUS__POWER, grpGegenstand);
            } else if (object instanceof MagieFokus) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.MAGIE_FOKUS__BINDUNGS_FAKTOR, grpGegenstand);
            }
        }else if (object instanceof Magazin) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MAGAZIN__TYPE, grpGegenstand);
            GridData controlGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 3);
            controlGridData.heightHint = 150;
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MAGAZIN__BULLETS, composite_runtime,controlGridData);
        }else if (object instanceof SubstanceContainer) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SUBSTANCE_CONTAINER__SUBSTANCE, grpGegenstand);
        }else if (object instanceof DefaultWifi) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ABSTRACT_MATRIX_DEVICE__DEVICE_RATING, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__GERAETESTUFE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS, composite_runtime);
        }

        addWertFeatures(grpWert);
        addSourceFeature(grpQuelle);
        if (!(object instanceof Magazin)&&!(object instanceof MatrixDevice)) {
        emfFormBuilder.addTextEntry(Shr5Package.Literals.ANWENDBAR__FERTIGKEIT, composite_runtime);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.ANWENDBAR__SPEZIALISIERUNG, composite_runtime);
        }
//        if (object instanceof MatrixDevice) {
//            emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_DEVICE__PAN, composite_runtime);            
//        }

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
