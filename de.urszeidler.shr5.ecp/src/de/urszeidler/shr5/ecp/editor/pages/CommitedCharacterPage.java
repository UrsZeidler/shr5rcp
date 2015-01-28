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
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaUIToolkit;

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
        sctnNewSection.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnNewSection);
        sctnNewSection.setText("New Section");
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

//        Composite composite_3 = new Composite(composite_2, SWT.NONE);
//        managedForm.getToolkit().adapt(composite_3);
//        managedForm.getToolkit().paintBordersFor(composite_3);
//        composite_3.setLayout(new GridLayout(3, false));

        
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

        Composite composite = managedForm.getToolkit().createComposite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite);


        
        m_bindingContext = initDataBindings();
        PersonaUIToolkit personaUIToolkit = new PersonaUIToolkit(m_bindingContext, null, object, editingDomain, toolkit);

        personaUIToolkit.createKoerperlicheAttributesRO(composite_phy_att);
        personaUIToolkit.createGeistigeAttributesRO(composite_mental);
        personaUIToolkit.createSpezielleAttributesRO(composite_spec);
        personaUIToolkit.createLimits(composite_limits);
        createFormBuilder(managedForm);
        gd_grpSkills.heightHint = grpAttributes.getBounds().height;
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
