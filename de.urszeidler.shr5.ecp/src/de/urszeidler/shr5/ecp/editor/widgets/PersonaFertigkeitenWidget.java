package de.urszeidler.shr5.ecp.editor.widgets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Shr5Package.Literals;
import de.urszeidler.eclipse.shr5.Spezialisierung;
import de.urszeidler.eclipse.shr5.Sprachfertigkeit;
import de.urszeidler.eclipse.shr5.Wissensfertigkeit;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * 
 */
public class PersonaFertigkeitenWidget extends Composite {

    private static final String EMPTY = ""; //$NON-NLS-1$

    /**
     * 
     */
    public class SpinnerCellEditor extends CellEditor {

        public SpinnerCellEditor(Composite parent, int style) {
            super(parent, style);
        }

        public SpinnerCellEditor(Composite parent) {
            super(parent);
        }

        @Override
        protected Control createControl(Composite parent) {
            Spinner spinner = new Spinner(parent, SWT.NONE);
            return spinner;
        }

        @Override
        protected Object doGetValue() {
            return getControl().getSelection();
        }

        @Override
        protected void doSetFocus() {
            getControl().setFocus();
        }

        @Override
        public Spinner getControl() {
            return (Spinner)super.getControl();
        }

        @Override
        protected void doSetValue(Object value) {
            getControl().setSelection((Integer)value);
        }
    }

    /**
     * 
     */
    public static class GroupWrapper {
        private List<Fertigkeit> entries = new ArrayList<Fertigkeit>();
        private String name;

        public List<Fertigkeit> getEntries() {
            return entries;
        }

        public String getName() {
            return name;
        }
    }

    /**
     * @author urs
     */
    public class FertigkeitsContentProvider implements ITreeContentProvider {
        private Object[] emtpty = {};

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

        @Override
        public Object[] getElements(Object inputElement) {
            return getChildren(inputElement);
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof FertigkeitsGruppe) {
                FertigkeitsGruppe fg = (FertigkeitsGruppe)parentElement;
                return fg.getFertigkeiten().toArray();
            } else if (parentElement instanceof GroupWrapper) {
                GroupWrapper gw = (GroupWrapper)parentElement;
                return gw.entries.toArray();
            } else if (parentElement instanceof Collection) {
                Collection<?> c = (Collection<?>)parentElement;
                return c.toArray();
            }
            return emtpty;
        }

        @Override
        public Object getParent(Object element) {
            return null;
        }

