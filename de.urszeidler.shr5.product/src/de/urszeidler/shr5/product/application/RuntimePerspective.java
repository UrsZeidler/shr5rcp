package de.urszeidler.shr5.product.application;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class RuntimePerspective implements IPerspectiveFactory {

    /**
     * Creates the initial layout for a page.
     */
    public void createInitialLayout(IPageLayout layout) {
        layout.setFixed(true);
        layout.setEditorAreaVisible(false);
//        String editorArea = layout.getEditorArea();
        addFastViews(layout);
        addViewShortcuts(layout);
        addPerspectiveShortcuts(layout);
        {
            IFolderLayout folderLayout = layout.createFolder("folder", IPageLayout.RIGHT, 0.5f, IPageLayout.ID_EDITOR_AREA);
            folderLayout.addView("de.urszeidler.shr5.runtime.ui.views.RuntimeScriptView");
        }
    }

    /**
     * Add fast views to the perspective.
     */
    private void addFastViews(IPageLayout layout) {
        layout.addFastView("de.urszeidler.shr5.ecp.CombatTurnView");
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
