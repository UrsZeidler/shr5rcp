package de.urszeidler.shr5.ecp.wizards.createItem;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.shr5.ecp.editor.pages.Messages;

public class NewItemDetailWizardPage extends WizardPage {

    private EObject object;
    private AbstractNewItemWizard wizard;

    /**
     * Create the wizard.
     * 
     * @wbp.parser.constructor
     */
    public NewItemDetailWizardPage() {
        super(de.urszeidler.shr5.ecp.wizards.Messages.NewItemDetailWizardPage_titel);
//        setTitle("Wizard Page title");
//        setDescription("Wizard Page description");
    }

    public NewItemDetailWizardPage(AbstractNewItemWizard newItemWizard) {
        this();
        setWizard(newItemWizard);
        wizard = newItemWizard;
    }

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    public void createControl(Composite parent) {
        final LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();
        object = wizard.getCreatedObject();
        String name = labelProvider.getText(object.eClass());
        setTitle(String.format(de.urszeidler.shr5.ecp.wizards.Messages.NewItemDetailWizardPage_titel1,name));
        setDescription(String.format(de.urszeidler.shr5.ecp.wizards.Messages.NewItemDetailWizardPage_description,name));

        Composite container = new Composite(parent, SWT.NULL);
        setImageDescriptor(new ImageDescriptor() {

            @Override
            public ImageData getImageData() {
                return labelProvider.getImage(object).getImageData().scaledTo(32, 32);
            }
        });

        setControl(container);
        container.setLayout(new GridLayout(1, false));

        Group grpRrrr = new Group(container, SWT.NONE);
        grpRrrr.setText(labelProvider.getText(Shr5Package.Literals.BESCHREIBBAR));
        grpRrrr.setLayout(new GridLayout(3, false));
        grpRrrr.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

        Group grpDel = new Group(container, SWT.NONE);
        grpDel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        grpDel.setText(labelProvider.getText(Shr5Package.Literals.GELD_WERT));
        grpDel.setLayout(new GridLayout(3, false));

        Group grpSource = new Group(container, SWT.NONE);
        grpSource.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        grpSource.setLayout(new GridLayout(3, false));
        grpSource.setText(labelProvider.getText(Shr5Package.Literals.QUELLE));

        //
        EmfFormBuilder emfFormBuilder = new EmfFormBuilder(null, AdapterFactoryUtil.getInstance().getItemDelegator(), labelProvider,
                wizard.getEditingDomain());
        emfFormBuilder.setNullString(Messages.EmfFormbuilder_non_selected);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.BESCHREIBBAR__NAME, grpRrrr);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.BESCHREIBBAR__BESCHREIBUNG, grpRrrr);

        if (object instanceof Quelle) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__SRC_BOOK, grpSource);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__PAGE, grpSource);
        } else
            grpSource.setVisible(false);

        if (object instanceof GeldWert) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT_VALUE, grpDel);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__VERFUEGBARKEIT, grpDel);
        } else
            grpDel.setVisible(false);

        emfFormBuilder.buildinComposite(new DataBindingContext(), container, object);
    }

}
