package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AspektMagier;
import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry.EntryFactory;
import de.urszeidler.shr5.ecp.editor.actions.ActionM2TDialog;
import de.urszeidler.shr5.ecp.editor.actions.ExportObjectAction;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaUIToolkit;
import de.urszeidler.shr5.ecp.editor.widgets.SimpleTreeTableWidget;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

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
        final FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        form.getToolBarManager().add(new ActionM2TDialog(form.getShell(), object));
        form.getToolBarManager().add(new ExportObjectAction(form.getShell(), object));
        form.getToolBarManager().update(true);

        
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
        composite.setLayout(new GridLayout(9, false));
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

        EntryFactory linkLabelEntryFactory = new EntryFactory() {

            @Override
            public void createEntry(Composite container, FormbuilderEntry entry, EObject object, DataBindingContext dbc, EmfFormBuilder emfFormBuilder) {
                createLinkRO(toolkit, container, entry, object, emfFormBuilder);
            }
        };

        emfFormBuilder.addTextEntry(Shr5Package.Literals.ABSTRAKT_PERSONA__SPEZIES, composite, linkLabelEntryFactory);
        if (persona instanceof Zauberer) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBERER__TRADITION, composite, linkLabelEntryFactory);
        }
        if (persona instanceof AspektMagier) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ASPEKT_MAGIER__ASPEKT, composite, linkLabelEntryFactory);
        }
        emfFormBuilder.buildinComposite(m_bindingContext, body, persona);
        // composite.setEnabled(false);

        Section sctnNewSection_1 = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnNewSection_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnNewSection_1);
        sctnNewSection_1.setText("others");
        sctnNewSection_1.setExpanded(true);

        Composite composite_3 = new Composite(sctnNewSection_1, SWT.NONE);
        sctnNewSection_1.setClient(composite_3);
        composite_3.setLayout(new GridLayout(2, true));
        managedForm.getToolkit().adapt(composite_3);
        managedForm.getToolkit().paintBordersFor(composite_3);

        Section sctnCharacter = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnCharacter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnCharacter);
        sctnCharacter.setText("character");
        sctnCharacter.setExpanded(true);

        Composite composite_4 = new Composite(sctnCharacter, SWT.NONE);
        managedForm.getToolkit().adapt(composite_4);
        managedForm.getToolkit().paintBordersFor(composite_4);
        sctnCharacter.setClient(composite_4);
        composite_4.setLayout(new GridLayout(3, false));

        Composite composite_5 = new Composite(composite_4, SWT.NONE);
        composite_5.setLayout(new GridLayout(1, false));
        composite_5.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_5);
        managedForm.getToolkit().paintBordersFor(composite_5);

        Composite composite_6 = new Composite(composite_4, SWT.NONE);
        composite_6.setLayout(new GridLayout(1, false));
        composite_6.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_6);
        managedForm.getToolkit().paintBordersFor(composite_6);

        Composite composite_7 = new Composite(composite_4, SWT.NONE);
        composite_7.setLayout(new GridLayout(3, false));
        composite_7.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_7);
        managedForm.getToolkit().paintBordersFor(composite_7);

        EmfFormBuilder emfFormBuilder1 = new EmfFormBuilder(managedForm.getToolkit(), AdapterFactoryUtil.getInstance().getItemDelegator(),
                labelprovider, getEditingDomain());
        emfFormBuilder1.setManager(mananger);
        emfFormBuilder1.setNullString(Messages.EmfFormbuilder_non_selected);
        // emfFormBuilder.setBorderStyle(SWT.NONE);
        emfFormBuilder1.setDblListner(this);

        emfFormBuilder1.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__KARMA_GAINT, composite, new LabelEntry());
        emfFormBuilder1.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__CURRENT_KARMA, composite, new LabelEntry());
        emfFormBuilder1.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__CHOOSEN_LIFESTYLE, composite, linkLabelEntryFactory);
        emfFormBuilder1.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__NOTORIETY, composite, new LabelEntry());
        emfFormBuilder1.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__PUBLIC_AWARENESS, composite, new LabelEntry());
        emfFormBuilder1.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__NATIVE_LANGUAGE, composite, linkLabelEntryFactory);
        emfFormBuilder1.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__STREET_CRED, composite, new LabelEntry());
        emfFormBuilder1.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__SEX, composite, new LabelEnumEntry());

        emfFormBuilder1.buildinComposite(m_bindingContext, composite_7, object);

        createCharacterParts(managedForm, toolkit, composite_5, composite_6);
        createPersonaParts(managedForm, toolkit, composite_3);
        managedForm.reflow(true);
    }

    /**
     * @param managedForm
     * @param toolkit
     * @param composite_5
     * @param composite_6
     */
    private void createCharacterParts(IManagedForm managedForm, FormToolkit toolkit, Composite composite_5, Composite composite_6) {

        if (!object.getInventar().isEmpty()) {
            SimpleTreeTableWidget treeTableWidgetEigenschaften = new SimpleTreeTableWidget(composite_5,
                    featureName(Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR), SWT.NONE, object,
                    Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR, toolkit, mananger, editingDomain, this);
            GridData layoutData = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
            treeTableWidgetEigenschaften.setLayoutData(layoutData);
            managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);
        }

        if (!object.getConnections().isEmpty()) {
            SimpleTreeTableWidget treeTableWidgetEigenschaften = new SimpleTreeTableWidget(composite_6,
                    featureName(Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS), SWT.NONE, object,
                    Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS, toolkit, mananger, editingDomain, this);
            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
            layoutData.heightHint = 150;
            treeTableWidgetEigenschaften.setLayoutData(layoutData);
            managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);
        }

        if (!object.getContracts().isEmpty()) {
            SimpleTreeTableWidget treeTableWidgetEigenschaften = new SimpleTreeTableWidget(composite_6,
                    featureName(Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS), SWT.NONE, object,
                    Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS, toolkit, mananger, editingDomain, this);
            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
            layoutData.heightHint = 150;
            treeTableWidgetEigenschaften.setLayoutData(layoutData);
            managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);
        }

        if (!object.getVehicels().isEmpty()) {
            SimpleTreeTableWidget treeTableWidgetEigenschaften = new SimpleTreeTableWidget(composite_6,
                    featureName(Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS), SWT.NONE, object,
                    Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS, toolkit, mananger, editingDomain, this);
            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
            layoutData.heightHint = 150;
            treeTableWidgetEigenschaften.setLayoutData(layoutData);
            managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);
        }
    }

    /**
     * @param managedForm
     * @param toolkit
     * @param composite_3
     */
    private void createPersonaParts(IManagedForm managedForm, FormToolkit toolkit, Composite composite_3) {
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            if (!kp.getEigenschaften().isEmpty()) {
                SimpleTreeTableWidget treeTableWidgetEigenschaften = new SimpleTreeTableWidget(composite_3,
                        Messages.AbstraktPersonaPage_sct_quallities, SWT.NONE, persona, Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN, toolkit,
                        mananger, editingDomain, this);
                GridData layoutData = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
                layoutData.heightHint = 150;
                treeTableWidgetEigenschaften.setLayoutData(layoutData);
                managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
                managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);
            }
            if (!kp.getKoerperMods().isEmpty()) {
                SimpleTreeTableWidget treeTableWidgetInventar = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_sct_Augmentation,
                        SWT.NONE, persona, Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS, toolkit, mananger, editingDomain, this);
                GridData layoutData2 = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
                layoutData2.heightHint = 150;
                treeTableWidgetInventar.setLayoutData(layoutData2);
                managedForm.getToolkit().adapt(treeTableWidgetInventar);
                managedForm.getToolkit().paintBordersFor(treeTableWidgetInventar);
            }
        }
        if (persona instanceof BaseMagischePersona) {
            BaseMagischePersona bm = (BaseMagischePersona)persona;
            if (!bm.getInitationen().isEmpty()) {
                SimpleTreeTableWidget treeTableWidgetKiPower = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_KiPowers,
                        SWT.NONE, persona, Shr5Package.Literals.BASE_MAGISCHE_PERSONA__INITATIONEN, toolkit, mananger, editingDomain, this);
                treeTableWidgetKiPower.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
                managedForm.getToolkit().adapt(treeTableWidgetKiPower);
                managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
            }
        }
        if (persona instanceof KiAdept) {
            SimpleTreeTableWidget treeTableWidgetKiPower = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_KiPowers, SWT.NONE,
                    persona, Shr5Package.Literals.KI_ADEPT__KIKRAFT, toolkit, mananger, editingDomain, this);
            treeTableWidgetKiPower.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }
        if (persona instanceof Zauberer) {
            Zauberer z = (Zauberer)persona;
            if (!z.getZauber().isEmpty()) {
                SimpleTreeTableWidget treeTableWidgetKiPower = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_Spells, SWT.NONE,
                        persona, Shr5Package.Literals.ZAUBERER__ZAUBER, toolkit, mananger, editingDomain, this);
                treeTableWidgetKiPower.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
                managedForm.getToolkit().adapt(treeTableWidgetKiPower);
                managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
            }
            if (!z.getGebundeneGeister().isEmpty()) {
                SimpleTreeTableWidget treeTableWidgetKiPower = new SimpleTreeTableWidget(composite_3,
                        Messages.AbstraktPersonaPage_sct_bound_spririts, SWT.NONE, persona, Shr5Package.Literals.ZAUBERER__GEBUNDENE_GEISTER,
                        toolkit, mananger, editingDomain, this);
                treeTableWidgetKiPower.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
                managedForm.getToolkit().adapt(treeTableWidgetKiPower);
                managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
            }
        }
        if (persona instanceof Technomancer) {
            SimpleTreeTableWidget treeTableWidgetKiPower = new SimpleTreeTableWidget(composite_3, Messages.AbstraktPersonaPage_sct_complex_forms,
                    SWT.NONE, persona, Shr5Package.Literals.TECHNOMANCER__COMPLEX_FORMS, toolkit, mananger, editingDomain, this);
            treeTableWidgetKiPower.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }

    protected String featureName(EStructuralFeature feature) {
        return ShadowrunEditingTools.toFeatureName(object, feature);
    }

    /**
     * @param toolkit
     * @param container
     * @param e
     * @param object
     * @param emfFormBuilder
     */
    private void createLinkRO(final FormToolkit toolkit, Composite container, FormbuilderEntry e, EObject object, EmfFormBuilder emfFormBuilder) {
        Label label = emfFormBuilder.createConfiguredLable(container, e, object);
        label.setText(featureName(e.getFeature()));

        final ImageHyperlink srcLink = toolkit.createImageHyperlink(container, SWT.NONE);
        toolkit.paintBordersFor(srcLink);
        srcLink.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 2, 1));

        Object value = object.eGet(e.getFeature());

        final String nullString = Messages.EmfFormbuilder_non_selected;
        String element = value == null ? nullString : labelprovider.getText(value);
        srcLink.setText(element);
        srcLink.setImage(labelprovider.getImage(value));

        // ISWTObservableValue uiObs = SWTObservables.observeText(srcLink);
        IValueProperty property = null;
        if (getEditingDomain() != null)
            property = EMFEditProperties.value(getEditingDomain(), e.getFeature());
        else
            property = EMFProperties.value(e.getFeature());

        final IObservableValue mObs = property.observe(object);
        e.setObservable(mObs);
        mObs.addValueChangeListener(new IValueChangeListener() {
            @Override
            public void handleValueChange(ValueChangeEvent event) {
                Object value = event.getObservableValue().getValue();
                srcLink.setText(value == null ? nullString : labelprovider.getText(value));
                srcLink.setImage(labelprovider.getImage(value));
            }
        });
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        // IObservableValue observeTextLblNewLabel_1ObserveWidget = WidgetProperties.text().observe(lblNewLabel_1);
        // IObservableValue objectNativeLanguageObserveValue = EMFEditObservables.observeValue(editingDomain, object,
        // Literals.MANAGED_CHARACTER__NATIVE_LANGUAGE);
        // UpdateValueStrategy strategy = new UpdateValueStrategy();
        // strategy.setConverter(new ReferenceConverter());
        // bindingContext.bindValue(observeTextLblNewLabel_1ObserveWidget, objectNativeLanguageObserveValue, new
        // UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
        //
        return bindingContext;
    }
}
