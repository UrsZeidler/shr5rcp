package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.AbstraktModifikatoren;
import de.urszeidler.eclipse.shr5.BioWare;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.Fokus;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.MagieFokus;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.QiFokus;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

/**
 * Manages {@link BioWare}, {@link Cyberware}, {@link PersonaEigenschaft}, {@link FernkampfwaffeModifikator}.
 * 
 * @author urs
 */
public class ModifikatorPage extends AbstractShr5Page<AbstraktModifikatoren> {
    private AbstraktModifikatoren object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Composite composite_add;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public ModifikatorPage(String id, String title) {
        super(id, title);
    }

    /**
     * Create the form page.
     * 
     * @param editor
     * @param id
     * @param title
     * @wbp.parser.constructor
     * @wbp.eval.method.parameter id "Some id"
     * @wbp.eval.method.parameter title "Some title"
     */
    public ModifikatorPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createBioWare();
    }

    public ModifikatorPage(FormEditor editor, String id, String title, AbstraktModifikatoren object, EditingDomain editingDomain,
            ReferenceManager manager) {
        super(editor, id, title, manager);
        this.object = object;
        this.editingDomain = editingDomain;
    }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        gd_beschreibbarWidget.widthHint = 0;
        gd_beschreibbarWidget.heightHint = 0;
        beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        Group grpWert = new Group(composite, SWT.NONE);
        // grpWert.setText("Wert");
        managedForm.getToolkit().adapt(grpWert);
        managedForm.getToolkit().paintBordersFor(grpWert);
        grpWert.setLayout(new GridLayout(9, false));

        Group grpQuelle = new Group(composite, SWT.NONE);
        grpQuelle.setText(Messages.ObjectPage_source);
        managedForm.getToolkit().adapt(grpQuelle);
        managedForm.getToolkit().paintBordersFor(grpQuelle);
        grpQuelle.setLayout(new GridLayout(6, false));

        composite_add = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_add.setLayout(new GridLayout(3, false));
        composite_add.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_add);
        managedForm.getToolkit().paintBordersFor(composite_add);

        
        m_bindingContext = initDataBindings();

        createFormBuilder(managedForm);

        if (object instanceof Koerpermods) {
            grpWert.setText(Messages.ObjectPage_price);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT_VALUE, grpWert);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__VERFUEGBARKEIT, grpWert);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT, grpWert);

            if (object instanceof Cyberware) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERWARE__EINBAU, composite_add);
            }

        } else if (object instanceof PersonaEigenschaft) {
            grpWert.setText(Messages.ObjectPage_karmaCost);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.PERSONA_EIGENSCHAFT__KARMA_KOSTEN, grpWert);

        } else if (object instanceof FernkampfwaffeModifikator) {
            grpWert.setText(Messages.ObjectPage_addon);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.FERNKAMPFWAFFE_MODIFIKATOR__EP, grpWert);

        } else if (object instanceof KiKraft) {
            grpWert.setText(Messages.ObjectPage_powwerPoint);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.KI_KRAFT__KRAFTPUNKTE, grpWert);
        }else if (object instanceof Fokus) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MAGISCHE_STUFE__STUFE, grpWert);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.FOKUS__BINDUNGSKOSTEN, grpWert);
            if (object instanceof QiFokus) {               
                emfFormBuilder.addTextEntry(Shr5Package.Literals.QI_FOKUS__POWER, grpWert);
            }else if (object instanceof MagieFokus) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.MAGIE_FOKUS__BINDUNGS_FAKTOR, grpWert);
            }
        }

        emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__SRC_BOOK, grpQuelle);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__PAGE, grpQuelle);

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }
}
