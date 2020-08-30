package de.urszeidler.shr5.ecp.editor.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.ResourceManager;

import com.google.common.collect.FluentIterable;

import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.CredstickTransaction;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.ShoppingTransaction;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.TransferAmount;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5.util.Shr5Switch;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.ShrReferenceManager;
import de.urszeidler.shr5.ecp.editor.actions.ActionM2TDialog;
import de.urszeidler.shr5.ecp.editor.widgets.FilterDropdownSelectionListener;
import de.urszeidler.shr5.ecp.editor.widgets.SimpleTreeTableWidget;
import de.urszeidler.shr5.ecp.preferences.PreferenceConstants;
import de.urszeidler.shr5.ecp.util.DefaultLabelProvider;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.runtime.ui.views.SimpleListContenProvider;

public class TransactionsPage extends AbstractShr5Page<ShoppingTransaction> {
    private CredstickTransaction object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Text txtSearch;
    private Table table_1;
    private TableViewer tableViewer_1;
    private PatternFilter nameFilter;
    private ViewerFilter shrListFilter;
    private ViewerFilter typeFilter;
    private ViewerFilter sourceFilter;
    private SimpleTreeTableWidget treeTableWidgetEigenschaften;
    private SourceDropdownSelectionListener sourceFilterDropdown;
    private TypeDropdownSelectionListener typeFilterDropdown;

    private class SourceDropdownSelectionListener extends FilterDropdownSelectionListener<SourceBook> {

        public SourceDropdownSelectionListener(ToolItem dropdown) {
            super(dropdown);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected Collection<SourceBook> getFilterItems() {
            Collection<?> collection = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.SOURCE_BOOK);
            return (Collection<SourceBook>)collection;
        }

        @Override
        protected void addFilterToWidget() {
            if (tableViewer_1 != null) {
                tableViewer_1.addFilter(sourceFilter);
                tableViewer_1.refresh();
            }
        }

        @Override
        protected void removeFilterFromWidget() {
            if (tableViewer_1 != null) {
                tableViewer_1.removeFilter(sourceFilter);
                tableViewer_1.refresh();
            }
        }

        @Override
        protected void refreshViewer() {
            if (tableViewer_1 != null)
                tableViewer_1.refresh();
        }

    }

