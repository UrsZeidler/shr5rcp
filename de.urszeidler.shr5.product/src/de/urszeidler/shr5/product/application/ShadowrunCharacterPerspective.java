package de.urszeidler.shr5.product.application;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ShadowrunCharacterPerspective implements IPerspectiveFactory {

    /**
     * Creates the initial layout for a page.
     */
    public void createInitialLayout(IPageLayout layout) {
        String editorArea = layout.getEditorArea();
        addFastViews(layout);
        addViewShortcuts(layout);
        addPerspectiveShortcuts(layout);
        layout.addView("de.urszeidler.shr5.ecp.GeneratorValidationView", IPageLayout.BOTTOM, 0.66f, IPageLayout.ID_EDITOR_AREA);
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
        layout.addPerspectiveShortcut("de.urszeidler.shr5.product.application.ShadowrunPerspective");
        layout.addPerspectiveShortcut("de.urszeidler.shr5.product.application.ShadowrunCharacterPerspective");
    }

}
