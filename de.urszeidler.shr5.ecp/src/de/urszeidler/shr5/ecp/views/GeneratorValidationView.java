package de.urszeidler.shr5.ecp.views;

import org.eclipse.core.databinding.observable.Observables;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.ui.DiagnosticComposite;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.shr5.ecp.editor.ShadowrunEditor;
import de.urszeidler.shr5.ecp.service.ValidationService;
import de.urszeidler.shr5.ecp.service.ValidationTarget;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;

public class GeneratorValidationView extends ViewPart implements ValidationTarget {
    private DataBindingContext m_bindingContext;

    public static final String ID = "de.urszeidler.shr5.ecp.GeneratorValidationView"; //$NON-NLS-1$

    // Create an IPartListener2
    IPartListener2 pl = new IPartListener2() {

        // If the Editor I'm interested in was updated ...
        public void partActivated(IWorkbenchPartReference ref) {
            IWorkbenchPart part = ref.getPart(true);
            if (part instanceof ShadowrunEditor) {
                EObject eObject = ((ShadowrunEditor)part).getEObject();
                validationService.updateValidation(eObject);
            }
        }

        @Override
        public void partBroughtToTop(IWorkbenchPartReference partRef) {

        }

        @Override
        public void partClosed(IWorkbenchPartReference partRef) {

        }

        @Override
        public void partDeactivated(IWorkbenchPartReference partRef) {

        }

        @Override
        public void partOpened(IWorkbenchPartReference partRef) {

        }

        @Override
        public void partHidden(IWorkbenchPartReference partRef) {

        }

        @Override
        public void partVisible(IWorkbenchPartReference partRef) {

        }

        @Override
        public void partInputChanged(IWorkbenchPartReference partRef) {

        }
    };

    private ValidationService validationService;
    private WritableValue object = new WritableValue(null, String.class);

    private DiagnosticComposite diagnosticComposite;
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
    private Label lblNewLabel;

    public GeneratorValidationView() {
    }

    /*
     * (non-Javadoc) Method declared on IViewPart.
     */
    @Override
    public void init(IViewSite site) throws PartInitException {
        IWorkbenchPage page = site.getPage();
        // page.addSelectionListener(this);
        page.addPartListener(pl);

        validationService = (ValidationService)site.getService(ValidationService.class);
        validationService.registerValidationTarget(this);
        
        super.init(site);
    }

    /**
     * Create contents of the view part.
     * 
     * @param parent
     */
    @Override
    public void createPartControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        container.setLayout(new GridLayout(1, false));
        
        Composite composite = formToolkit.createComposite(container, SWT.BORDER);
        composite.setLayout(new GridLayout(1, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        formToolkit.paintBordersFor(composite);
                    
       lblNewLabel = formToolkit.createLabel(composite, "New Label", SWT.NONE);
       lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        diagnosticComposite = new DiagnosticComposite(container, SWT.NONE);
        diagnosticComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        diagnosticComposite.setBackground(SWTResourceManager.getColor(255, 255, 255));
        diagnosticComposite.setSeverityMask(Diagnostic.ERROR | Diagnostic.INFO | Diagnostic.WARNING);
        diagnosticComposite.setShowRootDiagnostic(false);
        diagnosticComposite.initialize(null);

        createActions();
        initializeToolBar();
        initializeMenu();
        m_bindingContext = initDataBindings();
    }

    /**
     * Create the actions.
     */
    private void createActions() {
        // Create the actions
    }

    /**
     * Initialize the toolbar.
     */
    private void initializeToolBar() {
        IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
    }

    /**
     * Initialize the menu.
     */
    private void initializeMenu() {
        IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
    }

    @Override
    public void setFocus() {
        // Set the focus
    }

    @Override
    public void setValidation(EObject eobject, final Diagnostic diagnostic) {
        if (eobject instanceof Beschreibbar) {
            Beschreibbar beschreibbar = (Beschreibbar)eobject;
            object.setValue(beschreibbar.getName());
        } else if (eobject instanceof CharacterGenerator) {
            CharacterGenerator cg = (CharacterGenerator)eobject;
            object.setValue(cg.getCharacterName());
        }

        if (!diagnosticComposite.isDisposed())
            getSite().getShell().getDisplay().asyncExec(new Runnable() {
                @Override
                public void run() {
                    if (!diagnosticComposite.isDisposed()) {
                        diagnosticComposite.setDiagnostic(diagnostic);
                        diagnosticComposite.update();
                    }
                }
            });
    }
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextLblNewLabelObserveWidget = WidgetProperties.text().observe(lblNewLabel);
        bindingContext.bindValue(observeTextLblNewLabelObserveWidget, object, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), null);
        //
        return bindingContext;
    }
}
