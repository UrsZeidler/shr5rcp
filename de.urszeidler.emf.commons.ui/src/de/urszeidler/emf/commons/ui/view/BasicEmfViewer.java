package de.urszeidler.emf.commons.ui.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.List;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

public abstract class BasicEmfViewer extends ViewPart implements ISelectionChangedListener{

	protected TreeViewer viewer;
	protected DrillDownAdapter drillDownAdapter;
	protected ComposedAdapterFactory adapterFactory;
	protected AdapterFactoryEditingDomain editingDomain;
	protected Resource resource;
	private Collection<? extends IAction> createChildActions;
	protected IMenuManager submenuManager;
	private PropertySheetPage propertySheetPage;
	protected CutAction cutAction;
	protected CopyAction copyAction;
	protected PasteAction pasteAction;
	protected DeleteAction deleteAction;
	protected Object theObject;

	public class NameSorter extends ViewerComparator {
	}

	
	public BasicEmfViewer() {
		super();
	}

	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		createAdapterFactory();
	
		// Create the command stack that will notify this editor as commands are
		// executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();
	
		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
			}
		});
	
		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);
		URI uri = URI.createURI(getResourceUri());
		resource = editingDomain.getResourceSet().getResource(uri, true);
		// resource = editingDomain.getResourceSet().createResource(uri);
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		initializeEditingDomain();
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
	
		cutAction = new CutAction(editingDomain);
		cutAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));
	
		copyAction = new CopyAction(editingDomain);
		copyAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
	
		pasteAction = new PasteAction(editingDomain);
		pasteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));
	
		deleteAction = new DeleteAction(editingDomain);
		deleteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
	
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setComparator(new NameSorter());
		viewer.addSelectionChangedListener(this);
		viewer.setInput(resource);
	
		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), getViewId());

		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

	}

	protected abstract void makeActions();
	protected abstract String getViewId();
	protected abstract void createAdapterFactory();
	protected abstract String getResourceUri();


	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void selectionChanged(SelectionChangedEvent event) {
		IMenuManager createChildMenuManager = getViewSite().getActionBars().getMenuManager();
		// Remove any menu items for old selection.
		//
		if (createChildMenuManager != null) {
			depopulateManager(createChildMenuManager, createChildActions);
			depopulateManager(submenuManager, createChildActions);
		}
	
		// Query the new selection for appropriate new child/sibling descriptors
		//
		Collection<?> newChildDescriptors = null;
	
		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
			Object object = ((IStructuredSelection) selection).getFirstElement();
			if (object == null)
				return;
	
			theObject = object;
	
			newChildDescriptors = editingDomain.getNewChildDescriptors(object, null);
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			deleteAction.updateSelection(structuredSelection);
			cutAction.updateSelection(structuredSelection);
			copyAction.updateSelection(structuredSelection);
			pasteAction.updateSelection(structuredSelection);
		}
	
		// Generate actions for selection; populate and redraw the menus.
		//
		createChildActions = generateCreateChildActions(newChildDescriptors, selection);
	
		if (createChildMenuManager != null) {
			populateManager(createChildMenuManager, createChildActions, null);
			populateManager(submenuManager, createChildActions, null);
			createChildMenuManager.update(true);
		}
		if (propertySheetPage != null)
			propertySheetPage.selectionChanged(this, selection);
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction}
	 * for each object in <code>descriptors</code>, and returns the collection
	 * of these actions. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(this, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This populates the specified <code>manager</code> with
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
	 * {@link org.eclipse.jface.action.IAction}s contained in the
	 * <code>actions</code> collection, by inserting them before the specified
	 * contribution item <code>contributionID</code>. If
	 * <code>contributionID</code> is <code>null</code>, they are simply added.
	 */
	protected void populateManager(IMenuManager manager, Collection<? extends IAction> actions, String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				} else {
					manager.add(action);
				}
			}
		}
	}

	/**
	 * This removes from the specified <code>manager</code> all
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
	 * {@link org.eclipse.jface.action.IAction}s contained in the
	 * <code>actions</code> collection. 
	 */
	protected void depopulateManager(IMenuManager manager, Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem) contributionItem).getInnerItem();
				}
	
				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem) contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}
	
	/**
	 * Fills the contextmenu.
	 * @param manager
	 */
	protected void fillContextMenu(IMenuManager manager) {
		// Other plug-ins can contribute there actions here
		manager.add(submenuManager);

		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		manager.add(new Separator());

		UndoAction undoAction = new UndoAction(editingDomain);
		undoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
		manager.add(new ActionContributionItem(undoAction));

		RedoAction redoAction = new RedoAction(editingDomain);
		redoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
		manager.add(new ActionContributionItem(redoAction));
		manager.add(new Separator());

		manager.add(new ActionContributionItem(cutAction));
		manager.add(new ActionContributionItem(copyAction));
		manager.add(new ActionContributionItem(pasteAction));
		manager.add(new Separator());
		manager.add(new ActionContributionItem(deleteAction));
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);

		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

	}
	
	/**
	 * Hooks the context menu.
	 */
	protected void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
		submenuManager = new MenuManager("childs");
	}

	protected void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	protected abstract void fillLocalPullDown(IMenuManager manager);


	protected abstract void fillLocalToolBar(IToolBarManager manager);

	protected void hookDoubleClickAction() {
	}

	
	/**
	 * This accesses a cached version of the property sheet. 
	 * 
	 */
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new ExtendedPropertySheetPage(editingDomain) {
				@Override
				public void setSelectionToViewer(List<?> selection) {
					setSelectionToViewer(selection);
					setFocus();
				}
	
				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					// getViewSite().getActionBars()..shareGlobalActions(this,
					// actionBars);
				}
			};
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}
	
		return propertySheetPage;
	}

	/**
	 * This is how the framework determines which interfaces we implement. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		} else {
			return super.getAdapter(key);
		}
	}

}