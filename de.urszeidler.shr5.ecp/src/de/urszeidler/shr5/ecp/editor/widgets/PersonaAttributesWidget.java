package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.AbstraktPersona;

public class PersonaAttributesWidget extends Composite {
    private DataBindingContext m_bindingContext;

    private FormToolkit toolkit;// = new FormToolkit(Display.getCurrent());
    private AbstraktPersona persona;

    private EditingDomain editingDomain;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public PersonaAttributesWidget(Composite parent, int style) {
        super(parent, style);
        // setText("Attribute");
        toolkit = new FormToolkit(Display.getCurrent());
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        createWidgets();

    }

    public PersonaAttributesWidget(Composite parent, int style, AbstraktPersona object, FormToolkit toolkit2) {
        super(parent, style);
        toolkit = toolkit2;
        persona = object;

        createWidgets();
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }

    private void createWidgets() {
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        setLayout(new GridLayout(2, true));

        Group grpAttribute = new Group(this, SWT.NONE);
        grpAttribute.setLayout(new GridLayout(3, true));
        grpAttribute.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        grpAttribute.setText("Attribute");
        toolkit.adapt(grpAttribute);
        toolkit.paintBordersFor(grpAttribute);

        Group grpFertigkeiten = new Group(this, SWT.NONE);
        grpFertigkeiten.setLayout(new GridLayout(3, false));
        grpFertigkeiten.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        grpFertigkeiten.setText("Fertigkeiten");
        toolkit.adapt(grpFertigkeiten);
        toolkit.paintBordersFor(grpFertigkeiten);

        Composite grpKrperlicheAttribute = new Composite(grpAttribute, SWT.NONE);
        grpKrperlicheAttribute.setLayout(new GridLayout(3, false));
        grpKrperlicheAttribute.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(grpKrperlicheAttribute);
        toolkit.paintBordersFor(grpKrperlicheAttribute);

        Composite grpGeistigeAttribute = new Composite(grpAttribute, SWT.NONE);
        grpGeistigeAttribute.setLayout(new GridLayout(3, false));
        grpGeistigeAttribute.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(grpGeistigeAttribute);
        toolkit.paintBordersFor(grpGeistigeAttribute);

        Composite grpSpezielleAttribute = new Composite(grpAttribute, SWT.NONE);
        grpSpezielleAttribute.setLayout(new GridLayout(3, false));
        grpSpezielleAttribute.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(grpSpezielleAttribute);
        toolkit.paintBordersFor(grpSpezielleAttribute);

        Group grpFertigkeitGruppe = new Group(this, SWT.NONE);
        grpFertigkeitGruppe.setLayout(new GridLayout(3, false));
        grpFertigkeitGruppe.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        grpFertigkeitGruppe.setText("Fertigkeitsgruppen");
        toolkit.adapt(grpFertigkeitGruppe);
        toolkit.paintBordersFor(grpFertigkeitGruppe);

        m_bindingContext = initDataBindings();

        PersonaUIToolkit personaUIToolkit = new PersonaUIToolkit(m_bindingContext, null, persona, editingDomain, toolkit);

        personaUIToolkit.createKoerperlicheAttributes(grpKrperlicheAttribute);
        personaUIToolkit.createGeistigeAttributes(grpGeistigeAttribute);
        personaUIToolkit.createSpezielleAttributes(grpSpezielleAttribute);

        // EmfFormBuilder emfFormBuilder = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(),
        // AdapterFactoryUtil.getInstance().getLabelProvider(), editingDomain);
        // // emfFormBuilder.setManager(mananger);
        // emfFormBuilder.setBorderStyle(SWT.NONE);
        //
        // emfFormBuilder.addTextEntry("", Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN, grpFertigkeiten);
        // emfFormBuilder.addTextEntry("", Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN,
        // grpFertigkeitGruppe);
        //
        // emfFormBuilder.buildinComposite(m_bindingContext, this, persona);
    }
}
