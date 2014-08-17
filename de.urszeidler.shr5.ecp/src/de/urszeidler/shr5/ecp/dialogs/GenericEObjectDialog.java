/**
 * 
 */
package de.urszeidler.shr5.ecp.dialogs;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.emf.commons.ui.dialogs.SimpleEObjectDialog;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;

/**
 * @author urs
 */
public class GenericEObjectDialog extends SimpleEObjectDialog {

    private EmfFormBuilder emfFormBuilder;
    private FormToolkit toolkit;
    private List<EStructuralFeature> eAllStructuralFeatures;
    private String messagestr;

    public GenericEObjectDialog(Shell parentShell, EObject eObject, AdapterFactoryItemDelegator itemDelegator, ILabelProvider labelprovider,
            ReferenceManager mananger) {
        super(parentShell, eObject);
        
        toolkit = new FormToolkit(Display.getCurrent());
        emfFormBuilder = new EmfFormBuilder(toolkit, itemDelegator, labelprovider, null);
        emfFormBuilder.setManager(mananger);
        eAllStructuralFeatures = eObject.eClass().getEAllStructuralFeatures();
        
        message = labelprovider.getText(eObject.eClass());
        
    }

    public GenericEObjectDialog(Shell parentShell, EObject eObject, AdapterFactoryItemDelegator itemDelegator, ILabelProvider labelprovider,
            ReferenceManager mananger, EStructuralFeature... refs) {
        this(parentShell, eObject, itemDelegator, labelprovider, mananger);
        eAllStructuralFeatures = Arrays.asList(refs);
    }

    /**
     * Create the Dialog area
     * 
     * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
     */
    protected Control createDialogArea(Composite parent) {
        Composite dialogComposite = (Composite)super.createDialogArea(parent);
        toolkit.adapt(dialogComposite);
        toolkit.paintBordersFor(dialogComposite);

        dialogComposite.setLayout(new GridLayout(3, false));
        toolkit.createLabel(dialogComposite, messagestr);
        toolkit.createLabel(dialogComposite, "");
        toolkit.createLabel(dialogComposite, "");
        
        emfFormBuilder.addAllEntries(eAllStructuralFeatures, null);
        emfFormBuilder.buildinComposite(ctx, dialogComposite, eObject);

        return dialogComposite;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.jface.dialogs.IconAndMessageDialog#getImage()
     */
    @Override
    protected Image getImage() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean close() {
        toolkit.dispose();
        emfFormBuilder.dispose();
        return super.close();
    }
}
