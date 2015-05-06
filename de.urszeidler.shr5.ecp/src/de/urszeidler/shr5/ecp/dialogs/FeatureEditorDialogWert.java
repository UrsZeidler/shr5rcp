/**
 * 
 */
package de.urszeidler.shr5.ecp.dialogs;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.BioWare;
import de.urszeidler.eclipse.shr5.Capacity;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.editor.widgets.FilterDropdownSelectionListener;
import de.urszeidler.shr5.ecp.util.MoneyLabelProvider;

public class FeatureEditorDialogWert extends FeatureEditorDialog {

    protected Label gesamtPreisLabel;
    // private Label gesamtStrassenPreisLabel;
    protected TableViewer choiceTableViewer;
    private IDialogSettings dialogSettings;
    private ViewerFilter shrListFilter;
    // private EStructuralFeature feature;
    // private ViewerFilter allowedSourceFilter;

    private EObject theEObject;
    private boolean activateFilter = true;
    private DialogType dialogType = DialogType.inventar;
    private ViewerFilter inCharacterFilter;
    private ViewerFilter sourceFilter;
    private FilterDropdownSelectionListener<SourceBook> sourceFilterDropdown;

    public enum DialogType {
        inventar, simple
    }

    /**
     * @wbp.parser.constructor
     * @param parent
     * @param labelProvider
     * @param object
     * @param structuralFeature
     * @param displayName
     * @param choiceOfValues
     */
    public FeatureEditorDialogWert(Shell parent, ILabelProvider labelProvider, EObject object, EStructuralFeature structuralFeature,
            String displayName, List<?> choiceOfValues, EObject orgObject) {
        super(parent, labelProvider, object, structuralFeature, displayName, choiceOfValues);
        INotifyChangedListener listner = new INotifyChangedListener() {
            @Override
            public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
                if (notification.getEventType() == org.eclipse.emf.common.notify.Notification.ADD
                        || notification.getEventType() == org.eclipse.emf.common.notify.Notification.REMOVE
                        || notification.getEventType() == org.eclipse.emf.common.notify.Notification.REMOVE_MANY
                        || notification.getEventType() == org.eclipse.emf.common.notify.Notification.ADD_MANY) {
                    updateLabel();
                }
            }
        };

