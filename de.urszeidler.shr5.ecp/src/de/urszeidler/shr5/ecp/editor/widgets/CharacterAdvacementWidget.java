package de.urszeidler.shr5.ecp.editor.widgets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.util.DefaultReferenceManager;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.NullObject;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;

public class CharacterAdvacementWidget extends Composite {

    private class ChangeOperation {
        EClass type;
        EStructuralFeature feature;
        boolean add = true;

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
                    handleSingleReference(new Transformer<Zauber, PersonaZauber>() {
                        @Override
                        public PersonaZauber transform(Zauber input) {
                            PersonaZauber zauber = Shr5Factory.eINSTANCE.createPersonaZauber();
                            zauber.setFormel(input);
                            return zauber;
                        }
                    }, e, list, getShell());
                    updateToolbars();
                    return;
                } else if (Shr5Package.Literals.TECHNOMANCER__COMPLEX_FORMS.equals(currentOperation.feature)) {
                    Collection<EObject> list = ItemPropertyDescriptor.getReachableObjectsOfType(character.getPersona(),
                            Shr5Package.Literals.KOMPLEXE_FORM);
                    handleSingleReference(new Transformer<KomplexeForm, PersonaKomplexForm>() {
                        @Override
                        public PersonaKomplexForm transform(KomplexeForm input) {
                            PersonaKomplexForm komplexForm = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
                            komplexForm.setForm(input);
                            return komplexForm;
                        }

                    }, e, list, getShell());
                    updateToolbars();
                    return;
                } else if (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN.equals(currentOperation.feature)) {
                    Collection<EObject> list = ItemPropertyDescriptor.getReachableObjectsOfType(character.getPersona(),
                            Shr5Package.Literals.FERTIGKEITS_GRUPPE);
                    handleSingleReference(new Transformer<FertigkeitsGruppe, PersonaFertigkeitsGruppe>() {
                        @Override
                        public PersonaFertigkeitsGruppe transform(FertigkeitsGruppe input) {
                            PersonaFertigkeitsGruppe gruppe = ShadowrunTools.findGruppe(input, character.getPersona());
                            if (gruppe == null) {
                                gruppe = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
                                gruppe.setGruppe(input);
                            }
                            return gruppe;
                        }

                    }, e, list, getShell());
                    updateToolbars();
                    return;

                } else if (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN.equals(currentOperation.feature)) {
                    Collection<EObject> list = ItemPropertyDescriptor.getReachableObjectsOfType(character.getPersona(),
                            Shr5Package.Literals.FERTIGKEIT);
                    handleSingleReference(new Transformer<Fertigkeit, PersonaFertigkeit>() {
                        @Override
                        public PersonaFertigkeit transform(Fertigkeit input) {
                            PersonaFertigkeit fertigkeit = ShadowrunTools.findFertigkeit(input, character.getPersona());
                            if (fertigkeit == null) {
                                fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
                                fertigkeit.setFertigkeit(input);
                            }
                            return fertigkeit;
                        }

                    }, e, list, getShell());
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
    private EmfFormBuilder emfFormBuilder;

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
    public CharacterAdvacementWidget(Composite parent, int style, EditingDomain editingDomain, ManagedCharacter character, FormToolkit toolkit2) {
        super(parent, style);
        toolkit = toolkit2;
        this.character = character;
        this.editingDomain = editingDomain;
        initalizeData();
        createParts();

    }

    /**
     * Creates the necessary parts for this widget.
     */
    private void createParts() {
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        setLayout(new GridLayout(3, false));

        Composite composite = new Composite(this, SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        toolkit.adapt(composite);
        toolkit.paintBordersFor(composite);

        Label lblAdvacement = toolkit.createLabel(composite, "advacement type", SWT.NONE);
        lblAdvacement.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

        ComboViewer comboViewer = new ComboViewer(composite, SWT.NONE);
        comboViewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                ChangeOperation element2 = (ChangeOperation)element;
                String typeName = AdapterFactoryUtil.getInstance().getLabelProvider().getText(element2.type);
                if (element2.feature != null) {
                    String featureName = AdapterFactoryUtil.getInstance().getLabelProvider().getText(element2.feature);
                    typeName = typeName + " " + featureName;
                    if (!element2.add)
                        typeName = "remove " + typeName;
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
                handleSelect(co.type);
            }
        });

        comboViewer.setInput(selectableChanges);
        combo = comboViewer.getCombo();
        combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
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
        tltmCommit.setText("commit");

        tltmCancel = new ToolItem(toolBar, SWT.NONE);
        tltmCancel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                cancelChange();
            }
        });
        tltmCancel.setText("cancel");
        new Label(composite, SWT.NONE);

        lblInstruction = toolkit.createLabel(composite, "Instruction", SWT.NONE);
        lblInstruction.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

        composite_detail = new Composite(this, SWT.NONE);
        composite_detail.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite_detail.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        toolkit.adapt(composite_detail);
        toolkit.paintBordersFor(composite_detail);

        composite_form = toolkit.createComposite(composite_detail, SWT.NONE);
        toolkit.paintBordersFor(composite_form);

        m_bindingContext = initDataBindings();
        updateToolbars();
    }

    protected void cancelChange() {
        clearChangeWidget();
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
        composite_form.setLayout(new GridLayout(6, false));
        composite_form.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.adapt(composite_form);
        toolkit.paintBordersFor(composite_form);
    }

    protected void commitChange() {
        clearChangeWidget();
        if (currentChange != null) {
            currentChange.applyChanges();
        }
        currentChange = null;
        updateToolbars();
    }

    protected void handleSelect(EClass eClass) {
        Composite parent = composite_form.getParent();
        composite_form.dispose();
        composite_form = new Composite(parent, SWT.NONE);
        composite_form.setLayout(new GridLayout(6, false));
        composite_form.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.adapt(composite_form);
        toolkit.paintBordersFor(composite_form);
        combo.setEnabled(false);

        currentChange = (Changes)eClass.getEPackage().getEFactoryInstance().create(eClass);
        character.getChanges().add(currentChange);

        emfFormBuilder = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil.getInstance()
                .getLabelProvider(), editingDomain);
        emfFormBuilder.setManager(mananger);
        emfFormBuilder.setBorderStyle(SWT.NONE);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHANGES__DATE, composite_form);

        if (currentChange instanceof KarmaGaint) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.KARMA_GAINT__KARMA, composite_form);
        } else if (currentChange instanceof AttributeChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.ATTRIBUTE_CHANGE__ATTIBUTE, composite_form);
        } else if (currentChange instanceof PersonaChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.PERSONA_CHANGE__CHANGEABLE, composite_form);
        }

        if (currentChange instanceof PersonaValueChange) {
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.PERSONA_VALUE_CHANGE__FROM, composite_form);
            emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.PERSONA_VALUE_CHANGE__TO, composite_form);
        }
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHANGES__KARMA_COST, composite_form);

        emfFormBuilder.buildinComposite(m_bindingContext, composite_form, currentChange);
        composite_form.layout();
        composite_form.getParent().layout();
        updateToolbars();
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }

    private void updateToolbars() {
        boolean enabled = currentChange != null && !currentChange.isChangeApplied();
        boolean canSpend = currentChange == null ? false : 0 <= currentChange.getKarmaCost()
                + (ShadowrunManagmentTools.getKarmaGaint(character) + ShadowrunManagmentTools.getKarmaSpend(character));

        boolean changeableSelected = false;
        if (currentChange instanceof PersonaChange) {
            PersonaChange pc = (PersonaChange)currentChange;
            changeableSelected = pc.getChangeable() != null;
        } else if (currentChange instanceof KarmaGaint) {
            changeableSelected = true;
        } else if (currentChange instanceof AttributeChange) {
            AttributeChange ac = (AttributeChange)currentChange;
            changeableSelected = ac.getAttibute() != null;
        }

        tltmCancel.setEnabled(enabled);
        boolean commitEnabled = enabled && canSpend && changeableSelected;
        tltmCommit.setEnabled(commitEnabled);
        if (!enabled && !canSpend) {
            lblInstruction.setText("Select advancement type.");
        } else if (!changeableSelected) {
            lblInstruction.setText("Select a type to change.");
        } else if (enabled && !canSpend) {
            lblInstruction.setText("Not enought karma.");
        } else if (commitEnabled) {
            lblInstruction.setText("You can commit your change.");
        }
    }

    private void initalizeData() {
        selectableChanges = new ArrayList<CharacterAdvacementWidget.ChangeOperation>();

        selectableChanges.add(new ChangeOperation());
        ChangeOperation op = new ChangeOperation();
        op.type = Shr5managementPackage.Literals.KARMA_GAINT;
        selectableChanges.add(op);
        op = new ChangeOperation();
        op.type = Shr5managementPackage.Literals.ATTRIBUTE_CHANGE;
        selectableChanges.add(op);

        EClass eClass = character.getPersona().eClass();
        EList<EReference> eAllContainments = eClass.getEAllContainments();
        for (EReference eReference : eAllContainments) {
            if (!Shr5Package.Literals.PERSONA_EIGENSCHAFT.equals(eReference.getEReferenceType()))
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
        op.feature = Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN;
        selectableChanges.add(op);
        op = new ChangeOperation();
        op.type = Shr5managementPackage.Literals.PERSONA_CHANGE;
        op.add = false;
        op.feature = Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN;
        selectableChanges.add(op);

    }
}
