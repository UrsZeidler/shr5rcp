package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
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

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaUIToolkit;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;

public class AbstraktPersonaPage extends AbstractShr5Page<AbstraktPersona> {
    private AbstraktPersona object = Shr5Factory.eINSTANCE.createMysticAdept();
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Composite compositeEigenschaften;
    private Composite compositeWares;

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
    public AbstraktPersonaPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createKiAdept();
    }

    public AbstraktPersonaPage(FormEditor editor, String id, String title, AbstraktPersona object, EditingDomain editingDomain,
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
        body.setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(body, SWT.NONE, object, toolkit, editingDomain);
        GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        gd_beschreibbarWidget.widthHint = 0;
        gd_beschreibbarWidget.heightHint = 0;
        beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
        toolkit.adapt(beschreibbarWidget);
        toolkit.paintBordersFor(beschreibbarWidget);

        Composite compositeMetaType = new Composite(body, SWT.NONE);
        compositeMetaType.setLayout(new GridLayout(3, false));
        compositeMetaType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(compositeMetaType);
        toolkit.paintBordersFor(compositeMetaType);

        Group grpAttribute = new Group(body, SWT.NONE);
        grpAttribute.setLayout(new GridLayout(4, true));
        grpAttribute.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        grpAttribute.setText(Messages.AbstraktPersonaPage_Attribute);
        toolkit.adapt(grpAttribute);
        toolkit.paintBordersFor(grpAttribute);

        Section sctnKoerperAttribute = managedForm.getToolkit().createSection(grpAttribute,
                Section.DESCRIPTION | Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
        sctnKoerperAttribute.setDescription(Messages.AbstraktPersonaPage_Body_Attributes);
        sctnKoerperAttribute.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnKoerperAttribute);
        sctnKoerperAttribute.setText(Messages.AbstraktPersonaPage_Body);
        sctnKoerperAttribute.setExpanded(true);

        Composite grpKrperlicheAttribute = new Composite(sctnKoerperAttribute, SWT.NONE);
        grpKrperlicheAttribute.setLayout(new GridLayout(3, false));
        grpKrperlicheAttribute.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        toolkit.adapt(grpKrperlicheAttribute);
        toolkit.paintBordersFor(grpKrperlicheAttribute);
        sctnKoerperAttribute.setClient(grpKrperlicheAttribute);

        Section sctnGeistigeAttribute = managedForm.getToolkit().createSection(grpAttribute,
                Section.DESCRIPTION | Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
        sctnGeistigeAttribute.setDescription(Messages.AbstraktPersonaPage_Mental_Attributes);
        sctnGeistigeAttribute.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnGeistigeAttribute);
        sctnGeistigeAttribute.setText(Messages.AbstraktPersonaPage_Mental);
        sctnGeistigeAttribute.setExpanded(true);

        Composite grpGeistigeAttribute = new Composite(sctnGeistigeAttribute, SWT.NONE);
        grpGeistigeAttribute.setLayout(new GridLayout(3, false));
        grpGeistigeAttribute.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        toolkit.adapt(grpGeistigeAttribute);
        toolkit.paintBordersFor(grpGeistigeAttribute);
        sctnGeistigeAttribute.setClient(grpGeistigeAttribute);

        Section sctnSpezielleAttribute = managedForm.getToolkit().createSection(grpAttribute,
                Section.DESCRIPTION | Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
        sctnSpezielleAttribute.setDescription(Messages.AbstraktPersonaPage_Special_Attributes);
        sctnSpezielleAttribute.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnSpezielleAttribute);
        sctnSpezielleAttribute.setText(Messages.AbstraktPersonaPage_Special);
        sctnSpezielleAttribute.setExpanded(true);

        Composite grpSpezielleAttribute = new Composite(sctnSpezielleAttribute, SWT.NONE);
        grpSpezielleAttribute.setLayout(new GridLayout(3, false));
        grpSpezielleAttribute.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        toolkit.adapt(grpSpezielleAttribute);
        toolkit.paintBordersFor(grpSpezielleAttribute);
        sctnSpezielleAttribute.setClient(grpSpezielleAttribute);

        Section sctnLimits = managedForm.getToolkit().createSection(grpAttribute,
                Section.DESCRIPTION | Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
        sctnLimits.setDescription(Messages.AbstraktPersonaPage_The_Limits);
        sctnLimits.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnLimits);
        sctnLimits.setText(Messages.AbstraktPersonaPage_Limits);
        sctnLimits.setExpanded(true);

        Composite compositelimits = new Composite(sctnLimits, SWT.NONE);
        compositelimits.setLayout(new GridLayout(3, false));
        compositelimits.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        toolkit.adapt(compositelimits);
        toolkit.paintBordersFor(compositelimits);
        sctnLimits.setClient(compositelimits);
        
        Composite composite_1 = managedForm.getToolkit().createComposite(managedForm.getForm().getBody(), SWT.NONE);
        composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
        GridData gd_composite_1 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        gd_composite_1.heightHint = 200;
        composite_1.setLayoutData(gd_composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);

        Section sctnSkill = managedForm.getToolkit().createSection(composite_1, Section.TWISTIE | Section.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(sctnSkill);
        sctnSkill.setText(Messages.AbstraktPersonaPage_Fertigkeiten);
        sctnSkill.setExpanded(true);

        PersonaFertigkeitenWidget personaFertigkeitenWidget = new PersonaFertigkeitenWidget(sctnSkill, SWT.NONE, object, toolkit, editingDomain);
        sctnSkill.setClient(personaFertigkeitenWidget);
        managedForm.getToolkit().adapt(personaFertigkeitenWidget);
        managedForm.getToolkit().paintBordersFor(personaFertigkeitenWidget);

        

        if (object instanceof KoerperPersona) {
            Composite grpFertigkeitGruppe = new Composite(body, SWT.NONE);
            grpFertigkeitGruppe.setLayout(new GridLayout(2, true));
            GridData gd_grpFertigkeitGruppe = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
            gd_grpFertigkeitGruppe.heightHint = 150;
            grpFertigkeitGruppe.setLayoutData(gd_grpFertigkeitGruppe);
            toolkit.adapt(grpFertigkeitGruppe);
            toolkit.paintBordersFor(grpFertigkeitGruppe);

            compositeEigenschaften = new Composite(grpFertigkeitGruppe, SWT.NONE);
            compositeEigenschaften.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
            compositeEigenschaften.setLayout(new FillLayout(SWT.HORIZONTAL));
            toolkit.adapt(compositeEigenschaften);
            toolkit.paintBordersFor(compositeEigenschaften);

            TreeTableWidget treeTableWidgetEigenschaften = new TreeTableWidget(compositeEigenschaften, "Edges/Flaws", SWT.NONE, object,
                    Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN, toolkit, mananger, editingDomain);
            managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);

            compositeWares = new Composite(grpFertigkeitGruppe, SWT.NONE);
            compositeWares.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
            compositeWares.setLayout(new FillLayout(SWT.HORIZONTAL));
            toolkit.adapt(compositeWares);
            toolkit.paintBordersFor(compositeWares);

            TreeTableWidget treeTableWidgetInventar = new TreeTableWidget(compositeWares, "Wares", SWT.NONE, object,
                    Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS, toolkit, mananger, editingDomain);
            managedForm.getToolkit().adapt(treeTableWidgetInventar);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetInventar);

        }

        if (object instanceof KiAdept) {
            Composite grpKikrfte = new Composite(body, SWT.NONE);
            grpKikrfte.setLayout(new FillLayout(SWT.HORIZONTAL));

            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1);
            layoutData.minimumHeight = 150;
            grpKikrfte.setLayoutData(layoutData);
            toolkit.adapt(grpKikrfte);
            toolkit.paintBordersFor(grpKikrfte);

            TreeTableWidget treeTableWidgetKiPower = new TreeTableWidget(grpKikrfte, Messages.AbstraktPersonaPage_KiPowers, SWT.NONE, object,
                    Shr5Package.Literals.KI_ADEPT__KIKRAFT, toolkit, mananger, editingDomain);
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }
        if (object instanceof Zauberer) {
            Composite grpKikrfte = new Composite(body, SWT.NONE);
            grpKikrfte.setLayout(new FillLayout(SWT.HORIZONTAL));
            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1);
            layoutData.minimumHeight = 150;
            grpKikrfte.setLayoutData(layoutData);
            toolkit.adapt(grpKikrfte);
            toolkit.paintBordersFor(grpKikrfte);

            TreeTableWidget treeTableWidgetKiPower = new TreeTableWidget(grpKikrfte, Messages.AbstraktPersonaPage_Spells, SWT.NONE, object,
                    Shr5Package.Literals.ZAUBERER__ZAUBER, toolkit, mananger, editingDomain);
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }
        if (object instanceof Technomancer) {
            Composite grpKikrfte = new Composite(body, SWT.NONE);
            grpKikrfte.setLayout(new FillLayout(SWT.HORIZONTAL));
            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
            layoutData.minimumHeight = 150;
            grpKikrfte.setLayoutData(layoutData);
            toolkit.adapt(grpKikrfte);
            toolkit.paintBordersFor(grpKikrfte);

            TreeTableWidget treeTableWidgetKiPower = new TreeTableWidget(grpKikrfte, "Complex forms", SWT.NONE, object,
                    Shr5Package.Literals.TECHNOMANCER__COMPLEX_FORMS, toolkit, mananger, editingDomain);
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }

        m_bindingContext = initDataBindings();

        PersonaUIToolkit personaUIToolkit = new PersonaUIToolkit(m_bindingContext, null, object, editingDomain, toolkit);
        personaUIToolkit.createKoerperlicheAttributes(grpKrperlicheAttribute);
        personaUIToolkit.createGeistigeAttributes(grpGeistigeAttribute);
        personaUIToolkit.createSpezielleAttributes(grpSpezielleAttribute);
        personaUIToolkit.createLimits(compositelimits);
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Messages.AbstraktPersonaPage_MethaType, Shr5Package.Literals.ABSTRAKT_PERSONA__SPEZIES, compositeMetaType);

        emfFormBuilder.buildinComposite(m_bindingContext, body, object);


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
