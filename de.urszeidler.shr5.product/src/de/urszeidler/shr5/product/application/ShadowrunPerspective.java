package de.urszeidler.shr5.product.application;

import de.urszeidler.shr5.ecp.views.SourceBookView;

import org.eclipse.emf.ecp.ui.views.ModelExplorerView;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ShadowrunPerspective implements IPerspectiveFactory {

    /**
     * Creates the initial layout for a page.
     */
    @SuppressWarnings("restriction")
    public void createInitialLayout(IPageLayout layout) {
        //String editorArea = layout.getEditorArea();
        addFastViews(layout);
        addViewShortcuts(layout);
        addPerspectiveShortcuts(layout);
        layout.addView(ModelExplorerView.ID, IPageLayout.LEFT, 0.3f, IPageLayout.ID_EDITOR_AREA);
        layout.addView(SourceBookView.ID, IPageLayout.BOTTOM, 0.56f, ModelExplorerView.ID);
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
        layout.addPerspectiveShortcut("de.urszeidler.shr5.product.application.ShadowrunCharacterPerspective");
    }

}
