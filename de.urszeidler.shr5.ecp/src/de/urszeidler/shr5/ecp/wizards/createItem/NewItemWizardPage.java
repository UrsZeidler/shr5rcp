package de.urszeidler.shr5.ecp.wizards.createItem;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.wizards.Messages;

public class NewItemWizardPage extends WizardPage implements IValueChangeListener {
    private DataBindingContext m_bindingContext;

    private List<EObject> allContainers;
    private Collection<EClass> allTypes;

    protected WritableValue selectedContainerValue;
    protected WritableValue selectedType;
    private Combo combo_1;
    private Combo combo;

    private AbstractNewItemWizard wizard;

    private ComboViewer comboViewer;

    private ComboViewer comboViewer_1;

    /**
     * Create the wizard.
     * @wbp.parser.constructor
     */
    public NewItemWizardPage() {
        super(Messages.NewItemWizardPage_titel);
        setTitle(Messages.NewItemWizardPage_titel1);
        setDescription(Messages.NewItemWizardPage_description);
    }

    public NewItemWizardPage(AbstractNewItemWizard newItemWizard) {
        this();
        wizard = newItemWizard;
        setWizard(newItemWizard);
        allContainers = wizard.getAllContainers();
        allTypes = wizard.getAllTypes();
        selectedContainerValue = wizard.getSelectedContainerValue();
        selectedType = wizard.getSelectedType();
        
        selectedContainerValue.addValueChangeListener(this);
        selectedType.addValueChangeListener(this);

        
        updatePageState();
    }

    @Override
    public void dispose() {
        selectedContainerValue.removeValueChangeListener(this);
        selectedType.removeValueChangeListener(this);
        super.dispose();
    }
    
    
    
    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);

        setControl(container);
        container.setLayout(new GridLayout(2, false));
 
        Label lblContainer = new Label(container, SWT.NONE);
        lblContainer.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblContainer.setText(Messages.NewItemWizardPage_label_containter);

        comboViewer = new ComboViewer(container, SWT.NONE);
        combo = comboViewer.getCombo();
        combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblType = new Label(container, SWT.NONE);
        lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblType.setText(Messages.NewItemWizardPage_label_type);

        comboViewer_1 = new ComboViewer(container, SWT.NONE);
        combo_1 = comboViewer_1.getCombo();
        combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        comboViewer.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        comboViewer.setContentProvider(ArrayContentProvider.getInstance());
        //
        comboViewer.setInput(allContainers);
        //
        comboViewer_1.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        comboViewer_1.setContentProvider(ArrayContentProvider.getInstance());
        //
        comboViewer_1.setInput(allTypes);
        //

        m_bindingContext = initDataBindings();
    }
     
    
    private void updatePageState() {
        setPageComplete(isAllSet());

        if (!isAllSet()) {
            if (selectedContainerValue.getValue() == null)
                setErrorMessage(Messages.NewCharacterWizardPage_select_container_error);
            else
                setErrorMessage(Messages.NewItemWizardPage_error_no_type);
        } else
            setErrorMessage(null);
    }

    private boolean isAllSet() {
        return selectedContainerValue.getValue() != null && selectedType.getValue() != null ;
    }

    @Override
    public void handleValueChange(ValueChangeEvent event) {
       updatePageState();
      if ( event.getSource().equals(selectedType))
          wizard.performCancel();
      
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeSingleSelectionComboViewer = ViewerProperties.singleSelection().observe(comboViewer);
        bindingContext.bindValue(observeSingleSelectionComboViewer, selectedContainerValue, null, null);
        //
        IObservableValue observeSingleSelectionComboViewer1 = ViewerProperties.singleSelection().observe(comboViewer_1);
        bindingContext.bindValue(observeSingleSelectionComboViewer1, selectedType, null, null);
        //
        return bindingContext;
    }
}
