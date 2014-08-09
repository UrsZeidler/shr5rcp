package de.urszeidler.shr5.product.application;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class CombatPerspective implements IPerspectiveFactory {

    /**
     * Creates the initial layout for a page.
     */
    public void createInitialLayout(IPageLayout layout) {
        layout.setFixed(true);
        layout.setEditorAreaVisible(false);
        
        //String editorArea = layout.getEditorArea();
        addFastViews(layout);
        addViewShortcuts(layout);
        addPerspectiveShortcuts(layout);
        layout.addView("de.urszeidler.shr5.ecp.CombatTurnView", IPageLayout.RIGHT, 0.63f, IPageLayout.ID_EDITOR_AREA);
        layout.addView("de.urszeidler.shr5.runtime.ui.views.RuntimeScriptView", IPageLayout.RIGHT, 0.05f, IPageLayout.ID_EDITOR_AREA);
    }

    /**
     * Add fast views to the perspective.
     */
    private void addFastViews(IPageLayout layout) {
    }

    /**
     * Add view shortcuts to the perspective.
     */
    private void addViewShortcuts(IPageLayout layout) {
    }

    /**
     * Add perspective shortcuts to the perspective.
     */
    private void addPerspectiveShortcuts(IPageLayout layout) {
    }

}
