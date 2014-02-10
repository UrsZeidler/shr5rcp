package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
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
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaUIToolkit;

public class AbstraktPersonaPage extends AbstractShr5Page<AbstraktPersona> {
	private static final String EMPTY = ""; //$NON-NLS-1$
    private AbstraktPersona object;
	private EditingDomain editingDomain;

	
	private DataBindingContext m_bindingContext;
	private Group grpFertigkeitGruppe;
	private Composite compositeEigenschaften;
	private Composite compositeWares;
	private Group grpKikrfte;

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
		super(editor, id, title,  manager);
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
		//FormToolkit toolkit = toolkit;
		ScrolledForm form = managedForm.getForm();
		form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		Composite body2 = managedForm.getForm().getBody();
		body2.setLayout(new GridLayout(1, false));

		BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(body2, SWT.NONE, object, toolkit);
		GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_beschreibbarWidget.widthHint = 0;
		gd_beschreibbarWidget.heightHint = 0;
		beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
		toolkit.adapt(beschreibbarWidget);
		toolkit.paintBordersFor(beschreibbarWidget);
		
		Composite compositeMetaType = new Composite(body2, SWT.NONE);
		compositeMetaType.setLayout(new GridLayout(3, false));
		compositeMetaType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(compositeMetaType);
		toolkit.paintBordersFor(compositeMetaType);

		// PersonaAttributesWidget personaAttributesWidget = new
		// PersonaAttributesWidget(managedForm.getForm().getBody(),
		// SWT.NONE,object,
		// toolkit);
		// personaAttributesWidget.setLayoutData(new GridData(SWT.FILL,
		// SWT.CENTER, true, false, 1, 1));
		// managedForm.getToolkit().adapt(personaAttributesWidget);
		// managedForm.getToolkit().paintBordersFor(personaAttributesWidget);

		Group grpAttribute = new Group(body, SWT.NONE);
		grpAttribute.setLayout(new GridLayout(4, true));
		grpAttribute.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		grpAttribute.setText(Messages.AbstraktPersonaPage_Attribute);
		toolkit.adapt(grpAttribute);
		toolkit.paintBordersFor(grpAttribute);

		Group grpFertigkeiten = new Group(body, SWT.NONE);
		grpFertigkeiten.setLayout(new GridLayout(1, true));
		GridData gd_grpFertigkeiten = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_grpFertigkeiten.heightHint = 200;
		grpFertigkeiten.setLayoutData(gd_grpFertigkeiten);
		grpFertigkeiten.setText(Messages.AbstraktPersonaPage_Fertigkeiten);
		toolkit.adapt(grpFertigkeiten);
		toolkit.paintBordersFor(grpFertigkeiten);
		
//	      Group grpFertigkeitennew = new Group(managedForm.getForm().getBody(), SWT.NONE);
//	        grpFertigkeitennew.setLayout(new FillLayout(SWT.HORIZONTAL));
//	        grpFertigkeitennew.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
//	        grpFertigkeitennew.setText("Fertigkeiten-new");
//	        managedForm.getToolkit().adapt(grpFertigkeitennew);
//	        managedForm.getToolkit().paintBordersFor(grpFertigkeitennew);
	        
	        PersonaFertigkeitenWidget personaFertigkeitenWidget = new PersonaFertigkeitenWidget(grpFertigkeiten, SWT.NONE,object, toolkit,editingDomain);
	        personaFertigkeitenWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
	        managedForm.getToolkit().adapt(personaFertigkeitenWidget);
	        managedForm.getToolkit().paintBordersFor(personaFertigkeitenWidget);

		

//		Composite compositeFertigkeiten = new Composite(grpFertigkeiten, SWT.NONE);
//		compositeFertigkeiten.setLayout(new GridLayout(3, false));
//		compositeFertigkeiten.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
//		toolkit.adapt(compositeFertigkeiten);
//		toolkit.paintBordersFor(compositeFertigkeiten);
//
//		Composite compositeGruppen = new Composite(grpFertigkeiten, SWT.NONE);
//		compositeGruppen.setLayout(new GridLayout(3, false));
//		compositeGruppen.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
//		toolkit.adapt(compositeGruppen);
//		toolkit.paintBordersFor(compositeGruppen);

