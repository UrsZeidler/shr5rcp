package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
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

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AspektMagier;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaUIToolkit;
import de.urszeidler.shr5.ecp.editor.widgets.SimpleTreeTableWidget;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;

public class CommitedCharacterPage extends AbstractShr5Page<ManagedCharacter> {
    private ManagedCharacter object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private AbstraktPersona persona;
    private PersonaFertigkeitenWidget personaFertigkeitenWidget;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public CommitedCharacterPage(String id, String title) {
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
    public CommitedCharacterPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        // this.object = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
    }

    public CommitedCharacterPage(FormEditor editor, String id, String titel, ManagedCharacter object, EditingDomain editingDomain,
            ReferenceManager manager) {
        super(editor, id, titel, manager);
        this.object = object;
        this.persona = object.getPersona();
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

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, persona, toolkit, editingDomain);
        // gd_beschreibbarWidget.widthHint = 0;
        beschreibbarWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Section sctnNewSection = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnNewSection.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnNewSection);
        sctnNewSection.setText("attributes & skills");
        sctnNewSection.setExpanded(true);

        Composite composite_1 = managedForm.getToolkit().createComposite(sctnNewSection, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_1);
        sctnNewSection.setClient(composite_1);
        composite_1.setLayout(new GridLayout(2, false));

        Group grpAttributes = new Group(composite_1, SWT.NONE);
        GridLayout gl_grpAttributes = new GridLayout(1, false);
        gl_grpAttributes.verticalSpacing = 0;
        gl_grpAttributes.marginWidth = 0;
        gl_grpAttributes.marginHeight = 0;
        gl_grpAttributes.horizontalSpacing = 0;
        grpAttributes.setLayout(gl_grpAttributes);
        grpAttributes.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        grpAttributes.setText("attributes");
        managedForm.getToolkit().adapt(grpAttributes);
        managedForm.getToolkit().paintBordersFor(grpAttributes);

        Composite composite_2 = new Composite(grpAttributes, SWT.NONE);
        managedForm.getToolkit().adapt(composite_2);
        managedForm.getToolkit().paintBordersFor(composite_2);
        GridLayout gl_composite_2 = new GridLayout(1, false);
        gl_composite_2.marginWidth = 0;
        gl_composite_2.marginHeight = 0;
        gl_composite_2.horizontalSpacing = 0;
        composite_2.setLayout(gl_composite_2);

        Composite composite_phy_att = new Composite(composite_2, SWT.NONE);
        managedForm.getToolkit().adapt(composite_phy_att);
        managedForm.getToolkit().paintBordersFor(composite_phy_att);
        composite_phy_att.setLayout(new GridLayout(3, false));

        Composite composite_mental = new Composite(composite_2, SWT.NONE);
        managedForm.getToolkit().adapt(composite_mental);
        managedForm.getToolkit().paintBordersFor(composite_mental);
        composite_mental.setLayout(new GridLayout(3, false));

        Composite composite_spec = new Composite(composite_2, SWT.NONE);
        managedForm.getToolkit().adapt(composite_spec);
        managedForm.getToolkit().paintBordersFor(composite_spec);
        composite_spec.setLayout(new GridLayout(3, false));

        Composite composite_limits = new Composite(composite_2, SWT.NONE);
        managedForm.getToolkit().adapt(composite_limits);
        managedForm.getToolkit().paintBordersFor(composite_limits);
        composite_limits.setLayout(new GridLayout(3, false));

        // Composite composite_3 = new Composite(composite_2, SWT.NONE);
        // managedForm.getToolkit().adapt(composite_3);
        // managedForm.getToolkit().paintBordersFor(composite_3);
        // composite_3.setLayout(new GridLayout(3, false));

        Group grpSkills = new Group(composite_1, SWT.NONE);
        GridData gd_grpSkills = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);

        grpSkills.setLayoutData(gd_grpSkills);
        grpSkills.setText("Skills");
        managedForm.getToolkit().adapt(grpSkills);
        managedForm.getToolkit().paintBordersFor(grpSkills);
        grpSkills.setLayout(new FillLayout(SWT.HORIZONTAL));
        if (object != null) {
            personaFertigkeitenWidget = new PersonaFertigkeitenWidget(grpSkills, SWT.NONE, object, toolkit, editingDomain);
            personaFertigkeitenWidget.setFilterOnlyPersona(true);
        }

        Composite composite = managedForm.getToolkit().createComposite(composite_1, SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
        managedForm.getToolkit().paintBordersFor(composite);

        m_bindingContext = initDataBindings();
        PersonaUIToolkit personaUIToolkit = new PersonaUIToolkit(m_bindingContext, null, object, editingDomain, toolkit);

        personaUIToolkit.createKoerperlicheAttributesRO(composite_phy_att);
        personaUIToolkit.createGeistigeAttributesRO(composite_mental);
        personaUIToolkit.createSpezielleAttributesRO(composite_spec);
        personaUIToolkit.createLimits(composite_limits);
        createFormBuilder(managedForm);
        gd_grpSkills.heightHint = grpAttributes.getBounds().height;

        emfFormBuilder.addTextEntry(Messages.AbstraktPersonaPage_MethaType, Shr5Package.Literals.ABSTRAKT_PERSONA__SPEZIES, composite);
        new Label(composite_1, SWT.NONE);
        new Label(composite_1, SWT.NONE);
        if (object instanceof Zauberer) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBERER__TRADITION, composite);
        }
        if (object instanceof AspektMagier) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ASPEKT_MAGIER__ASPEKT, composite);
        }
        emfFormBuilder.buildinComposite(m_bindingContext, body, persona);
        composite.setEnabled(false);

        Section sctnNewSection_1 = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnNewSection_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnNewSection_1);
        sctnNewSection_1.setText("New Section");
        sctnNewSection_1.setExpanded(true);

        Composite composite_3 = new Composite(sctnNewSection_1, SWT.NONE);
        sctnNewSection_1.setClient(composite_3);
        composite_3.setLayout(new GridLayout(2, true));
        managedForm.getToolkit().adapt(composite_3);
        managedForm.getToolkit().paintBordersFor(composite_3);

        createPersonaParts(managedForm, toolkit, composite_3);
        managedForm.reflow(true);
    }

    /**
     * @param managedForm
     * @param toolkit
     * @param composite_3
     */
    private void createPersonaParts(IManagedForm managedForm, FormToolkit toolkit, Composite composite_3) {
        SimpleTreeTableWidget treeTableWidgetEigenschaften = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_sct_quallities,
                SWT.NONE, persona, Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN, toolkit, mananger, editingDomain, this);
        GridData layoutData = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
        layoutData.heightHint = 150;
        treeTableWidgetEigenschaften.setLayoutData(layoutData);
        managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
        managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);

        SimpleTreeTableWidget treeTableWidgetInventar = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_sct_Augmentation,
                SWT.NONE, persona, Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS, toolkit, mananger, editingDomain, this);
        GridData layoutData2 = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
        layoutData2.heightHint = 150;
        treeTableWidgetInventar.setLayoutData(layoutData2);
        managedForm.getToolkit().adapt(treeTableWidgetInventar);
        managedForm.getToolkit().paintBordersFor(treeTableWidgetInventar);

        if (persona instanceof KiAdept) {
            SimpleTreeTableWidget treeTableWidgetKiPower = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_KiPowers, SWT.NONE,
                    persona, Shr5Package.Literals.KI_ADEPT__KIKRAFT, toolkit, mananger, editingDomain, this);
            treeTableWidgetKiPower.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }
        if (persona instanceof Zauberer) {
            SimpleTreeTableWidget treeTableWidgetKiPower = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_Spells, SWT.NONE,
                    persona, Shr5Package.Literals.ZAUBERER__ZAUBER, toolkit, mananger, editingDomain, this);
            treeTableWidgetKiPower.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);

            treeTableWidgetKiPower = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_sct_bound_spririts, SWT.NONE, persona,
                    Shr5Package.Literals.ZAUBERER__GEBUNDENE_GEISTER, toolkit, mananger, editingDomain, this);
            treeTableWidgetKiPower.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }
        if (persona instanceof Technomancer) {
            SimpleTreeTableWidget treeTableWidgetKiPower = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_sct_complex_forms,
                    SWT.NONE, persona, Shr5Package.Literals.TECHNOMANCER__COMPLEX_FORMS, toolkit, mananger, editingDomain, this);
            treeTableWidgetKiPower.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }
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