    //
    // private class SourceDropdownSelectionListener extends DropdownSelectionListener<SourceBook> {
    // private static final String ENTRY = "entry";
    // private boolean filterActive = true;
    // private ILabelProvider labelprovider = new DefaultLabelProvider();
    // private Set<SourceBook> sourceFilterValueList = new HashSet<SourceBook>();
    //
    // public SourceDropdownSelectionListener(ToolItem dropdown) {
    // super(dropdown);
    // Collection<EObject> sourceBooks = getSourceBooks();
    // for (EObject sourceBook : sourceBooks) {
    // add(labelprovider.getText(sourceBook), (SourceBook)sourceBook);
    // sourceFilterValueList.add((SourceBook)sourceBook);
    // }
    //
    // MenuItem menuItem = new MenuItem(menu, SWT.SEPARATOR);
    // menuItem = new MenuItem(menu, SWT.NONE);
    // menuItem.setText("filter none");
    // menuItem.addSelectionListener(new SelectionAdapter() {
    // public void widgetSelected(SelectionEvent event) {
    // MenuItem[] items = menu.getItems();
    // for (int i = 0; i < items.length; i++) {
    // MenuItem menuItem1 = items[i];
    // Object data = menuItem1.getData(ENTRY);
    // if (data != null) {
    // sourceFilterValueList.remove((SourceBook)data);
    // menuItem1.notifyListeners(SWT.Selection, new Event());
    // }
    // }
    // }
    // });
    // menuItem = new MenuItem(menu, SWT.NONE);
    // menuItem.setText("filter all");
    // menuItem.addSelectionListener(new SelectionAdapter() {
    // public void widgetSelected(SelectionEvent event) {
    // MenuItem[] items = menu.getItems();
    // for (int i = 0; i < items.length; i++) {
    // MenuItem menuItem1 = items[i];
    // Object data = menuItem1.getData(ENTRY);
    // if (data != null) {
    // sourceFilterValueList.add((SourceBook)data);
    // menuItem1.notifyListeners(SWT.Selection, new Event());
    // }
    // }
    // }
    // });
    // }
    //
    // private Collection<EObject> getSourceBooks() {
    // Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.SOURCE_BOOK);
    // return collection;
    // }
    //
    // @Override
    // protected void buttonPushed() {
    // if (filterActive) {
    // if (tableViewer_1 != null) {
    // tableViewer_1.removeFilter(sourceFilter);
    // tableViewer_1.refresh();
    // }
    // dropdown.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/filter_off.gif"));
    // filterActive = false;
    // } else {
    // if (tableViewer_1 != null) {
    // tableViewer_1.addFilter(sourceFilter);
    // tableViewer_1.refresh();
    // }
    // dropdown.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/filter_on.gif"));
    // filterActive = true;
    // }
    // }
    //
    // @Override
    // public void add(String item, final SourceBook action) {
    // final MenuItem menuItem = new MenuItem(menu, SWT.NONE);
    // menuItem.setText(item);
    // menuItem.setData(ENTRY, action);
    // sourceFilterValueList.add(action);
    // menuItem.setImage(labelprovider.getImage(action));
    //
    // menuItem.addSelectionListener(new SelectionAdapter() {
    // public void widgetSelected(SelectionEvent event) {
    // if (sourceFilterValueList.contains(action)) {
    // menuItem.setImage(ResourceManager.decorateImage(labelprovider.getImage(action),
    // ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/overlay-critical.gif")));
    // sourceFilterValueList.remove(action);
    // } else {
    // menuItem.setImage(labelprovider.getImage(action));
    // sourceFilterValueList.add(action);
    // }
    // if (tableViewer_1 != null)
    // tableViewer_1.refresh();
    // }
    // });
    // }
    //
    // public Set<SourceBook> getSourceFilterValueList() {
    // return sourceFilterValueList;
    // }
    //
    // }
    //
    private class TypeDropdownSelectionListener extends FilterDropdownSelectionListener<EClass> {

        public TypeDropdownSelectionListener(ToolItem dropdown) {
            super(dropdown);
        }

        @Override
        protected Collection<EClass> getFilterItems() {
            EList<EClassifier> eClassifiers = Shr5Package.Literals.GELD_WERT.getEPackage().getEClassifiers();
           return FluentIterable.from(eClassifiers).filter(EClass.class).filter(new com.google.common.base.Predicate<EClass>() {

                @Override
                public boolean apply(EClass ec) {
                    return (!ec.isAbstract() && !ec.isInterface()) && (ec.getEAllSuperTypes().contains(Shr5Package.Literals.ABSTRAKT_GEGENSTAND)
                            || ec.getEAllSuperTypes().contains(Shr5Package.Literals.FAHRZEUG)
                            || ec.getEAllSuperTypes().contains(Shr5Package.Literals.VERTRAG));
                }
            }).toList();
        }

        @Override
        protected void addFilterToWidget() {
            if (tableViewer_1 != null) {
                tableViewer_1.addFilter(typeFilter);
                tableViewer_1.refresh();
            }
        }

        @Override
        protected void removeFilterFromWidget() {
            if (tableViewer_1 != null) {
                tableViewer_1.removeFilter(typeFilter);
                tableViewer_1.refresh();
            }
        }

