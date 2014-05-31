package de.urszeidler.shr5.ecp.editor.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AspektMagier;
import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.util.DefaultReferenceManager;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaUIToolkit;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class AbstraktPersonaPage extends AbstractShr5Page<AbstraktPersona> {
    private AbstraktPersona object = Shr5Factory.eINSTANCE.createMysticAdept();
    private ManagedCharacter character;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Composite compositeEigenschaften;
    private Composite compositeWares;
    
    private WritableValue filter = new WritableValue("", String.class); //$NON-NLS-1$

    private ReferenceManager karmaBaseManager = new DefaultReferenceManager(AdapterFactoryUtil.getInstance().getItemDelegator()) {

        @Override
        protected Object provideObject(FormbuilderEntry e, EObject object) {
            if (Shr5Package.Literals.ZAUBERER__ZAUBER.equals(e.getFeature())) {
                Transformer<Zauber, PersonaZauber> transformer = ShadowrunEditingTools.zauber2PersonaZauberTransformer();
                String displayName = Messages.ShadowrunEditor_dlg_select_spells;
                EClass zauber = Shr5Package.Literals.ZAUBER;

                return provideTransformedObject(object, transformer, displayName, zauber);
            } else if (Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN.equals(e.getFeature())) {
                Transformer<EObject, EObject> transformer = ShadowrunEditingTools.copyTransformer();
                String displayName = Messages.AbstraktPersonaPage_dlg_select_quallities;
                EClass quallity = Shr5Package.Literals.PERSONA_EIGENSCHAFT;

                return provideTransformedObject(object, transformer, displayName, quallity);
            }
            return null;
        }

        /**
         * @param object the object to provide the child for
         * @param transformer the transformer
         * @param displayName text for the dialog
         * @param zauber
         */
        @SuppressWarnings("rawtypes")
        private Object provideTransformedObject(EObject object, Transformer transformer, String displayName, EClass zauber) {
            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, zauber);
            ShrList basicList = Shr5Factory.eINSTANCE.createShrList();

            FeatureEditorDialog dialog = new FeatureEditorDialogWert(getSite().getShell(), AdapterFactoryUtil.getInstance().getLabelProvider(),
                    basicList, Shr5Package.Literals.SHR_LIST__ENTRIES, displayName, new ArrayList<EObject>(
                            objectsOfType));

            int result = dialog.open();
            if (result == Window.OK) {
                EList<?> list = dialog.getResult();
                List<EObject> objectList = new ArrayList<EObject>();
                for (Object object1 : list) {
                    if (object1 instanceof EObject) {
                        ShadowrunManagmentTools.changeErlernbarByAdvacement(character, (Erlernbar)transformer.transform((EObject)object1));
                    }
                }

                return objectList;
            }
            return null;
        }
    };
    private Text text;

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

    public AbstraktPersonaPage(FormEditor editor, String id, String title, ManagedCharacter character, EditingDomain editingDomain,
            ReferenceManager manager) {
        super(editor, id, title, manager);
        this.character = character;
        this.object = character.getPersona();
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
        final ScrolledForm form = managedForm.getForm();
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        final Composite body = form.getBody();
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

        final Composite composite_1 = managedForm.getToolkit().createComposite(managedForm.getForm().getBody(), SWT.NONE);
        composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
        final GridData gd_composite_1 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        gd_composite_1.heightHint = 350;
        composite_1.setLayoutData(gd_composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);

        Section sctnSkill = managedForm.getToolkit().createSection(composite_1, Section.TWISTIE | Section.TITLE_BAR);
        sctnSkill.addExpansionListener(new IExpansionListener() {
            public void expansionStateChanged(ExpansionEvent e) {
                if(e.getState()){
                    gd_composite_1.heightHint = 350;
                    form.reflow(true);
                 }else{
                    gd_composite_1.heightHint = 30;
                     form.reflow(true);
                }                    
            }
            public void expansionStateChanging(ExpansionEvent e) {
            }
        });
        Composite composite_2 = managedForm.getToolkit().createComposite(sctnSkill, SWT.NONE);
        sctnSkill.setDescriptionControl(composite_2);
        composite_2.setLayout(new GridLayout(3, false));
        
        Label lblFilter = managedForm.getToolkit().createLabel(composite_2,Messages.AbstraktPersonaPage_lblFilter_text, SWT.NONE);
        lblFilter.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().adapt(lblFilter, true, true);
        
        text = managedForm.getToolkit().createText(composite_2, "",SWT.BORDER);
        text.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        Button button = managedForm.getToolkit().createButton(composite_2, "", SWT.PUSH);
        button.setToolTipText(Messages.AbstraktPersonaPage_button_toolTipText);
        button.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/clear.gif"));
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                filter.setValue("");
            }
        });

        managedForm.getToolkit().paintBordersFor(sctnSkill);
        sctnSkill.setText(Messages.AbstraktPersonaPage_Fertigkeiten);
        sctnSkill.setExpanded(true);

        final PersonaFertigkeitenWidget personaFertigkeitenWidget;
        if (character == null) {
            personaFertigkeitenWidget = new PersonaFertigkeitenWidget(sctnSkill, SWT.NONE, object, toolkit, editingDomain);
        } else {
            personaFertigkeitenWidget = new PersonaFertigkeitenWidget(sctnSkill, SWT.NONE, character, toolkit, editingDomain);
        }
        filter.addChangeListener(new IChangeListener() {           
            @Override
            public void handleChange(ChangeEvent event) {
                personaFertigkeitenWidget.setStringFilter((String)filter.getValue());
                
            }
        });
