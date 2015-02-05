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
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.Geist;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.MagischeTradition;
import de.urszeidler.eclipse.shr5.MetaMagie;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
/**
 * Use for object that is only a {@link Quelle}.
 * @author urs
 *
 */
public class VariousObjectsPage extends AbstractShr5Page<Beschreibbar> {
    private Beschreibbar object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public VariousObjectsPage(String id, String title) {
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
    public VariousObjectsPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
    }

    public VariousObjectsPage(FormEditor editor, String id, String title, Beschreibbar object, EditingDomain editingDomain, ReferenceManager mananger1) {
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

//        Group grpWert = new Group(composite, SWT.NONE);
//        grpWert.setText(Messages.ObjectPage_price);
//        managedForm.getToolkit().adapt(grpWert);
//        managedForm.getToolkit().paintBordersFor(grpWert);
//        grpWert.setLayout(new GridLayout(9, false));

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

        if (object instanceof Geist) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.STUFEN_PERSONA__STUFE, grpGegenstand);
            emfFormBuilder.addSeperatorEntry(grpGegenstand);
             
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEIST__KONSTITUTION_BASIS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEIST__STAERKE_BASIS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEIST__GESCHICKLICHKEIT_BASIS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEIST__REAKTION_BASIS, grpGegenstand);

            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEIST__CHARISMA_BASIS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEIST__WILLENSKRAFT_BASIS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEIST__INTUITION_BASIS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEIST__LOGIK_BASIS, grpGegenstand);

            emfFormBuilder.addTextEntry(Shr5Package.Literals.STUFEN_PERSONA__SKILLS, composite_Additional);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.STUFEN_PERSONA__SKILL_GROUPS, composite_Additional);

            emfFormBuilder.addTextEntry(Shr5Package.Literals.GEIST__POWERS, composite_Additional);            
        } else if (object instanceof Zauber) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBER__KATEGORIE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBER__ENTZUG, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBER__ART, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBER__DAUER, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBER__REICHWEITE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBER__SCHADEN, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBER__MERKMALE, grpGegenstand);
        }else if (object instanceof KomplexeForm) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.KOMPLEXE_FORM__ZIEL, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.KOMPLEXE_FORM__SCHWUND, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.KOMPLEXE_FORM__DAUER, grpGegenstand);
            
        }else if (object instanceof MetaMagie) {
          
            
        }else if (object instanceof MagischeTradition) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MAGISCHE_TRADITION__ENZUG, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MAGISCHE_TRADITION__BESCHWOERBAR, grpGegenstand);
        }
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
