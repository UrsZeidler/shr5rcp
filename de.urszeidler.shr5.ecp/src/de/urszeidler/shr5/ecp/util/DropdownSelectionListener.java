package de.urszeidler.shr5.ecp.util;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolItem;

public abstract class DropdownSelectionListener<A> extends SelectionAdapter {
    protected ToolItem dropdown;
    protected Menu menu;

    public DropdownSelectionListener(ToolItem dropdown) {
        this.dropdown = dropdown;
        menu = new Menu(dropdown.getParent().getShell());
    }

    public void widgetSelected(SelectionEvent event) {
        if (event.detail == SWT.ARROW) {
            ToolItem item = (ToolItem)event.widget;
            Rectangle rect = item.getBounds();
            Point pt = item.getParent().toDisplay(new Point(rect.x, rect.y));
            menu.setLocation(pt.x, pt.y + rect.height);
            menu.setVisible(true);
        } else {
            buttonPushed();
        }
    }

    protected void buttonPushed() {
    }

    public abstract void add(String item, final A action);
}