//      GridData gd_composite_1 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
//      gd_composite_1.heightHint = 200;

        // final PersonaFertigkeitenWidget = p;

        sctnSkill.setClient(personaFertigkeitenWidget);
        managedForm.getToolkit().adapt(personaFertigkeitenWidget);
        managedForm.getToolkit().paintBordersFor(personaFertigkeitenWidget);

        ToolBar toolBar = new ToolBar(sctnSkill, SWT.FLAT | SWT.RIGHT);

        // managedForm.getToolkit().adapt(toolBar);
        // managedForm.getToolkit().paintBordersFor(toolBar);
        sctnSkill.setTextClient(toolBar);

        final ToolItem filterOnlyPersonaSkillsToolItem = new ToolItem(toolBar, SWT.CHECK);
        filterOnlyPersonaSkillsToolItem.setToolTipText(Messages.AbstraktPersonaPage_filterOnlyPersonaSkillsToolItem_toolTipText);
        filterOnlyPersonaSkillsToolItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                personaFertigkeitenWidget.setFilterOnlyPersona(filterOnlyPersonaSkillsToolItem.getSelection());

            }

            @Override
            public void widgetSelected(SelectionEvent e) {
                personaFertigkeitenWidget.setFilterOnlyPersona(filterOnlyPersonaSkillsToolItem.getSelection());
            }
        });
        filterOnlyPersonaSkillsToolItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/toList.gif")); //$NON-NLS-1$ //$NON-NLS-2$

        int height = 200;
        if (object instanceof KoerperPersona) {
            Composite grpFertigkeitGruppe = new Composite(body, SWT.NONE);
            grpFertigkeitGruppe.setLayout(new GridLayout(2, true));
            final GridData gd_grpFertigkeitGruppe = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
            gd_grpFertigkeitGruppe.heightHint = height;
            grpFertigkeitGruppe.setLayoutData(gd_grpFertigkeitGruppe);
            toolkit.adapt(grpFertigkeitGruppe);
            toolkit.paintBordersFor(grpFertigkeitGruppe);

            compositeEigenschaften = new Composite(grpFertigkeitGruppe, SWT.NONE);
            compositeEigenschaften.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
            compositeEigenschaften.setLayout(new FillLayout(SWT.HORIZONTAL));
            toolkit.adapt(compositeEigenschaften);
            toolkit.paintBordersFor(compositeEigenschaften);
            
            
            ReferenceManager mananger2 = mananger;
            if(character!=null)
                mananger2 = karmaBaseManager;
            
            TreeTableWidget treeTableWidgetEigenschaften = new TreeTableWidget(compositeEigenschaften, Messages.AbstraktPersonaPage_sct_quallities, SWT.NONE, object,
                    Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN, toolkit, mananger2, editingDomain,this);
            managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);

            compositeWares = new Composite(grpFertigkeitGruppe, SWT.NONE);
            compositeWares.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
            compositeWares.setLayout(new FillLayout(SWT.HORIZONTAL));
            toolkit.adapt(compositeWares);
            toolkit.paintBordersFor(compositeWares);

            TreeTableWidget treeTableWidgetInventar = new TreeTableWidget(compositeWares, Messages.AbstraktPersonaPage_sct_Augmentation, SWT.NONE, object,
                    Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS, toolkit, mananger, editingDomain,this);
            managedForm.getToolkit().adapt(treeTableWidgetInventar);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetInventar);

        }

        if (object instanceof KiAdept) {
            Composite grpKikrfte = new Composite(body, SWT.NONE);
            grpKikrfte.setLayout(new FillLayout(SWT.HORIZONTAL));

            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1);
            layoutData.minimumHeight = height;
            grpKikrfte.setLayoutData(layoutData);
            toolkit.adapt(grpKikrfte);
            toolkit.paintBordersFor(grpKikrfte);

            TreeTableWidget treeTableWidgetKiPower = new TreeTableWidget(grpKikrfte, Messages.AbstraktPersonaPage_KiPowers, SWT.NONE, object,
                    Shr5Package.Literals.KI_ADEPT__KIKRAFT, toolkit, mananger, editingDomain,this);
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }
        if (object instanceof Zauberer) {
            Composite grpKikrfte = new Composite(body, SWT.NONE);
            grpKikrfte.setLayout(new FillLayout(SWT.HORIZONTAL));
            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1);
            layoutData.minimumHeight = height;
            grpKikrfte.setLayoutData(layoutData);
            toolkit.adapt(grpKikrfte);
            toolkit.paintBordersFor(grpKikrfte);

            ReferenceManager mananger2 = mananger;
            if(character!=null)
                mananger2 = karmaBaseManager;
            
            TreeTableWidget treeTableWidgetKiPower = new TreeTableWidget(grpKikrfte, Messages.AbstraktPersonaPage_Spells, SWT.NONE, object,
                    Shr5Package.Literals.ZAUBERER__ZAUBER, toolkit, mananger2, editingDomain,this);
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
            
            treeTableWidgetKiPower = new TreeTableWidget(grpKikrfte, Messages.AbstraktPersonaPage_sct_bound_spririts, SWT.NONE, object,
                    Shr5Package.Literals.ZAUBERER__GEBUNDENE_GEISTER, toolkit, mananger, editingDomain,this);
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);

        }
        if (object instanceof Technomancer) {
            Composite grpKikrfte = new Composite(body, SWT.NONE);
            grpKikrfte.setLayout(new FillLayout(SWT.HORIZONTAL));
            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
            layoutData.minimumHeight = height;
            grpKikrfte.setLayoutData(layoutData);
            toolkit.adapt(grpKikrfte);
            toolkit.paintBordersFor(grpKikrfte);

            ReferenceManager mananger2 = mananger;
            if(character!=null)
                mananger2 = karmaBaseManager;

            TreeTableWidget treeTableWidgetKiPower = new TreeTableWidget(grpKikrfte, Messages.AbstraktPersonaPage_sct_complex_forms, SWT.NONE, object,
                    Shr5Package.Literals.TECHNOMANCER__COMPLEX_FORMS, toolkit, mananger2, editingDomain,this);
            managedForm.getToolkit().adapt(treeTableWidgetKiPower);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetKiPower);
        }

        m_bindingContext = initDataBindings();

        PersonaUIToolkit personaUIToolkit;
        if (character == null) {
            personaUIToolkit = new PersonaUIToolkit(m_bindingContext, null, object, editingDomain, toolkit);
        } else
            personaUIToolkit = new PersonaUIToolkit(m_bindingContext, null, character, editingDomain, toolkit);

        personaUIToolkit.createKoerperlicheAttributes(grpKrperlicheAttribute);
        personaUIToolkit.createGeistigeAttributes(grpGeistigeAttribute);
        personaUIToolkit.createSpezielleAttributes(grpSpezielleAttribute);
        personaUIToolkit.createLimits(compositelimits);
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Messages.AbstraktPersonaPage_MethaType, Shr5Package.Literals.ABSTRAKT_PERSONA__SPEZIES, compositeMetaType);
        if (object instanceof Zauberer) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ZAUBERER__TRADITION, compositeMetaType);
        }
        if (object instanceof AspektMagier) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.ASPEKT_MAGIER__ASPEKT, compositeMetaType);
        }
        emfFormBuilder.buildinComposite(m_bindingContext, body, object);

        //managedForm.getForm().pack();
       managedForm.reflow(true);

    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextTextObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(500, text);
        bindingContext.bindValue(observeTextTextObserveWidget, filter, null, null);
        //
        return bindingContext;
    }
}
