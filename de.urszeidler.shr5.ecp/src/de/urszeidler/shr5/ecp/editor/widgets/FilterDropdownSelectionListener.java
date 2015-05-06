package de.urszeidler.shr5.ecp.editor.widgets;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.shr5.ecp.util.DefaultLabelProvider;
import de.urszeidler.shr5.ecp.util.DropdownSelectionListener;

/**
 * A Filter dropdown.
 * 
 * @author urs
 * @param <A>
 */
public abstract class FilterDropdownSelectionListener<A> extends DropdownSelectionListener<A> {
    private static final String ENTRY = "entry";
    private boolean filterActive = true;
    private ILabelProvider labelprovider = new DefaultLabelProvider();
    private Set<A> filterValueList = new HashSet<A>();

    public FilterDropdownSelectionListener(ToolItem dropdown) {
        super(dropdown);
        Collection<A> sourceBooks = getFilterItems();
        for (A sourceBook : sourceBooks) {
            add(labelprovider.getText(sourceBook), sourceBook);
            filterValueList.add(sourceBook);
        }

        MenuItem menuItem = new MenuItem(menu, SWT.SEPARATOR);
        menuItem = new MenuItem(menu, SWT.NONE);
        menuItem.setText("filter none");
        menuItem.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                MenuItem[] items = menu.getItems();
                for (int i = 0; i < items.length; i++) {
                    MenuItem menuItem1 = items[i];
                    Object data = menuItem1.getData(ENTRY);
                    if (data != null) {
                        filterValueList.remove((SourceBook)data);
                        menuItem1.notifyListeners(SWT.Selection, new Event());
                    }
                }
            }
        });
        menuItem = new MenuItem(menu, SWT.NONE);
        menuItem.setText("filter all");
        menuItem.addSelectionListener(new SelectionAdapter() {
            @SuppressWarnings("unchecked")
            public void widgetSelected(SelectionEvent event) {
                MenuItem[] items = menu.getItems();
                for (int i = 0; i < items.length; i++) {
                    MenuItem menuItem1 = items[i];
                    Object data = menuItem1.getData(ENTRY);
                    if (data != null) {
                        filterValueList.add((A)data);
                        menuItem1.notifyListeners(SWT.Selection, new Event());
                    }
                }
            }
        });
    }

    /**
     * @return
     */
    protected abstract Collection<A> getFilterItems();

    /**
     * Add the filter to the widget.
     */
    protected abstract void addFilterToWidget();

    /**
     * Remove the filter to the widget.
     */
    protected abstract void removeFilterFromWidget();

    /**
     * Refreshes the filtererd viewer.
     */
    protected abstract void refreshViewer();

    @Override
    public void buttonPushed() {
        if (filterActive) {
            removeFilterFromWidget();
            refreshViewer();
            dropdown.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/filter_off.gif"));
            filterActive = false;
        } else {
            addFilterToWidget();
            refreshViewer();
            dropdown.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/filter_on.gif"));
            filterActive = true;
        }
    }

    @Override
    public void add(String item, final A action) {
        final MenuItem menuItem = new MenuItem(menu, SWT.NONE);
        menuItem.setText(item);
        menuItem.setData(ENTRY, action);
        filterValueList.add(action);
        menuItem.setImage(labelprovider.getImage(action));

        menuItem.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                if (filterValueList.contains(action)) {
                    menuItem.setImage(ResourceManager.decorateImage(labelprovider.getImage(action),
                            ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/overlay-critical.gif")));
                    filterValueList.remove(action);
                } else {
                    menuItem.setImage(labelprovider.getImage(action));
                    filterValueList.add(action);
                }
                refreshViewer();
            }
        });
    }

    public Set<A> getFilterValues() {
        return filterValueList;
    }

}