        @Override
        protected void refreshViewer() {
            if (tableViewer_1 != null)
                tableViewer_1.refresh();
        }

    }
//
//    private class TypeDropdownSelectionListener extends DropdownSelectionListener<EClass> {
//        private boolean filterActive = true;
//
//        public TypeDropdownSelectionListener(ToolItem dropdown) {
//            super(dropdown);
//            EList<EClassifier> eClassifiers = Shr5Package.Literals.GELD_WERT.getEPackage().getEClassifiers();
//            for (EClassifier eClassifier : eClassifiers) {
//                if (eClassifier instanceof EClass) {
//                    EClass ec = (EClass)eClassifier;
//                    if (!ec.isAbstract() && !ec.isInterface())
//                        // if (ec.getEAllSuperTypes().contains(Shr5Package.Literals.GELD_WERT))
//                        if (ec.getEAllSuperTypes().contains(Shr5Package.Literals.ABSTRAKT_GEGENSTAND)
//                                || ec.getEAllSuperTypes().contains(Shr5Package.Literals.FAHRZEUG)
//                                || ec.getEAllSuperTypes().contains(Shr5Package.Literals.VERTRAG))
//                            // if (!ec.getEAllSuperTypes().contains(Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS))
//                            add(ec);
//                }
//            }
//
//            MenuItem menuItem = new MenuItem(menu, SWT.SEPARATOR);
//            menuItem = new MenuItem(menu, SWT.NONE);
//            menuItem.setText("filter none");
//            menuItem.addSelectionListener(new SelectionAdapter() {
//                public void widgetSelected(SelectionEvent event) {
//                    MenuItem[] items = menu.getItems();
//                    for (int i = 0; i < items.length; i++) {
//                        MenuItem menuItem1 = items[i];
//                        Object data = menuItem1.getData("entry");
//                        if (data != null) {
//                            typeFilterValueList.remove((EClass)data);
//                            menuItem1.notifyListeners(SWT.Selection, new Event());
//                        }
//                    }
//                }
//            });
//            menuItem = new MenuItem(menu, SWT.NONE);
//            menuItem.setText("filter all");
//            menuItem.addSelectionListener(new SelectionAdapter() {
//                public void widgetSelected(SelectionEvent event) {
//                    MenuItem[] items = menu.getItems();
//                    for (int i = 0; i < items.length; i++) {
//                        MenuItem menuItem1 = items[i];
//                        Object data = menuItem1.getData("entry");
//                        if (data != null) {
//                            typeFilterValueList.add((EClass)data);
//                            menuItem1.notifyListeners(SWT.Selection, new Event());
//                        }
//                    }
//                }
//            });
//
//        }
//
//        @Override
//        protected void buttonPushed() {
//            if (filterActive) {
//                if (tableViewer_1 != null) {
//                    tableViewer_1.removeFilter(typeFilter);
//                    tableViewer_1.refresh();
//                }
//                filterActive = false;
//                dropdown.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/filter_off.gif"));
//            } else {
//                if (tableViewer_1 != null) {
//                    tableViewer_1.addFilter(typeFilter);
//                    tableViewer_1.refresh();
//                }
//                filterActive = true;
//                dropdown.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/filter_on.gif"));
//            }
//        }
//
//        private void add(EClass eObject) {
//            add(labelprovider.getText(eObject), eObject);
//            typeFilterValueList.add(eObject);
//        }
//
//        @Override
//        public void add(String item, final EClass action) {
//            final MenuItem menuItem = new MenuItem(menu, SWT.NONE);
//            menuItem.setText(item);
//            menuItem.setData("entry", action);
//            menuItem.setImage(labelprovider.getImage(action));
//
//            menuItem.addSelectionListener(new SelectionAdapter() {
//                public void widgetSelected(SelectionEvent event) {
//                    if (typeFilterValueList.contains(action)) {
//                        menuItem.setImage(ResourceManager.decorateImage(labelprovider.getImage(action),
//                                ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/overlay-critical.gif")));
//                        typeFilterValueList.remove(action);
//                    } else {
//                        menuItem.setImage(labelprovider.getImage(action));
//                        typeFilterValueList.add(action);
//                    }
//
//                    if (tableViewer_1 != null)
//                        tableViewer_1.refresh();
//                }
//            });
//        }
//
//    }
//
    private class ItemLabelProvider extends DefaultLabelProvider implements ITableLabelProvider {

        @Override
        public Image getColumnImage(Object element, int columnIndex) {
            if (columnIndex == 0)
                return getImage(element);
            if (columnIndex == 1)
                if (element instanceof Quelle) {
                    Quelle q = (Quelle)element;
                    if (q.getSrcBook() != null)
                        return getImage(q.getSrcBook());
                }

            return null;
        }

        @Override
        public String getColumnText(Object element, int columnIndex) {

            switch (columnIndex) {
                case 0:
                    return getText(element);
                case 1:
                    if (element instanceof Quelle) {
                        Quelle q = (Quelle)element;
                        if (q.getSrcBook() != null)
                            return getText(q.getSrcBook());
                    }
                    return "unset";
                case 2:
                    GeldWert geldWert = (GeldWert)element;
                    if (geldWert.getWert() == null)
                        return "0";
                    return String.format("%,.0f %s", geldWert.getWert(), store.getString(PreferenceConstants.CURRENCY_SYMBOL));

                default:
                    break;
            }
            return null;
        }

    }

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public TransactionsPage(String id, String title) {
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
    public TransactionsPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createShoppingTransaction();
    }