        @Override
        public boolean hasChildren(Object element) {
            return getChildren(element).length > 0;
        }
    }

    protected DataBindingContext m_bindingContext;

    private FormToolkit toolkit;// = new FormToolkit(Display.getCurrent());
    private AbstraktPersona persona;
    private ManagedCharacter character;
    private EditingDomain editingDomain;
    private TreeViewer treeViewer;
    private Composite composite;

    private IObservableList personaFertigkeiten;

    private IObservableList personaFertigkeitsGruppen;
    private boolean karmaMode = false;
    private boolean filterOnlyPersona;
    private String stringFilter;
    private boolean readOnly = false;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public PersonaFertigkeitenWidget(Composite parent, int style) {
        super(parent, style);
        toolkit = new FormToolkit(Display.getCurrent());
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        createWidgets();
    }

    public PersonaFertigkeitenWidget(Composite parent, int style, AbstraktPersona object, FormToolkit toolkit2, EditingDomain ed) {
        super(parent, style);
        toolkit = toolkit2;
        persona = object;
        editingDomain = ed;

        createWidgets();
    }

    public PersonaFertigkeitenWidget(Composite parent, int style, ManagedCharacter character2, FormToolkit toolkit2, EditingDomain editingDomain2) {
        super(parent, style);
        toolkit = toolkit2;
        editingDomain = editingDomain2;
        character = character2;
        persona = character2.getPersona();

        CharacterGenerator chracterSource = character2.getChracterSource();
        if (chracterSource instanceof Shr5KarmaGenerator) {
            // Shr5KarmaGenerator skg = (Shr5KarmaGenerator)chracterSource;
            karmaMode = true;
        }

        createWidgets();
    }

    public static List<Object> createFertigkeitGroupsRoot(AbstraktPersona persona) {
        Collection<EObject> groups = ItemPropertyDescriptor.getReachableObjectsOfType(persona, Shr5Package.Literals.FERTIGKEITS_GRUPPE);
        Collection<EObject> skill = ItemPropertyDescriptor.getReachableObjectsOfType(persona, Shr5Package.Literals.FERTIGKEIT);

        GroupWrapper ungrouped = new GroupWrapper();
        ungrouped.name = Messages.PersonaFertigkeitenWidget_ungrouped_skills;
        GroupWrapper knownGroup = new GroupWrapper();
        knownGroup.name = Messages.PersonaFertigkeitenWidget_knowlege_skill;
        GroupWrapper languGoup = new GroupWrapper();
        languGoup.name = Messages.PersonaFertigkeitenWidget_language_skill;

        for (EObject eObject : skill) {
            if (eObject instanceof Sprachfertigkeit) {
                Sprachfertigkeit wf = (Sprachfertigkeit)eObject;
                languGoup.entries.add(wf);
            } else if (eObject instanceof Wissensfertigkeit) {
                Wissensfertigkeit wf = (Wissensfertigkeit)eObject;
                knownGroup.entries.add(wf);
            } else if (eObject instanceof Fertigkeit) {
                Fertigkeit f = (Fertigkeit)eObject;
                if (!Shr5Package.Literals.FERTIGKEITS_GRUPPE__FERTIGKEITEN.equals(f.eContainingFeature())) {
                    ungrouped.entries.add(f);
                }
            }
        }

        List<Object> list = new ArrayList<Object>();
        list.addAll(groups);
        list.add(ungrouped);
        list.add(knownGroup);
        list.add(languGoup);

        return list;
    }

    private void createWidgets() {
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        setLayout(new FillLayout(SWT.HORIZONTAL));
        personaFertigkeiten = EMFEditObservables.observeList(editingDomain, persona, Literals.ABSTRAKT_PERSONA__FERTIGKEITEN);
        personaFertigkeitsGruppen = EMFEditObservables.observeList(editingDomain, persona, Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN);

        composite = new Composite(this, SWT.NONE);
        toolkit.adapt(composite);
        toolkit.paintBordersFor(composite);
        TreeColumnLayout tcl_composite = new TreeColumnLayout();
        composite.setLayout(tcl_composite);

        final EList<EAttribute> eAllAttributes = persona.eClass().getEAllAttributes();
        treeViewer = new TreeViewer(composite, SWT.BORDER);
        treeViewer.setAutoExpandLevel(2);
        ViewerFilter filter = new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                if (element instanceof Fertigkeit) {
                    Fertigkeit f = (Fertigkeit)element;
                    return eAllAttributes.contains(f.getAttribut());
                }
                return true;
            }
        };
        ViewerFilter filterOnlyPersonaFilter = new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                if (!filterOnlyPersona)
                    return true;

                if (element instanceof Fertigkeit) {
                    Fertigkeit fertigkeit = (Fertigkeit)element;
                    PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
                    boolean hasSkillGroup = false;
                    if (parentElement instanceof FertigkeitsGruppe) {
                        FertigkeitsGruppe fg = (FertigkeitsGruppe)parentElement;
                        hasSkillGroup = ShadowrunTools.findGruppe(fg, persona) != null;
                    }
                    return personaFertigkeit != null || hasSkillGroup;
                } else if (element instanceof FertigkeitsGruppe) {
                    FertigkeitsGruppe fg = (FertigkeitsGruppe)element;
                    return ShadowrunTools.hasFertigkeitUnderGroup(fg, persona) || ShadowrunTools.findGruppe(fg, persona) != null;
                }
                return true;
            }
        };

        ViewerFilter nameFilter = new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                if (element instanceof Fertigkeit)
                    if (stringFilter != null && !stringFilter.isEmpty()) {
                        LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();
                        String name = labelProvider.getText(element);
                        if (!name.contains(stringFilter))
                            return false;
                    }
                return true;
            }
        };

        treeViewer.setFilters(new ViewerFilter[]{ filter, filterOnlyPersonaFilter, nameFilter });
        final Tree tree = treeViewer.getTree();
        tree.setHeaderVisible(true);
        tree.setLinesVisible(true);
        toolkit.paintBordersFor(tree);

        TreeViewerColumn treeViewerNameColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
        treeViewerNameColumn.setLabelProvider(new ColumnLabelProvider() {
            public Image getImage(Object object) {
                return ExtendedImageRegistry.getInstance().getImage(AdapterFactoryUtil.getInstance().getItemDelegator().getImage(object));
            }

            public String getText(Object object) {
                if (object instanceof GroupWrapper) {
                    GroupWrapper gw = (GroupWrapper)object;
                    return gw.name;
                }

                return AdapterFactoryUtil.getInstance().getItemDelegator().getText(object);
            }
        });
        TreeColumn trclmnName = treeViewerNameColumn.getColumn();
        tcl_composite.setColumnData(trclmnName, new ColumnWeightData(50, 10, true));
        trclmnName.setText(Messages.PersonaFertigkeitenWidget_groups_skills);

        TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
        treeViewerColumn.setLabelProvider(new ColumnLabelProvider() {
            public String getText(Object object) {
                if (object instanceof Fertigkeit) {
                    Fertigkeit fertigkeit = (Fertigkeit)object;
                    PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
                    if (personaFertigkeit != null && !personaFertigkeit.getSpezialisierungen().isEmpty())
                        return AdapterFactoryUtil.getInstance().getLabelProvider().getText(personaFertigkeit.getSpezialisierungen());// .toString();
                }
                return EMPTY;
            }
        });
        TreeColumn trclmnSpecs = treeViewerColumn.getColumn();
        tcl_composite.setColumnData(trclmnSpecs, new ColumnPixelData(150, true, true));
        trclmnSpecs.setText(Messages.PersonaFertigkeitenWidget_trclmnSpecs_text);

        treeViewerColumn.setEditingSupport(new EditingSupport(treeViewer) {

            @Override
            protected CellEditor getCellEditor(Object element) {
                if (element instanceof Fertigkeit) {
                    final Fertigkeit fertigkeit = (Fertigkeit)element;
                    final PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);

                    ExtendedDialogCellEditor cellEditor = new ExtendedDialogCellEditor(tree, AdapterFactoryUtil.getInstance().getLabelProvider()) {

                        @Override
                        protected Object openDialogBox(Control cellEditorWindow) {
                            FeatureEditorDialog featureEditorDialog = new FeatureEditorDialog(getShell(), AdapterFactoryUtil.getInstance()
                                    .getLabelProvider(), personaFertigkeit, Shr5Package.Literals.PERSONA_FERTIGKEIT__SPEZIALISIERUNGEN,
                                    Messages.PersonaFertigkeitenWidget_select_specialism, fertigkeit.getSpezialisierungen());
                            int result = featureEditorDialog.open();
                            if (result == Window.OK) {
                                EList<?> list = featureEditorDialog.getResult();
                                if (list.size() > 0) {
                                    return list.get(0);
                                }
                            }
                            return null;
                        }
                    };

                    return cellEditor;
                }
                return null;
            }

            @Override
            protected boolean canEdit(Object element) {
                if(readOnly)
                    return false;
                if (element instanceof Fertigkeit) {
                    Fertigkeit fertigkeit = (Fertigkeit)element;// for #196

                    PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
                    if (personaFertigkeit != null) {
                        if (((Fertigkeit)element).eContainer() instanceof FertigkeitsGruppe) {
                            FertigkeitsGruppe fg = (FertigkeitsGruppe)((Fertigkeit)element).eContainer();
                            return ShadowrunTools.findGruppe(fg, persona) == null;
                        }
                        return true;
                    }
                }
                return false;
            }

            @Override
            protected Object getValue(Object element) {
                if (element instanceof Fertigkeit) {
                    Fertigkeit fertigkeit = (Fertigkeit)element;
                    PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
                    if (personaFertigkeit != null)
                        return personaFertigkeit.getSpezialisierungen();
                }
                return null;
            }

            @Override
            protected void setValue(Object element, Object value) {

                if (karmaMode)
                    changeFertigkeitsValueByAdvacement(element, value);
                else

                if (element instanceof Fertigkeit) {
                    Fertigkeit fertigkeit = (Fertigkeit)element;
                    PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
                    if (personaFertigkeit != null) {

                        Command command = AddCommand.create(editingDomain, personaFertigkeit,
                                Shr5Package.Literals.PERSONA_FERTIGKEIT__SPEZIALISIERUNGEN, value);
                        editingDomain.getCommandStack().execute(command);
                    }
                }
                treeViewer.refresh(true);
            }

        });

        TreeViewerColumn treeViewerValueColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
        treeViewerValueColumn.setLabelProvider(new ColumnLabelProvider() {
            public Image getImage(Object object) {
                return null;
            }

            public String getText(Object element) {
                if (element instanceof Fertigkeit) {
                    Fertigkeit f = (Fertigkeit)element;
                    Integer fertigkeitValue = ShadowrunTools.findFertigkeitValue(f, persona);
                    return fertigkeitValue.toString();

                } else if (element instanceof FertigkeitsGruppe) {
                    FertigkeitsGruppe fg = (FertigkeitsGruppe)element;
                    return ShadowrunTools.findFertigkeitValue(fg, persona) + EMPTY;
                } else if (element instanceof GroupWrapper) {
                    return EMPTY;
                }
                return element == null ? EMPTY : element.toString();
            }
        });
        treeViewerValueColumn.setEditingSupport(new EditingSupport(treeViewer) {
            protected boolean canEdit(Object element) {
                if(readOnly)
                    return false;
                
                if (element instanceof GroupWrapper) {
                    return false;
                }//  for #196
                if (element instanceof Fertigkeit)
                    if (((Fertigkeit)element).eContainer() instanceof FertigkeitsGruppe) {
                        FertigkeitsGruppe fg = (FertigkeitsGruppe)((Fertigkeit)element).eContainer();
                        return ShadowrunTools.findGruppe(fg, persona) == null;
                    }
                return true;
            }

            protected CellEditor getCellEditor(Object element) {
                if (element instanceof GroupWrapper) {
                    return null;
                }

                SpinnerCellEditor spinnerCellEditor = new SpinnerCellEditor(tree);
                return spinnerCellEditor;
            }

            protected Object getValue(Object element) {
                if (element instanceof Fertigkeit) {
                    Fertigkeit f = (Fertigkeit)element;
                    return ShadowrunTools.findFertigkeitValue(f, persona);
                } else if (element instanceof FertigkeitsGruppe) {
                    FertigkeitsGruppe fg = (FertigkeitsGruppe)element;
                    return ShadowrunTools.findFertigkeitValue(fg, persona);
                }
                return null;
            }

            protected void setValue(Object element, Object value) {
                if (karmaMode)
                    changeFertigkeitsValueByAdvacement(element, value);
                else
                    changeFertigkeitsValue(element, value);
                treeViewer.refresh(true);
            }
        });
        TreeColumn trclmnValue = treeViewerValueColumn.getColumn();
        tcl_composite.setColumnData(trclmnValue, new ColumnPixelData(50, true, true));
        trclmnValue.setText(Messages.PersonaFertigkeitenWidget_value);

        TreeViewerColumn treeViewerTotalColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
        treeViewerTotalColumn.setLabelProvider(new ColumnLabelProvider() {
            public Image getImage(Object element) {
                return null;
            }

            public String getText(Object element) {
                if (element instanceof Fertigkeit) {
                    Fertigkeit f = (Fertigkeit)element;
                    EAttribute attribut = f.getAttribut();
                    if (attribut != null) {
                        Integer value = (Integer)persona.eGet(attribut);
                        String attributeText = AdapterFactoryUtil.getInstance().getItemDelegator().getText(attribut);
                        Integer fertigkeitValue = ShadowrunTools.findFertigkeitValue(f, persona);
                        if (fertigkeitValue < 1 && !f.isAusweichen())
                            return Messages.PersonaFertigkeitenWidget_not_valid;
                        value = value + fertigkeitValue;
                        return "[" + attributeText + "] : " + value.toString(); //$NON-NLS-1$ //$NON-NLS-2$
                    }
                } else if (element instanceof FertigkeitsGruppe) {
                    FertigkeitsGruppe fg = (FertigkeitsGruppe)element;
                    return ShadowrunTools.findFertigkeitValue(fg, persona) + EMPTY;
                } else if (element instanceof GroupWrapper) {
                    return EMPTY;

                }
                return element == null ? EMPTY : element.toString();
            }
        });
        TreeColumn trclmnTotalColumn = treeViewerTotalColumn.getColumn();
        tcl_composite.setColumnData(trclmnTotalColumn, new ColumnPixelData(120, true, true));
        trclmnTotalColumn.setText(Messages.PersonaFertigkeitenWidget_dice_pool);

        treeViewer.setContentProvider(new FertigkeitsContentProvider());

        treeViewer.setInput(createFertigkeitGroupsRoot(persona));
        m_bindingContext = initDataBindings();

    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //

        //
        return bindingContext;
    }

    public boolean isFilterOnlyPersona() {
        return filterOnlyPersona;
    }

    public void setFilterOnlyPersona(boolean filterOnlyPersona) {
        this.filterOnlyPersona = filterOnlyPersona;
        treeViewer.refresh();
        treeViewer.expandToLevel(2);
    }

    /**
     * Changes the value of the fertigkeit by setting it.
     * 
     * @param element the fertigkeit or guppe
     * @param value the value
     */
    private void changeFertigkeitsValue(Object element, Object value) {
        if (element instanceof Fertigkeit) {
            Fertigkeit f = (Fertigkeit)element;
            PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(f, persona);
            if (personaFertigkeit == null) {
                PersonaFertigkeit pf = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
                pf.setFertigkeit(f);
                pf.setStufe((Integer)value);
                personaFertigkeiten.add(pf);
            } else {
                if ((Integer)value == 0) {
                    personaFertigkeiten.remove(personaFertigkeit);
                } else {
                    Command cmd = SetCommand.create(editingDomain, personaFertigkeit, Shr5Package.Literals.STEIGERBAR__STUFE, value);
                    editingDomain.getCommandStack().execute(cmd);
                    persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET,
                            Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN, null, null));
                }
            }
        } else if (element instanceof FertigkeitsGruppe) {
            FertigkeitsGruppe fg = (FertigkeitsGruppe)element;
            PersonaFertigkeitsGruppe personaFertigkeitsGruppe = ShadowrunTools.findGruppe(fg, persona);
            if (personaFertigkeitsGruppe == null) {
                PersonaFertigkeitsGruppe pfg = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
                pfg.setGruppe(fg);
                pfg.setStufe((Integer)value);
                personaFertigkeitsGruppen.add(pfg);
            } else {
                if ((Integer)value == 0) {
                    personaFertigkeitsGruppen.remove(personaFertigkeitsGruppe);
                } else {
                    Command cmd = SetCommand.create(editingDomain, personaFertigkeitsGruppe, Shr5Package.Literals.STEIGERBAR__STUFE, value);
                    editingDomain.getCommandStack().execute(cmd);
                    persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET,
                            Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN, null, null));
                }
            }
        }
    }

    /**
     * Changes the value of the fertigkeit by setting it.
     * 
     * @param element the fertigkeit or guppe
     * @param value the value
     */
    private void changeFertigkeitsValueByAdvacement(Object element, Object value) {
        if (element instanceof Fertigkeit) {
            Fertigkeit f = (Fertigkeit)element;
            if (value instanceof Spezialisierung) {
                Spezialisierung s = (Spezialisierung)value;
                ShadowrunManagmentTools.changeErlernbarByAdvacement(character, s);
            } else
                ShadowrunEditingTools.changeFertigkeitByAdvacement(character, f, (Integer)value);
        } else if (element instanceof FertigkeitsGruppe) {
            FertigkeitsGruppe fg = (FertigkeitsGruppe)element;
            ShadowrunEditingTools.changeFertigkeitsGruppeByAdvacement(character, fg, (Integer)value);
        }
    }

    public void setStringFilter(String stringFilter) {
        this.stringFilter = stringFilter;
        treeViewer.refresh();
        treeViewer.expandToLevel(2);
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }
}
