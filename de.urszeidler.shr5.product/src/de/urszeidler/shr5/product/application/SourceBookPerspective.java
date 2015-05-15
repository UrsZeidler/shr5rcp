package de.urszeidler.shr5.product.application;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class SourceBookPerspective implements IPerspectiveFactory {

    /**
     * Creates the initial layout for a page.
     */
    public void createInitialLayout(IPageLayout layout) {
        String editorArea = layout.getEditorArea();
        addFastViews(layout);
        addViewShortcuts(layout);
        addPerspectiveShortcuts(layout);
        layout.addView("de.urszeidler.shr5.ecp.views.SourceBookView", IPageLayout.BOTTOM, 0.2f, IPageLayout.ID_EDITOR_AREA);
        layout.addView("org.eclipse.emf.ecp.ui.ModelExplorerView", IPageLayout.LEFT, 0.3f, IPageLayout.ID_EDITOR_AREA);
    }

    /**
     * Add fast views to the perspective.
     */
    private void addFastViews(IPageLayout layout) {
        layout.addFastView("de.urszeidler.shr5.ecp.GeneratorValidationView");
    }

    /**
     * Add view shortcuts to the perspective.
     */
    private void addViewShortcuts(IPageLayout layout) {
        layout.addShowViewShortcut("de.urszeidler.shr5.ecp.views.SourceBookView");
        layout.addShowViewShortcut("de.urszeidler.shr5.ecp.GeneratorValidationView");
    }

    /**
     * Add perspective shortcuts to the perspective.
     */
    private void addPerspectiveShortcuts(IPageLayout layout) {
        layout.addPerspectiveShortcut("de.urszeidler.shr5.product.application.ShadowrunPerspective");
        layout.addPerspectiveShortcut("de.urszeidler.shr5.product.application.ShadowrunCharacterPerspective");
    }

}
