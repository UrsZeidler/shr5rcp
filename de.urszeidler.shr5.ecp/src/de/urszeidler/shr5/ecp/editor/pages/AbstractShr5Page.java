package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.util.DefaultLabelProvider;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * This is a basic generic page to display eObjects in an form with an emfformbilder.
 */
public abstract class AbstractShr5Page<A extends EObject> extends FormPage implements IDoubleClickListener {

    // protected A object;
    // protected EditingDomain editingDomain;
    protected ReferenceManager mananger;
    protected EmfFormBuilder emfFormBuilder;
    protected ILabelProvider labelprovider = new DefaultLabelProvider();

    public AbstractShr5Page(String id, String title) {
        super(id, title);
    }

    public AbstractShr5Page(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    /**
     * This is the main constructor usable for the editor.
     * 
     * @param editor
     * @param id
     * @param title
     * @param manager the mananger for refrenece features
     */
    public AbstractShr5Page(FormEditor editor, String id, String title, ReferenceManager manager) {
        super(editor, id, title);
        this.mananger = manager;
    }

    @Override
    public void dispose() {
        if (emfFormBuilder != null)
            emfFormBuilder.dispose();
        super.dispose();
    }

    /**
     * Simple Factory method to create the formbuilder.
     * 
     * @param managedForm
     */
    protected void createFormBuilder(IManagedForm managedForm) {
        emfFormBuilder = new EmfFormBuilder(managedForm.getToolkit(), AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), getEditingDomain());
        emfFormBuilder.setManager(mananger);
        emfFormBuilder.setNullString(Messages.EmfFormbuilder_non_selected);
//        emfFormBuilder.setBorderStyle(SWT.NONE);
        emfFormBuilder.setDblListner(this);
    }

    /**
     * Open a new editor for the object in the selection.
     */
    @Override
    public void doubleClick(DoubleClickEvent event) {
        ISelection selection = event.getSelection();
        ShadowrunEditingTools.openEditorForFirstSelection(selection);
    }

    protected abstract EditingDomain getEditingDomain();

    /**
     * @param grpWert
     */
    protected void addWertFeatures(Composite grpWert) {
        emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT_VALUE, grpWert);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__VERFUEGBARKEIT, grpWert);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT, grpWert);
    }

    /**
     * @param grpQuelle
     */
    protected void addSourceFeature(Group grpQuelle) {
        emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__SRC_BOOK, grpQuelle);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__PAGE, grpQuelle);
    }

}