    public TransactionsPage(FormEditor editor, String id, String title, CredstickTransaction object) {
        super(editor, id, title);
        this.object = object;

    }

    public TransactionsPage(FormEditor editor, String id, String title, CredstickTransaction object, EditingDomain editingDomain,
            ReferenceManager manager1) {
        super(editor, id, title, manager1);
        this.object = object;
        this.editingDomain = editingDomain;

        EObject c1 = this.object.eContainer();
        if (c1 instanceof Credstick) {
            Credstick c = (Credstick)c1;
            EObject c2 = c.eContainer();
            if (c2 instanceof ManagedCharacter) {
                ManagedCharacter mc = (ManagedCharacter)c2;
                if (this.object.getDate() == null)
                    this.object.setDate(ShadowrunManagmentTools.findCorrenspondingDate(mc));

                if (this.object instanceof TransferAmount) {
                    TransferAmount ta = (TransferAmount)this.object;
                    if (ta.getSource() == null)
                        ta.setSource(c);
                }
            }
        }
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
        if (object instanceof ShoppingTransaction) {
            form.getToolBarManager().add(new ActionM2TDialog(form.getShell(), object));
        }
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        if (object instanceof ShoppingTransaction && ((ShoppingTransaction)object).getAmount() == null)
            createShoppingSection(managedForm);

        // ------------------------------------
        m_bindingContext = initDataBindings();
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK_TRANSACTION__DATE, composite, new DateEntryFactory(toolkit));
        emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK_TRANSACTION__DESCRIPTION, composite);

        if (object instanceof ShoppingTransaction) {
            if (((ShoppingTransaction)object).getAmount() == null) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.SHOPPING_TRANSACTION__CACULATED_COSTS, composite, new LabelMoneyEntry());
                emfFormBuilder.addTextEntry(Shr5Package.Literals.SHOPPING_TRANSACTION__FEE, composite);
            } else {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK_TRANSACTION__AMOUNT, composite, new LabelMoneyEntry());
                emfFormBuilder.addTextEntry(Shr5Package.Literals.SHOPPING_TRANSACTION__FEE, composite, new LabelMoneyEntry());
            }
            treeTableWidgetEigenschaften = new SimpleTreeTableWidget(composite, "", SWT.NONE, object,
                    Shr5Package.Literals.SHOPPING_TRANSACTION__ITEMS, toolkit, mananger, editingDomain, this);
            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, false, true, 3, 1);
            layoutData.heightHint = 150;
            treeTableWidgetEigenschaften.setLayoutData(layoutData);
            managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);

        } else if (object instanceof TransferAmount) {
            if (object.getAmount() == null) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.TRANSFER_AMOUNT__AMOUNT_TO_TRANSFER, composite);
            } else {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK_TRANSACTION__AMOUNT, composite, new LabelMoneyEntry());
            }
            emfFormBuilder.addTextEntry(Shr5Package.Literals.TRANSFER_AMOUNT__SOURCE, composite);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.TRANSFER_AMOUNT__DEST, composite);
        } else {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK_TRANSACTION__AMOUNT, composite);
        }

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        if (object.getAmount() == null)
            if (object instanceof TransferAmount) {
                final TransferAmount ta = (TransferAmount)object;
                Button button = new Button(composite, SWT.PUSH);
                button.setText("do transfer");
                button.addSelectionListener(new SelectionAdapter() {
                    @Override
                    public void widgetSelected(SelectionEvent e) {
                        if (ta.getDest() != null) {
                            TransferAmount ta1 = Shr5Factory.eINSTANCE.createTransferAmount();
                            ta1.setAmount(ta.getAmountToTransfer());
                            ta1.setSource(ta.getSource());
                            ta1.setDest(ta.getDest());
                            ta1.setDate(ta.getDate());
                            ta1.setDescription(ta.getDescription());
                            ta.getDest().getTransactionlog().add(ta1);
                            ta.setAmount(ta.getAmountToTransfer().negate());
                            getEditor().close(true);
                        }
                    }
                });
            }
        managedForm.reflow(true);
    }

    /**
     * @param managedForm
     */
    private void createShoppingSection(IManagedForm managedForm) {
        Section sctnBuyItems = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnBuyItems.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnBuyItems);
        sctnBuyItems.setText("Buy items");
        sctnBuyItems.setExpanded(true);

        Composite composite_1 = managedForm.getToolkit().createComposite(sctnBuyItems, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_1);
        sctnBuyItems.setClient(composite_1);
        composite_1.setLayout(new GridLayout(1, false));

        Composite composite_3 = managedForm.getToolkit().createComposite(composite_1, SWT.NONE);
        composite_3.setLayout(new GridLayout(1, false));
        composite_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        composite_3.setBounds(0, 0, 64, 64);
        managedForm.getToolkit().paintBordersFor(composite_3);

        Composite composite_2 = new Composite(composite_3, SWT.NONE);
        GridData gd_composite_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_composite_2.widthHint = 353;
        composite_2.setLayoutData(gd_composite_2);
        managedForm.getToolkit().adapt(composite_2);
        managedForm.getToolkit().paintBordersFor(composite_2);

        ViewerComparator nameSorter = new ViewerComparator() {
            public int compare(Viewer viewer, Object e1, Object e2) {
                String t1 = labelprovider.getText(e1);
                String t2 = labelprovider.getText(e2);
                return t1.compareTo(t2);
            };
        };

        composite_2.setLayout(new GridLayout(4, false));

        shrListFilter = new ViewerFilter() {

            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {

                if (element instanceof EObject) {
                    EObject eo = (EObject)element;
                    EObject eContainer = eo.eContainer();
                    if (!(eContainer instanceof ShrList)) {
                        return false;
                    }
                }
                return true;
            }
        };

        typeFilter = new ViewerFilter() {

            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                if (element instanceof EObject) {
                    EObject eo = (EObject)element;
                    return typeFilterDropdown.getFilterValues().contains(eo.eClass());
                }
                return true;
            }
        };

        sourceFilter = new ViewerFilter() {

            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                if (element instanceof Quelle) {
                    Quelle q = (Quelle)element;
                    return sourceFilterDropdown.getFilterValues().contains(q.getSrcBook());
                }
                return true;
            }
        };

        nameFilter = new PatternFilter() {
            @Override
            protected boolean isParentMatch(Viewer viewer, Object element) {
                return viewer instanceof AbstractTreeViewer && super.isParentMatch(viewer, element);
            }
        };

        txtSearch = new Text(composite_2, SWT.BORDER);
        txtSearch.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                nameFilter.setPattern(txtSearch.getText());
                if (tableViewer_1 != null)
                    tableViewer_1.refresh();
            }
        });

        txtSearch.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(txtSearch, true, true);

        ToolBar toolBar = new ToolBar(composite_2, SWT.FLAT | SWT.RIGHT);
        toolBar.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(toolBar);
        managedForm.getToolkit().paintBordersFor(toolBar);

        ToolItem tltmType = new ToolItem(toolBar, SWT.DROP_DOWN);
        tltmType.setText("type");
        tltmType.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/filter_on.gif"));
        typeFilterDropdown = new TypeDropdownSelectionListener(tltmType);
        tltmType.addSelectionListener(typeFilterDropdown);

        ToolItem tltmSource = new ToolItem(toolBar, SWT.DROP_DOWN);
        tltmSource.setText("source");
        tltmSource.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/filter_on.gif"));
        sourceFilterDropdown = new SourceDropdownSelectionListener(tltmSource);

        ToolItem tltmAdd = new ToolItem(toolBar, SWT.NONE);
        tltmAdd.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addSelectedObjectsToList();
            }
        });
        tltmAdd.setText("add");
        tltmAdd.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/addButton.png"));
        tltmAdd.setText(Messages.TreeTableWidget_add_element);

        ToolItem tltmRemove = new ToolItem(toolBar, SWT.NONE);
        tltmRemove.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                treeTableWidgetEigenschaften.removeSelectedElement();
            }
        });
        tltmRemove.setText("remove");
        tltmRemove.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/removeButton.png"));
        tltmRemove.setText(Messages.TreeTableWidget_remove_element);
        tltmRemove.setToolTipText(Messages.TreeTableWidget_remove_element_tooltip);

        ToolItem tltmBuy = new ToolItem(toolBar, SWT.NONE);
        tltmBuy.setText("buy");
        tltmBuy.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/newyen.png"));
        tltmBuy.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {

                EObject eContainer = object.eContainer();
                if (eContainer instanceof Credstick) {
                    Credstick c = (Credstick)eContainer;
                    EObject c1 = c.eContainer();
                    if (c1 instanceof ManagedCharacter) {
                        final ManagedCharacter character = (ManagedCharacter)c1;
                        ShoppingTransaction st = (ShoppingTransaction)object;
                        object.setAmount(st.getCaculatedCosts().negate());
                        EList<GeldWert> items = st.getItems();
                        Shr5Switch<Object> characterAdder = new Shr5Switch<Object>() {
                            public Object caseAbstraktGegenstand(AbstraktGegenstand object) {
                                character.getInventar().add(object);
                                return null;
                            };

                            public Object caseVertrag(Vertrag object) {
                                character.getContracts().add(object);
                                return null;
                            };

                            public Object caseFahrzeug(Fahrzeug object) {
                                character.getVehicels().add(object);
                                return null;
                            };

                        };
                        ArrayList<GeldWert> arrayList = new ArrayList<GeldWert>();
                        for (GeldWert geldWert : items) {
                            EObject eObject = ShrReferenceManager.copyWithParentId(geldWert);
                            characterAdder.doSwitch(eObject);
                            arrayList.add((GeldWert)eObject);
                        }
                        st.getItems().clear();
                        st.getItems().addAll(arrayList);
                        getEditor().close(true);
                    }
                }
            }
        });

        tltmSource.addSelectionListener(sourceFilterDropdown);

        tableViewer_1 = new TableViewer(composite_3, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
        getSite().setSelectionProvider(tableViewer_1);
        tableViewer_1.addDoubleClickListener(new IDoubleClickListener() {

            @Override
            public void doubleClick(DoubleClickEvent event) {
                addSelectedObjectsToList();
            }
        });
        table_1 = tableViewer_1.getTable();
        table_1.setLinesVisible(true);
        table_1.setHeaderVisible(true);
        GridData gd_table_1 = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        gd_table_1.heightHint = 300;
        table_1.setLayoutData(gd_table_1);
        managedForm.getToolkit().paintBordersFor(table_1);

        TableColumn tblclmnName = new TableColumn(table_1, SWT.LEFT);
        tblclmnName.setWidth(320);
        tblclmnName.setText("name");

        TableColumn tblclmnSource = new TableColumn(table_1, SWT.NONE);
        tblclmnSource.setWidth(230);
        tblclmnSource.setText("source");

        TableColumn tblclmnPrice = new TableColumn(table_1, SWT.RIGHT);
        tblclmnPrice.setResizable(false);
        tblclmnPrice.setWidth(100);
        tblclmnPrice.setText("price");

        tableViewer_1.setContentProvider(new SimpleListContenProvider(new AdapterFactoryContentProvider(AdapterFactoryUtil.getInstance()
                .getAdapterFactory())));

        tableViewer_1.setLabelProvider(new ItemLabelProvider());
        tableViewer_1.setComparator(nameSorter);
        tableViewer_1.setInput(getAllObjects());

        tableViewer_1.addFilter(nameFilter);
        tableViewer_1.addFilter(shrListFilter);
        tableViewer_1.addFilter(typeFilter);
        tableViewer_1.addFilter(sourceFilter);
    }

    @SuppressWarnings("unchecked")
    private void addSelectedObjectsToList() {
        StructuredSelection selection = (StructuredSelection)tableViewer_1.getSelection();
        for (EObject eo : ShadowrunTools.toIterable((Iterator<EObject>)selection.iterator())) {
            ((ShoppingTransaction)object).getItems().add((GeldWert)eo);
        }
    }

    /**
     * @return
     */
    private List<EObject> getAllObjects() {
        return ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof GeldWert) {
                    return true;
                }
                return false;
            }
        });
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
