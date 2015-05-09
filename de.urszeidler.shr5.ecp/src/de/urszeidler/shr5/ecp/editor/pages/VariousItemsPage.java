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
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Drug;
import de.urszeidler.eclipse.shr5.FahrzeugErweiterung;
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.KleindungsModifikator;
import de.urszeidler.eclipse.shr5.PercentLifestyleOption;
import de.urszeidler.eclipse.shr5.Sensor;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Substance;
import de.urszeidler.eclipse.shr5.Toxin;
import de.urszeidler.eclipse.shr5.WeaponMount;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Pack;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

public class VariousItemsPage extends AbstractShr5Page<Beschreibbar> {
    private Beschreibbar object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public VariousItemsPage(String id, String title) {
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
    public VariousItemsPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
    }

    public VariousItemsPage(FormEditor editor, String id, String title, Beschreibbar object, EditingDomain editingDomain, ReferenceManager mananger1) {
        super(editor, id, title, mananger1);
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
        addFillToolbar(form.getToolBarManager(), object, form.getShell());
        form.getToolBarManager().update(true);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        // gd_beschreibbarWidget.widthHint = 0;
        beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
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
        sctnRuntime.setExpanded(true);

        final Composite composite_runtime = managedForm.getToolkit().createComposite(sctnRuntime, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_runtime);
        sctnRuntime.setClient(composite_runtime);
        composite_runtime.setLayout(new GridLayout(6, false));

        m_bindingContext = initDataBindings();
        createFormBuilder(managedForm);

        grpGegenstand.setText(labelProvider.getText(object.eClass()));

        if (object instanceof WeaponMount) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG_MODIFIKATION__CAPACITY_USED, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.WEAPON_MOUNT__WEAPON, grpGegenstand);

        }else if (object instanceof FahrzeugErweiterung) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG_MODIFIKATION__CAPACITY_USED, grpGegenstand);
            
        }else if (object instanceof PercentLifestyleOption) {
            
        }else if (object instanceof Pack) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.PACK__ITEMS, grpGegenstand,createControllGridData(150));
        }else if (object instanceof FernkampfwaffeModifikator) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.FERNKAMPFWAFFE_MODIFIKATOR__EP, grpGegenstand);
        }else if (object instanceof KleindungsModifikator) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.KLEINDUNGS_MODIFIKATOR__RATING, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.KLEINDUNGS_MODIFIKATOR__CAPACITY, grpGegenstand,labelEntryFactory);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.KLEINDUNGS_MODIFIKATOR__TYPE, grpGegenstand);
        }else if (object instanceof Sensor) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SENSOR__RATING, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SENSOR__CAPACITY_VALUE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SENSOR__FUNCTIONS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CAPACITY__CAPACITY_REMAINS, grpGegenstand, labelEntryFactory);
        }else if (object instanceof Substance) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MENGE__ANZAHL, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MENGE__PRO_ANZAHL, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SUBSTANCE__VECTOR, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SUBSTANCE__SPEED, grpGegenstand);
            if (object instanceof Toxin) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.TOXIN__POWER, grpGegenstand);
                emfFormBuilder.addTextEntry(Shr5Package.Literals.TOXIN__PENETRATION, grpGegenstand);
                emfFormBuilder.addTextEntry(Shr5Package.Literals.TOXIN__EFFECT, grpGegenstand);
            } else if (object instanceof Drug) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.DRUG__ADDICTION_TYPE, grpGegenstand);
                emfFormBuilder.addTextEntry(Shr5Package.Literals.DRUG__DURATION, grpGegenstand);
            }
            
        }
        
        
        addWertFeatures(grpWert);
        addSourceFeature(grpQuelle);

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
