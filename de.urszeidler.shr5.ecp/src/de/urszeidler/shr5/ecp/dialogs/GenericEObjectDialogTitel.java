package de.urszeidler.shr5.ecp.dialogs;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;

public class GenericEObjectDialogTitel extends TitleAreaDialog {
    private EmfFormBuilder emfFormBuilder;
    // private FormToolkit toolkit;
    private List<EStructuralFeature> eAllStructuralFeatures;
    protected EMFDataBindingContext ctx = new EMFDataBindingContext();
    protected EObject eObject;
    private String message;
    private String titel;

    public GenericEObjectDialogTitel(Shell parentShell, EObject eObject, AdapterFactoryItemDelegator itemDelegator, ILabelProvider labelprovider,
            ReferenceManager mananger, String titel, String message) {
        super(parentShell);
        this.eObject = eObject;

        emfFormBuilder = new EmfFormBuilder(null, itemDelegator, labelprovider, null);
        emfFormBuilder.setManager(mananger);
        eAllStructuralFeatures = eObject.eClass().getEAllStructuralFeatures();
        this.titel = titel;
        this.message = message;        
    }

    public GenericEObjectDialogTitel(Shell parentShell, EObject eObject, AdapterFactoryItemDelegator itemDelegator, ILabelProvider labelprovider,
            ReferenceManager mananger, String titel, String message, EStructuralFeature... refs) {
        this(parentShell, eObject, itemDelegator, labelprovider, mananger, titel, message);
        eAllStructuralFeatures = Arrays.asList(refs);
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite)super.createDialogArea(parent);
        setMessage(message);
        setTitle(titel);

        
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(GridData.FILL_BOTH));

        ScrolledComposite scrolledComposite = new ScrolledComposite(container, SWT.H_SCROLL | SWT.V_SCROLL);
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);

        Composite composite = new Composite(scrolledComposite, SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        scrolledComposite.setContent(composite);

        emfFormBuilder.addAllEntries(eAllStructuralFeatures, null);
        emfFormBuilder.buildinComposite(ctx, composite, eObject);
        scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        return area;
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 300);
    }

}
