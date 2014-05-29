package de.urszeidler.shr5.ecp.wizards;

import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.resource.ImageDescriptor;
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

import org.eclipse.wb.swt.ResourceManager;

public class NewCharacterWizardPage extends WizardPage implements IValueChangeListener {
    private DataBindingContext m_bindingContext;

    private List<EObject> container;
    private List<EObject> systems;
    private List<EObject> groups;

    private WritableValue selectedContainer = new WritableValue();
    private WritableValue selectedSystem = new WritableValue();
    private WritableValue selectedGroup = new WritableValue();
    private Combo combo;
    private Combo combo_1;
    private Combo combo_2;
    private ComboViewer comboViewer;

    private ComboViewer comboViewer2;

    private ComboViewer comboViewer1;

    /**
     * Create the wizard.
     * 
     * @wbp.parser.constructor
     */
    public NewCharacterWizardPage() {
        super("Character Wizard");
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/magnifying_glass.png"));
        setTitle("Character creation setup");
        setDescription("A new character generator");
    }

    /**
     * 
     * @param container
     * @param systems2
     * @param groups2
     * @param selectedContainer2
     * @param selectedSystem2
     * @param selectedGroup2
     * @param pageName
     * @param title
     * @param description
     * @param imageDescriptor can be null
     */
    public NewCharacterWizardPage(List<EObject> container, List<EObject> systems2, List<EObject> groups2, WritableValue selectedContainer2,
            WritableValue selectedSystem2, WritableValue selectedGroup2, String pageName, String title, String description, ImageDescriptor imageDescriptor) {
        super(pageName);
        this.container = container;
        this.systems = systems2;
        this.groups = groups2;
        this.selectedContainer = selectedContainer2;
        this.selectedSystem = selectedSystem2;
        this.selectedGroup = selectedGroup2;

        selectedContainer.addValueChangeListener(this);
        selectedGroup.addValueChangeListener(this);
        selectedSystem.addValueChangeListener(this);

        setTitle(title);
        setDescription(description);
        //ImageDescriptor imageDescriptor = ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/magnifying_glass.png");
        if (imageDescriptor != null)
            setImageDescriptor(imageDescriptor);

        updatePageState();
    }

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);

        Label lblSelectcontainer = new Label(container, SWT.NONE);
        lblSelectcontainer.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblSelectcontainer.setText("selectContainer");

        comboViewer = new ComboViewer(container, SWT.READ_ONLY);
        combo = comboViewer.getCombo();
        combo.setToolTipText("The container is the object where the generator will be stored.");
        combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        setControl(container);
        container.setLayout(new GridLayout(2, false));

        Label lblSelectsystem = new Label(container, SWT.NONE);
        lblSelectsystem.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblSelectsystem.setText("SelectSystem");

        comboViewer1 = new ComboViewer(container, SWT.READ_ONLY);
        combo_1 = comboViewer1.getCombo();
        combo_1.setToolTipText("The system to generate the character with.");
        combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblSelectgroup = new Label(container, SWT.NONE);
        lblSelectgroup.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblSelectgroup.setText("SelectGroup");

        comboViewer2 = new ComboViewer(container, SWT.READ_ONLY);
        combo_2 = comboViewer2.getCombo();
        combo_2.setToolTipText("The group is the object where the character will be stored.");
        combo_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        comboViewer.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        comboViewer.setContentProvider(ArrayContentProvider.getInstance());
        //
        comboViewer.setInput(this.container);
        //
        comboViewer1.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        comboViewer1.setContentProvider(ArrayContentProvider.getInstance());
        //
        comboViewer1.setInput(systems);
        //
        comboViewer2.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        comboViewer2.setContentProvider(ArrayContentProvider.getInstance());
        //
        comboViewer2.setInput(groups);

        m_bindingContext = initDataBindings();
    }

    private boolean isAllSet() {
        return selectedContainer.getValue() != null && selectedGroup.getValue() != null && selectedSystem.getValue() != null;
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeSingleSelectionComboViewer = ViewerProperties.singleSelection().observe(comboViewer);
        bindingContext.bindValue(observeSingleSelectionComboViewer, selectedContainer, null, null);
        //
        IObservableValue observeSingleSelectionComboViewer1 = ViewerProperties.singleSelection().observe(comboViewer1);
        bindingContext.bindValue(observeSingleSelectionComboViewer1, selectedSystem, null, null);
        //
        IObservableValue observeSingleSelectionComboViewer2 = ViewerProperties.singleSelection().observe(comboViewer2);
        bindingContext.bindValue(observeSingleSelectionComboViewer2, selectedGroup, null, null);
        //

        return bindingContext;
    }

    @Override
    public void handleValueChange(ValueChangeEvent event) {
        updatePageState();
    }

    private void updatePageState() {
        setPageComplete(isAllSet());

        if (!isAllSet()) {
            if (selectedContainer.getValue() == null)
                setErrorMessage("You need to select at least a container.");
            else
                setErrorMessage("Select a system and a group.");
        } else
            setErrorMessage(null);
    }
}
