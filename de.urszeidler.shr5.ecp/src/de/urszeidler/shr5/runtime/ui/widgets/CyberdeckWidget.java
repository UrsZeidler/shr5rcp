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
import org.eclipse.swt.widgets.Scale;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;

public class CyberdeckWidget extends Composite {

    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
    private DataBindingContext m_bindingContext;
    private Cyberdeck object;
    private Label lblZugriffbasis;
    private Scale scale;
    private Label label;
    private EditingDomain editingDomain;
    
    /**
     * Create the composite.
     * @param parent
     * @param style
     * @param editingDomain 
     */
    public CyberdeckWidget(Composite parent, int style,Cyberdeck object, EditingDomain editingDomain) {
        super(parent, style);
        this.object = object;
        this.editingDomain = editingDomain;
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        EmfFormBuilder emfFormBuilder = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
        emfFormBuilder.setBorderStyle(SWT.NONE);

        EmfFormBuilder emfFormBuilder1 = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
//        emfFormBuilder1.setManager(mananger);
        emfFormBuilder1.setBorderStyle(SWT.NONE);
        if(object.getPan()==null)
            object.setPan(Shr5Factory.eINSTANCE.createPersonalAreaNetwork());

        
//        composite_runtime.layout(true,true);

        
        setLayout(new GridLayout(3, false));
        
         
        m_bindingContext = initDataBindings();
        
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG,this);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL,this);        
        emfFormBuilder.addTextEntry(Shr5Package.Literals.ACTIVE_MATIX_DEVICE__ANGRIFF,this);        
        emfFormBuilder.addTextEntry(Shr5Package.Literals.ACTIVE_MATIX_DEVICE__SCHLEICHER,this);        
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL,this);        
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS,this);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__CONFIGURATION, this);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__RUNNING_PROGRAMS, this);

 
        emfFormBuilder1.addTextEntry(Shr5Package.Literals.PERSONAL_AREA_NETWORK__SLAVES, this);
        emfFormBuilder1.addTextEntry(Shr5Package.Literals.PERSONAL_AREA_NETWORK__SLAVE_MAX, this);

        emfFormBuilder.buildinComposite(m_bindingContext, this, object);
        emfFormBuilder1.buildinComposite(m_bindingContext, this,object.getPan());
    }
    
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
         //
        return bindingContext;
    }
}