        values.addListener(listner);
        dialogSettings = Activator.getDefault().getDialogSettings();
        theEObject = orgObject;
    }

    public FeatureEditorDialogWert(Shell parent, ILabelProvider labelProvider, EObject object, EStructuralFeature structuralFeature,
            String displayName, List<?> choiceOfValues, EObject orgObject, boolean activateFilter) {
        this(parent, labelProvider, object, structuralFeature, displayName, choiceOfValues, orgObject);
        this.activateFilter = activateFilter;
        dialogSettings = Activator.getDefault().getDialogSettings();
        theEObject = orgObject;
    }

    public FeatureEditorDialogWert(Shell parent, ILabelProvider labelProvider, EObject object, EStructuralFeature structuralFeature,
            String displayName, List<?> choiceOfValues, EObject orgObject, DialogType dialogType) {
        this(parent, labelProvider, object, structuralFeature, displayName, choiceOfValues, orgObject);
        this.dialogType = dialogType;
        switch (dialogType) {
            case simple:
                this.activateFilter = false;
                break;

            default:
                break;
        }
        dialogSettings = Activator.getDefault().getDialogSettings();
        theEObject = orgObject;
    }

    @SuppressWarnings("unchecked")
    protected void updateLabel() {
        // if (dialogType == DialogType.simple) {
        // String label = String.format("%d selected", values.getChildren().size());
        // gesamtPreisLabel.setText(label);
        // return;
        // }

        String label = null;
        List<Object> children = values.getChildren();
        List<?> children1 = children;

        int currentTypes = 0;
        for (Object type : children) {
            if (type instanceof Cyberware || type instanceof BioWare)
                currentTypes = currentTypes | 1;
            else if (type instanceof GeldWert)
                currentTypes = currentTypes | 2;
            else if (type instanceof PersonaEigenschaft)
                currentTypes = currentTypes | 4;
            else if (type instanceof KiKraft)
                currentTypes = currentTypes | 8;
        }
        switch (currentTypes) {
            case 1:
                label = String.format("%s¥ %.2f essence (%d items) ", ShadowrunTools.calcListenWertToString(values.getChildren()),
                        ShadowrunTools.calcEssenceSum((List<Koerpermods>)children1) / 100f, values.getChildren().size());// gesamtPreisLabel.setText(ShadowrunTools.calcListenWertToString(values.getChildren())
                break;
            case 2:
            case 3:
                label = String.format("%s¥ (%d items)", ShadowrunTools.calcListenWertToString(values.getChildren()), values.getChildren().size());// gesamtPreisLabel.setText(ShadowrunTools.calcListenWertToString(values.getChildren())
                break;
            case 4:
                label = String.format("%d Karma (%d selected)", ShadowrunManagmentTools.calcQuallityKarmaCost((List<PersonaEigenschaft>)children1),
                        values.getChildren().size());// gesamtPreisLabel.setText(ShadowrunTools.calcListenWertToString(values.getChildren())
                break;
            case 8:
                label = String.format("%.2f powerpoints (%d selected)", ShadowrunTools.calcKiPowerSum((List<KiKraft>)children1)/100f,
                        values.getChildren().size());// gesamtPreisLabel.setText(ShadowrunTools.calcListenWertToString(values.getChildren())
                break;
            default:
                label = String.format("%d selected", values.getChildren().size());
                break;
        }

        // Object type = null;
        // if (!children.isEmpty())
        // type = children.get(0);
        //
        // if (type instanceof Cyberware || type instanceof BioWare) {
        // List<?> children1 = children;
        // label = String.format("%s¥ %.2f essence (%d items) ", ShadowrunTools.calcListenWertToString(values.getChildren()),
        // ShadowrunTools.calcEssenceSum((List<Koerpermods>)children1) / 100f, values.getChildren().size());//
        // gesamtPreisLabel.setText(ShadowrunTools.calcListenWertToString(values.getChildren())
        // } else if (type instanceof GeldWert) {
        // label = String.format("%s¥ (%d items)", ShadowrunTools.calcListenWertToString(values.getChildren()), values.getChildren().size());//
        // gesamtPreisLabel.setText(ShadowrunTools.calcListenWertToString(values.getChildren())
        // } else if (type instanceof PersonaEigenschaft) {
        // List<?> children1 = children;
        // label = String.format("%d Karma (%d selected)", ShadowrunManagmentTools.calcQuallityKarmaCost((List<PersonaEigenschaft>)children1),
        // values.getChildren().size());// gesamtPreisLabel.setText(ShadowrunTools.calcListenWertToString(values.getChildren())
        // } else
        // label = String.format("%d selected", values.getChildren().size());
        gesamtPreisLabel.setText(label);
    }

    /**
     * A hard copy of everything the dialog formerly done in the supertypes but we need the table viewer to add filters. :(
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        // Composite contents = (Composite)super.createDialogArea(parent);
        Composite contents = new Composite(parent, SWT.NONE);
        GridLayout layout1 = new GridLayout();
        layout1.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
        layout1.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
        layout1.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
        layout1.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
        contents.setLayout(layout1);
        contents.setLayoutData(new GridData(GridData.FILL_BOTH));
        applyDialogFont(contents);

        GridLayout contentsGridLayout = (GridLayout)contents.getLayout();
        contentsGridLayout.numColumns = 3;

        GridData contentsGridData = (GridData)contents.getLayoutData();
        contentsGridData.horizontalAlignment = SWT.FILL;
        contentsGridData.verticalAlignment = SWT.FILL;

        Text patternText = null;

        if (choiceOfValues != null) {
            Group filterGroupComposite = new Group(contents, SWT.NONE);
            filterGroupComposite.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Choices_pattern_group"));
            filterGroupComposite.setLayout(new GridLayout(3, false));
            filterGroupComposite.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, false, false, 3, 1));

            Label label = new Label(filterGroupComposite, SWT.NONE);
            label.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Choices_pattern_label"));

            patternText = new Text(filterGroupComposite, SWT.BORDER);
            patternText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            // here we add the filter buttons

            Composite btnComposite = new Composite(filterGroupComposite, SWT.NONE);
            {
                GridData data = new GridData(SWT.FILL, SWT.FILL, false, false);
                data.horizontalAlignment = SWT.END;
                btnComposite.setLayoutData(data);

                GridLayout layout = new GridLayout();
                data.horizontalAlignment = SWT.FILL;
                layout.marginHeight = 0;
                layout.marginWidth = 0;
                layout.numColumns = 1;
                btnComposite.setLayout(layout);
            }
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
            // allowedSourceFilter = new ViewerFilter() {
            // @Override
            // public boolean select(Viewer viewer, Object parentElement, Object element) {
            // // if (theEObject instanceof ManagedCharacter) {
            // // ManagedCharacter mc = (ManagedCharacter)theEObject;
            // // CharacterGenerator<?> generatorSrc = mc.getChracterSource();
            // // if (generatorSrc instanceof Shr5RuleGenerator) {
            // // Shr5RuleGenerator srg = (Shr5RuleGenerator)generatorSrc;
            // // EList<SourceBook> allowedSources = srg.getAllowedSources();
            // // if (!allowedSources.isEmpty())
            // // if (ShadowrunTools.allowedSourcePredicate(allowedSources).apply((EObject)element))
            // // return false;
            // // }
            // // }
            // return true;
            // }
            // };

            ToolBar toolBar = new ToolBar(btnComposite, SWT.FLAT | SWT.RIGHT);
            final ToolItem filterShrList = new ToolItem(toolBar, SWT.CHECK);
            filterShrList.setToolTipText("show only list items");
            if (activateFilter)
                filterShrList.setSelection(dialogSettings.getBoolean("Featuredialog.shrListFilter"));
            filterShrList.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/toList.gif")); //$NON-NLS-1$ //$NON-NLS-2$

            if (activateFilter)
                filterShrList.addSelectionListener(new SelectionAdapter() {
                    @Override
                    public void widgetSelected(SelectionEvent e) {
                        if (filterShrList.getSelection()) {
                            choiceTableViewer.addFilter(shrListFilter);
                            // choiceTableViewer.addFilter(allowedSourceFilter);
                        } else {
                            choiceTableViewer.removeFilter(shrListFilter);
                            // choiceTableViewer.removeFilter(allowedSourceFilter);
                        }
                        dialogSettings.put("Featuredialog.shrListFilter", filterShrList.getSelection());
                    }
                });
            
            
            final ToolItem tltmSource = new ToolItem(toolBar, SWT.DROP_DOWN);
            tltmSource.setToolTipText("Filter by source book.");
            tltmSource.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/filter_on.gif"));
            sourceFilterDropdown = new FilterDropdownSelectionListener<SourceBook>(tltmSource){

                @SuppressWarnings("unchecked")
                @Override
                protected Collection<SourceBook> getFilterItems() {
                    Collection<?> collection = ItemPropertyDescriptor.getReachableObjectsOfType((EObject)theEObject, Shr5Package.Literals.SOURCE_BOOK);
                    return (Collection<SourceBook>)collection;
                }

                @Override
                protected void addFilterToWidget() {
                    if (choiceTableViewer != null) {
                        choiceTableViewer.addFilter(sourceFilter);
                        choiceTableViewer.refresh();
                    }
                }

                @Override
                protected void removeFilterFromWidget() {
                    if (choiceTableViewer != null) {
                        choiceTableViewer.removeFilter(sourceFilter);
                        choiceTableViewer.refresh();
                    }
                }

                @Override
                protected void refreshViewer() {
                    if (choiceTableViewer != null)
                        choiceTableViewer.refresh();
                }

            };
            tltmSource.addSelectionListener(sourceFilterDropdown);
            sourceFilterDropdown.buttonPushed();
            tltmSource.setSelection(true);
            
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

            
            
            final ManagedCharacter containedInCharacter = ShadowrunManagmentTools.getContainedInCharacter((EObject)object);
            inCharacterFilter = new ViewerFilter() {
                @Override
                public boolean select(Viewer viewer, Object parentElement, Object element) {

                    if (element instanceof EObject) {
                        EObject eo = (EObject)element;
                       
                        if (containedInCharacter!=null ) {
                            return ShadowrunManagmentTools.containedInCharaterPredicate(containedInCharacter).apply(eo);
                        }
                    }
                    return true;
                }
            }; 

            final ToolItem filterInCharacter = new ToolItem(toolBar, SWT.CHECK);
            filterInCharacter.setToolTipText("show only item contained by character");
            filterInCharacter.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/person-me.gif")); //$NON-NLS-1$ //$NON-NLS-2$
            filterInCharacter.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (filterInCharacter.getSelection()) {
                        choiceTableViewer.addFilter(inCharacterFilter);
                    } else {
                        choiceTableViewer.removeFilter(inCharacterFilter);
                    }
                }
            });

            final ToolItem labelProviderMoney = new ToolItem(toolBar, SWT.CHECK);
            labelProviderMoney.setToolTipText("display the money value");
            labelProviderMoney.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/newyen.png")); //$NON-NLS-1$ //$NON-NLS-2$
            labelProviderMoney.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (!labelProviderMoney.getSelection()) {
                        choiceTableViewer.setLabelProvider(labelProvider);
                    } else {
                        choiceTableViewer.setLabelProvider(new MoneyLabelProvider());
                    }
                    choiceTableViewer.refresh(true);
                }
            });

        }

        Composite choiceComposite = new Composite(contents, SWT.NONE);
        {
            GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
            data.horizontalAlignment = SWT.END;
            choiceComposite.setLayoutData(data);

            GridLayout layout = new GridLayout();
            data.horizontalAlignment = SWT.FILL;
            layout.marginHeight = 0;
            layout.marginWidth = 0;
            layout.numColumns = 1;
            choiceComposite.setLayout(layout);
        }

        Label choiceLabel = new Label(choiceComposite, SWT.NONE);
        choiceLabel.setText(choiceOfValues == null ? EMFEditUIPlugin.INSTANCE.getString("_UI_Value_label") : EMFEditUIPlugin.INSTANCE
                .getString("_UI_Choices_label"));
        GridData choiceLabelGridData = new GridData();
        choiceLabelGridData.verticalAlignment = SWT.FILL;
        choiceLabelGridData.horizontalAlignment = SWT.FILL;
        choiceLabel.setLayoutData(choiceLabelGridData);

        final Table choiceTable = choiceOfValues == null ? null : new Table(choiceComposite, SWT.MULTI | SWT.BORDER);
        int width = Math.min(1600, Display.getCurrent().getBounds().width);
        if (choiceTable != null) {
            GridData choiceTableGridData = new GridData();
            choiceTableGridData.widthHint = width / 5;
            choiceTableGridData.heightHint = Display.getCurrent().getBounds().height / 3;
            choiceTableGridData.verticalAlignment = SWT.FILL;
            choiceTableGridData.horizontalAlignment = SWT.FILL;
            choiceTableGridData.grabExcessHorizontalSpace = true;
            choiceTableGridData.grabExcessVerticalSpace = true;
            choiceTable.setLayoutData(choiceTableGridData);
        }

        choiceTableViewer = choiceOfValues == null ? null : new TableViewer(choiceTable);
        if (choiceTableViewer != null) {
            choiceTableViewer.setContentProvider(new AdapterFactoryContentProvider(new AdapterFactoryImpl()));
            choiceTableViewer.setLabelProvider(labelProvider);
            final PatternFilter filter = new PatternFilter() {
                @Override
                protected boolean isParentMatch(Viewer viewer, Object element) {
                    return viewer instanceof AbstractTreeViewer && super.isParentMatch(viewer, element);
                }
            };
            choiceTableViewer.addFilter(filter);
            if (patternText != null) {
                patternText.addModifyListener(new ModifyListener() {
                    public void modifyText(ModifyEvent e) {
                        filter.setPattern(((Text)e.widget).getText());
                        choiceTableViewer.refresh();
                    }
                });
            }
            // if (activateFilter)
            // choiceTableViewer.addFilter(allowedSourceFilter);
            if (unique) {
                choiceTableViewer.addFilter(new ViewerFilter() {

                    @Override
                    public boolean select(Viewer viewer, Object parentElement, Object element) {
                        return !values.getChildren().contains(element);
                    }
                });
            }

            choiceTableViewer.setInput(new ItemProvider(choiceOfValues));
            choiceTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {

                @Override
                public void selectionChanged(SelectionChangedEvent event) {
                    try {
                        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().getSelectionProvider()
                                .setSelection(event.getSelection());

                    } catch (Exception e) {
                    }
                }
            });
        }

        // We use multi even for a single line because we want to respond to the enter key.
        //
        int style = multiLine ? SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER : SWT.MULTI | SWT.BORDER;
        final Text choiceText = choiceOfValues == null ? new Text(choiceComposite, style) : null;
        if (choiceText != null) {
            GridData choiceTextGridData = new GridData();
            choiceTextGridData.widthHint = width / 5;
            choiceTextGridData.verticalAlignment = SWT.BEGINNING;
            choiceTextGridData.horizontalAlignment = SWT.FILL;
            choiceTextGridData.grabExcessHorizontalSpace = true;
            if (multiLine) {
                choiceTextGridData.verticalAlignment = SWT.FILL;
                choiceTextGridData.grabExcessVerticalSpace = true;
            }
            choiceText.setLayoutData(choiceTextGridData);
        }

        Composite controlButtons = new Composite(contents, SWT.NONE);
        GridData controlButtonsGridData = new GridData();
        controlButtonsGridData.verticalAlignment = SWT.FILL;
        controlButtonsGridData.horizontalAlignment = SWT.FILL;
        controlButtons.setLayoutData(controlButtonsGridData);

        GridLayout controlsButtonGridLayout = new GridLayout();
        controlButtons.setLayout(controlsButtonGridLayout);

        new Label(controlButtons, SWT.NONE);

        final Button addButton = new Button(controlButtons, SWT.PUSH);
        addButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Add_label"));
        GridData addButtonGridData = new GridData();
        addButtonGridData.verticalAlignment = SWT.FILL;
        addButtonGridData.horizontalAlignment = SWT.FILL;
        addButton.setLayoutData(addButtonGridData);

        final Button removeButton = new Button(controlButtons, SWT.PUSH);
        removeButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Remove_label"));
        GridData removeButtonGridData = new GridData();
        removeButtonGridData.verticalAlignment = SWT.FILL;
        removeButtonGridData.horizontalAlignment = SWT.FILL;
        removeButton.setLayoutData(removeButtonGridData);

        Label spaceLabel = new Label(controlButtons, SWT.NONE);
        GridData spaceLabelGridData = new GridData();
        spaceLabelGridData.verticalSpan = 2;
        spaceLabel.setLayoutData(spaceLabelGridData);

        final Button upButton = new Button(controlButtons, SWT.PUSH);
        upButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Up_label"));
        GridData upButtonGridData = new GridData();
        upButtonGridData.verticalAlignment = SWT.FILL;
        upButtonGridData.horizontalAlignment = SWT.FILL;
        upButton.setLayoutData(upButtonGridData);

        final Button downButton = new Button(controlButtons, SWT.PUSH);
        downButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Down_label"));
        GridData downButtonGridData = new GridData();
        downButtonGridData.verticalAlignment = SWT.FILL;
        downButtonGridData.horizontalAlignment = SWT.FILL;
        downButton.setLayoutData(downButtonGridData);

        addContollButtons(controlButtons);

        Composite featureComposite = new Composite(contents, SWT.NONE);
        {
            GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
            data.horizontalAlignment = SWT.END;
            featureComposite.setLayoutData(data);

            GridLayout layout = new GridLayout();
            data.horizontalAlignment = SWT.FILL;
            layout.marginHeight = 0;
            layout.marginWidth = 0;
            layout.numColumns = 1;
            featureComposite.setLayout(layout);
        }

        Label featureLabel = new Label(featureComposite, SWT.NONE);
        featureLabel.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Feature_label"));
        GridData featureLabelGridData = new GridData();
        featureLabelGridData.horizontalSpan = 2;
        featureLabelGridData.horizontalAlignment = SWT.FILL;
        featureLabelGridData.verticalAlignment = SWT.FILL;
        featureLabel.setLayoutData(featureLabelGridData);

        final Table featureTable = new Table(featureComposite, SWT.MULTI | SWT.BORDER);
        GridData featureTableGridData = new GridData();
        featureTableGridData.widthHint = width / 5;
        featureTableGridData.heightHint = Display.getCurrent().getBounds().height / 3;
        featureTableGridData.verticalAlignment = SWT.FILL;
        featureTableGridData.horizontalAlignment = SWT.FILL;
        featureTableGridData.grabExcessHorizontalSpace = true;
        featureTableGridData.grabExcessVerticalSpace = true;
        featureTable.setLayoutData(featureTableGridData);

        final TableViewer featureTableViewer = new TableViewer(featureTable);
        featureTableViewer.setContentProvider(contentProvider);
        featureTableViewer.setLabelProvider(labelProvider);
        featureTableViewer.setInput(values);
        final EList<Object> children = values.getChildren();
        if (!children.isEmpty()) {
            featureTableViewer.setSelection(new StructuredSelection(children.get(0)));
        }

        if (choiceTableViewer != null) {
            choiceTableViewer.addDoubleClickListener(new IDoubleClickListener() {
                public void doubleClick(DoubleClickEvent event) {
                    if (addButton.isEnabled()) {
                        addButton.notifyListeners(SWT.Selection, null);
                    }
                }
            });

            featureTableViewer.addDoubleClickListener(new IDoubleClickListener() {
                public void doubleClick(DoubleClickEvent event) {
                    if (removeButton.isEnabled()) {
                        removeButton.notifyListeners(SWT.Selection, null);
                    }
                }
            });
        }

        if (choiceText != null) {
            choiceText.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent event) {
                    if (!multiLine && (event.character == '\r' || event.character == '\n')) {
                        try {
                            Object value = EcoreUtil.createFromString((EDataType)eClassifier, choiceText.getText());
                            children.add(value);
                            choiceText.setText("");
                            featureTableViewer.refresh();
                            featureTableViewer.setSelection(new StructuredSelection(value));
                            event.doit = false;
                        } catch (RuntimeException exception) {
                            // Ignore
                        }
                    } else if (event.character == '\33') {
                        choiceText.setText("");
                        event.doit = false;
                    }
                }
            });
        }

        upButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                IStructuredSelection selection = (IStructuredSelection)featureTableViewer.getSelection();
                int minIndex = 0;
                for (Iterator<?> i = selection.iterator(); i.hasNext();) {
                    Object value = i.next();
                    int index = children.indexOf(value);
                    children.move(Math.max(index - 1, minIndex++), value);
                }
            }
        });

        downButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                IStructuredSelection selection = (IStructuredSelection)featureTableViewer.getSelection();
                int maxIndex = children.size() - 1;
                List<?> objects = selection.toList();
                for (ListIterator<?> i = objects.listIterator(objects.size()); i.hasPrevious();) {
                    Object value = i.previous();
                    int index = children.indexOf(value);
                    children.move(Math.min(index + 1, maxIndex--), value);
                }
            }
        });

        addButton.addSelectionListener(new SelectionAdapter() {
            // event is null when choiceTableViewer is double clicked
            @Override
            public void widgetSelected(SelectionEvent event) {
                if (choiceTableViewer != null) {
                    IStructuredSelection selection = (IStructuredSelection)choiceTableViewer.getSelection();
                    for (Iterator<?> i = selection.iterator(); i.hasNext();) {
                        Object value = i.next();
                        if (!unique || !children.contains(value)) {
                            if (!capacityReached(value)) {
                                children.add(value);
                            }
                        }
                    }
                    featureTableViewer.refresh();
                    featureTableViewer.setSelection(selection);
                    choiceTableViewer.refresh();
                } else if (choiceText != null) {
                    try {
                        Object value = EcoreUtil.createFromString((EDataType)eClassifier, choiceText.getText());
                        if (!unique || !children.contains(value)) {
                            children.add(value);
                            choiceText.setText("");
                        }
                        featureTableViewer.refresh();
                        featureTableViewer.setSelection(new StructuredSelection(value));
                    } catch (RuntimeException exception) {
                        // Ignore
                    }
                }
            }
        });

        removeButton.addSelectionListener(new SelectionAdapter() {
            // event is null when featureTableViewer is double clicked
            @Override
            public void widgetSelected(SelectionEvent event) {
                IStructuredSelection selection = (IStructuredSelection)featureTableViewer.getSelection();
                Object firstValue = null;
                for (Iterator<?> i = selection.iterator(); i.hasNext();) {
                    Object value = i.next();
                    if (firstValue == null) {
                        firstValue = value;
                    }
                    children.remove(value);
                }

                if (!children.isEmpty()) {
                    featureTableViewer.setSelection(new StructuredSelection(children.get(0)));
                }

                if (choiceTableViewer != null) {
                    choiceTableViewer.refresh();
                    choiceTableViewer.setSelection(selection);
                } else if (choiceText != null) {
                    if (firstValue != null) {
                        String value = EcoreUtil.convertToString((EDataType)eClassifier, firstValue);
                        choiceText.setText(value);
                    }
                }
            }
        });

        Composite composite = contents;
        choiceComposite = new Composite(composite, SWT.NONE);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, false, false);
        gridData.grabExcessHorizontalSpace = false;
        gridData.horizontalSpan = 3;
        choiceComposite.setLayoutData(gridData);
        GridLayout gridLayout = new GridLayout(3, false);
        gridLayout.marginWidth = 5;
        gridLayout.marginHeight = 5;
        gridLayout.verticalSpacing = 5;
        gridLayout.horizontalSpacing = 5;
        choiceComposite.setLayout(gridLayout);

        // Label label = new Label(choiceComposite, SWT.NONE);
        // label.setText("---");
        gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        gesamtPreisLabel = new Label(choiceComposite, SWT.NONE);
        gesamtPreisLabel.setLayoutData(gridData);
        updateLabel();
        if (activateFilter)
            if (dialogSettings.getBoolean("Featuredialog.shrListFilter"))
                choiceTableViewer.addFilter(shrListFilter);

       
        
        composite.pack();
        return composite;
    }

    protected boolean capacityReached(Object value) {
        if (theEObject instanceof Capacity) {
            Capacity ca = (Capacity)theEObject;
            return !ca.canAdd((EObject)value);
        }
        return false;
    }

    protected void addContollButtons(Composite controlButtons) {

    }

    @Override
    protected Point getInitialSize() {
        return super.getInitialSize();
    }

    public void setIsUnique(boolean unique) {
        this.unique = unique;
    }
}