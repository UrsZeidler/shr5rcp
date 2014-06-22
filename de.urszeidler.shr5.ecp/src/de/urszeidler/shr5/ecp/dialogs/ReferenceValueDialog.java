package de.urszeidler.shr5.ecp.dialogs;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.dialogs.SimpleEObjectDialog;
import de.urszeidler.emf.commons.ui.util.converter.ReferenceToStringConverter;

/**
 * This dialog set a integer feature and a reference feture together.
 * 
 * @author urs
 */
public class ReferenceValueDialog extends SimpleEObjectDialog {

    private Text txtReference;
    private Text txtWerttxt;

    private EReference referenceFeature;
    private EAttribute wertFeature;
    private Object[] selectAbles;

    public ReferenceValueDialog(Shell parentShell, EObject eObject, EReference referenceFeature, EAttribute wertFeature, Object[] selectAbles) {
        super(parentShell, eObject);
        this.referenceFeature = referenceFeature;
        this.wertFeature = wertFeature;
        this.selectAbles = selectAbles;

    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite)super.createDialogArea(parent);
        container.setLayout(new GridLayout(3, false));

        Label lblRef = new Label(container, SWT.NONE);
        lblRef.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblRef.setText("ref");

        txtReference = new Text(container, SWT.BORDER);
        txtReference.setText("reference");
        txtReference.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Button button = new Button(container, SWT.NONE);
        button.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {

                OwnChooseDialog dialog = new OwnChooseDialog(getShell(), selectAbles);
                dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
                int open = dialog.open();
                if (open == Dialog.OK) {
                    Object[] result = dialog.getResult();
                    if (result.length > 0) {

                        eObject.eSet(referenceFeature, result[0]);
                    } else
                        eObject.eSet(referenceFeature, null);
                }
            }

        });
        button.setText("...");

        Label lblWert = new Label(container, SWT.NONE);
        lblWert.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblWert.setText("wert");

        txtWerttxt = new Text(container, SWT.BORDER);
        txtWerttxt.setText("wert_Txt");
        txtWerttxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        new Label(container, SWT.NONE);

        IObservableValue observeValue = EMFObservables.observeValue(eObject, referenceFeature);
        ISWTObservableValue observeEditable = SWTObservables.observeText(txtReference, SWT.Modify);
        UpdateValueStrategy updateStrategie = new EMFUpdateValueStrategy();
        updateStrategie.setConverter(new ReferenceToStringConverter(AdapterFactoryUtil.getInstance().getLabelProvider()));
        Binding binding = ctx.bindValue(observeEditable, observeValue, null, updateStrategie);
        ctx.addBinding(binding);

        IObservableValue observeWertValue = EMFObservables.observeValue(eObject, wertFeature);
        ISWTObservableValue observeWertEditable = SWTObservables.observeText(txtWerttxt, SWT.Modify);
        binding = ctx.bindValue(observeWertEditable, observeWertValue, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        ctx.addBinding(binding);

        return container;
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

    @Override
    protected Image getImage() {
        return getQuestionImage();
    }

}
