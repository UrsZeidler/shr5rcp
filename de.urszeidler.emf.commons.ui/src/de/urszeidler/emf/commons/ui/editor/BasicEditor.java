package de.urszeidler.emf.commons.ui.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.urszeidler.commons.Duo;
import de.urszeidler.emf.commons.ui.util.SelectionProvider;

public abstract class BasicEditor<E extends EObject> extends FormEditor implements ISelectionProvider,
		ITabbedPropertySheetPageContributor, ISelectionChangedListener, ISaveablePart, IEditingDomainProvider,
		IMenuListener {

	protected EMFDataBindingContext ctx;
	// protected EMFUpdateValueStrategy updateStrategie;
	protected ComposedAdapterFactory adapterFactory;
	protected AdapterFactoryItemDelegator itemDelegator;
	protected AdapterFactoryLabelProvider labelProvider;

	protected SelectionProvider<E> selctionProvider = new SelectionProvider<E>();
	protected TabbedPropertySheetPage tabbedPropertySheetPage;
	protected E theEObject;
	/**
	 * Resources that have been saved. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected Collection<Resource> savedResources = new ArrayList<Resource>();
	protected AdapterFactoryContentProvider basicContentProvider;

	protected IPartListener partListener = new IPartListener() {
		public void partActivated(IWorkbenchPart p) {
			if (p == BasicEditor.this) {
				handleActivate();
			}
		}

		public void partBroughtToTop(IWorkbenchPart p) {
			// Ignore.
		}

		public void partClosed(IWorkbenchPart p) {
			// Ignore.
		}

		public void partDeactivated(IWorkbenchPart p) {
			// Ignore.
		}

		public void partOpened(IWorkbenchPart p) {
			// Ignore.
		}
	};
	// private Adapter observerAdapter;
	protected EditingDomain editingDomain;
	private CommandStackListener stackListener;

	public BasicEditor() {
		super();
		ctx = new EMFDataBindingContext(DisplayRealm.getRealm(Display.getCurrent()));
		// updateStrategie = new EMFUpdateValueStrategy();

		// toolBarManager = new ToolBarManager(SWT.FLAT);
	}

	public E getEObject() {
		return theEObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void setInput(IEditorInput input) {
		if (input instanceof EObjectEditorInput) {
			EObjectEditorInput eoi = (EObjectEditorInput) input;

			EObject eobject = eoi.getEobject();
			theEObject = (E) eobject;
			editingDomain = eoi.getEditingDomain();
			if (editingDomain == null) {
				editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(eobject);
			}

			if (editingDomain != null) {
				stackListener = new CommandStackListener() {
					public void commandStackChanged(final EventObject event) {
						getContainer().getDisplay().asyncExec(new Runnable() {
							public void run() {
								firePropertyChange(IEditorPart.PROP_DIRTY);
							}
						});
					}
				};
				editingDomain.getCommandStack().addCommandStackListener(stackListener);
			}
			
			
			
			setInputObject(theEObject);
		}

		super.setInput(input);
	}

	/**
	 * @param managedForm
	 * @param parent
	 * @param toolkit
	 * @param td
	 * @deprecated
	 */
	public Composite createTiteledSection(IManagedForm managedForm, Composite parent, FormToolkit toolkit,
			TableWrapData td, String sectitel) {
		Composite client;
		Section section = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE
				| Section.EXPANDED);
		SectionPart spart1 = new SectionPart(section);
		managedForm.addPart(spart1);
		section.setLayoutData(td);
		section.setText(sectitel);
		client = toolkit.createComposite(section);
		section.setClient(client);

		return client;
	}

	/**
	 * @param managedForm
	 * @param parent
	 * @param toolkit
	 * @param td
	 */
	public static Duo<Section, Composite> createTiteledSection(IManagedForm managedForm, Composite parent,
			FormToolkit toolkit, Object layoutData, String sectitel, String description) {
		Composite client;
		Section section = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE
				| Section.EXPANDED);
		SectionPart spart1 = new SectionPart(section);
		managedForm.addPart(spart1);
		section.setLayoutData(layoutData);
		section.setText(sectitel);
		section.setDescription(description);
		client = toolkit.createComposite(section, SWT.BORDER);
		GridDataFactory.swtDefaults().grab(true, true).applyTo(client);
		section.setClient(client);

		Duo<Section, Composite> duo = new Duo<Section, Composite>(section, client);
		return duo;
	}

	/**
	 * creates a composite section with TableWrapLayout
	 * 
	 * @param managedForm
	 * @param parent
	 * @param title
	 * @return
	 */
	public Composite createComposite(IManagedForm managedForm, Composite parent, String title) {
		TableWrapLayout layout = new TableWrapLayout();
		layout.topMargin = 5;
		layout.leftMargin = 5;
		layout.rightMargin = 2;
		layout.bottomMargin = 2;
		layout.numColumns = 3;
		parent.setLayout(layout);

		FormToolkit toolkit = getToolkit();
		// HeaderSection
		Section s1 = toolkit.createSection(parent, Section.SHORT_TITLE_BAR);
		s1.marginWidth = 10;

		s1.setText(title);
		TableWrapData td = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP);
		td.colspan = 3;
		// td.grabHorizontal = true;
		s1.setLayoutData(td);
		toolkit.createCompositeSeparator(s1);

		final SectionPart spart = new SectionPart(s1);
		managedForm.addPart(spart);
		// details client section
		Composite client = toolkit.createComposite(s1);
		s1.setClient(client);
		return client;
	}

	protected FormToolkit createToolkit(Display display) {
		// Create a toolkit that shares colors between editors.
		return new FormToolkit(display);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		site.setSelectionProvider(this);
		site.getPage().addPartListener(partListener);

		initAdatpterFactory();
		labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		setPartName(labelProvider.getText(theEObject));
		setTitleImage(labelProvider.getImage(theEObject));


	}

	/**
	 * need to set the basicContentProvider and the adapterFactory
	 */
	protected abstract void initAdatpterFactory();

	/**
	 * This Method will be called if setInput is called with an
	 * EObjectEditorInput
	 * 
	 * @param eobject
	 */
	protected abstract void setInputObject(E eobject);

	/**
	 * logs an error, for exaple in the error log
	 * 
	 * @param string
	 * @param exception
	 */
	protected abstract void logError(String string, Exception exception);

	public void addPostSelectionChangedListener(ISelectionChangedListener listener) {
		selctionProvider.addPostSelectionChangedListener(listener);
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selctionProvider.addSelectionChangedListener(listener);
	}

	public ISelection getSelection() {
		return selctionProvider.getSelection();
	}

	public void postSelectionChanged(SelectionChangedEvent event) {
		selctionProvider.postSelectionChanged(event);
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selctionProvider.removeSelectionChangedListener(listener);
	}

	public void selectionChanged(SelectionChangedEvent event) {
		selctionProvider.selectionChanged(event);
	}

	public void setSelection(ISelection selection) {
		selctionProvider.setSelection(selection);
		if (getEditorSite().getActionBarContributor() != null)
			getEditorSite().getActionBarContributor().setActiveEditor(this);
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help
	 * fill the context menus with contributions from the Edit menu. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener) getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well
	 * registering the menu for extension. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(getEditingDomain(), viewer));
	}

	// /**
	// * @param fertigkeitsTree
	// * @param list
	// * @param toolkit
	// * @param client
	// * @return
	// */
	// protected TreeViewer createModificationTreeViewer(ModifikatorList list,
	// FormToolkit toolkit, Composite client) {
	// Tree fertigkeitsTree = toolkit.createTree(client, SWT.H_SCROLL |
	// SWT.V_SCROLL);
	//
	// TreeViewer fertigkeitsTreeViewer = new TreeViewer(fertigkeitsTree);
	// fertigkeitsTreeViewer.setLabelProvider(new
	// AdapterFactoryLabelProvider(adapterFactory));
	// AdapterFactoryContentProvider contentProvider = new
	// AdapterFactoryContentProvider(adapterFactory);
	// fertigkeitsTreeViewer.setContentProvider(contentProvider);
	// fertigkeitsTreeViewer.setInput(list);
	// return fertigkeitsTreeViewer;
	// }

	protected void handleActivate() {
		// Recompute the read only state.

		// Refresh any actions that may become enabled or disabled.
		//
		if (getSelection().isEmpty())
			setSelection(new StructuredSelection(getEObject()));
		else
			setSelection(getSelection());
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model
	 * file. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		// Do the work within an operation because this is a long running
		// activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			// This is the method that gets invoked when the operation runs.
			//
			@Override
			public void execute(IProgressMonitor monitor) {
				// Save the resources to the file system.
				//
				boolean first = true;
				for (Resource resource : getEditingDomain().getResourceSet().getResources()) {
					if ((first || !resource.getContents().isEmpty() || !getEditingDomain().isReadOnly(resource))) {
						try {
							long timeStamp = resource.getTimeStamp();
							resource.save(saveOptions);
							if (resource.getTimeStamp() != timeStamp) {
								savedResources.add(resource);
							}
						} catch (Exception exception) {
							// resourceToDiagnosticMap.put(resource,
							// analyzeResourceProblems(resource, exception));
						}
						first = false;
					}
				}
			}
		};

		// updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack) getEditingDomain().getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			logError("Error while saving", exception);
		}
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command
	 * stack.
	 */
	@Override
	public boolean isDirty() {
		if (getEditingDomain() == null)
			return false;

		return ((BasicCommandStack) getEditingDomain().getCommandStack()).isSaveNeeded();
	}

	/**
	 * returns the editing domain if any exist
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public abstract TabbedPropertySheetPage getTabbedPropertySheetPage();

	/**
	 * This is how the framework determines which interfaces we implement. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getTabbedPropertySheetPage();// getPropertySheetPage();
		} else {
			return super.getAdapter(key);
		}
	}

	@Override
	public void dispose() {
		getSite().getPage().removePartListener(partListener);
		// if (observerAdapter != null)
		// getEObject().eAdapters().remove(observerAdapter);
		if (tabbedPropertySheetPage != null) {
			tabbedPropertySheetPage.dispose();
		}
		// if (getEditorSite().getActionBarContributor().getActiveEditor() ==
		// this) {
		// getEditorSite().getActionBarContributor().setActiveEditor(null);
		// }
		if (stackListener != null)
			editingDomain.getCommandStack().removeCommandStackListener(stackListener);

		super.dispose();
	}

	// protected void createObserverAdapter() {
	// EObject eObject = getEObject();
	// if (eObject != null) {
	// observerAdapter = new AdapterImplExtension();
	// eObject.eAdapters().add(observerAdapter);
	// }
	// }

	/**
	 * create a Toolbar for the section
	 */
	public void createSectionToolbar(Section section, Action... actions) {
		ToolBarManager toolBarManager = new ToolBarManager(SWT.FLAT);
		ToolBar toolbar = toolBarManager.createControl(section);

		for (int i = 0; i < actions.length; i++) {
			Action action = actions[i];
			toolBarManager.add(action);
		}
		toolBarManager.update(true);
		section.setTextClient(toolbar);
	}

	public EMFDataBindingContext getCtx() {
		return ctx;
	}

	public AdapterFactoryItemDelegator getItemDelegator() {
		return itemDelegator;
	}

	// /**
	// * This accesses a cached version of the property sheet.
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// public IPropertySheetPage getPropertySheetPage() {
	// if (propertySheetPage == null) {
	// propertySheetPage =
	// new ExtendedPropertySheetPage( getEditingDomain()) {
	// @Override
	// public void setSelectionToViewer(List<?> selection) {
	// BaseEditor.this.setSelectionToViewer(selection);
	// BaseEditor.this.setFocus();
	// }
	//
	// @Override
	// public void setActionBars(IActionBars actionBars) {
	// super.setActionBars(actionBars);
	// getActionBarContributor().shareGlobalActions(this, actionBars);
	// }
	// };
	// propertySheetPage.setPropertySourceProvider(new
	// AdapterFactoryContentProvider(adapterFactory));
	// }
	//
	// return propertySheetPage;
	// }

}