package de.urszeidler.shr5.ecp.editor.widgets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.nebula.jface.cdatetime.CDateTimeObservableValue;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Fokus;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.MagieFokus;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.QiFokus;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezialisierung;
import de.urszeidler.eclipse.shr5.WaffenFokus;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterChange;
import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.DiaryEntry;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.eclipse.shr5Management.TrainingsTime;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.util.DefaultReferenceManager;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class CharacterAdvacementWidget extends Composite {

    private class ChangeOperation {
        EClass type;
        EStructuralFeature feature;
        boolean add = true;
        Changes changeToApply;

    }

    private ManagedCharacter character;
    private Changes currentChange;

    private EditingDomain editingDomain;
    private ReferenceManager mananger = new DefaultReferenceManager(AdapterFactoryUtil.getInstance().getItemDelegator()) {
        public void handleManage(FormbuilderEntry e, EObject object) {

            if (Shr5managementPackage.Literals.PERSONA_CHANGE.equals(currentOperation.type)) {
                if (!currentOperation.add) {
                    Object eGet = character.getPersona().eGet(currentOperation.feature);
                    if (eGet instanceof List<?>) {
                        List<?> list = (List<?>)eGet;
                        handleSingleReference(e, list, getShell());
                        updateToolbars();
                        return;
                    }
                } else if (Shr5Package.Literals.ZAUBERER__ZAUBER.equals(currentOperation.feature)) {
                    Collection<EObject> list = ItemPropertyDescriptor.getReachableObjectsOfType(character.getPersona(), Shr5Package.Literals.ZAUBER);
                    handleSingleReference(ShadowrunEditingTools.zauber2PersonaZauberTransformer(), e, list, getShell());
                    updateToolbars();
                    return;
                } else if (Shr5Package.Literals.TECHNOMANCER__COMPLEX_FORMS.equals(currentOperation.feature)) {
                    Collection<EObject> list = ItemPropertyDescriptor.getReachableObjectsOfType(character.getPersona(),
                            Shr5Package.Literals.KOMPLEXE_FORM);
                    handleSingleReference(ShadowrunEditingTools.complexForm2PersonaComplexFormTransformer(), e, list, getShell());
                    updateToolbars();
                    return;
                } else if (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN.equals(currentOperation.feature)) {
                    Collection<EObject> list = ItemPropertyDescriptor.getReachableObjectsOfType(character.getPersona(),
                            Shr5Package.Literals.FERTIGKEITS_GRUPPE);
                    Transformer<FertigkeitsGruppe, PersonaFertigkeitsGruppe> transformer = ShadowrunEditingTools
                            .fertigkeitsGruppe2PersonafertigkeitsGruppeTransformer(character);

                    handleSingleReference(transformer, e, list, getShell());
                    updateToolbars();
                    return;

                } else if (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN.equals(currentOperation.feature)) {
                    Collection<EObject> list = ItemPropertyDescriptor.getReachableObjectsOfType(character.getPersona(),
                            Shr5Package.Literals.FERTIGKEIT);
                    Transformer<Fertigkeit, PersonaFertigkeit> transformer = ShadowrunEditingTools.fertigkeit2PersonafertigkeitTransformer(character);
                    handleSingleReference(transformer, e, list, getShell());
                    updateToolbars();
                    return;
                } else if (Shr5Package.Literals.PERSONA_FERTIGKEIT__SPEZIALISIERUNGEN.equals(currentOperation.feature)) {

                    EList<PersonaFertigkeit> fertigkeiten = character.getPersona().getFertigkeiten();
                    ArrayList<Spezialisierung> arrayList = new ArrayList<Spezialisierung>();
                    for (PersonaFertigkeit personaFertigkeit : fertigkeiten) {
                        Fertigkeit fertigkeit = personaFertigkeit.getFertigkeit();
                        if (fertigkeit != null) {
                            arrayList.addAll(fertigkeit.getSpezialisierungen());
                        }
                    }

                    // Transformer<Fertigkeit, PersonaFertigkeit> transformer =
                    // ShadowrunEditingTools.fertigkeit2PersonafertigkeitTransformer(character);
                    handleSingleReference(e, arrayList, getShell());
                    updateToolbars();
                    return;
                }

                else if (Shr5Package.Literals.FOKUS_BINDING__FOKUS.equals(currentOperation.feature)) {
                    EList<AbstraktGegenstand> inventar = character.getInventar();
                    ArrayList<Fokus> list = new ArrayList<Fokus>();
                    for (AbstraktGegenstand abstraktGegenstand : inventar) {
                        if (abstraktGegenstand instanceof WaffenFokus)
                            list.add((Fokus)abstraktGegenstand);

                        if (abstraktGegenstand instanceof QiFokus) {
                            if (character.getPersona() instanceof KiAdept)
                                list.add((Fokus)abstraktGegenstand);

                        } else if (abstraktGegenstand instanceof MagieFokus)
                            if (character.getPersona() instanceof Zauberer)
                                list.add((Fokus)abstraktGegenstand);
                    }
                    handleSingleReference(e, list, getShell());
                    updateToolbars();
                    return;
                }
            }
            if (currentOperation.feature != null) {
                Collection<EObject> list = ItemPropertyDescriptor.getReachableObjectsOfType(character.getPersona(),
                        currentOperation.feature.getEType());
                handleSingleReference(e, list, getShell());
            } else
                super.handleManage(e, object);
            updateToolbars();
        };

    };
    // private EmfFormBuilder emfFormBuilder;

    private FormToolkit toolkit;
    private Composite composite_detail;
    private Collection<ChangeOperation> selectableChanges;
    private DataBindingContext m_bindingContext;
    private Composite composite_form;
    private Combo combo;
    private ChangeOperation currentOperation;
    private ToolItem tltmCommit;
    private ToolItem tltmCancel;
    private Label lblInstruction;
    private EContentAdapter contentAdapter;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public CharacterAdvacementWidget(Composite parent, int style) {
        super(parent, style);
        toolkit = new FormToolkit(Display.getCurrent());
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
                if (character instanceof PlayerCharacter) {
                    PlayerCharacter pl = (PlayerCharacter)character;
                    contentAdapter.unsetTarget(pl);
                }

            }
        });
        character = Shr5managementFactory.eINSTANCE.createPlayerCharacter();
        character.setPersona(Shr5Factory.eINSTANCE.createMudanPersona());

        initalizeData();
        createParts();

    }

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public CharacterAdvacementWidget(Composite parent, int style, EditingDomain editingDomain, ManagedCharacter character1, FormToolkit toolkit2) {
        super(parent, style);
        toolkit = toolkit2;
        this.character = character1;
        this.editingDomain = editingDomain;
        
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                if (character instanceof PlayerCharacter) {
                    PlayerCharacter pl = (PlayerCharacter)character;
                    contentAdapter.unsetTarget(pl);
                    pl.eAdapters().remove(contentAdapter);
                }

            }
        });

        initalizeData();
        createParts();

    }

    /**
     * Creates the necessary parts for this widget.
     */
    private void createParts() {
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        setLayout(new GridLayout(8, false));

        Composite composite = new Composite(this, SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        toolkit.adapt(composite);
        toolkit.paintBordersFor(composite);

        Label lblAdvacement = toolkit.createLabel(composite, Messages.CharacterAdvacementWidget_advacment_type, SWT.NONE);
        lblAdvacement.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

        final ComboViewer comboViewer = new ComboViewer(composite, SWT.READ_ONLY);
        comboViewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                ChangeOperation element2 = (ChangeOperation)element;
                String typeName = AdapterFactoryUtil.getInstance().getLabelProvider().getText(element2.type);
                if (element2.changeToApply != null)
                    return AdapterFactoryUtil.getInstance().getLabelProvider().getText(element2.changeToApply);
                if (element2.feature != null) {
                    String featureName = AdapterFactoryUtil.getInstance().getLabelProvider().getText(element2.feature);
                    typeName = typeName + " " + featureName; //$NON-NLS-1$
                    if (!element2.add)
                        typeName = Messages.CharacterAdvacementWidget_type_remove + typeName;
                }
                return typeName;
            }

        });
        comboViewer.setContentProvider(new ArrayContentProvider());
        comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                StructuredSelection ss = (StructuredSelection)event.getSelection();
                ChangeOperation co = (ChangeOperation)ss.getFirstElement();
                currentOperation = co;
                if (co.type != null)
                    handleSelect(co.type);
            }
        });

        comboViewer.setInput(selectableChanges);
        combo = comboViewer.getCombo();
        combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.paintBordersFor(combo);
        new Label(composite, SWT.NONE);

        ToolBar toolBar = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);
        toolBar.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
        toolkit.adapt(toolBar);
        toolkit.paintBordersFor(toolBar);

        tltmCommit = new ToolItem(toolBar, SWT.NONE);
        tltmCommit.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                commitChange();
            }
        });
        tltmCommit.setText(Messages.CharacterAdvacementWidget_commit);

        tltmCancel = new ToolItem(toolBar, SWT.NONE);
        tltmCancel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                cancelChange();
            }
        });
        tltmCancel.setText(Messages.CharacterAdvacementWidget_cancel);
        new Label(composite, SWT.NONE);

        lblInstruction = toolkit.createLabel(composite, Messages.CharacterAdvacementWidget_instruction, SWT.NONE);
        lblInstruction.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        new Label(composite, SWT.NONE);

        composite_detail = new Composite(this, SWT.NONE);
        GridLayout gl_composite_detail = new GridLayout(1, false);
        gl_composite_detail.marginHeight = 0;
        gl_composite_detail.marginWidth = 0;
        gl_composite_detail.verticalSpacing = 0;
        composite_detail.setLayout(gl_composite_detail);
        composite_detail.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        toolkit.adapt(composite_detail);
        toolkit.paintBordersFor(composite_detail);

        composite_form = toolkit.createComposite(composite_detail, SWT.NONE);
        composite_form.setLayout(new GridLayout(1, false));
        composite_form.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

        composite_form.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        toolkit.paintBordersFor(composite_form);
        new Label(this, SWT.NONE);
        new Label(this, SWT.NONE);
        new Label(this, SWT.NONE);
        new Label(this, SWT.NONE);
        new Label(this, SWT.NONE);
        new Label(this, SWT.NONE);

        m_bindingContext = initDataBindings();

        updateToolbars();
        contentAdapter = new EContentAdapter() {
            
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                
                Object feature = notification.getFeature();
                if (// Shr5managementPackage.Literals.CHARACTER_DIARY__ENTRIES.equals(feature)
                Shr5managementPackage.Literals.CHANGES__DATE_APPLIED.equals(feature)
                        || Shr5managementPackage.Literals.TRAININGS_TIME__DAYS_TRAINED.equals(feature)
                        || Shr5managementPackage.Literals.CHARACTER_CHANGE__CHANGE.equals(feature)
                        || Shr5managementPackage.Literals.MANAGED_CHARACTER__CHANGES.equals(feature)) {
                    initalizeData();
                    comboViewer.setInput(selectableChanges);
                }
            }
        };
        if (character instanceof PlayerCharacter) {
            PlayerCharacter pl = (PlayerCharacter)character;
            contentAdapter.setTarget(pl);
            pl.eAdapters().add(contentAdapter);
        }
    }

    /**
     * @param parent
     * @return
     */
    private void createPersonaValueChangeWidget(Composite parent) {
        Composite composite_ValueChange = parent;
        GridLayout gl_composite_ValueChange = new GridLayout(1, false);
        gl_composite_ValueChange.verticalSpacing = 0;
        gl_composite_ValueChange.marginWidth = 0;
        composite_ValueChange.setLayout(gl_composite_ValueChange);

        Composite composite_type = toolkit.createComposite(composite_ValueChange, SWT.NONE);
        composite_type.setLayout(new GridLayout(6, false));
        composite_type.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.paintBordersFor(composite_type);

        Composite composite_date = toolkit.createComposite(composite_ValueChange, SWT.NONE);
        composite_date.setLayout(new GridLayout(6, false));
        composite_date.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.paintBordersFor(composite_date);

        Label lblAt = new Label(composite_date, SWT.NONE);
        toolkit.adapt(lblAt, true, true);
        lblAt.setText(Messages.CharacterAdvacementWidget_lbl_at);

        CDateTime datewidget = new CDateTime(composite_date, CDT.DROP_DOWN);
        datewidget.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));

        Composite composite_descr = toolkit.createComposite(composite_ValueChange, SWT.NONE);
        composite_descr.setLayout(new GridLayout(7, false));
        composite_descr.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.paintBordersFor(composite_descr);

        Label lblDate = new Label(composite_descr, SWT.NONE);
        toolkit.adapt(lblDate, true, true);
        lblDate.setText(Messages.CharacterAdvacementWidget_lbl_from);

        Label lblXxx = new Label(composite_descr, SWT.NONE);
        GridData gd_lblXxx = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblXxx.widthHint = 20;
        lblXxx.setLayoutData(gd_lblXxx);
        toolkit.adapt(lblXxx, true, true);
        lblXxx.setText(Messages.CharacterAdvacementWidget_xxx);

        Label lblTo = new Label(composite_descr, SWT.NONE);
        toolkit.adapt(lblTo, true, true);
        lblTo.setText(Messages.CharacterAdvacementWidget_lbl_to);

        Label lblXxx_1 = new Label(composite_descr, SWT.NONE);
        GridData gd_lblXxx_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblXxx_1.widthHint = 20;
        lblXxx_1.setLayoutData(gd_lblXxx_1);
        toolkit.adapt(lblXxx_1, true, true);
        lblXxx_1.setText(Messages.CharacterAdvacementWidget_xxx);

        Label lblKarmaCost = new Label(composite_descr, SWT.NONE);
        toolkit.adapt(lblKarmaCost, true, true);
        lblKarmaCost.setText(Messages.CharacterAdvacementWidget_lbl_karma_cost);

        Label lblKc = toolkit.createLabel(composite_descr, "New Label", SWT.NONE); //$NON-NLS-1$
        GridData gd_lblKc = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblKc.widthHint = 20;
        gd_lblKc.minimumWidth = 20;
        lblKc.setLayoutData(gd_lblKc);

        IObservableValue observeTextLbl_KarmaCostObserveWidget = WidgetProperties.text().observe(lblKc);
        IObservableValue currentChangeKarmaCostObserveValue = EMFEditObservables.observeValue(editingDomain, currentChange,
                Literals.CHANGES__KARMA_COST);
        m_bindingContext.bindValue(observeTextLbl_KarmaCostObserveWidget, currentChangeKarmaCostObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextLblXxxObserveWidget = WidgetProperties.text().observe(lblXxx);
        IObservableValue pchangeFromObserveValue = EMFEditObservables.observeValue(editingDomain, currentChange, Literals.PERSONA_VALUE_CHANGE__FROM);
        m_bindingContext.bindValue(observeTextLblXxxObserveWidget, pchangeFromObserveValue,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextLblXxx_1ObserveWidget = WidgetProperties.text().observe(lblXxx_1);

        IObservableValue pchangeKarmaCostObserveValue = EMFEditObservables.observeValue(editingDomain, currentChange,
                Literals.PERSONA_VALUE_CHANGE__TO);
        m_bindingContext.bindValue(observeTextLblXxx_1ObserveWidget, pchangeKarmaCostObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        IObservableValue observeLocationDatewidgetObserveWidget = new CDateTimeObservableValue(datewidget);
        IObservableValue currentChangeDateObserveValue = EMFEditObservables.observeValue(editingDomain, currentChange, Literals.CHANGES__DATE);
        m_bindingContext.bindValue(observeLocationDatewidgetObserveWidget, currentChangeDateObserveValue, null, null);

        EmfFormBuilder emfFormBuilder = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
        emfFormBuilder.setManager(mananger);
        emfFormBuilder.setBorderStyle(SWT.NONE);

        if (currentChange instanceof AttributeChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.ATTRIBUTE_CHANGE__ATTIBUTE, composite_type);
        } else if (currentChange instanceof PersonaChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.PERSONA_CHANGE__CHANGEABLE, composite_type);
        }

        emfFormBuilder.buildinComposite(m_bindingContext, composite_type, currentChange);
    }

    /**
     * @param parent
     * @return
     */
    private void createKarmaGaintWidget(Composite parent) {
        Composite composite_ValueChange = parent;
        GridLayout gl_composite_ValueChange = new GridLayout(1, false);
        gl_composite_ValueChange.verticalSpacing = 0;
        gl_composite_ValueChange.marginWidth = 0;
        composite_ValueChange.setLayout(gl_composite_ValueChange);

        Composite composite_type = toolkit.createComposite(composite_ValueChange, SWT.NONE);
        composite_type.setLayout(new GridLayout(3, false));
        composite_type.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.paintBordersFor(composite_type);

        Composite composite_date = toolkit.createComposite(composite_ValueChange, SWT.NONE);
        composite_date.setLayout(new GridLayout(6, false));
        composite_date.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.paintBordersFor(composite_date);

        Label lblAt = new Label(composite_date, SWT.NONE);
        toolkit.adapt(lblAt, true, true);
        lblAt.setText(Messages.CharacterAdvacementWidget_lbl_at);

        CDateTime datewidget = new CDateTime(composite_date, CDT.DROP_DOWN);
        datewidget.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));

        IObservableValue observeLocationDatewidgetObserveWidget = new CDateTimeObservableValue(datewidget);
        IObservableValue currentChangeDateObserveValue = EMFEditObservables.observeValue(editingDomain, currentChange, Literals.CHANGES__DATE);
        m_bindingContext.bindValue(observeLocationDatewidgetObserveWidget, currentChangeDateObserveValue, null, null);

        EmfFormBuilder emfFormBuilder = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
        emfFormBuilder.setManager(mananger);
        emfFormBuilder.setBorderStyle(SWT.NONE);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.KARMA_GAINT__KARMA, composite_type);
        emfFormBuilder.buildinComposite(m_bindingContext, composite_type, currentChange);

    }

    protected void cancelChange() {
        clearChangeWidget();
        if (currentOperation.changeToApply == null)
            character.getChanges().remove(currentChange);
        currentChange = null;
        updateToolbars();
    }

    private void clearChangeWidget() {
        combo.select(0);
        combo.setEnabled(true);
        Composite parent = composite_form.getParent();
        composite_form.dispose();
        composite_form = new Composite(parent, SWT.NONE);
        composite_form.setLayout(new GridLayout(1, false));
        composite_form.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.adapt(composite_form);
        toolkit.paintBordersFor(composite_form);
    }

    protected void commitChange() {
        clearChangeWidget();
        if (currentChange != null) {
            currentChange.applyChanges();
            if (character instanceof PlayerCharacter && currentOperation.changeToApply == null) {
                PlayerCharacter pl = (PlayerCharacter)character;
                CharacterChange characterChange = Shr5managementFactory.eINSTANCE.createCharacterChange();
                characterChange.setChange(currentChange);
                characterChange.setDate(currentChange.getDate());
                characterChange.setMessage(String.format("%s", AdapterFactoryUtil.getInstance().getLabelProvider().getText(currentChange)));
                CharacterDiary diary = pl.getDiary();
                if (diary != null)
                    diary.getEntries().add(characterChange);
            }
        }
        currentChange = null;
        updateToolbars();
    }

    protected void handleSelect(EClass eClass) {
        Composite parent = composite_form.getParent();
        composite_form.dispose();
        composite_form = new Composite(parent, SWT.NONE);
        composite_form.setLayout(new GridLayout(1, false));
        composite_form.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.adapt(composite_form);
        toolkit.paintBordersFor(composite_form);
        combo.setEnabled(false);

        if (currentOperation.changeToApply != null)
            currentChange = currentOperation.changeToApply;
        else {
            currentChange = (Changes)eClass.getEPackage().getEFactoryInstance().create(eClass);
            character.getChanges().add(currentChange);
        }

        currentChange.setDate(ShadowrunManagmentTools.findCorrenspondingDate(character));
        if (currentChange instanceof PersonaValueChange) {
            createPersonaValueChangeWidget(composite_form);
        } else if (currentChange instanceof KarmaGaint) {
            createKarmaGaintWidget(composite_form);
        }

        // composite_form.layout();
        composite_form.getParent().layout();

        updateToolbars();
    }

    private void updateToolbars() {
        boolean enabled = currentChange != null && !currentChange.isChangeApplied();
        boolean canSpend = currentChange == null ? false : 0 <= currentChange.getKarmaCost() + character.getCurrentKarma();

        boolean changeableSelected = false;
        if (currentChange instanceof PersonaChange) {
            PersonaChange pc = (PersonaChange)currentChange;
            changeableSelected = pc.getChangeable() != null;
        } else if (currentChange instanceof KarmaGaint) {
            changeableSelected = true;
            canSpend = true;
        } else if (currentChange instanceof AttributeChange) {
            AttributeChange ac = (AttributeChange)currentChange;
            changeableSelected = ac.getAttibute() != null;
        }

        tltmCancel.setEnabled(enabled);
        boolean commitEnabled = enabled && canSpend && changeableSelected;
        tltmCommit.setEnabled(commitEnabled);
        if (!enabled && !canSpend) {
            lblInstruction.setText(Messages.CharacterAdvacementWidget_inst_select_advacment_type);
        } else if (!changeableSelected) {
            lblInstruction.setText(Messages.CharacterAdvacementWidget_inst_select_type);
        } else if (enabled && !canSpend) {
            lblInstruction.setText(Messages.CharacterAdvacementWidget_inst_not_enought_karma);
        } else if (commitEnabled) {
            lblInstruction.setText(Messages.CharacterAdvacementWidget_inst_commit);
        }
    }

    private void initalizeData() {
        selectableChanges = new ArrayList<CharacterAdvacementWidget.ChangeOperation>();

        selectableChanges.add(new ChangeOperation());
        ChangeOperation op = new ChangeOperation();
        op.type = Shr5managementPackage.Literals.KARMA_GAINT;
        selectableChanges.add(op);
        if (character instanceof PlayerCharacter) {
            addPlayerChanges(selectableChanges);
        } else {
            op = new ChangeOperation();
            op.type = Shr5managementPackage.Literals.ATTRIBUTE_CHANGE;
            selectableChanges.add(op);
        }

        EClass eClass = character.getPersona().eClass();
        EList<EReference> eAllContainments = eClass.getEAllContainments();
        for (EReference eReference : eAllContainments) {
            if (!Shr5Package.Literals.PERSONA_EIGENSCHAFT.equals(eReference.getEReferenceType()) && !Shr5Package.Literals.PERSONA_MARTIALART_STYLE.equals(eReference.getEReferenceType()))
                if (Shr5Package.Literals.ERLERNBAR.isSuperTypeOf(eReference.getEReferenceType())) {
                    op = new ChangeOperation();
                    op.type = Shr5managementPackage.Literals.PERSONA_CHANGE;
                    op.feature = eReference;
                    selectableChanges.add(op);
                }
        }

        op = new ChangeOperation();
        op.type = Shr5managementPackage.Literals.PERSONA_CHANGE;
        op.add = true;
        op.feature = Shr5Package.Literals.PERSONA_FERTIGKEIT__SPEZIALISIERUNGEN;
        selectableChanges.add(op);
        op = new ChangeOperation();
        op.type = Shr5managementPackage.Literals.PERSONA_CHANGE;
        op.add = true;
        op.feature = Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN;
        selectableChanges.add(op);
        op = new ChangeOperation();
        op.type = Shr5managementPackage.Literals.PERSONA_CHANGE;
        op.add = false;
        op.feature = Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN;
        selectableChanges.add(op);

        if (character.getPersona() instanceof BaseMagischePersona) {
            op = new ChangeOperation();
            op.type = Shr5managementPackage.Literals.PERSONA_CHANGE;
            op.add = true;
            op.feature = Shr5Package.Literals.FOKUS_BINDING__FOKUS;
            selectableChanges.add(op);
        }

    }

    /**
     * Add the possible changes for a player character.
     * 
     * @param selectableChanges2
     */
    private void addPlayerChanges(Collection<ChangeOperation> selectableChanges2) {
        PlayerCharacter pc = (PlayerCharacter)character;
        EList<DiaryEntry> entries = pc.getDiary().getEntries();
        ImmutableList<ChangeOperation> list = FluentIterable.from(entries).filter(TrainingsTime.class).filter(new Predicate<TrainingsTime>() {

            @Override
            public boolean apply(TrainingsTime input) {
                return input.getChange()!=null && !input.getChange().isChangeApplied() && input.getDaysRemains() == 0;
            }
        }).transform(new Function<TrainingsTime, ChangeOperation>() {

            @Override
            public ChangeOperation apply(TrainingsTime input) {
                ChangeOperation op = new ChangeOperation();
                op.type = Shr5managementPackage.Literals.PERSONA_CHANGE;
                op.add = true;
                op.changeToApply = input.getChange();
                return op;
            }
        }).toList();
        selectableChanges2.addAll(list);
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        //
        return bindingContext;
    }
}