		Section sctnKoerperAttribute = managedForm.getToolkit().createSection(grpAttribute, Section.DESCRIPTION| Section.EXPANDED |Section.TWISTIE | Section.TITLE_BAR);
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
		
		Section sctnGeistigeAttribute = managedForm.getToolkit().createSection(grpAttribute, Section.DESCRIPTION| Section.EXPANDED |Section.TWISTIE | Section.TITLE_BAR);
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


		Section sctnSpezielleAttribute = managedForm.getToolkit().createSection(grpAttribute, Section.DESCRIPTION| Section.EXPANDED |Section.TWISTIE | Section.TITLE_BAR);
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
		
		Section sctnLimits = managedForm.getToolkit().createSection(grpAttribute, Section.DESCRIPTION| Section.EXPANDED |Section.TWISTIE | Section.TITLE_BAR);
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
		
		if (object instanceof KoerperPersona) {
			grpFertigkeitGruppe = new Group(body, SWT.NONE);
			grpFertigkeitGruppe.setLayout(new GridLayout(2, true));
			grpFertigkeitGruppe.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
			grpFertigkeitGruppe.setText(Messages.AbstraktPersonaPage_EdgesFlaws_CyberBioware);
			toolkit.adapt(grpFertigkeitGruppe);
			toolkit.paintBordersFor(grpFertigkeitGruppe);

			compositeEigenschaften = new Composite(grpFertigkeitGruppe, SWT.NONE);
			compositeEigenschaften.setLayout(new GridLayout(3, false));
			compositeEigenschaften.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			toolkit.adapt(compositeEigenschaften);
			toolkit.paintBordersFor(compositeEigenschaften);

			compositeWares = new Composite(grpFertigkeitGruppe, SWT.NONE);
			compositeWares.setLayout(new GridLayout(3, false));
			compositeWares.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			toolkit.adapt(compositeWares);
			toolkit.paintBordersFor(compositeWares);
		}


			grpKikrfte = new Group(body2, SWT.NONE);
			grpKikrfte.setLayout(new GridLayout(3, false));
			grpKikrfte.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			grpKikrfte.setText(Messages.AbstraktPersonaPage_KiPowers);
			toolkit.adapt(grpKikrfte);
			toolkit.paintBordersFor(grpKikrfte);


		m_bindingContext = initDataBindings();

		PersonaUIToolkit personaUIToolkit = new PersonaUIToolkit( m_bindingContext, null, object,
				editingDomain, toolkit);
		personaUIToolkit.createKoerperlicheAttributes(grpKrperlicheAttribute);
		personaUIToolkit.createGeistigeAttributes(grpGeistigeAttribute);
		personaUIToolkit.createSpezielleAttributes(grpSpezielleAttribute);
		personaUIToolkit.createLimits(compositelimits);
		createFormBuilder(managedForm);

		emfFormBuilder.addTextEntry(Messages.AbstraktPersonaPage_MethaType, Shr5Package.Literals.ABSTRAKT_PERSONA__SPEZIES, compositeMetaType);
		
//		emfFormBuilder.addTextEntry("", Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN, compositeFertigkeiten);
//		emfFormBuilder.addTextEntry("", Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN, compositeGruppen);
		if (object instanceof KoerperPersona) {
			emfFormBuilder.addTextEntry(EMPTY, Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN, compositeEigenschaften);
			emfFormBuilder.addTextEntry(EMPTY, Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS, compositeWares);

		}
		if (object instanceof KiAdept) {
			grpKikrfte.setText(Messages.AbstraktPersonaPage_KiPowers);
			emfFormBuilder.addTextEntry(EMPTY, Shr5Package.Literals.KI_ADEPT__KIKRAFT, grpKikrfte);

		}
		if (object instanceof Zauberer) {
			emfFormBuilder.addTextEntry(Messages.AbstraktPersonaPage_Spells, Shr5Package.Literals.ZAUBERER__ZAUBER, grpKikrfte);
			
		}

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
