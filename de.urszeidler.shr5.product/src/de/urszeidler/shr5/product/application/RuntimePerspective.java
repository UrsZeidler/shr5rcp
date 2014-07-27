package de.urszeidler.shr5.product.application;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IFolderLayout;

public class RuntimePerspective implements IPerspectiveFactory {

    /**
     * Creates the initial layout for a page.
     */
    public void createInitialLayout(IPageLayout layout) {
        layout.setFixed(true);
        layout.setEditorAreaVisible(false);
        String editorArea = layout.getEditorArea();
        addFastViews(layout);
        addViewShortcuts(layout);
        addPerspectiveShortcuts(layout);
        {
            IFolderLayout folderLayout = layout.createFolder("folder", IPageLayout.RIGHT, 0.5f, IPageLayout.ID_EDITOR_AREA);
            folderLayout.addView("de.urszeidler.shr5.runtime.ui.views.RuntimeScriptView");
        }
        layout.addView("de.urszeidler.shr5.ecp.CombatTurnView", IPageLayout.RIGHT, 0.5f, "folder");
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
