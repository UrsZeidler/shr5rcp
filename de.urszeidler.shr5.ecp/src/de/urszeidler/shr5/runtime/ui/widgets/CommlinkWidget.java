package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.Commlink;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry.EntryFactory;
import de.urszeidler.shr5.ecp.editor.widgets.WidgetTools;

public class CommlinkWidget extends Composite {

    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
    private DataBindingContext m_bindingContext;
//    private Commlink object;
    private Label lblZugriffbasis;
//    private Scale scale;
//    private Label label;
//    private EditingDomain editingDomain;
//    private StateMonitorWidget stateMonitorWidget;
    private EmfFormBuilder emfFormBuilder;
    private EmfFormBuilder emfFormBuilder1;
    
    /**
     * Create the composite.
     * @param parent
     * @param style
     * @param editingDomain 
     */
    public CommlinkWidget(Composite parent, int style,Commlink object, EditingDomain editingDomain) {
        super(parent, style);
//        this.object = object;
//        this.editingDomain = editingDomain;
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
                emfFormBuilder.dispose();
                emfFormBuilder1.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        emfFormBuilder = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
        emfFormBuilder.setBorderStyle(SWT.NONE);

        emfFormBuilder1 = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
        emfFormBuilder1.setBorderStyle(SWT.NONE);
        if(object.getPan()==null)
            object.setPan(Shr5Factory.eINSTANCE.createPersonalAreaNetwork());
        EntryFactory labelFactory = WidgetTools.createLabelExtreyFactory(editingDomain);
        
        setLayout(new GridLayout(3, false));
        
         
        m_bindingContext = initDataBindings();
        
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG,this,labelFactory);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL,this,labelFactory);        
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS,this);
 
        emfFormBuilder1.addTextEntry(Shr5Package.Literals.PERSONAL_AREA_NETWORK__SLAVES, this);
        emfFormBuilder1.addTextEntry(Shr5Package.Literals.PERSONAL_AREA_NETWORK__SLAVE_MAX, this,labelFactory);

        emfFormBuilder.buildinComposite(m_bindingContext, this, object);
        emfFormBuilder1.buildinComposite(m_bindingContext, this,object.getPan());
        
        lblZugriffbasis = new Label(this, SWT.NONE);
        toolkit.adapt(lblZugriffbasis, true, true);
        lblZugriffbasis.setText("Matrix Zustand");

        new StateMonitorWidget(this, SWT.NONE, object.getMatrixZustandMax(), false);
    }
    
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();

        return bindingContext;
    }
}
